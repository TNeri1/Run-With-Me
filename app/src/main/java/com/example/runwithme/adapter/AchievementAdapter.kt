package com.example.runwithme.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.runwithme.R
import com.example.runwithme.model.Achievement

/**
 * Adapter for the [RecyclerView] in [AchievementsActivity]. Displays [Achievement] data object.
 */
class AchievementAdapter(
    private val context: Context,
    private val dataset: List<Achievement>) : RecyclerView.Adapter<AchievementAdapter.ItemViewHolder>() {

        class ItemViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
            val imageView: ImageView = view.findViewById(R.id.item_image)
        }

    /**
     * Create new views (Invoked by the layout manager)
     */
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        // Create a new view
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.achievements_list_item, parent, false)

        return ItemViewHolder(adapterLayout)
    }

    /**
     * Replace the contents of a view (invoked by the layout manager)
     */
    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]
        holder.imageView.setImageResource(item.imageResourceId)
    }


    override fun getItemCount() = dataset.size

}