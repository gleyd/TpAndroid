package com.dmr.tpfragmentcommunication.tproom.db;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import com.dmr.tpfragmentcommunication.tproom.entity.User;
import com.dmr.tpfragmentcommunication.tproom.entity.UserDao;

/**
 * Created by dmr on 19/01/2018.
 */

@Database(entities = {User.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {

    public abstract UserDao userDao();
}