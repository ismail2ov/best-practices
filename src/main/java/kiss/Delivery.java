package kiss;

public class Delivery {

    public boolean checkAddress() {
        return true;
    }

    public boolean hasCarrier() {
        return true;
    }

    void validateDelivery() throws Exception {
        if (!checkAddress()) {
            throw new Exception("Invalid address");
        }

        if (!hasCarrier()) {
            throw new Exception("No carrier");
        }
    }
}
