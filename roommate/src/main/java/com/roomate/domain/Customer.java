package com.roomate.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

import org.springframework.util.StringUtils;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@Table(indexes = {
        @Index(name = "idx_first_name_last_name", columnList = "firstName,lastName"),
        @Index(name = "idx_email", columnList = "email")})
@EqualsAndHashCode(callSuper = true)
public class Customer extends BaseEntity {

    private static final long serialVersionUID = 4510680420289546192L;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false, unique = false)
    private String password;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Column(nullable = true)
    private String mobile;

    @Enumerated(EnumType.STRING)
    private CustomerType customerType = CustomerType.STANDARD;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private CustomerStatus customerStatus = CustomerStatus.ACTIVE;

    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "customer", targetEntity = Room.class, orphanRemoval = true)
    private List<Room> rooms;


    public enum CustomerStatus {
        ACTIVE, PASSIVE, LOCKED
    }


    public enum CustomerType {
        STANDARD,
        PREMIUM
    }
}
