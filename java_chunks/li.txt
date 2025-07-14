package li;

/* renamed from: li.a */
/* loaded from: classes.dex */
public final class C4305a extends java.net.ProxySelector {

    /* renamed from: a */
    public static final li.C4305a f17571a = null;

    static {
            li.a r0 = new li.a
            r0.<init>()
            li.C4305a.f17571a = r0
            return
    }

    public C4305a() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // java.net.ProxySelector
    public void connectFailed(java.net.URI r1, java.net.SocketAddress r2, java.io.IOException r3) {
            r0 = this;
            return
    }

    @Override // java.net.ProxySelector
    public java.util.List<java.net.Proxy> select(java.net.URI r2) {
            r1 = this;
            if (r2 == 0) goto L9
            java.net.Proxy r2 = java.net.Proxy.NO_PROXY
            java.util.List r2 = p074e9.C1805a.m4528m(r2)
            return r2
        L9:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "uri must not be null"
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            throw r2
    }
}
