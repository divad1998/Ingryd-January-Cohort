package Week5;

public class MyDoubleLinkedListImpl {
    Element[] elements;
    int index = 0;

    public MyDoubleLinkedListImpl(int size) {
        elements = new Element[size];
    }

    void add(Element node) {
        elements[index] = node;
        index++;
    }

    Element get(int i) {
        Element node = elements[i];
        int nextIndex = i + 1;
        int prevIndex = i;

        node.next = elements[nextIndex];
        if (prevIndex == 0) {
            node.prev = null;
        } else {
            node.prev = elements[--prevIndex];
        }

        return node;
    }

    public static void main(String[] args) {
        MyDoubleLinkedListImpl list = new MyDoubleLinkedListImpl(3);
        list.add(new Element(2));
        list.add(new Element(3));

        System.out.println(list.get(0).value);
        System.out.println(list.get(0).next.value);
    }
}

class Element {
    Object value;
    Element next;
    Element prev;

    public Element(Object value) {
        this.value = value;
    }
}
