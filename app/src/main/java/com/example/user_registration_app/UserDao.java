package com.example.user_registration_app;


//O Data Access Object é o componente que serve para persistencia de dados. Serve para definir as
// operações que podem ser feitas no banco de dados com relação a entidade User.

//Importa as notações do Room necessarias para definiro DAO (Data Access Object)
import  androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

//Importa a classe List do Java para retornar uma lista de usuários
import java.util.List;

@Dao
public interface UserDao {
    //Metodo para inserir um uisuario na tabela do  Banco de Dados
    //A anotação @Insert informa à Room que este método deve ser usado para inserir dado

    @Insert
    void insert(User user);



    }
