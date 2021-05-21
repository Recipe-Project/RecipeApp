package com.recipe.android.recipeapp.src.scrapRecipe

import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import com.recipe.android.recipeapp.config.BaseActivity
import com.recipe.android.recipeapp.databinding.ActivityScrapRecipeBinding
import com.recipe.android.recipeapp.src.scrapRecipe.adapter.ScrapViewPagerAdapter

class ScrapRecipeActivity: BaseActivity<ActivityScrapRecipeBinding>(ActivityScrapRecipeBinding::inflate) {

    val TAG = "ScrapRecipeActivity"

    private lateinit var tabLayout: TabLayout
    private lateinit var viewPager: ViewPager2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding.btnBack.setOnClickListener {
            onBackPressed()
        }

        tabLayout = binding.tabLayout
        viewPager = binding.viewPager

        viewPager.adapter = ScrapViewPagerAdapter(this)

        val tabLayoutTextArray = arrayOf("유튜브", "블로그", "공공")

        TabLayoutMediator(tabLayout, viewPager){tab, position ->
            tab.text = tabLayoutTextArray[position]
        }.attach()

    }
}