package p370v4;

/* renamed from: v4.w */
/* loaded from: classes.dex */
public final class C6545w implements p216m4.InterfaceC4364i {

    /* renamed from: a */
    public final p371v5.C6576z f25596a;

    /* renamed from: b */
    public final android.util.SparseArray<p370v4.C6545w.a> f25597b;

    /* renamed from: c */
    public final p371v5.C6571u f25598c;

    /* renamed from: d */
    public final p370v4.C6544v f25599d;

    /* renamed from: e */
    public boolean f25600e;

    /* renamed from: f */
    public boolean f25601f;

    /* renamed from: g */
    public boolean f25602g;

    /* renamed from: h */
    public long f25603h;

    /* renamed from: i */
    public p370v4.C6543u f25604i;

    /* renamed from: j */
    public p216m4.InterfaceC4366k f25605j;

    /* renamed from: k */
    public boolean f25606k;

    /* renamed from: v4.w$a */
    public static final class a {

        /* renamed from: a */
        public final p370v4.InterfaceC6532j f25607a;

        /* renamed from: b */
        public final p371v5.C6576z f25608b;

        /* renamed from: c */
        public final p216m4.C4355b0 f25609c;

        /* renamed from: d */
        public boolean f25610d;

        /* renamed from: e */
        public boolean f25611e;

        /* renamed from: f */
        public boolean f25612f;

        /* renamed from: g */
        public long f25613g;

        public a(p370v4.InterfaceC6532j r3, p371v5.C6576z r4) {
                r2 = this;
                r2.<init>()
                r2.f25607a = r3
                r2.f25608b = r4
                m4.b0 r3 = new m4.b0
                r4 = 64
                byte[] r4 = new byte[r4]
                r0 = 1
                r1 = 0
                r3.<init>(r4, r0, r1)
                r2.f25609c = r3
                return
        }
    }

    static {
            k1.b r0 = p179k1.C3642b.f16064m0
            return
    }

    public C6545w() {
            r3 = this;
            v5.z r0 = new v5.z
            r1 = 0
            r0.<init>(r1)
            r3.<init>()
            r3.f25596a = r0
            v5.u r0 = new v5.u
            r1 = 4096(0x1000, float:5.74E-42)
            r0.<init>(r1)
            r3.f25598c = r0
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            r3.f25597b = r0
            v4.v r0 = new v4.v
            r0.<init>()
            r3.f25599d = r0
            return
    }

    @Override // p216m4.InterfaceC4364i
    /* renamed from: b */
    public void mo9803b(long r6, long r8) {
            r5 = this;
            v5.z r6 = r5.f25596a
            long r6 = r6.m13446d()
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r2 = 1
            r3 = 0
            int r4 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r4 != 0) goto L13
            r6 = 1
            goto L14
        L13:
            r6 = 0
        L14:
            if (r6 != 0) goto L2d
            v5.z r6 = r5.f25596a
            long r6 = r6.m13445c()
            int r4 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r4 == 0) goto L2b
            r0 = 0
            int r4 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r4 == 0) goto L2b
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 == 0) goto L2b
            goto L2c
        L2b:
            r2 = 0
        L2c:
            r6 = r2
        L2d:
            if (r6 == 0) goto L34
            v5.z r6 = r5.f25596a
            r6.m13447e(r8)
        L34:
            v4.u r6 = r5.f25604i
            if (r6 == 0) goto L3b
            r6.m9740e(r8)
        L3b:
            r6 = 0
        L3c:
            android.util.SparseArray<v4.w$a> r7 = r5.f25597b
            int r7 = r7.size()
            if (r6 >= r7) goto L56
            android.util.SparseArray<v4.w$a> r7 = r5.f25597b
            java.lang.Object r7 = r7.valueAt(r6)
            v4.w$a r7 = (p370v4.C6545w.a) r7
            r7.f25612f = r3
            v4.j r7 = r7.f25607a
            r7.mo13241a()
            int r6 = r6 + 1
            goto L3c
        L56:
            return
    }

    @Override // p216m4.InterfaceC4364i
    /* renamed from: c */
    public void mo9804c(p216m4.InterfaceC4366k r1) {
            r0 = this;
            r0.f25605j = r1
            return
    }

    @Override // p216m4.InterfaceC4364i
    /* renamed from: f */
    public boolean mo9805f(p216m4.InterfaceC4365j r10) {
            r9 = this;
            r0 = 14
            byte[] r1 = new byte[r0]
            r2 = 0
            r10.mo9795o(r1, r2, r0)
            r0 = r1[r2]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 << 24
            r3 = 1
            r4 = r1[r3]
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r4 = r4 << 16
            r0 = r0 | r4
            r4 = 2
            r5 = r1[r4]
            r5 = r5 & 255(0xff, float:3.57E-43)
            r6 = 8
            int r5 = r5 << r6
            r0 = r0 | r5
            r5 = 3
            r7 = r1[r5]
            r7 = r7 & 255(0xff, float:3.57E-43)
            r0 = r0 | r7
            r7 = 442(0x1ba, float:6.2E-43)
            if (r7 == r0) goto L2a
            return r2
        L2a:
            r0 = 4
            r7 = r1[r0]
            r7 = r7 & 196(0xc4, float:2.75E-43)
            r8 = 68
            if (r7 == r8) goto L34
            return r2
        L34:
            r7 = 6
            r7 = r1[r7]
            r7 = r7 & r0
            if (r7 == r0) goto L3b
            return r2
        L3b:
            r7 = r1[r6]
            r7 = r7 & r0
            if (r7 == r0) goto L41
            return r2
        L41:
            r0 = 9
            r0 = r1[r0]
            r0 = r0 & r3
            if (r0 == r3) goto L49
            return r2
        L49:
            r0 = 12
            r0 = r1[r0]
            r0 = r0 & r5
            if (r0 == r5) goto L51
            return r2
        L51:
            r0 = 13
            r0 = r1[r0]
            r0 = r0 & 7
            r10.mo9796p(r0)
            r10.mo9795o(r1, r2, r5)
            r10 = r1[r2]
            r10 = r10 & 255(0xff, float:3.57E-43)
            int r10 = r10 << 16
            r0 = r1[r3]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 << r6
            r10 = r10 | r0
            r0 = r1[r4]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r10 = r10 | r0
            if (r3 != r10) goto L71
            r2 = 1
        L71:
            return r2
    }

    @Override // p216m4.InterfaceC4364i
    /* renamed from: i */
    public int mo9806i(p216m4.InterfaceC4365j r14, p216m4.C4377v r15) {
            r13 = this;
            m4.k r0 = r13.f25605j
            p371v5.C6549a.m13292f(r0)
            long r7 = r14.mo9786a()
            r0 = 1
            r1 = -1
            r9 = 0
            int r10 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r10 == 0) goto L13
            r1 = 1
            goto L14
        L13:
            r1 = 0
        L14:
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r4 = 442(0x1ba, float:6.2E-43)
            if (r1 == 0) goto L106
            v4.v r1 = r13.f25599d
            boolean r5 = r1.f25590c
            if (r5 != 0) goto L106
            boolean r5 = r1.f25592e
            r6 = 20000(0x4e20, double:9.8813E-320)
            if (r5 != 0) goto L78
            long r10 = r14.mo9786a()
            long r5 = java.lang.Math.min(r6, r10)
            int r6 = (int) r5
            long r7 = (long) r6
            long r10 = r10 - r7
            long r7 = r14.mo9797q()
            int r5 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r5 == 0) goto L40
            r15.f17934a = r10
            goto Ld1
        L40:
            v5.u r15 = r1.f25589b
            r15.m13392B(r6)
            r14.mo9790h()
            v5.u r15 = r1.f25589b
            byte[] r15 = r15.f25710a
            r14.mo9795o(r15, r9, r6)
            v5.u r14 = r1.f25589b
            int r15 = r14.f25711b
            int r5 = r14.f25712c
            int r5 = r5 + (-4)
        L57:
            if (r5 < r15) goto L73
            byte[] r6 = r14.f25710a
            int r6 = r1.m13285b(r6, r5)
            if (r6 != r4) goto L70
            int r6 = r5 + 4
            r14.m13396F(r6)
            long r6 = p370v4.C6544v.m13283c(r14)
            int r8 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r8 == 0) goto L70
            r2 = r6
            goto L73
        L70:
            int r5 = r5 + (-1)
            goto L57
        L73:
            r1.f25594g = r2
            r1.f25592e = r0
            goto Ld0
        L78:
            long r10 = r1.f25594g
            int r5 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r5 != 0) goto L80
            goto L102
        L80:
            boolean r5 = r1.f25591d
            if (r5 != 0) goto Ld3
            long r10 = r14.mo9786a()
            long r5 = java.lang.Math.min(r6, r10)
            int r6 = (int) r5
            long r7 = r14.mo9797q()
            long r10 = (long) r9
            int r5 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r5 == 0) goto L99
            r15.f17934a = r10
            goto Ld1
        L99:
            v5.u r15 = r1.f25589b
            r15.m13392B(r6)
            r14.mo9790h()
            v5.u r15 = r1.f25589b
            byte[] r15 = r15.f25710a
            r14.mo9795o(r15, r9, r6)
            v5.u r14 = r1.f25589b
            int r15 = r14.f25711b
            int r5 = r14.f25712c
        Lae:
            int r6 = r5 + (-3)
            if (r15 >= r6) goto Lcc
            byte[] r6 = r14.f25710a
            int r6 = r1.m13285b(r6, r15)
            if (r6 != r4) goto Lc9
            int r6 = r15 + 4
            r14.m13396F(r6)
            long r6 = p370v4.C6544v.m13283c(r14)
            int r8 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r8 == 0) goto Lc9
            r2 = r6
            goto Lcc
        Lc9:
            int r15 = r15 + 1
            goto Lae
        Lcc:
            r1.f25593f = r2
            r1.f25591d = r0
        Ld0:
            r0 = 0
        Ld1:
            r9 = r0
            goto L105
        Ld3:
            long r4 = r1.f25593f
            int r15 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r15 != 0) goto Lda
            goto L102
        Lda:
            v5.z r15 = r1.f25588a
            long r4 = r15.m13444b(r4)
            v5.z r15 = r1.f25588a
            long r6 = r1.f25594g
            long r6 = r15.m13444b(r6)
            long r6 = r6 - r4
            r1.f25595h = r6
            r4 = 0
            int r15 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r15 >= 0) goto L102
            r15 = 65
            java.lang.String r0 = "Invalid duration: "
            java.lang.String r4 = ". Using TIME_UNSET instead."
            java.lang.String r15 = p304r4.C5780a.m12119a(r15, r0, r6, r4)
            java.lang.String r0 = "PsDurationReader"
            android.util.Log.w(r0, r15)
            r1.f25595h = r2
        L102:
            r1.m13284a(r14)
        L105:
            return r9
        L106:
            boolean r1 = r13.f25606k
            if (r1 != 0) goto L136
            r13.f25606k = r0
            v4.v r1 = r13.f25599d
            long r4 = r1.f25595h
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 == 0) goto L127
            v4.u r11 = new v4.u
            v5.z r2 = r1.f25588a
            r1 = r11
            r3 = r4
            r5 = r7
            r1.<init>(r2, r3, r5)
            r13.f25604i = r11
            m4.k r1 = r13.f25605j
            m4.a$a r2 = r11.f17839a
            r3 = 442(0x1ba, float:6.2E-43)
            goto L132
        L127:
            r3 = 442(0x1ba, float:6.2E-43)
            m4.k r1 = r13.f25605j
            m4.w$b r2 = new m4.w$b
            r11 = 0
            r2.<init>(r4, r11)
        L132:
            r1.mo6044c(r2)
            goto L138
        L136:
            r3 = 442(0x1ba, float:6.2E-43)
        L138:
            v4.u r1 = r13.f25604i
            if (r1 == 0) goto L149
            boolean r1 = r1.m9737b()
            if (r1 == 0) goto L149
            v4.u r0 = r13.f25604i
            int r14 = r0.m9736a(r14, r15)
            return r14
        L149:
            r14.mo9790h()
            if (r10 == 0) goto L154
            long r1 = r14.mo9794n()
            long r7 = r7 - r1
            goto L156
        L154:
            r7 = -1
        L156:
            r15 = -1
            r1 = -1
            int r4 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r4 == 0) goto L164
            r1 = 4
            int r4 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r4 >= 0) goto L164
            return r15
        L164:
            v5.u r1 = r13.f25598c
            byte[] r1 = r1.f25710a
            r2 = 4
            boolean r1 = r14.mo9793m(r1, r9, r2, r0)
            if (r1 != 0) goto L170
            return r15
        L170:
            v5.u r1 = r13.f25598c
            r1.m13396F(r9)
            v5.u r1 = r13.f25598c
            int r1 = r1.m13403f()
            r4 = 441(0x1b9, float:6.18E-43)
            if (r1 != r4) goto L180
            return r15
        L180:
            if (r1 != r3) goto L19d
            v5.u r15 = r13.f25598c
            byte[] r15 = r15.f25710a
            r0 = 10
            r14.mo9795o(r15, r9, r0)
            v5.u r15 = r13.f25598c
            r0 = 9
            r15.m13396F(r0)
            v5.u r15 = r13.f25598c
            int r15 = r15.m13418u()
            r15 = r15 & 7
            int r15 = r15 + 14
            goto L1b6
        L19d:
            r15 = 443(0x1bb, float:6.21E-43)
            r3 = 2
            r4 = 6
            if (r1 != r15) goto L1ba
            v5.u r15 = r13.f25598c
            byte[] r15 = r15.f25710a
            r14.mo9795o(r15, r9, r3)
            v5.u r15 = r13.f25598c
            r15.m13396F(r9)
            v5.u r15 = r13.f25598c
            int r15 = r15.m13423z()
            int r15 = r15 + r4
        L1b6:
            r14.mo9791i(r15)
            return r9
        L1ba:
            r15 = r1 & (-256(0xffffffffffffff00, float:NaN))
            r5 = 8
            int r15 = r15 >> r5
            if (r15 == r0) goto L1c5
            r14.mo9791i(r0)
            return r9
        L1c5:
            r15 = r1 & 255(0xff, float:3.57E-43)
            android.util.SparseArray<v4.w$a> r1 = r13.f25597b
            java.lang.Object r1 = r1.get(r15)
            v4.w$a r1 = (p370v4.C6545w.a) r1
            boolean r6 = r13.f25600e
            if (r6 != 0) goto L23f
            if (r1 != 0) goto L21f
            r6 = 189(0xbd, float:2.65E-43)
            r7 = 0
            if (r15 != r6) goto L1e0
            v4.b r6 = new v4.b
            r6.<init>(r7)
            goto L1eb
        L1e0:
            r6 = r15 & 224(0xe0, float:3.14E-43)
            r8 = 192(0xc0, float:2.69E-43)
            if (r6 != r8) goto L1ef
            v4.q r6 = new v4.q
            r6.<init>(r7)
        L1eb:
            r13.f25601f = r0
        L1ed:
            r7 = r6
            goto L1fd
        L1ef:
            r6 = r15 & 240(0xf0, float:3.36E-43)
            r8 = 224(0xe0, float:3.14E-43)
            if (r6 != r8) goto L203
            v4.k r6 = new v4.k
            r6.<init>(r7)
            r13.f25602g = r0
            goto L1ed
        L1fd:
            long r10 = r14.mo9797q()
            r13.f25603h = r10
        L203:
            if (r7 == 0) goto L21f
            v4.d0$d r1 = new v4.d0$d
            r6 = 256(0x100, float:3.59E-43)
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            r1.<init>(r8, r15, r6)
            m4.k r6 = r13.f25605j
            r7.mo13243d(r6, r1)
            v4.w$a r1 = new v4.w$a
            v5.z r6 = r13.f25596a
            r1.<init>(r7, r6)
            android.util.SparseArray<v4.w$a> r6 = r13.f25597b
            r6.put(r15, r1)
        L21f:
            boolean r15 = r13.f25601f
            if (r15 == 0) goto L22d
            boolean r15 = r13.f25602g
            if (r15 == 0) goto L22d
            long r6 = r13.f25603h
            r10 = 8192(0x2000, double:4.0474E-320)
            long r6 = r6 + r10
            goto L230
        L22d:
            r6 = 1048576(0x100000, double:5.180654E-318)
        L230:
            long r10 = r14.mo9797q()
            int r15 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r15 <= 0) goto L23f
            r13.f25600e = r0
            m4.k r15 = r13.f25605j
            r15.mo6043b()
        L23f:
            v5.u r15 = r13.f25598c
            byte[] r15 = r15.f25710a
            r14.mo9795o(r15, r9, r3)
            v5.u r15 = r13.f25598c
            r15.m13396F(r9)
            v5.u r15 = r13.f25598c
            int r15 = r15.m13423z()
            int r15 = r15 + r4
            if (r1 != 0) goto L259
            r14.mo9791i(r15)
            goto L33f
        L259:
            v5.u r3 = r13.f25598c
            r3.m13392B(r15)
            v5.u r3 = r13.f25598c
            byte[] r3 = r3.f25710a
            r14.readFully(r3, r9, r15)
            v5.u r14 = r13.f25598c
            r14.m13396F(r4)
            v5.u r14 = r13.f25598c
            m4.b0 r15 = r1.f25609c
            java.lang.Object r15 = r15.f17870b
            byte[] r15 = (byte[]) r15
            r3 = 3
            r14.m13402e(r15, r9, r3)
            m4.b0 r15 = r1.f25609c
            r15.m9772q(r9)
            m4.b0 r15 = r1.f25609c
            r15.m9775t(r5)
            m4.b0 r15 = r1.f25609c
            boolean r15 = r15.m9765j()
            r1.f25610d = r15
            m4.b0 r15 = r1.f25609c
            boolean r15 = r15.m9765j()
            r1.f25611e = r15
            m4.b0 r15 = r1.f25609c
            r15.m9775t(r4)
            m4.b0 r15 = r1.f25609c
            int r15 = r15.m9766k(r5)
            m4.b0 r4 = r1.f25609c
            java.lang.Object r4 = r4.f17870b
            byte[] r4 = (byte[]) r4
            r14.m13402e(r4, r9, r15)
            m4.b0 r15 = r1.f25609c
            r15.m9772q(r9)
            r4 = 0
            r1.f25613g = r4
            boolean r15 = r1.f25610d
            if (r15 == 0) goto L326
            m4.b0 r15 = r1.f25609c
            r15.m9775t(r2)
            m4.b0 r15 = r1.f25609c
            int r15 = r15.m9766k(r3)
            long r4 = (long) r15
            r15 = 30
            long r4 = r4 << r15
            m4.b0 r6 = r1.f25609c
            r6.m9775t(r0)
            m4.b0 r6 = r1.f25609c
            r7 = 15
            int r6 = r6.m9766k(r7)
            int r6 = r6 << r7
            long r8 = (long) r6
            long r4 = r4 | r8
            m4.b0 r6 = r1.f25609c
            r6.m9775t(r0)
            m4.b0 r6 = r1.f25609c
            int r6 = r6.m9766k(r7)
            long r8 = (long) r6
            long r4 = r4 | r8
            m4.b0 r6 = r1.f25609c
            r6.m9775t(r0)
            boolean r6 = r1.f25612f
            if (r6 != 0) goto L31e
            boolean r6 = r1.f25611e
            if (r6 == 0) goto L31e
            m4.b0 r6 = r1.f25609c
            r6.m9775t(r2)
            m4.b0 r6 = r1.f25609c
            int r3 = r6.m9766k(r3)
            long r8 = (long) r3
            long r8 = r8 << r15
            m4.b0 r15 = r1.f25609c
            r15.m9775t(r0)
            m4.b0 r15 = r1.f25609c
            int r15 = r15.m9766k(r7)
            int r15 = r15 << r7
            long r10 = (long) r15
            long r8 = r8 | r10
            m4.b0 r15 = r1.f25609c
            r15.m9775t(r0)
            m4.b0 r15 = r1.f25609c
            int r15 = r15.m9766k(r7)
            long r6 = (long) r15
            long r6 = r6 | r8
            m4.b0 r15 = r1.f25609c
            r15.m9775t(r0)
            v5.z r15 = r1.f25608b
            r15.m13444b(r6)
            r1.f25612f = r0
        L31e:
            v5.z r15 = r1.f25608b
            long r3 = r15.m13444b(r4)
            r1.f25613g = r3
        L326:
            v4.j r15 = r1.f25607a
            long r3 = r1.f25613g
            r15.mo13245f(r3, r2)
            v4.j r15 = r1.f25607a
            r15.mo13242c(r14)
            v4.j r14 = r1.f25607a
            r14.mo13244e()
            v5.u r14 = r13.f25598c
            byte[] r15 = r14.f25710a
            int r15 = r15.length
            r14.m13395E(r15)
        L33f:
            r14 = 0
            return r14
    }

    @Override // p216m4.InterfaceC4364i
    public void release() {
            r0 = this;
            return
    }
}
