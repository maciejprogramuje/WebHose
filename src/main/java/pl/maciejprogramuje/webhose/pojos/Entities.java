package pl.maciejprogramuje.webhose.pojos;

public class Entities {
    private String[] persons;
    private String[] organizations;
    private String[] locations;

    public String[] getPersons() {
        return persons;
    }

    public void setPersons(String[] persons) {
        this.persons = persons;
    }

    public String[] getOrganizations() {
        return organizations;
    }

    public void setOrganizations(String[] organizations) {
        this.organizations = organizations;
    }

    public String[] getLocations() {
        return locations;
    }

    public void setLocations(String[] locations) {
        this.locations = locations;
    }
}
