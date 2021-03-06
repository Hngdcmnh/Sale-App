package com.example.saleapp.Views.Fragments.Sale

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.saleapp.Models.Item
import com.example.saleapp.R

class SaleFragment : Fragment() {

    lateinit var recyclerView:RecyclerView
    lateinit var listItem:MutableList<Item>
    lateinit var saleViewModel: SaleViewModel


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_sale, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        saleViewModel = ViewModelProvider(this).get(SaleViewModel::class.java)
        recyclerView = view.findViewById(R.id.recyclerview)
        recyclerView.layoutManager= LinearLayoutManager(view.context)
        recyclerView.adapter= SaleAdapter(saleViewModel.getListItem())



    }



}