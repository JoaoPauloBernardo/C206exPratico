public class Cliente{
    public String nome;
    public long cpf;
    public float vcompra = 0;
    Computador[] PC = new Computador[5]; //pouco mais do que o limite pq pode comprar 2 pcs iguais
    int aux =0;  //controle

    public Cliente(String nome, long cpf){
        this.nome = nome;
        this.cpf = cpf;
    }

    void adicionaPC(Computador NovoPC){
        for (int i = 0; i < PC.length; i++) {
            if(PC[i] == null){
                PC[i] = NovoPC;
                aux++;
                break;
            }
        }
    }
    void mostraPCConfig(){
        for (int i = 0; i < PC.length; i++) {
            if(PC[i] != null){
                System.out.println("Marca: " + PC[i].marca);
                System.out.println("Preço: " + PC[i].preco);
                System.out.println("Configurações:");
                for(int j = 0; j < 3; j++){
                    System.out.println(PC[i].Hard[j].nome + " " + PC[i].Hard[j].capacidade);
                }

            }
        }
    }

    float calcularTotalCompra(float compra) {
        this.vcompra += compra;
        return vcompra;
    }

}
