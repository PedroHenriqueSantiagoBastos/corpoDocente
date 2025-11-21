package br.ucsal.corpoDocente.service;

import br.ucsal.corpoDocente.dto.ProfessorCreateDTO;
import br.ucsal.corpoDocente.dto.ProfessorResponseDTO;
import br.ucsal.corpoDocente.dto.ProfessorUpdateDTO;
import br.ucsal.corpoDocente.mapper.ProfessorMapper;
import br.ucsal.corpoDocente.model.Professor;
import br.ucsal.corpoDocente.repository.ProfessorRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class ProfessorService {

    private final ProfessorRepository repository;
    private final ProfessorMapper mapper;

    public ProfessorService(ProfessorRepository repository, ProfessorMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Transactional
    public ProfessorResponseDTO create(ProfessorCreateDTO dto) {

        Optional<Professor> existente = repository.findByNumeroRegistro(dto.getNumeroRegistro());

        if (existente.isPresent()) {
            throw new RuntimeException("Já existe um professor cadastrado com o Registro: " + dto.getNumeroRegistro());
        }

        Professor entity = mapper.toEntity(dto);
        repository.save(entity);
        return mapper.toResponseDTO(entity);
    }

    public List<ProfessorResponseDTO> findAll() {
        return mapper.toResponseDTOList(repository.findAll());
    }

    public ProfessorResponseDTO findById(Integer id) {
        Professor entity = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Professor não encontrado com ID: " + id));
        return mapper.toResponseDTO(entity);
    }

    @Transactional
    public ProfessorResponseDTO update(Integer id, ProfessorUpdateDTO dto) {

        Professor entity = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Professor não encontrado com ID: " + id));

        mapper.updateFromDto(dto, entity);

        repository.save(entity);

        return mapper.toResponseDTO(entity);
    }

    @Transactional
    public void delete(Integer id) {
        if (!repository.existsById(id)) {
            throw new RuntimeException("Professor não encontrado com ID: " + id);
        }
        repository.deleteById(id);
    }
}