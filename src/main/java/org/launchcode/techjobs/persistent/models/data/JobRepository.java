package org.launchcode.techjobs.persistent.models.data;

import jakarta.persistence.Entity;
import org.launchcode.techjobs.persistent.models.Job;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JobRepository extends CrudRepository<Job, Integer> {
    Job save(Job job);
}

