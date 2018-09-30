package Archive;

/**
 * Created by BONC on 2018/9/28.
 */
public class Threads extends Thread {
    private String name;
    public Threads(String name) {
       this.name=name;
    }

    public void run() {
        for (int i=0;i<1000;i++){
            System.out.println(name+":"+i);
            yield();
        }
    }
}
