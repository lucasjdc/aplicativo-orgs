package br.com.alura.orgs.dao

import br.com.alura.orgs.model.Produto
import java.math.BigDecimal

class ProdutosDao {

    fun adiciona(produto: Produto) {
        produtos.add(produto)
    }

    fun buscaTodos(): List<Produto> {
        return produtos.toList()
    }

    companion object {
        private val produtos = mutableListOf<Produto>(
            Produto(
                nome = "Cesta de frutas",
                descricao = "Laranja, manga e abacaxi",
                valor = BigDecimal("19.83")
            )
        )
    }
}