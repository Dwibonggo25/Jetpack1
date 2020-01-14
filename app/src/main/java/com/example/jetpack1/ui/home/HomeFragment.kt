package com.example.jetpack1.ui.home

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.FragmentStatePagerAdapter
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.jetpack1.R
import com.example.jetpack1.databinding.HomeFragmentBinding
import com.example.jetpack1.ui.movie.MoviesFragment
import com.example.jetpack1.ui.tvshow.TvShowsFragment
import com.google.android.material.tabs.TabLayoutMediator


class HomeFragment : Fragment() {

    lateinit var binding : HomeFragmentBinding

    companion object {
        fun newInstance() = HomeFragment()
    }

    private lateinit var viewModel: HomeViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        viewModel = ViewModelProviders.of(this).get(HomeViewModel::class.java)
        binding = DataBindingUtil.inflate(inflater, R.layout.home_fragment, container, false)
        binding.executePendingBindings()
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        settinViewPager()
        settingTabLayout()
    }

    private fun settinViewPager() {
        val adapter = ViewPagerAdapter (this)
        binding.viewPager.adapter = adapter
    }

    private fun settingTabLayout() {
        TabLayoutMediator(binding.tabLayout, binding.viewPager){ tab, position ->
            when (position){
                0 -> tab.setText("Movie")
                1 -> tab.setText("Tv Shows")
            }
        }.attach()
    }

    class ViewPagerAdapter (fragment: Fragment) : FragmentStateAdapter(fragment) {
        override fun getItemCount(): Int  = 2

        override fun createFragment(position: Int): Fragment {
            return when (position){
                0 -> MoviesFragment.newInstance()
                else -> TvShowsFragment.newInstance()
            }
        }
    }


}
