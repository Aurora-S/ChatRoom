/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: QqManage
 * Author:   trhjyhf
 * Date:     2019/6/8 12:47
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
public class QqManage extends JFrame implements ActionListener {



    JButton jb1,jb2;
    JPanel jp1,jp2;
    JCheckBox jcb1,jcb2,jcb3;


    public static void  main(String [] args){

        //QqChat qqChat=new QqChat("1");
    }

    public QqManage(){
        this.setResizable(false);
        //this.setVisible(true);



        jcb1=new JCheckBox("ChatBot");
        jcb2=new JCheckBox("VirtualIdol");
        jcb3=new JCheckBox("SpringMVC");

        jp2=new JPanel();
        jp2.add(jcb1);
        jp2.add(jcb2);
        jp2.add(jcb3);


        jb1=new JButton("Exit");
        jb1.addActionListener( this);
        jb2=new JButton("Cancel");

        jp1=new JPanel();
        jp1.add(jb1);
        jp1.add(jb2);


        this.add(jp2,"North");
        this.add(jp1,"South");
        this.setTitle("Manage");
        this.setSize(300,470);

        this.setLocation(470,250);


        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==jb1){

            JOptionPane.showMessageDialog(null, "Confirm your exit?\r\nThis will defriend you from the team members!");
            //new QqDelEnd("2017001");
            this.dispose();
        }
    }




}
