package pnj.uts.ti.muhammad_fadhil

import android.content.Intent
import android.database.Cursor
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import pnj.uts.ti.muhammad_fadhil.Database.DBManager
import android.widget.Button
import android.widget.RelativeLayout
import android.widget.TextView

class AlumniListActivity : AppCompatActivity() {

    private lateinit var dbManager: DBManager
    private lateinit var cursor: Cursor
    private lateinit var adapter: AlumniAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alumni_list)

        val emptyDataLayout: RelativeLayout = findViewById(R.id.emptyDataLayout)
        val txtEmptyMessage: TextView = findViewById(R.id.txtEmptyMessage)
        val btnAddData: Button = findViewById(R.id.btnAddData)
        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)

        dbManager = DBManager(this)
        cursor = dbManager.readAllRecords()

        if (cursor.count == 0) {
            // No data, show the empty message and button
            emptyDataLayout.visibility = View.VISIBLE
            txtEmptyMessage.visibility = View.VISIBLE
            btnAddData.visibility = View.VISIBLE
            recyclerView.visibility = View.GONE
        } else {
            // Data available, set up the RecyclerView
            recyclerView.layoutManager = LinearLayoutManager(this)
            adapter = AlumniAdapter(cursor) { id ->
                val intent = Intent(this, AlumniDetail::class.java)
                intent.putExtra("RECORD_ID", id)
                startActivity(intent)
            }
            recyclerView.adapter = adapter
        }

        btnAddData.setOnClickListener {
            val intent = Intent(this, NewData::class.java)
            startActivity(intent)
        }
    }

    override fun onDestroy() {
        cursor.close()
        dbManager.close()
        super.onDestroy()
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle item selection
        return when (item.itemId) {
            R.id.menu_add_data -> {
                val intent = Intent(this, NewData::class.java)
                startActivity(intent)
                true
            }
            R.id.menu_alumni_data -> {
                val intent = Intent(this, AlumniListActivity::class.java)
                startActivity(intent)
                true
            }
            R.id.menu_logout -> {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
                finish()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}
