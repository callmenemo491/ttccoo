package p094fa;

/* renamed from: fa.n */
/* loaded from: classes.dex */
public final class C2118n extends p094fa.AbstractC2103a0.e.d.a.b.AbstractC7384a {

    /* renamed from: a */
    public final long f9761a;

    /* renamed from: b */
    public final long f9762b;

    /* renamed from: c */
    public final java.lang.String f9763c;

    /* renamed from: d */
    public final java.lang.String f9764d;

    /* renamed from: fa.n$a */
    public static /* synthetic */ class a {
    }

    public C2118n(long r1, long r3, java.lang.String r5, java.lang.String r6, p094fa.C2118n.a r7) {
            r0 = this;
            r0.<init>()
            r0.f9761a = r1
            r0.f9762b = r3
            r0.f9763c = r5
            r0.f9764d = r6
            return
    }

    @Override // p094fa.AbstractC2103a0.e.d.a.b.AbstractC7384a
    /* renamed from: a */
    public long mo5629a() {
            r2 = this;
            long r0 = r2.f9761a
            return r0
    }

    @Override // p094fa.AbstractC2103a0.e.d.a.b.AbstractC7384a
    /* renamed from: b */
    public java.lang.String mo5630b() {
            r1 = this;
            java.lang.String r0 = r1.f9763c
            return r0
    }

    @Override // p094fa.AbstractC2103a0.e.d.a.b.AbstractC7384a
    /* renamed from: c */
    public long mo5631c() {
            r2 = this;
            long r0 = r2.f9762b
            return r0
    }

    @Override // p094fa.AbstractC2103a0.e.d.a.b.AbstractC7384a
    /* renamed from: d */
    public java.lang.String mo5632d() {
            r1 = this;
            java.lang.String r0 = r1.f9764d
            return r0
    }

    public boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof p094fa.AbstractC2103a0.e.d.a.b.AbstractC7384a
            r2 = 0
            if (r1 == 0) goto L3f
            fa.a0$e$d$a$b$a r8 = (p094fa.AbstractC2103a0.e.d.a.b.AbstractC7384a) r8
            long r3 = r7.f9761a
            long r5 = r8.mo5629a()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L3d
            long r3 = r7.f9762b
            long r5 = r8.mo5631c()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L3d
            java.lang.String r1 = r7.f9763c
            java.lang.String r3 = r8.mo5630b()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L3d
            java.lang.String r1 = r7.f9764d
            java.lang.String r8 = r8.mo5632d()
            if (r1 != 0) goto L36
            if (r8 != 0) goto L3d
            goto L3e
        L36:
            boolean r8 = r1.equals(r8)
            if (r8 == 0) goto L3d
            goto L3e
        L3d:
            r0 = 0
        L3e:
            return r0
        L3f:
            return r2
    }

    public int hashCode() {
            r7 = this;
            long r0 = r7.f9761a
            r2 = 32
            long r3 = r0 >>> r2
            long r0 = r0 ^ r3
            int r1 = (int) r0
            r0 = 1000003(0xf4243, float:1.401303E-39)
            r1 = r1 ^ r0
            int r1 = r1 * r0
            long r3 = r7.f9762b
            long r5 = r3 >>> r2
            long r2 = r5 ^ r3
            int r3 = (int) r2
            r1 = r1 ^ r3
            int r1 = r1 * r0
            java.lang.String r2 = r7.f9763c
            int r2 = r2.hashCode()
            r1 = r1 ^ r2
            int r1 = r1 * r0
            java.lang.String r0 = r7.f9764d
            if (r0 != 0) goto L27
            r0 = 0
            goto L2b
        L27:
            int r0 = r0.hashCode()
        L2b:
            r0 = r0 ^ r1
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "BinaryImage{baseAddress="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            long r1 = r3.f9761a
            r0.append(r1)
            java.lang.String r1 = ", size="
            r0.append(r1)
            long r1 = r3.f9762b
            r0.append(r1)
            java.lang.String r1 = ", name="
            r0.append(r1)
            java.lang.String r1 = r3.f9763c
            r0.append(r1)
            java.lang.String r1 = ", uuid="
            r0.append(r1)
            java.lang.String r1 = r3.f9764d
            java.lang.String r2 = "}"
            java.lang.String r0 = p346u.C6269n.m12888a(r0, r1, r2)
            return r0
    }
}
