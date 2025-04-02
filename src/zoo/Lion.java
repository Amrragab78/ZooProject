package zoo;

public class Lion extends Animal {
    String prideName;
    double maneSize;
    boolean isAlpha;

    public Lion(String species, String name, String breed, String habitat, int age, String gender, String prideName,
            double maneSize, boolean isAlpha) {
        super(species, name, breed, habitat, age, gender);
        this.prideName = prideName;
        this.isAlpha = isAlpha;
        this.maneSize = maneSize;
    }

    public void setPrideName(String prideName) {
        this.prideName = prideName;
    }

    public String getPrideName() {
        return prideName;
    }

    public void setManeSize(double maneSize) {
        this.maneSize = maneSize;
    }

    public double getManeSize() {
        return maneSize;
    }

    public void setISAlpha(boolean isAlpha) {
        this.isAlpha = isAlpha;
    }

    public boolean getIsAlpha() {
        return isAlpha;
    }

    public void displayLiondetails() {
        System.out.println("Animal Species: " + species);
        System.out.println("Animal Name: " + name);
        System.out.println("Animal Breed: " + breed);
        System.out.println("Animal Habitat: " + habitat);
        System.out.println("Animal age: " + age);
        System.out.println("Animal Gender: " + gender);
        System.out.println("Animal Pride Name: " + prideName);
        System.out.println("Animal Mane Size:" + maneSize);
        System.out.println("Animal is Alpha: " + isAlpha);
    }

    @Override
    public void canMakeSound() {
        System.out.println("Makes Lion sound");
    }

}