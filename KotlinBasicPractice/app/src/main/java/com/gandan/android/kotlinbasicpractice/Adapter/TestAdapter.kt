package com.gandan.android.kotlinbasicpractice.Adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.gandan.android.kotlinbasicpractice.Model.Car
import com.gandan.android.kotlinbasicpractice.R
import junit.framework.Test
import kotlinx.android.synthetic.main.testadapter_item.view.*

/**
 * Created by XPS on 2018-03-07.
 */
class TestAdapter(var context : Context, var carList : ArrayList<Car>) : RecyclerView.Adapter<Holder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        var view = LayoutInflater.from(parent.context).inflate(R.layout.testadapter_item, parent, false)
        return Holder(view)
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        var car = carList[position]
        holder.itemView.txtCarItem.text = car.seatCount.toString()

    }

    override fun getItemCount(): Int {
        //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        return carList.size
    }

}

class Holder(itemView : View) : RecyclerView.ViewHolder(itemView) {
}