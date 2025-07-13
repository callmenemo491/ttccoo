package bi;

/* renamed from: bi.q */
/* loaded from: classes.dex */
public final class C0797q implements bi.InterfaceC0798r {
    public C0797q() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // bi.InterfaceC0798r
    /* renamed from: a */
    public java.util.List<java.net.InetAddress> mo2420a(java.lang.String r4) {
            r3 = this;
            java.lang.String r0 = "hostname"
            p214m2.C4339q.m9706k(r4, r0)
            java.net.InetAddress[] r0 = java.net.InetAddress.getAllByName(r4)     // Catch: java.lang.NullPointerException -> L13
            java.lang.String r1 = "InetAddress.getAllByName(hostname)"
            p214m2.C4339q.m9705j(r0, r1)     // Catch: java.lang.NullPointerException -> L13
            java.util.List r4 = p062dh.C1468d.m3991M(r0)     // Catch: java.lang.NullPointerException -> L13
            return r4
        L13:
            r0 = move-exception
            java.net.UnknownHostException r1 = new java.net.UnknownHostException
            java.lang.String r2 = "Broken system behaviour for dns lookup of "
            java.lang.String r4 = p064e.C1493g.m4049a(r2, r4)
            r1.<init>(r4)
            r1.initCause(r0)
            throw r1
    }
}
