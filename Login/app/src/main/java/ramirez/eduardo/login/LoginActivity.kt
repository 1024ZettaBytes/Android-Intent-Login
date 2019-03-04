package ramirez.eduardo.login

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {
    var usr : String ="999999999"
    var psw : String = "999999999"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        btnCrear.setOnClickListener {
            val intent =    Intent(this, RegistroActivity::class.java)
            startActivityForResult(intent, 123)
        }
        btnIngresar.setOnClickListener {
            val userLogin = txtUsuario.text.toString()
            val passLogin = txtPass.text.toString()
            if(userLogin != usr || passLogin != psw) Toast.makeText(this,"Usuario y/o contraseña incorrectos.", Toast.LENGTH_SHORT).show()
            else {
                val intent = Intent(this, BienvenidoActivity::class.java)
                intent.putExtra("usuarioLogin",usr)
                startActivity(intent)
            }
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if(data!=null){
            usr = data.getStringExtra("usuarioReg")
            psw = data.getStringExtra("passReg")
            txtUsuario.setText(usr)
            txtPass.setText(psw)
        }
    }

}
