package com.driver.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "reservation")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int numberOfHours;

    @ManyToOne
    @JoinColumn
    private User user;

    @ManyToOne
    @JoinColumn
    private Spot spot;

    @OneToOne
    @JoinColumn
    private Payment payment;
}
