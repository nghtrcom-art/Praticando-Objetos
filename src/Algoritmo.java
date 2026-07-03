import com.Carro.entity.Carro;
import java.util.Scanner;
public class Algoritmo {

    static void main(String[] args){

        //Inicialização do scanner.
        Scanner sc = new Scanner(System.in);


        //Instruções ao usuário, inicialização de variáveis que serão utilizadas e criação do vetor de objetos.
        System.out.println("Digite a quantidade de carros que deseja cadastrar (máximo de 50):\n");
        int quantCar = 0;
        quantCar = sc.nextInt();
        Carro[] carros = new Carro[quantCar];

        //Variável contadora "soma" e laço de repetição para leitura dos dados fornecidos pelo usuário.
        int soma = quantCar;
        for (int i = 0; i < quantCar; i++) {

            sc.nextLine();
            System.out.println("Modelo " + (i + 1));
            System.out.println("Digite o modelo do carro:");
            String modelo = sc.nextLine();

            System.out.println("Digite o valor do carro em reais:");
            float valor = sc.nextFloat();
            sc.nextLine();

            //A cada nova iteração é criado um novo objeto do tipo Carro.
            carros[i] = new Carro (modelo, valor);
        }

        //Exibição das informações cadastradas.
        System.out.println("Os dados cadastrados foram:");
        System.out.println("Quantidade de carros cadastrados: " + quantCar);
        for (int i = 0; i < quantCar; i++) {

            carros[i].exibeCarro();

        }
        System.out.println("A soma dos valores dos carros em Reais é: " + String.format("%.3f", Carro.valorTotal));
    }
}
