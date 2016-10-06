package net.floodlightcontroller.queuepusher;

public class QueuePusherResponse {

	public QueuePusherResponseCode code;
	public String out;
	public String err;
	public String qid;
	
	public QueuePusherResponse(QueuePusherResponseCode code) {
		this.code = code;
		this.out = "";
		this.err = "";
		this.qid = "";
	}
	
	public QueuePusherResponse(QueuePusherResponseCode code, String out) {
		this.code = code;
		this.out = out == null ? "" : out;
		this.err = "";
		this.qid = "";
	}
	
	public QueuePusherResponse(QueuePusherResponseCode code, String out, String err) {
		this.code = code;
		this.out = out == null ? "" : out;
		this.err = err == null ? "" : err;
		this.qid = "";
	}
	
	public QueuePusherResponse(QueuePusherResponseCode code, String out, String err, int qid) {
		this.code = code;
		this.out = out == null ? "" : out;
		this.err = err == null ? "" : err;
		this.qid = qid == 0 ? "" : (String)(""+qid);
	}
	
	@Override
	public String toString() {
		return code + ": " + out;
	}
	
}
