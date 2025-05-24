package Comportamentals.ChainOfResponsability.MagazineRezolvare;

import MagazineRezolvare.Produs;

import java.util.List;

public interface ICautare {
    List<Produs> cautare(List<Produs> produse,String brand,Float pretMaxim, Float marime);
}
