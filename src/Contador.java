import java.util.Scanner;

public class Contador {

    public void contar(int p1, int p2 ) throws ParametrosInvalidosException{
        int result = 0;
        if(p1 >= p2){
            throw new ParametrosInvalidosException("O primeiro valor não pode ser igual ou menor que o segundo!");
        }else {
            result = p2 - p1;
            for (int i = 0; i <= result; i++){
                System.out.println("Imprimindo o número: "+ i);
            }
        }
    }

    public static void main(String[] args) {
        int parametroUm;
        int parametroDois;
        try {
            Contador cont = new Contador();
            Scanner sc = new Scanner(System.in);
            System.out.println("Desafio Controle de Fluxo");
            System.out.print("Digite o Primeiro valor: ");
            parametroUm = sc.nextInt();
            System.out.print("Digite o segundo valor: ");
            parametroDois = sc.nextInt();
            cont.contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e){
            System.out.println("Valor inválido: " + e.getMessage());

        }



    }


}