package bagian1.array;

public class LatihanArraySoal2 {
    public static void main(String[] args) {
        String[] hari = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat"};

        System.out.println("Hari dengan huruf lebih dari 5:");

        for (int i = 0; i < hari.length; i++) {
            if (hari[i].length() > 5) {
                System.out.println(hari[i]);
            }
        }
    }
}