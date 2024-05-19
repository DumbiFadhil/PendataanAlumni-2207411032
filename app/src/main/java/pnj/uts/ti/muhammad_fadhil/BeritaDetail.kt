package pnj.uts.ti.muhammad_fadhil

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import pnj.uts.ti.muhammad_fadhil.databinding.ActivityDetailBeritaBinding

class BeritaDetail : AppCompatActivity() {
    private lateinit var binding: ActivityDetailBeritaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBeritaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val title = intent.getStringExtra("title")
        val desc = intent.getStringExtra("desc")
        val imageId = intent.getIntExtra("imageId", R.drawable.placeholder_image)

        binding.txtjudul.text = title
        binding.txtDescription.text = desc
        binding.imgView.setImageResource(imageId)
    }
}