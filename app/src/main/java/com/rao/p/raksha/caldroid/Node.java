package com.rao.p.raksha.caldroid;

/**
 * Created by Raksha on 23-Nov-15.
 */
public class Node {
    public String data;
    public Node leftChild;
    public Node rightChild;
    public Node prev;
    public double expval;
    public double mark;

    public Node(String x) {
        data = x;
        leftChild = null;
        rightChild = null;
        prev = null;
        expval = 0;
    }
}
