package animal;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Murzik", 1, "British");
        cat.eating();
        cat.voice();
        cat.toSleep();
        cat.voice();



        Dog dog = new Dog("Bublik", 2, "German Shepherd");
        dog.voice();
        dog.toSleep();
        dog.voice();
        dog.eating();
        dog.voice();


        
        Rabbit rabbit = new Rabbit("Shpik", 1, "Alyaska");
        rabbit.voice();
        rabbit.eating();
        rabbit.toSleep();
        rabbit.voice();

    }
}
