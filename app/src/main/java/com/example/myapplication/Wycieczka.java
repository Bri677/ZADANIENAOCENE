
package com.example.myapplication;

import androidx.room.Entity;
import androidx.room.PrimaryKey;
import androidx.room.ColumnInfo;

@Entity(tableName = "wycieczki")
public class Wycieczka {

    @PrimaryKey(autoGenerate = true)
    public int id;

    public String nazwa;
    public String miejsce;

    @ColumnInfo(name = "liczba_dni")
    public int liczbaDni;

    public double cena;

    public String poziom;
    public String rodzaj;
    public String transport;
    public String atrakcje;

    public Wycieczka() {

    }

    public Wycieczka(String nazwa, String miejsce,
                     int liczbaDni, double cena,
                     String poziom, String rodzaj,
                     String transport, String atrakcje) {

        this.nazwa = nazwa;
        this.miejsce = miejsce;
        this.liczbaDni = liczbaDni;
        this.cena = cena;
        this.poziom = poziom;
        this.rodzaj = rodzaj;
        this.transport = transport;
        this.atrakcje = atrakcje;
    }

    @Override
    public String toString() {
        return nazwa + " - " + miejsce + "\n"
                + liczbaDni + " dni | "
                + cena + " zł\n"
                + poziom + " | " + rodzaj;
    }
}
