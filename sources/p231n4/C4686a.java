package p231n4;

/* renamed from: n4.a */
/* loaded from: classes.dex */
public final class C4686a implements p216m4.InterfaceC4364i {

    /* renamed from: p */
    public static final int[] f18661p = null;

    /* renamed from: q */
    public static final int[] f18662q = null;

    /* renamed from: r */
    public static final byte[] f18663r = null;

    /* renamed from: s */
    public static final byte[] f18664s = null;

    /* renamed from: t */
    public static final int f18665t = 0;

    /* renamed from: a */
    public final byte[] f18666a;

    /* renamed from: b */
    public final int f18667b;

    /* renamed from: c */
    public boolean f18668c;

    /* renamed from: d */
    public long f18669d;

    /* renamed from: e */
    public int f18670e;

    /* renamed from: f */
    public int f18671f;

    /* renamed from: g */
    public boolean f18672g;

    /* renamed from: h */
    public long f18673h;

    /* renamed from: i */
    public int f18674i;

    /* renamed from: j */
    public int f18675j;

    /* renamed from: k */
    public long f18676k;

    /* renamed from: l */
    public p216m4.InterfaceC4366k f18677l;

    /* renamed from: m */
    public p216m4.InterfaceC4381z f18678m;

    /* renamed from: n */
    public p216m4.InterfaceC4378w f18679n;

    /* renamed from: o */
    public boolean f18680o;

    static {
            r0 = 16
            int[] r1 = new int[r0]
            r1 = {x0028: FILL_ARRAY_DATA , data: [13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1} // fill-array
            p231n4.C4686a.f18661p = r1
            int[] r0 = new int[r0]
            r0 = {x004c: FILL_ARRAY_DATA , data: [18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1} // fill-array
            p231n4.C4686a.f18662q = r0
            java.lang.String r1 = "#!AMR\n"
            byte[] r1 = p371v5.C6552b0.m13329v(r1)
            p231n4.C4686a.f18663r = r1
            java.lang.String r1 = "#!AMR-WB\n"
            byte[] r1 = p371v5.C6552b0.m13329v(r1)
            p231n4.C4686a.f18664s = r1
            r1 = 8
            r0 = r0[r1]
            p231n4.C4686a.f18665t = r0
            return
    }

    public C4686a(int r2) {
            r1 = this;
            r1.<init>()
            r0 = r2 & 2
            if (r0 == 0) goto L9
            r2 = r2 | 1
        L9:
            r1.f18667b = r2
            r2 = 1
            byte[] r2 = new byte[r2]
            r1.f18666a = r2
            r2 = -1
            r1.f18674i = r2
            return
    }

    /* renamed from: a */
    public final int m10725a(p216m4.InterfaceC4365j r5) {
            r4 = this;
            r5.mo9790h()
            byte[] r0 = r4.f18666a
            r1 = 0
            r2 = 1
            r5.mo9795o(r0, r1, r2)
            byte[] r5 = r4.f18666a
            r5 = r5[r1]
            r0 = r5 & 131(0x83, float:1.84E-43)
            r2 = 0
            if (r0 > 0) goto L7a
            int r5 = r5 >> 3
            r0 = 15
            r5 = r5 & r0
            if (r5 < 0) goto L3d
            if (r5 > r0) goto L3d
            boolean r0 = r4.f18668c
            if (r0 == 0) goto L2a
            r3 = 10
            if (r5 < r3) goto L28
            r3 = 13
            if (r5 <= r3) goto L2a
        L28:
            r3 = 1
            goto L2b
        L2a:
            r3 = 0
        L2b:
            if (r3 != 0) goto L3c
            if (r0 != 0) goto L39
            r0 = 12
            if (r5 < r0) goto L37
            r0 = 14
            if (r5 <= r0) goto L39
        L37:
            r0 = 1
            goto L3a
        L39:
            r0 = 0
        L3a:
            if (r0 == 0) goto L3d
        L3c:
            r1 = 1
        L3d:
            if (r1 != 0) goto L6c
            boolean r0 = r4.f18668c
            if (r0 == 0) goto L46
            java.lang.String r0 = "WB"
            goto L48
        L46:
            java.lang.String r0 = "NB"
        L48:
            int r1 = r0.length()
            int r1 = r1 + 35
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r1)
            java.lang.String r1 = "Illegal AMR "
            r3.append(r1)
            r3.append(r0)
            java.lang.String r0 = " frame type "
            r3.append(r0)
            r3.append(r5)
            java.lang.String r5 = r3.toString()
            f4.s0 r5 = p088f4.C2044s0.m5407a(r5, r2)
            throw r5
        L6c:
            boolean r0 = r4.f18668c
            if (r0 == 0) goto L75
            int[] r0 = p231n4.C4686a.f18662q
            r5 = r0[r5]
            goto L79
        L75:
            int[] r0 = p231n4.C4686a.f18661p
            r5 = r0[r5]
        L79:
            return r5
        L7a:
            r0 = 42
            java.lang.String r1 = "Invalid padding bits for frame header "
            f4.s0 r5 = p216m4.C4357c0.m9780a(r0, r1, r5, r2)
            throw r5
    }

    @Override // p216m4.InterfaceC4364i
    /* renamed from: b */
    public void mo9803b(long r3, long r5) {
            r2 = this;
            r5 = 0
            r2.f18669d = r5
            r0 = 0
            r2.f18670e = r0
            r2.f18671f = r0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 == 0) goto L20
            m4.w r0 = r2.f18679n
            boolean r1 = r0 instanceof p216m4.C4360e
            if (r1 == 0) goto L20
            m4.e r0 = (p216m4.C4360e) r0
            long r5 = r0.f17890b
            int r0 = r0.f17893e
            long r3 = p216m4.C4360e.m9784c(r3, r5, r0)
            r2.f18676k = r3
            goto L22
        L20:
            r2.f18676k = r5
        L22:
            return
    }

    @Override // p216m4.InterfaceC4364i
    /* renamed from: c */
    public void mo9804c(p216m4.InterfaceC4366k r3) {
            r2 = this;
            r2.f18677l = r3
            r0 = 0
            r1 = 1
            m4.z r0 = r3.mo6048l(r0, r1)
            r2.f18678m = r0
            r3.mo6043b()
            return
    }

    /* renamed from: d */
    public final boolean m10726d(p216m4.InterfaceC4365j r6) {
            r5 = this;
            byte[] r0 = p231n4.C4686a.f18663r
            r6.mo9790h()
            int r1 = r0.length
            byte[] r1 = new byte[r1]
            int r2 = r0.length
            r3 = 0
            r6.mo9795o(r1, r3, r2)
            boolean r1 = java.util.Arrays.equals(r1, r0)
            r2 = 1
            if (r1 == 0) goto L18
            r5.f18668c = r3
            int r0 = r0.length
            goto L2d
        L18:
            byte[] r0 = p231n4.C4686a.f18664s
            r6.mo9790h()
            int r1 = r0.length
            byte[] r1 = new byte[r1]
            int r4 = r0.length
            r6.mo9795o(r1, r3, r4)
            boolean r1 = java.util.Arrays.equals(r1, r0)
            if (r1 == 0) goto L31
            r5.f18668c = r2
            int r0 = r0.length
        L2d:
            r6.mo9791i(r0)
            return r2
        L31:
            return r3
    }

    @Override // p216m4.InterfaceC4364i
    /* renamed from: f */
    public boolean mo9805f(p216m4.InterfaceC4365j r1) {
            r0 = this;
            boolean r1 = r0.m10726d(r1)
            return r1
    }

    @Override // p216m4.InterfaceC4364i
    /* renamed from: i */
    public int mo9806i(p216m4.InterfaceC4365j r19, p216m4.C4377v r20) {
            r18 = this;
            r0 = r18
            m4.z r1 = r0.f18678m
            p371v5.C6549a.m13292f(r1)
            int r1 = p371v5.C6552b0.f25624a
            long r1 = r19.mo9797q()
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L22
            boolean r1 = r18.m10726d(r19)
            if (r1 == 0) goto L1a
            goto L22
        L1a:
            r1 = 0
            java.lang.String r2 = "Could not find AMR header."
            f4.s0 r1 = p088f4.C2044s0.m5407a(r2, r1)
            throw r1
        L22:
            boolean r1 = r0.f18680o
            r2 = 1
            if (r1 != 0) goto L51
            r0.f18680o = r2
            boolean r1 = r0.f18668c
            if (r1 == 0) goto L30
            java.lang.String r5 = "audio/amr-wb"
            goto L32
        L30:
            java.lang.String r5 = "audio/3gpp"
        L32:
            if (r1 == 0) goto L37
            r1 = 16000(0x3e80, float:2.2421E-41)
            goto L39
        L37:
            r1 = 8000(0x1f40, float:1.121E-41)
        L39:
            m4.z r6 = r0.f18678m
            f4.e0$b r7 = new f4.e0$b
            r7.<init>()
            r7.f8927k = r5
            int r5 = p231n4.C4686a.f18665t
            r7.f8928l = r5
            r7.f8940x = r2
            r7.f8941y = r1
            f4.e0 r1 = r7.m5193a()
            r6.mo5973e(r1)
        L51:
            int r1 = r0.f18671f
            r5 = 20000(0x4e20, double:9.8813E-320)
            r7 = 0
            r8 = -1
            if (r1 != 0) goto L7e
            int r1 = r18.m10725a(r19)     // Catch: java.io.EOFException -> L7b
            r0.f18670e = r1     // Catch: java.io.EOFException -> L7b
            r0.f18671f = r1
            int r1 = r0.f18674i
            if (r1 != r8) goto L6f
            long r9 = r19.mo9797q()
            r0.f18673h = r9
            int r1 = r0.f18670e
            r0.f18674i = r1
        L6f:
            int r1 = r0.f18674i
            int r9 = r0.f18670e
            if (r1 != r9) goto L7e
            int r1 = r0.f18675j
            int r1 = r1 + r2
            r0.f18675j = r1
            goto L7e
        L7b:
            r10 = r19
            goto L8a
        L7e:
            m4.z r1 = r0.f18678m
            int r9 = r0.f18671f
            r10 = r19
            int r1 = r1.mo5969a(r10, r9, r2)
            if (r1 != r8) goto L8c
        L8a:
            r1 = -1
            goto Lab
        L8c:
            int r9 = r0.f18671f
            int r9 = r9 - r1
            r0.f18671f = r9
            if (r9 <= 0) goto L94
            goto Laa
        L94:
            m4.z r11 = r0.f18678m
            long r12 = r0.f18676k
            long r14 = r0.f18669d
            long r12 = r12 + r14
            r14 = 1
            int r15 = r0.f18670e
            r16 = 0
            r17 = 0
            r11.mo5971c(r12, r14, r15, r16, r17)
            long r11 = r0.f18669d
            long r11 = r11 + r5
            r0.f18669d = r11
        Laa:
            r1 = 0
        Lab:
            long r10 = r19.mo9786a()
            boolean r9 = r0.f18672g
            if (r9 == 0) goto Lb4
            goto L107
        Lb4:
            int r9 = r0.f18667b
            r12 = r9 & 1
            if (r12 == 0) goto Lf4
            r12 = -1
            int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r14 == 0) goto Lf4
            int r15 = r0.f18674i
            if (r15 == r8) goto Lc9
            int r12 = r0.f18670e
            if (r15 == r12) goto Lc9
            goto Lf4
        Lc9:
            int r3 = r0.f18675j
            r4 = 20
            if (r3 >= r4) goto Ld1
            if (r1 != r8) goto L107
        Ld1:
            r3 = r9 & 2
            if (r3 == 0) goto Ld8
            r16 = 1
            goto Lda
        Ld8:
            r16 = 0
        Lda:
            int r3 = r15 * 8
            long r3 = (long) r3
            r7 = 1000000(0xf4240, double:4.940656E-318)
            long r3 = r3 * r7
            long r3 = r3 / r5
            int r14 = (int) r3
            m4.e r3 = new m4.e
            long r12 = r0.f18673h
            r9 = r3
            r9.<init>(r10, r12, r14, r15, r16)
            r0.f18679n = r3
            m4.k r4 = r0.f18677l
            r4.mo6044c(r3)
            goto L105
        Lf4:
            m4.w$b r5 = new m4.w$b
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5.<init>(r6, r3)
            r0.f18679n = r5
            m4.k r3 = r0.f18677l
            r3.mo6044c(r5)
        L105:
            r0.f18672g = r2
        L107:
            return r1
    }

    @Override // p216m4.InterfaceC4364i
    public void release() {
            r0 = this;
            return
    }
}
