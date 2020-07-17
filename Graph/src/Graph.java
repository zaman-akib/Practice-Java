import java.util.*;

public class Graph {
	LinkedList<Integer>[] adjList;
    int V;
    int[] color;
    int[] d;
    
    Graph(int v)
    {
        V=v;
        adjList= new LinkedList[V];
        for(int i=0;i<v;i++)
        {
            adjList[i]=new LinkedList<Integer>();
        }
        color=new int[V];
        d=new int[V];
    }
    
    void addEdge(int v1,int v2)
    {
        adjList[v1].add(v2);
        adjList[v2].add(v1);
    }
    
    void BFS(int s)
    {
    	for(int u=0;u<V;u++)
        {
    		if(u==s) continue;
            color[u]=0;
            d[u]=Integer.MAX_VALUE;
        }
        color[s]=1;
        d[s]=0;
        LinkedList<Integer> Q=new LinkedList();
        Q.add(s);
        while(!Q.isEmpty())
        {
            int u=Q.poll();
            for(int v : adjList[u])
            {
            	if(color[v]==0)
            	{
            		color[v]=1;
            		d[v]=d[u]+6;
            		Q.add(v);
            	}
            }
            color[u]=2;
        }
        for(int i=1;i<V;i++)
        {
        	if(i==s) continue;
        	else if(d[i]==Integer.MAX_VALUE) System.out.print("-1 ");
        	else System.out.print(d[i]+" ");
        }
    }

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int q;
		q=sc.nextInt();
		
		for(int i=1;i<=q;i++)
		{
			int n;
			int m;
			n=sc.nextInt();
			m=sc.nextInt();
			Graph g=new Graph(n+1);
			for(int j=1;j<=m;j++)
			{
				int u,v;
				u=sc.nextInt();
				v=sc.nextInt();
				g.addEdge(u, v);
			}
			int s=sc.nextInt();
			g.BFS(s);
			System.out.print("\n");
		}

	}

}
