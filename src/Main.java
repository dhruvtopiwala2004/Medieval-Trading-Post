public class Main {
    static void main() {
        System.out.println("Hello World!");
    public static void main(String[] args) {

        TradingPost tradingPost = new TradingPost();

        SupplyCrate crate1 =
                new SupplyCrate("Iron Ore", "Northern Highlands", 500, false);

        SupplyCrate crate2 =
                new SupplyCrate("Silk", "Eastern Isles", 1200, false);

        SupplyCrate crate3 =
                new SupplyCrate("Dragon Egg", "Forbidden Mountains", 2000, true);

        SupplyCrate crate4 =
                new SupplyCrate("Wheat", "Western Farms", 100, false);

        tradingPost.addItem(crate1);
        tradingPost.addItem(crate2);
        tradingPost.addItem(crate3);
        tradingPost.addItem(crate4);

        System.out.println("Total items: "
                + tradingPost.getInventorySize());

        System.out.println("Silk position: "
                + tradingPost.findItem(crate2));

        tradingPost.printHighRiskItems();

        crate2.isReserved = true;

        System.out.println("Silk approved: "
                + tradingPost.isApproved(crate2));

        System.out.println("Iron Ore approved: "
                + tradingPost.isApproved(crate1));
    }
}