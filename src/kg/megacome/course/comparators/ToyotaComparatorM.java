package kg.megacome.course.comparators;

import kg.megacome.course.models.Toyota;

import java.util.Comparator;


public class ToyotaComparatorM implements Comparator<Toyota> {
        public int compare(Toyota toyotaModel1 ,Toyota toyotaModel2) {

            return toyotaModel1.getModel().compareTo(toyotaModel2.getModel()) ;
        }

    }

