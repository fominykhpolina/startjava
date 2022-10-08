public class Jaeger {

    private String modelName;
    private float weight;
    private int strenght;

    public Jaeger() {

    }
    public Jaeger(String modelName, float weight, int strenght) {
        this.modelName = modelName;
        this.weight = weight;
        this.strenght = strenght;
    }
    public String getModelName() {
        return modelName;
    }
    public void setModelName(String modelName) {
        this.modelName = modelName;
    }
    public float getWeight() {
        return weight;
    }
    public void setWeight(float weight) {
        this.weight = weight;
    }
    public int getStrenght() {
        return strenght;
    }
    public void setStrenght(int strenght) {
        this.strenght = strenght;
    }
    boolean drift() {
        return true;
    }
    void move() {
        System.out.println("moving");
    }
    String scanKaiju() {
        return "scanning";
    }
    void useVortexCannon() {
        System.out.println("activated");
    }
}