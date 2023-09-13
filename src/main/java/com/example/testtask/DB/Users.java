package com.example.testtask.DB;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data//не надо вписывать геттеры и сеттеры
@AllArgsConstructor //есть конструктор всех аргументов
@NoArgsConstructor // есть пустой конструктор
@Table(name = "users")
@Entity
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",nullable = true,unique = true)
    private long id;
    @Column(name = "name",nullable = false)
    private String name;
    @Column(name = "surname",nullable = false)

    private String surname;
    @Column(name = "email",nullable = false,unique = true)
    private String email;
    @Column(name = "imageUrl",nullable = false)
    private String imageUrl;
    @Column(name = "status",nullable = false)
    private String status;

}
