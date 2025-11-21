package br.ucsal.corpoDocente.repository;

import br.ucsal.corpoDocente.model.Professor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProfessorRepository extends JpaRepository<Professor, Integer> {

    Optional<Professor> findByNumeroRegistro(Long numeroRegistro);
}
