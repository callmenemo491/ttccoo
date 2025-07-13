package gd;

/* renamed from: gd.a */
/* loaded from: classes.dex */
public final class C2326a {

    /* renamed from: h */
    public static final gd.C2326a.a f10565h = null;

    /* renamed from: i */
    public static volatile gd.C2326a f10566i;

    /* renamed from: a */
    public final androidx.lifecycle.C0437d0<java.lang.Boolean> f10567a;

    /* renamed from: b */
    public final androidx.lifecycle.C0437d0<java.lang.Boolean> f10568b;

    /* renamed from: c */
    public final androidx.lifecycle.C0437d0<android.support.v4.media.session.PlaybackStateCompat> f10569c;

    /* renamed from: d */
    public final androidx.lifecycle.C0437d0<android.support.v4.media.MediaMetadataCompat> f10570d;

    /* renamed from: e */
    public final gd.C2326a.b f10571e;

    /* renamed from: f */
    public final android.support.v4.media.MediaBrowserCompat f10572f;

    /* renamed from: g */
    public android.support.v4.media.session.MediaControllerCompat f10573g;

    /* renamed from: gd.a$a */
    public static final class a {
        public a(p239nh.C4826f r1) {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* renamed from: gd.a$b */
    public final class b extends android.support.v4.media.MediaBrowserCompat.C0126c {

        /* renamed from: c */
        public final android.content.Context f10574c;

        /* renamed from: d */
        public final /* synthetic */ gd.C2326a f10575d;

        public b(gd.C2326a r1, android.content.Context r2) {
                r0 = this;
                r0.f10575d = r1
                r0.<init>()
                r0.f10574c = r2
                return
        }

        @Override // android.support.v4.media.MediaBrowserCompat.C0126c
        /* renamed from: a */
        public void mo193a() {
                r4 = this;
                gd.a r0 = r4.f10575d
                android.support.v4.media.session.MediaControllerCompat r1 = new android.support.v4.media.session.MediaControllerCompat
                android.content.Context r2 = r4.f10574c
                android.support.v4.media.MediaBrowserCompat r3 = r0.f10572f
                android.support.v4.media.session.MediaSessionCompat$Token r3 = r3.m187a()
                r1.<init>(r2, r3)
                gd.a r2 = r4.f10575d
                gd.a$c r3 = new gd.a$c
                r3.<init>(r2)
                r1.m262d(r3)
                r0.f10573g = r1
                gd.a r0 = r4.f10575d
                androidx.lifecycle.d0<java.lang.Boolean> r0 = r0.f10567a
                java.lang.Boolean r1 = java.lang.Boolean.TRUE
                r0.mo1415j(r1)
                return
        }

        @Override // android.support.v4.media.MediaBrowserCompat.C0126c
        /* renamed from: b */
        public void mo194b() {
                r2 = this;
                gd.a r0 = r2.f10575d
                androidx.lifecycle.d0<java.lang.Boolean> r0 = r0.f10567a
                java.lang.Boolean r1 = java.lang.Boolean.FALSE
                r0.mo1415j(r1)
                return
        }

        @Override // android.support.v4.media.MediaBrowserCompat.C0126c
        /* renamed from: c */
        public void mo195c() {
                r2 = this;
                gd.a r0 = r2.f10575d
                androidx.lifecycle.d0<java.lang.Boolean> r0 = r0.f10567a
                java.lang.Boolean r1 = java.lang.Boolean.FALSE
                r0.mo1415j(r1)
                return
        }
    }

    /* renamed from: gd.a$c */
    public final class c extends android.support.v4.media.session.MediaControllerCompat.AbstractC0148a {

        /* renamed from: d */
        public final /* synthetic */ gd.C2326a f10576d;

        public c(gd.C2326a r1) {
                r0 = this;
                r0.f10576d = r1
                r0.<init>()
                return
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.AbstractC0148a
        /* renamed from: a */
        public void mo272a(android.support.v4.media.MediaMetadataCompat r3) {
                r2 = this;
                gd.a r0 = r2.f10576d
                androidx.lifecycle.d0<android.support.v4.media.MediaMetadataCompat> r0 = r0.f10570d
                if (r3 == 0) goto Ld
                java.lang.String r1 = "android.media.metadata.MEDIA_ID"
                java.lang.String r1 = r3.m231e(r1)
                goto Le
            Ld:
                r1 = 0
            Le:
                if (r1 != 0) goto L12
                android.support.v4.media.MediaMetadataCompat r3 = gd.C2327b.f10579b
            L12:
                r0.mo1415j(r3)
                return
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.AbstractC0148a
        /* renamed from: b */
        public void mo273b(android.support.v4.media.session.PlaybackStateCompat r2) {
                r1 = this;
                gd.a r0 = r1.f10576d
                androidx.lifecycle.d0<android.support.v4.media.session.PlaybackStateCompat> r0 = r0.f10569c
                if (r2 != 0) goto L8
                android.support.v4.media.session.PlaybackStateCompat r2 = gd.C2327b.f10578a
            L8:
                r0.mo1415j(r2)
                return
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.AbstractC0148a
        /* renamed from: c */
        public void mo274c(java.util.List<android.support.v4.media.session.MediaSessionCompat.QueueItem> r1) {
                r0 = this;
                return
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.AbstractC0148a
        /* renamed from: d */
        public void mo275d() {
                r1 = this;
                gd.a r0 = r1.f10576d
                gd.a$b r0 = r0.f10571e
                r0.mo195c()
                return
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.AbstractC0148a
        /* renamed from: e */
        public void mo276e(java.lang.String r1, android.os.Bundle r2) {
                r0 = this;
                java.lang.String r2 = "io.tacocrypto.app.media.session.NETWORK_FAILURE"
                boolean r1 = p214m2.C4339q.m9702c(r1, r2)
                if (r1 == 0) goto L11
                gd.a r1 = r0.f10576d
                androidx.lifecycle.d0<java.lang.Boolean> r1 = r1.f10568b
                java.lang.Boolean r2 = java.lang.Boolean.TRUE
                r1.mo1415j(r2)
            L11:
                return
        }
    }

    /* renamed from: gd.a$d */
    public static final class d extends android.os.ResultReceiver {

        /* renamed from: Y */
        public final /* synthetic */ mh.InterfaceC4624p<java.lang.Integer, android.os.Bundle, ch.C0985l> f10577Y;

        public d(mh.InterfaceC4624p<? super java.lang.Integer, ? super android.os.Bundle, ch.C0985l> r1, android.os.Handler r2) {
                r0 = this;
                r0.f10577Y = r1
                r0.<init>(r2)
                return
        }

        @Override // android.os.ResultReceiver
        public void onReceiveResult(int r2, android.os.Bundle r3) {
                r1 = this;
                mh.p<java.lang.Integer, android.os.Bundle, ch.l> r0 = r1.f10577Y
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r0.mo122l(r2, r3)
                return
        }
    }

    static {
            gd.a$a r0 = new gd.a$a
            r1 = 0
            r0.<init>(r1)
            gd.C2326a.f10565h = r0
            return
    }

    public C2326a(android.content.Context r4, android.content.ComponentName r5) {
            r3 = this;
            r3.<init>()
            androidx.lifecycle.d0 r0 = new androidx.lifecycle.d0
            r0.<init>()
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r0.mo1415j(r1)
            r3.f10567a = r0
            androidx.lifecycle.d0 r0 = new androidx.lifecycle.d0
            r0.<init>()
            r0.mo1415j(r1)
            r3.f10568b = r0
            androidx.lifecycle.d0 r0 = new androidx.lifecycle.d0
            r0.<init>()
            android.support.v4.media.session.PlaybackStateCompat r1 = gd.C2327b.f10578a
            r0.mo1415j(r1)
            r3.f10569c = r0
            androidx.lifecycle.d0 r0 = new androidx.lifecycle.d0
            r0.<init>()
            android.support.v4.media.MediaMetadataCompat r1 = gd.C2327b.f10579b
            r0.mo1415j(r1)
            r3.f10570d = r0
            gd.a$b r0 = new gd.a$b
            r0.<init>(r3, r4)
            r3.f10571e = r0
            android.support.v4.media.MediaBrowserCompat r1 = new android.support.v4.media.MediaBrowserCompat
            r2 = 0
            r1.<init>(r4, r5, r0, r2)
            java.lang.String r4 = "MediaBrowserCompat"
            java.lang.String r5 = "Connecting to a MediaBrowserService."
            android.util.Log.d(r4, r5)
            android.support.v4.media.MediaBrowserCompat$d r4 = r1.f459a
            android.support.v4.media.MediaBrowserCompat$e r4 = (android.support.v4.media.MediaBrowserCompat.C0128e) r4
            android.media.browse.MediaBrowser r4 = r4.f468b
            r4.connect()
            r3.f10572f = r1
            return
    }

    /* renamed from: a */
    public final android.support.v4.media.session.MediaControllerCompat.AbstractC0152e m6085a() {
            r1 = this;
            android.support.v4.media.session.MediaControllerCompat r0 = r1.f10573g
            if (r0 == 0) goto L9
            android.support.v4.media.session.MediaControllerCompat$e r0 = r0.m261c()
            return r0
        L9:
            java.lang.String r0 = "mediaController"
            p214m2.C4339q.m9713w(r0)
            r0 = 0
            throw r0
    }

    /* renamed from: b */
    public final boolean m6086b(java.lang.String r4, android.os.Bundle r5, mh.InterfaceC4624p<? super java.lang.Integer, ? super android.os.Bundle, ch.C0985l> r6) {
            r3 = this;
            android.support.v4.media.MediaBrowserCompat r0 = r3.f10572f
            android.support.v4.media.MediaBrowserCompat$d r0 = r0.f459a
            android.support.v4.media.MediaBrowserCompat$e r0 = (android.support.v4.media.MediaBrowserCompat.C0128e) r0
            android.media.browse.MediaBrowser r0 = r0.f468b
            boolean r0 = r0.isConnected()
            if (r0 == 0) goto L3c
            android.support.v4.media.session.MediaControllerCompat r0 = r3.f10573g
            if (r0 == 0) goto L35
            android.os.Handler r1 = new android.os.Handler
            r1.<init>()
            gd.a$d r2 = new gd.a$d
            r2.<init>(r6, r1)
            boolean r6 = android.text.TextUtils.isEmpty(r4)
            if (r6 != 0) goto L2d
            android.support.v4.media.session.MediaControllerCompat$b r6 = r0.f505a
            android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21 r6 = (android.support.v4.media.session.MediaControllerCompat.MediaControllerImplApi21) r6
            android.media.session.MediaController r6 = r6.f507a
            r6.sendCommand(r4, r5, r2)
            r4 = 1
            goto L3d
        L2d:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "command must neither be null nor empty"
            r4.<init>(r5)
            throw r4
        L35:
            java.lang.String r4 = "mediaController"
            p214m2.C4339q.m9713w(r4)
            r4 = 0
            throw r4
        L3c:
            r4 = 0
        L3d:
            return r4
    }
}
