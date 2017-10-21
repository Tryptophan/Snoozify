package hacktober.snoozify.charities;

public class Charity {

    private String name;
    private String EIN;

    public Charity(String name, String EIN) {
        this.name = name;
        this.EIN = EIN;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEIN() {
        return EIN;
    }

    public void setEIN(String EIN) {
        this.EIN = EIN;
    }
}
