public class RelatorioCsv implements iRelatorio {
    @Override
    public void gerarRelatorio(String conteudo) {
        definirEstrutura();
        formatarConteudo(conteudo);
        System.out.println("Relatório CSV gerado com sucesso.");
    }

    @Override
    public void definirEstrutura() {
        System.out.println("Definindo estrutura de CSV: Colunas e Linhas.");
    }

    @Override
    public void formatarConteudo(String conteudo) {
        System.out.println("Formatando o conteúdo para CSV (delimitado por vírgulas): " + conteudo);
    }
}
