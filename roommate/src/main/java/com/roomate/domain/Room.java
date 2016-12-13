package com.roomate.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import org.eclipse.persistence.oxm.annotations.XmlInverseReference;

import java.math.BigDecimal;

import javax.persistence.*;
import javax.validation.constraints.Size;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Created by isa.kalinsaz on 13/12/2016.
 */

@Data
@Entity
@Table(indexes = {
        @Index(name = "idx_title", columnList = "title"),
        @Index(name = "idx_description", columnList = "description")})
@EqualsAndHashCode(callSuper = true)
public class Room extends BaseEntity {

    @Column(nullable = false, length = 128)
    private String title;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private BigDecimal price;

    @Column(nullable = false, precision = 5, scale = 2)
    private BigDecimal space;

    @Column(nullable = false, length = 5)
    private String numberOfRoom;

    @Enumerated(EnumType.STRING)
    private LookingFor lookingFor = LookingFor.DOES_NOT_MATTER;

    @JoinColumn(name = "address_id", nullable = false)
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "room", targetEntity = Address.class, orphanRemoval = true)
    private Address address;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer;

    public enum LookingFor {
        MALE,
        FEMALE,
        DOES_NOT_MATTER
    }
}
