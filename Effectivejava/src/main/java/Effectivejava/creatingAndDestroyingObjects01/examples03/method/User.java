package Effectivejava.creatingAndDestroyingObjects01.examples03.method;/**
 * Created by Administrator on 2017/12/2.
 */

/**
 * Singleton with static factory
 *
 * @author 王伟鑫
 * @version 0.1v
 * @create 2017-12-02 9:54
 * @see
 **/
public class User {
    private static final User INSTANCE = new User();
    private Long id;
    private String name;

    /*
    * 私有构造器
    */
    private User() {
    }

    /*
    * 构建新实例
    */
    public static User newInstance() {
        return INSTANCE;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void say() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        User user = User.newInstance();
        user.setId(1l);
        user.setName("张三");
        user.say();
        User user1 = User.newInstance();
        user1.setId(2l);
        user1.setName("李四");
        user1.say();
    }
}
