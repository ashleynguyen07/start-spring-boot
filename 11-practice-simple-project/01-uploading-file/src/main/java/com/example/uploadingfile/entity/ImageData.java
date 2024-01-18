package com.example.uploadingfile.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "image_data")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class ImageData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "type")
    private String type;

    @Column(name = "image_data")
    private byte[] imageData;

}
