package estoque.api.estoque.domain;

public record DadosListagemProduto(Long id, String nome, String quantidade, Categoria categoria) {

    public DadosListagemProduto(Produto produto){
        this(produto.getId(), produto.getNome(), produto.getQuantidade(), produto.getCategoria());
    }
}
