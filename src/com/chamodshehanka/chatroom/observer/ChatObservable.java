package com.chamodshehanka.chatroom.observer;

import java.util.ArrayList;

/**
 * @author chamodshehanka on 11/10/2017
 * @project ChatRoom
 **/
public class ChatObservable {
    private ArrayList<ChatObserver> chatObservers = new ArrayList<>();

    public void addChatObserver(ChatObserver chatObserver){
        chatObservers.add(chatObserver);
    }

    public void removeChatObservers(ChatObserver chatObserver){
        chatObservers.remove(chatObserver);
    }

    public void notifyChatObservers(String message){
        for (ChatObserver chatObserver:
             chatObservers) {
            chatObserver.update(message);
        }
    }
}
