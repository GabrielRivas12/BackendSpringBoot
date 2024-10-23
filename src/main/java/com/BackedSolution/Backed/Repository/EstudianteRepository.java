package com.BackedSolution.Backed.Repository;

import org.springframework.stereotype.Repository;
import com.BackedSolution.Backed.Models.Estudiantes;
import org.springframework.data.jpa.repository.JpaRepository;


@Repository
public interface EstudianteRepository extends JpaRepository<Estudiantes, Integer> {
    
}

