package template1;

public class courier extends IcecreamDelivery{
    private String address;
    private String phoneNumber;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    @Override
    public void delivery() {
        System.out.println("The courier will be on the spot within 90 minutes");
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public String toString(){
        return "Your order is accepted!!"+"\nAddress:"+address+"\nphone number:"+phoneNumber;
    }

}

