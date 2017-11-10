/*
 * Created by JFormDesigner on Fri Nov 10 11:16:13 IST 2017
 */

package com.chamodshehanka.chatroom.ui;

import java.awt.event.*;
import com.chamodshehanka.chatroom.observer.ChatObservable;
import com.chamodshehanka.chatroom.observer.ChatObserver;

import java.awt.*;
import javax.swing.*;

/**
 * @author Chamod Shehanka
 */
public class ChatWindow extends JFrame implements ChatObserver{

    private ChatObservable observable;
    private String userName;
    private String message;

    public ChatWindow(ChatObservable chatObservable,String userName) {
        initComponents();
        this.observable=chatObservable;
        this.userName = userName;
        setTitle(userName);
        setSize(600,400);
        setVisible(true);
    }

    private void txtMessageActionPerformed(ActionEvent e) {
        observable.notifyChatObservers(userName+ ":"+txtMessage.getText());
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Chamod Shehanka
        txtMessage = new JTextField();
        scrollPane1 = new JScrollPane();
        textAreaChat = new JTextArea();

        //======== this ========
        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //---- txtMessage ----
        txtMessage.addActionListener(e -> txtMessageActionPerformed(e));
        contentPane.add(txtMessage, BorderLayout.SOUTH);

        //======== scrollPane1 ========
        {
            scrollPane1.setViewportView(textAreaChat);
        }
        contentPane.add(scrollPane1, BorderLayout.CENTER);
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Chamod Shehanka
    private JTextField txtMessage;
    private JScrollPane scrollPane1;
    private JTextArea textAreaChat;

    @Override
    public void update(String message) {
        textAreaChat.append(message+"\n");
    }
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
