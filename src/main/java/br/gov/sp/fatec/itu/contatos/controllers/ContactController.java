package br.gov.sp.fatec.itu.contatos.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.gov.sp.fatec.itu.contatos.entities.Contact;
import br.gov.sp.fatec.itu.contatos.services.ContactService;

@CrossOrigin
@RestController
@RequestMapping("contacts")
public class ContactController {
    
    @Autowired
    private ContactService contact_service;

    @GetMapping
    public ResponseEntity<List<Contact>> getAllContacts(){
        return ResponseEntity.ok(contact_service.getAll());
    }

    @PostMapping
    public ResponseEntity<Contact> saveContact(@RequestBody Contact contact){
        return ResponseEntity.created(null).body(contact_service.save(contact));
    }

    @PutMapping("{id}")
    public ResponseEntity<Void> editContact(@PathVariable long id, @RequestBody Contact contact){
        contact_service.update(contact, id);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Void> deleteContact(@PathVariable long id){
        contact_service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
