class TicketCounter {
    int availableSeats = 5;

    public synchronized void bookTicket(String name, int seatsRequested) throws InterruptedException {
        while (availableSeats < seatsRequested) {
            System.out.println(name + " is waiting for " + seatsRequested + " seats... (Available: " + availableSeats + ")");
            wait(); // Releases lock and pauses until notifyAll() is called
        }

        availableSeats -= seatsRequested;
        System.out.println(name + " successfully booked " + seatsRequested + " seats. (Remaining: " + availableSeats + ")");
    }

    public synchronized void cancelTicket(String name, int seatsToCancel) {
        availableSeats += seatsToCancel;
        System.out.println(name + " cancelled " + seatsToCancel + " seats. (Available: " + availableSeats + ")");
        notifyAll(); // Wakes up all waiting threads to re-check availableSeats
    }
}

class BookingTask implements Runnable {
    TicketCounter counter;
    String uname;
    int seatsRequired;

    public BookingTask(TicketCounter counter, String uname, int seatsRequired) {
        this.counter = counter;
        this.uname = uname;
        this.seatsRequired = seatsRequired;
    }

    public void run() {
        try {
            counter.bookTicket(uname, seatsRequired);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class CancelTask implements Runnable {
    TicketCounter counter;
    String uname;
    int seatsToCancel;

    public CancelTask(TicketCounter counter, String uname, int seatsToCancel) {
        this.counter = counter;
        this.uname = uname;
        this.seatsToCancel = seatsToCancel;
    }

    public void run() {
        try {
            Thread.sleep(2000); // Wait 2 seconds so a booking thread enters the waitlist first
            counter.cancelTicket(uname, seatsToCancel);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class MovieTicketBooker {
    public static void main(String[] args) throws InterruptedException {
        // One shared TicketCounter passed to all threads
        TicketCounter counter = new TicketCounter();

        Thread t1 = new Thread(new BookingTask(counter, "User1", 3));
        Thread t2 = new Thread(new BookingTask(counter, "User2", 3));
        Thread t3 = new Thread(new BookingTask(counter, "User3", 2));
        Thread t4 = new Thread(new CancelTask(counter, "User1", 3));

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        t1.join();
        t2.join();
        t3.join();
        t4.join();

        System.out.println("Final available seats: " + counter.availableSeats);
    }
}