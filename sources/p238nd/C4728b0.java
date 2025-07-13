package p238nd;

@android.annotation.SuppressLint({"StaticFieldLeak"})
/* renamed from: nd.b0 */
/* loaded from: classes.dex */
public final class C4728b0 {

    /* renamed from: D */
    public static final p238nd.C4728b0.a f18900D = null;

    /* renamed from: E */
    public static p238nd.C4728b0 f18901E;

    /* renamed from: A */
    public final androidx.lifecycle.LiveData<java.util.List<p255od.C5194b0>> f18902A;

    /* renamed from: B */
    public final androidx.lifecycle.LiveData<ch.C0978e<id.C3131b, java.lang.Boolean>> f18903B;

    /* renamed from: C */
    public final p238nd.C4767o0 f18904C;

    /* renamed from: a */
    public final android.content.Context f18905a;

    /* renamed from: b */
    public final p238nd.C4778u f18906b;

    /* renamed from: c */
    public final io.tacocrypto.app.database.AppDatabase f18907c;

    /* renamed from: d */
    public final vg.C6678s f18908d;

    /* renamed from: e */
    public final ch.InterfaceC0977d f18909e;

    /* renamed from: f */
    public final ch.InterfaceC0977d f18910f;

    /* renamed from: g */
    public final java.lang.String f18911g;

    /* renamed from: h */
    public final ch.InterfaceC0977d f18912h;

    /* renamed from: i */
    public mh.InterfaceC4609a<ch.C0985l> f18913i;

    /* renamed from: j */
    public final java.util.List<android.webkit.WebView> f18914j;

    /* renamed from: k */
    public one.block.eosiojava.session.TransactionProcessor f18915k;

    /* renamed from: l */
    public android.webkit.WebView f18916l;

    /* renamed from: m */
    public p238nd.InterfaceC4727b f18917m;

    /* renamed from: n */
    public mh.InterfaceC4624p<? super java.lang.Boolean, ? super java.lang.String, ch.C0985l> f18918n;

    /* renamed from: o */
    public mh.InterfaceC4625q<? super java.lang.Boolean, ? super java.lang.String, ? super p255od.C5230t0, ch.C0985l> f18919o;

    /* renamed from: p */
    public p255od.C5232u0 f18920p;

    /* renamed from: q */
    public p255od.EnumC5236x f18921q;

    /* renamed from: r */
    public final androidx.lifecycle.C0437d0<id.C3131b> f18922r;

    /* renamed from: s */
    public final androidx.lifecycle.C0437d0<vg.C6661b<java.lang.Boolean>> f18923s;

    /* renamed from: t */
    public mh.InterfaceC4609a<ch.C0985l> f18924t;

    /* renamed from: u */
    public final androidx.lifecycle.LiveData<java.util.List<id.C3131b>> f18925u;

    /* renamed from: v */
    public java.lang.Double f18926v;

    /* renamed from: w */
    public final java.util.List<id.C3131b> f18927w;

    /* renamed from: x */
    public final androidx.lifecycle.C0437d0<java.util.List<p255od.C5238z>> f18928x;

    /* renamed from: y */
    public final androidx.lifecycle.LiveData<java.util.List<p255od.C5238z>> f18929y;

    /* renamed from: z */
    public final androidx.lifecycle.C0437d0<java.util.List<p255od.C5194b0>> f18930z;

    /* renamed from: nd.b0$a */
    public static final class a {
        public a(p239nh.C4826f r1) {
                r0 = this;
                r0.<init>()
                return
        }

        /* renamed from: a */
        public final synchronized p238nd.C4728b0 m10809a() {
                r2 = this;
                monitor-enter(r2)
                nd.b0 r0 = p238nd.C4728b0.f18901E     // Catch: java.lang.Throwable -> L12
                if (r0 == 0) goto La
                p214m2.C4339q.m9704i(r0)     // Catch: java.lang.Throwable -> L12
                monitor-exit(r2)
                return r0
            La:
                java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch: java.lang.Throwable -> L12
                java.lang.String r1 = "Please call initialize() before getting the instance."
                r0.<init>(r1)     // Catch: java.lang.Throwable -> L12
                throw r0     // Catch: java.lang.Throwable -> L12
            L12:
                r0 = move-exception
                monitor-exit(r2)
                throw r0
        }
    }

    /* renamed from: nd.b0$b */
    public final class b {

        /* renamed from: a */
        public final /* synthetic */ p238nd.C4728b0 f18931a;

        public b(p238nd.C4728b0 r1) {
                r0 = this;
                r0.f18931a = r1
                r0.<init>()
                return
        }

        @android.webkit.JavascriptInterface
        public final void mobileMethod(java.lang.String r14) {
                r13 = this;
                nd.b0 r0 = r13.f18931a
                java.util.Objects.requireNonNull(r0)
                java.lang.String r1 = "onPostMessageReceived"
                hk.a$b r1 = hk.C3053a.m7466a(r1)
                r2 = 0
                java.lang.Object[] r3 = new java.lang.Object[r2]
                r1.mo7467a(r14, r3)
                if (r14 != 0) goto L15
                goto Lf5
            L15:
                r1 = 2
                java.lang.String r3 = "pubKeys"
                boolean r3 = p362uh.C6467m.m13064U(r14, r3, r2, r1)
                r4 = 0
                if (r3 == 0) goto L6b
                jb.j r1 = new jb.j
                r1.<init>()
                java.lang.Class<od.y> r3 = p255od.C5237y.class
                java.lang.Object r14 = r1.m7929c(r14, r3)
                java.lang.Class r1 = p074e9.C1805a.m4513A(r3)
                java.lang.Object r14 = r1.cast(r14)
                od.y r14 = (p255od.C5237y) r14
                java.lang.String r1 = r14.getUserAccount()
                if (r1 == 0) goto L40
                boolean r1 = p362uh.C6463i.m13054K(r1)
                if (r1 == 0) goto L41
            L40:
                r2 = 1
            L41:
                if (r2 == 0) goto L44
                goto L58
            L44:
                id.b r4 = new id.b
                java.lang.String r1 = r14.getUserAccount()
                od.v0 r2 = p255od.EnumC5234v0.WAX_CLOUD_WALLET
                r4.<init>(r1, r2)
                io.tacocrypto.app.database.AppDatabase r1 = r0.f18907c
                hd.d r1 = r1.mo7713p()
                r1.mo7442b(r4)
            L58:
                android.os.Handler r1 = new android.os.Handler
                android.os.Looper r2 = android.os.Looper.getMainLooper()
                r1.<init>(r2)
                f4.n0 r2 = new f4.n0
                r2.<init>(r4, r14, r0)
                r1.post(r2)
                goto Lf5
            L6b:
                java.lang.String r3 = "TX_SIGNED"
                boolean r3 = p362uh.C6467m.m13064U(r14, r3, r2, r1)
                if (r3 == 0) goto Ldc
                nd.q0 r1 = new nd.q0
                r1.<init>()
                java.lang.reflect.Type r1 = r1.f21382b
                java.lang.Object r14 = p238nd.C4776t.m10832a(r14, r1)
                od.p0 r14 = (p255od.C5222p0) r14
                java.util.List r1 = r14.getSignatures()
                one.block.eosiojava.session.TransactionProcessor r3 = r0.f18915k
                if (r3 != 0) goto L89
                goto L8b
            L89:
                r3.signatures = r1
            L8b:
                byte[] r5 = r14.getSerializedTransaction()
                if (r5 == 0) goto La0
                vg.n r11 = vg.C6673n.f25946Z
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = 0
                r12 = 30
                java.lang.String r6 = ""
                java.lang.String r14 = p062dh.C1468d.m3989K(r5, r6, r7, r8, r9, r10, r11, r12)
                goto La1
            La0:
                r14 = r4
            La1:
                if (r14 != 0) goto La5
                java.lang.String r14 = ""
            La5:
                od.u0 r3 = r0.f18920p
                mh.p<? super java.lang.Boolean, ? super java.lang.String, ch.l> r5 = r0.f18918n
                if (r5 != 0) goto Lcc
                mh.q<? super java.lang.Boolean, ? super java.lang.String, ? super od.t0, ch.l> r5 = r0.f18919o
                if (r5 == 0) goto Lcc
                if (r3 == 0) goto Lcc
                java.lang.Object[] r14 = new java.lang.Object[r2]
                hk.a$b r2 = hk.C3053a.f12282b
                java.lang.String r4 = "Is an uplift transaction"
                r2.mo7467a(r4, r14)
                android.os.Handler r14 = new android.os.Handler
                android.os.Looper r2 = android.os.Looper.getMainLooper()
                r14.<init>(r2)
                f4.n0 r2 = new f4.n0
                r2.<init>(r1, r3, r0)
                r14.post(r2)
                goto Lf5
            Lcc:
                vh.v0 r1 = p379vh.C6746v0.f26044Y
                r5 = 0
                nd.p0 r7 = new nd.p0
                r7.<init>(r0, r14, r4)
                r8 = 3
                r9 = 0
                r6 = 0
                r4 = r1
                p101fh.C2174f.m5714d(r4, r5, r6, r7, r8, r9)
                goto Lf5
            Ldc:
                java.lang.String r3 = "READY"
                boolean r14 = p362uh.C6467m.m13064U(r14, r3, r2, r1)
                if (r14 == 0) goto Lf5
                android.os.Handler r14 = new android.os.Handler
                android.os.Looper r1 = android.os.Looper.getMainLooper()
                r14.<init>(r1)
                f1.f r1 = new f1.f
                r1.<init>(r0)
                r14.post(r1)
            Lf5:
                return
        }
    }

    /* renamed from: nd.b0$c */
    public /* synthetic */ class c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f18932a = null;

        static {
                od.v0[] r0 = p255od.EnumC5234v0.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                od.v0 r1 = p255od.EnumC5234v0.ANCHOR
                int r1 = r1.ordinal()
                r2 = 1
                r0[r1] = r2
                od.v0 r1 = p255od.EnumC5234v0.WAX_CLOUD_WALLET
                int r1 = r1.ordinal()
                r3 = 2
                r0[r1] = r3
                p238nd.C4728b0.c.f18932a = r0
                ge.a[] r0 = ge.EnumC2328a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r1 = 0
                r0[r1] = r2
                r0[r2] = r3
                r4 = 3
                r0[r3] = r4
                rf.a[] r0 = p314rf.EnumC5833a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r0[r1] = r2
                r0[r2] = r3
                r0[r3] = r4
                return
        }
    }

    /* renamed from: nd.b0$d */
    public static final class d extends p119h2.C2448j {
        public d(java.lang.String r2, p238nd.C4728b0.e<T> r3, p238nd.C4728b0.f r4) {
                r1 = this;
                r0 = 0
                r1.<init>(r0, r2, r3, r4)
                return
        }
    }

    /* renamed from: nd.b0$e */
    public static final class e<T> implements p105g2.C2222p.b {

        /* renamed from: a */
        public final /* synthetic */ p101fh.InterfaceC2172d<p255od.C5205h> f18933a;

        public e(p101fh.InterfaceC2172d<? super p255od.C5205h> r1) {
                r0 = this;
                r0.f18933a = r1
                r0.<init>()
                return
        }

        @Override // p105g2.C2222p.b
        /* renamed from: a */
        public void mo117a(java.lang.Object r4) {
                r3 = this;
                java.lang.String r4 = (java.lang.String) r4
                fh.d<od.h> r0 = r3.f18933a
                java.lang.String r1 = "response"
                jb.j r1 = p238nd.C4754k.m10827a(r4, r1)
                nd.k0 r2 = new nd.k0
                r2.<init>()
                java.lang.reflect.Type r2 = r2.f21382b
                java.lang.Object r4 = r1.m7929c(r4, r2)
                r0.mo5707k(r4)
                return
        }
    }

    /* renamed from: nd.b0$f */
    public static final class f implements p105g2.C2222p.a {

        /* renamed from: a */
        public final /* synthetic */ p101fh.InterfaceC2172d<p255od.C5205h> f18934a;

        public f(p101fh.InterfaceC2172d<? super p255od.C5205h> r1) {
                r0 = this;
                r0.f18934a = r1
                r0.<init>()
                return
        }

        @Override // p105g2.C2222p.a
        /* renamed from: a */
        public final void mo118a(p105g2.C2226t r3) {
                r2 = this;
                fh.d<od.h> r0 = r2.f18934a
                java.lang.String r1 = "it"
                p214m2.C4339q.m9705j(r3, r1)
                java.lang.Object r3 = p074e9.C1805a.m4520e(r3)
                r0.mo5707k(r3)
                return
        }
    }

    @p134hh.InterfaceC3044e(m7451c = "io.tacocrypto.app.manager.EOSManager", m7452f = "EOSManager.kt", m7453l = {256}, m7454m = "getBalances")
    /* renamed from: nd.b0$g */
    public static final class g extends p134hh.AbstractC3042c {

        /* renamed from: b0 */
        public java.lang.Object f18935b0;

        /* renamed from: c0 */
        public java.lang.Object f18936c0;

        /* renamed from: d0 */
        public java.lang.Object f18937d0;

        /* renamed from: e0 */
        public java.lang.Object f18938e0;

        /* renamed from: f0 */
        public /* synthetic */ java.lang.Object f18939f0;

        /* renamed from: g0 */
        public final /* synthetic */ p238nd.C4728b0 f18940g0;

        /* renamed from: h0 */
        public int f18941h0;

        public g(p238nd.C4728b0 r1, p101fh.InterfaceC2172d<? super p238nd.C4728b0.g> r2) {
                r0 = this;
                r0.f18940g0 = r1
                r0.<init>(r2)
                return
        }

        @Override // p134hh.AbstractC3040a
        /* renamed from: o */
        public final java.lang.Object mo123o(java.lang.Object r2) {
                r1 = this;
                r1.f18939f0 = r2
                int r2 = r1.f18941h0
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                r2 = r2 | r0
                r1.f18941h0 = r2
                nd.b0 r2 = r1.f18940g0
                r0 = 0
                java.lang.Object r2 = r2.m10792d(r0, r1)
                return r2
        }
    }

    @p134hh.InterfaceC3044e(m7451c = "io.tacocrypto.app.manager.EOSManager", m7452f = "EOSManager.kt", m7453l = {276}, m7454m = "getMarketsFromSwap")
    /* renamed from: nd.b0$h */
    public static final class h extends p134hh.AbstractC3042c {

        /* renamed from: b0 */
        public java.lang.Object f18942b0;

        /* renamed from: c0 */
        public /* synthetic */ java.lang.Object f18943c0;

        /* renamed from: d0 */
        public final /* synthetic */ p238nd.C4728b0 f18944d0;

        /* renamed from: e0 */
        public int f18945e0;

        public h(p238nd.C4728b0 r1, p101fh.InterfaceC2172d<? super p238nd.C4728b0.h> r2) {
                r0 = this;
                r0.f18944d0 = r1
                r0.<init>(r2)
                return
        }

        @Override // p134hh.AbstractC3040a
        /* renamed from: o */
        public final java.lang.Object mo123o(java.lang.Object r2) {
                r1 = this;
                r1.f18943c0 = r2
                int r2 = r1.f18945e0
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                r2 = r2 | r0
                r1.f18945e0 = r2
                nd.b0 r2 = r1.f18944d0
                r0 = 0
                java.lang.Object r2 = r2.m10793f(r0, r1)
                return r2
        }
    }

    @p134hh.InterfaceC3044e(m7451c = "io.tacocrypto.app.manager.EOSManager", m7452f = "EOSManager.kt", m7453l = {283}, m7454m = "getWaxConversion")
    /* renamed from: nd.b0$i */
    public static final class i extends p134hh.AbstractC3042c {

        /* renamed from: b0 */
        public java.lang.Object f18946b0;

        /* renamed from: c0 */
        public /* synthetic */ java.lang.Object f18947c0;

        /* renamed from: d0 */
        public final /* synthetic */ p238nd.C4728b0 f18948d0;

        /* renamed from: e0 */
        public int f18949e0;

        public i(p238nd.C4728b0 r1, p101fh.InterfaceC2172d<? super p238nd.C4728b0.i> r2) {
                r0 = this;
                r0.f18948d0 = r1
                r0.<init>(r2)
                return
        }

        @Override // p134hh.AbstractC3040a
        /* renamed from: o */
        public final java.lang.Object mo123o(java.lang.Object r2) {
                r1 = this;
                r1.f18947c0 = r2
                int r2 = r1.f18949e0
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                r2 = r2 | r0
                r1.f18949e0 = r2
                nd.b0 r2 = r1.f18948d0
                r0 = 0
                java.lang.Object r2 = r2.m10797j(r0, r1)
                return r2
        }
    }

    /* renamed from: nd.b0$j */
    public static final class j extends p119h2.C2448j {
        public j(java.lang.String r1, java.lang.String r2, p238nd.C4728b0.k<T> r3, p238nd.C4728b0.l r4) {
                r0 = this;
                r2 = 1
                r0.<init>(r2, r1, r3, r4)
                return
        }

        @Override // p105g2.AbstractC2220n
        /* renamed from: l */
        public byte[] mo116l() {
                r2 = this;
                java.nio.charset.Charset r0 = p362uh.C6455a.f25034b
                java.lang.String r1 = "{\n  \"code\": \"delphioracle\",\n  \"json\": true,\n  \"limit\": 100,\n  \"lower_bound\": \"\",\n  \"scope\": \"waxpusd\",\n  \"table\": \"datapoints\",\n  \"upper_bound\": \"\"\n}"
                byte[] r0 = r1.getBytes(r0)
                java.lang.String r1 = "this as java.lang.String).getBytes(charset)"
                p214m2.C4339q.m9705j(r0, r1)
                return r0
        }
    }

    /* renamed from: nd.b0$k */
    public static final class k<T> implements p105g2.C2222p.b {

        /* renamed from: a */
        public final /* synthetic */ p101fh.InterfaceC2172d<md.C4559j<p417xf.C7056j>> f18950a;

        public k(p101fh.InterfaceC2172d<? super md.C4559j<p417xf.C7056j>> r1) {
                r0 = this;
                r0.f18950a = r1
                r0.<init>()
                return
        }

        @Override // p105g2.C2222p.b
        /* renamed from: a */
        public void mo117a(java.lang.Object r4) {
                r3 = this;
                java.lang.String r4 = (java.lang.String) r4
                fh.d<md.j<xf.j>> r0 = r3.f18950a
                java.lang.String r1 = "response"
                jb.j r1 = p238nd.C4754k.m10827a(r4, r1)
                nd.l0 r2 = new nd.l0
                r2.<init>()
                java.lang.reflect.Type r2 = r2.f21382b
                java.lang.Object r4 = r1.m7929c(r4, r2)
                r0.mo5707k(r4)
                return
        }
    }

    /* renamed from: nd.b0$l */
    public static final class l implements p105g2.C2222p.a {

        /* renamed from: a */
        public final /* synthetic */ p101fh.InterfaceC2172d<md.C4559j<p417xf.C7056j>> f18951a;

        public l(p101fh.InterfaceC2172d<? super md.C4559j<p417xf.C7056j>> r1) {
                r0 = this;
                r0.f18951a = r1
                r0.<init>()
                return
        }

        @Override // p105g2.C2222p.a
        /* renamed from: a */
        public final void mo118a(p105g2.C2226t r3) {
                r2 = this;
                fh.d<md.j<xf.j>> r0 = r2.f18951a
                java.lang.String r1 = "it"
                p214m2.C4339q.m9705j(r3, r1)
                java.lang.Object r3 = p074e9.C1805a.m4520e(r3)
                r0.mo5707k(r3)
                return
        }
    }

    @p134hh.InterfaceC3044e(m7451c = "io.tacocrypto.app.manager.EOSManager", m7452f = "EOSManager.kt", m7453l = {2155}, m7454m = "insertWallet")
    /* renamed from: nd.b0$m */
    public static final class m extends p134hh.AbstractC3042c {

        /* renamed from: b0 */
        public java.lang.Object f18952b0;

        /* renamed from: c0 */
        public java.lang.Object f18953c0;

        /* renamed from: d0 */
        public /* synthetic */ java.lang.Object f18954d0;

        /* renamed from: e0 */
        public final /* synthetic */ p238nd.C4728b0 f18955e0;

        /* renamed from: f0 */
        public int f18956f0;

        public m(p238nd.C4728b0 r1, p101fh.InterfaceC2172d<? super p238nd.C4728b0.m> r2) {
                r0 = this;
                r0.f18955e0 = r1
                r0.<init>(r2)
                return
        }

        @Override // p134hh.AbstractC3040a
        /* renamed from: o */
        public final java.lang.Object mo123o(java.lang.Object r2) {
                r1 = this;
                r1.f18954d0 = r2
                int r2 = r1.f18956f0
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                r2 = r2 | r0
                r1.f18956f0 = r2
                nd.b0 r2 = r1.f18955e0
                r0 = 0
                java.lang.Object r2 = r2.m10799l(r0, r1)
                return r2
        }
    }

    /* renamed from: nd.b0$n */
    public static final class n extends p239nh.AbstractC4830j implements mh.InterfaceC4609a<ch.C0985l> {

        /* renamed from: Z */
        public final /* synthetic */ p238nd.C4728b0 f18957Z;

        public n(p238nd.C4728b0 r1) {
                r0 = this;
                r0.f18957Z = r1
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4609a
        /* renamed from: e */
        public ch.C0985l mo15e() {
                r2 = this;
                nd.b0 r0 = r2.f18957Z
                od.x r1 = p255od.EnumC5236x.LOAD
                r0.f18921q = r1
                p238nd.C4728b0.m10787a(r0)
                ch.l r0 = ch.C0985l.f5061a
                return r0
        }
    }

    /* renamed from: nd.b0$o */
    public static final class o extends p239nh.AbstractC4830j implements mh.InterfaceC4609a<ch.C0985l> {

        /* renamed from: Z */
        public final /* synthetic */ p238nd.C4728b0 f18958Z;

        public o(p238nd.C4728b0 r1) {
                r0 = this;
                r0.f18958Z = r1
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4609a
        /* renamed from: e */
        public ch.C0985l mo15e() {
                r2 = this;
                nd.b0 r0 = r2.f18958Z
                od.x r1 = p255od.EnumC5236x.SIGN
                r0.f18921q = r1
                p238nd.C4728b0.m10787a(r0)
                ch.l r0 = ch.C0985l.f5061a
                return r0
        }
    }

    /* renamed from: nd.b0$p */
    public static final class p implements mh.InterfaceC4609a<ch.C0985l> {

        /* renamed from: Y */
        public final /* synthetic */ p238nd.C4728b0 f18959Y;

        /* renamed from: Z */
        public final /* synthetic */ java.util.List<one.block.eosiojava.models.rpcProvider.Action> f18960Z;

        public p(p238nd.C4728b0 r1, java.util.List<? extends one.block.eosiojava.models.rpcProvider.Action> r2) {
                r0 = this;
                r0.f18959Y = r1
                r0.f18960Z = r2
                r0.<init>()
                return
        }

        @Override // mh.InterfaceC4609a
        /* renamed from: e */
        public ch.C0985l mo15e() {
                r9 = this;
                nd.b0 r0 = r9.f18959Y
                one.block.eosiojava.session.TransactionSession r0 = r0.m10796i()
                if (r0 != 0) goto L12
                r1 = 0
                java.lang.Object[] r1 = new java.lang.Object[r1]
                hk.a$b r2 = hk.C3053a.f12282b
                java.lang.String r3 = "ERROR: No TransactionSession found."
                r2.mo7467a(r3, r1)
            L12:
                if (r0 != 0) goto L15
                goto L32
            L15:
                one.block.eosiojava.session.TransactionProcessor r0 = r0.getTransactionProcessor()
                nd.b0 r1 = r9.f18959Y
                r1.f18915k = r0
                java.lang.String r2 = "processor"
                p214m2.C4339q.m9705j(r0, r2)
                java.util.List<one.block.eosiojava.models.rpcProvider.Action> r2 = r9.f18960Z
                vh.v0 r3 = p379vh.C6746v0.f26044Y
                nd.r0 r6 = new nd.r0
                r4 = 0
                r6.<init>(r0, r2, r1, r4)
                r7 = 3
                r8 = 0
                r5 = 0
                p101fh.C2174f.m5714d(r3, r4, r5, r6, r7, r8)
            L32:
                ch.l r0 = ch.C0985l.f5061a
                return r0
        }
    }

    static {
            nd.b0$a r0 = new nd.b0$a
            r1 = 0
            r0.<init>(r1)
            p238nd.C4728b0.f18900D = r0
            return
    }

    public C4728b0(android.content.Context r7, p238nd.C4778u r8, io.tacocrypto.app.database.AppDatabase r9, vg.C6678s r10, p239nh.C4826f r11) {
            r6 = this;
            r6.<init>()
            r6.f18905a = r7
            r6.f18906b = r8
            r6.f18907c = r9
            r6.f18908d = r10
            nd.s0 r7 = new nd.s0
            r7.<init>(r6)
            ch.d r7 = p185k7.C4038x4.m9096i(r7)
            r6.f18909e = r7
            nd.j0 r7 = new nd.j0
            r7.<init>(r6)
            ch.d r7 = p185k7.C4038x4.m9096i(r7)
            r6.f18910f = r7
            java.lang.String r7 = "active"
            r6.f18911g = r7
            nd.u0 r7 = new nd.u0
            r7.<init>(r6)
            ch.d r7 = p185k7.C4038x4.m9096i(r7)
            r6.f18912h = r7
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r6.f18914j = r7
            androidx.lifecycle.d0 r7 = new androidx.lifecycle.d0
            r7.<init>()
            r6.f18922r = r7
            androidx.lifecycle.d0 r8 = new androidx.lifecycle.d0
            r8.<init>()
            r6.f18923s = r8
            hd.d r8 = r9.mo7713p()
            androidx.lifecycle.LiveData r8 = r8.mo7441a()
            r6.f18925u = r8
            vh.v0 r0 = p379vh.C6746v0.f26044Y
            nd.a0 r3 = new nd.a0
            r9 = 0
            r3.<init>(r6, r9)
            r1 = 0
            r2 = 0
            r4 = 3
            r5 = 0
            p101fh.C2174f.m5728r(r0, r1, r2, r3, r4, r5)
            nd.x r9 = new nd.x
            r9.<init>(r6)
            r8.m1414g(r9)
            r6.m10796i()
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            r6.f18927w = r9
            androidx.lifecycle.d0 r9 = new androidx.lifecycle.d0
            r9.<init>()
            r6.f18928x = r9
            r6.f18929y = r9
            androidx.lifecycle.d0 r9 = new androidx.lifecycle.d0
            r9.<init>()
            r6.f18930z = r9
            r6.f18902A = r9
            nd.m0 r9 = p238nd.C4761m0.f19074Z
            androidx.lifecycle.LiveData r7 = p185k7.C4038x4.m9089b(r7, r8, r9)
            r6.f18903B = r7
            nd.o0 r7 = new nd.o0
            r7.<init>(r6)
            r6.f18904C = r7
            return
    }

    /* renamed from: a */
    public static final void m10787a(p238nd.C4728b0 r2) {
            android.webkit.WebView r0 = r2.f18916l
            if (r0 == 0) goto L7
            r2.m10802p(r0)
        L7:
            android.webkit.WebView r0 = r2.f18916l
            if (r0 != 0) goto Lc
            goto L11
        Lc:
            nd.o0 r1 = r2.f18904C
            r0.setWebChromeClient(r1)
        L11:
            android.webkit.WebView r0 = r2.f18916l
            if (r0 != 0) goto L16
            goto L1e
        L16:
            nd.n0 r1 = new nd.n0
            r1.<init>(r2)
            r0.setWebViewClient(r1)
        L1e:
            android.webkit.WebView r2 = r2.f18916l
            if (r2 == 0) goto L27
            java.lang.String r0 = "https://wax.tacocrypto.io"
            r2.loadUrl(r0)
        L27:
            return
    }

    /* renamed from: b */
    public static final p020b3.C0660b m10788b(p238nd.C4728b0 r13, java.lang.String r14) {
            nd.u r0 = r13.f18906b
            long r0 = r0.m10835c()
            java.lang.Character[] r2 = vg.C6660a.f25902a
            java.lang.String r2 = "address"
            p214m2.C4339q.m9706k(r14, r2)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r1 = r0.length()
            int r2 = r14.length()
            int r2 = r1 / r2
            r3 = 1
            int r2 = r2 + r3
            java.lang.String r4 = ""
            r5 = 0
            if (r2 < 0) goto L2d
            r6 = 0
            r7 = r4
        L24:
            java.lang.String r7 = p064e.C1493g.m4049a(r7, r14)
            if (r6 == r2) goto L2e
            int r6 = r6 + 1
            goto L24
        L2d:
            r7 = r4
        L2e:
            java.lang.String r1 = r7.substring(r5, r1)
            java.lang.String r2 = "this as java.lang.String\u2026ing(startIndex, endIndex)"
            p214m2.C4339q.m9705j(r1, r2)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r2 = 0
            r6 = 0
        L3e:
            int r7 = r1.length()
            r8 = 10
            if (r2 >= r7) goto Lbb
            char r7 = r1.charAt(r2)
            int r9 = r6 + 1
            java.lang.Character[] r10 = vg.C6660a.f25902a
            java.lang.Character r7 = java.lang.Character.valueOf(r7)
            int r7 = p062dh.C1468d.m3988J(r10, r7)
            r10 = -1
            if (r7 != r10) goto L6b
            z9.f r10 = p452z9.C7264f.m14340a()
            java.lang.Exception r11 = new java.lang.Exception
            java.lang.String r12 = "this address is not valid: "
            java.lang.String r12 = p064e.C1493g.m4049a(r12, r14)
            r11.<init>(r12)
            r10.m14341b(r11)
        L6b:
            char r6 = r0.charAt(r6)
            java.lang.String r6 = java.lang.String.valueOf(r6)
            int r6 = java.lang.Integer.parseInt(r6)
            java.lang.String r7 = java.lang.String.valueOf(r7)
            java.lang.String r7 = p362uh.C6469o.m13085p0(r7, r3)
            int r7 = java.lang.Integer.parseInt(r7)
            int r7 = r7 + r6
            ph.c$a r6 = ph.AbstractC5526c.f21525Y
            if (r7 < r8) goto L91
            r8 = 5
            int r6 = r6.mo11786d(r3, r8)
            int r6 = r6 * 2
            int r6 = r6 - r3
            goto L99
        L91:
            r8 = 4
            r10 = 0
            int r6 = r6.mo11786d(r10, r8)
            int r6 = r6 * 2
        L99:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r5.add(r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r4)
            java.lang.String r4 = java.lang.String.valueOf(r7)
            java.lang.String r4 = p362uh.C6469o.m13085p0(r4, r3)
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            int r2 = r2 + 1
            r6 = r9
            goto L3e
        Lbb:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r4)
            r1 = 50
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            long r6 = java.lang.Long.parseLong(r0)
            r0 = 2
            long r8 = (long) r0
            long r6 = r6 / r8
            java.lang.String r0 = java.lang.String.valueOf(r6)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = r2.toString()
            long r0 = java.lang.Long.parseLong(r0)
            long r0 = r0 / r8
            java.lang.String r0 = java.lang.String.valueOf(r0)
            long r0 = java.lang.Long.parseLong(r0)
            r2 = 3
            long r6 = (long) r2
            long r0 = r0 * r6
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 62
            java.lang.String r6 = ""
            r2 = 10
            java.lang.String r4 = p062dh.C1473i.m4000L(r5, r6, r7, r8, r9, r10, r11, r12)
            r1.append(r4)
            ph.c$a r4 = ph.AbstractC5526c.f21525Y
            r5 = 0
            int r2 = r4.mo11786d(r5, r2)
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r2 = p362uh.C6469o.m13085p0(r2, r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "nonce"
            p214m2.C4339q.m9706k(r0, r2)
            java.lang.String r2 = "key"
            p214m2.C4339q.m9706k(r1, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "keyClaim: "
            r2.append(r4)
            nd.u r4 = r13.f18906b
            long r4 = r4.m10835c()
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r4 = 0
            java.lang.Object[] r4 = new java.lang.Object[r4]
            hk.a$b r5 = hk.C3053a.f12282b
            r5.mo7467a(r2, r4)
            pd.v0 r2 = new pd.v0
            r2.<init>(r14, r0, r1)
            one.block.eosiojava.models.rpcProvider.Authorization r0 = new one.block.eosiojava.models.rpcProvider.Authorization
            java.lang.String r13 = r13.f18911g
            r0.<init>(r14, r13)
            b3.b r13 = new b3.b
            r13.<init>(r3)
            nd.w0 r1 = new nd.w0
            pd.u1 r3 = new pd.u1
            java.lang.String r4 = "4,TACO"
            r3.<init>(r14, r4, r14)
            java.util.List r14 = p074e9.C1805a.m4528m(r0)
            java.lang.String r4 = "t.taco"
            java.lang.String r5 = "open"
            r1.<init>(r4, r5, r3, r14)
            r13.m2208c(r1)
            nd.w0 r14 = new nd.w0
            java.util.List r0 = p074e9.C1805a.m4528m(r0)
            java.lang.String r1 = "p.taco"
            java.lang.String r3 = "claim"
            r14.<init>(r1, r3, r2, r0)
            r13.m2208c(r14)
            return r13
    }

    /* renamed from: e */
    public static /* synthetic */ java.lang.Object m10789e(p238nd.C4728b0 r0, java.lang.String r1, p101fh.InterfaceC2172d r2, int r3) {
            r1 = 0
            java.lang.Object r0 = r0.m10792d(r1, r2)
            return r0
    }

    /* renamed from: o */
    public static /* synthetic */ void m10790o(p238nd.C4728b0 r6, android.content.Context r7, java.util.List r8, p238nd.EnumC4724a r9, mh.InterfaceC4624p r10, id.C3131b r11, int r12) {
            r5 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.m10801n(r1, r2, r3, r4, r5)
            return
    }

    /* renamed from: c */
    public final java.lang.Object m10791c(java.lang.String r7, java.lang.String r8, p101fh.InterfaceC2172d<? super p255od.C5205h> r9) {
            r6 = this;
            fh.j r0 = new fh.j
            fh.d r1 = gh.C2390b.m6127q(r9)
            r0.<init>(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            vg.s r2 = r6.f18908d
            java.util.Objects.requireNonNull(r2)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r4 = 0
            gb.c r2 = r2.f25948a     // Catch: java.lang.Throwable -> L32
            java.lang.String r5 = "light_api"
            ha.b r2 = p074e9.C1805a.m4525j(r2, r5)     // Catch: java.lang.Throwable -> L32
            java.lang.String r2 = r2.m7366a()     // Catch: java.lang.Throwable -> L32
            java.lang.String r5 = "remoteConfig[LIGHT_API_KEY].asString()"
            p214m2.C4339q.m9705j(r2, r5)     // Catch: java.lang.Throwable -> L32
            boolean r5 = p362uh.C6463i.m13054K(r2)     // Catch: java.lang.Throwable -> L32
            if (r5 == 0) goto L37
            r2 = r4
            goto L37
        L32:
            r2 = move-exception
            java.lang.Object r2 = p074e9.C1805a.m4520e(r2)
        L37:
            boolean r5 = r2 instanceof ch.C0979f.a
            if (r5 == 0) goto L3c
            goto L3d
        L3c:
            r4 = r2
        L3d:
            java.lang.String r4 = (java.lang.String) r4
            if (r4 != 0) goto L43
            java.lang.String r4 = "https://lightapi-wax.tacocrypto.io/"
        L43:
            r3.append(r4)
            java.lang.String r2 = "/api/balances/wax/"
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r1.append(r2)
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            nd.b0$e r1 = new nd.b0$e
            r1.<init>(r0)
            nd.b0$f r2 = new nd.b0$f
            r2.<init>(r0)
            nd.b0$d r3 = new nd.b0$d
            r3.<init>(r7, r1, r2)
            if (r8 == 0) goto L6c
            r3.f10153l0 = r8
        L6c:
            g2.o r7 = r6.m10794g()
            r7.m5814a(r3)
            java.lang.Object r7 = r0.m5741a()
            gh.a r8 = gh.EnumC2389a.f10764Y
            if (r7 != r8) goto L80
            java.lang.String r8 = "frame"
            p214m2.C4339q.m9706k(r9, r8)
        L80:
            return r7
    }

    /* renamed from: d */
    public final java.lang.Object m10792d(java.lang.String r18, p101fh.InterfaceC2172d<? super java.util.List<p255od.C5194b0>> r19) {
            r17 = this;
            r1 = r17
            r0 = r19
            boolean r2 = r0 instanceof p238nd.C4728b0.g
            if (r2 == 0) goto L17
            r2 = r0
            nd.b0$g r2 = (p238nd.C4728b0.g) r2
            int r3 = r2.f18941h0
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f18941h0 = r3
            goto L1c
        L17:
            nd.b0$g r2 = new nd.b0$g
            r2.<init>(r1, r0)
        L1c:
            java.lang.Object r0 = r2.f18939f0
            gh.a r3 = gh.EnumC2389a.f10764Y
            int r4 = r2.f18941h0
            r6 = 1
            if (r4 == 0) goto L47
            if (r4 != r6) goto L3f
            java.lang.Object r4 = r2.f18938e0
            java.util.Iterator r4 = (java.util.Iterator) r4
            java.lang.Object r7 = r2.f18937d0
            nh.q r7 = (p239nh.C4837q) r7
            java.lang.Object r8 = r2.f18936c0
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r9 = r2.f18935b0
            nd.b0 r9 = (p238nd.C4728b0) r9
            p074e9.C1805a.m4540y(r0)     // Catch: java.lang.Throwable -> L3c
            goto La3
        L3c:
            r0 = move-exception
            goto Ld5
        L3f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L47:
            p074e9.C1805a.m4540y(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            id.b r4 = r17.m10795h()
            if (r4 == 0) goto L59
            r0.add(r4)
            goto L68
        L59:
            androidx.lifecycle.LiveData<java.util.List<id.b>> r4 = r1.f18925u
            java.lang.Object r4 = r4.m1411d()
            java.util.List r4 = (java.util.List) r4
            if (r4 != 0) goto L65
            dh.k r4 = p062dh.C1475k.f7237Y
        L65:
            r0.addAll(r4)
        L68:
            nh.q r4 = new nh.q
            r4.<init>()
            dh.k r7 = p062dh.C1475k.f7237Y
            r4.f19232Y = r7
            java.util.Iterator r0 = r0.iterator()
            r7 = r0
            r9 = r1
            r8 = r4
            r4 = r3
            r3 = r2
            r2 = r18
        L7c:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L15b
            java.lang.Object r0 = r7.next()
            id.b r0 = (id.C3131b) r0
            java.lang.String r0 = r0.f12559a     // Catch: java.lang.Throwable -> Lcc
            r3.f18935b0 = r9     // Catch: java.lang.Throwable -> Lcc
            r3.f18936c0 = r2     // Catch: java.lang.Throwable -> Lcc
            r3.f18937d0 = r8     // Catch: java.lang.Throwable -> Lcc
            r3.f18938e0 = r7     // Catch: java.lang.Throwable -> Lcc
            r3.f18941h0 = r6     // Catch: java.lang.Throwable -> Lcc
            java.lang.Object r0 = r9.m10791c(r0, r2, r3)     // Catch: java.lang.Throwable -> Lcc
            if (r0 != r4) goto L9b
            return r4
        L9b:
            r16 = r8
            r8 = r2
            r2 = r3
            r3 = r4
            r4 = r7
            r7 = r16
        La3:
            od.h r0 = (p255od.C5205h) r0     // Catch: java.lang.Throwable -> L3c
            java.util.List r0 = r0.getBalances()     // Catch: java.lang.Throwable -> L3c
            if (r0 == 0) goto Lca
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L3c
            r10.<init>()     // Catch: java.lang.Throwable -> L3c
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L3c
        Lb4:
            boolean r11 = r0.hasNext()     // Catch: java.lang.Throwable -> L3c
            if (r11 == 0) goto Ld9
            java.lang.Object r11 = r0.next()     // Catch: java.lang.Throwable -> L3c
            od.g r11 = (p255od.C5203g) r11     // Catch: java.lang.Throwable -> L3c
            od.b0 r11 = r11.toMyBalance()     // Catch: java.lang.Throwable -> L3c
            if (r11 == 0) goto Lb4
            r10.add(r11)     // Catch: java.lang.Throwable -> L3c
            goto Lb4
        Lca:
            r10 = 0
            goto Ld9
        Lcc:
            r0 = move-exception
            r16 = r8
            r8 = r2
            r2 = r3
            r3 = r4
            r4 = r7
            r7 = r16
        Ld5:
            java.lang.Object r10 = p074e9.C1805a.m4520e(r0)
        Ld9:
            r16 = r3
            r3 = r2
            r2 = r8
            r8 = r7
            r7 = r4
            r4 = r16
            boolean r0 = r10 instanceof ch.C0979f.a
            if (r0 == 0) goto Le6
            r10 = 0
        Le6:
            java.util.List r10 = (java.util.List) r10
            T r0 = r8.f19232Y
            java.util.List r0 = (java.util.List) r0
            if (r10 != 0) goto Lf0
            dh.k r10 = p062dh.C1475k.f7237Y
        Lf0:
            java.util.Objects.requireNonNull(r9)
            java.util.List r0 = p062dh.C1473i.m4009U(r0)
            java.util.Iterator r10 = r10.iterator()
        Lfb:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L156
            java.lang.Object r11 = r10.next()
            od.b0 r11 = (p255od.C5194b0) r11
            r12 = r0
            java.util.ArrayList r12 = (java.util.ArrayList) r12
            java.util.Iterator r13 = r12.iterator()
        L10e:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto L13f
            java.lang.Object r14 = r13.next()
            r15 = r14
            od.b0 r15 = (p255od.C5194b0) r15
            java.lang.String r5 = r15.getCurrency()
            java.lang.String r6 = r11.getCurrency()
            boolean r5 = p214m2.C4339q.m9702c(r5, r6)
            if (r5 == 0) goto L139
            java.lang.String r5 = r15.getContract()
            java.lang.String r6 = r11.getContract()
            boolean r5 = p214m2.C4339q.m9702c(r5, r6)
            if (r5 == 0) goto L139
            r5 = 1
            goto L13a
        L139:
            r5 = 0
        L13a:
            if (r5 == 0) goto L13d
            goto L140
        L13d:
            r6 = 1
            goto L10e
        L13f:
            r14 = 0
        L140:
            od.b0 r14 = (p255od.C5194b0) r14
            if (r14 == 0) goto L151
            double r5 = r14.getAmount()
            double r11 = r11.getAmount()
            double r11 = r11 + r5
            r14.setAmount(r11)
            goto L154
        L151:
            r12.add(r11)
        L154:
            r6 = 1
            goto Lfb
        L156:
            r8.f19232Y = r0
            r6 = 1
            goto L7c
        L15b:
            androidx.lifecycle.d0<java.util.List<od.b0>> r0 = r9.f18930z
            T r2 = r8.f19232Y
            r0.mo1415j(r2)
            T r0 = r8.f19232Y
            return r0
    }

    /* renamed from: f */
    public final java.lang.Object m10793f(java.lang.String r5, p101fh.InterfaceC2172d<? super java.util.List<p255od.C5238z>> r6) {
            r4 = this;
            boolean r0 = r6 instanceof p238nd.C4728b0.h
            if (r0 == 0) goto L13
            r0 = r6
            nd.b0$h r0 = (p238nd.C4728b0.h) r0
            int r1 = r0.f18945e0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f18945e0 = r1
            goto L18
        L13:
            nd.b0$h r0 = new nd.b0$h
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f18943c0
            gh.a r1 = gh.EnumC2389a.f10764Y
            int r2 = r0.f18945e0
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.f18942b0
            nd.b0 r5 = (p238nd.C4728b0) r5
            p074e9.C1805a.m4540y(r6)     // Catch: java.lang.Throwable -> L2b
            goto L4c
        L2b:
            r6 = move-exception
            goto L52
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            p074e9.C1805a.m4540y(r6)
            ch.d r6 = r4.f18910f     // Catch: java.lang.Throwable -> L4f
            java.lang.Object r6 = r6.getValue()     // Catch: java.lang.Throwable -> L4f
            wg.a r6 = (p397wg.C6880a) r6     // Catch: java.lang.Throwable -> L4f
            r0.f18942b0 = r4     // Catch: java.lang.Throwable -> L4f
            r0.f18945e0 = r3     // Catch: java.lang.Throwable -> L4f
            java.lang.Object r6 = r6.m13927d(r5, r0)     // Catch: java.lang.Throwable -> L4f
            if (r6 != r1) goto L4b
            return r1
        L4b:
            r5 = r4
        L4c:
            java.util.List r6 = (java.util.List) r6     // Catch: java.lang.Throwable -> L2b
            goto L56
        L4f:
            r5 = move-exception
            r6 = r5
            r5 = r4
        L52:
            java.lang.Object r6 = p074e9.C1805a.m4520e(r6)
        L56:
            p074e9.C1805a.m4540y(r6)
            java.util.List r6 = (java.util.List) r6
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = p062dh.C1469e.m3992D(r6, r1)
            r0.<init>(r1)
            java.util.Iterator r6 = r6.iterator()
        L6a:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L7e
            java.lang.Object r1 = r6.next()
            od.d0 r1 = (p255od.C5198d0) r1
            od.z r1 = r1.toMarket()
            r0.add(r1)
            goto L6a
        L7e:
            androidx.lifecycle.d0<java.util.List<od.z>> r5 = r5.f18928x
            r5.mo7l(r0)
            return r0
    }

    /* renamed from: g */
    public final p105g2.C2221o m10794g() {
            r1 = this;
            ch.d r0 = r1.f18909e
            java.lang.Object r0 = r0.getValue()
            g2.o r0 = (p105g2.C2221o) r0
            return r0
    }

    /* renamed from: h */
    public final id.C3131b m10795h() {
            r1 = this;
            androidx.lifecycle.d0<id.b> r0 = r1.f18922r
            java.lang.Object r0 = r0.m1411d()
            id.b r0 = (id.C3131b) r0
            return r0
    }

    /* renamed from: i */
    public final one.block.eosiojava.session.TransactionSession m10796i() {
            r1 = this;
            ch.d r0 = r1.f18912h
            java.lang.Object r0 = r0.getValue()
            one.block.eosiojava.session.TransactionSession r0 = (one.block.eosiojava.session.TransactionSession) r0
            return r0
    }

    /* renamed from: j */
    public final java.lang.Object m10797j(java.lang.String r5, p101fh.InterfaceC2172d<? super ch.C0985l> r6) {
            r4 = this;
            boolean r0 = r6 instanceof p238nd.C4728b0.i
            if (r0 == 0) goto L13
            r0 = r6
            nd.b0$i r0 = (p238nd.C4728b0.i) r0
            int r1 = r0.f18949e0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f18949e0 = r1
            goto L18
        L13:
            nd.b0$i r0 = new nd.b0$i
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f18947c0
            gh.a r1 = gh.EnumC2389a.f10764Y
            int r2 = r0.f18949e0
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.f18946b0
            nd.b0 r5 = (p238nd.C4728b0) r5
            p074e9.C1805a.m4540y(r6)     // Catch: java.lang.Throwable -> L2b
            goto L44
        L2b:
            r6 = move-exception
            goto L49
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            p074e9.C1805a.m4540y(r6)
            r0.f18946b0 = r4     // Catch: java.lang.Throwable -> L47
            r0.f18949e0 = r3     // Catch: java.lang.Throwable -> L47
            java.lang.Object r6 = r4.m10798k(r5, r0)     // Catch: java.lang.Throwable -> L47
            if (r6 != r1) goto L43
            return r1
        L43:
            r5 = r4
        L44:
            md.j r6 = (md.C4559j) r6     // Catch: java.lang.Throwable -> L2b
            goto L4d
        L47:
            r6 = move-exception
            r5 = r4
        L49:
            java.lang.Object r6 = p074e9.C1805a.m4520e(r6)
        L4d:
            boolean r0 = r6 instanceof ch.C0979f.a
            r0 = r0 ^ r3
            if (r0 == 0) goto L72
            r0 = r6
            md.j r0 = (md.C4559j) r0
            java.util.List r0 = r0.getRows()
            java.lang.Object r0 = p062dh.C1473i.m3996H(r0)
            xf.j r0 = (p417xf.C7056j) r0
            if (r0 == 0) goto L6f
            double r0 = r0.getValue()
            r2 = 10000(0x2710, float:1.4013E-41)
            double r2 = (double) r2
            double r0 = r0 / r2
            java.lang.Double r2 = new java.lang.Double
            r2.<init>(r0)
            goto L70
        L6f:
            r2 = 0
        L70:
            r5.f18926v = r2
        L72:
            java.lang.Throwable r5 = ch.C0979f.m2690b(r6)
            if (r5 == 0) goto L81
            java.lang.String r6 = "getWaxConversion"
            hk.a$b r6 = hk.C3053a.m7466a(r6)
            r6.mo7470d(r5)
        L81:
            ch.l r5 = ch.C0985l.f5061a
            return r5
    }

    /* renamed from: k */
    public final java.lang.Object m10798k(java.lang.String r6, p101fh.InterfaceC2172d<? super md.C4559j<p417xf.C7056j>> r7) {
            r5 = this;
            fh.j r0 = new fh.j
            fh.d r7 = gh.C2390b.m6127q(r7)
            r0.<init>(r7)
            nd.v0 r7 = p238nd.C4781v0.f19121e
            java.lang.String r1 = "Please for EndpointManager us initialize() before getting the instance."
            java.util.Objects.requireNonNull(r7, r1)
            java.lang.String r7 = r7.m10839c()
            nd.b0$k r1 = new nd.b0$k
            r1.<init>(r0)
            nd.b0$l r2 = new nd.b0$l
            r2.<init>(r0)
            nd.b0$j r3 = new nd.b0$j
            java.lang.String r4 = "{\n  \"code\": \"delphioracle\",\n  \"json\": true,\n  \"limit\": 100,\n  \"lower_bound\": \"\",\n  \"scope\": \"waxpusd\",\n  \"table\": \"datapoints\",\n  \"upper_bound\": \"\"\n}"
            r3.<init>(r7, r4, r1, r2)
            if (r6 == 0) goto L29
            r3.f10153l0 = r6
        L29:
            g2.o r6 = r5.m10794g()
            r6.m5814a(r3)
            java.lang.Object r6 = r0.m5741a()
            return r6
    }

    /* renamed from: l */
    public final java.lang.Object m10799l(id.C3131b r5, p101fh.InterfaceC2172d<? super ch.C0985l> r6) {
            r4 = this;
            boolean r0 = r6 instanceof p238nd.C4728b0.m
            if (r0 == 0) goto L13
            r0 = r6
            nd.b0$m r0 = (p238nd.C4728b0.m) r0
            int r1 = r0.f18956f0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f18956f0 = r1
            goto L18
        L13:
            nd.b0$m r0 = new nd.b0$m
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f18954d0
            gh.a r1 = gh.EnumC2389a.f10764Y
            int r2 = r0.f18956f0
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r5 = r0.f18953c0
            id.b r5 = (id.C3131b) r5
            java.lang.Object r0 = r0.f18952b0
            nd.b0 r0 = (p238nd.C4728b0) r0
            p074e9.C1805a.m4540y(r6)
            goto L4e
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            p074e9.C1805a.m4540y(r6)
            io.tacocrypto.app.database.AppDatabase r6 = r4.f18907c
            hd.d r6 = r6.mo7713p()
            r0.f18952b0 = r4
            r0.f18953c0 = r5
            r0.f18956f0 = r3
            java.lang.Object r6 = r6.mo7443c(r5, r0)
            if (r6 != r1) goto L4d
            return r1
        L4d:
            r0 = r4
        L4e:
            androidx.lifecycle.d0<id.b> r6 = r0.f18922r
            r6.mo1415j(r5)
            ch.l r5 = ch.C0985l.f5061a
            return r5
    }

    /* renamed from: m */
    public final void m10800m() {
            r7 = this;
            androidx.lifecycle.LiveData<java.util.List<id.b>> r0 = r7.f18925u
            java.lang.Object r0 = r0.m1411d()
            java.util.List r0 = (java.util.List) r0
            if (r0 != 0) goto Lc
            dh.k r0 = p062dh.C1475k.f7237Y
        Lc:
            id.b r1 = r7.m10795h()
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L17
            return
        L17:
            int r2 = r0.size()
            r3 = 1
            if (r2 != r3) goto L26
            if (r1 != 0) goto L25
            androidx.lifecycle.d0<id.b> r0 = r7.f18922r
            r0.mo7l(r1)
        L25:
            return
        L26:
            if (r1 != 0) goto L32
            androidx.lifecycle.d0<id.b> r1 = r7.f18922r
            java.lang.Object r0 = p062dh.C1473i.m3995G(r0)
        L2e:
            r1.mo7l(r0)
            return
        L32:
            r2 = 0
            java.util.Iterator r4 = r0.iterator()
        L37:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L51
            java.lang.Object r5 = r4.next()
            id.b r5 = (id.C3131b) r5
            java.lang.String r5 = r5.f12559a
            java.lang.String r6 = r1.f12559a
            boolean r5 = p214m2.C4339q.m9702c(r5, r6)
            if (r5 == 0) goto L4e
            goto L52
        L4e:
            int r2 = r2 + 1
            goto L37
        L51:
            r2 = -1
        L52:
            int r2 = r2 + r3
            androidx.lifecycle.d0<id.b> r1 = r7.f18922r
            java.lang.Object r0 = p062dh.C1473i.m3997I(r0, r2)
            goto L2e
    }

    /* renamed from: n */
    public final void m10801n(android.content.Context r11, java.util.List<p255od.C5225r> r12, p238nd.EnumC4724a r13, mh.InterfaceC4624p<? super java.lang.Boolean, ? super java.lang.String, ch.C0985l> r14, id.C3131b r15) {
            r10 = this;
            r10.f18918n = r14
            if (r15 != 0) goto Lb
            id.b r15 = r10.m10795h()
            if (r15 != 0) goto Lb
            return
        Lb:
            java.lang.String r14 = r15.f12559a
            int r0 = r14.length()
            r1 = 1
            if (r0 != 0) goto L16
            r0 = 1
            goto L17
        L16:
            r0 = 0
        L17:
            if (r0 != 0) goto L89
            one.block.eosiojava.models.rpcProvider.Authorization r0 = new one.block.eosiojava.models.rpcProvider.Authorization
            java.lang.String r2 = r10.f18911g
            r0.<init>(r14, r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 10
            int r3 = p062dh.C1469e.m3992D(r12, r3)
            r2.<init>(r3)
            java.util.Iterator r12 = r12.iterator()
        L2f:
            boolean r3 = r12.hasNext()
            if (r3 == 0) goto L77
            java.lang.Object r3 = r12.next()
            od.r r3 = (p255od.C5225r) r3
            nd.w0 r4 = new nd.w0
            java.lang.String r5 = r3.getAccount()
            pd.g2 r6 = new pd.g2
            java.lang.String r7 = r3.getTo()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = r3.getQuantity()
            r8.append(r9)
            r9 = 32
            r8.append(r9)
            java.lang.String r9 = r3.getSymbol()
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            java.lang.String r3 = r3.getMemo()
            r6.<init>(r14, r7, r8, r3)
            java.util.List r3 = p074e9.C1805a.m4528m(r0)
            java.lang.String r7 = "transfer"
            r4.<init>(r5, r7, r6, r3)
            r2.add(r4)
            goto L2f
        L77:
            b3.b r12 = new b3.b
            r12.<init>(r1)
            r12.m2207b(r2)
            if (r13 == 0) goto L84
            r12.m2209d(r13, r0)
        L84:
            r13 = 0
            r10.m10804r(r11, r15, r12, r13)
            return
        L89:
            java.lang.Exception r11 = new java.lang.Exception
            java.lang.String r12 = "USER_NOT_SIGNED"
            r11.<init>(r12)
            throw r11
    }

    @android.annotation.SuppressLint({"SetJavaScriptEnabled"})
    /* renamed from: p */
    public final void m10802p(android.webkit.WebView r5) {
            r4 = this;
            android.webkit.CookieManager r0 = android.webkit.CookieManager.getInstance()
            r1 = 1
            r0.setAcceptThirdPartyCookies(r5, r1)
            android.webkit.WebSettings r0 = r5.getSettings()
            r0.setJavaScriptEnabled(r1)
            android.webkit.WebSettings r0 = r5.getSettings()
            r0.setJavaScriptCanOpenWindowsAutomatically(r1)
            android.webkit.WebSettings r0 = r5.getSettings()
            r0.setLoadsImagesAutomatically(r1)
            android.webkit.WebSettings r0 = r5.getSettings()
            r2 = 0
            r0.setSupportZoom(r2)
            android.webkit.WebSettings r0 = r5.getSettings()
            java.lang.String r3 = p097fd.C2139a.f9835a
            r0.setUserAgentString(r3)
            android.webkit.WebSettings r0 = r5.getSettings()
            r0.setDomStorageEnabled(r1)
            r5.setVerticalScrollBarEnabled(r2)
            r5.setHorizontalScrollBarEnabled(r2)
            android.webkit.WebSettings r0 = r5.getSettings()
            r0.setSupportMultipleWindows(r1)
            r5.setBackgroundColor(r2)
            r0 = 0
            r5.setLayerType(r1, r0)
            nd.b0$b r0 = new nd.b0$b
            r0.<init>(r4)
            java.lang.String r1 = "Interface"
            r5.addJavascriptInterface(r0, r1)
            return
    }

    /* renamed from: q */
    public final void m10803q(android.content.Context r4, p255od.EnumC5234v0 r5, mh.InterfaceC4624p<? super java.lang.Boolean, ? super java.lang.String, ch.C0985l> r6) {
            r3 = this;
            r3.f18918n = r6
            int[] r6 = p238nd.C4728b0.c.f18932a
            int r5 = r5.ordinal()
            r5 = r6[r5]
            r6 = 1
            if (r5 == r6) goto L1c
            r6 = 2
            if (r5 == r6) goto L11
            goto L66
        L11:
            nd.b0$n r5 = new nd.b0$n
            r5.<init>(r3)
            r3.f18924t = r5
            r3.m10805s(r4)
            goto L66
        L1c:
            vc.a r5 = new vc.a
            java.lang.String r6 = "https://eos.greymass.com"
            r5.<init>(r6)
            uc.f r6 = new uc.f
            v.c r0 = new v.c
            r0.<init>(r4, r5)
            r6.<init>(r0)
            xc.f r5 = p414xc.EnumC7031f.WAX
            xc.g r5 = r5.toChainId()
            r6.f24851c = r5
            xc.i r5 = new xc.i
            xc.k r0 = new xc.k
            java.lang.String r1 = ""
            java.lang.String r2 = "active"
            r0.<init>(r1, r2)
            r5.<init>(r0)
            r6.f24852d = r5
            java.lang.String r5 = "taco://signed/{{sa}}"
            r6.f24854f = r5
            xc.m r5 = r6.f24853e
            r0 = 0
            r5.setBroadcast(r0)
            java.lang.String r5 = r6.m13020a()
            java.lang.String r6 = "eossigning"
            hk.a$b r6 = hk.C3053a.m7466a(r6)
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r6.mo7467a(r5, r0)
            java.lang.String r6 = "encoded"
            p214m2.C4339q.m9705j(r5, r6)
            vg.C6672m.m13519f(r4, r5)
        L66:
            return
    }

    /* renamed from: r */
    public final void m10804r(android.content.Context r2, id.C3131b r3, p020b3.C0660b r4, java.lang.String r5) {
            r1 = this;
            od.v0 r3 = r3.f12560b
            int[] r0 = p238nd.C4728b0.c.f18932a
            int r3 = r3.ordinal()
            r3 = r0[r3]
            r0 = 1
            if (r3 == r0) goto L27
            r5 = 2
            if (r3 == r5) goto L11
            goto L30
        L11:
            nd.b0$o r3 = new nd.b0$o
            r3.<init>(r1)
            r1.f18924t = r3
            r1.m10805s(r2)
            java.util.List r2 = r4.m2211g()
            nd.b0$p r3 = new nd.b0$p
            r3.<init>(r1, r2)
            r1.f18913i = r3
            goto L30
        L27:
            r3 = 0
            r0 = 4
            java.lang.String r3 = p020b3.C0660b.m2205f(r4, r2, r5, r3, r0)
            vg.C6672m.m13519f(r2, r3)
        L30:
            return
    }

    /* renamed from: s */
    public final void m10805s(android.content.Context r4) {
            r3 = this;
            androidx.lifecycle.d0<vg.b<java.lang.Boolean>> r0 = r3.f18923s
            vg.b r1 = new vg.b
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r1.<init>(r2)
            r0.mo7l(r1)
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<io.tacocrypto.app.ui.webview.WebViewActivity> r1 = io.tacocrypto.app.p156ui.webview.WebViewActivity.class
            r0.<init>(r4, r1)
            r4.startActivity(r0)
            return
    }

    /* renamed from: t */
    public final void m10806t(android.content.Context r8, p255od.C5225r r9, mh.InterfaceC4624p<? super java.lang.Boolean, ? super java.lang.String, ch.C0985l> r10) {
            r7 = this;
            java.util.List r2 = p074e9.C1805a.m4528m(r9)
            nd.a r3 = p238nd.EnumC4724a.f18868Z
            r5 = 0
            r6 = 16
            r0 = r7
            r1 = r8
            r4 = r10
            m10790o(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    /* renamed from: u */
    public final void m10807u(android.content.Context r7, p255od.C5228s0 r8, p238nd.EnumC4724a r9, java.lang.String r10, mh.InterfaceC4624p<? super java.lang.Boolean, ? super java.lang.String, ch.C0985l> r11) {
            r6 = this;
            r6.f18918n = r11
            id.b r9 = r6.m10795h()
            if (r9 != 0) goto L9
            return
        L9:
            java.lang.String r11 = r9.f12559a
            int r0 = r11.length()
            r1 = 1
            if (r0 != 0) goto L14
            r0 = 1
            goto L15
        L14:
            r0 = 0
        L15:
            if (r0 != 0) goto L4e
            one.block.eosiojava.models.rpcProvider.Authorization r0 = new one.block.eosiojava.models.rpcProvider.Authorization
            java.lang.String r2 = r6.f18911g
            r0.<init>(r11, r2)
            nd.w0 r2 = new nd.w0
            pd.i2 r3 = new pd.i2
            java.lang.String r4 = r8.getTo()
            java.util.List r5 = r8.getAsset_ids()
            java.lang.String r8 = r8.getMemo()
            r3.<init>(r11, r4, r5, r8)
            java.util.List r8 = p074e9.C1805a.m4528m(r0)
            java.lang.String r11 = "atomicassets"
            java.lang.String r0 = "transfer"
            r2.<init>(r11, r0, r3, r8)
            b3.b r8 = new b3.b
            r8.<init>(r1)
            java.util.List r11 = p074e9.C1805a.m4528m(r2)
            java.util.List<com.bumptech.glide.load.ImageHeaderParser> r0 = r8.f3814a
            r0.addAll(r11)
            r6.m10804r(r7, r9, r8, r10)
            return
        L4e:
            java.lang.Exception r7 = new java.lang.Exception
            java.lang.String r8 = "USER_NOT_SIGNED"
            r7.<init>(r8)
            throw r7
    }

    /* renamed from: v */
    public final void m10808v(android.content.Context r7, p255od.C5196c0 r8, java.lang.String r9, mh.InterfaceC4624p<? super java.lang.Boolean, ? super java.lang.String, ch.C0985l> r10) {
            r6 = this;
            od.s0 r2 = new od.s0
            java.lang.String r0 = r8.getTo()
            java.lang.String r1 = r8.getAsset_id()
            java.util.List r1 = p074e9.C1805a.m4528m(r1)
            java.lang.String r8 = r8.getMemo()
            r2.<init>(r0, r1, r8)
            nd.a r3 = p238nd.EnumC4724a.f18869Z0
            r0 = r6
            r1 = r7
            r4 = r9
            r5 = r10
            r0.m10807u(r1, r2, r3, r4, r5)
            return
    }
}
