package com.design;

/**
 * Created by abing on 2015/5/21.
 */

/**
 *
 * 静态内部类 static nested class
 *  这种是线程安全    读取实例的时候不会进行同步，没有性能缺陷
 */
public class Singleton {

    private static  class  SingletonHolder {
        private static final  Singleton INSTANCE = new Singleton();
    }
    private  Singleton(){}
    public  static  final  Singleton getInstance(){
        return  SingletonHolder.INSTANCE;
    }

}



///**
// * 饿汉式 static final field
// *
// * 在某些地方无法使用。 like ：
// * 在 getInstance() 之前必须调用某个方法设置参数给它，那样这种单例写法就无法使用了。
// */
//public class Singleton {
//    private  static  final Singleton instance = new Singleton();
//
//    private  Singleton(){}
//
//    public  static Singleton getInstance(){
//        return  instance;
//    }
//
//}

//public class Singleton {
//
//    private  static  Singleton instance;
//    private  Singleton(){}
//
//    /**
//     * 线程不安全
//     * @return instance
//     */
////    public static Singleton getInstance(){
////        if (instance == null) {
////            instance = new Singleton();
////        }
////        return  instance;
////    }
//
//    /**
//     * 线程安全，不实用
//     * @return instance
//     */
////    public  static  synchronized Singleton getInstance(){
////        if (instance == null){
////            instance = new Singleton();
////        }
////        return instance;
////    }
//
//    /**
//     * 双重检验锁
//     * 如何要安全的话 前面的语句应该加 volatile
//     *   private volatile static Singleton instance; //声明成 volatile
//     * @return  instance
//     */
////    public  static Singleton getInstance(){
////        if (instance == null) {
////            synchronized (Singleton.class) {
////                if (instance == null) {
////                    instance = new Singleton();
////                }
////            }
////        }
////
////        return instance ;
////    }
//
//
//
//}
