import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        System.out.println();
        int strukturBaris = 1235;
        System.out.println("Struktur baris: " + strukturBaris);

        String kataBaru = "Riki Wahyudi";
        System.out.println("Kata baru: " + kataBaru);

        int empatAngka[] = {07, 10, 20, 23};
        for (int i = 0; i < empatAngka.length; i++) {
            System.out.print(empatAngka[i] + "\t");
        }

        System.out.println();
        String angka[][] = {
                {"1", "3", "5"},
                {"14", "19", "20"},
                {"22", "27", "29"}
        };

        for (int i = 0; i <= angka.length - 1; i++){
            for (int j = 0; j < angka[i].length; j++){
                System.out.print(angka[i][j] + "\t");
            }
            System.out.println();
        }

        LinkedList<Integer> listAngka = new LinkedList<>();
        listAngka.add(22);
        listAngka.add(19);
        listAngka.add(44);
        listAngka.add(60);
        listAngka.add(72);

        for (int i = 0; i < listAngka.size(); i++){
            System.out.print(listAngka.get(i) + "\t");
        }

        System.out.println();
    }
}