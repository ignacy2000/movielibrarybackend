package tech.getarrays.filmlibrary.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tech.getarrays.filmlibrary.model.Actor;
import tech.getarrays.filmlibrary.service.ActorService;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/actor")
public class ActorResource {
    private final ActorService actorService;

    @Autowired
    public ActorResource(ActorService actorService) {
        this.actorService = actorService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Actor>> getAllEActors() {
        List<Actor> actors = actorService.findAllActors();
        Collections.sort(actors);
        return new ResponseEntity<>(actors, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Actor> getActorById(@PathVariable("id") Long id) {
        Actor actor = actorService.findActorById(id);
        return new ResponseEntity<>(actor, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Actor> addActor(@RequestBody Actor actor) {
        Actor newActor = actorService.addActor(actor);
        return new ResponseEntity<>(newActor, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Actor> updateActor(@RequestBody Actor actor) {
        Actor updateActor = actorService.updateActor(actor);
        return new ResponseEntity<>(updateActor, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteActor(@PathVariable("id") Long id) {
        actorService.deleteActor(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
