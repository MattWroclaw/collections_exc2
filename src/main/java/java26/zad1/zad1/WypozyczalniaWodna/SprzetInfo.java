package java26.zad1.zad1.WypozyczalniaWodna;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.print.DocFlavor;
import java.time.LocalDateTime;
@Data
@AllArgsConstructor
public class SprzetInfo {
    private String nrBurtowy;
    private Sprzet sprzet;
    private LocalDateTime godzWypozyczenia;

    public SprzetInfo(Sprzet sprzet, String nrBurtowy){
        this.sprzet=sprzet;
        this.nrBurtowy = nrBurtowy;
    }

    public SprzetInfo(String numerBurtwy, SprzetInfo rodzajSprzetu, LocalDateTime now) {
    }
}
