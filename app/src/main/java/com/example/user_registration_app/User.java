package com.example.user_registration_app;

//Importa anotações do Room necessários para mapear esta classe com uma entidade do banco de dados
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class User {

    //Define o campo 'id' como chave primaria da tabela e configura para ser gerado automaticamente
    @PrimaryKey(autoGenerate = true)
    private int id;

    //Campos que representam as colunas da tabela para armazenar os dados do usuario
    private String name; // nome do usuário
    private String cpf; // cpf do usuário
    private String email; // email do usuário
    private String phone; // telefone do usuário



}
