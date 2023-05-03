class Payment {
    private double amountPaid;
    private double totalCost;

    public Payment(double totalCost) {
        this.totalCost = totalCost;
    }

    public void setAmountPaid(double amountPaid) {
        this.amountPaid = amountPaid;
    }

    public double getAmountPaid() {
        return amountPaid;
    }

    public double getChange() {
        return amountPaid - totalCost;
    }
}
