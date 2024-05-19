package pnj.uts.ti.muhammad_fadhil

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView

class ProfileFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_profile, container, false)

        // Retrieve the stored values from SharedPreferences
        val sharedPreferences = activity?.getSharedPreferences("UserPrefs", Context.MODE_PRIVATE)
        val email = sharedPreferences?.getString("Email", "")
        val name = sharedPreferences?.getString("Nama", "")
        val nim = sharedPreferences?.getString("Nim", "")
        val kelas = sharedPreferences?.getString("Kelas", "")

        // Display the values
        view.findViewById<TextView>(R.id.textEmail).text = "Email: $email"
        view.findViewById<TextView>(R.id.textName).text = "Nama: $name"
        view.findViewById<TextView>(R.id.textNim).text = "NIM: $nim"
        view.findViewById<TextView>(R.id.textKelas).text = "Kelas: $kelas"

        // Handle logout button click
        val logoutButton = view.findViewById<Button>(R.id.buttonLogout)
        logoutButton.setOnClickListener {
            // Clear the shared preferences
            sharedPreferences?.edit()?.clear()?.apply()

            // Navigate back to MainActivity
            val intent = Intent(activity, MainActivity::class.java)
            startActivity(intent)
            activity?.finish()  // Optional: close the current activity
        }

        return view
    }
}