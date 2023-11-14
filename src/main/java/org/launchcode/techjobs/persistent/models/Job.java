package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

import java.util.List;

@Entity
public class Job extends AbstractEntity{


    @ManyToOne
    private Employer employer;
    @ManyToOne
    private Skill skills;



    public Job() {
    }


    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Skill getSkills() {
        return skills;
    }

    public void setSkills(Skill skills) {
        this.skills = skills;
    }

    public String getEmployerName() {
        return (employer != null) ? employer.getName() : null;
    }
}
