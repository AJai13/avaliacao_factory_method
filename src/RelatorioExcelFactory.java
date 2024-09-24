public class RelatorioExcelFactory extends RelatorioFactory {
    @Override
    public iRelatorio criarRelatorio() {
        return new RelatorioExcel();
    }
}
