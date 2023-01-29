package com.driver.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "payment")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private boolean paymentCompleted;
    @Enumerated(value = EnumType.STRING)
    private PaymentMode paymentMode;
    @OneToOne(mappedBy = "payment")
    private Reservation reservation;
}
