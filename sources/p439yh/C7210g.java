package p439yh;

/* JADX WARN: Unexpected interfaces in signature: [hh.d] */
/* renamed from: yh.g */
/* loaded from: classes.dex */
public final class C7210g<T> extends p134hh.AbstractC3042c implements p419xh.InterfaceC7074b<T> {

    /* renamed from: b0 */
    public final p419xh.InterfaceC7074b<T> f27751b0;

    /* renamed from: c0 */
    public final p101fh.InterfaceC2175g f27752c0;

    /* renamed from: d0 */
    public final int f27753d0;

    /* renamed from: e0 */
    public p101fh.InterfaceC2175g f27754e0;

    /* renamed from: f0 */
    public p101fh.InterfaceC2172d<? super ch.C0985l> f27755f0;

    /* renamed from: yh.g$a */
    public static final class a extends p239nh.AbstractC4830j implements mh.InterfaceC4624p<java.lang.Integer, p101fh.InterfaceC2175g.a, java.lang.Integer> {

        /* renamed from: Z */
        public static final p439yh.C7210g.a f27756Z = null;

        static {
                yh.g$a r0 = new yh.g$a
                r0.<init>()
                p439yh.C7210g.a.f27756Z = r0
                return
        }

        public a() {
                r1 = this;
                r0 = 2
                r1.<init>(r0)
                return
        }

        @Override // mh.InterfaceC4624p
        /* renamed from: l */
        public java.lang.Integer mo122l(java.lang.Integer r1, p101fh.InterfaceC2175g.a r2) {
                r0 = this;
                java.lang.Number r1 = (java.lang.Number) r1
                int r1 = r1.intValue()
                fh.g$a r2 = (p101fh.InterfaceC2175g.a) r2
                int r1 = r1 + 1
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                return r1
        }
    }

    public C7210g(p419xh.InterfaceC7074b<? super T> r3, p101fh.InterfaceC2175g r4) {
            r2 = this;
            yh.e r0 = p439yh.C7208e.f27749Y
            fh.i r1 = p101fh.C2177i.f9918Y
            r2.<init>(r0, r1)
            r2.f27751b0 = r3
            r2.f27752c0 = r4
            r3 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            yh.g$a r0 = p439yh.C7210g.a.f27756Z
            java.lang.Object r3 = r4.fold(r3, r0)
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            r2.f27753d0 = r3
            return
    }

    @Override // p419xh.InterfaceC7074b
    /* renamed from: a */
    public java.lang.Object mo1443a(T r1, p101fh.InterfaceC2172d<? super ch.C0985l> r2) {
            r0 = this;
            java.lang.Object r1 = r0.m14284t(r2, r1)     // Catch: java.lang.Throwable -> Lc
            gh.a r2 = gh.EnumC2389a.f10764Y
            if (r1 != r2) goto L9
            return r1
        L9:
            ch.l r1 = ch.C0985l.f5061a
            return r1
        Lc:
            r1 = move-exception
            yh.d r2 = new yh.d
            r2.<init>(r1)
            r0.f27754e0 = r2
            throw r1
    }

    @Override // p134hh.AbstractC3042c, p101fh.InterfaceC2172d
    /* renamed from: c */
    public p101fh.InterfaceC2175g mo5706c() {
            r1 = this;
            fh.d<? super ch.l> r0 = r1.f27755f0
            if (r0 != 0) goto L6
            r0 = 0
            goto La
        L6:
            fh.g r0 = r0.mo5706c()
        La:
            if (r0 != 0) goto Le
            fh.i r0 = p101fh.C2177i.f9918Y
        Le:
            return r0
    }

    @Override // p134hh.AbstractC3040a, p134hh.InterfaceC3043d
    /* renamed from: j */
    public p134hh.InterfaceC3043d mo5742j() {
            r2 = this;
            fh.d<? super ch.l> r0 = r2.f27755f0
            boolean r1 = r0 instanceof p134hh.InterfaceC3043d
            if (r1 == 0) goto L9
            hh.d r0 = (p134hh.InterfaceC3043d) r0
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    @Override // p134hh.AbstractC3040a
    /* renamed from: n */
    public java.lang.StackTraceElement mo7449n() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // p134hh.AbstractC3040a
    /* renamed from: o */
    public java.lang.Object mo123o(java.lang.Object r3) {
            r2 = this;
            java.lang.Throwable r0 = ch.C0979f.m2690b(r3)
            if (r0 == 0) goto Ld
            yh.d r1 = new yh.d
            r1.<init>(r0)
            r2.f27754e0 = r1
        Ld:
            fh.d<? super ch.l> r0 = r2.f27755f0
            if (r0 != 0) goto L12
            goto L15
        L12:
            r0.mo5707k(r3)
        L15:
            gh.a r3 = gh.EnumC2389a.f10764Y
            return r3
    }

    @Override // p134hh.AbstractC3042c, p134hh.AbstractC3040a
    /* renamed from: s */
    public void mo7450s() {
            r0 = this;
            super.mo7450s()
            return
    }

    /* renamed from: t */
    public final java.lang.Object m14284t(p101fh.InterfaceC2172d<? super ch.C0985l> r4, T r5) {
            r3 = this;
            fh.g r0 = r4.mo5706c()
            p209lh.C4304a.m9619m(r0)
            fh.g r1 = r3.f27754e0
            if (r1 == r0) goto L7c
            boolean r2 = r1 instanceof p439yh.C7207d
            if (r2 != 0) goto L50
            r1 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            yh.i r2 = new yh.i
            r2.<init>(r3)
            java.lang.Object r1 = r0.fold(r1, r2)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            int r2 = r3.f27753d0
            if (r1 != r2) goto L2a
            r3.f27754e0 = r0
            goto L7c
        L2a:
            java.lang.String r4 = "Flow invariant is violated:\n\t\tFlow was collected in "
            java.lang.StringBuilder r4 = android.support.v4.media.C0144c.m256a(r4)
            fh.g r5 = r3.f27752c0
            r4.append(r5)
            java.lang.String r5 = ",\n\t\tbut emission happened in "
            r4.append(r5)
            r4.append(r0)
            java.lang.String r5 = ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r4 = r4.toString()
            r5.<init>(r4)
            throw r5
        L50:
            yh.d r1 = (p439yh.C7207d) r1
            java.lang.String r4 = "\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception "
            java.lang.StringBuilder r4 = android.support.v4.media.C0144c.m256a(r4)
            java.lang.Throwable r0 = r1.f27748Y
            r4.append(r0)
            java.lang.String r0 = ", but then emission attempt of value '"
            r4.append(r0)
            r4.append(r5)
            java.lang.String r5 = "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            "
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.String r4 = p362uh.C6459e.m13046C(r4)
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r4 = r4.toString()
            r5.<init>(r4)
            throw r5
        L7c:
            r3.f27755f0 = r4
            mh.q<xh.b<java.lang.Object>, java.lang.Object, fh.d<? super ch.l>, java.lang.Object> r4 = p439yh.C7211h.f27757a
            xh.b<T> r0 = r3.f27751b0
            java.lang.Object r4 = r4.mo115i(r0, r5, r3)
            return r4
    }
}
