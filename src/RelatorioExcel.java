public class RelatorioExcel implements iRelatorio {
    @Override
    public void gerarRelatorio(String conteudo) {
        definirEstrutura();
        formatarConteudo(conteudo);
        System.out.println("Relatório Excel gerado com sucesso.");
    }

    @Override
    public void definirEstrutura() {
        System.out.println("Definindo estrutura de Excel: Planilhas, Células, Tabelas.");
    }

    @Override
    public void formatarConteudo(String conteudo) {
        System.out.println("Formatando o conteúdo para Excel: " + conteudo);
    }
}
