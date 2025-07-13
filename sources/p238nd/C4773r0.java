package p238nd;

@p134hh.InterfaceC3044e(m7451c = "io.tacocrypto.app.manager.EOSManager$pushTransaction$1", m7452f = "EOSManager.kt", m7453l = {2076, 2091}, m7454m = "invokeSuspend")
/* renamed from: nd.r0 */
/* loaded from: classes.dex */
public final class C4773r0 extends p134hh.AbstractC3048i implements mh.InterfaceC4624p<p379vh.InterfaceC6686b0, p101fh.InterfaceC2172d<? super ch.C0979f<? extends java.lang.String>>, java.lang.Object> {

    /* renamed from: c0 */
    public int f19101c0;

    /* renamed from: d0 */
    public /* synthetic */ java.lang.Object f19102d0;

    /* renamed from: e0 */
    public final /* synthetic */ one.block.eosiojava.session.TransactionProcessor f19103e0;

    /* renamed from: f0 */
    public final /* synthetic */ java.util.List<one.block.eosiojava.models.rpcProvider.Action> f19104f0;

    /* renamed from: g0 */
    public final /* synthetic */ p238nd.C4728b0 f19105g0;

    @p134hh.InterfaceC3044e(m7451c = "io.tacocrypto.app.manager.EOSManager$pushTransaction$1$2$1", m7452f = "EOSManager.kt", m7453l = {}, m7454m = "invokeSuspend")
    /* renamed from: nd.r0$a */
    public static final class a extends p134hh.AbstractC3048i implements mh.InterfaceC4624p<p379vh.InterfaceC6686b0, p101fh.InterfaceC2172d<? super ch.C0985l>, java.lang.Object> {

        /* renamed from: c0 */
        public final /* synthetic */ java.lang.String f19106c0;

        /* renamed from: d0 */
        public final /* synthetic */ p238nd.C4728b0 f19107d0;

        public a(java.lang.String r1, p238nd.C4728b0 r2, p101fh.InterfaceC2172d<? super p238nd.C4773r0.a> r3) {
                r0 = this;
                r0.f19106c0 = r1
                r0.f19107d0 = r2
                r1 = 2
                r0.<init>(r1, r3)
                return
        }

        @Override // p134hh.AbstractC3040a
        /* renamed from: h */
        public final p101fh.InterfaceC2172d<ch.C0985l> mo121h(java.lang.Object r3, p101fh.InterfaceC2172d<?> r4) {
                r2 = this;
                nd.r0$a r3 = new nd.r0$a
                java.lang.String r0 = r2.f19106c0
                nd.b0 r1 = r2.f19107d0
                r3.<init>(r0, r1, r4)
                return r3
        }

        @Override // mh.InterfaceC4624p
        /* renamed from: l */
        public java.lang.Object mo122l(p379vh.InterfaceC6686b0 r3, p101fh.InterfaceC2172d<? super ch.C0985l> r4) {
                r2 = this;
                vh.b0 r3 = (p379vh.InterfaceC6686b0) r3
                fh.d r4 = (p101fh.InterfaceC2172d) r4
                nd.r0$a r3 = new nd.r0$a
                java.lang.String r0 = r2.f19106c0
                nd.b0 r1 = r2.f19107d0
                r3.<init>(r0, r1, r4)
                ch.l r4 = ch.C0985l.f5061a
                r3.mo123o(r4)
                return r4
        }

        @Override // p134hh.AbstractC3040a
        /* renamed from: o */
        public final java.lang.Object mo123o(java.lang.Object r5) {
                r4 = this;
                p074e9.C1805a.m4540y(r5)
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r0 = "Dataserialized: "
                r5.append(r0)
                java.lang.String r1 = r4.f19106c0
                r5.append(r1)
                java.lang.String r5 = r5.toString()
                r1 = 0
                java.lang.Object[] r2 = new java.lang.Object[r1]
                hk.a$b r3 = hk.C3053a.f12282b
                r3.mo7467a(r5, r2)
                java.lang.String r5 = r4.f19106c0
                java.lang.String r5 = vg.C6672m.m13533t(r5)
                java.lang.String r0 = p064e.C1493g.m4049a(r0, r5)
                java.lang.Object[] r2 = new java.lang.Object[r1]
                r3.mo7467a(r0, r2)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = " window.postMessage({'freeBandwidth': true, 'type': 'TRANSACTION', 'transaction': "
                r0.append(r2)
                r0.append(r5)
                java.lang.String r5 = "}, 'https://www.mycloudwallet.com/cloud-wallet/signing/'); "
                r0.append(r5)
                java.lang.String r5 = r0.toString()
                java.lang.Object[] r0 = new java.lang.Object[r1]
                r3.mo7467a(r5, r0)
                nd.b0 r0 = r4.f19107d0
                java.util.List<android.webkit.WebView> r0 = r0.f18914j
                java.lang.Object r0 = p062dh.C1473i.m4001M(r0)
                android.webkit.WebView r0 = (android.webkit.WebView) r0
                nd.g0 r1 = p238nd.C4743g0.f19023a
                r0.evaluateJavascript(r5, r1)
                ch.l r5 = ch.C0985l.f5061a
                return r5
        }
    }

    @p134hh.InterfaceC3044e(m7451c = "io.tacocrypto.app.manager.EOSManager$pushTransaction$1$3$1", m7452f = "EOSManager.kt", m7453l = {}, m7454m = "invokeSuspend")
    /* renamed from: nd.r0$b */
    public static final class b extends p134hh.AbstractC3048i implements mh.InterfaceC4624p<p379vh.InterfaceC6686b0, p101fh.InterfaceC2172d<? super ch.C0985l>, java.lang.Object> {

        /* renamed from: c0 */
        public final /* synthetic */ p238nd.C4728b0 f19108c0;

        /* renamed from: d0 */
        public final /* synthetic */ p239nh.C4837q<java.lang.String> f19109d0;

        public b(p238nd.C4728b0 r1, p239nh.C4837q<java.lang.String> r2, p101fh.InterfaceC2172d<? super p238nd.C4773r0.b> r3) {
                r0 = this;
                r0.f19108c0 = r1
                r0.f19109d0 = r2
                r1 = 2
                r0.<init>(r1, r3)
                return
        }

        @Override // p134hh.AbstractC3040a
        /* renamed from: h */
        public final p101fh.InterfaceC2172d<ch.C0985l> mo121h(java.lang.Object r3, p101fh.InterfaceC2172d<?> r4) {
                r2 = this;
                nd.r0$b r3 = new nd.r0$b
                nd.b0 r0 = r2.f19108c0
                nh.q<java.lang.String> r1 = r2.f19109d0
                r3.<init>(r0, r1, r4)
                return r3
        }

        @Override // mh.InterfaceC4624p
        /* renamed from: l */
        public java.lang.Object mo122l(p379vh.InterfaceC6686b0 r3, p101fh.InterfaceC2172d<? super ch.C0985l> r4) {
                r2 = this;
                vh.b0 r3 = (p379vh.InterfaceC6686b0) r3
                fh.d r4 = (p101fh.InterfaceC2172d) r4
                nd.r0$b r3 = new nd.r0$b
                nd.b0 r0 = r2.f19108c0
                nh.q<java.lang.String> r1 = r2.f19109d0
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
                nd.b0 r3 = r2.f19108c0
                androidx.lifecycle.d0<vg.b<java.lang.Boolean>> r3 = r3.f18923s
                vg.b r0 = new vg.b
                java.lang.Boolean r1 = java.lang.Boolean.TRUE
                r0.<init>(r1)
                r3.mo7l(r0)
                nd.b0 r3 = r2.f19108c0
                mh.p<? super java.lang.Boolean, ? super java.lang.String, ch.l> r3 = r3.f18918n
                if (r3 == 0) goto L20
                java.lang.Boolean r0 = java.lang.Boolean.FALSE
                nh.q<java.lang.String> r1 = r2.f19109d0
                T r1 = r1.f19232Y
                r3.mo122l(r0, r1)
            L20:
                nd.b0 r3 = r2.f19108c0
                r0 = 0
                r3.f18918n = r0
                ch.l r3 = ch.C0985l.f5061a
                return r3
        }
    }

    public C4773r0(one.block.eosiojava.session.TransactionProcessor r1, java.util.List<? extends one.block.eosiojava.models.rpcProvider.Action> r2, p238nd.C4728b0 r3, p101fh.InterfaceC2172d<? super p238nd.C4773r0> r4) {
            r0 = this;
            r0.f19103e0 = r1
            r0.f19104f0 = r2
            r0.f19105g0 = r3
            r1 = 2
            r0.<init>(r1, r4)
            return
    }

    @Override // p134hh.AbstractC3040a
    /* renamed from: h */
    public final p101fh.InterfaceC2172d<ch.C0985l> mo121h(java.lang.Object r5, p101fh.InterfaceC2172d<?> r6) {
            r4 = this;
            nd.r0 r0 = new nd.r0
            one.block.eosiojava.session.TransactionProcessor r1 = r4.f19103e0
            java.util.List<one.block.eosiojava.models.rpcProvider.Action> r2 = r4.f19104f0
            nd.b0 r3 = r4.f19105g0
            r0.<init>(r1, r2, r3, r6)
            r0.f19102d0 = r5
            return r0
    }

    @Override // mh.InterfaceC4624p
    /* renamed from: l */
    public java.lang.Object mo122l(p379vh.InterfaceC6686b0 r5, p101fh.InterfaceC2172d<? super ch.C0979f<? extends java.lang.String>> r6) {
            r4 = this;
            vh.b0 r5 = (p379vh.InterfaceC6686b0) r5
            fh.d r6 = (p101fh.InterfaceC2172d) r6
            nd.r0 r0 = new nd.r0
            one.block.eosiojava.session.TransactionProcessor r1 = r4.f19103e0
            java.util.List<one.block.eosiojava.models.rpcProvider.Action> r2 = r4.f19104f0
            nd.b0 r3 = r4.f19105g0
            r0.<init>(r1, r2, r3, r6)
            r0.f19102d0 = r5
            ch.l r5 = ch.C0985l.f5061a
            java.lang.Object r5 = r0.mo123o(r5)
            return r5
    }

    @Override // p134hh.AbstractC3040a
    /* renamed from: o */
    public final java.lang.Object mo123o(java.lang.Object r9) {
            r8 = this;
            gh.a r0 = gh.EnumC2389a.f10764Y
            int r1 = r8.f19101c0
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L23
            if (r1 == r4) goto L1c
            if (r1 != r3) goto L14
            java.lang.Object r0 = r8.f19102d0
            p074e9.C1805a.m4540y(r9)
            goto L99
        L14:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1c:
            java.lang.Object r1 = r8.f19102d0
            p074e9.C1805a.m4540y(r9)
            r9 = r1
            goto L5c
        L23:
            p074e9.C1805a.m4540y(r9)
            java.lang.Object r9 = r8.f19102d0
            vh.b0 r9 = (p379vh.InterfaceC6686b0) r9
            one.block.eosiojava.session.TransactionProcessor r9 = r8.f19103e0
            java.util.List<one.block.eosiojava.models.rpcProvider.Action> r1 = r8.f19104f0
            r9.prepare(r1)     // Catch: java.lang.Throwable -> L39
            java.lang.String r9 = r9.serialize()     // Catch: java.lang.Throwable -> L39
            p214m2.C4339q.m9704i(r9)     // Catch: java.lang.Throwable -> L39
            goto L3e
        L39:
            r9 = move-exception
            java.lang.Object r9 = p074e9.C1805a.m4520e(r9)
        L3e:
            nd.b0 r1 = r8.f19105g0
            boolean r5 = r9 instanceof ch.C0979f.a
            r5 = r5 ^ r4
            if (r5 == 0) goto L5c
            r5 = r9
            java.lang.String r5 = (java.lang.String) r5
            vh.z r6 = p379vh.C6716l0.f26007a
            vh.k1 r6 = p459zh.C7346l.f28106a
            nd.r0$a r7 = new nd.r0$a
            r7.<init>(r5, r1, r2)
            r8.f19102d0 = r9
            r8.f19101c0 = r4
            java.lang.Object r1 = p101fh.C2174f.m5710A(r6, r7, r8)
            if (r1 != r0) goto L5c
            return r0
        L5c:
            nd.b0 r1 = r8.f19105g0
            java.lang.Throwable r4 = ch.C0979f.m2690b(r9)
            if (r4 == 0) goto L9a
            nh.q r5 = new nh.q
            r5.<init>()
            java.lang.String r6 = r4.getMessage()
            r5.f19232Y = r6
            java.lang.String r7 = "Error happened on calling GetInfo RPC."
            boolean r6 = p214m2.C4339q.m9702c(r6, r7)
            if (r6 == 0) goto L7b
            java.lang.String r6 = "Communication error. Please check your connection and try again"
            r5.f19232Y = r6
        L7b:
            java.lang.String r6 = "SERIALIZATION_ERROR"
            hk.a$b r6 = hk.C3053a.m7466a(r6)
            r6.mo7468b(r4)
            vh.z r4 = p379vh.C6716l0.f26007a
            vh.k1 r4 = p459zh.C7346l.f28106a
            nd.r0$b r6 = new nd.r0$b
            r6.<init>(r1, r5, r2)
            r8.f19102d0 = r9
            r8.f19101c0 = r3
            java.lang.Object r1 = p101fh.C2174f.m5710A(r4, r6, r8)
            if (r1 != r0) goto L98
            return r0
        L98:
            r0 = r9
        L99:
            r9 = r0
        L9a:
            ch.f r0 = new ch.f
            r0.<init>(r9)
            return r0
    }
}
