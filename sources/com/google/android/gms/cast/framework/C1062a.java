package com.google.android.gms.cast.framework;

/* renamed from: com.google.android.gms.cast.framework.a */
/* loaded from: classes.dex */
public class C1062a extends p052d6.AbstractC1303e {

    /* renamed from: m */
    public static final p123h6.C2489b f5438m = null;

    /* renamed from: c */
    public final android.content.Context f5439c;

    /* renamed from: d */
    public final java.util.Set<com.google.android.gms.cast.C1057a.c> f5440d;

    /* renamed from: e */
    public final p052d6.InterfaceC1330r0 f5441e;

    /* renamed from: f */
    public final p052d6.C1297b f5442f;

    /* renamed from: g */
    public final p090f6.C2077l f5443g;

    /* renamed from: h */
    public com.google.android.gms.cast.InterfaceC1061e f5444h;

    /* renamed from: i */
    public com.google.android.gms.cast.framework.media.C1065b f5445i;

    /* renamed from: j */
    public com.google.android.gms.cast.CastDevice f5446j;

    /* renamed from: k */
    public com.google.android.gms.cast.C1057a.a f5447k;

    /* renamed from: l */
    public p072e7.C1612g f5448l;

    static {
            h6.b r0 = new h6.b
            java.lang.String r1 = "CastSession"
            r0.<init>(r1)
            com.google.android.gms.cast.framework.C1062a.f5438m = r0
            return
    }

    public C1062a(android.content.Context r1, java.lang.String r2, java.lang.String r3, p052d6.C1297b r4, p090f6.C2077l r5) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            r0.f5440d = r2
            android.content.Context r2 = r1.getApplicationContext()
            r0.f5439c = r2
            r0.f5442f = r4
            r0.f5443g = r5
            x6.a r2 = r0.m3767i()
            d6.e0 r3 = new d6.e0
            r3.<init>(r0)
            h6.b r5 = p072e7.C1726r3.f7765a
            if (r2 != 0) goto L22
            goto L46
        L22:
            e7.w6 r1 = p072e7.C1726r3.m4430a(r1)     // Catch: p052d6.C1337y -> L2b android.os.RemoteException -> L2d
            d6.r0 r1 = r1.mo4481h1(r4, r2, r3)     // Catch: p052d6.C1337y -> L2b android.os.RemoteException -> L2d
            goto L47
        L2b:
            r1 = move-exception
            goto L2e
        L2d:
            r1 = move-exception
        L2e:
            h6.b r2 = p072e7.C1726r3.f7765a
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            java.lang.String r5 = "newCastSessionImpl"
            r3[r4] = r5
            r4 = 1
            java.lang.Class<e7.w6> r5 = p072e7.InterfaceC1775w6.class
            java.lang.String r5 = r5.getSimpleName()
            r3[r4] = r5
            java.lang.String r4 = "Unable to call %s on %s."
            r2.m6377b(r1, r4, r3)
        L46:
            r1 = 0
        L47:
            r0.f5441e = r1
            return
    }

    /* renamed from: l */
    public static void m2969l(com.google.android.gms.cast.framework.C1062a r6, int r7) {
            f6.l r0 = r6.f5443g
            boolean r1 = r0.f9494l
            r2 = 0
            if (r1 != 0) goto L8
            goto L66
        L8:
            r1 = 0
            r0.f9494l = r1
            com.google.android.gms.cast.framework.media.b r3 = r0.f9491i
            if (r3 == 0) goto L19
            java.lang.String r4 = "Must be called from the main thread."
            com.google.android.gms.common.internal.C1101a.m3099d(r4)
            java.util.List<com.google.android.gms.cast.framework.media.b$b> r3 = r3.f5494g
            r3.remove(r0)
        L19:
            e7.e r3 = r0.f9485c
            r3.m4184x(r2)
            f6.b r3 = r0.f9487e
            r3.m5489a()
            f6.b r3 = r0.f9488f
            if (r3 == 0) goto L2a
            r3.m5489a()
        L2a:
            android.support.v4.media.session.MediaSessionCompat r3 = r0.f9493k
            if (r3 == 0) goto L5a
            android.support.v4.media.session.MediaSessionCompat$b r3 = r3.f523a
            r3.mo334f(r2)
            android.support.v4.media.session.MediaSessionCompat r3 = r0.f9493k
            r3.m288e(r2, r2)
            android.support.v4.media.session.MediaSessionCompat r3 = r0.f9493k
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            android.support.v4.media.MediaMetadataCompat r5 = new android.support.v4.media.MediaMetadataCompat
            r5.<init>(r4)
            android.support.v4.media.session.MediaSessionCompat$b r3 = r3.f523a
            r3.mo341m(r5)
            r0.m5502o(r1, r2)
            android.support.v4.media.session.MediaSessionCompat r3 = r0.f9493k
            r3.m287d(r1)
            android.support.v4.media.session.MediaSessionCompat r1 = r0.f9493k
            android.support.v4.media.session.MediaSessionCompat$b r1 = r1.f523a
            r1.release()
            r0.f9493k = r2
        L5a:
            r0.f9491i = r2
            r0.f9492j = r2
            r0.m5500m()
            if (r7 != 0) goto L66
            r0.m5501n()
        L66:
            com.google.android.gms.cast.e r7 = r6.f5444h
            if (r7 == 0) goto L71
            com.google.android.gms.cast.d r7 = (com.google.android.gms.cast.C1060d) r7
            r7.m2967m()
            r6.f5444h = r2
        L71:
            r6.f5446j = r2
            com.google.android.gms.cast.framework.media.b r7 = r6.f5445i
            if (r7 == 0) goto L7c
            r7.m3013u(r2)
            r6.f5445i = r2
        L7c:
            return
    }

    /* renamed from: m */
    public static void m2970m(com.google.android.gms.cast.framework.C1062a r5, java.lang.String r6, p327s7.AbstractC5985i r7) {
            java.lang.String r0 = "null reference"
            d6.r0 r1 = r5.f5441e
            if (r1 != 0) goto L7
            return
        L7:
            r1 = 0
            r2 = 1
            boolean r3 = r7.mo12455m()     // Catch: android.os.RemoteException -> Lac
            if (r3 == 0) goto L90
            java.lang.Object r7 = r7.mo12451i()     // Catch: android.os.RemoteException -> Lac
            com.google.android.gms.cast.a$a r7 = (com.google.android.gms.cast.C1057a.a) r7     // Catch: android.os.RemoteException -> Lac
            r5.f5447k = r7     // Catch: android.os.RemoteException -> Lac
            com.google.android.gms.common.api.Status r3 = r7.mo3030F()     // Catch: android.os.RemoteException -> Lac
            if (r3 == 0) goto L73
            com.google.android.gms.common.api.Status r3 = r7.mo3030F()     // Catch: android.os.RemoteException -> Lac
            int r3 = r3.f5536Z     // Catch: android.os.RemoteException -> Lac
            if (r3 > 0) goto L27
            r3 = 1
            goto L28
        L27:
            r3 = 0
        L28:
            if (r3 == 0) goto L73
            h6.b r3 = com.google.android.gms.cast.framework.C1062a.f5438m     // Catch: android.os.RemoteException -> Lac
            java.lang.Object[] r4 = new java.lang.Object[r2]     // Catch: android.os.RemoteException -> Lac
            r4[r1] = r6     // Catch: android.os.RemoteException -> Lac
            java.lang.String r6 = "%s() -> success result"
            r3.m6376a(r6, r4)     // Catch: android.os.RemoteException -> Lac
            com.google.android.gms.cast.framework.media.b r6 = new com.google.android.gms.cast.framework.media.b     // Catch: android.os.RemoteException -> Lac
            h6.n r3 = new h6.n     // Catch: android.os.RemoteException -> Lac
            r4 = 0
            r3.<init>(r4)     // Catch: android.os.RemoteException -> Lac
            r6.<init>(r3)     // Catch: android.os.RemoteException -> Lac
            r5.f5445i = r6     // Catch: android.os.RemoteException -> Lac
            com.google.android.gms.cast.e r3 = r5.f5444h     // Catch: android.os.RemoteException -> Lac
            r6.m3013u(r3)     // Catch: android.os.RemoteException -> Lac
            com.google.android.gms.cast.framework.media.b r6 = r5.f5445i     // Catch: android.os.RemoteException -> Lac
            r6.m3012t()     // Catch: android.os.RemoteException -> Lac
            f6.l r6 = r5.f5443g     // Catch: android.os.RemoteException -> Lac
            com.google.android.gms.cast.framework.media.b r3 = r5.f5445i     // Catch: android.os.RemoteException -> Lac
            com.google.android.gms.cast.CastDevice r4 = r5.m2978j()     // Catch: android.os.RemoteException -> Lac
            r6.m5494g(r3, r4)     // Catch: android.os.RemoteException -> Lac
            d6.r0 r5 = r5.f5441e     // Catch: android.os.RemoteException -> Lac
            c6.d r6 = r7.mo2932W()     // Catch: android.os.RemoteException -> Lac
            java.util.Objects.requireNonNull(r6, r0)     // Catch: android.os.RemoteException -> Lac
            java.lang.String r3 = r7.mo2934w()     // Catch: android.os.RemoteException -> Lac
            java.lang.String r4 = r7.mo2931K()     // Catch: android.os.RemoteException -> Lac
            java.util.Objects.requireNonNull(r4, r0)     // Catch: android.os.RemoteException -> Lac
            boolean r7 = r7.mo2933m()     // Catch: android.os.RemoteException -> Lac
            r5.mo3826r0(r6, r3, r4, r7)     // Catch: android.os.RemoteException -> Lac
            return
        L73:
            com.google.android.gms.common.api.Status r0 = r7.mo3030F()     // Catch: android.os.RemoteException -> Lac
            if (r0 == 0) goto La4
            h6.b r0 = com.google.android.gms.cast.framework.C1062a.f5438m     // Catch: android.os.RemoteException -> Lac
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch: android.os.RemoteException -> Lac
            r3[r1] = r6     // Catch: android.os.RemoteException -> Lac
            java.lang.String r6 = "%s() -> failure result"
            r0.m6376a(r6, r3)     // Catch: android.os.RemoteException -> Lac
            d6.r0 r5 = r5.f5441e     // Catch: android.os.RemoteException -> Lac
            com.google.android.gms.common.api.Status r6 = r7.mo3030F()     // Catch: android.os.RemoteException -> Lac
            int r6 = r6.f5536Z     // Catch: android.os.RemoteException -> Lac
            r5.mo3827s(r6)     // Catch: android.os.RemoteException -> Lac
            return
        L90:
            java.lang.Exception r6 = r7.mo12450h()     // Catch: android.os.RemoteException -> Lac
            boolean r7 = r6 instanceof p201l6.C4182b     // Catch: android.os.RemoteException -> Lac
            if (r7 == 0) goto La4
            d6.r0 r5 = r5.f5441e     // Catch: android.os.RemoteException -> Lac
            l6.b r6 = (p201l6.C4182b) r6     // Catch: android.os.RemoteException -> Lac
            com.google.android.gms.common.api.Status r6 = r6.f17345Y     // Catch: android.os.RemoteException -> Lac
            int r6 = r6.f5536Z     // Catch: android.os.RemoteException -> Lac
            r5.mo3827s(r6)     // Catch: android.os.RemoteException -> Lac
            return
        La4:
            d6.r0 r5 = r5.f5441e     // Catch: android.os.RemoteException -> Lac
            r6 = 2476(0x9ac, float:3.47E-42)
            r5.mo3827s(r6)     // Catch: android.os.RemoteException -> Lac
            return
        Lac:
            r5 = move-exception
            h6.b r6 = com.google.android.gms.cast.framework.C1062a.f5438m
            r7 = 2
            java.lang.Object[] r7 = new java.lang.Object[r7]
            java.lang.String r0 = "methods"
            r7[r1] = r0
            java.lang.Class<d6.r0> r0 = p052d6.InterfaceC1330r0.class
            java.lang.String r0 = r0.getSimpleName()
            r7[r2] = r0
            java.lang.String r0 = "Unable to call %s on %s."
            r6.m6377b(r5, r0, r7)
            return
    }

    @Override // p052d6.AbstractC1303e
    /* renamed from: a */
    public void mo2971a(boolean r7) {
            r6 = this;
            d6.r0 r0 = r6.f5441e
            if (r0 == 0) goto L71
            r1 = 1
            r2 = 2
            r3 = 0
            r0.mo3824U1(r7, r3)     // Catch: android.os.RemoteException -> Lb
            goto L21
        Lb:
            r7 = move-exception
            h6.b r0 = com.google.android.gms.cast.framework.C1062a.f5438m
            java.lang.Object[] r4 = new java.lang.Object[r2]
            java.lang.String r5 = "disconnectFromDevice"
            r4[r3] = r5
            java.lang.Class<d6.r0> r5 = p052d6.InterfaceC1330r0.class
            java.lang.String r5 = r5.getSimpleName()
            r4[r1] = r5
            java.lang.String r5 = "Unable to call %s on %s."
            r0.m6377b(r7, r5, r4)
        L21:
            r6.m3766c(r3)
            e7.g r7 = r6.f5448l
            if (r7 == 0) goto L71
            int r0 = r7.f7559b
            if (r0 == 0) goto L71
            c6.q r4 = r7.f7562e
            if (r4 != 0) goto L31
            goto L71
        L31:
            h6.b r4 = p072e7.C1612g.f7557f
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2[r3] = r0
            c6.q r0 = r7.f7562e
            r2[r1] = r0
            java.lang.String r0 = "notify transferred with type = %d, sessionState = %s"
            r4.m6376a(r0, r2)
            java.util.HashSet r0 = new java.util.HashSet
            java.util.Set<d6.i> r1 = r7.f7558a
            r0.<init>(r1)
            java.util.Iterator r0 = r0.iterator()
        L4f:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L5f
            java.lang.Object r1 = r0.next()
            d6.i r1 = (p052d6.AbstractC1311i) r1
            java.util.Objects.requireNonNull(r1)
            goto L4f
        L5f:
            r7.f7559b = r3
            r0 = 0
            r7.f7562e = r0
            d6.f r7 = r7.f7560c
            if (r7 != 0) goto L69
            goto L71
        L69:
            com.google.android.gms.cast.framework.a r7 = r7.m3770c()
            if (r7 == 0) goto L71
            r7.f5448l = r0
        L71:
            return
    }

    @Override // p052d6.AbstractC1303e
    /* renamed from: b */
    public long mo2972b() {
            r4 = this;
            java.lang.String r0 = "Must be called from the main thread."
            com.google.android.gms.common.internal.C1101a.m3099d(r0)
            com.google.android.gms.cast.framework.media.b r0 = r4.f5445i
            if (r0 != 0) goto Lc
            r0 = 0
            return r0
        Lc:
            long r0 = r0.m3000g()
            com.google.android.gms.cast.framework.media.b r2 = r4.f5445i
            long r2 = r2.m2995b()
            long r0 = r0 - r2
            return r0
    }

    @Override // p052d6.AbstractC1303e
    /* renamed from: d */
    public void mo2973d(@androidx.annotation.RecentlyNonNull android.os.Bundle r1) {
            r0 = this;
            com.google.android.gms.cast.CastDevice r1 = com.google.android.gms.cast.CastDevice.m2927X(r1)
            r0.f5446j = r1
            return
    }

    @Override // p052d6.AbstractC1303e
    /* renamed from: e */
    public void mo2974e(@androidx.annotation.RecentlyNonNull android.os.Bundle r1) {
            r0 = this;
            com.google.android.gms.cast.CastDevice r1 = com.google.android.gms.cast.CastDevice.m2927X(r1)
            r0.f5446j = r1
            return
    }

    @Override // p052d6.AbstractC1303e
    /* renamed from: f */
    public void mo2975f(@androidx.annotation.RecentlyNonNull android.os.Bundle r1) {
            r0 = this;
            r0.m2980n(r1)
            return
    }

    @Override // p052d6.AbstractC1303e
    /* renamed from: g */
    public void mo2976g(@androidx.annotation.RecentlyNonNull android.os.Bundle r1) {
            r0 = this;
            r0.m2980n(r1)
            return
    }

    @Override // p052d6.AbstractC1303e
    /* renamed from: h */
    public final void mo2977h(@androidx.annotation.RecentlyNonNull android.os.Bundle r1) {
            r0 = this;
            com.google.android.gms.cast.CastDevice r1 = com.google.android.gms.cast.CastDevice.m2927X(r1)
            r0.f5446j = r1
            return
    }

    @androidx.annotation.RecentlyNullable
    @org.checkerframework.dataflow.qual.Pure
    /* renamed from: j */
    public com.google.android.gms.cast.CastDevice m2978j() {
            r1 = this;
            java.lang.String r0 = "Must be called from the main thread."
            com.google.android.gms.common.internal.C1101a.m3099d(r0)
            com.google.android.gms.cast.CastDevice r0 = r1.f5446j
            return r0
    }

    @androidx.annotation.RecentlyNullable
    /* renamed from: k */
    public com.google.android.gms.cast.framework.media.C1065b m2979k() {
            r1 = this;
            java.lang.String r0 = "Must be called from the main thread."
            com.google.android.gms.common.internal.C1101a.m3099d(r0)
            com.google.android.gms.cast.framework.media.b r0 = r1.f5445i
            return r0
    }

    /* renamed from: n */
    public final void m2980n(android.os.Bundle r14) {
            r13 = this;
            com.google.android.gms.cast.CastDevice r14 = com.google.android.gms.cast.CastDevice.m2927X(r14)
            r13.f5446j = r14
            r0 = 1
            r1 = 0
            if (r14 != 0) goto L70
            java.lang.String r14 = "Must be called from the main thread."
            com.google.android.gms.common.internal.C1101a.m3099d(r14)
            d6.r r14 = r13.f6834a
            java.lang.String r2 = "Unable to call %s on %s."
            r3 = 2
            if (r14 == 0) goto L2f
            boolean r14 = r14.mo3816I()     // Catch: android.os.RemoteException -> L1b
            goto L30
        L1b:
            r14 = move-exception
            h6.b r4 = p052d6.AbstractC1303e.f6833b
            java.lang.Object[] r5 = new java.lang.Object[r3]
            java.lang.String r6 = "isResuming"
            r5[r1] = r6
            java.lang.Class<d6.r> r6 = p052d6.InterfaceC1329r.class
            java.lang.String r6 = r6.getSimpleName()
            r5[r0] = r6
            r4.m6377b(r14, r2, r5)
        L2f:
            r14 = 0
        L30:
            if (r14 == 0) goto L51
            r14 = 2153(0x869, float:3.017E-42)
            d6.r r4 = r13.f6834a
            if (r4 == 0) goto L50
            r4.mo3822w(r14)     // Catch: android.os.RemoteException -> L3c
            goto L50
        L3c:
            r14 = move-exception
            h6.b r4 = p052d6.AbstractC1303e.f6833b
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r5 = "notifyFailedToResumeSession"
            r3[r1] = r5
            java.lang.Class<d6.r> r1 = p052d6.InterfaceC1329r.class
            java.lang.String r1 = r1.getSimpleName()
            r3[r0] = r1
            r4.m6377b(r14, r2, r3)
        L50:
            return
        L51:
            r14 = 2151(0x867, float:3.014E-42)
            d6.r r4 = r13.f6834a
            if (r4 == 0) goto L6f
            r4.mo3815B(r14)     // Catch: android.os.RemoteException -> L5b
            goto L6f
        L5b:
            r14 = move-exception
            h6.b r4 = p052d6.AbstractC1303e.f6833b
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r5 = "notifyFailedToStartSession"
            r3[r1] = r5
            java.lang.Class<d6.r> r1 = p052d6.InterfaceC1329r.class
            java.lang.String r1 = r1.getSimpleName()
            r3[r0] = r1
            r4.m6377b(r14, r2, r3)
        L6f:
            return
        L70:
            com.google.android.gms.cast.e r14 = r13.f5444h
            r2 = 0
            if (r14 == 0) goto L7c
            com.google.android.gms.cast.d r14 = (com.google.android.gms.cast.C1060d) r14
            r14.m2967m()
            r13.f5444h = r2
        L7c:
            h6.b r14 = com.google.android.gms.cast.framework.C1062a.f5438m
            java.lang.Object[] r3 = new java.lang.Object[r0]
            com.google.android.gms.cast.CastDevice r4 = r13.f5446j
            r3[r1] = r4
            java.lang.String r4 = "Acquiring a connection to Google Play Services for %s"
            r14.m6376a(r4, r3)
            com.google.android.gms.cast.CastDevice r14 = r13.f5446j
            java.lang.String r3 = "null reference"
            java.util.Objects.requireNonNull(r14, r3)
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            d6.b r4 = r13.f5442f
            if (r4 != 0) goto L9b
            r4 = r2
            goto L9d
        L9b:
            e6.a r4 = r4.f6822d0
        L9d:
            if (r4 != 0) goto La1
            r5 = r2
            goto La3
        La1:
            e6.e r5 = r4.f7387b0
        La3:
            if (r4 == 0) goto Lab
            boolean r4 = r4.f7388c0
            if (r4 == 0) goto Lab
            r4 = 1
            goto Lac
        Lab:
            r4 = 0
        Lac:
            android.content.Intent r6 = new android.content.Intent
            android.content.Context r7 = r13.f5439c
            java.lang.Class<f1.d0> r8 = p085f1.C1957d0.class
            r6.<init>(r7, r8)
            android.content.Context r7 = r13.f5439c
            java.lang.String r7 = r7.getPackageName()
            r6.setPackage(r7)
            android.content.Context r7 = r13.f5439c
            android.content.pm.PackageManager r7 = r7.getPackageManager()
            java.util.List r6 = r7.queryBroadcastReceivers(r6, r1)
            boolean r6 = r6.isEmpty()
            r6 = r6 ^ r0
            if (r5 == 0) goto Ld1
            r5 = 1
            goto Ld2
        Ld1:
            r5 = 0
        Ld2:
            java.lang.String r7 = "com.google.android.gms.cast.EXTRA_CAST_FRAMEWORK_NOTIFICATION_ENABLED"
            r3.putBoolean(r7, r5)
            java.lang.String r5 = "com.google.android.gms.cast.EXTRA_CAST_REMOTE_CONTROL_NOTIFICATION_ENABLED"
            r3.putBoolean(r5, r4)
            java.lang.String r4 = "com.google.android.gms.cast.EXTRA_CAST_ALWAYS_FOLLOW_SESSION_ENABLED"
            r3.putBoolean(r4, r6)
            com.google.android.gms.cast.a$b$a r4 = new com.google.android.gms.cast.a$b$a
            d6.g0 r5 = new d6.g0
            r5.<init>(r13)
            r4.<init>(r14, r5)
            r4.f5410c = r3
            com.google.android.gms.cast.a$b r14 = new com.google.android.gms.cast.a$b
            r14.<init>(r4)
            android.content.Context r3 = r13.f5439c
            int r4 = com.google.android.gms.cast.C1057a.f5403a
            com.google.android.gms.cast.d r4 = new com.google.android.gms.cast.d
            r4.<init>(r3, r14)
            d6.i0 r14 = new d6.i0
            r14.<init>(r13)
            java.util.List<c6.a1> r3 = r4.f5417D
            r3.add(r14)
            r13.f5444h = r4
            com.google.android.gms.cast.d r4 = (com.google.android.gms.cast.C1060d) r4
            com.google.android.gms.cast.c r14 = r4.f5419j
            android.os.Looper r3 = r4.f17351f
            java.lang.String r5 = "Listener must not be null"
            com.google.android.gms.common.internal.C1101a.m3104i(r14, r5)
            java.lang.String r5 = "Looper must not be null"
            com.google.android.gms.common.internal.C1101a.m3104i(r3, r5)
            java.lang.String r5 = "castDeviceControllerListenerKey"
            java.lang.String r6 = "Listener type must not be null"
            com.google.android.gms.common.internal.C1101a.m3104i(r5, r6)
            com.google.android.gms.common.api.internal.c r6 = new com.google.android.gms.common.api.internal.c
            r6.<init>(r3, r14, r5)
            com.google.android.gms.common.api.internal.e r14 = new com.google.android.gms.common.api.internal.e
            r14.<init>(r2)
            f.t r2 = new f.t
            r2.<init>(r4)
            c6.b0 r3 = p036c6.C0875b0.f4737Y
            r14.f5607c = r6
            r14.f5605a = r2
            r14.f5606b = r3
            k6.d[] r2 = new p184k6.C3701d[r0]
            k6.d r3 = p036c6.C0872a0.f4725a
            r2[r1] = r3
            r14.f5608d = r2
            r2 = 8428(0x20ec, float:1.181E-41)
            r14.f5609e = r2
            java.lang.String r2 = "Must set register function"
            com.google.android.gms.common.internal.C1101a.m3097b(r0, r2)
            m6.i<A, s7.j<java.lang.Boolean>> r2 = r14.f5606b
            if (r2 == 0) goto L14c
            r2 = 1
            goto L14d
        L14c:
            r2 = 0
        L14d:
            java.lang.String r3 = "Must set unregister function"
            com.google.android.gms.common.internal.C1101a.m3097b(r2, r3)
            com.google.android.gms.common.api.internal.c<L> r2 = r14.f5607c
            if (r2 == 0) goto L157
            goto L158
        L157:
            r0 = 0
        L158:
            java.lang.String r1 = "Must set holder"
            com.google.android.gms.common.internal.C1101a.m3097b(r0, r1)
            com.google.android.gms.common.api.internal.c<L> r0 = r14.f5607c
            com.google.android.gms.common.api.internal.c$a<L> r0 = r0.f5597b
            java.lang.String r1 = "Key must not be null"
            com.google.android.gms.common.internal.C1101a.m3104i(r0, r1)
            m6.s r1 = new m6.s
            com.google.android.gms.common.api.internal.c<L> r2 = r14.f5607c
            k6.d[] r10 = r14.f5608d
            r11 = 1
            int r3 = r14.f5609e
            r7 = r1
            r8 = r14
            r9 = r2
            r12 = r3
            r7.<init>(r8, r9, r10, r11, r12)
            com.google.android.gms.common.api.internal.p r5 = new com.google.android.gms.common.api.internal.p
            r5.<init>(r14, r0)
            java.lang.Runnable r14 = p218m6.RunnableC4405r.f17976Y
            com.google.android.gms.common.api.internal.c$a<L> r2 = r2.f5597b
            java.lang.String r6 = "Listener has already been released."
            com.google.android.gms.common.internal.C1101a.m3104i(r2, r6)
            com.google.android.gms.common.internal.C1101a.m3104i(r0, r6)
            com.google.android.gms.common.api.internal.b r0 = r4.f17354i
            java.util.Objects.requireNonNull(r0)
            s7.j r2 = new s7.j
            r2.<init>()
            r0.m3056b(r2, r3, r4)
            com.google.android.gms.common.api.internal.r r3 = new com.google.android.gms.common.api.internal.r
            m6.q r6 = new m6.q
            r6.<init>(r1, r5, r14)
            r3.<init>(r6, r2)
            android.os.Handler r14 = r0.f5573k0
            r1 = 8
            m6.p r2 = new m6.p
            java.util.concurrent.atomic.AtomicInteger r0 = r0.f5569g0
            int r0 = r0.get()
            r2.<init>(r3, r0, r4)
            android.os.Message r0 = r14.obtainMessage(r1, r2)
            r14.sendMessage(r0)
            return
    }
}
