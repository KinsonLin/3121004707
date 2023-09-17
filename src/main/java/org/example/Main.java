package org.example;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String simHash0;
        String simHash1;
        String str0;
        String str1;
        try {
            str0 = FileUtils.readFile("D:/orig/orig.txt");
            str1 = FileUtils.readFile("D:/orig/orig_0.8_add.txt");
        } catch (IOException e) {
            System.out.println("找不到指定文件");
            return;
        } catch (FileIsNotTxtException e) {
            System.out.println("文件格式错误");
            return;
        }

        simHash0 = SimHashUtils.getSimHash(str0);
        simHash1 = SimHashUtils.getSimHash(str1);

        double similarity = SimHashUtils.getSimilarity(simHash0, simHash1);
        System.out.print("两篇文章相似度为  ");
        System.out.println(similarity);
        try {
            FileUtils.writeFile("D:/orig/result.txt", String.valueOf(similarity));
            System.out.println("结果已写入文件 "+"D:/orig/result.txt");
        } catch (IOException e) {
        }
        System.out.println("查重结束");
        return;
    }

}