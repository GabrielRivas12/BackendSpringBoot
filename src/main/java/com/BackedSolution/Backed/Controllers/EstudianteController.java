package com.BackedSolution.Backed.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.BackedSolution.Backed.Models.Estudiantes;
import com.BackedSolution.Backed.Repository.IEstudianteServices;
import java.util.HashMap;

@RestController
@RequestMapping("/EstudianteController")

public class EstudianteController {
    @Autowired
    IEstudianteServices estudianteServices;


@PostMapping("/insertarEstudiante")
public ResponseEntity<Estudiantes> createestudiante(@RequestBody Estudiantes estudiante){

    try {
        Estudiantes createdEstudiante = estudianteServices.createestudiante(estudiante);
        return new ResponseEntity<>(createdEstudiante, HttpStatus.CREATED);
    } catch (Exception e) {
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }
}

@DeleteMapping("/eliminarEstudiante/{id}")
public ResponseEntity<HashMap<String, String>> deleteestudiante(@PathVariable int id){

    try {
        HashMap<String, String> response = estudianteServices.deleteestudiante(id);
        return new ResponseEntity<>(response, HttpStatus.OK);

    } catch (Exception e) {
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }
}

}


