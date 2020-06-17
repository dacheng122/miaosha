/**
 * @作者 7七月
 * @微信公号 林间有风
 * @开源项目 $ http://7yue.pro
 * @免费专栏 $ http://course.7yue.pro
 * @我的课程 $ http://imooc.com/t/4294850
 * @创建时间 2020/6/5 16:48
 */
package com.imooc.miaosha.test;

public class NoReturnNoParam {
    @FunctionalInterface
    public interface NoReturnMultiParam {
        void method(int a, int b);
    }

    /**无参无返回值*/
    /*@FunctionalInterface
    public interface NoReturnNoParam {
        void method();
    }*/

    /**一个参数无返回*/
    @FunctionalInterface
    public interface NoReturnOneParam {
        void method(int a);
    }

    /**多个参数有返回值*/
    @FunctionalInterface
    public interface ReturnMultiParam {
        int method(int a, int b);
    }

    /*** 无参有返回*/
    @FunctionalInterface
    public interface ReturnNoParam {
        int method();
    }

    /**一个参数有返回值*/
    @FunctionalInterface
    public interface ReturnOneParam {
        int method(int a);
    }
}
