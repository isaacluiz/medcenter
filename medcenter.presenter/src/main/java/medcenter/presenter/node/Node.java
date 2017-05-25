package medcenter.presenter.node;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.vaadin.ui.Component;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import medcenter.presenter.presenter.IPresenter;

@Slf4j
public abstract class Node<PRESENTER extends IPresenter> implements INode {

	/** The absolute path in string until here */
	private String absolutePathString;

	/** Parent path of this path */
	transient Node<PRESENTER> parent;

	protected boolean root = false;

	transient private List<Node> absolutePath;

	@Getter
	private Set<Node<PRESENTER>> children = new HashSet<>();

	@Override
	public String getAbsolutePathString() {
		return this.absolutePathString;
	}

	@Override
	public List<Node> getAbsolutePath() {
		return this.absolutePath;
	}

	@Override
	public void setParent(Node parent) {
		this.parent = parent;
		this.parent.children.add(this);
		// this.presenterInterfaceClass = (Class<? extends IPresenter>)
		// TypeResolver.resolveRawArguments(Node.class,
		// this.getClass())[0];

	}

	@Override
	public Component attach() {
		// this.presenterInterfaceClass = (Class<? extends IPresenter>)
		// GenericTypeResolver
		// .resolveTypeArgument(Presenter.class, this.getClass());
		IPresenter bean = null;
		return bean.renderView();
	}

	@Override
	public Set<Node> getChildren() {
		// TODO Auto-generated method stub
		return null;
	}

}
