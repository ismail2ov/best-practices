package demeterlaw;

public class HouseImpl implements House {

    private Address address;

    @Override
    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public Address getAddress() {
        return address;
    }
}
