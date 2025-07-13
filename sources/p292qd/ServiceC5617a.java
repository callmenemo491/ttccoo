package p292qd;

/* renamed from: qd.a */
/* loaded from: classes.dex */
public class ServiceC5617a extends p031c1.AbstractServiceC0833a {

    /* renamed from: f0 */
    public p292qd.C5625i f21814f0;

    /* renamed from: g0 */
    public p313rd.InterfaceC5816c f21815g0;

    /* renamed from: h0 */
    public p292qd.C5621e f21816h0;

    /* renamed from: i0 */
    public p088f4.InterfaceC2054x0 f21817i0;

    /* renamed from: j0 */
    public final p379vh.InterfaceC6733r f21818j0;

    /* renamed from: k0 */
    public final p379vh.InterfaceC6686b0 f21819k0;

    /* renamed from: l0 */
    public android.support.v4.media.session.MediaSessionCompat f21820l0;

    /* renamed from: m0 */
    public p199l4.C4178a f21821m0;

    /* renamed from: n0 */
    public java.util.List<android.support.v4.media.MediaMetadataCompat> f21822n0;

    /* renamed from: o0 */
    public p292qd.C5623g f21823o0;

    /* renamed from: p0 */
    public final ch.InterfaceC0977d f21824p0;

    /* renamed from: q0 */
    public final ch.InterfaceC0977d f21825q0;

    /* renamed from: r0 */
    public boolean f21826r0;

    /* renamed from: s0 */
    public final p121h4.C2461d f21827s0;

    /* renamed from: t0 */
    public final p292qd.ServiceC5617a.a f21828t0;

    /* renamed from: u0 */
    public final ch.InterfaceC0977d f21829u0;

    /* renamed from: v0 */
    public final ch.InterfaceC0977d f21830v0;

    /* renamed from: qd.a$a */
    public final class a implements p088f4.InterfaceC2054x0.c {

        /* renamed from: Y */
        public final /* synthetic */ p292qd.ServiceC5617a f21831Y;

        public a(p292qd.ServiceC5617a r1) {
                r0 = this;
                r0.f21831Y = r1
                r0.<init>()
                return
        }

        @Override // p088f4.InterfaceC2054x0.c
        /* renamed from: N */
        public /* synthetic */ void mo2887N(int r1) {
                r0 = this;
                p088f4.C2056y0.m5433j(r0, r1)
                return
        }

        @Override // p088f4.InterfaceC2054x0.c
        /* renamed from: O */
        public /* synthetic */ void mo2888O(boolean r1, int r2) {
                r0 = this;
                p088f4.C2056y0.m5431h(r0, r1, r2)
                return
        }

        @Override // p088f4.InterfaceC2054x0.c
        /* renamed from: Q */
        public /* synthetic */ void mo2889Q(p088f4.InterfaceC2054x0.f r1, p088f4.InterfaceC2054x0.f r2, int r3) {
                r0 = this;
                p088f4.C2056y0.m5439p(r0, r1, r2, r3)
                return
        }

        @Override // p088f4.InterfaceC2054x0.c
        /* renamed from: R */
        public /* synthetic */ void mo2890R(p088f4.InterfaceC2054x0 r1, p088f4.InterfaceC2054x0.d r2) {
                r0 = this;
                p088f4.C2056y0.m5425b(r0, r1, r2)
                return
        }

        @Override // p088f4.InterfaceC2054x0.c
        /* renamed from: S */
        public /* synthetic */ void mo2891S(p088f4.InterfaceC2054x0.b r1) {
                r0 = this;
                p088f4.C2056y0.m5424a(r0, r1)
                return
        }

        @Override // p088f4.InterfaceC2054x0.c
        /* renamed from: T */
        public /* synthetic */ void mo2892T(p088f4.C2034o1 r1) {
                r0 = this;
                p088f4.C2056y0.m5445v(r0, r1)
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
                p088f4.C2056y0.m5442s(r0, r1)
                return
        }

        @Override // p088f4.InterfaceC2054x0.c
        /* renamed from: Y */
        public void mo2895Y(p088f4.C2048u0 r3) {
                r2 = this;
                java.lang.String r0 = "error"
                p214m2.C4339q.m9706k(r3, r0)
                int r3 = r3.f9345Y
                r0 = 1002(0x3ea, float:1.404E-42)
                if (r3 != r0) goto L29
                qd.a r3 = r2.f21831Y
                f4.x0 r3 = r3.f21817i0
                java.lang.String r0 = "currentPlayer"
                r1 = 0
                if (r3 == 0) goto L25
                r3.mo5216D()
                qd.a r3 = r2.f21831Y
                f4.x0 r3 = r3.f21817i0
                if (r3 == 0) goto L21
                r3.mo2852o()
                goto L3a
            L21:
                p214m2.C4339q.m9713w(r0)
                throw r1
            L25:
                p214m2.C4339q.m9713w(r0)
                throw r1
            L29:
                r3 = 2131951827(0x7f1300d3, float:1.954008E38)
                qd.a r0 = r2.f21831Y
                android.content.Context r0 = r0.getApplicationContext()
                r1 = 1
                android.widget.Toast r3 = android.widget.Toast.makeText(r0, r3, r1)
                r3.show()
            L3a:
                return
        }

        @Override // p088f4.InterfaceC2054x0.c
        /* renamed from: a0 */
        public /* synthetic */ void mo2898a0(p088f4.C2018j0 r1, int r2) {
                r0 = this;
                p088f4.C2056y0.m5429f(r0, r1, r2)
                return
        }

        @Override // p088f4.InterfaceC2054x0.c
        /* renamed from: b */
        public /* synthetic */ void mo2899b() {
                r0 = this;
                p088f4.C2056y0.m5441r(r0)
                return
        }

        @Override // p088f4.InterfaceC2054x0.c
        /* renamed from: f0 */
        public /* synthetic */ void mo2904f0(p088f4.C2052w0 r1) {
                r0 = this;
                p088f4.C2056y0.m5432i(r0, r1)
                return
        }

        @Override // p088f4.InterfaceC2054x0.c
        /* renamed from: g */
        public /* synthetic */ void mo2905g(int r1) {
                r0 = this;
                p088f4.C2056y0.m5434k(r0, r1)
                return
        }

        @Override // p088f4.InterfaceC2054x0.c
        /* renamed from: h */
        public void mo2906h(boolean r6, int r7) {
                r5 = this;
                r0 = 0
                r1 = 2
                java.lang.String r2 = "notificationManager"
                r3 = 3
                if (r7 == r1) goto L19
                if (r7 == r3) goto L19
                qd.a r6 = r5.f21831Y
                qd.i r6 = r6.f21814f0
                if (r6 == 0) goto L15
                t5.c r6 = r6.f21893d
                r6.m12738c(r0)
                goto L3b
            L15:
                p214m2.C4339q.m9713w(r2)
                throw r0
            L19:
                qd.a r1 = r5.f21831Y
                qd.i r4 = r1.f21814f0
                if (r4 == 0) goto L42
                f4.x0 r1 = r1.f21817i0
                if (r1 == 0) goto L3c
                t5.c r0 = r4.f21893d
                r0.m12738c(r1)
                if (r7 != r3) goto L3b
                qd.a r7 = r5.f21831Y
                r7.m11916k()
                if (r6 != 0) goto L3b
                qd.a r6 = r5.f21831Y
                r7 = 0
                r6.stopForeground(r7)
                qd.a r6 = r5.f21831Y
                r6.f21826r0 = r7
            L3b:
                return
            L3c:
                java.lang.String r6 = "currentPlayer"
                p214m2.C4339q.m9713w(r6)
                throw r0
            L42:
                p214m2.C4339q.m9713w(r2)
                throw r0
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
                p088f4.C2056y0.m5427d(r0, r1)
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
                p088f4.C2056y0.m5430g(r0, r1)
                return
        }

        @Override // p088f4.InterfaceC2054x0.c
        /* renamed from: t */
        public /* synthetic */ void mo2913t(p088f4.AbstractC2031n1 r1, int r2) {
                r0 = this;
                p088f4.C2056y0.m5443t(r0, r1, r2)
                return
        }

        @Override // p088f4.InterfaceC2054x0.c
        /* renamed from: u */
        public /* synthetic */ void mo2914u(int r1) {
                r0 = this;
                p088f4.C2056y0.m5440q(r0, r1)
                return
        }

        @Override // p088f4.InterfaceC2054x0.c
        /* renamed from: v */
        public /* synthetic */ void mo2915v(boolean r1) {
                r0 = this;
                p088f4.C2056y0.m5426c(r0, r1)
                return
        }

        @Override // p088f4.InterfaceC2054x0.c
        /* renamed from: y */
        public /* synthetic */ void mo2916y(p088f4.C2048u0 r1) {
                r0 = this;
                p088f4.C2056y0.m5436m(r0, r1)
                return
        }
    }

    /* renamed from: qd.a$b */
    public final class b implements p337t5.C6173c.f {

        /* renamed from: a */
        public final /* synthetic */ p292qd.ServiceC5617a f21832a;

        public b(p292qd.ServiceC5617a r1) {
                r0 = this;
                r0.f21832a = r1
                r0.<init>()
                return
        }

        @Override // p337t5.C6173c.f
        /* renamed from: a */
        public void mo11918a(int r1, boolean r2) {
                r0 = this;
                qd.a r1 = r0.f21832a
                r2 = 1
                r1.stopForeground(r2)
                qd.a r1 = r0.f21832a
                r2 = 0
                r1.f21826r0 = r2
                r1.stopSelf()
                return
        }

        @Override // p337t5.C6173c.f
        /* renamed from: b */
        public void mo11919b(int r4, android.app.Notification r5, boolean r6) {
                r3 = this;
                if (r6 == 0) goto L36
                qd.a r6 = r3.f21832a
                boolean r0 = r6.f21826r0
                if (r0 != 0) goto L36
                android.content.Context r6 = r6.getApplicationContext()
                android.content.Intent r0 = new android.content.Intent
                qd.a r1 = r3.f21832a
                android.content.Context r1 = r1.getApplicationContext()
                qd.a r2 = r3.f21832a
                java.lang.Class r2 = r2.getClass()
                r0.<init>(r1, r2)
                java.lang.Object r1 = p046d0.C1259a.f6733a
                int r1 = android.os.Build.VERSION.SDK_INT
                r2 = 26
                if (r1 < r2) goto L29
                p046d0.C1259a.e.m3718a(r6, r0)
                goto L2c
            L29:
                r6.startService(r0)
            L2c:
                qd.a r6 = r3.f21832a
                r6.startForeground(r4, r5)
                qd.a r4 = r3.f21832a
                r5 = 1
                r4.f21826r0 = r5
            L36:
                return
        }
    }

    /* renamed from: qd.a$c */
    public final class c implements p182k4.InterfaceC3693h {

        /* renamed from: a */
        public final /* synthetic */ p292qd.ServiceC5617a f21833a;

        public c(p292qd.ServiceC5617a r1) {
                r0 = this;
                r0.f21833a = r1
                r0.<init>()
                return
        }

        @Override // p182k4.InterfaceC3693h
        /* renamed from: a */
        public void mo8147a() {
                r3 = this;
                qd.a r0 = r3.f21833a
                f4.x0 r1 = r0.f21817i0
                if (r1 == 0) goto Le
                f4.s r2 = r0.m11912f()
                r0.m11917l(r1, r2)
                return
            Le:
                java.lang.String r0 = "currentPlayer"
                p214m2.C4339q.m9713w(r0)
                r0 = 0
                throw r0
        }

        @Override // p182k4.InterfaceC3693h
        /* renamed from: b */
        public void mo8148b() {
                r3 = this;
                qd.a r0 = r3.f21833a
                f4.x0 r1 = r0.f21817i0
                if (r1 == 0) goto L11
                com.google.android.exoplayer2.ext.cast.a r2 = r0.m11911e()
                p214m2.C4339q.m9704i(r2)
                r0.m11917l(r1, r2)
                return
            L11:
                java.lang.String r0 = "currentPlayer"
                p214m2.C4339q.m9713w(r0)
                r0 = 0
                throw r0
        }
    }

    /* renamed from: qd.a$d */
    public final class d implements p199l4.C4178a.g {

        /* renamed from: a */
        public final /* synthetic */ p292qd.ServiceC5617a f21834a;

        /* renamed from: qd.a$d$a */
        public static final class a extends p239nh.AbstractC4830j implements mh.InterfaceC4620l<java.lang.Boolean, ch.C0985l> {

            /* renamed from: Z */
            public final /* synthetic */ p292qd.ServiceC5617a f21835Z;

            /* renamed from: a0 */
            public final /* synthetic */ java.lang.String f21836a0;

            /* renamed from: b0 */
            public final /* synthetic */ android.os.Bundle f21837b0;

            /* renamed from: c0 */
            public final /* synthetic */ p292qd.ServiceC5617a.d f21838c0;

            /* renamed from: d0 */
            public final /* synthetic */ boolean f21839d0;

            public a(p292qd.ServiceC5617a r1, java.lang.String r2, android.os.Bundle r3, p292qd.ServiceC5617a.d r4, boolean r5) {
                    r0 = this;
                    r0.f21835Z = r1
                    r0.f21836a0 = r2
                    r0.f21837b0 = r3
                    r0.f21838c0 = r4
                    r0.f21839d0 = r5
                    r1 = 1
                    r0.<init>(r1)
                    return
            }

            @Override // mh.InterfaceC4620l
            /* renamed from: b */
            public ch.C0985l mo107b(java.lang.Boolean r14) {
                    r13 = this;
                    java.lang.Boolean r14 = (java.lang.Boolean) r14
                    r14.booleanValue()
                    qd.a r14 = r13.f21835Z
                    rd.c r14 = r14.f21815g0
                    java.lang.String r0 = "mediaSource"
                    r1 = 0
                    if (r14 == 0) goto L77
                    java.lang.String r2 = r13.f21836a0
                    java.util.Iterator r14 = r14.iterator()
                L14:
                    boolean r3 = r14.hasNext()
                    if (r3 == 0) goto L2e
                    java.lang.Object r3 = r14.next()
                    r4 = r3
                    android.support.v4.media.MediaMetadataCompat r4 = (android.support.v4.media.MediaMetadataCompat) r4
                    java.lang.String r5 = "android.media.metadata.MEDIA_ID"
                    java.lang.String r4 = r4.m231e(r5)
                    boolean r4 = p214m2.C4339q.m9702c(r4, r2)
                    if (r4 == 0) goto L14
                    goto L2f
                L2e:
                    r3 = r1
                L2f:
                    r6 = r3
                    android.support.v4.media.MediaMetadataCompat r6 = (android.support.v4.media.MediaMetadataCompat) r6
                    if (r6 != 0) goto L49
                    java.lang.String r14 = "Content not found: MediaID="
                    java.lang.StringBuilder r14 = android.support.v4.media.C0144c.m256a(r14)
                    java.lang.String r0 = r13.f21836a0
                    r14.append(r0)
                    java.lang.String r14 = r14.toString()
                    java.lang.String r0 = "MusicService"
                    android.util.Log.w(r0, r14)
                    goto L70
                L49:
                    android.os.Bundle r14 = r13.f21837b0
                    r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                    if (r14 == 0) goto L58
                    java.lang.String r4 = "playback_start_position_ms"
                    long r2 = r14.getLong(r4, r2)
                L58:
                    r8 = r2
                    qd.a r4 = r13.f21835Z
                    qd.a$d r14 = r13.f21838c0
                    qd.a r14 = r14.f21834a
                    rd.c r14 = r14.f21815g0
                    if (r14 == 0) goto L73
                    java.util.List r5 = p062dh.C1473i.m4007S(r14)
                    boolean r7 = r13.f21839d0
                    r10 = 0
                    r11 = 16
                    r12 = 0
                    p292qd.ServiceC5617a.m11910j(r4, r5, r6, r7, r8, r10, r11, r12)
                L70:
                    ch.l r14 = ch.C0985l.f5061a
                    return r14
                L73:
                    p214m2.C4339q.m9713w(r0)
                    throw r1
                L77:
                    p214m2.C4339q.m9713w(r0)
                    throw r1
            }
        }

        /* renamed from: qd.a$d$b */
        public static final class b extends p239nh.AbstractC4830j implements mh.InterfaceC4620l<java.lang.Boolean, ch.C0985l> {

            /* renamed from: Z */
            public final /* synthetic */ p292qd.ServiceC5617a f21840Z;

            /* renamed from: a0 */
            public final /* synthetic */ java.lang.String f21841a0;

            /* renamed from: b0 */
            public final /* synthetic */ android.os.Bundle f21842b0;

            /* renamed from: c0 */
            public final /* synthetic */ boolean f21843c0;

            public b(p292qd.ServiceC5617a r1, java.lang.String r2, android.os.Bundle r3, boolean r4) {
                    r0 = this;
                    r0.f21840Z = r1
                    r0.f21841a0 = r2
                    r0.f21842b0 = r3
                    r0.f21843c0 = r4
                    r1 = 1
                    r0.<init>(r1)
                    return
            }

            @Override // mh.InterfaceC4620l
            /* renamed from: b */
            public ch.C0985l mo107b(java.lang.Boolean r13) {
                    r12 = this;
                    java.lang.Boolean r13 = (java.lang.Boolean) r13
                    r13.booleanValue()
                    qd.a r13 = r12.f21840Z
                    rd.c r13 = r13.f21815g0
                    if (r13 == 0) goto L3f
                    java.lang.String r0 = r12.f21841a0
                    android.os.Bundle r1 = r12.f21842b0
                    if (r1 != 0) goto L13
                    android.os.Bundle r1 = android.os.Bundle.EMPTY
                L13:
                    java.lang.String r2 = "extras ?: Bundle.EMPTY"
                    p214m2.C4339q.m9705j(r1, r2)
                    java.util.List r4 = r13.mo12192y(r0, r1)
                    boolean r13 = r4.isEmpty()
                    r13 = r13 ^ 1
                    if (r13 == 0) goto L3c
                    qd.a r3 = r12.f21840Z
                    r13 = 0
                    java.lang.Object r13 = r4.get(r13)
                    r5 = r13
                    android.support.v4.media.MediaMetadataCompat r5 = (android.support.v4.media.MediaMetadataCompat) r5
                    boolean r6 = r12.f21843c0
                    r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                    r9 = 0
                    r10 = 16
                    r11 = 0
                    p292qd.ServiceC5617a.m11910j(r3, r4, r5, r6, r7, r9, r10, r11)
                L3c:
                    ch.l r13 = ch.C0985l.f5061a
                    return r13
                L3f:
                    java.lang.String r13 = "mediaSource"
                    p214m2.C4339q.m9713w(r13)
                    r13 = 0
                    throw r13
            }
        }

        public d(p292qd.ServiceC5617a r1) {
                r0 = this;
                r0.f21834a = r1
                r0.<init>()
                return
        }

        @Override // p199l4.C4178a.b
        /* renamed from: c */
        public boolean mo7748c(p088f4.InterfaceC2054x0 r1, java.lang.String r2, android.os.Bundle r3, android.os.ResultReceiver r4) {
                r0 = this;
                java.lang.String r3 = "player"
                p214m2.C4339q.m9706k(r1, r3)
                java.lang.String r1 = "command"
                p214m2.C4339q.m9706k(r2, r1)
                r1 = 0
                return r1
        }

        @Override // p199l4.C4178a.g
        /* renamed from: e */
        public void mo9297e(boolean r3) {
                r2 = this;
                qd.a r0 = r2.f21834a
                qd.g r0 = r0.f21823o0
                if (r0 == 0) goto L1c
                android.support.v4.media.MediaBrowserCompat$MediaItem r0 = r0.m11924a()
                if (r0 != 0) goto Ld
                return
            Ld:
                android.support.v4.media.MediaDescriptionCompat r1 = r0.f461Z
                java.lang.String r1 = r1.f485Y
                p214m2.C4339q.m9704i(r1)
                android.support.v4.media.MediaDescriptionCompat r0 = r0.f461Z
                android.os.Bundle r0 = r0.f491e0
                r2.mo9300j(r1, r3, r0)
                return
            L1c:
                java.lang.String r3 = "storage"
                p214m2.C4339q.m9713w(r3)
                r3 = 0
                throw r3
        }

        @Override // p199l4.C4178a.g
        /* renamed from: f */
        public long mo9298f() {
                r2 = this;
                r0 = 101376(0x18c00, double:5.00864E-319)
                return r0
        }

        @Override // p199l4.C4178a.g
        /* renamed from: g */
        public void mo9299g(java.lang.String r4, boolean r5, android.os.Bundle r6) {
                r3 = this;
                java.lang.String r0 = "query"
                p214m2.C4339q.m9706k(r4, r0)
                qd.a r0 = r3.f21834a
                rd.c r1 = r0.f21815g0
                if (r1 == 0) goto L14
                qd.a$d$b r2 = new qd.a$d$b
                r2.<init>(r0, r4, r6, r5)
                r1.mo12191o(r2)
                return
            L14:
                java.lang.String r4 = "mediaSource"
                p214m2.C4339q.m9713w(r4)
                r4 = 0
                throw r4
        }

        @Override // p199l4.C4178a.g
        /* renamed from: j */
        public void mo9300j(java.lang.String r9, boolean r10, android.os.Bundle r11) {
                r8 = this;
                java.lang.String r0 = "mediaId"
                p214m2.C4339q.m9706k(r9, r0)
                qd.a r2 = r8.f21834a
                rd.c r0 = r2.f21815g0
                if (r0 == 0) goto L19
                qd.a$d$a r7 = new qd.a$d$a
                r1 = r7
                r3 = r9
                r4 = r11
                r5 = r8
                r6 = r10
                r1.<init>(r2, r3, r4, r5, r6)
                r0.mo12191o(r7)
                return
            L19:
                java.lang.String r9 = "mediaSource"
                p214m2.C4339q.m9713w(r9)
                r9 = 0
                throw r9
        }

        @Override // p199l4.C4178a.g
        /* renamed from: k */
        public void mo9301k(android.net.Uri r1, boolean r2, android.os.Bundle r3) {
                r0 = this;
                java.lang.String r2 = "uri"
                p214m2.C4339q.m9706k(r1, r2)
                return
        }
    }

    /* renamed from: qd.a$e */
    public final class e extends p199l4.AbstractC4179b {

        /* renamed from: e */
        public final /* synthetic */ p292qd.ServiceC5617a f21844e;

        public e(p292qd.ServiceC5617a r1, android.support.v4.media.session.MediaSessionCompat r2) {
                r0 = this;
                r0.f21844e = r1
                r0.<init>(r2)
                return
        }

        @Override // p199l4.AbstractC4179b
        /* renamed from: n */
        public android.support.v4.media.MediaDescriptionCompat mo9309n(p088f4.InterfaceC2054x0 r1, int r2) {
                r0 = this;
                qd.a r1 = r0.f21844e
                java.util.List<android.support.v4.media.MediaMetadataCompat> r1 = r1.f21822n0
                java.lang.Object r1 = r1.get(r2)
                android.support.v4.media.MediaMetadataCompat r1 = (android.support.v4.media.MediaMetadataCompat) r1
                android.support.v4.media.MediaDescriptionCompat r1 = r1.m230d()
                java.lang.String r2 = "currentPlaylistItems[windowIndex].description"
                p214m2.C4339q.m9705j(r1, r2)
                return r1
        }
    }

    /* renamed from: qd.a$f */
    public static final class f extends p239nh.AbstractC4830j implements mh.InterfaceC4609a<p313rd.C5815b> {

        /* renamed from: Z */
        public final /* synthetic */ p292qd.ServiceC5617a f21845Z;

        public f(p292qd.ServiceC5617a r1) {
                r0 = this;
                r0.f21845Z = r1
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4609a
        /* renamed from: e */
        public p313rd.C5815b mo15e() {
                r5 = this;
                rd.b r0 = new rd.b
                qd.a r1 = r5.f21845Z
                android.content.Context r1 = r1.getApplicationContext()
                java.lang.String r2 = "applicationContext"
                p214m2.C4339q.m9705j(r1, r2)
                qd.a r2 = r5.f21845Z
                rd.c r2 = r2.f21815g0
                r3 = 0
                if (r2 == 0) goto L19
                r4 = 4
                r0.<init>(r1, r2, r3, r4)
                return r0
            L19:
                java.lang.String r0 = "mediaSource"
                p214m2.C4339q.m9713w(r0)
                throw r3
        }
    }

    /* renamed from: qd.a$g */
    public static final class g extends p239nh.AbstractC4830j implements mh.InterfaceC4609a<com.google.android.exoplayer2.ext.cast.C1045a> {

        /* renamed from: Z */
        public final /* synthetic */ p292qd.ServiceC5617a f21846Z;

        public g(p292qd.ServiceC5617a r1) {
                r0 = this;
                r0.f21846Z = r1
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4609a
        /* renamed from: e */
        public com.google.android.exoplayer2.ext.cast.C1045a mo15e() {
                r4 = this;
                qd.a r0 = r4.f21846Z     // Catch: java.lang.Exception -> L2b
                d6.a r0 = p052d6.C1295a.m3761b(r0)     // Catch: java.lang.Exception -> L2b
                com.google.android.exoplayer2.ext.cast.a r1 = new com.google.android.exoplayer2.ext.cast.a     // Catch: java.lang.Exception -> L2b
                r1.<init>(r0)     // Catch: java.lang.Exception -> L2b
                qd.a r0 = r4.f21846Z     // Catch: java.lang.Exception -> L2b
                qd.a$c r2 = new qd.a$c     // Catch: java.lang.Exception -> L2b
                r2.<init>(r0)     // Catch: java.lang.Exception -> L2b
                r1.f5259i = r2     // Catch: java.lang.Exception -> L2b
                qd.a$a r0 = r0.f21828t0     // Catch: java.lang.Exception -> L2b
                v5.n<f4.x0$c> r2 = r1.f5258h     // Catch: java.lang.Exception -> L2b
                boolean r3 = r2.f25665g     // Catch: java.lang.Exception -> L2b
                if (r3 == 0) goto L1d
                goto L43
            L1d:
                java.util.Objects.requireNonNull(r0)     // Catch: java.lang.Exception -> L2b
                java.util.concurrent.CopyOnWriteArraySet<v5.n$c<T>> r2 = r2.f25662d     // Catch: java.lang.Exception -> L2b
                v5.n$c r3 = new v5.n$c     // Catch: java.lang.Exception -> L2b
                r3.<init>(r0)     // Catch: java.lang.Exception -> L2b
                r2.add(r3)     // Catch: java.lang.Exception -> L2b
                goto L43
            L2b:
                r0 = move-exception
                java.lang.String r1 = "Cast is not available on this device. Exception thrown when attempting to obtain CastContext. "
                java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
                java.lang.String r0 = r0.getMessage()
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                java.lang.String r1 = "MusicService"
                android.util.Log.i(r1, r0)
                r1 = 0
            L43:
                return r1
        }
    }

    /* renamed from: qd.a$h */
    public static final class h extends p239nh.AbstractC4830j implements mh.InterfaceC4609a<p352u5.C6327p.a> {

        /* renamed from: Z */
        public final /* synthetic */ p292qd.ServiceC5617a f21847Z;

        public h(p292qd.ServiceC5617a r1) {
                r0 = this;
                r0.f21847Z = r1
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4609a
        /* renamed from: e */
        public p352u5.C6327p.a mo15e() {
                r3 = this;
                qd.a r0 = r3.f21847Z
                u5.q$b r1 = new u5.q$b
                r1.<init>()
                u5.p$a r2 = new u5.p$a
                r2.<init>(r0, r1)
                return r2
        }
    }

    /* renamed from: qd.a$i */
    public static final class i extends p239nh.AbstractC4830j implements mh.InterfaceC4609a<p088f4.InterfaceC2043s> {

        /* renamed from: Z */
        public final /* synthetic */ p292qd.ServiceC5617a f21848Z;

        public i(p292qd.ServiceC5617a r1) {
                r0 = this;
                r0.f21848Z = r1
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4609a
        /* renamed from: e */
        public p088f4.InterfaceC2043s mo15e() {
                r6 = this;
                f4.s$b r0 = new f4.s$b
                qd.a r1 = r6.f21848Z
                r0.<init>(r1)
                boolean r1 = r0.f9336r
                r2 = 1
                r1 = r1 ^ r2
                p371v5.C6549a.m13291e(r1)
                r0.f9336r = r2
                f4.j1 r1 = new f4.j1
                r1.<init>(r0)
                qd.a r0 = r6.f21848Z
                h4.d r3 = r0.f21827s0
                r1.m5277n0()
                boolean r4 = r1.f9047C
                if (r4 == 0) goto L21
                goto L6f
            L21:
                h4.d r4 = r1.f9069v
                boolean r4 = p371v5.C6552b0.m13308a(r4, r3)
                if (r4 != 0) goto L55
                r1.f9069v = r3
                r4 = 3
                r1.m5274k0(r2, r4, r3)
                f4.l1 r4 = r1.f9058k
                int r5 = r3.f11006a0
                int r5 = p371v5.C6552b0.m13327t(r5)
                r4.m5329c(r5)
                g4.p r4 = r1.f9055h
                r4.mo2885F(r3)
                java.util.concurrent.CopyOnWriteArraySet<f4.x0$e> r4 = r1.f9054g
                java.util.Iterator r4 = r4.iterator()
            L45:
                boolean r5 = r4.hasNext()
                if (r5 == 0) goto L55
                java.lang.Object r5 = r4.next()
                f4.x0$e r5 = (p088f4.InterfaceC2054x0.e) r5
                r5.mo2885F(r3)
                goto L45
            L55:
                f4.e r4 = r1.f9057j
                r4.m5186c(r3)
                boolean r3 = r1.mo2862u()
                f4.e r4 = r1.f9057j
                int r5 = r1.mo2850n()
                int r4 = r4.m5188e(r3, r5)
                int r5 = p088f4.C2019j1.m5271j0(r3, r4)
                r1.m5276m0(r3, r4, r5)
            L6f:
                r1.m5277n0()
                boolean r3 = r1.f9047C
                if (r3 == 0) goto L77
                goto L7c
            L77:
                f4.b r3 = r1.f9056i
                r3.m5109a(r2)
            L7c:
                qd.a$a r0 = r0.f21828t0
                java.util.Objects.requireNonNull(r0)
                f4.z r2 = r1.f9051d
                r2.m5448g0(r0)
                return r1
        }
    }

    /* renamed from: qd.a$j */
    public static final class j extends p239nh.AbstractC4830j implements mh.InterfaceC4620l<java.lang.Boolean, ch.C0985l> {

        /* renamed from: Z */
        public final /* synthetic */ p292qd.ServiceC5617a f21849Z;

        public j(p292qd.ServiceC5617a r1) {
                r0 = this;
                r0.f21849Z = r1
                r1 = 1
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4620l
        /* renamed from: b */
        public ch.C0985l mo107b(java.lang.Boolean r19) {
                r18 = this;
                r0 = r18
                r1 = r19
                java.lang.Boolean r1 = (java.lang.Boolean) r1
                r1.booleanValue()
                qd.a r1 = r0.f21849Z
                f4.x0 r2 = r1.f21817i0
                if (r2 == 0) goto L1af
                ch.d r1 = r1.f21824p0
                java.lang.Object r1 = r1.getValue()
                rd.b r1 = (p313rd.C5815b) r1
                qd.a r4 = r0.f21849Z
                rd.c r4 = r4.f21815g0
                java.lang.String r5 = "mediaSource"
                if (r4 == 0) goto L1a8
                java.util.Objects.requireNonNull(r1)
                java.lang.String r6 = "musicSource"
                p214m2.C4339q.m9706k(r4, r6)
                java.util.Map<java.lang.String, java.util.List<android.support.v4.media.MediaMetadataCompat>> r6 = r1.f22538c
                r6.clear()
                java.util.Map<java.lang.String, java.util.List<android.support.v4.media.MediaMetadataCompat>> r6 = r1.f22538c
                java.lang.String r7 = "/"
                java.lang.Object r6 = r6.get(r7)
                java.util.List r6 = (java.util.List) r6
                if (r6 != 0) goto L3d
                java.util.ArrayList r6 = new java.util.ArrayList
                r6.<init>()
            L3d:
                android.support.v4.media.MediaMetadataCompat$b r8 = new android.support.v4.media.MediaMetadataCompat$b
                r8.<init>()
                java.lang.String r9 = "android.media.metadata.MEDIA_ID"
                java.lang.String r10 = "__RECOMMENDED__"
                r8.m236d(r9, r10)
                android.content.Context r11 = r1.f22536a
                r12 = 2131951968(0x7f130160, float:1.9540365E38)
                java.lang.String r11 = r11.getString(r12)
                java.lang.String r12 = "android.media.metadata.TITLE"
                r8.m236d(r12, r11)
                java.lang.StringBuilder r11 = new java.lang.StringBuilder
                r11.<init>()
                java.lang.String r13 = "android.resource://io.tacocrypto.app/drawable/"
                r11.append(r13)
                android.content.Context r14 = r1.f22536a
                android.content.res.Resources r14 = r14.getResources()
                r15 = 2131231242(0x7f08020a, float:1.807856E38)
                java.lang.String r14 = r14.getResourceEntryName(r15)
                r11.append(r14)
                java.lang.String r11 = r11.toString()
                java.lang.String r14 = "android.media.metadata.ALBUM_ART_URI"
                r8.m236d(r14, r11)
                r11 = 1
                r15 = r4
                long r3 = (long) r11
                java.lang.String r11 = "io.tacocrypto.app.media.METADATA_KEY_UAMP_FLAGS"
                r8.m235c(r11, r3)
                android.support.v4.media.MediaMetadataCompat r8 = r8.m233a()
                r16 = r5
                android.support.v4.media.MediaMetadataCompat$b r5 = new android.support.v4.media.MediaMetadataCompat$b
                r5.<init>()
                java.lang.String r0 = "__ALBUMS__"
                r5.m236d(r9, r0)
                android.content.Context r0 = r1.f22536a
                r17 = r2
                r2 = 2131951648(0x7f130020, float:1.9539716E38)
                java.lang.String r0 = r0.getString(r2)
                r5.m236d(r12, r0)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r13)
                android.content.Context r2 = r1.f22536a
                android.content.res.Resources r2 = r2.getResources()
                r12 = 2131231008(0x7f080120, float:1.8078085E38)
                java.lang.String r2 = r2.getResourceEntryName(r12)
                r0.append(r2)
                java.lang.String r0 = r0.toString()
                r5.m236d(r14, r0)
                r5.m235c(r11, r3)
                android.support.v4.media.MediaMetadataCompat r0 = r5.m233a()
                r6.add(r8)
                r6.add(r0)
                java.util.Map<java.lang.String, java.util.List<android.support.v4.media.MediaMetadataCompat>> r0 = r1.f22538c
                r0.put(r7, r6)
                java.util.Iterator r0 = r15.iterator()
            Ld5:
                boolean r2 = r0.hasNext()
                if (r2 == 0) goto L14d
                java.lang.Object r2 = r0.next()
                android.support.v4.media.MediaMetadataCompat r2 = (android.support.v4.media.MediaMetadataCompat) r2
                java.lang.String r3 = "android.media.metadata.ALBUM"
                java.lang.String r3 = r2.m231e(r3)
                java.lang.String r4 = "UTF-8"
                boolean r5 = java.nio.charset.Charset.isSupported(r4)
                java.lang.String r6 = ""
                if (r5 == 0) goto Lfb
                if (r3 != 0) goto Lf4
                r3 = r6
            Lf4:
                java.lang.String r3 = java.net.URLEncoder.encode(r3, r4)
                java.lang.String r4 = "{\n        URLEncoder.enc\u2026his ?: \"\", \"UTF-8\")\n    }"
                goto L104
            Lfb:
                if (r3 != 0) goto Lfe
                r3 = r6
            Lfe:
                java.lang.String r3 = java.net.URLEncoder.encode(r3)
                java.lang.String r4 = "{\n        // If UTF-8 is\u2026.encode(this ?: \"\")\n    }"
            L104:
                p214m2.C4339q.m9705j(r3, r4)
                java.util.Map<java.lang.String, java.util.List<android.support.v4.media.MediaMetadataCompat>> r4 = r1.f22538c
                java.lang.Object r3 = r4.get(r3)
                java.util.List r3 = (java.util.List) r3
                if (r3 != 0) goto L115
                java.util.List r3 = r1.m12193a(r2)
            L115:
                r3.add(r2)
                java.util.Map<java.lang.String, java.util.List<android.support.v4.media.MediaMetadataCompat>> r3 = r1.f22538c
                java.lang.Object r3 = r3.get(r10)
                java.util.List r3 = (java.util.List) r3
                if (r3 != 0) goto L127
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>()
            L127:
                r3.add(r2)
                java.util.Map<java.lang.String, java.util.List<android.support.v4.media.MediaMetadataCompat>> r4 = r1.f22538c
                r4.put(r10, r3)
                java.lang.String r3 = r2.m231e(r9)
                java.lang.String r4 = r1.f22537b
                boolean r3 = p214m2.C4339q.m9702c(r3, r4)
                if (r3 == 0) goto Ld5
                java.util.Map<java.lang.String, java.util.List<android.support.v4.media.MediaMetadataCompat>> r3 = r1.f22538c
                r4 = 1
                android.support.v4.media.MediaMetadataCompat[] r5 = new android.support.v4.media.MediaMetadataCompat[r4]
                r6 = 0
                r5[r6] = r2
                java.util.List r2 = p074e9.C1805a.m4533r(r5)
                java.lang.String r5 = "__RECENT__"
                r3.put(r5, r2)
                goto Ld5
            L14d:
                boolean r0 = r17.mo2862u()
                if (r0 == 0) goto L18a
                r0 = r18
                qd.a r1 = r0.f21849Z
                rd.c r2 = r1.f21815g0
                if (r2 == 0) goto L185
                java.util.List r2 = p062dh.C1473i.m4007S(r2)
                qd.a r3 = r0.f21849Z
                rd.c r3 = r3.f21815g0
                if (r3 == 0) goto L180
                java.util.List r3 = p062dh.C1473i.m4007S(r3)
                int r4 = r17.mo5219R()
                java.lang.Object r3 = p062dh.C1473i.m3997I(r3, r4)
                android.support.v4.media.MediaMetadataCompat r3 = (android.support.v4.media.MediaMetadataCompat) r3
                boolean r4 = r17.mo2862u()
                long r5 = r17.mo2834W()
                r7 = 0
                r1.m11915i(r2, r3, r4, r5, r7)
                goto L18c
            L180:
                p214m2.C4339q.m9713w(r16)
                r1 = 0
                throw r1
            L185:
                r1 = 0
                p214m2.C4339q.m9713w(r16)
                throw r1
            L18a:
                r0 = r18
            L18c:
                r1 = 0
                qd.a r2 = r0.f21849Z
                java.util.Objects.requireNonNull(r2)
                c1.a$d r2 = r2.f4517Y
                c1.a$e r2 = (p031c1.AbstractServiceC0833a.e) r2
                r2.mo2507b(r10, r1)
                c1.a r3 = r2.f4541d
                c1.a$n r3 = r3.f4521c0
                c1.e r4 = new c1.e
                r4.<init>(r2, r10, r1)
                r3.post(r4)
                ch.l r1 = ch.C0985l.f5061a
                return r1
            L1a8:
                r16 = r5
                r1 = 0
                p214m2.C4339q.m9713w(r16)
                throw r1
            L1af:
                r1 = 0
                java.lang.String r2 = "currentPlayer"
                p214m2.C4339q.m9713w(r2)
                throw r1
        }
    }

    /* renamed from: qd.a$k */
    public static final class k extends p239nh.AbstractC4830j implements mh.InterfaceC4620l<java.lang.Boolean, ch.C0985l> {

        /* renamed from: Z */
        public final /* synthetic */ p292qd.ServiceC5617a f21850Z;

        /* renamed from: a0 */
        public final /* synthetic */ java.lang.String f21851a0;

        /* renamed from: b0 */
        public final /* synthetic */ p031c1.AbstractServiceC0833a.i<java.util.List<android.support.v4.media.MediaBrowserCompat.MediaItem>> f21852b0;

        public k(p292qd.ServiceC5617a r1, java.lang.String r2, p031c1.AbstractServiceC0833a.i<java.util.List<android.support.v4.media.MediaBrowserCompat.MediaItem>> r3) {
                r0 = this;
                r0.f21850Z = r1
                r0.f21851a0 = r2
                r0.f21852b0 = r3
                r1 = 1
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4620l
        /* renamed from: b */
        public ch.C0985l mo107b(java.lang.Boolean r8) {
                r7 = this;
                java.lang.Boolean r8 = (java.lang.Boolean) r8
                boolean r8 = r8.booleanValue()
                r0 = 0
                if (r8 == 0) goto L5a
                qd.a r8 = r7.f21850Z
                ch.d r8 = r8.f21824p0
                java.lang.Object r8 = r8.getValue()
                rd.b r8 = (p313rd.C5815b) r8
                java.lang.String r1 = r7.f21851a0
                java.util.Objects.requireNonNull(r8)
                java.lang.String r2 = "mediaId"
                p214m2.C4339q.m9706k(r1, r2)
                java.util.Map<java.lang.String, java.util.List<android.support.v4.media.MediaMetadataCompat>> r8 = r8.f22538c
                java.lang.Object r8 = r8.get(r1)
                java.util.List r8 = (java.util.List) r8
                if (r8 == 0) goto L6d
                java.util.ArrayList r0 = new java.util.ArrayList
                r1 = 10
                int r1 = p062dh.C1469e.m3992D(r8, r1)
                r0.<init>(r1)
                java.util.Iterator r8 = r8.iterator()
            L36:
                boolean r1 = r8.hasNext()
                if (r1 == 0) goto L6d
                java.lang.Object r1 = r8.next()
                android.support.v4.media.MediaMetadataCompat r1 = (android.support.v4.media.MediaMetadataCompat) r1
                android.support.v4.media.MediaBrowserCompat$MediaItem r2 = new android.support.v4.media.MediaBrowserCompat$MediaItem
                android.support.v4.media.MediaDescriptionCompat r3 = r1.m230d()
                android.os.Bundle r1 = r1.f498Y
                r4 = 0
                java.lang.String r6 = "io.tacocrypto.app.media.METADATA_KEY_UAMP_FLAGS"
                long r4 = r1.getLong(r6, r4)
                int r1 = (int) r4
                r2.<init>(r3, r1)
                r0.add(r2)
                goto L36
            L5a:
                qd.a r8 = r7.f21850Z
                android.support.v4.media.session.MediaSessionCompat r8 = r8.m11913g()
                java.lang.String r1 = "io.tacocrypto.app.media.session.NETWORK_FAILURE"
                boolean r2 = android.text.TextUtils.isEmpty(r1)
                if (r2 != 0) goto L75
                android.support.v4.media.session.MediaSessionCompat$b r8 = r8.f523a
                r8.mo331c(r1, r0)
            L6d:
                c1.a$i<java.util.List<android.support.v4.media.MediaBrowserCompat$MediaItem>> r8 = r7.f21852b0
                r8.m2510d(r0)
                ch.l r8 = ch.C0985l.f5061a
                return r8
            L75:
                java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "event cannot be null or empty"
                r8.<init>(r0)
                throw r8
        }
    }

    @p134hh.InterfaceC3044e(m7451c = "io.tacocrypto.app.media.MusicService$saveRecentSongToStorage$1", m7452f = "MusicService.kt", m7453l = {465}, m7454m = "invokeSuspend")
    /* renamed from: qd.a$l */
    public static final class l extends p134hh.AbstractC3048i implements mh.InterfaceC4624p<p379vh.InterfaceC6686b0, p101fh.InterfaceC2172d<? super ch.C0985l>, java.lang.Object> {

        /* renamed from: c0 */
        public int f21853c0;

        /* renamed from: d0 */
        public final /* synthetic */ p292qd.ServiceC5617a f21854d0;

        /* renamed from: e0 */
        public final /* synthetic */ android.support.v4.media.MediaDescriptionCompat f21855e0;

        /* renamed from: f0 */
        public final /* synthetic */ long f21856f0;

        public l(p292qd.ServiceC5617a r1, android.support.v4.media.MediaDescriptionCompat r2, long r3, p101fh.InterfaceC2172d<? super p292qd.ServiceC5617a.l> r5) {
                r0 = this;
                r0.f21854d0 = r1
                r0.f21855e0 = r2
                r0.f21856f0 = r3
                r1 = 2
                r0.<init>(r1, r5)
                return
        }

        @Override // p134hh.AbstractC3040a
        /* renamed from: h */
        public final p101fh.InterfaceC2172d<ch.C0985l> mo121h(java.lang.Object r7, p101fh.InterfaceC2172d<?> r8) {
                r6 = this;
                qd.a$l r7 = new qd.a$l
                qd.a r1 = r6.f21854d0
                android.support.v4.media.MediaDescriptionCompat r2 = r6.f21855e0
                long r3 = r6.f21856f0
                r0 = r7
                r5 = r8
                r0.<init>(r1, r2, r3, r5)
                return r7
        }

        @Override // mh.InterfaceC4624p
        /* renamed from: l */
        public java.lang.Object mo122l(p379vh.InterfaceC6686b0 r7, p101fh.InterfaceC2172d<? super ch.C0985l> r8) {
                r6 = this;
                vh.b0 r7 = (p379vh.InterfaceC6686b0) r7
                r5 = r8
                fh.d r5 = (p101fh.InterfaceC2172d) r5
                qd.a$l r7 = new qd.a$l
                qd.a r1 = r6.f21854d0
                android.support.v4.media.MediaDescriptionCompat r2 = r6.f21855e0
                long r3 = r6.f21856f0
                r0 = r7
                r0.<init>(r1, r2, r3, r5)
                ch.l r8 = ch.C0985l.f5061a
                java.lang.Object r7 = r7.mo123o(r8)
                return r7
        }

        @Override // p134hh.AbstractC3040a
        /* renamed from: o */
        public final java.lang.Object mo123o(java.lang.Object r10) {
                r9 = this;
                gh.a r0 = gh.EnumC2389a.f10764Y
                int r1 = r9.f21853c0
                r2 = 1
                if (r1 == 0) goto L15
                if (r1 != r2) goto Ld
                p074e9.C1805a.m4540y(r10)
                goto L3e
            Ld:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L15:
                p074e9.C1805a.m4540y(r10)
                qd.a r10 = r9.f21854d0
                qd.g r5 = r10.f21823o0
                if (r5 == 0) goto L41
                android.support.v4.media.MediaDescriptionCompat r4 = r9.f21855e0
                java.lang.String r10 = "description"
                p214m2.C4339q.m9705j(r4, r10)
                long r6 = r9.f21856f0
                r9.f21853c0 = r2
                vh.z r10 = p379vh.C6716l0.f26008b
                qd.h r1 = new qd.h
                r8 = 0
                r3 = r1
                r3.<init>(r4, r5, r6, r8)
                java.lang.Object r10 = p101fh.C2174f.m5710A(r10, r1, r9)
                if (r10 != r0) goto L39
                goto L3b
            L39:
                ch.l r10 = ch.C0985l.f5061a
            L3b:
                if (r10 != r0) goto L3e
                return r0
            L3e:
                ch.l r10 = ch.C0985l.f5061a
                return r10
            L41:
                java.lang.String r10 = "storage"
                p214m2.C4339q.m9713w(r10)
                r10 = 0
                throw r10
        }
    }

    public ServiceC5617a() {
            r7 = this;
            r7.<init>()
            r0 = 0
            r1 = 1
            vh.r r0 = p209lh.C4304a.m9607a(r0, r1)
            r7.f21818j0 = r0
            vh.z r1 = p379vh.C6716l0.f26007a
            vh.k1 r1 = p459zh.C7346l.f28106a
            fh.g r0 = r1.plus(r0)
            vh.b0 r0 = p101fh.C2174f.m5711a(r0)
            r7.f21819k0 = r0
            dh.k r0 = p062dh.C1475k.f7237Y
            r7.f21822n0 = r0
            qd.a$f r0 = new qd.a$f
            r0.<init>(r7)
            ch.d r0 = p185k7.C4038x4.m9096i(r0)
            r7.f21824p0 = r0
            qd.a$h r0 = new qd.a$h
            r0.<init>(r7)
            ch.d r0 = p185k7.C4038x4.m9096i(r0)
            r7.f21825q0 = r0
            h4.d r0 = new h4.d
            r2 = 2
            r3 = 0
            r4 = 1
            r5 = 1
            r6 = 0
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            r7.f21827s0 = r0
            qd.a$a r0 = new qd.a$a
            r0.<init>(r7)
            r7.f21828t0 = r0
            qd.a$i r0 = new qd.a$i
            r0.<init>(r7)
            ch.d r0 = p185k7.C4038x4.m9096i(r0)
            r7.f21829u0 = r0
            qd.a$g r0 = new qd.a$g
            r0.<init>(r7)
            ch.d r0 = p185k7.C4038x4.m9096i(r0)
            r7.f21830v0 = r0
            return
    }

    /* renamed from: j */
    public static /* synthetic */ void m11910j(p292qd.ServiceC5617a r7, java.util.List r8, android.support.v4.media.MediaMetadataCompat r9, boolean r10, long r11, boolean r13, int r14, java.lang.Object r15) {
            r14 = r14 & 16
            if (r14 == 0) goto L7
            r13 = 1
            r6 = 1
            goto L8
        L7:
            r6 = r13
        L8:
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r0.m11915i(r1, r2, r3, r4, r6)
            return
    }

    @Override // p031c1.AbstractServiceC0833a
    /* renamed from: b */
    public p031c1.AbstractServiceC0833a.b mo2502b(java.lang.String r20, int r21, android.os.Bundle r22) {
            r19 = this;
            r0 = r19
            r7 = r20
            r8 = r21
            r9 = r22
            java.lang.String r1 = "clientPackageName"
            p214m2.C4339q.m9706k(r7, r1)
            qd.e r10 = r0.f21816h0
            if (r10 == 0) goto L16d
            java.util.Map<java.lang.String, ch.e<java.lang.Integer, java.lang.Boolean>> r1 = r10.f21869e
            java.lang.Object r1 = r1.get(r7)
            ch.e r1 = (ch.C0978e) r1
            r12 = 0
            if (r1 != 0) goto L27
            ch.e r1 = new ch.e
            java.lang.Integer r2 = java.lang.Integer.valueOf(r12)
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            r1.<init>(r2, r3)
        L27:
            A r2 = r1.f5050Y
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            B r1 = r1.f5051Z
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r13 = 2
            r14 = 1
            if (r2 != r8) goto L3d
            goto L111
        L3d:
            android.content.pm.PackageManager r1 = r10.f21866b
            r2 = 4160(0x1040, float:5.83E-42)
            android.content.pm.PackageInfo r1 = r1.getPackageInfo(r7, r2)
            if (r1 != 0) goto L49
            r11 = 0
            goto L8b
        L49:
            android.content.pm.ApplicationInfo r2 = r1.applicationInfo
            android.content.pm.PackageManager r3 = r10.f21866b
            java.lang.CharSequence r2 = r2.loadLabel(r3)
            java.lang.String r2 = r2.toString()
            android.content.pm.ApplicationInfo r3 = r1.applicationInfo
            int r4 = r3.uid
            java.lang.String r5 = r10.m11920a(r1)
            java.lang.String[] r3 = r1.requestedPermissions
            int[] r1 = r1.requestedPermissionsFlags
            java.util.LinkedHashSet r6 = new java.util.LinkedHashSet
            r6.<init>()
            if (r3 == 0) goto L7f
            int r15 = r3.length
            r16 = 0
        L6b:
            if (r12 >= r15) goto L7f
            r11 = r3[r12]
            int r18 = r16 + 1
            r16 = r1[r16]
            r16 = r16 & 2
            if (r16 == 0) goto L7a
            r6.add(r11)
        L7a:
            int r12 = r12 + 1
            r16 = r18
            goto L6b
        L7f:
            qd.e$a r11 = new qd.e$a
            java.util.Set r6 = p062dh.C1473i.m4011W(r6)
            r1 = r11
            r3 = r20
            r1.<init>(r2, r3, r4, r5, r6)
        L8b:
            if (r11 == 0) goto L165
            int r1 = r11.f21872c
            if (r1 != r8) goto L15d
            java.lang.String r1 = r11.f21873d
            java.util.Map<java.lang.String, qd.e$b> r2 = r10.f21867c
            java.lang.Object r2 = r2.get(r7)
            qd.e$b r2 = (p292qd.C5621e.b) r2
            if (r2 == 0) goto Lc4
            java.util.Set<qd.e$c> r2 = r2.f21877c
            if (r2 == 0) goto Lc4
            java.util.Iterator r2 = r2.iterator()
        La5:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto Lbc
            java.lang.Object r3 = r2.next()
            qd.e$c r3 = (p292qd.C5621e.c) r3
            java.lang.String r4 = r3.f21878a
            boolean r4 = p214m2.C4339q.m9702c(r4, r1)
            if (r4 == 0) goto La5
            r17 = r3
            goto Lc6
        Lbc:
            java.util.NoSuchElementException r1 = new java.util.NoSuchElementException
            java.lang.String r2 = "Collection contains no element matching the predicate."
            r1.<init>(r2)
            throw r1
        Lc4:
            r17 = 0
        Lc6:
            if (r17 == 0) goto Lca
            r2 = 1
            goto Lcb
        Lca:
            r2 = 0
        Lcb:
            int r3 = android.os.Process.myUid()
            if (r8 != r3) goto Ld2
            goto Lfc
        Ld2:
            if (r2 == 0) goto Ld5
            goto Lfc
        Ld5:
            r2 = 1000(0x3e8, float:1.401E-42)
            if (r8 != r2) goto Lda
            goto Lfc
        Lda:
            java.lang.String r2 = r10.f21868d
            boolean r1 = p214m2.C4339q.m9702c(r1, r2)
            if (r1 == 0) goto Le3
            goto Lfc
        Le3:
            java.util.Set<java.lang.String> r1 = r11.f21874e
            java.lang.String r2 = "android.permission.MEDIA_CONTENT_CONTROL"
            boolean r1 = r1.contains(r2)
            if (r1 == 0) goto Lee
            goto Lfc
        Lee:
            android.content.Context r1 = r10.f21865a
            java.util.Set r1 = p030c0.C0830q.m2495a(r1)
            java.lang.String r2 = r11.f21871b
            boolean r1 = r1.contains(r2)
            if (r1 == 0) goto Lfe
        Lfc:
            r1 = 1
            goto Lff
        Lfe:
            r1 = 0
        Lff:
            java.util.Map<java.lang.String, ch.e<java.lang.Integer, java.lang.Boolean>> r2 = r10.f21869e
            ch.e r3 = new ch.e
            java.lang.Integer r4 = java.lang.Integer.valueOf(r21)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r1)
            r3.<init>(r4, r5)
            r2.put(r7, r3)
        L111:
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            if (r1 != 0) goto L127
            ch.d r3 = r0.f21824p0
            java.lang.Object r3 = r3.getValue()
            rd.b r3 = (p313rd.C5815b) r3
            boolean r3 = r3.f22539d
            if (r3 == 0) goto L125
            goto L127
        L125:
            r3 = 0
            goto L128
        L127:
            r3 = 1
        L128:
            java.lang.String r4 = "android.media.browse.SEARCH_SUPPORTED"
            r2.putBoolean(r4, r3)
            java.lang.String r3 = "android.media.browse.CONTENT_STYLE_SUPPORTED"
            r2.putBoolean(r3, r14)
            java.lang.String r3 = "android.media.browse.CONTENT_STYLE_BROWSABLE_HINT"
            r2.putInt(r3, r13)
            java.lang.String r3 = "android.media.browse.CONTENT_STYLE_PLAYABLE_HINT"
            r2.putInt(r3, r14)
            if (r1 == 0) goto L155
            if (r9 == 0) goto L147
            java.lang.String r1 = "android.service.media.extra.RECENT"
            boolean r12 = r9.getBoolean(r1)
            goto L148
        L147:
            r12 = 0
        L148:
            if (r12 == 0) goto L14d
            java.lang.String r1 = "__RECENT__"
            goto L14f
        L14d:
            java.lang.String r1 = "/"
        L14f:
            c1.a$b r3 = new c1.a$b
            r3.<init>(r1, r2)
            goto L15c
        L155:
            c1.a$b r3 = new c1.a$b
            java.lang.String r1 = "@empty@"
            r3.<init>(r1, r2)
        L15c:
            return r3
        L15d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Caller's package UID doesn't match caller's actual UID?"
            r1.<init>(r2)
            throw r1
        L165:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Caller wasn't found in the system?"
            r1.<init>(r2)
            throw r1
        L16d:
            java.lang.String r1 = "packageValidator"
            p214m2.C4339q.m9713w(r1)
            r1 = 0
            throw r1
    }

    @Override // p031c1.AbstractServiceC0833a
    /* renamed from: c */
    public void mo2503c(java.lang.String r3, p031c1.AbstractServiceC0833a.i<java.util.List<android.support.v4.media.MediaBrowserCompat.MediaItem>> r4) {
            r2 = this;
            java.lang.String r0 = "parentMediaId"
            p214m2.C4339q.m9706k(r3, r0)
            java.lang.String r0 = "__RECENT__"
            boolean r0 = p214m2.C4339q.m9702c(r3, r0)
            r1 = 0
            if (r0 == 0) goto L26
            qd.g r3 = r2.f21823o0
            if (r3 == 0) goto L20
            android.support.v4.media.MediaBrowserCompat$MediaItem r3 = r3.m11924a()
            if (r3 == 0) goto L1c
            java.util.List r1 = p074e9.C1805a.m4528m(r3)
        L1c:
            r4.m2510d(r1)
            goto L38
        L20:
            java.lang.String r3 = "storage"
            p214m2.C4339q.m9713w(r3)
            throw r1
        L26:
            rd.c r0 = r2.f21815g0
            if (r0 == 0) goto L39
            qd.a$k r1 = new qd.a$k
            r1.<init>(r2, r3, r4)
            boolean r3 = r0.mo12191o(r1)
            if (r3 != 0) goto L38
            r4.mo2508a()
        L38:
            return
        L39:
            java.lang.String r3 = "mediaSource"
            p214m2.C4339q.m9713w(r3)
            throw r1
    }

    /* renamed from: e */
    public final com.google.android.exoplayer2.ext.cast.C1045a m11911e() {
            r1 = this;
            ch.d r0 = r1.f21830v0
            java.lang.Object r0 = r0.getValue()
            com.google.android.exoplayer2.ext.cast.a r0 = (com.google.android.exoplayer2.ext.cast.C1045a) r0
            return r0
    }

    /* renamed from: f */
    public final p088f4.InterfaceC2043s m11912f() {
            r1 = this;
            ch.d r0 = r1.f21829u0
            java.lang.Object r0 = r0.getValue()
            f4.s r0 = (p088f4.InterfaceC2043s) r0
            return r0
    }

    /* renamed from: g */
    public final android.support.v4.media.session.MediaSessionCompat m11913g() {
            r1 = this;
            android.support.v4.media.session.MediaSessionCompat r0 = r1.f21820l0
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.String r0 = "mediaSession"
            p214m2.C4339q.m9713w(r0)
            r0 = 0
            throw r0
    }

    /* renamed from: h */
    public final p199l4.C4178a m11914h() {
            r1 = this;
            l4.a r0 = r1.f21821m0
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.String r0 = "mediaSessionConnector"
            p214m2.C4339q.m9713w(r0)
            r0 = 0
            throw r0
    }

    /* renamed from: i */
    public final void m11915i(java.util.List<android.support.v4.media.MediaMetadataCompat> r33, android.support.v4.media.MediaMetadataCompat r34, boolean r35, long r36, boolean r38) {
            r32 = this;
            r1 = r32
            r0 = r33
            r2 = 0
            if (r34 != 0) goto L9
            r3 = 0
            goto Ld
        L9:
            int r3 = r33.indexOf(r34)
        Ld:
            r1.f21822n0 = r0
            f4.x0 r4 = r1.f21817i0
            r5 = 0
            if (r4 == 0) goto L309
            r6 = r35
            r4.mo2839g(r6)
            f4.x0 r4 = r1.f21817i0
            if (r4 == 0) goto L303
            r6 = 1
            r4.mo2864y(r6)
            f4.x0 r4 = r1.f21817i0
            if (r4 == 0) goto L2fd
            f4.s r7 = r32.m11912f()
            boolean r4 = p214m2.C4339q.m9702c(r4, r7)
            if (r4 == 0) goto L143
            ch.d r4 = r1.f21825q0
            java.lang.Object r4 = r4.getValue()
            u5.p$a r4 = (p352u5.C6327p.a) r4
            java.lang.String r7 = "<this>"
            p214m2.C4339q.m9706k(r0, r7)
            java.lang.String r7 = "dataSourceFactory"
            p214m2.C4339q.m9706k(r4, r7)
            g5.f r15 = new g5.f
            g5.r[] r7 = new p108g5.InterfaceC2283r[r2]
            r15.<init>(r7)
            java.util.Iterator r0 = r33.iterator()
        L4c:
            boolean r7 = r0.hasNext()
            if (r7 == 0) goto L129
            java.lang.Object r7 = r0.next()
            android.support.v4.media.MediaMetadataCompat r7 = (android.support.v4.media.MediaMetadataCompat) r7
            java.lang.String r8 = "<this>"
            p214m2.C4339q.m9706k(r7, r8)
            java.lang.String r8 = "dataSourceFactory"
            p214m2.C4339q.m9706k(r4, r8)
            m4.g r8 = new m4.g
            r8.<init>()
            u3.b r10 = new u3.b
            r10.<init>(r8)
            j4.c r8 = new j4.c
            r8.<init>()
            u5.s r12 = new u5.s
            r12.<init>()
            r13 = 1048576(0x100000, float:1.469368E-39)
            java.lang.String r9 = "android.media.metadata.MEDIA_URI"
            java.lang.String r7 = r7.m231e(r9)
            android.net.Uri r17 = p185k7.C3828h5.m8579H(r7)
            f4.j0$d$a r7 = new f4.j0$d$a
            r7.<init>()
            f4.j0$f$a r9 = new f4.j0$f$a
            r9.<init>(r5)
            java.util.List r21 = java.util.Collections.emptyList()
            b9.n<java.lang.Object> r23 = p026b9.C0693c0.f3898c0
            f4.j0$g$a r11 = new f4.j0$g$a
            r11.<init>()
            android.net.Uri r14 = r9.f9007b
            if (r14 == 0) goto La2
            java.util.UUID r14 = r9.f9006a
            if (r14 == 0) goto La0
            goto La2
        La0:
            r14 = 0
            goto La3
        La2:
            r14 = 1
        La3:
            p371v5.C6549a.m13291e(r14)
            f4.j0$i r27 = new f4.j0$i
            java.util.UUID r14 = r9.f9006a
            if (r14 == 0) goto Lb2
            f4.j0$f r14 = new f4.j0$f
            r14.<init>(r9, r5)
            goto Lb3
        Lb2:
            r14 = r5
        Lb3:
            r20 = 0
            r25 = 0
            r18 = 0
            r22 = 0
            r24 = 0
            r16 = r27
            r19 = r14
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25)
            f4.j0 r9 = new f4.j0
            java.lang.String r25 = ""
            f4.j0$e r26 = r7.m5265a()
            f4.j0$g r7 = new f4.j0$g
            r7.<init>(r11, r5)
            f4.k0 r29 = p088f4.C2021k0.f9094F0
            r30 = 0
            r24 = r9
            r28 = r7
            r24.<init>(r25, r26, r27, r28, r29, r30)
            g5.z r16 = new g5.z
            if (r14 == 0) goto L105
            int r7 = p371v5.C6552b0.f25624a
            r11 = 18
            if (r7 >= r11) goto Le7
            goto L105
        Le7:
            java.lang.Object r7 = r8.f14723a
            monitor-enter(r7)
            f4.j0$f r11 = r8.f14724b     // Catch: java.lang.Throwable -> L102
            boolean r11 = p371v5.C6552b0.m13308a(r14, r11)     // Catch: java.lang.Throwable -> L102
            if (r11 != 0) goto Lfa
            r8.f14724b = r14     // Catch: java.lang.Throwable -> L102
            j4.j r11 = r8.m7820a(r14)     // Catch: java.lang.Throwable -> L102
            r8.f14725c = r11     // Catch: java.lang.Throwable -> L102
        Lfa:
            j4.j r8 = r8.f14725c     // Catch: java.lang.Throwable -> L102
            java.util.Objects.requireNonNull(r8)     // Catch: java.lang.Throwable -> L102
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L102
            r11 = r8
            goto L108
        L102:
            r0 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L102
            throw r0
        L105:
            j4.j r7 = p162j4.InterfaceC3405j.f14748a
            r11 = r7
        L108:
            r14 = 0
            r7 = r16
            r8 = r9
            r9 = r4
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            monitor-enter(r15)
            java.util.List<g5.f$e> r7 = r15.f10334j     // Catch: java.lang.Throwable -> L126
            int r7 = r7.size()     // Catch: java.lang.Throwable -> L126
            monitor-enter(r15)     // Catch: java.lang.Throwable -> L126
            java.util.List r8 = java.util.Collections.singletonList(r16)     // Catch: java.lang.Throwable -> L123
            r15.m6013y(r7, r8, r5, r5)     // Catch: java.lang.Throwable -> L123
            monitor-exit(r15)     // Catch: java.lang.Throwable -> L126
            monitor-exit(r15)
            goto L4c
        L123:
            r0 = move-exception
            monitor-exit(r15)     // Catch: java.lang.Throwable -> L126
            throw r0     // Catch: java.lang.Throwable -> L126
        L126:
            r0 = move-exception
            monitor-exit(r15)
            throw r0
        L129:
            f4.s r0 = r32.m11912f()
            r2 = r38
            r0.mo5272a(r15, r2)
            f4.s r0 = r32.m11912f()
            r0.mo2852o()
            f4.s r0 = r32.m11912f()
            r4 = r36
            r0.mo2857r(r3, r4)
            return
        L143:
            java.util.ArrayList r3 = new java.util.ArrayList
            r4 = 10
            int r4 = p062dh.C1469e.m3992D(r0, r4)
            r3.<init>(r4)
            java.util.Iterator r0 = r33.iterator()
        L152:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L2de
            java.lang.Object r4 = r0.next()
            android.support.v4.media.MediaMetadataCompat r4 = (android.support.v4.media.MediaMetadataCompat) r4
            java.lang.String r5 = "<this>"
            p214m2.C4339q.m9706k(r4, r5)
            c6.k r5 = new c6.k
            r7 = 3
            r5.<init>(r7)
            java.lang.String r7 = "android.media.metadata.TITLE"
            java.lang.String r7 = r4.m231e(r7)
            java.lang.String r8 = "com.google.android.gms.cast.metadata.TITLE"
            r5.m2601Z(r8, r7)
            java.lang.String r7 = "android.media.metadata.ARTIST"
            java.lang.String r7 = r4.m231e(r7)
            java.lang.String r8 = "com.google.android.gms.cast.metadata.ARTIST"
            r5.m2601Z(r8, r7)
            java.lang.String r7 = "android.media.metadata.ALBUM"
            java.lang.String r7 = r4.m231e(r7)
            java.lang.String r8 = "com.google.android.gms.cast.metadata.ALBUM_TITLE"
            r5.m2601Z(r8, r7)
            n6.a r7 = new n6.a
            java.lang.String r8 = "android.media.metadata.ALBUM_ART_URI"
            java.lang.String r8 = r4.m231e(r8)
            android.net.Uri r8 = p185k7.C3828h5.m8579H(r8)
            r7.<init>(r8, r2, r2)
            java.util.List<n6.a> r8 = r5.f4793Y
            r8.add(r7)
            n6.a r7 = new n6.a
            java.lang.String r8 = "android.media.metadata.DISPLAY_ICON_URI"
            java.lang.String r8 = r4.m231e(r8)
            android.net.Uri r8 = p185k7.C3828h5.m8579H(r8)
            r7.<init>(r8, r2, r2)
            java.util.List<n6.a> r8 = r5.f4793Y
            r8.add(r7)
            java.lang.String r7 = "android.media.metadata.ALBUM_ARTIST"
            java.lang.String r7 = r4.m231e(r7)
            java.lang.String r8 = "com.google.android.gms.cast.metadata.ALBUM_ARTIST"
            r5.m2601Z(r8, r7)
            java.lang.String r7 = "android.media.metadata.COMPOSER"
            java.lang.String r7 = r4.m231e(r7)
            java.lang.String r8 = "com.google.android.gms.cast.metadata.COMPOSER"
            r5.m2601Z(r8, r7)
            java.lang.String r7 = "android.media.metadata.DATE"
            java.lang.String r7 = r4.m231e(r7)
            if (r7 == 0) goto L1d5
            java.lang.String r8 = "com.google.android.gms.cast.metadata.RELEASE_DATE"
            r5.m2601Z(r8, r7)
        L1d5:
            java.lang.String r7 = "com.google.android.gms.cast.metadata.TRACK_NUMBER"
            android.os.Bundle r8 = r4.f498Y
            java.lang.String r9 = "android.media.metadata.TRACK_NUMBER"
            r10 = 0
            long r8 = r8.getLong(r9, r10)
            int r9 = (int) r8
            r8 = 2
            p036c6.C0893k.m2598a0(r7, r8)
            android.os.Bundle r12 = r5.f4794Z
            r12.putInt(r7, r9)
            java.lang.String r7 = "com.google.android.gms.cast.metadata.DISC_NUMBER"
            android.os.Bundle r9 = r4.f498Y
            java.lang.String r12 = "android.media.metadata.DISC_NUMBER"
            long r12 = r9.getLong(r12, r10)
            int r9 = (int) r12
            p036c6.C0893k.m2598a0(r7, r8)
            android.os.Bundle r8 = r5.f4794Z
            r8.putInt(r7, r9)
            java.lang.String r7 = "android.media.metadata.MEDIA_URI"
            java.lang.String r7 = r4.m231e(r7)
            android.net.Uri r7 = p185k7.C3828h5.m8579H(r7)
            java.lang.String r7 = r7.toString()
            r13 = r7
            com.google.android.gms.cast.MediaInfo r8 = new com.google.android.gms.cast.MediaInfo
            r12 = r8
            r14 = -1
            r15 = 0
            r16 = 0
            r17 = -1
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = -1
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r12.<init>(r13, r14, r15, r16, r17, r19, r20, r21, r22, r23, r24, r25, r26, r28, r29, r30, r31)
            if (r7 == 0) goto L2d6
            com.google.android.gms.cast.MediaInfo$a r7 = r8.f5391q0
            java.util.Objects.requireNonNull(r7)
            com.google.android.gms.cast.MediaInfo r7 = r7.f5392a
            r7.f5374Z = r6
            com.google.android.gms.cast.MediaInfo$a r7 = r8.f5391q0
            com.google.android.gms.cast.MediaInfo r7 = r7.f5392a
            java.lang.String r9 = "audio/mpeg"
            r7.f5375a0 = r9
            android.os.Bundle r4 = r4.f498Y
            java.lang.String r7 = "android.media.metadata.DURATION"
            long r12 = r4.getLong(r7, r10)
            com.google.android.gms.cast.MediaInfo$a r4 = r8.f5391q0
            java.util.Objects.requireNonNull(r4)
            int r7 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r7 >= 0) goto L264
            r9 = -1
            int r7 = (r12 > r9 ? 1 : (r12 == r9 ? 0 : -1))
            if (r7 != 0) goto L25c
            goto L264
        L25c:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Invalid stream duration"
            r0.<init>(r2)
            throw r0
        L264:
            com.google.android.gms.cast.MediaInfo r4 = r4.f5392a
            r4.f5377c0 = r12
            com.google.android.gms.cast.MediaInfo$a r4 = r8.f5391q0
            com.google.android.gms.cast.MediaInfo r4 = r4.f5392a
            r4.f5376b0 = r5
            c6.n r4 = new c6.n
            r14 = 0
            r15 = 1
            r16 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            r18 = 9218868437227405312(0x7ff0000000000000, double:Infinity)
            r20 = 0
            r22 = 0
            r23 = 0
            r12 = r4
            r13 = r8
            r12.<init>(r13, r14, r15, r16, r18, r20, r22, r23)
            com.google.android.gms.cast.MediaInfo r5 = r4.f4811Y
            if (r5 == 0) goto L2ce
            double r7 = r4.f4814b0
            boolean r5 = java.lang.Double.isNaN(r7)
            r7 = 0
            if (r5 != 0) goto L29e
            double r9 = r4.f4814b0
            int r5 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r5 < 0) goto L296
            goto L29e
        L296:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "startTime cannot be negative or NaN."
            r0.<init>(r2)
            throw r0
        L29e:
            double r9 = r4.f4815c0
            boolean r5 = java.lang.Double.isNaN(r9)
            if (r5 != 0) goto L2c6
            double r9 = r4.f4816d0
            boolean r5 = java.lang.Double.isNaN(r9)
            if (r5 != 0) goto L2be
            double r9 = r4.f4816d0
            int r5 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r5 < 0) goto L2be
            java.lang.String r5 = "Builder(mediaInfo).build()"
            p214m2.C4339q.m9705j(r4, r5)
            r3.add(r4)
            goto L152
        L2be:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "preloadTime cannot be negative or Nan."
            r0.<init>(r2)
            throw r0
        L2c6:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "playbackDuration cannot be NaN."
            r0.<init>(r2)
            throw r0
        L2ce:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "media cannot be null."
            r0.<init>(r2)
            throw r0
        L2d6:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "contentID cannot be null"
            r0.<init>(r2)
            throw r0
        L2de:
            c6.n[] r0 = new p036c6.C0899n[r2]
            java.lang.Object[] r0 = r3.toArray(r0)
            java.lang.String r3 = "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"
            java.util.Objects.requireNonNull(r0, r3)
            c6.n[] r0 = (p036c6.C0899n[]) r0
            com.google.android.exoplayer2.ext.cast.a r0 = r32.m11911e()
            p214m2.C4339q.m9704i(r0)
            r0.mo2855q(r2)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "castPlayer setMediaItems"
            r0.<init>(r2)
            throw r0
        L2fd:
            java.lang.String r0 = "currentPlayer"
            p214m2.C4339q.m9713w(r0)
            throw r5
        L303:
            java.lang.String r0 = "currentPlayer"
            p214m2.C4339q.m9713w(r0)
            throw r5
        L309:
            java.lang.String r0 = "currentPlayer"
            p214m2.C4339q.m9713w(r0)
            throw r5
    }

    /* renamed from: k */
    public final void m11916k() {
            r10 = this;
            java.util.List<android.support.v4.media.MediaMetadataCompat> r0 = r10.f21822n0
            f4.x0 r1 = r10.f21817i0
            r2 = 0
            java.lang.String r3 = "currentPlayer"
            if (r1 == 0) goto L35
            int r1 = r1.mo5219R()
            java.lang.Object r0 = r0.get(r1)
            android.support.v4.media.MediaMetadataCompat r0 = (android.support.v4.media.MediaMetadataCompat) r0
            android.support.v4.media.MediaDescriptionCompat r6 = r0.m230d()
            f4.x0 r0 = r10.f21817i0
            if (r0 == 0) goto L31
            long r7 = r0.mo2834W()
            vh.b0 r0 = r10.f21819k0
            r1 = 0
            qd.a$l r3 = new qd.a$l
            r9 = 0
            r4 = r3
            r5 = r10
            r4.<init>(r5, r6, r7, r9)
            r4 = 3
            r5 = 0
            r2 = 0
            p101fh.C2174f.m5728r(r0, r1, r2, r3, r4, r5)
            return
        L31:
            p214m2.C4339q.m9713w(r3)
            throw r2
        L35:
            p214m2.C4339q.m9713w(r3)
            throw r2
    }

    /* renamed from: l */
    public final void m11917l(p088f4.InterfaceC2054x0 r13, p088f4.InterfaceC2054x0 r14) {
            r12 = this;
            boolean r0 = p214m2.C4339q.m9702c(r13, r14)
            if (r0 == 0) goto L7
            return
        L7:
            r12.f21817i0 = r14
            r0 = 1
            if (r13 == 0) goto L49
            int r1 = r13.mo2850n()
            java.util.List<android.support.v4.media.MediaMetadataCompat> r2 = r12.f21822n0
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L27
            f4.x0 r1 = r12.f21817i0
            if (r1 == 0) goto L20
            r1.mo2864y(r0)
            goto L49
        L20:
            java.lang.String r13 = "currentPlayer"
            p214m2.C4339q.m9713w(r13)
            r13 = 0
            throw r13
        L27:
            if (r1 == r0) goto L49
            r2 = 4
            if (r1 == r2) goto L49
            java.util.List<android.support.v4.media.MediaMetadataCompat> r4 = r12.f21822n0
            int r1 = r13.mo5219R()
            java.lang.Object r1 = r4.get(r1)
            r5 = r1
            android.support.v4.media.MediaMetadataCompat r5 = (android.support.v4.media.MediaMetadataCompat) r5
            boolean r6 = r13.mo2862u()
            long r7 = r13.mo2834W()
            r9 = 0
            r10 = 16
            r11 = 0
            r3 = r12
            m11910j(r3, r4, r5, r6, r7, r9, r10, r11)
        L49:
            l4.a r1 = r12.m11914h()
            if (r14 == 0) goto L5a
            android.os.Looper r2 = r14.mo2830N()
            android.os.Looper r3 = r1.f17309b
            if (r2 != r3) goto L58
            goto L5a
        L58:
            r2 = 0
            goto L5b
        L5a:
            r2 = 1
        L5b:
            p371v5.C6549a.m13288b(r2)
            f4.x0 r2 = r1.f17316i
            if (r2 == 0) goto L67
            l4.a$c r3 = r1.f17310c
            r2.mo2825H(r3)
        L67:
            r1.f17316i = r14
            if (r14 == 0) goto L70
            l4.a$c r2 = r1.f17310c
            r14.mo2833Q(r2)
        L70:
            r1.m9294e()
            r1.m9293d()
            if (r13 == 0) goto L7b
            r13.mo2864y(r0)
        L7b:
            return
    }

    @Override // p031c1.AbstractServiceC0833a, android.app.Service
    public void onCreate() {
            r7 = this;
            super.onCreate()
            android.content.pm.PackageManager r0 = r7.getPackageManager()
            r1 = 0
            r2 = 0
            if (r0 == 0) goto L24
            java.lang.String r3 = r7.getPackageName()
            android.content.Intent r0 = r0.getLaunchIntentForPackage(r3)
            if (r0 == 0) goto L24
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 23
            if (r3 < r4) goto L1e
            r3 = 67108864(0x4000000, float:1.5046328E-36)
            goto L1f
        L1e:
            r3 = 0
        L1f:
            android.app.PendingIntent r0 = android.app.PendingIntent.getActivity(r7, r2, r0, r3)
            goto L25
        L24:
            r0 = r1
        L25:
            android.support.v4.media.session.MediaSessionCompat r3 = new android.support.v4.media.session.MediaSessionCompat
            java.lang.String r4 = "MusicService"
            r3.<init>(r7, r4, r1, r1)
            android.support.v4.media.session.MediaSessionCompat$b r4 = r3.f523a
            r4.mo334f(r0)
            r0 = 1
            r3.m287d(r0)
            r7.f21820l0 = r3
            android.support.v4.media.session.MediaSessionCompat r3 = r7.m11913g()
            android.support.v4.media.session.MediaSessionCompat$Token r3 = r3.m286b()
            if (r3 == 0) goto L157
            android.support.v4.media.session.MediaSessionCompat$Token r4 = r7.f4522d0
            if (r4 != 0) goto L14f
            r7.f4522d0 = r3
            c1.a$d r4 = r7.f4517Y
            c1.a$e r4 = (p031c1.AbstractServiceC0833a.e) r4
            c1.a r5 = r4.f4541d
            c1.a$n r5 = r5.f4521c0
            c1.c r6 = new c1.c
            r6.<init>(r4, r3)
            r5.m2516a(r6)
            qd.i r3 = new qd.i
            android.support.v4.media.session.MediaSessionCompat r4 = r7.m11913g()
            android.support.v4.media.session.MediaSessionCompat$Token r4 = r4.m286b()
            java.lang.String r5 = "mediaSession.sessionToken"
            p214m2.C4339q.m9705j(r4, r5)
            qd.a$b r5 = new qd.a$b
            r5.<init>(r7)
            r3.<init>(r7, r4, r5)
            r7.f21814f0 = r3
            r3 = r7
            io.tacocrypto.app.ui.tools.player.service.MyMusicService r3 = (io.tacocrypto.app.p156ui.tools.player.service.MyMusicService) r3
            cg.d r4 = new cg.d
            android.content.Context r3 = r3.getApplicationContext()
            java.lang.String r5 = "null cannot be cast to non-null type io.tacocrypto.app.TacoApplication"
            java.util.Objects.requireNonNull(r3, r5)
            io.tacocrypto.app.TacoApplication r3 = (io.tacocrypto.app.TacoApplication) r3
            nd.c1 r3 = r3.m7709d()
            r4.<init>(r3)
            r7.f21815g0 = r4
            qd.a$j r3 = new qd.a$j
            r3.<init>(r7)
            r4.m12190e(r3)
            l4.a r3 = new l4.a
            android.support.v4.media.session.MediaSessionCompat r4 = r7.m11913g()
            r3.<init>(r4)
            r7.f21821m0 = r3
            l4.a r3 = r7.m11914h()
            qd.a$d r4 = new qd.a$d
            r4.<init>(r7)
            l4.a$g r5 = r3.f17317j
            if (r5 == r4) goto Lc2
            if (r5 == 0) goto Lb0
            java.util.ArrayList<l4.a$b> r6 = r3.f17311d
            r6.remove(r5)
        Lb0:
            r3.f17317j = r4
            java.util.ArrayList<l4.a$b> r5 = r3.f17311d
            boolean r5 = r5.contains(r4)
            if (r5 != 0) goto Lbf
            java.util.ArrayList<l4.a$b> r5 = r3.f17311d
            r5.add(r4)
        Lbf:
            r3.m9294e()
        Lc2:
            l4.a r3 = r7.m11914h()
            qd.a$e r4 = new qd.a$e
            android.support.v4.media.session.MediaSessionCompat r5 = r7.m11913g()
            r4.<init>(r7, r5)
            l4.a$h r5 = r3.f17318k
            if (r5 == r4) goto Le9
            if (r5 == 0) goto Lda
            java.util.ArrayList<l4.a$b> r6 = r3.f17311d
            r6.remove(r5)
        Lda:
            r3.f17318k = r4
            java.util.ArrayList<l4.a$b> r5 = r3.f17311d
            boolean r5 = r5.contains(r4)
            if (r5 != 0) goto Le9
            java.util.ArrayList<l4.a$b> r3 = r3.f17311d
            r3.add(r4)
        Le9:
            com.google.android.exoplayer2.ext.cast.a r3 = r7.m11911e()
            if (r3 == 0) goto Lf9
            com.google.android.gms.cast.framework.media.b r3 = r3.f5263m
            if (r3 == 0) goto Lf5
            r3 = 1
            goto Lf6
        Lf5:
            r3 = 0
        Lf6:
            if (r3 != r0) goto Lf9
            r2 = 1
        Lf9:
            if (r2 == 0) goto L103
            com.google.android.exoplayer2.ext.cast.a r0 = r7.m11911e()
            p214m2.C4339q.m9704i(r0)
            goto L107
        L103:
            f4.s r0 = r7.m11912f()
        L107:
            r7.m11917l(r1, r0)
            qd.i r0 = r7.f21814f0
            if (r0 == 0) goto L149
            f4.x0 r2 = r7.f21817i0
            if (r2 == 0) goto L143
            t5.c r0 = r0.f21893d
            r0.m12738c(r2)
            qd.e r0 = new qd.e
            r2 = 2132148224(0x7f160000, float:1.993842E38)
            r0.<init>(r7, r2)
            r7.f21816h0 = r0
            qd.g$a r0 = p292qd.C5623g.f21882c
            android.content.Context r2 = r7.getApplicationContext()
            java.lang.String r3 = "applicationContext"
            p214m2.C4339q.m9705j(r2, r3)
            qd.g r3 = p292qd.C5623g.f21883d
            if (r3 != 0) goto L140
            monitor-enter(r0)
            qd.g r3 = p292qd.C5623g.f21883d     // Catch: java.lang.Throwable -> L13d
            if (r3 != 0) goto L13b
            qd.g r3 = new qd.g     // Catch: java.lang.Throwable -> L13d
            r3.<init>(r2, r1)     // Catch: java.lang.Throwable -> L13d
            p292qd.C5623g.f21883d = r3     // Catch: java.lang.Throwable -> L13d
        L13b:
            monitor-exit(r0)
            goto L140
        L13d:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L140:
            r7.f21823o0 = r3
            return
        L143:
            java.lang.String r0 = "currentPlayer"
            p214m2.C4339q.m9713w(r0)
            throw r1
        L149:
            java.lang.String r0 = "notificationManager"
            p214m2.C4339q.m9713w(r0)
            throw r1
        L14f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "The session token has already been set"
            r0.<init>(r1)
            throw r0
        L157:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Session token may not be null"
            r0.<init>(r1)
            throw r0
    }

    @Override // android.app.Service
    public void onDestroy() {
            r2 = this;
            android.support.v4.media.session.MediaSessionCompat r0 = r2.m11913g()
            r1 = 0
            r0.m287d(r1)
            android.support.v4.media.session.MediaSessionCompat$b r0 = r0.f523a
            r0.release()
            vh.r r0 = r2.f21818j0
            r1 = 0
            r0.mo13553d0(r1)
            f4.s r0 = r2.m11912f()
            qd.a$a r1 = r2.f21828t0
            r0.mo5273b(r1)
            f4.s r0 = r2.m11912f()
            r0.release()
            return
    }

    @Override // android.app.Service
    public void onTaskRemoved(android.content.Intent r2) {
            r1 = this;
            java.lang.String r0 = "rootIntent"
            p214m2.C4339q.m9706k(r2, r0)
            r1.m11916k()
            super.onTaskRemoved(r2)
            f4.x0 r2 = r1.f21817i0
            if (r2 == 0) goto L14
            r0 = 1
            r2.mo2864y(r0)
            return
        L14:
            java.lang.String r2 = "currentPlayer"
            p214m2.C4339q.m9713w(r2)
            r2 = 0
            throw r2
    }
}
