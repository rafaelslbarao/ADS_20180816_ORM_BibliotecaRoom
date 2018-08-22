package br.com.datamob.controledeuniversidade.database_room;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

import br.com.datamob.controledeuniversidade.database_room.dao.CidadeDao;
import br.com.datamob.controledeuniversidade.database_room.dao.UniversidadeDao;
import br.com.datamob.controledeuniversidade.database_room.entity.CidadeEntity;
import br.com.datamob.controledeuniversidade.database_room.entity.UniversidadeEntity;

@Database(entities = {CidadeEntity.class, UniversidadeEntity.class}, version = 1)
public abstract class DatabaseRoom extends RoomDatabase
{
    private static final String DATABASE_NAME = "bancoDeDados";

    public abstract CidadeDao cidadeDao();
    public abstract UniversidadeDao universidadeDaoDao();

    private static DatabaseRoom instance;

    public static DatabaseRoom getInstance(Context context)
    {
        if(instance == null)
            instance = Room.databaseBuilder(context, DatabaseRoom.class, DATABASE_NAME).build();

        return instance;
    }
}
