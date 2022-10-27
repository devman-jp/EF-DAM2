package idat.dami.myapplication


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import idat.dami.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        reemplazarFragment(EntregasFragment())

        //esto hace que de acuerdo al id item implementado en el res-menu , se reemplace por el fragment relacionado
        binding.btnNavigation.setOnItemSelectedListener {
            when(it.itemId){
                R.id.perfil -> reemplazarFragment(PerfilFragment())
                R.id.historial -> reemplazarFragment(HistorialFragment())
                R.id.entregas -> reemplazarFragment(EntregasFragment())
                else ->{

                }

            }
            true
        }


    }

    //esto permite hacer el remplazo de fragments
    private fun reemplazarFragment(fragment: Fragment){
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frame_layout,fragment)
        fragmentTransaction.commit()

    }




}