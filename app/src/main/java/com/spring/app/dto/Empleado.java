package com.spring.app.dto;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.ManyToAny;

@Entity
@Table(name="empleados")//en caso de que la tabla se llame diferente
public class Empleado {
    
    //Atributos de la entidad empleados
    @Id
    private String DNI;
    @Column(name="nombre")
    private String nombre;
    @Column(name="apellidos")
    private String apellidos;

    /*@ManyToAny
    @Column(name="cod_dept")
    private Departamento departamento;*/
}
