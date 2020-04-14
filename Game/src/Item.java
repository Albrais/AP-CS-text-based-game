public class Item {

    private String name;
    private int goldValue;
    public Item(String name, int value){
        this.name = name;
        goldValue = value;
    }

    public int getGoldValue() {
        return goldValue;
    }

    public String getName() {
        return name;
    }

    public void setGoldValue(int goldValue) {
        this.goldValue = goldValue;
    }

    public void setName(String name) {
        this.name = name;
    }

}
