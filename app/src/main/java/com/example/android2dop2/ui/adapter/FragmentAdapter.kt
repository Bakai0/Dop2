package com.example.android2dop2.ui.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.android2dop2.ui.fragments.FirstFragment
import com.example.android2dop2.ui.fragments.FourthFragment
import com.example.android2dop2.ui.fragments.SecondFragment
import com.example.android2dop2.ui.fragments.ThirdFragment

class FragmentAdapter(fragmentManager: FragmentManager,lifecycle: Lifecycle) : FragmentStateAdapter(fragmentManager,lifecycle) {
    override fun getItemCount(): Int {
        return 4
    }

    override fun createFragment(position: Int): Fragment {

        return when(position){
            0 ->{
                FirstFragment()
            }
            1->{
                SecondFragment()
            }
            2->{
                ThirdFragment()
            }
            3->{
                FourthFragment()
            }
            else -> {
                Fragment()
            }
        }
    }
}