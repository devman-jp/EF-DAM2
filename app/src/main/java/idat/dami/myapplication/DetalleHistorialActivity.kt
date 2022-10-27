package idat.dami.myapplication

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import idat.dami.myapplication.databinding.ActivityDetalleHistorialBinding

class DetalleHistorialActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var binding : ActivityDetalleHistorialBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetalleHistorialBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnRegrearHistorial.setOnClickListener  (this)

    }


    override fun onClick(v: View?) {
        when(v?.id){
            R.id.btnRegrearHistorial -> {
                //esta funcion propia de android permite retroceder a la actividad o fragment vizualizada anteriormente
                onBackPressed()
            }
        }
    }


}