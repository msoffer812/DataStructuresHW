package HW;
import java.util.*;
public class BTree<T extends Comparable<T>>{
	Node<T> root;
	public BTree(T el)
	{
		root = new Node<T>(el);
	}
	public BTree()
	{
		root = null;
	}
	public void add(T el)
	{
		root = insert(el, root);
	}
	public String toString()
	{
		List<T> l = new ArrayList<>();
		search(root, l);
		return l.toString();
	}
	public void search(Node n, List<T> str)
	{
		if(n != null)
		{
			if(n.left != null)
			{
				search(n.left, str);
			}
			str.add((T) n.val);
			if(n.right != null)
			{
				search(n.right, str);
			}
			
		}
	}
	public Node<T> insert(T element, Node<T> root)
	{
		if(root == null)
		{
			root = new Node<T>(element);
			return root;
		}
		else if(element.compareTo(root.val) < 0)
		{
			root.left = insert(element, root.left);
		}else
		{
			root.right = insert(element, root.right);
		}
		return root;
	}
	public class Node<T>
	{
		T val;
		Node<T> left;
		Node<T> right;
		public Node(T el)
		{
			val = el;
			left = null;
			right = null;
		}
		
	}
}
