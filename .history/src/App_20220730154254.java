import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        // Entradas
        Scanner entradaOrigem = new Scanner(System.in);
        System.out.println("Informe o DDD de Origem");
        Scanner entradaDestino = new Scanner(System.in);
        System.out.println("Informe o DDD de Destino");
        Scanner entradaDuracao = new Scanner(System.in);
        System.out.println("Informe a duracao");
        Scanner entradaPlano = new Scanner(System.in);
        System.out.println("Informe o plano");
        
        // Obtendo valor da tarifa
        int origem = entradaOrigem.nextInt();
        int destino = entradaDestino.nextInt();
        int duracao = entradaDuracao.nextInt();
        int plano = entradaPlano.nextInt();

        float tarifa = (float) 0.0;

        switch (origem) {
            case 11:
              switch (destino) {
                case 16: tarifa = (float) 1.9;
                System.out.println("Valor Total = " + duracao * tarifa);
                break;
                case 17: tarifa = (float) 1.8;
                System.out.println("Valor Total = " + duracao * tarifa);
                break;
                case 18: tarifa = (float) 0.9;
                System.out.println("Valor Total = " + duracao * tarifa);
                break;
              }
            case 16:
              switch (destino) {
                case 11: tarifa = (float) 2.9;
                System.out.println("Valor Total = " + duracao * tarifa);
                break;
              }
              case 17:
              switch (destino) {
                case 11: tarifa = (float) 2.7;
                System.out.println("Valor Total = " + duracao * tarifa);
                break;
              }
            case 18:
              switch (destino) {
                case 11: tarifa = (float) 1.9;
                System.out.println("Valor Total = " + duracao * tarifa);
                break;
              }
            break;
        }

        System.out.println(tarifa);

        if (duracao <= plano){
          System.out.println("Com o Plano Fale Mais " +plano + "você não paga nada por essa ligação");
        }

    }
}