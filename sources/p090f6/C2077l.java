package p090f6;

/* renamed from: f6.l */
/* loaded from: classes.dex */
public final class C2077l implements com.google.android.gms.cast.framework.media.C1065b.b {

    /* renamed from: m */
    public static final p123h6.C2489b f9482m = null;

    /* renamed from: a */
    public final android.content.Context f9483a;

    /* renamed from: b */
    public final p052d6.C1297b f9484b;

    /* renamed from: c */
    public final p072e7.BinderC1592e f9485c;

    /* renamed from: d */
    public final android.content.ComponentName f9486d;

    /* renamed from: e */
    public final p090f6.C2067b f9487e;

    /* renamed from: f */
    public final p090f6.C2067b f9488f;

    /* renamed from: g */
    public final android.os.Handler f9489g;

    /* renamed from: h */
    public final java.lang.Runnable f9490h;

    /* renamed from: i */
    public com.google.android.gms.cast.framework.media.C1065b f9491i;

    /* renamed from: j */
    public com.google.android.gms.cast.CastDevice f9492j;

    /* renamed from: k */
    public android.support.v4.media.session.MediaSessionCompat f9493k;

    /* renamed from: l */
    public boolean f9494l;

    static {
            h6.b r0 = new h6.b
            java.lang.String r1 = "MediaSessionManager"
            r0.<init>(r1)
            p090f6.C2077l.f9482m = r0
            return
    }

    public C2077l(android.content.Context r2, p052d6.C1297b r3, p072e7.BinderC1592e r4) {
            r1 = this;
            r1.<init>()
            r1.f9483a = r2
            r1.f9484b = r3
            r1.f9485c = r4
            e6.a r4 = r3.f6822d0
            if (r4 == 0) goto L21
            java.lang.String r4 = r4.f7385Z
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L21
            android.content.ComponentName r4 = new android.content.ComponentName
            e6.a r3 = r3.f6822d0
            java.lang.String r3 = r3.f7385Z
            r4.<init>(r2, r3)
            r1.f9486d = r4
            goto L24
        L21:
            r3 = 0
            r1.f9486d = r3
        L24:
            f6.b r3 = new f6.b
            r3.<init>(r2)
            r1.f9487e = r3
            f6.j r4 = new f6.j
            r0 = 0
            r4.<init>(r1, r0)
            r3.f9471f = r4
            f6.b r3 = new f6.b
            r3.<init>(r2)
            r1.f9488f = r3
            f6.j r2 = new f6.j
            r4 = 1
            r2.<init>(r1, r4)
            r3.f9471f = r2
            e7.k r2 = new e7.k
            android.os.Looper r3 = android.os.Looper.getMainLooper()
            r2.<init>(r3)
            r1.f9489g = r2
            f6.i r2 = new f6.i
            r2.<init>(r1)
            r1.f9490h = r2
            return
    }

    @Override // com.google.android.gms.cast.framework.media.C1065b.b
    /* renamed from: a */
    public final void mo3024a() {
            r1 = this;
            r0 = 0
            r1.m5495h(r0)
            return
    }

    @Override // com.google.android.gms.cast.framework.media.C1065b.b
    /* renamed from: b */
    public final void mo3025b() {
            r1 = this;
            r0 = 0
            r1.m5495h(r0)
            return
    }

    @Override // com.google.android.gms.cast.framework.media.C1065b.b
    /* renamed from: c */
    public final void mo3026c() {
            r1 = this;
            r0 = 0
            r1.m5495h(r0)
            return
    }

    @Override // com.google.android.gms.cast.framework.media.C1065b.b
    /* renamed from: d */
    public final void mo3027d() {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.cast.framework.media.C1065b.b
    /* renamed from: e */
    public final void mo3028e() {
            r1 = this;
            r0 = 0
            r1.m5495h(r0)
            return
    }

    @Override // com.google.android.gms.cast.framework.media.C1065b.b
    /* renamed from: f */
    public final void mo3029f() {
            r1 = this;
            r0 = 0
            r1.m5495h(r0)
            return
    }

    /* renamed from: g */
    public final void m5494g(com.google.android.gms.cast.framework.media.C1065b r8, com.google.android.gms.cast.CastDevice r9) {
            r7 = this;
            boolean r0 = r7.f9494l
            if (r0 != 0) goto Lcc
            d6.b r0 = r7.f9484b
            if (r0 == 0) goto Lcc
            e6.a r0 = r0.f6822d0
            if (r0 == 0) goto Lcc
            if (r8 == 0) goto Lcc
            if (r9 != 0) goto L12
            goto Lcc
        L12:
            r7.f9491i = r8
            java.lang.String r0 = "Must be called from the main thread."
            com.google.android.gms.common.internal.C1101a.m3099d(r0)
            java.util.List<com.google.android.gms.cast.framework.media.b$b> r8 = r8.f5494g
            r8.add(r7)
            r7.f9492j = r9
            android.content.ComponentName r8 = new android.content.ComponentName
            android.content.Context r9 = r7.f9483a
            d6.b r0 = r7.f9484b
            e6.a r0 = r0.f6822d0
            java.lang.String r0 = r0.f7384Y
            r8.<init>(r9, r0)
            android.content.Intent r9 = new android.content.Intent
            java.lang.String r0 = "android.intent.action.MEDIA_BUTTON"
            r9.<init>(r0)
            r9.setComponent(r8)
            android.content.Context r0 = r7.f9483a
            int r1 = p072e7.C1642j.f7655a
            r2 = 0
            android.app.PendingIntent r9 = android.app.PendingIntent.getBroadcast(r0, r2, r9, r1)
            d6.b r0 = r7.f9484b
            e6.a r0 = r0.f6822d0
            boolean r0 = r0.f7389d0
            r1 = 1
            if (r0 == 0) goto Lc7
            android.support.v4.media.session.MediaSessionCompat r0 = new android.support.v4.media.session.MediaSessionCompat
            android.content.Context r3 = r7.f9483a
            java.lang.String r4 = "CastMediaSession"
            r0.<init>(r3, r4, r8, r9)
            r7.f9493k = r0
            r8 = 0
            r7.m5502o(r2, r8)
            com.google.android.gms.cast.CastDevice r9 = r7.f9492j
            if (r9 == 0) goto Lb1
            java.lang.String r9 = r9.f5353b0
            boolean r9 = android.text.TextUtils.isEmpty(r9)
            if (r9 != 0) goto Lb1
            android.support.v4.media.session.MediaSessionCompat r9 = r7.f9493k
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            android.content.Context r3 = r7.f9483a
            android.content.res.Resources r3 = r3.getResources()
            r4 = 2131951664(0x7f130030, float:1.9539749E38)
            java.lang.Object[] r5 = new java.lang.Object[r1]
            com.google.android.gms.cast.CastDevice r6 = r7.f9492j
            java.lang.String r6 = r6.f5353b0
            r5[r2] = r6
            java.lang.String r6 = "android.media.metadata.ALBUM_ARTIST"
            java.lang.String r3 = r3.getString(r4, r5)
            s.a<java.lang.String, java.lang.Integer> r4 = android.support.v4.media.MediaMetadataCompat.f494b0
            int r5 = r4.m12340e(r6)
            if (r5 < 0) goto L8c
            r5 = 1
            goto L8d
        L8c:
            r5 = 0
        L8d:
            if (r5 == 0) goto La4
            java.lang.Object r4 = r4.getOrDefault(r6, r8)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            if (r4 != r1) goto L9c
            goto La4
        L9c:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "The android.media.metadata.ALBUM_ARTIST key cannot be used to put a String"
            r8.<init>(r9)
            throw r8
        La4:
            r0.putCharSequence(r6, r3)
            android.support.v4.media.MediaMetadataCompat r3 = new android.support.v4.media.MediaMetadataCompat
            r3.<init>(r0)
            android.support.v4.media.session.MediaSessionCompat$b r9 = r9.f523a
            r9.mo341m(r3)
        Lb1:
            f6.k r9 = new f6.k
            r9.<init>(r7)
            android.support.v4.media.session.MediaSessionCompat r0 = r7.f9493k
            r0.m288e(r9, r8)
            android.support.v4.media.session.MediaSessionCompat r8 = r7.f9493k
            r8.m287d(r1)
            e7.e r8 = r7.f9485c
            android.support.v4.media.session.MediaSessionCompat r9 = r7.f9493k
            r8.m4184x(r9)
        Lc7:
            r7.f9494l = r1
            r7.m5495h(r2)
        Lcc:
            return
    }

    /* renamed from: h */
    public final void m5495h(boolean r11) {
            r10 = this;
            com.google.android.gms.cast.framework.media.b r0 = r10.f9491i
            if (r0 != 0) goto L5
            return
        L5:
            com.google.android.gms.cast.MediaInfo r0 = r0.m2997d()
            com.google.android.gms.cast.framework.media.b r1 = r10.f9491i
            boolean r1 = r1.m3002i()
            r2 = 6
            r3 = 3
            r4 = 2
            r5 = 0
            if (r1 == 0) goto L16
            goto L41
        L16:
            com.google.android.gms.cast.framework.media.b r1 = r10.f9491i
            boolean r1 = r1.m3006m()
            if (r1 == 0) goto L20
            r2 = 3
            goto L41
        L20:
            com.google.android.gms.cast.framework.media.b r1 = r10.f9491i
            boolean r1 = r1.m3005l()
            if (r1 == 0) goto L2a
            r2 = 2
            goto L41
        L2a:
            com.google.android.gms.cast.framework.media.b r1 = r10.f9491i
            boolean r1 = r1.m3004k()
            if (r1 == 0) goto L40
            com.google.android.gms.cast.framework.media.b r1 = r10.f9491i
            c6.n r1 = r1.m2996c()
            if (r1 == 0) goto L40
            com.google.android.gms.cast.MediaInfo r1 = r1.f4811Y
            if (r1 == 0) goto L40
            r0 = r1
            goto L41
        L40:
            r2 = 0
        L41:
            if (r0 == 0) goto L47
            c6.k r1 = r0.f5376b0
            if (r1 != 0) goto L48
        L47:
            r2 = 0
        L48:
            r10.m5502o(r2, r0)
            com.google.android.gms.cast.framework.media.b r0 = r10.f9491i
            boolean r0 = r0.m3001h()
            if (r0 != 0) goto L5a
            r10.m5500m()
            r10.m5501n()
            return
        L5a:
            if (r2 == 0) goto L1a8
            com.google.android.gms.cast.CastDevice r0 = r10.f9492j
            r1 = 1
            if (r0 == 0) goto L19d
            d6.b r0 = r10.f9484b
            h6.b r2 = com.google.android.gms.cast.framework.media.MediaNotificationService.f5456o0
            java.lang.Class<v0.c> r2 = p366v0.AbstractC6484c.class
            e6.a r0 = r0.f6822d0
            if (r0 != 0) goto L6d
            goto Lf4
        L6d:
            e6.e r0 = r0.f7387b0
            if (r0 != 0) goto L73
            goto Lf4
        L73:
            e6.v r0 = r0.f7413D0
            if (r0 != 0) goto L78
            goto Lcf
        L78:
            java.util.List r6 = com.google.android.gms.cast.framework.media.MediaNotificationService.m2981b(r0)
            int[] r0 = com.google.android.gms.cast.framework.media.MediaNotificationService.m2982d(r0)
            if (r6 != 0) goto L84
            r7 = 0
            goto L88
        L84:
            int r7 = r6.size()
        L88:
            if (r6 == 0) goto Le3
            boolean r8 = r6.isEmpty()
            if (r8 == 0) goto L91
            goto Le3
        L91:
            int r6 = r6.size()
            r8 = 5
            if (r6 <= r8) goto Laa
            h6.b r0 = com.google.android.gms.cast.framework.media.MediaNotificationService.f5456o0
            java.lang.String r2 = r2.getSimpleName()
            java.lang.String r6 = " provides more than 5 actions."
            java.lang.String r2 = r2.concat(r6)
            java.lang.Object[] r6 = new java.lang.Object[r5]
            r0.m6378c(r2, r6)
            goto Lf4
        Laa:
            if (r0 == 0) goto Ld1
            int r6 = r0.length
            if (r6 != 0) goto Lb0
            goto Ld1
        Lb0:
            r8 = 0
        Lb1:
            if (r8 >= r6) goto Lcf
            r9 = r0[r8]
            if (r9 < 0) goto Lbd
            if (r9 < r7) goto Lba
            goto Lbd
        Lba:
            int r8 = r8 + 1
            goto Lb1
        Lbd:
            h6.b r0 = com.google.android.gms.cast.framework.media.MediaNotificationService.f5456o0
            java.lang.String r2 = r2.getSimpleName()
            java.lang.String r6 = "provides a compact view action whose index is out of bounds."
            java.lang.String r2 = r2.concat(r6)
            java.lang.Object[] r6 = new java.lang.Object[r5]
            r0.m6378c(r2, r6)
            goto Lf4
        Lcf:
            r0 = 1
            goto Lf5
        Ld1:
            h6.b r0 = com.google.android.gms.cast.framework.media.MediaNotificationService.f5456o0
            java.lang.String r2 = r2.getSimpleName()
            java.lang.String r6 = " doesn't provide any actions for compact view."
            java.lang.String r2 = r2.concat(r6)
            java.lang.Object[] r6 = new java.lang.Object[r5]
            r0.m6378c(r2, r6)
            goto Lf4
        Le3:
            h6.b r0 = com.google.android.gms.cast.framework.media.MediaNotificationService.f5456o0
            java.lang.String r2 = r2.getSimpleName()
            java.lang.String r6 = " doesn't provide any action."
            java.lang.String r2 = r2.concat(r6)
            java.lang.Object[] r6 = new java.lang.Object[r5]
            r0.m6378c(r2, r6)
        Lf4:
            r0 = 0
        Lf5:
            if (r0 != 0) goto Lf9
            goto L19d
        Lf9:
            android.content.Intent r0 = new android.content.Intent
            android.content.Context r2 = r10.f9483a
            java.lang.Class<com.google.android.gms.cast.framework.media.MediaNotificationService> r6 = com.google.android.gms.cast.framework.media.MediaNotificationService.class
            r0.<init>(r2, r6)
            java.lang.String r2 = "extra_media_notification_force_update"
            r0.putExtra(r2, r11)
            android.content.Context r11 = r10.f9483a
            java.lang.String r11 = r11.getPackageName()
            r0.setPackage(r11)
            java.lang.String r11 = "com.google.android.gms.cast.framework.action.UPDATE_NOTIFICATION"
            r0.setAction(r11)
            com.google.android.gms.cast.framework.media.b r11 = r10.f9491i
            com.google.android.gms.cast.MediaInfo r11 = r11.m2997d()
            java.lang.String r2 = "extra_media_info"
            r0.putExtra(r2, r11)
            com.google.android.gms.cast.framework.media.b r11 = r10.f9491i
            int r11 = r11.m2999f()
            java.lang.String r2 = "extra_remote_media_client_player_state"
            r0.putExtra(r2, r11)
            com.google.android.gms.cast.CastDevice r11 = r10.f9492j
            java.lang.String r2 = "extra_cast_device"
            r0.putExtra(r2, r11)
            android.support.v4.media.session.MediaSessionCompat r11 = r10.f9493k
            if (r11 == 0) goto L13f
            android.support.v4.media.session.MediaSessionCompat$Token r11 = r11.m286b()
            java.lang.String r2 = "extra_media_session_token"
            r0.putExtra(r2, r11)
        L13f:
            com.google.android.gms.cast.framework.media.b r11 = r10.f9491i
            c6.p r11 = r11.m2998e()
            int r2 = r11.f4839n0
            if (r2 == r1) goto L177
            if (r2 == r4) goto L177
            if (r2 == r3) goto L177
            int r2 = r11.f4826a0
            android.util.SparseArray<java.lang.Integer> r3 = r11.f4846u0
            java.lang.Object r2 = r3.get(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            if (r2 == 0) goto L174
            int r3 = r2.intValue()
            if (r3 <= 0) goto L161
            r3 = 1
            goto L162
        L161:
            r3 = 0
        L162:
            int r2 = r2.intValue()
            java.util.List<c6.n> r11 = r11.f4840o0
            int r11 = r11.size()
            int r11 = r11 + (-1)
            if (r2 >= r11) goto L172
            r11 = 1
            goto L179
        L172:
            r11 = 0
            goto L179
        L174:
            r11 = 0
            r3 = 0
            goto L179
        L177:
            r11 = 1
            r3 = 1
        L179:
            java.lang.String r2 = "extra_can_skip_next"
            r0.putExtra(r2, r11)
            java.lang.String r11 = "extra_can_skip_prev"
            r0.putExtra(r11, r3)
            h6.b r11 = p090f6.C2077l.f9482m
            java.lang.Object[] r2 = new java.lang.Object[r5]
            java.lang.String r3 = "Starting notification service."
            r11.m6376a(r3, r2)
            int r11 = android.os.Build.VERSION.SDK_INT
            r2 = 26
            if (r11 < r2) goto L198
            android.content.Context r11 = r10.f9483a
            r11.startForegroundService(r0)
            goto L19d
        L198:
            android.content.Context r11 = r10.f9483a
            r11.startService(r0)
        L19d:
            com.google.android.gms.cast.framework.media.b r11 = r10.f9491i
            boolean r11 = r11.m3004k()
            if (r11 != 0) goto L1a8
            r10.m5499l(r1)
        L1a8:
            return
    }

    /* renamed from: i */
    public final android.net.Uri m5496i(p036c6.C0893k r2, int r3) {
            r1 = this;
            d6.b r3 = r1.f9484b
            e6.a r3 = r3.f6822d0
            e6.c r3 = r3.m4105X()
            r0 = 0
            if (r3 == 0) goto L18
            d6.b r3 = r1.f9484b
            e6.a r3 = r3.f6822d0
            e6.c r3 = r3.m4105X()
            n6.a r2 = r3.m4106a(r2)
            goto L29
        L18:
            boolean r3 = r2.m2600Y()
            if (r3 == 0) goto L28
            java.util.List<n6.a> r2 = r2.f4793Y
            r3 = 0
            java.lang.Object r2 = r2.get(r3)
            n6.a r2 = (p233n6.C4691a) r2
            goto L29
        L28:
            r2 = r0
        L29:
            if (r2 != 0) goto L2c
            return r0
        L2c:
            android.net.Uri r2 = r2.f18717Z
            return r2
    }

    /* renamed from: j */
    public final android.support.v4.media.MediaMetadataCompat.C0139b m5497j() {
            r2 = this;
            android.support.v4.media.session.MediaSessionCompat r0 = r2.f9493k
            if (r0 != 0) goto L6
            r0 = 0
            goto Lc
        L6:
            android.support.v4.media.session.MediaControllerCompat r0 = r0.f524b
            android.support.v4.media.MediaMetadataCompat r0 = r0.m259a()
        Lc:
            if (r0 != 0) goto L14
            android.support.v4.media.MediaMetadataCompat$b r0 = new android.support.v4.media.MediaMetadataCompat$b
            r0.<init>()
            goto L1a
        L14:
            android.support.v4.media.MediaMetadataCompat$b r1 = new android.support.v4.media.MediaMetadataCompat$b
            r1.<init>(r0)
            r0 = r1
        L1a:
            return r0
    }

    /* renamed from: k */
    public final void m5498k(android.graphics.Bitmap r3, int r4) {
            r2 = this;
            android.support.v4.media.session.MediaSessionCompat r0 = r2.f9493k
            if (r0 != 0) goto L5
            return
        L5:
            if (r4 != 0) goto L3a
            java.lang.String r4 = "android.media.metadata.DISPLAY_ICON"
            if (r3 == 0) goto L1c
            android.support.v4.media.MediaMetadataCompat$b r1 = r2.m5497j()
            r1.m234b(r4, r3)
            android.support.v4.media.MediaMetadataCompat r3 = r1.m233a()
            android.support.v4.media.session.MediaSessionCompat$b r4 = r0.f523a
            r4.mo341m(r3)
            return
        L1c:
            android.graphics.Bitmap$Config r3 = android.graphics.Bitmap.Config.ARGB_8888
            r0 = 1
            android.graphics.Bitmap r3 = android.graphics.Bitmap.createBitmap(r0, r0, r3)
            r0 = 0
            r3.eraseColor(r0)
            android.support.v4.media.session.MediaSessionCompat r0 = r2.f9493k
            android.support.v4.media.MediaMetadataCompat$b r1 = r2.m5497j()
            r1.m234b(r4, r3)
            android.support.v4.media.MediaMetadataCompat r3 = r1.m233a()
            android.support.v4.media.session.MediaSessionCompat$b r4 = r0.f523a
            r4.mo341m(r3)
            return
        L3a:
            r1 = 3
            if (r4 != r1) goto L4f
            android.support.v4.media.MediaMetadataCompat$b r4 = r2.m5497j()
            java.lang.String r1 = "android.media.metadata.ALBUM_ART"
            r4.m234b(r1, r3)
            android.support.v4.media.MediaMetadataCompat r3 = r4.m233a()
            android.support.v4.media.session.MediaSessionCompat$b r4 = r0.f523a
            r4.mo341m(r3)
        L4f:
            return
    }

    /* renamed from: l */
    public final void m5499l(boolean r4) {
            r3 = this;
            d6.b r0 = r3.f9484b
            boolean r0 = r0.f6823e0
            if (r0 != 0) goto L7
            return
        L7:
            android.os.Handler r0 = r3.f9489g
            java.lang.Runnable r1 = r3.f9490h
            r0.removeCallbacks(r1)
            android.content.Intent r0 = new android.content.Intent
            android.content.Context r1 = r3.f9483a
            java.lang.Class<com.google.android.gms.cast.framework.ReconnectionService> r2 = com.google.android.gms.cast.framework.ReconnectionService.class
            r0.<init>(r1, r2)
            android.content.Context r1 = r3.f9483a
            java.lang.String r1 = r1.getPackageName()
            r0.setPackage(r1)
            android.content.Context r1 = r3.f9483a     // Catch: java.lang.IllegalStateException -> L26
            r1.startService(r0)     // Catch: java.lang.IllegalStateException -> L26
            return
        L26:
            if (r4 == 0) goto L32
            android.os.Handler r4 = r3.f9489g
            java.lang.Runnable r0 = r3.f9490h
            r1 = 1000(0x3e8, double:4.94E-321)
            r4.postDelayed(r0, r1)
        L32:
            return
    }

    /* renamed from: m */
    public final void m5500m() {
            r3 = this;
            d6.b r0 = r3.f9484b
            e6.a r0 = r0.f6822d0
            e6.e r0 = r0.f7387b0
            if (r0 != 0) goto L9
            return
        L9:
            h6.b r0 = p090f6.C2077l.f9482m
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "Stopping notification service."
            r0.m6376a(r2, r1)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L21
            java.lang.Runnable r0 = com.google.android.gms.cast.framework.media.MediaNotificationService.f5457p0
            if (r0 == 0) goto L20
            r0.run()
        L20:
            return
        L21:
            android.content.Intent r0 = new android.content.Intent
            android.content.Context r1 = r3.f9483a
            java.lang.Class<com.google.android.gms.cast.framework.media.MediaNotificationService> r2 = com.google.android.gms.cast.framework.media.MediaNotificationService.class
            r0.<init>(r1, r2)
            android.content.Context r1 = r3.f9483a
            java.lang.String r1 = r1.getPackageName()
            r0.setPackage(r1)
            java.lang.String r1 = "com.google.android.gms.cast.framework.action.UPDATE_NOTIFICATION"
            r0.setAction(r1)
            android.content.Context r1 = r3.f9483a
            r1.stopService(r0)
            return
    }

    /* renamed from: n */
    public final void m5501n() {
            r3 = this;
            d6.b r0 = r3.f9484b
            boolean r0 = r0.f6823e0
            if (r0 != 0) goto L7
            return
        L7:
            android.os.Handler r0 = r3.f9489g
            java.lang.Runnable r1 = r3.f9490h
            r0.removeCallbacks(r1)
            android.content.Intent r0 = new android.content.Intent
            android.content.Context r1 = r3.f9483a
            java.lang.Class<com.google.android.gms.cast.framework.ReconnectionService> r2 = com.google.android.gms.cast.framework.ReconnectionService.class
            r0.<init>(r1, r2)
            android.content.Context r1 = r3.f9483a
            java.lang.String r1 = r1.getPackageName()
            r0.setPackage(r1)
            android.content.Context r1 = r3.f9483a
            r1.stopService(r0)
            return
    }

    /* renamed from: o */
    public final void m5502o(int r24, com.google.android.gms.cast.MediaInfo r25) {
            r23 = this;
            r0 = r23
            r1 = r25
            android.support.v4.media.session.MediaSessionCompat r2 = r0.f9493k
            if (r2 != 0) goto L9
            return
        L9:
            if (r24 != 0) goto L42
            r19 = 0
            r13 = 0
            r12 = 0
            r10 = 0
            r7 = 0
            java.util.ArrayList r1 = new java.util.ArrayList
            r16 = r1
            r1.<init>()
            r17 = -1
            r4 = 0
            r5 = 0
            r9 = 1065353216(0x3f800000, float:1.0)
            long r14 = android.os.SystemClock.elapsedRealtime()
            android.support.v4.media.session.PlaybackStateCompat r1 = new android.support.v4.media.session.PlaybackStateCompat
            r3 = r1
            r3.<init>(r4, r5, r7, r9, r10, r12, r13, r14, r16, r17, r19)
            android.support.v4.media.session.MediaSessionCompat$b r2 = r2.f523a
            r2.mo335g(r1)
            android.support.v4.media.session.MediaSessionCompat r1 = r0.f9493k
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            android.support.v4.media.MediaMetadataCompat r3 = new android.support.v4.media.MediaMetadataCompat
            r3.<init>(r2)
            android.support.v4.media.session.MediaSessionCompat$b r1 = r1.f523a
            r1.mo341m(r3)
            return
        L42:
            r2 = 1
            com.google.android.gms.cast.framework.media.b r3 = r0.f9491i
            boolean r3 = r3.m3003j()
            if (r2 == r3) goto L4e
            r2 = 768(0x300, double:3.794E-321)
            goto L50
        L4e:
            r2 = 512(0x200, double:2.53E-321)
        L50:
            r10 = r2
            com.google.android.gms.cast.framework.media.b r2 = r0.f9491i
            boolean r2 = r2.m3003j()
            r20 = 0
            if (r2 == 0) goto L5e
            r5 = r20
            goto L65
        L5e:
            com.google.android.gms.cast.framework.media.b r2 = r0.f9491i
            long r2 = r2.m2995b()
            r5 = r2
        L65:
            android.support.v4.media.session.MediaSessionCompat r2 = r0.f9493k
            r19 = 0
            r13 = 0
            r12 = 0
            r7 = 0
            java.util.ArrayList r3 = new java.util.ArrayList
            r16 = r3
            r3.<init>()
            r17 = -1
            r9 = 1065353216(0x3f800000, float:1.0)
            long r14 = android.os.SystemClock.elapsedRealtime()
            android.support.v4.media.session.PlaybackStateCompat r4 = new android.support.v4.media.session.PlaybackStateCompat
            r3 = r4
            r22 = r4
            r4 = r24
            r3.<init>(r4, r5, r7, r9, r10, r12, r13, r14, r16, r17, r19)
            android.support.v4.media.session.MediaSessionCompat$b r2 = r2.f523a
            r3 = r22
            r2.mo335g(r3)
            android.support.v4.media.session.MediaSessionCompat r2 = r0.f9493k
            android.content.ComponentName r3 = r0.f9486d
            r4 = 0
            r5 = 0
            if (r3 != 0) goto L97
            r3 = r4
            goto Lac
        L97:
            android.content.Intent r3 = new android.content.Intent
            r3.<init>()
            android.content.ComponentName r6 = r0.f9486d
            r3.setComponent(r6)
            android.content.Context r6 = r0.f9483a
            int r7 = p072e7.C1642j.f7655a
            r8 = 134217728(0x8000000, float:3.85186E-34)
            r7 = r7 | r8
            android.app.PendingIntent r3 = android.app.PendingIntent.getActivity(r6, r5, r3, r7)
        Lac:
            android.support.v4.media.session.MediaSessionCompat$b r2 = r2.f523a
            r2.mo334f(r3)
            android.support.v4.media.session.MediaSessionCompat r2 = r0.f9493k
            if (r2 != 0) goto Lb6
            return
        Lb6:
            c6.k r2 = r1.f5376b0
            com.google.android.gms.cast.framework.media.b r3 = r0.f9491i
            boolean r3 = r3.m3003j()
            if (r3 == 0) goto Lc3
            r6 = r20
            goto Lc5
        Lc3:
            long r6 = r1.f5377c0
        Lc5:
            android.support.v4.media.MediaMetadataCompat$b r1 = r23.m5497j()
            java.lang.String r3 = "com.google.android.gms.cast.metadata.TITLE"
            java.lang.String r8 = r2.m2599X(r3)
            java.lang.String r9 = "android.media.metadata.TITLE"
            r1.m236d(r9, r8)
            java.lang.String r3 = r2.m2599X(r3)
            java.lang.String r8 = "android.media.metadata.DISPLAY_TITLE"
            r1.m236d(r8, r3)
            java.lang.String r3 = "com.google.android.gms.cast.metadata.SUBTITLE"
            java.lang.String r3 = r2.m2599X(r3)
            java.lang.String r8 = "android.media.metadata.DISPLAY_SUBTITLE"
            r1.m236d(r8, r3)
            java.lang.String r3 = "android.media.metadata.DURATION"
            r1.m235c(r3, r6)
            android.support.v4.media.session.MediaSessionCompat r3 = r0.f9493k
            android.support.v4.media.MediaMetadataCompat r1 = r1.m233a()
            android.support.v4.media.session.MediaSessionCompat$b r3 = r3.f523a
            r3.mo341m(r1)
            android.net.Uri r1 = r0.m5496i(r2, r5)
            if (r1 == 0) goto L104
            f6.b r3 = r0.f9487e
            r3.m5490b(r1)
            goto L107
        L104:
            r0.m5498k(r4, r5)
        L107:
            r1 = 3
            android.net.Uri r2 = r0.m5496i(r2, r1)
            if (r2 == 0) goto L114
            f6.b r1 = r0.f9488f
            r1.m5490b(r2)
            return
        L114:
            r0.m5498k(r4, r1)
            return
    }
}
