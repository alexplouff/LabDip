package dip.lab2;

/**
 * An example low-level class. Does this class definition follow the DIP?
 * If not, fix it.
 *
 * Any other best practice violations? Fix them too.
 *
 * @author your name goes here
 */
public class FoodServiceTipCalculator implements CalculatorInterface {
    private static final double MIN_BILL = 0.00;
    private static final String BILL_ENTRY_ERR =
            "Error: bill must be greater than or equal to " + MIN_BILL;
    private static final double GOOD_RATE = 0.20;
    private static final double FAIR_RATE = 0.15;
    private static final double POOR_RATE = 0.10;

    private double bill;
    private ServiceQuality serviceQuality;
    
    public FoodServiceTipCalculator( ServiceQuality quality , double billAmt ) {
        this.setServiceQuality(quality);
        this.setBill(billAmt);
    }

    @Override
    public double getTipAmount() {
        double tip = 0.00; // always initialize local variables

        switch(serviceQuality) {
            case GOOD:
                tip = bill * GOOD_RATE;
                break;
            case FAIR:
                tip = bill * FAIR_RATE;
                break;
            case POOR:
                tip = bill * POOR_RATE;
                break;
        }

        return tip;
    }

    public final void setBill(double billAmt) {
        if(billAmt < MIN_BILL) {
            throw new IllegalArgumentException(BILL_ENTRY_ERR);
        }
        bill = billAmt;
    }

    @Override
    public final void setServiceQuality( ServiceQuality quality ) {
        // No need to validate because enums provide type safety!
        serviceQuality = quality;
    }

    @Override
    public ServiceQuality getServiceQuality() {
        return serviceQuality;
    }
    
    public String toString(){
        return "Bill Amount: " + bill
                +"\nService Quality: " + getServiceQuality()
                +"\nTip Amount: $" + getTipAmount();
    }

}
