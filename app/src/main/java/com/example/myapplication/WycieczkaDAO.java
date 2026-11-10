
package com.example.myapplication;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Delete;
import androidx.room.Update;
import androidx.room.Query;

import java.util.List;

@Dao
public interface WycieczkaDAO {

    @Insert
    void wstawWycieczke(Wycieczka wycieczka);

    @Delete
    void usunWycieczke(Wycieczka wycieczka);

    @Update
    void aktualizujWycieczke(Wycieczka wycieczka);

    @Query("SELECT * FROM wycieczki")
    List<Wycieczka> zwrocWszystkieWycieczki();

    @Query("SELECT nazwa FROM wycieczki")
    List<String> zwrocNazwyWycieczek();
}
