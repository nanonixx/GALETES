package filoespageti;

public class MainPaguetis {
    public static void main(String[] args) {

        Cobert forquilla1 = new Cobert();
        Cobert forquilla2 = new Cobert();
        Cobert forquilla3 = new Cobert();
        Cobert forquilla4 = new Cobert();

        Filosof Arquimedes = new Filosof("El Arquímides este", forquilla4, forquilla1);
        Filosof Hipocrates = new Filosof("El Hipocrita este", forquilla1, forquilla2);
        Filosof Pitagoras = new Filosof("El Pitógoras este", forquilla2, forquilla3);
        Filosof Kant = new Filosof("El Kants este", forquilla3, forquilla4);

        Arquimedes.start();
        Hipocrates.start();
        Pitagoras.start();
        Kant.start();

    }

}
