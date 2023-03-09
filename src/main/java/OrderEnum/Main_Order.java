package OrderEnum;

import java.sql.SQLOutput;

public class Main_Order {

    public static void main(String[] args) {

        Order order1 = new Order("123", OrderStatus.IN_DELIVERY);
        Order order2 = new Order("456", OrderStatus.COMPLETED);
        Order order3 = new Order("789", OrderStatus.IN_PROGRESS);


        System.out.println(order1.getId());
        System.out.println(order2.getStatus());
        System.out.println(OrderEnum.OrderStatus.COMPLETED.getDeliveryNote());

        switch(order2.getStatus()) {
            case RECEIVED:
                System.out.println(OrderStatus.RECEIVED.getDeliveryNote());
                break;
            case IN_PROGRESS:
                System.out.println(OrderStatus.IN_PROGRESS.getDeliveryNote());
                break;
            case IN_DELIVERY:
                    System.out.println(OrderStatus.IN_DELIVERY.getDeliveryNote());
                    break;
            case COMPLETED:
                System.out.println(OrderStatus.COMPLETED.getDeliveryNote());
                break;
            case CANCELLED:
                System.out.println(OrderStatus.CANCELLED.getDeliveryNote());
                break;
            default:
                System.out.println("Status unknown. Please contact support.");
                break;

        }

        switch (order1.getStatus()) {
            case RECEIVED -> System.out.println(OrderStatus.RECEIVED.getDeliveryNote());
            case IN_PROGRESS -> System.out.println(OrderStatus.IN_PROGRESS.getDeliveryNote());
            case IN_DELIVERY -> System.out.println(OrderStatus.IN_DELIVERY.getDeliveryNote());
            case COMPLETED -> System.out.println(OrderStatus.COMPLETED.getDeliveryNote());
            case CANCELLED -> System.out.println(OrderStatus.CANCELLED.getDeliveryNote());
            default -> System.out.println("Status unknown. Please contact support.");
        }

    }
}
