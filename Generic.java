package com.job;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

 interface Pair<K, V> {
    public K getKey();
    public V getValue();
}

 class OrderedPair<K, V> implements Pair<K, V> {

    private K key;
    private V value;

    public OrderedPair(K key, V value) {
	this.key = key;
	this.value = value;
    }

    public K getKey()	{ return key; }
    public V getValue() { return value; }
}
 abstract class CC{
		public CC() {
			
		}
 }
 public class Generic{
	 
	 public static void main(String[] args) {
		 Pair<Object, Integer> p1 = new OrderedPair<Object, Integer>("Even", 8);
		 Pair<Integer, String>  p2 = new OrderedPair<Integer, String>(9, "world");
		 Integer entries=p2.getKey();
		
		
	}
	 
 }

