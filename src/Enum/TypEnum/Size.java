package Enum.TypEnum;

enum Size {
    XSMALL("Bardzo mały"), SMALL("Mały"), MEDIUM("Sredni"), LARGE("Duży");

    private final String description;

    Size(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return description + " " + name() + " " + ordinal();
    }

    public static Size fromDescription(String description) {
        Size[] values = values();
        for (Size size : values) {
            if (size.getDescription().equals(description))
                return size;
        }
            return null;
    }



}
