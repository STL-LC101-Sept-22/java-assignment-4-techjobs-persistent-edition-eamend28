package org.launchcode.techjobs.persistent.models.data;

import org.launchcode.techjobs.persistent.models.Job;

import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
//@Transactional
public interface JobRepository {
    Iterable<Job> findAll();

    default void save(Job newJob) {

    }

    Optional<Job> findById(int jobId);
}
