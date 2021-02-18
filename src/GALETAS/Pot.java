package GALETAS;

public class Pot {
    //es un pote
    //tiene 10 galetas max

    private boolean lliure;
    private int numGaletes;

    public boolean isLliure() {
        return lliure;
    }

    public int getNumGaletes() {
        return numGaletes;
    }

    public void setNumGaletes(int numGaletes) {
        this.numGaletes = numGaletes;
    }

    public Pot() {
        lliure = true;
        numGaletes = 10;
    }

    public synchronized  void rellenar() {
        try {
            while(!lliure || numGaletes!=0) wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        lliure = false;
        numGaletes = 10;
        notifyAll();
    }

    public synchronized void agafar() {
        try {
            while(!lliure || numGaletes==0) wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        lliure = false;
        numGaletes--;
        notifyAll();
    }

    public synchronized void deixar(){
        lliure = true;
        notifyAll();
    }
}
