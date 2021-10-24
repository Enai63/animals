package animal;

public class Cat extends Animal {
    private static final String phrase = "I'm eating cat food";
    private String breed;

    public Cat(String name, Integer age, String breed) {
        super(name, age);
        this.breed = breed;
    }

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
        }  else {
        System.out.println();
    }
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
