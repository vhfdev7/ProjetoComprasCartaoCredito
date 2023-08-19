import java.util.Collections;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o limite do Cartão de Crédito:");
        double limite = leitura.nextDouble();
        CartaoCredito cartao = new CartaoCredito(limite);

        int opcao = 1;
        while (opcao != 0)
        {
            System.out.println("Digite a descrição da compra:");
            String descricao = leitura.next();
            System.out.println("Digite o valor da compra:");
            double valor = leitura.nextDouble();

            Compra compras = new Compra(descricao, valor);
            boolean compraRealizada = cartao.lancaCompra(compras);

            if (compraRealizada){
                System.out.println("Compra Realizada!");
                System.out.println("Digite 1 para continuar ou 0 para sair.");
                opcao = leitura.nextInt();
            } else {
                System.out.println("Saldo insuficiente!");
                opcao = 0;
            }}
        if (opcao == 0){
            System.out.println("----------------------\n");
            System.out.println("Obrigado por utilizar nossos serviços, volte sempre!\n");
        }

        System.out.println("-----------------------");
        System.out.println("LISTA DE COMPRAS\n");
        Collections.sort(cartao.getCompras());

        for (Compra comp : cartao.getCompras()){
            System.out.println(comp.getDescricao() + " - " + comp.getValor());
        }

        System.out.println("-----------------------");

        System.out.println("Seu saldo de limite atualizado é de R$ " + cartao.getSaldo());

        System.out.println("-----------------------");

    }}