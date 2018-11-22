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
        final StringBuffer sb = new StringBuffer("Entities { ");
        sb.append("persons = ").append(persons == null ? "null" : Arrays.asList(persons).toString());
        sb.append(", organizations = ").append(organizations == null ? "null" : Arrays.asList(organizations).toString());
        sb.append(", locations = ").append(locations == null ? "null" : Arrays.asList(locations).toString());
        sb.append('}');
        return sb.toString();
    }
}
