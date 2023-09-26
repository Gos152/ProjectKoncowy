package pl.coderslab.model;

public class CartItem {
    private Integer quantity;
    private Hoodie hoodie;

    // Konstruktor klasy CartItem
    public CartItem(Integer quantity, Hoodie hoodie) {
        this.quantity = quantity;
        this.hoodie = hoodie;
    }

    // Metoda dostępu do właściwości quantity
    public Integer getQuantity() {
        return quantity;
    }

    // Metoda ustawiająca właściwość quantity
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    // Metoda dostępu do właściwości product
    public Hoodie getHoodie() {
        return hoodie;
    }

    // Metoda ustawiająca właściwość product
    public void setHoodie(Hoodie hoodie) {
        this.hoodie = hoodie;
    }

    @Override
    public String toString() {
        return "CartItem [quantity=" + quantity + ", hoodie=" + hoodie + "]";
    }
}
