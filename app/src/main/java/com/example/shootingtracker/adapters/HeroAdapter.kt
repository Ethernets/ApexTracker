package com.example.shootingtracker.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.shootingtracker.R
import com.example.shootingtracker.models.Hero
import java.util.*
import kotlin.jvm.internal.MutablePropertyReference1Impl

class HeroAdapter: RecyclerView.Adapter<HeroAdapter.ViewHolder>() {
    private val heroMutableList: MutableList<Hero> = LinkedList()
    fun setData(newHeroes: List<Hero>){
        heroMutableList.clear()
        heroMutableList.addAll(newHeroes)
        notifyDataSetChanged()
    }

    class ViewHolder(intemView: View): RecyclerView.ViewHolder(intemView) {
      fun bind(model: Hero){

      }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(intemView = LayoutInflater.from(parent.context).inflate(R.layout.cell_hero, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(model = heroMutableList[position])
    }

    override fun getItemCount(): Int {
        return heroMutableList.count()
    }
}