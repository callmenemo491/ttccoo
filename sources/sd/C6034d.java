package sd;

/* renamed from: sd.d */
/* loaded from: classes.dex */
public final class C6034d extends androidx.lifecycle.AbstractC0457n0 {

    /* renamed from: A */
    public final androidx.lifecycle.LiveData<io.tacocrypto.app.p156ui.balance.EnumC3216f> f23256A;

    /* renamed from: B */
    public final androidx.lifecycle.C0437d0<io.tacocrypto.app.p156ui.balance.EnumC3214d> f23257B;

    /* renamed from: C */
    public final androidx.lifecycle.LiveData<io.tacocrypto.app.p156ui.balance.EnumC3214d> f23258C;

    /* renamed from: D */
    public final androidx.lifecycle.C0437d0<io.tacocrypto.app.p156ui.balance.EnumC3215e> f23259D;

    /* renamed from: E */
    public final androidx.lifecycle.LiveData<io.tacocrypto.app.p156ui.balance.EnumC3215e> f23260E;

    /* renamed from: F */
    public final androidx.lifecycle.LiveData<java.lang.String> f23261F;

    /* renamed from: c */
    public final android.app.Application f23262c;

    /* renamed from: d */
    public final p238nd.C4728b0 f23263d;

    /* renamed from: e */
    public final p238nd.C4753j1 f23264e;

    /* renamed from: f */
    public final ch.InterfaceC0977d f23265f;

    /* renamed from: g */
    public final ch.InterfaceC0977d f23266g;

    /* renamed from: h */
    public final androidx.lifecycle.LiveData<vg.C6661b<ch.C0985l>> f23267h;

    /* renamed from: i */
    public final androidx.lifecycle.C0437d0<java.lang.Boolean> f23268i;

    /* renamed from: j */
    public final androidx.lifecycle.LiveData<java.lang.Boolean> f23269j;

    /* renamed from: k */
    public final androidx.lifecycle.LiveData<ch.C0978e<id.C3131b, java.lang.Boolean>> f23270k;

    /* renamed from: l */
    public final androidx.lifecycle.C0437d0<java.lang.String> f23271l;

    /* renamed from: m */
    public final androidx.lifecycle.LiveData<java.lang.String> f23272m;

    /* renamed from: n */
    public boolean f23273n;

    /* renamed from: o */
    public boolean f23274o;

    /* renamed from: p */
    public final androidx.lifecycle.C0437d0<sd.C6034d.b> f23275p;

    /* renamed from: q */
    public final androidx.lifecycle.LiveData<sd.C6034d.b> f23276q;

    /* renamed from: r */
    public final androidx.lifecycle.C0437d0<sd.C6034d.b> f23277r;

    /* renamed from: s */
    public final androidx.lifecycle.LiveData<sd.C6034d.b> f23278s;

    /* renamed from: t */
    public final androidx.lifecycle.C0437d0<io.tacocrypto.app.p156ui.balance.EnumC3217g> f23279t;

    /* renamed from: u */
    public final androidx.lifecycle.LiveData<io.tacocrypto.app.p156ui.balance.EnumC3217g> f23280u;

    /* renamed from: v */
    public p379vh.InterfaceC6698f0<ch.C0985l> f23281v;

    /* renamed from: w */
    public volatile java.util.List<sd.C6034d.a> f23282w;

    /* renamed from: x */
    public final androidx.lifecycle.C0437d0<java.util.List<sd.C6034d.a>> f23283x;

    /* renamed from: y */
    public final androidx.lifecycle.LiveData<java.util.List<sd.C6034d.a>> f23284y;

    /* renamed from: z */
    public final androidx.lifecycle.C0437d0<io.tacocrypto.app.p156ui.balance.EnumC3216f> f23285z;

    /* renamed from: sd.d$a */
    public static final class a {

        /* renamed from: a */
        public final p255od.C5194b0 f23286a;

        /* renamed from: b */
        public java.lang.Double f23287b;

        /* renamed from: c */
        public boolean f23288c;

        /* renamed from: d */
        public java.lang.String f23289d;

        /* renamed from: e */
        public java.lang.Boolean f23290e;

        /* renamed from: f */
        public java.lang.String f23291f;

        /* renamed from: g */
        public final boolean f23292g;

        public a(p255od.C5194b0 r1, java.lang.Double r2, boolean r3, java.lang.String r4, java.lang.Boolean r5, java.lang.String r6, boolean r7, int r8) {
                r0 = this;
                r2 = r8 & 4
                r4 = 0
                if (r2 == 0) goto L6
                r3 = 0
            L6:
                r2 = r8 & 64
                if (r2 == 0) goto Lb
                r7 = 0
            Lb:
                java.lang.String r2 = "balance"
                p214m2.C4339q.m9706k(r1, r2)
                r0.<init>()
                r0.f23286a = r1
                r1 = 0
                r0.f23287b = r1
                r0.f23288c = r3
                r0.f23289d = r1
                r0.f23290e = r1
                r0.f23291f = r1
                r0.f23292g = r7
                return
        }

        public boolean equals(java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                boolean r1 = r5 instanceof sd.C6034d.a
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                sd.d$a r5 = (sd.C6034d.a) r5
                od.b0 r1 = r4.f23286a
                od.b0 r3 = r5.f23286a
                boolean r1 = p214m2.C4339q.m9702c(r1, r3)
                if (r1 != 0) goto L17
                return r2
            L17:
                java.lang.Double r1 = r4.f23287b
                java.lang.Double r3 = r5.f23287b
                boolean r1 = p214m2.C4339q.m9702c(r1, r3)
                if (r1 != 0) goto L22
                return r2
            L22:
                boolean r1 = r4.f23288c
                boolean r3 = r5.f23288c
                if (r1 == r3) goto L29
                return r2
            L29:
                java.lang.String r1 = r4.f23289d
                java.lang.String r3 = r5.f23289d
                boolean r1 = p214m2.C4339q.m9702c(r1, r3)
                if (r1 != 0) goto L34
                return r2
            L34:
                java.lang.Boolean r1 = r4.f23290e
                java.lang.Boolean r3 = r5.f23290e
                boolean r1 = p214m2.C4339q.m9702c(r1, r3)
                if (r1 != 0) goto L3f
                return r2
            L3f:
                java.lang.String r1 = r4.f23291f
                java.lang.String r3 = r5.f23291f
                boolean r1 = p214m2.C4339q.m9702c(r1, r3)
                if (r1 != 0) goto L4a
                return r2
            L4a:
                boolean r1 = r4.f23292g
                boolean r5 = r5.f23292g
                if (r1 == r5) goto L51
                return r2
            L51:
                return r0
        }

        public int hashCode() {
                r4 = this;
                od.b0 r0 = r4.f23286a
                int r0 = r0.hashCode()
                int r0 = r0 * 31
                java.lang.Double r1 = r4.f23287b
                r2 = 0
                if (r1 != 0) goto Lf
                r1 = 0
                goto L13
            Lf:
                int r1 = r1.hashCode()
            L13:
                int r0 = r0 + r1
                int r0 = r0 * 31
                boolean r1 = r4.f23288c
                r3 = 1
                if (r1 == 0) goto L1c
                r1 = 1
            L1c:
                int r0 = r0 + r1
                int r0 = r0 * 31
                java.lang.String r1 = r4.f23289d
                if (r1 != 0) goto L25
                r1 = 0
                goto L29
            L25:
                int r1 = r1.hashCode()
            L29:
                int r0 = r0 + r1
                int r0 = r0 * 31
                java.lang.Boolean r1 = r4.f23290e
                if (r1 != 0) goto L32
                r1 = 0
                goto L36
            L32:
                int r1 = r1.hashCode()
            L36:
                int r0 = r0 + r1
                int r0 = r0 * 31
                java.lang.String r1 = r4.f23291f
                if (r1 != 0) goto L3e
                goto L42
            L3e:
                int r2 = r1.hashCode()
            L42:
                int r0 = r0 + r2
                int r0 = r0 * 31
                boolean r1 = r4.f23292g
                if (r1 == 0) goto L4a
                goto L4b
            L4a:
                r3 = r1
            L4b:
                int r0 = r0 + r3
                return r0
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.String r0 = "BalanceModelUI(balance="
                java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
                od.b0 r1 = r2.f23286a
                r0.append(r1)
                java.lang.String r1 = ", valueWax="
                r0.append(r1)
                java.lang.Double r1 = r2.f23287b
                r0.append(r1)
                java.lang.String r1 = ", swapEnable="
                r0.append(r1)
                boolean r1 = r2.f23288c
                r0.append(r1)
                java.lang.String r1 = ", pool_wax_id="
                r0.append(r1)
                java.lang.String r1 = r2.f23289d
                r0.append(r1)
                java.lang.String r1 = ", isInverted="
                r0.append(r1)
                java.lang.Boolean r1 = r2.f23290e
                r0.append(r1)
                java.lang.String r1 = ", valueDollarString="
                r0.append(r1)
                java.lang.String r1 = r2.f23291f
                r0.append(r1)
                java.lang.String r1 = ", isCustomStaked="
                r0.append(r1)
                boolean r1 = r2.f23292g
                r0.append(r1)
                r1 = 41
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* renamed from: sd.d$b */
    public static final class b {

        /* renamed from: a */
        public boolean f23293a;

        /* renamed from: b */
        public final java.lang.String f23294b;

        /* renamed from: c */
        public final java.lang.String f23295c;

        /* renamed from: d */
        public final java.lang.String f23296d;

        /* renamed from: e */
        public java.lang.Double f23297e;

        /* renamed from: f */
        public java.lang.String f23298f;

        public b(boolean r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.Double r5, java.lang.String r6, int r7) {
                r0 = this;
                java.lang.String r5 = "image"
                p214m2.C4339q.m9706k(r4, r5)
                r0.<init>()
                r0.f23293a = r1
                r0.f23294b = r2
                r0.f23295c = r3
                r0.f23296d = r4
                r1 = 0
                r0.f23297e = r1
                r0.f23298f = r1
                return
        }

        public boolean equals(java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                boolean r1 = r5 instanceof sd.C6034d.b
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                sd.d$b r5 = (sd.C6034d.b) r5
                boolean r1 = r4.f23293a
                boolean r3 = r5.f23293a
                if (r1 == r3) goto L13
                return r2
            L13:
                java.lang.String r1 = r4.f23294b
                java.lang.String r3 = r5.f23294b
                boolean r1 = p214m2.C4339q.m9702c(r1, r3)
                if (r1 != 0) goto L1e
                return r2
            L1e:
                java.lang.String r1 = r4.f23295c
                java.lang.String r3 = r5.f23295c
                boolean r1 = p214m2.C4339q.m9702c(r1, r3)
                if (r1 != 0) goto L29
                return r2
            L29:
                java.lang.String r1 = r4.f23296d
                java.lang.String r3 = r5.f23296d
                boolean r1 = p214m2.C4339q.m9702c(r1, r3)
                if (r1 != 0) goto L34
                return r2
            L34:
                java.lang.Double r1 = r4.f23297e
                java.lang.Double r3 = r5.f23297e
                boolean r1 = p214m2.C4339q.m9702c(r1, r3)
                if (r1 != 0) goto L3f
                return r2
            L3f:
                java.lang.String r1 = r4.f23298f
                java.lang.String r5 = r5.f23298f
                boolean r5 = p214m2.C4339q.m9702c(r1, r5)
                if (r5 != 0) goto L4a
                return r2
            L4a:
                return r0
        }

        public int hashCode() {
                r3 = this;
                boolean r0 = r3.f23293a
                if (r0 == 0) goto L5
                r0 = 1
            L5:
                int r0 = r0 * 31
                java.lang.String r1 = r3.f23294b
                r2 = 31
                int r0 = p213m1.C4319e.m9651a(r1, r0, r2)
                java.lang.String r1 = r3.f23295c
                int r0 = p213m1.C4319e.m9651a(r1, r0, r2)
                java.lang.String r1 = r3.f23296d
                int r0 = p213m1.C4319e.m9651a(r1, r0, r2)
                java.lang.Double r1 = r3.f23297e
                r2 = 0
                if (r1 != 0) goto L22
                r1 = 0
                goto L26
            L22:
                int r1 = r1.hashCode()
            L26:
                int r0 = r0 + r1
                int r0 = r0 * 31
                java.lang.String r1 = r3.f23298f
                if (r1 != 0) goto L2e
                goto L32
            L2e:
                int r2 = r1.hashCode()
            L32:
                int r0 = r0 + r2
                return r0
        }

        public java.lang.String toString() {
                r3 = this;
                java.lang.String r0 = "CustomModelUI(show="
                java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
                boolean r1 = r3.f23293a
                r0.append(r1)
                java.lang.String r1 = ", title="
                r0.append(r1)
                java.lang.String r1 = r3.f23294b
                r0.append(r1)
                java.lang.String r1 = ", subtitle="
                r0.append(r1)
                java.lang.String r1 = r3.f23295c
                r0.append(r1)
                java.lang.String r1 = ", image="
                r0.append(r1)
                java.lang.String r1 = r3.f23296d
                r0.append(r1)
                java.lang.String r1 = ", valueWax="
                r0.append(r1)
                java.lang.Double r1 = r3.f23297e
                r0.append(r1)
                java.lang.String r1 = ", valueDollarString="
                r0.append(r1)
                java.lang.String r1 = r3.f23298f
                r2 = 41
                java.lang.String r0 = p185k7.C3814g5.m8552a(r0, r1, r2)
                return r0
        }
    }

    /* renamed from: sd.d$c */
    public static final class c extends p239nh.AbstractC4830j implements mh.InterfaceC4625q<java.lang.Double, sd.C6034d.b, sd.C6034d.b, java.lang.Double> {

        /* renamed from: Z */
        public final /* synthetic */ sd.C6034d f23299Z;

        public c(sd.C6034d r1) {
                r0 = this;
                r0.f23299Z = r1
                r1 = 3
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4625q
        /* renamed from: i */
        public java.lang.Double mo115i(java.lang.Double r5, sd.C6034d.b r6, sd.C6034d.b r7) {
                r4 = this;
                java.lang.Double r5 = (java.lang.Double) r5
                sd.d$b r6 = (sd.C6034d.b) r6
                sd.d$b r7 = (sd.C6034d.b) r7
                r0 = 0
                if (r5 == 0) goto Lf
                double r2 = r5.doubleValue()
                goto L10
            Lf:
                r2 = r0
            L10:
                sd.d r5 = r4.f23299Z
                java.util.Objects.requireNonNull(r5)
                if (r6 != 0) goto L18
                goto L25
            L18:
                boolean r5 = r6.f23293a
                if (r5 == 0) goto L25
                java.lang.Double r5 = r6.f23297e
                if (r5 == 0) goto L25
                double r5 = r5.doubleValue()
                goto L26
            L25:
                r5 = r0
            L26:
                double r2 = r2 + r5
                sd.d r5 = r4.f23299Z
                java.util.Objects.requireNonNull(r5)
                if (r7 != 0) goto L2f
                goto L3b
            L2f:
                boolean r5 = r7.f23293a
                if (r5 == 0) goto L3b
                java.lang.Double r5 = r7.f23297e
                if (r5 == 0) goto L3b
                double r0 = r5.doubleValue()
            L3b:
                double r2 = r2 + r0
                java.lang.Double r5 = java.lang.Double.valueOf(r2)
                return r5
        }
    }

    /* renamed from: sd.d$d */
    public static final class d extends p239nh.AbstractC4830j implements mh.InterfaceC4609a<p238nd.C4730c> {

        /* renamed from: Z */
        public final /* synthetic */ sd.C6034d f23300Z;

        public d(sd.C6034d r1) {
                r0 = this;
                r0.f23300Z = r1
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4609a
        /* renamed from: e */
        public p238nd.C4730c mo15e() {
                r4 = this;
                sd.d r0 = r4.f23300Z
                android.app.Application r0 = r0.f23262c
                java.lang.String r1 = "context"
                p214m2.C4339q.m9706k(r0, r1)
                nd.c r1 = p238nd.C4730c.f18962j
                if (r1 != 0) goto L2a
                java.lang.Class<nd.c> r1 = p238nd.C4730c.class
                monitor-enter(r1)
                nd.c r2 = p238nd.C4730c.f18962j     // Catch: java.lang.Throwable -> L27
                if (r2 != 0) goto L25
                nd.c r2 = new nd.c     // Catch: java.lang.Throwable -> L27
                android.content.Context r0 = r0.getApplicationContext()     // Catch: java.lang.Throwable -> L27
                java.lang.String r3 = "context.applicationContext"
                p214m2.C4339q.m9705j(r0, r3)     // Catch: java.lang.Throwable -> L27
                r3 = 0
                r2.<init>(r0, r3)     // Catch: java.lang.Throwable -> L27
                p238nd.C4730c.f18962j = r2     // Catch: java.lang.Throwable -> L27
            L25:
                monitor-exit(r1)
                goto L2a
            L27:
                r0 = move-exception
                monitor-exit(r1)
                throw r0
            L2a:
                nd.c r0 = p238nd.C4730c.f18962j
                p214m2.C4339q.m9704i(r0)
                return r0
        }
    }

    /* renamed from: sd.d$e */
    public static final class e extends p239nh.AbstractC4830j implements mh.InterfaceC4624p<sd.C6034d.b, ch.C0978e<? extends id.C3131b, ? extends java.lang.Boolean>, sd.C6034d.b> {

        /* renamed from: Z */
        public static final sd.C6034d.e f23301Z = null;

        static {
                sd.d$e r0 = new sd.d$e
                r0.<init>()
                sd.C6034d.e.f23301Z = r0
                return
        }

        public e() {
                r1 = this;
                r0 = 2
                r1.<init>(r0)
                return
        }

        @Override // mh.InterfaceC4624p
        /* renamed from: l */
        public sd.C6034d.b mo122l(sd.C6034d.b r2, ch.C0978e<? extends id.C3131b, ? extends java.lang.Boolean> r3) {
                r1 = this;
                sd.d$b r2 = (sd.C6034d.b) r2
                ch.e r3 = (ch.C0978e) r3
                r0 = 0
                if (r2 == 0) goto L16
                if (r3 == 0) goto Le
                A r3 = r3.f5050Y
                r0 = r3
                id.b r0 = (id.C3131b) r0
            Le:
                if (r0 == 0) goto L12
                r3 = 1
                goto L13
            L12:
                r3 = 0
            L13:
                r2.f23293a = r3
                goto L17
            L16:
                r2 = r0
            L17:
                return r2
        }
    }

    /* renamed from: sd.d$f */
    public static final class f extends p239nh.AbstractC4830j implements mh.InterfaceC4609a<p105g2.C2221o> {

        /* renamed from: Z */
        public final /* synthetic */ sd.C6034d f23302Z;

        public f(sd.C6034d r1) {
                r0 = this;
                r0.f23302Z = r1
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4609a
        /* renamed from: e */
        public p105g2.C2221o mo15e() {
                r1 = this;
                sd.d r0 = r1.f23302Z
                android.app.Application r0 = r0.f23262c
                g2.o r0 = p119h2.C2450l.m6226a(r0)
                return r0
        }
    }

    @p134hh.InterfaceC3044e(m7451c = "io.tacocrypto.app.ui.balance.BalanceViewModel$refresh$1", m7452f = "BalanceViewModel.kt", m7453l = {124, 125, 147, 148, 161, 170, 180, 184}, m7454m = "invokeSuspend")
    /* renamed from: sd.d$g */
    public static final class g extends p134hh.AbstractC3048i implements mh.InterfaceC4624p<p379vh.InterfaceC6686b0, p101fh.InterfaceC2172d<? super ch.C0985l>, java.lang.Object> {

        /* renamed from: c0 */
        public java.lang.Object f23303c0;

        /* renamed from: d0 */
        public java.lang.Object f23304d0;

        /* renamed from: e0 */
        public java.lang.Object f23305e0;

        /* renamed from: f0 */
        public java.lang.Object f23306f0;

        /* renamed from: g0 */
        public java.lang.Object f23307g0;

        /* renamed from: h0 */
        public int f23308h0;

        /* renamed from: i0 */
        public /* synthetic */ java.lang.Object f23309i0;

        /* renamed from: j0 */
        public final /* synthetic */ sd.C6034d f23310j0;

        @p134hh.InterfaceC3044e(m7451c = "io.tacocrypto.app.ui.balance.BalanceViewModel$refresh$1$1$listBalanceResult$1", m7452f = "BalanceViewModel.kt", m7453l = {119}, m7454m = "invokeSuspend")
        /* renamed from: sd.d$g$a */
        public static final class a extends p134hh.AbstractC3048i implements mh.InterfaceC4624p<p379vh.InterfaceC6686b0, p101fh.InterfaceC2172d<? super ch.C0979f<? extends java.util.List<? extends p255od.C5194b0>>>, java.lang.Object> {

            /* renamed from: c0 */
            public int f23311c0;

            /* renamed from: d0 */
            public /* synthetic */ java.lang.Object f23312d0;

            /* renamed from: e0 */
            public final /* synthetic */ sd.C6034d f23313e0;

            public a(sd.C6034d r1, p101fh.InterfaceC2172d<? super sd.C6034d.g.a> r2) {
                    r0 = this;
                    r0.f23313e0 = r1
                    r1 = 2
                    r0.<init>(r1, r2)
                    return
            }

            @Override // p134hh.AbstractC3040a
            /* renamed from: h */
            public final p101fh.InterfaceC2172d<ch.C0985l> mo121h(java.lang.Object r3, p101fh.InterfaceC2172d<?> r4) {
                    r2 = this;
                    sd.d$g$a r0 = new sd.d$g$a
                    sd.d r1 = r2.f23313e0
                    r0.<init>(r1, r4)
                    r0.f23312d0 = r3
                    return r0
            }

            @Override // mh.InterfaceC4624p
            /* renamed from: l */
            public java.lang.Object mo122l(p379vh.InterfaceC6686b0 r3, p101fh.InterfaceC2172d<? super ch.C0979f<? extends java.util.List<? extends p255od.C5194b0>>> r4) {
                    r2 = this;
                    vh.b0 r3 = (p379vh.InterfaceC6686b0) r3
                    fh.d r4 = (p101fh.InterfaceC2172d) r4
                    sd.d$g$a r0 = new sd.d$g$a
                    sd.d r1 = r2.f23313e0
                    r0.<init>(r1, r4)
                    r0.f23312d0 = r3
                    ch.l r3 = ch.C0985l.f5061a
                    java.lang.Object r3 = r0.mo123o(r3)
                    return r3
            }

            @Override // p134hh.AbstractC3040a
            /* renamed from: o */
            public final java.lang.Object mo123o(java.lang.Object r4) {
                    r3 = this;
                    gh.a r0 = gh.EnumC2389a.f10764Y
                    int r1 = r3.f23311c0
                    r2 = 1
                    if (r1 == 0) goto L17
                    if (r1 != r2) goto Lf
                    p074e9.C1805a.m4540y(r4)     // Catch: java.lang.Throwable -> Ld
                    goto L2d
                Ld:
                    r4 = move-exception
                    goto L30
                Lf:
                    java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r4.<init>(r0)
                    throw r4
                L17:
                    p074e9.C1805a.m4540y(r4)
                    java.lang.Object r4 = r3.f23312d0
                    vh.b0 r4 = (p379vh.InterfaceC6686b0) r4
                    sd.d r4 = r3.f23313e0
                    nd.b0 r4 = r4.f23263d     // Catch: java.lang.Throwable -> Ld
                    java.lang.String r1 = "TAG_REQUEST_BALANCE"
                    r3.f23311c0 = r2     // Catch: java.lang.Throwable -> Ld
                    java.lang.Object r4 = r4.m10792d(r1, r3)     // Catch: java.lang.Throwable -> Ld
                    if (r4 != r0) goto L2d
                    return r0
                L2d:
                    java.util.List r4 = (java.util.List) r4     // Catch: java.lang.Throwable -> Ld
                    goto L34
                L30:
                    java.lang.Object r4 = p074e9.C1805a.m4520e(r4)
                L34:
                    ch.f r0 = new ch.f
                    r0.<init>(r4)
                    return r0
            }
        }

        @p134hh.InterfaceC3044e(m7451c = "io.tacocrypto.app.ui.balance.BalanceViewModel$refresh$1$1$listMarketResult$1", m7452f = "BalanceViewModel.kt", m7453l = {120}, m7454m = "invokeSuspend")
        /* renamed from: sd.d$g$b */
        public static final class b extends p134hh.AbstractC3048i implements mh.InterfaceC4624p<p379vh.InterfaceC6686b0, p101fh.InterfaceC2172d<? super ch.C0979f<? extends java.util.List<? extends p255od.C5238z>>>, java.lang.Object> {

            /* renamed from: c0 */
            public int f23314c0;

            /* renamed from: d0 */
            public /* synthetic */ java.lang.Object f23315d0;

            /* renamed from: e0 */
            public final /* synthetic */ sd.C6034d f23316e0;

            public b(sd.C6034d r1, p101fh.InterfaceC2172d<? super sd.C6034d.g.b> r2) {
                    r0 = this;
                    r0.f23316e0 = r1
                    r1 = 2
                    r0.<init>(r1, r2)
                    return
            }

            @Override // p134hh.AbstractC3040a
            /* renamed from: h */
            public final p101fh.InterfaceC2172d<ch.C0985l> mo121h(java.lang.Object r3, p101fh.InterfaceC2172d<?> r4) {
                    r2 = this;
                    sd.d$g$b r0 = new sd.d$g$b
                    sd.d r1 = r2.f23316e0
                    r0.<init>(r1, r4)
                    r0.f23315d0 = r3
                    return r0
            }

            @Override // mh.InterfaceC4624p
            /* renamed from: l */
            public java.lang.Object mo122l(p379vh.InterfaceC6686b0 r3, p101fh.InterfaceC2172d<? super ch.C0979f<? extends java.util.List<? extends p255od.C5238z>>> r4) {
                    r2 = this;
                    vh.b0 r3 = (p379vh.InterfaceC6686b0) r3
                    fh.d r4 = (p101fh.InterfaceC2172d) r4
                    sd.d$g$b r0 = new sd.d$g$b
                    sd.d r1 = r2.f23316e0
                    r0.<init>(r1, r4)
                    r0.f23315d0 = r3
                    ch.l r3 = ch.C0985l.f5061a
                    java.lang.Object r3 = r0.mo123o(r3)
                    return r3
            }

            @Override // p134hh.AbstractC3040a
            /* renamed from: o */
            public final java.lang.Object mo123o(java.lang.Object r4) {
                    r3 = this;
                    gh.a r0 = gh.EnumC2389a.f10764Y
                    int r1 = r3.f23314c0
                    r2 = 1
                    if (r1 == 0) goto L17
                    if (r1 != r2) goto Lf
                    p074e9.C1805a.m4540y(r4)     // Catch: java.lang.Throwable -> Ld
                    goto L2d
                Ld:
                    r4 = move-exception
                    goto L30
                Lf:
                    java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r4.<init>(r0)
                    throw r4
                L17:
                    p074e9.C1805a.m4540y(r4)
                    java.lang.Object r4 = r3.f23315d0
                    vh.b0 r4 = (p379vh.InterfaceC6686b0) r4
                    sd.d r4 = r3.f23316e0
                    nd.b0 r4 = r4.f23263d     // Catch: java.lang.Throwable -> Ld
                    java.lang.String r1 = "TAG_REQUEST_BALANCE"
                    r3.f23314c0 = r2     // Catch: java.lang.Throwable -> Ld
                    java.lang.Object r4 = r4.m10793f(r1, r3)     // Catch: java.lang.Throwable -> Ld
                    if (r4 != r0) goto L2d
                    return r0
                L2d:
                    java.util.List r4 = (java.util.List) r4     // Catch: java.lang.Throwable -> Ld
                    goto L34
                L30:
                    java.lang.Object r4 = p074e9.C1805a.m4520e(r4)
                L34:
                    ch.f r0 = new ch.f
                    r0.<init>(r4)
                    return r0
            }
        }

        @p134hh.InterfaceC3044e(m7451c = "io.tacocrypto.app.ui.balance.BalanceViewModel$refresh$1$1$refreshCurrency$1", m7452f = "BalanceViewModel.kt", m7453l = {122}, m7454m = "invokeSuspend")
        /* renamed from: sd.d$g$c */
        public static final class c extends p134hh.AbstractC3048i implements mh.InterfaceC4624p<p379vh.InterfaceC6686b0, p101fh.InterfaceC2172d<? super ch.C0979f<? extends ch.C0985l>>, java.lang.Object> {

            /* renamed from: c0 */
            public int f23317c0;

            /* renamed from: d0 */
            public /* synthetic */ java.lang.Object f23318d0;

            public c(p101fh.InterfaceC2172d<? super sd.C6034d.g.c> r2) {
                    r1 = this;
                    r0 = 2
                    r1.<init>(r0, r2)
                    return
            }

            @Override // p134hh.AbstractC3040a
            /* renamed from: h */
            public final p101fh.InterfaceC2172d<ch.C0985l> mo121h(java.lang.Object r2, p101fh.InterfaceC2172d<?> r3) {
                    r1 = this;
                    sd.d$g$c r0 = new sd.d$g$c
                    r0.<init>(r3)
                    r0.f23318d0 = r2
                    return r0
            }

            @Override // mh.InterfaceC4624p
            /* renamed from: l */
            public java.lang.Object mo122l(p379vh.InterfaceC6686b0 r2, p101fh.InterfaceC2172d<? super ch.C0979f<? extends ch.C0985l>> r3) {
                    r1 = this;
                    vh.b0 r2 = (p379vh.InterfaceC6686b0) r2
                    fh.d r3 = (p101fh.InterfaceC2172d) r3
                    sd.d$g$c r0 = new sd.d$g$c
                    r0.<init>(r3)
                    r0.f23318d0 = r2
                    ch.l r2 = ch.C0985l.f5061a
                    java.lang.Object r2 = r0.mo123o(r2)
                    return r2
            }

            @Override // p134hh.AbstractC3040a
            /* renamed from: o */
            public final java.lang.Object mo123o(java.lang.Object r4) {
                    r3 = this;
                    gh.a r0 = gh.EnumC2389a.f10764Y
                    int r1 = r3.f23317c0
                    r2 = 1
                    if (r1 == 0) goto L17
                    if (r1 != r2) goto Lf
                    p074e9.C1805a.m4540y(r4)     // Catch: java.lang.Throwable -> Ld
                    goto L47
                Ld:
                    r4 = move-exception
                    goto L4a
                Lf:
                    java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r4.<init>(r0)
                    throw r4
                L17:
                    p074e9.C1805a.m4540y(r4)
                    java.lang.Object r4 = r3.f23318d0
                    vh.b0 r4 = (p379vh.InterfaceC6686b0) r4
                    nd.q r4 = p238nd.C4770q.f19093a     // Catch: java.lang.Throwable -> Ld
                    java.lang.String r1 = "Please for CurrencyManager us initialize() before getting the instance."
                    java.util.Objects.requireNonNull(r4, r1)     // Catch: java.lang.Throwable -> Ld
                    nd.q r4 = p238nd.C4770q.f19093a     // Catch: java.lang.Throwable -> Ld
                    p214m2.C4339q.m9704i(r4)     // Catch: java.lang.Throwable -> Ld
                    r3.f23317c0 = r2     // Catch: java.lang.Throwable -> Ld
                    nd.b0$a r4 = p238nd.C4728b0.f18900D     // Catch: java.lang.Throwable -> Ld
                    nd.b0 r1 = r4.m10809a()     // Catch: java.lang.Throwable -> Ld
                    java.lang.Double r1 = r1.f18926v     // Catch: java.lang.Throwable -> Ld
                    if (r1 != 0) goto L42
                    nd.b0 r4 = r4.m10809a()     // Catch: java.lang.Throwable -> Ld
                    r1 = 0
                    java.lang.Object r4 = r4.m10797j(r1, r3)     // Catch: java.lang.Throwable -> Ld
                    if (r4 != r0) goto L42
                    goto L44
                L42:
                    ch.l r4 = ch.C0985l.f5061a     // Catch: java.lang.Throwable -> Ld
                L44:
                    if (r4 != r0) goto L47
                    return r0
                L47:
                    ch.l r4 = ch.C0985l.f5061a     // Catch: java.lang.Throwable -> Ld
                    goto L4e
                L4a:
                    java.lang.Object r4 = p074e9.C1805a.m4520e(r4)
                L4e:
                    ch.f r0 = new ch.f
                    r0.<init>(r4)
                    return r0
            }
        }

        @p134hh.InterfaceC3044e(m7451c = "io.tacocrypto.app.ui.balance.BalanceViewModel$refresh$1$1$waxConversionResult$1", m7452f = "BalanceViewModel.kt", m7453l = {121}, m7454m = "invokeSuspend")
        /* renamed from: sd.d$g$d */
        public static final class d extends p134hh.AbstractC3048i implements mh.InterfaceC4624p<p379vh.InterfaceC6686b0, p101fh.InterfaceC2172d<? super ch.C0979f<? extends ch.C0985l>>, java.lang.Object> {

            /* renamed from: c0 */
            public int f23319c0;

            /* renamed from: d0 */
            public /* synthetic */ java.lang.Object f23320d0;

            /* renamed from: e0 */
            public final /* synthetic */ sd.C6034d f23321e0;

            public d(sd.C6034d r1, p101fh.InterfaceC2172d<? super sd.C6034d.g.d> r2) {
                    r0 = this;
                    r0.f23321e0 = r1
                    r1 = 2
                    r0.<init>(r1, r2)
                    return
            }

            @Override // p134hh.AbstractC3040a
            /* renamed from: h */
            public final p101fh.InterfaceC2172d<ch.C0985l> mo121h(java.lang.Object r3, p101fh.InterfaceC2172d<?> r4) {
                    r2 = this;
                    sd.d$g$d r0 = new sd.d$g$d
                    sd.d r1 = r2.f23321e0
                    r0.<init>(r1, r4)
                    r0.f23320d0 = r3
                    return r0
            }

            @Override // mh.InterfaceC4624p
            /* renamed from: l */
            public java.lang.Object mo122l(p379vh.InterfaceC6686b0 r3, p101fh.InterfaceC2172d<? super ch.C0979f<? extends ch.C0985l>> r4) {
                    r2 = this;
                    vh.b0 r3 = (p379vh.InterfaceC6686b0) r3
                    fh.d r4 = (p101fh.InterfaceC2172d) r4
                    sd.d$g$d r0 = new sd.d$g$d
                    sd.d r1 = r2.f23321e0
                    r0.<init>(r1, r4)
                    r0.f23320d0 = r3
                    ch.l r3 = ch.C0985l.f5061a
                    java.lang.Object r3 = r0.mo123o(r3)
                    return r3
            }

            @Override // p134hh.AbstractC3040a
            /* renamed from: o */
            public final java.lang.Object mo123o(java.lang.Object r4) {
                    r3 = this;
                    gh.a r0 = gh.EnumC2389a.f10764Y
                    int r1 = r3.f23319c0
                    r2 = 1
                    if (r1 == 0) goto L17
                    if (r1 != r2) goto Lf
                    p074e9.C1805a.m4540y(r4)     // Catch: java.lang.Throwable -> Ld
                    goto L2d
                Ld:
                    r4 = move-exception
                    goto L30
                Lf:
                    java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r4.<init>(r0)
                    throw r4
                L17:
                    p074e9.C1805a.m4540y(r4)
                    java.lang.Object r4 = r3.f23320d0
                    vh.b0 r4 = (p379vh.InterfaceC6686b0) r4
                    sd.d r4 = r3.f23321e0
                    nd.b0 r4 = r4.f23263d     // Catch: java.lang.Throwable -> Ld
                    java.lang.String r1 = "TAG_REQUEST_BALANCE"
                    r3.f23319c0 = r2     // Catch: java.lang.Throwable -> Ld
                    java.lang.Object r4 = r4.m10797j(r1, r3)     // Catch: java.lang.Throwable -> Ld
                    if (r4 != r0) goto L2d
                    return r0
                L2d:
                    ch.l r4 = ch.C0985l.f5061a     // Catch: java.lang.Throwable -> Ld
                    goto L34
                L30:
                    java.lang.Object r4 = p074e9.C1805a.m4520e(r4)
                L34:
                    ch.f r0 = new ch.f
                    r0.<init>(r4)
                    return r0
            }
        }

        @p134hh.InterfaceC3044e(m7451c = "io.tacocrypto.app.ui.balance.BalanceViewModel$refresh$1$2$1", m7452f = "BalanceViewModel.kt", m7453l = {}, m7454m = "invokeSuspend")
        /* renamed from: sd.d$g$e */
        public static final class e extends p134hh.AbstractC3048i implements mh.InterfaceC4624p<p379vh.InterfaceC6686b0, p101fh.InterfaceC2172d<? super ch.C0985l>, java.lang.Object> {

            /* renamed from: c0 */
            public final /* synthetic */ sd.C6034d f23322c0;

            public e(sd.C6034d r1, p101fh.InterfaceC2172d<? super sd.C6034d.g.e> r2) {
                    r0 = this;
                    r0.f23322c0 = r1
                    r1 = 2
                    r0.<init>(r1, r2)
                    return
            }

            @Override // p134hh.AbstractC3040a
            /* renamed from: h */
            public final p101fh.InterfaceC2172d<ch.C0985l> mo121h(java.lang.Object r2, p101fh.InterfaceC2172d<?> r3) {
                    r1 = this;
                    sd.d$g$e r2 = new sd.d$g$e
                    sd.d r0 = r1.f23322c0
                    r2.<init>(r0, r3)
                    return r2
            }

            @Override // mh.InterfaceC4624p
            /* renamed from: l */
            public java.lang.Object mo122l(p379vh.InterfaceC6686b0 r2, p101fh.InterfaceC2172d<? super ch.C0985l> r3) {
                    r1 = this;
                    vh.b0 r2 = (p379vh.InterfaceC6686b0) r2
                    fh.d r3 = (p101fh.InterfaceC2172d) r3
                    sd.d$g$e r2 = new sd.d$g$e
                    sd.d r0 = r1.f23322c0
                    r2.<init>(r0, r3)
                    ch.l r2 = ch.C0985l.f5061a
                    p074e9.C1805a.m4540y(r2)
                    androidx.lifecycle.d0<java.lang.Boolean> r3 = r0.f23268i
                    java.lang.Boolean r0 = java.lang.Boolean.FALSE
                    r3.mo7l(r0)
                    return r2
            }

            @Override // p134hh.AbstractC3040a
            /* renamed from: o */
            public final java.lang.Object mo123o(java.lang.Object r2) {
                    r1 = this;
                    p074e9.C1805a.m4540y(r2)
                    sd.d r2 = r1.f23322c0
                    androidx.lifecycle.d0<java.lang.Boolean> r2 = r2.f23268i
                    java.lang.Boolean r0 = java.lang.Boolean.FALSE
                    r2.mo7l(r0)
                    ch.l r2 = ch.C0985l.f5061a
                    return r2
            }
        }

        @p134hh.InterfaceC3044e(m7451c = "io.tacocrypto.app.ui.balance.BalanceViewModel$refresh$1$3$1", m7452f = "BalanceViewModel.kt", m7453l = {}, m7454m = "invokeSuspend")
        /* renamed from: sd.d$g$f */
        public static final class f extends p134hh.AbstractC3048i implements mh.InterfaceC4624p<p379vh.InterfaceC6686b0, p101fh.InterfaceC2172d<? super ch.C0985l>, java.lang.Object> {

            /* renamed from: c0 */
            public final /* synthetic */ sd.C6034d f23323c0;

            /* renamed from: d0 */
            public final /* synthetic */ java.lang.Throwable f23324d0;

            public f(sd.C6034d r1, java.lang.Throwable r2, p101fh.InterfaceC2172d<? super sd.C6034d.g.f> r3) {
                    r0 = this;
                    r0.f23323c0 = r1
                    r0.f23324d0 = r2
                    r1 = 2
                    r0.<init>(r1, r3)
                    return
            }

            @Override // p134hh.AbstractC3040a
            /* renamed from: h */
            public final p101fh.InterfaceC2172d<ch.C0985l> mo121h(java.lang.Object r3, p101fh.InterfaceC2172d<?> r4) {
                    r2 = this;
                    sd.d$g$f r3 = new sd.d$g$f
                    sd.d r0 = r2.f23323c0
                    java.lang.Throwable r1 = r2.f23324d0
                    r3.<init>(r0, r1, r4)
                    return r3
            }

            @Override // mh.InterfaceC4624p
            /* renamed from: l */
            public java.lang.Object mo122l(p379vh.InterfaceC6686b0 r3, p101fh.InterfaceC2172d<? super ch.C0985l> r4) {
                    r2 = this;
                    vh.b0 r3 = (p379vh.InterfaceC6686b0) r3
                    fh.d r4 = (p101fh.InterfaceC2172d) r4
                    sd.d$g$f r3 = new sd.d$g$f
                    sd.d r0 = r2.f23323c0
                    java.lang.Throwable r1 = r2.f23324d0
                    r3.<init>(r0, r1, r4)
                    ch.l r3 = ch.C0985l.f5061a
                    p074e9.C1805a.m4540y(r3)
                    androidx.lifecycle.d0<java.lang.Boolean> r4 = r0.f23268i
                    java.lang.Boolean r0 = java.lang.Boolean.FALSE
                    r4.mo7l(r0)
                    hk.a$b r4 = hk.C3053a.f12282b
                    r4.mo7468b(r1)
                    return r3
            }

            @Override // p134hh.AbstractC3040a
            /* renamed from: o */
            public final java.lang.Object mo123o(java.lang.Object r2) {
                    r1 = this;
                    p074e9.C1805a.m4540y(r2)
                    sd.d r2 = r1.f23323c0
                    androidx.lifecycle.d0<java.lang.Boolean> r2 = r2.f23268i
                    java.lang.Boolean r0 = java.lang.Boolean.FALSE
                    r2.mo7l(r0)
                    java.lang.Throwable r2 = r1.f23324d0
                    hk.a$b r0 = hk.C3053a.f12282b
                    r0.mo7468b(r2)
                    ch.l r2 = ch.C0985l.f5061a
                    return r2
            }
        }

        public g(sd.C6034d r1, p101fh.InterfaceC2172d<? super sd.C6034d.g> r2) {
                r0 = this;
                r0.f23310j0 = r1
                r1 = 2
                r0.<init>(r1, r2)
                return
        }

        @Override // p134hh.AbstractC3040a
        /* renamed from: h */
        public final p101fh.InterfaceC2172d<ch.C0985l> mo121h(java.lang.Object r3, p101fh.InterfaceC2172d<?> r4) {
                r2 = this;
                sd.d$g r0 = new sd.d$g
                sd.d r1 = r2.f23310j0
                r0.<init>(r1, r4)
                r0.f23309i0 = r3
                return r0
        }

        @Override // mh.InterfaceC4624p
        /* renamed from: l */
        public java.lang.Object mo122l(p379vh.InterfaceC6686b0 r3, p101fh.InterfaceC2172d<? super ch.C0985l> r4) {
                r2 = this;
                vh.b0 r3 = (p379vh.InterfaceC6686b0) r3
                fh.d r4 = (p101fh.InterfaceC2172d) r4
                sd.d$g r0 = new sd.d$g
                sd.d r1 = r2.f23310j0
                r0.<init>(r1, r4)
                r0.f23309i0 = r3
                ch.l r3 = ch.C0985l.f5061a
                java.lang.Object r3 = r0.mo123o(r3)
                return r3
        }

        @Override // p134hh.AbstractC3040a
        /* renamed from: o */
        public final java.lang.Object mo123o(java.lang.Object r32) {
                r31 = this;
                r1 = r31
                gh.a r2 = gh.EnumC2389a.f10764Y
                int r0 = r1.f23308h0
                r3 = 2
                r4 = 0
                r7 = 1
                r9 = 0
                java.lang.String r10 = "TAG_REQUEST_BALANCE"
                java.lang.String r11 = "Please for CurrencyManager us initialize() before getting the instance."
                switch(r0) {
                    case 0: goto Lc7;
                    case 1: goto La8;
                    case 2: goto L88;
                    case 3: goto L6a;
                    case 4: goto L53;
                    case 5: goto L3a;
                    case 6: goto L26;
                    case 7: goto L1f;
                    case 8: goto L1a;
                    default: goto L12;
                }
            L12:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r2)
                throw r0
            L1a:
                p074e9.C1805a.m4540y(r32)
                goto L496
            L1f:
                java.lang.Object r0 = r1.f23309i0
                p074e9.C1805a.m4540y(r32)
                goto L46d
            L26:
                java.lang.Object r0 = r1.f23303c0
                r3 = r0
                vh.b0 r3 = (p379vh.InterfaceC6686b0) r3
                java.lang.Object r0 = r1.f23309i0
                r10 = r0
                sd.d r10 = (sd.C6034d) r10
                p074e9.C1805a.m4540y(r32)     // Catch: java.lang.Throwable -> L37
                r0 = r32
                goto L3c0
            L37:
                r0 = move-exception
                goto L3c3
            L3a:
                java.lang.Object r0 = r1.f23304d0
                r3 = r0
                java.lang.String r3 = (java.lang.String) r3
                java.lang.Object r0 = r1.f23303c0
                r12 = r0
                vh.b0 r12 = (p379vh.InterfaceC6686b0) r12
                java.lang.Object r0 = r1.f23309i0
                r13 = r0
                sd.d r13 = (sd.C6034d) r13
                p074e9.C1805a.m4540y(r32)     // Catch: java.lang.Throwable -> L50
                r0 = r32
                goto L332
            L50:
                r0 = move-exception
                goto L337
            L53:
                java.lang.Object r0 = r1.f23305e0
                java.util.List r0 = (java.util.List) r0
                java.lang.Object r12 = r1.f23304d0
                id.b r12 = (id.C3131b) r12
                java.lang.Object r13 = r1.f23303c0
                vh.b0 r13 = (p379vh.InterfaceC6686b0) r13
                java.lang.Object r14 = r1.f23309i0
                sd.d r14 = (sd.C6034d) r14
                p074e9.C1805a.m4540y(r32)     // Catch: java.lang.Throwable -> L275
                r3 = r32
                goto L2ba
            L6a:
                java.lang.Object r0 = r1.f23306f0
                java.util.List r0 = (java.util.List) r0
                java.lang.Object r12 = r1.f23305e0
                id.b r12 = (id.C3131b) r12
                java.lang.Object r13 = r1.f23304d0
                vh.f0 r13 = (p379vh.InterfaceC6698f0) r13
                java.lang.Object r14 = r1.f23303c0
                vh.b0 r14 = (p379vh.InterfaceC6686b0) r14
                java.lang.Object r15 = r1.f23309i0
                sd.d r15 = (sd.C6034d) r15
                p074e9.C1805a.m4540y(r32)     // Catch: java.lang.Throwable -> L275
                r4 = r32
                r3 = r13
                r13 = r14
                r14 = r15
                goto L29f
            L88:
                java.lang.Object r0 = r1.f23307g0
                sd.d r0 = (sd.C6034d) r0
                java.lang.Object r12 = r1.f23306f0
                java.util.List r12 = (java.util.List) r12
                java.lang.Object r13 = r1.f23305e0
                vh.f0 r13 = (p379vh.InterfaceC6698f0) r13
                java.lang.Object r14 = r1.f23304d0
                vh.f0 r14 = (p379vh.InterfaceC6698f0) r14
                java.lang.Object r15 = r1.f23303c0
                vh.b0 r15 = (p379vh.InterfaceC6686b0) r15
                java.lang.Object r6 = r1.f23309i0
                sd.d r6 = (sd.C6034d) r6
                p074e9.C1805a.m4540y(r32)     // Catch: java.lang.Throwable -> L275
                r7 = r12
                r12 = r32
                goto L167
            La8:
                java.lang.Object r0 = r1.f23306f0
                vh.f0 r0 = (p379vh.InterfaceC6698f0) r0
                java.lang.Object r6 = r1.f23305e0
                vh.f0 r6 = (p379vh.InterfaceC6698f0) r6
                java.lang.Object r12 = r1.f23304d0
                vh.f0 r12 = (p379vh.InterfaceC6698f0) r12
                java.lang.Object r13 = r1.f23303c0
                vh.b0 r13 = (p379vh.InterfaceC6686b0) r13
                java.lang.Object r14 = r1.f23309i0
                sd.d r14 = (sd.C6034d) r14
                p074e9.C1805a.m4540y(r32)     // Catch: java.lang.Throwable -> L275
                r15 = r0
                r0 = r14
                r14 = r6
                r6 = r13
                r13 = r32
                goto L13e
            Lc7:
                p074e9.C1805a.m4540y(r32)
                java.lang.Object r0 = r1.f23309i0
                vh.b0 r0 = (p379vh.InterfaceC6686b0) r0
                sd.d r6 = r1.f23310j0
                r17 = 0
                sd.d$g$a r12 = new sd.d$g$a     // Catch: java.lang.Throwable -> L275
                r12.<init>(r6, r9)     // Catch: java.lang.Throwable -> L275
                r20 = 3
                r21 = 0
                r18 = 0
                r16 = r0
                r19 = r12
                vh.f0 r12 = p101fh.C2174f.m5714d(r16, r17, r18, r19, r20, r21)     // Catch: java.lang.Throwable -> L275
                r17 = 0
                sd.d$g$b r13 = new sd.d$g$b     // Catch: java.lang.Throwable -> L275
                r13.<init>(r6, r9)     // Catch: java.lang.Throwable -> L275
                r20 = 3
                r21 = 0
                r18 = 0
                r16 = r0
                r19 = r13
                vh.f0 r13 = p101fh.C2174f.m5714d(r16, r17, r18, r19, r20, r21)     // Catch: java.lang.Throwable -> L275
                r17 = 0
                sd.d$g$d r14 = new sd.d$g$d     // Catch: java.lang.Throwable -> L275
                r14.<init>(r6, r9)     // Catch: java.lang.Throwable -> L275
                r20 = 3
                r21 = 0
                r18 = 0
                r16 = r0
                r19 = r14
                vh.f0 r14 = p101fh.C2174f.m5714d(r16, r17, r18, r19, r20, r21)     // Catch: java.lang.Throwable -> L275
                r17 = 0
                sd.d$g$c r15 = new sd.d$g$c     // Catch: java.lang.Throwable -> L275
                r15.<init>(r9)     // Catch: java.lang.Throwable -> L275
                r20 = 3
                r21 = 0
                r18 = 0
                r16 = r0
                r19 = r15
                vh.f0 r15 = p101fh.C2174f.m5714d(r16, r17, r18, r19, r20, r21)     // Catch: java.lang.Throwable -> L275
                r1.f23309i0 = r6     // Catch: java.lang.Throwable -> L275
                r1.f23303c0 = r0     // Catch: java.lang.Throwable -> L275
                r1.f23304d0 = r12     // Catch: java.lang.Throwable -> L275
                r1.f23305e0 = r14     // Catch: java.lang.Throwable -> L275
                r1.f23306f0 = r15     // Catch: java.lang.Throwable -> L275
                r1.f23308h0 = r7     // Catch: java.lang.Throwable -> L275
                vh.g0 r13 = (p379vh.C6701g0) r13     // Catch: java.lang.Throwable -> L275
                java.lang.Object r13 = r13.mo13566Q(r1)     // Catch: java.lang.Throwable -> L275
                if (r13 != r2) goto L139
                return r2
            L139:
                r30 = r6
                r6 = r0
                r0 = r30
            L13e:
                ch.f r13 = (ch.C0979f) r13     // Catch: java.lang.Throwable -> L275
                java.lang.Object r13 = r13.f5052Y     // Catch: java.lang.Throwable -> L275
                boolean r7 = r13 instanceof ch.C0979f.a     // Catch: java.lang.Throwable -> L275
                if (r7 == 0) goto L147
                r13 = r9
            L147:
                java.util.List r13 = (java.util.List) r13     // Catch: java.lang.Throwable -> L275
                if (r13 != 0) goto L14e
                dh.k r7 = p062dh.C1475k.f7237Y     // Catch: java.lang.Throwable -> L275
                goto L14f
            L14e:
                r7 = r13
            L14f:
                r1.f23309i0 = r0     // Catch: java.lang.Throwable -> L275
                r1.f23303c0 = r6     // Catch: java.lang.Throwable -> L275
                r1.f23304d0 = r14     // Catch: java.lang.Throwable -> L275
                r1.f23305e0 = r15     // Catch: java.lang.Throwable -> L275
                r1.f23306f0 = r7     // Catch: java.lang.Throwable -> L275
                r1.f23307g0 = r0     // Catch: java.lang.Throwable -> L275
                r1.f23308h0 = r3     // Catch: java.lang.Throwable -> L275
                java.lang.Object r12 = r12.mo13566Q(r1)     // Catch: java.lang.Throwable -> L275
                if (r12 != r2) goto L164
                return r2
            L164:
                r13 = r15
                r15 = r6
                r6 = r0
            L167:
                ch.f r12 = (ch.C0979f) r12     // Catch: java.lang.Throwable -> L275
                java.lang.Object r12 = r12.f5052Y     // Catch: java.lang.Throwable -> L275
                boolean r3 = r12 instanceof ch.C0979f.a     // Catch: java.lang.Throwable -> L275
                if (r3 == 0) goto L170
                r12 = r9
            L170:
                java.util.List r12 = (java.util.List) r12     // Catch: java.lang.Throwable -> L275
                if (r12 != 0) goto L176
                dh.k r12 = p062dh.C1475k.f7237Y     // Catch: java.lang.Throwable -> L275
            L176:
                java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L275
                r8 = 10
                int r8 = p062dh.C1469e.m3992D(r12, r8)     // Catch: java.lang.Throwable -> L275
                r3.<init>(r8)     // Catch: java.lang.Throwable -> L275
                java.util.Iterator r8 = r12.iterator()     // Catch: java.lang.Throwable -> L275
            L185:
                boolean r12 = r8.hasNext()     // Catch: java.lang.Throwable -> L275
                if (r12 == 0) goto L1ac
                java.lang.Object r12 = r8.next()     // Catch: java.lang.Throwable -> L275
                r20 = r12
                od.b0 r20 = (p255od.C5194b0) r20     // Catch: java.lang.Throwable -> L275
                sd.d$a r12 = new sd.d$a     // Catch: java.lang.Throwable -> L275
                r21 = 0
                r22 = 0
                r23 = 0
                r24 = 0
                r25 = 0
                r26 = 0
                r27 = 126(0x7e, float:1.77E-43)
                r19 = r12
                r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27)     // Catch: java.lang.Throwable -> L275
                r3.add(r12)     // Catch: java.lang.Throwable -> L275
                goto L185
            L1ac:
                java.util.ArrayList r8 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L275
                r8.<init>()     // Catch: java.lang.Throwable -> L275
                java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L275
            L1b5:
                boolean r12 = r3.hasNext()     // Catch: java.lang.Throwable -> L275
                if (r12 == 0) goto L1d6
                java.lang.Object r12 = r3.next()     // Catch: java.lang.Throwable -> L275
                r9 = r12
                sd.d$a r9 = (sd.C6034d.a) r9     // Catch: java.lang.Throwable -> L275
                od.b0 r9 = r9.f23286a     // Catch: java.lang.Throwable -> L275
                double r20 = r9.getAmount()     // Catch: java.lang.Throwable -> L275
                int r9 = (r20 > r4 ? 1 : (r20 == r4 ? 0 : -1))
                if (r9 <= 0) goto L1ce
                r9 = 1
                goto L1cf
            L1ce:
                r9 = 0
            L1cf:
                if (r9 == 0) goto L1d4
                r8.add(r12)     // Catch: java.lang.Throwable -> L275
            L1d4:
                r9 = 0
                goto L1b5
            L1d6:
                androidx.lifecycle.d0<io.tacocrypto.app.ui.balance.f> r3 = r6.f23285z     // Catch: java.lang.Throwable -> L275
                java.lang.Object r3 = r3.m1411d()     // Catch: java.lang.Throwable -> L275
                p214m2.C4339q.m9704i(r3)     // Catch: java.lang.Throwable -> L275
                io.tacocrypto.app.ui.balance.f r3 = (io.tacocrypto.app.p156ui.balance.EnumC3216f) r3     // Catch: java.lang.Throwable -> L275
                java.util.List r0 = r0.m12517h(r8, r3)     // Catch: java.lang.Throwable -> L275
                nd.b0 r3 = r6.f23263d     // Catch: java.lang.Throwable -> L275
                id.b r3 = r3.m10795h()     // Catch: java.lang.Throwable -> L275
                r8 = r0
                java.util.ArrayList r8 = (java.util.ArrayList) r8     // Catch: java.lang.Throwable -> L275
                java.util.Iterator r8 = r8.iterator()     // Catch: java.lang.Throwable -> L275
            L1f2:
                boolean r9 = r8.hasNext()     // Catch: java.lang.Throwable -> L275
                if (r9 == 0) goto L281
                java.lang.Object r9 = r8.next()     // Catch: java.lang.Throwable -> L275
                sd.d$a r9 = (sd.C6034d.a) r9     // Catch: java.lang.Throwable -> L275
                od.b0 r12 = r9.f23286a     // Catch: java.lang.Throwable -> L275
                od.z r12 = vg.C6672m.m13516c(r12, r7)     // Catch: java.lang.Throwable -> L275
                if (r12 == 0) goto L20d
                java.lang.String r20 = r12.getId()     // Catch: java.lang.Throwable -> L275
                r4 = r20
                goto L20e
            L20d:
                r4 = 0
            L20e:
                r9.f23289d = r4     // Catch: java.lang.Throwable -> L275
                if (r12 == 0) goto L217
                java.lang.Boolean r4 = r12.isInverted()     // Catch: java.lang.Throwable -> L275
                goto L218
            L217:
                r4 = 0
            L218:
                r9.f23290e = r4     // Catch: java.lang.Throwable -> L275
                od.b0 r4 = r9.f23286a     // Catch: java.lang.Throwable -> L275
                java.lang.String r5 = "<this>"
                p214m2.C4339q.m9706k(r4, r5)     // Catch: java.lang.Throwable -> L275
                java.lang.String r5 = r4.getCurrency()     // Catch: java.lang.Throwable -> L275
                r32 = r8
                java.lang.String r8 = "WAX"
                boolean r5 = p214m2.C4339q.m9702c(r5, r8)     // Catch: java.lang.Throwable -> L275
                if (r5 == 0) goto L238
                double r4 = r4.getAmount()     // Catch: java.lang.Throwable -> L275
                java.lang.Double r4 = java.lang.Double.valueOf(r4)     // Catch: java.lang.Throwable -> L275
                goto L253
            L238:
                double r4 = r4.getAmount()     // Catch: java.lang.Throwable -> L275
                r22 = 4547007122018943789(0x3f1a36e2eb1c432d, double:1.0E-4)
                int r8 = (r4 > r22 ? 1 : (r4 == r22 ? 0 : -1))
                if (r8 <= 0) goto L252
                if (r12 == 0) goto L252
                double r22 = r12.getLast_price()     // Catch: java.lang.Throwable -> L275
                double r4 = r4 * r22
                java.lang.Double r4 = java.lang.Double.valueOf(r4)     // Catch: java.lang.Throwable -> L275
                goto L253
            L252:
                r4 = 0
            L253:
                r9.f23287b = r4     // Catch: java.lang.Throwable -> L275
                if (r3 == 0) goto L278
                boolean r5 = r9.f23292g     // Catch: java.lang.Throwable -> L275
                if (r5 == 0) goto L25c
                goto L278
            L25c:
                if (r4 == 0) goto L260
                r4 = 1
                goto L261
            L260:
                r4 = 0
            L261:
                r9.f23288c = r4     // Catch: java.lang.Throwable -> L275
                if (r4 != 0) goto L27b
                od.b0 r4 = r9.f23286a     // Catch: java.lang.Throwable -> L275
                java.util.List r4 = vg.C6672m.m13518e(r4, r7)     // Catch: java.lang.Throwable -> L275
                java.util.ArrayList r4 = (java.util.ArrayList) r4     // Catch: java.lang.Throwable -> L275
                boolean r4 = r4.isEmpty()     // Catch: java.lang.Throwable -> L275
                if (r4 != 0) goto L278
                r4 = 1
                goto L279
            L275:
                r0 = move-exception
                goto L43e
            L278:
                r4 = 0
            L279:
                r9.f23288c = r4     // Catch: java.lang.Throwable -> L275
            L27b:
                r8 = r32
                r4 = 0
                goto L1f2
            L281:
                r6.m12515f(r0)     // Catch: java.lang.Throwable -> L275
                r1.f23309i0 = r6     // Catch: java.lang.Throwable -> L275
                r1.f23303c0 = r15     // Catch: java.lang.Throwable -> L275
                r1.f23304d0 = r13     // Catch: java.lang.Throwable -> L275
                r1.f23305e0 = r3     // Catch: java.lang.Throwable -> L275
                r1.f23306f0 = r0     // Catch: java.lang.Throwable -> L275
                r4 = 0
                r1.f23307g0 = r4     // Catch: java.lang.Throwable -> L275
                r4 = 3
                r1.f23308h0 = r4     // Catch: java.lang.Throwable -> L275
                java.lang.Object r4 = r14.mo13566Q(r1)     // Catch: java.lang.Throwable -> L275
                if (r4 != r2) goto L29b
                return r2
            L29b:
                r12 = r3
                r14 = r6
                r3 = r13
                r13 = r15
            L29f:
                ch.f r4 = (ch.C0979f) r4     // Catch: java.lang.Throwable -> L275
                java.lang.Object r4 = r4.f5052Y     // Catch: java.lang.Throwable -> L275
                boolean r4 = r4 instanceof ch.C0979f.a     // Catch: java.lang.Throwable -> L275
                r1.f23309i0 = r14     // Catch: java.lang.Throwable -> L275
                r1.f23303c0 = r13     // Catch: java.lang.Throwable -> L275
                r1.f23304d0 = r12     // Catch: java.lang.Throwable -> L275
                r1.f23305e0 = r0     // Catch: java.lang.Throwable -> L275
                r4 = 0
                r1.f23306f0 = r4     // Catch: java.lang.Throwable -> L275
                r4 = 4
                r1.f23308h0 = r4     // Catch: java.lang.Throwable -> L275
                java.lang.Object r3 = r3.mo13566Q(r1)     // Catch: java.lang.Throwable -> L275
                if (r3 != r2) goto L2ba
                return r2
            L2ba:
                ch.f r3 = (ch.C0979f) r3     // Catch: java.lang.Throwable -> L275
                java.lang.Object r3 = r3.f5052Y     // Catch: java.lang.Throwable -> L275
                boolean r3 = r3 instanceof ch.C0979f.a     // Catch: java.lang.Throwable -> L275
                java.util.Iterator r3 = r0.iterator()     // Catch: java.lang.Throwable -> L275
            L2c4:
                boolean r4 = r3.hasNext()     // Catch: java.lang.Throwable -> L275
                if (r4 == 0) goto L2e5
                java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> L275
                sd.d$a r4 = (sd.C6034d.a) r4     // Catch: java.lang.Throwable -> L275
                nd.q r5 = p238nd.C4770q.f19093a     // Catch: java.lang.Throwable -> L275
                java.util.Objects.requireNonNull(r5, r11)     // Catch: java.lang.Throwable -> L275
                nd.q r5 = p238nd.C4770q.f19093a     // Catch: java.lang.Throwable -> L275
                p214m2.C4339q.m9704i(r5)     // Catch: java.lang.Throwable -> L275
                java.lang.Double r6 = r4.f23287b     // Catch: java.lang.Throwable -> L275
                r7 = 6
                r8 = 0
                java.lang.String r5 = p238nd.C4770q.m10831a(r5, r6, r8, r8, r7)     // Catch: java.lang.Throwable -> L275
                r4.f23291f = r5     // Catch: java.lang.Throwable -> L275
                goto L2c4
            L2e5:
                androidx.lifecycle.d0<java.lang.String> r3 = r14.f23271l     // Catch: java.lang.Throwable -> L275
                nd.q r4 = p238nd.C4770q.f19093a     // Catch: java.lang.Throwable -> L275
                java.util.Objects.requireNonNull(r4, r11)     // Catch: java.lang.Throwable -> L275
                nd.q r4 = p238nd.C4770q.f19093a     // Catch: java.lang.Throwable -> L275
                p214m2.C4339q.m9704i(r4)     // Catch: java.lang.Throwable -> L275
                r5 = 4607182418800017408(0x3ff0000000000000, double:1.0)
                java.lang.Double r7 = new java.lang.Double     // Catch: java.lang.Throwable -> L275
                r7.<init>(r5)     // Catch: java.lang.Throwable -> L275
                r5 = 2
                r6 = 6
                r8 = 0
                java.lang.String r4 = p238nd.C4770q.m10831a(r4, r7, r8, r6, r5)     // Catch: java.lang.Throwable -> L275
                r3.mo7l(r4)     // Catch: java.lang.Throwable -> L275
                r14.m12515f(r0)     // Catch: java.lang.Throwable -> L275
                if (r12 == 0) goto L30b
                java.lang.String r0 = r12.f12559a     // Catch: java.lang.Throwable -> L275
                r3 = r0
                goto L30c
            L30b:
                r3 = 0
            L30c:
                if (r3 != 0) goto L319
                androidx.lifecycle.d0<sd.d$b> r0 = r14.f23275p     // Catch: java.lang.Throwable -> L275
                r3 = 0
                r0.mo1415j(r3)     // Catch: java.lang.Throwable -> L275
                androidx.lifecycle.d0<sd.d$b> r0 = r14.f23277r     // Catch: java.lang.Throwable -> L275
                r3 = 0
                goto L438
            L319:
                boolean r0 = r14.f23273n     // Catch: java.lang.Throwable -> L275
                if (r0 == 0) goto L3a7
                r1.f23309i0 = r14     // Catch: java.lang.Throwable -> L33a
                r1.f23303c0 = r13     // Catch: java.lang.Throwable -> L33a
                r1.f23304d0 = r3     // Catch: java.lang.Throwable -> L33a
                r4 = 0
                r1.f23305e0 = r4     // Catch: java.lang.Throwable -> L33a
                r0 = 5
                r1.f23308h0 = r0     // Catch: java.lang.Throwable -> L33a
                java.lang.Object r0 = sd.C6034d.m12513d(r14, r3, r10, r1)     // Catch: java.lang.Throwable -> L33a
                if (r0 != r2) goto L330
                return r2
            L330:
                r12 = r13
                r13 = r14
            L332:
                md.a r0 = (md.C4536a) r0     // Catch: java.lang.Throwable -> L50
                r14 = r13
                r13 = r12
                goto L33f
            L337:
                r14 = r13
                r13 = r12
                goto L33b
            L33a:
                r0 = move-exception
            L33b:
                java.lang.Object r0 = p074e9.C1805a.m4520e(r0)     // Catch: java.lang.Throwable -> L275
            L33f:
                boolean r4 = r0 instanceof ch.C0979f.a     // Catch: java.lang.Throwable -> L275
                if (r4 == 0) goto L344
                r0 = 0
            L344:
                md.a r0 = (md.C4536a) r0     // Catch: java.lang.Throwable -> L275
                if (r0 == 0) goto L366
                md.e1 r0 = r0.getVoterInfo()     // Catch: java.lang.Throwable -> L275
                if (r0 == 0) goto L366
                java.lang.String r0 = r0.getStaked()     // Catch: java.lang.Throwable -> L275
                if (r0 == 0) goto L366
                java.lang.Long r0 = p362uh.C6462h.m13050G(r0)     // Catch: java.lang.Throwable -> L275
                if (r0 == 0) goto L366
                long r4 = r0.longValue()     // Catch: java.lang.Throwable -> L275
                double r4 = (double) r4     // Catch: java.lang.Throwable -> L275
                r6 = 4726483295884279808(0x4197d78400000000, double:1.0E8)
                double r4 = r4 / r6
                goto L368
            L366:
                r4 = 0
            L368:
                p101fh.C2174f.m5718h(r13)     // Catch: java.lang.Throwable -> L275
                androidx.lifecycle.d0<sd.d$b> r0 = r14.f23275p     // Catch: java.lang.Throwable -> L275
                r23 = 1
                sd.d$b r6 = new sd.d$b     // Catch: java.lang.Throwable -> L275
                io.tacocrypto.app.a r7 = io.tacocrypto.app.EnumC3199a.f14216a0     // Catch: java.lang.Throwable -> L275
                java.lang.String r26 = p097fd.C2139a.m5697a(r7)     // Catch: java.lang.Throwable -> L275
                java.lang.String r24 = "WAX"
                java.lang.String r25 = "staked"
                r27 = 0
                r28 = 0
                r29 = 48
                r22 = r6
                r22.<init>(r23, r24, r25, r26, r27, r28, r29)     // Catch: java.lang.Throwable -> L275
                java.lang.Double r7 = new java.lang.Double     // Catch: java.lang.Throwable -> L275
                r7.<init>(r4)     // Catch: java.lang.Throwable -> L275
                r6.f23297e = r7     // Catch: java.lang.Throwable -> L275
                nd.q r7 = p238nd.C4770q.f19093a     // Catch: java.lang.Throwable -> L275
                java.util.Objects.requireNonNull(r7, r11)     // Catch: java.lang.Throwable -> L275
                nd.q r7 = p238nd.C4770q.f19093a     // Catch: java.lang.Throwable -> L275
                p214m2.C4339q.m9704i(r7)     // Catch: java.lang.Throwable -> L275
                java.lang.Double r8 = new java.lang.Double     // Catch: java.lang.Throwable -> L275
                r8.<init>(r4)     // Catch: java.lang.Throwable -> L275
                r4 = 6
                r5 = 0
                java.lang.String r7 = p238nd.C4770q.m10831a(r7, r8, r5, r5, r4)     // Catch: java.lang.Throwable -> L275
                r6.f23298f = r7     // Catch: java.lang.Throwable -> L275
                r0.mo1415j(r6)     // Catch: java.lang.Throwable -> L275
            L3a7:
                boolean r0 = r14.f23274o     // Catch: java.lang.Throwable -> L275
                if (r0 == 0) goto L43b
                r1.f23309i0 = r14     // Catch: java.lang.Throwable -> L3c6
                r1.f23303c0 = r13     // Catch: java.lang.Throwable -> L3c6
                r4 = 0
                r1.f23304d0 = r4     // Catch: java.lang.Throwable -> L3c6
                r1.f23305e0 = r4     // Catch: java.lang.Throwable -> L3c6
                r4 = 6
                r1.f23308h0 = r4     // Catch: java.lang.Throwable -> L3c6
                java.lang.Object r0 = sd.C6034d.m12514e(r14, r3, r10, r1)     // Catch: java.lang.Throwable -> L3c6
                if (r0 != r2) goto L3be
                return r2
            L3be:
                r3 = r13
                r10 = r14
            L3c0:
                md.c r0 = (md.C4542c) r0     // Catch: java.lang.Throwable -> L37
                goto L3cd
            L3c3:
                r13 = r3
                r14 = r10
                goto L3c7
            L3c6:
                r0 = move-exception
            L3c7:
                java.lang.Object r0 = p074e9.C1805a.m4520e(r0)     // Catch: java.lang.Throwable -> L275
                r3 = r13
                r10 = r14
            L3cd:
                boolean r4 = r0 instanceof ch.C0979f.a     // Catch: java.lang.Throwable -> L275
                if (r4 == 0) goto L3d2
                r0 = 0
            L3d2:
                md.c r0 = (md.C4542c) r0     // Catch: java.lang.Throwable -> L275
                if (r0 == 0) goto L3f5
                java.util.List r0 = r0.getData()     // Catch: java.lang.Throwable -> L275
                if (r0 == 0) goto L3f5
                java.lang.Object r0 = p062dh.C1473i.m3996H(r0)     // Catch: java.lang.Throwable -> L275
                md.b r0 = (md.C4539b) r0     // Catch: java.lang.Throwable -> L275
                if (r0 == 0) goto L3f5
                java.lang.String r0 = r0.getSuggested_median()     // Catch: java.lang.Throwable -> L275
                if (r0 == 0) goto L3f5
                java.lang.Double r0 = p362uh.C6462h.m13048E(r0)     // Catch: java.lang.Throwable -> L275
                if (r0 == 0) goto L3f5
                double r4 = r0.doubleValue()     // Catch: java.lang.Throwable -> L275
                goto L3f7
            L3f5:
                r4 = 0
            L3f7:
                r0 = 100000000(0x5f5e100, float:2.3122341E-35)
                double r6 = (double) r0     // Catch: java.lang.Throwable -> L275
                double r4 = r4 / r6
                p101fh.C2174f.m5718h(r3)     // Catch: java.lang.Throwable -> L275
                androidx.lifecycle.d0<sd.d$b> r0 = r10.f23277r     // Catch: java.lang.Throwable -> L275
                r21 = 1
                sd.d$b r3 = new sd.d$b     // Catch: java.lang.Throwable -> L275
                io.tacocrypto.app.ui.secret.c r6 = io.tacocrypto.app.p156ui.secret.EnumC3251c.f14333Z     // Catch: java.lang.Throwable -> L275
                java.lang.String r24 = r6.m7731e()     // Catch: java.lang.Throwable -> L275
                java.lang.String r22 = "WAX"
                java.lang.String r23 = "NFT est. value"
                r25 = 0
                r26 = 0
                r27 = 48
                r20 = r3
                r20.<init>(r21, r22, r23, r24, r25, r26, r27)     // Catch: java.lang.Throwable -> L275
                java.lang.Double r6 = new java.lang.Double     // Catch: java.lang.Throwable -> L275
                r6.<init>(r4)     // Catch: java.lang.Throwable -> L275
                r3.f23297e = r6     // Catch: java.lang.Throwable -> L275
                nd.q r6 = p238nd.C4770q.f19093a     // Catch: java.lang.Throwable -> L275
                java.util.Objects.requireNonNull(r6, r11)     // Catch: java.lang.Throwable -> L275
                nd.q r6 = p238nd.C4770q.f19093a     // Catch: java.lang.Throwable -> L275
                p214m2.C4339q.m9704i(r6)     // Catch: java.lang.Throwable -> L275
                java.lang.Double r7 = new java.lang.Double     // Catch: java.lang.Throwable -> L275
                r7.<init>(r4)     // Catch: java.lang.Throwable -> L275
                r4 = 6
                r5 = 0
                java.lang.String r4 = p238nd.C4770q.m10831a(r6, r7, r5, r5, r4)     // Catch: java.lang.Throwable -> L275
                r3.f23298f = r4     // Catch: java.lang.Throwable -> L275
            L438:
                r0.mo1415j(r3)     // Catch: java.lang.Throwable -> L275
            L43b:
                ch.l r0 = ch.C0985l.f5061a     // Catch: java.lang.Throwable -> L275
                goto L442
            L43e:
                java.lang.Object r0 = p074e9.C1805a.m4520e(r0)
            L442:
                sd.d r3 = r1.f23310j0
                boolean r4 = r0 instanceof ch.C0979f.a
                r5 = 1
                r4 = r4 ^ r5
                if (r4 == 0) goto L46d
                r4 = r0
                ch.l r4 = (ch.C0985l) r4
                vh.z r4 = p379vh.C6716l0.f26007a
                vh.k1 r4 = p459zh.C7346l.f28106a
                sd.d$g$e r5 = new sd.d$g$e
                r6 = 0
                r5.<init>(r3, r6)
                r1.f23309i0 = r0
                r1.f23303c0 = r6
                r1.f23304d0 = r6
                r1.f23305e0 = r6
                r1.f23306f0 = r6
                r1.f23307g0 = r6
                r3 = 7
                r1.f23308h0 = r3
                java.lang.Object r3 = p101fh.C2174f.m5710A(r4, r5, r1)
                if (r3 != r2) goto L46d
                return r2
            L46d:
                sd.d r3 = r1.f23310j0
                java.lang.Throwable r4 = ch.C0979f.m2690b(r0)
                if (r4 == 0) goto L496
                vh.z r5 = p379vh.C6716l0.f26007a
                vh.k1 r5 = p459zh.C7346l.f28106a
                sd.d$g$f r6 = new sd.d$g$f
                r7 = 0
                r6.<init>(r3, r4, r7)
                r1.f23309i0 = r0
                r1.f23303c0 = r7
                r1.f23304d0 = r7
                r1.f23305e0 = r7
                r1.f23306f0 = r7
                r1.f23307g0 = r7
                r0 = 8
                r1.f23308h0 = r0
                java.lang.Object r0 = p101fh.C2174f.m5710A(r5, r6, r1)
                if (r0 != r2) goto L496
                return r2
            L496:
                ch.l r0 = ch.C0985l.f5061a
                return r0
        }
    }

    /* renamed from: sd.d$h */
    public static final class h<T> implements java.util.Comparator {
        public h() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // java.util.Comparator
        public final int compare(T r3, T r4) {
                r2 = this;
                sd.d$a r3 = (sd.C6034d.a) r3
                od.b0 r3 = r3.f23286a
                double r0 = r3.getAmount()
                java.lang.Double r3 = java.lang.Double.valueOf(r0)
                sd.d$a r4 = (sd.C6034d.a) r4
                od.b0 r4 = r4.f23286a
                double r0 = r4.getAmount()
                java.lang.Double r4 = java.lang.Double.valueOf(r0)
                int r3 = p079eh.C1850a.m4597b(r3, r4)
                return r3
        }
    }

    /* renamed from: sd.d$i */
    public static final class i<T> implements java.util.Comparator {
        public i() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // java.util.Comparator
        public final int compare(T r1, T r2) {
                r0 = this;
                sd.d$a r1 = (sd.C6034d.a) r1
                java.lang.Double r1 = r1.f23287b
                sd.d$a r2 = (sd.C6034d.a) r2
                java.lang.Double r2 = r2.f23287b
                int r1 = p079eh.C1850a.m4597b(r1, r2)
                return r1
        }
    }

    /* renamed from: sd.d$j */
    public static final class j<T> implements java.util.Comparator {
        public j() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // java.util.Comparator
        public final int compare(T r1, T r2) {
                r0 = this;
                sd.d$a r1 = (sd.C6034d.a) r1
                od.b0 r1 = r1.f23286a
                java.lang.String r1 = r1.getContract()
                sd.d$a r2 = (sd.C6034d.a) r2
                od.b0 r2 = r2.f23286a
                java.lang.String r2 = r2.getContract()
                int r1 = p079eh.C1850a.m4597b(r1, r2)
                return r1
        }
    }

    /* renamed from: sd.d$k */
    public static final class k<T> implements java.util.Comparator {
        public k() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // java.util.Comparator
        public final int compare(T r1, T r2) {
                r0 = this;
                sd.d$a r1 = (sd.C6034d.a) r1
                od.b0 r1 = r1.f23286a
                java.lang.String r1 = r1.getCurrency()
                sd.d$a r2 = (sd.C6034d.a) r2
                od.b0 r2 = r2.f23286a
                java.lang.String r2 = r2.getCurrency()
                int r1 = p079eh.C1850a.m4597b(r1, r2)
                return r1
        }
    }

    /* renamed from: sd.d$l */
    public static final class l<T> implements java.util.Comparator {
        public l() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // java.util.Comparator
        public final int compare(T r3, T r4) {
                r2 = this;
                sd.d$a r4 = (sd.C6034d.a) r4
                od.b0 r4 = r4.f23286a
                double r0 = r4.getAmount()
                java.lang.Double r4 = java.lang.Double.valueOf(r0)
                sd.d$a r3 = (sd.C6034d.a) r3
                od.b0 r3 = r3.f23286a
                double r0 = r3.getAmount()
                java.lang.Double r3 = java.lang.Double.valueOf(r0)
                int r3 = p079eh.C1850a.m4597b(r4, r3)
                return r3
        }
    }

    /* renamed from: sd.d$m */
    public static final class m<T> implements java.util.Comparator {
        public m() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // java.util.Comparator
        public final int compare(T r1, T r2) {
                r0 = this;
                sd.d$a r2 = (sd.C6034d.a) r2
                java.lang.Double r2 = r2.f23287b
                sd.d$a r1 = (sd.C6034d.a) r1
                java.lang.Double r1 = r1.f23287b
                int r1 = p079eh.C1850a.m4597b(r2, r1)
                return r1
        }
    }

    /* renamed from: sd.d$n */
    public static final class n extends p239nh.AbstractC4830j implements mh.InterfaceC4624p<sd.C6034d.b, ch.C0978e<? extends id.C3131b, ? extends java.lang.Boolean>, sd.C6034d.b> {

        /* renamed from: Z */
        public static final sd.C6034d.n f23325Z = null;

        static {
                sd.d$n r0 = new sd.d$n
                r0.<init>()
                sd.C6034d.n.f23325Z = r0
                return
        }

        public n() {
                r1 = this;
                r0 = 2
                r1.<init>(r0)
                return
        }

        @Override // mh.InterfaceC4624p
        /* renamed from: l */
        public sd.C6034d.b mo122l(sd.C6034d.b r2, ch.C0978e<? extends id.C3131b, ? extends java.lang.Boolean> r3) {
                r1 = this;
                sd.d$b r2 = (sd.C6034d.b) r2
                ch.e r3 = (ch.C0978e) r3
                r0 = 0
                if (r2 == 0) goto L16
                if (r3 == 0) goto Le
                A r3 = r3.f5050Y
                r0 = r3
                id.b r0 = (id.C3131b) r0
            Le:
                if (r0 == 0) goto L12
                r3 = 1
                goto L13
            L12:
                r3 = 0
            L13:
                r2.f23293a = r3
                goto L17
            L16:
                r2 = r0
            L17:
                return r2
        }
    }

    /* renamed from: sd.d$o */
    public static final class o extends p239nh.AbstractC4830j implements mh.InterfaceC4624p<java.lang.Double, io.tacocrypto.app.p156ui.balance.EnumC3217g, java.lang.String> {

        /* renamed from: Z */
        public static final sd.C6034d.o f23326Z = null;

        static {
                sd.d$o r0 = new sd.d$o
                r0.<init>()
                sd.C6034d.o.f23326Z = r0
                return
        }

        public o() {
                r1 = this;
                r0 = 2
                r1.<init>(r0)
                return
        }

        @Override // mh.InterfaceC4624p
        /* renamed from: l */
        public java.lang.String mo122l(java.lang.Double r3, io.tacocrypto.app.p156ui.balance.EnumC3217g r4) {
                r2 = this;
                java.lang.Double r3 = (java.lang.Double) r3
                io.tacocrypto.app.ui.balance.g r4 = (io.tacocrypto.app.p156ui.balance.EnumC3217g) r4
                if (r3 == 0) goto L25
                if (r4 != 0) goto L9
                goto L25
            L9:
                io.tacocrypto.app.ui.balance.g r0 = io.tacocrypto.app.p156ui.balance.EnumC3217g.f14284Y
                if (r4 != r0) goto L12
                java.lang.String r3 = vg.C6672m.m13536w(r3)
                goto L27
            L12:
                nd.q r4 = p238nd.C4770q.f19093a
                java.lang.String r0 = "Please for CurrencyManager us initialize() before getting the instance."
                java.util.Objects.requireNonNull(r4, r0)
                nd.q r4 = p238nd.C4770q.f19093a
                p214m2.C4339q.m9704i(r4)
                r0 = 6
                r1 = 0
                java.lang.String r3 = p238nd.C4770q.m10831a(r4, r3, r1, r1, r0)
                goto L27
            L25:
                java.lang.String r3 = "---"
            L27:
                return r3
        }
    }

    public C6034d(android.app.Application r8, p238nd.C4728b0 r9, p238nd.C4753j1 r10) {
            r7 = this;
            java.lang.String r0 = "app"
            p214m2.C4339q.m9706k(r8, r0)
            java.lang.String r0 = "eosManager"
            p214m2.C4339q.m9706k(r9, r0)
            java.lang.String r0 = "preferenceStorage"
            p214m2.C4339q.m9706k(r10, r0)
            r7.<init>()
            r7.f23262c = r8
            r7.f23263d = r9
            r7.f23264e = r10
            sd.d$f r8 = new sd.d$f
            r8.<init>(r7)
            ch.d r8 = p185k7.C4038x4.m9096i(r8)
            r7.f23265f = r8
            sd.d$d r8 = new sd.d$d
            r8.<init>(r7)
            ch.d r8 = p185k7.C4038x4.m9096i(r8)
            r7.f23266g = r8
            ch.g r8 = (ch.C0980g) r8
            java.lang.Object r8 = r8.getValue()
            nd.c r8 = (p238nd.C4730c) r8
            androidx.lifecycle.d0<vg.b<ch.l>> r8 = r8.f18969g
            r7.f23267h = r8
            androidx.lifecycle.d0 r8 = new androidx.lifecycle.d0
            r8.<init>()
            r7.f23268i = r8
            r7.f23269j = r8
            androidx.lifecycle.LiveData<ch.e<id.b, java.lang.Boolean>> r8 = r9.f18903B
            r7.f23270k = r8
            androidx.lifecycle.d0 r8 = new androidx.lifecycle.d0
            java.lang.String r0 = "--"
            r8.<init>(r0)
            r7.f23271l = r8
            r7.f23272m = r8
            androidx.lifecycle.d0 r8 = new androidx.lifecycle.d0
            r8.<init>()
            r7.f23275p = r8
            androidx.lifecycle.LiveData<ch.e<id.b, java.lang.Boolean>> r0 = r9.f18903B
            sd.d$n r1 = sd.C6034d.n.f23325Z
            androidx.lifecycle.LiveData r0 = p185k7.C4038x4.m9090c(r8, r0, r1)
            r7.f23276q = r0
            androidx.lifecycle.d0 r0 = new androidx.lifecycle.d0
            r0.<init>()
            r7.f23277r = r0
            androidx.lifecycle.LiveData<ch.e<id.b, java.lang.Boolean>> r9 = r9.f18903B
            sd.d$e r1 = sd.C6034d.e.f23301Z
            androidx.lifecycle.LiveData r9 = p185k7.C4038x4.m9090c(r0, r9, r1)
            r7.f23278s = r9
            androidx.lifecycle.d0 r9 = new androidx.lifecycle.d0
            io.tacocrypto.app.ui.balance.g r1 = io.tacocrypto.app.p156ui.balance.EnumC3217g.f14284Y
            r9.<init>(r1)
            r7.f23279t = r9
            r7.f23280u = r9
            dh.k r1 = p062dh.C1475k.f7237Y
            r7.f23282w = r1
            androidx.lifecycle.d0 r1 = new androidx.lifecycle.d0
            r1.<init>()
            r7.f23283x = r1
            r7.f23284y = r1
            androidx.lifecycle.d0 r2 = new androidx.lifecycle.d0
            io.tacocrypto.app.ui.balance.f[] r3 = io.tacocrypto.app.p156ui.balance.EnumC3216f.values()
            android.content.SharedPreferences r4 = r10.m10820a()
            java.lang.String r5 = "balanceSortBy"
            r6 = -1
            int r4 = r4.getInt(r5, r6)
            if (r4 < 0) goto La8
            int r5 = p062dh.C1468d.m3987I(r3)
            if (r4 > r5) goto La8
            r3 = r3[r4]
            goto Laa
        La8:
            io.tacocrypto.app.ui.balance.f r3 = io.tacocrypto.app.p156ui.balance.EnumC3216f.f14280b0
        Laa:
            r2.<init>(r3)
            r7.f23285z = r2
            r7.f23256A = r2
            androidx.lifecycle.d0 r2 = new androidx.lifecycle.d0
            io.tacocrypto.app.ui.balance.d[] r3 = io.tacocrypto.app.p156ui.balance.EnumC3214d.values()
            android.content.SharedPreferences r4 = r10.m10820a()
            java.lang.String r5 = "balanceGraphType"
            int r4 = r4.getInt(r5, r6)
            if (r4 < 0) goto Lcc
            int r5 = p062dh.C1468d.m3987I(r3)
            if (r4 > r5) goto Lcc
            r3 = r3[r4]
            goto Lce
        Lcc:
            io.tacocrypto.app.ui.balance.d r3 = io.tacocrypto.app.p156ui.balance.EnumC3214d.f14269Y
        Lce:
            r2.<init>(r3)
            r7.f23257B = r2
            r7.f23258C = r2
            androidx.lifecycle.d0 r2 = new androidx.lifecycle.d0
            io.tacocrypto.app.ui.balance.e[] r3 = io.tacocrypto.app.p156ui.balance.EnumC3215e.values()
            android.content.SharedPreferences r10 = r10.m10820a()
            java.lang.String r4 = "balanceHide"
            int r10 = r10.getInt(r4, r6)
            if (r10 < 0) goto Lf0
            int r4 = p062dh.C1468d.m3987I(r3)
            if (r10 > r4) goto Lf0
            r10 = r3[r10]
            goto Lf2
        Lf0:
            io.tacocrypto.app.ui.balance.e r10 = io.tacocrypto.app.p156ui.balance.EnumC3215e.f14273Y
        Lf2:
            r2.<init>(r10)
            r7.f23259D = r2
            r7.f23260E = r2
            androidx.room.a r10 = androidx.room.C0618a.f3669s0
            androidx.lifecycle.LiveData r10 = androidx.lifecycle.C0455m0.m1450a(r1, r10)
            sd.d$c r1 = new sd.d$c
            r1.<init>(r7)
            androidx.lifecycle.LiveData r8 = p185k7.C4038x4.m9088a(r10, r8, r0, r1)
            sd.d$o r10 = sd.C6034d.o.f23326Z
            androidx.lifecycle.LiveData r8 = p185k7.C4038x4.m9090c(r8, r9, r10)
            r7.f23261F = r8
            return
    }

    /* renamed from: d */
    public static final java.lang.Object m12513d(sd.C6034d r4, java.lang.String r5, java.lang.String r6, p101fh.InterfaceC2172d r7) {
            fh.j r0 = new fh.j
            fh.d r7 = gh.C2390b.m6127q(r7)
            r0.<init>(r7)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            nd.v0 r1 = p238nd.C4781v0.f19121e
            java.lang.String r2 = "Please for EndpointManager us initialize() before getting the instance."
            java.util.Objects.requireNonNull(r1, r2)
            java.lang.String r1 = r1.f19124c
            java.lang.String r2 = "/v1/chain/get_account"
            java.lang.String r7 = p346u.C6269n.m12888a(r7, r1, r2)
            java.lang.String r1 = "{\"account_name\": \""
            java.lang.String r2 = "\"}"
            java.lang.String r5 = android.support.v4.media.C0145d.m257a(r1, r5, r2)
            sd.g r1 = new sd.g
            r1.<init>(r0)
            sd.h r2 = new sd.h
            r2.<init>(r0)
            sd.e r3 = new sd.e
            r3.<init>(r7, r5, r1, r2)
            r3.f10153l0 = r6
            ch.d r4 = r4.f23265f
            java.lang.Object r4 = r4.getValue()
            g2.o r4 = (p105g2.C2221o) r4
            r4.m5814a(r3)
            java.lang.Object r4 = r0.m5741a()
            return r4
    }

    /* renamed from: e */
    public static final java.lang.Object m12514e(sd.C6034d r4, java.lang.String r5, java.lang.String r6, p101fh.InterfaceC2172d r7) {
            fh.j r0 = new fh.j
            fh.d r7 = gh.C2390b.m6127q(r7)
            r0.<init>(r7)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            nd.v0 r1 = p238nd.C4781v0.f19121e
            java.lang.String r2 = "Please for EndpointManager us initialize() before getting the instance."
            java.util.Objects.requireNonNull(r1, r2)
            java.lang.String r1 = r1.m10838b()
            r7.append(r1)
            java.lang.String r1 = "/v1/prices/assets"
            r7.append(r1)
            java.lang.String r7 = r7.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "\n            {\n              \"owner\": \""
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = "\"\n            }"
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            java.lang.String r5 = p362uh.C6459e.m13046C(r5)
            sd.k r1 = new sd.k
            r1.<init>(r0)
            sd.l r2 = new sd.l
            r2.<init>(r0)
            sd.i r3 = new sd.i
            r3.<init>(r7, r5, r1, r2)
            r3.f10153l0 = r6
            ch.d r4 = r4.f23265f
            java.lang.Object r4 = r4.getValue()
            g2.o r4 = (p105g2.C2221o) r4
            r4.m5814a(r3)
            java.lang.Object r4 = r0.m5741a()
            return r4
    }

    @Override // androidx.lifecycle.AbstractC0457n0
    /* renamed from: b */
    public void mo8b() {
            r1 = this;
            ch.d r0 = r1.f23266g
            java.lang.Object r0 = r0.getValue()
            nd.c r0 = (p238nd.C4730c) r0
            r0.m10814d()
            return
    }

    /* renamed from: f */
    public final void m12515f(java.util.List<sd.C6034d.a> r10) {
            r9 = this;
            r9.f23282w = r10
            androidx.lifecycle.d0<java.util.List<sd.d$a>> r0 = r9.f23283x
            androidx.lifecycle.d0<io.tacocrypto.app.ui.balance.e> r1 = r9.f23259D
            java.lang.Object r1 = r1.m1411d()
            p214m2.C4339q.m9704i(r1)
            io.tacocrypto.app.ui.balance.e r1 = (io.tacocrypto.app.p156ui.balance.EnumC3215e) r1
            int r1 = r1.ordinal()
            if (r1 == 0) goto L74
            r2 = 1
            if (r1 == r2) goto L44
            r3 = 2
            if (r1 != r3) goto L3e
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r10 = r10.iterator()
        L24:
            boolean r3 = r10.hasNext()
            if (r3 == 0) goto L73
            java.lang.Object r3 = r10.next()
            r4 = r3
            sd.d$a r4 = (sd.C6034d.a) r4
            od.b0 r4 = r4.f23286a
            boolean r4 = p255od.C5207i.isSimpleassets(r4)
            r4 = r4 ^ r2
            if (r4 == 0) goto L24
            r1.add(r3)
            goto L24
        L3e:
            e7.y7 r10 = new e7.y7
            r10.<init>(r3)
            throw r10
        L44:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r10 = r10.iterator()
        L4d:
            boolean r3 = r10.hasNext()
            if (r3 == 0) goto L73
            java.lang.Object r3 = r10.next()
            r4 = r3
            sd.d$a r4 = (sd.C6034d.a) r4
            java.lang.Double r4 = r4.f23287b
            r5 = 0
            if (r4 == 0) goto L65
            double r7 = r4.doubleValue()
            goto L66
        L65:
            r7 = r5
        L66:
            int r4 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r4 <= 0) goto L6c
            r4 = 1
            goto L6d
        L6c:
            r4 = 0
        L6d:
            if (r4 == 0) goto L4d
            r1.add(r3)
            goto L4d
        L73:
            r10 = r1
        L74:
            androidx.lifecycle.d0<io.tacocrypto.app.ui.balance.f> r1 = r9.f23285z
            java.lang.Object r1 = r1.m1411d()
            p214m2.C4339q.m9704i(r1)
            io.tacocrypto.app.ui.balance.f r1 = (io.tacocrypto.app.p156ui.balance.EnumC3216f) r1
            java.util.List r10 = r9.m12517h(r10, r1)
            r0.mo1415j(r10)
            return
    }

    /* renamed from: g */
    public final void m12516g() {
            r8 = this;
            androidx.lifecycle.d0<java.lang.Boolean> r0 = r8.f23268i
            java.lang.Object r0 = r0.m1411d()
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            boolean r0 = p214m2.C4339q.m9702c(r0, r1)
            if (r0 == 0) goto Lf
            return
        Lf:
            androidx.lifecycle.d0<java.lang.Boolean> r0 = r8.f23268i
            r0.mo7l(r1)
            vh.b0 r2 = p064e.C1488b.m4037d(r8)
            r3 = 0
            sd.d$g r5 = new sd.d$g
            r0 = 0
            r5.<init>(r8, r0)
            r6 = 3
            r7 = 0
            r4 = 0
            vh.f0 r0 = p101fh.C2174f.m5714d(r2, r3, r4, r5, r6, r7)
            r8.f23281v = r0
            return
    }

    /* renamed from: h */
    public final java.util.List<sd.C6034d.a> m12517h(java.util.List<sd.C6034d.a> r6, io.tacocrypto.app.p156ui.balance.EnumC3216f r7) {
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r6 = r6.iterator()
            r2 = 0
        Lf:
            boolean r3 = r6.hasNext()
            if (r3 == 0) goto L35
            java.lang.Object r3 = r6.next()
            sd.d$a r3 = (sd.C6034d.a) r3
            od.b0 r4 = r3.f23286a
            boolean r4 = p255od.C5207i.isWAX(r4)
            if (r4 == 0) goto L25
            r2 = r3
            goto Lf
        L25:
            od.b0 r4 = r3.f23286a
            boolean r4 = p255od.C5207i.isSimpleassets(r4)
            if (r4 == 0) goto L31
            r0.add(r3)
            goto Lf
        L31:
            r1.add(r3)
            goto Lf
        L35:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            if (r2 == 0) goto L3f
            r6.add(r2)
        L3f:
            int r7 = r7.ordinal()
            r2 = 1
            if (r7 == 0) goto L91
            if (r7 == r2) goto L85
            r3 = 2
            if (r7 == r3) goto L79
            r3 = 3
            if (r7 == r3) goto L6d
            r3 = 4
            if (r7 == r3) goto L61
            r3 = 5
            if (r7 == r3) goto L55
            goto L9f
        L55:
            int r7 = r1.size()
            if (r7 <= r2) goto L9f
            sd.d$k r7 = new sd.d$k
            r7.<init>()
            goto L9c
        L61:
            int r7 = r1.size()
            if (r7 <= r2) goto L9f
            sd.d$j r7 = new sd.d$j
            r7.<init>()
            goto L9c
        L6d:
            int r7 = r1.size()
            if (r7 <= r2) goto L9f
            sd.d$m r7 = new sd.d$m
            r7.<init>()
            goto L9c
        L79:
            int r7 = r1.size()
            if (r7 <= r2) goto L9f
            sd.d$i r7 = new sd.d$i
            r7.<init>()
            goto L9c
        L85:
            int r7 = r1.size()
            if (r7 <= r2) goto L9f
            sd.d$l r7 = new sd.d$l
            r7.<init>()
            goto L9c
        L91:
            int r7 = r1.size()
            if (r7 <= r2) goto L9f
            sd.d$h r7 = new sd.d$h
            r7.<init>()
        L9c:
            p062dh.C1470f.m3993E(r1, r7)
        L9f:
            r6.addAll(r1)
            r6.addAll(r0)
            return r6
    }
}
