package filoespageti;

public class Cobert {

    boolean lliure;

    public synchronized void agafar(){
        try {
            while(!lliure) wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        lliure = false;
        notifyAll();

    }

    public synchronized void deixar(){
        try {
            while(!lliure) wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        lliure = false;
        notifyAll();
    }
}
