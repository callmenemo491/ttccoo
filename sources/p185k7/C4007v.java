package p185k7;

/* renamed from: k7.v */
/* loaded from: classes.dex */
public final class C4007v extends p185k7.AbstractC3994u {

    /* renamed from: b */
    public final /* synthetic */ int f16901b;

    public C4007v(int r2) {
            r1 = this;
            r1.f16901b = r2
            r0 = 1
            if (r2 == r0) goto L41
            r1.<init>()
            java.util.List<k7.b0> r2 = r1.f16877a
            k7.b0 r0 = p185k7.EnumC3739b0.f16522u0
            r2.add(r0)
            java.util.List<k7.b0> r2 = r1.f16877a
            k7.b0 r0 = p185k7.EnumC3739b0.f16471H0
            r2.add(r0)
            java.util.List<k7.b0> r2 = r1.f16877a
            k7.b0 r0 = p185k7.EnumC3739b0.f16472I0
            r2.add(r0)
            java.util.List<k7.b0> r2 = r1.f16877a
            k7.b0 r0 = p185k7.EnumC3739b0.f16473J0
            r2.add(r0)
            java.util.List<k7.b0> r2 = r1.f16877a
            k7.b0 r0 = p185k7.EnumC3739b0.f16474K0
            r2.add(r0)
            java.util.List<k7.b0> r2 = r1.f16877a
            k7.b0 r0 = p185k7.EnumC3739b0.f16476M0
            r2.add(r0)
            java.util.List<k7.b0> r2 = r1.f16877a
            k7.b0 r0 = p185k7.EnumC3739b0.f16477N0
            r2.add(r0)
            java.util.List<k7.b0> r2 = r1.f16877a
            k7.b0 r0 = p185k7.EnumC3739b0.f16482S0
            r2.add(r0)
            return
        L41:
            r1.<init>()
            java.util.List<k7.b0> r2 = r1.f16877a
            k7.b0 r0 = p185k7.EnumC3739b0.f16525x0
            r2.add(r0)
            java.util.List<k7.b0> r2 = r1.f16877a
            k7.b0 r0 = p185k7.EnumC3739b0.f16526y0
            r2.add(r0)
            java.util.List<k7.b0> r2 = r1.f16877a
            k7.b0 r0 = p185k7.EnumC3739b0.f16527z0
            r2.add(r0)
            java.util.List<k7.b0> r2 = r1.f16877a
            k7.b0 r0 = p185k7.EnumC3739b0.f16464A0
            r2.add(r0)
            java.util.List<k7.b0> r2 = r1.f16877a
            k7.b0 r0 = p185k7.EnumC3739b0.f16465B0
            r2.add(r0)
            java.util.List<k7.b0> r2 = r1.f16877a
            k7.b0 r0 = p185k7.EnumC3739b0.f16466C0
            r2.add(r0)
            java.util.List<k7.b0> r2 = r1.f16877a
            k7.b0 r0 = p185k7.EnumC3739b0.f16467D0
            r2.add(r0)
            java.util.List<k7.b0> r2 = r1.f16877a
            k7.b0 r0 = p185k7.EnumC3739b0.f16508i1
            r2.add(r0)
            return
    }

    /* renamed from: c */
    public static p185k7.InterfaceC3916o m9066c(p185k7.InterfaceC4059z r4, java.util.Iterator<p185k7.InterfaceC3916o> r5, p185k7.InterfaceC3916o r6) {
            if (r5 == 0) goto L66
        L2:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L66
            java.lang.Object r0 = r5.next()
            k7.o r0 = (p185k7.InterfaceC3916o) r0
            r1 = r4
            k7.y r1 = (p185k7.C4046y) r1
            int r2 = r1.f16957a
            switch(r2) {
                case 0: goto L23;
                case 1: goto L17;
                default: goto L16;
            }
        L16:
            goto L38
        L17:
            v.c r2 = r1.f16958b
            v.c r2 = r2.m13116h()
            java.lang.String r1 = r1.f16959c
            r2.m13120l(r1, r0)
            goto L41
        L23:
            v.c r2 = r1.f16958b
            v.c r2 = r2.m13116h()
            java.lang.String r1 = r1.f16959c
            r2.m13120l(r1, r0)
            java.lang.Object r0 = r2.f25078b0
            java.util.Map r0 = (java.util.Map) r0
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            r0.put(r1, r3)
            goto L41
        L38:
            v.c r2 = r1.f16958b
            java.lang.String r3 = r1.f16959c
            r2.m13120l(r3, r0)
            v.c r2 = r1.f16958b
        L41:
            r0 = r6
            k7.d r0 = (p185k7.C3766d) r0
            k7.o r0 = r2.m13118j(r0)
            boolean r1 = r0 instanceof p185k7.C3794f
            if (r1 == 0) goto L2
            k7.f r0 = (p185k7.C3794f) r0
            java.lang.String r1 = r0.f16622Z
            java.lang.String r2 = "break"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L5b
            k7.o r4 = p185k7.InterfaceC3916o.f16782G
            return r4
        L5b:
            java.lang.String r1 = r0.f16622Z
            java.lang.String r2 = "return"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L2
            return r0
        L66:
            k7.o r4 = p185k7.InterfaceC3916o.f16782G
            return r4
    }

    /* renamed from: d */
    public static boolean m9067d(p185k7.InterfaceC3916o r4, p185k7.InterfaceC3916o r5) {
            java.lang.Class r0 = r4.getClass()
            java.lang.Class r1 = r5.getClass()
            boolean r0 = r0.equals(r1)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L6f
            boolean r0 = r4 instanceof p185k7.C3968s
            if (r0 != 0) goto L6e
            boolean r0 = r4 instanceof p185k7.C3890m
            if (r0 == 0) goto L19
            goto L6e
        L19:
            boolean r0 = r4 instanceof p185k7.C3808g
            if (r0 == 0) goto L48
            java.lang.Double r0 = r4.mo8355g()
            double r2 = r0.doubleValue()
            boolean r0 = java.lang.Double.isNaN(r2)
            if (r0 != 0) goto L47
            java.lang.Double r0 = r5.mo8355g()
            double r2 = r0.doubleValue()
            boolean r0 = java.lang.Double.isNaN(r2)
            if (r0 == 0) goto L3a
            goto L47
        L3a:
            java.lang.Double r4 = r4.mo8355g()
            java.lang.Double r5 = r5.mo8355g()
            boolean r4 = r4.equals(r5)
            return r4
        L47:
            return r1
        L48:
            boolean r0 = r4 instanceof p185k7.C3955r
            if (r0 == 0) goto L59
            java.lang.String r4 = r4.mo8357i()
            java.lang.String r5 = r5.mo8357i()
            boolean r4 = r4.equals(r5)
            return r4
        L59:
            boolean r0 = r4 instanceof p185k7.C3780e
            if (r0 == 0) goto L6a
            java.lang.Boolean r4 = r4.mo8353e()
            java.lang.Boolean r5 = r5.mo8353e()
            boolean r4 = r4.equals(r5)
            return r4
        L6a:
            if (r4 != r5) goto L6d
            return r2
        L6d:
            return r1
        L6e:
            return r2
        L6f:
            boolean r0 = r4 instanceof p185k7.C3968s
            if (r0 != 0) goto L77
            boolean r0 = r4 instanceof p185k7.C3890m
            if (r0 == 0) goto L7f
        L77:
            boolean r0 = r5 instanceof p185k7.C3968s
            if (r0 != 0) goto L102
            boolean r0 = r5 instanceof p185k7.C3890m
            if (r0 != 0) goto L102
        L7f:
            boolean r0 = r4 instanceof p185k7.C3808g
            if (r0 == 0) goto L96
            boolean r2 = r5 instanceof p185k7.C3955r
            if (r2 != 0) goto L88
            goto L96
        L88:
            k7.g r0 = new k7.g
            java.lang.Double r5 = r5.mo8355g()
            r0.<init>(r5)
            boolean r4 = m9067d(r4, r0)
            return r4
        L96:
            boolean r2 = r4 instanceof p185k7.C3955r
            if (r2 == 0) goto Lad
            boolean r3 = r5 instanceof p185k7.C3808g
            if (r3 != 0) goto L9f
            goto Lad
        L9f:
            k7.g r0 = new k7.g
            java.lang.Double r4 = r4.mo8355g()
            r0.<init>(r4)
            boolean r4 = m9067d(r0, r5)
            return r4
        Lad:
            boolean r3 = r4 instanceof p185k7.C3780e
            if (r3 == 0) goto Lbf
            k7.g r0 = new k7.g
            java.lang.Double r4 = r4.mo8355g()
            r0.<init>(r4)
            boolean r4 = m9067d(r0, r5)
            return r4
        Lbf:
            boolean r3 = r5 instanceof p185k7.C3780e
            if (r3 == 0) goto Ld1
            k7.g r0 = new k7.g
            java.lang.Double r5 = r5.mo8355g()
            r0.<init>(r5)
            boolean r4 = m9067d(r4, r0)
            return r4
        Ld1:
            if (r2 != 0) goto Ld5
            if (r0 == 0) goto Ld9
        Ld5:
            boolean r0 = r5 instanceof p185k7.InterfaceC3864k
            if (r0 != 0) goto Lf4
        Ld9:
            boolean r0 = r4 instanceof p185k7.InterfaceC3864k
            if (r0 == 0) goto Lf3
            boolean r0 = r5 instanceof p185k7.C3955r
            if (r0 != 0) goto Le5
            boolean r0 = r5 instanceof p185k7.C3808g
            if (r0 == 0) goto Lf3
        Le5:
            k7.r r0 = new k7.r
            java.lang.String r4 = r4.mo8357i()
            r0.<init>(r4)
            boolean r4 = m9067d(r0, r5)
            return r4
        Lf3:
            return r1
        Lf4:
            k7.r r0 = new k7.r
            java.lang.String r5 = r5.mo8357i()
            r0.<init>(r5)
            boolean r4 = m9067d(r4, r0)     // Catch: java.lang.Throwable -> L103
            return r4
        L102:
            return r2
        L103:
            r4 = move-exception
            throw r4
    }

    /* renamed from: e */
    public static p185k7.InterfaceC3916o m9068e(p185k7.InterfaceC4059z r0, p185k7.InterfaceC3916o r1, p185k7.InterfaceC3916o r2) {
            java.util.Iterator r1 = r1.mo8360n()
            k7.o r0 = m9066c(r0, r1, r2)
            return r0
    }

    /* renamed from: f */
    public static boolean m9069f(p185k7.InterfaceC3916o r5, p185k7.InterfaceC3916o r6) {
            boolean r0 = r5 instanceof p185k7.InterfaceC3864k
            if (r0 == 0) goto Le
            k7.r r0 = new k7.r
            java.lang.String r5 = r5.mo8357i()
            r0.<init>(r5)
            r5 = r0
        Le:
            boolean r0 = r6 instanceof p185k7.InterfaceC3864k
            if (r0 == 0) goto L1c
            k7.r r0 = new k7.r
            java.lang.String r6 = r6.mo8357i()
            r0.<init>(r6)
            r6 = r0
        L1c:
            boolean r0 = r5 instanceof p185k7.C3955r
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L37
            boolean r0 = r6 instanceof p185k7.C3955r
            if (r0 != 0) goto L27
            goto L37
        L27:
            java.lang.String r5 = r5.mo8357i()
            java.lang.String r6 = r6.mo8357i()
            int r5 = r5.compareTo(r6)
            if (r5 >= 0) goto L36
            return r1
        L36:
            return r2
        L37:
            java.lang.Double r5 = r5.mo8355g()
            double r3 = r5.doubleValue()
            java.lang.Double r5 = r6.mo8355g()
            double r5 = r5.doubleValue()
            boolean r0 = java.lang.Double.isNaN(r3)
            if (r0 != 0) goto L5b
            boolean r0 = java.lang.Double.isNaN(r5)
            if (r0 == 0) goto L54
            goto L5b
        L54:
            int r5 = java.lang.Double.compare(r3, r5)
            if (r5 >= 0) goto L5b
            return r1
        L5b:
            return r2
    }

    /* renamed from: g */
    public static p185k7.InterfaceC3916o m9070g(p185k7.InterfaceC4059z r1, p185k7.InterfaceC3916o r2, p185k7.InterfaceC3916o r3) {
            boolean r0 = r2 instanceof java.lang.Iterable
            if (r0 == 0) goto Lf
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r2 = r2.iterator()
            k7.o r1 = m9066c(r1, r2, r3)
            return r1
        Lf:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Non-iterable type in for...of loop."
            r1.<init>(r2)
            throw r1
    }

    /* renamed from: h */
    public static boolean m9071h(p185k7.InterfaceC3916o r4, p185k7.InterfaceC3916o r5) {
            boolean r0 = r4 instanceof p185k7.InterfaceC3864k
            if (r0 == 0) goto Le
            k7.r r0 = new k7.r
            java.lang.String r4 = r4.mo8357i()
            r0.<init>(r4)
            r4 = r0
        Le:
            boolean r0 = r5 instanceof p185k7.InterfaceC3864k
            if (r0 == 0) goto L1c
            k7.r r0 = new k7.r
            java.lang.String r5 = r5.mo8357i()
            r0.<init>(r5)
            r5 = r0
        L1c:
            boolean r0 = r4 instanceof p185k7.C3955r
            r1 = 0
            if (r0 == 0) goto L25
            boolean r0 = r5 instanceof p185k7.C3955r
            if (r0 != 0) goto L41
        L25:
            java.lang.Double r0 = r4.mo8355g()
            double r2 = r0.doubleValue()
            boolean r0 = java.lang.Double.isNaN(r2)
            if (r0 != 0) goto L49
            java.lang.Double r0 = r5.mo8355g()
            double r2 = r0.doubleValue()
            boolean r0 = java.lang.Double.isNaN(r2)
            if (r0 != 0) goto L49
        L41:
            boolean r4 = m9069f(r5, r4)
            if (r4 != 0) goto L49
            r4 = 1
            return r4
        L49:
            return r1
    }

    @Override // p185k7.AbstractC3994u
    /* renamed from: a */
    public final p185k7.InterfaceC3916o mo8180a(java.lang.String r11, p365v.C6476c r12, java.util.List r13) {
            r10 = this;
            int r0 = r10.f16901b
            r1 = 0
            r2 = 0
            r3 = 1
            r4 = 2
            switch(r0) {
                case 0: goto Lb;
                default: goto L9;
            }
        L9:
            goto L79
        Lb:
            k7.b0 r0 = p124h7.C2939x3.m7257G(r11)
            java.lang.String r0 = r0.name()
            p124h7.C2939x3.m7264N(r0, r4, r13)
            java.lang.Object r0 = r13.get(r2)
            k7.o r0 = (p185k7.InterfaceC3916o) r0
            k7.o r0 = r12.m13117i(r0)
            java.lang.Object r13 = r13.get(r3)
            k7.o r13 = (p185k7.InterfaceC3916o) r13
            k7.o r12 = r12.m13117i(r13)
            k7.b0 r13 = p124h7.C2939x3.m7257G(r11)
            int r13 = r13.ordinal()
            r2 = 23
            if (r13 == r2) goto L6d
            r2 = 48
            if (r13 == r2) goto L67
            r2 = 42
            if (r13 == r2) goto L62
            r2 = 43
            if (r13 == r2) goto L5d
            switch(r13) {
                case 37: goto L58;
                case 38: goto L53;
                case 39: goto L4e;
                case 40: goto L49;
                default: goto L45;
            }
        L45:
            r10.m9020b(r11)
            throw r1
        L49:
            boolean r11 = p124h7.C2939x3.m7272V(r0, r12)
            goto L6b
        L4e:
            boolean r11 = p124h7.C2939x3.m7272V(r0, r12)
            goto L71
        L53:
            boolean r11 = m9071h(r12, r0)
            goto L71
        L58:
            boolean r11 = m9069f(r12, r0)
            goto L71
        L5d:
            boolean r11 = m9071h(r0, r12)
            goto L71
        L62:
            boolean r11 = m9069f(r0, r12)
            goto L71
        L67:
            boolean r11 = m9067d(r0, r12)
        L6b:
            r11 = r11 ^ r3
            goto L71
        L6d:
            boolean r11 = m9067d(r0, r12)
        L71:
            if (r11 == 0) goto L76
            k7.o r11 = p185k7.InterfaceC3916o.f16787L
            goto L78
        L76:
            k7.o r11 = p185k7.InterfaceC3916o.f16788M
        L78:
            return r11
        L79:
            k7.b0 r0 = p185k7.EnumC3739b0.f16489Z
            k7.b0 r0 = p124h7.C2939x3.m7257G(r11)
            int r0 = r0.ordinal()
            r5 = 65
            r6 = 4
            java.lang.String r7 = "return"
            java.lang.String r8 = "break"
            r9 = 3
            if (r0 == r5) goto L2a4
            switch(r0) {
                case 26: goto L264;
                case 27: goto L229;
                case 28: goto L1ee;
                case 29: goto L14a;
                case 30: goto L10a;
                case 31: goto Lcf;
                case 32: goto L94;
                default: goto L90;
            }
        L90:
            r10.m9020b(r11)
            throw r1
        L94:
            k7.b0 r11 = p185k7.EnumC3739b0.f16467D0
            java.lang.String r11 = "FOR_OF_LET"
            p124h7.C2939x3.m7264N(r11, r9, r13)
            java.lang.Object r11 = r13.get(r2)
            boolean r11 = r11 instanceof p185k7.C3955r
            if (r11 == 0) goto Lc7
            java.lang.Object r11 = r13.get(r2)
            k7.o r11 = (p185k7.InterfaceC3916o) r11
            java.lang.String r11 = r11.mo8357i()
            java.lang.Object r0 = r13.get(r3)
            k7.o r0 = (p185k7.InterfaceC3916o) r0
            k7.o r0 = r12.m13117i(r0)
            java.lang.Object r13 = r13.get(r4)
            k7.o r13 = (p185k7.InterfaceC3916o) r13
            k7.o r13 = r12.m13117i(r13)
            k7.y r1 = new k7.y
            r1.<init>(r12, r11, r3)
            goto L13c
        Lc7:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r12 = "Variable name in FOR_OF_LET must be a string"
            r11.<init>(r12)
            throw r11
        Lcf:
            k7.b0 r11 = p185k7.EnumC3739b0.f16466C0
            java.lang.String r11 = "FOR_OF_CONST"
            p124h7.C2939x3.m7264N(r11, r9, r13)
            java.lang.Object r11 = r13.get(r2)
            boolean r11 = r11 instanceof p185k7.C3955r
            if (r11 == 0) goto L102
            java.lang.Object r11 = r13.get(r2)
            k7.o r11 = (p185k7.InterfaceC3916o) r11
            java.lang.String r11 = r11.mo8357i()
            java.lang.Object r0 = r13.get(r3)
            k7.o r0 = (p185k7.InterfaceC3916o) r0
            k7.o r0 = r12.m13117i(r0)
            java.lang.Object r13 = r13.get(r4)
            k7.o r13 = (p185k7.InterfaceC3916o) r13
            k7.o r13 = r12.m13117i(r13)
            k7.y r1 = new k7.y
            r1.<init>(r12, r11, r2)
            goto L13c
        L102:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r12 = "Variable name in FOR_OF_CONST must be a string"
            r11.<init>(r12)
            throw r11
        L10a:
            k7.b0 r11 = p185k7.EnumC3739b0.f16465B0
            java.lang.String r11 = "FOR_OF"
            p124h7.C2939x3.m7264N(r11, r9, r13)
            java.lang.Object r11 = r13.get(r2)
            boolean r11 = r11 instanceof p185k7.C3955r
            if (r11 == 0) goto L142
            java.lang.Object r11 = r13.get(r2)
            k7.o r11 = (p185k7.InterfaceC3916o) r11
            java.lang.String r11 = r11.mo8357i()
            java.lang.Object r0 = r13.get(r3)
            k7.o r0 = (p185k7.InterfaceC3916o) r0
            k7.o r0 = r12.m13117i(r0)
            java.lang.Object r13 = r13.get(r4)
            k7.o r13 = (p185k7.InterfaceC3916o) r13
            k7.o r13 = r12.m13117i(r13)
            k7.y r1 = new k7.y
            r1.<init>(r12, r11, r4)
        L13c:
            k7.o r11 = m9070g(r1, r0, r13)
            goto L329
        L142:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r12 = "Variable name in FOR_OF must be a string"
            r11.<init>(r12)
            throw r11
        L14a:
            k7.b0 r11 = p185k7.EnumC3739b0.f16464A0
            java.lang.String r11 = "FOR_LET"
            p124h7.C2939x3.m7264N(r11, r6, r13)
            java.lang.Object r11 = r13.get(r2)
            k7.o r11 = (p185k7.InterfaceC3916o) r11
            k7.o r11 = r12.m13117i(r11)
            boolean r0 = r11 instanceof p185k7.C3766d
            if (r0 == 0) goto L1e6
            k7.d r11 = (p185k7.C3766d) r11
            java.lang.Object r0 = r13.get(r3)
            k7.o r0 = (p185k7.InterfaceC3916o) r0
            java.lang.Object r1 = r13.get(r4)
            k7.o r1 = (p185k7.InterfaceC3916o) r1
            java.lang.Object r13 = r13.get(r9)
            k7.o r13 = (p185k7.InterfaceC3916o) r13
            k7.o r13 = r12.m13117i(r13)
            v.c r3 = r12.m13116h()
            r4 = 0
        L17c:
            int r5 = r11.m8359m()
            if (r4 >= r5) goto L194
            k7.o r5 = r11.m8362q(r4)
            java.lang.String r5 = r5.mo8357i()
            k7.o r6 = r12.m13119k(r5)
            r3.m13121m(r5, r6)
            int r4 = r4 + 1
            goto L17c
        L194:
            k7.o r4 = r12.m13117i(r0)
            java.lang.Boolean r4 = r4.mo8353e()
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L327
            r4 = r13
            k7.d r4 = (p185k7.C3766d) r4
            k7.o r4 = r12.m13118j(r4)
            boolean r5 = r4 instanceof p185k7.C3794f
            if (r5 == 0) goto L1c4
            k7.f r4 = (p185k7.C3794f) r4
            java.lang.String r5 = r4.f16622Z
            boolean r5 = r8.equals(r5)
            if (r5 == 0) goto L1b9
            goto L327
        L1b9:
            java.lang.String r5 = r4.f16622Z
            boolean r5 = r7.equals(r5)
            if (r5 == 0) goto L1c4
            r11 = r4
            goto L329
        L1c4:
            v.c r4 = r12.m13116h()
            r5 = 0
        L1c9:
            int r6 = r11.m8359m()
            if (r5 >= r6) goto L1e1
            k7.o r6 = r11.m8362q(r5)
            java.lang.String r6 = r6.mo8357i()
            k7.o r9 = r3.m13119k(r6)
            r4.m13121m(r6, r9)
            int r5 = r5 + 1
            goto L1c9
        L1e1:
            r4.m13117i(r1)
            r3 = r4
            goto L194
        L1e6:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r12 = "Initializer variables in FOR_LET must be an ArrayList"
            r11.<init>(r12)
            throw r11
        L1ee:
            k7.b0 r11 = p185k7.EnumC3739b0.f16527z0
            java.lang.String r11 = "FOR_IN_LET"
            p124h7.C2939x3.m7264N(r11, r9, r13)
            java.lang.Object r11 = r13.get(r2)
            boolean r11 = r11 instanceof p185k7.C3955r
            if (r11 == 0) goto L221
            java.lang.Object r11 = r13.get(r2)
            k7.o r11 = (p185k7.InterfaceC3916o) r11
            java.lang.String r11 = r11.mo8357i()
            java.lang.Object r0 = r13.get(r3)
            k7.o r0 = (p185k7.InterfaceC3916o) r0
            k7.o r0 = r12.m13117i(r0)
            java.lang.Object r13 = r13.get(r4)
            k7.o r13 = (p185k7.InterfaceC3916o) r13
            k7.o r13 = r12.m13117i(r13)
            k7.y r1 = new k7.y
            r1.<init>(r12, r11, r3)
            goto L296
        L221:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r12 = "Variable name in FOR_IN_LET must be a string"
            r11.<init>(r12)
            throw r11
        L229:
            k7.b0 r11 = p185k7.EnumC3739b0.f16526y0
            java.lang.String r11 = "FOR_IN_CONST"
            p124h7.C2939x3.m7264N(r11, r9, r13)
            java.lang.Object r11 = r13.get(r2)
            boolean r11 = r11 instanceof p185k7.C3955r
            if (r11 == 0) goto L25c
            java.lang.Object r11 = r13.get(r2)
            k7.o r11 = (p185k7.InterfaceC3916o) r11
            java.lang.String r11 = r11.mo8357i()
            java.lang.Object r0 = r13.get(r3)
            k7.o r0 = (p185k7.InterfaceC3916o) r0
            k7.o r0 = r12.m13117i(r0)
            java.lang.Object r13 = r13.get(r4)
            k7.o r13 = (p185k7.InterfaceC3916o) r13
            k7.o r13 = r12.m13117i(r13)
            k7.y r1 = new k7.y
            r1.<init>(r12, r11, r2)
            goto L296
        L25c:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r12 = "Variable name in FOR_IN_CONST must be a string"
            r11.<init>(r12)
            throw r11
        L264:
            k7.b0 r11 = p185k7.EnumC3739b0.f16525x0
            java.lang.String r11 = "FOR_IN"
            p124h7.C2939x3.m7264N(r11, r9, r13)
            java.lang.Object r11 = r13.get(r2)
            boolean r11 = r11 instanceof p185k7.C3955r
            if (r11 == 0) goto L29c
            java.lang.Object r11 = r13.get(r2)
            k7.o r11 = (p185k7.InterfaceC3916o) r11
            java.lang.String r11 = r11.mo8357i()
            java.lang.Object r0 = r13.get(r3)
            k7.o r0 = (p185k7.InterfaceC3916o) r0
            k7.o r0 = r12.m13117i(r0)
            java.lang.Object r13 = r13.get(r4)
            k7.o r13 = (p185k7.InterfaceC3916o) r13
            k7.o r13 = r12.m13117i(r13)
            k7.y r1 = new k7.y
            r1.<init>(r12, r11, r4)
        L296:
            k7.o r11 = m9068e(r1, r0, r13)
            goto L329
        L29c:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r12 = "Variable name in FOR_IN must be a string"
            r11.<init>(r12)
            throw r11
        L2a4:
            k7.b0 r11 = p185k7.EnumC3739b0.f16508i1
            java.lang.String r11 = "WHILE"
            p124h7.C2939x3.m7264N(r11, r6, r13)
            java.lang.Object r11 = r13.get(r2)
            k7.o r11 = (p185k7.InterfaceC3916o) r11
            java.lang.Object r0 = r13.get(r3)
            k7.o r0 = (p185k7.InterfaceC3916o) r0
            java.lang.Object r1 = r13.get(r4)
            k7.o r1 = (p185k7.InterfaceC3916o) r1
            java.lang.Object r13 = r13.get(r9)
            k7.o r13 = (p185k7.InterfaceC3916o) r13
            k7.o r13 = r12.m13117i(r13)
            k7.o r1 = r12.m13117i(r1)
            java.lang.Boolean r1 = r1.mo8353e()
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L2d6
            goto L2f6
        L2d6:
            r1 = r13
            k7.d r1 = (p185k7.C3766d) r1
            k7.o r1 = r12.m13118j(r1)
            boolean r2 = r1 instanceof p185k7.C3794f
            if (r2 == 0) goto L2f6
            k7.f r1 = (p185k7.C3794f) r1
            java.lang.String r2 = r1.f16622Z
            boolean r2 = r8.equals(r2)
            if (r2 == 0) goto L2ec
            goto L327
        L2ec:
            java.lang.String r2 = r1.f16622Z
            boolean r2 = r7.equals(r2)
            if (r2 == 0) goto L2f6
        L2f4:
            r11 = r1
            goto L329
        L2f6:
            k7.o r1 = r12.m13117i(r11)
            java.lang.Boolean r1 = r1.mo8353e()
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L327
            r1 = r13
            k7.d r1 = (p185k7.C3766d) r1
            k7.o r1 = r12.m13118j(r1)
            boolean r2 = r1 instanceof p185k7.C3794f
            if (r2 == 0) goto L323
            k7.f r1 = (p185k7.C3794f) r1
            java.lang.String r2 = r1.f16622Z
            boolean r2 = r8.equals(r2)
            if (r2 == 0) goto L31a
            goto L327
        L31a:
            java.lang.String r2 = r1.f16622Z
            boolean r2 = r7.equals(r2)
            if (r2 == 0) goto L323
            goto L2f4
        L323:
            r12.m13117i(r0)
            goto L2f6
        L327:
            k7.o r11 = p185k7.InterfaceC3916o.f16782G
        L329:
            return r11
    }
}
