package com.ll.chatting_20231104.global.initData;

import com.ll.chatting_20231104.domain.chat.chatRoom.entity.ChatRoom;
import com.ll.chatting_20231104.domain.chat.chatRoom.service.ChatRoomService;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.stream.IntStream;

@Configuration
@Profile("!prod")
public class NotProd {
    @Bean
    public ApplicationRunner initNotProd(ChatRoomService chatRoomService) {
        return args -> {
            ChatRoom chatRoom1 = chatRoomService.make("room1");
            ChatRoom chatRoom2 = chatRoomService.make("room2");
            ChatRoom chatRoom3 = chatRoomService.make("room3");

            IntStream.rangeClosed(1, 100).forEach(no -> {
                chatRoomService.write(chatRoom1.getId(), "홍길동", "내용" + no);
            });
        };
    }
}
