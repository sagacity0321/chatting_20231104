package com.ll.chatting_20231104.domain.chat.chatMessage.entity;

import com.ll.chatting_20231104.domain.chat.chatRoom.entity.BaseEntity;
import com.ll.chatting_20231104.domain.chat.chatRoom.entity.ChatRoom;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.*;
import lombok.experimental.SuperBuilder;

import static lombok.AccessLevel.PROTECTED;


@Entity
@Getter
@Setter
@SuperBuilder
@NoArgsConstructor(access = PROTECTED)
@AllArgsConstructor(access = PROTECTED)
@ToString(callSuper = true)
public class ChatMessage extends BaseEntity {
    @ManyToOne
    private ChatRoom chatRoom;
    private String writerName;
    private String content;

}