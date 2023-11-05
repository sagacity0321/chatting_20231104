package com.ll.chatting_20231104.domain.chat.chatMessage.repository;

import com.ll.chatting_20231104.domain.chat.chatMessage.entity.ChatMessage;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ChatMessageRepository extends JpaRepository<ChatMessage, Long> {
    List<ChatMessage> findByChatRoomIdAndIdAfter(long roomId, long afterId);
}
