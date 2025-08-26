package com.fileupload.FileUploader.model.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data               // Generates getters, setters, toString, equals, hashCode
@NoArgsConstructor  // Generates default constructor
@AllArgsConstructor // Generates constructor with all fields
public class FileTable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;         // Primary key

    @Column(name = "filepath", nullable = false)
    private String filepath; // Path of the file

    @Column(name = "update_id")
    private Long updateId;   // ID of the user/process who last updated
}

