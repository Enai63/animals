package animal;

public abstract class Animal {
    protected String name;
    protected Integer age;
    protected Boolean sleep = false;

    public Animal(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getSleep() {
        return sleep;
    }

    public void setSleep(Boolean sleep) {
        this.sleep = sleep;
    }
}
