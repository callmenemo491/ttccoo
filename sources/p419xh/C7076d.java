package p419xh;

/* renamed from: xh.d */
/* loaded from: classes.dex */
public final class C7076d implements p419xh.InterfaceC7073a<java.lang.Object> {

    /* renamed from: Y */
    public final /* synthetic */ p419xh.InterfaceC7073a f27398Y;

    /* renamed from: Z */
    public final /* synthetic */ mh.InterfaceC4625q f27399Z;

    @p134hh.InterfaceC3044e(m7451c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1", m7452f = "Emitters.kt", m7453l = {114, 121, 128}, m7454m = "collect")
    /* renamed from: xh.d$a */
    public static final class a extends p134hh.AbstractC3042c {

        /* renamed from: b0 */
        public /* synthetic */ java.lang.Object f27400b0;

        /* renamed from: c0 */
        public int f27401c0;

        /* renamed from: d0 */
        public final /* synthetic */ p419xh.C7076d f27402d0;

        /* renamed from: e0 */
        public java.lang.Object f27403e0;

        /* renamed from: f0 */
        public java.lang.Object f27404f0;

        public a(p419xh.C7076d r1, p101fh.InterfaceC2172d r2) {
                r0 = this;
                r0.f27402d0 = r1
                r0.<init>(r2)
                return
        }

        @Override // p134hh.AbstractC3040a
        /* renamed from: o */
        public final java.lang.Object mo123o(java.lang.Object r2) {
                r1 = this;
                r1.f27400b0 = r2
                int r2 = r1.f27401c0
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                r2 = r2 | r0
                r1.f27401c0 = r2
                xh.d r2 = r1.f27402d0
                r0 = 0
                java.lang.Object r2 = r2.mo14181b(r0, r1)
                return r2
        }
    }

    public C7076d(p419xh.InterfaceC7073a r1, mh.InterfaceC4625q r2) {
            r0 = this;
            r0.f27398Y = r1
            r0.f27399Z = r2
            r0.<init>()
            return
    }

    @Override // p419xh.InterfaceC7073a
    /* renamed from: b */
    public java.lang.Object mo14181b(p419xh.InterfaceC7074b<? super java.lang.Object> r9, p101fh.InterfaceC2172d<? super ch.C0985l> r10) {
            r8 = this;
            boolean r0 = r10 instanceof p419xh.C7076d.a
            if (r0 == 0) goto L13
            r0 = r10
            xh.d$a r0 = (p419xh.C7076d.a) r0
            int r1 = r0.f27401c0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27401c0 = r1
            goto L18
        L13:
            xh.d$a r0 = new xh.d$a
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f27400b0
            gh.a r1 = gh.EnumC2389a.f10764Y
            int r2 = r0.f27401c0
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L52
            if (r2 == r5) goto L44
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r9 = r0.f27403e0
            yh.g r9 = (p439yh.C7210g) r9
            p074e9.C1805a.m4540y(r10)     // Catch: java.lang.Throwable -> L32
            goto L7f
        L32:
            r10 = move-exception
            goto L89
        L34:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3c:
            java.lang.Object r9 = r0.f27403e0
            java.lang.Throwable r9 = (java.lang.Throwable) r9
            p074e9.C1805a.m4540y(r10)
            goto La3
        L44:
            java.lang.Object r9 = r0.f27404f0
            xh.b r9 = (p419xh.InterfaceC7074b) r9
            java.lang.Object r2 = r0.f27403e0
            xh.d r2 = (p419xh.C7076d) r2
            p074e9.C1805a.m4540y(r10)     // Catch: java.lang.Throwable -> L50
            goto L65
        L50:
            r9 = move-exception
            goto L8f
        L52:
            p074e9.C1805a.m4540y(r10)
            xh.a r10 = r8.f27398Y     // Catch: java.lang.Throwable -> L8d
            r0.f27403e0 = r8     // Catch: java.lang.Throwable -> L8d
            r0.f27404f0 = r9     // Catch: java.lang.Throwable -> L8d
            r0.f27401c0 = r5     // Catch: java.lang.Throwable -> L8d
            java.lang.Object r10 = r10.mo14181b(r9, r0)     // Catch: java.lang.Throwable -> L8d
            if (r10 != r1) goto L64
            return r1
        L64:
            r2 = r8
        L65:
            yh.g r10 = new yh.g
            fh.g r4 = r0.f12244Z
            p214m2.C4339q.m9704i(r4)
            r10.<init>(r9, r4)
            mh.q r9 = r2.f27399Z     // Catch: java.lang.Throwable -> L85
            r0.f27403e0 = r10     // Catch: java.lang.Throwable -> L85
            r0.f27404f0 = r6     // Catch: java.lang.Throwable -> L85
            r0.f27401c0 = r3     // Catch: java.lang.Throwable -> L85
            java.lang.Object r9 = r9.mo115i(r10, r6, r0)     // Catch: java.lang.Throwable -> L85
            if (r9 != r1) goto L7e
            return r1
        L7e:
            r9 = r10
        L7f:
            r9.mo7450s()
            ch.l r9 = ch.C0985l.f5061a
            return r9
        L85:
            r9 = move-exception
            r7 = r10
            r10 = r9
            r9 = r7
        L89:
            r9.mo7450s()
            throw r10
        L8d:
            r9 = move-exception
            r2 = r8
        L8f:
            xh.k r10 = new xh.k
            r10.<init>(r9)
            mh.q r2 = r2.f27399Z
            r0.f27403e0 = r9
            r0.f27404f0 = r6
            r0.f27401c0 = r4
            java.lang.Object r10 = p419xh.C7077e.m14182a(r10, r2, r9, r0)
            if (r10 != r1) goto La3
            return r1
        La3:
            throw r9
    }
}
