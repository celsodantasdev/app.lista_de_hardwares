package com.android.listadeprodutosrecyclerview.model

data class Produto(

//aqui está sendo criado o modelo de dados
// agora é necessário um adapter que adaptará os nossos dados ao RecyclerView

    val foto: Int,
    val nome: String,
    val descricao: String,
    val preco: String


)