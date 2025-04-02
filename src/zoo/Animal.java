package zoo;

public class Animal {
    String species;
    String name;
    String breed;
    int age;
    String habitat;
    String gender;

    public Animal(String species, String name, String breed, String habitat, int age, String gender) {
        this.species = species;
        this.name = name;
        this.breed = breed;
        this.habitat = habitat;
        this.age = age;
        this.gender = gender;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getSpecies() {
        return species;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        System.out.println(species  +" Age : ");
        return age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void canMakeSound() {
        System.out.println("Animal can make sound.");
    }

    public void displayAnimalDetails() {
        System.out.println("Animal Species: " + species);
        System.out.println("Animal Name: " + name);
        System.out.println("Animal Breed: " + breed);
        System.out.println("Animal Habitat: " + habitat);
        System.out.println("Animal age: " + age);
        System.out.println("Animal Gender: " + gender);
    }

}