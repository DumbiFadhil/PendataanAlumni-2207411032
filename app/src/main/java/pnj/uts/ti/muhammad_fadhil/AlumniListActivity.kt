package pnj.uts.ti.muhammad_fadhil

import android.content.Intent
import android.database.Cursor
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import pnj.uts.ti.muhammad_fadhil.Database.DBManager

class AlumniListActivity : AppCompatActivity() {

    private lateinit var dbManager: DBManager
    private lateinit var cursor: Cursor
    private lateinit var adapter: AlumniAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alumni_list)

        dbManager = DBManager(this)
        cursor = dbManager.readAllRecords()

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        adapter = AlumniAdapter(cursor) { id ->
            val intent = Intent(this, AlumniDetail::class.java)
            intent.putExtra("RECORD_ID", id)
            startActivity(intent)
        }
        recyclerView.adapter = adapter
    }

    override fun onDestroy() {
        cursor.close()
        dbManager.close()
        super.onDestroy()
    }
}
