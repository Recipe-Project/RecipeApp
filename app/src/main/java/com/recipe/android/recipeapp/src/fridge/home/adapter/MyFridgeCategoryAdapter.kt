package com.recipe.android.recipeapp.src.fridge.home.adapter

import android.util.Log
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.recipe.android.recipeapp.src.fridge.home.fragment.MyFridgeAllCategoryFragment
import com.recipe.android.recipeapp.src.fridge.home.fragment.MyFridgeCategoryFragment
import com.recipe.android.recipeapp.src.fridge.home.models.GetFridgeResult

private const val NUM_PAGES = 8

class MyFridgeCategoryAdapter(fragment : Fragment) : FragmentStateAdapter(fragment) {

    val TAG = "MyFridgeCategoryAdapter"

    private var ingredients = ArrayList<GetFridgeResult>()

    override fun getItemCount(): Int = NUM_PAGES

    override fun createFragment(position: Int): Fragment {
        Log.d(TAG, "IngredientCategoryAdapter - createFragment() : $position")

        return if (position != 0) {
            MyFridgeCategoryFragment(ingredients[position - 1])
        } else {
            MyFridgeAllCategoryFragment(ingredients)
        }
    }

    fun submitList(ingredients: ArrayList<GetFridgeResult>) {
        this.ingredients = ingredients
        notifyDataSetChanged()
    }
}