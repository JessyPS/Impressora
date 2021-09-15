package InterfacesImpressora;

public abstract class Impressora{

    public static Imprimivel [] lista = new Imprimivel[3];
    private static int imp = -1;

    public static void imprimirTudo(){
        for(int i = 0; i<= imp; i++){
            lista[i].imprimir();
            System.out.println("");
        }
    }

    public static void adicionarImprimivel(Imprimivel umImprimivel){
        imp++;
        lista[imp] = umImprimivel;
    }

}



