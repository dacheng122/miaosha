/**
 * @作者 7七月
 * @微信公号 林间有风
 * @开源项目 $ http://7yue.pro
 * @免费专栏 $ http://course.7yue.pro
 * @我的课程 $ http://imooc.com/t/4294850
 * @创建时间 2020/6/5 10:25
 */
package com.imooc.miaosha.test;

public class TestDemo {

    private static String test;

    public static void main(String[] args) {
        //1.快速定义成员变量 .field 选择方式  Ctrl+Alt+F
        test = "test";
        //2.快速格式化 .format
        String s = String.format("name=%s", "测试");
       // System.out.println(s);
        //3.生成返回值 Ctrl+Alt+V
        //4.快速判空 .null .notnull
        if (test == null) {

        }
        //5.快速取反 .not .if
        boolean sign = true;
        if (!sign) {

        }
        //6.快速返回 .return
        //7.快速循环   Ctrl+Alt+V  .fori
        int[] ints = new int[3];
        for (int i = 0; i < ints.length; i++) {

        }
        System.out.println("加油！");


    }

    private static int returnInt(){
        int i =1;
        return i;
    }
}
