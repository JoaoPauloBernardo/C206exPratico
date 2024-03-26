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

    float calcularTotalCompra(float compra) {
        this.vcompra += compra;
        return vcompra;
    }

}
