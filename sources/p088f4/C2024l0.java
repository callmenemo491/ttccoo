package p088f4;

/* renamed from: f4.l0 */
/* loaded from: classes.dex */
public final class C2024l0 {

    /* renamed from: a */
    public final p108g5.InterfaceC2280o f9173a;

    /* renamed from: b */
    public final java.lang.Object f9174b;

    /* renamed from: c */
    public final p108g5.InterfaceC2261c0[] f9175c;

    /* renamed from: d */
    public boolean f9176d;

    /* renamed from: e */
    public boolean f9177e;

    /* renamed from: f */
    public p088f4.C2027m0 f9178f;

    /* renamed from: g */
    public boolean f9179g;

    /* renamed from: h */
    public final boolean[] f9180h;

    /* renamed from: i */
    public final p088f4.InterfaceC2007f1[] f9181i;

    /* renamed from: j */
    public final p325s5.AbstractC5973m f9182j;

    /* renamed from: k */
    public final p088f4.C2042r0 f9183k;

    /* renamed from: l */
    public p088f4.C2024l0 f9184l;

    /* renamed from: m */
    public p108g5.C2273i0 f9185m;

    /* renamed from: n */
    public p325s5.C5974n f9186n;

    /* renamed from: o */
    public long f9187o;

    public C2024l0(p088f4.InterfaceC2007f1[] r8, long r9, p325s5.AbstractC5973m r11, p352u5.C6324m r12, p088f4.C2042r0 r13, p088f4.C2027m0 r14, p325s5.C5974n r15) {
            r7 = this;
            r7.<init>()
            r7.f9181i = r8
            r7.f9187o = r9
            r7.f9182j = r11
            r7.f9183k = r13
            g5.r$a r9 = r14.f9204a
            java.lang.Object r10 = r9.f10415a
            r7.f9174b = r10
            r7.f9178f = r14
            g5.i0 r10 = p108g5.C2273i0.f10376b0
            r7.f9185m = r10
            r7.f9186n = r15
            int r10 = r8.length
            g5.c0[] r10 = new p108g5.InterfaceC2261c0[r10]
            r7.f9175c = r10
            int r8 = r8.length
            boolean[] r8 = new boolean[r8]
            r7.f9180h = r8
            long r10 = r14.f9205b
            long r5 = r14.f9207d
            java.util.Objects.requireNonNull(r13)
            java.lang.Object r8 = r9.f10415a
            android.util.Pair r8 = (android.util.Pair) r8
            java.lang.Object r14 = r8.first
            java.lang.Object r8 = r8.second
            g5.r$a r8 = r9.m6031b(r8)
            java.util.Map<java.lang.Object, f4.r0$c> r9 = r13.f9298c
            java.lang.Object r9 = r9.get(r14)
            f4.r0$c r9 = (p088f4.C2042r0.c) r9
            java.util.Objects.requireNonNull(r9)
            java.util.Set<f4.r0$c> r14 = r13.f9303h
            r14.add(r9)
            java.util.HashMap<f4.r0$c, f4.r0$b> r14 = r13.f9302g
            java.lang.Object r14 = r14.get(r9)
            f4.r0$b r14 = (p088f4.C2042r0.b) r14
            if (r14 == 0) goto L57
            g5.r r15 = r14.f9311a
            g5.r$b r14 = r14.f9312b
            r15.mo5932g(r14)
        L57:
            java.util.List<g5.r$a> r14 = r9.f9316c
            r14.add(r8)
            g5.m r14 = r9.f9314a
            g5.l r1 = r14.m6026x(r8, r12, r10)
            java.util.IdentityHashMap<g5.o, f4.r0$c> r8 = r13.f9297b
            r8.put(r1, r9)
            r13.m5389d()
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r10 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r10 == 0) goto L7d
            g5.b r8 = new g5.b
            r2 = 1
            r3 = 0
            r0 = r8
            r0.<init>(r1, r2, r3, r5)
            r1 = r8
        L7d:
            r7.f9173a = r1
            return
    }

    /* renamed from: a */
    public long m5317a(p325s5.C5974n r17, long r18, boolean r20, boolean[] r21) {
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = 0
            r3 = 0
        L6:
            int r4 = r1.f23068a
            r5 = 1
            if (r3 >= r4) goto L1e
            boolean[] r4 = r0.f9180h
            if (r20 != 0) goto L18
            s5.n r6 = r0.f9186n
            boolean r6 = r1.m12441a(r6, r3)
            if (r6 == 0) goto L18
            goto L19
        L18:
            r5 = 0
        L19:
            r4[r3] = r5
            int r3 = r3 + 1
            goto L6
        L1e:
            g5.c0[] r3 = r0.f9175c
            r4 = 0
        L21:
            f4.f1[] r6 = r0.f9181i
            int r7 = r6.length
            r8 = -2
            if (r4 >= r7) goto L35
            r6 = r6[r4]
            f4.g r6 = (p088f4.AbstractC2008g) r6
            int r6 = r6.f8947Y
            if (r6 != r8) goto L32
            r6 = 0
            r3[r4] = r6
        L32:
            int r4 = r4 + 1
            goto L21
        L35:
            r16.m5318b()
            r0.f9186n = r1
            r16.m5319c()
            g5.o r9 = r0.f9173a
            s5.f[] r10 = r1.f23070c
            boolean[] r11 = r0.f9180h
            g5.c0[] r12 = r0.f9175c
            r13 = r21
            r14 = r18
            long r3 = r9.mo5963r(r10, r11, r12, r13, r14)
            g5.c0[] r6 = r0.f9175c
            r7 = 0
        L50:
            f4.f1[] r9 = r0.f9181i
            int r10 = r9.length
            if (r7 >= r10) goto L6f
            r9 = r9[r7]
            f4.g r9 = (p088f4.AbstractC2008g) r9
            int r9 = r9.f8947Y
            if (r9 != r8) goto L6c
            s5.n r9 = r0.f9186n
            boolean r9 = r9.m12442b(r7)
            if (r9 == 0) goto L6c
            g5.h r9 = new g5.h
            r9.<init>()
            r6[r7] = r9
        L6c:
            int r7 = r7 + 1
            goto L50
        L6f:
            r0.f9177e = r2
            r6 = 0
        L72:
            g5.c0[] r7 = r0.f9175c
            int r9 = r7.length
            if (r6 >= r9) goto L9e
            r7 = r7[r6]
            if (r7 == 0) goto L8f
            boolean r7 = r1.m12442b(r6)
            p371v5.C6549a.m13291e(r7)
            f4.f1[] r7 = r0.f9181i
            r7 = r7[r6]
            f4.g r7 = (p088f4.AbstractC2008g) r7
            int r7 = r7.f8947Y
            if (r7 == r8) goto L9b
            r0.f9177e = r5
            goto L9b
        L8f:
            s5.f[] r7 = r1.f23070c
            r7 = r7[r6]
            if (r7 != 0) goto L97
            r7 = 1
            goto L98
        L97:
            r7 = 0
        L98:
            p371v5.C6549a.m13291e(r7)
        L9b:
            int r6 = r6 + 1
            goto L72
        L9e:
            return r3
    }

    /* renamed from: b */
    public final void m5318b() {
            r3 = this;
            boolean r0 = r3.m5323g()
            if (r0 != 0) goto L7
            return
        L7:
            r0 = 0
        L8:
            s5.n r1 = r3.f9186n
            int r2 = r1.f23068a
            if (r0 >= r2) goto L22
            boolean r1 = r1.m12442b(r0)
            s5.n r2 = r3.f9186n
            s5.f[] r2 = r2.f23070c
            r2 = r2[r0]
            if (r1 == 0) goto L1f
            if (r2 == 0) goto L1f
            r2.mo12407h()
        L1f:
            int r0 = r0 + 1
            goto L8
        L22:
            return
    }

    /* renamed from: c */
    public final void m5319c() {
            r3 = this;
            boolean r0 = r3.m5323g()
            if (r0 != 0) goto L7
            return
        L7:
            r0 = 0
        L8:
            s5.n r1 = r3.f9186n
            int r2 = r1.f23068a
            if (r0 >= r2) goto L22
            boolean r1 = r1.m12442b(r0)
            s5.n r2 = r3.f9186n
            s5.f[] r2 = r2.f23070c
            r2 = r2[r0]
            if (r1 == 0) goto L1f
            if (r2 == 0) goto L1f
            r2.mo12405c()
        L1f:
            int r0 = r0 + 1
            goto L8
        L22:
            return
    }

    /* renamed from: d */
    public long m5320d() {
            r5 = this;
            boolean r0 = r5.f9176d
            if (r0 != 0) goto L9
            f4.m0 r0 = r5.f9178f
            long r0 = r0.f9205b
            return r0
        L9:
            boolean r0 = r5.f9177e
            r1 = -9223372036854775808
            if (r0 == 0) goto L16
            g5.o r0 = r5.f9173a
            long r3 = r0.mo5958m()
            goto L17
        L16:
            r3 = r1
        L17:
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L1f
            f4.m0 r0 = r5.f9178f
            long r3 = r0.f9208e
        L1f:
            return r3
    }

    /* renamed from: e */
    public long m5321e() {
            r4 = this;
            f4.m0 r0 = r4.f9178f
            long r0 = r0.f9205b
            long r2 = r4.f9187o
            long r0 = r0 + r2
            return r0
    }

    /* renamed from: f */
    public boolean m5322f() {
            r5 = this;
            boolean r0 = r5.f9176d
            if (r0 == 0) goto L16
            boolean r0 = r5.f9177e
            if (r0 == 0) goto L14
            g5.o r0 = r5.f9173a
            long r0 = r0.mo5958m()
            r2 = -9223372036854775808
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L16
        L14:
            r0 = 1
            goto L17
        L16:
            r0 = 0
        L17:
            return r0
    }

    /* renamed from: g */
    public final boolean m5323g() {
            r1 = this;
            f4.l0 r0 = r1.f9184l
            if (r0 != 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    /* renamed from: h */
    public void m5324h() {
            r3 = this;
            r3.m5318b()
            f4.r0 r0 = r3.f9183k
            g5.o r1 = r3.f9173a
            boolean r2 = r1 instanceof p108g5.C2258b     // Catch: java.lang.RuntimeException -> L13
            if (r2 == 0) goto Lf
            g5.b r1 = (p108g5.C2258b) r1     // Catch: java.lang.RuntimeException -> L13
            g5.o r1 = r1.f10273Y     // Catch: java.lang.RuntimeException -> L13
        Lf:
            r0.m5393h(r1)     // Catch: java.lang.RuntimeException -> L13
            goto L1b
        L13:
            r0 = move-exception
            java.lang.String r1 = "MediaPeriodHolder"
            java.lang.String r2 = "Period release failed."
            p371v5.C6565o.m13369b(r1, r2, r0)
        L1b:
            return
    }

    /* renamed from: i */
    public p325s5.C5974n m5325i(float r5, p088f4.AbstractC2031n1 r6) {
            r4 = this;
            s5.m r0 = r4.f9182j
            f4.f1[] r1 = r4.f9181i
            g5.i0 r2 = r4.f9185m
            f4.m0 r3 = r4.f9178f
            g5.r$a r3 = r3.f9204a
            s5.n r6 = r0.mo12437b(r1, r2, r3, r6)
            s5.f[] r0 = r6.f23070c
            int r1 = r0.length
            r2 = 0
        L12:
            if (r2 >= r1) goto L1e
            r3 = r0[r2]
            if (r3 == 0) goto L1b
            r3.mo12408i(r5)
        L1b:
            int r2 = r2 + 1
            goto L12
        L1e:
            return r6
    }

    /* renamed from: j */
    public void m5326j() {
            r6 = this;
            g5.o r0 = r6.f9173a
            boolean r1 = r0 instanceof p108g5.C2258b
            if (r1 == 0) goto L1d
            f4.m0 r1 = r6.f9178f
            long r1 = r1.f9207d
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L15
            r1 = -9223372036854775808
        L15:
            g5.b r0 = (p108g5.C2258b) r0
            r3 = 0
            r0.f10277c0 = r3
            r0.f10278d0 = r1
        L1d:
            return
    }
}
