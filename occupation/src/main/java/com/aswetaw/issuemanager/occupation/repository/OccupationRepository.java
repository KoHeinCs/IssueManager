package com.aswetaw.issuemanager.occupation.repository;

import com.aswetaw.issuemanager.entities.Occupation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * @author Hein Htet Aung
 * @created at 16/07/2022
 **/
@Repository
public interface OccupationRepository extends JpaRepository<Occupation, Long> {
    Optional<Occupation> findByName(String name);
}
