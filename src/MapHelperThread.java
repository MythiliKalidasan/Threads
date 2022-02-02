import java.util.Map;

public class MapHelperThread implements Runnable {
    Map<String, Integer> map;

    public MapHelperThread(Map<String, Integer> map) {
        this.map = map;
        new Thread(this, "MapHelperThread").start();
    }

    public void run() {
        map.put("One", 1);
        try {
            System.out.println("MapHelper1 sleeping");
            Thread.sleep(100);
        } catch (Exception e) {
            System.out.println(e);
        }

    }

}
