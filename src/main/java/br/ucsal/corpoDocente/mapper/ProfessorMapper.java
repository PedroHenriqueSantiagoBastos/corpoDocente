package br.ucsal.corpoDocente.mapper;

import br.ucsal.corpoDocente.dto.ProfessorCreateDTO;
import br.ucsal.corpoDocente.dto.ProfessorResponseDTO;
import br.ucsal.corpoDocente.dto.ProfessorUpdateDTO;
import br.ucsal.corpoDocente.model.Professor;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

import java.util.List;

@Mapper(
        componentModel = "spring",
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE
)
public interface ProfessorMapper {


    Professor toEntity(ProfessorCreateDTO dto);


    ProfessorResponseDTO toResponseDTO(Professor entity);


    void updateFromDto(ProfessorUpdateDTO dto, @MappingTarget Professor entity);


    List<ProfessorResponseDTO> toResponseDTOList(List<Professor> entities);
}
