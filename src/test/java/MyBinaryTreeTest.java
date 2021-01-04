import org.junit.Assert;
import org.junit.Test;

public class MyBinaryTreeTest {
    @Test
    public void given3NumbersWhenAddedToBinarySearchTreeShouldReturnSizeIsTrue() {
        MyBinaryTree<Integer> binaryTree = new MyBinaryTree<>();
        binaryTree.add(56);
        binaryTree.add(30);
        binaryTree.add(70);
        int sizeOfBinaryTree = binaryTree.getSize();
        Assert.assertEquals(3, sizeOfBinaryTree);
    }
}