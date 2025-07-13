package p336t4;

/* renamed from: t4.h */
/* loaded from: classes.dex */
public final class C6163h implements p216m4.InterfaceC4364i, p216m4.InterfaceC4378w {

    /* renamed from: y */
    public static final /* synthetic */ int f23818y = 0;

    /* renamed from: a */
    public final int f23819a;

    /* renamed from: b */
    public final p371v5.C6571u f23820b;

    /* renamed from: c */
    public final p371v5.C6571u f23821c;

    /* renamed from: d */
    public final p371v5.C6571u f23822d;

    /* renamed from: e */
    public final p371v5.C6571u f23823e;

    /* renamed from: f */
    public final java.util.ArrayDeque<p336t4.AbstractC6156a.a> f23824f;

    /* renamed from: g */
    public final p336t4.C6165j f23825g;

    /* renamed from: h */
    public final java.util.List<p427y4.C7110a.b> f23826h;

    /* renamed from: i */
    public int f23827i;

    /* renamed from: j */
    public int f23828j;

    /* renamed from: k */
    public long f23829k;

    /* renamed from: l */
    public int f23830l;

    /* renamed from: m */
    public p371v5.C6571u f23831m;

    /* renamed from: n */
    public int f23832n;

    /* renamed from: o */
    public int f23833o;

    /* renamed from: p */
    public int f23834p;

    /* renamed from: q */
    public int f23835q;

    /* renamed from: r */
    public p216m4.InterfaceC4366k f23836r;

    /* renamed from: s */
    public p336t4.C6163h.a[] f23837s;

    /* renamed from: t */
    public long[][] f23838t;

    /* renamed from: u */
    public int f23839u;

    /* renamed from: v */
    public long f23840v;

    /* renamed from: w */
    public int f23841w;

    /* renamed from: x */
    public p070e5.C1517b f23842x;

    /* renamed from: t4.h$a */
    public static final class a {

        /* renamed from: a */
        public final p336t4.C6167l f23843a;

        /* renamed from: b */
        public final p336t4.C6170o f23844b;

        /* renamed from: c */
        public final p216m4.InterfaceC4381z f23845c;

        /* renamed from: d */
        public final p216m4.C4353a0 f23846d;

        /* renamed from: e */
        public int f23847e;

        public a(p336t4.C6167l r1, p336t4.C6170o r2, p216m4.InterfaceC4381z r3) {
                r0 = this;
                r0.<init>()
                r0.f23843a = r1
                r0.f23844b = r2
                r0.f23845c = r3
                f4.e0 r1 = r1.f23864f
                java.lang.String r1 = r1.f8896j0
                java.lang.String r2 = "audio/true-hd"
                boolean r1 = r2.equals(r1)
                if (r1 == 0) goto L1b
                m4.a0 r1 = new m4.a0
                r1.<init>()
                goto L1c
            L1b:
                r1 = 0
            L1c:
                r0.f23846d = r1
                return
        }
    }

    static {
            k1.d r0 = p179k1.C3646d.f16121j0
            return
    }

    public C6163h(int r3) {
            r2 = this;
            r2.<init>()
            r2.f23819a = r3
            r0 = 4
            r3 = r3 & r0
            if (r3 == 0) goto Lb
            r3 = 3
            goto Lc
        Lb:
            r3 = 0
        Lc:
            r2.f23827i = r3
            t4.j r3 = new t4.j
            r3.<init>()
            r2.f23825g = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r2.f23826h = r3
            v5.u r3 = new v5.u
            r1 = 16
            r3.<init>(r1)
            r2.f23823e = r3
            java.util.ArrayDeque r3 = new java.util.ArrayDeque
            r3.<init>()
            r2.f23824f = r3
            v5.u r3 = new v5.u
            byte[] r1 = p371v5.C6568r.f25674a
            r3.<init>(r1)
            r2.f23820b = r3
            v5.u r3 = new v5.u
            r3.<init>(r0)
            r2.f23821c = r3
            v5.u r3 = new v5.u
            r3.<init>()
            r2.f23822d = r3
            r3 = -1
            r2.f23832n = r3
            return
    }

    /* renamed from: k */
    public static long m12727k(p336t4.C6170o r2, long r3, long r5) {
            int r0 = r2.m12734a(r3)
            r1 = -1
            if (r0 != r1) goto Lb
            int r0 = r2.m12735b(r3)
        Lb:
            if (r0 != r1) goto Le
            return r5
        Le:
            long[] r2 = r2.f23894c
            r3 = r2[r0]
            long r2 = java.lang.Math.min(r3, r5)
            return r2
    }

    @Override // p216m4.InterfaceC4364i
    /* renamed from: b */
    public void mo9803b(long r7, long r9) {
            r6 = this;
            java.util.ArrayDeque<t4.a$a> r0 = r6.f23824f
            r0.clear()
            r0 = 0
            r6.f23830l = r0
            r1 = -1
            r6.f23832n = r1
            r6.f23833o = r0
            r6.f23834p = r0
            r6.f23835q = r0
            r2 = 0
            int r4 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r4 != 0) goto L2f
            int r7 = r6.f23827i
            r8 = 3
            if (r7 == r8) goto L20
            r6.m12728j()
            goto L52
        L20:
            t4.j r7 = r6.f23825g
            java.util.List<t4.j$a> r8 = r7.f23853a
            r8.clear()
            r7.f23854b = r0
            java.util.List<y4.a$b> r7 = r6.f23826h
            r7.clear()
            goto L52
        L2f:
            t4.h$a[] r7 = r6.f23837s
            if (r7 == 0) goto L52
            int r8 = r7.length
            r2 = 0
        L35:
            if (r2 >= r8) goto L52
            r3 = r7[r2]
            t4.o r4 = r3.f23844b
            int r5 = r4.m12734a(r9)
            if (r5 != r1) goto L45
            int r5 = r4.m12735b(r9)
        L45:
            r3.f23847e = r5
            m4.a0 r3 = r3.f23846d
            if (r3 == 0) goto L4f
            r3.f17863b = r0
            r3.f17864c = r0
        L4f:
            int r2 = r2 + 1
            goto L35
        L52:
            return
    }

    @Override // p216m4.InterfaceC4364i
    /* renamed from: c */
    public void mo9804c(p216m4.InterfaceC4366k r1) {
            r0 = this;
            r0.f23836r = r1
            return
    }

    @Override // p216m4.InterfaceC4378w
    /* renamed from: d */
    public boolean mo9742d() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // p216m4.InterfaceC4364i
    /* renamed from: f */
    public boolean mo9805f(p216m4.InterfaceC4365j r3) {
            r2 = this;
            int r0 = r2.f23819a
            r0 = r0 & 2
            r1 = 0
            if (r0 == 0) goto L9
            r0 = 1
            goto La
        L9:
            r0 = 0
        La:
            boolean r3 = p336t4.C6166k.m12732a(r3, r1, r0)
            return r3
    }

    @Override // p216m4.InterfaceC4378w
    /* renamed from: g */
    public p216m4.InterfaceC4378w.a mo9743g(long r18) {
            r17 = this;
            r0 = r17
            r1 = r18
            t4.h$a[] r3 = r0.f23837s
            java.util.Objects.requireNonNull(r3)
            int r3 = r3.length
            if (r3 != 0) goto L14
            m4.w$a r1 = new m4.w$a
            m4.x r2 = p216m4.C4379x.f17939c
            r1.<init>(r2)
            return r1
        L14:
            r3 = -1
            int r5 = r0.f23839u
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r8 = -1
            if (r5 == r8) goto L64
            t4.h$a[] r9 = r0.f23837s
            r5 = r9[r5]
            t4.o r5 = r5.f23844b
            int r9 = r5.m12734a(r1)
            if (r9 != r8) goto L30
            int r9 = r5.m12735b(r1)
        L30:
            if (r9 != r8) goto L3a
            m4.w$a r1 = new m4.w$a
            m4.x r2 = p216m4.C4379x.f17939c
            r1.<init>(r2)
            return r1
        L3a:
            long[] r10 = r5.f23897f
            r11 = r10[r9]
            long[] r10 = r5.f23894c
            r13 = r10[r9]
            int r10 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r10 >= 0) goto L5f
            int r10 = r5.f23893b
            int r10 = r10 + r8
            if (r9 >= r10) goto L5f
            int r1 = r5.m12735b(r1)
            if (r1 == r8) goto L5f
            if (r1 == r9) goto L5f
            long[] r2 = r5.f23897f
            r3 = r2[r1]
            long[] r2 = r5.f23894c
            r1 = r2[r1]
            r15 = r1
            r1 = r3
            r3 = r15
            goto L60
        L5f:
            r1 = r6
        L60:
            r8 = r3
            r3 = r1
            r1 = r11
            goto L6b
        L64:
            r13 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r8 = r3
            r3 = r6
        L6b:
            r5 = 0
        L6c:
            t4.h$a[] r10 = r0.f23837s
            int r11 = r10.length
            if (r5 >= r11) goto L89
            int r11 = r0.f23839u
            if (r5 == r11) goto L86
            r10 = r10[r5]
            t4.o r10 = r10.f23844b
            long r11 = m12727k(r10, r1, r13)
            int r13 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r13 == 0) goto L85
            long r8 = m12727k(r10, r3, r8)
        L85:
            r13 = r11
        L86:
            int r5 = r5 + 1
            goto L6c
        L89:
            m4.x r5 = new m4.x
            r5.<init>(r1, r13)
            int r1 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r1 != 0) goto L98
            m4.w$a r1 = new m4.w$a
            r1.<init>(r5)
            return r1
        L98:
            m4.x r1 = new m4.x
            r1.<init>(r3, r8)
            m4.w$a r2 = new m4.w$a
            r2.<init>(r5, r1)
            return r2
    }

    @Override // p216m4.InterfaceC4378w
    /* renamed from: h */
    public long mo9744h() {
            r2 = this;
            long r0 = r2.f23840v
            return r0
    }

    @Override // p216m4.InterfaceC4364i
    /* renamed from: i */
    public int mo9806i(p216m4.InterfaceC4365j r35, p216m4.C4377v r36) {
            r34 = this;
            r1 = r34
            r0 = r35
            r2 = r36
        L6:
            int r3 = r1.f23827i
            r4 = 1718909296(0x66747970, float:2.8862439E23)
            r7 = 0
            r12 = 4
            r13 = 2
            r14 = 0
            r15 = 1
            if (r3 == 0) goto L4a4
            r16 = 262144(0x40000, double:1.295163E-318)
            if (r3 == r15) goto L410
            r18 = 8
            r4 = 7
            if (r3 == r13) goto L26b
            r8 = 3
            if (r3 != r8) goto L265
            t4.j r3 = r1.f23825g
            java.util.List<y4.a$b> r5 = r1.f23826h
            int r6 = r3.f23854b
            if (r6 == 0) goto L241
            if (r6 == r15) goto L1e4
            r11 = 2819(0xb03, float:3.95E-42)
            if (r6 == r13) goto L16f
            if (r6 != r8) goto L169
            long r17 = r35.mo9797q()
            long r20 = r35.mo9786a()
            long r24 = r35.mo9797q()
            long r20 = r20 - r24
            int r6 = r3.f23855c
            long r9 = (long) r6
            long r9 = r20 - r9
            int r6 = (int) r9
            v5.u r9 = new v5.u
            r9.<init>(r6)
            byte[] r10 = r9.f25710a
            r0.readFully(r10, r14, r6)
            r0 = 0
        L4e:
            java.util.List<t4.j$a> r6 = r3.f23853a
            int r6 = r6.size()
            if (r0 >= r6) goto L163
            java.util.List<t4.j$a> r6 = r3.f23853a
            java.lang.Object r6 = r6.get(r0)
            t4.j$a r6 = (p336t4.C6165j.a) r6
            r10 = r5
            long r4 = r6.f23856a
            long r4 = r4 - r17
            int r5 = (int) r4
            r9.m13396F(r5)
            r9.m13397G(r12)
            int r4 = r9.m13405h()
            java.lang.String r5 = r9.m13415r(r4)
            int r21 = r5.hashCode()
            switch(r21) {
                case -1711564334: goto La6;
                case -1332107749: goto L9b;
                case -1251387154: goto L90;
                case -830665521: goto L85;
                case 1760745220: goto L7a;
                default: goto L79;
            }
        L79:
            goto Lb1
        L7a:
            java.lang.String r14 = "Super_SlowMotion_BGM"
            boolean r5 = r5.equals(r14)
            if (r5 != 0) goto L83
            goto Lb1
        L83:
            r5 = 4
            goto Lb2
        L85:
            java.lang.String r14 = "Super_SlowMotion_Deflickering_On"
            boolean r5 = r5.equals(r14)
            if (r5 != 0) goto L8e
            goto Lb1
        L8e:
            r5 = 3
            goto Lb2
        L90:
            java.lang.String r14 = "Super_SlowMotion_Data"
            boolean r5 = r5.equals(r14)
            if (r5 != 0) goto L99
            goto Lb1
        L99:
            r5 = 2
            goto Lb2
        L9b:
            java.lang.String r14 = "Super_SlowMotion_Edit_Data"
            boolean r5 = r5.equals(r14)
            if (r5 != 0) goto La4
            goto Lb1
        La4:
            r5 = 1
            goto Lb2
        La6:
            java.lang.String r14 = "SlowMotion_Data"
            boolean r5 = r5.equals(r14)
            if (r5 != 0) goto Laf
            goto Lb1
        Laf:
            r5 = 0
            goto Lb2
        Lb1:
            r5 = -1
        Lb2:
            if (r5 == 0) goto Lcf
            if (r5 == r15) goto Lcc
            if (r5 == r13) goto Lc9
            if (r5 == r8) goto Lc6
            if (r5 != r12) goto Lbf
            r5 = 2817(0xb01, float:3.947E-42)
            goto Ld1
        Lbf:
            java.lang.String r0 = "Invalid SEF name"
            f4.s0 r0 = p088f4.C2044s0.m5407a(r0, r7)
            throw r0
        Lc6:
            r5 = 2820(0xb04, float:3.952E-42)
            goto Ld1
        Lc9:
            r5 = 2816(0xb00, float:3.946E-42)
            goto Ld1
        Lcc:
            r5 = 2819(0xb03, float:3.95E-42)
            goto Ld1
        Lcf:
            r5 = 2192(0x890, float:3.072E-42)
        Ld1:
            int r6 = r6.f23857b
            int r4 = r4 + 8
            int r6 = r6 - r4
            r4 = 2192(0x890, float:3.072E-42)
            if (r5 == r4) goto Lef
            r4 = 2816(0xb00, float:3.946E-42)
            if (r5 == r4) goto L15c
            r4 = 2817(0xb01, float:3.947E-42)
            if (r5 == r4) goto L15c
            if (r5 == r11) goto L15c
            r4 = 2820(0xb04, float:3.952E-42)
            if (r5 != r4) goto Le9
            goto L15c
        Le9:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        Lef:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.lang.String r5 = r9.m13415r(r6)
            a9.k r6 = p336t4.C6165j.f23852e
            java.util.List r5 = r6.m44a(r5)
            r6 = 0
        Lff:
            int r14 = r5.size()
            if (r6 >= r14) goto L154
            a9.k r14 = p336t4.C6165j.f23851d
            java.lang.Object r21 = r5.get(r6)
            r12 = r21
            java.lang.CharSequence r12 = (java.lang.CharSequence) r12
            java.util.List r12 = r14.m44a(r12)
            int r14 = r12.size()
            if (r14 != r8) goto L14f
            r14 = 0
            java.lang.Object r21 = r12.get(r14)     // Catch: java.lang.NumberFormatException -> L149
            java.lang.String r21 = (java.lang.String) r21     // Catch: java.lang.NumberFormatException -> L149
            long r27 = java.lang.Long.parseLong(r21)     // Catch: java.lang.NumberFormatException -> L149
            java.lang.Object r14 = r12.get(r15)     // Catch: java.lang.NumberFormatException -> L149
            java.lang.String r14 = (java.lang.String) r14     // Catch: java.lang.NumberFormatException -> L149
            long r29 = java.lang.Long.parseLong(r14)     // Catch: java.lang.NumberFormatException -> L149
            java.lang.Object r12 = r12.get(r13)     // Catch: java.lang.NumberFormatException -> L149
            java.lang.String r12 = (java.lang.String) r12     // Catch: java.lang.NumberFormatException -> L149
            int r12 = java.lang.Integer.parseInt(r12)     // Catch: java.lang.NumberFormatException -> L149
            int r12 = r12 - r15
            int r31 = r15 << r12
            e5.c$b r12 = new e5.c$b     // Catch: java.lang.NumberFormatException -> L149
            r26 = r12
            r26.<init>(r27, r29, r31)     // Catch: java.lang.NumberFormatException -> L149
            r4.add(r12)     // Catch: java.lang.NumberFormatException -> L149
            int r6 = r6 + 1
            r12 = 4
            goto Lff
        L149:
            r0 = move-exception
            f4.s0 r0 = p088f4.C2044s0.m5407a(r7, r0)
            throw r0
        L14f:
            f4.s0 r0 = p088f4.C2044s0.m5407a(r7, r7)
            throw r0
        L154:
            e5.c r5 = new e5.c
            r5.<init>(r4)
            r10.add(r5)
        L15c:
            int r0 = r0 + 1
            r5 = r10
            r12 = 4
            r14 = 0
            goto L4e
        L163:
            r4 = 0
            r2.f17934a = r4
            goto L259
        L169:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L16f:
            long r4 = r35.mo9786a()
            int r6 = r3.f23855c
            int r6 = r6 + (-12)
            r7 = 8
            int r6 = r6 - r7
            v5.u r7 = new v5.u
            r7.<init>(r6)
            byte[] r9 = r7.f25710a
            r10 = 0
            r0.readFully(r9, r10, r6)
            r0 = 0
        L186:
            int r9 = r6 / 12
            if (r0 >= r9) goto L1c8
            r7.m13397G(r13)
            short r9 = r7.m13407j()
            r10 = 2192(0x890, float:3.072E-42)
            r12 = 2816(0xb00, float:3.946E-42)
            r14 = 2817(0xb01, float:3.947E-42)
            if (r9 == r10) goto L1a9
            if (r9 == r12) goto L1a9
            if (r9 == r14) goto L1a9
            if (r9 == r11) goto L1a9
            r10 = 2820(0xb04, float:3.952E-42)
            if (r9 == r10) goto L1a9
            r10 = 8
            r7.m13397G(r10)
            goto L1c2
        L1a9:
            int r10 = r3.f23855c
            long r11 = (long) r10
            long r10 = r4 - r11
            int r12 = r7.m13405h()
            long r13 = (long) r12
            long r10 = r10 - r13
            int r12 = r7.m13405h()
            java.util.List<t4.j$a> r13 = r3.f23853a
            t4.j$a r14 = new t4.j$a
            r14.<init>(r9, r10, r12)
            r13.add(r14)
        L1c2:
            int r0 = r0 + 1
            r11 = 2819(0xb03, float:3.95E-42)
            r13 = 2
            goto L186
        L1c8:
            java.util.List<t4.j$a> r0 = r3.f23853a
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L1d3
            r3 = 0
            goto L1e0
        L1d3:
            r3.f23854b = r8
            java.util.List<t4.j$a> r0 = r3.f23853a
            r5 = 0
            java.lang.Object r0 = r0.get(r5)
            t4.j$a r0 = (p336t4.C6165j.a) r0
            long r3 = r0.f23856a
        L1e0:
            r2.f17934a = r3
            goto L259
        L1e4:
            r5 = 0
            r6 = 8
            byte[] r7 = new byte[r6]
            r0.readFully(r7, r5, r6)
            r5 = r7[r5]
            r5 = r5 & 255(0xff, float:3.57E-43)
            r9 = r7[r15]
            r9 = r9 & 255(0xff, float:3.57E-43)
            int r9 = r9 << r6
            r5 = r5 | r9
            r6 = 2
            r9 = r7[r6]
            r6 = r9 & 255(0xff, float:3.57E-43)
            int r6 = r6 << 16
            r5 = r5 | r6
            r6 = r7[r8]
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r6 = r6 << 24
            r5 = r5 | r6
            r6 = 8
            int r5 = r5 + r6
            r3.f23855c = r5
            r5 = 5
            r6 = 4
            r6 = r7[r6]
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r6 = r6 << 24
            r8 = 6
            r5 = r7[r5]
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r5 = r5 << 16
            r5 = r5 | r6
            r6 = r7[r8]
            r6 = r6 & 255(0xff, float:3.57E-43)
            r8 = 8
            int r6 = r6 << r8
            r5 = r5 | r6
            r4 = r7[r4]
            r4 = r4 & 255(0xff, float:3.57E-43)
            r4 = r4 | r5
            r5 = 1397048916(0x53454654, float:8.472885E11)
            if (r4 == r5) goto L231
            r4 = 0
            r2.f17934a = r4
            goto L259
        L231:
            long r4 = r35.mo9797q()
            int r0 = r3.f23855c
            int r0 = r0 + (-12)
            long r6 = (long) r0
            long r4 = r4 - r6
            r2.f17934a = r4
            r0 = 2
            r3.f23854b = r0
            goto L259
        L241:
            long r4 = r35.mo9786a()
            r6 = -1
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 == 0) goto L253
            int r0 = (r4 > r18 ? 1 : (r4 == r18 ? 0 : -1))
            if (r0 >= 0) goto L250
            goto L253
        L250:
            long r4 = r4 - r18
            goto L255
        L253:
            r4 = 0
        L255:
            r2.f17934a = r4
            r3.f23854b = r15
        L259:
            long r2 = r2.f17934a
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L264
            r34.m12728j()
        L264:
            return r15
        L265:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L26b:
            long r5 = r35.mo9797q()
            int r3 = r1.f23832n
            r8 = -1
            if (r3 != r8) goto L2eb
            r3 = -1
            r4 = 1
            r10 = -1
            r11 = 0
            r12 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r14 = 1
            r20 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r27 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L288:
            t4.h$a[] r7 = r1.f23837s
            int r29 = p371v5.C6552b0.f25624a
            int r15 = r7.length
            if (r11 >= r15) goto L2cf
            r7 = r7[r11]
            int r15 = r7.f23847e
            t4.o r7 = r7.f23844b
            int r8 = r7.f23893b
            if (r15 != r8) goto L29a
            goto L2cb
        L29a:
            long[] r7 = r7.f23894c
            r8 = r7[r15]
            long[][] r7 = r1.f23838t
            r7 = r7[r11]
            r32 = r7[r15]
            long r8 = r8 - r5
            r22 = 0
            int r7 = (r8 > r22 ? 1 : (r8 == r22 ? 0 : -1))
            if (r7 < 0) goto L2b2
            int r7 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1))
            if (r7 < 0) goto L2b0
            goto L2b2
        L2b0:
            r7 = 0
            goto L2b3
        L2b2:
            r7 = 1
        L2b3:
            if (r7 != 0) goto L2b7
            if (r4 != 0) goto L2bd
        L2b7:
            if (r7 != r4) goto L2c3
            int r15 = (r8 > r27 ? 1 : (r8 == r27 ? 0 : -1))
            if (r15 >= 0) goto L2c3
        L2bd:
            r4 = r7
            r27 = r8
            r10 = r11
            r20 = r32
        L2c3:
            int r8 = (r32 > r12 ? 1 : (r32 == r12 ? 0 : -1))
            if (r8 >= 0) goto L2cb
            r14 = r7
            r3 = r11
            r12 = r32
        L2cb:
            int r11 = r11 + 1
            r15 = 1
            goto L288
        L2cf:
            r7 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r4 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r4 == 0) goto L2e2
            if (r14 == 0) goto L2e2
            r7 = 10485760(0xa00000, double:5.180654E-317)
            long r12 = r12 + r7
            int r4 = (r20 > r12 ? 1 : (r20 == r12 ? 0 : -1))
            if (r4 >= 0) goto L2e3
        L2e2:
            r3 = r10
        L2e3:
            r1.f23832n = r3
            r4 = -1
            if (r3 != r4) goto L2eb
            r8 = -1
            goto L40f
        L2eb:
            t4.h$a[] r3 = r1.f23837s
            int r4 = p371v5.C6552b0.f25624a
            int r4 = r1.f23832n
            r3 = r3[r4]
            m4.z r4 = r3.f23845c
            int r15 = r3.f23847e
            t4.o r7 = r3.f23844b
            long[] r8 = r7.f23894c
            r9 = r8[r15]
            int[] r7 = r7.f23895d
            r7 = r7[r15]
            m4.a0 r14 = r3.f23846d
            long r5 = r9 - r5
            int r8 = r1.f23833o
            long r11 = (long) r8
            long r5 = r5 + r11
            r11 = 0
            int r8 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r8 < 0) goto L40c
            int r8 = (r5 > r16 ? 1 : (r5 == r16 ? 0 : -1))
            if (r8 < 0) goto L315
            goto L40c
        L315:
            t4.l r2 = r3.f23843a
            int r2 = r2.f23865g
            r8 = 1
            if (r2 != r8) goto L320
            long r5 = r5 + r18
            int r7 = r7 + (-8)
        L320:
            int r2 = (int) r5
            r0.mo9791i(r2)
            t4.l r2 = r3.f23843a
            int r5 = r2.f23868j
            if (r5 == 0) goto L38a
            v5.u r2 = r1.f23821c
            byte[] r2 = r2.f25710a
            r6 = 0
            r2[r6] = r6
            r8 = 1
            r2[r8] = r6
            r8 = 2
            r2[r8] = r6
            int r6 = 4 - r5
        L339:
            int r8 = r1.f23834p
            if (r8 >= r7) goto L388
            int r8 = r1.f23835q
            if (r8 != 0) goto L373
            r0.readFully(r2, r6, r5)
            int r8 = r1.f23833o
            int r8 = r8 + r5
            r1.f23833o = r8
            v5.u r8 = r1.f23821c
            r9 = 0
            r8.m13396F(r9)
            v5.u r8 = r1.f23821c
            int r8 = r8.m13403f()
            if (r8 < 0) goto L36b
            r1.f23835q = r8
            v5.u r8 = r1.f23820b
            r8.m13396F(r9)
            v5.u r8 = r1.f23820b
            r10 = 4
            r4.mo5972d(r8, r10)
            int r8 = r1.f23834p
            int r8 = r8 + r10
            r1.f23834p = r8
            int r7 = r7 + r6
            goto L339
        L36b:
            java.lang.String r0 = "Invalid NAL length"
            r2 = 0
            f4.s0 r0 = p088f4.C2044s0.m5407a(r0, r2)
            throw r0
        L373:
            r9 = 0
            int r8 = r4.mo5969a(r0, r8, r9)
            int r9 = r1.f23833o
            int r9 = r9 + r8
            r1.f23833o = r9
            int r9 = r1.f23834p
            int r9 = r9 + r8
            r1.f23834p = r9
            int r9 = r1.f23835q
            int r9 = r9 - r8
            r1.f23835q = r9
            goto L339
        L388:
            r0 = r7
            goto L3cd
        L38a:
            f4.e0 r2 = r2.f23864f
            java.lang.String r2 = r2.f8896j0
            java.lang.String r5 = "audio/ac4"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L3ad
            int r2 = r1.f23834p
            if (r2 != 0) goto L3aa
            v5.u r2 = r1.f23822d
            p121h4.C2459c.m6247a(r7, r2)
            v5.u r2 = r1.f23822d
            r5 = 7
            r4.mo5972d(r2, r5)
            int r2 = r1.f23834p
            int r2 = r2 + r5
            r1.f23834p = r2
        L3aa:
            int r7 = r7 + 7
            goto L3b2
        L3ad:
            if (r14 == 0) goto L3b2
            r14.m9754c(r0)
        L3b2:
            int r2 = r1.f23834p
            if (r2 >= r7) goto L388
            int r2 = r7 - r2
            r5 = 0
            int r2 = r4.mo5969a(r0, r2, r5)
            int r5 = r1.f23833o
            int r5 = r5 + r2
            r1.f23833o = r5
            int r5 = r1.f23834p
            int r5 = r5 + r2
            r1.f23834p = r5
            int r5 = r1.f23835q
            int r5 = r5 - r2
            r1.f23835q = r5
            goto L3b2
        L3cd:
            t4.o r2 = r3.f23844b
            long[] r5 = r2.f23897f
            r9 = r5[r15]
            int[] r2 = r2.f23898g
            r2 = r2[r15]
            if (r14 == 0) goto L3f1
            r13 = 0
            r5 = 0
            r7 = r14
            r8 = r4
            r11 = r2
            r12 = r0
            r0 = r14
            r14 = r5
            r7.m9753b(r8, r9, r11, r12, r13, r14)
            r2 = 1
            int r15 = r15 + r2
            t4.o r2 = r3.f23844b
            int r2 = r2.f23893b
            if (r15 != r2) goto L3fa
            r2 = 0
            r0.m9752a(r4, r2)
            goto L3fa
        L3f1:
            r12 = 0
            r13 = 0
            r7 = r4
            r8 = r9
            r10 = r2
            r11 = r0
            r7.mo5971c(r8, r10, r11, r12, r13)
        L3fa:
            int r0 = r3.f23847e
            r2 = 1
            int r0 = r0 + r2
            r3.f23847e = r0
            r0 = -1
            r1.f23832n = r0
            r0 = 0
            r1.f23833o = r0
            r1.f23834p = r0
            r1.f23835q = r0
            r8 = 0
            goto L40f
        L40c:
            r2.f17934a = r9
            r8 = 1
        L40f:
            return r8
        L410:
            long r5 = r1.f23829k
            int r3 = r1.f23830l
            long r7 = (long) r3
            long r5 = r5 - r7
            long r7 = r35.mo9797q()
            long r7 = r7 + r5
            v5.u r3 = r1.f23831m
            if (r3 == 0) goto L481
            byte[] r9 = r3.f25710a
            int r10 = r1.f23830l
            int r6 = (int) r5
            r0.readFully(r9, r10, r6)
            int r5 = r1.f23828j
            if (r5 != r4) goto L464
            r4 = 8
            r3.m13396F(r4)
            int r4 = r3.m13403f()
            r5 = 1903435808(0x71742020, float:1.2088509E30)
            r6 = 1751476579(0x68656963, float:4.333464E24)
            if (r4 == r6) goto L442
            if (r4 == r5) goto L440
            r4 = 0
            goto L443
        L440:
            r4 = 1
            goto L443
        L442:
            r4 = 2
        L443:
            if (r4 == 0) goto L446
            goto L461
        L446:
            r4 = 4
            r3.m13397G(r4)
        L44a:
            int r4 = r3.m13398a()
            if (r4 <= 0) goto L460
            int r4 = r3.m13403f()
            if (r4 == r6) goto L45c
            if (r4 == r5) goto L45a
            r4 = 0
            goto L45d
        L45a:
            r4 = 1
            goto L45d
        L45c:
            r4 = 2
        L45d:
            if (r4 == 0) goto L44a
            goto L461
        L460:
            r4 = 0
        L461:
            r1.f23841w = r4
            goto L489
        L464:
            java.util.ArrayDeque<t4.a$a> r4 = r1.f23824f
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L489
            java.util.ArrayDeque<t4.a$a> r4 = r1.f23824f
            java.lang.Object r4 = r4.peek()
            t4.a$a r4 = (p336t4.AbstractC6156a.a) r4
            t4.a$b r5 = new t4.a$b
            int r6 = r1.f23828j
            r5.<init>(r6, r3)
            java.util.List<t4.a$b> r3 = r4.f23748c
            r3.add(r5)
            goto L489
        L481:
            int r3 = (r5 > r16 ? 1 : (r5 == r16 ? 0 : -1))
            if (r3 >= 0) goto L48b
            int r3 = (int) r5
            r0.mo9791i(r3)
        L489:
            r3 = 0
            goto L493
        L48b:
            long r3 = r35.mo9797q()
            long r3 = r3 + r5
            r2.f17934a = r3
            r3 = 1
        L493:
            r1.m12729l(r7)
            if (r3 == 0) goto L49f
            int r3 = r1.f23827i
            r4 = 2
            if (r3 == r4) goto L49f
            r14 = 1
            goto L4a0
        L49f:
            r14 = 0
        L4a0:
            if (r14 == 0) goto L6
            r3 = 1
            return r3
        L4a4:
            r3 = 1
            int r5 = r1.f23830l
            if (r5 != 0) goto L518
            v5.u r5 = r1.f23823e
            byte[] r5 = r5.f25710a
            r6 = 8
            r7 = 0
            boolean r5 = r0.mo9788e(r5, r7, r6, r3)
            if (r5 != 0) goto L4fe
            int r3 = r1.f23841w
            r4 = 2
            if (r3 != r4) goto L4fb
            int r3 = r1.f23819a
            r3 = r3 & r4
            if (r3 == 0) goto L4fb
            m4.k r3 = r1.f23836r
            java.util.Objects.requireNonNull(r3)
            r4 = 4
            m4.z r4 = r3.mo6048l(r7, r4)
            e5.b r5 = r1.f23842x
            if (r5 != 0) goto L4d0
            r7 = 0
            goto L4db
        L4d0:
            y4.a r6 = new y4.a
            r8 = 1
            y4.a$b[] r8 = new p427y4.C7110a.b[r8]
            r8[r7] = r5
            r6.<init>(r8)
            r7 = r6
        L4db:
            f4.e0$b r5 = new f4.e0$b
            r5.<init>()
            r5.f8925i = r7
            f4.e0 r5 = r5.m5193a()
            r4.mo5973e(r5)
            r3.mo6043b()
            m4.w$b r4 = new m4.w$b
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = 0
            r4.<init>(r5, r7)
            r3.mo6044c(r4)
        L4fb:
            r14 = 0
            goto L6ad
        L4fe:
            r3 = 8
            r1.f23830l = r3
            v5.u r3 = r1.f23823e
            r5 = 0
            r3.m13396F(r5)
            v5.u r3 = r1.f23823e
            long r5 = r3.m13419v()
            r1.f23829k = r5
            v5.u r3 = r1.f23823e
            int r3 = r3.m13403f()
            r1.f23828j = r3
        L518:
            long r5 = r1.f23829k
            r7 = 1
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 != 0) goto L535
            v5.u r3 = r1.f23823e
            byte[] r3 = r3.f25710a
            r5 = 8
            r0.readFully(r3, r5, r5)
            int r3 = r1.f23830l
            int r3 = r3 + r5
            r1.f23830l = r3
            v5.u r3 = r1.f23823e
            long r5 = r3.m13422y()
            goto L55e
        L535:
            r7 = 0
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 != 0) goto L560
            long r5 = r35.mo9786a()
            r7 = -1
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 != 0) goto L551
            java.util.ArrayDeque<t4.a$a> r3 = r1.f23824f
            java.lang.Object r3 = r3.peek()
            t4.a$a r3 = (p336t4.AbstractC6156a.a) r3
            if (r3 == 0) goto L551
            long r5 = r3.f23747b
        L551:
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 == 0) goto L560
            long r7 = r35.mo9797q()
            long r5 = r5 - r7
            int r3 = r1.f23830l
            long r7 = (long) r3
            long r5 = r5 + r7
        L55e:
            r1.f23829k = r5
        L560:
            long r5 = r1.f23829k
            int r3 = r1.f23830l
            long r7 = (long) r3
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 < 0) goto L6b1
            int r5 = r1.f23828j
            r6 = 1836019574(0x6d6f6f76, float:4.631354E27)
            r7 = 1835365473(0x6d657461, float:4.4382975E27)
            if (r5 == r6) goto L591
            r6 = 1953653099(0x7472616b, float:7.681346E31)
            if (r5 == r6) goto L591
            r6 = 1835297121(0x6d646961, float:4.4181236E27)
            if (r5 == r6) goto L591
            r6 = 1835626086(0x6d696e66, float:4.515217E27)
            if (r5 == r6) goto L591
            r6 = 1937007212(0x7374626c, float:1.9362132E31)
            if (r5 == r6) goto L591
            r6 = 1701082227(0x65647473, float:6.742798E22)
            if (r5 == r6) goto L591
            if (r5 != r7) goto L58f
            goto L591
        L58f:
            r6 = 0
            goto L592
        L591:
            r6 = 1
        L592:
            r8 = 1751411826(0x68646c72, float:4.3148E24)
            if (r6 == 0) goto L5f7
            long r3 = r35.mo9797q()
            long r5 = r1.f23829k
            long r3 = r3 + r5
            int r9 = r1.f23830l
            long r9 = (long) r9
            long r3 = r3 - r9
            int r11 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r11 == 0) goto L5d8
            int r5 = r1.f23828j
            if (r5 != r7) goto L5d8
            v5.u r5 = r1.f23822d
            r6 = 8
            r5.m13392B(r6)
            v5.u r5 = r1.f23822d
            byte[] r5 = r5.f25710a
            r7 = 0
            r0.mo9795o(r5, r7, r6)
            v5.u r5 = r1.f23822d
            byte[] r6 = p336t4.C6157b.f23751a
            int r6 = r5.f25711b
            r7 = 4
            r5.m13397G(r7)
            int r7 = r5.m13403f()
            if (r7 == r8) goto L5cb
            int r6 = r6 + 4
        L5cb:
            r5.m13396F(r6)
            v5.u r5 = r1.f23822d
            int r5 = r5.f25711b
            r0.mo9791i(r5)
            r35.mo9790h()
        L5d8:
            java.util.ArrayDeque<t4.a$a> r5 = r1.f23824f
            t4.a$a r6 = new t4.a$a
            int r7 = r1.f23828j
            r6.<init>(r7, r3)
            r5.push(r6)
            long r5 = r1.f23829k
            int r7 = r1.f23830l
            long r7 = (long) r7
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 != 0) goto L5f1
            r1.m12729l(r3)
            goto L5f4
        L5f1:
            r34.m12728j()
        L5f4:
            r3 = 1
            goto L6ac
        L5f7:
            r6 = 1835296868(0x6d646864, float:4.418049E27)
            if (r5 == r6) goto L64e
            r6 = 1836476516(0x6d766864, float:4.7662196E27)
            if (r5 == r6) goto L64e
            if (r5 == r8) goto L64e
            r6 = 1937011556(0x73747364, float:1.9367383E31)
            if (r5 == r6) goto L64e
            r6 = 1937011827(0x73747473, float:1.9367711E31)
            if (r5 == r6) goto L64e
            r6 = 1937011571(0x73747373, float:1.9367401E31)
            if (r5 == r6) goto L64e
            r6 = 1668576371(0x63747473, float:4.5093966E21)
            if (r5 == r6) goto L64e
            r6 = 1701606260(0x656c7374, float:6.9788014E22)
            if (r5 == r6) goto L64e
            r6 = 1937011555(0x73747363, float:1.9367382E31)
            if (r5 == r6) goto L64e
            r6 = 1937011578(0x7374737a, float:1.936741E31)
            if (r5 == r6) goto L64e
            r6 = 1937013298(0x73747a32, float:1.9369489E31)
            if (r5 == r6) goto L64e
            r6 = 1937007471(0x7374636f, float:1.9362445E31)
            if (r5 == r6) goto L64e
            r6 = 1668232756(0x636f3634, float:4.4126776E21)
            if (r5 == r6) goto L64e
            r6 = 1953196132(0x746b6864, float:7.46037E31)
            if (r5 == r6) goto L64e
            if (r5 == r4) goto L64e
            r4 = 1969517665(0x75647461, float:2.8960062E32)
            if (r5 == r4) goto L64e
            r4 = 1801812339(0x6b657973, float:2.7741754E26)
            if (r5 == r4) goto L64e
            r4 = 1768715124(0x696c7374, float:1.7865732E25)
            if (r5 != r4) goto L64c
            goto L64e
        L64c:
            r14 = 0
            goto L64f
        L64e:
            r14 = 1
        L64f:
            if (r14 == 0) goto L67f
            r4 = 8
            if (r3 != r4) goto L657
            r14 = 1
            goto L658
        L657:
            r14 = 0
        L658:
            p371v5.C6549a.m13291e(r14)
            long r3 = r1.f23829k
            r5 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 > 0) goto L666
            r14 = 1
            goto L667
        L666:
            r14 = 0
        L667:
            p371v5.C6549a.m13291e(r14)
            v5.u r3 = new v5.u
            long r4 = r1.f23829k
            int r5 = (int) r4
            r3.<init>(r5)
            v5.u r4 = r1.f23823e
            byte[] r4 = r4.f25710a
            byte[] r5 = r3.f25710a
            r6 = 8
            r7 = 0
            java.lang.System.arraycopy(r4, r7, r5, r7, r6)
            goto L6a7
        L67f:
            long r3 = r35.mo9797q()
            int r5 = r1.f23830l
            long r5 = (long) r5
            long r10 = r3 - r5
            int r3 = r1.f23828j
            r4 = 1836086884(0x6d707664, float:4.6512205E27)
            if (r3 != r4) goto L6a6
            e5.b r3 = new e5.b
            r8 = 0
            long r14 = r10 + r5
            long r12 = r1.f23829k
            long r4 = r12 - r5
            r7 = r3
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r16 = r4
            r7.<init>(r8, r10, r12, r14, r16)
            r1.f23842x = r3
        L6a6:
            r3 = 0
        L6a7:
            r1.f23831m = r3
            r3 = 1
            r1.f23827i = r3
        L6ac:
            r14 = 1
        L6ad:
            if (r14 != 0) goto L6
            r3 = -1
            return r3
        L6b1:
            java.lang.String r0 = "Atom size less than header length (unsupported)."
            f4.s0 r0 = p088f4.C2044s0.m5408b(r0)
            throw r0
    }

    /* renamed from: j */
    public final void m12728j() {
            r1 = this;
            r0 = 0
            r1.f23827i = r0
            r1.f23830l = r0
            return
    }

    /* renamed from: l */
    public final void m12729l(long r24) {
            r23 = this;
            r1 = r23
        L2:
            java.util.ArrayDeque<t4.a$a> r0 = r1.f23824f
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L65e
            java.util.ArrayDeque<t4.a$a> r0 = r1.f23824f
            java.lang.Object r0 = r0.peek()
            t4.a$a r0 = (p336t4.AbstractC6156a.a) r0
            long r2 = r0.f23747b
            int r0 = (r2 > r24 ? 1 : (r2 == r24 ? 0 : -1))
            if (r0 != 0) goto L65e
            java.util.ArrayDeque<t4.a$a> r0 = r1.f23824f
            java.lang.Object r0 = r0.pop()
            r2 = r0
            t4.a$a r2 = (p336t4.AbstractC6156a.a) r2
            int r0 = r2.f23746a
            r3 = 1836019574(0x6d6f6f76, float:4.631354E27)
            if (r0 != r3) goto L647
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r3 = r1.f23841w
            r4 = 1
            if (r3 != r4) goto L35
            r3 = 1
            r8 = 1
            goto L37
        L35:
            r3 = 0
            r8 = 0
        L37:
            m4.s r10 = new m4.s
            r10.<init>()
            r3 = 1969517665(0x75647461, float:2.8960062E32)
            t4.a$b r3 = r2.m12701c(r3)
            r4 = 1768715124(0x696c7374, float:1.7865732E25)
            r5 = 1751411826(0x68646c72, float:4.3148E24)
            r6 = 1835365473(0x6d657461, float:4.4382975E27)
            r7 = 4
            r9 = 8
            r11 = 0
            if (r3 == 0) goto L34a
            byte[] r12 = p336t4.C6157b.f23751a
            v5.u r3 = r3.f23750b
            r3.m13396F(r9)
            r12 = r11
            r13 = r12
        L5b:
            int r14 = r3.m13398a()
            if (r14 < r9) goto L331
            int r14 = r3.f25711b
            int r15 = r3.m13403f()
            r16 = r4
            int r4 = r3.m13403f()
            if (r4 != r6) goto L2b9
            r3.m13396F(r14)
            int r4 = r14 + r15
            r3.m13397G(r9)
            int r6 = r3.f25711b
            r3.m13397G(r7)
            int r7 = r3.m13403f()
            if (r7 == r5) goto L84
            int r6 = r6 + 4
        L84:
            r3.m13396F(r6)
            r5 = r16
        L89:
            int r6 = r3.f25711b
            if (r6 >= r4) goto L2b2
            int r7 = r3.m13403f()
            int r11 = r3.m13403f()
            if (r11 != r5) goto L2a2
            r3.m13396F(r6)
            int r6 = r6 + r7
            r3.m13397G(r9)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
        La3:
            int r5 = r3.f25711b
            if (r5 >= r6) goto L291
            int r7 = r3.m13403f()
            int r7 = r7 + r5
            int r5 = r3.m13403f()
            int r9 = r5 >> 24
            r9 = r9 & 255(0xff, float:3.57E-43)
            r11 = 169(0xa9, float:2.37E-43)
            r16 = r6
            java.lang.String r6 = "TCON"
            r17 = r0
            java.lang.String r0 = "MetadataUtil"
            if (r9 == r11) goto L1ef
            r11 = 253(0xfd, float:3.55E-43)
            if (r9 != r11) goto Lc6
            goto L1ef
        Lc6:
            r9 = 1735291493(0x676e7265, float:1.1260334E24)
            if (r5 != r9) goto Lee
            int r5 = p336t4.C6161f.m12726f(r3)     // Catch: java.lang.Throwable -> L200
            if (r5 <= 0) goto Ldb
            java.lang.String[] r9 = p336t4.C6161f.f23816a     // Catch: java.lang.Throwable -> L200
            int r11 = r9.length     // Catch: java.lang.Throwable -> L200
            if (r5 > r11) goto Ldb
            int r5 = r5 + (-1)
            r5 = r9[r5]     // Catch: java.lang.Throwable -> L200
            goto Ldc
        Ldb:
            r5 = r13
        Ldc:
            if (r5 == 0) goto Le5
            d5.l r0 = new d5.l     // Catch: java.lang.Throwable -> L200
            r0.<init>(r6, r13, r5)     // Catch: java.lang.Throwable -> L200
            goto L16e
        Le5:
            java.lang.String r5 = "Failed to parse standard genre code"
            android.util.Log.w(r0, r5)     // Catch: java.lang.Throwable -> L200
            r19 = r8
            goto L271
        Lee:
            r6 = 1684632427(0x6469736b, float:1.7225632E22)
            if (r5 != r6) goto Lf6
            java.lang.String r0 = "TPOS"
            goto Lfd
        Lf6:
            r6 = 1953655662(0x74726b6e, float:7.6825853E31)
            if (r5 != r6) goto L103
            java.lang.String r0 = "TRCK"
        Lfd:
            d5.l r0 = p336t4.C6161f.m12723c(r5, r0, r3)     // Catch: java.lang.Throwable -> L200
            goto L16e
        L103:
            r6 = 1953329263(0x746d706f, float:7.5247484E31)
            if (r5 != r6) goto L111
            java.lang.String r0 = "TBPM"
            r6 = 0
            r9 = 1
            d5.h r0 = p336t4.C6161f.m12725e(r5, r0, r3, r9, r6)     // Catch: java.lang.Throwable -> L200
            goto L16e
        L111:
            r6 = 1668311404(0x6370696c, float:4.434815E21)
            if (r5 != r6) goto L11a
            java.lang.String r0 = "TCMP"
            r6 = 1
            goto L15c
        L11a:
            r6 = 1668249202(0x636f7672, float:4.4173067E21)
            if (r5 != r6) goto L124
            d5.a r0 = p336t4.C6161f.m12722b(r3)     // Catch: java.lang.Throwable -> L200
            goto L16e
        L124:
            r6 = 1631670868(0x61415254, float:2.2288462E20)
            if (r5 != r6) goto L12c
            java.lang.String r0 = "TPE2"
            goto L181
        L12c:
            r6 = 1936682605(0x736f6e6d, float:1.8969706E31)
            if (r5 != r6) goto L134
            java.lang.String r0 = "TSOT"
            goto L181
        L134:
            r6 = 1936679276(0x736f616c, float:1.8965681E31)
            if (r5 != r6) goto L13c
            java.lang.String r0 = "TSO2"
            goto L181
        L13c:
            r6 = 1936679282(0x736f6172, float:1.8965689E31)
            if (r5 != r6) goto L144
            java.lang.String r0 = "TSOA"
            goto L181
        L144:
            r6 = 1936679265(0x736f6161, float:1.8965668E31)
            if (r5 != r6) goto L14c
            java.lang.String r0 = "TSOP"
            goto L181
        L14c:
            r6 = 1936679791(0x736f636f, float:1.8966304E31)
            if (r5 != r6) goto L154
            java.lang.String r0 = "TSOC"
            goto L181
        L154:
            r6 = 1920233063(0x72746e67, float:4.84146E30)
            if (r5 != r6) goto L161
            java.lang.String r0 = "ITUNESADVISORY"
            r6 = 0
        L15c:
            d5.h r0 = p336t4.C6161f.m12725e(r5, r0, r3, r6, r6)     // Catch: java.lang.Throwable -> L200
            goto L16e
        L161:
            r6 = 1885823344(0x70676170, float:2.8643533E29)
            if (r5 != r6) goto L172
            java.lang.String r0 = "ITUNESGAPLESS"
            r6 = 0
            r9 = 1
            d5.h r0 = p336t4.C6161f.m12725e(r5, r0, r3, r6, r9)     // Catch: java.lang.Throwable -> L200
        L16e:
            r19 = r8
            goto L27c
        L172:
            r6 = 1936683886(0x736f736e, float:1.8971255E31)
            if (r5 != r6) goto L17a
            java.lang.String r0 = "TVSHOWSORT"
            goto L181
        L17a:
            r6 = 1953919848(0x74767368, float:7.810338E31)
            if (r5 != r6) goto L185
            java.lang.String r0 = "TVSHOW"
        L181:
            r19 = r8
            goto L278
        L185:
            r6 = 757935405(0x2d2d2d2d, float:9.8439425E-12)
            if (r5 != r6) goto L1eb
            r0 = -1
            r5 = -1
            r6 = r13
        L18d:
            int r9 = r3.f25711b     // Catch: java.lang.Throwable -> L200
            if (r9 >= r7) goto L1ca
            int r11 = r3.m13403f()     // Catch: java.lang.Throwable -> L200
            r18 = r9
            int r9 = r3.m13403f()     // Catch: java.lang.Throwable -> L200
            r19 = r8
            r8 = 4
            r3.m13397G(r8)     // Catch: java.lang.Throwable -> L200
            r8 = 1835360622(0x6d65616e, float:4.4368658E27)
            if (r9 != r8) goto L1ae
            int r11 = r11 + (-12)
            java.lang.String r8 = r3.m13413p(r11)     // Catch: java.lang.Throwable -> L200
            r13 = r8
            goto L1c7
        L1ae:
            r8 = 1851878757(0x6e616d65, float:1.7441594E28)
            if (r9 != r8) goto L1ba
            int r11 = r11 + (-12)
            java.lang.String r6 = r3.m13413p(r11)     // Catch: java.lang.Throwable -> L200
            goto L1c7
        L1ba:
            r8 = 1684108385(0x64617461, float:1.6635614E22)
            if (r9 != r8) goto L1c2
            r5 = r11
            r0 = r18
        L1c2:
            int r11 = r11 + (-12)
            r3.m13397G(r11)     // Catch: java.lang.Throwable -> L200
        L1c7:
            r8 = r19
            goto L18d
        L1ca:
            r19 = r8
            if (r13 == 0) goto L271
            if (r6 == 0) goto L271
            r8 = -1
            if (r0 != r8) goto L1d5
            goto L271
        L1d5:
            r3.m13396F(r0)     // Catch: java.lang.Throwable -> L200
            r0 = 16
            r3.m13397G(r0)     // Catch: java.lang.Throwable -> L200
            int r5 = r5 + (-16)
            java.lang.String r0 = r3.m13413p(r5)     // Catch: java.lang.Throwable -> L200
            d5.i r5 = new d5.i     // Catch: java.lang.Throwable -> L200
            r5.<init>(r13, r6, r0)     // Catch: java.lang.Throwable -> L200
            r0 = r5
            goto L27c
        L1eb:
            r19 = r8
            goto L254
        L1ef:
            r19 = r8
            r8 = 16777215(0xffffff, float:2.3509886E-38)
            r8 = r8 & r5
            r9 = 6516084(0x636d74, float:9.130979E-39)
            if (r8 != r9) goto L203
            d5.e r0 = p336t4.C6161f.m12721a(r5, r3)     // Catch: java.lang.Throwable -> L200
            goto L27c
        L200:
            r0 = move-exception
            goto L28d
        L203:
            r9 = 7233901(0x6e616d, float:1.0136854E-38)
            if (r8 == r9) goto L276
            r9 = 7631467(0x74726b, float:1.0693963E-38)
            if (r8 != r9) goto L20f
            goto L276
        L20f:
            r9 = 6516589(0x636f6d, float:9.131686E-39)
            if (r8 == r9) goto L273
            r9 = 7828084(0x777274, float:1.0969482E-38)
            if (r8 != r9) goto L21a
            goto L273
        L21a:
            r9 = 6578553(0x646179, float:9.218516E-39)
            if (r8 != r9) goto L222
            java.lang.String r0 = "TDRC"
            goto L278
        L222:
            r9 = 4280916(0x415254, float:5.998841E-39)
            if (r8 != r9) goto L22a
            java.lang.String r0 = "TPE1"
            goto L278
        L22a:
            r9 = 7630703(0x746f6f, float:1.0692892E-38)
            if (r8 != r9) goto L232
            java.lang.String r0 = "TSSE"
            goto L278
        L232:
            r9 = 6384738(0x616c62, float:8.946924E-39)
            if (r8 != r9) goto L23a
            java.lang.String r0 = "TALB"
            goto L278
        L23a:
            r9 = 7108978(0x6c7972, float:9.9618E-39)
            if (r8 != r9) goto L242
            java.lang.String r0 = "USLT"
            goto L278
        L242:
            r9 = 6776174(0x67656e, float:9.495442E-39)
            if (r8 != r9) goto L24c
            d5.l r0 = p336t4.C6161f.m12724d(r5, r6, r3)     // Catch: java.lang.Throwable -> L200
            goto L27c
        L24c:
            r6 = 6779504(0x677270, float:9.500109E-39)
            if (r8 != r6) goto L254
            java.lang.String r0 = "TIT1"
            goto L278
        L254:
            java.lang.String r6 = "Skipped unknown metadata entry: "
            java.lang.String r5 = p336t4.AbstractC6156a.m12699a(r5)     // Catch: java.lang.Throwable -> L200
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch: java.lang.Throwable -> L200
            int r8 = r5.length()     // Catch: java.lang.Throwable -> L200
            if (r8 == 0) goto L269
            java.lang.String r5 = r6.concat(r5)     // Catch: java.lang.Throwable -> L200
            goto L26e
        L269:
            java.lang.String r5 = new java.lang.String     // Catch: java.lang.Throwable -> L200
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L200
        L26e:
            android.util.Log.d(r0, r5)     // Catch: java.lang.Throwable -> L200
        L271:
            r0 = 0
            goto L27c
        L273:
            java.lang.String r0 = "TCOM"
            goto L278
        L276:
            java.lang.String r0 = "TIT2"
        L278:
            d5.l r0 = p336t4.C6161f.m12724d(r5, r0, r3)     // Catch: java.lang.Throwable -> L200
        L27c:
            r3.m13396F(r7)
            if (r0 == 0) goto L284
            r4.add(r0)
        L284:
            r13 = 0
            r6 = r16
            r0 = r17
            r8 = r19
            goto La3
        L28d:
            r3.m13396F(r7)
            throw r0
        L291:
            r17 = r0
            r19 = r8
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L29c
            goto L2b6
        L29c:
            y4.a r0 = new y4.a
            r0.<init>(r4)
            goto L2b7
        L2a2:
            r17 = r0
            r19 = r8
            int r6 = r6 + r7
            r3.m13396F(r6)
            r9 = 8
            r5 = 1768715124(0x696c7374, float:1.7865732E25)
            r13 = 0
            goto L89
        L2b2:
            r17 = r0
            r19 = r8
        L2b6:
            r0 = 0
        L2b7:
            r11 = r0
            goto L31a
        L2b9:
            r17 = r0
            r19 = r8
            r0 = 1936553057(0x736d7461, float:1.8813092E31)
            if (r4 != r0) goto L31a
            r3.m13396F(r14)
            int r0 = r14 + r15
            r4 = 12
            r3.m13397G(r4)
        L2cc:
            int r4 = r3.f25711b
            if (r4 >= r0) goto L318
            int r5 = r3.m13403f()
            int r6 = r3.m13403f()
            r7 = 1935766900(0x73617574, float:1.7862687E31)
            if (r6 != r7) goto L313
            r0 = 14
            if (r5 >= r0) goto L2e2
            goto L318
        L2e2:
            r0 = 5
            r3.m13397G(r0)
            int r0 = r3.m13418u()
            r4 = 12
            if (r0 == r4) goto L2f3
            r5 = 13
            if (r0 == r5) goto L2f3
            goto L318
        L2f3:
            if (r0 != r4) goto L2f8
            r0 = 1131413504(0x43700000, float:240.0)
            goto L2fa
        L2f8:
            r0 = 1123024896(0x42f00000, float:120.0)
        L2fa:
            r4 = 1
            r3.m13397G(r4)
            int r5 = r3.m13418u()
            y4.a r6 = new y4.a
            y4.a$b[] r4 = new p427y4.C7110a.b[r4]
            e5.e r7 = new e5.e
            r7.<init>(r0, r5)
            r0 = 0
            r4[r0] = r7
            r6.<init>(r4)
            r12 = r6
            goto L31a
        L313:
            int r4 = r4 + r5
            r3.m13396F(r4)
            goto L2cc
        L318:
            r0 = 0
            r12 = r0
        L31a:
            int r14 = r14 + r15
            r3.m13396F(r14)
            r9 = 8
            r4 = 1768715124(0x696c7374, float:1.7865732E25)
            r5 = 1751411826(0x68646c72, float:4.3148E24)
            r6 = 1835365473(0x6d657461, float:4.4382975E27)
            r13 = 0
            r7 = 4
            r0 = r17
            r8 = r19
            goto L5b
        L331:
            r17 = r0
            r19 = r8
            android.util.Pair r0 = android.util.Pair.create(r11, r12)
            java.lang.Object r3 = r0.first
            y4.a r3 = (p427y4.C7110a) r3
            java.lang.Object r0 = r0.second
            y4.a r0 = (p427y4.C7110a) r0
            if (r3 == 0) goto L346
            r10.m9828b(r3)
        L346:
            r4 = 1835365473(0x6d657461, float:4.4382975E27)
            goto L353
        L34a:
            r17 = r0
            r19 = r8
            r0 = 0
            r4 = 1835365473(0x6d657461, float:4.4382975E27)
            r3 = 0
        L353:
            r11 = r3
            t4.a$a r3 = r2.m12700b(r4)
            if (r3 == 0) goto L44c
            byte[] r4 = p336t4.C6157b.f23751a
            r4 = 1751411826(0x68646c72, float:4.3148E24)
            t4.a$b r4 = r3.m12701c(r4)
            r5 = 1801812339(0x6b657973, float:2.7741754E26)
            t4.a$b r5 = r3.m12701c(r5)
            r6 = 1768715124(0x696c7374, float:1.7865732E25)
            t4.a$b r3 = r3.m12701c(r6)
            if (r4 == 0) goto L44c
            if (r5 == 0) goto L44c
            if (r3 == 0) goto L44c
            v5.u r4 = r4.f23750b
            r6 = 16
            r4.m13396F(r6)
            int r4 = r4.m13403f()
            r6 = 1835299937(0x6d647461, float:4.4189547E27)
            if (r4 == r6) goto L389
            goto L44c
        L389:
            v5.u r4 = r5.f23750b
            r5 = 12
            r4.m13396F(r5)
            int r5 = r4.m13403f()
            java.lang.String[] r6 = new java.lang.String[r5]
            r7 = 0
        L397:
            if (r7 >= r5) goto L3ac
            int r8 = r4.m13403f()
            r9 = 4
            r4.m13397G(r9)
            int r8 = r8 + (-8)
            java.lang.String r8 = r4.m13415r(r8)
            r6[r7] = r8
            int r7 = r7 + 1
            goto L397
        L3ac:
            r4 = 8
            v5.u r3 = r3.f23750b
            r3.m13396F(r4)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
        L3b8:
            int r8 = r3.m13398a()
            if (r8 <= r4) goto L43d
            int r4 = r3.f25711b
            int r8 = r3.m13403f()
            int r9 = r3.m13403f()
            int r9 = r9 + (-1)
            if (r9 < 0) goto L420
            if (r9 >= r5) goto L420
            r9 = r6[r9]
            int r12 = r4 + r8
        L3d2:
            int r13 = r3.f25711b
            if (r13 >= r12) goto L413
            int r14 = r3.m13403f()
            int r15 = r3.m13403f()
            r16 = r5
            r5 = 1684108385(0x64617461, float:1.6635614E22)
            if (r15 != r5) goto L408
            int r5 = r3.m13403f()
            int r12 = r3.m13403f()
            int r14 = r14 + (-16)
            byte[] r13 = new byte[r14]
            byte[] r15 = r3.f25710a
            r18 = r6
            int r6 = r3.f25711b
            r20 = r11
            r11 = 0
            java.lang.System.arraycopy(r15, r6, r13, r11, r14)
            int r6 = r3.f25711b
            int r6 = r6 + r14
            r3.f25711b = r6
            e5.a r6 = new e5.a
            r6.<init>(r9, r13, r12, r5)
            goto L41a
        L408:
            r18 = r6
            r20 = r11
            int r13 = r13 + r14
            r3.m13396F(r13)
            r5 = r16
            goto L3d2
        L413:
            r16 = r5
            r18 = r6
            r20 = r11
            r6 = 0
        L41a:
            if (r6 == 0) goto L42f
            r7.add(r6)
            goto L42f
        L420:
            r16 = r5
            r18 = r6
            r20 = r11
            r5 = 52
            java.lang.String r6 = "Skipped metadata with unknown key index: "
            java.lang.String r11 = "AtomParsers"
            p088f4.C1999d.m5182a(r5, r6, r9, r11)
        L42f:
            int r4 = r4 + r8
            r3.m13396F(r4)
            r4 = 8
            r5 = r16
            r6 = r18
            r11 = r20
            goto L3b8
        L43d:
            r20 = r11
            boolean r3 = r7.isEmpty()
            if (r3 == 0) goto L446
            goto L44e
        L446:
            y4.a r3 = new y4.a
            r3.<init>(r7)
            goto L44f
        L44c:
            r20 = r11
        L44e:
            r3 = 0
        L44f:
            r11 = r3
            int r3 = r1.f23819a
            r3 = r3 & 1
            if (r3 == 0) goto L459
            r3 = 1
            r7 = 1
            goto L45b
        L459:
            r3 = 0
            r7 = 0
        L45b:
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6 = 0
            t4.g r9 = p336t4.C6162g.f23817a
            r3 = r10
            r8 = r19
            java.util.List r2 = p336t4.C6157b.m12706e(r2, r3, r4, r6, r7, r8, r9)
            m4.k r3 = r1.f23836r
            java.util.Objects.requireNonNull(r3)
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            int r4 = r2.size()
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = 0
            r8 = -1
            r7 = r5
            r9 = 0
            r12 = -1
        L47f:
            if (r9 >= r4) goto L5b2
            java.lang.Object r13 = r2.get(r9)
            t4.o r13 = (p336t4.C6170o) r13
            int r14 = r13.f23893b
            if (r14 != 0) goto L495
            r21 = r0
            r18 = r2
            r19 = r4
            r0 = r17
            goto L5a1
        L495:
            t4.l r14 = r13.f23892a
            r15 = r11
            r16 = r12
            long r11 = r14.f23863e
            int r18 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r18 == 0) goto L4a1
            goto L4a3
        L4a1:
            long r11 = r13.f23899h
        L4a3:
            long r5 = java.lang.Math.max(r5, r11)
            t4.h$a r7 = new t4.h$a
            int r8 = r14.f23860b
            m4.z r8 = r3.mo6048l(r9, r8)
            r7.<init>(r14, r13, r8)
            f4.e0 r8 = r14.f23864f
            java.lang.String r8 = r8.f8896j0
            r18 = r2
            java.lang.String r2 = "audio/true-hd"
            boolean r2 = r2.equals(r8)
            if (r2 == 0) goto L4c5
            int r2 = r13.f23896e
            int r2 = r2 * 16
            goto L4c9
        L4c5:
            int r2 = r13.f23896e
            int r2 = r2 + 30
        L4c9:
            f4.e0 r8 = r14.f23864f
            f4.e0$b r8 = r8.m5191a()
            r8.f8928l = r2
            int r2 = r14.f23860b
            r19 = r4
            r4 = 2
            if (r2 != r4) goto L4ec
            r21 = 0
            int r4 = (r11 > r21 ? 1 : (r11 == r21 ? 0 : -1))
            if (r4 <= 0) goto L4ec
            int r4 = r13.f23893b
            r13 = 1
            if (r4 <= r13) goto L4ec
            float r4 = (float) r4
            float r11 = (float) r11
            r12 = 1232348160(0x49742400, float:1000000.0)
            float r11 = r11 / r12
            float r4 = r4 / r11
            r8.f8934r = r4
        L4ec:
            r4 = 1
            if (r2 != r4) goto L503
            int r4 = r10.f17927a
            r11 = -1
            if (r4 == r11) goto L4fa
            int r12 = r10.f17928b
            if (r12 == r11) goto L4fa
            r11 = 1
            goto L4fb
        L4fa:
            r11 = 0
        L4fb:
            if (r11 == 0) goto L503
            r8.f8913A = r4
            int r4 = r10.f17928b
            r8.f8914B = r4
        L503:
            r4 = 2
            y4.a[] r4 = new p427y4.C7110a[r4]
            r11 = 0
            r4[r11] = r0
            java.util.List<y4.a$b> r12 = r1.f23826h
            boolean r12 = r12.isEmpty()
            if (r12 == 0) goto L513
            r12 = 0
            goto L51a
        L513:
            y4.a r12 = new y4.a
            java.util.List<y4.a$b> r13 = r1.f23826h
            r12.<init>(r13)
        L51a:
            r13 = 1
            r4[r13] = r12
            y4.a r12 = new y4.a
            y4.a$b[] r11 = new p427y4.C7110a.b[r11]
            r12.<init>(r11)
            if (r2 != r13) goto L52e
            if (r20 == 0) goto L564
            r21 = r0
            r11 = r15
            r12 = r20
            goto L567
        L52e:
            r11 = 2
            if (r2 != r11) goto L564
            if (r15 == 0) goto L564
            r2 = 0
            r11 = r15
        L535:
            y4.a$b[] r13 = r11.f27506Y
            int r15 = r13.length
            if (r2 >= r15) goto L561
            r13 = r13[r2]
            boolean r15 = r13 instanceof p070e5.C1516a
            if (r15 == 0) goto L55a
            e5.a r13 = (p070e5.C1516a) r13
            java.lang.String r15 = r13.f7364Y
            r21 = r0
            java.lang.String r0 = "com.android.capture.fps"
            boolean r0 = r0.equals(r15)
            if (r0 == 0) goto L55c
            y4.a r12 = new y4.a
            r0 = 1
            y4.a$b[] r0 = new p427y4.C7110a.b[r0]
            r2 = 0
            r0[r2] = r13
            r12.<init>(r0)
            goto L567
        L55a:
            r21 = r0
        L55c:
            int r2 = r2 + 1
            r0 = r21
            goto L535
        L561:
            r21 = r0
            goto L567
        L564:
            r21 = r0
            r11 = r15
        L567:
            r0 = 0
        L568:
            r2 = 2
            if (r0 >= r2) goto L57a
            r2 = r4[r0]
            if (r2 != 0) goto L570
            goto L577
        L570:
            y4.a$b[] r2 = r2.f27506Y
            y4.a r2 = r12.m14220a(r2)
            r12 = r2
        L577:
            int r0 = r0 + 1
            goto L568
        L57a:
            y4.a$b[] r0 = r12.f27506Y
            int r0 = r0.length
            if (r0 <= 0) goto L581
            r8.f8925i = r12
        L581:
            m4.z r0 = r7.f23845c
            f4.e0 r2 = r8.m5193a()
            r0.mo5973e(r2)
            int r0 = r14.f23860b
            r2 = 2
            if (r0 != r2) goto L599
            r0 = -1
            r8 = r16
            if (r8 != r0) goto L59b
            int r12 = r17.size()
            goto L59c
        L599:
            r8 = r16
        L59b:
            r12 = r8
        L59c:
            r0 = r17
            r0.add(r7)
        L5a1:
            int r9 = r9 + 1
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r17 = r0
            r2 = r18
            r4 = r19
            r0 = r21
            goto L47f
        L5b2:
            r8 = r12
            r0 = r17
            r9 = 0
            r1.f23839u = r8
            r1.f23840v = r5
            r2 = 0
            t4.h$a[] r2 = new p336t4.C6163h.a[r2]
            java.lang.Object[] r0 = r0.toArray(r2)
            t4.h$a[] r0 = (p336t4.C6163h.a[]) r0
            r1.f23837s = r0
            int r2 = r0.length
            long[][] r2 = new long[r2][]
            int r4 = r0.length
            int[] r4 = new int[r4]
            int r5 = r0.length
            long[] r5 = new long[r5]
            int r6 = r0.length
            boolean[] r6 = new boolean[r6]
            r7 = 0
        L5d3:
            int r8 = r0.length
            if (r7 >= r8) goto L5ee
            r8 = r0[r7]
            t4.o r8 = r8.f23844b
            int r8 = r8.f23893b
            long[] r8 = new long[r8]
            r2[r7] = r8
            r8 = r0[r7]
            t4.o r8 = r8.f23844b
            long[] r8 = r8.f23897f
            r11 = 0
            r11 = r8[r11]
            r5[r7] = r11
            int r7 = r7 + 1
            goto L5d3
        L5ee:
            r7 = 0
        L5ef:
            int r8 = r0.length
            if (r7 >= r8) goto L635
            r11 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r8 = 0
            r13 = -1
        L5f9:
            int r14 = r0.length
            if (r8 >= r14) goto L60c
            boolean r14 = r6[r8]
            if (r14 != 0) goto L609
            r14 = r5[r8]
            int r16 = (r14 > r11 ? 1 : (r14 == r11 ? 0 : -1))
            if (r16 > 0) goto L609
            r11 = r5[r8]
            r13 = r8
        L609:
            int r8 = r8 + 1
            goto L5f9
        L60c:
            r8 = r4[r13]
            r11 = r2[r13]
            r11[r8] = r9
            r11 = r0[r13]
            t4.o r11 = r11.f23844b
            int[] r11 = r11.f23895d
            r11 = r11[r8]
            long r11 = (long) r11
            long r9 = r9 + r11
            r11 = 1
            int r8 = r8 + r11
            r4[r13] = r8
            r12 = r2[r13]
            int r12 = r12.length
            if (r8 >= r12) goto L630
            r11 = r0[r13]
            t4.o r11 = r11.f23844b
            long[] r11 = r11.f23897f
            r14 = r11[r8]
            r5[r13] = r14
            goto L5ef
        L630:
            r6[r13] = r11
            int r7 = r7 + 1
            goto L5ef
        L635:
            r1.f23838t = r2
            r3.mo6043b()
            r3.mo6044c(r1)
            java.util.ArrayDeque<t4.a$a> r0 = r1.f23824f
            r0.clear()
            r0 = 2
            r1.f23827i = r0
            goto L2
        L647:
            java.util.ArrayDeque<t4.a$a> r0 = r1.f23824f
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L2
            java.util.ArrayDeque<t4.a$a> r0 = r1.f23824f
            java.lang.Object r0 = r0.peek()
            t4.a$a r0 = (p336t4.AbstractC6156a.a) r0
            java.util.List<t4.a$a> r0 = r0.f23749d
            r0.add(r2)
            goto L2
        L65e:
            int r0 = r1.f23827i
            r2 = 2
            if (r0 == r2) goto L666
            r23.m12728j()
        L666:
            return
    }

    @Override // p216m4.InterfaceC4364i
    public void release() {
            r0 = this;
            return
    }
}
