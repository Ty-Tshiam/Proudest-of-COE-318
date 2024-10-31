package coe318.lab7;

public class Node {

    private static int id = 0;
    public int idnum;

    public Node() {
        idnum = id++;
    }

    @Override
    public String toString() {
        return Integer.toString(idnum);
    }

}
