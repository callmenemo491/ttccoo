package one.block.eosiojava.models.rpcProvider;

/* loaded from: classes.dex */
public class EosioEndPoint {

    @p189kb.InterfaceC4079b("host")
    private java.lang.String host;

    @p189kb.InterfaceC4079b("port")
    private int port;

    @p189kb.InterfaceC4079b("protocol")
    private java.lang.String protocol;

    public EosioEndPoint(java.lang.String r1, int r2, java.lang.String r3) {
            r0 = this;
            r0.<init>()
            r0.protocol = r1
            r0.port = r2
            r0.host = r3
            return
    }

    public java.lang.String getHost() {
            r1 = this;
            java.lang.String r0 = r1.host
            return r0
    }

    public int getPort() {
            r1 = this;
            int r0 = r1.port
            return r0
    }

    public java.lang.String getProtocol() {
            r1 = this;
            java.lang.String r0 = r1.protocol
            return r0
    }

    public void setHost(java.lang.String r1) {
            r0 = this;
            r0.host = r1
            return
    }

    public void setPort(int r1) {
            r0 = this;
            r0.port = r1
            return
    }

    public void setProtocol(java.lang.String r1) {
            r0 = this;
            r0.protocol = r1
            return
    }

    public java.net.URL toURL() {
            r5 = this;
            java.net.URL r0 = new java.net.URL
            java.lang.String r1 = r5.protocol
            java.lang.String r2 = r5.host
            int r3 = r5.port
            java.lang.String r4 = ""
            r0.<init>(r1, r2, r3, r4)
            return r0
    }
}
