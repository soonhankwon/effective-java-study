package com.soon.effectivejavastudy.chapter1.item07.listener;

import org.junit.jupiter.api.Test;

import java.lang.ref.WeakReference;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;

class ChatRoomTest {

    @Test
    void chatRoom() throws InterruptedException {
        ChatRoom chatRoom = new ChatRoom();
        User user1 = new User();
        User user2 = new User();

        chatRoom.addUser(user1);
        chatRoom.addUser(user2);

        chatRoom.sendMessage("hello");

        user1 = null;

        System.gc();

        Thread.sleep(5000L);

        // WeakHashMap 의 기능이기 때문에 False
        List<WeakReference<User>> users = chatRoom.getUsers();
        assertFalse(users.size() == 1);
    }
}