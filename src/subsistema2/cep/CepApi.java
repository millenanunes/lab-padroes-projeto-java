package subsistema2.cep;

public final class CepApi {

    private static final CepApi instancia = new CepApi();

    private CepApi() { }

    public static CepApi getInstancia() {
        return instancia;
    }

    public String recuperarCidade(String cep) {
        return "Araraquara";
    }

    public String recuperarEstado(String cep) {
        return "SP";
    }
}