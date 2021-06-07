package examples.by.yurachel.blinov.patterns.structural_patterns.composite.example;

public class RunComposite {
    public static void main(String[] args) {
        TCPChannel channel1 = new TCPChannel(1);
        TCPChannel channel2 = new TCPChannel(2);
        UDPChannel channel3 = new UDPChannel(3);
        UDPChannel channel4 = new UDPChannel(4);
        UDPChannel channel9 = new UDPChannel(9);

        CompositeTool mainTool = new CompositeTool(170);
        CompositeTool childTool1 = new CompositeTool(10);
        CompositeTool childTool2 = new CompositeTool(11);

        childTool1.add(channel1);
        childTool1.add(channel2);
        childTool1.add(channel3);
        childTool2.add(channel4);

        mainTool.add(childTool1); //add channels tool(1,2,3).
        mainTool.add(childTool2); //add channels tool(4)
        mainTool.add(channel9); // add single channel 9.
        System.out.println("main tool send.");
        mainTool.send();
        childTool1.remove(channel2);
        mainTool.remove(childTool2);
        System.out.println("\nMain ool send after remove:");
        mainTool.send();
    }
}
