package com.genie.fineapple.server;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.messaging.simp.annotation.SendToUser;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

import java.security.Principal;

@Slf4j
@RequiredArgsConstructor
@Controller
public class PassController {

    private final SimpMessagingTemplate messagingTemplate;

    public static class HelloMessage {
        private String name;
        public HelloMessage() {
        }
        public HelloMessage(String name) {
            this.name = name;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
    }

    public static class Greeting {
        private String content;
        public Greeting() {
        }
        public Greeting(String content) {
            this.content = content;
        }
        public String getContent() {
            return content;
        }
    }

    @MessageMapping("/hello")
    public void greeting(Principal principal, HelloMessage message) throws Exception {
        messagingTemplate.convertAndSendToUser(principal.getName(), "/queue/message"
                , new Greeting("Hello, " + HtmlUtils.htmlEscape(message.getName()) + "!"));
    }

}