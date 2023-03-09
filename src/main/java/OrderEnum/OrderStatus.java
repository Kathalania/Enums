package OrderEnum;

public enum OrderStatus {

    RECEIVED("Received"),
    IN_PROGRESS("In progress"),
    IN_DELIVERY("In delivery"),
    COMPLETED("Completed"),
    CANCELLED("Cancelled");

    private String deliveryNote;
    private OrderStatus (String deliveryNote){
        this.deliveryNote = deliveryNote;
    }

    public String getDeliveryNote(){
        return deliveryNote;
    }
}
