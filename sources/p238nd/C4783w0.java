package p238nd;

/* renamed from: nd.w0 */
/* loaded from: classes.dex */
public final class C4783w0 {

    /* renamed from: a */
    public final java.lang.String f19148a;

    /* renamed from: b */
    public final java.lang.String f19149b;

    /* renamed from: c */
    public final p276pd.InterfaceC5460t1 f19150c;

    /* renamed from: d */
    public final java.util.List<one.block.eosiojava.models.rpcProvider.Authorization> f19151d;

    public C4783w0(java.lang.String r2, java.lang.String r3, p276pd.InterfaceC5460t1 r4, java.util.List<? extends one.block.eosiojava.models.rpcProvider.Authorization> r5) {
            r1 = this;
            java.lang.String r0 = "account"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "name"
            p214m2.C4339q.m9706k(r3, r0)
            java.lang.String r0 = "jsonData"
            p214m2.C4339q.m9706k(r4, r0)
            r1.<init>()
            r1.f19148a = r2
            r1.f19149b = r3
            r1.f19150c = r4
            r1.f19151d = r5
            return
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p238nd.C4783w0
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            nd.w0 r5 = (p238nd.C4783w0) r5
            java.lang.String r1 = r4.f19148a
            java.lang.String r3 = r5.f19148a
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = r4.f19149b
            java.lang.String r3 = r5.f19149b
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            pd.t1 r1 = r4.f19150c
            pd.t1 r3 = r5.f19150c
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L2d
            return r2
        L2d:
            java.util.List<one.block.eosiojava.models.rpcProvider.Authorization> r1 = r4.f19151d
            java.util.List<one.block.eosiojava.models.rpcProvider.Authorization> r5 = r5.f19151d
            boolean r5 = p214m2.C4339q.m9702c(r1, r5)
            if (r5 != 0) goto L38
            return r2
        L38:
            return r0
    }

    public int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.f19148a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.lang.String r1 = r3.f19149b
            r2 = 31
            int r0 = p213m1.C4319e.m9651a(r1, r0, r2)
            pd.t1 r1 = r3.f19150c
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.util.List<one.block.eosiojava.models.rpcProvider.Authorization> r0 = r3.f19151d
            int r0 = r0.hashCode()
            int r0 = r0 + r1
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "MyAction(account="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r1 = r3.f19148a
            r0.append(r1)
            java.lang.String r1 = ", name="
            r0.append(r1)
            java.lang.String r1 = r3.f19149b
            r0.append(r1)
            java.lang.String r1 = ", jsonData="
            r0.append(r1)
            pd.t1 r1 = r3.f19150c
            r0.append(r1)
            java.lang.String r1 = ", authorization="
            r0.append(r1)
            java.util.List<one.block.eosiojava.models.rpcProvider.Authorization> r1 = r3.f19151d
            r2 = 41
            java.lang.String r0 = p213m1.C4320f.m9652a(r0, r1, r2)
            return r0
    }
}
