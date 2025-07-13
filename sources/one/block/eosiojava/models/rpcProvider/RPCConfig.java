package one.block.eosiojava.models.rpcProvider;

/* loaded from: classes.dex */
public class RPCConfig {
    private long connectionTimeout;
    private long readTimeout;

    public RPCConfig(long r1, long r3) {
            r0 = this;
            r0.<init>()
            r0.connectionTimeout = r1
            r0.readTimeout = r3
            return
    }

    public long getConnectionTimeout() {
            r2 = this;
            long r0 = r2.connectionTimeout
            return r0
    }

    public long getReadTimeout() {
            r2 = this;
            long r0 = r2.readTimeout
            return r0
    }

    public void setConnectionTimeout(long r1) {
            r0 = this;
            r0.connectionTimeout = r1
            return
    }

    public void setReadTimeout(long r1) {
            r0 = this;
            r0.readTimeout = r1
            return
    }
}
