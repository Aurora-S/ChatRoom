/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: QqSearchRes
 * Author:   trhjyhf
 * Date:     2019/6/8 14:24
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.qq.client.view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author trhjyhf
 * @create 2019/6/8
 * @since 1.0.0
 */
public class QqSearchRes extends JFrame implements ActionListener{

    JLabel jbl1,jbl2;
    JButton jb1,jb2;
    JPanel jp1,jp2;

    public static void  main(String [] args){
        new QqSearchRes();
        //QqChat qqChat=new QqChat("1");
    }

    public QqSearchRes(){

        jp1=new JPanel();
        jp2=new JPanel();



        jbl1=new JLabel("---Search Result---",JLabel.CENTER);
        jbl2=new JLabel("1. SpringMVC                    Creator：admin",JLabel.CENTER);



        jb1=new JButton("Join");
        jb1.addActionListener(this);
        jb2=new JButton("Cancel");
        jp1.add(jb1);
        jp1.add(jb2);

        jp2.add(jbl2);





        this.add(jbl1,"North");
        this.add(jp2,"Center");
        this.add(jp1,"South");



        this.setTitle("Result");
        this.setSize(300,490);
        this.setVisible(true);
        this.setLocation(300,250);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==jb1){
            JOptionPane.showMessageDialog(null, "Application approved");
            new NewList("2017001");
            this.dispose();
        }
    }

}
