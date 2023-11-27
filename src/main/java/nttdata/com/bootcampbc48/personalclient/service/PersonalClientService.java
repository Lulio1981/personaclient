package nttdata.com.bootcampbc48.personalclient.service;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.Single;
import nttdata.com.bootcampbc48.personalclient.dto.CreatePersonalClientDto;
import nttdata.com.bootcampbc48.personalclient.dto.DeletePersonalClientDto;
import nttdata.com.bootcampbc48.personalclient.dto.UpdatePersonalClientDto;
import nttdata.com.bootcampbc48.personalclient.entity.PersonalClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface PersonalClientService {

    public Single<PersonalClient> create(CreatePersonalClientDto createPersonalClientDto);

    public Flowable<PersonalClient> findAll();

    public Single<PersonalClient> findById(String id);

    public Single<PersonalClient> findByDocumentNumber(String documentNumber);

    public Single<PersonalClient> update(UpdatePersonalClientDto updatePersonalClientDto);

    public Single<PersonalClient> delete(DeletePersonalClientDto deletePersonalClientDto);


}