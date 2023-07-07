package com.WebServer.Atividade3.models.entities;

import java.util.Arrays;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Lob
    private byte[] data;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public byte[] getData() {
        return data;
    }

    public void setData(byte[] data) {
        this.data = data;
    }

    public Image() {
    }

    public Image(Long id, byte[] data) {
        this.id = id;
        this.data = data;
    }

    @Override
    public String toString() {
        return "Image [id=" + id + ", data=" + Arrays.toString(data) + "]";
    }

}
