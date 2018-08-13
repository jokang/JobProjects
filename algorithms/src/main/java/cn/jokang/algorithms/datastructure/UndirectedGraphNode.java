package cn.jokang.algorithms.datastructure;

import java.util.ArrayList;
import java.util.List;

class UndirectedGraphNode {
    private int label;
    private List<UndirectedGraphNode> neighbors;

    public UndirectedGraphNode(int x) {
        label = x;
        neighbors = new ArrayList<>();
    }

    public int getLabel() {
        return label;
    }

    public List<UndirectedGraphNode> getNeighbors() {
        return neighbors;
    }
};
