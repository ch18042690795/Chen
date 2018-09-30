package Archive.Ticket;

/**
 * Created by BONC on 2018/9/28.
 */
public class SaleTickets {
    public static void main(String[] args) {
        TicketPool pool=new TicketPool(100);
        saler s1=new saler("chen",pool);
        saler s2=new saler("wang",pool);
        Thread t1=new Thread(s1);
        Thread t2=new Thread(s2);
        t1.start();
        t2.start();
    }
}
