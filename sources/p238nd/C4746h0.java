package p238nd;

@p134hh.InterfaceC3044e(m7451c = "io.tacocrypto.app.manager.EOSManager$claimUpliftiumSerialized$3$invoke$1", m7452f = "EOSManager.kt", m7453l = {1881, 1901}, m7454m = "invokeSuspend")
/* renamed from: nd.h0 */
/* loaded from: classes.dex */
public final class C4746h0 extends p134hh.AbstractC3048i implements mh.InterfaceC4624p<p379vh.InterfaceC6686b0, p101fh.InterfaceC2172d<? super ch.C0979f<? extends java.lang.String>>, java.lang.Object> {

    /* renamed from: c0 */
    public int f19037c0;

    /* renamed from: d0 */
    public /* synthetic */ java.lang.Object f19038d0;

    /* renamed from: e0 */
    public final /* synthetic */ one.block.eosiojava.session.TransactionProcessor f19039e0;

    /* renamed from: f0 */
    public final /* synthetic */ java.util.List<one.block.eosiojava.models.rpcProvider.Action> f19040f0;

    /* renamed from: g0 */
    public final /* synthetic */ p238nd.C4728b0 f19041g0;

    @p134hh.InterfaceC3044e(m7451c = "io.tacocrypto.app.manager.EOSManager$claimUpliftiumSerialized$3$invoke$1$2$1", m7452f = "EOSManager.kt", m7453l = {}, m7454m = "invokeSuspend")
    /* renamed from: nd.h0$a */
    public static final class a extends p134hh.AbstractC3048i implements mh.InterfaceC4624p<p379vh.InterfaceC6686b0, p101fh.InterfaceC2172d<? super ch.C0985l>, java.lang.Object> {

        /* renamed from: c0 */
        public final /* synthetic */ java.lang.String f19042c0;

        /* renamed from: d0 */
        public final /* synthetic */ p238nd.C4728b0 f19043d0;

        /* renamed from: e0 */
        public final /* synthetic */ one.block.eosiojava.session.TransactionProcessor f19044e0;

        public a(java.lang.String r1, p238nd.C4728b0 r2, one.block.eosiojava.session.TransactionProcessor r3, p101fh.InterfaceC2172d<? super p238nd.C4746h0.a> r4) {
                r0 = this;
                r0.f19042c0 = r1
                r0.f19043d0 = r2
                r0.f19044e0 = r3
                r1 = 2
                r0.<init>(r1, r4)
                return
        }

        @Override // p134hh.AbstractC3040a
        /* renamed from: h */
        public final p101fh.InterfaceC2172d<ch.C0985l> mo121h(java.lang.Object r4, p101fh.InterfaceC2172d<?> r5) {
                r3 = this;
                nd.h0$a r4 = new nd.h0$a
                java.lang.String r0 = r3.f19042c0
                nd.b0 r1 = r3.f19043d0
                one.block.eosiojava.session.TransactionProcessor r2 = r3.f19044e0
                r4.<init>(r0, r1, r2, r5)
                return r4
        }

        @Override // mh.InterfaceC4624p
        /* renamed from: l */
        public java.lang.Object mo122l(p379vh.InterfaceC6686b0 r4, p101fh.InterfaceC2172d<? super ch.C0985l> r5) {
                r3 = this;
                vh.b0 r4 = (p379vh.InterfaceC6686b0) r4
                fh.d r5 = (p101fh.InterfaceC2172d) r5
                nd.h0$a r4 = new nd.h0$a
                java.lang.String r0 = r3.f19042c0
                nd.b0 r1 = r3.f19043d0
                one.block.eosiojava.session.TransactionProcessor r2 = r3.f19044e0
                r4.<init>(r0, r1, r2, r5)
                ch.l r5 = ch.C0985l.f5061a
                r4.mo123o(r5)
                return r5
        }

        @Override // p134hh.AbstractC3040a
        /* renamed from: o */
        public final java.lang.Object mo123o(java.lang.Object r8) {
                r7 = this;
                p074e9.C1805a.m4540y(r8)
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                java.lang.String r0 = "Dataserialized: "
                r8.append(r0)
                java.lang.String r1 = r7.f19042c0
                r8.append(r1)
                java.lang.String r8 = r8.toString()
                r1 = 0
                java.lang.Object[] r2 = new java.lang.Object[r1]
                hk.a$b r3 = hk.C3053a.f12282b
                r3.mo7467a(r8, r2)
                java.lang.String r8 = r7.f19042c0
                java.lang.String r8 = vg.C6672m.m13533t(r8)
                nd.b0 r2 = r7.f19043d0
                od.u0 r4 = new od.u0
                one.block.eosiojava.session.TransactionProcessor r5 = r7.f19044e0
                one.block.eosiojava.models.rpcProvider.Transaction r5 = r5.getTransaction()
                p214m2.C4339q.m9704i(r5)
                java.math.BigInteger r5 = r5.getRefBlockNum()
                java.lang.String r6 = "processor.transaction!!.refBlockNum"
                p214m2.C4339q.m9705j(r5, r6)
                r4.<init>(r5, r8)
                r2.f18920p = r4
                java.lang.String r0 = p064e.C1493g.m4049a(r0, r8)
                java.lang.Object[] r2 = new java.lang.Object[r1]
                r3.mo7467a(r0, r2)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = " window.postMessage({'type': 'TRANSACTION', 'transaction': "
                r0.append(r2)
                r0.append(r8)
                java.lang.String r8 = "},'https://www.mycloudwallet.com'); "
                r0.append(r8)
                java.lang.String r8 = r0.toString()
                java.lang.Object[] r0 = new java.lang.Object[r1]
                r3.mo7467a(r8, r0)
                nd.b0 r0 = r7.f19043d0
                java.util.List<android.webkit.WebView> r0 = r0.f18914j
                java.lang.Object r0 = p062dh.C1473i.m4001M(r0)
                android.webkit.WebView r0 = (android.webkit.WebView) r0
                nd.g0 r1 = p238nd.C4743g0.f19023a
                r0.evaluateJavascript(r8, r1)
                ch.l r8 = ch.C0985l.f5061a
                return r8
        }
    }

    @p134hh.InterfaceC3044e(m7451c = "io.tacocrypto.app.manager.EOSManager$claimUpliftiumSerialized$3$invoke$1$3$1", m7452f = "EOSManager.kt", m7453l = {}, m7454m = "invokeSuspend")
    /* renamed from: nd.h0$b */
    public static final class b extends p134hh.AbstractC3048i implements mh.InterfaceC4624p<p379vh.InterfaceC6686b0, p101fh.InterfaceC2172d<? super ch.C0985l>, java.lang.Object> {

        /* renamed from: c0 */
        public final /* synthetic */ p238nd.C4728b0 f19045c0;

        /* renamed from: d0 */
        public final /* synthetic */ p239nh.C4837q<java.lang.String> f19046d0;

        public b(p238nd.C4728b0 r1, p239nh.C4837q<java.lang.String> r2, p101fh.InterfaceC2172d<? super p238nd.C4746h0.b> r3) {
                r0 = this;
                r0.f19045c0 = r1
                r0.f19046d0 = r2
                r1 = 2
                r0.<init>(r1, r3)
                return
        }

        @Override // p134hh.AbstractC3040a
        /* renamed from: h */
        public final p101fh.InterfaceC2172d<ch.C0985l> mo121h(java.lang.Object r3, p101fh.InterfaceC2172d<?> r4) {
                r2 = this;
                nd.h0$b r3 = new nd.h0$b
                nd.b0 r0 = r2.f19045c0
                nh.q<java.lang.String> r1 = r2.f19046d0
                r3.<init>(r0, r1, r4)
                return r3
        }

        @Override // mh.InterfaceC4624p
        /* renamed from: l */
        public java.lang.Object mo122l(p379vh.InterfaceC6686b0 r3, p101fh.InterfaceC2172d<? super ch.C0985l> r4) {
                r2 = this;
                vh.b0 r3 = (p379vh.InterfaceC6686b0) r3
                fh.d r4 = (p101fh.InterfaceC2172d) r4
                nd.h0$b r3 = new nd.h0$b
                nd.b0 r0 = r2.f19045c0
                nh.q<java.lang.String> r1 = r2.f19046d0
                r3.<init>(r0, r1, r4)
                ch.l r4 = ch.C0985l.f5061a
                r3.mo123o(r4)
                return r4
        }

        @Override // p134hh.AbstractC3040a
        /* renamed from: o */
        public final java.lang.Object mo123o(java.lang.Object r3) {
                r2 = this;
                p074e9.C1805a.m4540y(r3)
                nd.b0 r3 = r2.f19045c0
                androidx.lifecycle.d0<vg.b<java.lang.Boolean>> r3 = r3.f18923s
                vg.b r0 = new vg.b
                java.lang.Boolean r1 = java.lang.Boolean.TRUE
                r0.<init>(r1)
                r3.mo7l(r0)
                nd.b0 r3 = r2.f19045c0
                mh.p<? super java.lang.Boolean, ? super java.lang.String, ch.l> r3 = r3.f18918n
                if (r3 == 0) goto L20
                java.lang.Boolean r0 = java.lang.Boolean.FALSE
                nh.q<java.lang.String> r1 = r2.f19046d0
                T r1 = r1.f19232Y
                r3.mo122l(r0, r1)
            L20:
                nd.b0 r3 = r2.f19045c0
                r0 = 0
                r3.f18918n = r0
                ch.l r3 = ch.C0985l.f5061a
                return r3
        }
    }

    public C4746h0(one.block.eosiojava.session.TransactionProcessor r1, java.util.List<? extends one.block.eosiojava.models.rpcProvider.Action> r2, p238nd.C4728b0 r3, p101fh.InterfaceC2172d<? super p238nd.C4746h0> r4) {
            r0 = this;
            r0.f19039e0 = r1
            r0.f19040f0 = r2
            r0.f19041g0 = r3
            r1 = 2
            r0.<init>(r1, r4)
            return
    }

    @Override // p134hh.AbstractC3040a
    /* renamed from: h */
    public final p101fh.InterfaceC2172d<ch.C0985l> mo121h(java.lang.Object r5, p101fh.InterfaceC2172d<?> r6) {
            r4 = this;
            nd.h0 r0 = new nd.h0
            one.block.eosiojava.session.TransactionProcessor r1 = r4.f19039e0
            java.util.List<one.block.eosiojava.models.rpcProvider.Action> r2 = r4.f19040f0
            nd.b0 r3 = r4.f19041g0
            r0.<init>(r1, r2, r3, r6)
            r0.f19038d0 = r5
            return r0
    }

    @Override // mh.InterfaceC4624p
    /* renamed from: l */
    public java.lang.Object mo122l(p379vh.InterfaceC6686b0 r5, p101fh.InterfaceC2172d<? super ch.C0979f<? extends java.lang.String>> r6) {
            r4 = this;
            vh.b0 r5 = (p379vh.InterfaceC6686b0) r5
            fh.d r6 = (p101fh.InterfaceC2172d) r6
            nd.h0 r0 = new nd.h0
            one.block.eosiojava.session.TransactionProcessor r1 = r4.f19039e0
            java.util.List<one.block.eosiojava.models.rpcProvider.Action> r2 = r4.f19040f0
            nd.b0 r3 = r4.f19041g0
            r0.<init>(r1, r2, r3, r6)
            r0.f19038d0 = r5
            ch.l r5 = ch.C0985l.f5061a
            java.lang.Object r5 = r0.mo123o(r5)
            return r5
    }

    @Override // p134hh.AbstractC3040a
    /* renamed from: o */
    public final java.lang.Object mo123o(java.lang.Object r10) {
            r9 = this;
            gh.a r0 = gh.EnumC2389a.f10764Y
            int r1 = r9.f19037c0
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L23
            if (r1 == r4) goto L1c
            if (r1 != r3) goto L14
            java.lang.Object r0 = r9.f19038d0
            p074e9.C1805a.m4540y(r10)
            goto Lad
        L14:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1c:
            java.lang.Object r1 = r9.f19038d0
            p074e9.C1805a.m4540y(r10)
            r10 = r1
            goto L60
        L23:
            p074e9.C1805a.m4540y(r10)
            java.lang.Object r10 = r9.f19038d0
            vh.b0 r10 = (p379vh.InterfaceC6686b0) r10
            one.block.eosiojava.session.TransactionProcessor r10 = r9.f19039e0
            java.util.List<one.block.eosiojava.models.rpcProvider.Action> r1 = r9.f19040f0
            r10.prepare(r1)     // Catch: java.lang.Throwable -> L39
            java.lang.String r10 = r10.serialize()     // Catch: java.lang.Throwable -> L39
            p214m2.C4339q.m9704i(r10)     // Catch: java.lang.Throwable -> L39
            goto L3e
        L39:
            r10 = move-exception
            java.lang.Object r10 = p074e9.C1805a.m4520e(r10)
        L3e:
            one.block.eosiojava.session.TransactionProcessor r1 = r9.f19039e0
            nd.b0 r5 = r9.f19041g0
            boolean r6 = r10 instanceof ch.C0979f.a
            r6 = r6 ^ r4
            if (r6 == 0) goto L60
            r6 = r10
            java.lang.String r6 = (java.lang.String) r6
            r1.serializedTransaction = r6
            vh.z r7 = p379vh.C6716l0.f26007a
            vh.k1 r7 = p459zh.C7346l.f28106a
            nd.h0$a r8 = new nd.h0$a
            r8.<init>(r6, r5, r1, r2)
            r9.f19038d0 = r10
            r9.f19037c0 = r4
            java.lang.Object r1 = p101fh.C2174f.m5710A(r7, r8, r9)
            if (r1 != r0) goto L60
            return r0
        L60:
            nd.b0 r1 = r9.f19041g0
            java.lang.Throwable r4 = ch.C0979f.m2690b(r10)
            if (r4 == 0) goto Lae
            nh.q r5 = new nh.q
            r5.<init>()
            java.lang.String r4 = r4.getMessage()
            r5.f19232Y = r4
            java.lang.String r6 = "Error happened on calling GetInfo RPC."
            boolean r4 = p214m2.C4339q.m9702c(r4, r6)
            if (r4 == 0) goto L7f
            java.lang.String r4 = "Communication error. Please check your connection and try again"
            r5.f19232Y = r4
        L7f:
            java.lang.String r4 = "SERIALIZATION_ERROR: "
            java.lang.StringBuilder r4 = android.support.v4.media.C0144c.m256a(r4)
            T r6 = r5.f19232Y
            java.lang.String r6 = (java.lang.String) r6
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            r6 = 0
            java.lang.Object[] r6 = new java.lang.Object[r6]
            hk.a$b r7 = hk.C3053a.f12282b
            r7.mo7467a(r4, r6)
            vh.z r4 = p379vh.C6716l0.f26007a
            vh.k1 r4 = p459zh.C7346l.f28106a
            nd.h0$b r6 = new nd.h0$b
            r6.<init>(r1, r5, r2)
            r9.f19038d0 = r10
            r9.f19037c0 = r3
            java.lang.Object r1 = p101fh.C2174f.m5710A(r4, r6, r9)
            if (r1 != r0) goto Lac
            return r0
        Lac:
            r0 = r10
        Lad:
            r10 = r0
        Lae:
            ch.f r0 = new ch.f
            r0.<init>(r10)
            return r0
    }
}
