package com.example.kohki.withmanager;

import android.provider.BaseColumns;

/**
 * Created by kohki on 16/09/05.
 */
public final class EventContract {

    public EventContract(){}

    public static abstract class Event implements BaseColumns{ //add _id
        public static final String TABLE_NAME  = "events";
        public static final String COL_TEAM    = "team";
        public static final String COL_NUM     = "number";
        public static final String COL_POINT   = "point";
        public static final String COL_SUCCESS = "is_success";
        public static final String COL_EVENT   = "event";
        public static final String COL_MOVIE_NAME  = "movie_name";
        public static final String COLUMN_NAME_NULLABLE = null;
    }
}
