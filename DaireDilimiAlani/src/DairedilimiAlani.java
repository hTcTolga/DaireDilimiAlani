import java.util.Scanner;
public class DairedilimiAlani {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        double r,aci,alan,pi=3.14;

        System.out.print("Yarıçapı Giriniz:");
        r=girdi.nextDouble();
        System.out.print("Daire Diliminin Açısını Giriniz:");
        aci=girdi.nextDouble();
        alan=(pi*(r*r)*aci)/360;
        System.out.print("Üçgen Dilimin Alanı: "+alan);

    }
}
