package p240nj;

/* renamed from: nj.f */
/* loaded from: classes.dex */
public abstract class AbstractC4848f {

    /* renamed from: g */
    public static final p240nj.AbstractC4846d[] f19285g = null;

    /* renamed from: a */
    public p240nj.AbstractC4845c f19286a;

    /* renamed from: b */
    public p240nj.AbstractC4846d f19287b;

    /* renamed from: c */
    public p240nj.AbstractC4846d f19288c;

    /* renamed from: d */
    public p240nj.AbstractC4846d[] f19289d;

    /* renamed from: e */
    public boolean f19290e;

    /* renamed from: f */
    public java.util.Hashtable f19291f;

    /* renamed from: nj.f$a */
    public class a implements p240nj.InterfaceC4855m {

        /* renamed from: a */
        public final /* synthetic */ boolean f19292a;

        /* renamed from: b */
        public final /* synthetic */ boolean f19293b;

        /* renamed from: c */
        public final /* synthetic */ p240nj.AbstractC4848f f19294c;

        public a(p240nj.AbstractC4848f r1, boolean r2, boolean r3) {
                r0 = this;
                r0.f19294c = r1
                r0.f19292a = r2
                r0.f19293b = r3
                r0.<init>()
                return
        }

        @Override // p240nj.InterfaceC4855m
        /* renamed from: a */
        public p240nj.InterfaceC4856n mo10945a(p240nj.InterfaceC4856n r3) {
                r2 = this;
                boolean r0 = r3 instanceof p240nj.C4859q
                if (r0 == 0) goto L7
                nj.q r3 = (p240nj.C4859q) r3
                goto L8
            L7:
                r3 = 0
            L8:
                if (r3 != 0) goto Lf
                nj.q r3 = new nj.q
                r3.<init>()
            Lf:
                boolean r0 = r3.f19313a
                if (r0 == 0) goto L14
                return r3
            L14:
                boolean r0 = r3.f19314b
                r1 = 1
                if (r0 != 0) goto L2a
                boolean r0 = r2.f19292a
                if (r0 != 0) goto L28
                nj.f r0 = r2.f19294c
                boolean r0 = r0.mo10936q()
                if (r0 != 0) goto L28
                r3.f19313a = r1
                return r3
            L28:
                r3.f19314b = r1
            L2a:
                boolean r0 = r2.f19293b
                if (r0 == 0) goto L3f
                boolean r0 = r3.f19315c
                if (r0 != 0) goto L3f
                nj.f r0 = r2.f19294c
                boolean r0 = r0.mo10937r()
                if (r0 != 0) goto L3d
                r3.f19313a = r1
                return r3
            L3d:
                r3.f19315c = r1
            L3f:
                return r3
        }
    }

    /* renamed from: nj.f$b */
    public static abstract class b extends p240nj.AbstractC4848f {
        public b(p240nj.AbstractC4845c r1, p240nj.AbstractC4846d r2, p240nj.AbstractC4846d r3) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                return
        }

        public b(p240nj.AbstractC4845c r1, p240nj.AbstractC4846d r2, p240nj.AbstractC4846d r3, p240nj.AbstractC4846d[] r4) {
                r0 = this;
                r0.<init>(r1, r2, r3, r4)
                return
        }

        @Override // p240nj.AbstractC4848f
        /* renamed from: q */
        public boolean mo10936q() {
                r7 = this;
                nj.c r0 = r7.f19286a
                nj.d r1 = r7.f19287b
                nj.d r2 = r0.f19249b
                nj.d r3 = r0.f19250c
                int r0 = r0.f19253f
                r4 = 6
                r5 = 0
                if (r0 != r4) goto L63
                nj.d[] r0 = r7.f19289d
                r0 = r0[r5]
                boolean r4 = r0.mo10900h()
                boolean r5 = r1.mo10901i()
                if (r5 == 0) goto L31
                nj.d r1 = r7.f19288c
                nj.d r1 = r1.mo10907o()
                if (r4 != 0) goto L2c
                nj.d r0 = r0.mo10907o()
                nj.d r3 = r3.mo10902j(r0)
            L2c:
                boolean r0 = r1.equals(r3)
                return r0
            L31:
                nj.d r5 = r7.f19288c
                nj.d r1 = r1.mo10907o()
                if (r4 == 0) goto L46
                nj.d r0 = p240nj.C4849g.m10952a(r5, r5, r2)
                nj.d r2 = r1.mo10907o()
                nj.d r2 = r2.mo10893a(r3)
                goto L5a
            L46:
                nj.d r4 = r0.mo10907o()
                nj.d r6 = r4.mo10907o()
                nj.d r0 = r5.mo10893a(r0)
                nj.d r0 = r0.mo10904l(r5, r2, r4)
                nj.d r2 = r1.mo10908p(r3, r6)
            L5a:
                nj.d r0 = r0.mo10902j(r1)
                boolean r0 = r0.equals(r2)
                return r0
            L63:
                nj.d r4 = r7.f19288c
                nj.d r6 = r4.mo10893a(r1)
                nj.d r4 = r6.mo10902j(r4)
                if (r0 == 0) goto L99
                r6 = 1
                if (r0 != r6) goto L91
                nj.d[] r0 = r7.f19289d
                r0 = r0[r5]
                boolean r5 = r0.mo10900h()
                if (r5 != 0) goto L99
                nj.d r5 = r0.mo10907o()
                nj.d r5 = r0.mo10902j(r5)
                nj.d r4 = r4.mo10902j(r0)
                nj.d r2 = r2.mo10902j(r0)
                nj.d r3 = r3.mo10902j(r5)
                goto L99
            L91:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "unsupported coordinate system"
                r0.<init>(r1)
                throw r0
            L99:
                nj.d r0 = r1.mo10893a(r2)
                nj.d r1 = r1.mo10907o()
                nj.d r0 = r0.mo10902j(r1)
                nj.d r0 = r0.mo10893a(r3)
                boolean r0 = r4.equals(r0)
                return r0
        }

        @Override // p240nj.AbstractC4848f
        /* renamed from: r */
        public boolean mo10937r() {
                r6 = this;
                nj.c r0 = r6.f19286a
                java.math.BigInteger r0 = r0.f19252e
                java.math.BigInteger r1 = p240nj.InterfaceC4844b.f19245T
                boolean r1 = r1.equals(r0)
                r2 = 0
                r3 = 1
                if (r1 == 0) goto L28
                nj.f r0 = r6.m10934o()
                nj.d r0 = r0.m10923d()
                nj.c r1 = r6.f19286a
                nj.d r1 = r1.f19249b
                nj.d r0 = r0.mo10893a(r1)
                nj.d$a r0 = (p240nj.AbstractC4846d.a) r0
                int r0 = r0.mo10913u()
                if (r0 != 0) goto L27
                r2 = 1
            L27:
                return r2
            L28:
                java.math.BigInteger r1 = p240nj.InterfaceC4844b.f19247V
                boolean r0 = r1.equals(r0)
                if (r0 == 0) goto L83
                nj.f r0 = r6.m10934o()
                nj.d r1 = r0.m10923d()
                nj.c r4 = r6.f19286a
                r5 = r4
                nj.c$b r5 = (p240nj.AbstractC4845c.b) r5
                nj.d r4 = r4.f19249b
                nj.d r4 = r1.mo10893a(r4)
                nj.d r4 = r5.m10891v(r4)
                if (r4 != 0) goto L4a
                return r2
            L4a:
                nj.d r4 = r1.mo10902j(r4)
                boolean r5 = r0.m10931l()
                if (r5 == 0) goto L7b
                nj.d r0 = r0.mo10927h()
                nj.d r0 = r4.mo10893a(r0)
                nj.c r4 = r6.f19286a
                nj.d r4 = r4.f19249b
                nj.d r0 = r0.mo10893a(r4)
                r4 = r0
                nj.d$a r4 = (p240nj.AbstractC4846d.a) r4
                int r4 = r4.mo10913u()
                if (r4 == 0) goto L79
                nj.d r0 = r0.mo10893a(r1)
                nj.d$a r0 = (p240nj.AbstractC4846d.a) r0
                int r0 = r0.mo10913u()
                if (r0 != 0) goto L7a
            L79:
                r2 = 1
            L7a:
                return r2
            L7b:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "point not in normal form"
                r0.<init>(r1)
                throw r0
            L83:
                boolean r0 = super.mo10937r()
                return r0
        }

        @Override // p240nj.AbstractC4848f
        /* renamed from: s */
        public p240nj.AbstractC4848f mo10938s(p240nj.AbstractC4846d r6) {
                r5 = this;
                boolean r0 = r5.m10930k()
                if (r0 == 0) goto L7
                return r5
            L7:
                int r0 = r5.m10925f()
                r1 = 5
                if (r0 == r1) goto L41
                r1 = 6
                if (r0 == r1) goto L16
                nj.f r6 = super.mo10938s(r6)
                return r6
            L16:
                nj.d r0 = r5.f19287b
                nj.d r1 = r5.f19288c
                nj.d[] r2 = r5.f19289d
                r3 = 0
                r2 = r2[r3]
                nj.d r4 = r6.mo10907o()
                nj.d r4 = r0.mo10902j(r4)
                nj.d r0 = r1.mo10893a(r0)
                nj.d r0 = r0.mo10893a(r4)
                nj.d r6 = r2.mo10902j(r6)
                nj.c r1 = r5.f19286a
                r2 = 1
                nj.d[] r2 = new p240nj.AbstractC4846d[r2]
                r2[r3] = r6
                boolean r6 = r5.f19290e
                nj.f r6 = r1.mo10875h(r4, r0, r2, r6)
                return r6
            L41:
                nj.d r0 = r5.f19287b
                nj.d r1 = r5.f19288c
                nj.d r2 = r0.mo10902j(r6)
                nj.d r1 = r1.mo10893a(r0)
                nj.d r6 = r1.mo10896d(r6)
                nj.d r6 = r6.mo10893a(r2)
                nj.c r1 = r5.f19286a
                nj.d[] r2 = r5.f19289d
                boolean r3 = r5.f19290e
                nj.f r6 = r1.mo10875h(r0, r6, r2, r3)
                return r6
        }

        @Override // p240nj.AbstractC4848f
        /* renamed from: t */
        public p240nj.AbstractC4848f mo10939t(p240nj.AbstractC4846d r5) {
                r4 = this;
                boolean r0 = r4.m10930k()
                if (r0 == 0) goto L7
                return r4
            L7:
                int r0 = r4.m10925f()
                r1 = 5
                if (r0 == r1) goto L16
                r1 = 6
                if (r0 == r1) goto L16
                nj.f r5 = super.mo10939t(r5)
                return r5
            L16:
                nj.d r0 = r4.f19287b
                nj.d r1 = r4.f19288c
                nj.d r1 = r1.mo10893a(r0)
                nj.d r5 = r1.mo10902j(r5)
                nj.d r5 = r5.mo10893a(r0)
                nj.c r1 = r4.f19286a
                nj.d[] r2 = r4.f19289d
                boolean r3 = r4.f19290e
                nj.f r5 = r1.mo10875h(r0, r5, r2, r3)
                return r5
        }

        @Override // p240nj.AbstractC4848f
        /* renamed from: u */
        public p240nj.AbstractC4848f mo10940u(p240nj.AbstractC4848f r2) {
                r1 = this;
                boolean r0 = r2.m10930k()
                if (r0 == 0) goto L7
                return r1
            L7:
                nj.f r2 = r2.mo10933n()
                nj.f r2 = r1.mo10920a(r2)
                return r2
        }

        /* renamed from: z */
        public p240nj.AbstractC4848f.b m10946z(int r7) {
                r6 = this;
                boolean r0 = r6.m10930k()
                if (r0 == 0) goto L7
                return r6
            L7:
                nj.c r0 = r6.f19286a
                int r1 = r0.f19253f
                nj.d r2 = r6.f19287b
                if (r1 == 0) goto L41
                r3 = 1
                if (r1 == r3) goto L21
                r4 = 5
                if (r1 == r4) goto L41
                r4 = 6
                if (r1 != r4) goto L19
                goto L21
            L19:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "unsupported coordinate system"
                r7.<init>(r0)
                throw r7
            L21:
                nj.d r1 = r6.f19288c
                nj.d[] r4 = r6.f19289d
                r5 = 0
                r4 = r4[r5]
                nj.d r2 = r2.mo10909q(r7)
                nj.d r1 = r1.mo10909q(r7)
                nj.d[] r3 = new p240nj.AbstractC4846d[r3]
                nj.d r7 = r4.mo10909q(r7)
                r3[r5] = r7
                boolean r7 = r6.f19290e
                nj.f r7 = r0.mo10875h(r2, r1, r3, r7)
            L3e:
                nj.f$b r7 = (p240nj.AbstractC4848f.b) r7
                return r7
            L41:
                nj.d r1 = r6.f19288c
                nj.d r2 = r2.mo10909q(r7)
                nj.d r7 = r1.mo10909q(r7)
                boolean r1 = r6.f19290e
                nj.f r7 = r0.mo10874g(r2, r7, r1)
                goto L3e
        }
    }

    /* renamed from: nj.f$c */
    public static abstract class c extends p240nj.AbstractC4848f {
        public c(p240nj.AbstractC4845c r1, p240nj.AbstractC4846d r2, p240nj.AbstractC4846d r3) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                return
        }

        public c(p240nj.AbstractC4845c r1, p240nj.AbstractC4846d r2, p240nj.AbstractC4846d r3, p240nj.AbstractC4846d[] r4) {
                r0 = this;
                r0.<init>(r1, r2, r3, r4)
                return
        }

        @Override // p240nj.AbstractC4848f
        /* renamed from: e */
        public boolean mo10924e() {
                r2 = this;
                boolean r0 = r2.m10931l()
                if (r0 == 0) goto Ld
                nj.d r0 = r2.f19288c
                boolean r0 = r0.mo10911s()
                return r0
            Ld:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "point not in normal form"
                r0.<init>(r1)
                throw r0
        }

        @Override // p240nj.AbstractC4848f
        /* renamed from: q */
        public boolean mo10936q() {
                r7 = this;
                nj.d r0 = r7.f19287b
                nj.d r1 = r7.f19288c
                nj.c r2 = r7.f19286a
                nj.d r3 = r2.f19249b
                nj.d r2 = r2.f19250c
                nj.d r1 = r1.mo10907o()
                int r4 = r7.m10925f()
                if (r4 == 0) goto L67
                r5 = 1
                r6 = 0
                if (r4 == r5) goto L49
                r5 = 2
                if (r4 == r5) goto L2a
                r5 = 3
                if (r4 == r5) goto L2a
                r5 = 4
                if (r4 != r5) goto L22
                goto L2a
            L22:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "unsupported coordinate system"
                r0.<init>(r1)
                throw r0
            L2a:
                nj.d[] r4 = r7.f19289d
                r4 = r4[r6]
                boolean r5 = r4.mo10900h()
                if (r5 != 0) goto L67
                nj.d r4 = r4.mo10907o()
                nj.d r5 = r4.mo10907o()
                nj.d r4 = r4.mo10902j(r5)
                nj.d r3 = r3.mo10902j(r5)
                nj.d r2 = r2.mo10902j(r4)
                goto L67
            L49:
                nj.d[] r4 = r7.f19289d
                r4 = r4[r6]
                boolean r5 = r4.mo10900h()
                if (r5 != 0) goto L67
                nj.d r5 = r4.mo10907o()
                nj.d r6 = r4.mo10902j(r5)
                nj.d r1 = r1.mo10902j(r4)
                nj.d r3 = r3.mo10902j(r5)
                nj.d r2 = r2.mo10902j(r6)
            L67:
                nj.d r4 = r0.mo10907o()
                nj.d r3 = r4.mo10893a(r3)
                nj.d r0 = r3.mo10902j(r0)
                nj.d r0 = r0.mo10893a(r2)
                boolean r0 = r1.equals(r0)
                return r0
        }

        @Override // p240nj.AbstractC4848f
        /* renamed from: u */
        public p240nj.AbstractC4848f mo10940u(p240nj.AbstractC4848f r2) {
                r1 = this;
                boolean r0 = r2.m10930k()
                if (r0 == 0) goto L7
                return r1
            L7:
                nj.f r2 = r2.mo10933n()
                nj.f r2 = r1.mo10920a(r2)
                return r2
        }
    }

    /* renamed from: nj.f$d */
    public static class d extends p240nj.AbstractC4848f.b {
        public d(p240nj.AbstractC4845c r4, p240nj.AbstractC4846d r5, p240nj.AbstractC4846d r6, boolean r7) {
                r3 = this;
                r3.<init>(r4, r5, r6)
                r0 = 1
                r1 = 0
                if (r5 != 0) goto L9
                r2 = 1
                goto La
            L9:
                r2 = 0
            La:
                if (r6 != 0) goto Ld
                goto Le
            Ld:
                r0 = 0
            Le:
                if (r2 != r0) goto L27
                if (r5 == 0) goto L24
                nj.d r5 = r3.f19287b
                nj.d r6 = r3.f19288c
                p240nj.AbstractC4846d.c.m10914v(r5, r6)
                if (r4 == 0) goto L24
                nj.d r4 = r3.f19287b
                nj.c r5 = r3.f19286a
                nj.d r5 = r5.f19249b
                p240nj.AbstractC4846d.c.m10914v(r4, r5)
            L24:
                r3.f19290e = r7
                return
            L27:
                java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
                java.lang.String r5 = "Exactly one of the field elements is null"
                r4.<init>(r5)
                throw r4
        }

        public d(p240nj.AbstractC4845c r1, p240nj.AbstractC4846d r2, p240nj.AbstractC4846d r3, p240nj.AbstractC4846d[] r4, boolean r5) {
                r0 = this;
                r0.<init>(r1, r2, r3, r4)
                r0.f19290e = r5
                return
        }

        @Override // p240nj.AbstractC4848f
        /* renamed from: a */
        public p240nj.AbstractC4848f mo10920a(p240nj.AbstractC4848f r15) {
                r14 = this;
                boolean r0 = r14.m10930k()
                if (r0 == 0) goto L7
                return r15
            L7:
                boolean r0 = r15.m10930k()
                if (r0 == 0) goto Le
                return r14
            Le:
                nj.c r2 = r14.f19286a
                int r0 = r2.f19253f
                nj.d r1 = r14.f19287b
                nj.d r3 = r15.f19287b
                if (r0 == 0) goto L1bf
                r4 = 1
                r5 = 0
                if (r0 == r4) goto L130
                r6 = 6
                if (r0 != r6) goto L128
                boolean r0 = r1.mo10901i()
                if (r0 == 0) goto L35
                boolean r0 = r3.mo10901i()
                if (r0 == 0) goto L30
                nj.f r15 = r2.mo10881n()
                return r15
            L30:
                nj.f r15 = r15.mo10920a(r14)
                return r15
            L35:
                nj.d r0 = r14.f19288c
                nj.d[] r6 = r14.f19289d
                r6 = r6[r5]
                nj.d r7 = r15.f19288c
                nj.d[] r15 = r15.f19289d
                r15 = r15[r5]
                boolean r8 = r6.mo10900h()
                if (r8 != 0) goto L50
                nj.d r9 = r3.mo10902j(r6)
                nj.d r10 = r7.mo10902j(r6)
                goto L52
            L50:
                r9 = r3
                r10 = r7
            L52:
                boolean r11 = r15.mo10900h()
                if (r11 != 0) goto L61
                nj.d r1 = r1.mo10902j(r15)
                nj.d r12 = r0.mo10902j(r15)
                goto L62
            L61:
                r12 = r0
            L62:
                nj.d r10 = r12.mo10893a(r10)
                nj.d r12 = r1.mo10893a(r9)
                boolean r13 = r12.mo10901i()
                if (r13 == 0) goto L80
                boolean r15 = r10.mo10901i()
                if (r15 == 0) goto L7b
                nj.f r15 = r14.mo10943x()
                return r15
            L7b:
                nj.f r15 = r2.mo10881n()
                return r15
            L80:
                boolean r3 = r3.mo10901i()
                if (r3 == 0) goto Ld5
                nj.f r15 = r14.m10934o()
                nj.d r0 = r15.f19287b
                nj.d r15 = r15.mo10927h()
                nj.d r1 = r15.mo10893a(r7)
                nj.d r1 = r1.mo10896d(r0)
                nj.d r3 = p240nj.C4849g.m10952a(r1, r1, r0)
                nj.d r6 = r2.f19249b
                nj.d r3 = r3.mo10893a(r6)
                boolean r6 = r3.mo10901i()
                if (r6 == 0) goto Lb6
                nj.f$d r15 = new nj.f$d
                nj.d r0 = r2.f19250c
                nj.d r0 = r0.mo10906n()
                boolean r1 = r14.f19290e
                r15.<init>(r2, r3, r0, r1)
                return r15
            Lb6:
                nj.d r0 = r0.mo10893a(r3)
                nj.d r0 = r1.mo10902j(r0)
                nj.d r0 = r0.mo10893a(r3)
                nj.d r15 = r0.mo10893a(r15)
                nj.d r15 = r15.mo10896d(r3)
                nj.d r15 = r15.mo10893a(r3)
                java.math.BigInteger r0 = p240nj.InterfaceC4844b.f19244S
                nj.d r0 = r2.mo10879l(r0)
                goto L118
            Ld5:
                nj.d r3 = r12.mo10907o()
                nj.d r1 = r10.mo10902j(r1)
                nj.d r7 = r10.mo10902j(r9)
                nj.d r1 = r1.mo10902j(r7)
                boolean r9 = r1.mo10901i()
                if (r9 == 0) goto Lf9
                nj.f$d r15 = new nj.f$d
                nj.d r0 = r2.f19250c
                nj.d r0 = r0.mo10906n()
                boolean r3 = r14.f19290e
                r15.<init>(r2, r1, r0, r3)
                return r15
            Lf9:
                nj.d r9 = r10.mo10902j(r3)
                if (r11 != 0) goto L103
                nj.d r9 = r9.mo10902j(r15)
            L103:
                nj.d r15 = r7.mo10893a(r3)
                nj.d r0 = r0.mo10893a(r6)
                nj.d r15 = r15.mo10908p(r9, r0)
                if (r8 != 0) goto L116
                nj.d r0 = r9.mo10902j(r6)
                goto L117
            L116:
                r0 = r9
            L117:
                r3 = r1
            L118:
                nj.f$d r7 = new nj.f$d
                nj.d[] r6 = new p240nj.AbstractC4846d[r4]
                r6[r5] = r0
                boolean r0 = r14.f19290e
                r1 = r7
                r4 = r15
                r5 = r6
                r6 = r0
                r1.<init>(r2, r3, r4, r5, r6)
                return r7
            L128:
                java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
                java.lang.String r0 = "unsupported coordinate system"
                r15.<init>(r0)
                throw r15
            L130:
                nj.d r0 = r14.f19288c
                nj.d[] r6 = r14.f19289d
                r6 = r6[r5]
                nj.d r7 = r15.f19288c
                nj.d[] r15 = r15.f19289d
                r15 = r15[r5]
                boolean r8 = r15.mo10900h()
                nj.d r7 = r6.mo10902j(r7)
                if (r8 == 0) goto L148
                r9 = r0
                goto L14c
            L148:
                nj.d r9 = r0.mo10902j(r15)
            L14c:
                nj.d r7 = r7.mo10893a(r9)
                nj.d r3 = r6.mo10902j(r3)
                if (r8 == 0) goto L158
                r9 = r1
                goto L15c
            L158:
                nj.d r9 = r1.mo10902j(r15)
            L15c:
                nj.d r3 = r3.mo10893a(r9)
                boolean r9 = r3.mo10901i()
                if (r9 == 0) goto L176
                boolean r15 = r7.mo10901i()
                if (r15 == 0) goto L171
                nj.f r15 = r14.mo10943x()
                return r15
            L171:
                nj.f r15 = r2.mo10881n()
                return r15
            L176:
                nj.d r9 = r3.mo10907o()
                nj.d r10 = r9.mo10902j(r3)
                if (r8 == 0) goto L181
                goto L185
            L181:
                nj.d r6 = r6.mo10902j(r15)
            L185:
                nj.d r11 = r7.mo10893a(r3)
                nj.d r12 = r2.f19249b
                nj.d r12 = r11.mo10904l(r7, r9, r12)
                nj.d r12 = r12.mo10902j(r6)
                nj.d r12 = r12.mo10893a(r10)
                nj.d r13 = r3.mo10902j(r12)
                if (r8 == 0) goto L19e
                goto L1a2
            L19e:
                nj.d r9 = r9.mo10902j(r15)
            L1a2:
                nj.d r15 = r7.mo10904l(r1, r3, r0)
                nj.d r15 = r15.mo10904l(r9, r11, r12)
                nj.d r0 = r10.mo10902j(r6)
                nj.f$d r7 = new nj.f$d
                nj.d[] r6 = new p240nj.AbstractC4846d[r4]
                r6[r5] = r0
                boolean r0 = r14.f19290e
                r1 = r7
                r3 = r13
                r4 = r15
                r5 = r6
                r6 = r0
                r1.<init>(r2, r3, r4, r5, r6)
                return r7
            L1bf:
                nj.d r0 = r14.f19288c
                nj.d r15 = r15.f19288c
                nj.d r3 = r1.mo10893a(r3)
                nj.d r15 = r0.mo10893a(r15)
                boolean r4 = r3.mo10901i()
                if (r4 == 0) goto L1e1
                boolean r15 = r15.mo10901i()
                if (r15 == 0) goto L1dc
                nj.f r15 = r14.mo10943x()
                return r15
            L1dc:
                nj.f r15 = r2.mo10881n()
                return r15
            L1e1:
                nj.d r15 = r15.mo10896d(r3)
                nj.d r3 = p240nj.C4849g.m10952a(r15, r15, r3)
                nj.d r4 = r2.f19249b
                nj.d r3 = r3.mo10893a(r4)
                nj.d r1 = r1.mo10893a(r3)
                nj.d r15 = r15.mo10902j(r1)
                nj.d r15 = r15.mo10893a(r3)
                nj.d r15 = r15.mo10893a(r0)
                nj.f$d r0 = new nj.f$d
                boolean r1 = r14.f19290e
                r0.<init>(r2, r3, r15, r1)
                return r0
        }

        @Override // p240nj.AbstractC4848f
        /* renamed from: e */
        public boolean mo10924e() {
                r5 = this;
                nj.d r0 = r5.f19287b
                boolean r1 = r0.mo10901i()
                r2 = 0
                if (r1 == 0) goto La
                return r2
            La:
                nj.d r1 = r5.f19288c
                int r3 = r5.m10925f()
                r4 = 5
                if (r3 == r4) goto L1f
                r4 = 6
                if (r3 == r4) goto L1f
                nj.d r0 = r1.mo10896d(r0)
                boolean r0 = r0.mo10911s()
                return r0
            L1f:
                boolean r1 = r1.mo10911s()
                boolean r0 = r0.mo10911s()
                if (r1 == r0) goto L2a
                r2 = 1
            L2a:
                return r2
        }

        @Override // p240nj.AbstractC4848f
        /* renamed from: h */
        public p240nj.AbstractC4846d mo10927h() {
                r5 = this;
                int r0 = r5.m10925f()
                r1 = 5
                r2 = 6
                if (r0 == r1) goto Ld
                if (r0 == r2) goto Ld
                nj.d r0 = r5.f19288c
                return r0
            Ld:
                nj.d r1 = r5.f19287b
                nj.d r3 = r5.f19288c
                boolean r4 = r5.m10930k()
                if (r4 != 0) goto L38
                boolean r4 = r1.mo10901i()
                if (r4 == 0) goto L1e
                goto L38
            L1e:
                nj.d r3 = r3.mo10893a(r1)
                nj.d r1 = r3.mo10902j(r1)
                if (r2 != r0) goto L37
                nj.d[] r0 = r5.f19289d
                r2 = 0
                r0 = r0[r2]
                boolean r2 = r0.mo10900h()
                if (r2 != 0) goto L37
                nj.d r1 = r1.mo10896d(r0)
            L37:
                return r1
            L38:
                return r3
        }

        @Override // p240nj.AbstractC4848f
        /* renamed from: n */
        public p240nj.AbstractC4848f mo10933n() {
                r9 = this;
                boolean r0 = r9.m10930k()
                if (r0 == 0) goto L7
                return r9
            L7:
                nj.d r3 = r9.f19287b
                boolean r0 = r3.mo10901i()
                if (r0 == 0) goto L10
                return r9
            L10:
                int r0 = r9.m10925f()
                if (r0 == 0) goto L72
                r1 = 1
                r2 = 0
                if (r0 == r1) goto L55
                r4 = 5
                if (r0 == r4) goto L45
                r4 = 6
                if (r0 != r4) goto L3d
                nj.d r0 = r9.f19288c
                nj.d[] r4 = r9.f19289d
                r4 = r4[r2]
                nj.f$d r7 = new nj.f$d
                nj.c r5 = r9.f19286a
                nj.d r0 = r0.mo10893a(r4)
                nj.d[] r6 = new p240nj.AbstractC4846d[r1]
                r6[r2] = r4
                boolean r8 = r9.f19290e
                r1 = r7
                r2 = r5
                r4 = r0
                r5 = r6
                r6 = r8
                r1.<init>(r2, r3, r4, r5, r6)
                return r7
            L3d:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "unsupported coordinate system"
                r0.<init>(r1)
                throw r0
            L45:
                nj.d r0 = r9.f19288c
                nj.f$d r1 = new nj.f$d
                nj.c r2 = r9.f19286a
                nj.d r0 = r0.mo10894b()
                boolean r4 = r9.f19290e
                r1.<init>(r2, r3, r0, r4)
                return r1
            L55:
                nj.d r0 = r9.f19288c
                nj.d[] r4 = r9.f19289d
                r4 = r4[r2]
                nj.f$d r7 = new nj.f$d
                nj.c r5 = r9.f19286a
                nj.d r0 = r0.mo10893a(r3)
                nj.d[] r6 = new p240nj.AbstractC4846d[r1]
                r6[r2] = r4
                boolean r8 = r9.f19290e
                r1 = r7
                r2 = r5
                r4 = r0
                r5 = r6
                r6 = r8
                r1.<init>(r2, r3, r4, r5, r6)
                return r7
            L72:
                nj.d r0 = r9.f19288c
                nj.f$d r1 = new nj.f$d
                nj.c r2 = r9.f19286a
                nj.d r0 = r0.mo10893a(r3)
                boolean r4 = r9.f19290e
                r1.<init>(r2, r3, r0, r4)
                return r1
        }

        @Override // p240nj.AbstractC4848f
        /* renamed from: x */
        public p240nj.AbstractC4848f mo10943x() {
                r17 = this;
                r0 = r17
                boolean r1 = r17.m10930k()
                if (r1 == 0) goto L9
                return r0
            L9:
                nj.c r3 = r0.f19286a
                nj.d r1 = r0.f19287b
                boolean r2 = r1.mo10901i()
                if (r2 == 0) goto L18
                nj.f r1 = r3.mo10881n()
                return r1
            L18:
                int r2 = r3.f19253f
                if (r2 == 0) goto L143
                r4 = 0
                r5 = 1
                if (r2 == r5) goto Lf2
                r6 = 6
                if (r2 != r6) goto Lea
                nj.d r2 = r0.f19288c
                nj.d[] r6 = r0.f19289d
                r4 = r6[r4]
                boolean r6 = r4.mo10900h()
                if (r6 == 0) goto L31
                r7 = r2
                goto L35
            L31:
                nj.d r7 = r2.mo10902j(r4)
            L35:
                if (r6 == 0) goto L39
                r8 = r4
                goto L3d
            L39:
                nj.d r8 = r4.mo10907o()
            L3d:
                nj.d r9 = r3.f19249b
                if (r6 == 0) goto L43
                r10 = r9
                goto L47
            L43:
                nj.d r10 = r9.mo10902j(r8)
            L47:
                nj.d r11 = p240nj.C4849g.m10952a(r2, r7, r10)
                boolean r12 = r11.mo10901i()
                if (r12 == 0) goto L5f
                nj.f$d r1 = new nj.f$d
                nj.d r2 = r3.f19250c
                nj.d r2 = r2.mo10906n()
                boolean r4 = r0.f19290e
                r1.<init>(r3, r11, r2, r4)
                return r1
            L5f:
                nj.d r12 = r11.mo10907o()
                if (r6 == 0) goto L67
                r13 = r11
                goto L6b
            L67:
                nj.d r13 = r11.mo10902j(r8)
            L6b:
                nj.d r14 = r3.f19250c
                int r15 = r14.mo10895c()
                int r16 = r3.mo10880m()
                int r5 = r16 >> 1
                if (r15 >= r5) goto Lc6
                nj.d r1 = r2.mo10893a(r1)
                nj.d r1 = r1.mo10907o()
                boolean r2 = r14.mo10900h()
                if (r2 == 0) goto L90
                nj.d r2 = r10.mo10893a(r8)
                nj.d r2 = r2.mo10907o()
                goto L98
            L90:
                nj.d r2 = r8.mo10907o()
                nj.d r2 = r10.mo10908p(r14, r2)
            L98:
                nj.d r4 = r1.mo10893a(r11)
                nj.d r4 = r4.mo10893a(r8)
                nj.d r1 = r4.mo10902j(r1)
                nj.d r1 = r1.mo10893a(r2)
                nj.d r1 = r1.mo10893a(r12)
                boolean r2 = r9.mo10901i()
                if (r2 == 0) goto Lb3
                goto Ld5
            Lb3:
                boolean r2 = r9.mo10900h()
                if (r2 != 0) goto Ld9
                nj.d r2 = r9.mo10894b()
                nj.d r2 = r2.mo10902j(r13)
                nj.d r1 = r1.mo10893a(r2)
                goto Ld9
            Lc6:
                if (r6 == 0) goto Lc9
                goto Lcd
            Lc9:
                nj.d r1 = r1.mo10902j(r4)
            Lcd:
                nj.d r1 = r1.mo10908p(r11, r7)
                nj.d r1 = r1.mo10893a(r12)
            Ld5:
                nj.d r1 = r1.mo10893a(r13)
            Ld9:
                r5 = r1
                nj.f$d r1 = new nj.f$d
                r2 = 1
                nj.d[] r6 = new p240nj.AbstractC4846d[r2]
                r2 = 0
                r6[r2] = r13
                boolean r7 = r0.f19290e
                r2 = r1
                r4 = r12
                r2.<init>(r3, r4, r5, r6, r7)
                return r1
            Lea:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "unsupported coordinate system"
                r1.<init>(r2)
                throw r1
            Lf2:
                nj.d r2 = r0.f19288c
                nj.d[] r4 = r0.f19289d
                r5 = 0
                r4 = r4[r5]
                boolean r5 = r4.mo10900h()
                if (r5 == 0) goto L101
                r6 = r1
                goto L105
            L101:
                nj.d r6 = r1.mo10902j(r4)
            L105:
                if (r5 == 0) goto L108
                goto L10c
            L108:
                nj.d r2 = r2.mo10902j(r4)
            L10c:
                nj.d r1 = r1.mo10907o()
                nj.d r2 = r1.mo10893a(r2)
                nj.d r4 = r6.mo10907o()
                nj.d r5 = r2.mo10893a(r6)
                nj.d r7 = r3.f19249b
                nj.d r2 = r5.mo10904l(r2, r4, r7)
                nj.d r7 = r6.mo10902j(r2)
                nj.d r1 = r1.mo10907o()
                nj.d r5 = r1.mo10904l(r6, r2, r5)
                nj.d r1 = r6.mo10902j(r4)
                nj.f$d r8 = new nj.f$d
                r2 = 1
                nj.d[] r6 = new p240nj.AbstractC4846d[r2]
                r2 = 0
                r6[r2] = r1
                boolean r1 = r0.f19290e
                r2 = r8
                r4 = r7
                r7 = r1
                r2.<init>(r3, r4, r5, r6, r7)
                return r8
            L143:
                nj.d r2 = r0.f19288c
                nj.d r2 = r2.mo10896d(r1)
                nj.d r2 = r2.mo10893a(r1)
                nj.d r4 = r2.mo10907o()
                nj.d r4 = r4.mo10893a(r2)
                nj.d r5 = r3.f19249b
                nj.d r4 = r4.mo10893a(r5)
                nj.d r2 = r2.mo10894b()
                nj.d r1 = r1.mo10908p(r4, r2)
                nj.f$d r2 = new nj.f$d
                boolean r5 = r0.f19290e
                r2.<init>(r3, r4, r1, r5)
                return r2
        }

        @Override // p240nj.AbstractC4848f
        /* renamed from: y */
        public p240nj.AbstractC4848f mo10944y(p240nj.AbstractC4848f r10) {
                r9 = this;
                boolean r0 = r9.m10930k()
                if (r0 == 0) goto L7
                return r10
            L7:
                boolean r0 = r10.m10930k()
                if (r0 == 0) goto L12
                nj.f r10 = r9.mo10943x()
                return r10
            L12:
                nj.c r1 = r9.f19286a
                nj.d r0 = r9.f19287b
                boolean r2 = r0.mo10901i()
                if (r2 == 0) goto L1d
                return r10
            L1d:
                int r2 = r1.f19253f
                r3 = 6
                if (r2 == r3) goto L2b
                nj.f r0 = r9.mo10943x()
                nj.f r10 = r0.mo10920a(r10)
                return r10
            L2b:
                nj.d r2 = r10.f19287b
                nj.d[] r3 = r10.f19289d
                r4 = 0
                r3 = r3[r4]
                boolean r5 = r2.mo10901i()
                if (r5 != 0) goto Lde
                boolean r3 = r3.mo10900h()
                if (r3 != 0) goto L40
                goto Lde
            L40:
                nj.d r3 = r9.f19288c
                nj.d[] r5 = r9.f19289d
                r5 = r5[r4]
                nj.d r6 = r10.f19288c
                nj.d r0 = r0.mo10907o()
                nj.d r7 = r3.mo10907o()
                nj.d r8 = r5.mo10907o()
                nj.d r3 = r3.mo10902j(r5)
                nj.d r5 = r1.f19249b
                nj.d r5 = r5.mo10902j(r8)
                nj.d r5 = r5.mo10893a(r7)
                nj.d r3 = r5.mo10893a(r3)
                nj.d r5 = r6.mo10894b()
                nj.d r6 = r1.f19249b
                nj.d r6 = r6.mo10893a(r5)
                nj.d r6 = r6.mo10902j(r8)
                nj.d r6 = r6.mo10893a(r7)
                nj.d r0 = r6.mo10904l(r3, r0, r8)
                nj.d r2 = r2.mo10902j(r8)
                nj.d r6 = r2.mo10893a(r3)
                nj.d r6 = r6.mo10907o()
                boolean r7 = r6.mo10901i()
                if (r7 == 0) goto L9e
                boolean r0 = r0.mo10901i()
                if (r0 == 0) goto L99
                nj.f r10 = r10.mo10943x()
                return r10
            L99:
                nj.f r10 = r1.mo10881n()
                return r10
            L9e:
                boolean r10 = r0.mo10901i()
                if (r10 == 0) goto Lb2
                nj.f$d r10 = new nj.f$d
                nj.d r2 = r1.f19250c
                nj.d r2 = r2.mo10906n()
                boolean r3 = r9.f19290e
                r10.<init>(r1, r0, r2, r3)
                return r10
            Lb2:
                nj.d r10 = r0.mo10907o()
                nj.d r2 = r10.mo10902j(r2)
                nj.d r10 = r0.mo10902j(r6)
                nj.d r10 = r10.mo10902j(r8)
                nj.d r0 = r0.mo10893a(r6)
                nj.d r0 = r0.mo10907o()
                nj.d r3 = r0.mo10904l(r3, r5, r10)
                nj.f$d r6 = new nj.f$d
                r0 = 1
                nj.d[] r5 = new p240nj.AbstractC4846d[r0]
                r5[r4] = r10
                boolean r10 = r9.f19290e
                r0 = r6
                r4 = r5
                r5 = r10
                r0.<init>(r1, r2, r3, r4, r5)
                return r6
            Lde:
                nj.f r0 = r9.mo10943x()
                nj.f r10 = r0.mo10920a(r10)
                return r10
        }
    }

    /* renamed from: nj.f$e */
    public static class e extends p240nj.AbstractC4848f.c {
        public e(p240nj.AbstractC4845c r2, p240nj.AbstractC4846d r3, p240nj.AbstractC4846d r4, boolean r5) {
                r1 = this;
                r1.<init>(r2, r3, r4)
                r2 = 0
                r0 = 1
                if (r3 != 0) goto L9
                r3 = 1
                goto La
            L9:
                r3 = 0
            La:
                if (r4 != 0) goto Ld
                r2 = 1
            Ld:
                if (r3 != r2) goto L12
                r1.f19290e = r5
                return
            L12:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r3 = "Exactly one of the field elements is null"
                r2.<init>(r3)
                throw r2
        }

        public e(p240nj.AbstractC4845c r1, p240nj.AbstractC4846d r2, p240nj.AbstractC4846d r3, p240nj.AbstractC4846d[] r4, boolean r5) {
                r0 = this;
                r0.<init>(r1, r2, r3, r4)
                r0.f19290e = r5
                return
        }

        /* renamed from: A */
        public p240nj.AbstractC4846d m10947A(p240nj.AbstractC4846d r1) {
                r0 = this;
                nj.d r1 = r1.mo10893a(r1)
                nj.d r1 = r1.mo10893a(r1)
                return r1
        }

        /* renamed from: B */
        public p240nj.AbstractC4846d m10948B() {
                r4 = this;
                nj.d[] r0 = r4.f19289d
                r1 = 1
                r2 = r0[r1]
                if (r2 != 0) goto L11
                r2 = 0
                r2 = r0[r2]
                r3 = 0
                nj.d r2 = r4.m10951z(r2, r3)
                r0[r1] = r2
            L11:
                return r2
        }

        /* renamed from: C */
        public p240nj.AbstractC4846d m10949C(p240nj.AbstractC4846d r2) {
                r1 = this;
                nj.d r0 = r2.mo10893a(r2)
                nj.d r2 = r0.mo10893a(r2)
                return r2
        }

        /* renamed from: D */
        public p240nj.AbstractC4848f.e m10950D(boolean r17) {
                r16 = this;
                r0 = r16
                nj.d r1 = r0.f19287b
                nj.d r2 = r0.f19288c
                nj.d[] r3 = r0.f19289d
                r4 = 0
                r3 = r3[r4]
                nj.d r5 = r16.m10948B()
                nj.d r6 = r1.mo10907o()
                nj.d r6 = r0.m10949C(r6)
                nj.d r6 = r6.mo10893a(r5)
                nj.d r7 = r2.mo10893a(r2)
                nj.d r2 = r7.mo10902j(r2)
                nj.d r1 = r1.mo10902j(r2)
                nj.d r1 = r1.mo10893a(r1)
                nj.d r8 = r6.mo10907o()
                nj.d r9 = r1.mo10893a(r1)
                nj.d r12 = r8.mo10910r(r9)
                nj.d r2 = r2.mo10907o()
                nj.d r2 = r2.mo10893a(r2)
                nj.d r1 = r1.mo10910r(r12)
                nj.d r1 = r6.mo10902j(r1)
                nj.d r13 = r1.mo10910r(r2)
                if (r17 == 0) goto L56
                nj.d r1 = r2.mo10902j(r5)
                nj.d r1 = r1.mo10893a(r1)
                goto L57
            L56:
                r1 = 0
            L57:
                boolean r2 = r3.mo10900h()
                if (r2 == 0) goto L5e
                goto L62
            L5e:
                nj.d r7 = r7.mo10902j(r3)
            L62:
                nj.f$e r2 = new nj.f$e
                nj.c r11 = r0.f19286a
                r3 = 2
                nj.d[] r14 = new p240nj.AbstractC4846d[r3]
                r14[r4] = r7
                r3 = 1
                r14[r3] = r1
                boolean r15 = r0.f19290e
                r10 = r2
                r10.<init>(r11, r12, r13, r14, r15)
                return r2
        }

        @Override // p240nj.AbstractC4848f
        /* renamed from: a */
        public p240nj.AbstractC4848f mo10920a(p240nj.AbstractC4848f r17) {
                r16 = this;
                r0 = r16
                r1 = r17
                boolean r2 = r16.m10930k()
                if (r2 == 0) goto Lb
                return r1
            Lb:
                boolean r2 = r17.m10930k()
                if (r2 == 0) goto L12
                return r0
            L12:
                if (r0 != r1) goto L19
                nj.f r1 = r16.mo10943x()
                return r1
            L19:
                nj.c r3 = r0.f19286a
                int r2 = r3.f19253f
                nj.d r4 = r0.f19287b
                nj.d r5 = r0.f19288c
                nj.d r6 = r1.f19287b
                nj.d r7 = r1.f19288c
                if (r2 == 0) goto L1d9
                r8 = 1
                r9 = 0
                if (r2 == r8) goto L141
                r10 = 4
                r11 = 2
                if (r2 == r11) goto L3a
                if (r2 != r10) goto L32
                goto L3a
            L32:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "unsupported coordinate system"
                r1.<init>(r2)
                throw r1
            L3a:
                nj.d[] r12 = r0.f19289d
                r12 = r12[r9]
                nj.d[] r1 = r1.f19289d
                r1 = r1[r9]
                boolean r13 = r12.mo10900h()
                if (r13 != 0) goto La1
                boolean r15 = r12.equals(r1)
                if (r15 == 0) goto La1
                nj.d r1 = r4.mo10910r(r6)
                nj.d r7 = r5.mo10910r(r7)
                boolean r13 = r1.mo10901i()
                if (r13 == 0) goto L6c
                boolean r1 = r7.mo10901i()
                if (r1 == 0) goto L67
                nj.f r1 = r16.mo10943x()
                return r1
            L67:
                nj.f r1 = r3.mo10881n()
                return r1
            L6c:
                nj.d r13 = r1.mo10907o()
                nj.d r4 = r4.mo10902j(r13)
                nj.d r6 = r6.mo10902j(r13)
                nj.d r13 = r4.mo10910r(r6)
                nj.d r5 = r13.mo10902j(r5)
                nj.d r13 = r7.mo10907o()
                nj.d r13 = r13.mo10910r(r4)
                nj.d r6 = r13.mo10910r(r6)
                nj.d r4 = r4.mo10910r(r6)
                nj.d r4 = r4.mo10902j(r7)
                nj.d r4 = r4.mo10910r(r5)
                nj.d r1 = r1.mo10902j(r12)
                r5 = r4
                r4 = r6
            L9e:
                r14 = 0
                goto L121
            La1:
                if (r13 == 0) goto La4
                goto Lb4
            La4:
                nj.d r15 = r12.mo10907o()
                nj.d r6 = r15.mo10902j(r6)
                nj.d r15 = r15.mo10902j(r12)
                nj.d r7 = r15.mo10902j(r7)
            Lb4:
                boolean r15 = r1.mo10900h()
                if (r15 == 0) goto Lbb
                goto Lcb
            Lbb:
                nj.d r14 = r1.mo10907o()
                nj.d r4 = r14.mo10902j(r4)
                nj.d r14 = r14.mo10902j(r1)
                nj.d r5 = r14.mo10902j(r5)
            Lcb:
                nj.d r6 = r4.mo10910r(r6)
                nj.d r7 = r5.mo10910r(r7)
                boolean r14 = r6.mo10901i()
                if (r14 == 0) goto Le9
                boolean r1 = r7.mo10901i()
                if (r1 == 0) goto Le4
                nj.f r1 = r16.mo10943x()
                return r1
            Le4:
                nj.f r1 = r3.mo10881n()
                return r1
            Le9:
                nj.d r14 = r6.mo10907o()
                nj.d r8 = r14.mo10902j(r6)
                nj.d r4 = r14.mo10902j(r4)
                nj.d r9 = r7.mo10907o()
                nj.d r9 = r9.mo10893a(r8)
                nj.d r11 = r4.mo10893a(r4)
                nj.d r9 = r9.mo10910r(r11)
                nj.d r4 = r4.mo10910r(r9)
                nj.d r4 = r4.mo10903k(r7, r8, r5)
                if (r13 != 0) goto L114
                nj.d r5 = r6.mo10902j(r12)
                goto L115
            L114:
                r5 = r6
            L115:
                if (r15 != 0) goto L11c
                nj.d r1 = r5.mo10902j(r1)
                goto L11d
            L11c:
                r1 = r5
            L11d:
                r5 = r4
                r4 = r9
                if (r1 != r6) goto L9e
            L121:
                if (r2 != r10) goto L131
                nj.d r2 = r0.m10951z(r1, r14)
                r6 = 2
                nj.d[] r6 = new p240nj.AbstractC4846d[r6]
                r7 = 0
                r6[r7] = r1
                r8 = 1
                r6[r8] = r2
                goto L138
            L131:
                r7 = 0
                r8 = 1
                nj.d[] r2 = new p240nj.AbstractC4846d[r8]
                r2[r7] = r1
                r6 = r2
            L138:
                nj.f$e r1 = new nj.f$e
                boolean r7 = r0.f19290e
                r2 = r1
                r2.<init>(r3, r4, r5, r6, r7)
                return r1
            L141:
                nj.d[] r2 = r0.f19289d
                r8 = 0
                r2 = r2[r8]
                nj.d[] r1 = r1.f19289d
                r1 = r1[r8]
                boolean r8 = r2.mo10900h()
                boolean r9 = r1.mo10900h()
                if (r8 == 0) goto L155
                goto L159
            L155:
                nj.d r7 = r7.mo10902j(r2)
            L159:
                if (r9 == 0) goto L15c
                goto L160
            L15c:
                nj.d r5 = r5.mo10902j(r1)
            L160:
                nj.d r7 = r7.mo10910r(r5)
                if (r8 == 0) goto L167
                goto L16b
            L167:
                nj.d r6 = r6.mo10902j(r2)
            L16b:
                if (r9 == 0) goto L16e
                goto L172
            L16e:
                nj.d r4 = r4.mo10902j(r1)
            L172:
                nj.d r6 = r6.mo10910r(r4)
                boolean r10 = r6.mo10901i()
                if (r10 == 0) goto L18c
                boolean r1 = r7.mo10901i()
                if (r1 == 0) goto L187
                nj.f r1 = r16.mo10943x()
                return r1
            L187:
                nj.f r1 = r3.mo10881n()
                return r1
            L18c:
                if (r8 == 0) goto L190
                r2 = r1
                goto L197
            L190:
                if (r9 == 0) goto L193
                goto L197
            L193:
                nj.d r2 = r2.mo10902j(r1)
            L197:
                nj.d r1 = r6.mo10907o()
                nj.d r8 = r1.mo10902j(r6)
                nj.d r1 = r1.mo10902j(r4)
                nj.d r4 = r7.mo10907o()
                nj.d r4 = r4.mo10902j(r2)
                nj.d r4 = r4.mo10910r(r8)
                nj.d r9 = r1.mo10893a(r1)
                nj.d r4 = r4.mo10910r(r9)
                nj.d r6 = r6.mo10902j(r4)
                nj.d r1 = r1.mo10910r(r4)
                nj.d r5 = r1.mo10903k(r7, r5, r8)
                nj.d r1 = r8.mo10902j(r2)
                nj.f$e r8 = new nj.f$e
                r2 = 1
                nj.d[] r7 = new p240nj.AbstractC4846d[r2]
                r2 = 0
                r7[r2] = r1
                boolean r1 = r0.f19290e
                r2 = r8
                r4 = r6
                r6 = r7
                r7 = r1
                r2.<init>(r3, r4, r5, r6, r7)
                return r8
            L1d9:
                nj.d r1 = r6.mo10910r(r4)
                nj.d r2 = r7.mo10910r(r5)
                boolean r7 = r1.mo10901i()
                if (r7 == 0) goto L1f7
                boolean r1 = r2.mo10901i()
                if (r1 == 0) goto L1f2
                nj.f r1 = r16.mo10943x()
                return r1
            L1f2:
                nj.f r1 = r3.mo10881n()
                return r1
            L1f7:
                nj.d r1 = r2.mo10896d(r1)
                nj.d r2 = r1.mo10907o()
                nj.d r2 = r2.mo10910r(r4)
                nj.d r2 = r2.mo10910r(r6)
                nj.d r4 = r4.mo10910r(r2)
                nj.d r1 = r1.mo10902j(r4)
                nj.d r1 = r1.mo10910r(r5)
                nj.f$e r4 = new nj.f$e
                boolean r5 = r0.f19290e
                r4.<init>(r3, r2, r1, r5)
                return r4
        }

        @Override // p240nj.AbstractC4848f
        /* renamed from: i */
        public p240nj.AbstractC4846d mo10928i(int r3) {
                r2 = this;
                r0 = 1
                if (r3 != r0) goto Lf
                r0 = 4
                int r1 = r2.m10925f()
                if (r0 != r1) goto Lf
                nj.d r3 = r2.m10948B()
                return r3
            Lf:
                nj.d r3 = super.mo10928i(r3)
                return r3
        }

        @Override // p240nj.AbstractC4848f
        /* renamed from: n */
        public p240nj.AbstractC4848f mo10933n() {
                r7 = this;
                boolean r0 = r7.m10930k()
                if (r0 == 0) goto L7
                return r7
            L7:
                nj.c r2 = r7.f19286a
                int r0 = r2.f19253f
                if (r0 == 0) goto L20
                nj.f$e r0 = new nj.f$e
                nj.d r3 = r7.f19287b
                nj.d r1 = r7.f19288c
                nj.d r4 = r1.mo10905m()
                nj.d[] r5 = r7.f19289d
                boolean r6 = r7.f19290e
                r1 = r0
                r1.<init>(r2, r3, r4, r5, r6)
                return r0
            L20:
                nj.f$e r0 = new nj.f$e
                nj.d r1 = r7.f19287b
                nj.d r3 = r7.f19288c
                nj.d r3 = r3.mo10905m()
                boolean r4 = r7.f19290e
                r0.<init>(r2, r1, r3, r4)
                return r0
        }

        @Override // p240nj.AbstractC4848f
        /* renamed from: v */
        public p240nj.AbstractC4848f mo10941v() {
                r8 = this;
                boolean r0 = r8.m10930k()
                if (r0 == 0) goto L7
                return r8
            L7:
                nj.d r0 = r8.f19288c
                boolean r1 = r0.mo10901i()
                if (r1 == 0) goto L10
                return r8
            L10:
                nj.c r1 = r8.f19286a
                int r2 = r1.f19253f
                if (r2 == 0) goto L2c
                r0 = 4
                if (r2 == r0) goto L22
                nj.f r0 = r8.mo10943x()
                nj.f r0 = r0.mo10920a(r8)
                return r0
            L22:
                r0 = 0
                nj.f$e r0 = r8.m10950D(r0)
                nj.f r0 = r0.mo10920a(r8)
                return r0
            L2c:
                nj.d r2 = r8.f19287b
                nj.d r3 = r0.mo10893a(r0)
                nj.d r4 = r3.mo10907o()
                nj.d r5 = r2.mo10907o()
                nj.d r5 = r8.m10949C(r5)
                nj.c r6 = r8.f19286a
                nj.d r6 = r6.f19249b
                nj.d r5 = r5.mo10893a(r6)
                nj.d r6 = r5.mo10907o()
                nj.d r7 = r8.m10949C(r2)
                nj.d r7 = r7.mo10902j(r4)
                nj.d r6 = r7.mo10910r(r6)
                boolean r7 = r6.mo10901i()
                if (r7 == 0) goto L63
                nj.c r0 = r8.f19286a
                nj.f r0 = r0.mo10881n()
                return r0
            L63:
                nj.d r3 = r6.mo10902j(r3)
                nj.d r3 = r3.mo10899g()
                nj.d r6 = r6.mo10902j(r3)
                nj.d r5 = r6.mo10902j(r5)
                nj.d r4 = r4.mo10907o()
                nj.d r3 = r4.mo10902j(r3)
                nj.d r3 = r3.mo10910r(r5)
                nj.d r4 = r3.mo10910r(r5)
                nj.d r5 = r5.mo10893a(r3)
                nj.d r4 = r4.mo10902j(r5)
                nj.d r4 = r4.mo10893a(r2)
                nj.d r2 = r2.mo10910r(r4)
                nj.d r2 = r2.mo10902j(r3)
                nj.d r0 = r2.mo10910r(r0)
                nj.f$e r2 = new nj.f$e
                boolean r3 = r8.f19290e
                r2.<init>(r1, r4, r0, r3)
                return r2
        }

        @Override // p240nj.AbstractC4848f
        /* renamed from: w */
        public p240nj.AbstractC4848f mo10942w(int r19) {
                r18 = this;
                r0 = r18
                r1 = r19
                if (r1 < 0) goto L148
                if (r1 == 0) goto L147
                boolean r2 = r18.m10930k()
                if (r2 == 0) goto L10
                goto L147
            L10:
                r2 = 1
                if (r1 != r2) goto L18
                nj.f r1 = r18.mo10943x()
                return r1
            L18:
                nj.c r3 = r0.f19286a
                nj.d r4 = r0.f19288c
                boolean r5 = r4.mo10901i()
                if (r5 == 0) goto L27
                nj.f r1 = r3.mo10881n()
                return r1
            L27:
                int r5 = r3.f19253f
                nj.d r6 = r3.f19249b
                nj.d r7 = r0.f19287b
                nj.d[] r8 = r0.f19289d
                int r9 = r8.length
                r10 = 0
                if (r9 >= r2) goto L3a
                java.math.BigInteger r8 = p240nj.InterfaceC4844b.f19244S
                nj.d r8 = r3.mo10879l(r8)
                goto L3c
            L3a:
                r8 = r8[r10]
            L3c:
                boolean r9 = r8.mo10900h()
                java.lang.String r11 = "unsupported coordinate system"
                r12 = 4
                r13 = 2
                if (r9 != 0) goto L6b
                if (r5 == 0) goto L6b
                if (r5 == r2) goto L5b
                if (r5 == r13) goto L59
                if (r5 != r12) goto L53
                nj.d r6 = r18.m10948B()
                goto L6b
            L53:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                r1.<init>(r11)
                throw r1
            L59:
                r6 = 0
                goto L67
            L5b:
                nj.d r6 = r8.mo10907o()
                nj.d r7 = r7.mo10902j(r8)
                nj.d r4 = r4.mo10902j(r6)
            L67:
                nj.d r6 = r0.m10951z(r8, r6)
            L6b:
                r9 = 0
                r17 = r6
                r6 = r4
                r4 = r7
                r7 = r17
            L72:
                if (r9 >= r1) goto Ldc
                boolean r14 = r6.mo10901i()
                if (r14 == 0) goto L7f
                nj.f r1 = r3.mo10881n()
                return r1
            L7f:
                nj.d r14 = r4.mo10907o()
                nj.d r14 = r0.m10949C(r14)
                nj.d r15 = r6.mo10893a(r6)
                nj.d r6 = r15.mo10902j(r6)
                nj.d r4 = r4.mo10902j(r6)
                nj.d r4 = r4.mo10893a(r4)
                nj.d r6 = r6.mo10907o()
                nj.d r6 = r6.mo10893a(r6)
                boolean r16 = r7.mo10901i()
                if (r16 != 0) goto Lb1
                nj.d r14 = r14.mo10893a(r7)
                nj.d r7 = r6.mo10902j(r7)
                nj.d r7 = r7.mo10893a(r7)
            Lb1:
                nj.d r10 = r14.mo10907o()
                nj.d r12 = r4.mo10893a(r4)
                nj.d r10 = r10.mo10910r(r12)
                nj.d r4 = r4.mo10910r(r10)
                nj.d r4 = r14.mo10902j(r4)
                nj.d r6 = r4.mo10910r(r6)
                boolean r4 = r8.mo10900h()
                if (r4 == 0) goto Ld1
                r8 = r15
                goto Ld6
            Ld1:
                nj.d r4 = r15.mo10902j(r8)
                r8 = r4
            Ld6:
                int r9 = r9 + 1
                r4 = r10
                r10 = 0
                r12 = 4
                goto L72
            Ldc:
                if (r5 == 0) goto L12b
                if (r5 == r2) goto L10e
                if (r5 == r13) goto Lfd
                r1 = 4
                if (r5 != r1) goto Lf7
                nj.f$e r1 = new nj.f$e
                nj.d[] r9 = new p240nj.AbstractC4846d[r13]
                r5 = 0
                r9[r5] = r8
                r9[r2] = r7
                boolean r7 = r0.f19290e
                r2 = r1
                r5 = r6
                r6 = r9
                r2.<init>(r3, r4, r5, r6, r7)
                return r1
            Lf7:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                r1.<init>(r11)
                throw r1
            Lfd:
                nj.f$e r1 = new nj.f$e
                nj.d[] r7 = new p240nj.AbstractC4846d[r2]
                r2 = 0
                r7[r2] = r8
                boolean r8 = r0.f19290e
                r2 = r1
                r5 = r6
                r6 = r7
                r7 = r8
                r2.<init>(r3, r4, r5, r6, r7)
                return r1
            L10e:
                nj.d r4 = r4.mo10902j(r8)
                nj.d r1 = r8.mo10907o()
                nj.d r1 = r8.mo10902j(r1)
                nj.f$e r8 = new nj.f$e
                nj.d[] r7 = new p240nj.AbstractC4846d[r2]
                r2 = 0
                r7[r2] = r1
                boolean r1 = r0.f19290e
                r2 = r8
                r5 = r6
                r6 = r7
                r7 = r1
                r2.<init>(r3, r4, r5, r6, r7)
                return r8
            L12b:
                nj.d r1 = r8.mo10899g()
                nj.d r2 = r1.mo10907o()
                nj.d r1 = r2.mo10902j(r1)
                nj.f$e r5 = new nj.f$e
                nj.d r2 = r4.mo10902j(r2)
                nj.d r1 = r6.mo10902j(r1)
                boolean r4 = r0.f19290e
                r5.<init>(r3, r2, r1, r4)
                return r5
            L147:
                return r0
            L148:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r2 = "'e' cannot be negative"
                r1.<init>(r2)
                throw r1
        }

        @Override // p240nj.AbstractC4848f
        /* renamed from: x */
        public p240nj.AbstractC4848f mo10943x() {
                r15 = this;
                boolean r0 = r15.m10930k()
                if (r0 == 0) goto L7
                return r15
            L7:
                nj.c r2 = r15.f19286a
                nj.d r0 = r15.f19288c
                boolean r1 = r0.mo10901i()
                if (r1 == 0) goto L16
                nj.f r0 = r2.mo10881n()
                return r0
            L16:
                int r1 = r2.f19253f
                nj.d r3 = r15.f19287b
                if (r1 == 0) goto L17c
                r4 = 0
                r5 = 1
                if (r1 == r5) goto Led
                r6 = 2
                if (r1 == r6) goto L33
                r0 = 4
                if (r1 != r0) goto L2b
                nj.f$e r0 = r15.m10950D(r5)
                return r0
            L2b:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "unsupported coordinate system"
                r0.<init>(r1)
                throw r0
            L33:
                nj.d[] r1 = r15.f19289d
                r1 = r1[r4]
                boolean r6 = r1.mo10900h()
                nj.d r7 = r0.mo10907o()
                nj.d r8 = r7.mo10907o()
                nj.d r9 = r2.f19249b
                nj.d r10 = r9.mo10905m()
                java.math.BigInteger r11 = r10.mo10912t()
                r12 = 3
                java.math.BigInteger r12 = java.math.BigInteger.valueOf(r12)
                boolean r11 = r11.equals(r12)
                if (r11 == 0) goto L76
                if (r6 == 0) goto L5d
                r9 = r1
                goto L61
            L5d:
                nj.d r9 = r1.mo10907o()
            L61:
                nj.d r10 = r3.mo10893a(r9)
                nj.d r9 = r3.mo10910r(r9)
                nj.d r9 = r10.mo10902j(r9)
                nj.d r9 = r15.m10949C(r9)
                nj.d r3 = r7.mo10902j(r3)
                goto Lb0
            L76:
                nj.d r11 = r3.mo10907o()
                nj.d r11 = r15.m10949C(r11)
                if (r6 == 0) goto L85
            L80:
                nj.d r9 = r11.mo10893a(r9)
                goto Lac
            L85:
                boolean r12 = r9.mo10901i()
                if (r12 != 0) goto Lab
                nj.d r12 = r1.mo10907o()
                nj.d r12 = r12.mo10907o()
                int r13 = r10.mo10895c()
                int r14 = r9.mo10895c()
                if (r13 >= r14) goto La6
                nj.d r9 = r12.mo10902j(r10)
                nj.d r9 = r11.mo10910r(r9)
                goto Lac
            La6:
                nj.d r9 = r12.mo10902j(r9)
                goto L80
            Lab:
                r9 = r11
            Lac:
                nj.d r3 = r3.mo10902j(r7)
            Lb0:
                nj.d r3 = r15.m10947A(r3)
                nj.d r7 = r9.mo10907o()
                nj.d r10 = r3.mo10893a(r3)
                nj.d r7 = r7.mo10910r(r10)
                nj.d r3 = r3.mo10910r(r7)
                nj.d r3 = r3.mo10902j(r9)
                nj.d r8 = r8.mo10893a(r8)
                nj.d r8 = r15.m10947A(r8)
                nj.d r8 = r3.mo10910r(r8)
                nj.d r0 = r0.mo10893a(r0)
                if (r6 != 0) goto Lde
                nj.d r0 = r0.mo10902j(r1)
            Lde:
                nj.f$e r9 = new nj.f$e
                nj.d[] r5 = new p240nj.AbstractC4846d[r5]
                r5[r4] = r0
                boolean r6 = r15.f19290e
                r1 = r9
                r3 = r7
                r4 = r8
                r1.<init>(r2, r3, r4, r5, r6)
                return r9
            Led:
                nj.d[] r1 = r15.f19289d
                r1 = r1[r4]
                boolean r6 = r1.mo10900h()
                nj.d r7 = r2.f19249b
                boolean r8 = r7.mo10901i()
                if (r8 != 0) goto L107
                if (r6 != 0) goto L107
                nj.d r8 = r1.mo10907o()
                nj.d r7 = r7.mo10902j(r8)
            L107:
                nj.d r8 = r3.mo10907o()
                nj.d r8 = r15.m10949C(r8)
                nj.d r7 = r7.mo10893a(r8)
                if (r6 == 0) goto L117
                r1 = r0
                goto L11b
            L117:
                nj.d r1 = r0.mo10902j(r1)
            L11b:
                if (r6 == 0) goto L122
                nj.d r0 = r0.mo10907o()
                goto L126
            L122:
                nj.d r0 = r1.mo10902j(r0)
            L126:
                nj.d r3 = r3.mo10902j(r0)
                nj.d r3 = r15.m10947A(r3)
                nj.d r8 = r7.mo10907o()
                nj.d r9 = r3.mo10893a(r3)
                nj.d r8 = r8.mo10910r(r9)
                nj.d r9 = r1.mo10893a(r1)
                nj.d r10 = r8.mo10902j(r9)
                nj.d r0 = r0.mo10893a(r0)
                nj.d r3 = r3.mo10910r(r8)
                nj.d r3 = r3.mo10902j(r7)
                nj.d r7 = r0.mo10907o()
                nj.d r7 = r7.mo10893a(r7)
                nj.d r7 = r3.mo10910r(r7)
                if (r6 == 0) goto L161
                nj.d r0 = r0.mo10893a(r0)
                goto L165
            L161:
                nj.d r0 = r9.mo10907o()
            L165:
                nj.d r0 = r0.mo10893a(r0)
                nj.d r0 = r0.mo10902j(r1)
                nj.f$e r8 = new nj.f$e
                nj.d[] r5 = new p240nj.AbstractC4846d[r5]
                r5[r4] = r0
                boolean r6 = r15.f19290e
                r1 = r8
                r3 = r10
                r4 = r7
                r1.<init>(r2, r3, r4, r5, r6)
                return r8
            L17c:
                nj.d r1 = r3.mo10907o()
                nj.d r1 = r15.m10949C(r1)
                nj.c r4 = r15.f19286a
                nj.d r4 = r4.f19249b
                nj.d r1 = r1.mo10893a(r4)
                nj.d r4 = r0.mo10893a(r0)
                nj.d r1 = r1.mo10896d(r4)
                nj.d r4 = r1.mo10907o()
                nj.d r5 = r3.mo10893a(r3)
                nj.d r4 = r4.mo10910r(r5)
                nj.d r3 = r3.mo10910r(r4)
                nj.d r1 = r1.mo10902j(r3)
                nj.d r0 = r1.mo10910r(r0)
                nj.f$e r1 = new nj.f$e
                boolean r3 = r15.f19290e
                r1.<init>(r2, r4, r0, r3)
                return r1
        }

        @Override // p240nj.AbstractC4848f
        /* renamed from: y */
        public p240nj.AbstractC4848f mo10944y(p240nj.AbstractC4848f r9) {
                r8 = this;
                if (r8 != r9) goto L7
                nj.f r9 = r8.mo10941v()
                return r9
            L7:
                boolean r0 = r8.m10930k()
                if (r0 == 0) goto Le
                return r9
            Le:
                boolean r0 = r9.m10930k()
                if (r0 == 0) goto L19
                nj.f r9 = r8.mo10943x()
                return r9
            L19:
                nj.d r0 = r8.f19288c
                boolean r1 = r0.mo10901i()
                if (r1 == 0) goto L22
                return r9
            L22:
                nj.c r1 = r8.f19286a
                int r2 = r1.f19253f
                if (r2 == 0) goto L3e
                r0 = 4
                if (r2 == r0) goto L34
                nj.f r0 = r8.mo10943x()
                nj.f r9 = r0.mo10920a(r9)
                return r9
            L34:
                r0 = 0
                nj.f$e r0 = r8.m10950D(r0)
                nj.f r9 = r0.mo10920a(r9)
                return r9
            L3e:
                nj.d r2 = r8.f19287b
                nj.d r3 = r9.f19287b
                nj.d r9 = r9.f19288c
                nj.d r4 = r3.mo10910r(r2)
                nj.d r9 = r9.mo10910r(r0)
                boolean r5 = r4.mo10901i()
                if (r5 == 0) goto L5e
                boolean r9 = r9.mo10901i()
                if (r9 == 0) goto L5d
                nj.f r9 = r8.mo10941v()
                return r9
            L5d:
                return r8
            L5e:
                nj.d r5 = r4.mo10907o()
                nj.d r6 = r9.mo10907o()
                nj.d r7 = r2.mo10893a(r2)
                nj.d r7 = r7.mo10893a(r3)
                nj.d r7 = r5.mo10902j(r7)
                nj.d r6 = r7.mo10910r(r6)
                boolean r7 = r6.mo10901i()
                if (r7 == 0) goto L81
                nj.f r9 = r1.mo10881n()
                return r9
            L81:
                nj.d r7 = r6.mo10902j(r4)
                nj.d r7 = r7.mo10899g()
                nj.d r6 = r6.mo10902j(r7)
                nj.d r9 = r6.mo10902j(r9)
                nj.d r6 = r0.mo10893a(r0)
                nj.d r5 = r6.mo10902j(r5)
                nj.d r4 = r5.mo10902j(r4)
                nj.d r4 = r4.mo10902j(r7)
                nj.d r4 = r4.mo10910r(r9)
                nj.d r5 = r4.mo10910r(r9)
                nj.d r9 = r9.mo10893a(r4)
                nj.d r9 = r5.mo10902j(r9)
                nj.d r9 = r9.mo10893a(r3)
                nj.d r2 = r2.mo10910r(r9)
                nj.d r2 = r2.mo10902j(r4)
                nj.d r0 = r2.mo10910r(r0)
                nj.f$e r2 = new nj.f$e
                boolean r3 = r8.f19290e
                r2.<init>(r1, r9, r0, r3)
                return r2
        }

        /* renamed from: z */
        public p240nj.AbstractC4846d m10951z(p240nj.AbstractC4846d r4, p240nj.AbstractC4846d r5) {
                r3 = this;
                nj.c r0 = r3.f19286a
                nj.d r0 = r0.f19249b
                boolean r1 = r0.mo10901i()
                if (r1 != 0) goto L37
                boolean r1 = r4.mo10900h()
                if (r1 == 0) goto L11
                goto L37
            L11:
                if (r5 != 0) goto L17
                nj.d r5 = r4.mo10907o()
            L17:
                nj.d r4 = r5.mo10907o()
                nj.d r5 = r0.mo10905m()
                int r1 = r5.mo10895c()
                int r2 = r0.mo10895c()
                if (r1 >= r2) goto L32
                nj.d r4 = r4.mo10902j(r5)
                nj.d r4 = r4.mo10905m()
                goto L36
            L32:
                nj.d r4 = r4.mo10902j(r0)
            L36:
                return r4
            L37:
                return r0
        }
    }

    static {
            r0 = 0
            nj.d[] r0 = new p240nj.AbstractC4846d[r0]
            p240nj.AbstractC4848f.f19285g = r0
            return
    }

    public AbstractC4848f(p240nj.AbstractC4845c r7, p240nj.AbstractC4846d r8, p240nj.AbstractC4846d r9) {
            r6 = this;
            r0 = 0
            if (r7 != 0) goto L5
            r1 = 0
            goto L7
        L5:
            int r1 = r7.f19253f
        L7:
            if (r1 == 0) goto L41
            r2 = 5
            if (r1 == r2) goto L41
            java.math.BigInteger r2 = p240nj.InterfaceC4844b.f19244S
            nj.d r2 = r7.mo10879l(r2)
            r3 = 1
            if (r1 == r3) goto L3c
            r4 = 2
            if (r1 == r4) goto L3c
            r5 = 3
            if (r1 == r5) goto L33
            r5 = 4
            if (r1 == r5) goto L2a
            r4 = 6
            if (r1 != r4) goto L22
            goto L3c
        L22:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "unknown coordinate system"
            r7.<init>(r8)
            throw r7
        L2a:
            nj.d[] r1 = new p240nj.AbstractC4846d[r4]
            r1[r0] = r2
            nj.d r0 = r7.f19249b
            r1[r3] = r0
            goto L43
        L33:
            nj.d[] r1 = new p240nj.AbstractC4846d[r5]
            r1[r0] = r2
            r1[r3] = r2
            r1[r4] = r2
            goto L43
        L3c:
            nj.d[] r1 = new p240nj.AbstractC4846d[r3]
            r1[r0] = r2
            goto L43
        L41:
            nj.d[] r1 = p240nj.AbstractC4848f.f19285g
        L43:
            r6.<init>(r7, r8, r9, r1)
            return
    }

    public AbstractC4848f(p240nj.AbstractC4845c r2, p240nj.AbstractC4846d r3, p240nj.AbstractC4846d r4, p240nj.AbstractC4846d[] r5) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f19291f = r0
            r1.f19286a = r2
            r1.f19287b = r3
            r1.f19288c = r4
            r1.f19289d = r5
            return
    }

    /* renamed from: a */
    public abstract p240nj.AbstractC4848f mo10920a(p240nj.AbstractC4848f r1);

    /* renamed from: b */
    public p240nj.AbstractC4848f m10921b(p240nj.AbstractC4846d r3, p240nj.AbstractC4846d r4) {
            r2 = this;
            nj.c r0 = r2.f19286a
            nj.d r1 = r2.f19287b
            nj.d r3 = r1.mo10902j(r3)
            nj.d r1 = r2.f19288c
            nj.d r4 = r1.mo10902j(r4)
            boolean r1 = r2.f19290e
            nj.f r3 = r0.mo10874g(r3, r4, r1)
            return r3
    }

    /* renamed from: c */
    public boolean m10922c(p240nj.AbstractC4848f r9) {
            r8 = this;
            r0 = 0
            if (r9 != 0) goto L4
            return r0
        L4:
            nj.c r1 = r8.f19286a
            nj.c r2 = r9.f19286a
            r3 = 1
            if (r1 != 0) goto Ld
            r4 = 1
            goto Le
        Ld:
            r4 = 0
        Le:
            if (r2 != 0) goto L12
            r5 = 1
            goto L13
        L12:
            r5 = 0
        L13:
            boolean r6 = r8.m10930k()
            boolean r7 = r9.m10930k()
            if (r6 != 0) goto L67
            if (r7 == 0) goto L20
            goto L67
        L20:
            if (r4 == 0) goto L25
            if (r5 == 0) goto L25
            goto L2b
        L25:
            if (r4 == 0) goto L2d
            nj.f r9 = r9.m10934o()
        L2b:
            r1 = r8
            goto L4d
        L2d:
            if (r5 == 0) goto L34
            nj.f r1 = r8.m10934o()
            goto L4d
        L34:
            boolean r2 = r1.m10878k(r2)
            if (r2 != 0) goto L3b
            return r0
        L3b:
            r2 = 2
            nj.f[] r2 = new p240nj.AbstractC4848f[r2]
            r2[r0] = r8
            nj.f r9 = r1.mo10882o(r9)
            r2[r3] = r9
            r1.m10883p(r2)
            r1 = r2[r0]
            r9 = r2[r3]
        L4d:
            nj.d r2 = r1.f19287b
            nj.d r4 = r9.f19287b
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L66
            nj.d r1 = r1.mo10927h()
            nj.d r9 = r9.mo10927h()
            boolean r9 = r1.equals(r9)
            if (r9 == 0) goto L66
            r0 = 1
        L66:
            return r0
        L67:
            if (r6 == 0) goto L76
            if (r7 == 0) goto L76
            if (r4 != 0) goto L75
            if (r5 != 0) goto L75
            boolean r9 = r1.m10878k(r2)
            if (r9 == 0) goto L76
        L75:
            r0 = 1
        L76:
            return r0
    }

    /* renamed from: d */
    public p240nj.AbstractC4846d m10923d() {
            r2 = this;
            boolean r0 = r2.m10931l()
            if (r0 == 0) goto L9
            nj.d r0 = r2.f19287b
            return r0
        L9:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "point not in normal form"
            r0.<init>(r1)
            throw r0
    }

    /* renamed from: e */
    public abstract boolean mo10924e();

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r2 != r1) goto L4
            r2 = 1
            return r2
        L4:
            boolean r0 = r2 instanceof p240nj.AbstractC4848f
            if (r0 != 0) goto La
            r2 = 0
            return r2
        La:
            nj.f r2 = (p240nj.AbstractC4848f) r2
            boolean r2 = r1.m10922c(r2)
            return r2
    }

    /* renamed from: f */
    public int m10925f() {
            r1 = this;
            nj.c r0 = r1.f19286a
            if (r0 != 0) goto L6
            r0 = 0
            goto L8
        L6:
            int r0 = r0.f19253f
        L8:
            return r0
    }

    /* renamed from: g */
    public byte[] m10926g(boolean r6) {
            r5 = this;
            boolean r0 = r5.m10930k()
            r1 = 1
            if (r0 == 0) goto La
            byte[] r6 = new byte[r1]
            return r6
        La:
            nj.f r0 = r5.m10934o()
            nj.d r2 = r0.f19287b
            byte[] r2 = r2.m10897e()
            r3 = 0
            if (r6 == 0) goto L2c
            int r6 = r2.length
            int r6 = r6 + r1
            byte[] r6 = new byte[r6]
            boolean r0 = r0.mo10924e()
            if (r0 == 0) goto L23
            r0 = 3
            goto L24
        L23:
            r0 = 2
        L24:
            byte r0 = (byte) r0
            r6[r3] = r0
            int r0 = r2.length
            java.lang.System.arraycopy(r2, r3, r6, r1, r0)
            return r6
        L2c:
            nj.d r6 = r0.mo10927h()
            byte[] r6 = r6.m10897e()
            int r0 = r2.length
            int r4 = r6.length
            int r0 = r0 + r4
            int r0 = r0 + r1
            byte[] r0 = new byte[r0]
            r4 = 4
            r0[r3] = r4
            int r4 = r2.length
            java.lang.System.arraycopy(r2, r3, r0, r1, r4)
            int r2 = r2.length
            int r2 = r2 + r1
            int r1 = r6.length
            java.lang.System.arraycopy(r6, r3, r0, r2, r1)
            return r0
    }

    /* renamed from: h */
    public p240nj.AbstractC4846d mo10927h() {
            r1 = this;
            nj.d r0 = r1.f19288c
            return r0
    }

    public int hashCode() {
            r3 = this;
            nj.c r0 = r3.f19286a
            if (r0 != 0) goto L6
            r0 = 0
            goto Lb
        L6:
            int r0 = r0.hashCode()
            int r0 = ~r0
        Lb:
            boolean r1 = r3.m10930k()
            if (r1 != 0) goto L29
            nj.f r1 = r3.m10934o()
            nj.d r2 = r1.f19287b
            int r2 = r2.hashCode()
            int r2 = r2 * 17
            r0 = r0 ^ r2
            nj.d r1 = r1.mo10927h()
            int r1 = r1.hashCode()
            int r1 = r1 * 257
            r0 = r0 ^ r1
        L29:
            return r0
    }

    /* renamed from: i */
    public p240nj.AbstractC4846d mo10928i(int r3) {
            r2 = this;
            if (r3 < 0) goto Lb
            nj.d[] r0 = r2.f19289d
            int r1 = r0.length
            if (r3 < r1) goto L8
            goto Lb
        L8:
            r3 = r0[r3]
            goto Lc
        Lb:
            r3 = 0
        Lc:
            return r3
    }

    /* renamed from: j */
    public boolean m10929j(boolean r4, boolean r5) {
            r3 = this;
            boolean r0 = r3.m10930k()
            r1 = 1
            if (r0 == 0) goto L8
            return r1
        L8:
            nj.c r0 = r3.f19286a
            nj.f$a r2 = new nj.f$a
            r2.<init>(r3, r4, r5)
            java.lang.String r4 = "bc_validity"
            nj.n r4 = r0.m10885r(r3, r4, r2)
            nj.q r4 = (p240nj.C4859q) r4
            boolean r4 = r4.f19313a
            r4 = r4 ^ r1
            return r4
    }

    /* renamed from: k */
    public boolean m10930k() {
            r3 = this;
            nj.d r0 = r3.f19287b
            r1 = 0
            if (r0 == 0) goto L16
            nj.d r0 = r3.f19288c
            if (r0 == 0) goto L16
            nj.d[] r0 = r3.f19289d
            int r2 = r0.length
            if (r2 <= 0) goto L17
            r0 = r0[r1]
            boolean r0 = r0.mo10901i()
            if (r0 == 0) goto L17
        L16:
            r1 = 1
        L17:
            return r1
    }

    /* renamed from: l */
    public boolean m10931l() {
            r3 = this;
            int r0 = r3.m10925f()
            r1 = 0
            if (r0 == 0) goto L1a
            r2 = 5
            if (r0 == r2) goto L1a
            boolean r0 = r3.m10930k()
            if (r0 != 0) goto L1a
            nj.d[] r0 = r3.f19289d
            r0 = r0[r1]
            boolean r0 = r0.mo10900h()
            if (r0 == 0) goto L1b
        L1a:
            r1 = 1
        L1b:
            return r1
    }

    /* renamed from: m */
    public p240nj.AbstractC4848f m10932m(java.math.BigInteger r3) {
            r2 = this;
            nj.c r0 = r2.f19286a
            monitor-enter(r0)
            h7.xb r1 = r0.f19255h     // Catch: java.lang.Throwable -> L15
            if (r1 != 0) goto Ld
            h7.xb r1 = r0.mo10871d()     // Catch: java.lang.Throwable -> L15
            r0.f19255h = r1     // Catch: java.lang.Throwable -> L15
        Ld:
            h7.xb r1 = r0.f19255h     // Catch: java.lang.Throwable -> L15
            monitor-exit(r0)
            nj.f r3 = r1.m7309b(r2, r3)
            return r3
        L15:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
    }

    /* renamed from: n */
    public abstract p240nj.AbstractC4848f mo10933n();

    /* renamed from: o */
    public p240nj.AbstractC4848f m10934o() {
            r2 = this;
            boolean r0 = r2.m10930k()
            if (r0 == 0) goto L7
            return r2
        L7:
            int r0 = r2.m10925f()
            if (r0 == 0) goto L25
            r1 = 5
            if (r0 == r1) goto L25
            r0 = 0
            nj.d r0 = r2.mo10928i(r0)
            boolean r1 = r0.mo10900h()
            if (r1 == 0) goto L1c
            return r2
        L1c:
            nj.d r0 = r0.mo10899g()
            nj.f r0 = r2.m10935p(r0)
            return r0
        L25:
            return r2
    }

    /* renamed from: p */
    public p240nj.AbstractC4848f m10935p(p240nj.AbstractC4846d r3) {
            r2 = this;
            int r0 = r2.m10925f()
            r1 = 1
            if (r0 == r1) goto L29
            r1 = 2
            if (r0 == r1) goto L1c
            r1 = 3
            if (r0 == r1) goto L1c
            r1 = 4
            if (r0 == r1) goto L1c
            r1 = 6
            if (r0 != r1) goto L14
            goto L29
        L14:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "not a projective coordinate system"
            r3.<init>(r0)
            throw r3
        L1c:
            nj.d r0 = r3.mo10907o()
            nj.d r3 = r0.mo10902j(r3)
            nj.f r3 = r2.m10921b(r0, r3)
            return r3
        L29:
            nj.f r3 = r2.m10921b(r3, r3)
            return r3
    }

    /* renamed from: q */
    public abstract boolean mo10936q();

    /* renamed from: r */
    public boolean mo10937r() {
            r9 = this;
            java.math.BigInteger r0 = p240nj.InterfaceC4844b.f19244S
            nj.c r1 = r9.f19286a
            java.math.BigInteger r1 = r1.f19252e
            boolean r0 = r0.equals(r1)
            r1 = 1
            if (r0 == 0) goto Le
            return r1
        Le:
            nj.c r0 = r9.f19286a
            java.math.BigInteger r0 = r0.f19251d
            r2 = 0
            if (r0 == 0) goto L53
            java.math.BigInteger r3 = r0.abs()
            nj.c r4 = r9.f19286a
            nj.f r4 = r4.mo10881n()
            int r5 = r3.bitLength()
            if (r5 <= 0) goto L41
            boolean r6 = r3.testBit(r2)
            if (r6 == 0) goto L2c
            r4 = r9
        L2c:
            r7 = r9
            r6 = 1
        L2e:
            if (r6 >= r5) goto L41
            nj.f r7 = r7.mo10943x()
            boolean r8 = r3.testBit(r6)
            if (r8 == 0) goto L3e
            nj.f r4 = r4.mo10920a(r7)
        L3e:
            int r6 = r6 + 1
            goto L2e
        L41:
            int r0 = r0.signum()
            if (r0 >= 0) goto L4b
            nj.f r4 = r4.mo10933n()
        L4b:
            boolean r0 = r4.m10930k()
            if (r0 == 0) goto L52
            goto L53
        L52:
            r1 = 0
        L53:
            return r1
    }

    /* renamed from: s */
    public p240nj.AbstractC4848f mo10938s(p240nj.AbstractC4846d r5) {
            r4 = this;
            boolean r0 = r4.m10930k()
            if (r0 == 0) goto L8
            r5 = r4
            goto L1a
        L8:
            nj.c r0 = r4.f19286a
            nj.d r1 = r4.f19287b
            nj.d r5 = r1.mo10902j(r5)
            nj.d r1 = r4.f19288c
            nj.d[] r2 = r4.f19289d
            boolean r3 = r4.f19290e
            nj.f r5 = r0.mo10875h(r5, r1, r2, r3)
        L1a:
            return r5
    }

    /* renamed from: t */
    public p240nj.AbstractC4848f mo10939t(p240nj.AbstractC4846d r5) {
            r4 = this;
            boolean r0 = r4.m10930k()
            if (r0 == 0) goto L8
            r5 = r4
            goto L1a
        L8:
            nj.c r0 = r4.f19286a
            nj.d r1 = r4.f19287b
            nj.d r2 = r4.f19288c
            nj.d r5 = r2.mo10902j(r5)
            nj.d[] r2 = r4.f19289d
            boolean r3 = r4.f19290e
            nj.f r5 = r0.mo10875h(r1, r5, r2, r3)
        L1a:
            return r5
    }

    public java.lang.String toString() {
            r4 = this;
            boolean r0 = r4.m10930k()
            if (r0 == 0) goto L9
            java.lang.String r0 = "INF"
            return r0
        L9:
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            r1 = 40
            r0.append(r1)
            nj.d r1 = r4.f19287b
            r0.append(r1)
            r1 = 44
            r0.append(r1)
            nj.d r2 = r4.f19288c
            r0.append(r2)
            r2 = 0
        L23:
            nj.d[] r3 = r4.f19289d
            int r3 = r3.length
            if (r2 >= r3) goto L35
            r0.append(r1)
            nj.d[] r3 = r4.f19289d
            r3 = r3[r2]
            r0.append(r3)
            int r2 = r2 + 1
            goto L23
        L35:
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    /* renamed from: u */
    public abstract p240nj.AbstractC4848f mo10940u(p240nj.AbstractC4848f r1);

    /* renamed from: v */
    public p240nj.AbstractC4848f mo10941v() {
            r1 = this;
            nj.f r0 = r1.mo10944y(r1)
            return r0
    }

    /* renamed from: w */
    public p240nj.AbstractC4848f mo10942w(int r2) {
            r1 = this;
            if (r2 < 0) goto Ld
            r0 = r1
        L3:
            int r2 = r2 + (-1)
            if (r2 < 0) goto Lc
            nj.f r0 = r0.mo10943x()
            goto L3
        Lc:
            return r0
        Ld:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "'e' cannot be negative"
            r2.<init>(r0)
            throw r2
    }

    /* renamed from: x */
    public abstract p240nj.AbstractC4848f mo10943x();

    /* renamed from: y */
    public p240nj.AbstractC4848f mo10944y(p240nj.AbstractC4848f r2) {
            r1 = this;
            nj.f r0 = r1.mo10943x()
            nj.f r2 = r0.mo10920a(r2)
            return r2
    }
}
