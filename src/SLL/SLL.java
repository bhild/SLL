package SLL;

public class SLL {
	public static void main(String[] args) {
		Node n= new Node(10);
		System.out.println(n.getData());
	}
	private static class Node {
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
}
