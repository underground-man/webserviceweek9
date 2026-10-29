package org.example.webui.week9.repository;

import org.example.webui.week9.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long>{
}
