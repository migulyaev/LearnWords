package com.helpfulproduction.mywords.navigation

interface RootViewPagerListener {
    fun onPageChanged(position: Int)
    fun onEmptyStack()
    fun onBackPressed(fragmentsCount: Int)
}