package demeterlaw;

public interface Address {

    void setName(String string);

    void setZipCode(String string);

    String getZipCode();

    public abstract String getName();
}
