public class Human {
    String name;
    Integer fingerCount;
    Float height;
    Float weight;
    Integer power;
    Integer iq;
    
    public Human(String name, Integer fingerCount, Float height, Float weight, Integer power, Integer iq) {
        this.name = name;
        this.fingerCount = fingerCount;
        this.height = height;
        this.weight = weight;
        this.power = power;
        this.iq = iq;

        
    }

    public String getName() {
        return name;
    }
    public void setName( String name) {
        this.name = name;
    }

    public Integer getFingerCount() {
        return fingerCount;
    }
    public void setFingerCount( Integer fingerCount) {
        this.fingerCount = fingerCount;
    }

    public Float getHeight() {
        return height;
    }
    public void setHeight( Float height) {
        this.height = height;
    }

    public Float getWeight() {
        return weight;
    }
    public void setWeight( Float weight) {
        this.weight = weight;
    }

    public Integer getPower() {
        return power;
    }
    public void setPower( Integer power) {
        this.power = power;
    }

    public Integer getIq() {
        return iq;
    }
    public void setIq(Integer iq) {
        this.iq = iq;
    }
}
