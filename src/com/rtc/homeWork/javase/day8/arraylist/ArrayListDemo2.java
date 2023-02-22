package com.rtc.homeWork.javase.day8.arraylist;

import java.util.ArrayList;
import java.util.Objects;

/**
 * 案例：存储影片信息，并在程序中展示出俩
 */
public class ArrayListDemo2 {
    public static void main(String[] args) {
        MoviesInfo move1 = new MoviesInfo("吞噬星空", "张三", "15", "9.0");
        MoviesInfo move2 = new MoviesInfo("完美世界", "辰东", "18", "9.7");
        MoviesInfo move3 = new MoviesInfo("斗破苍穹", "天蚕土豆", "22", "9.9");

        ArrayList<MoviesInfo> movesList = new ArrayList<>();
        movesList.add(move1);
        movesList.add(move2);
        movesList.add(move3);

        // 遍历集合并输出对象信息
        for (int i = 0; i < movesList.size(); i++) {
            MoviesInfo info = movesList.get(i);
            System.out.println("电影名称：" + info.getName() + ", 导演：" + info.getDirector()
                    + ", 电影时长：" + info.getTime() + "分钟, 评分：" + info.getScore());
        }
    }

}
