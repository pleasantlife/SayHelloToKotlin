package com.gandan.android.kotlinbasicpractice.Adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import junit.framework.Test

/**
 * Created by XPS on 2018-03-07.
 */
class TestAdapter : RecyclerView.Adapter<Holder>() {
    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): Holder {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onBindViewHolder(holder: Holder?, position: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getItemCount(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}

class Holder(itemView : View) : RecyclerView.ViewHolder(itemView) {

}