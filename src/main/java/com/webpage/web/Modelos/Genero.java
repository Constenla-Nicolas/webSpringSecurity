package com.webpage.web.Modelos;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity //indica que es una entidad que hace referencia a la bdd
@Table(name="genero") //name = usuarios, la tabla de sql
public class Genero {
    private int idgen;
    private String nombre;
    private String imagen;
    
    @Id
    public int getIdgen() {
        return idgen;
    }
    public String getImagen() {
        return imagen;
    }
    public String getNombre() {
        return nombre;
    }
    public void setIdgen(int idgen) {
        this.idgen = idgen;
    }
    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
