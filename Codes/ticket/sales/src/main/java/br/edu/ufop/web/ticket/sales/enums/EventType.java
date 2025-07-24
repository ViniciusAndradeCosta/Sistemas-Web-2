package br.edu.ufop.web.ticket.sales.enums;

import lombok.Getter;

@Getter
public enum EventType {
    PALESTRA(1, "Palestra"),
    SHOW(2, "Show"),
    TEATRO(3, "Teatro"),
    CURSO(4, "Curso"),
    OUTRO(5, "Outro");

    private final Integer id;
    private final String description;

    private EventType(Integer id, String description) {
        this.id = id;
        this.description = description;
    }

    
}