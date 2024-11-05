package br.com.alura.orgs.dao

import br.com.alura.orgs.model.Produto

class ProdutosDao {

    fun adiciona(produto: Produto) {
        produtos.add(produto)
    }

    fun buscaTodos() : List<Produto> {
        return produtos.toList()
    }

    companion object {
        // Data Access Object - DAO
        private val produtos = mutableListOf<Produto>()
    }
}