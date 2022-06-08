package com.webpage.web.Modelos;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity //indica que es una entidad que hace referencia a la bdd
@Table(name="usuario") //name = usuarios, la tabla de sql
public class Usuario {
       
        public int iduser;
        public String username;
       
        public String contra;
        public String mail;
        @Id
        public int getIduser() {
            return iduser;
        }
        public void setIduser(int iduser) {
            this.iduser = iduser;
        }
       public String getUsername() {
           return username;
       }
       public void setUsername(String username) {
           this.username = username;
       }
       public String getContra() {
           return contra;
       }
       public void setContra(String contra) {
           this.contra = contra;
       }
       public String getMail() {
           return mail;
       }
       public void setMail(String mail) {
           this.mail = mail;
       }
        
        
        
        
        
}   
