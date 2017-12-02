package Effectivejava.creatingAndDestroyingObjects01.examples02.javabean;/**
 * Created by Administrator on 2017/12/2.
 */

/**
 * java beans
 * 默认public无参构造器+set方法
 *
 * @author 王伟鑫
 * @version 0.1v
 * @create 2017-12-02 9:08
 * @see
 **/
public class User {
    //参数初始化默认值 (如果有的话)
    private Long id;
    private String name;
    private Integer age;
    private String tel;
    private String adr;
    private byte sex=1;

    public User() {
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public void setAdr(String adr) {
        this.adr = adr;
    }

    public void setSex(byte sex) {
        this.sex = sex;
    }
}
