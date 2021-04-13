public class Block {
    // Good Luck!
    private int width;
    private int height;
    private int length;

    public int getWidth() {
        return this.width;
    }
    public int getLength() {
        return this.length;
    }
    public int getHeight() {
        return this.height;
    }
    public int getVolume() {
        return this.length * this.width * this.height;
    }
    public int getSurfaceArea() {
        return (2 * (this.length * this.width)) + (2 * (this.length * this.height)) + (2 * (this.height * this.width));
    }

    public Block(int[] arr) {
        this.width = arr[0];
        this.length = arr[1];
        this.height = arr[2];
    }
}