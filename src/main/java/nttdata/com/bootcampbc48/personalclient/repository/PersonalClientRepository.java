package nttdata.com.bootcampbc48.personalclient.repository;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Maybe;
import nttdata.com.bootcampbc48.personalclient.entity.PersonalClient;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@EnableReactiveMongoRepositories
public interface PersonalClientRepository extends ReactiveMongoRepository<PersonalClient, String> {

    Mono<PersonalClient> findById(String id);

    Mono<PersonalClient> findByDocumentNumber(String documentNumber);

}