package uk.co.maclon.claimantRest.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uk.co.maclon.claimantRest.model.Claimant;

@RepositoryRestResource
public interface ClaimantRepository extends MongoRepository<Claimant, String> {

    @Query("{ 'nino': ?0 }")
    Claimant findByNino(@Param("nino") String nino);

}
