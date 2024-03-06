package org.example;
import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ArrayList<String> daftarnama = new ArrayList<>();

        daftarnama.add("Ahmad");
        daftarnama.add("Naufal");
        daftarnama.add("Luthfan");
        daftarnama.add("Marzuqi");

        System.out.println("Daftar nama : ");
        for (String nama : daftarnama) {
            System.out.println(nama);
        }
        System.out.println("Elemen pada index ke dua : " +daftarnama.get(2));
        daftarnama.set(1, "Gumi");

        System.out.println("Daftar nama setelah perubahan : ");
        for (String nama : daftarnama){
            System.out.println(nama);
        }

        daftarnama.remove(0);

        System.out.println("Daftar nama setelah penghapusan :");
        for (String nama : daftarnama){
            System.out.println(nama);
        }

        System.out.println("Jumlah elemen pada array list : " +daftarnama.size());
        System.out.println("Apakah Arraylist kosong? : " +daftarnama.isEmpty());

    }
}