package pnj.uts.ti.muhammad_fadhil

import android.database.Cursor
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import pnj.uts.ti.muhammad_fadhil.Database.DBHelper

class AlumniAdapter(private val cursor: Cursor, private val onItemClicked: (Long) -> Unit) : RecyclerView.Adapter<AlumniAdapter.AlumniViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AlumniViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.alumni_list_items, parent, false)
        return AlumniViewHolder(view)
    }

    override fun onBindViewHolder(holder: AlumniViewHolder, position: Int) {
        if (cursor.moveToPosition(position)) {
            holder.bind(cursor)
        }
    }

    override fun getItemCount(): Int {
        return cursor.count
    }

    inner class AlumniViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView), View.OnClickListener {
        private val tvNim: TextView = itemView.findViewById(R.id.tvNim)
        private val tvName: TextView = itemView.findViewById(R.id.tvName)

        init {
            itemView.setOnClickListener(this)
        }

        fun bind(cursor: Cursor) {
            val id = cursor.getLong(cursor.getColumnIndexOrThrow(DBHelper.COLUMN_ID))
            val nim = cursor.getString(cursor.getColumnIndexOrThrow(DBHelper.COLUMN_NIM))
            val name = cursor.getString(cursor.getColumnIndexOrThrow(DBHelper.COLUMN_NAME))
            tvNim.text = "NIM: $nim"
            tvName.text = "Nama: $name"
            itemView.tag = id
        }

        override fun onClick(v: View?) {
            val id = itemView.tag as Long
            onItemClicked(id)
        }
    }
}
