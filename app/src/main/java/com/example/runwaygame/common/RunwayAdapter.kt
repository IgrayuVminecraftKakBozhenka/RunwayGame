package com.example.runwaygame.common

import android.content.res.Resources
import android.graphics.drawable.Drawable
import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.runwaygame.R

class RunwayAdapter(private val parts: ArrayList<Int>): RecyclerView.Adapter<RunwayAdapter.viewHolder>() {

    class viewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var runway: ImageView? = null

        init {
            runway = itemView.findViewById(R.id.runway)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.runway_item, parent, false)
        return viewHolder(itemView)
    }

    override fun onBindViewHolder(holder: viewHolder, position: Int) {
        holder.runway?.setImageResource(parts[position])
    }

    override fun getItemCount() = parts.size
}