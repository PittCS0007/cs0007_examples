import java.util.Scanner;

public class ShippingCosts {
  public static void main(String[] args) {
    // get the package weight
    Scanner input = new Scanner(System.in);

    System.out.print("Enter the package weight in pounds: ");
    double weight = input.nextDouble();
    // sanity check
    //System.out.println("I read this: " + weight);

    // compute the cost
    double cost = 0.0;
    if (weight < 2.0) {
      // handle < 2lb
      cost = 5.0;
    }
    else if (weight < 6.0) {
      // handle >=2lb and <6lb
      double overage = weight - 2.0;
      double overage_cost = overage * 1.5;
      cost = 5.0 + overage_cost;
    }
    else if (weight < 10.0) {
      // handle >=6lb and <10lb
      double overage = weight - 6.0;
      double overage_cost = overage * 1.25;
      cost = 11.0 + overage_cost;
    }
    else {
      // handle >=10lb
      double overage = weight - 10.0;
      cost = 16.0 + overage;
    }
    // output result to user
    System.out.println("The cost to ship a " + weight + "lb package is: " + cost);
  }
}
