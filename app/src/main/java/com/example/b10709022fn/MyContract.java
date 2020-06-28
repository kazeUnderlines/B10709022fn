package com.example.b10709022fn;

import android.provider.BaseColumns;

public final class MyContract {
    public static final String AUTHORITY="com.example.b10709022fn";
    public static final String PATH_LOCATION="locations";
    public static final String PATH_LOCATION_WITH_ID="locations/#";
    public static final String PATH_FARTHEST="farthest";
    public static final String PATH_FARTHEST_WITH_ID="farthest/#";
    public MyContract(){}
    public static abstract class Location implements BaseColumns {
        public static final String TABLE_NAME="location";
        public static final String COLUMN_NAME_LONGITUDE="longitude";
        public static final String COLUMN_NAME_LATITUDE="latitude";
        public static final String COLUMN_NAME_NAME="name";
    }
}
