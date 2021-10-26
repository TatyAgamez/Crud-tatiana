package corp.hr.data.dto;

public class Jobs {
    private int id;
    private String name;

    public Jobs(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
