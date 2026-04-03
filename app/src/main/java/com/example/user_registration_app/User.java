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

//Criando o construtor da classe que será usado para criar um novo objeto User

    public User(String name, String cpf, String email, String phone){
        this.name = name;
        this.cpf = cpf;
        this.email = email;
        this.phone = phone;
    }

    //Metodos getter e satter para acessar e modificar os dados do objeto User

    //Retorna o ID do usuário
    public int getId() {return id;}

    //Define o ID do usuário(usuario pelo Room para preencher automaticamdente)
    public void setId(int id) {this.id = id;}

    //Retorna o nome do usuario
    public String getName() {return name;}

    //Retorna o cpf do usuario
    public String getCpf() {return cpf;}

    //Retorna o email do usuario
    public String getEmail() {return email;}

    //Retorna o phone do usuario
    public String getPhone() {return phone;}


}
