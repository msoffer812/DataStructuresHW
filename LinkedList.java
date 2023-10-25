package HW;

public class LinkedList {
	private Node head;
	private Node tail;
	int size;
	public LinkedList()
	{
		head = null;
		tail = head;
		size = 0;
	}
	public LinkedList(int element)
	{
		head = new Node(element);
		tail = null;
		head.next = tail;
		size = 1;
	}
	public LinkedList(LinkedList l)
	{
		head = new Node(l.head());
		size = l.size;
	}
	public void addFirst(int el)
	{
		if(head == null)
		{
			head = new Node(el);
			tail = null;
			head.next = tail;
			size = 1;
		}else
		{
			Node n = new Node(el);
			n.next = this.head;
			if(tail == null)
			{
				tail = head;
			}
			head = n;
			size++;
		}
		
	}
	public void addLast(int el)
	{
		if(head == null)
		{
			head = new Node(el);
			tail = null;
			head.next = tail;
		}else if(tail == null)
		{
			tail = new Node(el);
			head.next = tail;
		}
		else {
			tail.next = new Node(el);
			tail = tail.next;
		}
		size++;
	}
	//Recursive search to see if the list contains a value
	public boolean find(int a, Node p)
	{
		if(p==null)
		{
			return false;
		}
		if(p.element == a)
		{
			return true;
		}
		return find(a, p.next);
	}
	public boolean contains(int a)
	{
		if(size == 0)
		{
			return false;
		}else if(size == 1 && head.element != a)
		{
			return false;
		}
		else
		{
			return find(a, head);
		}
	}
	public int getFirst()
	{
		if(size==0)
		{
			throw new IndexOutOfBoundsException("List Empty");
		}else
		{
			return head.element;
		}
	}
	public int getLast()
	{
		if(size==0)
		{
			throw new IndexOutOfBoundsException("List Empty");
		}else
		{
			return tail.element;
		}
	}
	public Node head()
	{
		return head;
	}
	public int getSize()
	{
		return size;
	}
	public int remove()
	{
		if(size == 0)
		{
			throw new IndexOutOfBoundsException("List Empty");
		}else
		{
			int val = head.element;
			head = head.next;
			size--;
			return val;
		}
		
	}
	public String toString()
	{
		StringBuilder str = new StringBuilder();
		Node p = head;
		while(p != null)
		{
			str.append(p.element);
			if(p.next != null)
			{
				str.append(", ");
			}
			p = p.next;
		}
		return str.toString();
	}
	//Creating node
	public class Node
	{
		int element;
		Node next;
		
		//constructor
		public Node(int el)
		{
			element = el;
			next = null;
		}
		public Node()
		{
			element = 0;
			next = null;
		}
		//copy constructor
		public Node(Node n)
		{
			element = n.element;
			next = new Node(n.next);
		}
		
	}
	
}
