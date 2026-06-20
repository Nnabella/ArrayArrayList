package bagian2.arraylist;

import java.util.ArrayList;

public class LatihanArraySoal1 {
    public static void main(String[] args) {
        ArrayList<String> belanja = new ArrayList<>();

        belanja.add("Beras");
        belanja.add("Gula");
        belanja.add("Minyak");
        belanja.add("Telur");

        belanja.remove(1);

        System.out.println("Daftar belanja:");
        for (int i = 0; i < belanja.size(); i++) {
            System.out.println(belanja.get(i));
        }

        System.out.println("Jumlah item: " + belanja.size());
    }
}