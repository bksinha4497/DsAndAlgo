package com.bk.gfg.algo.graphs;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DFS {
    private int V;   // No. of vertices
    private LinkedList<LinkedList<Integer>> adj; //Adjacency Lists
 
    // Constructor
    DFS(int v)
    {
        V = v;
        adj = new LinkedList<LinkedList<Integer>>();
        for (int i=0; i<v; ++i)
         adj.add(new LinkedList<>());
    }
 
    // Function to add an edge into the graph
    void addEdge(int v,int w)
    {
        adj.get(v).add(w);
    }
 
    // prints BFS traversal from a given source s
    void DFSTraversal(int node,boolean visited[]){
    	System.out.print(node+" ");
    	visited[node]=true;
    	Iterator<Integer> i= adj.get(node).iterator();
    	while(i.hasNext()) {
    		int e =i.next();
    		if(!visited[e]) {
    			DFSTraversal(e, visited);
    		}
    	}
    }
 
    // Driver method to
    public static void main(String args[])
    {
        DFS g = new DFS(4);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
        System.out.println("Following is Breadth First Traversal "+
                           "(starting from vertex 2)");
        boolean visited[] = new boolean[4]; 
        g.DFSTraversal(2,visited);
        
    }
}
