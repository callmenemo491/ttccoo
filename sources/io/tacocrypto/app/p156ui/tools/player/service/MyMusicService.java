package io.tacocrypto.app.p156ui.tools.player.service;

/* loaded from: classes.dex */
public final class MyMusicService extends p292qd.ServiceC5617a {

    /* renamed from: y0 */
    public static final /* synthetic */ int f14503y0 = 0;

    /* renamed from: w0 */
    public final mh.InterfaceC4624p<android.os.Bundle, android.os.ResultReceiver, java.lang.Boolean> f14504w0;

    /* renamed from: x0 */
    public final mh.InterfaceC4624p<android.os.Bundle, android.os.ResultReceiver, java.lang.Boolean> f14505x0;

    /* renamed from: io.tacocrypto.app.ui.tools.player.service.MyMusicService$a */
    public final class C3356a implements p199l4.C4178a.b {

        /* renamed from: a */
        public final /* synthetic */ io.tacocrypto.app.p156ui.tools.player.service.MyMusicService f14506a;

        public C3356a(io.tacocrypto.app.p156ui.tools.player.service.MyMusicService r1) {
                r0 = this;
                r0.f14506a = r1
                r0.<init>()
                return
        }

        @Override // p199l4.C4178a.b
        /* renamed from: c */
        public boolean mo7748c(p088f4.InterfaceC2054x0 r2, java.lang.String r3, android.os.Bundle r4, android.os.ResultReceiver r5) {
                r1 = this;
                java.lang.String r0 = "player"
                p214m2.C4339q.m9706k(r2, r0)
                java.lang.String r2 = "command"
                p214m2.C4339q.m9706k(r3, r2)
                java.lang.String r2 = " io.tacocrypto.app.mymusicservice.COMMAND.REFRESH"
                boolean r2 = p214m2.C4339q.m9702c(r3, r2)
                java.lang.String r0 = "extras ?: Bundle.EMPTY"
                if (r2 == 0) goto L2a
                io.tacocrypto.app.ui.tools.player.service.MyMusicService r2 = r1.f14506a
                mh.p<android.os.Bundle, android.os.ResultReceiver, java.lang.Boolean> r2 = r2.f14504w0
                if (r4 != 0) goto L1c
            L1a:
                android.os.Bundle r4 = android.os.Bundle.EMPTY
            L1c:
                p214m2.C4339q.m9705j(r4, r0)
                java.lang.Object r2 = r2.mo122l(r4, r5)
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                boolean r2 = r2.booleanValue()
                goto L3a
            L2a:
                java.lang.String r2 = " io.tacocrypto.app.mymusicservice.COMMAND.REFRESH_IF_EMPTY"
                boolean r2 = p214m2.C4339q.m9702c(r3, r2)
                if (r2 == 0) goto L39
                io.tacocrypto.app.ui.tools.player.service.MyMusicService r2 = r1.f14506a
                mh.p<android.os.Bundle, android.os.ResultReceiver, java.lang.Boolean> r2 = r2.f14505x0
                if (r4 != 0) goto L1c
                goto L1a
            L39:
                r2 = 0
            L3a:
                return r2
        }
    }

    /* renamed from: io.tacocrypto.app.ui.tools.player.service.MyMusicService$b */
    public static final class C3357b extends p239nh.AbstractC4830j implements mh.InterfaceC4624p<android.os.Bundle, android.os.ResultReceiver, java.lang.Boolean> {

        /* renamed from: Z */
        public final /* synthetic */ io.tacocrypto.app.p156ui.tools.player.service.MyMusicService f14507Z;

        public C3357b(io.tacocrypto.app.p156ui.tools.player.service.MyMusicService r1) {
                r0 = this;
                r0.f14507Z = r1
                r1 = 2
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4624p
        /* renamed from: l */
        public java.lang.Boolean mo122l(android.os.Bundle r8, android.os.ResultReceiver r9) {
                r7 = this;
                android.os.Bundle r8 = (android.os.Bundle) r8
                android.os.ResultReceiver r9 = (android.os.ResultReceiver) r9
                java.lang.String r0 = "<anonymous parameter 0>"
                p214m2.C4339q.m9706k(r8, r0)
                io.tacocrypto.app.ui.tools.player.service.MyMusicService r8 = r7.f14507Z
                int r0 = io.tacocrypto.app.p156ui.tools.player.service.MyMusicService.f14503y0
                vh.b0 r1 = r8.f21819k0
                qd.c r4 = new qd.c
                r0 = 0
                r4.<init>(r8, r0)
                r2 = 0
                r3 = 0
                r5 = 3
                r6 = 0
                p101fh.C2174f.m5728r(r1, r2, r3, r4, r5, r6)
                if (r9 == 0) goto L24
                r8 = -1
                android.os.Bundle r0 = android.os.Bundle.EMPTY
                r9.send(r8, r0)
            L24:
                java.lang.Boolean r8 = java.lang.Boolean.TRUE
                return r8
        }
    }

    /* renamed from: io.tacocrypto.app.ui.tools.player.service.MyMusicService$c */
    public static final class C3358c extends p239nh.AbstractC4830j implements mh.InterfaceC4624p<android.os.Bundle, android.os.ResultReceiver, java.lang.Boolean> {

        /* renamed from: Z */
        public final /* synthetic */ io.tacocrypto.app.p156ui.tools.player.service.MyMusicService f14508Z;

        public C3358c(io.tacocrypto.app.p156ui.tools.player.service.MyMusicService r1) {
                r0 = this;
                r0.f14508Z = r1
                r1 = 2
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4624p
        /* renamed from: l */
        public java.lang.Boolean mo122l(android.os.Bundle r8, android.os.ResultReceiver r9) {
                r7 = this;
                android.os.Bundle r8 = (android.os.Bundle) r8
                android.os.ResultReceiver r9 = (android.os.ResultReceiver) r9
                java.lang.String r0 = "<anonymous parameter 0>"
                p214m2.C4339q.m9706k(r8, r0)
                io.tacocrypto.app.ui.tools.player.service.MyMusicService r8 = r7.f14508Z
                int r0 = io.tacocrypto.app.p156ui.tools.player.service.MyMusicService.f14503y0
                vh.b0 r1 = r8.f21819k0
                qd.d r4 = new qd.d
                r0 = 0
                r4.<init>(r8, r0)
                r2 = 0
                r3 = 0
                r5 = 3
                r6 = 0
                p101fh.C2174f.m5728r(r1, r2, r3, r4, r5, r6)
                if (r9 == 0) goto L24
                r8 = -1
                android.os.Bundle r0 = android.os.Bundle.EMPTY
                r9.send(r8, r0)
            L24:
                java.lang.Boolean r8 = java.lang.Boolean.TRUE
                return r8
        }
    }

    public MyMusicService() {
            r1 = this;
            r1.<init>()
            io.tacocrypto.app.ui.tools.player.service.MyMusicService$b r0 = new io.tacocrypto.app.ui.tools.player.service.MyMusicService$b
            r0.<init>(r1)
            r1.f14504w0 = r0
            io.tacocrypto.app.ui.tools.player.service.MyMusicService$c r0 = new io.tacocrypto.app.ui.tools.player.service.MyMusicService$c
            r0.<init>(r1)
            r1.f14505x0 = r0
            return
    }

    @Override // p292qd.ServiceC5617a, p031c1.AbstractServiceC0833a, android.app.Service
    public void onCreate() {
            r3 = this;
            super.onCreate()
            l4.a r0 = r3.m11914h()
            io.tacocrypto.app.ui.tools.player.service.MyMusicService$a r1 = new io.tacocrypto.app.ui.tools.player.service.MyMusicService$a
            r1.<init>(r3)
            java.util.ArrayList<l4.a$b> r2 = r0.f17312e
            boolean r2 = r2.contains(r1)
            if (r2 != 0) goto L19
            java.util.ArrayList<l4.a$b> r0 = r0.f17312e
            r0.add(r1)
        L19:
            return
    }
}
