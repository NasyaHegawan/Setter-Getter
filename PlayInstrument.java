import java.util.Scanner;

public class PlayInstrument {
    public static void main(String[] args) {
        Instrument a = new Instrument();
        Instrument b = new Instrument("Piano", 200.0);
        Instrument c = new Instrument("Violin", 150.9);

        a.setType("Guitar");
        a.setPrice(101.5);
        a.print();
        b.print();
        c.print();
            
        }

    }
