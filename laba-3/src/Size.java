enum Size {
    XXS(32, "Детский размер"),
    XS(34, "Взрослый размер"),
    S(36, "Взрослый размер"),
    M(38, "Взрослый размер"),
    L(40, "Взрослый размер");

    private final int euroSize;
    private final String description;

    Size(int euroSize, String description) {
        this.euroSize = euroSize;
        this.description = description;
    }

    public int getEuroSize() {
        return euroSize;
    }

    public String getDescription() {
        return description;
    }
}
