package p088f4;

/* renamed from: f4.o0 */
/* loaded from: classes.dex */
public final class C2033o0 {

    /* renamed from: a */
    public final p088f4.AbstractC2031n1.b f9260a;

    /* renamed from: b */
    public final p088f4.AbstractC2031n1.d f9261b;

    /* renamed from: c */
    public final p107g4.C2254p f9262c;

    /* renamed from: d */
    public final android.os.Handler f9263d;

    /* renamed from: e */
    public long f9264e;

    /* renamed from: f */
    public int f9265f;

    /* renamed from: g */
    public boolean f9266g;

    /* renamed from: h */
    public p088f4.C2024l0 f9267h;

    /* renamed from: i */
    public p088f4.C2024l0 f9268i;

    /* renamed from: j */
    public p088f4.C2024l0 f9269j;

    /* renamed from: k */
    public int f9270k;

    /* renamed from: l */
    public java.lang.Object f9271l;

    /* renamed from: m */
    public long f9272m;

    public C2033o0(p107g4.C2254p r1, android.os.Handler r2) {
            r0 = this;
            r0.<init>()
            r0.f9262c = r1
            r0.f9263d = r2
            f4.n1$b r1 = new f4.n1$b
            r1.<init>()
            r0.f9260a = r1
            f4.n1$d r1 = new f4.n1$d
            r1.<init>()
            r0.f9261b = r1
            return
    }

    /* renamed from: p */
    public static p108g5.InterfaceC2283r.a m5358p(p088f4.AbstractC2031n1 r15, java.lang.Object r16, long r17, long r19, p088f4.AbstractC2031n1.b r21) {
            r1 = r16
            r2 = r17
            r0 = r15
            r4 = r21
            r15.mo5090i(r1, r4)
            h5.a r0 = r4.f9231e0
            long r5 = r4.f9228b0
            int r7 = r0.f11235Z
            r8 = 1
            int r7 = r7 - r8
        L12:
            r9 = 0
            if (r7 < 0) goto L40
            r10 = -9223372036854775808
            int r12 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r12 != 0) goto L1c
            goto L3a
        L1c:
            h5.a$a r12 = r0.m6359a(r7)
            long r12 = r12.f11241Y
            int r14 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r14 != 0) goto L34
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r12 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r12 == 0) goto L38
            int r10 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r10 >= 0) goto L3a
            goto L38
        L34:
            int r10 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r10 >= 0) goto L3a
        L38:
            r10 = 1
            goto L3b
        L3a:
            r10 = 0
        L3b:
            if (r10 == 0) goto L40
            int r7 = r7 + (-1)
            goto L12
        L40:
            r5 = -1
            if (r7 < 0) goto L63
            h5.a$a r0 = r0.m6359a(r7)
            int r6 = r0.f11242Z
            if (r6 != r5) goto L4c
            goto L60
        L4c:
            r6 = 0
        L4d:
            int r10 = r0.f11242Z
            if (r6 >= r10) goto L5f
            int[] r10 = r0.f11244b0
            r11 = r10[r6]
            if (r11 == 0) goto L60
            r10 = r10[r6]
            if (r10 != r8) goto L5c
            goto L60
        L5c:
            int r6 = r6 + 1
            goto L4d
        L5f:
            r8 = 0
        L60:
            if (r8 == 0) goto L63
            goto L64
        L63:
            r7 = -1
        L64:
            if (r7 != r5) goto L72
            int r0 = r4.m5347b(r2)
            g5.r$a r2 = new g5.r$a
            r5 = r19
            r2.<init>(r1, r5, r0)
            return r2
        L72:
            r5 = r19
            int r3 = r4.m5349d(r7)
            g5.r$a r8 = new g5.r$a
            r0 = r8
            r1 = r16
            r2 = r7
            r4 = r19
            r0.<init>(r1, r2, r3, r4)
            return r8
    }

    /* renamed from: a */
    public p088f4.C2024l0 m5359a() {
            r3 = this;
            f4.l0 r0 = r3.f9267h
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            f4.l0 r2 = r3.f9268i
            if (r0 != r2) goto Le
            f4.l0 r2 = r0.f9184l
            r3.f9268i = r2
        Le:
            r0.m5324h()
            int r0 = r3.f9270k
            int r0 = r0 + (-1)
            r3.f9270k = r0
            if (r0 != 0) goto L29
            r3.f9269j = r1
            f4.l0 r0 = r3.f9267h
            java.lang.Object r1 = r0.f9174b
            r3.f9271l = r1
            f4.m0 r0 = r0.f9178f
            g5.r$a r0 = r0.f9204a
            long r0 = r0.f10418d
            r3.f9272m = r0
        L29:
            f4.l0 r0 = r3.f9267h
            f4.l0 r0 = r0.f9184l
            r3.f9267h = r0
            r3.m5370l()
            f4.l0 r0 = r3.f9267h
            return r0
    }

    /* renamed from: b */
    public void m5360b() {
            r3 = this;
            int r0 = r3.f9270k
            if (r0 != 0) goto L5
            return
        L5:
            f4.l0 r0 = r3.f9267h
            p371v5.C6549a.m13292f(r0)
            f4.l0 r0 = (p088f4.C2024l0) r0
            java.lang.Object r1 = r0.f9174b
            r3.f9271l = r1
            f4.m0 r1 = r0.f9178f
            g5.r$a r1 = r1.f9204a
            long r1 = r1.f10418d
            r3.f9272m = r1
        L18:
            if (r0 == 0) goto L20
            r0.m5324h()
            f4.l0 r0 = r0.f9184l
            goto L18
        L20:
            r0 = 0
            r3.f9267h = r0
            r3.f9269j = r0
            r3.f9268i = r0
            r0 = 0
            r3.f9270k = r0
            r3.m5370l()
            return
    }

    /* renamed from: c */
    public final p088f4.C2027m0 m5361c(p088f4.AbstractC2031n1 r19, p088f4.C2024l0 r20, long r21) {
            r18 = this;
            r9 = r18
            r8 = r19
            r10 = r20
            f4.m0 r11 = r10.f9178f
            long r0 = r10.f9187o
            long r2 = r11.f9208e
            long r0 = r0 + r2
            long r6 = r0 - r21
            boolean r0 = r11.f9210g
            r14 = 0
            r5 = -1
            r16 = 0
            if (r0 == 0) goto La7
            g5.r$a r0 = r11.f9204a
            java.lang.Object r0 = r0.f10415a
            int r1 = r8.mo5086c(r0)
            f4.n1$b r2 = r9.f9260a
            f4.n1$d r3 = r9.f9261b
            int r4 = r9.f9265f
            boolean r0 = r9.f9266g
            r17 = r0
            r0 = r19
            r12 = -1
            r5 = r17
            int r0 = r0.m5339e(r1, r2, r3, r4, r5)
            if (r0 != r12) goto L36
            return r16
        L36:
            f4.n1$b r1 = r9.f9260a
            r2 = 1
            f4.n1$b r1 = r8.mo5089h(r0, r1, r2)
            int r3 = r1.f9227a0
            f4.n1$b r1 = r9.f9260a
            java.lang.Object r1 = r1.f9226Z
            g5.r$a r2 = r11.f9204a
            long r4 = r2.f10418d
            f4.n1$d r2 = r9.f9261b
            f4.n1$d r2 = r8.m5343o(r3, r2)
            int r2 = r2.f9254m0
            if (r2 != r0) goto L92
            f4.n1$d r1 = r9.f9261b
            f4.n1$b r2 = r9.f9260a
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            long r6 = java.lang.Math.max(r14, r6)
            r0 = r19
            android.util.Pair r0 = r0.m5342l(r1, r2, r3, r4, r6)
            if (r0 != 0) goto L67
            return r16
        L67:
            java.lang.Object r1 = r0.first
            java.lang.Object r0 = r0.second
            java.lang.Long r0 = (java.lang.Long) r0
            long r2 = r0.longValue()
            f4.l0 r0 = r10.f9184l
            if (r0 == 0) goto L84
            java.lang.Object r4 = r0.f9174b
            boolean r4 = r4.equals(r1)
            if (r4 == 0) goto L84
            f4.m0 r0 = r0.f9178f
            g5.r$a r0 = r0.f9204a
            long r4 = r0.f10418d
            goto L8b
        L84:
            long r4 = r9.f9264e
            r6 = 1
            long r6 = r6 + r4
            r9.f9264e = r6
        L8b:
            r10 = r2
            r14 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L93
        L92:
            r10 = r14
        L93:
            f4.n1$b r6 = r9.f9260a
            r0 = r19
            r2 = r10
            g5.r$a r2 = m5358p(r0, r1, r2, r4, r6)
            r0 = r18
            r1 = r19
            r3 = r14
            r5 = r10
            f4.m0 r0 = r0.m5362d(r1, r2, r3, r5)
            return r0
        La7:
            r12 = -1
            g5.r$a r10 = r11.f9204a
            java.lang.Object r0 = r10.f10415a
            f4.n1$b r1 = r9.f9260a
            r8.mo5090i(r0, r1)
            boolean r0 = r10.m6028a()
            if (r0 == 0) goto L130
            int r3 = r10.f10416b
            f4.n1$b r0 = r9.f9260a
            h5.a r0 = r0.f9231e0
            h5.a$a r0 = r0.m6359a(r3)
            int r0 = r0.f11242Z
            if (r0 != r12) goto Lc6
            return r16
        Lc6:
            f4.n1$b r1 = r9.f9260a
            int r2 = r10.f10417c
            h5.a r1 = r1.f9231e0
            h5.a$a r1 = r1.m6359a(r3)
            int r4 = r1.m6361a(r2)
            if (r4 >= r0) goto Le6
            java.lang.Object r2 = r10.f10415a
            long r5 = r11.f9206c
            long r10 = r10.f10418d
            r0 = r18
            r1 = r19
            r7 = r10
            f4.m0 r0 = r0.m5363e(r1, r2, r3, r4, r5, r7)
            return r0
        Le6:
            long r0 = r11.f9206c
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L111
            f4.n1$d r1 = r9.f9261b
            f4.n1$b r2 = r9.f9260a
            int r3 = r2.f9227a0
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            long r6 = java.lang.Math.max(r14, r6)
            r0 = r19
            android.util.Pair r0 = r0.m5342l(r1, r2, r3, r4, r6)
            if (r0 != 0) goto L109
            return r16
        L109:
            java.lang.Object r0 = r0.second
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
        L111:
            java.lang.Object r2 = r10.f10415a
            int r3 = r10.f10416b
            long r2 = r9.m5365g(r8, r2, r3)
            java.lang.Object r4 = r10.f10415a
            long r5 = java.lang.Math.max(r2, r0)
            long r11 = r11.f9206c
            long r13 = r10.f10418d
            r0 = r18
            r1 = r19
            r2 = r4
            r3 = r5
            r5 = r11
            r7 = r13
            f4.m0 r0 = r0.m5364f(r1, r2, r3, r5, r7)
            return r0
        L130:
            f4.n1$b r0 = r9.f9260a
            int r1 = r10.f10419e
            int r4 = r0.m5349d(r1)
            f4.n1$b r0 = r9.f9260a
            int r1 = r10.f10419e
            h5.a r0 = r0.f9231e0
            h5.a$a r0 = r0.m6359a(r1)
            int r0 = r0.f11242Z
            if (r4 != r0) goto L15e
            java.lang.Object r0 = r10.f10415a
            int r1 = r10.f10419e
            long r3 = r9.m5365g(r8, r0, r1)
            java.lang.Object r2 = r10.f10415a
            long r5 = r11.f9208e
            long r10 = r10.f10418d
            r0 = r18
            r1 = r19
            r7 = r10
            f4.m0 r0 = r0.m5364f(r1, r2, r3, r5, r7)
            return r0
        L15e:
            java.lang.Object r2 = r10.f10415a
            int r3 = r10.f10419e
            long r5 = r11.f9208e
            long r10 = r10.f10418d
            r0 = r18
            r1 = r19
            r7 = r10
            f4.m0 r0 = r0.m5363e(r1, r2, r3, r4, r5, r7)
            return r0
    }

    /* renamed from: d */
    public final p088f4.C2027m0 m5362d(p088f4.AbstractC2031n1 r13, p108g5.InterfaceC2283r.a r14, long r15, long r17) {
            r12 = this;
            r0 = r14
            java.lang.Object r1 = r0.f10415a
            r11 = r12
            f4.n1$b r2 = r11.f9260a
            r3 = r13
            r13.mo5090i(r1, r2)
            boolean r1 = r14.m6028a()
            java.lang.Object r4 = r0.f10415a
            if (r1 == 0) goto L20
            int r5 = r0.f10416b
            int r6 = r0.f10417c
            long r9 = r0.f10418d
            r2 = r12
            r3 = r13
            r7 = r15
            f4.m0 r0 = r2.m5363e(r3, r4, r5, r6, r7, r9)
            return r0
        L20:
            long r9 = r0.f10418d
            r2 = r12
            r3 = r13
            r5 = r17
            r7 = r15
            f4.m0 r0 = r2.m5364f(r3, r4, r5, r7, r9)
            return r0
    }

    /* renamed from: e */
    public final p088f4.C2027m0 m5363e(p088f4.AbstractC2031n1 r18, java.lang.Object r19, int r20, int r21, long r22, long r24) {
            r17 = this;
            r0 = r17
            r7 = r20
            r8 = r21
            g5.r$a r9 = new g5.r$a
            r1 = r9
            r2 = r19
            r3 = r20
            r4 = r21
            r5 = r24
            r1.<init>(r2, r3, r4, r5)
            f4.n1$b r1 = r0.f9260a
            r2 = r18
            r3 = r19
            f4.n1$b r1 = r2.mo5090i(r3, r1)
            long r10 = r1.m5346a(r7, r8)
            f4.n1$b r1 = r0.f9260a
            h5.a r1 = r1.f9231e0
            h5.a$a r1 = r1.m6359a(r7)
            r2 = -1
            int r1 = r1.m6361a(r2)
            r2 = 0
            if (r8 != r1) goto L3a
            f4.n1$b r1 = r0.f9260a
            h5.a r1 = r1.f9231e0
            long r4 = r1.f11236a0
            goto L3b
        L3a:
            r4 = r2
        L3b:
            f4.n1$b r1 = r0.f9260a
            h5.a r1 = r1.f9231e0
            h5.a$a r1 = r1.m6359a(r7)
            boolean r12 = r1.f11247e0
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r1 == 0) goto L5c
            int r1 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r1 < 0) goto L5c
            r4 = 1
            long r4 = r10 - r4
            long r1 = java.lang.Math.max(r2, r4)
            r3 = r1
            goto L5d
        L5c:
            r3 = r4
        L5d:
            f4.m0 r15 = new f4.m0
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r13 = 0
            r14 = 0
            r16 = 0
            r1 = r15
            r2 = r9
            r5 = r22
            r9 = r10
            r11 = r12
            r12 = r13
            r13 = r14
            r14 = r16
            r1.<init>(r2, r3, r5, r7, r9, r11, r12, r13, r14)
            return r15
    }

    /* renamed from: f */
    public final p088f4.C2027m0 m5364f(p088f4.AbstractC2031n1 r21, java.lang.Object r22, long r23, long r25, long r27) {
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = r22
            r3 = r23
            f4.n1$b r5 = r0.f9260a
            r1.mo5090i(r2, r5)
            f4.n1$b r5 = r0.f9260a
            int r5 = r5.m5347b(r3)
            g5.r$a r7 = new g5.r$a
            r8 = r27
            r7.<init>(r2, r8, r5)
            boolean r2 = r0.m5367i(r7)
            boolean r18 = r0.m5369k(r1, r7)
            boolean r19 = r0.m5368j(r1, r7, r2)
            r1 = -1
            if (r5 == r1) goto L35
            f4.n1$b r6 = r0.f9260a
            boolean r6 = r6.m5350e(r5)
            if (r6 == 0) goto L35
            r6 = 1
            r16 = 1
            goto L38
        L35:
            r6 = 0
            r16 = 0
        L38:
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r5 == r1) goto L47
            f4.n1$b r1 = r0.f9260a
            long r5 = r1.m5348c(r5)
            r12 = r5
            goto L48
        L47:
            r12 = r8
        L48:
            int r1 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            if (r1 == 0) goto L55
            r5 = -9223372036854775808
            int r1 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r1 != 0) goto L53
            goto L55
        L53:
            r14 = r12
            goto L5a
        L55:
            f4.n1$b r1 = r0.f9260a
            long r5 = r1.f9228b0
            r14 = r5
        L5a:
            int r1 = (r14 > r8 ? 1 : (r14 == r8 ? 0 : -1))
            if (r1 == 0) goto L6c
            int r1 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1))
            if (r1 < 0) goto L6c
            r3 = 0
            r5 = 1
            long r5 = r14 - r5
            long r3 = java.lang.Math.max(r3, r5)
        L6c:
            r8 = r3
            f4.m0 r1 = new f4.m0
            r6 = r1
            r10 = r25
            r17 = r2
            r6.<init>(r7, r8, r10, r12, r14, r16, r17, r18, r19)
            return r1
    }

    /* renamed from: g */
    public final long m5365g(p088f4.AbstractC2031n1 r4, java.lang.Object r5, int r6) {
            r3 = this;
            f4.n1$b r0 = r3.f9260a
            r4.mo5090i(r5, r0)
            f4.n1$b r4 = r3.f9260a
            h5.a r4 = r4.f9231e0
            h5.a$a r4 = r4.m6359a(r6)
            long r4 = r4.f11241Y
            r0 = -9223372036854775808
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 != 0) goto L1a
            f4.n1$b r4 = r3.f9260a
            long r4 = r4.f9228b0
            return r4
        L1a:
            f4.n1$b r0 = r3.f9260a
            h5.a r0 = r0.f9231e0
            h5.a$a r6 = r0.m6359a(r6)
            long r0 = r6.f11246d0
            long r4 = r4 + r0
            return r4
    }

    /* renamed from: h */
    public p088f4.C2027m0 m5366h(p088f4.AbstractC2031n1 r19, p088f4.C2027m0 r20) {
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            g5.r$a r3 = r2.f9204a
            boolean r12 = r0.m5367i(r3)
            boolean r13 = r0.m5369k(r1, r3)
            boolean r14 = r0.m5368j(r1, r3, r12)
            g5.r$a r4 = r2.f9204a
            java.lang.Object r4 = r4.f10415a
            f4.n1$b r5 = r0.f9260a
            r1.mo5090i(r4, r5)
            boolean r1 = r3.m6028a()
            r4 = -1
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r1 != 0) goto L35
            int r1 = r3.f10419e
            if (r1 != r4) goto L2e
            goto L35
        L2e:
            f4.n1$b r7 = r0.f9260a
            long r7 = r7.m5348c(r1)
            goto L36
        L35:
            r7 = r5
        L36:
            boolean r1 = r3.m6028a()
            if (r1 == 0) goto L48
            f4.n1$b r1 = r0.f9260a
            int r5 = r3.f10416b
            int r6 = r3.f10417c
            long r5 = r1.m5346a(r5, r6)
        L46:
            r9 = r5
            goto L5a
        L48:
            int r1 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r1 == 0) goto L55
            r5 = -9223372036854775808
            int r1 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r1 != 0) goto L53
            goto L55
        L53:
            r9 = r7
            goto L5a
        L55:
            f4.n1$b r1 = r0.f9260a
            long r5 = r1.f9228b0
            goto L46
        L5a:
            boolean r1 = r3.m6028a()
            if (r1 == 0) goto L6a
            f4.n1$b r1 = r0.f9260a
            int r4 = r3.f10416b
            boolean r1 = r1.m5350e(r4)
            r11 = r1
            goto L7b
        L6a:
            int r1 = r3.f10419e
            if (r1 == r4) goto L79
            f4.n1$b r4 = r0.f9260a
            boolean r1 = r4.m5350e(r1)
            if (r1 == 0) goto L79
            r1 = 1
            r11 = 1
            goto L7b
        L79:
            r1 = 0
            r11 = 0
        L7b:
            f4.m0 r15 = new f4.m0
            long r4 = r2.f9205b
            long r1 = r2.f9206c
            r16 = r1
            r1 = r15
            r2 = r3
            r3 = r4
            r5 = r16
            r1.<init>(r2, r3, r5, r7, r9, r11, r12, r13, r14)
            return r15
    }

    /* renamed from: i */
    public final boolean m5367i(p108g5.InterfaceC2283r.a r2) {
            r1 = this;
            boolean r0 = r2.m6028a()
            if (r0 != 0) goto Ld
            int r2 = r2.f10419e
            r0 = -1
            if (r2 != r0) goto Ld
            r2 = 1
            goto Le
        Ld:
            r2 = 0
        Le:
            return r2
    }

    /* renamed from: j */
    public final boolean m5368j(p088f4.AbstractC2031n1 r9, p108g5.InterfaceC2283r.a r10, boolean r11) {
            r8 = this;
            java.lang.Object r10 = r10.f10415a
            int r1 = r9.mo5086c(r10)
            f4.n1$b r10 = r8.f9260a
            f4.n1$b r10 = r9.m5340g(r1, r10)
            int r10 = r10.f9227a0
            f4.n1$d r0 = r8.f9261b
            f4.n1$d r10 = r9.m5343o(r10, r0)
            boolean r10 = r10.f9248g0
            r6 = 0
            r7 = 1
            if (r10 != 0) goto L32
            f4.n1$b r2 = r8.f9260a
            f4.n1$d r3 = r8.f9261b
            int r4 = r8.f9265f
            boolean r5 = r8.f9266g
            r0 = r9
            int r9 = r0.m5339e(r1, r2, r3, r4, r5)
            r10 = -1
            if (r9 != r10) goto L2c
            r9 = 1
            goto L2d
        L2c:
            r9 = 0
        L2d:
            if (r9 == 0) goto L32
            if (r11 == 0) goto L32
            r6 = 1
        L32:
            return r6
    }

    /* renamed from: k */
    public final boolean m5369k(p088f4.AbstractC2031n1 r4, p108g5.InterfaceC2283r.a r5) {
            r3 = this;
            boolean r0 = r3.m5367i(r5)
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            java.lang.Object r0 = r5.f10415a
            f4.n1$b r2 = r3.f9260a
            f4.n1$b r0 = r4.mo5090i(r0, r2)
            int r0 = r0.f9227a0
            java.lang.Object r5 = r5.f10415a
            int r5 = r4.mo5086c(r5)
            f4.n1$d r2 = r3.f9261b
            f4.n1$d r4 = r4.m5343o(r0, r2)
            int r4 = r4.f9255n0
            if (r4 != r5) goto L23
            r1 = 1
        L23:
            return r1
    }

    /* renamed from: l */
    public final void m5370l() {
            r4 = this;
            g4.p r0 = r4.f9262c
            if (r0 == 0) goto L2d
            b9.a<java.lang.Object> r0 = p026b9.AbstractC0714n.f3979Z
            b9.n$a r0 = new b9.n$a
            r0.<init>()
            f4.l0 r1 = r4.f9267h
        Ld:
            if (r1 == 0) goto L19
            f4.m0 r2 = r1.f9178f
            g5.r$a r2 = r2.f9204a
            r0.m2316b(r2)
            f4.l0 r1 = r1.f9184l
            goto Ld
        L19:
            f4.l0 r1 = r4.f9268i
            if (r1 != 0) goto L1f
            r1 = 0
            goto L23
        L1f:
            f4.m0 r1 = r1.f9178f
            g5.r$a r1 = r1.f9204a
        L23:
            android.os.Handler r2 = r4.f9263d
            f4.n0 r3 = new f4.n0
            r3.<init>(r4, r0, r1)
            r2.post(r3)
        L2d:
            return
    }

    /* renamed from: m */
    public void m5371m(long r5) {
            r4 = this;
            f4.l0 r0 = r4.f9269j
            if (r0 == 0) goto L17
            boolean r1 = r0.m5323g()
            p371v5.C6549a.m13291e(r1)
            boolean r1 = r0.f9176d
            if (r1 == 0) goto L17
            g5.o r1 = r0.f9173a
            long r2 = r0.f9187o
            long r5 = r5 - r2
            r1.mo5964s(r5)
        L17:
            return
    }

    /* renamed from: n */
    public boolean m5372n(p088f4.C2024l0 r4) {
            r3 = this;
            r0 = 0
            r1 = 1
            if (r4 == 0) goto L6
            r2 = 1
            goto L7
        L6:
            r2 = 0
        L7:
            p371v5.C6549a.m13291e(r2)
            f4.l0 r2 = r3.f9269j
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L13
            return r0
        L13:
            r3.f9269j = r4
        L15:
            f4.l0 r4 = r4.f9184l
            if (r4 == 0) goto L2b
            f4.l0 r2 = r3.f9268i
            if (r4 != r2) goto L22
            f4.l0 r0 = r3.f9267h
            r3.f9268i = r0
            r0 = 1
        L22:
            r4.m5324h()
            int r2 = r3.f9270k
            int r2 = r2 - r1
            r3.f9270k = r2
            goto L15
        L2b:
            f4.l0 r4 = r3.f9269j
            r1 = 0
            f4.l0 r2 = r4.f9184l
            if (r2 != 0) goto L33
            goto L3b
        L33:
            r4.m5318b()
            r4.f9184l = r1
            r4.m5319c()
        L3b:
            r3.m5370l()
            return r0
    }

    /* renamed from: o */
    public p108g5.InterfaceC2283r.a m5373o(p088f4.AbstractC2031n1 r11, java.lang.Object r12, long r13) {
            r10 = this;
            f4.n1$b r0 = r10.f9260a
            f4.n1$b r0 = r11.mo5090i(r12, r0)
            int r0 = r0.f9227a0
            java.lang.Object r1 = r10.f9271l
            r2 = -1
            if (r1 == 0) goto L21
            int r1 = r11.mo5086c(r1)
            if (r1 == r2) goto L21
            f4.n1$b r3 = r10.f9260a
            f4.n1$b r1 = r11.m5340g(r1, r3)
            int r1 = r1.f9227a0
            if (r1 != r0) goto L21
            long r0 = r10.f9272m
        L1f:
            r7 = r0
            goto L61
        L21:
            f4.l0 r1 = r10.f9267h
        L23:
            if (r1 == 0) goto L31
            java.lang.Object r3 = r1.f9174b
            boolean r3 = r3.equals(r12)
            if (r3 == 0) goto L2e
            goto L47
        L2e:
            f4.l0 r1 = r1.f9184l
            goto L23
        L31:
            f4.l0 r1 = r10.f9267h
        L33:
            if (r1 == 0) goto L51
            java.lang.Object r3 = r1.f9174b
            int r3 = r11.mo5086c(r3)
            if (r3 == r2) goto L4e
            f4.n1$b r4 = r10.f9260a
            f4.n1$b r3 = r11.m5340g(r3, r4)
            int r3 = r3.f9227a0
            if (r3 != r0) goto L4e
        L47:
            f4.m0 r0 = r1.f9178f
            g5.r$a r0 = r0.f9204a
            long r0 = r0.f10418d
            goto L1f
        L4e:
            f4.l0 r1 = r1.f9184l
            goto L33
        L51:
            long r0 = r10.f9264e
            r2 = 1
            long r2 = r2 + r0
            r10.f9264e = r2
            f4.l0 r2 = r10.f9267h
            if (r2 != 0) goto L1f
            r10.f9271l = r12
            r10.f9272m = r0
            goto L1f
        L61:
            f4.n1$b r9 = r10.f9260a
            r3 = r11
            r4 = r12
            r5 = r13
            g5.r$a r11 = m5358p(r3, r4, r5, r7, r9)
            return r11
    }

    /* renamed from: q */
    public final boolean m5374q(p088f4.AbstractC2031n1 r9) {
            r8 = this;
            f4.l0 r0 = r8.f9267h
            r1 = 1
            if (r0 != 0) goto L6
            return r1
        L6:
            java.lang.Object r2 = r0.f9174b
            int r2 = r9.mo5086c(r2)
            r3 = r2
        Ld:
            f4.n1$b r4 = r8.f9260a
            f4.n1$d r5 = r8.f9261b
            int r6 = r8.f9265f
            boolean r7 = r8.f9266g
            r2 = r9
            int r3 = r2.m5339e(r3, r4, r5, r6, r7)
        L1a:
            f4.l0 r2 = r0.f9184l
            if (r2 == 0) goto L26
            f4.m0 r4 = r0.f9178f
            boolean r4 = r4.f9210g
            if (r4 != 0) goto L26
            r0 = r2
            goto L1a
        L26:
            r4 = -1
            if (r3 == r4) goto L37
            if (r2 != 0) goto L2c
            goto L37
        L2c:
            java.lang.Object r4 = r2.f9174b
            int r4 = r9.mo5086c(r4)
            if (r4 == r3) goto L35
            goto L37
        L35:
            r0 = r2
            goto Ld
        L37:
            boolean r2 = r8.m5372n(r0)
            f4.m0 r3 = r0.f9178f
            f4.m0 r9 = r8.m5366h(r9, r3)
            r0.f9178f = r9
            r9 = r2 ^ 1
            return r9
    }

    /* renamed from: r */
    public boolean m5375r(p088f4.AbstractC2031n1 r17, long r18, long r20) {
            r16 = this;
            r0 = r16
            r1 = r17
            f4.l0 r2 = r0.f9267h
            r3 = 0
        L7:
            r4 = 1
            if (r2 == 0) goto L9b
            f4.m0 r5 = r2.f9178f
            r6 = 0
            if (r3 != 0) goto L16
            f4.m0 r3 = r0.m5366h(r1, r5)
            r7 = r18
            goto L41
        L16:
            r7 = r18
            f4.m0 r9 = r0.m5361c(r1, r3, r7)
            if (r9 != 0) goto L24
            boolean r1 = r0.m5372n(r3)
        L22:
            r1 = r1 ^ r4
            return r1
        L24:
            long r10 = r5.f9205b
            long r12 = r9.f9205b
            int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r14 != 0) goto L38
            g5.r$a r10 = r5.f9204a
            g5.r$a r11 = r9.f9204a
            boolean r10 = r10.equals(r11)
            if (r10 == 0) goto L38
            r10 = 1
            goto L39
        L38:
            r10 = 0
        L39:
            if (r10 != 0) goto L40
            boolean r1 = r0.m5372n(r3)
            goto L22
        L40:
            r3 = r9
        L41:
            long r9 = r5.f9206c
            f4.m0 r9 = r3.m5334a(r9)
            r2.f9178f = r9
            long r9 = r5.f9208e
            long r11 = r3.f9208e
            r13 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r5 == 0) goto L5d
            int r5 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r5 != 0) goto L5b
            goto L5d
        L5b:
            r5 = 0
            goto L5e
        L5d:
            r5 = 1
        L5e:
            if (r5 != 0) goto L94
            r2.m5326j()
            long r7 = r3.f9208e
            int r1 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
            if (r1 != 0) goto L6f
            r7 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L72
        L6f:
            long r9 = r2.f9187o
            long r7 = r7 + r9
        L72:
            f4.l0 r1 = r0.f9268i
            if (r2 != r1) goto L88
            f4.m0 r1 = r2.f9178f
            boolean r1 = r1.f9209f
            if (r1 != 0) goto L88
            r9 = -9223372036854775808
            int r1 = (r20 > r9 ? 1 : (r20 == r9 ? 0 : -1))
            if (r1 == 0) goto L86
            int r1 = (r20 > r7 ? 1 : (r20 == r7 ? 0 : -1))
            if (r1 < 0) goto L88
        L86:
            r1 = 1
            goto L89
        L88:
            r1 = 0
        L89:
            boolean r2 = r0.m5372n(r2)
            if (r2 != 0) goto L92
            if (r1 != 0) goto L92
            goto L93
        L92:
            r4 = 0
        L93:
            return r4
        L94:
            f4.l0 r3 = r2.f9184l
            r15 = r3
            r3 = r2
            r2 = r15
            goto L7
        L9b:
            return r4
    }
}
