package zoo;

public class Zebra extends Animal {
    String stripePattern;
    boolean isWild;
    double speed;

    public Zebra(String species, String name, String breed, String habitat, int age, String gender,
            String stripePattern, boolean isWild, double speed) {
        super(species, name, breed, habitat, age, gender);
        this.stripePattern = stripePattern;
        this.isWild = isWild;
        this.speed = speed;
    }

    public void setStripePattern(String stripePattern) {
        this.stripePattern = stripePattern;
    }

    public String getStripePattern() {
        return stripePattern;
    }

    public void setIsWild(boolean isWild) {
        this.isWild = isWild;
    }

    public boolean getIsWild() {
        return isWild;
    }

    public void setSpeed(double speed) {
        this.speed = speed;

    }

    public double getSpeed() {
        return speed;
    }

    public void displayZebraDetails() {
        System.out.println("Animal Species: " + species);
        System.out.println("Animal Name: " + name);
        System.out.println("Animal Breed: " + breed);
        System.out.println("Animal Habitat: " + habitat);
        System.out.println("Animal age: " + age);
        System.out.println("Animal Gender: " + gender);
        System.out.println("Animal Stripe Pattern:" + stripePattern);
        System.out.println("Animal is Wild: " + isWild);
        System.out.println("Animal Speed:" + speed);

    }

    @Override
    public void canMakeSound() {
        System.out.println("Animal makes Zebra sound");
    }
}