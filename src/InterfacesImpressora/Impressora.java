package InterfacesImpressora;

public abstract class Impressora {
    public static Imprimivel[] lista = new Imprimivel[10];

    public static void imprimirTudo() {
        for (int i = 0; i < lista.length; i++) {
            if(lista[i] == null){
               break;
            } else {
                lista[i].imprimir();
            }
        }
    }

    public static void adicionarImprimivel(Imprimivel umImprimivel) {
           for(int i = 0; i < lista.length; i++)
               if (lista[i] == null) {
                   lista[i] = umImprimivel;
                   break;
               }
    }
}

//    public static void imprimirTudo() {
//        for (int i = 0; i <= lista.length; i++) {
//            if (lista[i] == null) {
//                break;
//            } else {
//                lista[i].imprimir();
//            }
//        }









