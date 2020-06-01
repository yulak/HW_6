package HW_6.animals;

public class Dog_2 extends Animal {

    public Dog_2(String name, int distanceRun, int distanceSwim) {
        this.name = name;
        this.maxRun = maxRun = 600;
        this.maxSwim = maxSwim = 15;
        if (distanceRun <= maxRun) {
            System.out.println(name + " пробежал " + distanceRun + "м");
        } else {
            System.out.println(name + " не может бежать больше " + maxRun + "м");
        }

        if (distanceSwim <= maxSwim) {
            System.out.println(name + " проплыл " + distanceSwim + "м");
        } else {
            System.out.println(name + " не может проплыть больше " + maxSwim + "м");
        }
        animalCount++;
    }
}
