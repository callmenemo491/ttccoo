package p121h4;

/* renamed from: h4.j */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC2469j implements java.lang.Runnable {

    /* renamed from: Y */
    public final /* synthetic */ int f11048Y;

    /* renamed from: Z */
    public final /* synthetic */ java.lang.Object f11049Z;

    /* renamed from: a0 */
    public final /* synthetic */ int f11050a0;

    /* renamed from: b0 */
    public final /* synthetic */ long f11051b0;

    /* renamed from: c0 */
    public final /* synthetic */ long f11052c0;

    public /* synthetic */ RunnableC2469j(p121h4.InterfaceC2473n.a r2, int r3, long r4, long r6) {
            r1 = this;
            r0 = 0
            r1.f11048Y = r0
            r1.<init>()
            r1.f11049Z = r2
            r1.f11050a0 = r3
            r1.f11051b0 = r4
            r1.f11052c0 = r6
            return
    }

    public /* synthetic */ RunnableC2469j(p352u5.InterfaceC6308c.a.C7424a.C7425a r2, int r3, long r4, long r6) {
            r1 = this;
            r0 = 1
            r1.f11048Y = r0
            r1.<init>()
            r1.f11049Z = r2
            r1.f11050a0 = r3
            r1.f11051b0 = r4
            r1.f11052c0 = r6
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r12 = this;
            int r0 = r12.f11048Y
            switch(r0) {
                case 0: goto L6;
                default: goto L5;
            }
        L5:
            goto L18
        L6:
            java.lang.Object r0 = r12.f11049Z
            h4.n$a r0 = (p121h4.InterfaceC2473n.a) r0
            int r2 = r12.f11050a0
            long r3 = r12.f11051b0
            long r5 = r12.f11052c0
            h4.n r1 = r0.f11064b
            int r0 = p371v5.C6552b0.f25624a
            r1.mo5291c0(r2, r3, r5)
            return
        L18:
            java.lang.Object r0 = r12.f11049Z
            u5.c$a$a$a r0 = (p352u5.InterfaceC6308c.a.C7424a.C7425a) r0
            int r3 = r12.f11050a0
            long r4 = r12.f11051b0
            long r6 = r12.f11052c0
            u5.c$a r0 = r0.f24630b
            g4.p r0 = (p107g4.C2254p) r0
            g4.p$a r1 = r0.f10233b0
            b9.n<g5.r$a> r2 = r1.f10240b
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L32
            r1 = 0
            goto L60
        L32:
            b9.n<g5.r$a> r1 = r1.f10240b
            boolean r2 = r1 instanceof java.util.List
            if (r2 == 0) goto L4f
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto L49
            int r2 = r1.size()
            int r2 = r2 + (-1)
            java.lang.Object r1 = r1.get(r2)
            goto L5e
        L49:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
        L4f:
            java.util.Iterator r1 = r1.iterator()
        L53:
            java.lang.Object r2 = r1.next()
            boolean r8 = r1.hasNext()
            if (r8 != 0) goto L53
            r1 = r2
        L5e:
            g5.r$a r1 = (p108g5.InterfaceC2283r.a) r1
        L60:
            g4.q$a r9 = r0.m5853m0(r1)
            r10 = 1006(0x3ee, float:1.41E-42)
            g4.l r11 = new g4.l
            r8 = 1
            r1 = r11
            r2 = r9
            r1.<init>(r2, r3, r4, r6, r8)
            android.util.SparseArray<g4.q$a> r1 = r0.f10234c0
            r1.put(r10, r9)
            v5.n<g4.q> r0 = r0.f10235d0
            r0.m13365b(r10, r11)
            r0.m13364a()
            return
    }
}
