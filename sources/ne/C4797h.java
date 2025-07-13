package ne;

/* renamed from: ne.h */
/* loaded from: classes.dex */
public final class C4797h extends androidx.lifecycle.AbstractC0457n0 {

    /* renamed from: c */
    public final p238nd.C4728b0 f19177c;

    /* renamed from: d */
    public final ch.InterfaceC0977d f19178d;

    /* renamed from: e */
    public final androidx.lifecycle.C0437d0<java.lang.Boolean> f19179e;

    /* renamed from: f */
    public final androidx.lifecycle.LiveData<java.lang.Boolean> f19180f;

    /* renamed from: g */
    public final androidx.lifecycle.C0437d0<vg.C6661b<p013ah.C0100a>> f19181g;

    /* renamed from: h */
    public final androidx.lifecycle.C0437d0<vg.C6661b<ch.C0985l>> f19182h;

    /* renamed from: i */
    public final androidx.lifecycle.C0437d0<me.C4595c> f19183i;

    /* renamed from: j */
    public final androidx.lifecycle.LiveData<me.C4595c> f19184j;

    /* renamed from: k */
    public final androidx.lifecycle.C0437d0<p255od.C5194b0> f19185k;

    /* renamed from: l */
    public final androidx.lifecycle.LiveData<p255od.C5194b0> f19186l;

    /* renamed from: m */
    public final androidx.lifecycle.C0437d0<p255od.C5194b0> f19187m;

    /* renamed from: n */
    public final androidx.lifecycle.LiveData<p255od.C5194b0> f19188n;

    /* renamed from: o */
    public final androidx.lifecycle.C0437d0<java.lang.Double> f19189o;

    /* renamed from: p */
    public final androidx.lifecycle.LiveData<java.lang.String> f19190p;

    /* renamed from: q */
    public final androidx.lifecycle.LiveData<java.lang.Double> f19191q;

    /* renamed from: r */
    public final androidx.lifecycle.C0437d0<java.lang.String> f19192r;

    /* renamed from: s */
    public final androidx.lifecycle.C0437d0<java.lang.String> f19193s;

    /* renamed from: t */
    public me.C4595c f19194t;

    /* renamed from: ne.h$a */
    public static final class a extends p239nh.AbstractC4830j implements mh.InterfaceC4609a<p105g2.C2221o> {

        /* renamed from: Z */
        public final /* synthetic */ android.app.Application f19195Z;

        public a(android.app.Application r1) {
                r0 = this;
                r0.f19195Z = r1
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4609a
        /* renamed from: e */
        public p105g2.C2221o mo15e() {
                r1 = this;
                android.app.Application r0 = r1.f19195Z
                g2.o r0 = p119h2.C2450l.m6226a(r0)
                return r0
        }
    }

    public C4797h(android.app.Application r3, p238nd.C4728b0 r4) {
            r2 = this;
            java.lang.String r0 = "app"
            p214m2.C4339q.m9706k(r3, r0)
            java.lang.String r0 = "eosManager"
            p214m2.C4339q.m9706k(r4, r0)
            r2.<init>()
            r2.f19177c = r4
            ne.h$a r4 = new ne.h$a
            r4.<init>(r3)
            ch.d r3 = p185k7.C4038x4.m9096i(r4)
            r2.f19178d = r3
            androidx.lifecycle.d0 r3 = new androidx.lifecycle.d0
            r3.<init>()
            r2.f19179e = r3
            r2.f19180f = r3
            androidx.lifecycle.d0 r3 = new androidx.lifecycle.d0
            r3.<init>()
            r2.f19181g = r3
            androidx.lifecycle.d0 r3 = new androidx.lifecycle.d0
            r3.<init>()
            r2.f19182h = r3
            androidx.lifecycle.d0 r3 = new androidx.lifecycle.d0
            r3.<init>()
            r2.f19183i = r3
            r2.f19184j = r3
            androidx.lifecycle.d0 r3 = new androidx.lifecycle.d0
            r4 = 0
            r3.<init>(r4)
            r2.f19185k = r3
            r2.f19186l = r3
            androidx.lifecycle.d0 r3 = new androidx.lifecycle.d0
            r3.<init>(r4)
            r2.f19187m = r3
            r2.f19188n = r3
            androidx.lifecycle.d0 r3 = new androidx.lifecycle.d0
            r0 = 0
            java.lang.Double r4 = java.lang.Double.valueOf(r0)
            r3.<init>(r4)
            r2.f19189o = r3
            ne.f r4 = new ne.f
            r0 = 0
            r4.<init>(r2, r0)
            androidx.lifecycle.LiveData r4 = androidx.lifecycle.C0455m0.m1450a(r3, r4)
            r2.f19190p = r4
            ne.f r4 = new ne.f
            r0 = 1
            r4.<init>(r2, r0)
            androidx.lifecycle.LiveData r3 = androidx.lifecycle.C0455m0.m1450a(r3, r4)
            r2.f19191q = r3
            androidx.lifecycle.d0 r3 = new androidx.lifecycle.d0
            java.lang.String r4 = ""
            r3.<init>(r4)
            r2.f19192r = r3
            androidx.lifecycle.d0 r3 = new androidx.lifecycle.d0
            r3.<init>(r4)
            r2.f19193s = r3
            return
    }

    /* renamed from: d */
    public final void m10843d(java.lang.String r17, java.lang.String r18) {
            r16 = this;
            r0 = r16
            java.lang.Double r1 = p362uh.C6462h.m13048E(r17)
            java.lang.Double r2 = p362uh.C6462h.m13048E(r18)
            androidx.lifecycle.d0<od.b0> r3 = r0.f19185k
            java.lang.Object r3 = r3.m1411d()
            od.b0 r3 = (p255od.C5194b0) r3
            androidx.lifecycle.d0<od.b0> r4 = r0.f19187m
            java.lang.Object r4 = r4.m1411d()
            od.b0 r4 = (p255od.C5194b0) r4
            r5 = 0
            if (r3 == 0) goto L23
            double r7 = r3.getAmount()
            goto L24
        L23:
            r7 = r5
        L24:
            if (r4 == 0) goto L2b
            double r3 = r4.getAmount()
            goto L2c
        L2b:
            r3 = r5
        L2c:
            me.c r9 = r16.m10844e()
            me.a r9 = r9.getData()
            double r9 = r9.getPool1SupplyAmount()
            me.c r11 = r16.m10844e()
            me.a r11 = r11.getData()
            double r11 = r11.getPool2SupplyAmount()
            double r9 = r9 / r11
            double r11 = r7 / r9
            int r13 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r13 > 0) goto L4d
            r3 = r11
            goto L4f
        L4d:
            double r7 = r3 * r9
        L4f:
            androidx.lifecycle.d0<java.lang.String> r11 = r0.f19192r
            java.lang.Object r11 = r11.m1411d()
            r12 = r17
            boolean r11 = p214m2.C4339q.m9702c(r12, r11)
            java.lang.String r13 = ""
            r14 = 2
            r15 = 0
            if (r11 != 0) goto La8
            if (r1 != 0) goto L64
            goto L7f
        L64:
            double r1 = r1.doubleValue()
            int r3 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r3 <= 0) goto L7e
            me.c r1 = r16.m10844e()
            me.a r1 = r1.getData()
            int r1 = r1.getPrecision1()
            java.lang.String r1 = vg.C6672m.m13535v(r7, r1, r15, r14)
            r13 = r1
            goto L7f
        L7e:
            r13 = r12
        L7f:
            java.lang.Double r1 = p362uh.C6462h.m13048E(r13)
            if (r1 == 0) goto L89
            double r5 = r1.doubleValue()
        L89:
            double r5 = r5 / r9
            me.c r1 = r16.m10844e()
            me.a r1 = r1.getData()
            int r1 = r1.getPrecision2()
            java.lang.String r1 = vg.C6672m.m13535v(r5, r1, r15, r14)
            androidx.lifecycle.d0<java.lang.String> r2 = r0.f19192r
            r2.mo7l(r13)
            androidx.lifecycle.d0<java.lang.String> r2 = r0.f19193s
            r2.mo7l(r1)
            r0.m10845f(r13, r1)
            goto Lf0
        La8:
            if (r2 != 0) goto Lab
            goto Lc7
        Lab:
            double r1 = r2.doubleValue()
            int r7 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r7 <= 0) goto Lc5
            me.c r1 = r16.m10844e()
            me.a r1 = r1.getData()
            int r1 = r1.getPrecision2()
            java.lang.String r1 = vg.C6672m.m13535v(r3, r1, r15, r14)
            r13 = r1
            goto Lc7
        Lc5:
            r13 = r18
        Lc7:
            java.lang.Double r1 = p362uh.C6462h.m13048E(r13)
            if (r1 == 0) goto Ld1
            double r5 = r1.doubleValue()
        Ld1:
            double r5 = r5 * r9
            me.c r1 = r16.m10844e()
            me.a r1 = r1.getData()
            int r1 = r1.getPrecision1()
            java.lang.String r1 = vg.C6672m.m13535v(r5, r1, r15, r14)
            androidx.lifecycle.d0<java.lang.String> r2 = r0.f19192r
            r2.mo7l(r1)
            androidx.lifecycle.d0<java.lang.String> r2 = r0.f19193s
            r2.mo7l(r13)
            r0.m10845f(r1, r13)
        Lf0:
            return
    }

    /* renamed from: e */
    public final me.C4595c m10844e() {
            r1 = this;
            me.c r0 = r1.f19194t
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.String r0 = "poolDataWithMy"
            p214m2.C4339q.m9713w(r0)
            r0 = 0
            throw r0
    }

    /* renamed from: f */
    public final void m10845f(java.lang.String r8, java.lang.String r9) {
            r7 = this;
            java.lang.Double r8 = p362uh.C6462h.m13048E(r8)
            r0 = 0
            if (r8 == 0) goto Ld
            double r2 = r8.doubleValue()
            goto Le
        Ld:
            r2 = r0
        Le:
            java.lang.Double r8 = p362uh.C6462h.m13048E(r9)
            if (r8 == 0) goto L19
            double r8 = r8.doubleValue()
            goto L1a
        L19:
            r8 = r0
        L1a:
            r4 = 0
            r5 = 1
            int r6 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r6 != 0) goto L22
            r6 = 1
            goto L23
        L22:
            r6 = 0
        L23:
            if (r6 != 0) goto L98
            int r6 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r6 != 0) goto L2a
            r4 = 1
        L2a:
            if (r4 == 0) goto L2d
            goto L98
        L2d:
            me.c r0 = r7.m10844e()
            me.a r0 = r0.getData()
            double r0 = r0.getTotalSupplyAmount()
            double r0 = r0 * r2
            me.c r2 = r7.m10844e()
            me.a r2 = r2.getData()
            double r2 = r2.getPool1SupplyAmount()
            double r0 = r0 / r2
            me.c r2 = r7.m10844e()
            me.a r2 = r2.getData()
            double r2 = r2.getTotalSupplyAmount()
            double r2 = r2 * r8
            me.c r8 = r7.m10844e()
            me.a r8 = r8.getData()
            double r8 = r8.getPool2SupplyAmount()
            double r2 = r2 / r8
            double r8 = java.lang.Math.min(r0, r2)
            me.c r0 = r7.m10844e()
            int r0 = r0.getPrecision()
            double r8 = vg.C6672m.m13538y(r8, r0)
            r0 = 100
            double r0 = (double) r0
            double r0 = r0 * r8
            r2 = 9999(0x270f, float:1.4012E-41)
            double r2 = (double) r2
            double r0 = r0 + r2
            r2 = 10000(0x2710, float:1.4013E-41)
            double r2 = (double) r2
            double r0 = r0 / r2
            double r8 = r8 - r0
            androidx.lifecycle.d0<java.lang.Double> r0 = r7.f19189o
            me.c r1 = r7.m10844e()
            int r1 = r1.getPrecision()
            double r1 = vg.C6672m.m13517d(r1)
            double r8 = r8 / r1
            java.lang.Double r8 = java.lang.Double.valueOf(r8)
            r0.mo7l(r8)
            return
        L98:
            androidx.lifecycle.d0<java.lang.Double> r8 = r7.f19189o
            java.lang.Double r9 = java.lang.Double.valueOf(r0)
            r8.mo7l(r9)
            return
    }
}
