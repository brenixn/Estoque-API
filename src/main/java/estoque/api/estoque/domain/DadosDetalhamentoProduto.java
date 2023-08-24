package estoque.api.estoque.domain;

public record DadosDetalhamentoProduto(Long id, String nome, String quantidade, Categoria categoria) {

    public DadosDetalhamentoProduto(Produto produto){
        this(produto.getId(), produto.getNome(), produto.getQuantidade(), produto.getCategoria());
    }
}
