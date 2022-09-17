import java.util.List;

public class Main {
    public static void main(String[] args) {

        //graph initialize
      DijkstrasShortestPathAdjacencyList graph1=new DijkstrasShortestPathAdjacencyList(12);

        //add edge


        //2
        graph1.addEdge(1,2,7);
        //3
        graph1.addEdge(1,3,6);
        //4
        graph1.addEdge(1,4,3);
        //5
        graph1.addEdge(2,5,2);
        graph1.addEdge(3,5,5);
        //6
        graph1.addEdge(3,6,4);
        graph1.addEdge(4,6,7);
        //7
        graph1.addEdge(4,7,3);
        //8
        graph1.addEdge(5,8,9);
        graph1.addEdge(6,8,2);
        //9
        graph1.addEdge(6,9,5);
        graph1.addEdge(7,9,2);
        //10
        graph1.addEdge(7,10,7);
        //11
        graph1.addEdge(8,11,3);
        graph1.addEdge(9,11,6);
        graph1.addEdge(10,11,4);

        //check graph
      for (List<DijkstrasShortestPathAdjacencyList.Edge>edges:graph1.getGraph())
      {
        for (DijkstrasShortestPathAdjacencyList.Edge edgess:edges)
        {
          System.out.println("from"+edgess.from+"  to" +edgess.to+"   cost"+edgess.cost);
        }
      }

      //get result
      double RouteLength= graph1.dijkstra(1,11);
      List<Integer> Path1=graph1.reconstructPath(1,11);




      //print result
      System.out.println("************************************************");
      System.out.println("Opt lenth is :"+RouteLength);
      System.out.println("Opt route is :"+Path1.toString());

    }


}