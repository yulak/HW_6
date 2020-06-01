package HW_6;

import HW_6.animals.Cat;
import HW_6.animals.Dog;
import HW_6.animals.Dog_2;

public class Main {

    public static void main(String[] args) {
        Cat cat = new Cat("Cheshirsky cat", 200, 1);
        cat.run();
        cat.swim();


        Dog dog = new Dog("Scooby-Doo", 500, 10);
        dog.run();
        dog.swim();

        Dog_2 dog_2 = new Dog_2("Maylo", 600, 15);
        dog.run();
        dog.swim();
        
    }
}


