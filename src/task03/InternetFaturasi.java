package task03;

import java.util.Scanner;

public class InternetFaturasi {
    public static void main(String[] args) {
        do {
            System.out.println("Fatura = " + faturaHesapla());
        }while (islemDevamMi().equalsIgnoreCase("E"));
    }
    public static float faturaHesapla(){
        Scanner readInt=new Scanner(System.in);
        Scanner readFlt=new Scanner(System.in);
        System.out.print("Aylık sabit ücreti girin = ");
        Float aylikSabitUcret= readFlt.nextFloat();
        System.out.print("Kategori (1,2 veya 3) girin = ");
        int kategori= readInt.nextInt();
        System.out.print("Fazla kullanım miktarını (GB) girin = ");
        int fazlaKullanimMiktariGB=readInt.nextInt();
        float ekUcretBirimFiyati = 0;
        switch (kategori){
            case 1: ekUcretBirimFiyati=0.10F;break;
            case 2: ekUcretBirimFiyati=0.20F;break;
            case 3: ekUcretBirimFiyati=0.30F;break;
            default: System.out.println("Hatalı Kategori");
        }
        float ekstraUcret=ekUcretBirimFiyati*fazlaKullanimMiktariGB;
        float aylikFatura=aylikSabitUcret+ekstraUcret;
        return aylikFatura;
    }
    public static String islemDevamMi(){
        Scanner readStr=new Scanner(System.in);
        System.out.print("Yeni bir müşteri için hesaplama yapmak ister misin? (Evet için 'E',Hayır için 'H') = ");
        String yesOrNo=readStr.nextLine().trim();
        return yesOrNo;
    }
}
