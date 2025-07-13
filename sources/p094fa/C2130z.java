package p094fa;

/* renamed from: fa.z */
/* loaded from: classes.dex */
public final class C2130z extends p094fa.AbstractC2107c0.c {

    /* renamed from: a */
    public final java.lang.String f9822a;

    /* renamed from: b */
    public final java.lang.String f9823b;

    /* renamed from: c */
    public final boolean f9824c;

    public C2130z(java.lang.String r2, java.lang.String r3, boolean r4) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "Null osRelease"
            java.util.Objects.requireNonNull(r2, r0)
            r1.f9822a = r2
            java.lang.String r2 = "Null osCodeName"
            java.util.Objects.requireNonNull(r3, r2)
            r1.f9823b = r3
            r1.f9824c = r4
            return
    }

    @Override // p094fa.AbstractC2107c0.c
    /* renamed from: a */
    public boolean mo5681a() {
            r1 = this;
            boolean r0 = r1.f9824c
            return r0
    }

    @Override // p094fa.AbstractC2107c0.c
    /* renamed from: b */
    public java.lang.String mo5682b() {
            r1 = this;
            java.lang.String r0 = r1.f9823b
            return r0
    }

    @Override // p094fa.AbstractC2107c0.c
    /* renamed from: c */
    public java.lang.String mo5683c() {
            r1 = this;
            java.lang.String r0 = r1.f9822a
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p094fa.AbstractC2107c0.c
            r2 = 0
            if (r1 == 0) goto L2e
            fa.c0$c r5 = (p094fa.AbstractC2107c0.c) r5
            java.lang.String r1 = r4.f9822a
            java.lang.String r3 = r5.mo5683c()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L2c
            java.lang.String r1 = r4.f9823b
            java.lang.String r3 = r5.mo5682b()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L2c
            boolean r1 = r4.f9824c
            boolean r5 = r5.mo5681a()
            if (r1 != r5) goto L2c
            goto L2d
        L2c:
            r0 = 0
        L2d:
            return r0
        L2e:
            return r2
    }

    public int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.f9822a
            int r0 = r0.hashCode()
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            int r0 = r0 * r1
            java.lang.String r2 = r3.f9823b
            int r2 = r2.hashCode()
            r0 = r0 ^ r2
            int r0 = r0 * r1
            boolean r1 = r3.f9824c
            if (r1 == 0) goto L1c
            r1 = 1231(0x4cf, float:1.725E-42)
            goto L1e
        L1c:
            r1 = 1237(0x4d5, float:1.733E-42)
        L1e:
            r0 = r0 ^ r1
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = "OsData{osRelease="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r1 = r2.f9822a
            r0.append(r1)
            java.lang.String r1 = ", osCodeName="
            r0.append(r1)
            java.lang.String r1 = r2.f9823b
            r0.append(r1)
            java.lang.String r1 = ", isRooted="
            r0.append(r1)
            boolean r1 = r2.f9824c
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
