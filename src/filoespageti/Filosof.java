package filoespageti;

public class Filosof extends Thread{
    String nom;
    Cobert forquillaPrincipal;
    Cobert forquillaAuxiliar;

    public String getNom() {
        return nom;
    }

    public Filosof(String nom, Cobert forquillaPrincipal, Cobert forquillaAuxiliar) {
        this.nom = nom;
        this.forquillaPrincipal = forquillaPrincipal;
        this.forquillaAuxiliar = forquillaAuxiliar;
    }

    public synchronized void menjar(){
        forquillaPrincipal.agafar();
        forquillaAuxiliar.agafar();
        System.out.println(getNom() + " come los paguetis");

        forquillaPrincipal.deixar();
        forquillaAuxiliar.deixar();
        System.out.println(getNom() + " deja de comer los paguetis");
    }

    public synchronized void pensar(){
        System.out.println(getNom() + " va a filosofar");
        try {
            Thread.sleep((long) (Math.random() * 800) + 200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(getNom() + " ha filosofado y quiere paguetis");
    }

    @Override
    public void run() {
        while(true){
            menjar();
            pensar();

        }
    }


}
