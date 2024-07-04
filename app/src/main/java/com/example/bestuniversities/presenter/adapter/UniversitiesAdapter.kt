package com.example.bestuniversities.presenter.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.bestuniversities.data.ItemData
import com.example.bestuniversities.databinding.ItemUniversitiesBinding

class UniversitiesAdapter :
    ListAdapter<ItemData, UniversitiesAdapter.UniversViewHolder>(UniversDiffUtil) {

    private var time  = System.currentTimeMillis()
    private var onClickItem: ((ItemData) -> Unit)? = null

    object UniversDiffUtil : DiffUtil.ItemCallback<ItemData>() {
        override fun areItemsTheSame(oldItem: ItemData, newItem: ItemData): Boolean =
            oldItem.nameUnivers == newItem.nameUnivers


        override fun areContentsTheSame(oldItem: ItemData, newItem: ItemData): Boolean =
            oldItem == newItem
    }

    inner class UniversViewHolder(private val binding: ItemUniversitiesBinding) :
        RecyclerView.ViewHolder(binding.root) {

        init {
            binding.itemLs.setOnClickListener {
                if(System.currentTimeMillis() - time >= 500) {
                    time = System.currentTimeMillis()
                    onClickItem?.invoke(getItem(adapterPosition))
                }
            }
        }

        fun bind() {
            binding.apply {
                image.setImageResource(getItem(adapterPosition).photo)
                name.text = getItem(adapterPosition).nameUnivers
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UniversViewHolder =
        UniversViewHolder(
            ItemUniversitiesBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )

    override fun onBindViewHolder(holder: UniversViewHolder, position: Int) {
        holder.bind()
    }

    fun setOnClick(onClickItem: (ItemData) -> Unit) {
        this.onClickItem = onClickItem
    }
}