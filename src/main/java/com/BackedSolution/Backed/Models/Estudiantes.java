package com.BackedSolution.Backed.Models;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter

public class Estudiantes {
    @Id
    private int P_id;
    private String Nombre;
    private String Apellidos;
    private String Direccion;
    private String Ciudad;



    public Estudiantes(String nombre, String apellidos, String direccion, String ciudad){
        this.Nombre = nombre;
        this.Apellidos = apellidos;
        this.Direccion = direccion;
        this.Ciudad = ciudad;
    }

    public Estudiantes(){
        
    }

}
