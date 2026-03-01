import subsistema1.crm.CrmService;
import subsistema2.cep.CepApi;

public void migrarCliente(String nome, String cep) {
    CepApi cepApi = CepApi.getInstancia();

    String cidade = cepApi.recuperarCidade(cep);
    String estado = cepApi.recuperarEstado(cep);

    CrmService.gravarCliente(nome, cep, cidade, estado);
}

void main() {
}