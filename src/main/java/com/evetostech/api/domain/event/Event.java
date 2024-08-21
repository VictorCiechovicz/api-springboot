
package com.evetostech.api.domain.event;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import java.util.Date;
import java.util.UUID;

@Table(name = "event") //Nome para a tabela quando for criada
@Entity //essa anotacao informa que esta classe é uma entidade
@Getter //gera os getter da classe
@Setter //gera os setter da classe
@NoArgsConstructor //gera construtores de nao recebe argumentos
@AllArgsConstructor //gera construtores de recebe argumentos
public class Event {

    @Id
    @GeneratedValue
    private UUID id;
    private String title;
    private String description;
    private String imgUrl;
    private String eventUrl;
    private Boolean remote;
    private Date date;
}
