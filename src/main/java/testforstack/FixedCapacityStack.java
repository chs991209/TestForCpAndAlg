package testforstack;

public class FixedCapacityStack<Item> {
    private int N = 0;
    private Item[] stack;

    public FixedCapacityStack(int cap) {
        stack = (Item[]) new Object[cap];
    }
    public void push(Item item) {
        stack[N++] = item;
    }

    public int size() {
        return N;
    }

    public Item pop() {
        return stack[--N];
    }

    public boolean isEmpty() {
        return N == 0;
    }
}
