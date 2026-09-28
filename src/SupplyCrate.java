public class SupplyCrate {
    String itemName;
    String originRegion;
    int baseValue;
    boolean isContraband;
    boolean isReserved;

    public SupplyCrate(String itemName, String originRegion,
                       int baseValue, boolean isContraband) {

        this.itemName = itemName;
        this.originRegion = originRegion;
        this.baseValue = baseValue;
        this.isContraband = isContraband;
        this.isReserved = false;
    }
}
