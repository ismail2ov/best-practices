package demeterlaw;

public class PersonImpl implements Person {
    private House house;

    @Override
    public void setHouse(House house) {
        this.house = house;
    }

    @Override
    public House getHouse() {
        return house;
    }
}
