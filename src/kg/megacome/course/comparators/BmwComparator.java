package kg.megacome.course.comparators;

import kg.megacome.course.models.Bmw;
import kg.megacome.course.models.Hyundai;

import java.util.Comparator;


public class BmwComparator implements Comparator<Bmw> {
    public int compare(Bmw bmwCost1 , Bmw bmwCost2){
        if(bmwCost1.getCarCost()== bmwCost2.getCarCost()){
            return 0;
        }
        else if (bmwCost1.getCarCost()> bmwCost2.getCarCost()){
            return 1;
        }
        else return -1;
    }

    public static class HyndaiComparator implements Comparator<Hyundai> {
        public int compare(Hyundai hyndaiCost1, Hyundai hyndaiCost2) {
            if (hyndaiCost1.getCarCost() == hyndaiCost2.getCarCost()) {
                return 0;
            } else if (hyndaiCost1.getCarCost() > hyndaiCost1.getCarCost()) {
                return 1;
            } else return -1;
        }

    }
}