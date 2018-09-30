package Archive.Ticket;

/**
 * Created by BONC on 2018/9/28.
 */
public class saler implements Runnable {
    private String name;
    TicketPool pool;
    int count;
    public saler(String name, TicketPool pool) {
        this.name = name;
        this.pool = pool;
    }

    public void run() {
        while (true){
          count=pool.getTicket();
          if(count==0){
              return;
          }
        System.out.println(name+"卖了"+count+"号票");
          Thread.currentThread().yield();

        }
    }
}
