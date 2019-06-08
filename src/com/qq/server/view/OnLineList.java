/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: OnLineList
 * Author:   trhjyhf
 * Date:     2019/6/8 21:15
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.qq.server.view;

import javax.swing.*;
import java.awt.*;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author trhjyhf
 * @create 2019/6/8
 * @since 1.0.0
 */
public class OnLineList extends JFrame {



    JLabel jbl1,jbl2,jbl3,jbl4,jbl5,jbl6;
    JPanel jp1,jp2;

    public static void  main(String [] args){
        new OnLineList();
        //QqChat qqChat=new QqChat("1");
    }

    public OnLineList(){

        jp1=new JPanel(new GridLayout(5,1));//三行三列
        jp2=new JPanel();



        jbl1=new JLabel("   ID                                    Group",JLabel.CENTER);

        jbl2=new JLabel("------------------------------------",JLabel.CENTER);
        jbl3=new JLabel("2017001                            ChatBot",JLabel.CENTER);
        jbl4=new JLabel("2017002                            ChatBot",JLabel.CENTER);
        jbl5=new JLabel("2017005                            ChatBot",JLabel.CENTER);


        jbl6=new JLabel("Total Current online users：           3",JLabel.CENTER);




        jp1.add(jbl1);
        jp1.add(jbl2);
        jp1.add(jbl3);
        jp1.add(jbl4);
        jp1.add(jbl5);

        jp2.add(jbl6);





        this.add(jp1,"North");

        this.add(jp2,"South");



        this.setTitle("Current Online");
        this.setSize(300,490);
        this.setVisible(true);
        this.setLocation(300,250);

    }



}
