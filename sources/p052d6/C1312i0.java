package p052d6;

/* renamed from: d6.i0 */
/* loaded from: classes.dex */
public final class C1312i0 extends p036c6.C0873a1 {

    /* renamed from: a */
    public final /* synthetic */ com.google.android.gms.cast.framework.C1062a f6843a;

    public /* synthetic */ C1312i0(com.google.android.gms.cast.framework.C1062a r1) {
            r0 = this;
            r0.f6843a = r1
            r0.<init>()
            return
    }

    @Override // p036c6.C0873a1
    /* renamed from: a */
    public final void mo2592a() {
            r5 = this;
            com.google.android.gms.cast.framework.a r0 = r5.f6843a
            d6.r0 r1 = r0.f5441e
            if (r1 != 0) goto L7
            return
        L7:
            com.google.android.gms.cast.framework.media.b r0 = r0.f5445i     // Catch: android.os.RemoteException -> L17
            if (r0 == 0) goto Le
            r0.m3012t()     // Catch: android.os.RemoteException -> L17
        Le:
            com.google.android.gms.cast.framework.a r0 = r5.f6843a     // Catch: android.os.RemoteException -> L17
            d6.r0 r0 = r0.f5441e     // Catch: android.os.RemoteException -> L17
            r1 = 0
            r0.mo3823Q1(r1)     // Catch: android.os.RemoteException -> L17
            return
        L17:
            r0 = move-exception
            h6.b r1 = com.google.android.gms.cast.framework.C1062a.f5438m
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            java.lang.String r4 = "onConnected"
            r2[r3] = r4
            r3 = 1
            java.lang.Class<d6.r0> r4 = p052d6.InterfaceC1330r0.class
            java.lang.String r4 = r4.getSimpleName()
            r2[r3] = r4
            java.lang.String r3 = "Unable to call %s on %s."
            r1.m6377b(r0, r3, r2)
            return
    }

    @Override // p036c6.C0873a1
    /* renamed from: b */
    public final void mo2593b(int r5) {
            r4 = this;
            com.google.android.gms.cast.framework.a r0 = r4.f6843a
            d6.r0 r0 = r0.f5441e
            if (r0 != 0) goto L7
            return
        L7:
            k6.b r1 = new k6.b     // Catch: android.os.RemoteException -> L10
            r1.<init>(r5)     // Catch: android.os.RemoteException -> L10
            r0.mo3825Y(r1)     // Catch: android.os.RemoteException -> L10
            return
        L10:
            r5 = move-exception
            h6.b r0 = com.google.android.gms.cast.framework.C1062a.f5438m
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            java.lang.String r3 = "onConnectionFailed"
            r1[r2] = r3
            r2 = 1
            java.lang.Class<d6.r0> r3 = p052d6.InterfaceC1330r0.class
            java.lang.String r3 = r3.getSimpleName()
            r1[r2] = r3
            java.lang.String r2 = "Unable to call %s on %s."
            r0.m6377b(r5, r2, r1)
            return
    }

    @Override // p036c6.C0873a1
    /* renamed from: c */
    public final void mo2594c(int r5) {
            r4 = this;
            com.google.android.gms.cast.framework.a r0 = r4.f6843a
            d6.r0 r0 = r0.f5441e
            if (r0 != 0) goto L7
            return
        L7:
            r0.mo3828w(r5)     // Catch: android.os.RemoteException -> Lb
            return
        Lb:
            r5 = move-exception
            h6.b r0 = com.google.android.gms.cast.framework.C1062a.f5438m
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            java.lang.String r3 = "onConnectionSuspended"
            r1[r2] = r3
            r2 = 1
            java.lang.Class<d6.r0> r3 = p052d6.InterfaceC1330r0.class
            java.lang.String r3 = r3.getSimpleName()
            r1[r2] = r3
            java.lang.String r2 = "Unable to call %s on %s."
            r0.m6377b(r5, r2, r1)
            return
    }

    @Override // p036c6.C0873a1
    /* renamed from: d */
    public final void mo2595d(int r5) {
            r4 = this;
            com.google.android.gms.cast.framework.a r0 = r4.f6843a
            d6.r0 r0 = r0.f5441e
            if (r0 != 0) goto L7
            return
        L7:
            k6.b r1 = new k6.b     // Catch: android.os.RemoteException -> L10
            r1.<init>(r5)     // Catch: android.os.RemoteException -> L10
            r0.mo3825Y(r1)     // Catch: android.os.RemoteException -> L10
            return
        L10:
            r5 = move-exception
            h6.b r0 = com.google.android.gms.cast.framework.C1062a.f5438m
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            java.lang.String r3 = "onDisconnected"
            r1[r2] = r3
            r2 = 1
            java.lang.Class<d6.r0> r3 = p052d6.InterfaceC1330r0.class
            java.lang.String r3 = r3.getSimpleName()
            r1[r2] = r3
            java.lang.String r2 = "Unable to call %s on %s."
            r0.m6377b(r5, r2, r1)
            return
    }
}
