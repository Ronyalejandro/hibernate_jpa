package com.hibernate_.hibernate_jpa.entidades;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table  ( name = "personas")
public class Persona {
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
     private String nombre,apellido;
    @Column(name = " lenguages")
    private String lenguaje;

    public Persona() {
    }
    public Persona(Long id, String nombre, String apellido, String lenguaje) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.lenguaje = lenguaje;
    }
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    @Override
    public String toString() {
        return "[id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", lenguaje=" + lenguaje + "]";
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getLenguage() {
        return lenguaje;
    }
    public void setLenguage(String lenguage) {
        this.lenguaje = lenguage;
    
    } 
   
   

}
