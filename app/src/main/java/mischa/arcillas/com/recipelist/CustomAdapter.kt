package mischa.arcillas.com.recipelist

import android.content.Context
import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView

/**
 * Created by Mischa on 08/12/2017.
 */
class CustomAdpater(val userList: ArrayList<User>, context: Context) : RecyclerView.Adapter<CustomAdpater.ViewHolder>() {

    var mcontext = context
    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        val user : User = userList[position]
        holder?.textViewName?.text = user.name
        holder?.textViewName2?.text = user.description
        holder!!.textViewName.text = "Name: "+ user.name
        holder.textViewName2.text = "Description: "+user.description

        holder.onCustomItemClick(object :CustomItemClick{
            override fun onCustomItemClick(view: View, pos: Int) {
                if (pos == 0 ) {
                    val intent = Intent(mcontext, food1::class.java)
                    mcontext.startActivity(intent);
                }
                if (pos == 1 ) {
                    val intent = Intent(mcontext, food2::class.java)
                    mcontext.startActivity(intent);
                }
                if (pos == 2 ) {
                    val intent = Intent(mcontext, food3::class.java)
                    mcontext.startActivity(intent);
                }
                if (pos == 3 ) {
                    val intent = Intent(mcontext, food4::class.java)
                    mcontext.startActivity(intent);
                }
                if (pos == 4 ) {
                    val intent = Intent(mcontext, food5::class.java)
                    mcontext.startActivity(intent);
                }
                if (pos == 5 ) {
                    val intent = Intent(mcontext, food6::class.java)
                    mcontext.startActivity(intent);
                }
                if (pos == 6 ) {
                    val intent = Intent(mcontext, food7::class.java)
                    mcontext.startActivity(intent);
                }
            }
        })


    }





    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent?.context).inflate(R.layout.list_layout, parent,false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return userList.size
    }



    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView), View.OnClickListener {
        override fun onClick(v: View?) {
            this.customItemClick!!.onCustomItemClick(v!!, adapterPosition)
        }

        val textViewName: TextView
        val textViewName2: TextView
        val linearLayout: LinearLayout
        var customItemClick: CustomItemClick?=null

        init {
            textViewName = itemView.findViewById<TextView>(R.id.textViewUsername)
            textViewName2 = itemView.findViewById<TextView>(R.id.textViewAddress)
            linearLayout = itemView.findViewById<LinearLayout>(R.id.LinearLayout)
            itemView.setOnClickListener(this)
        }

        fun onCustomItemClick(itemClickListener: CustomItemClick){
            this.customItemClick = itemClickListener
        }
    }


}