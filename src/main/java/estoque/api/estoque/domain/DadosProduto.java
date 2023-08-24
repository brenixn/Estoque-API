package estoque.api.estoque.domain;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DadosProduto(
        @NotBlank(message = "Nome do produto é obrigatório!")
        String nome,
        @NotBlank(message = "Quantidade é obrigatória!")
        String quantidade,
        @NotNull(message = "Categoria do produto é obrigatória!")
        Categoria categoria) {
}
