import java.util.ArrayList;

public class ex6 {
    public static void main(String[] args) {
        ArrayList<String> animais = new ArrayList<>();
        animais.add("C�o");
        animais.add("Gato");
        animais.add("Elefante");
        animais.add("Tigre");
        animais.add("Urso");
        animais.add("Le�o");
        System.out.println("Animais com at� 5 letras:");
        for (int i = 0; i < animais.size(); i++) {
            if (animais.get(i).length() <= 5) {
                System.out.println(animais.get(i));
            }
        }
    }
}
