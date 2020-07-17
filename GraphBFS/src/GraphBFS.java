import java.util.*;

public class GraphBFS {
    LinkedList<Integer>[] adjList;
    int V;
    int[] color;
    int[] d;
    int[] pi;
    
    GraphBFS(int v)
    {
        V=v;
        adjList= new LinkedList[V];
        for(int i=0;i<v;i++)
        {
            adjList[i]=new LinkedList<Integer>();
        }
        color=new int[V];
        d=new int[V];
        pi=new int[V];
    }
    
    void addEdge(int v1,int v2)
    {
        adjList[v1].add(v2);
    }
    
    void BFS()
    {
    	for(int u=0;u<V;u++)
        {
            color[u]=0;
            d[u]=Integer.MAX_VALUE;
            pi[u]=-1;
        }
        for(int u=0;u<V;u++)
        {
            if(color[u]==0)
                BFS_visit(u);
        }
    }
    
    void BFS_visit(int s)
    {
        color[s]=1;
        d[s]=0;
        pi[s]=-1;
        
        LinkedList<Integer> Q=new LinkedList();
        Q.add(s);
        
        while(!Q.isEmpty())
        {
            int u=Q.poll();
            System.out.print(u+" ");
            for(int i=0;i<adjList[u].size();i++)
            {
            	int v=adjList[u].get(i);
            	if(color[v]==0)
            	{
            		color[v]=1;
            		d[v]=d[u]+1;
            		pi[v]=u;
            		Q.add(v);
            	}
            }
            color[u]=2;
        }
        
    }
    
    public static void main(String[] args)
    {
        GraphBFS g=new GraphBFS(8); //Disconnected graph
        g.addEdge(0,1);
        g.addEdge(0,3);
        g.addEdge(0,4);
        g.addEdge(1,2);
        g.addEdge(1,4);
        g.addEdge(2,0);
        g.addEdge(3,4);
        g.addEdge(3,5);
        g.addEdge(5,4);
        g.addEdge(6,3);
        g.addEdge(6,4);
        g.addEdge(6,7);
        g.addEdge(7,4);
        
        System.out.print("BFS Order => ");
        g.BFS();
    }
    
}
