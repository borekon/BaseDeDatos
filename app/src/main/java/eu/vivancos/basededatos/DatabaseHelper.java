package eu.vivancos.basededatos;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME="Libreria";
    private static final int DATABASE_VERSION=1;
    //sql de creación de tabla
    private static final String DATABASE_CREATE_LIBROS= "create table libros (_id integer primary key autoincrement,"+"titulo text not null, autor text not null, precio float not null)";
    //sql eliminación de tabla
    private static final String DATABASE_DELETE_LIBROS="drop table if exists libros";
    public DatabaseHelper(Context context){
        super(context, DATABASE_NAME,null, DATABASE_VERSION);
    }
    //Se llama al crear la base de datos
    @Override
    public void onCreate(SQLiteDatabase db) {
        createTables(db);
    }
    //este método es llamado si a la hora de crear el DataBaseHelper
    //se pasa una versión superior a la ya existente
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        //reconstruimos la tabla
        deleteTables(db);
        createTables(db);
    }
    private void createTables(SQLiteDatabase db) {
        db.execSQL(DATABASE_CREATE_LIBROS);
    }
    private void deleteTables(SQLiteDatabase db) {
        db.execSQL(DATABASE_DELETE_LIBROS);
    }
}
