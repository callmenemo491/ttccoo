package p370v4;

/* renamed from: v4.t */
/* loaded from: classes.dex */
public final class C6542t implements p370v4.InterfaceC6525d0 {

    /* renamed from: a */
    public final p370v4.InterfaceC6532j f25574a;

    /* renamed from: b */
    public final p216m4.C4355b0 f25575b;

    /* renamed from: c */
    public int f25576c;

    /* renamed from: d */
    public int f25577d;

    /* renamed from: e */
    public p371v5.C6576z f25578e;

    /* renamed from: f */
    public boolean f25579f;

    /* renamed from: g */
    public boolean f25580g;

    /* renamed from: h */
    public boolean f25581h;

    /* renamed from: i */
    public int f25582i;

    /* renamed from: j */
    public int f25583j;

    /* renamed from: k */
    public boolean f25584k;

    /* renamed from: l */
    public long f25585l;

    public C6542t(p370v4.InterfaceC6532j r4) {
            r3 = this;
            r3.<init>()
            r3.f25574a = r4
            m4.b0 r4 = new m4.b0
            r0 = 10
            byte[] r0 = new byte[r0]
            r1 = 1
            r2 = 0
            r4.<init>(r0, r1, r2)
            r3.f25575b = r4
            r4 = 0
            r3.f25576c = r4
            return
    }

    @Override // p370v4.InterfaceC6525d0
    /* renamed from: a */
    public final void mo13249a() {
            r1 = this;
            r0 = 0
            r1.f25576c = r0
            r1.f25577d = r0
            r1.f25581h = r0
            v4.j r0 = r1.f25574a
            r0.mo13241a()
            return
    }

    @Override // p370v4.InterfaceC6525d0
    /* renamed from: b */
    public void mo13250b(p371v5.C6576z r1, p216m4.InterfaceC4366k r2, p370v4.InterfaceC6525d0.d r3) {
            r0 = this;
            r0.f25578e = r1
            v4.j r1 = r0.f25574a
            r1.mo13243d(r2, r3)
            return
    }

    @Override // p370v4.InterfaceC6525d0
    /* renamed from: c */
    public final void mo13251c(p371v5.C6571u r12, int r13) {
            r11 = this;
            v5.z r0 = r11.f25578e
            p371v5.C6549a.m13292f(r0)
            r0 = r13 & 1
            java.lang.String r1 = "PesReader"
            r2 = -1
            r3 = 3
            r4 = 2
            r5 = 1
            if (r0 == 0) goto L4c
            int r0 = r11.f25576c
            if (r0 == 0) goto L49
            if (r0 == r5) goto L49
            if (r0 == r4) goto L44
            if (r0 != r3) goto L3e
            int r0 = r11.f25583j
            if (r0 == r2) goto L38
            r6 = 59
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r6)
            java.lang.String r6 = "Unexpected start indicator: expected "
            r7.append(r6)
            r7.append(r0)
            java.lang.String r0 = " more bytes"
            r7.append(r0)
            java.lang.String r0 = r7.toString()
            android.util.Log.w(r1, r0)
        L38:
            v4.j r0 = r11.f25574a
            r0.mo13244e()
            goto L49
        L3e:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            r12.<init>()
            throw r12
        L44:
            java.lang.String r0 = "Unexpected start indicator reading extended header"
            android.util.Log.w(r1, r0)
        L49:
            r11.m13281e(r5)
        L4c:
            int r0 = r12.m13398a()
            if (r0 <= 0) goto L1dd
            int r0 = r11.f25576c
            if (r0 == 0) goto L1d2
            r6 = 0
            if (r0 == r5) goto L149
            if (r0 == r4) goto L8f
            if (r0 != r3) goto L89
            int r0 = r12.m13398a()
            int r3 = r11.f25583j
            if (r3 != r2) goto L66
            goto L68
        L66:
            int r6 = r0 - r3
        L68:
            if (r6 <= 0) goto L71
            int r0 = r0 - r6
            int r3 = r12.f25711b
            int r3 = r3 + r0
            r12.m13395E(r3)
        L71:
            v4.j r3 = r11.f25574a
            r3.mo13242c(r12)
            int r3 = r11.f25583j
            if (r3 == r2) goto L1d9
            int r3 = r3 - r0
            r11.f25583j = r3
            if (r3 != 0) goto L1d9
            v4.j r0 = r11.f25574a
            r0.mo13244e()
            r11.m13281e(r5)
            goto L1d9
        L89:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            r12.<init>()
            throw r12
        L8f:
            r0 = 10
            int r2 = r11.f25582i
            int r0 = java.lang.Math.min(r0, r2)
            m4.b0 r2 = r11.f25575b
            java.lang.Object r2 = r2.f17870b
            byte[] r2 = (byte[]) r2
            boolean r0 = r11.m13280d(r12, r2, r0)
            if (r0 == 0) goto L1d9
            r0 = 0
            int r2 = r11.f25582i
            boolean r0 = r11.m13280d(r12, r0, r2)
            if (r0 == 0) goto L1d9
            m4.b0 r0 = r11.f25575b
            r0.m9772q(r6)
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r11.f25585l = r6
            boolean r0 = r11.f25579f
            r2 = 4
            if (r0 == 0) goto L134
            m4.b0 r0 = r11.f25575b
            r0.m9775t(r2)
            m4.b0 r0 = r11.f25575b
            int r0 = r0.m9766k(r3)
            long r6 = (long) r0
            r0 = 30
            long r6 = r6 << r0
            m4.b0 r0 = r11.f25575b
            r0.m9775t(r5)
            m4.b0 r0 = r11.f25575b
            r8 = 15
            int r0 = r0.m9766k(r8)
            int r0 = r0 << r8
            long r9 = (long) r0
            long r6 = r6 | r9
            m4.b0 r0 = r11.f25575b
            r0.m9775t(r5)
            m4.b0 r0 = r11.f25575b
            int r0 = r0.m9766k(r8)
            long r9 = (long) r0
            long r6 = r6 | r9
            m4.b0 r0 = r11.f25575b
            r0.m9775t(r5)
            boolean r0 = r11.f25581h
            if (r0 != 0) goto L12c
            boolean r0 = r11.f25580g
            if (r0 == 0) goto L12c
            m4.b0 r0 = r11.f25575b
            r0.m9775t(r2)
            m4.b0 r0 = r11.f25575b
            int r0 = r0.m9766k(r3)
            long r2 = (long) r0
            r0 = 30
            long r2 = r2 << r0
            m4.b0 r0 = r11.f25575b
            r0.m9775t(r5)
            m4.b0 r0 = r11.f25575b
            int r0 = r0.m9766k(r8)
            int r0 = r0 << r8
            long r9 = (long) r0
            long r2 = r2 | r9
            m4.b0 r0 = r11.f25575b
            r0.m9775t(r5)
            m4.b0 r0 = r11.f25575b
            int r0 = r0.m9766k(r8)
            long r8 = (long) r0
            long r2 = r2 | r8
            m4.b0 r0 = r11.f25575b
            r0.m9775t(r5)
            v5.z r0 = r11.f25578e
            r0.m13444b(r2)
            r11.f25581h = r5
        L12c:
            v5.z r0 = r11.f25578e
            long r2 = r0.m13444b(r6)
            r11.f25585l = r2
        L134:
            boolean r0 = r11.f25584k
            if (r0 == 0) goto L13a
            r0 = 4
            goto L13b
        L13a:
            r0 = 0
        L13b:
            r13 = r13 | r0
            v4.j r0 = r11.f25574a
            long r2 = r11.f25585l
            r0.mo13245f(r2, r13)
            r0 = 3
        L144:
            r11.m13281e(r0)
            goto L1d9
        L149:
            m4.b0 r0 = r11.f25575b
            java.lang.Object r0 = r0.f17870b
            byte[] r0 = (byte[]) r0
            r2 = 9
            boolean r0 = r11.m13280d(r12, r0, r2)
            if (r0 == 0) goto L1d9
            m4.b0 r0 = r11.f25575b
            r2 = 0
            r0.m9772q(r2)
            m4.b0 r0 = r11.f25575b
            r2 = 24
            int r0 = r0.m9766k(r2)
            if (r0 == r5) goto L173
            r2 = 41
            java.lang.String r3 = "Unexpected start code prefix: "
            p088f4.C1999d.m5182a(r2, r3, r0, r1)
            r0 = -1
            r11.f25583j = r0
            r0 = 0
            goto L1ca
        L173:
            m4.b0 r0 = r11.f25575b
            r2 = 8
            r0.m9775t(r2)
            m4.b0 r0 = r11.f25575b
            r3 = 16
            int r0 = r0.m9766k(r3)
            m4.b0 r3 = r11.f25575b
            r6 = 5
            r3.m9775t(r6)
            m4.b0 r3 = r11.f25575b
            boolean r3 = r3.m9765j()
            r11.f25584k = r3
            m4.b0 r3 = r11.f25575b
            r3.m9775t(r4)
            m4.b0 r3 = r11.f25575b
            boolean r3 = r3.m9765j()
            r11.f25579f = r3
            m4.b0 r3 = r11.f25575b
            boolean r3 = r3.m9765j()
            r11.f25580g = r3
            m4.b0 r3 = r11.f25575b
            r6 = 6
            r3.m9775t(r6)
            m4.b0 r3 = r11.f25575b
            int r2 = r3.m9766k(r2)
            r11.f25582i = r2
            if (r0 != 0) goto L1b6
            goto L1c6
        L1b6:
            int r0 = r0 + 6
            int r0 = r0 + (-9)
            int r0 = r0 - r2
            r11.f25583j = r0
            if (r0 >= 0) goto L1c9
            r2 = 47
            java.lang.String r3 = "Found negative packet payload size: "
            p088f4.C1999d.m5182a(r2, r3, r0, r1)
        L1c6:
            r0 = -1
            r11.f25583j = r0
        L1c9:
            r0 = 1
        L1ca:
            if (r0 == 0) goto L1cf
            r0 = 2
            goto L144
        L1cf:
            r0 = 0
            goto L144
        L1d2:
            int r0 = r12.m13398a()
            r12.m13397G(r0)
        L1d9:
            r2 = -1
            r3 = 3
            goto L4c
        L1dd:
            return
    }

    /* renamed from: d */
    public final boolean m13280d(p371v5.C6571u r6, byte[] r7, int r8) {
            r5 = this;
            int r0 = r6.m13398a()
            int r1 = r5.f25577d
            int r1 = r8 - r1
            int r0 = java.lang.Math.min(r0, r1)
            r1 = 1
            if (r0 > 0) goto L10
            return r1
        L10:
            if (r7 != 0) goto L16
            r6.m13397G(r0)
            goto L24
        L16:
            int r2 = r5.f25577d
            byte[] r3 = r6.f25710a
            int r4 = r6.f25711b
            java.lang.System.arraycopy(r3, r4, r7, r2, r0)
            int r7 = r6.f25711b
            int r7 = r7 + r0
            r6.f25711b = r7
        L24:
            int r6 = r5.f25577d
            int r6 = r6 + r0
            r5.f25577d = r6
            if (r6 != r8) goto L2c
            goto L2d
        L2c:
            r1 = 0
        L2d:
            return r1
    }

    /* renamed from: e */
    public final void m13281e(int r1) {
            r0 = this;
            r0.f25576c = r1
            r1 = 0
            r0.f25577d = r1
            return
    }
}
