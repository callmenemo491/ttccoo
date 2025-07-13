package p180k2;

/* renamed from: k2.e */
/* loaded from: classes.dex */
public final class C3673e implements p180k2.InterfaceC3671c {

    /* renamed from: b */
    public final p319s.C5934a<p180k2.C3672d<?>, java.lang.Object> f16250b;

    public C3673e() {
            r1 = this;
            r1.<init>()
            g3.b r0 = new g3.b
            r0.<init>()
            r1.f16250b = r0
            return
    }

    @Override // p180k2.InterfaceC3671c
    /* renamed from: b */
    public void mo5082b(java.security.MessageDigest r7) {
            r6 = this;
            r0 = 0
        L1:
            s.a<k2.d<?>, java.lang.Object> r1 = r6.f16250b
            int r2 = r1.f22812a0
            if (r0 >= r2) goto L2b
            java.lang.Object r1 = r1.m12343h(r0)
            k2.d r1 = (p180k2.C3672d) r1
            s.a<k2.d<?>, java.lang.Object> r2 = r6.f16250b
            java.lang.Object r2 = r2.m12344l(r0)
            k2.d$b<T> r3 = r1.f16247b
            byte[] r4 = r1.f16249d
            if (r4 != 0) goto L23
            java.lang.String r4 = r1.f16248c
            java.nio.charset.Charset r5 = p180k2.InterfaceC3671c.f16244a
            byte[] r4 = r4.getBytes(r5)
            r1.f16249d = r4
        L23:
            byte[] r1 = r1.f16249d
            r3.mo8129a(r1, r2, r7)
            int r0 = r0 + 1
            goto L1
        L2b:
            return
    }

    /* renamed from: c */
    public <T> T m8130c(p180k2.C3672d<T> r3) {
            r2 = this;
            s.a<k2.d<?>, java.lang.Object> r0 = r2.f16250b
            int r0 = r0.m12340e(r3)
            if (r0 < 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            if (r0 == 0) goto L15
            s.a<k2.d<?>, java.lang.Object> r0 = r2.f16250b
            r1 = 0
            java.lang.Object r3 = r0.getOrDefault(r3, r1)
            goto L17
        L15:
            T r3 = r3.f16246a
        L17:
            return r3
    }

    /* renamed from: d */
    public void m8131d(p180k2.C3673e r2) {
            r1 = this;
            s.a<k2.d<?>, java.lang.Object> r0 = r1.f16250b
            s.a<k2.d<?>, java.lang.Object> r2 = r2.f16250b
            r0.mo5829i(r2)
            return
    }

    @Override // p180k2.InterfaceC3671c
    public boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof p180k2.C3673e
            if (r0 == 0) goto Lf
            k2.e r2 = (p180k2.C3673e) r2
            s.a<k2.d<?>, java.lang.Object> r0 = r1.f16250b
            s.a<k2.d<?>, java.lang.Object> r2 = r2.f16250b
            boolean r2 = r0.equals(r2)
            return r2
        Lf:
            r2 = 0
            return r2
    }

    @Override // p180k2.InterfaceC3671c
    public int hashCode() {
            r1 = this;
            s.a<k2.d<?>, java.lang.Object> r0 = r1.f16250b
            int r0 = r0.hashCode()
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = "Options{values="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            s.a<k2.d<?>, java.lang.Object> r1 = r2.f16250b
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
