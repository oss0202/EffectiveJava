package first;

import javax.xml.transform.Source;

public class SumTest {
    private static long refererSum(){
        Long sum = 0L;
        for (long i = 0; i <= Integer.MAX_VALUE; i++){
            sum += i;
        }
        return sum;// long -> Long 오토박싱
    }
    private static long primiSum(){
        long sum = 0L;
        for (long i = 0; i <= Integer.MAX_VALUE; i++){
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        long beforeTime = System.currentTimeMillis();
        System.out.println(SumTest.refererSum());
        long afterTime = System.currentTimeMillis();
        System.out.println("refererSum 시간(s) : " + (afterTime-beforeTime)/1000 + "초");

        beforeTime = System.currentTimeMillis();
        System.out.println(SumTest.primiSum());
        afterTime = System.currentTimeMillis();
        System.out.println("refererSum 시간(s) : " + (float)(afterTime-beforeTime)/1000 + "초");
    }
}
