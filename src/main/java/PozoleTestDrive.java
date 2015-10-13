import com.iteso.factory.PozoleStore;
import com.iteso.factory.Pozole;
import com.iteso.factory.stores.MenudoStore;
import com.iteso.factory.stores.PozoleRojoStore;
import com.iteso.factory.stores.PozoleVerdeStore;

/**
 * Created with IntelliJ IDEA.
 * User: rvillalobos
 * Date: 9/2/13
 * Time: 5:42 PM
 * To change this template use File | Settings | File Templates.
 */
public class PozoleTestDrive {
    public static void main (String[] args){
        PozoleStore verdeStore = new PozoleVerdeStore();
        PozoleStore rojoStore = new PozoleRojoStore();
        PozoleStore menuderia = new MenudoStore();

        Pozole pozole = verdeStore.orderPozole("pollo");

        System.out.println("First order is: "+ pozole.getName());
        System.out.println();
        System.out.println();
        pozole = rojoStore.orderPozole("pollo");

        System.out.println("Second order is: "+ pozole.getName());
        System.out.println();
        System.out.println();

        pozole = menuderia.orderPozole("pollo");

        System.out.println("Third order is: "+ pozole.getName());
    }
}
