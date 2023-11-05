package com.ll.chatting_20231104.domain.chat.chatRoom.entity;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

import static jakarta.persistence.GenerationType.IDENTITY;
import static lombok.AccessLevel.PROTECTED;


@Entity
@NoArgsConstructor(access = PROTECTED)
@AllArgsConstructor(access = PROTECTED)
@Builder
@EntityListeners(AuditingEntityListener.class)
public class ChatMessage {
    @ManyToOne
    private ChatRoom chatRoom;

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Getter
    private long id;

    @Getter
    @CreatedDate
    private LocalDateTime createDate;

    @Getter
    @LastModifiedDate
    private LocalDateTime modifiedDate;

    @Getter
    private String writerName;

    @Getter
    private String content;

}