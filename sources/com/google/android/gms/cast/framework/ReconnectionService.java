package com.google.android.gms.cast.framework;

/* loaded from: classes.dex */
public class ReconnectionService extends android.app.Service {

    /* renamed from: Z */
    public static final p123h6.C2489b f5436Z = null;

    /* renamed from: Y */
    public p052d6.InterfaceC1323o f5437Y;

    static {
            h6.b r0 = new h6.b
            java.lang.String r1 = "ReconnectionService"
            r0.<init>(r1)
            com.google.android.gms.cast.framework.ReconnectionService.f5436Z = r0
            return
    }

    public ReconnectionService() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.app.Service
    @androidx.annotation.RecentlyNullable
    public android.os.IBinder onBind(@androidx.annotation.RecentlyNonNull android.content.Intent r6) {
            r5 = this;
            d6.o r0 = r5.f5437Y
            r1 = 0
            if (r0 == 0) goto L23
            android.os.IBinder r6 = r0.mo3808K1(r6)     // Catch: android.os.RemoteException -> La
            return r6
        La:
            r6 = move-exception
            h6.b r0 = com.google.android.gms.cast.framework.ReconnectionService.f5436Z
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            java.lang.String r4 = "onBind"
            r2[r3] = r4
            r3 = 1
            java.lang.Class<d6.o> r4 = p052d6.InterfaceC1323o.class
            java.lang.String r4 = r4.getSimpleName()
            r2[r3] = r4
            java.lang.String r3 = "Unable to call %s on %s."
            r0.m6377b(r6, r3, r2)
        L23:
            return r1
    }

    @Override // android.app.Service
    public void onCreate() {
            r11 = this;
            java.lang.String r0 = "getWrappedThis"
            java.lang.String r1 = "Unable to call %s on %s."
            d6.a r2 = p052d6.C1295a.m3761b(r11)
            d6.f r3 = r2.m3763a()
            java.util.Objects.requireNonNull(r3)
            r4 = 0
            r5 = 1
            r6 = 0
            r7 = 2
            d6.t r3 = r3.f6837a     // Catch: android.os.RemoteException -> L1a
            x6.a r3 = r3.mo3829e()     // Catch: android.os.RemoteException -> L1a
            goto L2d
        L1a:
            r3 = move-exception
            h6.b r8 = p052d6.C1305f.f6836c
            java.lang.Object[] r9 = new java.lang.Object[r7]
            r9[r6] = r0
            java.lang.Class<d6.t> r10 = p052d6.InterfaceC1332t.class
            java.lang.String r10 = r10.getSimpleName()
            r9[r5] = r10
            r8.m6377b(r3, r1, r9)
            r3 = r4
        L2d:
            java.lang.String r8 = "Must be called from the main thread."
            com.google.android.gms.common.internal.C1101a.m3099d(r8)
            d6.j0 r2 = r2.f6811d
            java.util.Objects.requireNonNull(r2)
            d6.l r2 = r2.f6846a     // Catch: android.os.RemoteException -> L3e
            x6.a r0 = r2.mo3807d()     // Catch: android.os.RemoteException -> L3e
            goto L51
        L3e:
            r2 = move-exception
            h6.b r8 = p052d6.C1314j0.f6845b
            java.lang.Object[] r9 = new java.lang.Object[r7]
            r9[r6] = r0
            java.lang.Class<d6.l> r0 = p052d6.InterfaceC1317l.class
            java.lang.String r0 = r0.getSimpleName()
            r9[r5] = r0
            r8.m6377b(r2, r1, r9)
            r0 = r4
        L51:
            h6.b r2 = p072e7.C1726r3.f7765a
            if (r3 == 0) goto L80
            if (r0 != 0) goto L58
            goto L80
        L58:
            android.content.Context r2 = r11.getApplicationContext()     // Catch: p052d6.C1337y -> L6a android.os.RemoteException -> L6c
            e7.w6 r2 = p072e7.C1726r3.m4430a(r2)     // Catch: p052d6.C1337y -> L6a android.os.RemoteException -> L6c
            x6.b r8 = new x6.b     // Catch: p052d6.C1337y -> L6a android.os.RemoteException -> L6c
            r8.<init>(r11)     // Catch: p052d6.C1337y -> L6a android.os.RemoteException -> L6c
            d6.o r4 = r2.mo4479Y0(r8, r3, r0)     // Catch: p052d6.C1337y -> L6a android.os.RemoteException -> L6c
            goto L80
        L6a:
            r0 = move-exception
            goto L6d
        L6c:
            r0 = move-exception
        L6d:
            h6.b r2 = p072e7.C1726r3.f7765a
            java.lang.Object[] r3 = new java.lang.Object[r7]
            java.lang.String r8 = "newReconnectionServiceImpl"
            r3[r6] = r8
            java.lang.Class<e7.w6> r8 = p072e7.InterfaceC1775w6.class
            java.lang.String r8 = r8.getSimpleName()
            r3[r5] = r8
            r2.m6377b(r0, r1, r3)
        L80:
            r11.f5437Y = r4
            if (r4 == 0) goto L9f
            r4.mo3810e()     // Catch: android.os.RemoteException -> L88
            goto L9c
        L88:
            r0 = move-exception
            h6.b r2 = com.google.android.gms.cast.framework.ReconnectionService.f5436Z
            java.lang.Object[] r3 = new java.lang.Object[r7]
            java.lang.String r4 = "onCreate"
            r3[r6] = r4
            java.lang.Class<d6.o> r4 = p052d6.InterfaceC1323o.class
            java.lang.String r4 = r4.getSimpleName()
            r3[r5] = r4
            r2.m6377b(r0, r1, r3)
        L9c:
            super.onCreate()
        L9f:
            return
    }

    @Override // android.app.Service
    public void onDestroy() {
            r5 = this;
            d6.o r0 = r5.f5437Y
            if (r0 == 0) goto L24
            r0.mo3811g()     // Catch: android.os.RemoteException -> L8
            goto L21
        L8:
            r0 = move-exception
            h6.b r1 = com.google.android.gms.cast.framework.ReconnectionService.f5436Z
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            java.lang.String r4 = "onDestroy"
            r2[r3] = r4
            r3 = 1
            java.lang.Class<d6.o> r4 = p052d6.InterfaceC1323o.class
            java.lang.String r4 = r4.getSimpleName()
            r2[r3] = r4
            java.lang.String r3 = "Unable to call %s on %s."
            r1.m6377b(r0, r3, r2)
        L21:
            super.onDestroy()
        L24:
            return
    }

    @Override // android.app.Service
    public int onStartCommand(@androidx.annotation.RecentlyNonNull android.content.Intent r4, int r5, int r6) {
            r3 = this;
            d6.o r0 = r3.f5437Y
            r1 = 2
            if (r0 == 0) goto L22
            int r4 = r0.mo3809d2(r4, r5, r6)     // Catch: android.os.RemoteException -> La
            return r4
        La:
            r4 = move-exception
            h6.b r5 = com.google.android.gms.cast.framework.ReconnectionService.f5436Z
            java.lang.Object[] r6 = new java.lang.Object[r1]
            r0 = 0
            java.lang.String r2 = "onStartCommand"
            r6[r0] = r2
            r0 = 1
            java.lang.Class<d6.o> r2 = p052d6.InterfaceC1323o.class
            java.lang.String r2 = r2.getSimpleName()
            r6[r0] = r2
            java.lang.String r0 = "Unable to call %s on %s."
            r5.m6377b(r4, r0, r6)
        L22:
            return r1
    }
}
