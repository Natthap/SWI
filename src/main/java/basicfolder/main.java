package basicfolder;

/**
 * Created by mzikl on 24.11.2017.
 */
public class main {

    public void hlavnaMetoda() {
        pozdrav();
        pocitanie();
    }

    private void pozdrav() {
        System.out.println("Ahoj svet, ja som programator!");
    }

    private void pocitanie() {
        int sucet = 0;
        for(int a = 1; a < 20; a++) {
            sucet += a;
        }
        System.out.print(sucet);
    }

}
