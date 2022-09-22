package com.findajob.backend.entities;

import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {
    
    @Id
    @Column(nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)//incremento automático
    private int id;

    @Column(nullable = false, unique = true)
    private String fullname;

    @Column(nullable = false, unique = true)
    private String nickname;

    @Column(nullable = false, unique = true)
    private String email;

    @Getter(value = AccessLevel.NONE) //con este elemento no se puede acceder a la contraseña por medio de un getter
    @Column(nullable = false)
    private String password;
    
    @ManyToMany(fetch = FetchType.LAZY)//Acá solo busca el espacio del id del rol, sin neceisdad de buscar toooda la tabla
    @JoinColumn(nullable = false)
    private List<Role> roles;

    @Column(nullable = false)
    private Date registration;

    @Column(nullable = false)
    private boolean enable;

    public boolean checkPassword(String password) {
        return this.password.equals(password);//Comparar dos cadenas que sean exactamente iguales
    }

}
