package com.example.android1homework61group

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.android1homework61group.databinding.ItemBinding

class ClassAdapter : RecyclerView.Adapter<ClassAdapter.ClassViewHolder>() {

    private var _serListt = listOf<DataAdapter>()

    fun setList(serList: List<DataAdapter> ){
        _serListt = serList
    }

   inner class ClassViewHolder (private val binding: ItemBinding) : ViewHolder(binding.root){
        fun onBind(dataAdapter: DataAdapter){
            binding.ivImageView.setImageResource(dataAdapter.image)
            binding.tvTextView.text = dataAdapter.name
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ClassViewHolder {
        return ClassViewHolder(
            ItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )
    }

    override fun getItemCount(): Int {
        return _serListt.size
    }

    override fun onBindViewHolder(holder: ClassViewHolder, position: Int) {
        holder.onBind(_serListt[position])
    }
}