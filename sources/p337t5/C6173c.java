package p337t5;

/* renamed from: t5.c */
/* loaded from: classes.dex */
public class C6173c {

    /* renamed from: H */
    public static int f23908H;

    /* renamed from: A */
    public int f23909A;

    /* renamed from: B */
    public boolean f23910B;

    /* renamed from: C */
    public int f23911C;

    /* renamed from: D */
    public int f23912D;

    /* renamed from: E */
    public int f23913E;

    /* renamed from: F */
    public boolean f23914F;

    /* renamed from: G */
    public java.lang.String f23915G;

    /* renamed from: a */
    public final android.content.Context f23916a;

    /* renamed from: b */
    public final java.lang.String f23917b;

    /* renamed from: c */
    public final int f23918c;

    /* renamed from: d */
    public final p337t5.C6173c.d f23919d;

    /* renamed from: e */
    public final p337t5.C6173c.f f23920e;

    /* renamed from: f */
    public final p337t5.C6173c.c f23921f;

    /* renamed from: g */
    public final android.os.Handler f23922g;

    /* renamed from: h */
    public final p030c0.C0830q f23923h;

    /* renamed from: i */
    public final android.content.IntentFilter f23924i;

    /* renamed from: j */
    public final p088f4.InterfaceC2054x0.e f23925j;

    /* renamed from: k */
    public final p337t5.C6173c.e f23926k;

    /* renamed from: l */
    public final java.util.Map<java.lang.String, p030c0.C0823j> f23927l;

    /* renamed from: m */
    public final java.util.Map<java.lang.String, p030c0.C0823j> f23928m;

    /* renamed from: n */
    public final android.app.PendingIntent f23929n;

    /* renamed from: o */
    public final int f23930o;

    /* renamed from: p */
    public p030c0.C0826m f23931p;

    /* renamed from: q */
    public java.util.List<p030c0.C0823j> f23932q;

    /* renamed from: r */
    public p088f4.InterfaceC2054x0 f23933r;

    /* renamed from: s */
    public boolean f23934s;

    /* renamed from: t */
    public int f23935t;

    /* renamed from: u */
    public android.support.v4.media.session.MediaSessionCompat.Token f23936u;

    /* renamed from: v */
    public boolean f23937v;

    /* renamed from: w */
    public boolean f23938w;

    /* renamed from: x */
    public boolean f23939x;

    /* renamed from: y */
    public boolean f23940y;

    /* renamed from: z */
    public boolean f23941z;

    /* renamed from: t5.c$a */
    public static /* synthetic */ class a {
    }

    /* renamed from: t5.c$b */
    public final class b {

        /* renamed from: a */
        public final int f23942a;

        /* renamed from: b */
        public final /* synthetic */ p337t5.C6173c f23943b;

        public b(p337t5.C6173c r1, int r2, p337t5.C6173c.a r3) {
                r0 = this;
                r0.f23943b = r1
                r0.<init>()
                r0.f23942a = r2
                return
        }
    }

    /* renamed from: t5.c$c */
    public interface c {
        /* renamed from: a */
        void m12742a(p088f4.InterfaceC2054x0 r1, java.lang.String r2, android.content.Intent r3);

        /* renamed from: b */
        java.util.List<java.lang.String> m12743b(p088f4.InterfaceC2054x0 r1);
    }

    /* renamed from: t5.c$d */
    public interface d {
        /* renamed from: a */
        android.app.PendingIntent mo11925a(p088f4.InterfaceC2054x0 r1);

        /* renamed from: b */
        java.lang.CharSequence mo11926b(p088f4.InterfaceC2054x0 r1);

        /* renamed from: c */
        java.lang.CharSequence mo11927c(p088f4.InterfaceC2054x0 r1);

        /* renamed from: d */
        android.graphics.Bitmap mo11928d(p088f4.InterfaceC2054x0 r1, p337t5.C6173c.b r2);

        /* renamed from: e */
        java.lang.CharSequence mo11929e(p088f4.InterfaceC2054x0 r1);
    }

    /* renamed from: t5.c$e */
    public class e extends android.content.BroadcastReceiver {

        /* renamed from: a */
        public final /* synthetic */ p337t5.C6173c f23944a;

        public e(p337t5.C6173c r1, p337t5.C6173c.a r2) {
                r0 = this;
                r0.f23944a = r1
                r0.<init>()
                return
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(android.content.Context r4, android.content.Intent r5) {
                r3 = this;
                t5.c r4 = r3.f23944a
                f4.x0 r0 = r4.f23933r
                if (r0 == 0) goto Lb1
                boolean r1 = r4.f23934s
                if (r1 == 0) goto Lb1
                int r4 = r4.f23930o
                java.lang.String r1 = "INSTANCE_ID"
                int r4 = r5.getIntExtra(r1, r4)
                t5.c r1 = r3.f23944a
                int r1 = r1.f23930o
                if (r4 == r1) goto L1a
                goto Lb1
            L1a:
                java.lang.String r4 = r5.getAction()
                java.lang.String r1 = "com.google.android.exoplayer.play"
                boolean r1 = r1.equals(r4)
                r2 = 1
                if (r1 == 0) goto L44
                int r4 = r0.mo2850n()
                if (r4 != r2) goto L31
                r0.mo2852o()
                goto L3f
            L31:
                int r4 = r0.mo2850n()
                r5 = 4
                if (r4 != r5) goto L3f
                int r4 = r0.mo2824F()
                r0.mo5233i(r4)
            L3f:
                r0.mo5235p()
                goto Lb1
            L44:
                java.lang.String r1 = "com.google.android.exoplayer.pause"
                boolean r1 = r1.equals(r4)
                if (r1 == 0) goto L50
                r0.mo5234j()
                goto Lb1
            L50:
                java.lang.String r1 = "com.google.android.exoplayer.prev"
                boolean r1 = r1.equals(r4)
                if (r1 == 0) goto L5c
                r0.mo5223V()
                goto Lb1
            L5c:
                java.lang.String r1 = "com.google.android.exoplayer.rewind"
                boolean r1 = r1.equals(r4)
                if (r1 == 0) goto L68
                r0.mo5222U()
                goto Lb1
            L68:
                java.lang.String r1 = "com.google.android.exoplayer.ffwd"
                boolean r1 = r1.equals(r4)
                if (r1 == 0) goto L74
                r0.mo5221T()
                goto Lb1
            L74:
                java.lang.String r1 = "com.google.android.exoplayer.next"
                boolean r1 = r1.equals(r4)
                if (r1 == 0) goto L80
                r0.mo5220S()
                goto Lb1
            L80:
                java.lang.String r1 = "com.google.android.exoplayer.stop"
                boolean r1 = r1.equals(r4)
                if (r1 == 0) goto L8c
                r0.mo2864y(r2)
                goto Lb1
            L8c:
                java.lang.String r1 = "com.google.android.exoplayer.dismiss"
                boolean r1 = r1.equals(r4)
                if (r1 == 0) goto L9a
                t5.c r4 = r3.f23944a
                r4.m12741f(r2)
                goto Lb1
            L9a:
                if (r4 == 0) goto Lb1
                t5.c r1 = r3.f23944a
                t5.c$c r2 = r1.f23921f
                if (r2 == 0) goto Lb1
                java.util.Map<java.lang.String, c0.j> r1 = r1.f23928m
                boolean r1 = r1.containsKey(r4)
                if (r1 == 0) goto Lb1
                t5.c r1 = r3.f23944a
                t5.c$c r1 = r1.f23921f
                r1.m12742a(r0, r4, r5)
            Lb1:
                return
        }
    }

    /* renamed from: t5.c$f */
    public interface f {
        /* renamed from: a */
        void mo11918a(int r1, boolean r2);

        /* renamed from: b */
        void mo11919b(int r1, android.app.Notification r2, boolean r3);
    }

    /* renamed from: t5.c$g */
    public class g implements p088f4.InterfaceC2054x0.e {

        /* renamed from: Y */
        public final /* synthetic */ p337t5.C6173c f23945Y;

        public g(p337t5.C6173c r1, p337t5.C6173c.a r2) {
                r0 = this;
                r0.f23945Y = r1
                r0.<init>()
                return
        }

        @Override // p088f4.InterfaceC2054x0.e
        /* renamed from: F */
        public /* synthetic */ void mo2885F(p121h4.C2461d r1) {
                r0 = this;
                p088f4.C2058z0.m5462a(r0, r1)
                return
        }

        @Override // p088f4.InterfaceC2054x0.e
        /* renamed from: M */
        public /* synthetic */ void mo2886M(p088f4.C2032o r1) {
                r0 = this;
                p088f4.C2058z0.m5465d(r0, r1)
                return
        }

        @Override // p088f4.InterfaceC2054x0.c
        /* renamed from: N */
        public /* synthetic */ void mo2887N(int r1) {
                r0 = this;
                p088f4.C2058z0.m5475n(r0, r1)
                return
        }

        @Override // p088f4.InterfaceC2054x0.c
        /* renamed from: O */
        public /* synthetic */ void mo2888O(boolean r1, int r2) {
                r0 = this;
                p088f4.C2058z0.m5473l(r0, r1, r2)
                return
        }

        @Override // p088f4.InterfaceC2054x0.c
        /* renamed from: Q */
        public /* synthetic */ void mo2889Q(p088f4.InterfaceC2054x0.f r1, p088f4.InterfaceC2054x0.f r2, int r3) {
                r0 = this;
                p088f4.C2058z0.m5479r(r0, r1, r2, r3)
                return
        }

        @Override // p088f4.InterfaceC2054x0.c
        /* renamed from: R */
        public void mo2890R(p088f4.InterfaceC2054x0 r1, p088f4.InterfaceC2054x0.d r2) {
                r0 = this;
                r1 = 9
                int[] r1 = new int[r1]
                r1 = {x0014: FILL_ARRAY_DATA , data: [4, 5, 7, 0, 12, 11, 8, 9, 14} // fill-array
                boolean r1 = r2.m5422a(r1)
                if (r1 == 0) goto L12
                t5.c r1 = r0.f23945Y
                r1.m12737b()
            L12:
                return
        }

        @Override // p088f4.InterfaceC2054x0.c
        /* renamed from: S */
        public /* synthetic */ void mo2891S(p088f4.InterfaceC2054x0.b r1) {
                r0 = this;
                p088f4.C2058z0.m5463b(r0, r1)
                return
        }

        @Override // p088f4.InterfaceC2054x0.c
        /* renamed from: T */
        public /* synthetic */ void mo2892T(p088f4.C2034o1 r1) {
                r0 = this;
                p088f4.C2058z0.m5486y(r0, r1)
                return
        }

        @Override // p088f4.InterfaceC2054x0.c
        /* renamed from: U */
        public /* synthetic */ void mo2893U(p108g5.C2273i0 r1, p325s5.C5970j r2) {
                r0 = this;
                p088f4.C2056y0.m5444u(r0, r1, r2)
                return
        }

        @Override // p088f4.InterfaceC2054x0.c
        /* renamed from: X */
        public /* synthetic */ void mo2894X(boolean r1) {
                r0 = this;
                p088f4.C2058z0.m5482u(r0, r1)
                return
        }

        @Override // p088f4.InterfaceC2054x0.c
        /* renamed from: Y */
        public /* synthetic */ void mo2895Y(p088f4.C2048u0 r1) {
                r0 = this;
                p088f4.C2058z0.m5477p(r0, r1)
                return
        }

        @Override // p088f4.InterfaceC2054x0.e
        /* renamed from: Z */
        public /* synthetic */ void mo2896Z(int r1, int r2) {
                r0 = this;
                p088f4.C2058z0.m5484w(r0, r1, r2)
                return
        }

        @Override // p088f4.InterfaceC2054x0.e
        /* renamed from: a */
        public /* synthetic */ void mo2897a() {
                r0 = this;
                p088f4.C2058z0.m5480s(r0)
                return
        }

        @Override // p088f4.InterfaceC2054x0.c
        /* renamed from: a0 */
        public /* synthetic */ void mo2898a0(p088f4.C2018j0 r1, int r2) {
                r0 = this;
                p088f4.C2058z0.m5470i(r0, r1, r2)
                return
        }

        @Override // p088f4.InterfaceC2054x0.c
        /* renamed from: b */
        public /* synthetic */ void mo2899b() {
                r0 = this;
                p088f4.C2056y0.m5441r(r0)
                return
        }

        @Override // p088f4.InterfaceC2054x0.e
        /* renamed from: c */
        public /* synthetic */ void mo2900c(boolean r1) {
                r0 = this;
                p088f4.C2058z0.m5483v(r0, r1)
                return
        }

        @Override // p088f4.InterfaceC2054x0.e
        /* renamed from: d */
        public /* synthetic */ void mo2901d(java.util.List r1) {
                r0 = this;
                p088f4.C2058z0.m5464c(r0, r1)
                return
        }

        @Override // p088f4.InterfaceC2054x0.e
        /* renamed from: e */
        public /* synthetic */ void mo2902e(p387w5.C6813p r1) {
                r0 = this;
                p088f4.C2058z0.m5487z(r0, r1)
                return
        }

        @Override // p088f4.InterfaceC2054x0.e
        /* renamed from: f */
        public /* synthetic */ void mo2903f(p427y4.C7110a r1) {
                r0 = this;
                p088f4.C2058z0.m5472k(r0, r1)
                return
        }

        @Override // p088f4.InterfaceC2054x0.c
        /* renamed from: f0 */
        public /* synthetic */ void mo2904f0(p088f4.C2052w0 r1) {
                r0 = this;
                p088f4.C2058z0.m5474m(r0, r1)
                return
        }

        @Override // p088f4.InterfaceC2054x0.c
        /* renamed from: g */
        public /* synthetic */ void mo2905g(int r1) {
                r0 = this;
                p088f4.C2058z0.m5476o(r0, r1)
                return
        }

        @Override // p088f4.InterfaceC2054x0.c
        /* renamed from: h */
        public /* synthetic */ void mo2906h(boolean r1, int r2) {
                r0 = this;
                p088f4.C2056y0.m5437n(r0, r1, r2)
                return
        }

        @Override // p088f4.InterfaceC2054x0.e
        /* renamed from: i0 */
        public /* synthetic */ void mo2908i0(int r1, boolean r2) {
                r0 = this;
                p088f4.C2058z0.m5466e(r0, r1, r2)
                return
        }

        @Override // p088f4.InterfaceC2054x0.c
        /* renamed from: j */
        public /* synthetic */ void mo2909j(boolean r1) {
                r0 = this;
                p088f4.C2056y0.m5428e(r0, r1)
                return
        }

        @Override // p088f4.InterfaceC2054x0.c
        /* renamed from: j0 */
        public /* synthetic */ void mo2910j0(boolean r1) {
                r0 = this;
                p088f4.C2058z0.m5469h(r0, r1)
                return
        }

        @Override // p088f4.InterfaceC2054x0.c
        /* renamed from: k */
        public /* synthetic */ void mo2911k(int r1) {
                r0 = this;
                p088f4.C2056y0.m5438o(r0, r1)
                return
        }

        @Override // p088f4.InterfaceC2054x0.c
        /* renamed from: n */
        public /* synthetic */ void mo2912n(p088f4.C2021k0 r1) {
                r0 = this;
                p088f4.C2058z0.m5471j(r0, r1)
                return
        }

        @Override // p088f4.InterfaceC2054x0.c
        /* renamed from: t */
        public /* synthetic */ void mo2913t(p088f4.AbstractC2031n1 r1, int r2) {
                r0 = this;
                p088f4.C2058z0.m5485x(r0, r1, r2)
                return
        }

        @Override // p088f4.InterfaceC2054x0.c
        /* renamed from: u */
        public /* synthetic */ void mo2914u(int r1) {
                r0 = this;
                p088f4.C2058z0.m5481t(r0, r1)
                return
        }

        @Override // p088f4.InterfaceC2054x0.c
        /* renamed from: v */
        public /* synthetic */ void mo2915v(boolean r1) {
                r0 = this;
                p088f4.C2058z0.m5468g(r0, r1)
                return
        }

        @Override // p088f4.InterfaceC2054x0.c
        /* renamed from: y */
        public /* synthetic */ void mo2916y(p088f4.C2048u0 r1) {
                r0 = this;
                p088f4.C2058z0.m5478q(r0, r1)
                return
        }
    }

    public C6173c(android.content.Context r1, java.lang.String r2, int r3, p337t5.C6173c.d r4, p337t5.C6173c.f r5, p337t5.C6173c.c r6, int r7, int r8, int r9, int r10, int r11, int r12, int r13, int r14, java.lang.String r15) {
            r0 = this;
            r0.<init>()
            android.content.Context r1 = r1.getApplicationContext()
            r0.f23916a = r1
            r0.f23917b = r2
            r0.f23918c = r3
            r0.f23919d = r4
            r0.f23920e = r5
            r2 = 0
            r0.f23921f = r2
            r0.f23911C = r7
            r0.f23915G = r2
            int r3 = p337t5.C6173c.f23908H
            int r4 = r3 + 1
            p337t5.C6173c.f23908H = r4
            r0.f23930o = r3
            android.os.Looper r4 = android.os.Looper.getMainLooper()
            g5.e r5 = new g5.e
            r5.<init>(r0)
            int r6 = p371v5.C6552b0.f25624a
            android.os.Handler r6 = new android.os.Handler
            r6.<init>(r4, r5)
            r0.f23922g = r6
            c0.q r4 = new c0.q
            r4.<init>(r1)
            r0.f23923h = r4
            t5.c$g r4 = new t5.c$g
            r4.<init>(r0, r2)
            r0.f23925j = r4
            t5.c$e r4 = new t5.c$e
            r4.<init>(r0, r2)
            r0.f23926k = r4
            android.content.IntentFilter r2 = new android.content.IntentFilter
            r2.<init>()
            r0.f23924i = r2
            r2 = 1
            r0.f23937v = r2
            r0.f23938w = r2
            r0.f23941z = r2
            r0.f23939x = r2
            r0.f23940y = r2
            r0.f23910B = r2
            r0.f23914F = r2
            r4 = -1
            r0.f23913E = r4
            r0.f23909A = r2
            r0.f23912D = r2
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            c0.j r4 = new c0.j
            r5 = 2131951770(0x7f13009a, float:1.9539964E38)
            java.lang.String r5 = r1.getString(r5)
            java.lang.String r6 = "com.google.android.exoplayer.play"
            android.app.PendingIntent r7 = m12736a(r6, r1, r3)
            r4.<init>(r8, r5, r7)
            r2.put(r6, r4)
            c0.j r4 = new c0.j
            r5 = 2131951769(0x7f130099, float:1.9539962E38)
            java.lang.String r5 = r1.getString(r5)
            java.lang.String r6 = "com.google.android.exoplayer.pause"
            android.app.PendingIntent r7 = m12736a(r6, r1, r3)
            r4.<init>(r9, r5, r7)
            r2.put(r6, r4)
            c0.j r4 = new c0.j
            r5 = 2131951783(0x7f1300a7, float:1.953999E38)
            java.lang.String r5 = r1.getString(r5)
            java.lang.String r6 = "com.google.android.exoplayer.stop"
            android.app.PendingIntent r7 = m12736a(r6, r1, r3)
            r4.<init>(r10, r5, r7)
            r2.put(r6, r4)
            c0.j r4 = new c0.j
            r5 = 2131951777(0x7f1300a1, float:1.9539978E38)
            java.lang.String r5 = r1.getString(r5)
            java.lang.String r6 = "com.google.android.exoplayer.rewind"
            android.app.PendingIntent r7 = m12736a(r6, r1, r3)
            r4.<init>(r11, r5, r7)
            r2.put(r6, r4)
            c0.j r4 = new c0.j
            r5 = 2131951762(0x7f130092, float:1.9539948E38)
            java.lang.String r5 = r1.getString(r5)
            java.lang.String r6 = "com.google.android.exoplayer.ffwd"
            android.app.PendingIntent r7 = m12736a(r6, r1, r3)
            r4.<init>(r12, r5, r7)
            r2.put(r6, r4)
            c0.j r4 = new c0.j
            r5 = 2131951773(0x7f13009d, float:1.953997E38)
            java.lang.String r5 = r1.getString(r5)
            java.lang.String r6 = "com.google.android.exoplayer.prev"
            android.app.PendingIntent r7 = m12736a(r6, r1, r3)
            r4.<init>(r13, r5, r7)
            r2.put(r6, r4)
            c0.j r4 = new c0.j
            r5 = 2131951766(0x7f130096, float:1.9539956E38)
            java.lang.String r5 = r1.getString(r5)
            java.lang.String r6 = "com.google.android.exoplayer.next"
            android.app.PendingIntent r3 = m12736a(r6, r1, r3)
            r4.<init>(r14, r5, r3)
            r2.put(r6, r4)
            r0.f23927l = r2
            java.util.Set r2 = r2.keySet()
            java.util.Iterator r2 = r2.iterator()
        L106:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L118
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            android.content.IntentFilter r4 = r0.f23924i
            r4.addAction(r3)
            goto L106
        L118:
            java.util.Map r2 = java.util.Collections.emptyMap()
            r0.f23928m = r2
            java.util.Set r2 = r2.keySet()
            java.util.Iterator r2 = r2.iterator()
        L126:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L138
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            android.content.IntentFilter r4 = r0.f23924i
            r4.addAction(r3)
            goto L126
        L138:
            int r2 = r0.f23930o
            java.lang.String r3 = "com.google.android.exoplayer.dismiss"
            android.app.PendingIntent r1 = m12736a(r3, r1, r2)
            r0.f23929n = r1
            android.content.IntentFilter r1 = r0.f23924i
            r1.addAction(r3)
            return
    }

    /* renamed from: a */
    public static android.app.PendingIntent m12736a(java.lang.String r2, android.content.Context r3, int r4) {
            android.content.Intent r0 = new android.content.Intent
            r0.<init>(r2)
            java.lang.String r2 = r3.getPackageName()
            android.content.Intent r2 = r0.setPackage(r2)
            java.lang.String r0 = "INSTANCE_ID"
            r2.putExtra(r0, r4)
            int r0 = p371v5.C6552b0.f25624a
            r1 = 23
            if (r0 < r1) goto L1b
            r0 = 201326592(0xc000000, float:9.8607613E-32)
            goto L1d
        L1b:
            r0 = 134217728(0x8000000, float:3.85186E-34)
        L1d:
            android.app.PendingIntent r2 = android.app.PendingIntent.getBroadcast(r3, r4, r2, r0)
            return r2
    }

    /* renamed from: b */
    public final void m12737b() {
            r2 = this;
            android.os.Handler r0 = r2.f23922g
            r1 = 0
            boolean r0 = r0.hasMessages(r1)
            if (r0 != 0) goto Le
            android.os.Handler r0 = r2.f23922g
            r0.sendEmptyMessage(r1)
        Le:
            return
    }

    /* renamed from: c */
    public final void m12738c(p088f4.InterfaceC2054x0 r5) {
            r4 = this;
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r2 = 1
            r3 = 0
            if (r0 != r1) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            p371v5.C6549a.m13291e(r0)
            if (r5 == 0) goto L20
            android.os.Looper r0 = r5.mo2830N()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            if (r0 != r1) goto L1f
            goto L20
        L1f:
            r2 = 0
        L20:
            p371v5.C6549a.m13288b(r2)
            f4.x0 r0 = r4.f23933r
            if (r0 != r5) goto L28
            return
        L28:
            if (r0 == 0) goto L34
            f4.x0$e r1 = r4.f23925j
            r0.mo2825H(r1)
            if (r5 != 0) goto L34
            r4.m12741f(r3)
        L34:
            r4.f23933r = r5
            if (r5 == 0) goto L40
            f4.x0$e r0 = r4.f23925j
            r5.mo2833Q(r0)
            r4.m12737b()
        L40:
            return
    }

    /* renamed from: d */
    public final boolean m12739d(p088f4.InterfaceC2054x0 r4) {
            r3 = this;
            int r0 = r4.mo2850n()
            r1 = 1
            r2 = 4
            if (r0 == r2) goto L15
            int r0 = r4.mo2850n()
            if (r0 == r1) goto L15
            boolean r4 = r4.mo2862u()
            if (r4 == 0) goto L15
            goto L16
        L15:
            r1 = 0
        L16:
            return r1
    }

    /* renamed from: e */
    public final void m12740e(p088f4.InterfaceC2054x0 r17, android.graphics.Bitmap r18) {
            r16 = this;
            r0 = r16
            r1 = r17
            int r2 = r17.mo2850n()
            r3 = 0
            r4 = 1
            r5 = 3
            r6 = 2
            if (r2 == r6) goto L10
            if (r2 != r5) goto L18
        L10:
            boolean r2 = r17.mo2862u()
            if (r2 == 0) goto L18
            r2 = 1
            goto L19
        L18:
            r2 = 0
        L19:
            c0.m r7 = r0.f23931p
            int r8 = r17.mo2850n()
            r9 = 0
            if (r8 != r4) goto L30
            f4.n1 r8 = r17.mo2829M()
            boolean r8 = r8.m5344r()
            if (r8 == 0) goto L30
            r0.f23932q = r9
            goto L1da
        L30:
            r8 = 7
            boolean r8 = r1.mo5217G(r8)
            r10 = 11
            boolean r10 = r1.mo5217G(r10)
            r11 = 12
            boolean r11 = r1.mo5217G(r11)
            r12 = 9
            boolean r12 = r1.mo5217G(r12)
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            boolean r14 = r0.f23937v
            if (r14 == 0) goto L57
            if (r8 == 0) goto L57
            java.lang.String r8 = "com.google.android.exoplayer.prev"
            r13.add(r8)
        L57:
            boolean r8 = r0.f23939x
            if (r8 == 0) goto L62
            if (r10 == 0) goto L62
            java.lang.String r8 = "com.google.android.exoplayer.rewind"
            r13.add(r8)
        L62:
            boolean r8 = r0.f23941z
            java.lang.String r10 = "com.google.android.exoplayer.pause"
            java.lang.String r14 = "com.google.android.exoplayer.play"
            if (r8 == 0) goto L76
            boolean r8 = r16.m12739d(r17)
            if (r8 == 0) goto L72
            r8 = r10
            goto L73
        L72:
            r8 = r14
        L73:
            r13.add(r8)
        L76:
            boolean r8 = r0.f23940y
            if (r8 == 0) goto L81
            if (r11 == 0) goto L81
            java.lang.String r8 = "com.google.android.exoplayer.ffwd"
            r13.add(r8)
        L81:
            boolean r8 = r0.f23938w
            if (r8 == 0) goto L8c
            if (r12 == 0) goto L8c
            java.lang.String r8 = "com.google.android.exoplayer.next"
            r13.add(r8)
        L8c:
            t5.c$c r8 = r0.f23921f
            if (r8 == 0) goto L97
            java.util.List r8 = r8.m12743b(r1)
            r13.addAll(r8)
        L97:
            java.util.ArrayList r8 = new java.util.ArrayList
            int r11 = r13.size()
            r8.<init>(r11)
            r11 = 0
        La1:
            int r12 = r13.size()
            if (r11 >= r12) goto Lc8
            java.lang.Object r12 = r13.get(r11)
            java.lang.String r12 = (java.lang.String) r12
            java.util.Map<java.lang.String, c0.j> r15 = r0.f23927l
            boolean r15 = r15.containsKey(r12)
            if (r15 == 0) goto Lb8
            java.util.Map<java.lang.String, c0.j> r15 = r0.f23927l
            goto Lba
        Lb8:
            java.util.Map<java.lang.String, c0.j> r15 = r0.f23928m
        Lba:
            java.lang.Object r12 = r15.get(r12)
            c0.j r12 = (p030c0.C0823j) r12
            if (r12 == 0) goto Lc5
            r8.add(r12)
        Lc5:
            int r11 = r11 + 1
            goto La1
        Lc8:
            if (r7 == 0) goto Ld2
            java.util.List<c0.j> r11 = r0.f23932q
            boolean r11 = r8.equals(r11)
            if (r11 != 0) goto Lf4
        Ld2:
            c0.m r7 = new c0.m
            android.content.Context r11 = r0.f23916a
            java.lang.String r12 = r0.f23917b
            r7.<init>(r11, r12)
            r0.f23932q = r8
            r11 = 0
        Lde:
            int r12 = r8.size()
            if (r11 >= r12) goto Lf4
            java.lang.Object r12 = r8.get(r11)
            c0.j r12 = (p030c0.C0823j) r12
            if (r12 == 0) goto Lf1
            java.util.ArrayList<c0.j> r15 = r7.f4462b
            r15.add(r12)
        Lf1:
            int r11 = r11 + 1
            goto Lde
        Lf4:
            d1.b r8 = new d1.b
            r8.<init>()
            android.support.v4.media.session.MediaSessionCompat$Token r11 = r0.f23936u
            if (r11 == 0) goto Lff
            r8.f6736c = r11
        Lff:
            int r10 = r13.indexOf(r10)
            int r11 = r13.indexOf(r14)
            int[] r5 = new int[r5]
            boolean r12 = r16.m12739d(r17)
            r13 = -1
            if (r10 == r13) goto L115
            if (r12 == 0) goto L115
            r5[r3] = r10
            goto L11b
        L115:
            if (r11 == r13) goto L11d
            if (r12 != 0) goto L11d
            r5[r3] = r11
        L11b:
            r10 = 1
            goto L11e
        L11d:
            r10 = 0
        L11e:
            int[] r5 = java.util.Arrays.copyOf(r5, r10)
            r8.f6735b = r5
            c0.n r5 = r7.f4473m
            if (r5 == r8) goto L12d
            r7.f4473m = r8
            r8.m2491f(r7)
        L12d:
            android.app.PendingIntent r5 = r0.f23929n
            android.app.Notification r8 = r7.f4485y
            r8.deleteIntent = r5
            int r5 = r0.f23909A
            r7.f4483w = r5
            r7.m2486e(r6, r2)
            r7.f4480t = r3
            boolean r5 = r0.f23910B
            r7.f4477q = r5
            r7.f4478r = r4
            int r5 = r0.f23911C
            android.app.Notification r6 = r7.f4485y
            r6.icon = r5
            int r5 = r0.f23912D
            r7.f4481u = r5
            int r5 = r0.f23913E
            r7.f4470j = r5
            r6.defaults = r3
            int r5 = p371v5.C6552b0.f25624a
            r6 = 21
            if (r5 < r6) goto L18c
            boolean r5 = r0.f23914F
            if (r5 == 0) goto L18c
            boolean r5 = r17.mo5215B()
            if (r5 == 0) goto L18c
            boolean r5 = r17.mo2840h()
            if (r5 != 0) goto L18c
            boolean r5 = r17.mo5218J()
            if (r5 != 0) goto L18c
            f4.w0 r5 = r17.mo2837e()
            float r5 = r5.f9372Y
            r6 = 1065353216(0x3f800000, float:1.0)
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 != 0) goto L18c
            long r5 = java.lang.System.currentTimeMillis()
            long r10 = r17.mo2846l()
            long r5 = r5 - r10
            android.app.Notification r8 = r7.f4485y
            r8.when = r5
            r7.f4471k = r4
            r7.f4472l = r4
            goto L190
        L18c:
            r7.f4471k = r3
            r7.f4472l = r3
        L190:
            t5.c$d r5 = r0.f23919d
            java.lang.CharSequence r5 = r5.mo11929e(r1)
            r7.m2485d(r5)
            t5.c$d r5 = r0.f23919d
            java.lang.CharSequence r5 = r5.mo11927c(r1)
            r7.m2484c(r5)
            t5.c$d r5 = r0.f23919d
            java.lang.CharSequence r5 = r5.mo11926b(r1)
            java.lang.CharSequence r5 = p030c0.C0826m.m2482b(r5)
            r7.f4474n = r5
            if (r18 != 0) goto L1c1
            t5.c$d r5 = r0.f23919d
            t5.c$b r6 = new t5.c$b
            int r8 = r0.f23935t
            int r8 = r8 + r4
            r0.f23935t = r8
            r6.<init>(r0, r8, r9)
            android.graphics.Bitmap r5 = r5.mo11928d(r1, r6)
            goto L1c3
        L1c1:
            r5 = r18
        L1c3:
            r7.m2487f(r5)
            t5.c$d r5 = r0.f23919d
            android.app.PendingIntent r1 = r5.mo11925a(r1)
            r7.f4467g = r1
            java.lang.String r1 = r0.f23915G
            if (r1 == 0) goto L1d4
            r7.f4475o = r1
        L1d4:
            r1 = 8
            r7.m2486e(r1, r4)
            r9 = r7
        L1da:
            r0.f23931p = r9
            if (r9 != 0) goto L1e2
            r0.m12741f(r3)
            return
        L1e2:
            android.app.Notification r1 = r9.m2483a()
            c0.q r5 = r0.f23923h
            int r6 = r0.f23918c
            r5.m2496b(r6, r1)
            boolean r5 = r0.f23934s
            if (r5 != 0) goto L1fa
            android.content.Context r5 = r0.f23916a
            t5.c$e r6 = r0.f23926k
            android.content.IntentFilter r7 = r0.f23924i
            r5.registerReceiver(r6, r7)
        L1fa:
            t5.c$f r5 = r0.f23920e
            if (r5 == 0) goto L20a
            int r6 = r0.f23918c
            if (r2 != 0) goto L206
            boolean r2 = r0.f23934s
            if (r2 != 0) goto L207
        L206:
            r3 = 1
        L207:
            r5.mo11919b(r6, r1, r3)
        L20a:
            r0.f23934s = r4
            return
    }

    /* renamed from: f */
    public final void m12741f(boolean r4) {
            r3 = this;
            boolean r0 = r3.f23934s
            if (r0 == 0) goto L26
            r0 = 0
            r3.f23934s = r0
            android.os.Handler r1 = r3.f23922g
            r1.removeMessages(r0)
            c0.q r0 = r3.f23923h
            int r1 = r3.f23918c
            android.app.NotificationManager r0 = r0.f4500b
            r2 = 0
            r0.cancel(r2, r1)
            android.content.Context r0 = r3.f23916a
            t5.c$e r1 = r3.f23926k
            r0.unregisterReceiver(r1)
            t5.c$f r0 = r3.f23920e
            if (r0 == 0) goto L26
            int r1 = r3.f23918c
            r0.mo11918a(r1, r4)
        L26:
            return
    }
}
