package p238nd;

@p134hh.InterfaceC3044e(m7451c = "io.tacocrypto.app.manager.EOSManager$claimUpliftiumSerialized$1", m7452f = "EOSManager.kt", m7453l = {1835}, m7454m = "invokeSuspend")
/* renamed from: nd.e0 */
/* loaded from: classes.dex */
public final class C4737e0 extends p134hh.AbstractC3048i implements mh.InterfaceC4624p<p379vh.InterfaceC6686b0, p101fh.InterfaceC2172d<? super ch.C0979f<? extends java.lang.String>>, java.lang.Object> {

    /* renamed from: c0 */
    public int f19007c0;

    /* renamed from: d0 */
    public /* synthetic */ java.lang.Object f19008d0;

    /* renamed from: e0 */
    public final /* synthetic */ one.block.eosiojava.session.TransactionProcessor f19009e0;

    /* renamed from: f0 */
    public final /* synthetic */ java.util.List<one.block.eosiojava.models.rpcProvider.Action> f19010f0;

    /* renamed from: g0 */
    public final /* synthetic */ p238nd.C4728b0 f19011g0;

    /* renamed from: h0 */
    public final /* synthetic */ p020b3.C0660b f19012h0;

    /* renamed from: i0 */
    public final /* synthetic */ android.content.Context f19013i0;

    @p134hh.InterfaceC3044e(m7451c = "io.tacocrypto.app.manager.EOSManager$claimUpliftiumSerialized$1$2$1", m7452f = "EOSManager.kt", m7453l = {}, m7454m = "invokeSuspend")
    /* renamed from: nd.e0$a */
    public static final class a extends p134hh.AbstractC3048i implements mh.InterfaceC4624p<p379vh.InterfaceC6686b0, p101fh.InterfaceC2172d<? super ch.C0985l>, java.lang.Object> {

        /* renamed from: c0 */
        public final /* synthetic */ java.lang.String f19014c0;

        /* renamed from: d0 */
        public final /* synthetic */ p238nd.C4728b0 f19015d0;

        /* renamed from: e0 */
        public final /* synthetic */ one.block.eosiojava.session.TransactionProcessor f19016e0;

        /* renamed from: f0 */
        public final /* synthetic */ p020b3.C0660b f19017f0;

        /* renamed from: g0 */
        public final /* synthetic */ android.content.Context f19018g0;

        public a(java.lang.String r1, p238nd.C4728b0 r2, one.block.eosiojava.session.TransactionProcessor r3, p020b3.C0660b r4, android.content.Context r5, p101fh.InterfaceC2172d<? super p238nd.C4737e0.a> r6) {
                r0 = this;
                r0.f19014c0 = r1
                r0.f19015d0 = r2
                r0.f19016e0 = r3
                r0.f19017f0 = r4
                r0.f19018g0 = r5
                r1 = 2
                r0.<init>(r1, r6)
                return
        }

        @Override // p134hh.AbstractC3040a
        /* renamed from: h */
        public final p101fh.InterfaceC2172d<ch.C0985l> mo121h(java.lang.Object r8, p101fh.InterfaceC2172d<?> r9) {
                r7 = this;
                nd.e0$a r8 = new nd.e0$a
                java.lang.String r1 = r7.f19014c0
                nd.b0 r2 = r7.f19015d0
                one.block.eosiojava.session.TransactionProcessor r3 = r7.f19016e0
                b3.b r4 = r7.f19017f0
                android.content.Context r5 = r7.f19018g0
                r0 = r8
                r6 = r9
                r0.<init>(r1, r2, r3, r4, r5, r6)
                return r8
        }

        @Override // mh.InterfaceC4624p
        /* renamed from: l */
        public java.lang.Object mo122l(p379vh.InterfaceC6686b0 r8, p101fh.InterfaceC2172d<? super ch.C0985l> r9) {
                r7 = this;
                vh.b0 r8 = (p379vh.InterfaceC6686b0) r8
                r6 = r9
                fh.d r6 = (p101fh.InterfaceC2172d) r6
                nd.e0$a r8 = new nd.e0$a
                java.lang.String r1 = r7.f19014c0
                nd.b0 r2 = r7.f19015d0
                one.block.eosiojava.session.TransactionProcessor r3 = r7.f19016e0
                b3.b r4 = r7.f19017f0
                android.content.Context r5 = r7.f19018g0
                r0 = r8
                r0.<init>(r1, r2, r3, r4, r5, r6)
                ch.l r9 = ch.C0985l.f5061a
                r8.mo123o(r9)
                return r9
        }

        @Override // p134hh.AbstractC3040a
        /* renamed from: o */
        public final java.lang.Object mo123o(java.lang.Object r12) {
                r11 = this;
                p074e9.C1805a.m4540y(r12)
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r0 = "Dataserialized: "
                r12.append(r0)
                java.lang.String r0 = r11.f19014c0
                r12.append(r0)
                java.lang.String r12 = r12.toString()
                r0 = 0
                java.lang.Object[] r1 = new java.lang.Object[r0]
                hk.a$b r2 = hk.C3053a.f12282b
                r2.mo7467a(r12, r1)
                java.lang.String r12 = r11.f19014c0
                java.lang.String r12 = vg.C6672m.m13533t(r12)
                nd.b0 r1 = r11.f19015d0
                od.u0 r3 = new od.u0
                one.block.eosiojava.session.TransactionProcessor r4 = r11.f19016e0
                one.block.eosiojava.models.rpcProvider.Transaction r4 = r4.getTransaction()
                p214m2.C4339q.m9704i(r4)
                java.math.BigInteger r4 = r4.getRefBlockNum()
                java.lang.String r5 = "processor.transaction!!.refBlockNum"
                p214m2.C4339q.m9705j(r4, r5)
                r3.<init>(r4, r12)
                r1.f18920p = r3
                java.lang.String r1 = "block: "
                java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
                one.block.eosiojava.session.TransactionProcessor r3 = r11.f19016e0
                one.block.eosiojava.models.rpcProvider.Transaction r3 = r3.getTransaction()
                p214m2.C4339q.m9704i(r3)
                java.math.BigInteger r3 = r3.getRefBlockNum()
                r1.append(r3)
                java.lang.String r3 = ", Dataserialized: "
                r1.append(r3)
                r1.append(r12)
                java.lang.String r12 = r1.toString()
                java.lang.Object[] r1 = new java.lang.Object[r0]
                r2.mo7467a(r12, r1)
                b3.b r12 = r11.f19017f0
                android.content.Context r1 = r11.f19018g0
                one.block.eosiojava.session.TransactionProcessor r2 = r11.f19016e0
                one.block.eosiojava.models.rpcProvider.Transaction r2 = r2.getTransaction()
                p214m2.C4339q.m9704i(r2)
                java.util.Objects.requireNonNull(r12)
                java.lang.String r3 = "context"
                p214m2.C4339q.m9706k(r1, r3)
                vc.a r3 = new vc.a
                java.lang.String r4 = "https://eos.greymass.com"
                r3.<init>(r4)
                uc.f r4 = new uc.f
                v.c r5 = new v.c
                r5.<init>(r1, r3)
                r4.<init>(r5)
                xc.f r1 = p414xc.EnumC7031f.WAX
                xc.g r1 = r1.toChainId()
                r4.f24851c = r1
                java.util.List<com.bumptech.glide.load.ImageHeaderParser> r12 = r12.f3814a
                java.util.ArrayList r1 = new java.util.ArrayList
                r3 = 10
                int r5 = p062dh.C1469e.m3992D(r12, r3)
                r1.<init>(r5)
                java.util.Iterator r12 = r12.iterator()
            La5:
                boolean r5 = r12.hasNext()
                if (r5 == 0) goto L11c
                java.lang.Object r5 = r12.next()
                nd.w0 r5 = (p238nd.C4783w0) r5
                xc.b r6 = new xc.b
                r6.<init>()
                xc.a r7 = new xc.a
                java.lang.String r8 = r5.f19148a
                r7.<init>(r8)
                r6.setAccount(r7)
                xc.d r7 = new xc.d
                java.lang.String r8 = r5.f19149b
                r7.<init>(r8)
                r6.setName(r7)
                xc.c r7 = new xc.c
                pd.t1 r8 = r5.f19150c
                java.lang.String r8 = r8.getHex()
                r7.<init>(r8)
                r6.setData(r7)
                java.util.List<one.block.eosiojava.models.rpcProvider.Authorization> r5 = r5.f19151d
                java.util.ArrayList r7 = new java.util.ArrayList
                int r8 = p062dh.C1469e.m3992D(r5, r3)
                r7.<init>(r8)
                java.util.Iterator r5 = r5.iterator()
            Le7:
                boolean r8 = r5.hasNext()
                if (r8 == 0) goto L104
                java.lang.Object r8 = r5.next()
                one.block.eosiojava.models.rpcProvider.Authorization r8 = (one.block.eosiojava.models.rpcProvider.Authorization) r8
                xc.k r9 = new xc.k
                java.lang.String r10 = r8.getActor()
                java.lang.String r8 = r8.getPermission()
                r9.<init>(r10, r8)
                r7.add(r9)
                goto Le7
            L104:
                java.util.Iterator r5 = r7.iterator()
            L108:
                boolean r7 = r5.hasNext()
                if (r7 == 0) goto L118
                java.lang.Object r7 = r5.next()
                xc.k r7 = (p414xc.C7036k) r7
                r6.addAuthorization(r7)
                goto L108
            L118:
                r1.add(r6)
                goto La5
            L11c:
                xc.n r12 = new xc.n
                r12.<init>()
                java.lang.String r3 = r2.getExpiration()
                r12.setExpiration(r3)
                java.math.BigInteger r3 = r2.getRefBlockNum()
                long r5 = r3.longValue()
                java.lang.Long r3 = java.lang.Long.valueOf(r5)
                r12.setRefBlockNum(r3)
                java.math.BigInteger r2 = r2.getRefBlockPrefix()
                long r2 = r2.longValue()
                java.lang.Long r2 = java.lang.Long.valueOf(r2)
                r12.setRefBlockPrefix(r2)
                r12.setActions(r1)
                java.util.List r1 = r12.getActionsList()
                java.util.Iterator r1 = r1.iterator()
            L151:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L16f
                java.lang.Object r2 = r1.next()
                xc.b r2 = (p414xc.C7027b) r2
                xc.c r3 = r2.getData()
                boolean r3 = r3.isPacked()
                if (r3 != 0) goto L151
                uc.e r3 = r4.f24850b
                wc.a r5 = r4.f24849a
                r3.m13019a(r5, r2)
                goto L151
            L16f:
                java.util.List r1 = r12.getContextFreeActionsList()
                java.util.Iterator r1 = r1.iterator()
            L177:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L195
                java.lang.Object r2 = r1.next()
                xc.b r2 = (p414xc.C7027b) r2
                xc.c r3 = r2.getData()
                boolean r3 = r3.isPacked()
                if (r3 != 0) goto L177
                uc.e r3 = r4.f24850b
                wc.a r5 = r4.f24849a
                r3.m13019a(r5, r2)
                goto L177
            L195:
                r4.f24852d = r12
                java.lang.String r12 = "taco://signtransaction/?sig={{sig}}"
                r4.f24854f = r12
                xc.m r12 = r4.f24853e
                r12.setBroadcast(r0)
                r12.setBackground(r0)
                java.lang.String r12 = r4.m13020a()
                java.lang.String r1 = "eossignin"
                hk.a$b r1 = hk.C3053a.m7466a(r1)
                java.lang.Object[] r0 = new java.lang.Object[r0]
                r1.mo7467a(r12, r0)
                java.lang.String r0 = "esr"
                p214m2.C4339q.m9705j(r12, r0)
                android.content.Context r0 = r11.f19018g0
                vg.C6672m.m13519f(r0, r12)
                ch.l r12 = ch.C0985l.f5061a
                return r12
        }
    }

    public C4737e0(one.block.eosiojava.session.TransactionProcessor r1, java.util.List<? extends one.block.eosiojava.models.rpcProvider.Action> r2, p238nd.C4728b0 r3, p020b3.C0660b r4, android.content.Context r5, p101fh.InterfaceC2172d<? super p238nd.C4737e0> r6) {
            r0 = this;
            r0.f19009e0 = r1
            r0.f19010f0 = r2
            r0.f19011g0 = r3
            r0.f19012h0 = r4
            r0.f19013i0 = r5
            r1 = 2
            r0.<init>(r1, r6)
            return
    }

    @Override // p134hh.AbstractC3040a
    /* renamed from: h */
    public final p101fh.InterfaceC2172d<ch.C0985l> mo121h(java.lang.Object r9, p101fh.InterfaceC2172d<?> r10) {
            r8 = this;
            nd.e0 r7 = new nd.e0
            one.block.eosiojava.session.TransactionProcessor r1 = r8.f19009e0
            java.util.List<one.block.eosiojava.models.rpcProvider.Action> r2 = r8.f19010f0
            nd.b0 r3 = r8.f19011g0
            b3.b r4 = r8.f19012h0
            android.content.Context r5 = r8.f19013i0
            r0 = r7
            r6 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.f19008d0 = r9
            return r7
    }

    @Override // mh.InterfaceC4624p
    /* renamed from: l */
    public java.lang.Object mo122l(p379vh.InterfaceC6686b0 r1, p101fh.InterfaceC2172d<? super ch.C0979f<? extends java.lang.String>> r2) {
            r0 = this;
            vh.b0 r1 = (p379vh.InterfaceC6686b0) r1
            fh.d r2 = (p101fh.InterfaceC2172d) r2
            fh.d r1 = r0.mo121h(r1, r2)
            nd.e0 r1 = (p238nd.C4737e0) r1
            ch.l r2 = ch.C0985l.f5061a
            java.lang.Object r1 = r1.mo123o(r2)
            return r1
    }

    @Override // p134hh.AbstractC3040a
    /* renamed from: o */
    public final java.lang.Object mo123o(java.lang.Object r12) {
            r11 = this;
            gh.a r0 = gh.EnumC2389a.f10764Y
            int r1 = r11.f19007c0
            r2 = 1
            if (r1 == 0) goto L17
            if (r1 != r2) goto Lf
            java.lang.Object r0 = r11.f19008d0
            p074e9.C1805a.m4540y(r12)
            goto L5b
        Lf:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L17:
            p074e9.C1805a.m4540y(r12)
            java.lang.Object r12 = r11.f19008d0
            vh.b0 r12 = (p379vh.InterfaceC6686b0) r12
            one.block.eosiojava.session.TransactionProcessor r12 = r11.f19009e0
            java.util.List<one.block.eosiojava.models.rpcProvider.Action> r1 = r11.f19010f0
            r12.prepare(r1)     // Catch: java.lang.Throwable -> L2d
            java.lang.String r12 = r12.serialize()     // Catch: java.lang.Throwable -> L2d
            p214m2.C4339q.m9704i(r12)     // Catch: java.lang.Throwable -> L2d
            goto L32
        L2d:
            r12 = move-exception
            java.lang.Object r12 = p074e9.C1805a.m4520e(r12)
        L32:
            one.block.eosiojava.session.TransactionProcessor r6 = r11.f19009e0
            nd.b0 r5 = r11.f19011g0
            b3.b r7 = r11.f19012h0
            android.content.Context r8 = r11.f19013i0
            boolean r1 = r12 instanceof ch.C0979f.a
            r1 = r1 ^ r2
            if (r1 == 0) goto L5c
            r4 = r12
            java.lang.String r4 = (java.lang.String) r4
            r6.serializedTransaction = r4
            vh.z r1 = p379vh.C6716l0.f26007a
            vh.k1 r1 = p459zh.C7346l.f28106a
            nd.e0$a r10 = new nd.e0$a
            r9 = 0
            r3 = r10
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r11.f19008d0 = r12
            r11.f19007c0 = r2
            java.lang.Object r1 = p101fh.C2174f.m5710A(r1, r10, r11)
            if (r1 != r0) goto L5a
            return r0
        L5a:
            r0 = r12
        L5b:
            r12 = r0
        L5c:
            ch.C0979f.m2690b(r12)
            ch.f r0 = new ch.f
            r0.<init>(r12)
            return r0
    }
}
