package p370v4;

/* renamed from: v4.e */
/* loaded from: classes.dex */
public final class C6526e implements p216m4.InterfaceC4364i {

    /* renamed from: a */
    public final int f25348a;

    /* renamed from: b */
    public final p370v4.C6528f f25349b;

    /* renamed from: c */
    public final p371v5.C6571u f25350c;

    /* renamed from: d */
    public final p371v5.C6571u f25351d;

    /* renamed from: e */
    public final p216m4.C4355b0 f25352e;

    /* renamed from: f */
    public p216m4.InterfaceC4366k f25353f;

    /* renamed from: g */
    public long f25354g;

    /* renamed from: h */
    public long f25355h;

    /* renamed from: i */
    public int f25356i;

    /* renamed from: j */
    public boolean f25357j;

    /* renamed from: k */
    public boolean f25358k;

    /* renamed from: l */
    public boolean f25359l;

    static {
            k1.c r0 = p179k1.C3644c.f16090l0
            return
    }

    public C6526e(int r5) {
            r4 = this;
            r4.<init>()
            r0 = r5 & 2
            if (r0 == 0) goto L9
            r5 = r5 | 1
        L9:
            r4.f25348a = r5
            v4.f r5 = new v4.f
            r0 = 1
            r1 = 0
            r5.<init>(r0, r1)
            r4.f25349b = r5
            v5.u r5 = new v5.u
            r2 = 2048(0x800, float:2.87E-42)
            r5.<init>(r2)
            r4.f25350c = r5
            r5 = -1
            r4.f25356i = r5
            r2 = -1
            r4.f25355h = r2
            v5.u r5 = new v5.u
            r2 = 10
            r5.<init>(r2)
            r4.f25351d = r5
            m4.b0 r2 = new m4.b0
            byte[] r5 = r5.f25710a
            r2.<init>(r5, r0, r1)
            r4.f25352e = r2
            return
    }

    /* renamed from: a */
    public final int m13256a(p216m4.InterfaceC4365j r7) {
            r6 = this;
            r0 = 0
            r1 = 0
        L2:
            v5.u r2 = r6.f25351d
            byte[] r2 = r2.f25710a
            r3 = 10
            r7.mo9795o(r2, r0, r3)
            v5.u r2 = r6.f25351d
            r2.m13396F(r0)
            v5.u r2 = r6.f25351d
            int r2 = r2.m13420w()
            r3 = 4801587(0x494433, float:6.728456E-39)
            if (r2 == r3) goto L2d
            r7.mo9790h()
            r7.mo9796p(r1)
            long r2 = r6.f25355h
            r4 = -1
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 != 0) goto L2c
            long r2 = (long) r1
            r6.f25355h = r2
        L2c:
            return r1
        L2d:
            v5.u r2 = r6.f25351d
            r3 = 3
            r2.m13397G(r3)
            v5.u r2 = r6.f25351d
            int r2 = r2.m13417t()
            int r3 = r2 + 10
            int r1 = r1 + r3
            r7.mo9796p(r2)
            goto L2
    }

    @Override // p216m4.InterfaceC4364i
    /* renamed from: b */
    public void mo9803b(long r1, long r3) {
            r0 = this;
            r1 = 0
            r0.f25358k = r1
            v4.f r1 = r0.f25349b
            r1.mo13241a()
            r0.f25354g = r3
            return
    }

    @Override // p216m4.InterfaceC4364i
    /* renamed from: c */
    public void mo9804c(p216m4.InterfaceC4366k r6) {
            r5 = this;
            r5.f25353f = r6
            v4.f r0 = r5.f25349b
            v4.d0$d r1 = new v4.d0$d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 0
            r4 = 1
            r1.<init>(r2, r3, r4)
            r0.mo13243d(r6, r1)
            r6.mo6043b()
            return
    }

    @Override // p216m4.InterfaceC4364i
    /* renamed from: f */
    public boolean mo9805f(p216m4.InterfaceC4365j r9) {
            r8 = this;
            int r0 = r8.m13256a(r9)
            r1 = 0
            r3 = r0
            r2 = 0
            r4 = 0
        L8:
            v5.u r5 = r8.f25351d
            byte[] r5 = r5.f25710a
            r6 = 2
            r9.mo9795o(r5, r1, r6)
            v5.u r5 = r8.f25351d
            r5.m13396F(r1)
            v5.u r5 = r8.f25351d
            int r5 = r5.m13423z()
            boolean r5 = p370v4.C6528f.m13259g(r5)
            if (r5 != 0) goto L2c
        L21:
            int r3 = r3 + 1
            r9.mo9790h()
            r9.mo9796p(r3)
            r2 = 0
            r4 = 0
            goto L56
        L2c:
            r5 = 1
            int r2 = r2 + r5
            r6 = 4
            if (r2 < r6) goto L36
            r7 = 188(0xbc, float:2.63E-43)
            if (r4 <= r7) goto L36
            return r5
        L36:
            v5.u r5 = r8.f25351d
            byte[] r5 = r5.f25710a
            r9.mo9795o(r5, r1, r6)
            m4.b0 r5 = r8.f25352e
            r6 = 14
            r5.m9772q(r6)
            m4.b0 r5 = r8.f25352e
            r6 = 13
            int r5 = r5.m9766k(r6)
            r6 = 6
            if (r5 > r6) goto L50
            goto L21
        L50:
            int r6 = r5 + (-6)
            r9.mo9796p(r6)
            int r4 = r4 + r5
        L56:
            int r5 = r3 - r0
            r6 = 8192(0x2000, float:1.148E-41)
            if (r5 < r6) goto L8
            return r1
    }

    @Override // p216m4.InterfaceC4364i
    /* renamed from: i */
    public int mo9806i(p216m4.InterfaceC4365j r19, p216m4.C4377v r20) {
            r18 = this;
            r0 = r18
            r1 = r19
            m4.k r2 = r0.f25353f
            p371v5.C6549a.m13292f(r2)
            long r4 = r19.mo9786a()
            int r2 = r0.f25348a
            r3 = r2 & 2
            r11 = 0
            r12 = 1
            if (r3 != 0) goto L21
            r2 = r2 & r12
            if (r2 == 0) goto L1f
            r2 = -1
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 == 0) goto L1f
            goto L21
        L1f:
            r2 = 0
            goto L22
        L21:
            r2 = 1
        L22:
            r13 = 4
            r6 = 0
            r14 = -1
            r3 = 2
            if (r2 == 0) goto Lab
            boolean r2 = r0.f25357j
            if (r2 == 0) goto L2f
            goto Lab
        L2f:
            r0.f25356i = r14
            r19.mo9790h()
            long r8 = r19.mo9797q()
            int r2 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r2 != 0) goto L3f
            r18.m13256a(r19)
        L3f:
            r8 = r6
            r2 = 0
        L41:
            v5.u r10 = r0.f25351d     // Catch: java.io.EOFException -> L90
            byte[] r10 = r10.f25710a     // Catch: java.io.EOFException -> L90
            boolean r10 = r1.mo9793m(r10, r11, r3, r12)     // Catch: java.io.EOFException -> L90
            if (r10 == 0) goto L9c
            v5.u r10 = r0.f25351d     // Catch: java.io.EOFException -> L90
            r10.m13396F(r11)     // Catch: java.io.EOFException -> L90
            v5.u r10 = r0.f25351d     // Catch: java.io.EOFException -> L90
            int r10 = r10.m13423z()     // Catch: java.io.EOFException -> L90
            boolean r10 = p370v4.C6528f.m13259g(r10)     // Catch: java.io.EOFException -> L90
            if (r10 != 0) goto L5e
            r2 = 0
            goto L9c
        L5e:
            v5.u r10 = r0.f25351d     // Catch: java.io.EOFException -> L90
            byte[] r10 = r10.f25710a     // Catch: java.io.EOFException -> L90
            boolean r10 = r1.mo9793m(r10, r11, r13, r12)     // Catch: java.io.EOFException -> L90
            if (r10 != 0) goto L69
            goto L9c
        L69:
            m4.b0 r10 = r0.f25352e     // Catch: java.io.EOFException -> L90
            r15 = 14
            r10.m9772q(r15)     // Catch: java.io.EOFException -> L90
            m4.b0 r10 = r0.f25352e     // Catch: java.io.EOFException -> L90
            r15 = 13
            int r10 = r10.m9766k(r15)     // Catch: java.io.EOFException -> L90
            r15 = 6
            if (r10 <= r15) goto L92
            long r6 = (long) r10     // Catch: java.io.EOFException -> L90
            long r8 = r8 + r6
            int r2 = r2 + 1
            r6 = 1000(0x3e8, float:1.401E-42)
            if (r2 != r6) goto L84
            goto L9c
        L84:
            int r10 = r10 + (-6)
            boolean r6 = r1.mo9792k(r10, r12)     // Catch: java.io.EOFException -> L90
            if (r6 != 0) goto L8d
            goto L9c
        L8d:
            r6 = 0
            goto L41
        L90:
            goto L9c
        L92:
            r0.f25357j = r12     // Catch: java.io.EOFException -> L90
            java.lang.String r6 = "Malformed ADTS stream"
            r7 = 0
            f4.s0 r6 = p088f4.C2044s0.m5407a(r6, r7)     // Catch: java.io.EOFException -> L90
            throw r6     // Catch: java.io.EOFException -> L90
        L9c:
            r19.mo9790h()
            if (r2 <= 0) goto La7
            long r6 = (long) r2
            long r8 = r8 / r6
            int r2 = (int) r8
            r0.f25356i = r2
            goto La9
        La7:
            r0.f25356i = r14
        La9:
            r0.f25357j = r12
        Lab:
            v5.u r2 = r0.f25350c
            byte[] r2 = r2.f25710a
            r6 = 2048(0x800, float:2.87E-42)
            int r1 = r1.mo6020b(r2, r11, r6)
            if (r1 != r14) goto Lb9
            r2 = 1
            goto Lba
        Lb9:
            r2 = 0
        Lba:
            boolean r6 = r0.f25359l
            if (r6 == 0) goto Lbf
            goto L116
        Lbf:
            int r6 = r0.f25348a
            r7 = r6 & 1
            if (r7 == 0) goto Lcb
            int r7 = r0.f25356i
            if (r7 <= 0) goto Lcb
            r7 = 1
            goto Lcc
        Lcb:
            r7 = 0
        Lcc:
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r7 == 0) goto Lde
            v4.f r10 = r0.f25349b
            long r13 = r10.f25379q
            int r10 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
            if (r10 != 0) goto Lde
            if (r2 != 0) goto Lde
            goto L116
        Lde:
            if (r7 == 0) goto L108
            v4.f r7 = r0.f25349b
            long r13 = r7.f25379q
            int r7 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
            if (r7 == 0) goto L108
            m4.k r15 = r0.f25353f
            r3 = r3 & r6
            if (r3 == 0) goto Lef
            r10 = 1
            goto Lf0
        Lef:
            r10 = 0
        Lf0:
            int r9 = r0.f25356i
            int r3 = r9 * 8
            long r6 = (long) r3
            r16 = 1000000(0xf4240, double:4.940656E-318)
            long r6 = r6 * r16
            long r6 = r6 / r13
            int r8 = (int) r6
            m4.e r13 = new m4.e
            long r6 = r0.f25355h
            r3 = r13
            r3.<init>(r4, r6, r8, r9, r10)
            r15.mo6044c(r13)
            goto L114
        L108:
            m4.k r3 = r0.f25353f
            m4.w$b r4 = new m4.w$b
            r5 = 0
            r4.<init>(r8, r5)
            r3.mo6044c(r4)
        L114:
            r0.f25359l = r12
        L116:
            if (r2 == 0) goto L11a
            r2 = -1
            return r2
        L11a:
            v5.u r2 = r0.f25350c
            r2.m13396F(r11)
            v5.u r2 = r0.f25350c
            r2.m13395E(r1)
            boolean r1 = r0.f25358k
            if (r1 != 0) goto L132
            v4.f r1 = r0.f25349b
            long r2 = r0.f25354g
            r4 = 4
            r1.mo13245f(r2, r4)
            r0.f25358k = r12
        L132:
            v4.f r1 = r0.f25349b
            v5.u r2 = r0.f25350c
            r1.mo13242c(r2)
            return r11
    }

    @Override // p216m4.InterfaceC4364i
    public void release() {
            r0 = this;
            return
    }
}
