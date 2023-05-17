import homeWork2.Dress;
import org.junit.jupiter.api.Test;

public class DressShop {
    @Test
    public void listOfDresses() {
        Dress alfa = new Dress();
        alfa.setMaterial("Cotton");
        alfa.setSeason("Winter");
        alfa.setPrice(814.44);
        alfa.setCustomDesign(false);

        Dress beta = new Dress();
        beta.setMaterial("Silk");
        beta.setSeason("Summer");
        beta.setPrice(1199.99);
        beta.setCustomDesign(true);

//        System.out.println("Hello, world!");

        System.out.println("New " + alfa.getMaterial() + " dress, perfectly fit for " + alfa.getSeason() + " time.");
        alfa.printDress();

    }
}
