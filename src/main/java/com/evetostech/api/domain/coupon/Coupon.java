package com.evetostech.api.domain.coupon;


import com.evetostech.api.domain.event.Event;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.UUID;

@Table(name = "coupon")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Coupon {

    @Id
    @GeneratedValue
    private UUID id;

    private String code;
    private Integer discount;
    private Date valid;

    @ManyToOne //essa notacao informa que essa um evento pode ter varios cupons mas um cupom pode pretencer só um evento
    @JoinColumn(name = "event_id")
    // essa notacao faz um join na tabela Event colocando o id do evento na coluna event_id
    private Event event;
}
