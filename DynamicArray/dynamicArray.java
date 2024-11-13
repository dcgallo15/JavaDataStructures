// TODO: Use templates to make it not just an int[]
class DynamicArray {
    private int[] arr;
    private int size;
    private int maxSize;

    public DynamicArray() {
        this.size = 0;
        this.arr = new int [5];
        this.maxSize = 5;
    }

    public int size() {
        return this.size;
    }

    public void append(int element) {
        if(this.size == this.maxSize) {
            // reallocate more space since array is full
            maxSize = maxSize + 5;
            int[] newArr = new int[maxSize];
            System.arraycopy(this.arr, 0, newArr, 0, maxSize - 5);
            //System.out.println(Arrays.toString(newArr));
            this.arr = newArr;
            newArr = null;
        }
        this.arr[size] = element;
        this.size = this.size + 1;
    }

    public void printArray() {
        for(int i = 0;i< this.size;++i) {
            System.out.print(this.arr[i]);
            System.out.print(", ");
        }
    }
}

class dynamicArray {
    public static void main(String[] args) {
        DynamicArray arr = new DynamicArray();
        for(int i = 0; i< 5;++i){
            arr.append(i);
        }
        arr.printArray();
        System.out.println();
        for(int i = 5; i< 10;++i){
            arr.append(i);
        }
        arr.printArray();
    }
}
