package lpmms.fsil.mysimplestack;

import org.junit.Test;

import java.util.EmptyStackException;

import static org.junit.Assert.*;

public class DefaultSimpleStackTest {

    @Test
    public void isEmpty() {
       // when creating a new stack
        SimpleStack stack = new DefaultSimpleStack();

        // then the stack is empty
        assertTrue(stack.isEmpty());
    }


    @Test
    public void push() {
        // Given an empty stack and an item
        SimpleStack stack = new DefaultSimpleStack();
        Item item = new Item();

        // When the item is pushed in the stack
        stack.push(item);

        // Then…
        assertFalse("The stack must be not empty", stack.isEmpty());
        assertEquals("The stack constains 1 item", 1, stack.getSize());
        assertSame("The pushed item is on top of the stack", item, stack.peek());
    }


    @Test(expected = EmptyStackException.class)
    public void testPopOnEmptyStack()  throws EmptyStackException {
        // Given an empty stack
        SimpleStack stack = new DefaultSimpleStack();

        // When we « pop » the stack
        stack.pop(); // should throws an EmptyStackException.
    }

    @Test
    public void pop() {
        // Given a non empty stack with 2 items
        SimpleStack stack = new DefaultSimpleStack();
        Item item = new Item();
        Item item1 = new Item();
        stack.push(item);
        stack.push(item1);

        // When we pop the stack
        Item topItem = stack.pop();

        // Then…
        assertEquals("The stack constains 1 item", 1, stack.getSize());
        assertSame("The first item is on top of the stack", item, stack.peek());
        assertSame(item1, topItem);
    }

    @Test(expected = EmptyStackException.class)
    public void testPeekOnEmptyStack()  throws EmptyStackException {
        // Given an empty stack
        SimpleStack stack = new DefaultSimpleStack();

        // When we « pop » the stack
        stack.peek(); // should throws an EmptyStackException.
    }
}
