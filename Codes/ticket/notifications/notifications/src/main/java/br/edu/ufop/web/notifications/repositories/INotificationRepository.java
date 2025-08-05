package br.edu.ufop.web.notifications.repositories;

import br.edu.ufop.web.notifications.model.NotificationModel;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;


public interface INotificationRepository extends JpaRepository<NotificationModel, UUID> {

    List<NotificationModel> findAllByUserId(UUID userId);
    List<NotificationModel> findAllByUserIdIn(List<UUID> userIdList);

    
}
