package com.roomate.domain;

import javax.persistence.*;

import lombok.Data;

@Data
@Entity
public class Address extends BaseEntity {

    private static final long serialVersionUID = 6063494407805468339L;

    @OneToOne
    @JoinColumn(name = "room_id", nullable = false)
    private Room room;

    @Column(nullable = false)
    private String buildingNrOrName;

    @Column(nullable = false)
    private String street;

    @Column(nullable = true)
    private String postcode;

    @Column(nullable = true)
    private String city;

    @Enumerated(EnumType.STRING)
    @Column(nullable = true)
    private Country country = Country.TR;

}
