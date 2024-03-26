public class Computador {
    protected String marca;
    protected Float preco;
    SistemaOperacional Sis;
    MemoriaUSB memoriaUSB;
    HardwareBasico [] Hard = new HardwareBasico[10];

    public Computador(String marca, float preco, String nomeSis, int tipoSis) {
        this.marca = marca;
        this.preco = preco;
        this.Sis = new SistemaOperacional(nomeSis, tipoSis);
    }

    void mostraPCConfigs() {
        //primeiro exibe o que e mais facil de "achar"
        //apos isso ele percorre a array pra printar o sistema e a memoria
        System.out.println("Marca: " + this.marca);
        System.out.println("Preco: " + this.preco + " R$");
        System.out.println("Hardware: ");


        for (int i = 0; i < Hard.length; i++) {
            System.out.println(Hard[i].nome);
            System.out.println(Hard[i].capacidade);
        }
        System.out.println("Sistema operacional: " + Sis.nome + " " + Sis.tipo + " bits");
        System.out.println("Possui " + memoriaUSB.nome + " " + memoriaUSB.capacidade + " Gigabytes de memória");
    }


    void addMemoriaUSB(MemoriaUSB musb) {
        this.memoriaUSB = musb;
    }

    void addHardware(HardwareBasico newHard) {
        for (int i = 0; i < Hard.length; i++) {
            if (Hard[i] == null) {
                Hard[i] = newHard;
                break;
            }
        }

    }
}
