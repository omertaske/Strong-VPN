package com.liberty.apps.studio.strongvpn.view.activites

import android.os.Bundle
import android.widget.PopupMenu
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.NavHostFragment
import com.liberty.apps.studio.strongvpn.R
import com.liberty.apps.studio.strongvpn.databinding.ActivityControllerBinding

class ControllerActivity : AppCompatActivity() {

    private lateinit var binding: ActivityControllerBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityControllerBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupNavigation()
    }


    private fun setupNavigation() {
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.fragmentContainerView) as NavHostFragment
        val popupMenu = PopupMenu(this, null)
        popupMenu.inflate(R.menu.main_nav_menu)
        val menu = popupMenu.menu
        binding.mainBottomNav.setupWithNavController(menu, navHostFragment.navController)
    }
}