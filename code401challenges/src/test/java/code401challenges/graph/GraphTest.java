package code401challenges.graph;

import org.junit.Before;
import org.junit.Test;

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
        String expectedOutput = "[hank, jean]";
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
}