package HW_6.animals;

public class Cat extends Animal {

    public Cat(String name, int distanceRun, int distanceSwim) {
        this.name = name;
        this.maxRun = 200;
        if (distanceRun <= maxRun) {
            System.out.println(name + " пробежал " + distanceRun + "м");
        } else System.out.println(name + " не может бежать больше " + maxRun + "м");

        if (distanceSwim > 0) {
            System.out.println(name + " не умеет плавать");
        }
        animalCount++;

    }

}
