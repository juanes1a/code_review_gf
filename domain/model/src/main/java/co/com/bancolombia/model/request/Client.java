package co.com.bancolombia.model.request;

public class Client {
    private String document;
    private String tipoDocumento;
    private String nombreUno;
    private String segundoNombre;

    public Client() {
    }

    public Client(String document, String tipoDocumento, String nombreUno, String segundoNombre) {
        this.document = document;
        this.tipoDocumento = tipoDocumento;
        this.nombreUno = nombreUno;
        this.segundoNombre = segundoNombre;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public void setNombreUno(String nombreUno) {
        this.nombreUno = nombreUno;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    public String getDocument() {
        return document;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public String getNombreUno() {
        return nombreUno;
    }

    public String getSegundoNombre() {
        return segundoNombre;
    }
}
