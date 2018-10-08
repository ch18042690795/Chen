package Archive;

import org.junit.Test;

/**
 * Created by BONC on 2018/9/28.
 */
public class TestThread {
    @Test
    public void test1(){
        MyThread t1 = new MyThread("T1");
        MyThread t2 = new MyThread("T2");
        Thread a=new Thread(t1);
        Thread b=new Thread(t2);
        a.start();
        a.yield();



        try{
            a.sleep(300);

        }catch(Exception e){}
        b.start();
    }

    class MyThread implements Runnable{
        private String name ;

        public MyThread(String name) {
            this.name = name;
        }

        public void run() {
            for(int i = 0; i <= 100 ; i ++){
                System.out.println(name + " : " + i);

            }
        }
    }
}
