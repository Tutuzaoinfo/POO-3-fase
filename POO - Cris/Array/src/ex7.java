import java.util.ArrayList;

public class ex7 {
    public static void main(String[] args) {
        ArrayList<String> frutas = new ArrayList<>();
        frutas.add("Ma��");
        frutas.add("Uva");
        frutas.add("Banana");
        frutas.add("Pera");
        frutas.add("Kiwi");
        if (frutas.contains("Banana")) {
            System.out.println("A fruta Banana est� na lista!");
        } else {
            System.out.println("A fruta Banana N�O est� na lista.");
        }
    }
}
