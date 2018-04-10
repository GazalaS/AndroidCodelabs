package se.kth.sda3.displayimages

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import com.squareup.picasso.Picasso
import java.io.File

class MyAdapter(private val imageData: ArrayList<String>): RecyclerView.Adapter<MyAdapter.ViewHolder>() {

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        Picasso.get()
                .load( File(imageData[position]))
                .into(holder?.imageView)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent?.context).inflate(R.layout.image_list, parent, false)
        return ViewHolder(v);
    }

    override fun getItemCount(): Int {
        return imageData.size
    }

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val imageView = itemView.findViewById<ImageView>(R.id.imageView)!!

    }
}
