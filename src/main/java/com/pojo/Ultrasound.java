package com.pojo;

import java.sql.Date;


public class Ultrasound {

    private long id;
    private String waveform;
    private String constructionSite;
    private String section;
    private String mileage;
    private String author;
/*    private Date uploadDate;
    private Date foundDate;*/
    private String uploadDate;
    private String foundDate;

    @Override
    public String toString() {
        return "Ultrasound{" +
                "id=" + id +
                ", waveform='" + waveform + '\'' +
                ", constructionSite='" + constructionSite + '\'' +
                ", section='" + section + '\'' +
                ", mileage='" + mileage + '\'' +
                ", author='" + author + '\'' +
                ", uploadDate='" + uploadDate + '\'' +
                ", foundDate='" + foundDate + '\'' +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getWaveform() {
        return waveform;
    }

    public void setWaveform(String waveform) {
        this.waveform = waveform;
    }

    public String getConstructionSite() {
        return constructionSite;
    }

    public void setConstructionSite(String constructionSite) {
        this.constructionSite = constructionSite;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getMileage() {
        return mileage;
    }

    public void setMileage(String mileage) {
        this.mileage = mileage;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getUploadDate() {
        return uploadDate;
    }

    public void setUploadDate(String uploadDate) {
        this.uploadDate = uploadDate;
    }

    public String getFoundDate() {
        return foundDate;
    }

    public void setFoundDate(String foundDate) {
        this.foundDate = foundDate;
    }
}

