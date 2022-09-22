package com.findajob.backend.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//Para que se comporte como una entidad de la base de datos     
@Entity
//Con esta anotacion se hacen los getters internos
@Getter
//Con esta anotacion se hacen los setters internos
@Setter
//Con esta anotacion se hacen los constructores internos
//Constructor por defecto y constructor con parámetros
@NoArgsConstructor
@AllArgsConstructor
//Se puede instanciar desde otros lugares, temas de compilación
@Builder
public class Role {
    //El id define la llave primaria
    @Id
    @Column(nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)//incremento automático
    private int id;

    @Column(nullable = false,unique = true)
    private String name;
    
}
