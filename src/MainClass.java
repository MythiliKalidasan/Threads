import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class MainClass {

    public static void main(String[] args) {
//        Map<String, Integer> hashMap = new HashMap<>();
//        Map<String, Integer> syncMap = Collections.synchronizedMap(hashMap);
//
//        MapHelperThread MapHelperThread = new MapHelperThread(syncMap);
//        MapHelperThread2 MapHelperThread2 = new MapHelperThread2(syncMap);
//        MapHelperThread3 MapHelperThread3 = new MapHelperThread3(syncMap);
//        MapHelperThread4 MapHelperThread4 = new MapHelperThread4(syncMap);

        Map<String, Integer> conMap = new ConcurrentHashMap<>();
        MapHelperThread mapHelperCon1 = new MapHelperThread(conMap);
        MapHelperThread2 mapHelperCon2 = new MapHelperThread2(conMap);
        MapHelperThread3 mapHelperCon3 = new MapHelperThread3(conMap);
        MapHelperThread4 mapHelperCon4 = new MapHelperThread4(conMap);

//        for (Map.Entry<String, Integer> e : syncMap.entrySet()) {
//            System.out.println(e.getKey() + "=" + e.getValue());
//        }


        System.out.println("MAP VALUES");

        for (Map.Entry<String, Integer> e : conMap.entrySet()) {


            System.out.println(e.getKey() + "=" + e.getValue());
        }

        Collection<Number> learnColletn = new ArrayList<>();
        learnColletn.add(4);
        learnColletn.add(123);

        Set<Integer> treeSet=  new TreeSet<>();
        treeSet.add(4);
        treeSet.add(11);
        treeSet.add(7);

        for(Number i:learnColletn){
            System.out.println(i);
        }

        List<Object> listOfObj = new ArrayList<>();
        listOfObj.add(treeSet);
        listOfObj.add(learnColletn);
        listOfObj.add(123);

        for(Object i :listOfObj){
            System.out.println("OBJECT"+i);
        }


    }
}
