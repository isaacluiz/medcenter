package medcenter.presenter.node;

import java.util.List;
import java.util.Set;

import com.vaadin.ui.Component;

public interface INode {

	String getAbsolutePathString();

	List<Node> getAbsolutePath();

	void setParent(Node parent);

	Set<Node> getChildren();

	Component attach();

}
