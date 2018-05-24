package com.nsh.pucho.Extra;

public class Recent {
    public static final String TABLE_NAME = "recent";

    public static final String COLUMN_ID = "id";
    public static final String COLUMN_NAME = "name";
    public static final String COLUMN_URL = "url";
    public static final String COLUMN_FUNCTION = "function";

    private int id;
    private String name;
    private String url;
    private String function;


    // Create table SQL query
    public static final String CREATE_TABLE =
            "CREATE TABLE " + TABLE_NAME + "("
                    + COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
                    + COLUMN_NAME + " TEXT,"
                    + COLUMN_URL + " VARCHAR,"
                    + COLUMN_FUNCTION + " VARCHAR"
                    + ")";

    public Recent() {
    }

    public Recent(int id, String name,String url, String function) {
        this.id = id;
        this.name= name;
        this.url = url;
        this.function = function;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {

        return id;
    }

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }

    public String getUrl() {

        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}