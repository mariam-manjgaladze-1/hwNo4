package com.example.hwno4.fragment

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation.findNavController
import androidx.navigation.fragment.NavHostFragment.findNavController
import com.example.hwno4.R

class Home : Fragment(R.layout.home){

    private lateinit var note: EditText
    private lateinit var save: Button

    override fun onViewCreated(view: View, savedInstanceState: Bundle?){
        super.onViewCreated(view, savedInstanceState)

        note = view.findViewById(R.id.note)
        save = view.findViewById(R.id.save)

        val navController = navigation.findnavigation_menu(view)

        save.setOnClickListener {
            val amountText = amountEditText.text.toString()
            if (amountText.isEmpty()){
                return@setOnClickListener
            }
            val amount = amountText.toInt()

            val action = homeDirections.actionhomeToDashboardFragment(amount)
        }
    }
}