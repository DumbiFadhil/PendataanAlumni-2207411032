package pnj.uts.ti.muhammad_fadhil

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.content.Context
import android.content.Intent
import android.view.Gravity
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etEmail = findViewById<EditText>(R.id.etEmail)
        val etPassword = findViewById<EditText>(R.id.etPassword)
        val btnLogin = findViewById<Button>(R.id.btnLogin)

        val hardcodedEmail = "dumbifadhil@gmail.com"
        val hardcodedPassword = "Pass1234"

        btnLogin.setOnClickListener {
            val email = etEmail.text.toString()
            val password = etPassword.text.toString()

            if (email == hardcodedEmail && password == hardcodedPassword) {
                val sharedPreferences = getSharedPreferences("UserPrefs", Context.MODE_PRIVATE)
                val editor = sharedPreferences.edit()
                editor.putString("Email", email)
                editor.putString("Nim", "2207411032")
                editor.putString("Nama", "Muhammad Fadhil Dumbi")
                editor.putString("Kelas", "TI 4B")
                editor.apply()

                showToast("Login Successful")
                val intent = Intent(this, HomeActivity::class.java)
                startActivity(intent)
                finish() // Optional: close the login activity
            } else {
                showToast("Login Failed")
            }
        }
    }

    private fun showToast(message: String) {
        val toast = Toast.makeText(this, message, Toast.LENGTH_SHORT)
        toast.setGravity(Gravity.TOP or Gravity.CENTER_HORIZONTAL, 0, 0)
        toast.show()
    }
}