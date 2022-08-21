package exc3;

public enum Vehicles {

    Audi(10000, "Black") {
        @Override
        public int getPriceVehicle() {
            return priceVehicle;
        }

        @Override
        public String getColors() {
            return colors;
        }

        @Override
        public String getCurrency() {
            return "Euro";
        }

    },

    Volkswagen(1000, "Gray") {
        @Override
        public int getPriceVehicle() {
            return priceVehicle;
        }

        @Override
        public String getColors() {
            return colors;
        }

        @Override
        public String getCurrency() {
            return "USD";
        }

    };

    Vehicles(int priceVehicle, String colors) {
        this.priceVehicle = priceVehicle;
        this.colors = colors;
    }

    int priceVehicle;
    String colors;

    @Override
    public String toString() {
        return "Car: " + super.toString() + ", price = " + getPriceVehicle() + ",color: " + getColors();
    }

    public String getColors() {
        return colors;
    }

    public int getPriceVehicle() {
        return priceVehicle;
    }

    public String getName() {
        return super.toString();
    }

    public abstract String getCurrency();
}
