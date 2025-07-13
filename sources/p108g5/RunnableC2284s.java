package p108g5;

/* renamed from: g5.s */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC2284s implements java.lang.Runnable {

    /* renamed from: Y */
    public final /* synthetic */ int f10420Y;

    /* renamed from: Z */
    public final /* synthetic */ java.lang.Object f10421Z;

    /* renamed from: a0 */
    public final /* synthetic */ java.lang.Object f10422a0;

    /* renamed from: b0 */
    public final /* synthetic */ java.lang.Object f10423b0;

    /* renamed from: c0 */
    public final /* synthetic */ java.lang.Object f10424c0;

    public /* synthetic */ RunnableC2284s(p108g5.InterfaceC2286u.a r2, p108g5.InterfaceC2286u r3, p108g5.C2276k r4, p108g5.C2279n r5, int r6) {
            r1 = this;
            r1.f10420Y = r6
            r0 = 1
            r1.<init>()
            r1.f10421Z = r2
            r1.f10422a0 = r3
            r1.f10423b0 = r4
            r1.f10424c0 = r5
            return
    }

    public /* synthetic */ RunnableC2284s(p446z3.C7244b r2, p385w3.AbstractC6787i r3, p335t3.InterfaceC6155h r4, p385w3.AbstractC6784f r5) {
            r1 = this;
            r0 = 3
            r1.f10420Y = r0
            r1.<init>()
            r1.f10421Z = r2
            r1.f10422a0 = r3
            r1.f10423b0 = r4
            r1.f10424c0 = r5
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r6 = this;
            int r0 = r6.f10420Y
            switch(r0) {
                case 0: goto L36;
                case 1: goto L1e;
                case 2: goto L6;
                default: goto L5;
            }
        L5:
            goto L4e
        L6:
            java.lang.Object r0 = r6.f10421Z
            g5.u$a r0 = (p108g5.InterfaceC2286u.a) r0
            java.lang.Object r1 = r6.f10422a0
            g5.u r1 = (p108g5.InterfaceC2286u) r1
            java.lang.Object r2 = r6.f10423b0
            g5.k r2 = (p108g5.C2276k) r2
            java.lang.Object r3 = r6.f10424c0
            g5.n r3 = (p108g5.C2279n) r3
            int r4 = r0.f10431a
            g5.r$a r0 = r0.f10432b
            r1.mo5401i(r4, r0, r2, r3)
            return
        L1e:
            java.lang.Object r0 = r6.f10421Z
            g5.u$a r0 = (p108g5.InterfaceC2286u.a) r0
            java.lang.Object r1 = r6.f10422a0
            g5.u r1 = (p108g5.InterfaceC2286u) r1
            java.lang.Object r2 = r6.f10423b0
            g5.k r2 = (p108g5.C2276k) r2
            java.lang.Object r3 = r6.f10424c0
            g5.n r3 = (p108g5.C2279n) r3
            int r4 = r0.f10431a
            g5.r$a r0 = r0.f10432b
            r1.mo5405w(r4, r0, r2, r3)
            return
        L36:
            java.lang.Object r0 = r6.f10421Z
            g5.u$a r0 = (p108g5.InterfaceC2286u.a) r0
            java.lang.Object r1 = r6.f10422a0
            g5.u r1 = (p108g5.InterfaceC2286u) r1
            java.lang.Object r2 = r6.f10423b0
            g5.k r2 = (p108g5.C2276k) r2
            java.lang.Object r3 = r6.f10424c0
            g5.n r3 = (p108g5.C2279n) r3
            int r4 = r0.f10431a
            g5.r$a r0 = r0.f10432b
            r1.mo5395D(r4, r0, r2, r3)
            return
        L4e:
            java.lang.Object r0 = r6.f10421Z
            z3.b r0 = (p446z3.C7244b) r0
            java.lang.Object r1 = r6.f10422a0
            w3.i r1 = (p385w3.AbstractC6787i) r1
            java.lang.Object r2 = r6.f10423b0
            t3.h r2 = (p335t3.InterfaceC6155h) r2
            java.lang.Object r3 = r6.f10424c0
            w3.f r3 = (p385w3.AbstractC6784f) r3
            java.util.logging.Logger r4 = p446z3.C7244b.f27841f
            java.util.Objects.requireNonNull(r0)
            x3.d r4 = r0.f27844c     // Catch: java.lang.Exception -> La0
            java.lang.String r5 = r1.mo13798b()     // Catch: java.lang.Exception -> La0
            x3.h r4 = r4.mo14027a(r5)     // Catch: java.lang.Exception -> La0
            if (r4 != 0) goto L8d
            java.lang.String r0 = "Transport backend '%s' is not registered"
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Exception -> La0
            r4 = 0
            java.lang.String r1 = r1.mo13798b()     // Catch: java.lang.Exception -> La0
            r3[r4] = r1     // Catch: java.lang.Exception -> La0
            java.lang.String r0 = java.lang.String.format(r0, r3)     // Catch: java.lang.Exception -> La0
            java.util.logging.Logger r1 = p446z3.C7244b.f27841f     // Catch: java.lang.Exception -> La0
            r1.warning(r0)     // Catch: java.lang.Exception -> La0
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch: java.lang.Exception -> La0
            r1.<init>(r0)     // Catch: java.lang.Exception -> La0
            r2.mo2151k(r1)     // Catch: java.lang.Exception -> La0
            goto Lbe
        L8d:
            w3.f r3 = r4.mo12928a(r3)     // Catch: java.lang.Exception -> La0
            c4.b r4 = r0.f27846e     // Catch: java.lang.Exception -> La0
            z3.a r5 = new z3.a     // Catch: java.lang.Exception -> La0
            r5.<init>(r0, r1, r3)     // Catch: java.lang.Exception -> La0
            r4.mo2235a(r5)     // Catch: java.lang.Exception -> La0
            r0 = 0
            r2.mo2151k(r0)     // Catch: java.lang.Exception -> La0
            goto Lbe
        La0:
            r0 = move-exception
            java.util.logging.Logger r1 = p446z3.C7244b.f27841f
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Error scheduling event "
            r3.append(r4)
            java.lang.String r4 = r0.getMessage()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r1.warning(r3)
            r2.mo2151k(r0)
        Lbe:
            return
    }
}
