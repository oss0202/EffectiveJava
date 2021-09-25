import java.util.*;

public class MainTest {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>();
//        stringBox.setItem(new Integer("123")); String 만 됨
        stringBox.setItem("ABC");
        String item = stringBox.getItem();// 형변환이 필요없음

        
        
    }
}
