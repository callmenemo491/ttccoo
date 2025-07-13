package p221m9;

/* renamed from: m9.j */
/* loaded from: classes.dex */
public final class C4460j implements p221m9.InterfaceC4444d1 {

    /* renamed from: a */
    public final p221m9.AbstractC4457i f18178a;

    /* renamed from: b */
    public int f18179b;

    /* renamed from: c */
    public int f18180c;

    /* renamed from: d */
    public int f18181d;

    public C4460j(p221m9.AbstractC4457i r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f18181d = r0
            java.nio.charset.Charset r0 = p221m9.C4505z.f18308a
            r1.f18178a = r2
            r2.f18149c = r1
            return
    }

    @Override // p221m9.InterfaceC4444d1
    /* renamed from: A */
    public <K, V> void mo9918A(java.util.Map<K, V> r1, p221m9.C4461j0.a<K, V> r2, p221m9.C4478p r3) {
            r0 = this;
            r1 = 2
            r0.m10122S(r1)
            m9.i r1 = r0.f18178a
            int r1 = r1.mo10097y()
            m9.i r2 = r0.f18178a
            r2.mo10080h(r1)
            r1 = 0
            java.util.Objects.requireNonNull(r1)
            throw r1
    }

    @Override // p221m9.InterfaceC4444d1
    /* renamed from: B */
    public boolean mo9919B() {
            r2 = this;
            m9.i r0 = r2.f18178a
            boolean r0 = r0.mo10078e()
            if (r0 != 0) goto L16
            int r0 = r2.f18179b
            int r1 = r2.f18180c
            if (r0 != r1) goto Lf
            goto L16
        Lf:
            m9.i r1 = r2.f18178a
            boolean r0 = r1.mo10075A(r0)
            return r0
        L16:
            r0 = 0
            return r0
    }

    @Override // p221m9.InterfaceC4444d1
    /* renamed from: C */
    public <T> T mo9920C(p221m9.InterfaceC4447e1<T> r2, p221m9.C4478p r3) {
            r1 = this;
            r0 = 3
            r1.m10122S(r0)
            java.lang.Object r2 = r1.m10118O(r2, r3)
            return r2
    }

    @Override // p221m9.InterfaceC4444d1
    /* renamed from: D */
    public int mo9921D() {
            r1 = this;
            r0 = 5
            r1.m10122S(r0)
            m9.i r0 = r1.f18178a
            int r0 = r0.mo10090r()
            return r0
    }

    @Override // p221m9.InterfaceC4444d1
    /* renamed from: E */
    public void mo9922E(java.util.List<p221m9.AbstractC4454h> r3) {
            r2 = this;
            int r0 = r2.f18179b
            r0 = r0 & 7
            r1 = 2
            if (r0 != r1) goto L24
        L7:
            m9.h r0 = r2.mo9954w()
            r3.add(r0)
            m9.i r0 = r2.f18178a
            boolean r0 = r0.mo10078e()
            if (r0 == 0) goto L17
            return
        L17:
            m9.i r0 = r2.f18178a
            int r0 = r0.mo10096x()
            int r1 = r2.f18179b
            if (r0 == r1) goto L7
            r2.f18181d = r0
            return
        L24:
            m9.a0$a r3 = p221m9.C4434a0.m9898d()
            throw r3
    }

    @Override // p221m9.InterfaceC4444d1
    /* renamed from: F */
    public void mo9923F(java.util.List<java.lang.Double> r5) {
            r4 = this;
            boolean r0 = r5 instanceof p221m9.C4469m
            r1 = 2
            r2 = 1
            if (r0 == 0) goto L57
            r0 = r5
            m9.m r0 = (p221m9.C4469m) r0
            int r5 = r4.f18179b
            r5 = r5 & 7
            if (r5 == r2) goto L38
            if (r5 != r1) goto L33
            m9.i r5 = r4.f18178a
            int r5 = r5.mo10097y()
            r4.m10124U(r5)
            m9.i r1 = r4.f18178a
            int r1 = r1.mo10077d()
            int r1 = r1 + r5
        L21:
            m9.i r5 = r4.f18178a
            double r2 = r5.mo10083k()
            r0.m10195e(r2)
            m9.i r5 = r4.f18178a
            int r5 = r5.mo10077d()
            if (r5 < r1) goto L21
            goto L84
        L33:
            m9.a0$a r5 = p221m9.C4434a0.m9898d()
            throw r5
        L38:
            m9.i r5 = r4.f18178a
            double r1 = r5.mo10083k()
            r0.m10195e(r1)
            m9.i r5 = r4.f18178a
            boolean r5 = r5.mo10078e()
            if (r5 == 0) goto L4a
            return
        L4a:
            m9.i r5 = r4.f18178a
            int r5 = r5.mo10096x()
            int r1 = r4.f18179b
            if (r5 == r1) goto L38
            r4.f18181d = r5
            return
        L57:
            int r0 = r4.f18179b
            r0 = r0 & 7
            if (r0 == r2) goto L8a
            if (r0 != r1) goto L85
            m9.i r0 = r4.f18178a
            int r0 = r0.mo10097y()
            r4.m10124U(r0)
            m9.i r1 = r4.f18178a
            int r1 = r1.mo10077d()
            int r1 = r1 + r0
        L6f:
            m9.i r0 = r4.f18178a
            double r2 = r0.mo10083k()
            java.lang.Double r0 = java.lang.Double.valueOf(r2)
            r5.add(r0)
            m9.i r0 = r4.f18178a
            int r0 = r0.mo10077d()
            if (r0 < r1) goto L6f
        L84:
            return
        L85:
            m9.a0$a r5 = p221m9.C4434a0.m9898d()
            throw r5
        L8a:
            m9.i r0 = r4.f18178a
            double r0 = r0.mo10083k()
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r5.add(r0)
            m9.i r0 = r4.f18178a
            boolean r0 = r0.mo10078e()
            if (r0 == 0) goto La0
            return
        La0:
            m9.i r0 = r4.f18178a
            int r0 = r0.mo10096x()
            int r1 = r4.f18179b
            if (r0 == r1) goto L8a
            r4.f18181d = r0
            return
    }

    @Override // p221m9.InterfaceC4444d1
    /* renamed from: G */
    public <T> T mo9924G(p221m9.InterfaceC4447e1<T> r2, p221m9.C4478p r3) {
            r1 = this;
            r0 = 2
            r1.m10122S(r0)
            java.lang.Object r2 = r1.m10119P(r2, r3)
            return r2
    }

    @Override // p221m9.InterfaceC4444d1
    /* renamed from: H */
    public void mo9925H(java.util.List<java.lang.Long> r5) {
            r4 = this;
            boolean r0 = r5 instanceof p221m9.C4455h0
            r1 = 2
            if (r0 == 0) goto L53
            r0 = r5
            m9.h0 r0 = (p221m9.C4455h0) r0
            int r5 = r4.f18179b
            r5 = r5 & 7
            if (r5 == 0) goto L34
            if (r5 != r1) goto L2f
            m9.i r5 = r4.f18178a
            int r5 = r5.mo10097y()
            m9.i r1 = r4.f18178a
            int r1 = r1.mo10077d()
            int r1 = r1 + r5
        L1d:
            m9.i r5 = r4.f18178a
            long r2 = r5.mo10089q()
            r0.m10067e(r2)
            m9.i r5 = r4.f18178a
            int r5 = r5.mo10077d()
            if (r5 < r1) goto L1d
            goto L7d
        L2f:
            m9.a0$a r5 = p221m9.C4434a0.m9898d()
            throw r5
        L34:
            m9.i r5 = r4.f18178a
            long r1 = r5.mo10089q()
            r0.m10067e(r1)
            m9.i r5 = r4.f18178a
            boolean r5 = r5.mo10078e()
            if (r5 == 0) goto L46
            return
        L46:
            m9.i r5 = r4.f18178a
            int r5 = r5.mo10096x()
            int r1 = r4.f18179b
            if (r5 == r1) goto L34
            r4.f18181d = r5
            return
        L53:
            int r0 = r4.f18179b
            r0 = r0 & 7
            if (r0 == 0) goto L86
            if (r0 != r1) goto L81
            m9.i r0 = r4.f18178a
            int r0 = r0.mo10097y()
            m9.i r1 = r4.f18178a
            int r1 = r1.mo10077d()
            int r1 = r1 + r0
        L68:
            m9.i r0 = r4.f18178a
            long r2 = r0.mo10089q()
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r5.add(r0)
            m9.i r0 = r4.f18178a
            int r0 = r0.mo10077d()
            if (r0 < r1) goto L68
        L7d:
            r4.m10121R(r1)
            return
        L81:
            m9.a0$a r5 = p221m9.C4434a0.m9898d()
            throw r5
        L86:
            m9.i r0 = r4.f18178a
            long r0 = r0.mo10089q()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r5.add(r0)
            m9.i r0 = r4.f18178a
            boolean r0 = r0.mo10078e()
            if (r0 == 0) goto L9c
            return
        L9c:
            m9.i r0 = r4.f18178a
            int r0 = r0.mo10096x()
            int r1 = r4.f18179b
            if (r0 == r1) goto L86
            r4.f18181d = r0
            return
    }

    @Override // p221m9.InterfaceC4444d1
    /* renamed from: I */
    public void mo9926I(java.util.List<java.lang.Long> r5) {
            r4 = this;
            boolean r0 = r5 instanceof p221m9.C4455h0
            r1 = 2
            r2 = 1
            if (r0 == 0) goto L57
            r0 = r5
            m9.h0 r0 = (p221m9.C4455h0) r0
            int r5 = r4.f18179b
            r5 = r5 & 7
            if (r5 == r2) goto L38
            if (r5 != r1) goto L33
            m9.i r5 = r4.f18178a
            int r5 = r5.mo10097y()
            r4.m10124U(r5)
            m9.i r1 = r4.f18178a
            int r1 = r1.mo10077d()
            int r1 = r1 + r5
        L21:
            m9.i r5 = r4.f18178a
            long r2 = r5.mo10091s()
            r0.m10067e(r2)
            m9.i r5 = r4.f18178a
            int r5 = r5.mo10077d()
            if (r5 < r1) goto L21
            goto L84
        L33:
            m9.a0$a r5 = p221m9.C4434a0.m9898d()
            throw r5
        L38:
            m9.i r5 = r4.f18178a
            long r1 = r5.mo10091s()
            r0.m10067e(r1)
            m9.i r5 = r4.f18178a
            boolean r5 = r5.mo10078e()
            if (r5 == 0) goto L4a
            return
        L4a:
            m9.i r5 = r4.f18178a
            int r5 = r5.mo10096x()
            int r1 = r4.f18179b
            if (r5 == r1) goto L38
            r4.f18181d = r5
            return
        L57:
            int r0 = r4.f18179b
            r0 = r0 & 7
            if (r0 == r2) goto L8a
            if (r0 != r1) goto L85
            m9.i r0 = r4.f18178a
            int r0 = r0.mo10097y()
            r4.m10124U(r0)
            m9.i r1 = r4.f18178a
            int r1 = r1.mo10077d()
            int r1 = r1 + r0
        L6f:
            m9.i r0 = r4.f18178a
            long r2 = r0.mo10091s()
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r5.add(r0)
            m9.i r0 = r4.f18178a
            int r0 = r0.mo10077d()
            if (r0 < r1) goto L6f
        L84:
            return
        L85:
            m9.a0$a r5 = p221m9.C4434a0.m9898d()
            throw r5
        L8a:
            m9.i r0 = r4.f18178a
            long r0 = r0.mo10091s()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r5.add(r0)
            m9.i r0 = r4.f18178a
            boolean r0 = r0.mo10078e()
            if (r0 == 0) goto La0
            return
        La0:
            m9.i r0 = r4.f18178a
            int r0 = r0.mo10096x()
            int r1 = r4.f18179b
            if (r0 == r1) goto L8a
            r4.f18181d = r0
            return
    }

    @Override // p221m9.InterfaceC4444d1
    /* renamed from: J */
    public long mo9927J() {
            r2 = this;
            r0 = 0
            r2.m10122S(r0)
            m9.i r0 = r2.f18178a
            long r0 = r0.mo10089q()
            return r0
    }

    @Override // p221m9.InterfaceC4444d1
    /* renamed from: K */
    public java.lang.String mo9928K() {
            r1 = this;
            r0 = 2
            r1.m10122S(r0)
            m9.i r0 = r1.f18178a
            java.lang.String r0 = r0.mo10095w()
            return r0
    }

    @Override // p221m9.InterfaceC4444d1
    /* renamed from: L */
    public void mo9929L(java.util.List<java.lang.Long> r5) {
            r4 = this;
            boolean r0 = r5 instanceof p221m9.C4455h0
            r1 = 2
            r2 = 1
            if (r0 == 0) goto L57
            r0 = r5
            m9.h0 r0 = (p221m9.C4455h0) r0
            int r5 = r4.f18179b
            r5 = r5 & 7
            if (r5 == r2) goto L38
            if (r5 != r1) goto L33
            m9.i r5 = r4.f18178a
            int r5 = r5.mo10097y()
            r4.m10124U(r5)
            m9.i r1 = r4.f18178a
            int r1 = r1.mo10077d()
            int r1 = r1 + r5
        L21:
            m9.i r5 = r4.f18178a
            long r2 = r5.mo10086n()
            r0.m10067e(r2)
            m9.i r5 = r4.f18178a
            int r5 = r5.mo10077d()
            if (r5 < r1) goto L21
            goto L84
        L33:
            m9.a0$a r5 = p221m9.C4434a0.m9898d()
            throw r5
        L38:
            m9.i r5 = r4.f18178a
            long r1 = r5.mo10086n()
            r0.m10067e(r1)
            m9.i r5 = r4.f18178a
            boolean r5 = r5.mo10078e()
            if (r5 == 0) goto L4a
            return
        L4a:
            m9.i r5 = r4.f18178a
            int r5 = r5.mo10096x()
            int r1 = r4.f18179b
            if (r5 == r1) goto L38
            r4.f18181d = r5
            return
        L57:
            int r0 = r4.f18179b
            r0 = r0 & 7
            if (r0 == r2) goto L8a
            if (r0 != r1) goto L85
            m9.i r0 = r4.f18178a
            int r0 = r0.mo10097y()
            r4.m10124U(r0)
            m9.i r1 = r4.f18178a
            int r1 = r1.mo10077d()
            int r1 = r1 + r0
        L6f:
            m9.i r0 = r4.f18178a
            long r2 = r0.mo10086n()
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r5.add(r0)
            m9.i r0 = r4.f18178a
            int r0 = r0.mo10077d()
            if (r0 < r1) goto L6f
        L84:
            return
        L85:
            m9.a0$a r5 = p221m9.C4434a0.m9898d()
            throw r5
        L8a:
            m9.i r0 = r4.f18178a
            long r0 = r0.mo10086n()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r5.add(r0)
            m9.i r0 = r4.f18178a
            boolean r0 = r0.mo10078e()
            if (r0 == 0) goto La0
            return
        La0:
            m9.i r0 = r4.f18178a
            int r0 = r0.mo10096x()
            int r1 = r4.f18179b
            if (r0 == r1) goto L8a
            r4.f18181d = r0
            return
    }

    @Override // p221m9.InterfaceC4444d1
    /* renamed from: M */
    public void mo9930M(java.util.List<java.lang.Integer> r3) {
            r2 = this;
            boolean r0 = r3 instanceof p221m9.C4503y
            r1 = 2
            if (r0 == 0) goto L53
            r0 = r3
            m9.y r0 = (p221m9.C4503y) r0
            int r3 = r2.f18179b
            r3 = r3 & 7
            if (r3 == 0) goto L34
            if (r3 != r1) goto L2f
            m9.i r3 = r2.f18178a
            int r3 = r3.mo10097y()
            m9.i r1 = r2.f18178a
            int r1 = r1.mo10077d()
            int r1 = r1 + r3
        L1d:
            m9.i r3 = r2.f18178a
            int r3 = r3.mo10088p()
            r0.m10381e(r3)
            m9.i r3 = r2.f18178a
            int r3 = r3.mo10077d()
            if (r3 < r1) goto L1d
            goto L7d
        L2f:
            m9.a0$a r3 = p221m9.C4434a0.m9898d()
            throw r3
        L34:
            m9.i r3 = r2.f18178a
            int r3 = r3.mo10088p()
            r0.m10381e(r3)
            m9.i r3 = r2.f18178a
            boolean r3 = r3.mo10078e()
            if (r3 == 0) goto L46
            return
        L46:
            m9.i r3 = r2.f18178a
            int r3 = r3.mo10096x()
            int r1 = r2.f18179b
            if (r3 == r1) goto L34
            r2.f18181d = r3
            return
        L53:
            int r0 = r2.f18179b
            r0 = r0 & 7
            if (r0 == 0) goto L86
            if (r0 != r1) goto L81
            m9.i r0 = r2.f18178a
            int r0 = r0.mo10097y()
            m9.i r1 = r2.f18178a
            int r1 = r1.mo10077d()
            int r1 = r1 + r0
        L68:
            m9.i r0 = r2.f18178a
            int r0 = r0.mo10088p()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.add(r0)
            m9.i r0 = r2.f18178a
            int r0 = r0.mo10077d()
            if (r0 < r1) goto L68
        L7d:
            r2.m10121R(r1)
            return
        L81:
            m9.a0$a r3 = p221m9.C4434a0.m9898d()
            throw r3
        L86:
            m9.i r0 = r2.f18178a
            int r0 = r0.mo10088p()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.add(r0)
            m9.i r0 = r2.f18178a
            boolean r0 = r0.mo10078e()
            if (r0 == 0) goto L9c
            return
        L9c:
            m9.i r0 = r2.f18178a
            int r0 = r0.mo10096x()
            int r1 = r2.f18179b
            if (r0 == r1) goto L86
            r2.f18181d = r0
            return
    }

    @Override // p221m9.InterfaceC4444d1
    /* renamed from: N */
    public void mo9931N(java.util.List<java.lang.Integer> r3) {
            r2 = this;
            boolean r0 = r3 instanceof p221m9.C4503y
            r1 = 2
            if (r0 == 0) goto L53
            r0 = r3
            m9.y r0 = (p221m9.C4503y) r0
            int r3 = r2.f18179b
            r3 = r3 & 7
            if (r3 == 0) goto L34
            if (r3 != r1) goto L2f
            m9.i r3 = r2.f18178a
            int r3 = r3.mo10097y()
            m9.i r1 = r2.f18178a
            int r1 = r1.mo10077d()
            int r1 = r1 + r3
        L1d:
            m9.i r3 = r2.f18178a
            int r3 = r3.mo10084l()
            r0.m10381e(r3)
            m9.i r3 = r2.f18178a
            int r3 = r3.mo10077d()
            if (r3 < r1) goto L1d
            goto L7d
        L2f:
            m9.a0$a r3 = p221m9.C4434a0.m9898d()
            throw r3
        L34:
            m9.i r3 = r2.f18178a
            int r3 = r3.mo10084l()
            r0.m10381e(r3)
            m9.i r3 = r2.f18178a
            boolean r3 = r3.mo10078e()
            if (r3 == 0) goto L46
            return
        L46:
            m9.i r3 = r2.f18178a
            int r3 = r3.mo10096x()
            int r1 = r2.f18179b
            if (r3 == r1) goto L34
            r2.f18181d = r3
            return
        L53:
            int r0 = r2.f18179b
            r0 = r0 & 7
            if (r0 == 0) goto L86
            if (r0 != r1) goto L81
            m9.i r0 = r2.f18178a
            int r0 = r0.mo10097y()
            m9.i r1 = r2.f18178a
            int r1 = r1.mo10077d()
            int r1 = r1 + r0
        L68:
            m9.i r0 = r2.f18178a
            int r0 = r0.mo10084l()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.add(r0)
            m9.i r0 = r2.f18178a
            int r0 = r0.mo10077d()
            if (r0 < r1) goto L68
        L7d:
            r2.m10121R(r1)
            return
        L81:
            m9.a0$a r3 = p221m9.C4434a0.m9898d()
            throw r3
        L86:
            m9.i r0 = r2.f18178a
            int r0 = r0.mo10084l()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.add(r0)
            m9.i r0 = r2.f18178a
            boolean r0 = r0.mo10078e()
            if (r0 == 0) goto L9c
            return
        L9c:
            m9.i r0 = r2.f18178a
            int r0 = r0.mo10096x()
            int r1 = r2.f18179b
            if (r0 == r1) goto L86
            r2.f18181d = r0
            return
    }

    /* renamed from: O */
    public final <T> T m10118O(p221m9.InterfaceC4447e1<T> r3, p221m9.C4478p r4) {
            r2 = this;
            int r0 = r2.f18180c
            int r1 = r2.f18179b
            int r1 = r1 >>> 3
            int r1 = r1 << 3
            r1 = r1 | 4
            r2.f18180c = r1
            java.lang.Object r1 = r3.mo9993h()     // Catch: java.lang.Throwable -> L24
            r3.mo9994i(r1, r2, r4)     // Catch: java.lang.Throwable -> L24
            r3.mo9989d(r1)     // Catch: java.lang.Throwable -> L24
            int r3 = r2.f18179b     // Catch: java.lang.Throwable -> L24
            int r4 = r2.f18180c     // Catch: java.lang.Throwable -> L24
            if (r3 != r4) goto L1f
            r2.f18180c = r0
            return r1
        L1f:
            m9.a0 r3 = p221m9.C4434a0.m9901g()     // Catch: java.lang.Throwable -> L24
            throw r3     // Catch: java.lang.Throwable -> L24
        L24:
            r3 = move-exception
            r2.f18180c = r0
            throw r3
    }

    /* renamed from: P */
    public final <T> T m10119P(p221m9.InterfaceC4447e1<T> r5, p221m9.C4478p r6) {
            r4 = this;
            m9.i r0 = r4.f18178a
            int r0 = r0.mo10097y()
            m9.i r1 = r4.f18178a
            int r2 = r1.f18147a
            int r3 = r1.f18148b
            if (r2 >= r3) goto L36
            int r0 = r1.mo10080h(r0)
            java.lang.Object r1 = r5.mo9993h()
            m9.i r2 = r4.f18178a
            int r3 = r2.f18147a
            int r3 = r3 + 1
            r2.f18147a = r3
            r5.mo9994i(r1, r4, r6)
            r5.mo9989d(r1)
            m9.i r5 = r4.f18178a
            r6 = 0
            r5.mo10076a(r6)
            m9.i r5 = r4.f18178a
            int r6 = r5.f18147a
            int r6 = r6 + (-1)
            r5.f18147a = r6
            r5.mo10079g(r0)
            return r1
        L36:
            m9.a0 r5 = new m9.a0
            java.lang.String r6 = "Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit."
            r5.<init>(r6)
            throw r5
    }

    /* renamed from: Q */
    public void m10120Q(java.util.List<java.lang.String> r3, boolean r4) {
            r2 = this;
            int r0 = r2.f18179b
            r0 = r0 & 7
            r1 = 2
            if (r0 != r1) goto L51
            boolean r0 = r3 instanceof p221m9.InterfaceC4449f0
            if (r0 == 0) goto L2d
            if (r4 != 0) goto L2d
            r0 = r3
            m9.f0 r0 = (p221m9.InterfaceC4449f0) r0
        L10:
            m9.h r3 = r2.mo9954w()
            r0.mo9983J(r3)
            m9.i r3 = r2.f18178a
            boolean r3 = r3.mo10078e()
            if (r3 == 0) goto L20
            return
        L20:
            m9.i r3 = r2.f18178a
            int r3 = r3.mo10096x()
            int r4 = r2.f18179b
            if (r3 == r4) goto L10
            r2.f18181d = r3
            return
        L2d:
            if (r4 == 0) goto L34
            java.lang.String r0 = r2.mo9928K()
            goto L38
        L34:
            java.lang.String r0 = r2.mo9945n()
        L38:
            r3.add(r0)
            m9.i r0 = r2.f18178a
            boolean r0 = r0.mo10078e()
            if (r0 == 0) goto L44
            return
        L44:
            m9.i r0 = r2.f18178a
            int r0 = r0.mo10096x()
            int r1 = r2.f18179b
            if (r0 == r1) goto L2d
            r2.f18181d = r0
            return
        L51:
            m9.a0$a r3 = p221m9.C4434a0.m9898d()
            throw r3
    }

    /* renamed from: R */
    public final void m10121R(int r2) {
            r1 = this;
            m9.i r0 = r1.f18178a
            int r0 = r0.mo10077d()
            if (r0 != r2) goto L9
            return
        L9:
            m9.a0 r2 = p221m9.C4434a0.m9902h()
            throw r2
    }

    /* renamed from: S */
    public final void m10122S(int r2) {
            r1 = this;
            int r0 = r1.f18179b
            r0 = r0 & 7
            if (r0 != r2) goto L7
            return
        L7:
            m9.a0$a r2 = p221m9.C4434a0.m9898d()
            throw r2
    }

    /* renamed from: T */
    public final void m10123T(int r1) {
            r0 = this;
            r1 = r1 & 3
            if (r1 != 0) goto L5
            return
        L5:
            m9.a0 r1 = p221m9.C4434a0.m9901g()
            throw r1
    }

    /* renamed from: U */
    public final void m10124U(int r1) {
            r0 = this;
            r1 = r1 & 7
            if (r1 != 0) goto L5
            return
        L5:
            m9.a0 r1 = p221m9.C4434a0.m9901g()
            throw r1
    }

    @Override // p221m9.InterfaceC4444d1
    /* renamed from: a */
    public <T> void mo9932a(java.util.List<T> r4, p221m9.InterfaceC4447e1<T> r5, p221m9.C4478p r6) {
            r3 = this;
            int r0 = r3.f18179b
            r1 = r0 & 7
            r2 = 2
            if (r1 != r2) goto L26
        L7:
            java.lang.Object r1 = r3.m10119P(r5, r6)
            r4.add(r1)
            m9.i r1 = r3.f18178a
            boolean r1 = r1.mo10078e()
            if (r1 != 0) goto L25
            int r1 = r3.f18181d
            if (r1 == 0) goto L1b
            goto L25
        L1b:
            m9.i r1 = r3.f18178a
            int r1 = r1.mo10096x()
            if (r1 == r0) goto L7
            r3.f18181d = r1
        L25:
            return
        L26:
            m9.a0$a r4 = p221m9.C4434a0.m9898d()
            throw r4
    }

    @Override // p221m9.InterfaceC4444d1
    /* renamed from: b */
    public void mo9933b(java.util.List<java.lang.Integer> r3) {
            r2 = this;
            boolean r0 = r3 instanceof p221m9.C4503y
            r1 = 2
            if (r0 == 0) goto L53
            r0 = r3
            m9.y r0 = (p221m9.C4503y) r0
            int r3 = r2.f18179b
            r3 = r3 & 7
            if (r3 == 0) goto L34
            if (r3 != r1) goto L2f
            m9.i r3 = r2.f18178a
            int r3 = r3.mo10097y()
            m9.i r1 = r2.f18178a
            int r1 = r1.mo10077d()
            int r1 = r1 + r3
        L1d:
            m9.i r3 = r2.f18178a
            int r3 = r3.mo10092t()
            r0.m10381e(r3)
            m9.i r3 = r2.f18178a
            int r3 = r3.mo10077d()
            if (r3 < r1) goto L1d
            goto L7d
        L2f:
            m9.a0$a r3 = p221m9.C4434a0.m9898d()
            throw r3
        L34:
            m9.i r3 = r2.f18178a
            int r3 = r3.mo10092t()
            r0.m10381e(r3)
            m9.i r3 = r2.f18178a
            boolean r3 = r3.mo10078e()
            if (r3 == 0) goto L46
            return
        L46:
            m9.i r3 = r2.f18178a
            int r3 = r3.mo10096x()
            int r1 = r2.f18179b
            if (r3 == r1) goto L34
            r2.f18181d = r3
            return
        L53:
            int r0 = r2.f18179b
            r0 = r0 & 7
            if (r0 == 0) goto L86
            if (r0 != r1) goto L81
            m9.i r0 = r2.f18178a
            int r0 = r0.mo10097y()
            m9.i r1 = r2.f18178a
            int r1 = r1.mo10077d()
            int r1 = r1 + r0
        L68:
            m9.i r0 = r2.f18178a
            int r0 = r0.mo10092t()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.add(r0)
            m9.i r0 = r2.f18178a
            int r0 = r0.mo10077d()
            if (r0 < r1) goto L68
        L7d:
            r2.m10121R(r1)
            return
        L81:
            m9.a0$a r3 = p221m9.C4434a0.m9898d()
            throw r3
        L86:
            m9.i r0 = r2.f18178a
            int r0 = r0.mo10092t()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.add(r0)
            m9.i r0 = r2.f18178a
            boolean r0 = r0.mo10078e()
            if (r0 == 0) goto L9c
            return
        L9c:
            m9.i r0 = r2.f18178a
            int r0 = r0.mo10096x()
            int r1 = r2.f18179b
            if (r0 == r1) goto L86
            r2.f18181d = r0
            return
    }

    @Override // p221m9.InterfaceC4444d1
    /* renamed from: c */
    public int mo9934c() {
            r1 = this;
            r0 = 0
            r1.m10122S(r0)
            m9.i r0 = r1.f18178a
            int r0 = r0.mo10084l()
            return r0
    }

    @Override // p221m9.InterfaceC4444d1
    /* renamed from: d */
    public long mo9935d() {
            r2 = this;
            r0 = 0
            r2.m10122S(r0)
            m9.i r0 = r2.f18178a
            long r0 = r0.mo10098z()
            return r0
    }

    @Override // p221m9.InterfaceC4444d1
    /* renamed from: e */
    public void mo9936e(java.util.List<java.lang.Integer> r5) {
            r4 = this;
            boolean r0 = r5 instanceof p221m9.C4503y
            r1 = 5
            r2 = 2
            if (r0 == 0) goto L58
            r0 = r5
            m9.y r0 = (p221m9.C4503y) r0
            int r5 = r4.f18179b
            r5 = r5 & 7
            if (r5 == r2) goto L35
            if (r5 != r1) goto L30
        L11:
            m9.i r5 = r4.f18178a
            int r5 = r5.mo10085m()
            r0.m10381e(r5)
            m9.i r5 = r4.f18178a
            boolean r5 = r5.mo10078e()
            if (r5 == 0) goto L23
            return
        L23:
            m9.i r5 = r4.f18178a
            int r5 = r5.mo10096x()
            int r1 = r4.f18179b
            if (r5 == r1) goto L11
            r4.f18181d = r5
            return
        L30:
            m9.a0$a r5 = p221m9.C4434a0.m9898d()
            throw r5
        L35:
            m9.i r5 = r4.f18178a
            int r5 = r5.mo10097y()
            r4.m10123T(r5)
            m9.i r1 = r4.f18178a
            int r1 = r1.mo10077d()
            int r3 = r1 + r5
        L46:
            m9.i r5 = r4.f18178a
            int r5 = r5.mo10085m()
            r0.m10381e(r5)
            m9.i r5 = r4.f18178a
            int r5 = r5.mo10077d()
            if (r5 < r3) goto L46
            goto Lad
        L58:
            int r0 = r4.f18179b
            r0 = r0 & 7
            if (r0 == r2) goto L88
            if (r0 != r1) goto L83
        L60:
            m9.i r0 = r4.f18178a
            int r0 = r0.mo10085m()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5.add(r0)
            m9.i r0 = r4.f18178a
            boolean r0 = r0.mo10078e()
            if (r0 == 0) goto L76
            return
        L76:
            m9.i r0 = r4.f18178a
            int r0 = r0.mo10096x()
            int r1 = r4.f18179b
            if (r0 == r1) goto L60
            r4.f18181d = r0
            return
        L83:
            m9.a0$a r5 = p221m9.C4434a0.m9898d()
            throw r5
        L88:
            m9.i r0 = r4.f18178a
            int r0 = r0.mo10097y()
            r4.m10123T(r0)
            m9.i r1 = r4.f18178a
            int r1 = r1.mo10077d()
            int r1 = r1 + r0
        L98:
            m9.i r0 = r4.f18178a
            int r0 = r0.mo10085m()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5.add(r0)
            m9.i r0 = r4.f18178a
            int r0 = r0.mo10077d()
            if (r0 < r1) goto L98
        Lad:
            return
    }

    @Override // p221m9.InterfaceC4444d1
    /* renamed from: f */
    public long mo9937f() {
            r2 = this;
            r0 = 1
            r2.m10122S(r0)
            m9.i r0 = r2.f18178a
            long r0 = r0.mo10086n()
            return r0
    }

    @Override // p221m9.InterfaceC4444d1
    /* renamed from: g */
    public void mo9938g(java.util.List<java.lang.Integer> r5) {
            r4 = this;
            boolean r0 = r5 instanceof p221m9.C4503y
            r1 = 5
            r2 = 2
            if (r0 == 0) goto L58
            r0 = r5
            m9.y r0 = (p221m9.C4503y) r0
            int r5 = r4.f18179b
            r5 = r5 & 7
            if (r5 == r2) goto L35
            if (r5 != r1) goto L30
        L11:
            m9.i r5 = r4.f18178a
            int r5 = r5.mo10090r()
            r0.m10381e(r5)
            m9.i r5 = r4.f18178a
            boolean r5 = r5.mo10078e()
            if (r5 == 0) goto L23
            return
        L23:
            m9.i r5 = r4.f18178a
            int r5 = r5.mo10096x()
            int r1 = r4.f18179b
            if (r5 == r1) goto L11
            r4.f18181d = r5
            return
        L30:
            m9.a0$a r5 = p221m9.C4434a0.m9898d()
            throw r5
        L35:
            m9.i r5 = r4.f18178a
            int r5 = r5.mo10097y()
            r4.m10123T(r5)
            m9.i r1 = r4.f18178a
            int r1 = r1.mo10077d()
            int r3 = r1 + r5
        L46:
            m9.i r5 = r4.f18178a
            int r5 = r5.mo10090r()
            r0.m10381e(r5)
            m9.i r5 = r4.f18178a
            int r5 = r5.mo10077d()
            if (r5 < r3) goto L46
            goto Lad
        L58:
            int r0 = r4.f18179b
            r0 = r0 & 7
            if (r0 == r2) goto L88
            if (r0 != r1) goto L83
        L60:
            m9.i r0 = r4.f18178a
            int r0 = r0.mo10090r()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5.add(r0)
            m9.i r0 = r4.f18178a
            boolean r0 = r0.mo10078e()
            if (r0 == 0) goto L76
            return
        L76:
            m9.i r0 = r4.f18178a
            int r0 = r0.mo10096x()
            int r1 = r4.f18179b
            if (r0 == r1) goto L60
            r4.f18181d = r0
            return
        L83:
            m9.a0$a r5 = p221m9.C4434a0.m9898d()
            throw r5
        L88:
            m9.i r0 = r4.f18178a
            int r0 = r0.mo10097y()
            r4.m10123T(r0)
            m9.i r1 = r4.f18178a
            int r1 = r1.mo10077d()
            int r1 = r1 + r0
        L98:
            m9.i r0 = r4.f18178a
            int r0 = r0.mo10090r()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5.add(r0)
            m9.i r0 = r4.f18178a
            int r0 = r0.mo10077d()
            if (r0 < r1) goto L98
        Lad:
            return
    }

    @Override // p221m9.InterfaceC4444d1
    /* renamed from: h */
    public int mo9939h() {
            r1 = this;
            r0 = 0
            r1.m10122S(r0)
            m9.i r0 = r1.f18178a
            int r0 = r0.mo10092t()
            return r0
    }

    @Override // p221m9.InterfaceC4444d1
    /* renamed from: i */
    public void mo9940i(java.util.List<java.lang.Long> r5) {
            r4 = this;
            boolean r0 = r5 instanceof p221m9.C4455h0
            r1 = 2
            if (r0 == 0) goto L53
            r0 = r5
            m9.h0 r0 = (p221m9.C4455h0) r0
            int r5 = r4.f18179b
            r5 = r5 & 7
            if (r5 == 0) goto L34
            if (r5 != r1) goto L2f
            m9.i r5 = r4.f18178a
            int r5 = r5.mo10097y()
            m9.i r1 = r4.f18178a
            int r1 = r1.mo10077d()
            int r1 = r1 + r5
        L1d:
            m9.i r5 = r4.f18178a
            long r2 = r5.mo10093u()
            r0.m10067e(r2)
            m9.i r5 = r4.f18178a
            int r5 = r5.mo10077d()
            if (r5 < r1) goto L1d
            goto L7d
        L2f:
            m9.a0$a r5 = p221m9.C4434a0.m9898d()
            throw r5
        L34:
            m9.i r5 = r4.f18178a
            long r1 = r5.mo10093u()
            r0.m10067e(r1)
            m9.i r5 = r4.f18178a
            boolean r5 = r5.mo10078e()
            if (r5 == 0) goto L46
            return
        L46:
            m9.i r5 = r4.f18178a
            int r5 = r5.mo10096x()
            int r1 = r4.f18179b
            if (r5 == r1) goto L34
            r4.f18181d = r5
            return
        L53:
            int r0 = r4.f18179b
            r0 = r0 & 7
            if (r0 == 0) goto L86
            if (r0 != r1) goto L81
            m9.i r0 = r4.f18178a
            int r0 = r0.mo10097y()
            m9.i r1 = r4.f18178a
            int r1 = r1.mo10077d()
            int r1 = r1 + r0
        L68:
            m9.i r0 = r4.f18178a
            long r2 = r0.mo10093u()
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r5.add(r0)
            m9.i r0 = r4.f18178a
            int r0 = r0.mo10077d()
            if (r0 < r1) goto L68
        L7d:
            r4.m10121R(r1)
            return
        L81:
            m9.a0$a r5 = p221m9.C4434a0.m9898d()
            throw r5
        L86:
            m9.i r0 = r4.f18178a
            long r0 = r0.mo10093u()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r5.add(r0)
            m9.i r0 = r4.f18178a
            boolean r0 = r0.mo10078e()
            if (r0 == 0) goto L9c
            return
        L9c:
            m9.i r0 = r4.f18178a
            int r0 = r0.mo10096x()
            int r1 = r4.f18179b
            if (r0 == r1) goto L86
            r4.f18181d = r0
            return
    }

    @Override // p221m9.InterfaceC4444d1
    /* renamed from: j */
    public long mo9941j() {
            r2 = this;
            r0 = 0
            r2.m10122S(r0)
            m9.i r0 = r2.f18178a
            long r0 = r0.mo10093u()
            return r0
    }

    @Override // p221m9.InterfaceC4444d1
    /* renamed from: k */
    public void mo9942k(java.util.List<java.lang.Integer> r3) {
            r2 = this;
            boolean r0 = r3 instanceof p221m9.C4503y
            r1 = 2
            if (r0 == 0) goto L53
            r0 = r3
            m9.y r0 = (p221m9.C4503y) r0
            int r3 = r2.f18179b
            r3 = r3 & 7
            if (r3 == 0) goto L34
            if (r3 != r1) goto L2f
            m9.i r3 = r2.f18178a
            int r3 = r3.mo10097y()
            m9.i r1 = r2.f18178a
            int r1 = r1.mo10077d()
            int r1 = r1 + r3
        L1d:
            m9.i r3 = r2.f18178a
            int r3 = r3.mo10097y()
            r0.m10381e(r3)
            m9.i r3 = r2.f18178a
            int r3 = r3.mo10077d()
            if (r3 < r1) goto L1d
            goto L7d
        L2f:
            m9.a0$a r3 = p221m9.C4434a0.m9898d()
            throw r3
        L34:
            m9.i r3 = r2.f18178a
            int r3 = r3.mo10097y()
            r0.m10381e(r3)
            m9.i r3 = r2.f18178a
            boolean r3 = r3.mo10078e()
            if (r3 == 0) goto L46
            return
        L46:
            m9.i r3 = r2.f18178a
            int r3 = r3.mo10096x()
            int r1 = r2.f18179b
            if (r3 == r1) goto L34
            r2.f18181d = r3
            return
        L53:
            int r0 = r2.f18179b
            r0 = r0 & 7
            if (r0 == 0) goto L86
            if (r0 != r1) goto L81
            m9.i r0 = r2.f18178a
            int r0 = r0.mo10097y()
            m9.i r1 = r2.f18178a
            int r1 = r1.mo10077d()
            int r1 = r1 + r0
        L68:
            m9.i r0 = r2.f18178a
            int r0 = r0.mo10097y()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.add(r0)
            m9.i r0 = r2.f18178a
            int r0 = r0.mo10077d()
            if (r0 < r1) goto L68
        L7d:
            r2.m10121R(r1)
            return
        L81:
            m9.a0$a r3 = p221m9.C4434a0.m9898d()
            throw r3
        L86:
            m9.i r0 = r2.f18178a
            int r0 = r0.mo10097y()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.add(r0)
            m9.i r0 = r2.f18178a
            boolean r0 = r0.mo10078e()
            if (r0 == 0) goto L9c
            return
        L9c:
            m9.i r0 = r2.f18178a
            int r0 = r0.mo10096x()
            int r1 = r2.f18179b
            if (r0 == r1) goto L86
            r2.f18181d = r0
            return
    }

    @Override // p221m9.InterfaceC4444d1
    /* renamed from: l */
    public void mo9943l(java.util.List<java.lang.Boolean> r3) {
            r2 = this;
            boolean r0 = r3 instanceof p221m9.C4448f
            r1 = 2
            if (r0 == 0) goto L53
            r0 = r3
            m9.f r0 = (p221m9.C4448f) r0
            int r3 = r2.f18179b
            r3 = r3 & 7
            if (r3 == 0) goto L34
            if (r3 != r1) goto L2f
            m9.i r3 = r2.f18178a
            int r3 = r3.mo10097y()
            m9.i r1 = r2.f18178a
            int r1 = r1.mo10077d()
            int r1 = r1 + r3
        L1d:
            m9.i r3 = r2.f18178a
            boolean r3 = r3.mo10081i()
            r0.m9996e(r3)
            m9.i r3 = r2.f18178a
            int r3 = r3.mo10077d()
            if (r3 < r1) goto L1d
            goto L7d
        L2f:
            m9.a0$a r3 = p221m9.C4434a0.m9898d()
            throw r3
        L34:
            m9.i r3 = r2.f18178a
            boolean r3 = r3.mo10081i()
            r0.m9996e(r3)
            m9.i r3 = r2.f18178a
            boolean r3 = r3.mo10078e()
            if (r3 == 0) goto L46
            return
        L46:
            m9.i r3 = r2.f18178a
            int r3 = r3.mo10096x()
            int r1 = r2.f18179b
            if (r3 == r1) goto L34
            r2.f18181d = r3
            return
        L53:
            int r0 = r2.f18179b
            r0 = r0 & 7
            if (r0 == 0) goto L86
            if (r0 != r1) goto L81
            m9.i r0 = r2.f18178a
            int r0 = r0.mo10097y()
            m9.i r1 = r2.f18178a
            int r1 = r1.mo10077d()
            int r1 = r1 + r0
        L68:
            m9.i r0 = r2.f18178a
            boolean r0 = r0.mo10081i()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r3.add(r0)
            m9.i r0 = r2.f18178a
            int r0 = r0.mo10077d()
            if (r0 < r1) goto L68
        L7d:
            r2.m10121R(r1)
            return
        L81:
            m9.a0$a r3 = p221m9.C4434a0.m9898d()
            throw r3
        L86:
            m9.i r0 = r2.f18178a
            boolean r0 = r0.mo10081i()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r3.add(r0)
            m9.i r0 = r2.f18178a
            boolean r0 = r0.mo10078e()
            if (r0 == 0) goto L9c
            return
        L9c:
            m9.i r0 = r2.f18178a
            int r0 = r0.mo10096x()
            int r1 = r2.f18179b
            if (r0 == r1) goto L86
            r2.f18181d = r0
            return
    }

    @Override // p221m9.InterfaceC4444d1
    /* renamed from: m */
    public int mo9944m() {
            r1 = this;
            int r0 = r1.f18179b
            return r0
    }

    @Override // p221m9.InterfaceC4444d1
    /* renamed from: n */
    public java.lang.String mo9945n() {
            r1 = this;
            r0 = 2
            r1.m10122S(r0)
            m9.i r0 = r1.f18178a
            java.lang.String r0 = r0.mo10094v()
            return r0
    }

    @Override // p221m9.InterfaceC4444d1
    /* renamed from: o */
    public <T> void mo9946o(java.util.List<T> r4, p221m9.InterfaceC4447e1<T> r5, p221m9.C4478p r6) {
            r3 = this;
            int r0 = r3.f18179b
            r1 = r0 & 7
            r2 = 3
            if (r1 != r2) goto L26
        L7:
            java.lang.Object r1 = r3.m10118O(r5, r6)
            r4.add(r1)
            m9.i r1 = r3.f18178a
            boolean r1 = r1.mo10078e()
            if (r1 != 0) goto L25
            int r1 = r3.f18181d
            if (r1 == 0) goto L1b
            goto L25
        L1b:
            m9.i r1 = r3.f18178a
            int r1 = r1.mo10096x()
            if (r1 == r0) goto L7
            r3.f18181d = r1
        L25:
            return
        L26:
            m9.a0$a r4 = p221m9.C4434a0.m9898d()
            throw r4
    }

    @Override // p221m9.InterfaceC4444d1
    /* renamed from: p */
    public int mo9947p() {
            r1 = this;
            r0 = 5
            r1.m10122S(r0)
            m9.i r0 = r1.f18178a
            int r0 = r0.mo10085m()
            return r0
    }

    @Override // p221m9.InterfaceC4444d1
    /* renamed from: q */
    public boolean mo9948q() {
            r1 = this;
            r0 = 0
            r1.m10122S(r0)
            m9.i r0 = r1.f18178a
            boolean r0 = r0.mo10081i()
            return r0
    }

    @Override // p221m9.InterfaceC4444d1
    /* renamed from: r */
    public int mo9949r() {
            r2 = this;
            int r0 = r2.f18181d
            if (r0 == 0) goto La
            r2.f18179b = r0
            r0 = 0
            r2.f18181d = r0
            goto L12
        La:
            m9.i r0 = r2.f18178a
            int r0 = r0.mo10096x()
            r2.f18179b = r0
        L12:
            int r0 = r2.f18179b
            if (r0 == 0) goto L1e
            int r1 = r2.f18180c
            if (r0 != r1) goto L1b
            goto L1e
        L1b:
            int r0 = r0 >>> 3
            return r0
        L1e:
            r0 = 2147483647(0x7fffffff, float:NaN)
            return r0
    }

    @Override // p221m9.InterfaceC4444d1
    public double readDouble() {
            r2 = this;
            r0 = 1
            r2.m10122S(r0)
            m9.i r0 = r2.f18178a
            double r0 = r0.mo10083k()
            return r0
    }

    @Override // p221m9.InterfaceC4444d1
    public float readFloat() {
            r1 = this;
            r0 = 5
            r1.m10122S(r0)
            m9.i r0 = r1.f18178a
            float r0 = r0.mo10087o()
            return r0
    }

    @Override // p221m9.InterfaceC4444d1
    /* renamed from: s */
    public void mo9950s(java.util.List<java.lang.String> r2) {
            r1 = this;
            r0 = 0
            r1.m10120Q(r2, r0)
            return
    }

    @Override // p221m9.InterfaceC4444d1
    /* renamed from: t */
    public long mo9951t() {
            r2 = this;
            r0 = 1
            r2.m10122S(r0)
            m9.i r0 = r2.f18178a
            long r0 = r0.mo10091s()
            return r0
    }

    @Override // p221m9.InterfaceC4444d1
    /* renamed from: u */
    public void mo9952u(java.util.List<java.lang.Long> r5) {
            r4 = this;
            boolean r0 = r5 instanceof p221m9.C4455h0
            r1 = 2
            if (r0 == 0) goto L53
            r0 = r5
            m9.h0 r0 = (p221m9.C4455h0) r0
            int r5 = r4.f18179b
            r5 = r5 & 7
            if (r5 == 0) goto L34
            if (r5 != r1) goto L2f
            m9.i r5 = r4.f18178a
            int r5 = r5.mo10097y()
            m9.i r1 = r4.f18178a
            int r1 = r1.mo10077d()
            int r1 = r1 + r5
        L1d:
            m9.i r5 = r4.f18178a
            long r2 = r5.mo10098z()
            r0.m10067e(r2)
            m9.i r5 = r4.f18178a
            int r5 = r5.mo10077d()
            if (r5 < r1) goto L1d
            goto L7d
        L2f:
            m9.a0$a r5 = p221m9.C4434a0.m9898d()
            throw r5
        L34:
            m9.i r5 = r4.f18178a
            long r1 = r5.mo10098z()
            r0.m10067e(r1)
            m9.i r5 = r4.f18178a
            boolean r5 = r5.mo10078e()
            if (r5 == 0) goto L46
            return
        L46:
            m9.i r5 = r4.f18178a
            int r5 = r5.mo10096x()
            int r1 = r4.f18179b
            if (r5 == r1) goto L34
            r4.f18181d = r5
            return
        L53:
            int r0 = r4.f18179b
            r0 = r0 & 7
            if (r0 == 0) goto L86
            if (r0 != r1) goto L81
            m9.i r0 = r4.f18178a
            int r0 = r0.mo10097y()
            m9.i r1 = r4.f18178a
            int r1 = r1.mo10077d()
            int r1 = r1 + r0
        L68:
            m9.i r0 = r4.f18178a
            long r2 = r0.mo10098z()
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r5.add(r0)
            m9.i r0 = r4.f18178a
            int r0 = r0.mo10077d()
            if (r0 < r1) goto L68
        L7d:
            r4.m10121R(r1)
            return
        L81:
            m9.a0$a r5 = p221m9.C4434a0.m9898d()
            throw r5
        L86:
            m9.i r0 = r4.f18178a
            long r0 = r0.mo10098z()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r5.add(r0)
            m9.i r0 = r4.f18178a
            boolean r0 = r0.mo10078e()
            if (r0 == 0) goto L9c
            return
        L9c:
            m9.i r0 = r4.f18178a
            int r0 = r0.mo10096x()
            int r1 = r4.f18179b
            if (r0 == r1) goto L86
            r4.f18181d = r0
            return
    }

    @Override // p221m9.InterfaceC4444d1
    /* renamed from: v */
    public void mo9953v(java.util.List<java.lang.String> r2) {
            r1 = this;
            r0 = 1
            r1.m10120Q(r2, r0)
            return
    }

    @Override // p221m9.InterfaceC4444d1
    /* renamed from: w */
    public p221m9.AbstractC4454h mo9954w() {
            r1 = this;
            r0 = 2
            r1.m10122S(r0)
            m9.i r0 = r1.f18178a
            m9.h r0 = r0.mo10082j()
            return r0
    }

    @Override // p221m9.InterfaceC4444d1
    /* renamed from: x */
    public void mo9955x(java.util.List<java.lang.Float> r5) {
            r4 = this;
            boolean r0 = r5 instanceof p221m9.C4496v
            r1 = 5
            r2 = 2
            if (r0 == 0) goto L58
            r0 = r5
            m9.v r0 = (p221m9.C4496v) r0
            int r5 = r4.f18179b
            r5 = r5 & 7
            if (r5 == r2) goto L35
            if (r5 != r1) goto L30
        L11:
            m9.i r5 = r4.f18178a
            float r5 = r5.mo10087o()
            r0.m10362e(r5)
            m9.i r5 = r4.f18178a
            boolean r5 = r5.mo10078e()
            if (r5 == 0) goto L23
            return
        L23:
            m9.i r5 = r4.f18178a
            int r5 = r5.mo10096x()
            int r1 = r4.f18179b
            if (r5 == r1) goto L11
            r4.f18181d = r5
            return
        L30:
            m9.a0$a r5 = p221m9.C4434a0.m9898d()
            throw r5
        L35:
            m9.i r5 = r4.f18178a
            int r5 = r5.mo10097y()
            r4.m10123T(r5)
            m9.i r1 = r4.f18178a
            int r1 = r1.mo10077d()
            int r3 = r1 + r5
        L46:
            m9.i r5 = r4.f18178a
            float r5 = r5.mo10087o()
            r0.m10362e(r5)
            m9.i r5 = r4.f18178a
            int r5 = r5.mo10077d()
            if (r5 < r3) goto L46
            goto Lad
        L58:
            int r0 = r4.f18179b
            r0 = r0 & 7
            if (r0 == r2) goto L88
            if (r0 != r1) goto L83
        L60:
            m9.i r0 = r4.f18178a
            float r0 = r0.mo10087o()
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r5.add(r0)
            m9.i r0 = r4.f18178a
            boolean r0 = r0.mo10078e()
            if (r0 == 0) goto L76
            return
        L76:
            m9.i r0 = r4.f18178a
            int r0 = r0.mo10096x()
            int r1 = r4.f18179b
            if (r0 == r1) goto L60
            r4.f18181d = r0
            return
        L83:
            m9.a0$a r5 = p221m9.C4434a0.m9898d()
            throw r5
        L88:
            m9.i r0 = r4.f18178a
            int r0 = r0.mo10097y()
            r4.m10123T(r0)
            m9.i r1 = r4.f18178a
            int r1 = r1.mo10077d()
            int r1 = r1 + r0
        L98:
            m9.i r0 = r4.f18178a
            float r0 = r0.mo10087o()
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r5.add(r0)
            m9.i r0 = r4.f18178a
            int r0 = r0.mo10077d()
            if (r0 < r1) goto L98
        Lad:
            return
    }

    @Override // p221m9.InterfaceC4444d1
    /* renamed from: y */
    public int mo9956y() {
            r1 = this;
            r0 = 0
            r1.m10122S(r0)
            m9.i r0 = r1.f18178a
            int r0 = r0.mo10097y()
            return r0
    }

    @Override // p221m9.InterfaceC4444d1
    /* renamed from: z */
    public int mo9957z() {
            r1 = this;
            r0 = 0
            r1.m10122S(r0)
            m9.i r0 = r1.f18178a
            int r0 = r0.mo10088p()
            return r0
    }
}
