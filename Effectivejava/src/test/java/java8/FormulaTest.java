package java8;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2017/12/2.
 */
public class FormulaTest {
    @Test
    public void interfaceDefaultTest(){
        /**
         * 接口必须实现
         * 默认方法不必实现
         */
        Formula formula = new Formula() {
            @Override
            public double calculate(int a) {
                return sqrt(a*100);
            }
        };
        double calculate = formula.calculate(9);
        double sqrt = formula.sqrt(9);
        System.out.println(calculate);
        System.out.println(sqrt);
    }
}