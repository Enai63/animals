package animal;

public abstract class Animal {
    protected Boolean sleep = false;


    public void eating() {
        System.out.println("I'm eating");
    }

    public abstract void voice();

    public void toSleep() {
        this.sleep = true;
    }

}
