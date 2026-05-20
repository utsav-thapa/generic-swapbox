package generics;

public class SwapBox<T> {
    private T leftItem;
    private T rightItem;

    public SwapBox(T leftItem, T rightItem) {
        this.leftItem = leftItem;
        this.rightItem = rightItem;
    }

    public T getLeftItem() {
        return leftItem;
    }

    public T getRightItem(){
        return rightItem;
    }

    public void setLeftItem(T leftItem){
        this.leftItem = leftItem;
    }

    public void setRightItem(T rightItem) {
        this.rightItem = rightItem;
    }

    public void swap() {
        T left = this.leftItem;
        T right = this.rightItem;

        leftItem = right;
        rightItem = left;
    }

    public String describe() {
        return "Left: " + this.leftItem + ", Right: " + this.rightItem;
    }

    public boolean itemsMatch() {
        return (this.leftItem == this.rightItem);
    }

    public boolean contains(T item) {
        return this.leftItem.equals(item) || this.rightItem.equals(item);
    }



}
