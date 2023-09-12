package sanjar.uz.roomwordexample

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "word_table")
data class Word(
    @PrimaryKey(autoGenerate = false)
    @ColumnInfo(name = "word")
    val word: String
)
