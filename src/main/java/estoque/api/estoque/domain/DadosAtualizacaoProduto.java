package estoque.api.estoque.domain;

import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoProduto(
        @NotNull
        Long id,
        String nome,
        String quantidade,
        Categoria categoria) {
}
