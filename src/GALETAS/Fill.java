package GALETAS;

public class Fill extends Thread{
    //comen 1 galetas uno a la vez

    Pot pot;
    String nom;

    public String getNom() {
        return nom;
    }

    public Fill(Pot pot, String nom) {
        this.pot = pot;
        this.nom = nom;
    }

    @Override
    public void run() {
            while (true) {

                pot.agafar();
                System.out.println(getNom() + " coge el pote de galetas y va a comer galetas");

                try {
                    Thread.sleep((long) (Math.random() * 800) + 200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                pot.deixar();
                System.out.println(getNom() + " deja el pote de galetas ha comido galetas");
                System.out.println("GALETAS: " + pot.getNumGaletes());

                try {
                    Thread.sleep((long) (Math.random() * 800) + 200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }
    }