public class YoungIngener extends Engineer {


    @Override
    public void setRate(double rate) {
        super.setRate(rate/2);
    }

    @Override
    public void countSalary() {
        super.countSalary();
        super.drinkVodka();
    }

}
