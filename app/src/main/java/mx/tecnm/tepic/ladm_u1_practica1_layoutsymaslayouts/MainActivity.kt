package mx.tecnm.tepic.ladm_u1_practica1_layoutsymaslayouts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        pantallas.setOnItemClickListener { adapterView, view, i, l ->
            when(i){
                0 ->{
                    startActivity(Intent(this,MainActivity2::class.java))
                }//pantalla 1
                1 ->{
                    startActivity(Intent(this, MainActivity3::class.java))
                }//pantalla 2
                2 ->{
                    startActivity(Intent(this,MainActivity4::class.java))
                }//pantalla 3
                3 ->{
                    startActivity(Intent(this,MainActivity5::class.java))
                }//pantalla 4
                4 ->{
                    startActivity(Intent(this,MainActivity6::class.java))
                }//pantalla 5
                5->{
                    startActivity(Intent(this,MainActivity7::class.java))
                }//pantalla 6
                6->{
                    startActivity(Intent(this,MainActivity8::class.java))
                }//pantalla 7
                7->{startActivity(Intent(this,MainActivity10::class.java))}
                else -> {finish()}

            }//when
        }//pantallas
    }//onCreate
}//class