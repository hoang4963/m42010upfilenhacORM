package com.codegym.appmusic.model;

import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class SongForm {
    private int id;
    @NotEmpty
    @Size(min = 2, max = 300)
    private String author;
    @NotEmpty
    @Size(min = 2, max = 800)
    private String name;
    @NotEmpty
    @Size(min = 2, max = 1000)
    private String category;
    private MultipartFile file;

    public SongForm() {
    }

    public SongForm(@NotEmpty  @Size(min = 2, max = 300) String author,@NotEmpty @Size(min = 2, max = 800)  String name, @NotEmpty @Size(min = 2, max = 1000) String category, MultipartFile file) {
        this.author = author;
        this.name = name;
        this.category = category;
        this.file = file;
    }

    public SongForm(int id,@NotEmpty  @Size(min = 2, max = 300) String author,@NotEmpty  @Size(min = 2, max = 800)  String name, @NotEmpty @Size(min = 2, max = 1000) String category, MultipartFile file) {
        this.id = id;
        this.author = author;
        this.name = name;
        this.category = category;
        this.file = file;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(@NotEmpty @Pattern(regexp = "[^A-Za-z]")  @Size(min = 5, max = 300) String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(@NotEmpty @Pattern(regexp = "[A-Za-z0-9]") @Size(min = 5, max = 800) String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory( @NotEmpty @Pattern(regexp = "[A-Za-z,]") @Size(min = 5, max = 1000) String category) {
        this.category = category;
    }

    public MultipartFile getFile() {
        return file;
    }

    public void setFile(MultipartFile file) {
        this.file = file;
    }
}
