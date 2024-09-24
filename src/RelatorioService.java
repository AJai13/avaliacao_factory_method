public class RelatorioService {
    public void gerarRelatorio(String conteudo, RelatorioFactory factory) {
        iRelatorio relatorio = factory.criarRelatorio();
        relatorio.gerarRelatorio(conteudo);
    }
}
