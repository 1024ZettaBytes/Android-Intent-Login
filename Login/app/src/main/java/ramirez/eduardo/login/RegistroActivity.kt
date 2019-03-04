package ramirez.eduardo.login

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_registro.*

class RegistroActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro)
    }
    fun aceptar(v: View) {
        val usr = txtRegUsuario.text.toString()
        val psw = txtRegPass.text.toString()
        val psw2 = txtRegPass2.text.toString()
        if (usr == "" || psw == "") Toast.makeText(
            this,
            "Ingrese un nombre de usuario y contraseña.",
            Toast.LENGTH_SHORT
        ).show()
        else {
            if (psw != psw2) Toast.makeText(this, "Las contraseñas no coinciden.", Toast.LENGTH_SHORT).show()
            else {
                val resultIntent = Intent()
                resultIntent.putExtra("usuarioReg", usr)
                resultIntent.putExtra("passReg", psw)
                setResult(Activity.RESULT_OK, resultIntent)
                finish()
            }
        }
    }

    fun cancelar(v: View){

        finish()
    }
}
