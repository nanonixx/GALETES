package GALETAS;

public class Pamare extends Thread{
    //pone galetas cuando no hay galetas

    Pot pot;

    public Pamare(Pot pot) {
        this.pot = pot;
    }

    @Override
    public void run() {
            while (true) {
                    pot.rellenar();
                    System.out.println("Padres rellenan galetas porque no había galetas");
                    pot.deixar();
                try {
                    Thread.sleep((long) (Math.random() * 800) + 200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                }

        }
}

