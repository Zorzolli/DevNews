package com.zorzolli.devnews.model.db

import androidx.room.TypeConverter
import com.zorzolli.devnews.model.Source

class Converters {

    @TypeConverter
    fun fromSource(source: Source) : String {
        return source.name
    }

    @TypeConverter
    fun toSource(name: String) : Source {
        return Source(name, name)
    }
}