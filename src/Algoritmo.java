import com.Carro.entity.Carro;
import java.util.Scanner;
public class Algoritmo {

    static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de carros que deseja cadastrar (máximo de 50):\n");
        int quantCar = 0;
        quantCar = sc.nextInt();
        Carro[] carros = new Carro[quantCar];

        for (int i = 0; i < quantCar; i++) {

            sc.nextLine();
            System.out.println("Modelo " + (i + 1));
            System.out.println("Digete o modelo do carro:");
            String modelo = sc.nextLine();

            System.out.println("Digite o valor do carro em reais:");
            float valor = sc.nextFloat();
            sc.nextLine();

            carros[i] = new Carro (modelo, valor);
        }

        System.out.println("Os dados cadastrados foram:\n");
        for (int i = 0; i < quantCar; i++) {

            carros[i].exibeCarro();

        }
    }
}
