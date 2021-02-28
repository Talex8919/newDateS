package kg.megacome.course.comparators;

import kg.megacome.course.models.Toyota;

import java.util.Comparator;

public abstract class ToyotaComparator implements Comparator<Toyota> {
    public boolean equals(Toyota o1, Toyota o2) {
        if (Boolean.TRUE.equals(o2.isHybrid(true))) {
            return true;
        } else if (Boolean.TRUE!=(o1.isHybrid(true))) {
            return false;
        }
       else return  false;
    }
}








