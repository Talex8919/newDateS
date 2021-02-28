package kg.megacome.course.comparators;

import kg.megacome.course.models.Acura;

import java.util.Comparator;

public abstract class AcuraComparator implements Comparator<Acura> {
    public long yearSelection(Acura zoneDateTime1, Acura zoneDateTime2) {

        return zoneDateTime1.getYear().compareTo(zoneDateTime2.getYear());
    }
}
