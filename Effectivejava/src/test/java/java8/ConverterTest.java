package java8;

import org.junit.Test;

import java.nio.file.DirectoryStream;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2017/12/2.
 */
public class ConverterTest {
    @Test
    public void converterTest(){
        Converter<String, Integer> converter = (from) -> Integer.valueOf(from);
        Integer converted = converter.convert("123");
        System.out.println(converted);    // 123
        Converter<String, Integer> converter1 = Integer::valueOf;
        Integer converted1 = converter1.convert("1234");
        System.out.println(converted1);   // 123
//        Converter<Integer, Integer> converter2 = (from) -> Integer.highestOneBit(from);
        Converter<Integer, Integer> converter2 = Integer::highestOneBit;
        Integer converted2 = converter2.convert(123);
        System.out.println(converted2);    // 123
        Something something = new Something();
        Converter<String, String> converter3 = something::startsWith;
        String converted3 = converter3.convert("Java");
        System.out.println(converted3);    // "J"
        UserFactory<User> userFactory = User::new;
        User user = userFactory.create(1, "张三");
        System.out.println(user);
        User user1 = userFactory.create("张三");
        System.out.println(user1);
        User user2 = userFactory.create(3);
        System.out.println(user2);
    }
}