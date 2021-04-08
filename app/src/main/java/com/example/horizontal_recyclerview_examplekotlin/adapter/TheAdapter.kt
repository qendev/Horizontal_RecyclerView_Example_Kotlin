package com.example.horizontal_recyclerview_examplekotlin.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.horizontal_recyclerview_examplekotlin.R
import com.squareup.picasso.Picasso

class TheAdapter(val list:ArrayList<String>):RecyclerView.Adapter<TheAdapter.TheView>() {

    //create the ViewHolderClass
    class TheView(view: View):RecyclerView.ViewHolder(view) {
        //decalre the views in the itemlayout
        var imageView:ImageView
        var textView:TextView

        //reffer to the views by their ids
        init {
            imageView = view.findViewById(R.id.image)

            textView = view.findViewById(R.id.textView)
        }


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TheView {
        val itemView:View = LayoutInflater.from(parent.context).inflate(R.layout.mylist_item,parent,false)
        return TheView(itemView)
    }

    override fun onBindViewHolder(holder: TheView, position: Int) {
        val listData =list[position]
        //load image into the imageview
        Picasso.get().load(listData).placeholder(R.mipmap.ic_launcher).into(holder.imageView)
    }

    override fun getItemCount(): Int {
        return list.size
    }
}