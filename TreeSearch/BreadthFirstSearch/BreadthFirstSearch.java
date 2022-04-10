package BreadthFirstSearch;

import java.util.*;

public class BreadthFirstSearch {

    public static void main(String[] args) {

        Node nodeA = new Node("A", new ArrayList<>());
        Node nodeB = new Node("B", new ArrayList<>());
        Node nodeC = new Node("C", new ArrayList<>());
        Node nodeD = new Node("D", new ArrayList<>());
        Node nodeE = new Node("E", new ArrayList<>());
        Node nodeF = new Node("F", new ArrayList<>());
        Node nodeG = new Node("G", new ArrayList<>());

        nodeA.addNodestoVertices(Arrays.asList(nodeB, nodeC));
        nodeB.addNodestoVertices(Arrays.asList(nodeD));
        nodeC.addNodestoVertices(Arrays.asList(nodeE, nodeG));
        nodeD.addNodestoVertices(Arrays.asList(nodeB));
        nodeE.addNodestoVertices(Arrays.asList(nodeF, nodeC));
        nodeF.addNodestoVertices(Arrays.asList(nodeG, nodeE));
        nodeG.addNodestoVertices(Arrays.asList(nodeF, nodeC));

        Queue queue = new LinkedList();
        queue.add(nodeA);
        HashSet searchSet = new LinkedHashSet();

        while(!queue.isEmpty()) {

            Node node = (Node) queue.remove();
            searchSet.add(node);
            List<Node> vertices = node.getVertices();

            for (Node n : vertices) {

                if (!n.isVisited()) {

                    queue.add(n);
                    n.visit();

                }

            }

        }

        System.out.println(searchSet);

    }

}
