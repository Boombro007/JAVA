class TicketCounter{
    static int availabelSeats = 5;
    public static synchronized void bookTicket(String name,int seatRequested) throws InterruptedException{
        if(availabelSeats >= seatRequested && availabelSeats > 0){
            Thread.sleep(500);
            System.out.println(name + " booked " + seatRequested + " seats. ");
            availabelSeats -= seatRequested;
            System.out.println("Avaliable seats : " + availabelSeats);
        }
        else{
            System.out.println("Don't have enough seats for you !");
        }
    }
}

class BookingTask implements Runnable{
    String uname;
    int setRequired;
    public BookingTask(String uname,int seatRequired){
        this.uname = uname;
        setRequired = seatRequired;
    }
    public void run (){
        try {
            TicketCounter.bookTicket(uname, setRequired);
        } 
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class MovieTicketBooking {
    public static void main(String[] args) throws InterruptedException {
        BookingTask u1 = new BookingTask("User1", 3);
        BookingTask u2 = new BookingTask("User2", 3);
        BookingTask u3 = new BookingTask("User3", 2);
        
        Thread t1 = new Thread(u1);
        Thread t2 = new Thread(u2);
        Thread t3 = new Thread(u3);

        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();
   }
}