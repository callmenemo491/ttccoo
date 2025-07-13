package p214m2;

/* renamed from: m2.e */
/* loaded from: classes.dex */
public final class C4327e implements p180k2.InterfaceC3671c {

    /* renamed from: b */
    public final p180k2.InterfaceC3671c f17641b;

    /* renamed from: c */
    public final p180k2.InterfaceC3671c f17642c;

    public C4327e(p180k2.InterfaceC3671c r1, p180k2.InterfaceC3671c r2) {
            r0 = this;
            r0.<init>()
            r0.f17641b = r1
            r0.f17642c = r2
            return
    }

    @Override // p180k2.InterfaceC3671c
    /* renamed from: b */
    public void mo5082b(java.security.MessageDigest r2) {
            r1 = this;
            k2.c r0 = r1.f17641b
            r0.mo5082b(r2)
            k2.c r0 = r1.f17642c
            r0.mo5082b(r2)
            return
    }

    @Override // p180k2.InterfaceC3671c
    public boolean equals(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof p214m2.C4327e
            r1 = 0
            if (r0 == 0) goto L1c
            m2.e r4 = (p214m2.C4327e) r4
            k2.c r0 = r3.f17641b
            k2.c r2 = r4.f17641b
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L1c
            k2.c r0 = r3.f17642c
            k2.c r4 = r4.f17642c
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L1c
            r1 = 1
        L1c:
            return r1
    }

    @Override // p180k2.InterfaceC3671c
    public int hashCode() {
            r2 = this;
            k2.c r0 = r2.f17641b
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            k2.c r1 = r2.f17642c
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = "DataCacheKey{sourceKey="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            k2.c r1 = r2.f17641b
            r0.append(r1)
            java.lang.String r1 = ", signature="
            r0.append(r1)
            k2.c r1 = r2.f17642c
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
