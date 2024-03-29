package com.example.appnovotecroom.controller

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.appnovotecroom.model.Contato

@Dao
interface ContatoDao {
    @Insert
    fun insertContato(contato: Contato)
    @Update
    fun updateContato(contato: Contato)
    @Delete
    fun deleteContato(contato: Contato)

    @Query("SELECT * FROM contatos ORDER BY nome ASC")
    fun selectContatoOrdenadoPeloNome()

    @Query("SELECT * FROM contatos ORDER BY sobrenome ASC")
    fun selectContatoOrdenadoPeloSobrenome()

    @Query("SELECT * FROM contatos ORDER BY telefone ASC")
    fun selectContatoOrdenadoPeloTelefone()
}