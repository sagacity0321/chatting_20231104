package com.ll.chatting_20231104.domain.chat.chatRoom.controller;

import com.ll.chatting_20231104.domain.chat.chatRoom.entity.ChatRoom;
import com.ll.chatting_20231104.domain.chat.chatRoom.service.ChatRoomService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/chat/room")
@RequiredArgsConstructor
public class ChatRoomController {
    private final ChatRoomService chatRoomService;

    @GetMapping("/{roomId}")
    @ResponseBody
    public String showRoom(
            @PathVariable final long roomId,
            @RequestParam(defaultValue = "Noname") String writerName
    ) {
        return "chat room: %d. writer: %s".formatted(roomId, writerName);
    }

    @GetMapping("/make")
    public String showMake(
    ) {
        return "domain/chat/chatRoom/make";
    }

    @PostMapping("/make")
    public String make(
            final String name
    ) {
        chatRoomService.make(name);
        return "redirect:/chat/room/make?message=Chat room Created";
    }

    @GetMapping("/list")
    @ResponseBody
    public List<ChatRoom> showList(
    ) {
        return chatRoomService.findAll();
    }
}

