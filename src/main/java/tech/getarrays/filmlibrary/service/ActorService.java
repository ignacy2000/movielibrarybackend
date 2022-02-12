package tech.getarrays.filmlibrary.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.getarrays.filmlibrary.model.Actor;
import tech.getarrays.filmlibrary.repository.ActorRepository;

import java.util.List;
import java.util.UUID;

@Service
public class ActorService {
    private final ActorRepository actorRepository;

    @Autowired
    public ActorService(ActorRepository actorRepository) {
        this.actorRepository = actorRepository;
    }

    public Actor addActor(Actor actor) {
        actor.setActorCode(UUID.randomUUID().toString());
        return actorRepository.save(actor);
    }

    public List<Actor> findAllActors() {
        //actorRepository.updateIdAfterChange();
        return actorRepository.findAll();
    }

    public Actor updateActor(Actor actor) {
        return actorRepository.save(actor);
    }

    public void deleteActor(Long id) {
        actorRepository.deleteById(id);
    }

    public Actor findActorById(Long id) {
        return actorRepository.findActorById(id);
    }
}
