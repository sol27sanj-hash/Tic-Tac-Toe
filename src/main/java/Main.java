public class Main{

    // Main method
    public static void main(String[] args) {

        int slot = 7; // Example input (can change 1–9)

        int row = getRowFromSlot(slot);
        int col = getColFromSlot(slot);

        System.out.println("Slot: " + slot);
        System.out.println("Row: " + row);
        System.out.println("Column: " + col);
    }

    // Method to get row index
    static int getRowFromSlot(int slot) {
        if (slot < 1 || slot > 9) {
            throw new IllegalArgumentException("Slot must be between 1 and 9");
        }
        return (slot - 1) / 3;
    }

    // Method to get column index
    static int getColFromSlot(int slot) {
        if (slot < 1 || slot > 9) {
            throw new IllegalArgumentException("Slot must be between 1 and 9");
        }
        return (slot - 1) % 3;
    }
}