package nttdata.com.bootcampbc48.personalclient.util.mapper;

import nttdata.com.bootcampbc48.personalclient.dto.CreatePersonalClientDto;
import nttdata.com.bootcampbc48.personalclient.dto.DeletePersonalClientDto;
import nttdata.com.bootcampbc48.personalclient.dto.UpdatePersonalClientDto;
import nttdata.com.bootcampbc48.personalclient.entity.PersonalClient;
import org.modelmapper.ModelMapper;

import java.util.Date;

public class PersonalClientModelMapper {

    private final ModelMapper mapper = new ModelMapper();

    private static PersonalClientModelMapper instance;

    private PersonalClientModelMapper() {
    }

    public static PersonalClientModelMapper singleInstance() {
        if (instance == null) {
            instance = new PersonalClientModelMapper();
        }
        return instance;
    }

    //MAPPERS BEGIN
    public PersonalClient reverseMapCreateWithDate(CreatePersonalClientDto createDto) {
        PersonalClient personalClient = mapper.map(createDto, PersonalClient.class);

        personalClient.setInsertionDate(new Date());
        personalClient.setRegistrationStatus((short) 1);

        return personalClient;
    }


    public PersonalClient reverseMapUpdate(PersonalClient personalClient, UpdatePersonalClientDto updateDto) {

        personalClient.setProfile(updateDto.getProfile());
        personalClient.setFirstName(updateDto.getFirstName());
        personalClient.setLastName(updateDto.getLastName());
        personalClient.setResidenceAddress(updateDto.getResidenceAddress());

        return personalClient;
    }

    public PersonalClient reverseMapDelete(PersonalClient personalClient, DeletePersonalClientDto deleteDto) {

        personalClient.setRegistrationStatus((short) 0);

        return personalClient;
    }

}