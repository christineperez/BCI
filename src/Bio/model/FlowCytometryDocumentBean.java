package Bio.model;

import java.io.InputStream;

public class FlowCytometryDocumentBean {
	private int flowId;
	private int flowDocuId;
	private InputStream[] flowDocu;

	public int getFlowId() {
		return flowId;
	}

	public void setFlowId(int flowId) {
		this.flowId = flowId;
	}

	public int getFlowDocuId() {
		return flowDocuId;
	}

	public void setFlowDocuId(int flowDocuId) {
		this.flowDocuId = flowDocuId;
	}

	public InputStream[] getFlowDocu() {
		return flowDocu;
	}

	public void setFlowDocu(InputStream[] flowDocu) {
		this.flowDocu = flowDocu;
	}

}
