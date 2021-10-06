package one.digitalinnovation.personapi.mapper;

import one.digitalinnovation.personapi.dto.request.PersonDTO;
import one.digitalinnovation.personapi.entity.Person;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface PersonMapper {

    @Mapping(source = "birthDate", target = "birthDate", dateFormat = "yyyy-MM-dd")
    Person toModel(PersonDTO personDTO);

    PersonDTO toDTO(Person person);
}
