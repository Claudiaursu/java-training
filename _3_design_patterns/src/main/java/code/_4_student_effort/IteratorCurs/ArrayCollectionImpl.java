package code._4_student_effort.IteratorCurs;

import java.util.ArrayList;
import java.util.List;

public class ArrayCollectionImpl implements ArrayCollection {
    private List<Integer> lista;

    public ArrayCollectionImpl() {
        lista = new ArrayList<>();
    }

    public void add(Integer e) {
        this.lista.add(e);
    }

    public void remove(Integer e) {
        this.lista.remove(e);
    }

    public ArrayCustomIterator iterator() {
        return new ArrayCustomIteratorImpl(this.lista);
    }
}
