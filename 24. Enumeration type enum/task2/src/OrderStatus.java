public enum OrderStatus {

    NEW("złożono zamówienie, ale jeszcze go nie opłacono"),
    PAID("zamówienie opłacono"),
    SHIPPED("zamówienie wysłano"),
    DELIVERED("zamówienie dostarczono"),
    CANCELLED("zamówienie anulowano");

    private final String description;

    OrderStatus(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return description;
    }
}
