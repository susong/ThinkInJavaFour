package c14;


import java.lang.reflect.Array;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

/**
 * Created by SuSong on 2015-02-01 23:27.
 */

class Dish {
    public String s;
}

class BaseDish<T> {

    public String resultCode;
    public List<T> result;


}

class DishResult extends BaseDish<Dish> {

}

public class Exercise10 {
    Object array;

    public Exercise10() {
        array = Array.newInstance(getGenericType((new BaseDish<Dish>()).getClass()
                , 0), 100);
    }

    public static void main(String[] args) {
        Exercise10 c = new Exercise10();
        System.out.println(c.array);

        List<Dish> result = new BaseDish<Dish>().result;
    }

    public Class getGenericType(Class<?> clazz, int index) {
        Type genType = clazz.getGenericSuperclass();
        if (!(genType instanceof ParameterizedType)) {
            return Object.class;
        }
        Type[] params = ((ParameterizedType) genType).getActualTypeArguments();
        if (index >= params.length || index < 0) {
            throw new RuntimeException("Index outof bounds");
        }
        if (!(params[index] instanceof Class)) {
            return Object.class;
        }
        return (Class) params[index];
    }
}





