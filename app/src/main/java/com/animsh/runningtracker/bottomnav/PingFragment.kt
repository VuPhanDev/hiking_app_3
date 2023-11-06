package com.animsh.runningtracker.bottomnav

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.animsh.runningtracker.R
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.fragment_ping.*


@AndroidEntryPoint
class PingFragment : Fragment(R.layout.fragment_ping) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        item_1.setOnClickListener{
            findNavController().navigate(R.id.action_menu_ping_to_hikingDetailFragment)
        }
    }


}
