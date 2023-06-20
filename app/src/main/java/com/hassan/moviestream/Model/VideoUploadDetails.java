package com.hassan.moviestream.Model;

public class VideoUploadDetails {
    private String id;
    private String movieName;
    private String imageURL;
    private String fileURL;
    private String category;

    public VideoUploadDetails(String id, String movieName, String fileURL, String category) {
        this.id = id;
        this.movieName = movieName;

        this.fileURL = fileURL;
        this.category = category;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public String getFileURL() {
        return fileURL;
    }

    public void setFileURL(String fileURL) {
        this.fileURL = fileURL;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
