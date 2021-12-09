package katy.kb.exam_kosti

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class DeveloperAdapter(private val developersNames: List<String>) :
    RecyclerView.Adapter<DeveloperViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DeveloperViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.developer_list_item, parent, false)
        return DeveloperViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: DeveloperViewHolder, position: Int) {
        val name = developersNames[position]
        holder.bind(name)
    }

    override fun getItemCount(): Int {
        return developersNames.size
    }
}