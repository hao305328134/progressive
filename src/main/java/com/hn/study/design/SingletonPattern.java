package com.hn.study.design;

/**
 * 单例模式
 *
 * @author Mr.hn
 * 2022/08/09 17:33
 */
public class SingletonPattern {

    private static SingletonPattern instance;

    private SingletonPattern() {
        // 初始化操作
    }

    public static SingletonPattern getInstance() {
        if (instance == null) {
            // 如果实例为空，则创建一个新实例
            instance = new SingletonPattern();
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello, I am a Singleton!");

    }

    public static void main(String[] args) {
        // 获取单例实例
        SingletonPattern singleton = SingletonPattern.getInstance();

        // 调用成员方法
        singleton.showMessage();
    }


}
