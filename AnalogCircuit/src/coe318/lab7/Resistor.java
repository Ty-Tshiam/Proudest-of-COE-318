package coe318.lab7;

public class Resistor {

    private double ohms;
    Node[] nodes;
    private static int id = 1;
    private int idnum;

    public Resistor(double resistance, Node node1, Node node2) {
        if (resistance <= 0) {
            throw new IllegalArgumentException("resistance cannot be equal or less than 0");
        }
        if (node1 == null || node2 == null) {
            throw new IllegalArgumentException("node(s) cannot be null");
        }
        ohms = resistance;
        nodes = new Node[2];
        nodes[0] = node1;
        nodes[1] = node2;
        idnum = id++;
    }

    public Node[] getNodes() {
        return nodes;
    }

    @Override
    public String toString() {
        if (nodes[0].idnum < nodes[1].idnum) {
            return "R" + idnum + " " + nodes[0].toString() + " " + nodes[1].toString() + " " + ohms + "\n";
        } else {
            return "R" + idnum + " " + nodes[1].toString() + " " + nodes[0].toString() + " " + ohms + "\n";
        }
    }
}
