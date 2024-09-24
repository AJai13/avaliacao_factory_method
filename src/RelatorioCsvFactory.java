public class RelatorioCsvFactory extends RelatorioFactory {
    @Override
    public iRelatorio criarRelatorio() {
        return new RelatorioCsv();
    }
}
