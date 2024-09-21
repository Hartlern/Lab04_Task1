//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        double doublePurchase = 15;
        double doubleTax = 0.05 * doublePurchase;
        double doubleFinal = doublePurchase + doublePurchase * doubleTax;
        //i added a little extra hope thats okay
        System.out.println("For the price of " + doublePurchase + " and a sales tax of 0.05%, the price of the tax is " + doubleTax + " and the final price is " + doubleFinal);



    }
}