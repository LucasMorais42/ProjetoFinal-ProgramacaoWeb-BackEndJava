package br.gov.sp.fatec.itu.contatos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.gov.sp.fatec.itu.contatos.entities.Contact;

public interface ContactRepository extends JpaRepository<Contact, Long>{

    
} 