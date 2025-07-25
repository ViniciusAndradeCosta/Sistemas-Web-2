package br.edu.ufop.web.ticket.sales.enums;

import lombok.Getter;

@Getter
public enum SaleStatus {
    EM_ABERTO(1, "Em aberto"),
    PAGO(2, "Pago"),
    CANCELADO(3, "Cancelado"),
    ESTORNADO(4, "Estornado");

    private final Integer id;
    private final String description;

    SaleStatus(Integer id, String description) {
        this.id = id;
        this.description = description;
    }
}