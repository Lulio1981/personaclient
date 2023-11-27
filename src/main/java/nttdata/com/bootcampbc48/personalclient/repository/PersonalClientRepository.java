package nttdata.com.bootcampbc48.personalclient.repository;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Maybe;
import nttdata.com.bootcampbc48.personalclient.entity.PersonalClient;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
public interface PersonalClientRepository extends ReactiveMongoRepository<PersonalClient, String> {

    public Mono<PersonalClient> findById(String id);

    public Mono<PersonalClient> findByDocumentNumber(String documentNumber);

}