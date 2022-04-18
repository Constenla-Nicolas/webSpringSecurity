package com.webpage.web.Modelos;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity //indica que es una entidad que hace referencia a la bdd
@Table(name="usuarios") //name = usuarios, la tabla de sql
public class Usuario {
       
        public int id;
        public String username;
        public String password;
        public String email;
        public String telefono;

        public Usuario(int id) {
         this.id =id;
          }
        public int getId() {
            return id;
        }
        public String getUsername() {
            return username;
        }
        public String getPassword() {
            return password;
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
        public void setPassword(String password) {
            this.password = password;
        }
        public void setEmail(String email) {
            this.email = email;
        }
        public void setTelefono(String telefono) {
            this.telefono = telefono;
        }
}   
