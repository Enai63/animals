package animal;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.eating();
        cat.voice();
        cat.toSleep();
        cat.voice();



        Dog dog = new Dog();
        dog.voice();
        dog.toSleep();
        dog.voice();
        dog.eating();
        dog.voice();


        
        Rabbit rabbit = new Rabbit();
        rabbit.voice();
        rabbit.eating();
        rabbit.toSleep();
        rabbit.voice();

    }
}
