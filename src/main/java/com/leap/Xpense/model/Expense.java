package com.leap.Xpense.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="expense")
public class Expense {

    @Id
    private Long id;

    private Instant expensedate;

    private String descript;

    @ManyToOne
    private Category category;

    @ManyToOne
    private User user;
}
