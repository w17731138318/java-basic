package java8;

/**
 * @author 王伟鑫
 * @version 0.1v
 * @create 2017-12-02 11:32
 * @see
 **/
interface  UserFactory<P extends User> {

    /**
     * 所谓的函数式接口，当然首先是一个接口，然后就是在这个接口里面只能有一个抽象方法。
     * @param id
     * @param name
     * @return
     */
    P create(Integer id, String name);

    /**
     * 可以有默认的方法
     * @param name
     * @return
     */
    default P create(String name){
        return (P)new User(name);
    };

    /**
     * 错误
     * @param id
     * @return
     */
    default P create(Integer id){
        return (P)new User(id);
    };
}
