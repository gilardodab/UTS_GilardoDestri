package com.gilardo.utsgilardo.adapter_203310033

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.gilardo.utsgilardo.R
import com.gilardo.utsgilardo.model_203310033.Berita

//untuk menampilkan string Berita di RecyclerView
class ItemAdapter(
    private val context: Context,
    private val dataset: List<Berita>
): RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {
    //Mengupdate ItemAdapter untuk menyetel gambar
    class ItemViewHolder(private val view: View): RecyclerView.ViewHolder(view) {
        val textView: TextView = view.findViewById(R.id.item_title)
        val imageView: ImageView = view.findViewById(R.id.item_image)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        // Buat baru view
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_card, parent, false)
        return ItemViewHolder(adapterLayout)
    }
    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]
        holder.textView.text = context.resources.getString(item.stringResourceId)
        holder.imageView.setImageResource(item.imageResourceId)
    }
    override fun getItemCount() = dataset.size
}