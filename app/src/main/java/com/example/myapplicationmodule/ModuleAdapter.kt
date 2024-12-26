package com.example.myapplicationmodule

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
//import com.example.

class ModuleAdapter(private val moduleList: List<String>) : RecyclerView.Adapter<ModuleAdapter.ModuleViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ModuleViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_module, parent, false)
        return ModuleViewHolder(view)
    }

    override fun onBindViewHolder(holder: ModuleViewHolder, position: Int) {
        holder.moduleName.text = moduleList[position]
    }

    override fun getItemCount(): Int = moduleList.size

    class ModuleViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val moduleName: TextView = itemView.findViewById(R.id.moduleName)
    }
}