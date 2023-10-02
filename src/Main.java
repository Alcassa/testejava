    import java.util.Random;
import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
        Random random = new Random();


        int randomNumber = random.nextInt(100);
        int numero;


        do
        {
            Scanner input = new Scanner(System.in);

            System.out.println("Digite o valor: ");
            numero = input.nextInt();


            if(numero < randomNumber){
                System.out.println("O numero informado e maior!");
            } else if (numero > randomNumber)
            {
                System.out.println("O numero informado e menor!");
            }
        } while(randomNumber != numero);

        System.out.println("Vc acertou !");
    }
}