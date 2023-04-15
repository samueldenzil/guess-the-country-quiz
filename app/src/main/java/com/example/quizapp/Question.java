package com.example.quizapp;

public class Question {
    private int id;
    private String question;
    private int image;
    private String[] options;
    private int correctAns; // this will store the index of the correct ans

    public Question(int id, String question, int image, String[] options, int correctAns) {
        this.id = id;
        this.question = question;
        this.image = image;
        this.options = options;
        this.correctAns = correctAns;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String[] getOptions() {
        return options;
    }

    public void setOptions(String[] options) {
        this.options = options;
    }

    public int getCorrectAns() {
        return correctAns;
    }

    public void setCorrectAns(int correctAns) {
        this.correctAns = correctAns;
    }
}
