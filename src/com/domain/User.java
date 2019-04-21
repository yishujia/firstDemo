package com.domain;

import java.io.Serializable;

/**
 * 代码是思想。更好的解决业务问题， 优雅的艺术家  代码效率
 * 软件:JVM,mysql，框架，做复杂事情的封装，业务代码更加精妙
 *
 * JVM,重构和高效的代码,代码思想,设计模式,数据库 (代码艺术家)
 *（重构,高效,设计模式,思想,规则,技术）
 *
 * 码农和艺术家只有一个区别， 那就是思考,技术维度，积累都不一样。
 *
 * java基础
 *
 * java常用API
 *
 * 抽象： 着重于业务侧重点。(思想) ，实际操作的一些特点， 代码是思想的体现。是艺术
 *       类继承结构,接口(设计模式)
 *       处理数据的底层方法API(方法代码重用， 重构代码)
 *
 * 框架：对繁杂的操作做封装，来提高开发的效率
 *
 * 代码管理 : 版本开发， 业务驱动技术， 需求创造价值. GIT,SVN
 *
 * MAVEN； 协做开发
 *
 */
public class User implements Serializable {

    private String user;

    public void doSomething(){

        System.out.println("I do something");
    }
}