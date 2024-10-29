package Model;

import java.util.ArrayList;
import java.util.List;

public class GenericClass<T> {
    private List<T> list=new ArrayList<>();

    public void add(T t){
        list.add(t);
    }
    public void remove(T t){
        list.remove(t);
    }

    public T get(Integer index){
        return list.get(index);
    }
    public void showList(){
        System.out.println(list);
    }
}
