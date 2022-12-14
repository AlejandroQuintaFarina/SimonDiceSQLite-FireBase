package com.example.simondice.model.room


import androidx.room.Entity
import androidx.room.PrimaryKey


    //Estructura de la tabla record que usa un ID autogenerado como clave primaria y guarda el record y el nombre de quien lo haya sacado

@Entity (tableName = "record")
data class Record (

    @PrimaryKey(autoGenerate = true)
    val recordID: Int,

    val nombre:String,

    val puntuacion:Int

)
