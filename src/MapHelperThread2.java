import java.util.Map;

public class MapHelperThread2 implements Runnable {
    Map<String, Integer> map;

    public MapHelperThread2(Map<String, Integer> map) {
        this.map = map;
        new Thread(this, "MapHelperThread").start();
    }

    public void run() {
        map.put("Two", 2);
        try {
            System.out.println("MapHelper2 sleeping");
            Thread.sleep(100);
        } catch (Exception e) {
            System.out.println(e);
        }

    }

}
