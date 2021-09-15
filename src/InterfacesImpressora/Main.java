package InterfacesImpressora;

public class Main {
    public static void main(String[] args) {

    Contrato contrato = new Contrato ();
    contrato.setNome("Contrato");
    contrato.setTipo(".pdf");

    Foto foto = new Foto();
    foto.setNome("Fotografia");
    foto.setTipo(".png");

    Documento documento = new Documento();
    documento.setNome("Documento");
    documento.setTipo(".docx");

    Impressora.adicionarImprimivel(contrato);
    Impressora.adicionarImprimivel(foto);
    Impressora.adicionarImprimivel(documento);

    Impressora.imprimirTudo();

    }

}
