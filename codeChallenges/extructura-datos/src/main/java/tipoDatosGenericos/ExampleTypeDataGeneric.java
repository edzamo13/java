package tipoDatosGenericos;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;

@RequiredArgsConstructor
public class ExampleTypeDataGeneric<T> {

    private ArrayList<T> list = new ArrayList<T>();

    public T get(Integer index) {
        return list.get(index);
    }

    public void delete(T type) {
        list.remove(type);
    }

    public void add(T type) {
        list.add(type);
    }

    public Integer size() {
        return list.size();
    }


}
