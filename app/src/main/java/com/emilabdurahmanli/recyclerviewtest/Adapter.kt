package com.emilabdurahmanli.recyclerviewtest

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Adapter(list : List<String>) : RecyclerView.Adapter<Adapter.ViewHolder>() {
    lateinit var list : List<String>
    init {
        this.list=list
    }

    // Provide a direct reference to each of the views within a data item
    // Used to cache the views within the item layout for fast access
    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        // Your holder should contain and initialize a member variable
        // for any view that will be set as you render a row
        val nameTextView = itemView.findViewById<TextView>(R.id.personName2)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Adapter.ViewHolder {
        val context = parent.context
        val inflater = LayoutInflater.from(context)
        // Inflate the custom layout
        val contactView = inflater.inflate(R.layout.recyclerview_item, parent, false)
        // Return a new holder instance
        return ViewHolder(contactView)
    }

    // Involves populating data into the item through holder
    override fun onBindViewHolder(viewHolder: Adapter.ViewHolder, position: Int) {
        // Get the data model based on position
        val name: String = list.get(position)
        // Set item views based on your views and data model
        val textView = viewHolder.nameTextView
        textView.setText(name)
    }

    // Returns the total count of items in the list
    override fun getItemCount(): Int {
        return list.size
    }
}