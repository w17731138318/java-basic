package Effectivejava.creatingAndDestroyingObjects01.examples02.telescopingConstructor;/**
 * Created by Administrator on 2017/12/2.
 */

/**
 * 重载构造器
 * 通过不同构造器创，传入参数赋值创建对象
 *
 * @author 王伟鑫
 * @version 0.1v
 * @create 2017-12-02 9:13
 * @see
 **/
public class User {
    private Long id;
    private String name;
    private Integer age;
    private String tel;
    private String adr;
    private byte sex;
    /*
    * 无参构造器
    */
    public User(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public User(Long id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public User(Long id, String name, Integer age, String tel) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.tel = tel;
    }

    public User(Long id, String name, Integer age, String tel, String adr) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.tel = tel;
        this.adr = adr;
    }

    public User(Long id, String name, Integer age, String tel, String adr, byte sex) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.tel = tel;
        this.adr = adr;
        this.sex = sex;
    }
}
