package com.example.myapplication.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import com.example.myapplication.R
import com.example.myapplication.ViewPagerAdapter
import com.example.myapplication.databinding.FragmentProfileBinding
import com.example.myapplication.profileFragments.FirstFragment
import com.example.myapplication.profileFragments.SecondFragment
import com.google.android.material.tabs.TabLayoutMediator

class ProfileFragment : Fragment() {

    private var _binding : FragmentProfileBinding? = null
    private val binding get() = _binding!!

    private val fList = listOf(
        FirstFragment(),
        SecondFragment()
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentProfileBinding.inflate(layoutInflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) = with(binding) {
        super.onViewCreated(view, savedInstanceState)

        val viewPagerAdapter = ViewPagerAdapter(requireActivity(), fList)
        vp.adapter = viewPagerAdapter

        val tList = listOf(
            ContextCompat.getDrawable(requireContext(),R.drawable.baseline_privacy_tip_24),
            ContextCompat.getDrawable(requireContext(),R.drawable.baseline_public_24)
        )

        TabLayoutMediator(tabLayout,vp) { tab, position ->
            tab.icon = tList[position]
        }.attach()
    }

    companion object {
        @JvmStatic
        fun newInstance() = ProfileFragment()
    }
}