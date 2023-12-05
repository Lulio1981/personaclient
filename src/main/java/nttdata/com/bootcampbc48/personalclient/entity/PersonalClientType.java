package nttdata.com.bootcampbc48.personalclient.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document
public class PersonalClientType {

    private String id;
    private String name;
}
