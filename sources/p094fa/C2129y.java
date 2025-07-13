package p094fa;

/* renamed from: fa.y */
/* loaded from: classes.dex */
public final class C2129y extends p094fa.AbstractC2107c0.b {

    /* renamed from: a */
    public final int f9813a;

    /* renamed from: b */
    public final java.lang.String f9814b;

    /* renamed from: c */
    public final int f9815c;

    /* renamed from: d */
    public final long f9816d;

    /* renamed from: e */
    public final long f9817e;

    /* renamed from: f */
    public final boolean f9818f;

    /* renamed from: g */
    public final int f9819g;

    /* renamed from: h */
    public final java.lang.String f9820h;

    /* renamed from: i */
    public final java.lang.String f9821i;

    public C2129y(int r1, java.lang.String r2, int r3, long r4, long r6, boolean r8, int r9, java.lang.String r10, java.lang.String r11) {
            r0 = this;
            r0.<init>()
            r0.f9813a = r1
            java.lang.String r1 = "Null model"
            java.util.Objects.requireNonNull(r2, r1)
            r0.f9814b = r2
            r0.f9815c = r3
            r0.f9816d = r4
            r0.f9817e = r6
            r0.f9818f = r8
            r0.f9819g = r9
            java.lang.String r1 = "Null manufacturer"
            java.util.Objects.requireNonNull(r10, r1)
            r0.f9820h = r10
            java.lang.String r1 = "Null modelClass"
            java.util.Objects.requireNonNull(r11, r1)
            r0.f9821i = r11
            return
    }

    @Override // p094fa.AbstractC2107c0.b
    /* renamed from: a */
    public int mo5672a() {
            r1 = this;
            int r0 = r1.f9813a
            return r0
    }

    @Override // p094fa.AbstractC2107c0.b
    /* renamed from: b */
    public int mo5673b() {
            r1 = this;
            int r0 = r1.f9815c
            return r0
    }

    @Override // p094fa.AbstractC2107c0.b
    /* renamed from: c */
    public long mo5674c() {
            r2 = this;
            long r0 = r2.f9817e
            return r0
    }

    @Override // p094fa.AbstractC2107c0.b
    /* renamed from: d */
    public boolean mo5675d() {
            r1 = this;
            boolean r0 = r1.f9818f
            return r0
    }

    @Override // p094fa.AbstractC2107c0.b
    /* renamed from: e */
    public java.lang.String mo5676e() {
            r1 = this;
            java.lang.String r0 = r1.f9820h
            return r0
    }

    public boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof p094fa.AbstractC2107c0.b
            r2 = 0
            if (r1 == 0) goto L66
            fa.c0$b r8 = (p094fa.AbstractC2107c0.b) r8
            int r1 = r7.f9813a
            int r3 = r8.mo5672a()
            if (r1 != r3) goto L64
            java.lang.String r1 = r7.f9814b
            java.lang.String r3 = r8.mo5677f()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L64
            int r1 = r7.f9815c
            int r3 = r8.mo5673b()
            if (r1 != r3) goto L64
            long r3 = r7.f9816d
            long r5 = r8.mo5680i()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L64
            long r3 = r7.f9817e
            long r5 = r8.mo5674c()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L64
            boolean r1 = r7.f9818f
            boolean r3 = r8.mo5675d()
            if (r1 != r3) goto L64
            int r1 = r7.f9819g
            int r3 = r8.mo5679h()
            if (r1 != r3) goto L64
            java.lang.String r1 = r7.f9820h
            java.lang.String r3 = r8.mo5676e()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L64
            java.lang.String r1 = r7.f9821i
            java.lang.String r8 = r8.mo5678g()
            boolean r8 = r1.equals(r8)
            if (r8 == 0) goto L64
            goto L65
        L64:
            r0 = 0
        L65:
            return r0
        L66:
            return r2
    }

    @Override // p094fa.AbstractC2107c0.b
    /* renamed from: f */
    public java.lang.String mo5677f() {
            r1 = this;
            java.lang.String r0 = r1.f9814b
            return r0
    }

    @Override // p094fa.AbstractC2107c0.b
    /* renamed from: g */
    public java.lang.String mo5678g() {
            r1 = this;
            java.lang.String r0 = r1.f9821i
            return r0
    }

    @Override // p094fa.AbstractC2107c0.b
    /* renamed from: h */
    public int mo5679h() {
            r1 = this;
            int r0 = r1.f9819g
            return r0
    }

    public int hashCode() {
            r7 = this;
            int r0 = r7.f9813a
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            int r0 = r0 * r1
            java.lang.String r2 = r7.f9814b
            int r2 = r2.hashCode()
            r0 = r0 ^ r2
            int r0 = r0 * r1
            int r2 = r7.f9815c
            r0 = r0 ^ r2
            int r0 = r0 * r1
            long r2 = r7.f9816d
            r4 = 32
            long r5 = r2 >>> r4
            long r2 = r2 ^ r5
            int r3 = (int) r2
            r0 = r0 ^ r3
            int r0 = r0 * r1
            long r2 = r7.f9817e
            long r4 = r2 >>> r4
            long r2 = r2 ^ r4
            int r3 = (int) r2
            r0 = r0 ^ r3
            int r0 = r0 * r1
            boolean r2 = r7.f9818f
            if (r2 == 0) goto L31
            r2 = 1231(0x4cf, float:1.725E-42)
            goto L33
        L31:
            r2 = 1237(0x4d5, float:1.733E-42)
        L33:
            r0 = r0 ^ r2
            int r0 = r0 * r1
            int r2 = r7.f9819g
            r0 = r0 ^ r2
            int r0 = r0 * r1
            java.lang.String r2 = r7.f9820h
            int r2 = r2.hashCode()
            r0 = r0 ^ r2
            int r0 = r0 * r1
            java.lang.String r1 = r7.f9821i
            int r1 = r1.hashCode()
            r0 = r0 ^ r1
            return r0
    }

    @Override // p094fa.AbstractC2107c0.b
    /* renamed from: i */
    public long mo5680i() {
            r2 = this;
            long r0 = r2.f9816d
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "DeviceData{arch="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            int r1 = r3.f9813a
            r0.append(r1)
            java.lang.String r1 = ", model="
            r0.append(r1)
            java.lang.String r1 = r3.f9814b
            r0.append(r1)
            java.lang.String r1 = ", availableProcessors="
            r0.append(r1)
            int r1 = r3.f9815c
            r0.append(r1)
            java.lang.String r1 = ", totalRam="
            r0.append(r1)
            long r1 = r3.f9816d
            r0.append(r1)
            java.lang.String r1 = ", diskSpace="
            r0.append(r1)
            long r1 = r3.f9817e
            r0.append(r1)
            java.lang.String r1 = ", isEmulator="
            r0.append(r1)
            boolean r1 = r3.f9818f
            r0.append(r1)
            java.lang.String r1 = ", state="
            r0.append(r1)
            int r1 = r3.f9819g
            r0.append(r1)
            java.lang.String r1 = ", manufacturer="
            r0.append(r1)
            java.lang.String r1 = r3.f9820h
            r0.append(r1)
            java.lang.String r1 = ", modelClass="
            r0.append(r1)
            java.lang.String r1 = r3.f9821i
            java.lang.String r2 = "}"
            java.lang.String r0 = p346u.C6269n.m12888a(r0, r1, r2)
            return r0
    }
}
