package test;

public class Main {

    public static void main(String[] args) {

        /*
        MAMY TAKIE OBIEKTY I CHCEMY JE PORÓWNAĆ:
        String a = "test";
        String b = "test";
        String c = new String("test");
        String d = new String("test");
        */

        System.out.println("_____________");
        String a = "test";
        System.out.println("Dla A:");
        System.out.println(Integer.toHexString(System.identityHashCode(a)) + " - Chyba referencja na podstawie kodu nalezionego w necie.");
        System.out.println(Integer.toHexString(a.hashCode()) + " - Referencja na podstawie kodu z zajęć.");
        System.out.println("------");
        System.out.println("Dla B:");
        String b = "test";
        System.out.println(Integer.toHexString(System.identityHashCode(b)) + " - Chyba referencja na podstawie kodu nalezionego w necie.");
        System.out.println(Integer.toHexString(b.hashCode()) + " - Referencja na podstawie kodu z zajęć.");
        System.out.println("------");
        System.out.println("Dla C:");
        String c = new String("test");
        System.out.println(Integer.toHexString(System.identityHashCode(c)) + " - Chyba referencja na podstawie kodu nalezionego w necie.");
        System.out.println(Integer.toHexString(c.hashCode()) + " - Referencja na podstawie kodu z zajęć.");
        System.out.println("------");
        System.out.println("Dla D:");
        String d = new String("test");
        System.out.println(Integer.toHexString(System.identityHashCode(d)) + " - Chyba referencja na podstawie kodu nalezionego w necie.");
        System.out.println(Integer.toHexString(d.hashCode()) + " - Referencja na podstawie kodu z zajęć.");
        System.out.println("_____________");
        System.out.println("Wyniki porównań: ");
        System.out.println(" a == b");
        System.out.println(a == b);
        System.out.println(" a == c");
        System.out.println(a == c);
        System.out.println(" a == d");
        System.out.println(a == d);
        System.out.println(" c == d");
        System.out.println(c == d);
        System.out.println(" c.equals(d)");
        System.out.println(c.equals(d));
        //System.out.println("Objects.equals(a, b) " + Objects.equals(a, b));
    }
}
