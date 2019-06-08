/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: NewPw
 * Author:   trhjyhf
 * Date:     2019/6/8 22:23
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.qq.client.view;

import javax.swing.*;
import java.awt.*;
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
public class NewPw extends JFrame implements ActionListener {

    JLabel jbl1,jbl2,jbl3;

    JPasswordField jtf1,jtf2,jtf3;
    JButton jb1,jb2;
    JPanel jp1,jp2;


    public static void  main(String [] args){

        //NewPw newPw=new NewPw();
        //QqChat qqChat=new QqChat("1");
    }

    public NewPw(){


        this.setResizable(false);
        //this.setVisible(true);

        jp2=new JPanel(new GridLayout(6,1));


        jtf1=new JPasswordField(15);
        jtf2=new JPasswordField(15);
        jtf3=new JPasswordField(15);
        jbl1=new JLabel("The original password：",JLabel.CENTER);
        jbl2=new JLabel("The new password：",JLabel.CENTER);
        jbl3=new JLabel("Confirm password：",JLabel.CENTER);
        jp2.add(jbl1);
        jp2.add(jtf1);
        jp2.add(jbl2);
        jp2.add(jtf2);
        jp2.add(jbl3);
        jp2.add(jtf3);





        jb1=new JButton("Commit");
        jb1.addActionListener( this);
        jb2=new JButton("Cancel");
        jp1=new JPanel();
        jp1.add(jb1);
        jp1.add(jb2);


        this.add(jp2,"North");
        this.add(jp1,"South");
        this.setTitle("Please enter group name");
        this.setSize(300,470);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==jb1){
            JOptionPane.showMessageDialog(this, "Successful submission");
            this.dispose();
        }
    }


}
