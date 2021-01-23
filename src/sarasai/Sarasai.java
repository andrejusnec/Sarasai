package sarasai;

public class Sarasai {

    public static void main(String[] args) {
        MyList listas = new MyList();
        listas.add("Labas");
        listas.add("Pasauli");
        listas.add("!");
        listas.printAll();
        listas.insert(2, "BANDAU");
        listas.printAll();

        System.out.println("Masyvo ilgis: " + listas.size()); // 3

        listas.remove(0);
        listas.printAll();// [ Pasauli, !]

        System.out.println(listas.get(1)); // Pasauli
        System.out.println(listas.get(0)); // !
        /**
         * ************************************
         */
        listas.set(1, "Aliau");
        listas.printAll(); // [Vel Labas, Aliau, !] 

    }

}
