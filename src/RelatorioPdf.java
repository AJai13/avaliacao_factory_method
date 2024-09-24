public class RelatorioPdf implements iRelatorio {
    @Override
    public void gerarRelatorio(String conteudo) {
        definirEstrutura();
        formatarConteudo(conteudo);
        System.out.println("Relatório em PDF gerado com sucesso.");
    }

    @Override
    public void definirEstrutura() {
        System.out.println("Definindo estrutura de PDF: Título, Subtítulo, Corpo, Rodapé.");
    }

    @Override
    public void formatarConteudo(String conteudo) {
        System.out.println("Formatando o conteúdo para PDF: " + conteudo);
    }
}
