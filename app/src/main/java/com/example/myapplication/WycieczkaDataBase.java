
package com.example.myapplication;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(
        entities = {Wycieczka.class},
        version = 1
)
public abstract class WycieczkaDataBase extends RoomDatabase {

    public abstract WycieczkaDAO zwrocWycieczkiDAO();
}
