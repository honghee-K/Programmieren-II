package Exercise.Fahrt;

import java.util.List;

public abstract class Fahrzeug {

    List<Fahrt> fahrtenbuch;
    public abstract double berechneEntgelte(Fahrt f);


}
