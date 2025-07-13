package bi;

/* renamed from: bi.j0 */
/* loaded from: classes.dex */
public final class C0789j0 {

    /* renamed from: a */
    public final bi.C0770a f4286a;

    /* renamed from: b */
    public final java.net.Proxy f4287b;

    /* renamed from: c */
    public final java.net.InetSocketAddress f4288c;

    public C0789j0(bi.C0770a r2, java.net.Proxy r3, java.net.InetSocketAddress r4) {
            r1 = this;
            java.lang.String r0 = "address"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "socketAddress"
            p214m2.C4339q.m9706k(r4, r0)
            r1.<init>()
            r1.f4286a = r2
            r1.f4287b = r3
            r1.f4288c = r4
            return
    }

    /* renamed from: a */
    public final boolean m2401a() {
            r2 = this;
            bi.a r0 = r2.f4286a
            javax.net.ssl.SSLSocketFactory r0 = r0.f4129f
            if (r0 == 0) goto L12
            java.net.Proxy r0 = r2.f4287b
            java.net.Proxy$Type r0 = r0.type()
            java.net.Proxy$Type r1 = java.net.Proxy.Type.HTTP
            if (r0 != r1) goto L12
            r0 = 1
            goto L13
        L12:
            r0 = 0
        L13:
            return r0
    }

    public boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof bi.C0789j0
            if (r0 == 0) goto L26
            bi.j0 r3 = (bi.C0789j0) r3
            bi.a r0 = r3.f4286a
            bi.a r1 = r2.f4286a
            boolean r0 = p214m2.C4339q.m9702c(r0, r1)
            if (r0 == 0) goto L26
            java.net.Proxy r0 = r3.f4287b
            java.net.Proxy r1 = r2.f4287b
            boolean r0 = p214m2.C4339q.m9702c(r0, r1)
            if (r0 == 0) goto L26
            java.net.InetSocketAddress r3 = r3.f4288c
            java.net.InetSocketAddress r0 = r2.f4288c
            boolean r3 = p214m2.C4339q.m9702c(r3, r0)
            if (r3 == 0) goto L26
            r3 = 1
            goto L27
        L26:
            r3 = 0
        L27:
            return r3
    }

    public int hashCode() {
            r2 = this;
            bi.a r0 = r2.f4286a
            int r0 = r0.hashCode()
            int r0 = r0 + 527
            int r0 = r0 * 31
            java.net.Proxy r1 = r2.f4287b
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.net.InetSocketAddress r0 = r2.f4288c
            int r0 = r0.hashCode()
            int r0 = r0 + r1
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = "Route{"
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.net.InetSocketAddress r1 = r2.f4288c
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
