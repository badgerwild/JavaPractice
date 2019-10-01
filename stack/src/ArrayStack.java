import java.util.EmptyStackException;

public interface ArrayStack <T>{

    void push(T t)
            throws FullStackException;
    T pop()
            throws EmptyStackException;
    int top()
            throws EmptyStackException;
    int size();
    boolean isEmpty();

}
