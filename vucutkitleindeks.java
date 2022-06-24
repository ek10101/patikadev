import java.util.Scanner;

public class vucutkitleindeks {
    public static void main(String[] args) {
        
        float kg, m, kitleIndeks;
        Scanner inp = new Scanner(System.in);

        System.out.print("Lütfen Boyunuzu Metre Cinsinden Giriniz: ");
        m = inp.nextFloat();

        System.out.print("Lütfen Kilonuzu Giriniz: ");
        kg = inp.nextFloat();

        kitleIndeks = kg / (m * m);
        System.out.print("Vücüt Kitle İndeksiniz: " + kitleIndeks);
    
/**@author E.K. 25.06.2022
 */
    }
}
