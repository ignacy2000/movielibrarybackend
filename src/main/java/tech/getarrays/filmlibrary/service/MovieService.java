package tech.getarrays.filmlibrary.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.getarrays.filmlibrary.model.Movie;
import tech.getarrays.filmlibrary.repository.MovieRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class MovieService {
    private MovieRepository movieRepository;

    @Autowired
    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public Movie addMovie(Movie movie) {
        movie.setFilmCode(UUID.randomUUID().toString());
        return movieRepository.save(movie);
    }

    public List<Movie> findAllMovies() {
        return movieRepository.findAll();
    }

    public Movie updateMovie(Movie movie) {
        return movieRepository.save(movie);
    }

    public void deleteMovieById(Long id) {
        movieRepository.deleteMovieById(id);
    }

    public Movie findMovieById(Long id) {
        return movieRepository.findMovieById(id);
    }
}
