# Journal

## Phase 1
An ArrayList is different from an Array because an ArrayList can grow
or shrink as items are added or removed. A regular array has a fixed
size. I found ArrayList easier because I can use methods such as add(),
remove(), size(), and indexOf(). The main thing I had to remember was
to import java.util.ArrayList and that the index starts at 0.

## Phase 2
For the risk filter, I used a for-each loop to check every SupplyCrate
in the inventory. I used the || OR operator because an item should be
considered high-risk if it is contraband OR if its base value is over
1000 gold. Only one of those conditions needs to be true.
## Phase 3
I refactored the program by moving the inventory and inventory-related
logic from Main into a TradingPost class. This made the Main class
simpler because it is now mainly responsible for creating objects and
calling methods.

The TradingPost class now handles adding items, removing items,
checking inventory size, finding items, identifying high-risk items,
and checking whether an item is approved. This organization makes the
program easier to read and makes the inventory logic easier to reuse
or modify later.