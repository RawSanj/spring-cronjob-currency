package com.github.rawsanj.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "currency_rate")
public class CurrencyRate {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "code")
    private String code;

    @Column(name = "name")
    private String name;

    @Column(name = "rate")
    private Double rate;

    @Column(name = "checked_at")
    private LocalDateTime checkedAt;


    public CurrencyRate(String code, String name, Double rate, LocalDateTime updatedAt) {
        this.code = code;
        this.name = name;
        this.rate = rate;
        this.checkedAt = updatedAt;
    }

    public CurrencyRate() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getCheckedAt() {
        return checkedAt;
    }

    public void setCheckedAt(LocalDateTime checkedAt) {
        this.checkedAt = checkedAt;
    }
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getRate() {
        return rate;
    }
    public void setRate(Double rate) {
        this.rate = rate;
    }

    @Override
    public String toString() {
        return "CurrencyRate:" +
                " Code='" + code + '\'' +
                " Name='" + name + '\'' +
                " Rate=" + rate +
                " Checked At=" + checkedAt+".";
    }
}
