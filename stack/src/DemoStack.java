import java.util.EmptyStackException;

    public class DemoStack<T> implements ArrayStack<T> {

        private T[] holder;
        //set to -1 because otherwise when we push to the stack the first item will be placed at position 1
        private int top = -1;

        DemoStack(int stacksize) {
            holder = (T[]) new Object[stacksize];
        }

        public void push(T t) {
            try {
                if (top >= holder.length) {
                    throw new FullStackException();
                } else {
                    holder[top + 1] = t;
                    top++;
                }
            } catch (FullStackException e) {
                e.getMessage();
            }
        }

        @Override
        public int top() throws EmptyStackException {
            if (top == -1) {
                throw new EmptyStackException();
            } else
                return top;

        }

        @Override
        public int size() {
            return holder.length;
        }

        @Override
        public boolean isEmpty() {
            if (top < 0) {
                return true;
            } else
                return false;
        }

        @Override
        public T pop() throws EmptyStackException {
            if (isEmpty()) {
                throw new EmptyStackException();
            }
            top -= 1;
            return holder[top + 1];


        }
    }

