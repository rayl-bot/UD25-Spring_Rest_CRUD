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

import org.hibernate.annotations.ManyToAny;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="departamentos")//nombre de la tabla si no es igual a la entidad
public class Departamento {
    
    //Atributos de la entidad Departamentos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
    private Long id;
    @Column(name="nombre")
    private String nombre;
    @Column(name="presupuesto")
    private int presupuesto;

    /*@ManyToAny*/
    @JoinColumn(name="id")
    private List<Empleado> empleados;

    //Constructores

    public Departamento(){

    }

    //Constructor con parametros
    public Departamento(Long id, String nombre, int presupuesto){
        this.id = id;
        this.nombre = nombre;
        this.presupuesto = presupuesto;
    }

    //Getters y Setters
    public Long getId(){
        return this.id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public int getPresupuesto(){
        return this.presupuesto;
    }

    public void setPresupuesto(int pre){
        this.presupuesto = pre;
    }

    /**
	 * @return the empleados
	 */
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Video")
	public List<Empleado> getEmpleado() {
		return empleados;
	}

    /**
	 * @param empleado the video to set
	 */
	public void setEmpleados(List<Empleado> empleados) {
		this.empleados = empleados;
	}
}
