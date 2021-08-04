package first;

import java.util.Objects;

public class SpellChecker {
    private final Objects dictionary;

    // 정적 유틸리티를 잘못 사용한 예 - 유연하지 않고 테스트하기 어렵다
    // private SpellChecker(...){}

    // 싱글턴을 잘못 사용한 예 - 유연하지 않고 테스트하기 어렵다.
    /*private SpellChecker(){

    }
    public static SpellChecker INSTANCE = new SpellChecker();
    */
    public SpellChecker(Objects dictionary){
        this.dictionary = Objects.requireNonNull(dictionary);
    }
    public boolean isValid(String word){return false;}
    //...
}
