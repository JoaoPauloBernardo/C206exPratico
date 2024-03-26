
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


        Cliente cliente = new Cliente("João", 350);

        //primeiro adicionar previamente todos os dados dos pcs que estao em promoção
        Computador PC1 = new Computador ("Positivo", 3300, "Linux Ubuntu", 32);
        HardwareBasico HardPC1Processador = new HardwareBasico("Pentium Core i3", 2200);
        HardwareBasico HardPC1Memoria = new HardwareBasico("Memoria RAM", 8);
        HardwareBasico HardPC1HD = new HardwareBasico("HD", 500);
        //agora basta adicionar as configs do pc 1 e fazer isso para todos os outros
        PC1.addHardware(HardPC1Processador);
        PC1.addHardware(HardPC1Memoria);
        PC1.addHardware(HardPC1HD);


        Computador PC2 = new Computador ("Acer", 8800, "Windows 8", 64);
        HardwareBasico HardPC2Processador = new HardwareBasico("Pentium Core i5", 3370);
        HardwareBasico HardPC2Memoria = new HardwareBasico("Memoria RAM", 16);
        HardwareBasico HardPC2HD = new HardwareBasico("HD", 1000);
        //mesma coisa com o pc 2
        PC1.addHardware(HardPC2Processador);
        PC1.addHardware(HardPC2Memoria);
        PC1.addHardware(HardPC2HD);

        Computador PC3 = new Computador ("Vaio", 4800, "Windows 10", 64);
        HardwareBasico HardPC3Processador = new HardwareBasico("Pentium Core i7", 4500);
        HardwareBasico HardPC3Memoria = new HardwareBasico("Memoria RAM", 32);
        HardwareBasico HardPC3HD = new HardwareBasico("HD", 2000);
        //e com o pc 3
        PC1.addHardware(HardPC3Processador);
        PC1.addHardware(HardPC3Memoria);
        PC1.addHardware(HardPC3HD);

        MemoriaUSB MemoriaPC1 = new MemoriaUSB("Pen-drive", 16);
        MemoriaUSB MemoriaPC2 = new MemoriaUSB("Pen-drive", 32);
        MemoriaUSB MemoriaPC3 = new MemoriaUSB("HD", 1000);
        PC1.addMemoriaUSB(MemoriaPC1);
        PC2.addMemoriaUSB(MemoriaPC2);
        PC3.addMemoriaUSB(MemoriaPC3);
        //o menu deve ser mostrado antes de qualquer interação com o usuário, por isso ele se posiciona aqui no codigo logo depois de tudo ser devidamente declarado

        System.out.println("Bem vindo a nossa loja! Qual PC você deseja comprar? Caso a resposta seja nenhum, tecle 0");
        System.out.println("Promoção 1:");
        PC1.mostraPCConfigs();
        System.out.println("Promoção 2:");
        PC2.mostraPCConfigs();
        System.out.println("Promoção 3:");
        PC3.mostraPCConfigs();

        //agora a entrada de dados
        Scanner scanner = new Scanner(System.in);
        int compra = 0;

        do {
            compra = scanner.nextInt();
            switch (compra) {
                case 1:
                    cliente.adicionaPC(PC1);
                    cliente.calcularTotalCompra(PC1.preco);
                    break;
                case 2:
                    cliente.adicionaPC(PC2);
                    cliente.calcularTotalCompra(PC2.preco);
                    break;
                case 3:
                    cliente.adicionaPC(PC3);
                    cliente.calcularTotalCompra(PC3.preco);
                    break;
                case 0:
                    System.out.println("Obrigado pela preferência!");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        } while (compra != 0);

        //por fim, como pedido no exercicio, devo mostrar o nome, cpf, os PCs e o total de compra
        System.out.println("Nome do cliente: " + cliente.nome);
        System.out.println("CPF do cliente: " + cliente.cpf);
        System.out.println("PCs comprados: ");
        cliente.mostraPCConfig();
        System.out.println("Preço total da compra" + cliente.vcompra);
        System.out.println("Obrigado pela preferência, volte sempre!");


    }
}