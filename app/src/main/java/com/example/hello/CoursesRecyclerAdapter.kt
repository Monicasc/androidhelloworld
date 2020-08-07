package com.example.hello

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class CoursesRecyclerViewAdapter(val coursesList: List<Courses>) :
    RecyclerView.Adapter<CoursesRecyclerViewAdapter.CoursesViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CoursesViewHolder {
        var itemView = LayoutInflater.from(parent.context).inflate(R.layout.row_name_item, parent, false)
        return CoursesViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return coursesList.size
    }

    override fun onBindViewHolder(holder: CoursesViewHolder, position: Int) {
        holder.rowView.tvName.text = coursesList[position].toString()
    }
