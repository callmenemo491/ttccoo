package de;

/* renamed from: de.l */
/* loaded from: classes.dex */
public final class C1442l extends androidx.lifecycle.AbstractC0457n0 {

    /* renamed from: c */
    public final p238nd.C4728b0 f7134c;

    /* renamed from: d */
    public final p238nd.C4753j1 f7135d;

    /* renamed from: e */
    public final p238nd.C4756k1 f7136e;

    /* renamed from: f */
    public final androidx.lifecycle.LiveData<ch.C0978e<id.C3131b, java.lang.Boolean>> f7137f;

    /* renamed from: g */
    public final androidx.lifecycle.C0437d0<vg.C6661b<p013ah.C0100a>> f7138g;

    /* renamed from: h */
    public final androidx.lifecycle.C0437d0<java.lang.Boolean> f7139h;

    /* renamed from: i */
    public final androidx.lifecycle.LiveData<java.lang.Boolean> f7140i;

    /* renamed from: j */
    public final androidx.lifecycle.C0437d0<vg.C6661b<io.tacocrypto.app.p156ui.secret.EnumC3251c>> f7141j;

    /* renamed from: k */
    public final androidx.lifecycle.C0437d0<vg.C6661b<java.lang.Boolean>> f7142k;

    /* renamed from: l */
    public final androidx.lifecycle.C0437d0<vg.C6661b<de.C1444n>> f7143l;

    /* renamed from: m */
    public final androidx.lifecycle.C0437d0<vg.C6661b<de.C1444n>> f7144m;

    /* renamed from: n */
    public final androidx.lifecycle.C0437d0<vg.C6661b<de.C1444n>> f7145n;

    /* renamed from: o */
    public final java.util.List<io.tacocrypto.app.p156ui.secret.EnumC3251c> f7146o;

    /* renamed from: p */
    public java.util.Set<? extends io.tacocrypto.app.p156ui.secret.EnumC3251c> f7147p;

    /* renamed from: q */
    public java.util.List<? extends io.tacocrypto.app.p156ui.secret.EnumC3251c> f7148q;

    /* renamed from: r */
    public java.util.List<de.C1444n> f7149r;

    /* renamed from: s */
    public java.util.List<de.C1444n> f7150s;

    /* renamed from: t */
    public java.util.List<de.C1444n> f7151t;

    /* renamed from: u */
    public final androidx.lifecycle.C0437d0<java.lang.Integer> f7152u;

    /* renamed from: v */
    public final androidx.lifecycle.C0437d0<java.util.List<de.C1444n>> f7153v;

    /* renamed from: w */
    public final androidx.lifecycle.LiveData<java.lang.Boolean> f7154w;

    @p134hh.InterfaceC3044e(m7451c = "io.tacocrypto.app.ui.secret.SecretViewModel$refresh$1", m7452f = "SecretViewModel.kt", m7453l = {144}, m7454m = "invokeSuspend")
    /* renamed from: de.l$a */
    public static final class a extends p134hh.AbstractC3048i implements mh.InterfaceC4624p<p379vh.InterfaceC6686b0, p101fh.InterfaceC2172d<? super ch.C0985l>, java.lang.Object> {

        /* renamed from: c0 */
        public int f7155c0;

        /* renamed from: d0 */
        public /* synthetic */ java.lang.Object f7156d0;

        /* renamed from: e0 */
        public final /* synthetic */ de.C1442l f7157e0;

        /* renamed from: f0 */
        public final /* synthetic */ java.util.List<md.C4580t0> f7158f0;

        /* renamed from: g0 */
        public final /* synthetic */ java.util.List<id.C3131b> f7159g0;

        public a(de.C1442l r1, java.util.List<md.C4580t0> r2, java.util.List<id.C3131b> r3, p101fh.InterfaceC2172d<? super de.C1442l.a> r4) {
                r0 = this;
                r0.f7157e0 = r1
                r0.f7158f0 = r2
                r0.f7159g0 = r3
                r1 = 2
                r0.<init>(r1, r4)
                return
        }

        @Override // p134hh.AbstractC3040a
        /* renamed from: h */
        public final p101fh.InterfaceC2172d<ch.C0985l> mo121h(java.lang.Object r5, p101fh.InterfaceC2172d<?> r6) {
                r4 = this;
                de.l$a r0 = new de.l$a
                de.l r1 = r4.f7157e0
                java.util.List<md.t0> r2 = r4.f7158f0
                java.util.List<id.b> r3 = r4.f7159g0
                r0.<init>(r1, r2, r3, r6)
                r0.f7156d0 = r5
                return r0
        }

        @Override // mh.InterfaceC4624p
        /* renamed from: l */
        public java.lang.Object mo122l(p379vh.InterfaceC6686b0 r5, p101fh.InterfaceC2172d<? super ch.C0985l> r6) {
                r4 = this;
                vh.b0 r5 = (p379vh.InterfaceC6686b0) r5
                fh.d r6 = (p101fh.InterfaceC2172d) r6
                de.l$a r0 = new de.l$a
                de.l r1 = r4.f7157e0
                java.util.List<md.t0> r2 = r4.f7158f0
                java.util.List<id.b> r3 = r4.f7159g0
                r0.<init>(r1, r2, r3, r6)
                r0.f7156d0 = r5
                ch.l r5 = ch.C0985l.f5061a
                java.lang.Object r5 = r0.mo123o(r5)
                return r5
        }

        @Override // p134hh.AbstractC3040a
        /* renamed from: o */
        public final java.lang.Object mo123o(java.lang.Object r8) {
                r7 = this;
                gh.a r0 = gh.EnumC2389a.f10764Y
                int r1 = r7.f7155c0
                r2 = 10
                r3 = 1
                if (r1 == 0) goto L17
                if (r1 != r3) goto Lf
                p074e9.C1805a.m4540y(r8)     // Catch: java.lang.Throwable -> L4f
                goto L4c
            Lf:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L17:
                p074e9.C1805a.m4540y(r8)
                java.lang.Object r8 = r7.f7156d0
                vh.b0 r8 = (p379vh.InterfaceC6686b0) r8
                de.l r8 = r7.f7157e0
                java.util.List<id.b> r1 = r7.f7159g0
                nd.k1 r8 = r8.f7136e     // Catch: java.lang.Throwable -> L4f
                java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L4f
                int r5 = p062dh.C1469e.m3992D(r1, r2)     // Catch: java.lang.Throwable -> L4f
                r4.<init>(r5)     // Catch: java.lang.Throwable -> L4f
                java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L4f
            L31:
                boolean r5 = r1.hasNext()     // Catch: java.lang.Throwable -> L4f
                if (r5 == 0) goto L43
                java.lang.Object r5 = r1.next()     // Catch: java.lang.Throwable -> L4f
                id.b r5 = (id.C3131b) r5     // Catch: java.lang.Throwable -> L4f
                java.lang.String r5 = r5.f12559a     // Catch: java.lang.Throwable -> L4f
                r4.add(r5)     // Catch: java.lang.Throwable -> L4f
                goto L31
            L43:
                r7.f7155c0 = r3     // Catch: java.lang.Throwable -> L4f
                java.lang.Object r8 = r8.m10829b(r4, r7)     // Catch: java.lang.Throwable -> L4f
                if (r8 != r0) goto L4c
                return r0
            L4c:
                java.util.Set r8 = (java.util.Set) r8     // Catch: java.lang.Throwable -> L4f
                goto L54
            L4f:
                r8 = move-exception
                java.lang.Object r8 = p074e9.C1805a.m4520e(r8)
            L54:
                de.l r0 = r7.f7157e0
                nd.k1 r0 = r0.f7136e
                java.util.Set<? extends io.tacocrypto.app.ui.secret.c> r0 = r0.f19062e
                boolean r1 = r8 instanceof ch.C0979f.a
                if (r1 == 0) goto L5f
                r8 = r0
            L5f:
                java.util.Set r8 = (java.util.Set) r8
                io.tacocrypto.app.ui.secret.c$a r0 = io.tacocrypto.app.p156ui.secret.EnumC3251c.f14332Y
                de.l r1 = r7.f7157e0
                java.util.List<io.tacocrypto.app.ui.secret.c> r1 = r1.f7146o
                java.util.List<md.t0> r4 = r7.f7158f0
                java.util.List r8 = r0.m7736a(r1, r4, r8)
                de.l r0 = r7.f7157e0
                java.util.List<? extends io.tacocrypto.app.ui.secret.c> r0 = r0.f7148q
                java.lang.String r1 = "toolsSorted"
                p214m2.C4339q.m9706k(r0, r1)
                de.m r1 = new de.m
                r1.<init>(r0)
                java.util.List r8 = p062dh.C1473i.m4004P(r8, r1)
                java.util.ArrayList r0 = new java.util.ArrayList
                int r1 = p062dh.C1469e.m3992D(r8, r2)
                r0.<init>(r1)
                java.util.Iterator r8 = r8.iterator()
            L8c:
                boolean r1 = r8.hasNext()
                if (r1 == 0) goto Lad
                java.lang.Object r1 = r8.next()
                ch.h r1 = (ch.C0981h) r1
                de.n r2 = new de.n
                A r4 = r1.f5057Y
                io.tacocrypto.app.ui.secret.c r4 = (io.tacocrypto.app.p156ui.secret.EnumC3251c) r4
                B r5 = r1.f5058Z
                io.tacocrypto.app.ui.secret.b r5 = (io.tacocrypto.app.p156ui.secret.EnumC3250b) r5
                C r1 = r1.f5059a0
                md.t0 r1 = (md.C4580t0) r1
                r2.<init>(r4, r5, r1)
                r0.add(r2)
                goto L8c
            Lad:
                de.l r8 = r7.f7157e0
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                java.util.Iterator r2 = r0.iterator()
            Lb8:
                boolean r4 = r2.hasNext()
                if (r4 == 0) goto Ld3
                java.lang.Object r4 = r2.next()
                r5 = r4
                de.n r5 = (de.C1444n) r5
                java.util.Set<? extends io.tacocrypto.app.ui.secret.c> r6 = r8.f7147p
                io.tacocrypto.app.ui.secret.c r5 = r5.f7163a
                boolean r5 = r6.contains(r5)
                if (r5 == 0) goto Lb8
                r1.add(r4)
                goto Lb8
            Ld3:
                r8.f7149r = r1
                de.l r8 = r7.f7157e0
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                java.util.Iterator r2 = r0.iterator()
            Le0:
                boolean r4 = r2.hasNext()
                if (r4 == 0) goto Lfa
                java.lang.Object r4 = r2.next()
                r5 = r4
                de.n r5 = (de.C1444n) r5
                io.tacocrypto.app.ui.secret.c r5 = r5.f7163a
                boolean r5 = r5.m7735l()
                r5 = r5 ^ r3
                if (r5 == 0) goto Le0
                r1.add(r4)
                goto Le0
            Lfa:
                r8.f7150s = r1
                de.l r8 = r7.f7157e0
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                java.util.Iterator r0 = r0.iterator()
            L107:
                boolean r2 = r0.hasNext()
                if (r2 == 0) goto L120
                java.lang.Object r2 = r0.next()
                r3 = r2
                de.n r3 = (de.C1444n) r3
                io.tacocrypto.app.ui.secret.c r3 = r3.f7163a
                boolean r3 = r3.m7735l()
                if (r3 == 0) goto L107
                r1.add(r2)
                goto L107
            L120:
                r8.f7151t = r1
                de.l r8 = r7.f7157e0
                androidx.lifecycle.d0<java.lang.Integer> r0 = r8.f7152u
                java.lang.Object r0 = r0.m1411d()
                java.lang.Integer r0 = (java.lang.Integer) r0
                if (r0 != 0) goto L135
                r0 = 0
                java.lang.Integer r1 = new java.lang.Integer
                r1.<init>(r0)
                r0 = r1
            L135:
                int r0 = r0.intValue()
                r8.m3973d(r0)
                de.l r8 = r7.f7157e0
                androidx.lifecycle.d0<java.lang.Boolean> r8 = r8.f7139h
                java.lang.Boolean r0 = java.lang.Boolean.FALSE
                r8.mo7l(r0)
                ch.l r8 = ch.C0985l.f5061a
                return r8
        }
    }

    /* renamed from: de.l$b */
    public static final class b extends p239nh.AbstractC4830j implements mh.InterfaceC4624p<java.lang.Integer, java.util.List<? extends de.C1444n>, java.lang.Boolean> {

        /* renamed from: Z */
        public static final de.C1442l.b f7160Z = null;

        static {
                de.l$b r0 = new de.l$b
                r0.<init>()
                de.C1442l.b.f7160Z = r0
                return
        }

        public b() {
                r1 = this;
                r0 = 2
                r1.<init>(r0)
                return
        }

        @Override // mh.InterfaceC4624p
        /* renamed from: l */
        public java.lang.Boolean mo122l(java.lang.Integer r1, java.util.List<? extends de.C1444n> r2) {
                r0 = this;
                java.lang.Integer r1 = (java.lang.Integer) r1
                java.util.List r2 = (java.util.List) r2
                if (r1 == 0) goto L1d
                if (r2 != 0) goto L9
                goto L1d
            L9:
                int r1 = r1.intValue()
                if (r1 != 0) goto L17
                boolean r1 = r2.isEmpty()
                if (r1 == 0) goto L17
                r1 = 1
                goto L18
            L17:
                r1 = 0
            L18:
                java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
                goto L1f
            L1d:
                java.lang.Boolean r1 = java.lang.Boolean.FALSE
            L1f:
                return r1
        }
    }

    public C1442l(android.app.Application r2, p238nd.C4728b0 r3, p238nd.C4753j1 r4, p238nd.C4756k1 r5) {
            r1 = this;
            java.lang.String r0 = "app"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r2 = "eosManager"
            p214m2.C4339q.m9706k(r3, r2)
            java.lang.String r2 = "preferenceStorage"
            p214m2.C4339q.m9706k(r4, r2)
            java.lang.String r2 = "secretToolManager"
            p214m2.C4339q.m9706k(r5, r2)
            r1.<init>()
            r1.f7134c = r3
            r1.f7135d = r4
            r1.f7136e = r5
            androidx.lifecycle.LiveData<ch.e<id.b, java.lang.Boolean>> r2 = r3.f18903B
            r1.f7137f = r2
            androidx.lifecycle.d0 r2 = new androidx.lifecycle.d0
            r2.<init>()
            r1.f7138g = r2
            androidx.lifecycle.d0 r2 = new androidx.lifecycle.d0
            r2.<init>()
            r1.f7139h = r2
            r1.f7140i = r2
            androidx.lifecycle.d0 r2 = new androidx.lifecycle.d0
            r2.<init>()
            r1.f7141j = r2
            androidx.lifecycle.d0 r2 = new androidx.lifecycle.d0
            r2.<init>()
            r1.f7142k = r2
            androidx.lifecycle.d0 r2 = new androidx.lifecycle.d0
            r2.<init>()
            r1.f7143l = r2
            androidx.lifecycle.d0 r2 = new androidx.lifecycle.d0
            r2.<init>()
            r1.f7144m = r2
            androidx.lifecycle.d0 r2 = new androidx.lifecycle.d0
            r2.<init>()
            r1.f7145n = r2
            io.tacocrypto.app.ui.secret.c[] r2 = io.tacocrypto.app.p156ui.secret.EnumC3251c.values()
            java.util.List r2 = p062dh.C1468d.m3991M(r2)
            r1.f7146o = r2
            java.util.Set r2 = r4.m10824e()
            r1.f7147p = r2
            java.util.List r2 = r4.m10825f()
            r1.f7148q = r2
            dh.k r2 = p062dh.C1475k.f7237Y
            r1.f7149r = r2
            r1.f7150s = r2
            r1.f7151t = r2
            androidx.lifecycle.d0 r2 = new androidx.lifecycle.d0
            r3 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2.<init>(r3)
            r1.f7152u = r2
            androidx.lifecycle.d0 r3 = new androidx.lifecycle.d0
            r3.<init>()
            r1.f7153v = r3
            de.l$b r4 = de.C1442l.b.f7160Z
            androidx.lifecycle.LiveData r2 = p185k7.C4038x4.m9090c(r2, r3, r4)
            r1.f7154w = r2
            return
    }

    /* renamed from: d */
    public final void m3973d(int r3) {
            r2 = this;
            androidx.lifecycle.d0<java.util.List<de.n>> r0 = r2.f7153v
            if (r3 == 0) goto L1c
            r1 = 1
            if (r3 == r1) goto L19
            r1 = 2
            if (r3 != r1) goto Ld
            java.util.List<de.n> r3 = r2.f7151t
            goto L1e
        Ld:
            java.lang.Exception r0 = new java.lang.Exception
            java.lang.String r1 = "position not valid: "
            java.lang.String r3 = android.support.v4.media.C0142a.m254a(r1, r3)
            r0.<init>(r3)
            throw r0
        L19:
            java.util.List<de.n> r3 = r2.f7150s
            goto L1e
        L1c:
            java.util.List<de.n> r3 = r2.f7149r
        L1e:
            r0.mo7l(r3)
            return
    }

    /* renamed from: e */
    public final void m3974e() {
            r8 = this;
            nd.b0 r0 = r8.f7134c
            java.util.List<id.b> r0 = r0.f18927w
            if (r0 == 0) goto Lf
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto Ld
            goto Lf
        Ld:
            r1 = 0
            goto L10
        Lf:
            r1 = 1
        L10:
            if (r1 == 0) goto L13
            return
        L13:
            androidx.lifecycle.d0<java.lang.Boolean> r1 = r8.f7139h
            java.lang.Object r1 = r1.m1411d()
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            boolean r1 = p214m2.C4339q.m9702c(r1, r2)
            if (r1 == 0) goto L22
            return
        L22:
            androidx.lifecycle.d0<java.lang.Boolean> r1 = r8.f7139h
            r1.mo7l(r2)
            o9.d r1 = p251o9.C5180d.m11494c()
            java.lang.Class<gb.l> r2 = gb.C2322l.class
            r1.m11497a()
            y9.i r1 = r1.f20315d
            java.lang.Object r1 = r1.mo14246a(r2)
            gb.l r1 = (gb.C2322l) r1
            gb.c r1 = r1.m6081c()
            java.lang.String r2 = "FirebaseRemoteConfig.getInstance()"
            p214m2.C4339q.m9703h(r1, r2)
            java.lang.String r2 = "tools"
            ha.b r1 = p074e9.C1805a.m4525j(r1, r2)
            java.lang.String r1 = r1.m7366a()
            java.lang.String r2 = "remoteConfig[TOOLS_KEY].asString()"
            p214m2.C4339q.m9705j(r1, r2)
            vg.r r2 = new vg.r
            r2.<init>()
            java.lang.reflect.Type r2 = r2.f21382b
            java.lang.Object r1 = p238nd.C4776t.m10832a(r1, r2)
            java.util.List r1 = (java.util.List) r1
            if (r1 != 0) goto L61
            dh.k r1 = p062dh.C1475k.f7237Y
        L61:
            vh.b0 r2 = p064e.C1488b.m4037d(r8)
            r3 = 0
            de.l$a r5 = new de.l$a
            r4 = 0
            r5.<init>(r8, r1, r0, r4)
            r6 = 3
            r7 = 0
            r4 = 0
            p101fh.C2174f.m5728r(r2, r3, r4, r5, r6, r7)
            return
    }
}
