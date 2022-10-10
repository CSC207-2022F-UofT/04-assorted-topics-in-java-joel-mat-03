/* TODO: Create a subclass of Trader named DrivableTrader
 * This class should be identical to Trader, except that it takes
 * only Drivable objects in its inventory, wishlist, etc.
 *
 * The sellingPrice returned should also be overridden. The selling price
 * should be equal to the:
 *     Object's price + Object's max speed
 * If the object is Tradable (and Tradable.MISSING_PRICE otherwise.)
 *
 * Look at DomesticatableTrader.java for an example.
 */

import java.util.ArrayList;
import java.util.List;

class DrivableTrader extends Trader<Drivable> {
    public DrivableTrader(List<Drivable> inventory, List<Drivable> wishlist, int money) {
        super(inventory, wishlist, money);
    }

    public DrivableTrader(int mon) {
        super(mon);
    }

    public void addToWishlist(Drivable item) {
        super.addToWishlist(item);
    }

    public int getSellingPrice(Drivable item) {
        if (item instanceof Tradable) {
            return super.getSellingPrice(item) + item.getMaxSpeed();
        }
        else {
            return Tradable.MISSING_PRICE;
        }
    }

    /**
     * Exchange money from other to this Trader according to the price of item,
     * if other has enough money. Otherwise, returns False.
     *
     * @return True if the exchange was completed.
     */
    public boolean exchangeMoney(Trader<Drivable> other, Drivable item) {
        return super.exchangeMoney(other, item);
    }

    /**
     * Attempt to sell all items that are in both this Trader's inventory
     * and in other's wishlist.
     *
     * @return True iff at least one item was sold from this Trader to other
     */
    public boolean sellTo(Trader<Drivable> other) {
        return super.sellTo(other);
    }

    /**
     * Buy items from other.
     *
     * @return True iff at least one item was bought from other.
     */
    public boolean buyFrom(Trader<Drivable> other) {
        return super.buyFrom(other);
    }


}
