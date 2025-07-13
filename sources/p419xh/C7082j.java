package p419xh;

/* renamed from: xh.j */
/* loaded from: classes.dex */
public final class C7082j<T> implements p419xh.InterfaceC7074b<T> {

    @p134hh.InterfaceC3044e(m7451c = "kotlinx.coroutines.flow.SubscribedFlowCollector", m7452f = "Share.kt", m7453l = {410, 414}, m7454m = "onSubscription")
    /* renamed from: xh.j$a */
    public static final class a extends p134hh.AbstractC3042c {

        /* renamed from: b0 */
        public java.lang.Object f27417b0;

        /* renamed from: c0 */
        public java.lang.Object f27418c0;

        /* renamed from: d0 */
        public /* synthetic */ java.lang.Object f27419d0;

        /* renamed from: e0 */
        public final /* synthetic */ p419xh.C7082j<T> f27420e0;

        /* renamed from: f0 */
        public int f27421f0;

        public a(p419xh.C7082j<T> r1, p101fh.InterfaceC2172d<? super p419xh.C7082j.a> r2) {
                r0 = this;
                r0.f27420e0 = r1
                r0.<init>(r2)
                return
        }

        @Override // p134hh.AbstractC3040a
        /* renamed from: o */
        public final java.lang.Object mo123o(java.lang.Object r2) {
                r1 = this;
                r1.f27419d0 = r2
                int r2 = r1.f27421f0
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                r2 = r2 | r0
                r1.f27421f0 = r2
                xh.j<T> r2 = r1.f27420e0
                java.lang.Object r2 = r2.m14186b(r1)
                return r2
        }
    }

    @Override // p419xh.InterfaceC7074b
    /* renamed from: a */
    public java.lang.Object mo1443a(T r1, p101fh.InterfaceC2172d<? super ch.C0985l> r2) {
            r0 = this;
            r1 = 0
            throw r1
    }

    /* renamed from: b */
    public final java.lang.Object m14186b(p101fh.InterfaceC2172d<? super ch.C0985l> r5) {
            r4 = this;
            boolean r0 = r5 instanceof p419xh.C7082j.a
            if (r0 == 0) goto L13
            r0 = r5
            xh.j$a r0 = (p419xh.C7082j.a) r0
            int r1 = r0.f27421f0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27421f0 = r1
            goto L18
        L13:
            xh.j$a r0 = new xh.j$a
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f27419d0
            int r1 = r0.f27421f0
            r2 = 1
            if (r1 == 0) goto L44
            if (r1 == r2) goto L32
            r0 = 2
            if (r1 != r0) goto L2a
            p074e9.C1805a.m4540y(r5)
        L27:
            ch.l r5 = ch.C0985l.f5061a
            return r5
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L32:
            java.lang.Object r1 = r0.f27418c0
            yh.g r1 = (p439yh.C7210g) r1
            java.lang.Object r0 = r0.f27417b0
            xh.j r0 = (p419xh.C7082j) r0
            p074e9.C1805a.m4540y(r5)     // Catch: java.lang.Throwable -> L59
            r1.mo7450s()
            java.util.Objects.requireNonNull(r0)
            goto L27
        L44:
            p074e9.C1805a.m4540y(r5)
            yh.g r1 = new yh.g
            fh.g r5 = r0.f12244Z
            p214m2.C4339q.m9704i(r5)
            r3 = 0
            r1.<init>(r3, r5)
            r0.f27417b0 = r4     // Catch: java.lang.Throwable -> L59
            r0.f27418c0 = r1     // Catch: java.lang.Throwable -> L59
            r0.f27421f0 = r2     // Catch: java.lang.Throwable -> L59
            throw r3     // Catch: java.lang.Throwable -> L59
        L59:
            r5 = move-exception
            r1.mo7450s()
            throw r5
    }
}
