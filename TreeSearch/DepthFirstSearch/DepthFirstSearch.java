package DepthFirstSearch;

import java.util.*;

public class DepthFirstSearch {

    public static void main(String[] args) {

        Node node0 = new Node("0", new ArrayList<>());
        Node node1 = new Node("1", new ArrayList<>());
        Node node2 = new Node("2", new ArrayList<>());
        Node node3 = new Node("3", new ArrayList<>());
        Node node4 = new Node("4", new ArrayList<>());
        Node node5 = new Node("5", new ArrayList<>());
        Node node6 = new Node("6", new ArrayList<>());
        Node node7 = new Node("7", new ArrayList<>());

        node0.addNodestoVertices(Arrays.asList(node3));
        node1.addNodestoVertices(Arrays.asList(node2));
        node2.addNodestoVertices(Arrays.asList(node1, node6));
        node3.addNodestoVertices(Arrays.asList(node5, node7));
        node4.addNodestoVertices(Arrays.asList(node7));
        node5.addNodestoVertices(Arrays.asList(node3, node6));
        node6.addNodestoVertices(Arrays.asList(node2, node5));
        node7.addNodestoVertices(Arrays.asList(node3, node4));

        Stack stack = new Stack();
        stack.add(node0);
        HashSet searchSet = new LinkedHashSet();

        while(!stack.empty()) {

            Node node = (Node)stack.peek();
            Node tempNode = node;
            searchSet.add(node);
            List<Node> vertices = node.getVertices();

            for (Node n : vertices) {

                if (!n.isVisited()) {

                    stack.add(n);
                    n.visit();
                    node = n;
                    break;

                }

            }

            if (tempNode == node) {

                node = (Node)stack.pop();

            }

        }

        System.out.println(searchSet);

    }

}
