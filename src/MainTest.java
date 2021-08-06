import java.util.*;

public class MainTest {
    public static void main(String[] args) {
//        System.out.println("main call");
//
//
//        HashSet hashSet = new HashSet();
//        hashSet.add("123");
//        hashSet.add("123");
//        hashSet.add("123");
//        hashSet.add("123");
//
//            System.out.println("------------");
//        Iterator<String> stringIterator = hashSet.iterator();
//        while (stringIterator.hasNext()){
//            System.out.println(stringIterator.next());
//        }
//            System.out.println("------------");
//
//        ArrayList<String> arrayList = new ArrayList<>();
//        arrayList.add("123");
//        arrayList.add("123");
//        arrayList.add("123");
//        arrayList.add("123");
//        arrayList.add("123");
//
//        for (String s : arrayList) {
//            System.out.println(s);
//        }
//            System.out.println("------------");
//        Map<String, Integer> stringIntegerMap = new HashMap<>();
//        stringIntegerMap.put("1",1);
//        stringIntegerMap.put("2",2);
//        stringIntegerMap.put("3",3);
//        stringIntegerMap.put("4",4);
//
//        for (String key : stringIntegerMap.keySet()) {
//            System.out.println(stringIntegerMap.get(key));
//        }
//            System.out.println("------------");
//
//        for (Map.Entry<String,Integer> entry : stringIntegerMap.entrySet()) {
//            System.out.println(entry.getKey() + " - " + entry.getValue());
//        }

        String str = "aaa";
        String str2 = new String("aaa");
//        System.out.println(str == str2);
//        System.out.println(str.equals(str2));
        System.out.println(str.hashCode());
//        System.out.println(str2.hashCode());

        int[] arr = new int[5];
        Arrays.setAll(arr, i ->(int)(Math.random()*5)+1);

        List list = new ArrayList(Arrays.asList(arr));
        list.add("3");


    }
}
