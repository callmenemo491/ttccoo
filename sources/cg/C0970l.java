package cg;

/* renamed from: cg.l */
/* loaded from: classes.dex */
public final class C0970l extends androidx.lifecycle.AbstractC0457n0 {

    /* renamed from: c */
    public final android.app.Application f5014c;

    /* renamed from: d */
    public final androidx.lifecycle.LiveData<java.lang.Boolean> f5015d;

    /* renamed from: e */
    public android.support.v4.media.session.PlaybackStateCompat f5016e;

    /* renamed from: f */
    public final androidx.lifecycle.C0437d0<cg.C0970l.a> f5017f;

    /* renamed from: g */
    public final androidx.lifecycle.C0437d0<java.lang.Long> f5018g;

    /* renamed from: h */
    public final androidx.lifecycle.LiveData<java.lang.Integer> f5019h;

    /* renamed from: i */
    public final androidx.lifecycle.C0437d0<java.lang.Boolean> f5020i;

    /* renamed from: j */
    public final androidx.lifecycle.C0437d0<java.lang.Boolean> f5021j;

    /* renamed from: k */
    public final androidx.lifecycle.LiveData<java.lang.Boolean> f5022k;

    /* renamed from: l */
    public final androidx.lifecycle.C0437d0<java.util.List<cg.C0960b>> f5023l;

    /* renamed from: m */
    public final androidx.lifecycle.LiveData<java.util.List<cg.C0960b>> f5024m;

    /* renamed from: n */
    public final cg.C0970l.c f5025n;

    /* renamed from: o */
    public boolean f5026o;

    /* renamed from: p */
    public final android.os.Handler f5027p;

    /* renamed from: q */
    public final java.lang.String f5028q;

    /* renamed from: r */
    public final androidx.lifecycle.InterfaceC0439e0<android.support.v4.media.session.PlaybackStateCompat> f5029r;

    /* renamed from: s */
    public final androidx.lifecycle.InterfaceC0439e0<android.support.v4.media.MediaMetadataCompat> f5030s;

    /* renamed from: t */
    public final gd.C2326a f5031t;

    /* renamed from: cg.l$a */
    public static final class a {

        /* renamed from: a */
        public final java.lang.String f5032a;

        /* renamed from: b */
        public final android.net.Uri f5033b;

        /* renamed from: c */
        public final java.lang.String f5034c;

        /* renamed from: d */
        public final java.lang.String f5035d;

        /* renamed from: e */
        public final long f5036e;

        /* renamed from: f */
        public final java.lang.String f5037f;

        public a(java.lang.String r2, android.net.Uri r3, java.lang.String r4, java.lang.String r5, long r6, java.lang.String r8) {
                r1 = this;
                java.lang.String r0 = "duration"
                p214m2.C4339q.m9706k(r8, r0)
                r1.<init>()
                r1.f5032a = r2
                r1.f5033b = r3
                r1.f5034c = r4
                r1.f5035d = r5
                r1.f5036e = r6
                r1.f5037f = r8
                return
        }

        public boolean equals(java.lang.Object r8) {
                r7 = this;
                r0 = 1
                if (r7 != r8) goto L4
                return r0
            L4:
                boolean r1 = r8 instanceof cg.C0970l.a
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                cg.l$a r8 = (cg.C0970l.a) r8
                java.lang.String r1 = r7.f5032a
                java.lang.String r3 = r8.f5032a
                boolean r1 = p214m2.C4339q.m9702c(r1, r3)
                if (r1 != 0) goto L17
                return r2
            L17:
                android.net.Uri r1 = r7.f5033b
                android.net.Uri r3 = r8.f5033b
                boolean r1 = p214m2.C4339q.m9702c(r1, r3)
                if (r1 != 0) goto L22
                return r2
            L22:
                java.lang.String r1 = r7.f5034c
                java.lang.String r3 = r8.f5034c
                boolean r1 = p214m2.C4339q.m9702c(r1, r3)
                if (r1 != 0) goto L2d
                return r2
            L2d:
                java.lang.String r1 = r7.f5035d
                java.lang.String r3 = r8.f5035d
                boolean r1 = p214m2.C4339q.m9702c(r1, r3)
                if (r1 != 0) goto L38
                return r2
            L38:
                long r3 = r7.f5036e
                long r5 = r8.f5036e
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 == 0) goto L41
                return r2
            L41:
                java.lang.String r1 = r7.f5037f
                java.lang.String r8 = r8.f5037f
                boolean r8 = p214m2.C4339q.m9702c(r1, r8)
                if (r8 != 0) goto L4c
                return r2
            L4c:
                return r0
        }

        public int hashCode() {
                r6 = this;
                java.lang.String r0 = r6.f5032a
                int r0 = r0.hashCode()
                int r0 = r0 * 31
                android.net.Uri r1 = r6.f5033b
                int r1 = r1.hashCode()
                int r1 = r1 + r0
                int r1 = r1 * 31
                java.lang.String r0 = r6.f5034c
                r2 = 0
                if (r0 != 0) goto L18
                r0 = 0
                goto L1c
            L18:
                int r0 = r0.hashCode()
            L1c:
                int r1 = r1 + r0
                int r1 = r1 * 31
                java.lang.String r0 = r6.f5035d
                if (r0 != 0) goto L24
                goto L28
            L24:
                int r2 = r0.hashCode()
            L28:
                int r1 = r1 + r2
                int r1 = r1 * 31
                long r2 = r6.f5036e
                r0 = 32
                long r4 = r2 >>> r0
                long r2 = r2 ^ r4
                int r0 = (int) r2
                int r1 = r1 + r0
                int r1 = r1 * 31
                java.lang.String r0 = r6.f5037f
                int r0 = r0.hashCode()
                int r0 = r0 + r1
                return r0
        }

        public java.lang.String toString() {
                r3 = this;
                java.lang.String r0 = "NowPlayingMetadata(id="
                java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
                java.lang.String r1 = r3.f5032a
                r0.append(r1)
                java.lang.String r1 = ", albumArtUri="
                r0.append(r1)
                android.net.Uri r1 = r3.f5033b
                r0.append(r1)
                java.lang.String r1 = ", title="
                r0.append(r1)
                java.lang.String r1 = r3.f5034c
                r0.append(r1)
                java.lang.String r1 = ", subtitle="
                r0.append(r1)
                java.lang.String r1 = r3.f5035d
                r0.append(r1)
                java.lang.String r1 = ", durationLong="
                r0.append(r1)
                long r1 = r3.f5036e
                r0.append(r1)
                java.lang.String r1 = ", duration="
                r0.append(r1)
                java.lang.String r1 = r3.f5037f
                r2 = 41
                java.lang.String r0 = p185k7.C3814g5.m8552a(r0, r1, r2)
                return r0
        }
    }

    /* renamed from: cg.l$b */
    public static final class b extends p239nh.AbstractC4830j implements mh.InterfaceC4624p<cg.C0970l.a, java.lang.Long, java.lang.Integer> {

        /* renamed from: Z */
        public static final cg.C0970l.b f5038Z = null;

        static {
                cg.l$b r0 = new cg.l$b
                r0.<init>()
                cg.C0970l.b.f5038Z = r0
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
        public java.lang.Integer mo122l(cg.C0970l.a r5, java.lang.Long r6) {
                r4 = this;
                cg.l$a r5 = (cg.C0970l.a) r5
                java.lang.Long r6 = (java.lang.Long) r6
                if (r5 == 0) goto Ld
                long r0 = r5.f5036e
                java.lang.Long r5 = java.lang.Long.valueOf(r0)
                goto Le
            Ld:
                r5 = 0
            Le:
                if (r5 == 0) goto L27
                if (r6 != 0) goto L13
                goto L27
            L13:
                long r0 = r6.longValue()
                double r0 = (double) r0
                r2 = 4636737291354636288(0x4059000000000000, double:100.0)
                double r0 = r0 * r2
                long r5 = r5.longValue()
                double r5 = (double) r5
                double r5 = vg.C6664e.m13506g(r0, r5)
                int r5 = (int) r5
                goto L28
            L27:
                r5 = 0
            L28:
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                return r5
        }
    }

    /* renamed from: cg.l$c */
    public static final class c extends android.support.v4.media.MediaBrowserCompat.AbstractC0134k {

        /* renamed from: d */
        public final /* synthetic */ cg.C0970l f5039d;

        public c(cg.C0970l r1) {
                r0 = this;
                r0.f5039d = r1
                r0.<init>()
                return
        }

        @Override // android.support.v4.media.MediaBrowserCompat.AbstractC0134k
        /* renamed from: a */
        public void mo206a(java.lang.String r17, java.util.List<? extends android.support.v4.media.MediaBrowserCompat.MediaItem> r18) {
                r16 = this;
                r0 = r16
                r1 = r18
                java.lang.String r2 = "parentId"
                r3 = r17
                p214m2.C4339q.m9706k(r3, r2)
                java.lang.String r2 = "children"
                p214m2.C4339q.m9706k(r1, r2)
                cg.l r2 = r0.f5039d
                java.util.ArrayList r3 = new java.util.ArrayList
                r4 = 10
                int r4 = p062dh.C1469e.m3992D(r1, r4)
                r3.<init>(r4)
                java.util.Iterator r1 = r18.iterator()
            L21:
                boolean r4 = r1.hasNext()
                if (r4 == 0) goto Lb5
                java.lang.Object r4 = r1.next()
                android.support.v4.media.MediaBrowserCompat$MediaItem r4 = (android.support.v4.media.MediaBrowserCompat.MediaItem) r4
                android.support.v4.media.MediaDescriptionCompat r5 = r4.f461Z
                java.lang.CharSequence r6 = r5.f487a0
                if (r6 != 0) goto L35
                java.lang.String r6 = ""
            L35:
                cg.b r15 = new cg.b
                java.lang.String r8 = r5.f485Y
                p214m2.C4339q.m9704i(r8)
                android.support.v4.media.MediaDescriptionCompat r5 = r4.f461Z
                java.lang.CharSequence r5 = r5.f486Z
                java.lang.String r9 = java.lang.String.valueOf(r5)
                java.lang.String r10 = r6.toString()
                android.support.v4.media.MediaDescriptionCompat r5 = r4.f461Z
                android.net.Uri r11 = r5.f490d0
                p214m2.C4339q.m9704i(r11)
                int r5 = r4.f460Y
                r6 = 1
                r5 = r5 & r6
                if (r5 == 0) goto L57
                r12 = 1
                goto L58
            L57:
                r12 = 0
            L58:
                android.support.v4.media.MediaDescriptionCompat r5 = r4.f461Z
                android.os.Bundle r5 = r5.f491e0
                r13 = 0
                if (r5 == 0) goto L6c
                r6 = 0
                java.lang.String r14 = "android.media.metadata.DURATION"
                long r5 = r5.getLong(r14, r6)
                java.lang.Long r5 = java.lang.Long.valueOf(r5)
                goto L6d
            L6c:
                r5 = r13
            L6d:
                android.support.v4.media.MediaDescriptionCompat r4 = r4.f461Z
                java.lang.String r4 = r4.f485Y
                p214m2.C4339q.m9704i(r4)
                gd.a r6 = r2.f5031t
                androidx.lifecycle.d0<android.support.v4.media.MediaMetadataCompat> r6 = r6.f10570d
                java.lang.Object r6 = r6.m1411d()
                android.support.v4.media.MediaMetadataCompat r6 = (android.support.v4.media.MediaMetadataCompat) r6
                if (r6 == 0) goto L86
                java.lang.String r7 = "android.media.metadata.MEDIA_ID"
                java.lang.String r13 = r6.m231e(r7)
            L86:
                boolean r4 = p214m2.C4339q.m9702c(r4, r13)
                gd.a r6 = r2.f5031t
                androidx.lifecycle.d0<android.support.v4.media.session.PlaybackStateCompat> r6 = r6.f10569c
                java.lang.Object r6 = r6.m1411d()
                android.support.v4.media.session.PlaybackStateCompat r6 = (android.support.v4.media.session.PlaybackStateCompat) r6
                if (r6 == 0) goto La0
                int r6 = r6.f564Y
                r7 = 6
                if (r6 == r7) goto L9e
                r7 = 3
                if (r6 != r7) goto La0
            L9e:
                r6 = 1
                goto La1
            La0:
                r6 = 0
            La1:
                if (r4 != 0) goto La5
                r14 = 0
                goto Lab
            La5:
                if (r6 == 0) goto La9
                r14 = 1
                goto Lab
            La9:
                r4 = 2
                r14 = 2
            Lab:
                r7 = r15
                r13 = r5
                r7.<init>(r8, r9, r10, r11, r12, r13, r14)
                r3.add(r15)
                goto L21
            Lb5:
                cg.l r1 = r0.f5039d
                androidx.lifecycle.d0<java.util.List<cg.b>> r1 = r1.f5023l
                r1.mo1415j(r3)
                return
        }
    }

    public C0970l(android.app.Application r5, p238nd.C4728b0 r6, p238nd.C4732c1 r7, gd.C2326a r8) {
            r4 = this;
            java.lang.String r0 = "app"
            p214m2.C4339q.m9706k(r5, r0)
            java.lang.String r0 = "eosManager"
            p214m2.C4339q.m9706k(r6, r0)
            java.lang.String r6 = "nftPlayerToolManager"
            p214m2.C4339q.m9706k(r7, r6)
            r4.<init>()
            r4.f5014c = r5
            androidx.lifecycle.d0 r5 = new androidx.lifecycle.d0
            r5.<init>()
            r4.f5015d = r5
            android.support.v4.media.session.PlaybackStateCompat r5 = gd.C2327b.f10578a
            r4.f5016e = r5
            androidx.lifecycle.d0 r5 = new androidx.lifecycle.d0
            r5.<init>()
            r4.f5017f = r5
            androidx.lifecycle.d0 r6 = new androidx.lifecycle.d0
            r6.<init>()
            r0 = 0
            java.lang.Long r7 = java.lang.Long.valueOf(r0)
            r6.mo1415j(r7)
            r4.f5018g = r6
            cg.l$b r7 = cg.C0970l.b.f5038Z
            androidx.lifecycle.LiveData r5 = p185k7.C4038x4.m9090c(r5, r6, r7)
            r4.f5019h = r5
            androidx.lifecycle.d0 r5 = new androidx.lifecycle.d0
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            r5.<init>(r6)
            r4.f5020i = r5
            androidx.lifecycle.d0 r5 = new androidx.lifecycle.d0
            r5.<init>(r6)
            r4.f5021j = r5
            r4.f5022k = r5
            androidx.lifecycle.d0 r5 = new androidx.lifecycle.d0
            r5.<init>()
            r4.f5023l = r5
            r4.f5024m = r5
            cg.l$c r5 = new cg.l$c
            r5.<init>(r4)
            r4.f5025n = r5
            r6 = 1
            r4.f5026o = r6
            android.os.Handler r7 = new android.os.Handler
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            r7.<init>(r0)
            r4.f5027p = r7
            java.lang.String r0 = "__RECOMMENDED__"
            r4.f5028q = r0
            cg.j r1 = new cg.j
            r2 = 0
            r1.<init>(r4, r8, r2)
            r4.f5029r = r1
            cg.j r2 = new cg.j
            r2.<init>(r4, r8, r6)
            r4.f5030s = r2
            android.support.v4.media.MediaBrowserCompat r6 = r8.f10572f
            java.util.Objects.requireNonNull(r6)
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            if (r3 != 0) goto La9
            android.support.v4.media.MediaBrowserCompat$d r6 = r6.f459a
            r3 = 0
            r6.mo196a(r0, r3, r5)
            androidx.lifecycle.d0<android.support.v4.media.session.PlaybackStateCompat> r5 = r8.f10569c
            r5.m1414g(r1)
            androidx.lifecycle.d0<android.support.v4.media.MediaMetadataCompat> r5 = r8.f10570d
            r5.m1414g(r2)
            cg.k r5 = new cg.k
            r5.<init>(r4)
            r0 = 300(0x12c, double:1.48E-321)
            r7.postDelayed(r5, r0)
            r4.f5031t = r8
            return
        La9:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "parentId is empty"
            r5.<init>(r6)
            throw r5
    }

    @Override // androidx.lifecycle.AbstractC0457n0
    /* renamed from: b */
    public void mo8b() {
            r4 = this;
            gd.a r0 = r4.f5031t
            androidx.lifecycle.d0<android.support.v4.media.session.PlaybackStateCompat> r0 = r0.f10569c
            androidx.lifecycle.e0<android.support.v4.media.session.PlaybackStateCompat> r1 = r4.f5029r
            r0.mo6k(r1)
            gd.a r0 = r4.f5031t
            androidx.lifecycle.d0<android.support.v4.media.MediaMetadataCompat> r0 = r0.f10570d
            androidx.lifecycle.e0<android.support.v4.media.MediaMetadataCompat> r1 = r4.f5030s
            r0.mo6k(r1)
            gd.a r0 = r4.f5031t
            java.lang.String r1 = r4.f5028q
            cg.l$c r2 = r4.f5025n
            java.util.Objects.requireNonNull(r0)
            java.lang.String r3 = "parentId"
            p214m2.C4339q.m9706k(r1, r3)
            java.lang.String r3 = "callback"
            p214m2.C4339q.m9706k(r2, r3)
            android.support.v4.media.MediaBrowserCompat r0 = r0.f10572f
            java.util.Objects.requireNonNull(r0)
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            if (r3 != 0) goto L39
            android.support.v4.media.MediaBrowserCompat$d r0 = r0.f459a
            r0.mo197d(r1, r2)
            r0 = 0
            r4.f5026o = r0
            return
        L39:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "parentId is empty"
            r0.<init>(r1)
            throw r0
    }

    /* renamed from: d */
    public final void m2684d() {
            r12 = this;
            gd.a r0 = r12.f5031t
            android.support.v4.media.session.MediaControllerCompat$e r0 = r0.m6085a()
            gd.a r1 = r12.f5031t
            androidx.lifecycle.d0<android.support.v4.media.session.PlaybackStateCompat> r1 = r1.f10569c
            java.lang.Object r1 = r1.m1411d()
            android.support.v4.media.session.PlaybackStateCompat r1 = (android.support.v4.media.session.PlaybackStateCompat) r1
            r2 = 2
            r3 = 3
            r4 = 6
            r5 = 1
            r6 = 0
            if (r1 == 0) goto L21
            int r7 = r1.f564Y
            if (r7 == r4) goto L1f
            if (r7 == r3) goto L1f
            if (r7 != r2) goto L21
        L1f:
            r7 = 1
            goto L22
        L21:
            r7 = 0
        L22:
            if (r7 == 0) goto L52
            if (r1 == 0) goto L52
            int r7 = r1.f564Y
            if (r7 == r4) goto L2f
            if (r7 != r3) goto L2d
            goto L2f
        L2d:
            r3 = 0
            goto L30
        L2f:
            r3 = 1
        L30:
            if (r3 == 0) goto L3a
            android.support.v4.media.session.MediaControllerCompat$f r0 = (android.support.v4.media.session.MediaControllerCompat.C0153f) r0
            android.media.session.MediaController$TransportControls r0 = r0.f520a
            r0.pause()
            goto L59
        L3a:
            long r3 = r1.f568c0
            r8 = 4
            long r8 = r8 & r3
            r10 = 0
            int r1 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r1 != 0) goto L50
            r8 = 512(0x200, double:2.53E-321)
            long r3 = r3 & r8
            int r1 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r1 == 0) goto L4f
            if (r7 != r2) goto L4f
            goto L50
        L4f:
            r5 = 0
        L50:
            if (r5 == 0) goto L59
        L52:
            android.support.v4.media.session.MediaControllerCompat$f r0 = (android.support.v4.media.session.MediaControllerCompat.C0153f) r0
            android.media.session.MediaController$TransportControls r0 = r0.f520a
            r0.play()
        L59:
            return
    }

    /* renamed from: e */
    public final void m2685e(android.support.v4.media.session.PlaybackStateCompat r21, android.support.v4.media.MediaMetadataCompat r22) {
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = r22
            android.os.Bundle r3 = r2.f498Y
            java.lang.String r4 = "android.media.metadata.DURATION"
            r5 = 0
            long r7 = r3.getLong(r4, r5)
            int r10 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r10 == 0) goto Lbf
            java.lang.String r7 = "android.media.metadata.MEDIA_ID"
            java.lang.String r8 = r2.m231e(r7)
            if (r8 == 0) goto Lbf
            cg.l$a r8 = new cg.l$a
            java.lang.String r11 = r2.m231e(r7)
            p214m2.C4339q.m9704i(r11)
            java.lang.String r7 = "android.media.metadata.ALBUM_ART_URI"
            java.lang.String r7 = r2.m231e(r7)
            android.net.Uri r12 = p185k7.C3828h5.m8579H(r7)
            java.lang.String r7 = "android.media.metadata.TITLE"
            java.lang.String r7 = r2.m231e(r7)
            r10 = 0
            if (r7 == 0) goto L42
            java.lang.CharSequence r7 = p362uh.C6467m.m13083n0(r7)
            java.lang.String r7 = r7.toString()
            r13 = r7
            goto L43
        L42:
            r13 = r10
        L43:
            java.lang.String r7 = "android.media.metadata.DISPLAY_SUBTITLE"
            java.lang.String r7 = r2.m231e(r7)
            if (r7 == 0) goto L55
            java.lang.CharSequence r7 = p362uh.C6467m.m13083n0(r7)
            java.lang.String r7 = r7.toString()
            r14 = r7
            goto L56
        L55:
            r14 = r10
        L56:
            android.os.Bundle r7 = r2.f498Y
            long r15 = r7.getLong(r4, r5)
            android.app.Application r7 = r0.f5014c
            android.os.Bundle r2 = r2.f498Y
            long r3 = r2.getLong(r4, r5)
            java.lang.String r2 = "context"
            p214m2.C4339q.m9706k(r7, r2)
            double r9 = (double) r3
            r18 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r9 = r9 / r18
            double r9 = java.lang.Math.floor(r9)
            int r7 = (int) r9
            int r9 = r7 / 60
            int r10 = r9 * 60
            int r7 = r7 - r10
            int r10 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r10 >= 0) goto L86
            java.lang.String r3 = "--:--"
            r17 = r3
            r2 = 1
            r9 = 0
            goto Lb5
        L86:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r9)
            r4 = 58
            r3.append(r4)
            r2 = 1
            java.lang.Object[] r4 = new java.lang.Object[r2]
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r9 = 0
            r4[r9] = r7
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r2)
            java.lang.String r7 = "%02d"
            java.lang.String r4 = java.lang.String.format(r7, r4)
            java.lang.String r7 = "format(format, *args)"
            p214m2.C4339q.m9705j(r4, r7)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r17 = r3
        Lb5:
            r10 = r8
            r10.<init>(r11, r12, r13, r14, r15, r17)
            androidx.lifecycle.d0<cg.l$a> r3 = r0.f5017f
            r3.mo1415j(r8)
            goto Lc1
        Lbf:
            r2 = 1
            r9 = 0
        Lc1:
            androidx.lifecycle.d0<java.lang.Boolean> r3 = r0.f5021j
            long r7 = r1.f568c0
            r10 = 32
            long r7 = r7 & r10
            int r4 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r4 == 0) goto Lce
            r4 = 1
            goto Lcf
        Lce:
            r4 = 0
        Lcf:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r3.mo1415j(r4)
            androidx.lifecycle.d0<java.lang.Boolean> r3 = r0.f5020i
            int r1 = r1.f564Y
            r4 = 6
            if (r1 == r4) goto Le2
            r4 = 3
            if (r1 != r4) goto Le1
            goto Le2
        Le1:
            r2 = 0
        Le2:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)
            r3.mo1415j(r1)
            return
    }

    /* renamed from: f */
    public final java.util.List<cg.C0960b> m2686f(android.support.v4.media.session.PlaybackStateCompat r14, android.support.v4.media.MediaMetadataCompat r15) {
            r13 = this;
            int r14 = r14.f564Y
            r0 = 0
            r1 = 1
            r2 = 6
            if (r14 == r2) goto Ld
            r2 = 3
            if (r14 != r2) goto Lb
            goto Ld
        Lb:
            r14 = 0
            goto Le
        Ld:
            r14 = 1
        Le:
            if (r14 != r1) goto L11
            goto L12
        L11:
            r1 = 2
        L12:
            androidx.lifecycle.LiveData<java.util.List<cg.b>> r14 = r13.f5024m
            java.lang.Object r14 = r14.m1411d()
            java.util.List r14 = (java.util.List) r14
            if (r14 == 0) goto L72
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 10
            int r3 = p062dh.C1469e.m3992D(r14, r3)
            r2.<init>(r3)
            java.util.Iterator r14 = r14.iterator()
        L2b:
            boolean r3 = r14.hasNext()
            if (r3 == 0) goto L74
            java.lang.Object r3 = r14.next()
            cg.b r3 = (cg.C0960b) r3
            java.lang.String r4 = r3.f4961a
            java.lang.String r5 = "android.media.metadata.MEDIA_ID"
            java.lang.String r5 = r15.m231e(r5)
            boolean r4 = p214m2.C4339q.m9702c(r4, r5)
            if (r4 == 0) goto L47
            r12 = r1
            goto L48
        L47:
            r12 = 0
        L48:
            java.lang.String r6 = r3.f4961a
            java.lang.String r7 = r3.f4962b
            java.lang.String r8 = r3.f4963c
            android.net.Uri r9 = r3.f4964d
            boolean r10 = r3.f4965e
            java.lang.Long r11 = r3.f4966f
            java.lang.String r3 = "mediaId"
            p214m2.C4339q.m9706k(r6, r3)
            java.lang.String r3 = "title"
            p214m2.C4339q.m9706k(r7, r3)
            java.lang.String r3 = "subtitle"
            p214m2.C4339q.m9706k(r8, r3)
            java.lang.String r3 = "albumArtUri"
            p214m2.C4339q.m9706k(r9, r3)
            cg.b r3 = new cg.b
            r5 = r3
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            r2.add(r3)
            goto L2b
        L72:
            dh.k r2 = p062dh.C1475k.f7237Y
        L74:
            return r2
    }
}
