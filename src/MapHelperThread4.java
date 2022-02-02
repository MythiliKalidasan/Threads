import java.util.Map;

public class MapHelperThread4 implements Runnable {
    Map<String, Integer> map;

    public MapHelperThread4(Map<String, Integer> map) {
        this.map = map;
        new Thread(this, "MapHelperThread").start();
    }

    public void run() {
        map.put("Four", 4);
        try {
            System.out.println("MapHelper4 sleeping");
           // Thread.sleep(100);
        } catch (Exception e) {
            System.out.println(e);
        }

    }

}
