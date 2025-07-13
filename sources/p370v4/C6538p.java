package p370v4;

/* renamed from: v4.p */
/* loaded from: classes.dex */
public final class C6538p implements p370v4.InterfaceC6532j {

    /* renamed from: a */
    public final java.lang.String f25533a;

    /* renamed from: b */
    public final p371v5.C6571u f25534b;

    /* renamed from: c */
    public final p216m4.C4355b0 f25535c;

    /* renamed from: d */
    public p216m4.InterfaceC4381z f25536d;

    /* renamed from: e */
    public java.lang.String f25537e;

    /* renamed from: f */
    public p088f4.C2003e0 f25538f;

    /* renamed from: g */
    public int f25539g;

    /* renamed from: h */
    public int f25540h;

    /* renamed from: i */
    public int f25541i;

    /* renamed from: j */
    public int f25542j;

    /* renamed from: k */
    public long f25543k;

    /* renamed from: l */
    public boolean f25544l;

    /* renamed from: m */
    public int f25545m;

    /* renamed from: n */
    public int f25546n;

    /* renamed from: o */
    public int f25547o;

    /* renamed from: p */
    public boolean f25548p;

    /* renamed from: q */
    public long f25549q;

    /* renamed from: r */
    public int f25550r;

    /* renamed from: s */
    public long f25551s;

    /* renamed from: t */
    public int f25552t;

    /* renamed from: u */
    public java.lang.String f25553u;

    public C6538p(java.lang.String r4) {
            r3 = this;
            r3.<init>()
            r3.f25533a = r4
            v5.u r4 = new v5.u
            r0 = 1024(0x400, float:1.435E-42)
            r4.<init>(r0)
            r3.f25534b = r4
            m4.b0 r0 = new m4.b0
            byte[] r4 = r4.f25710a
            r1 = 1
            r2 = 0
            r0.<init>(r4, r1, r2)
            r3.f25535c = r0
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r3.f25543k = r0
            return
    }

    /* renamed from: b */
    public static long m13274b(p216m4.C4355b0 r2) {
            r0 = 2
            int r0 = r2.m9766k(r0)
            int r0 = r0 + 1
            int r0 = r0 * 8
            int r2 = r2.m9766k(r0)
            long r0 = (long) r2
            return r0
    }

    @Override // p370v4.InterfaceC6532j
    /* renamed from: a */
    public void mo13241a() {
            r3 = this;
            r0 = 0
            r3.f25539g = r0
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r3.f25543k = r1
            r3.f25544l = r0
            return
    }

    @Override // p370v4.InterfaceC6532j
    /* renamed from: c */
    public void mo13242c(p371v5.C6571u r15) {
            r14 = this;
            m4.z r0 = r14.f25536d
            p371v5.C6549a.m13292f(r0)
        L5:
            int r0 = r15.m13398a()
            if (r0 <= 0) goto L217
            int r0 = r14.f25539g
            r1 = 86
            r2 = 1
            if (r0 == 0) goto L20d
            r3 = 2
            r4 = 0
            if (r0 == r2) goto L1fa
            r1 = 3
            r5 = 8
            if (r0 == r3) goto L1c7
            if (r0 != r1) goto L1c1
            int r0 = r15.m13398a()
            int r3 = r14.f25541i
            int r6 = r14.f25540h
            int r3 = r3 - r6
            int r0 = java.lang.Math.min(r0, r3)
            m4.b0 r3 = r14.f25535c
            java.lang.Object r3 = r3.f17870b
            byte[] r3 = (byte[]) r3
            int r6 = r14.f25540h
            r15.m13402e(r3, r6, r0)
            int r3 = r14.f25540h
            int r3 = r3 + r0
            r14.f25540h = r3
            int r0 = r14.f25541i
            if (r3 != r0) goto L5
            m4.b0 r0 = r14.f25535c
            r0.m9772q(r4)
            m4.b0 r0 = r14.f25535c
            boolean r3 = r0.m9765j()
            r6 = 0
            if (r3 != 0) goto L147
            r14.f25544l = r2
            int r3 = r0.m9766k(r2)
            if (r3 != r2) goto L59
            int r7 = r0.m9766k(r2)
            goto L5a
        L59:
            r7 = 0
        L5a:
            r14.f25545m = r7
            if (r7 != 0) goto L142
            if (r3 != r2) goto L63
            m13274b(r0)
        L63:
            boolean r7 = r0.m9765j()
            if (r7 == 0) goto L13d
            r7 = 6
            int r8 = r0.m9766k(r7)
            r14.f25546n = r8
            r8 = 4
            int r9 = r0.m9766k(r8)
            int r10 = r0.m9766k(r1)
            if (r9 != 0) goto L138
            if (r10 != 0) goto L138
            if (r3 != 0) goto Ld2
            int r9 = r0.m9763h()
            int r10 = r14.m13275g(r0)
            r0.m9772q(r9)
            int r9 = r10 + 7
            int r9 = r9 / r5
            byte[] r9 = new byte[r9]
            r0.m9767l(r9, r4, r10)
            f4.e0$b r10 = new f4.e0$b
            r10.<init>()
            java.lang.String r11 = r14.f25537e
            r10.f8917a = r11
            java.lang.String r11 = "audio/mp4a-latm"
            r10.f8927k = r11
            java.lang.String r11 = r14.f25553u
            r10.f8924h = r11
            int r11 = r14.f25552t
            r10.f8940x = r11
            int r11 = r14.f25550r
            r10.f8941y = r11
            java.util.List r9 = java.util.Collections.singletonList(r9)
            r10.f8929m = r9
            java.lang.String r9 = r14.f25533a
            r10.f8919c = r9
            f4.e0 r9 = r10.m5193a()
            f4.e0 r10 = r14.f25538f
            boolean r10 = r9.equals(r10)
            if (r10 != 0) goto Ldf
            r14.f25538f = r9
            r10 = 1024000000(0x3d090000, double:5.059232213E-315)
            int r12 = r9.f8910x0
            long r12 = (long) r12
            long r10 = r10 / r12
            r14.f25551s = r10
            m4.z r10 = r14.f25536d
            r10.mo5973e(r9)
            goto Ldf
        Ld2:
            long r9 = m13274b(r0)
            int r10 = (int) r9
            int r9 = r14.m13275g(r0)
            int r10 = r10 - r9
            r0.m9775t(r10)
        Ldf:
            int r9 = r0.m9766k(r1)
            r14.f25547o = r9
            if (r9 == 0) goto L103
            if (r9 == r2) goto L100
            if (r9 == r1) goto L105
            if (r9 == r8) goto L105
            r1 = 5
            if (r9 == r1) goto L105
            if (r9 == r7) goto Lfc
            r1 = 7
            if (r9 != r1) goto Lf6
            goto Lfc
        Lf6:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            r15.<init>()
            throw r15
        Lfc:
            r0.m9775t(r2)
            goto L108
        L100:
            r7 = 9
            goto L105
        L103:
            r7 = 8
        L105:
            r0.m9775t(r7)
        L108:
            boolean r1 = r0.m9765j()
            r14.f25548p = r1
            r7 = 0
            r14.f25549q = r7
            if (r1 == 0) goto L12e
            if (r3 != r2) goto L11d
            long r1 = m13274b(r0)
            r14.f25549q = r1
            goto L12e
        L11d:
            boolean r1 = r0.m9765j()
            long r2 = r14.f25549q
            long r2 = r2 << r5
            int r7 = r0.m9766k(r5)
            long r7 = (long) r7
            long r2 = r2 + r7
            r14.f25549q = r2
            if (r1 != 0) goto L11d
        L12e:
            boolean r1 = r0.m9765j()
            if (r1 == 0) goto L14c
            r0.m9775t(r5)
            goto L14c
        L138:
            f4.s0 r15 = p088f4.C2044s0.m5407a(r6, r6)
            throw r15
        L13d:
            f4.s0 r15 = p088f4.C2044s0.m5407a(r6, r6)
            throw r15
        L142:
            f4.s0 r15 = p088f4.C2044s0.m5407a(r6, r6)
            throw r15
        L147:
            boolean r1 = r14.f25544l
            if (r1 != 0) goto L14c
            goto L1ac
        L14c:
            int r1 = r14.f25545m
            if (r1 != 0) goto L1bc
            int r1 = r14.f25546n
            if (r1 != 0) goto L1b7
            int r1 = r14.f25547o
            if (r1 != 0) goto L1b2
            r1 = 0
        L159:
            int r2 = r0.m9766k(r5)
            int r10 = r1 + r2
            r1 = 255(0xff, float:3.57E-43)
            if (r2 == r1) goto L1b0
            int r1 = r0.m9763h()
            r2 = r1 & 7
            if (r2 != 0) goto L173
            v5.u r2 = r14.f25534b
            int r1 = r1 >> 3
            r2.m13396F(r1)
            goto L181
        L173:
            v5.u r1 = r14.f25534b
            byte[] r1 = r1.f25710a
            int r2 = r10 * 8
            r0.m9767l(r1, r4, r2)
            v5.u r1 = r14.f25534b
            r1.m13396F(r4)
        L181:
            m4.z r1 = r14.f25536d
            v5.u r2 = r14.f25534b
            r1.mo5972d(r2, r10)
            long r7 = r14.f25543k
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r3 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r3 == 0) goto L1a2
            m4.z r6 = r14.f25536d
            r9 = 1
            r11 = 0
            r12 = 0
            r6.mo5971c(r7, r9, r10, r11, r12)
            long r1 = r14.f25543k
            long r5 = r14.f25551s
            long r1 = r1 + r5
            r14.f25543k = r1
        L1a2:
            boolean r1 = r14.f25548p
            if (r1 == 0) goto L1ac
            long r1 = r14.f25549q
            int r2 = (int) r1
            r0.m9775t(r2)
        L1ac:
            r14.f25539g = r4
            goto L5
        L1b0:
            r1 = r10
            goto L159
        L1b2:
            f4.s0 r15 = p088f4.C2044s0.m5407a(r6, r6)
            throw r15
        L1b7:
            f4.s0 r15 = p088f4.C2044s0.m5407a(r6, r6)
            throw r15
        L1bc:
            f4.s0 r15 = p088f4.C2044s0.m5407a(r6, r6)
            throw r15
        L1c1:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            r15.<init>()
            throw r15
        L1c7:
            int r0 = r14.f25542j
            r0 = r0 & (-225(0xffffffffffffff1f, float:NaN))
            int r0 = r0 << r5
            int r2 = r15.m13418u()
            r0 = r0 | r2
            r14.f25541i = r0
            v5.u r2 = r14.f25534b
            byte[] r3 = r2.f25710a
            int r5 = r3.length
            if (r0 <= r5) goto L1f4
            int r5 = r3.length
            if (r5 >= r0) goto L1df
            byte[] r3 = new byte[r0]
        L1df:
            r2.m13394D(r3, r0)
            m4.b0 r0 = r14.f25535c
            v5.u r2 = r14.f25534b
            byte[] r2 = r2.f25710a
            java.util.Objects.requireNonNull(r0)
            int r3 = r2.length
            r0.f17870b = r2
            r0.f17871c = r4
            r0.f17872d = r4
            r0.f17873e = r3
        L1f4:
            r14.f25540h = r4
            r14.f25539g = r1
            goto L5
        L1fa:
            int r0 = r15.m13418u()
            r2 = r0 & 224(0xe0, float:3.14E-43)
            r5 = 224(0xe0, float:3.14E-43)
            if (r2 != r5) goto L20a
            r14.f25542j = r0
            r14.f25539g = r3
            goto L5
        L20a:
            if (r0 == r1) goto L5
            goto L1ac
        L20d:
            int r0 = r15.m13418u()
            if (r0 != r1) goto L5
            r14.f25539g = r2
            goto L5
        L217:
            return
    }

    @Override // p370v4.InterfaceC6532j
    /* renamed from: d */
    public void mo13243d(p216m4.InterfaceC4366k r3, p370v4.InterfaceC6525d0.d r4) {
            r2 = this;
            r4.m13253a()
            int r0 = r4.m13255c()
            r1 = 1
            m4.z r3 = r3.mo6048l(r0, r1)
            r2.f25536d = r3
            java.lang.String r3 = r4.m13254b()
            r2.f25537e = r3
            return
    }

    @Override // p370v4.InterfaceC6532j
    /* renamed from: e */
    public void mo13244e() {
            r0 = this;
            return
    }

    @Override // p370v4.InterfaceC6532j
    /* renamed from: f */
    public void mo13245f(long r3, int r5) {
            r2 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r5 == 0) goto Lb
            r2.f25543k = r3
        Lb:
            return
    }

    /* renamed from: g */
    public final int m13275g(p216m4.C4355b0 r4) {
            r3 = this;
            int r0 = r4.m9757b()
            r1 = 1
            h4.a$b r1 = p121h4.C2455a.m6235b(r4, r1)
            java.lang.String r2 = r1.f10958c
            r3.f25553u = r2
            int r2 = r1.f10956a
            r3.f25550r = r2
            int r1 = r1.f10957b
            r3.f25552t = r1
            int r4 = r4.m9757b()
            int r0 = r0 - r4
            return r0
    }
}
