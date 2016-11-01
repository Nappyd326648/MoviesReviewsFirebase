package com.example.in0418gq.moviesreviewsfirebase;

import java.util.Date;

/**
 * Created by in0418gq on 11/1/16.
 */
public class MovieReview {
    String name;
    String reviewText;
    float stars;
    Date date;

    MovieReview(){}

    public MovieReview(String name, String reviewText, float stars) {
        this.name = name;
        this.reviewText = reviewText;
        this.stars = stars;
        this.date =  new Date();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReviewText() {
        return reviewText;
    }

    public void setReviewText(String reviewText) {
        this.reviewText = reviewText;
    }

    public float getStars() {
        return stars;
    }

    public void setStars(float stars) {
        this.stars = stars;
    }
}
