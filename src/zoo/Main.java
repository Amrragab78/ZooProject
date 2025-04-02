package zoo.zooMain;

import zoo.Animal;
import zoo.Elephant;
import zoo.Lion;
import zoo.Monkey;
import zoo.Zebra;

import java.util.ArrayList;

public class Main {
    public static void main(String args[]) {
        ArrayList<Animal> zooAnimals = new ArrayList<>();

        zooAnimals.add(new Elephant("Elephant", "Mike", "African", "Savannah", 30, "Male", 230, 20, "Egypt"));
        zooAnimals.add(new Lion("Lion", "Steve", "Australian", "Kenyon ", 10, "Female", "WakoWako", 10, true));
        zooAnimals.add(new Monkey("Monkey", "Hannah", "China", "South China", 5, "Female", "Tree leaves", 22, 3));
        zooAnimals.add(new Zebra("Zebra", "Kyle", "North Africa", "African", 7, "Male", "Wide", false, 10));

        for (Animal animal : zooAnimals) {
            System.out.println(animal.getAge());
            if (animal instanceof Elephant) {
                System.out.println("Elephant Details: ");
                ((Elephant) animal).displayElephantdetails();

            } else if (animal instanceof Lion) {
                System.out.println("Lion Details: ");
                ((Lion) animal).displayLiondetails();

            } else if (animal instanceof Monkey) {
                System.out.println("Monkey Details: ");
                ((Monkey) animal).displayMonkeyDetails();

            } else if (animal instanceof Zebra) {
                System.out.println("Zebra Details: ");
                ((Zebra) animal).displayZebraDetails();
            }
            animal.canMakeSound();
        }

    }
}
