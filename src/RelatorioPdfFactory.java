public class RelatorioPdfFactory extends RelatorioFactory {
    @Override
    public iRelatorio criarRelatorio() {
        return new RelatorioPdf();
    }
}
