package Subiect04;

import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;

public class Bilet {
    private TipTransport tip;
    private LocalDate dataEmiterii;
    private Double price;

    public Bilet(LocalDate dataEmiterii, Double price) {
        super();
        this.dataEmiterii = dataEmiterii;
        this.price = price;
    }

    public Double getPrice() {
        return price;
    }

    public String getDataEmiterii() {
        return dataEmiterii.toString();
    }
}
