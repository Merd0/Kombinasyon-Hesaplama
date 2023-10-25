import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Kombinasyon formülü
        // C(n,r) = n! / (r! * (n-r)!)

        Scanner inp = new Scanner(System.in);

        int n, r, kom, total1 = 1, total2 = 1 , total12 = 1 ;

        System.out.print("Bir n sayısını giriniz :");
        n = inp.nextInt();

        System.out.print("Bir r sayısı giriniz :");
        r = inp.nextInt();

        for (int i = 1; i <= n; i++) {
            total1 = total1 * i;
        }

        for (int m = 1; m <= r; m++) {
            total2 = total2 * m;
        }

        for(int c=1;c<=(n-r);c++){
            total12=total12*c;
        }

        kom = total1 / (total2 * (total12));

        System.out.println("Sonuç :" + kom  );

    }
}