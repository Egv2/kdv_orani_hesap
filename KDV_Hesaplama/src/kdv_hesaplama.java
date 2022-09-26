import java.util.Scanner;

public class kdv_hesaplama {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double tutar, toplam, kdvTutari,  kdv1=0.18, kdv2=0.08;

        System.out.print("Ürün fiyatını giriniz : ");
        tutar = input.nextDouble();
        System.out.println("KDV'siz Fiyat: " +tutar);

        if (tutar<1000) {
            kdvTutari = tutar * kdv1;
            toplam = kdvTutari + tutar;
            System.out.println("KDV Oranı :" + kdvTutari);

        }else {
                kdvTutari = tutar * kdv2;
                toplam = kdvTutari + tutar;
            System.out.println("KDV Oranı : " + kdvTutari);
            }
        System.out.println("KDV'li Toplam Tutar : " + toplam);
        }
    }


