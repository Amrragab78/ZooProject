package zoo;

public class Monkey extends Animal {
    String foodType;
    double jumpLength;
    double tailLength;

    public Monkey(String species, String name, String breed, String habitat, int age, String gender, String foodType,
            double jumpLength, double tailLength) {
        super(species, name, breed, habitat, age, gender);
        this.foodType = foodType;
        this.jumpLength = jumpLength;
        this.tailLength = tailLength;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    public String getFoodType() {
        return foodType;
    }

    public void setJumpLength(double jumpLength) {
        this.jumpLength = jumpLength;
    }

    public double getJumpLength() {
        return jumpLength;
    }

    public void setTailLength(double tailLength) {
        this.tailLength = tailLength;
    }
    public double getTailLength(){
        return tailLength;
    }

    public void displayMonkeyDetails() {
        System.out.println("Animal Species: " + species);
        System.out.println("Animal Name: " + name);
        System.out.println("Animal Breed: " + breed);
        System.out.println("Animal Habitat: " + habitat);
        System.out.println("Animal age: " + age);
        System.out.println("Animal Gender: " + gender);
        System.out.println("Animal Food Type:" + foodType);
        System.out.println("Animal jump Length: " + jumpLength);
        System.out.println("Animal Tail Length:" + tailLength);

    }

    @Override
    public void canMakeSound() {
        System.out.println("makes Monkey Sound");
    }

}
