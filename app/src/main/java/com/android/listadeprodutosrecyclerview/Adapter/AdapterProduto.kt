package com.android.listadeprodutosrecyclerview.Adapter

import android.content.Context
import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.android.listadeprodutosrecyclerview.R
import com.android.listadeprodutosrecyclerview.model.Produto


// agora é necessário um adapter que adaptará os nossos dados ao RecyclerView
//o adapter herda as características de um RecyclerView. Exemplo: AdapterProduto: RecyclerView
//depois é necessário passar o .adapter
//o adapter espera um view holder, que nada mais é do que os nossos itens de lista
//é feito a criação na mesma linha entre as tags. Exemplo: ProdutoViewHolder


class AdapterProduto(private val context: Context, private val produtos: MutableList<Produto>) : RecyclerView.Adapter<AdapterProduto.ProdutoViewHolder>() {
//ProdutoViewHolder
    //é necessário criar uma classe pro viewHolder que acabamos de criar
    //depois essa classe irá herdas as características do RecyclerView
    //depois é feito RecyclerView.ViewHolder, pois ViewHolder cria a visualização pra gente


    //métodos responsável por CRIAR a visualização do item
    //Aqui iremos definir as variáveis utilizando de Inflater para inflarmos o nosso layout
 override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProdutoViewHolder {

        //nesse momento o nosso inflate está inflando o hardware_item, que é nosso XLM com os itens
        val itemLista = LayoutInflater.from(context).inflate(R.layout.hardware_item, parent, false)

        //produtoViewHolder agora recebe os nossos itens de lista pra visualização
        val holder = ProdutoViewHolder(itemLista)

        return holder


    }

    //método responsável por EXIBIR a visualização ao usuário
    override fun onBindViewHolder(holder: ProdutoViewHolder, position: Int) {
        holder.foto.setImageResource(produtos[position].foto)
        holder.nome.text = produtos[position].nome
        holder.descricao.text = produtos[position].descricao
        holder.preco.text = produtos[position].preco

    }

    //aqui é onde passamos qual o tamanho da lista
    override fun getItemCount(): Int = produtos.size

    class ProdutoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val foto = itemView.findViewById<ImageView>(R.id.fotoProduto)
        val nome = itemView.findViewById<TextView>(R.id.nomeProduto)
        val descricao = itemView.findViewById<TextView>(R.id.descricaoProduto)
        val preco = itemView.findViewById<TextView>(R.id.precoProduto)


    }


    }




