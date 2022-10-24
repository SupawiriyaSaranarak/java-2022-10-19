
public class Start2 {
    public static void main (String[] data) throws Exception {
        
        Printer p = new Printer();
        p.start(); // working in another thread
        p.join(); // to synchronous the multithread
        
        Writer w = new Writer();
        Thread t = new Thread(w);
        t.start();
        
        for (int i = 0; i < 1000; i++) System.out.print("A");
        
    }
}
// multiple thred
class Printer extends Thread {
    public void run() { // have to use only run()
        for (int i = 0; i < 1000; i++) System.out.print("P");
    }
}
// native method is the method written by C language

class Writer implements Runnable {
    public void run() { // have to use only run()
        for (int i = 0; i < 1000; i++) System.out.print("W");
    }
}