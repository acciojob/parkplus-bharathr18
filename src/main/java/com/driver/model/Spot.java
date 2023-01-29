package com.driver.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "spot")
@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class Spot {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int pricePerHour;
    private boolean occupied;

    @Enumerated(value = EnumType.STRING)
    private SpotType spotType;

    @ManyToOne
    @JoinColumn
    private ParkingLot parkingLot;

    @OneToMany(mappedBy = "spot", cascade = CascadeType.ALL)
    private List<Reservation> reservationList;
}
