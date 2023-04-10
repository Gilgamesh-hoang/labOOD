package ex6;

public class Test {
    public static void main(String[] args) {
        TourAgency tourAgency = new TourAgency();
        Tour t1 = new DomesticTour("PThiet", "Phan Thiet - Mui Ne", 3, 550000);
        Tour t2 = new DomesticTour("NTrang", "Nha trang", 4, 900000);
        Tour t3 = new DomesticTour("DLNT", "Da lat - Nha trang", 4, 1250000);
        Tour t4=  new OverseasTour("Thai", "HCM - Bangkok - Pattaya - Koh Island", 5, 3600000 ,"Thailand", 500000);

        tourAgency.addTour(new FiveStarTour(t1));
        tourAgency.addTour(new SuperSaleTour(t2, 0.4));
        tourAgency.addTour(new SuperSaleTour(t4, 0.2));
        tourAgency.addTour(new FiveStarTour(t4));

        System.out.println(tourAgency.getTotalPrice());
        tourAgency.printTours();


    }
}
