package String;

import java.util.Locale;

public class OperatorString {
    public static void main(String[] args){
        System.out.println("Hai");

        String kota = "Banjarasin";
        int jumlah;
        double ipk;
        char nilaiAbjad;

        char[] kotaChar = {'B','A','N','J','A','R','M','A','S','I','N'};
        String kotaString = new String(kotaChar);

        System.out.println(kota);
        System.out.println(kota.toUpperCase());
        System.out.println(kota.toLowerCase());
        System.out.println(kota.substring(6));
        System.out.println(kota.substring(1,6));
        System.out.println(kota.length());
        System.out.println(kota.substring(1,6).length());

    }
}
