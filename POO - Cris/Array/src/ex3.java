public class ex3 {
    public static void main(String[] args) {
        String[] animais = {"C�o", "Gato", "Elefante", "Tigre", "Urso", "Le�o"};

        System.out.println("Animais com at� 5 letras:");
        for (int i = 0; i < animais.length; i++) {
            if (animais[i].length() <= 5) {
                System.out.println(animais[i]);
            }
        }
    }
}
