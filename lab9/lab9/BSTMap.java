package lab9;

import java.util.Iterator;
import java.util.Set;

/**
 * Implementation of interface Map61B with BST as core data structure.
 *
 * @author Your name here
 */
public class BSTMap<K extends Comparable<K>, V> implements Map61B<K, V> {

    private class Node {
        /* (K, V) pair stored in this Node. */
        private K key;
        private V value;
        private int size;

        /* Children of this Node. */
        private Node left;
        private Node right;

        private Node(K k, V v) {
            key = k;
            value = v;
            size = 0;
        }
    }

    private Node root;  /* Root node of the tree. */
    private int size; /* The number of key-value pairs in the tree */

    // the number of items in the subtree with Node p as root.
    private int size(Node p) {
        return size(p.left)+size(p.right);
    }
    /* Creates an empty BSTMap. */
    public BSTMap() {
        this.clear();
    }

    /* Removes all of the mappings from this map. */
    @Override
    public void clear() {
        root = null;
        size = 0;
    }

    /** Returns the value mapped to by KEY in the subtree rooted in P.
     *  or null if this map contains no mapping for the key.
     */
    private V getHelper(K key, Node p) {
        if(p==null) {return null;}
        if(key.compareTo(p.key)<0) {
            return getHelper(key,p.left);
        }else if(key.compareTo(p.key)>0) {
            return getHelper(key,p.right);
        }else {return p.value;}
    }

    /** Returns the value to which the specified key is mapped, or null if this
     *  map contains no mapping for the key.
     */
    @Override
    public V get(K key) {
        if(size==0) {return null;}
        if(key.compareTo(root.key)<0) {
            return getHelper(key,root.left);
        }else if(key.compareTo(root.key)>0) {
            return getHelper(key,root.right);
        }else {return root.value;}
    }

    /** Returns a BSTMap rooted in p with (KEY, VALUE) added as a key-value mapping.
      * Or if p is null, it returns a one node BSTMap containing (KEY, VALUE).
     */
    private Node putHelper(K key, V value, Node p) {
        if(p==null) {
            p = new Node(key,value);
            p.size = 1;
            return p;
        }
        if(p.key==key) {
            p.value = value;
            return p;
        }else {
            p.size +=1;
            if(key.compareTo(p.key)<0) {
                p.left = putHelper(key,value,p.left);
            }else if(key.compareTo(p.key)>0) {
                p.right = putHelper(key,value,p.right);
            }
            return p;
        }

    }

    /** Inserts the key KEY
     *  If it is already present, updates value to be VALUE.
     *
     * update the size of tree, and all other subtrees.
     */
    @Override
    public void put(K key, V value) {
        if(root==null) {
            root = new Node(key,value);
            root.size=1;
            size +=1;
        }
        if(key==root.key) {
            root.value=value;
        }else {
            size+=1;
            root.size +=1;
            if(key.compareTo(root.key)<0) {
                root.left = putHelper(key,value,root.left);
            }else if(key.compareTo(root.key)>0) {
                root.right = putHelper(key,value,root.right);
            }
        }


    }

    /* Returns the number of key-value mappings in this map. */
    @Override
    public int size() {
        return size;
    }

    //////////////// EVERYTHING BELOW THIS LINE IS OPTIONAL ////////////////

    /* Returns a Set view of the keys contained in this map. */
    @Override
    public Set<K> keySet() {
        throw new UnsupportedOperationException();
    }

    /** Removes KEY from the tree if present
     *  returns VALUE removed,
     *  null on failed removal.
     */
    @Override
    public V remove(K key) {
        throw new UnsupportedOperationException();
    }

    /** Removes the key-value entry for the specified key only if it is
     *  currently mapped to the specified value.  Returns the VALUE removed,
     *  null on failed removal.
     **/
    @Override
    public V remove(K key, V value) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Iterator<K> iterator() {
        throw new UnsupportedOperationException();
    }
}