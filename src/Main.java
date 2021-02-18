public class Main {

    public static void main(String[] args) {

    Pot pot = new Pot();

    Fill Fulano = new Fill(pot, "Fulano");
    Fill Mengano = new Fill(pot, "Mengano");
    Fill Zutano = new Fill(pot, "Zutano");

    Pamare pamare = new Pamare(pot);

    pamare.start();

    Mengano.start();
    Zutano.start();
    Fulano.start();



    }
}
