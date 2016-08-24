/**
 * Created by jugal on 8/23/2016.
 */
public class PriorityQueueNode {
    Object element;
    Integer key;
    PriorityQueueNode left;
    PriorityQueueNode right;

    public PriorityQueueNode(Object element) {
        left = null;
        right = null;
        this.element = element;
    }

    public PriorityQueueNode() {
        left = null;
        right = null;
        this.element = null;
    }

    public void insert(Object o) {

    }
}
