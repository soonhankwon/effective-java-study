package com.soon.effectivejavastudy.chapter2.item26.genericdao;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class MessageRepository {

    private Set<Message> messages;

    public MessageRepository(Set<Message> messages) {
        this.messages = new HashSet<>();
    }

    public Optional<Message> findById(Long id) {
        return messages.stream().filter(a -> a.getId().equals(id)).findAny();
    }

    public void add(Message message) {
        this.messages.add(message);
    }
}
