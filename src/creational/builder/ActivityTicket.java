package creational.builder;

public class ActivityTicket {

    private final String activityName;
    private final String activityCode;
    private final String operator;
    private final String city;
    private final double price;

    private ActivityTicket(ActivityTicketBuilder builder) {
        this.activityCode = builder.activityCode;
        this.activityName = builder.activityName;
        this.price = builder.price;
        this.operator = builder.operator;
        this.city = builder.city;
    }

    @Override
    public String toString() {
        return "ActivityTicket{" +
                "activityName='" + activityName + '\'' +
                ", activityCode='" + activityCode + '\'' +
                ", operator='" + operator + '\'' +
                ", city='" + city + '\'' +
                ", price=" + price +
                '}';
    }

    public static class ActivityTicketBuilder {
        private String activityName;
        private String activityCode;
        private String operator;
        private String city;
        private double price;

        public ActivityTicketBuilder(String activityName, String activityCode) {
            this.activityName = activityName;
            this.activityCode = activityCode;
        }

        public ActivityTicketBuilder setActivityName(String activityName) {
            this.activityName = activityName;
            return this;
        }

        public ActivityTicketBuilder setActivityCode(String activityCode) {
            this.activityCode = activityCode;
            return this;
        }

        public ActivityTicketBuilder setOperator(String operator) {
            this.operator = operator;
            return this;
        }

        public ActivityTicketBuilder setCity(String city) {
            this.city = city;
            return this;
        }

        public ActivityTicketBuilder setPrice(double price) {
            this.price = price;
            return this;
        }

        public ActivityTicket build() {
            return new ActivityTicket(this);
        }
    }
}
