package nttdata.com.bootcampbc48.personalclient.dto;

import lombok.Data;

@Data
public class UpdatePersonalClientDto {

    private String documentNumber;
    private String firstName;
    private String lastName;
    private String residenceAddress;
    private String profile;
}