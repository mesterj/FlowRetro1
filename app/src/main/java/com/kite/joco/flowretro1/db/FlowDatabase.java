package com.kite.joco.flowretro1.db;

import com.raizlabs.android.dbflow.annotation.Database;

/**
 * Created by Mester József on 2015.07.30..
 */

@Database(name = FlowDatabase.DATABASE_NAME,version = FlowDatabase.DATABASE_VERSION)
public class FlowDatabase{
    public static final String DATABASE_NAME = "FLOWRETROdb";
    public static final int DATABASE_VERSION = 2;
}
