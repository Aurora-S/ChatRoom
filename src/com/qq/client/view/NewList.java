/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: NewList
 * Author:   trhjyhf
 * Date:     2019/6/8 16:39
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.qq.client.view;

import com.qq.client.tools.ManageQqChat;
import com.qq.common.Message;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author trhjyhf
 * @create 2019/6/8
 * @since 1.0.0
 */
public class NewList extends JFrame implements ActionListener, MouseListener {



    //处理第一张卡片
    JPanel jphy1,jphy2,jphy3;//jphy即jp好友
    JButton jphy_jb1,jphy_jb2,jphy_jb3,jphy_jb4,jphy_jb5;
    JScrollPane jsp1;
    String owner;

    //处理第二张卡片（陌生人
    JPanel jpmsr1,jpmsr2,jpmsr3,jpmsr4;//jphy即jp好友
    JButton jpmsr_jb1,jpmsr_jb2,jpmsr_jb3,jpmsr_jb4,jpmsr_jb5;
    JScrollPane jsp2;
    JLabel []jbls;

    //处理第三张卡片（黑名单
    JPanel jphmd1,jphmd2,jphmd3;//jphy即jp好友
    JButton jphmd_jb1,jphmd_jb2,jphmd_jb3,jphmd_jb4,jphmd_jb5;
    JScrollPane jsp3;
    JLabel []jbls2;

    //把整个JFrame设置成cardlayout布局
    CardLayout cl;

    public static void main(String[] args){

        //QqFriendList qqFriendList=new QqFriendList();
    }
    //更新在线的好友情况（头像由灰色变成彩色或反之
    public void upateFriend(Message m){
        //message有个content，这里面就是它好友在线的情况
        String onLineFriend[]=m.getCon().split(" ");

        for(int i=0;i<onLineFriend.length;i++){
            jbls[Integer.parseInt(onLineFriend[i])-2017001].setEnabled(true);
        }

    }

    public NewList(String ownerId){
        this.owner=ownerId;
        //处理第一张卡片（显示好友列表），最大的那个
        jphy_jb1=new JButton("ChatBot");
        jphy_jb2=new JButton("VirtualIdol");
        //对陌生人按钮监听
        jphy_jb2.addActionListener(this);
        jphy_jb3=new JButton("SpringMVC");
        jphy_jb3.addActionListener(this);






        jphy_jb4=new JButton("Search");
        jphy_jb4.addActionListener(this);
        jphy_jb5=new JButton("Delete");
        jphy_jb5.addActionListener(this);




        jphy1=new JPanel(new BorderLayout());
        //假定有50好友（中间那个
        jphy2=new JPanel(new GridLayout(10,1,4,4));//44代表上下行间隔

        //给jphy2初始化50个好友
        jbls=new JLabel[8];

        for(int i=0;i<jbls.length;i++){
            jbls[i]=new JLabel(i+2017001+"",new ImageIcon("image/umm.jpg"),JLabel.LEFT);
            //默认除了自己都不在线
            jbls[i].setEnabled(false);
            if(jbls[i].getText().equals(ownerId)){
                jbls[i].setEnabled(true);
            }
            jbls[i].addMouseListener(this);
            //每创建一个jlable，就是一个好友，它有图片
            jphy2.add(jbls[i]);


        }

        //存放陌生人黑名单，2行一列
        jphy3=new JPanel(new GridLayout(4,1));
        //把两个按钮加入到jphy3
        jphy3.add(jphy_jb2);
        jphy3.add(jphy_jb3);



        jphy3.add(jphy_jb4);
        jphy3.add(jphy_jb5);




        jsp1=new JScrollPane(jphy2);

        //对jphy1初始化，jphy1是整个一大块，要放在jfream才能实现
        jphy1.add(jphy_jb1,"North");
        jphy1.add(jsp1,"Center");
        jphy1.add(jphy3,"South");



        //处理第二张卡片，，，，复制粘贴上面一大堆。。。
        jpmsr_jb1=new JButton("ChatBot");
        jpmsr_jb1.addActionListener(this);

        jpmsr_jb2=new JButton("VirtualIdol");
        jpmsr_jb3=new JButton("SpringMVC");
        jpmsr_jb3.addActionListener(this);




        jpmsr_jb4=new JButton("Search");

        jpmsr_jb5=new JButton("Delete");



        jpmsr1=new JPanel(new BorderLayout());
        //假定有20陌生人
        jpmsr2=new JPanel(new GridLayout(8,1,4,4));//44代表上下行间隔

        //给jpmsr2初始化50个好友
        JLabel []jbls2=new JLabel[6];

        for(int i=0;i<jbls2.length;i++){
            jbls2[i]=new JLabel(i+2017009+"",new ImageIcon("image/umm.jpg"),JLabel.LEFT);



            jbls2[i].setEnabled(false);
            if(jbls2[i].getText().equals(ownerId)){
                jbls2[i].setEnabled(true);
            }
            jbls2[i].addMouseListener(this);



            //每创建一个jlable，就是一个好友，它有图片
            jpmsr2.add(jbls2[i]);

        }

        //存放陌生人黑名单，2行一列
        jpmsr3=new JPanel(new GridLayout(2,1));
        //把两个按钮加入到jphy3
        jpmsr3.add(jpmsr_jb1);
        jpmsr3.add(jpmsr_jb2);


        jsp2=new JScrollPane(jpmsr2);





        //存放陌生人黑名单，2行一列
        jpmsr4=new JPanel(new GridLayout(3,1));
        //把两个按钮加入到jphy3
        // jpmsr3.add(jpmsr_jb2);
        jpmsr4.add(jpmsr_jb3);



        jpmsr4.add(jpmsr_jb4);
        jpmsr4.add(jpmsr_jb5);






        //对jphy1初始化，jphy1是整个一大块，要放在jfream才能实现
        jpmsr1.add(jpmsr3,"North");
        jpmsr1.add(jsp2,"Center");
        jpmsr1.add(jpmsr4,"South");





//处理第san张卡片，，，，复制粘贴上面一大堆。。。
        jphmd_jb1=new JButton("ChatBot");
        jphmd_jb1.addActionListener(this);

        jphmd_jb2=new JButton("VirtualIdol");
        jphmd_jb2.addActionListener(this);
        jphmd_jb3=new JButton("SpringMVC");




        jphmd_jb4=new JButton("Search");
        jphmd_jb5=new JButton("Delete");





        jphmd1=new JPanel(new BorderLayout());
        //假定有20陌生人
        jphmd2=new JPanel(new GridLayout(5,1,4,4));//44代表上下行间隔

        //给jpmsr2初始化50个好友
        JLabel []jbls3=new JLabel[4];

        for(int i=0;i<jbls3.length;i++){
            jbls3[i]=new JLabel(i+2017015+"",new ImageIcon("image/umm.jpg"),JLabel.LEFT);



            jbls3[i].setEnabled(false);
            if(jbls3[i].getText().equals(ownerId)){
                jbls3[i].setEnabled(true);
            }
            jbls3[i].addMouseListener(this);



            //每创建一个jlable，就是一个好友，它有图片
            jphmd2.add(jbls3[i]);

        }

        //存放陌生人黑名单，2行一列
        jphmd3=new JPanel(new GridLayout(3,1));
        //把两个按钮加入到jphy3
        jphmd3.add(jphmd_jb1);
        jphmd3.add(jphmd_jb2);


        jphmd3.add(jphmd_jb3);



        jsp3=new JScrollPane(jphmd2);

        //对jphy1初始化，jphy1是整个一大块，要放在jfream才能实现
        jphmd1.add(jphmd3,"North");
        jphmd1.add(jsp3,"Center");
        //jphmd1.add(jphmd_jb3,"South");






        cl=new CardLayout();
        this.setLayout(cl);
        this.add(jphy1,"1");
        this.add(jpmsr1,"2");


        this.add(jphmd1,"3");


        //在窗口显示自己的编号
        this.setTitle(ownerId);

        //this.add(jphy1,"Center");
        this.setSize(240,400);
        this.setVisible(true);
        this.setLocation(450,250);
    }


    public void actionPerformed(ActionEvent arg0){
        //如果点击了陌生人按钮，就显示第二张卡片
        if(arg0.getSource()==jphy_jb2){
            //cl.show(this,"2");会报错
            cl.show(this.getContentPane(),"2");
        }else if(arg0.getSource()==jpmsr_jb1) {
            cl.show(this.getContentPane(), "1");
        }else if(arg0.getSource()==jpmsr_jb3) {
            cl.show(this.getContentPane(), "3");
        }


        else if(arg0.getSource()==jphy_jb3) {
            cl.show(this.getContentPane(), "3");
        }else if(arg0.getSource()==jphmd_jb1) {
            cl.show(this.getContentPane(), "1");
        }else if(arg0.getSource()==jphmd_jb2) {
            cl.show(this.getContentPane(), "2");
        }else if(arg0.getSource()==jphy_jb4){
            new QqSearch();
        }else if(arg0.getSource()==jphy_jb5){

        }
    }



    public void mouseClicked(MouseEvent arg0){
        //响应用户双击的事件并得到好友的编号；  得到编号才可以使用服务器近一步操作
        if(arg0.getClickCount()==2){//2指双击
            //得到该好友的编号
            String friendNo=((JLabel)arg0.getSource()).getText();
            //写好qqchat后注释掉这句System.out.print("你希望和"+friendNo+"聊天");//后台需要这个东西
            QqChat qqChat=new QqChat(this.owner,friendNo);
            /*Thread t=new Thread(qqChat);
            t.start();*///qqchat已经不是线程了，这个启动也没意义了

            //把聊天界面加入到管理类中
            ManageQqChat.addQqChat(this.owner+" "+friendNo,qqChat);

        }


        //if(arg0.getClickCount()==2){//2指双击





    }
    public void mouseEntered(MouseEvent arg0){
        JLabel j1=(JLabel)arg0.getSource();
        j1.setForeground(Color.red);
    }
    public void mouseExited(MouseEvent arg0){
        JLabel j1=(JLabel)arg0.getSource();
        j1.setForeground(Color.black);
    }
    public void mouseReleased(MouseEvent arg0){

    }
    public void mousePressed(MouseEvent e) {

    }



}
