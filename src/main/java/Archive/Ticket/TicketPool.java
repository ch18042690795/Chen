package Archive.Ticket;

/**
 * Created by BONC on 2018/9/28.
 */
public class TicketPool {
 int count;

    public TicketPool(int count) {
        this.count = count;
    }

    public synchronized int getTicket(){
        if(count==0){
            return count;
        }
        count--;
        return count;
    }
}
