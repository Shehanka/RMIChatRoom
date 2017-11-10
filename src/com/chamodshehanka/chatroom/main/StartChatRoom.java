package com.chamodshehanka.chatroom.main;

import com.chamodshehanka.chatroom.observer.ChatObservable;
import com.chamodshehanka.chatroom.ui.ChatWindow;

/**
 * @author chamodshehanka on 11/10/2017
 * @project ChatRoom
 **/
public class StartChatRoom {
    public static void main(String[] args) {
        ChatObservable chatObservable = new ChatObservable();
        chatObservable.addChatObserver(new ChatWindow(chatObservable,"Chamod"));
        chatObservable.addChatObserver(new ChatWindow(chatObservable,"Fluffy"));
    }
}
