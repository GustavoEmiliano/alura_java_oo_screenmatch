/*
 * Exercício 3:
 * Desenvolva uma classe Produto com os atributos privados nome e preco.
 * Utilize métodos getters e setters para acessar e modificar esses atributos.
 * Adicione um método aplicarDesconto que recebe um valor percentual e reduz o
 * preço do produto.
 */

package desafios.desafio_02;

public class Produto {
    private String nome;
    private double preco;

    public void aplicarDesconto(double percentual){
        preco -= preco * (percentual / 100);
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
