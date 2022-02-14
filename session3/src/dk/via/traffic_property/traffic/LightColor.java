package dk.via.traffic_property.traffic;

public enum LightColor {
    GREEN, YELLOW, RED, RED_YELLOW;

    public LightColor next() {
        return switch (this) {
            case GREEN -> YELLOW;
            case YELLOW -> RED;
            case RED -> RED_YELLOW;
            case RED_YELLOW -> GREEN;
        };
    }
}
