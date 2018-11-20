package pl.maciejprogramuje.webhose.webhoseio.pojos;

import java.util.Arrays;

public class Entities {
    private Person[] persons;
    private Organization[] organizations;
    private Location[] locations;

    public Person[] getPersons() {
        return persons;
    }

    public void setPersons(Person[] persons) {
        this.persons = persons;
    }

    public Organization[] getOrganizations() {
        return organizations;
    }

    public void setOrganizations(Organization[] organizations) {
        this.organizations = organizations;
    }

    public Location[] getLocations() {
        return locations;
    }

    public void setLocations(Location[] locations) {
        this.locations = locations;
    }

    @Override
    public String toString() {
        return "Entities{" +
                "persons=" + Arrays.toString(persons) +
                ", organizations=" + Arrays.toString(organizations) +
                ", locations=" + Arrays.toString(locations) +
                '}';
    }
}
