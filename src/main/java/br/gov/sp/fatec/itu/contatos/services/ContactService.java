package br.gov.sp.fatec.itu.contatos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.gov.sp.fatec.itu.contatos.entities.Contact;
import br.gov.sp.fatec.itu.contatos.repositories.ContactRepository;
import jakarta.persistence.EntityNotFoundException;

@Service
public class ContactService {
    

    @Autowired
    private ContactRepository repository;

    public List<Contact> getAll(){
        return repository.findAll();
    }

    public Contact save(Contact contact){
        return repository.save(contact);
    }

    public void update(Contact contact, long id){
        Contact aux = repository.getReferenceById(id);
     

        aux.setName(contact.getName());
        aux.setNick_name(contact.getNick_name());
        aux.setPhone_number(contact.getPhone_number());
        aux.setEmail(contact.getEmail());
        aux.setCreated_at(contact.getCreated_at());
        aux.setDate_birth(contact.getDate_birth());
        aux.setAddress(contact.getAddress());
        aux.setGroupname(contact.getGroupname());
        aux.setBlocked(contact.getBlocked());
        aux.setFavorite(contact.getFavorite());

        repository.save(aux);
    }

    public void delete(long id){
        if(repository.existsById(id)){
            repository.deleteById(id);
        }
        else{
            throw new EntityNotFoundException("Contato não cadastrado!");
        }
    }
}
