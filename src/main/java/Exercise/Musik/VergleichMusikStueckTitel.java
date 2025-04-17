    package Exercise.Musik;

    import java.util.Comparator;

    public class VergleichMusikStueckTitel implements Comparator<MusikStueck> {

        @Override
        public int compare(MusikStueck a, MusikStueck b){
            return a.getTitel().compareTo(b.getTitel());
        }

    }
