package corp.hr.data.dto;

public class Departaments {
    private int id;
    private Countries countries;
    private String name;

    public Departaments(Countries countries, String name) {
        this.countries = countries;
        this.name = name;
    }

    public Countries getCountries() {
        return countries;
    }

    public void setCountries(Countries countries) {
        this.countries = countries;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
