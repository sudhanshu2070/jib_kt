package com.example.myapplicationmodule

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ModuleAdapter(private val moduleList: List<Module>) : RecyclerView.Adapter<ModuleAdapter.ModuleViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ModuleViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_module, parent, false)
        return ModuleViewHolder(view)
    }

    override fun onBindViewHolder(holder: ModuleViewHolder, position: Int) {
        val module = moduleList[position]
        holder.moduleName.text = module.name
        holder.moduleIcon.setImageResource(module.iconResId)
    }

    override fun getItemCount(): Int = moduleList.size

    class ModuleViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val moduleName: TextView = view.findViewById(R.id.moduleName)
        val moduleIcon: ImageView = view.findViewById(R.id.moduleIcon)
    }
}