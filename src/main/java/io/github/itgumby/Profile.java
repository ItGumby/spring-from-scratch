package io.github.itgumby;

public class Profile {
    private String name;
    private String address;

    public Profile() {
        super();
    }

    public String getName() { return name; }
    public void setName(String n) { name = n; }
    public String getAddress() { return address; }
    public void setAddress(String a) { address = a; }

    @Override
    public String toString() {
        return String.format("{name: \"%s\", address: \"%s\"}", name, address);
    }
}
