package etc;

import java.util.ArrayList;
import java.util.Arrays;

public class UseBox {
    public static void main(String[] args) {
        Box<String, Integer> box = new Box<>();
        box.setItem("123");
        box.setList(Arrays.asList(1,2,3,4,5));
//        box.setItem(new Object());

    }
}
