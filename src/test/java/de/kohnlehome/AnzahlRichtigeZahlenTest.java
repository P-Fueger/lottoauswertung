package de.kohnlehome;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

import static org.assertj.core.api.Assertions.*;
import static org.mockito.Mockito.*;


public class AnzahlRichtigeZahlenTest {
    private IAnzahlRichtigeZahlen anzahlRichtigeZahlen;

    @BeforeEach
    public void init(){
        ILottozahlen lottozahlen = mock(ILottozahlen.class);
        when(lottozahlen.aktuelleLottozahlen()).thenReturn(new int[]{1,2,3,4,5,6});
        when(lottozahlen.lottozahlen(new Date("2012-01-20"))).thenReturn(new int[]{2,4,6,1,9});
        anzahlRichtigeZahlen = new AnzahlRichtigeZahlen(lottozahlen);
    }

    @Test
    public void anzahlRichtigeTest4Richtige(){
        // ===== ACT =====
        // zu testende Methode aufrufen
       int result = anzahlRichtigeZahlen.anzahlRichtige(new int[]{1,2,3,4,5,6}, new Date("2012-01-20"));
       assertThat(result).isEqualTo(4);
    }
}