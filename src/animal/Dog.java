package animal;

public class Dog extends Animal{
    private static final String phrase = "I'm eating dog food";



    @Override
    public void eating() {
        System.out.println(phrase);
    }

    @Override
    public void voice() {

        if (!sleep) {
            System.out.println("Bark bark");
        } else {
            System.out.println();
        }
    }

    @Override
    public void toSleep() {
        super.toSleep();
    }

}
