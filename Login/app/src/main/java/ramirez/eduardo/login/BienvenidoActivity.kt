package ramirez.eduardo.login

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_bienvenido.*

class BienvenidoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bienvenido)
        val usuario = intent.getStringExtra("usuarioLogin")
        nombreUsuario.setText(usuario)
    }
    fun cerrarSesion(v : View){
        finish()
    }
}
