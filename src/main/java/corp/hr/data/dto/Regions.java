package corp.hr.data.dto;

public class Regions {
    private int id;
    private String name;

    public Regions(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
