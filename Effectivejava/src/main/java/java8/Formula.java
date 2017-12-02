package java8;

/**
 * Created by Administrator on 2017/12/2.
 * 接口内部可以有默认实现方法
 */
public interface Formula {
    double calculate(int a);

    default double sqrt(int a) {
        return Math.sqrt(a);
    }
}
