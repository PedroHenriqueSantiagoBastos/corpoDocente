package br.ucsal.corpoDocente.mapper;

import br.ucsal.corpoDocente.dto.ProfessorDTO;
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


    Professor toEntity(ProfessorDTO dto);


    ProfessorDTO toResponseDTO(Professor entity);


    void updateFromDto(ProfessorDTO dto, @MappingTarget Professor entity);


    List<ProfessorDTO> toResponseDTOList(List<Professor> entities);
}
