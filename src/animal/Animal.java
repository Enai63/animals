package animal;

public abstract class Animal {
    protected Boolean sleep = false;


    public void eating() {
        System.out.println("I'm eating");
    }

    public void voice() {
        if (!sleep) {
            System.out.println("voice");
        } else {
            System.out.println();
        }
    }

    public void toSleep() {
        this.sleep = true;
    }

}
