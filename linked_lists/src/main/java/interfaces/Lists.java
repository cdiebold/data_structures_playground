package interfaces;


public interface Lists<T> {
    int size();
    boolean isHead();
    boolean isTail();
    boolean isEmpty();
    T getTail();

    //insertions

    void insertFront(T data);
    void insertLast(T data);
    void insertAt(T data, int index);

    //deletions

    T deleteFront();
    T deleteLast();
    T deleteAt(int index);


    void reverseRecursive();
    void reverse();



}
