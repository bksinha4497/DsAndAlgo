package com.bk.gfg.algo.graphs;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFS {
    private int V;   // No. of vertices
    private LinkedList<LinkedList<Integer>> adj; //Adjacency Lists
 
    // Constructor
    BFS(int v)
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
    void BFSTraversal(int s){
    	// Create a queue for BFS
    	LinkedList<Integer> queue = new LinkedList<Integer>();
    	// Mark all the vertices as not visited(By default
    	// set as false)
    	boolean visited[] = new boolean[V];
    	// Mark the current node as visited and enqueue it
    	visited[s]=true;
    	queue.add(s);

    	while (queue.size() != 0)
    	{
    		// Dequeue a vertex from queue and print it
    		s = queue.poll();
    		System.out.print(s+" ");
    		// Get all adjacent vertices of the dequeued vertex s
    		// If a adjacent has not been visited, then mark it
    		// visited and enqueue it
    		Iterator<Integer> i = adj.get(s).listIterator();
    		while (i.hasNext())
    		{
    			int n = i.next();
    			if (!visited[n])
    			{
    				visited[n] = true;
    				queue.add(n);
    			}
    		}
    	}
    }
 
    // Driver method to
    public static void main(String args[])
    {
        BFS g = new BFS(4);
 
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
 
        System.out.println("Following is Breadth First Traversal "+
                           "(starting from vertex 2)");
 
        g.BFSTraversal(2);
    }
}
