public class Racer extends Employee {

    @Override
    public void countSalary() {
        setSalary(getQuantity() * getRate());
    }



}
