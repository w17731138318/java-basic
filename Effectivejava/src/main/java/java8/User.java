package java8;

/**
 * @author 王伟鑫
 * @version 0.1v
 * @create 2017-12-02 11:01
 * @see
 **/
public class User {
    private Integer id;
    private String name;

    /*
    * 私有构造器
    */
    public User() {
    }

    public User(Integer id) {
        this.id = id;
    }

    public User(String name) {
        this.name = name;
    }

    public User(Integer id, String name) {
        this.id = id;
        this.name = name;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
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
}
