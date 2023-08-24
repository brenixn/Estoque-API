package estoque.api.estoque.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "produtos")
@Entity(name = "Produto")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String quantidade;
    @Enumerated(EnumType.STRING)
    private Categoria categoria;
    private boolean ativo;

    public Produto(DadosProduto dados){
        this.ativo = true;
        this.nome = getNome();
        this.quantidade = getQuantidade();
        this.categoria = getCategoria();
    }

    public void atualizarInformacoes(DadosAtualizacaoProduto dados){
        if(dados.quantidade() != null){
            this.quantidade = dados.quantidade();
        }
    }

    public void excluir(){
        this.ativo = false;
    }
}
