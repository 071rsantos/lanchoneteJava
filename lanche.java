import java.util.Scanner;

public class lanche{
    public static void main(String[] args) {
        
        double coxinha = 2.5;
        double empDoce = 1;
        double burguer = 5.5;
        double soma = 0;
        int opcao;
        Scanner sc = new Scanner(System.in);

        System.out.println("TABELA DE PREÇOS");
        System.out.println("COD / PRODUTO / PRECO");
        System.out.println("1 COXINHA R$2,50");
        System.out.println("2 EMPADA DOCE R$1,00");
        System.out.println("3 HAMBURGUER R$5,50");

        do {
            
        System.out.println("Digite o COD do produto desejado: (digite 4 para encerrar)");
        opcao = sc.nextInt();

        
            
        switch (opcao) {
            case 1:
                System.out.println("Produto selecionado: \n 1 Coxinha R$ 2,50");
                soma = soma + coxinha;
                break;

            case 2:
                System.out.println("Produto selecionado: \n 2 Empada Doce R$ 1,00");
                soma = soma + empDoce;
                break;

            case 3:
                System.out.println("Produto selecionado: \n 3 Hamburguer R$ 5,50");
                soma = soma + burguer;
                break;

            case 4:
                System.out.println("Valor total: R$  "+soma);
                break;
        
            default:
                System.out.println("Opcao invalida!!!");
                break;
        }

        } while (opcao != 4);
    }
}