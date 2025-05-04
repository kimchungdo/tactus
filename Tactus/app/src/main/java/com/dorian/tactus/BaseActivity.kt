package com.dorian.tactus

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.dorian.tactus.databinding.ActivityBaseBinding

class BaseActivity : AppCompatActivity() {

    private var binding: ActivityBaseBinding? = null

    @SuppressLint("CommitTransaction")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBaseBinding.inflate(layoutInflater)
        setContentView(binding!!.root)
        openHomeFragment()
        supportActionBar?.hide()

        binding?.apply{
            bottomNavBar.setItemSelected(R.id.home)
            bottomNavBar.setOnItemSelectedListener {
                when(it) {
                    R.id.home -> {
                        openHomeFragment()
                    }
                    R.id.activity -> {
                        val activityFragment = ExerciseFragment.newInstance()
                        supportFragmentManager.beginTransaction()
                            .replace(R.id.frag_container_nav, activityFragment)
                            .commit()
                    }
                    R.id.goal -> {
                        val goalFragment = ChallengeFragment.newInstance()
                        supportFragmentManager.beginTransaction()
                            .replace(R.id.frag_container_nav, goalFragment)
                            .commit()
                    }
                    R.id.logs -> {
                        val logFragment = MyLogsFragment.newInstance()
                        supportFragmentManager.beginTransaction()
                            .replace(R.id.frag_container_nav, logFragment)
                            .commit()
                    }
                }
            }
        }

    }

    private fun openHomeFragment() {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.frag_container_nav, HomeFragment.newInstance())
        transaction.commit()
    }
}