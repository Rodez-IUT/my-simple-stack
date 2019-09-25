package lpmms.fsil.mysimplestack;

import org.junit.Test;

import static org.junit.Assert.*;

public class TreeTest {

    @Test
    public void hasLeaves() {
        // given a tree
        Tree aTree = new Tree();
        // expect he has leaves
        assertTrue(aTree.hasLeaves());
    }
}
