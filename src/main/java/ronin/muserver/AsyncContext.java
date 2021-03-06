package ronin.muserver;

import java.util.concurrent.Future;

public class AsyncContext {
	public final MuRequest request;
	public final MuResponse response;

	public AsyncContext(MuRequest request, MuResponse response) {
		this.request = request;
		this.response = response;
	}

	public Future<Void> complete() {
		return ((NettyResponseAdaptor)response).complete();
	}
}
