import java.util.ArrayList;

public class TreeNode{
	String data;
	ArrayList<TreeNode> children;

	public TreeNode(String data){
		this.data = data;
		this.children = new ArrayList<TreeNode>();
	}

	public void addChild(TreeNode node){
		this.children.add(node);
	}
}
