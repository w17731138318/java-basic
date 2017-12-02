package Effectivejava.creatingAndDestroyingObjects01.examples03.field;/**
 * Created by Administrator on 2017/12/2.
 */

/**
 * 单例模式-Singleton with public final field
 *
 * @author 王伟鑫
 * @version 0.1v
 * @create 2017-12-02 9:34
 * @see
 **/
public class User {
    private Long id;
    private String name;

    /*
    * 私有构造器
    */
    public static final User INSTANCE = new User();

    public void say() {
        System.out.println(this);
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        User instance = User.INSTANCE;
        User instance1 = User.INSTANCE;
        instance.setId(1l);
        instance.setName("张三");
        instance.say();
        instance1.setId(2l);
        instance1.setName("李四");
        instance1.say();
    }
}
