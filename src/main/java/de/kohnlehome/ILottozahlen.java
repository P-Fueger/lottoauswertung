package de.kohnlehome;

import java.util.Date;

public interface ILottozahlen {

    int[] aktuelleLottozahlen();
    int[] lottozahlen(Date datum);
}
