public class ex4 {
    public static void main(String[] args) {
        String[] frutas = {"Ma��", "Uva", "Banana", "Pera", "Kiwi"};
        boolean encontrada = false;

        for (int i = 0; i < frutas.length; i++) {
            if (frutas[i].equals("Banana")) {
                encontrada = true;
                break;
            }
        }
        if (encontrada) {
            System.out.println("A fruta Banana est� na lista!");
        } else {
            System.out.println("A fruta Banana N�O est� na lista.");
        }
    }
}
