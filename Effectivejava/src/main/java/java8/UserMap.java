package java8;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 王伟鑫
 * @version 0.1v
 * @create 2017-12-02 11:02
 * @see
 **/
public class UserMap {
    public Map<Integer,User> map;
    Map<Integer,User> add(User user){
        if(map==null){
            map = new HashMap<Integer,User>();
        }
        return (Map<Integer, User>) map.put(user.getId(),user);
    }
}
