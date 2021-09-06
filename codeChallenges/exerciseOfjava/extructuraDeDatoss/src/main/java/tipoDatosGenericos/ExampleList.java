package tipoDatosGenericos;

import lombok.RequiredArgsConstructor;

import java.util.ArrayList;

@RequiredArgsConstructor
public class ExampleList {
    private ArrayList<Integer> list = new ArrayList<Integer>();

    public Integer get(Integer index) {
        return list.get(index);
    }

    public void delete(Integer index) {
        list.remove(index);
    }

    public void add(Integer integer) {
        list.add(integer);
    }

    public Integer size() {
        return list.size();
    }

}
