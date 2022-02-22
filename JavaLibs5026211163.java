package com.company;

import javax.swing.*;

public class JavaLibs5026211163 {
    public static void main(String[] args) {

        // MEMBELI ALAT TULIS
        String Name;
        Name = JOptionPane.showInputDialog(null, "Welcome, what can I call you?");

        int Pen = 3000;
        int Pencil = 2000;
        int Book = 3000;
        int Total = Pen + Pencil + Book;

        String Buying1 = JOptionPane.showInputDialog(null, " What item will you buy?");
                String Buying2 = JOptionPane.showInputDialog(null, " In addition pen, what will you buy?");
                        String Buying3 = JOptionPane.showInputDialog(null, " In addition pen and pencil, what will you buy ?");
                                JOptionPane.showMessageDialog(null, " Price " + Buying1 + " = " + Pen + " dan Price " + Buying2 + " = " + Pencil + " dan Price " + Buying3 + " = " + Book + ".");
        JOptionPane.showMessageDialog(null, "Total price " + " = " + Total);

        int TotalHarga = Integer.parseInt(JOptionPane.showInputDialog("So the total price is = ", "8000"));


        // TOTAL IPS
        String Belajar;
        JOptionPane.showMessageDialog(null, "Hitunglah Nilai IPS 3 Semester Pertama Anda!");

        double IPSS1 = 3.2;
        double IPSS2 = 3.5;
        double IPSS3 = 3.3;
        double TotalSemua = IPSS1 + IPSS2 + IPSS3;

        JOptionPane.showInputDialog(null, "Berapa hasil dari 2.0 + 1.2 ?");
        JOptionPane.showInputDialog(null, "Berapa hasil dari 3.7 - 0.2 ?");
        JOptionPane.showInputDialog(null, "Berapa hasil dari 3 * 1.1 ?");
        JOptionPane.showMessageDialog(null, "Berapa jumlah hasil dari semua jawaban?");
        JOptionPane.showMessageDialog(null, "Jawabannya adalah " + TotalSemua + ".");

        double SemuaJawaban = Double.parseDouble(JOptionPane.showInputDialog("Total IPS dari 3 semester pertama adalah...", "10.0"));

        // KESIMPULAN
        JOptionPane.showMessageDialog(null, Name + " membeli " + Buying1 + " , " + Buying2 + " , dan  " + Buying3 + " dengan total harga sebesar " + Total + "\n" + "dan total IPS selama 3 semester pertama , yaitu 3.2 + 3.5 + 3.3 adalah " + TotalSemua + ".");

        // CONGRATULATION
        JOptionPane.showMessageDialog(null, "You Did It :)");
    }
}