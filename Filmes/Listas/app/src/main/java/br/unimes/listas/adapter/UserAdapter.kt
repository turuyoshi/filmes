package br.unimes.listas.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.unimes.listas.R
import br.unimes.listas.model.User

class UserAdapter (private val users:List<User>):
        RecyclerView.Adapter<UserAdapter.ViewHolder>(){
    class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {
        val txvName = itemView.findViewById<TextView>(R.id.txv_name)
        val txvAge = itemView.findViewById<TextView>(R.id.txv_age)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
       val view =LayoutInflater.from(parent.context)
           .inflate(R.layout.item_user,parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return users.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val user = users[position]
        holder.txvName.text = user.name
        holder.txvAge.text = user.age.toString()
    }
}