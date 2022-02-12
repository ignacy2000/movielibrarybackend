package tech.getarrays.filmlibrary.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tech.getarrays.filmlibrary.model.Movie;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {

    void deleteMovieById(Long id);

    Movie findMovieById(Long id);
}
