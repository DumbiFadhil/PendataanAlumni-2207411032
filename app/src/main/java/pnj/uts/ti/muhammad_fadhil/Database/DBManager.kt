package pnj.uts.ti.muhammad_fadhil.Database

import android.content.ContentValues
import android.content.Context
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class DBManager(context: Context) : SQLiteOpenHelper(context,
    DBHelper.DATABASE_NAME, null,
    DBHelper.DATABASE_VERSION
) {

    override fun onCreate(db: SQLiteDatabase) {
//        db.execSQL(DBHelper.CREATE_TABLE)
        db.execSQL(DBHelper.CREATE_TABLE)
    }

    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
        db.execSQL("DROP TABLE IF EXISTS ${DBHelper.TABLE_NAME}")
        onCreate(db)
    }

    fun readAllRecords(): Cursor {
        val db = this.readableDatabase
        return db.query(
            DBHelper.TABLE_NAME,
            null, null, null, null, null,
            "${DBHelper.COLUMN_NAME} ASC"
        )
    }

    fun readRecord(id: Long): Cursor {
        val db = this.readableDatabase
        return db.query(
            DBHelper.TABLE_NAME,
            null,
            "${DBHelper.COLUMN_ID} = ?",
            arrayOf(id.toString()),
            null, null, null
        )
    }

    fun insertRecord(nim: String, name: String, placeOfBirth: String, dateOfBirth: String, address: String, religion: String, phone: String, yearOfEntry: Int, yearOfGraduation: Int, job: String, position: String): Long {
        val db = this.writableDatabase
        val values = ContentValues().apply {
            put(DBHelper.COLUMN_NIM, nim)
            put(DBHelper.COLUMN_NAME, name)
            put(DBHelper.COLUMN_PLACE_OF_BIRTH, placeOfBirth)
            put(DBHelper.COLUMN_DATE_OF_BIRTH, dateOfBirth)
            put(DBHelper.COLUMN_ADDRESS, address)
            put(DBHelper.COLUMN_RELIGION, religion)
            put(DBHelper.COLUMN_PHONE, phone)
            put(DBHelper.COLUMN_YEAR_OF_ENTRY, yearOfEntry)
            put(DBHelper.COLUMN_YEAR_OF_GRADUATION, yearOfGraduation)
            put(DBHelper.COLUMN_JOB, job)
            put(DBHelper.COLUMN_POSITION, position)
        }
        return db.insert(DBHelper.TABLE_NAME, null, values)
    }

    fun updateRecord(id: Long, nim: String, name: String, placeOfBirth: String, dateOfBirth: String, address: String, religion: String, phone: String, yearOfEntry: Int, yearOfGraduation: Int, job: String, position: String): Int {
        val db = this.writableDatabase
        val values = ContentValues().apply {
            put(DBHelper.COLUMN_NIM, nim)
            put(DBHelper.COLUMN_NAME, name)
            put(DBHelper.COLUMN_PLACE_OF_BIRTH, placeOfBirth)
            put(DBHelper.COLUMN_DATE_OF_BIRTH, dateOfBirth)
            put(DBHelper.COLUMN_ADDRESS, address)
            put(DBHelper.COLUMN_RELIGION, religion)
            put(DBHelper.COLUMN_PHONE, phone)
            put(DBHelper.COLUMN_YEAR_OF_ENTRY, yearOfEntry)
            put(DBHelper.COLUMN_YEAR_OF_GRADUATION, yearOfGraduation)
            put(DBHelper.COLUMN_JOB, job)
            put(DBHelper.COLUMN_POSITION, position)
        }
        return db.update(DBHelper.TABLE_NAME, values, "${DBHelper.COLUMN_ID} = ?", arrayOf(id.toString()))
    }

    fun deleteRecord(id: Long): Int {
        val db = this.writableDatabase
        return db.delete(DBHelper.TABLE_NAME, "${DBHelper.COLUMN_ID} = ?", arrayOf(id.toString()))
    }
}