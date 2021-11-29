package com.example.hwno4.fragment

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.hwno4.R

class notes : Fragment(R.layout.notes){
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<TextView>(R.id.textView).text =
            notesArgs.fromBundle(requireArguments()).amount.toString() //rato gaawitla ;-;

    }
}