package nttdata.com.bootcampbc48.personalclient.dto;

import lombok.Data;

import java.util.List;

@Data
public class CreatePersonalClientDto {

    private String documentType;
    private String documentNumber;
    private String firstName;
    private String lastName;
    private String residenceAddress;
    private String profile;
    private String fk_insertionUser;
    private String insertionTerminal;

}