package com.ll.chatting_20231104.domain.chat.chatRoom.repository;

import com.ll.chatting_20231104.domain.chat.chatRoom.entity.ChatRoom;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChatRoomRepository extends JpaRepository<ChatRoom, Long> {
}
