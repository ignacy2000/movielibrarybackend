package tech.getarrays.filmlibrary.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tech.getarrays.filmlibrary.model.Actor;

@Repository
public interface ActorRepository extends JpaRepository<Actor, Long> {
    void deleteById(Long id);

    public default void updateIdAfterChange() {
        for(int i=0; i<this.findAll().size(); i++) {
            (this.findAll().get(i)).setId((long) (i+1));
        }
    }

    Actor findActorById(Long id);
}
