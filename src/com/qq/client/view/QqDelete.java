/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: QqDelete
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
public class QqDelete extends JFrame implements ActionListener {


        JTextField jtf;
        JButton jb1,jb2;
        JPanel jp;


        public static void  main(String [] args){

            //QqChat qqChat=new QqChat("1");
        }

        public QqDelete(){
            this.setResizable(false);
            //this.setVisible(true);




            jtf=new JTextField(15);
            jb1=new JButton("Search");
            jb1.addActionListener( this);
            jb2=new JButton("Cancel");
            jp=new JPanel();
            jp.add(jtf);
            jp.add(jb1);
            jp.add(jb2);

            this.add(jp,"South");
            this.setTitle("Please enter group name");
            this.setSize(300,150);
            this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
