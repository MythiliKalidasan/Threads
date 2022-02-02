import java.util.Map;

public class MapHelperThread3 implements Runnable {
    Map<String, Integer> map;

    public MapHelperThread3(Map<String, Integer> map) {
        this.map = map;
        new Thread(this, "MapHelperThread").start();
    }

    public void run() {
        map.put("Three", 3);
        try {
            System.out.println("MapHelper3 sleeping");
            Thread.sleep(100);
        } catch (Exception e) {
            System.out.println(e);
        }

    }

}
