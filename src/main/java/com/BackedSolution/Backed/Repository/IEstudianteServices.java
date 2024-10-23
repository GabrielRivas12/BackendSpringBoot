package com.BackedSolution.Backed.Repository;

import com.BackedSolution.Backed.Models.Estudiantes;
import java.util.HashMap;

public interface IEstudianteServices {
    public Estudiantes createestudiante(Estudiantes estudiante);

    public HashMap<String, String> deleteestudiante(int Id);
}
