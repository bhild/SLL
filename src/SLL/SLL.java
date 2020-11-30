package SLL;

public class SLL {
	private Node n;
	public SLL() {
		n=new Node(null);
	}
	private class Node {
		private Object data;
		private Node link = null;//instance of a self refrancing class
		public Node(Object data) {
			this.setData(data);
		}
		public Node(Object data,Node node) {
			this.setData(data);
			this.setNode(node);
		}
		public Object getData() {
			return data;
		}
		public void setData(Object data) {
			this.data = data;
		}
		public void setNode(Node node) {
			link = node;
		}
		public Node nextNode() {
			return link;
		}
	}
	public void setNodeData(int nodeDepth,Object input) {
		Node n = this.n;
		try {
			for (int i = 0; i < nodeDepth; i++) {
				n = n.nextNode();
			}
			n.setData(input);
		} catch (Exception e) {
			System.err.println("no such node");
		}
	}
	public void addNode(Object data) {
		Node temp = new Node(data);
		n.setNode(temp);
	}
	public void printList() {
		Node n = this.n;
		boolean a = true;
		boolean b = false;
		while(a) {
			System.out.println(n.getData());
			n = n.nextNode();
			if (b) {
				a = false;
			}else {
				b = n.nextNode()==null;
			}
		}
	}
}
