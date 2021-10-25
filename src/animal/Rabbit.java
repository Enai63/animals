package animal;

public class Rabbit extends Animal {
    private static final String phrase = "I'm eating carrot";


    @Override
    public void eating() {
        System.out.println(phrase);
    }

    @Override
    public void voice() {
        if (!sleep) {
            System.out.println(".....");
        } else {
            System.out.println();
        }
    }

    @Override
    public void toSleep() {
        super.toSleep();
    }

}
