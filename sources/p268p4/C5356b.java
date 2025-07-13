package p268p4;

/* renamed from: p4.b */
/* loaded from: classes.dex */
public final class C5356b implements p216m4.InterfaceC4364i {

    /* renamed from: a */
    public final p371v5.C6571u f21268a;

    /* renamed from: b */
    public final p371v5.C6571u f21269b;

    /* renamed from: c */
    public final p371v5.C6571u f21270c;

    /* renamed from: d */
    public final p371v5.C6571u f21271d;

    /* renamed from: e */
    public final p268p4.C5357c f21272e;

    /* renamed from: f */
    public p216m4.InterfaceC4366k f21273f;

    /* renamed from: g */
    public int f21274g;

    /* renamed from: h */
    public boolean f21275h;

    /* renamed from: i */
    public long f21276i;

    /* renamed from: j */
    public int f21277j;

    /* renamed from: k */
    public int f21278k;

    /* renamed from: l */
    public int f21279l;

    /* renamed from: m */
    public long f21280m;

    /* renamed from: n */
    public boolean f21281n;

    /* renamed from: o */
    public p268p4.C5355a f21282o;

    /* renamed from: p */
    public p268p4.C5359e f21283p;

    static {
            androidx.room.a r0 = androidx.room.C0618a.f3657g0
            return
    }

    public C5356b() {
            r2 = this;
            r2.<init>()
            v5.u r0 = new v5.u
            r1 = 4
            r0.<init>(r1)
            r2.f21268a = r0
            v5.u r0 = new v5.u
            r1 = 9
            r0.<init>(r1)
            r2.f21269b = r0
            v5.u r0 = new v5.u
            r1 = 11
            r0.<init>(r1)
            r2.f21270c = r0
            v5.u r0 = new v5.u
            r0.<init>()
            r2.f21271d = r0
            p4.c r0 = new p4.c
            r0.<init>()
            r2.f21272e = r0
            r0 = 1
            r2.f21274g = r0
            return
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"extractorOutput"})
    /* renamed from: a */
    public final void m11661a() {
            r6 = this;
            boolean r0 = r6.f21281n
            if (r0 != 0) goto L18
            m4.k r0 = r6.f21273f
            m4.w$b r1 = new m4.w$b
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r4 = 0
            r1.<init>(r2, r4)
            r0.mo6044c(r1)
            r0 = 1
            r6.f21281n = r0
        L18:
            return
    }

    @Override // p216m4.InterfaceC4364i
    /* renamed from: b */
    public void mo9803b(long r3, long r5) {
            r2 = this;
            r5 = 0
            r0 = 0
            int r6 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r6 != 0) goto Ld
            r3 = 1
            r2.f21274g = r3
            r2.f21275h = r5
            goto L10
        Ld:
            r3 = 3
            r2.f21274g = r3
        L10:
            r2.f21277j = r5
            return
    }

    @Override // p216m4.InterfaceC4364i
    /* renamed from: c */
    public void mo9804c(p216m4.InterfaceC4366k r1) {
            r0 = this;
            r0.f21273f = r1
            return
    }

    /* renamed from: d */
    public final p371v5.C6571u m11662d(p216m4.InterfaceC4365j r6) {
            r5 = this;
            int r0 = r5.f21279l
            v5.u r1 = r5.f21271d
            byte[] r2 = r1.f25710a
            int r3 = r2.length
            r4 = 0
            if (r0 <= r3) goto L1a
            int r2 = r2.length
            int r2 = r2 * 2
            int r0 = java.lang.Math.max(r2, r0)
            byte[] r0 = new byte[r0]
            r1.f25710a = r0
            r1.f25712c = r4
            r1.f25711b = r4
            goto L1d
        L1a:
            r1.m13396F(r4)
        L1d:
            v5.u r0 = r5.f21271d
            int r1 = r5.f21279l
            r0.m13395E(r1)
            v5.u r0 = r5.f21271d
            byte[] r0 = r0.f25710a
            int r1 = r5.f21279l
            r6.readFully(r0, r4, r1)
            v5.u r6 = r5.f21271d
            return r6
    }

    @Override // p216m4.InterfaceC4364i
    /* renamed from: f */
    public boolean mo9805f(p216m4.InterfaceC4365j r4) {
            r3 = this;
            v5.u r0 = r3.f21268a
            byte[] r0 = r0.f25710a
            r1 = 3
            r2 = 0
            r4.mo9795o(r0, r2, r1)
            v5.u r0 = r3.f21268a
            r0.m13396F(r2)
            v5.u r0 = r3.f21268a
            int r0 = r0.m13420w()
            r1 = 4607062(0x464c56, float:6.455869E-39)
            if (r0 == r1) goto L1a
            return r2
        L1a:
            v5.u r0 = r3.f21268a
            byte[] r0 = r0.f25710a
            r1 = 2
            r4.mo9795o(r0, r2, r1)
            v5.u r0 = r3.f21268a
            r0.m13396F(r2)
            v5.u r0 = r3.f21268a
            int r0 = r0.m13423z()
            r0 = r0 & 250(0xfa, float:3.5E-43)
            if (r0 == 0) goto L32
            return r2
        L32:
            v5.u r0 = r3.f21268a
            byte[] r0 = r0.f25710a
            r1 = 4
            r4.mo9795o(r0, r2, r1)
            v5.u r0 = r3.f21268a
            r0.m13396F(r2)
            v5.u r0 = r3.f21268a
            int r0 = r0.m13403f()
            r4.mo9790h()
            r4.mo9796p(r0)
            v5.u r0 = r3.f21268a
            byte[] r0 = r0.f25710a
            r4.mo9795o(r0, r2, r1)
            v5.u r4 = r3.f21268a
            r4.m13396F(r2)
            v5.u r4 = r3.f21268a
            int r4 = r4.m13403f()
            if (r4 != 0) goto L60
            r2 = 1
        L60:
            return r2
    }

    @Override // p216m4.InterfaceC4364i
    /* renamed from: i */
    public int mo9806i(p216m4.InterfaceC4365j r17, p216m4.C4377v r18) {
            r16 = this;
            r0 = r16
            r1 = r17
            m4.k r2 = r0.f21273f
            p371v5.C6549a.m13292f(r2)
        L9:
            int r2 = r0.f21274g
            r3 = -1
            r4 = 8
            r5 = 9
            r6 = 2
            r7 = 4
            r8 = 0
            r9 = 1
            if (r2 == r9) goto L106
            r10 = 3
            if (r2 == r6) goto Lfb
            if (r2 == r10) goto Lb3
            if (r2 != r7) goto Lad
            boolean r2 = r0.f21275h
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r2 == 0) goto L2c
            long r2 = r0.f21276i
            long r14 = r0.f21280m
            long r2 = r2 + r14
            goto L39
        L2c:
            p4.c r2 = r0.f21272e
            long r2 = r2.f21284b
            int r14 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r14 != 0) goto L37
            r2 = 0
            goto L39
        L37:
            long r2 = r0.f21280m
        L39:
            int r14 = r0.f21278k
            if (r14 != r4) goto L47
            p4.a r4 = r0.f21282o
            if (r4 == 0) goto L47
            r16.m11661a()
            p4.a r4 = r0.f21282o
            goto L52
        L47:
            if (r14 != r5) goto L5b
            p4.e r4 = r0.f21283p
            if (r4 == 0) goto L5b
            r16.m11661a()
            p4.e r4 = r0.f21283p
        L52:
            v5.u r5 = r16.m11662d(r17)
            boolean r2 = r4.m11666a(r5, r2)
            goto L85
        L5b:
            r4 = 18
            if (r14 != r4) goto L87
            boolean r4 = r0.f21281n
            if (r4 != 0) goto L87
            p4.c r4 = r0.f21272e
            v5.u r5 = r16.m11662d(r17)
            boolean r2 = r4.m11666a(r5, r2)
            p4.c r3 = r0.f21272e
            long r4 = r3.f21284b
            int r14 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r14 == 0) goto L85
            m4.k r14 = r0.f21273f
            m4.u r15 = new m4.u
            long[] r10 = r3.f21286d
            long[] r3 = r3.f21285c
            r15.<init>(r10, r3, r4)
            r14.mo6044c(r15)
            r0.f21281n = r9
        L85:
            r3 = 1
            goto L8e
        L87:
            int r2 = r0.f21279l
            r1.mo9791i(r2)
            r2 = 0
            r3 = 0
        L8e:
            boolean r4 = r0.f21275h
            if (r4 != 0) goto La6
            if (r2 == 0) goto La6
            r0.f21275h = r9
            p4.c r2 = r0.f21272e
            long r4 = r2.f21284b
            int r2 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r2 != 0) goto La2
            long r4 = r0.f21280m
            long r10 = -r4
            goto La4
        La2:
            r10 = 0
        La4:
            r0.f21276i = r10
        La6:
            r0.f21277j = r7
            r0.f21274g = r6
            if (r3 == 0) goto L9
            return r8
        Lad:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
        Lb3:
            v5.u r2 = r0.f21270c
            byte[] r2 = r2.f25710a
            r4 = 11
            boolean r2 = r1.mo9788e(r2, r8, r4, r9)
            if (r2 != 0) goto Lc0
            goto Lf8
        Lc0:
            v5.u r2 = r0.f21270c
            r2.m13396F(r8)
            v5.u r2 = r0.f21270c
            int r2 = r2.m13418u()
            r0.f21278k = r2
            v5.u r2 = r0.f21270c
            int r2 = r2.m13420w()
            r0.f21279l = r2
            v5.u r2 = r0.f21270c
            int r2 = r2.m13420w()
            long r4 = (long) r2
            r0.f21280m = r4
            v5.u r2 = r0.f21270c
            int r2 = r2.m13418u()
            int r2 = r2 << 24
            long r4 = (long) r2
            long r11 = r0.f21280m
            long r4 = r4 | r11
            r11 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 * r11
            r0.f21280m = r4
            v5.u r2 = r0.f21270c
            r2.m13397G(r10)
            r0.f21274g = r7
            r8 = 1
        Lf8:
            if (r8 != 0) goto L9
            return r3
        Lfb:
            int r2 = r0.f21277j
            r1.mo9791i(r2)
            r0.f21277j = r8
            r0.f21274g = r10
            goto L9
        L106:
            v5.u r2 = r0.f21269b
            byte[] r2 = r2.f25710a
            boolean r2 = r1.mo9788e(r2, r8, r5, r9)
            if (r2 != 0) goto L111
            goto L165
        L111:
            v5.u r2 = r0.f21269b
            r2.m13396F(r8)
            v5.u r2 = r0.f21269b
            r2.m13397G(r7)
            v5.u r2 = r0.f21269b
            int r2 = r2.m13418u()
            r10 = r2 & 4
            if (r10 == 0) goto L127
            r10 = 1
            goto L128
        L127:
            r10 = 0
        L128:
            r2 = r2 & 1
            if (r2 == 0) goto L12d
            r8 = 1
        L12d:
            if (r10 == 0) goto L140
            p4.a r2 = r0.f21282o
            if (r2 != 0) goto L140
            p4.a r2 = new p4.a
            m4.k r10 = r0.f21273f
            m4.z r4 = r10.mo6048l(r4, r9)
            r2.<init>(r4)
            r0.f21282o = r2
        L140:
            if (r8 == 0) goto L153
            p4.e r2 = r0.f21283p
            if (r2 != 0) goto L153
            p4.e r2 = new p4.e
            m4.k r4 = r0.f21273f
            m4.z r4 = r4.mo6048l(r5, r6)
            r2.<init>(r4)
            r0.f21283p = r2
        L153:
            m4.k r2 = r0.f21273f
            r2.mo6043b()
            v5.u r2 = r0.f21269b
            int r2 = r2.m13403f()
            int r2 = r2 - r5
            int r2 = r2 + r7
            r0.f21277j = r2
            r0.f21274g = r6
            r8 = 1
        L165:
            if (r8 != 0) goto L9
            return r3
    }

    @Override // p216m4.InterfaceC4364i
    public void release() {
            r0 = this;
            return
    }
}
