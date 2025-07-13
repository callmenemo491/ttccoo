package wf;

/* renamed from: wf.k */
/* loaded from: classes.dex */
public final class C6864k extends androidx.lifecycle.AbstractC0457n0 {

    /* renamed from: c */
    public final ch.InterfaceC0977d f26625c;

    /* renamed from: d */
    public final androidx.lifecycle.C0437d0<vg.C6661b<p013ah.C0100a>> f26626d;

    /* renamed from: e */
    public final androidx.lifecycle.C0437d0<java.lang.Boolean> f26627e;

    /* renamed from: f */
    public final androidx.lifecycle.LiveData<java.lang.Boolean> f26628f;

    /* renamed from: g */
    public final androidx.lifecycle.C0437d0<java.lang.Boolean> f26629g;

    /* renamed from: h */
    public final androidx.lifecycle.LiveData<java.lang.Boolean> f26630h;

    /* renamed from: i */
    public final androidx.lifecycle.C0437d0<java.util.List<io.tacocrypto.app.p156ui.tools.nftwallet.main.NFTAssetUI>> f26631i;

    /* renamed from: j */
    public final androidx.lifecycle.LiveData<java.util.List<io.tacocrypto.app.p156ui.tools.nftwallet.main.NFTAssetUI>> f26632j;

    /* renamed from: k */
    public final androidx.lifecycle.C0437d0<wf.C6864k.a> f26633k;

    /* renamed from: l */
    public final androidx.lifecycle.LiveData<wf.C6864k.a> f26634l;

    /* renamed from: m */
    public final androidx.lifecycle.C0437d0<java.lang.String> f26635m;

    /* renamed from: n */
    public final androidx.lifecycle.LiveData<java.lang.Boolean> f26636n;

    /* renamed from: o */
    public final androidx.lifecycle.C0437d0<java.lang.Integer> f26637o;

    /* renamed from: p */
    public java.util.List<wf.C6859f> f26638p;

    /* renamed from: q */
    public final androidx.lifecycle.C0437d0<wf.C6859f> f26639q;

    /* renamed from: r */
    public final androidx.lifecycle.C0437d0<vg.C6661b<java.util.List<wf.C6859f>>> f26640r;

    /* renamed from: s */
    public final androidx.lifecycle.LiveData<vg.C6661b<java.util.List<wf.C6859f>>> f26641s;

    /* renamed from: t */
    public final androidx.lifecycle.LiveData<java.lang.String> f26642t;

    /* renamed from: u */
    public final java.lang.String f26643u;

    /* renamed from: v */
    public final androidx.lifecycle.InterfaceC0439e0<java.lang.String> f26644v;

    /* renamed from: w */
    public p379vh.InterfaceC6698f0<?> f26645w;

    /* renamed from: x */
    public android.os.Handler f26646x;

    /* renamed from: y */
    public java.lang.Runnable f26647y;

    /* renamed from: z */
    public int f26648z;

    /* renamed from: wf.k$a */
    public static final class a {

        /* renamed from: a */
        public final java.lang.String f26649a;

        /* renamed from: b */
        public final double f26650b;

        /* renamed from: c */
        public final java.lang.String f26651c;

        public a(java.lang.String r2, double r3, java.lang.String r5) {
                r1 = this;
                java.lang.String r0 = "valueDollarString"
                p214m2.C4339q.m9706k(r5, r0)
                r1.<init>()
                r1.f26649a = r2
                r1.f26650b = r3
                r1.f26651c = r5
                return
        }

        public boolean equals(java.lang.Object r6) {
                r5 = this;
                r0 = 1
                if (r5 != r6) goto L4
                return r0
            L4:
                boolean r1 = r6 instanceof wf.C6864k.a
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                wf.k$a r6 = (wf.C6864k.a) r6
                java.lang.String r1 = r5.f26649a
                java.lang.String r3 = r6.f26649a
                boolean r1 = p214m2.C4339q.m9702c(r1, r3)
                if (r1 != 0) goto L17
                return r2
            L17:
                double r3 = r5.f26650b
                java.lang.Double r1 = java.lang.Double.valueOf(r3)
                double r3 = r6.f26650b
                java.lang.Double r3 = java.lang.Double.valueOf(r3)
                boolean r1 = p214m2.C4339q.m9702c(r1, r3)
                if (r1 != 0) goto L2a
                return r2
            L2a:
                java.lang.String r1 = r5.f26651c
                java.lang.String r6 = r6.f26651c
                boolean r6 = p214m2.C4339q.m9702c(r1, r6)
                if (r6 != 0) goto L35
                return r2
            L35:
                return r0
        }

        public int hashCode() {
                r5 = this;
                java.lang.String r0 = r5.f26649a
                if (r0 != 0) goto L6
                r0 = 0
                goto La
            L6:
                int r0 = r0.hashCode()
            La:
                int r0 = r0 * 31
                double r1 = r5.f26650b
                long r1 = java.lang.Double.doubleToLongBits(r1)
                r3 = 32
                long r3 = r1 >>> r3
                long r1 = r1 ^ r3
                int r2 = (int) r1
                int r0 = r0 + r2
                int r0 = r0 * 31
                java.lang.String r1 = r5.f26651c
                int r1 = r1.hashCode()
                int r1 = r1 + r0
                return r1
        }

        public java.lang.String toString() {
                r3 = this;
                java.lang.String r0 = "CollectionPriceUI(collectionName="
                java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
                java.lang.String r1 = r3.f26649a
                r0.append(r1)
                java.lang.String r1 = ", priceWax="
                r0.append(r1)
                double r1 = r3.f26650b
                r0.append(r1)
                java.lang.String r1 = ", valueDollarString="
                r0.append(r1)
                java.lang.String r1 = r3.f26651c
                r2 = 41
                java.lang.String r0 = p185k7.C3814g5.m8552a(r0, r1, r2)
                return r0
        }
    }

    /* renamed from: wf.k$b */
    public static final class b extends p119h2.C2448j {
        public b(p239nh.C4837q<java.lang.String> r2, wf.C6864k.c<T> r3, wf.C6864k.d r4) {
                r1 = this;
                T r2 = r2.f19232Y
                java.lang.String r2 = (java.lang.String) r2
                r0 = 0
                r1.<init>(r0, r2, r3, r4)
                return
        }
    }

    /* renamed from: wf.k$c */
    public static final class c<T> implements p105g2.C2222p.b {

        /* renamed from: a */
        public final /* synthetic */ p101fh.InterfaceC2172d<md.C4551f<p417xf.C7051e>> f26652a;

        public c(p101fh.InterfaceC2172d<? super md.C4551f<p417xf.C7051e>> r1) {
                r0 = this;
                r0.f26652a = r1
                r0.<init>()
                return
        }

        @Override // p105g2.C2222p.b
        /* renamed from: a */
        public void mo117a(java.lang.Object r4) {
                r3 = this;
                java.lang.String r4 = (java.lang.String) r4
                fh.d<md.f<xf.e>> r0 = r3.f26652a
                java.lang.String r1 = "response"
                jb.j r1 = p238nd.C4754k.m10827a(r4, r1)
                wf.q r2 = new wf.q
                r2.<init>()
                java.lang.reflect.Type r2 = r2.f21382b
                java.lang.Object r4 = r1.m7929c(r4, r2)
                r0.mo5707k(r4)
                return
        }
    }

    /* renamed from: wf.k$d */
    public static final class d implements p105g2.C2222p.a {

        /* renamed from: a */
        public final /* synthetic */ p101fh.InterfaceC2172d<md.C4551f<p417xf.C7051e>> f26653a;

        public d(p101fh.InterfaceC2172d<? super md.C4551f<p417xf.C7051e>> r1) {
                r0 = this;
                r0.f26653a = r1
                r0.<init>()
                return
        }

        @Override // p105g2.C2222p.a
        /* renamed from: a */
        public final void mo118a(p105g2.C2226t r3) {
                r2 = this;
                fh.d<md.f<xf.e>> r0 = r2.f26653a
                java.lang.String r1 = "it"
                p214m2.C4339q.m9705j(r3, r1)
                java.lang.Object r3 = p074e9.C1805a.m4520e(r3)
                r0.mo5707k(r3)
                return
        }
    }

    @p134hh.InterfaceC3044e(m7451c = "io.tacocrypto.app.ui.tools.nftwallet.main.NFTMainViewModel$newCall$1", m7452f = "NFTMainViewModel.kt", m7453l = {151, 160, 163, 166, 168}, m7454m = "invokeSuspend")
    /* renamed from: wf.k$e */
    public static final class e extends p134hh.AbstractC3048i implements mh.InterfaceC4624p<p379vh.InterfaceC6686b0, p101fh.InterfaceC2172d<? super ch.C0985l>, java.lang.Object> {

        /* renamed from: c0 */
        public java.lang.Object f26654c0;

        /* renamed from: d0 */
        public java.lang.Object f26655d0;

        /* renamed from: e0 */
        public java.lang.Object f26656e0;

        /* renamed from: f0 */
        public boolean f26657f0;

        /* renamed from: g0 */
        public int f26658g0;

        /* renamed from: h0 */
        public double f26659h0;

        /* renamed from: i0 */
        public int f26660i0;

        /* renamed from: j0 */
        public /* synthetic */ java.lang.Object f26661j0;

        /* renamed from: k0 */
        public final /* synthetic */ wf.C6864k f26662k0;

        /* renamed from: l0 */
        public final /* synthetic */ java.lang.String f26663l0;

        /* renamed from: m0 */
        public final /* synthetic */ boolean f26664m0;

        /* renamed from: n0 */
        public final /* synthetic */ int f26665n0;

        /* renamed from: o0 */
        public final /* synthetic */ java.lang.String f26666o0;

        public e(wf.C6864k r1, java.lang.String r2, boolean r3, int r4, java.lang.String r5, p101fh.InterfaceC2172d<? super wf.C6864k.e> r6) {
                r0 = this;
                r0.f26662k0 = r1
                r0.f26663l0 = r2
                r0.f26664m0 = r3
                r0.f26665n0 = r4
                r0.f26666o0 = r5
                r1 = 2
                r0.<init>(r1, r6)
                return
        }

        @Override // p134hh.AbstractC3040a
        /* renamed from: h */
        public final p101fh.InterfaceC2172d<ch.C0985l> mo121h(java.lang.Object r9, p101fh.InterfaceC2172d<?> r10) {
                r8 = this;
                wf.k$e r7 = new wf.k$e
                wf.k r1 = r8.f26662k0
                java.lang.String r2 = r8.f26663l0
                boolean r3 = r8.f26664m0
                int r4 = r8.f26665n0
                java.lang.String r5 = r8.f26666o0
                r0 = r7
                r6 = r10
                r0.<init>(r1, r2, r3, r4, r5, r6)
                r7.f26661j0 = r9
                return r7
        }

        @Override // mh.InterfaceC4624p
        /* renamed from: l */
        public java.lang.Object mo122l(p379vh.InterfaceC6686b0 r1, p101fh.InterfaceC2172d<? super ch.C0985l> r2) {
                r0 = this;
                vh.b0 r1 = (p379vh.InterfaceC6686b0) r1
                fh.d r2 = (p101fh.InterfaceC2172d) r2
                fh.d r1 = r0.mo121h(r1, r2)
                wf.k$e r1 = (wf.C6864k.e) r1
                ch.l r2 = ch.C0985l.f5061a
                java.lang.Object r1 = r1.mo123o(r2)
                return r1
        }

        @Override // p134hh.AbstractC3040a
        /* renamed from: o */
        public final java.lang.Object mo123o(java.lang.Object r19) {
                r18 = this;
                r7 = r18
                gh.a r0 = gh.EnumC2389a.f10764Y
                int r1 = r7.f26660i0
                r8 = 10
                r9 = 5
                r2 = 4
                r10 = 3
                r11 = 2
                r13 = 1
                r14 = 0
                if (r1 == 0) goto Lb0
                if (r1 == r13) goto L93
                if (r1 == r11) goto L74
                if (r1 == r10) goto L5a
                if (r1 == r2) goto L40
                if (r1 != r9) goto L38
                double r0 = r7.f26659h0
                int r2 = r7.f26658g0
                boolean r3 = r7.f26657f0
                java.lang.Object r4 = r7.f26656e0
                java.util.List r4 = (java.util.List) r4
                java.lang.Object r5 = r7.f26655d0
                vh.b0 r5 = (p379vh.InterfaceC6686b0) r5
                java.lang.Object r6 = r7.f26654c0
                java.lang.String r6 = (java.lang.String) r6
                java.lang.Object r8 = r7.f26661j0
                wf.k r8 = (wf.C6864k) r8
                p074e9.C1805a.m4540y(r19)     // Catch: java.lang.Throwable -> Lad
                r12 = r0
                r1 = r19
                goto L242
            L38:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L40:
                double r1 = r7.f26659h0
                int r3 = r7.f26658g0
                boolean r4 = r7.f26657f0
                java.lang.Object r5 = r7.f26655d0
                vh.b0 r5 = (p379vh.InterfaceC6686b0) r5
                java.lang.Object r6 = r7.f26654c0
                java.lang.String r6 = (java.lang.String) r6
                java.lang.Object r8 = r7.f26661j0
                wf.k r8 = (wf.C6864k) r8
                p074e9.C1805a.m4540y(r19)     // Catch: java.lang.Throwable -> Lad
                r12 = r1
                r1 = r19
                goto L225
            L5a:
                double r1 = r7.f26659h0
                int r3 = r7.f26658g0
                boolean r4 = r7.f26657f0
                java.lang.Object r5 = r7.f26655d0
                vh.b0 r5 = (p379vh.InterfaceC6686b0) r5
                java.lang.Object r6 = r7.f26654c0
                java.lang.String r6 = (java.lang.String) r6
                java.lang.Object r15 = r7.f26661j0
                wf.k r15 = (wf.C6864k) r15
                p074e9.C1805a.m4540y(r19)     // Catch: java.lang.Throwable -> Lad
                r12 = r1
                r1 = r19
                goto L1d4
            L74:
                int r1 = r7.f26658g0
                boolean r3 = r7.f26657f0
                java.lang.Object r4 = r7.f26656e0
                vh.b0 r4 = (p379vh.InterfaceC6686b0) r4
                java.lang.Object r5 = r7.f26655d0
                java.lang.String r5 = (java.lang.String) r5
                java.lang.Object r6 = r7.f26654c0
                java.lang.String r6 = (java.lang.String) r6
                java.lang.Object r15 = r7.f26661j0
                wf.k r15 = (wf.C6864k) r15
                p074e9.C1805a.m4540y(r19)     // Catch: java.lang.Throwable -> Lad
                r2 = r19
            L8d:
                r8 = r3
                r9 = r4
                r4 = r5
                r10 = r6
                goto L163
            L93:
                int r1 = r7.f26658g0
                boolean r3 = r7.f26657f0
                java.lang.Object r4 = r7.f26656e0
                vh.b0 r4 = (p379vh.InterfaceC6686b0) r4
                java.lang.Object r5 = r7.f26655d0
                java.lang.String r5 = (java.lang.String) r5
                java.lang.Object r6 = r7.f26654c0
                java.lang.String r6 = (java.lang.String) r6
                java.lang.Object r15 = r7.f26661j0
                wf.k r15 = (wf.C6864k) r15
                p074e9.C1805a.m4540y(r19)     // Catch: java.lang.Throwable -> Lad
                r12 = r19
                goto Ld9
            Lad:
                r0 = move-exception
                goto L36a
            Lb0:
                p074e9.C1805a.m4540y(r19)
                java.lang.Object r1 = r7.f26661j0
                r4 = r1
                vh.b0 r4 = (p379vh.InterfaceC6686b0) r4
                wf.k r15 = r7.f26662k0
                java.lang.String r6 = r7.f26663l0
                boolean r3 = r7.f26664m0
                int r1 = r7.f26665n0
                java.lang.String r5 = r7.f26666o0
                java.lang.String r12 = r15.f26643u     // Catch: java.lang.Throwable -> Lad
                r7.f26661j0 = r15     // Catch: java.lang.Throwable -> Lad
                r7.f26654c0 = r6     // Catch: java.lang.Throwable -> Lad
                r7.f26655d0 = r5     // Catch: java.lang.Throwable -> Lad
                r7.f26656e0 = r4     // Catch: java.lang.Throwable -> Lad
                r7.f26657f0 = r3     // Catch: java.lang.Throwable -> Lad
                r7.f26658g0 = r1     // Catch: java.lang.Throwable -> Lad
                r7.f26660i0 = r13     // Catch: java.lang.Throwable -> Lad
                java.lang.Object r12 = wf.C6864k.m13921g(r15, r12, r7)     // Catch: java.lang.Throwable -> Lad
                if (r12 != r0) goto Ld9
                return r0
            Ld9:
                xf.m r12 = (p417xf.C7059m) r12     // Catch: java.lang.Throwable -> Lad
                xf.o r12 = r12.getData()     // Catch: java.lang.Throwable -> Lad
                java.util.List r12 = r12.getCollections()     // Catch: java.lang.Throwable -> Lad
                java.util.ArrayList r13 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lad
                int r9 = p062dh.C1469e.m3992D(r12, r8)     // Catch: java.lang.Throwable -> Lad
                r13.<init>(r9)     // Catch: java.lang.Throwable -> Lad
                java.util.Iterator r9 = r12.iterator()     // Catch: java.lang.Throwable -> Lad
            Lf0:
                boolean r12 = r9.hasNext()     // Catch: java.lang.Throwable -> Lad
                if (r12 == 0) goto L12b
                java.lang.Object r12 = r9.next()     // Catch: java.lang.Throwable -> Lad
                xf.n r12 = (p417xf.C7060n) r12     // Catch: java.lang.Throwable -> Lad
                wf.f r2 = new wf.f     // Catch: java.lang.Throwable -> Lad
                xf.h r16 = r12.getCollection()     // Catch: java.lang.Throwable -> Lad
                java.lang.String r8 = r16.getCollectionName()     // Catch: java.lang.Throwable -> Lad
                java.lang.String r16 = r12.getAssets()     // Catch: java.lang.Throwable -> Lad
                java.lang.Integer r16 = p362uh.C6462h.m13049F(r16)     // Catch: java.lang.Throwable -> Lad
                if (r16 == 0) goto L117
                int r16 = r16.intValue()     // Catch: java.lang.Throwable -> Lad
                r10 = r16
                goto L118
            L117:
                r10 = 0
            L118:
                xf.h r12 = r12.getCollection()     // Catch: java.lang.Throwable -> Lad
                java.lang.String r12 = r12.getImageURL()     // Catch: java.lang.Throwable -> Lad
                r2.<init>(r8, r10, r12, r14)     // Catch: java.lang.Throwable -> Lad
                r13.add(r2)     // Catch: java.lang.Throwable -> Lad
                r2 = 4
                r8 = 10
                r10 = 3
                goto Lf0
            L12b:
                r15.f26638p = r13     // Catch: java.lang.Throwable -> Lad
                androidx.lifecycle.d0<java.lang.Integer> r2 = r15.f26637o     // Catch: java.lang.Throwable -> Lad
                java.util.Iterator r8 = r13.iterator()     // Catch: java.lang.Throwable -> Lad
                r9 = 0
            L134:
                boolean r10 = r8.hasNext()     // Catch: java.lang.Throwable -> Lad
                if (r10 == 0) goto L144
                java.lang.Object r10 = r8.next()     // Catch: java.lang.Throwable -> Lad
                wf.f r10 = (wf.C6859f) r10     // Catch: java.lang.Throwable -> Lad
                int r10 = r10.f26615b     // Catch: java.lang.Throwable -> Lad
                int r9 = r9 + r10
                goto L134
            L144:
                java.lang.Integer r8 = new java.lang.Integer     // Catch: java.lang.Throwable -> Lad
                r8.<init>(r9)     // Catch: java.lang.Throwable -> Lad
                r2.mo1415j(r8)     // Catch: java.lang.Throwable -> Lad
                java.lang.String r2 = r15.f26643u     // Catch: java.lang.Throwable -> Lad
                r7.f26661j0 = r15     // Catch: java.lang.Throwable -> Lad
                r7.f26654c0 = r6     // Catch: java.lang.Throwable -> Lad
                r7.f26655d0 = r5     // Catch: java.lang.Throwable -> Lad
                r7.f26656e0 = r4     // Catch: java.lang.Throwable -> Lad
                r7.f26657f0 = r3     // Catch: java.lang.Throwable -> Lad
                r7.f26658g0 = r1     // Catch: java.lang.Throwable -> Lad
                r7.f26660i0 = r11     // Catch: java.lang.Throwable -> Lad
                java.lang.Object r2 = wf.C6864k.m13922h(r15, r2, r6, r7)     // Catch: java.lang.Throwable -> Lad
                if (r2 != r0) goto L8d
                return r0
            L163:
                md.f r2 = (md.C4551f) r2     // Catch: java.lang.Throwable -> Lad
                java.util.List r2 = r2.getData()     // Catch: java.lang.Throwable -> Lad
                java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> Lad
            L16d:
                boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> Lad
                if (r3 == 0) goto L187
                java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> Lad
                r5 = r3
                xf.v r5 = (p417xf.C7068v) r5     // Catch: java.lang.Throwable -> Lad
                java.lang.String r5 = r5.getToken_symbol()     // Catch: java.lang.Throwable -> Lad
                java.lang.String r6 = "WAX"
                boolean r5 = p214m2.C4339q.m9702c(r5, r6)     // Catch: java.lang.Throwable -> Lad
                if (r5 == 0) goto L16d
                goto L188
            L187:
                r3 = r14
            L188:
                xf.v r3 = (p417xf.C7068v) r3     // Catch: java.lang.Throwable -> Lad
                if (r3 == 0) goto L19d
                java.lang.String r2 = r3.getSuggested_median()     // Catch: java.lang.Throwable -> Lad
                if (r2 == 0) goto L19d
                java.lang.Double r2 = p362uh.C6462h.m13048E(r2)     // Catch: java.lang.Throwable -> Lad
                if (r2 == 0) goto L19d
                double r2 = r2.doubleValue()     // Catch: java.lang.Throwable -> Lad
                goto L19f
            L19d:
                r2 = 0
            L19f:
                r5 = 100000000(0x5f5e100, float:2.3122341E-35)
                double r5 = (double) r5     // Catch: java.lang.Throwable -> Lad
                double r12 = r2 / r5
                if (r8 == 0) goto L1a9
                int r1 = r1 + 1
            L1a9:
                r6 = r1
                boolean r1 = p362uh.C6463i.m13054K(r4)     // Catch: java.lang.Throwable -> Lad
                if (r1 == 0) goto L205
                java.lang.String r3 = r15.f26643u     // Catch: java.lang.Throwable -> Lad
                r7.f26661j0 = r15     // Catch: java.lang.Throwable -> Lad
                r7.f26654c0 = r10     // Catch: java.lang.Throwable -> Lad
                r7.f26655d0 = r9     // Catch: java.lang.Throwable -> Lad
                r7.f26656e0 = r14     // Catch: java.lang.Throwable -> Lad
                r7.f26657f0 = r8     // Catch: java.lang.Throwable -> Lad
                r7.f26658g0 = r6     // Catch: java.lang.Throwable -> Lad
                r7.f26659h0 = r12     // Catch: java.lang.Throwable -> Lad
                r1 = 3
                r7.f26660i0 = r1     // Catch: java.lang.Throwable -> Lad
                r1 = r15
                r2 = r6
                r5 = r10
                r11 = r6
                r6 = r18
                java.lang.Object r1 = wf.C6864k.m13918d(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> Lad
                if (r1 != r0) goto L1d0
                return r0
            L1d0:
                r4 = r8
                r5 = r9
                r6 = r10
                r3 = r11
            L1d4:
                md.f r1 = (md.C4551f) r1     // Catch: java.lang.Throwable -> Lad
                java.util.List r1 = r1.getData()     // Catch: java.lang.Throwable -> Lad
                java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lad
                r8 = 10
                int r8 = p062dh.C1469e.m3992D(r1, r8)     // Catch: java.lang.Throwable -> Lad
                r2.<init>(r8)     // Catch: java.lang.Throwable -> Lad
                java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> Lad
            L1e9:
                boolean r8 = r1.hasNext()     // Catch: java.lang.Throwable -> Lad
                if (r8 == 0) goto L1fd
                java.lang.Object r8 = r1.next()     // Catch: java.lang.Throwable -> Lad
                xf.e r8 = (p417xf.C7051e) r8     // Catch: java.lang.Throwable -> Lad
                io.tacocrypto.app.ui.tools.nftwallet.main.NFTAssetUI r8 = r8.toNFTAssetUI()     // Catch: java.lang.Throwable -> Lad
                r2.add(r8)     // Catch: java.lang.Throwable -> Lad
                goto L1e9
            L1fd:
                r8 = r15
                r17 = r4
                r4 = r2
                r2 = r3
                r3 = r17
                goto L22a
            L205:
                r11 = r6
                java.lang.String r1 = r15.f26643u     // Catch: java.lang.Throwable -> Lad
                r7.f26661j0 = r15     // Catch: java.lang.Throwable -> Lad
                r7.f26654c0 = r10     // Catch: java.lang.Throwable -> Lad
                r7.f26655d0 = r9     // Catch: java.lang.Throwable -> Lad
                r7.f26656e0 = r14     // Catch: java.lang.Throwable -> Lad
                r7.f26657f0 = r8     // Catch: java.lang.Throwable -> Lad
                r7.f26658g0 = r11     // Catch: java.lang.Throwable -> Lad
                r7.f26659h0 = r12     // Catch: java.lang.Throwable -> Lad
                r2 = 4
                r7.f26660i0 = r2     // Catch: java.lang.Throwable -> Lad
                java.lang.Object r1 = wf.C6864k.m13919e(r15, r1, r4, r10, r7)     // Catch: java.lang.Throwable -> Lad
                if (r1 != r0) goto L220
                return r0
            L220:
                r4 = r8
                r5 = r9
                r6 = r10
                r3 = r11
                r8 = r15
            L225:
                java.util.List r1 = (java.util.List) r1     // Catch: java.lang.Throwable -> Lad
                r2 = r3
                r3 = r4
                r4 = r1
            L22a:
                r7.f26661j0 = r8     // Catch: java.lang.Throwable -> Lad
                r7.f26654c0 = r6     // Catch: java.lang.Throwable -> Lad
                r7.f26655d0 = r5     // Catch: java.lang.Throwable -> Lad
                r7.f26656e0 = r4     // Catch: java.lang.Throwable -> Lad
                r7.f26657f0 = r3     // Catch: java.lang.Throwable -> Lad
                r7.f26658g0 = r2     // Catch: java.lang.Throwable -> Lad
                r7.f26659h0 = r12     // Catch: java.lang.Throwable -> Lad
                r1 = 5
                r7.f26660i0 = r1     // Catch: java.lang.Throwable -> Lad
                java.lang.Object r1 = wf.C6864k.m13920f(r8, r7)     // Catch: java.lang.Throwable -> Lad
                if (r1 != r0) goto L242
                return r0
            L242:
                md.j r1 = (md.C4559j) r1     // Catch: java.lang.Throwable -> Lad
                java.util.List r0 = r1.getRows()     // Catch: java.lang.Throwable -> Lad
                java.util.Iterator r1 = r0.iterator()     // Catch: java.lang.Throwable -> Lad
            L24c:
                boolean r9 = r1.hasNext()     // Catch: java.lang.Throwable -> Lad
                if (r9 == 0) goto L266
                java.lang.Object r9 = r1.next()     // Catch: java.lang.Throwable -> Lad
                r10 = r9
                xf.i r10 = (p417xf.C7055i) r10     // Catch: java.lang.Throwable -> Lad
                java.lang.String r10 = r10.getList_name()     // Catch: java.lang.Throwable -> Lad
                java.lang.String r11 = "col.verify"
                boolean r10 = p214m2.C4339q.m9702c(r10, r11)     // Catch: java.lang.Throwable -> Lad
                if (r10 == 0) goto L24c
                goto L267
            L266:
                r9 = r14
            L267:
                xf.i r9 = (p417xf.C7055i) r9     // Catch: java.lang.Throwable -> Lad
                if (r9 == 0) goto L270
                java.util.List r1 = r9.getList()     // Catch: java.lang.Throwable -> Lad
                goto L271
            L270:
                r1 = r14
            L271:
                if (r1 != 0) goto L275
                dh.k r1 = p062dh.C1475k.f7237Y     // Catch: java.lang.Throwable -> Lad
            L275:
                java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> Lad
            L279:
                boolean r9 = r0.hasNext()     // Catch: java.lang.Throwable -> Lad
                if (r9 == 0) goto L293
                java.lang.Object r9 = r0.next()     // Catch: java.lang.Throwable -> Lad
                r10 = r9
                xf.i r10 = (p417xf.C7055i) r10     // Catch: java.lang.Throwable -> Lad
                java.lang.String r10 = r10.getList_name()     // Catch: java.lang.Throwable -> Lad
                java.lang.String r11 = "col.wlist"
                boolean r10 = p214m2.C4339q.m9702c(r10, r11)     // Catch: java.lang.Throwable -> Lad
                if (r10 == 0) goto L279
                goto L294
            L293:
                r9 = r14
            L294:
                xf.i r9 = (p417xf.C7055i) r9     // Catch: java.lang.Throwable -> Lad
                if (r9 == 0) goto L29d
                java.util.List r0 = r9.getList()     // Catch: java.lang.Throwable -> Lad
                goto L29e
            L29d:
                r0 = r14
            L29e:
                if (r0 != 0) goto L2a2
                dh.k r0 = p062dh.C1475k.f7237Y     // Catch: java.lang.Throwable -> Lad
            L2a2:
                java.util.Iterator r9 = r4.iterator()     // Catch: java.lang.Throwable -> Lad
            L2a6:
                boolean r10 = r9.hasNext()     // Catch: java.lang.Throwable -> Lad
                if (r10 == 0) goto L31e
                java.lang.Object r10 = r9.next()     // Catch: java.lang.Throwable -> Lad
                io.tacocrypto.app.ui.tools.nftwallet.main.NFTAssetUI r10 = (io.tacocrypto.app.p156ui.tools.nftwallet.main.NFTAssetUI) r10     // Catch: java.lang.Throwable -> Lad
                java.util.Iterator r11 = r1.iterator()     // Catch: java.lang.Throwable -> Lad
            L2b6:
                boolean r15 = r11.hasNext()     // Catch: java.lang.Throwable -> Lad
                if (r15 == 0) goto L2d2
                java.lang.Object r15 = r11.next()     // Catch: java.lang.Throwable -> Lad
                r14 = r15
                java.lang.String r14 = (java.lang.String) r14     // Catch: java.lang.Throwable -> Lad
                r19 = r1
                java.lang.String r1 = r10.f14484d0     // Catch: java.lang.Throwable -> Lad
                boolean r1 = p214m2.C4339q.m9702c(r14, r1)     // Catch: java.lang.Throwable -> Lad
                if (r1 == 0) goto L2ce
                goto L2d5
            L2ce:
                r1 = r19
                r14 = 0
                goto L2b6
            L2d2:
                r19 = r1
                r15 = 0
            L2d5:
                if (r15 == 0) goto L2d9
                r1 = 1
                goto L2da
            L2d9:
                r1 = 0
            L2da:
                if (r1 == 0) goto L2e5
                java.lang.Integer r1 = new java.lang.Integer     // Catch: java.lang.Throwable -> Lad
                r11 = 3
                r1.<init>(r11)     // Catch: java.lang.Throwable -> Lad
                r11 = 2
            L2e3:
                r14 = 1
                goto L318
            L2e5:
                r11 = 3
                java.util.Iterator r1 = r0.iterator()     // Catch: java.lang.Throwable -> Lad
            L2ea:
                boolean r14 = r1.hasNext()     // Catch: java.lang.Throwable -> Lad
                if (r14 == 0) goto L302
                java.lang.Object r14 = r1.next()     // Catch: java.lang.Throwable -> Lad
                r15 = r14
                java.lang.String r15 = (java.lang.String) r15     // Catch: java.lang.Throwable -> Lad
                java.lang.String r11 = r10.f14484d0     // Catch: java.lang.Throwable -> Lad
                boolean r11 = p214m2.C4339q.m9702c(r15, r11)     // Catch: java.lang.Throwable -> Lad
                if (r11 == 0) goto L300
                goto L303
            L300:
                r11 = 3
                goto L2ea
            L302:
                r14 = 0
            L303:
                if (r14 == 0) goto L307
                r1 = 1
                goto L308
            L307:
                r1 = 0
            L308:
                if (r1 == 0) goto L311
                java.lang.Integer r1 = new java.lang.Integer     // Catch: java.lang.Throwable -> Lad
                r11 = 2
                r1.<init>(r11)     // Catch: java.lang.Throwable -> Lad
                goto L2e3
            L311:
                r11 = 2
                java.lang.Integer r1 = new java.lang.Integer     // Catch: java.lang.Throwable -> Lad
                r14 = 1
                r1.<init>(r14)     // Catch: java.lang.Throwable -> Lad
            L318:
                r10.f14486f0 = r1     // Catch: java.lang.Throwable -> Lad
                r1 = r19
                r14 = 0
                goto L2a6
            L31e:
                p101fh.C2174f.m5718h(r5)     // Catch: java.lang.Throwable -> Lad
                androidx.lifecycle.d0<wf.k$a> r0 = r8.f26633k     // Catch: java.lang.Throwable -> Lad
                wf.k$a r1 = new wf.k$a     // Catch: java.lang.Throwable -> Lad
                nd.q r5 = p238nd.C4770q.f19093a     // Catch: java.lang.Throwable -> Lad
                java.lang.String r9 = "Please for CurrencyManager us initialize() before getting the instance."
                java.util.Objects.requireNonNull(r5, r9)     // Catch: java.lang.Throwable -> Lad
                nd.q r5 = p238nd.C4770q.f19093a     // Catch: java.lang.Throwable -> Lad
                p214m2.C4339q.m9704i(r5)     // Catch: java.lang.Throwable -> Lad
                java.lang.Double r9 = new java.lang.Double     // Catch: java.lang.Throwable -> Lad
                r9.<init>(r12)     // Catch: java.lang.Throwable -> Lad
                r10 = 6
                r11 = 0
                java.lang.String r5 = p238nd.C4770q.m10831a(r5, r9, r11, r11, r10)     // Catch: java.lang.Throwable -> Lad
                r1.<init>(r6, r12, r5)     // Catch: java.lang.Throwable -> Lad
                r0.mo1415j(r1)     // Catch: java.lang.Throwable -> Lad
                if (r3 == 0) goto L362
                r8.f26648z = r2     // Catch: java.lang.Throwable -> Lad
                androidx.lifecycle.d0<java.util.List<io.tacocrypto.app.ui.tools.nftwallet.main.NFTAssetUI>> r0 = r8.f26631i     // Catch: java.lang.Throwable -> Lad
                java.lang.Object r0 = r0.m1411d()     // Catch: java.lang.Throwable -> Lad
                java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Throwable -> Lad
                if (r0 != 0) goto L352
                dh.k r0 = p062dh.C1475k.f7237Y     // Catch: java.lang.Throwable -> Lad
            L352:
                java.util.List r0 = p062dh.C1473i.m4009U(r0)     // Catch: java.lang.Throwable -> Lad
                r1 = r0
                java.util.ArrayList r1 = (java.util.ArrayList) r1     // Catch: java.lang.Throwable -> Lad
                r1.addAll(r4)     // Catch: java.lang.Throwable -> Lad
                androidx.lifecycle.d0<java.util.List<io.tacocrypto.app.ui.tools.nftwallet.main.NFTAssetUI>> r1 = r8.f26631i     // Catch: java.lang.Throwable -> Lad
                r1.mo1415j(r0)     // Catch: java.lang.Throwable -> Lad
                goto L367
            L362:
                androidx.lifecycle.d0<java.util.List<io.tacocrypto.app.ui.tools.nftwallet.main.NFTAssetUI>> r0 = r8.f26631i     // Catch: java.lang.Throwable -> Lad
                r0.mo1415j(r4)     // Catch: java.lang.Throwable -> Lad
            L367:
                ch.l r0 = ch.C0985l.f5061a     // Catch: java.lang.Throwable -> Lad
                goto L36e
            L36a:
                java.lang.Object r0 = p074e9.C1805a.m4520e(r0)
            L36e:
                wf.k r1 = r7.f26662k0
                java.lang.Throwable r0 = ch.C0979f.m2690b(r0)
                if (r0 == 0) goto L396
                boolean r2 = r0 instanceof java.util.concurrent.CancellationException
                if (r2 != 0) goto L396
                java.lang.String r2 = vg.C6672m.m13514a(r0)
                hk.a$b r3 = hk.C3053a.f12282b
                r3.mo7468b(r0)
                androidx.lifecycle.d0<vg.b<ah.a>> r0 = r1.f26626d
                vg.b r1 = new vg.b
                ah.a r3 = new ah.a
                zg.d r4 = p458zg.EnumC7332d.f28068Z
                java.lang.String r5 = "Error"
                r3.<init>(r5, r2, r4)
                r1.<init>(r3)
                r0.mo1415j(r1)
            L396:
                wf.k r0 = r7.f26662k0
                androidx.lifecycle.d0<java.lang.Boolean> r0 = r0.f26627e
                java.lang.Boolean r1 = java.lang.Boolean.FALSE
                r0.mo1415j(r1)
                ch.l r0 = ch.C0985l.f5061a
                return r0
        }
    }

    /* renamed from: wf.k$f */
    public static final class f extends p239nh.AbstractC4830j implements mh.InterfaceC4609a<p105g2.C2221o> {

        /* renamed from: Z */
        public final /* synthetic */ android.app.Application f26667Z;

        public f(android.app.Application r1) {
                r0 = this;
                r0.f26667Z = r1
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4609a
        /* renamed from: e */
        public p105g2.C2221o mo15e() {
                r1 = this;
                android.app.Application r0 = r1.f26667Z
                g2.o r0 = p119h2.C2450l.m6226a(r0)
                return r0
        }
    }

    /* renamed from: wf.k$g */
    public static final class g extends p239nh.AbstractC4830j implements mh.InterfaceC4624p<java.lang.Integer, wf.C6859f, java.lang.String> {

        /* renamed from: Z */
        public static final wf.C6864k.g f26668Z = null;

        static {
                wf.k$g r0 = new wf.k$g
                r0.<init>()
                wf.C6864k.g.f26668Z = r0
                return
        }

        public g() {
                r1 = this;
                r0 = 2
                r1.<init>(r0)
                return
        }

        @Override // mh.InterfaceC4624p
        /* renamed from: l */
        public java.lang.String mo122l(java.lang.Integer r3, wf.C6859f r4) {
                r2 = this;
                java.lang.Integer r3 = (java.lang.Integer) r3
                wf.f r4 = (wf.C6859f) r4
                if (r3 != 0) goto L9
                java.lang.String r3 = "All collections (--)"
                goto L37
            L9:
                r0 = 41
                if (r4 != 0) goto L22
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r1 = "All collections ("
                r4.append(r1)
                r4.append(r3)
                r4.append(r0)
                java.lang.String r3 = r4.toString()
                goto L37
            L22:
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r1 = r4.f26614a
                r3.append(r1)
                java.lang.String r1 = " ("
                r3.append(r1)
                int r4 = r4.f26615b
                java.lang.String r3 = p084f0.C1939b.m4826a(r3, r4, r0)
            L37:
                return r3
        }
    }

    public C6864k(android.app.Application r4, p238nd.C4728b0 r5) {
            r3 = this;
            java.lang.String r0 = "app"
            p214m2.C4339q.m9706k(r4, r0)
            java.lang.String r0 = "eosManager"
            p214m2.C4339q.m9706k(r5, r0)
            r3.<init>()
            wf.k$f r0 = new wf.k$f
            r0.<init>(r4)
            ch.d r4 = p185k7.C4038x4.m9096i(r0)
            r3.f26625c = r4
            androidx.lifecycle.d0 r4 = new androidx.lifecycle.d0
            r4.<init>()
            r3.f26626d = r4
            androidx.lifecycle.d0 r4 = new androidx.lifecycle.d0
            r4.<init>()
            r3.f26627e = r4
            r3.f26628f = r4
            androidx.lifecycle.d0 r4 = new androidx.lifecycle.d0
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r4.<init>(r0)
            r3.f26629g = r4
            r3.f26630h = r4
            androidx.lifecycle.d0 r4 = new androidx.lifecycle.d0
            r4.<init>()
            r3.f26631i = r4
            r3.f26632j = r4
            androidx.lifecycle.d0 r4 = new androidx.lifecycle.d0
            r4.<init>()
            r3.f26633k = r4
            r3.f26634l = r4
            androidx.lifecycle.d0 r4 = new androidx.lifecycle.d0
            r4.<init>()
            r3.f26635m = r4
            k1.b r0 = p179k1.C3642b.f16074w0
            androidx.lifecycle.LiveData r0 = androidx.lifecycle.C0455m0.m1450a(r4, r0)
            r3.f26636n = r0
            androidx.lifecycle.d0 r0 = new androidx.lifecycle.d0
            r0.<init>()
            r3.f26637o = r0
            dh.k r1 = p062dh.C1475k.f7237Y
            r3.f26638p = r1
            androidx.lifecycle.d0 r1 = new androidx.lifecycle.d0
            r2 = 0
            r1.<init>(r2)
            r3.f26639q = r1
            androidx.lifecycle.d0 r2 = new androidx.lifecycle.d0
            r2.<init>()
            r3.f26640r = r2
            r3.f26641s = r2
            wf.k$g r2 = wf.C6864k.g.f26668Z
            androidx.lifecycle.LiveData r0 = p185k7.C4038x4.m9090c(r0, r1, r2)
            r3.f26642t = r0
            id.b r5 = r5.m10795h()
            if (r5 == 0) goto L82
            java.lang.String r5 = r5.f12559a
            if (r5 != 0) goto L84
        L82:
            java.lang.String r5 = ""
        L84:
            r3.f26643u = r5
            nd.x r5 = new nd.x
            r5.<init>(r3)
            r3.f26644v = r5
            r4.m1414g(r5)
            r4 = 1
            r3.f26648z = r4
            return
    }

    /* renamed from: d */
    public static final java.lang.Object m13918d(wf.C6864k r4, int r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, p101fh.InterfaceC2172d r9) {
            fh.j r0 = new fh.j
            fh.d r9 = gh.C2390b.m6127q(r9)
            r0.<init>(r9)
            nh.q r9 = new nh.q
            r9.<init>()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            nd.v0 r2 = p238nd.C4781v0.f19121e
            java.lang.String r3 = "Please for EndpointManager us initialize() before getting the instance."
            java.util.Objects.requireNonNull(r2, r3)
            java.lang.String r2 = r2.m10838b()
            r1.append(r2)
            java.lang.String r2 = "/v1/assets?owner="
            r1.append(r2)
            r1.append(r6)
            java.lang.String r6 = "&order=desc&sort=transferred"
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            r9.f19232Y = r6
            r6 = 0
            if (r8 == 0) goto L40
            boolean r1 = p362uh.C6463i.m13054K(r8)
            if (r1 == 0) goto L3e
            goto L40
        L3e:
            r1 = 0
            goto L41
        L40:
            r1 = 1
        L41:
            if (r1 != 0) goto L65
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            T r2 = r9.f19232Y
            java.lang.String r2 = (java.lang.String) r2
            r1.append(r2)
            java.lang.String r2 = "&collection_name="
            r1.append(r2)
            java.lang.CharSequence r8 = p362uh.C6467m.m13083n0(r8)
            java.lang.String r8 = r8.toString()
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            r9.f19232Y = r8
        L65:
            if (r7 == 0) goto L6d
            boolean r8 = p362uh.C6463i.m13054K(r7)
            if (r8 == 0) goto L6e
        L6d:
            r6 = 1
        L6e:
            if (r6 != 0) goto La2
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            T r6 = r9.f19232Y
            java.lang.String r6 = (java.lang.String) r6
            r5.append(r6)
            java.lang.String r6 = "&match="
            r5.append(r6)
            java.lang.CharSequence r6 = p362uh.C6467m.m13083n0(r7)
            java.lang.String r6 = r6.toString()
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            r9.f19232Y = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            T r6 = r9.f19232Y
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r7 = "&page=1&limit=1000"
            java.lang.String r5 = p346u.C6269n.m12888a(r5, r6, r7)
            goto Lbf
        La2:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            T r7 = r9.f19232Y
            java.lang.String r7 = (java.lang.String) r7
            r6.append(r7)
            java.lang.String r7 = "&page="
            r6.append(r7)
            r6.append(r5)
            java.lang.String r5 = "&limit=400"
            r6.append(r5)
            java.lang.String r5 = r6.toString()
        Lbf:
            r9.f19232Y = r5
            wf.n r5 = new wf.n
            r5.<init>(r0)
            wf.o r6 = new wf.o
            r6.<init>(r0)
            wf.l r7 = new wf.l
            r7.<init>(r9, r5, r6)
            g2.o r4 = r4.m13925k()
            r4.m5814a(r7)
            java.lang.Object r4 = r0.m5741a()
            return r4
    }

    /* renamed from: e */
    public static final java.lang.Object m13919e(wf.C6864k r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, p101fh.InterfaceC2172d r15) {
            java.util.Objects.requireNonNull(r11)
            boolean r0 = r15 instanceof wf.C6869p
            if (r0 == 0) goto L16
            r0 = r15
            wf.p r0 = (wf.C6869p) r0
            int r1 = r0.f26677h0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f26677h0 = r1
            goto L1b
        L16:
            wf.p r0 = new wf.p
            r0.<init>(r11, r15)
        L1b:
            java.lang.Object r15 = r0.f26675f0
            gh.a r7 = gh.EnumC2389a.f10764Y
            int r1 = r0.f26677h0
            r8 = 2
            r9 = 0
            r10 = 1
            if (r1 == 0) goto L53
            if (r1 == r10) goto L3c
            if (r1 != r8) goto L34
            java.lang.Object r11 = r0.f26671b0
            java.util.List r11 = (java.util.List) r11
            p074e9.C1805a.m4540y(r15)
        L31:
            r7 = r11
            goto Lb2
        L34:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L3c:
            java.lang.Object r11 = r0.f26674e0
            r14 = r11
            java.lang.String r14 = (java.lang.String) r14
            java.lang.Object r11 = r0.f26673d0
            r13 = r11
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r11 = r0.f26672c0
            r12 = r11
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r11 = r0.f26671b0
            wf.k r11 = (wf.C6864k) r11
            p074e9.C1805a.m4540y(r15)
            goto L6e
        L53:
            p074e9.C1805a.m4540y(r15)
            r4 = 0
            r0.f26671b0 = r11
            r0.f26672c0 = r12
            r0.f26673d0 = r13
            r0.f26674e0 = r14
            r0.f26677h0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r5 = r14
            r6 = r0
            java.lang.Object r15 = r1.m13924j(r2, r3, r4, r5, r6)
            if (r15 != r7) goto L6e
            goto Lf6
        L6e:
            r1 = r11
            r2 = r12
            r3 = r13
            r5 = r14
            md.f r15 = (md.C4551f) r15
            java.util.List r11 = r15.getData()
            java.util.ArrayList r12 = new java.util.ArrayList
            r13 = 10
            int r13 = p062dh.C1469e.m3992D(r11, r13)
            r12.<init>(r13)
            java.util.Iterator r11 = r11.iterator()
        L87:
            boolean r13 = r11.hasNext()
            if (r13 == 0) goto L9b
            java.lang.Object r13 = r11.next()
            xf.e r13 = (p417xf.C7051e) r13
            io.tacocrypto.app.ui.tools.nftwallet.main.NFTAssetUI r13 = r13.toNFTAssetUI()
            r12.add(r13)
            goto L87
        L9b:
            java.util.List r11 = p062dh.C1473i.m4009U(r12)
            r4 = 1
            r0.f26671b0 = r11
            r0.f26672c0 = r9
            r0.f26673d0 = r9
            r0.f26674e0 = r9
            r0.f26677h0 = r8
            r6 = r0
            java.lang.Object r15 = r1.m13924j(r2, r3, r4, r5, r6)
            if (r15 != r7) goto L31
            goto Lf6
        Lb2:
            md.f r15 = (md.C4551f) r15
            java.util.List r11 = r15.getData()
            java.util.Iterator r11 = r11.iterator()
        Lbc:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto Lf6
            java.lang.Object r12 = r11.next()
            xf.e r12 = (p417xf.C7051e) r12
            java.util.Iterator r13 = r7.iterator()
        Lcc:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto Le6
            java.lang.Object r14 = r13.next()
            r15 = r14
            io.tacocrypto.app.ui.tools.nftwallet.main.NFTAssetUI r15 = (io.tacocrypto.app.p156ui.tools.nftwallet.main.NFTAssetUI) r15
            java.lang.String r15 = r15.f14479Y
            java.lang.String r0 = r12.getAsset_id()
            boolean r15 = p214m2.C4339q.m9702c(r15, r0)
            if (r15 == 0) goto Lcc
            goto Le7
        Le6:
            r14 = r9
        Le7:
            if (r14 == 0) goto Leb
            r13 = 1
            goto Lec
        Leb:
            r13 = 0
        Lec:
            if (r13 != 0) goto Lbc
            io.tacocrypto.app.ui.tools.nftwallet.main.NFTAssetUI r12 = r12.toNFTAssetUI()
            r7.add(r12)
            goto Lbc
        Lf6:
            return r7
    }

    /* renamed from: f */
    public static final java.lang.Object m13920f(wf.C6864k r5, p101fh.InterfaceC2172d r6) {
            java.util.Objects.requireNonNull(r5)
            fh.j r0 = new fh.j
            fh.d r6 = gh.C2390b.m6127q(r6)
            r0.<init>(r6)
            nd.v0 r6 = p238nd.C4781v0.f19121e
            java.lang.String r1 = "Please for EndpointManager us initialize() before getting the instance."
            java.util.Objects.requireNonNull(r6, r1)
            java.lang.String r6 = r6.m10839c()
            wf.t r1 = new wf.t
            r1.<init>(r0)
            wf.u r2 = new wf.u
            r2.<init>(r0)
            wf.r r3 = new wf.r
            java.lang.String r4 = "{\n    \"json\": true,\n    \"code\": \"atomhubtools\",\n    \"scope\": \"atomhubtools\",\n    \"table\": \"acclists\",\n    \"lower_bound\": \"col.verify\",\n    \"upper_bound\": \"col.wlist\",\n    \"limit\": \"1000\"\n}"
            r3.<init>(r6, r4, r1, r2)
            g2.o r5 = r5.m13925k()
            r5.m5814a(r3)
            java.lang.Object r5 = r0.m5741a()
            return r5
    }

    /* renamed from: g */
    public static final java.lang.Object m13921g(wf.C6864k r3, java.lang.String r4, p101fh.InterfaceC2172d r5) {
            fh.j r0 = new fh.j
            fh.d r5 = gh.C2390b.m6127q(r5)
            r0.<init>(r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            nd.v0 r1 = p238nd.C4781v0.f19121e
            java.lang.String r2 = "Please for EndpointManager us initialize() before getting the instance."
            java.util.Objects.requireNonNull(r1, r2)
            java.lang.String r1 = r1.m10837a()
            r5.append(r1)
            java.lang.String r1 = "/v1/accounts/"
            r5.append(r1)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            wf.x r5 = new wf.x
            r5.<init>(r0)
            wf.y r1 = new wf.y
            r1.<init>(r0)
            wf.v r2 = new wf.v
            r2.<init>(r4, r5, r1)
            g2.o r3 = r3.m13925k()
            r3.m5814a(r2)
            java.lang.Object r3 = r0.m5741a()
            return r3
    }

    /* renamed from: h */
    public static final java.lang.Object m13922h(wf.C6864k r4, java.lang.String r5, java.lang.String r6, p101fh.InterfaceC2172d r7) {
            fh.j r0 = new fh.j
            fh.d r7 = gh.C2390b.m6127q(r7)
            r0.<init>(r7)
            nh.q r7 = new nh.q
            r7.<init>()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            nd.v0 r2 = p238nd.C4781v0.f19121e
            java.lang.String r3 = "Please for EndpointManager us initialize() before getting the instance."
            java.util.Objects.requireNonNull(r2, r3)
            java.lang.String r2 = r2.m10838b()
            r1.append(r2)
            java.lang.String r2 = "/v1/prices/assets?owner="
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r7.f19232Y = r5
            if (r6 == 0) goto L3a
            boolean r5 = p362uh.C6463i.m13054K(r6)
            if (r5 == 0) goto L38
            goto L3a
        L38:
            r5 = 0
            goto L3b
        L3a:
            r5 = 1
        L3b:
            if (r5 != 0) goto L5f
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            T r1 = r7.f19232Y
            java.lang.String r1 = (java.lang.String) r1
            r5.append(r1)
            java.lang.String r1 = "&collection_name="
            r5.append(r1)
            java.lang.CharSequence r6 = p362uh.C6467m.m13083n0(r6)
            java.lang.String r6 = r6.toString()
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            r7.f19232Y = r5
        L5f:
            wf.b0 r5 = new wf.b0
            r5.<init>(r0)
            wf.c0 r6 = new wf.c0
            r6.<init>(r0)
            wf.z r1 = new wf.z
            r1.<init>(r7, r5, r6)
            g2.o r4 = r4.m13925k()
            r4.m5814a(r1)
            java.lang.Object r4 = r0.m5741a()
            return r4
    }

    @Override // androidx.lifecycle.AbstractC0457n0
    /* renamed from: b */
    public void mo8b() {
            r2 = this;
            androidx.lifecycle.d0<java.lang.String> r0 = r2.f26635m
            androidx.lifecycle.e0<java.lang.String> r1 = r2.f26644v
            r0.mo6k(r1)
            return
    }

    /* renamed from: i */
    public final void m13923i() {
            r3 = this;
            vh.f0<?> r0 = r3.f26645w
            if (r0 == 0) goto Le
            java.util.concurrent.CancellationException r1 = new java.util.concurrent.CancellationException
            java.lang.String r2 = "cancel for change wallet"
            r1.<init>(r2)
            r0.mo13553d0(r1)
        Le:
            vh.f0<?> r0 = r3.f26645w
            if (r0 == 0) goto L1c
            java.util.concurrent.CancellationException r1 = new java.util.concurrent.CancellationException
            java.lang.String r2 = "cancel children for change wallet"
            r1.<init>(r2)
            p209lh.C4304a.m9613g(r0, r1)
        L1c:
            androidx.lifecycle.d0<java.lang.Boolean> r0 = r3.f26627e
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r0.mo7l(r1)
            r0 = 1
            r3.f26648z = r0
            return
    }

    /* renamed from: j */
    public final java.lang.Object m13924j(java.lang.String r5, java.lang.String r6, boolean r7, java.lang.String r8, p101fh.InterfaceC2172d<? super md.C4551f<p417xf.C7051e>> r9) {
            r4 = this;
            fh.j r0 = new fh.j
            fh.d r9 = gh.C2390b.m6127q(r9)
            r0.<init>(r9)
            nh.q r9 = new nh.q
            r9.<init>()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            nd.v0 r2 = p238nd.C4781v0.f19121e
            java.lang.String r3 = "Please for EndpointManager us initialize() before getting the instance."
            java.util.Objects.requireNonNull(r2, r3)
            java.lang.String r2 = r2.m10838b()
            r1.append(r2)
            java.lang.String r2 = "/v1/assets?owner="
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = "&order=desc&sort=transferred&page=1&limit=1000"
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r9.f19232Y = r5
            if (r8 == 0) goto L3f
            boolean r5 = p362uh.C6463i.m13054K(r8)
            if (r5 == 0) goto L3d
            goto L3f
        L3d:
            r5 = 0
            goto L40
        L3f:
            r5 = 1
        L40:
            if (r5 != 0) goto L64
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            T r1 = r9.f19232Y
            java.lang.String r1 = (java.lang.String) r1
            r5.append(r1)
            java.lang.String r1 = "&collection_name="
            r5.append(r1)
            java.lang.CharSequence r8 = p362uh.C6467m.m13083n0(r8)
            java.lang.String r8 = r8.toString()
            r5.append(r8)
            java.lang.String r5 = r5.toString()
            r9.f19232Y = r5
        L64:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            T r8 = r9.f19232Y
            java.lang.String r8 = (java.lang.String) r8
            r5.append(r8)
            if (r7 == 0) goto L7a
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "&match_mutable_name="
            goto L81
        L7a:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "&match="
        L81:
            r7.append(r8)
            java.lang.CharSequence r6 = p362uh.C6467m.m13083n0(r6)
            java.lang.String r6 = r6.toString()
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            r9.f19232Y = r5
            wf.k$c r5 = new wf.k$c
            r5.<init>(r0)
            wf.k$d r6 = new wf.k$d
            r6.<init>(r0)
            wf.k$b r7 = new wf.k$b
            r7.<init>(r9, r5, r6)
            g2.o r5 = r4.m13925k()
            r5.m5814a(r7)
            java.lang.Object r5 = r0.m5741a()
            return r5
    }

    /* renamed from: k */
    public final p105g2.C2221o m13925k() {
            r1 = this;
            ch.d r0 = r1.f26625c
            java.lang.Object r0 = r0.getValue()
            g2.o r0 = (p105g2.C2221o) r0
            return r0
    }

    /* renamed from: l */
    public final void m13926l(boolean r15) {
            r14 = this;
            androidx.lifecycle.d0<java.lang.Boolean> r0 = r14.f26627e
            java.lang.Object r0 = r0.m1411d()
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            boolean r0 = p214m2.C4339q.m9702c(r0, r1)
            if (r0 == 0) goto Lf
            return
        Lf:
            androidx.lifecycle.d0<java.lang.Boolean> r0 = r14.f26627e
            r0.mo7l(r1)
            int r6 = r14.f26648z
            androidx.lifecycle.d0<java.lang.String> r0 = r14.f26635m
            java.lang.Object r0 = r0.m1411d()
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L22
            java.lang.String r0 = ""
        L22:
            r7 = r0
            androidx.lifecycle.d0<wf.f> r0 = r14.f26639q
            java.lang.Object r0 = r0.m1411d()
            wf.f r0 = (wf.C6859f) r0
            if (r0 == 0) goto L30
            java.lang.String r0 = r0.f26614a
            goto L31
        L30:
            r0 = 0
        L31:
            r4 = r0
            vh.b0 r0 = p064e.C1488b.m4037d(r14)
            r9 = 0
            wf.k$e r11 = new wf.k$e
            r8 = 0
            r2 = r11
            r3 = r14
            r5 = r15
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r12 = 3
            r13 = 0
            r10 = 0
            r8 = r0
            vh.f0 r15 = p101fh.C2174f.m5714d(r8, r9, r10, r11, r12, r13)
            r14.f26645w = r15
            return
    }
}
