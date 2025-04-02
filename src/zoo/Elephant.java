package zoo.zoomain;

public class Elephant extends Animal {
    double trunkLength;
    double earSize;
    String origin;

    public Elephant(String species, String name, String breed, String habitat, int age, String gender,
            double trunkLength, double earSize, String origin) {
        super(species, name, breed, habitat, age, gender);
        this.trunkLength = trunkLength;
        this.earSize = earSize;
        this.origin = origin;
    }

    public void SetTrunkLength(double trunkLength) {
        this.trunkLength = trunkLength;
    }

    public double getTrunkLength() {
        return trunkLength;
    }

    public void setEarSize(double earSize) {
        this.earSize = earSize;
    }

    public double getEarSize() {
        return earSize;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getOrigin() {
        return origin;
    }

    public void displayElephantdetails() {
        System.out.println("Animal Species: " + species);
        System.out.println("Animal Name: " + name);
        System.out.println("Animal Breed: " + breed);
        System.out.println("Animal Habitat: " + habitat);
        System.out.println("Animal age: " + age);
        System.out.println("Animal Gender: " + gender);
        System.out.println("Animal trunk length:" + trunkLength);
        System.out.println("Animal Ear size:" + earSize);
        System.out.println("Animal Origin:" + origin);
    }
    @Override
    public void canMakeSound(){
        System.out.println("Makes Elephant Sound");
    }

}