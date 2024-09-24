public class Main {
    public static void main(String[] args) {

        RelatorioService service = new RelatorioService();

        // Relatório em PDF
        service.gerarRelatorio("Relatório em PDF", new RelatorioPdfFactory());

        // Relatório em CSV
        service.gerarRelatorio("Relatório em CSV", new RelatorioCsvFactory());

       // Relatório em Excel
        service.gerarRelatorio("Relatório em Excel", new RelatorioExcelFactory());
    }
}