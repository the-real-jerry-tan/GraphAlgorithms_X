package tan.jerry;

import org.junit.jupiter.api.Test;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class GraphAlgorithmsTest {

    @Test
    public void testBFS() {
        GraphAlgorithms ga = new GraphAlgorithms();
        Map<Integer, List<Integer>> graph = new HashMap<>();
        graph.put(0, Arrays.asList(1, 2));
        graph.put(1, Arrays.asList(0, 3));
        graph.put(2, Arrays.asList(0, 3));
        graph.put(3, Arrays.asList(1, 2));
        
        List<Integer> result = ga.bfs(0, graph);
        assertEquals(Arrays.asList(0, 1, 2, 3), result);
    }

    @Test
    public void testDFS() {
        GraphAlgorithms ga = new GraphAlgorithms();
        Map<Integer, List<Integer>> graph = new HashMap<>();
        graph.put(0, Arrays.asList(1, 2));
        graph.put(1, Arrays.asList(0, 3));
        graph.put(2, Arrays.asList(0, 3));
        graph.put(3, Arrays.asList(1, 2));
        
        List<Integer> result = ga.dfs(0, graph);
        assertEquals(Arrays.asList(0, 1, 3, 2), result);
    }

    @Test
    public void testConnectedComponents() {
        GraphAlgorithms ga = new GraphAlgorithms();
        int[][] edges = {{0, 1}, {1, 2}, {3, 4}};
        int result = ga.countConnectedComponents(5, edges);
        assertEquals(2, result); // Two connected components
    }

    @Test
    public void testNoEdges() {
        GraphAlgorithms ga = new GraphAlgorithms();
        int[][] edges = {};
        int result = ga.countConnectedComponents(5, edges);
        assertEquals(5, result); // 5 nodes, no edges means 5 components
    }
}
