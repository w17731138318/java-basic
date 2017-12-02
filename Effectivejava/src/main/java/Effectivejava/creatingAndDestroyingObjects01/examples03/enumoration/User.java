package Effectivejava.creatingAndDestroyingObjects01.examples03.enumoration;

/**
 * Enum singleton - the preferred approach
 */
public enum User {
    INSTANCE(1,"张三",20);

    public String toString() {
        return super.toString()+"("+id+","+name+","+age+")";
    }
    private int id;
    private String name;
    private int age;

    private User(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    public void say() {
        System.out.println(this.id+" "+this.name+" "+this.age);
    }
    public static void main(String[] args) {
        User instance = User.INSTANCE;
        instance.say();
    }
}
