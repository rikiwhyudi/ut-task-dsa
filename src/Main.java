import data.StructureData;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        StructureData sd = new StructureData(123,"Riki Wahyudi");
        System.out.println("\nStrukBaris: " + sd.getStrukurBaris());
        System.out.println();
        System.out.println("KataBaru:" + sd.getKataBaru());

        int empatAngka[] = {
                07, 10, 20, 23
        };

        for (int angka : empatAngka) {
            System.out.print(angka);
            System.out.print(", ");
        }

        System.out.println();
        String angka[][] = {
                {"1", "3", "5"},
                {"14", "19", "20"},
                {"22", "27", "29"}
        };

        System.out.println();
        for (int i = 0; i < angka.length; i++) {
            for (int j = 0; j < angka[i].length; j++) {
                System.out.print(angka[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println();
        LinkedList<Integer> listAngka = new LinkedList<>();
        listAngka.add(22);
        listAngka.add(19);
        listAngka.add(44);
        listAngka.add(60);
        listAngka.add(72);

        for (int angkaList : listAngka) {
            System.out.print(angkaList);
            System.out.print(", ");
        }

    }

}
