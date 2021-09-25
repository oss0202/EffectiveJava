package etc;

import java.util.ArrayList;
import java.util.List;

public class Box<T, E> {
    T item;
    List<E> list = new ArrayList<>();
    public void setItem(T item) {
        this.item = item;
    }

    public void setList(List<E> list) {
        this.list = list;
    }

    public T getItem() {
        return item;
    }
}
