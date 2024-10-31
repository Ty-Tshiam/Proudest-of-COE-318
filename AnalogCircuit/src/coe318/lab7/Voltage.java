package coe318.lab7;

public class Voltage {

    private double volts;
    Node[] nodes;
    private static int id = 1;
    private int idnum;

    public Voltage(double voltageval, Node node1, Node node2) {
        if (node1 == null || node2 == null) {
            throw new IllegalArgumentException("node(s) cannot be null");
        }
        volts = voltageval;
        nodes = new Node[2];
        nodes[0] = node1;
        nodes[1] = node2;
        idnum = id++;

    }

    public Node[] getNodes() {
        return nodes;
    }

    public boolean negative(Node nodes[]) {

        return (nodes[0].idnum > nodes[1].idnum);

    }

    @Override
    public String toString() {
        if (negative(nodes)) {
            return "V" + idnum + " " + nodes[1].toString() + " " + nodes[0].toString() + " DC -" + volts + "\n";
        } else {
            return "V" + idnum + " " + nodes[0].toString() + " " + nodes[1].toString() + " DC " + volts + "\n";
        }
    }
}
