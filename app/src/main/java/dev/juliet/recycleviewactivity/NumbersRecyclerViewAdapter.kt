package dev.juliet.recycleviewactivity
//
//import androidx.appcompat.app.AppCompatActivity
//import android.os.Bundle
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import android.widget.TextView
//import androidx.recyclerview.widget.RecyclerView
//
//class NumbersRecyclerViewAdapter : AppCompatActivity() {
//    class NamesRecyclerViewAdapter (var numbersList: List<String>): RecyclerView.Adapter<NamesViewHolder>() {
//        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NamesViewHolder {
//
//            var itemView= LayoutInflater.from(parent.context)
//                .inflate(R.layout.numbers_list_item,parent,false)
//            return NamesViewHolder(itemView)
//        }
//
//        override fun onBindViewHolder(holder: NamesViewHolder, position: Int) {
//            holder.tvName.text=numbersList.get(position)
//        }
//
//        override fun getItemCount(): Int {
//            return numbersList.size
//        }
//    }
//    class NamesViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
//        var tvName = itemView.findViewById<TextView>(R.id.tvNumbers)
//    }
