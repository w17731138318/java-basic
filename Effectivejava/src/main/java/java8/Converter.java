package java8;

/**
 * Created by Administrator on 2017/12/2.
 */
public interface Converter<F, T> {
    T convert(F from);
}
