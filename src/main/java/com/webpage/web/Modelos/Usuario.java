package com.webpage.web.Modelos;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity //indica que es una entidad que hace referencia a la bdd
@Table(name="personaje") //name = usuarios, la tabla de sql
public class Usuario {
       
        public int idp;
        public String nombre;
        public String imagen;
        public int edad;
        public int peso;
        public String historia;

        @Id
        public int getIdp() {
            return idp;
        }
       
        
        
        public int getEdad() {
            return edad;
        }
        public int getPeso() {
            return peso;
        }
        public String getHistoria() {
            return historia;
        }
        public String getImagen() {
            return imagen;
        }
        public String getNombre() {
            return nombre;
        }
        public void setEdad(int edad) {
            this.edad = edad;
        }
        public void setHistoria(String historia) {
            this.historia = historia;
        }
        public void setIdp(int idp) {
            this.idp = idp;
        }
        public void setImagen(String imagen) {
            this.imagen = imagen;
        }
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
        public void setPeso(int peso) {
            this.peso = peso;
        }

        
        
        
}   
