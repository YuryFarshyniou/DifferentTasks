package java_rush_tasks.collections.lesson_1.task_2028.by.yurachel.tree.main;

import java.io.Serializable;
import java.util.*;

public class CustomTree extends AbstractList<String> implements Cloneable, Serializable {
    Entry<String> root;
    List<Entry<String>> queue = new LinkedList<>();

    public CustomTree() {
        this.root = new Entry<>("0");
        queue.add(root);
    }

    @Override
    public String get(int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public String set(int index, String element) {
        throw new UnsupportedOperationException();

    }

    @Override
    public void add(int index, String element) {
        throw new UnsupportedOperationException();

    }

    @Override
    public String remove(int index) {
        throw new UnsupportedOperationException();

    }

    @Override
    public List<String> subList(int fromIndex, int toIndex) {
        throw new UnsupportedOperationException();

    }

    @Override
    public boolean addAll(int index, Collection<? extends String> c) {
        throw new UnsupportedOperationException();

    }

    @Override
    protected void removeRange(int fromIndex, int toIndex) {
        throw new UnsupportedOperationException();

    }

    public String getParent(String name) {
        for (Entry<String> entry : queue) {
            if (entry.elementName.equals(name)) {
                return entry.parent.elementName;
            }
        }

        return null;
    }

    @Override
    public boolean remove(Object o) {
        Set<Entry<String>> remove = new HashSet<>();

        if (!(o instanceof String)) {
            throw new UnsupportedOperationException();
        }
        String entryName = (String) o;
        Entry<String> entryElem = null;
        int indexElem = 0;
        for (Entry<String> entry : queue) {
            if (entry.elementName.equals(entryName)) {
                entryElem = entry;
                indexElem = queue.indexOf(entry);
                break;
            }
        }
        Entry<String> parent = entryElem.parent;

        if (parent.leftChild != null && parent.leftChild.equals(entryElem)) {
            parent.leftChild = null;
        }
        if (parent.rightChild != null && parent.rightChild.equals(entryElem)) {
            parent.rightChild = null;

        }
        recursion(entryElem, remove);

        queue.removeAll(remove);


        return false;
    }

    public void recursion(Entry<String> entry, Set<Entry<String>> removers) {

        if (entry.rightChild == null && entry.leftChild == null) {
            removers.add(entry);
            return;
        }
        if (entry.leftChild != null) {
            removers.add(entry);
            Entry<String> left = entry.leftChild;
            recursion(left, removers);
        }
        if (entry.rightChild != null) {
            removers.add(entry);
            Entry<String> right = entry.rightChild;
            recursion(right, removers);
        }

    }


    @Override
    public boolean add(String s) {

        Entry<String> entryElement = new Entry<>(s);
        for (Entry<String> entry : queue) {


            if (!entry.availableToAddRightChildren && entry.rightChild == null &&
                    !entry.availableToAddLeftChildren && entry.leftChild == null) {
                entry.leftChild = entryElement;
                entry.availableToAddRightChildren = true;
            }

            if (entry.isAvailableToAddChildren()) {
                if (entry.availableToAddLeftChildren) {
                    entry.leftChild = entryElement;
                    entryElement.parent = entry;
                    entry.availableToAddLeftChildren = false;
                    return queue.add(entryElement);
                }
                if (entry.availableToAddRightChildren) {
                    entry.rightChild = entryElement;
                    entryElement.parent = entry;
                    entry.availableToAddRightChildren = false;
                    return queue.add(entryElement);
                }
            }
        }
        return false;
    }

    @Override
    public int size() {
        return queue.size() - 1;
    }

    static class Entry<T> implements Serializable {
        String elementName;
        boolean availableToAddLeftChildren, availableToAddRightChildren;
        Entry<T> parent, leftChild, rightChild;

        public Entry(String elementName) {
            this.elementName = elementName;
            this.availableToAddLeftChildren = true;
            this.availableToAddRightChildren = true;
        }

        public boolean isAvailableToAddChildren() {
            return this.availableToAddRightChildren | this.availableToAddLeftChildren;
        }

        @Override
        public String toString() {
            return "Entry{" +
                    "elementName='" + elementName + '\'' +
                    '}';
        }

    }
}
