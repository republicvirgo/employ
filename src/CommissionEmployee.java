/**
 * SMTI06, M Haidar Hanif, 54411850 Part of Employ
 */

// CommissionEmployee class extends Employee.

public class CommissionEmployee extends Employee {

  private double grossSales; // gross weekly sales
  private double commissionRate; // commission percentage

  // five-argument constructor
  public CommissionEmployee(String first, String last, String ssn,
                            double sales, double rate) {
    super(first, last, ssn);
    setGrossSales(sales);
    setCommissionRate(rate);
  }

  // set commission rate
  public void setCommissionRate(double rate) {
    if (rate > 0 && rate <= 100) {
      commissionRate = (rate / 100);
    } else if (rate > 100) {
      commissionRate = 1;
    } else {
      commissionRate = 0;
    }
  }

  // return commission rate
  public double getCommissionRate() {
    return commissionRate;
  }

  // set gross sales amount
  public void setGrossSales(double sales) {
    grossSales = (sales <= 0) ? 0 : sales;
  }

  // return gross sales amount
  public double getGrossSales() {
    return grossSales;
  }

  // calculate earnings; override abstract method earnings in Employee
  public double earnings() {
    return getCommissionRate() * getGrossSales();
  }

  // return String representation of CommissionEmployee object
  public String toString() {
    return String.format("%s: %s\n%s: $%,.2f; %s: %.2f",
                         "commission employee", super.toString(),
                         "gross sales", getGrossSales(),
                         "commission rate", getCommissionRate());
  }

}
