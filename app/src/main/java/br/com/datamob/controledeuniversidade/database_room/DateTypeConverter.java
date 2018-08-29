package br.com.datamob.controledeuniversidade.database_room;

import android.arch.persistence.room.TypeConverter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTypeConverter
{

    @TypeConverter
    public static Date toDate(String value)
    {
        try
        {
            return new SimpleDateFormat("yyyy-MM-dd").parse(value);
        }
        catch (ParseException e)
        {
            return null;
        }
    }

    @TypeConverter
    public static String toString(Date value)
    {
        return new SimpleDateFormat("yyyy-MM-dd").format(value);
    }
}
