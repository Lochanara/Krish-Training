package BreadthFirstSearch;

import java.util.List;

public class Node {

    private String name;
    private List<Node> vertices;
    private boolean visited;

    public Node(String name, List<Node> vertices){
        this.name = name;
        this.vertices = vertices;
    }

    public void addNodestoVertices(List<Node> nodes) {

        for (Node node : nodes)
            if(!vertices.contains(node))
                vertices.add(node);

    }

    public String getName(){
        return name;
    }

    public List<Node> getVertices(){
        return vertices;
    }

    public void visit(){
        visited = true;
    }

    public boolean isVisited(){
        return visited;
    }

    public String toString() {
        return name;
    }

}
