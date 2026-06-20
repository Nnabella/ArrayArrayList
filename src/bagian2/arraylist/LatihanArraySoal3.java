package bagian2.arraylist;

import java.util.ArrayList;

public class LatihanArraySoal3 {
    public static void main(String[] args) {
        ArrayList<String> nama = new ArrayList<>();

        nama.add("Andi");
        nama.add("Budi");
        nama.add("Alya");
        nama.add("Citra");
        nama.add("Asep");
        nama.add("Dina");

        System.out.println("Nama yang diawali huruf A:");

        for (int i = 0; i < nama.size(); i++) {
            if (nama.get(i).startsWith("A")) {
                System.out.println(nama.get(i));
            }
        }
    }
}