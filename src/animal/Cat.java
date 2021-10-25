package animal;

public class Cat extends Animal {
    private static final String phrase = "I'm eating cat food";


    @Override
    public void eating() {
        System.out.println(phrase);
    }

    @Override
    public void toSleep() {
        super.toSleep();
    }

    @Override
    public void voice() {
        if (!sleep) {
            System.out.println("Meow meow");
        } else {
            System.out.println();
        }
    }
}
