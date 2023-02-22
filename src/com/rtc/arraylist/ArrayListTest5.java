package com.rtc.arraylist;

import java.util.ArrayList;

/**
 * 影片信息在程序中的表示:
 * 某影院系统需要在后台存储上述三部电影，然后依次展示出来。
 * 分析
 * ：定义一个电影类，定义一个集合存储电影对象。
 * ：创建3个电影对象，封装相关数据，把3个对象存入到集合中去。
 * ：遍历集合中的3个对象，输出相关信息。
 */
public class ArrayListTest5 {
    public static void main(String[] args) {
        // 1.定义一个电影类 Movie
        // 2.定义一个ArrayList集合存储这些影片对象
        ArrayList<Movie> movies = new ArrayList<>();

        // 3.创建影片对象封装电影数据，把对象加入到集合中去
//        Movie m1 = new Movie("《肖申克的救赎》", 9.7, "罗宾逊");
//        movies.add(m1);
        movies.add(new Movie("《肖申克的救赎》", 9.7, "罗宾逊"));
        movies.add(new Movie("《霸王别姬》", 9.6, "张国荣, 张丰毅"));
        movies.add(new Movie("《阿甘正传》", 9.5, "汤姆.汉克斯"));
        // [com.rtc.arraylist.Movie@7a81197d, com.rtc.arraylist.Movie@5ca881b5, com.rtc.arraylist.Movie@24d46ca6]
        System.out.println(movies);

        // 4.遍历集合中的影片对象并展示出来
        for (int i = 0; i < movies.size(); i++) {
            Movie movie = movies.get(i);
            System.out.println("片名：" + movie.getName() + ", 评分:" + movie.getScore() + ", 主演:" + movie.getActor());
        }
    }
}
