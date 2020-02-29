package code401challenges.graph;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class GraphTest {

    @Test
    public void testGraphVertex() {
        Graph<String> graphBuild = new Graph<>();
        graphBuild.addVertex("logan");
        graphBuild.addVertex("hank");
        graphBuild.addVertex("scott");
        graphBuild.addVertex("raven");
        String expectedOutput = "{logan=[], raven=[], hank=[], scott=[]}";
        assertEquals("should return string of all graph vertices", expectedOutput, graphBuild.getVertices());
    }

    @Test
    public void testGraphSize() {
        Graph<String> graphBuild = new Graph<>();
        graphBuild.addVertex("logan");
        graphBuild.addVertex("hank");
        graphBuild.addVertex("scott");
        graphBuild.addVertex("raven");
        assertEquals("should return size of graph", 4, graphBuild.size());
    }

    @Test
    public void testGraphEdge() {
        Graph<String> graphBuild = new Graph<>();
        graphBuild.addVertex("logan");
        graphBuild.addVertex("hank");
        graphBuild.addVertex("scott");
        graphBuild.addVertex("raven");
        graphBuild.addEdge("logan", "hank", true);
        graphBuild.addEdge("scott", "logan", false);
        String expectedOutput = "{logan=[hank], raven=[], hank=[logan], scott=[logan]}";
        assertEquals("should return string of all graph vertices and related edges", expectedOutput, graphBuild.getVertices());
    }

    @Test
    public void testGraphAdjacent() {
        Graph<String> graphBuild = new Graph<>();
        graphBuild.addVertex("logan");
        graphBuild.addVertex("hank");
        graphBuild.addVertex("scott");
        graphBuild.addVertex("raven");
        graphBuild.addEdge("logan", "hank", true);
        graphBuild.addEdge("scott", "logan", false);
        graphBuild.addEdge("logan", "jean", true);
        graphBuild.addEdge("raven", "logan", false);
        List<String> expectedOutput = new ArrayList<>();
        expectedOutput.add("hank");
        expectedOutput.add("jean");
        assertEquals("should return string of all graph vertices and related edges", expectedOutput, graphBuild.getAdjacent("logan"));
    }

    @Test
    public void testGraphVertexInteger() {
        Graph<Integer> graphBuild = new Graph<>();
        graphBuild.addVertex(0);
        graphBuild.addVertex(99);
        graphBuild.addVertex(42);
        graphBuild.addVertex(75);
        String expectedOutput = "{0=[], 99=[], 42=[], 75=[]}";
        assertEquals("should return string of all graph vertices", expectedOutput, graphBuild.getVertices());
    }

    @Test
    public void testGraphBreadthFirstTraversal() {
        Graph<String> graph = new Graph<>();
        graph.addVertex("pandora");
        graph.addEdge("pandora", "arendelle", true);
        graph.addEdge("arendelle", "metroville", false);
        graph.addEdge("arendelle", "monstropolis", false);
        graph.addEdge("metroville", "monstropolis", false);
        graph.addEdge("metroville", "narnia", false);
        graph.addEdge("metroville", "naboo", false);
        graph.addEdge("narnia", "naboo", false);
        graph.addEdge("metropolis", "naboo", false);
        List<String> expectedOutput = new ArrayList<>();
        expectedOutput.add("pandora");
        expectedOutput.add("arendelle");
        expectedOutput.add("metroville");
        expectedOutput.add("monstropolis");
        expectedOutput.add("narnia");
        expectedOutput.add("naboo");
        assertEquals("should return list of adjacent vertices in breadth first order", expectedOutput, graph.breadthFirstTraversal("pandora"));
    }
}