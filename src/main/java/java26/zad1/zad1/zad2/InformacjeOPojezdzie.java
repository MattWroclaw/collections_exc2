package java26.zad1.zad1.zad2;

import javafx.util.converter.LocalDateStringConverter;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor

public class InformacjeOPojezdzie {
    private String nrRej;
    private TypPojazdu typPojazdu;
    private LocalDateTime dataWjazdu;

    public InformacjeOPojezdzie(String nrRej, TypPojazdu typPojazdu) {
        this.nrRej = nrRej;
        this.typPojazdu = typPojazdu;
    }
}
