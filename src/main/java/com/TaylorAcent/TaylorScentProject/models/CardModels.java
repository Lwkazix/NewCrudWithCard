package com.TaylorAcent.TaylorScentProject.models;

import jakarta.persistence.*;

@Entity
@Table(name = "cards")
public class CardModels {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "tittle")
    private String tittle;
    @Column(name = "txt")
    private String txt;
    @Column(name = "image_file")
    private String imageFile;

    public CardModels(){

    }

    public CardModels(Integer id, String tittle, String txt, String imageFile) {
        this.id = id;
        this.tittle = tittle;
        this.txt = txt;
        this.imageFile = imageFile;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getTxt() {
        return txt;
    }

    public void setTxt(String txt) {
        this.txt = txt;
    }

    public String getImageFile() {
        return imageFile;
    }

    public void setImageFile(String imageFile) {
        this.imageFile = imageFile;
    }
    @Override
    public String toString() {
        return "CardModels{" +
                "id=" + id +
                ", tittle='" + tittle + '\'' +
                ", txt='" + txt + '\'' +
                ", imageFile='" + imageFile + '\'' +
                '}';
    }
}
