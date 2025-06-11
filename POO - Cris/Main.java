import java.io.IOException;
import java.util.Scanner; 

public class Main {

  public static void main(String[] args) {
  Scanner ler = new Scanner(System.in); 
  String nome, sexo;
  
  System.out.printf("Informe o nome: ");
  nome = ler.nextLine(); 

  System.out.printf("\nInforme o sexo (M/F): ");
  sexo = ler.nextLine(); 
  
  if (sexo.equals("M")) {
      System.out.printf("Nome: " + nome + "  Sexo: Masculino");
        }
  else {
      System.out.printf("Nome: " + nome + "  Sexo: Feminino");
        }
  }

}
