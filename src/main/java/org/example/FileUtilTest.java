package org.example;

import org.example.FileUtil;

import java.io.IOException;
public class FileUtilTest {
    @Test
    public void test01(){
        try {
            FileUtils.readFile("D://aaa.txt");
        } catch (IOException e) {
            System.out.println("文件不存在");
        }catch (FileIsNotTxtException e){
            System.out.println("文件格式不对");
        }
    }

    @Test
    public void test02(){
        try {
            FileUtils.readFile("D://ans.doc");
        } catch (IOException e) {
            System.out.println("文件不存在");
        }catch (FileIsNotTxtException e){
            System.out.println("文件格式错误");
        }
    }

}
