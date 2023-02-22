package com.rtc.homeWork.javase.day8.arraylist;

/**
 * 电影类
 */
public class MoviesInfo {
    private String name; // 影片名
    private String director; // 导演
    private String time; // 电影时长
    private String score; // 评分

    public MoviesInfo() {
    }

    public MoviesInfo(String name, String director, String time, String score) {
        this.name = name;
        this.director = director;
        this.time = time;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }
}
