package com.BackedSolution.Backed.Services;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import com.BackedSolution.Backed.Models.Estudiantes;
import com.BackedSolution.Backed.Repository.EstudianteRepository;
import com.BackedSolution.Backed.Repository.IEstudianteServices;
import java.util.HashMap;


@Service
public class EstudianteServices implements IEstudianteServices {
    private static final Logger LOGGER = LoggerFactory.getLogger(EstudianteServices.class);

    @Autowired
    EstudianteRepository estudianteRepository;

    @Override
    public Estudiantes createestudiante (Estudiantes estudiante){
        try{
            return estudianteRepository.save(estudiante);
        } catch (Exception e){
            LOGGER.error("Error while creating estudiante: {}", e.getMessage());
            throw new RuntimeException("Error creating user");
        }

    }

    @Override
    public HashMap<String,String> deleteestudiante(int Id) {
        try {
            HashMap<String, String> response = new HashMap<>();
            response.put("message", "User deleting succesfully!");
            estudianteRepository.deleteById(Id);
            return response;
        } catch (Exception e) {
            LOGGER.error("Error while deleting user: {}", e.getMessage());
            throw new RuntimeException("Error deleting user");
        }
    }


    

    
}
