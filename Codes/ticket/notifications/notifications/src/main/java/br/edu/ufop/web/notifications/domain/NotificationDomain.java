package br.edu.ufop.web.notifications.domain;

import java.util.UUID;
import java.time.LocalDateTime;

import br.edu.ufop.web.notifications.enums.EnumNotificationType;
import lombok.AllArgsConstructor;
import lombok.Builder; 
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class NotificationDomain {

    private UUID id;
    private UUID userId; //User

    private String service;
    private EnumNotificationType notificationType;

    private String subject;
    private String content;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    private LocalDateTime sentAt;
    private LocalDateTime readAt;
    
}
