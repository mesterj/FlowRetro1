package com.kite.joco.flowretro1.entity;

import com.google.gson.annotations.Expose;
import com.kite.joco.flowretro1.db.FlowDatabase;
import com.raizlabs.android.dbflow.annotation.Column;
import com.raizlabs.android.dbflow.annotation.PrimaryKey;
import com.raizlabs.android.dbflow.annotation.Table;
import com.raizlabs.android.dbflow.structure.BaseModel;

/**
 * Created by Mester József on 2015.07.13..
 */
@Table(databaseName = FlowDatabase.DATABASE_NAME)
public class Uzletkoto extends BaseModel{

    @Expose
    @Column
    @PrimaryKey(autoincrement = false)
    String szat;
    @Expose
    @Column
    String nev;
    @Expose
    @Column
    String email;
    @Expose
    @Column
    String alkozpont;
    @Expose
    @Column
    String alkrovidkod;

    public String getSzat() {
        return szat;
    }

    public void setSzat(String szat) {
        this.szat = szat;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAlkozpont() {
        return alkozpont;
    }

    public void setAlkozpont(String alkozpont) {
        this.alkozpont = alkozpont;
    }

    public String getAlkrovidkod() {
        return alkrovidkod;
    }

    public void setAlkrovidkod(String alkrovidkod) {
        this.alkrovidkod = alkrovidkod;
    }

    public String getUgyintezo() {
        return ugyintezo;
    }

    public void setUgyintezo(String ugyintezo) {
        this.ugyintezo = ugyintezo;
    }

    public String getUgyiemail() {
        return ugyiemail;
    }

    public void setUgyiemail(String ugyiemail) {
        this.ugyiemail = ugyiemail;
    }

    public String getLastsorszam() {
        return lastsorszam;
    }

    public void setLastsorszam(String lastsorszam) {
        this.lastsorszam = lastsorszam;
    }

    public String getLastpdfazon() {
        return lastpdfazon;
    }

    public void setLastpdfazon(String lastpdfazon) {
        this.lastpdfazon = lastpdfazon;
    }

    String ugyintezo;
    String ugyiemail;
    String lastsorszam;
    String lastpdfazon;

}
