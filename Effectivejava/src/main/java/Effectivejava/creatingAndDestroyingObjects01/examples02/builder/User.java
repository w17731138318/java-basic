package Effectivejava.creatingAndDestroyingObjects01.examples02.builder;/**
 * Created by Administrator on 2017/12/2.
 */

/**
 * 通过构建器创建对象
 *
 * @author 王伟鑫
 * @version 0.1v
 * @create 2017-12-02 9:18
 * @see
 **/
public class User {
    private final Long id;
    private final String name;
    private final Integer age;
    private final String tel;
    private final String adr;
    private final byte sex;
    public static class Builder {
        private final Long id;
        private final String name;
        private Integer age;
        private String tel;
        private String adr;
        private byte sex;

        public Builder(Long id, String name) {
            this.id = id;
            this.name = name;
        }
        public Builder age(Integer age) {
            age = age;
            return this;
        }
        public Builder age(String tel) {
            tel = tel;
            return this;
        }
        public Builder adr(String adr) {
            adr = adr;
            return this;
        }
        public Builder sex(byte sex) {
            sex = sex;
            return this;
        }
        public User build() {
            return new User(this);
        }
    }
    private User(Builder builder) {
        id = builder.id;
        name = builder.name;
        age = builder.age;
        tel = builder.tel;
        adr = builder.adr;
        sex = builder.sex;
    }
}
