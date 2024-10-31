package coe318.lab7;

import java.util.Scanner;

public class UserMain {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Circuit c1 = Circuit.getInstance();

        System.out.println("Enter your circuit:");
        String comp = "";

        while (!(comp.equals("end"))) {
            comp = input.nextLine();
            String[] tokens = comp.split("\\s+");
            if (!(comp.equals("end"))) {
                if (comp.contains("r")) {
                    Node node = new Node();
                    Node node1 = new Node();
                    char nodeval = tokens[1].charAt(0);
                    node.idnum = Character.getNumericValue(nodeval);
                    nodeval = tokens[2].charAt(0);
                    node1.idnum = Character.getNumericValue(nodeval);
                    double resistance = Double.parseDouble(tokens[3]);
                    Resistor newohm = new Resistor(resistance, node, node1);
                    c1.add(newohm);
                } else if (comp.contains("v")) {
                    Node node = new Node();
                    Node node1 = new Node();
                    char nodeval = tokens[1].charAt(0);
                    node.idnum = Character.getNumericValue(nodeval);
                    nodeval = tokens[2].charAt(0);
                    node1.idnum = Character.getNumericValue(nodeval);
                    double volts = Double.parseDouble(tokens[3]);
                    Voltage newsource = new Voltage(volts, node, node1);
                    c1.add(newsource);
                }
                if (comp.equals("spice")) {
                    System.out.println(c1);
                }
            }
        }
        System.out.println("All Done");
    }
}
