package br.edu.ufop.web.ticket.sales.domain;

import java.time.LocalDateTime;
import java.util.UUID;

import br.edu.ufop.web.ticket.sales.enums.SaleStatus;
import br.edu.ufop.web.ticket.sales.models.EventModel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SaleDomain {

    private UUID id;
    private EventModel eventId;
    private UUID userId;
    private LocalDateTime saleDate;
    private SaleStatus saleStatus;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

}
