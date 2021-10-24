package animal;

public class Rabbit extends Animal {
    private static final String phrase = "I'm eating carrot";
    private String breed;

    public Rabbit(String name, Integer age, String breed) {
        super(name, age);
        this.breed = breed;
    }

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

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
