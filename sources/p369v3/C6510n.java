package p369v3;

/* renamed from: v3.n */
/* loaded from: classes.dex */
public final class C6510n extends p369v3.AbstractC6516t {

    /* renamed from: a */
    public final p369v3.AbstractC6516t.b f25253a;

    /* renamed from: b */
    public final p369v3.AbstractC6516t.a f25254b;

    /* renamed from: v3.n$a */
    public static /* synthetic */ class a {
    }

    public C6510n(p369v3.AbstractC6516t.b r1, p369v3.AbstractC6516t.a r2, p369v3.C6510n.a r3) {
            r0 = this;
            r0.<init>()
            r0.f25253a = r1
            r0.f25254b = r2
            return
    }

    @Override // p369v3.AbstractC6516t
    /* renamed from: a */
    public p369v3.AbstractC6516t.a mo13238a() {
            r1 = this;
            v3.t$a r0 = r1.f25254b
            return r0
    }

    @Override // p369v3.AbstractC6516t
    /* renamed from: b */
    public p369v3.AbstractC6516t.b mo13239b() {
            r1 = this;
            v3.t$b r0 = r1.f25253a
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p369v3.AbstractC6516t
            r2 = 0
            if (r1 == 0) goto L34
            v3.t r5 = (p369v3.AbstractC6516t) r5
            v3.t$b r1 = r4.f25253a
            if (r1 != 0) goto L16
            v3.t$b r1 = r5.mo13239b()
            if (r1 != 0) goto L32
            goto L20
        L16:
            v3.t$b r3 = r5.mo13239b()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L32
        L20:
            v3.t$a r1 = r4.f25254b
            v3.t$a r5 = r5.mo13238a()
            if (r1 != 0) goto L2b
            if (r5 != 0) goto L32
            goto L33
        L2b:
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L32
            goto L33
        L32:
            r0 = 0
        L33:
            return r0
        L34:
            return r2
    }

    public int hashCode() {
            r3 = this;
            v3.t$b r0 = r3.f25253a
            r1 = 0
            if (r0 != 0) goto L7
            r0 = 0
            goto Lb
        L7:
            int r0 = r0.hashCode()
        Lb:
            r2 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r2
            int r0 = r0 * r2
            v3.t$a r2 = r3.f25254b
            if (r2 != 0) goto L16
            goto L1a
        L16:
            int r1 = r2.hashCode()
        L1a:
            r0 = r0 ^ r1
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = "NetworkConnectionInfo{networkType="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            v3.t$b r1 = r2.f25253a
            r0.append(r1)
            java.lang.String r1 = ", mobileSubtype="
            r0.append(r1)
            v3.t$a r1 = r2.f25254b
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
