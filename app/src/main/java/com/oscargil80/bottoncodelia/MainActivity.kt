package com.oscargil80.bottoncodelia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationItemView
import com.oscargil80.bottoncodelia.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val primerFragment = primerFragment()
        val segundoFragment = segundoFragment()
        val tercerFragment = tercerFragment()


        binding.bottomNavigation.setOnNavigationItemSelectedListener {
            when (it.itemId){
                R.id.primerFragment ->  {
                    setCurrentFragmnent(primerFragment)
                    true
                }

                R.id.segundoFragment ->  {
                    setCurrentFragmnent(segundoFragment)
                    true
                }

                R.id.tercerFragment ->  {
                    setCurrentFragmnent(tercerFragment)
                    true
                }
                else -> false
            }


        }
        binding.bottomNavigation.getOrCreateBadge(R.id.tercerFragment).apply {
            isVisible = true
            number = 10
        }
    }

    private fun setCurrentFragmnent(fragment: Fragment){
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.frameContainent, fragment)
            commit()
        }
    }



    }
