package org.launchcode.techjobs.persistent.models;
import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
@Entity
public class Employer extends AbstractEntity {
    @NotEmpty
    @Size(max = 100)
    private String location;

    public Employer() {
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
