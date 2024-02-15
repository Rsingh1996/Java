public class Human {
    String name;
    Integer fingerCount;
    Float height;

    public Human(String name, Integer fingerCount, Float height) {
        this.name = name;
        this.fingerCount = fingerCount;
        this.height = height;
    }

    public String getName() {
        return name;
    }
    public void setName( String name){
        this.name = name;
    }

    public Integer getFingerCount() {
        return fingerCount;
    }
    public void setFingerCount( Integer count) {
        fingerCount = count;
    }

    public Float getHeight() {
        return height;
    }
    public void setHeight( Float height) {
        this.height = height;
    }

}