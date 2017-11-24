package basicfolder;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

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

    private void vypisDatumu() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        System.out.println(dateFormat.format(date));
    }
  
    private void pocitanie() {
        int sucet = 0;
        for(int a = 1; a < 20; a++) {
            sucet += a;
        }
        System.out.print(sucet);
    }

}
