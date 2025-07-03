package br.gov.sp.fatec.itu.contatos.entities;


import java.io.Serializable;
import java.sql.Date;
import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "TBL_CONTACT")
public class Contact implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String nick_name;
    private String phone_number;
    private String email;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate created_at;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate date_birth;
    private String address;
    private String group_name;
    private Boolean blocked;
    private Boolean favorite;

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getNick_name() {
        return nick_name;
    }
    public void setNick_name(String nick_name) {
        this.nick_name = nick_name;
    }
    public String getPhone_number() {
        return phone_number;
    }
    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public LocalDate getCreated_at() {
        return created_at;
    }
    public void setCreated_at(LocalDate created_at) {
        this.created_at = created_at;
    }
    public LocalDate getDate_birth() {
        return date_birth;
    }
    public void setDate_birth(LocalDate date_birth) {
        this.date_birth = date_birth;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getGroup_name() {
        return group_name;
    }
    public void setGroup_name(String group_name) {
        this.group_name = group_name;
    }
    public Boolean getBlocked() {
        return blocked;
    }
    public void setBlocked(Boolean blocked) {
        this.blocked = blocked;
    }
    public Boolean getFavorite() {
        return favorite;
    }
    public void setFavorite(Boolean favorite) {
        this.favorite = favorite;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (id ^ (id >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Contact other = (Contact) obj;
        if (id != other.id)
            return false;
        return true;
    }

    


}
