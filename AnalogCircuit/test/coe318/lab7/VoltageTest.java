package coe318.lab7;

import org.junit.Test;
import static org.junit.Assert.*;

public class VoltageTest {

    @Test
    public void testGetNodes() {
        System.out.println("getNodes");
        Node node1 = new Node();
        Node node2 = new Node();
        Voltage instance = new Voltage(10, node1, node2);
        Node[] expResult = {node1, node2};
        Node[] result = instance.getNodes();
        assertArrayEquals(expResult, result);
    }

    @Test
    public void testNegative() {
        System.out.println("negative");
        Node node1 = new Node();
        Node node2 = new Node();
        Voltage instance = new Voltage(10, node1, node2);
        Node[] nodes = instance.getNodes();
        boolean result = instance.negative(nodes);
        assertFalse(result); // In this case, it should be false
    }


}
