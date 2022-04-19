package com.webpage.web.Modelos;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity //indica que es una entidad que hace referencia a la bdd
@Table(name="users") //name = usuarios, la tabla de sql
public class Usuario {
       
        public int id;
        public String username;
        public String pass;
        public String email;
        public String telefono;

        @Id
        public int getId() {
            return id;
        }
        public void setId(int id) {
            this.id = id;
        }
        public String getUsername() {
            return username;
        }
        public String getPass() {
            return pass;
        }
        public String getEmail() {
            return email;
        }
        public String getTelefono() {
            return telefono;
        }
        public void setUsername(String username) {
            this.username = username;
        }
        public void setPass(String password) {
            this.pass = password;
        }
        public void setEmail(String email) {
            this.email = email;
        }
        public void setTelefono(String telefono) {
            this.telefono = telefono;
        }
}   
