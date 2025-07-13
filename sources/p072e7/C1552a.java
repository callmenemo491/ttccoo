package p072e7;

/* renamed from: e7.a */
/* loaded from: classes.dex */
public final class C1552a extends p085f1.C1974o.b {

    /* renamed from: b */
    public static final p123h6.C2489b f7474b = null;

    /* renamed from: a */
    public final p072e7.InterfaceC1731r8 f7475a;

    static {
            h6.b r0 = new h6.b
            java.lang.String r1 = "MediaRouterCallback"
            r0.<init>(r1)
            p072e7.C1552a.f7474b = r0
            return
    }

    public C1552a(p072e7.InterfaceC1731r8 r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "null reference"
            java.util.Objects.requireNonNull(r2, r0)
            r1.f7475a = r2
            return
    }

    @Override // p085f1.C1974o.b
    /* renamed from: d */
    public final void mo1488d(p085f1.C1974o r4, p085f1.C1974o.i r5) {
            r3 = this;
            e7.r8 r4 = r3.f7475a     // Catch: android.os.RemoteException -> La
            java.lang.String r0 = r5.f8735c     // Catch: android.os.RemoteException -> La
            android.os.Bundle r5 = r5.f8750r     // Catch: android.os.RemoteException -> La
            r4.mo4423V(r0, r5)     // Catch: android.os.RemoteException -> La
            return
        La:
            r4 = move-exception
            h6.b r5 = p072e7.C1552a.f7474b
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            java.lang.String r2 = "onRouteAdded"
            r0[r1] = r2
            r1 = 1
            java.lang.Class<e7.r8> r2 = p072e7.InterfaceC1731r8.class
            java.lang.String r2 = r2.getSimpleName()
            r0[r1] = r2
            java.lang.String r1 = "Unable to call %s on %s."
            r5.m6377b(r4, r1, r0)
            return
    }

    @Override // p085f1.C1974o.b
    /* renamed from: e */
    public final void mo1489e(p085f1.C1974o r4, p085f1.C1974o.i r5) {
            r3 = this;
            e7.r8 r4 = r3.f7475a     // Catch: android.os.RemoteException -> La
            java.lang.String r0 = r5.f8735c     // Catch: android.os.RemoteException -> La
            android.os.Bundle r5 = r5.f8750r     // Catch: android.os.RemoteException -> La
            r4.mo4421O1(r0, r5)     // Catch: android.os.RemoteException -> La
            return
        La:
            r4 = move-exception
            h6.b r5 = p072e7.C1552a.f7474b
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            java.lang.String r2 = "onRouteChanged"
            r0[r1] = r2
            r1 = 1
            java.lang.Class<e7.r8> r2 = p072e7.InterfaceC1731r8.class
            java.lang.String r2 = r2.getSimpleName()
            r0[r1] = r2
            java.lang.String r1 = "Unable to call %s on %s."
            r5.m6377b(r4, r1, r0)
            return
    }

    @Override // p085f1.C1974o.b
    /* renamed from: f */
    public final void mo1490f(p085f1.C1974o r4, p085f1.C1974o.i r5) {
            r3 = this;
            e7.r8 r4 = r3.f7475a     // Catch: android.os.RemoteException -> La
            java.lang.String r0 = r5.f8735c     // Catch: android.os.RemoteException -> La
            android.os.Bundle r5 = r5.f8750r     // Catch: android.os.RemoteException -> La
            r4.mo4424p1(r0, r5)     // Catch: android.os.RemoteException -> La
            return
        La:
            r4 = move-exception
            h6.b r5 = p072e7.C1552a.f7474b
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            java.lang.String r2 = "onRouteRemoved"
            r0[r1] = r2
            r1 = 1
            java.lang.Class<e7.r8> r2 = p072e7.InterfaceC1731r8.class
            java.lang.String r2 = r2.getSimpleName()
            r0[r1] = r2
            java.lang.String r1 = "Unable to call %s on %s."
            r5.m6377b(r4, r1, r0)
            return
    }

    @Override // p085f1.C1974o.b
    /* renamed from: h */
    public final void mo4112h(p085f1.C1974o r4, p085f1.C1974o.i r5, int r6) {
            r3 = this;
            int r4 = r5.f8743k
            r6 = 1
            if (r4 == r6) goto L6
            return
        L6:
            e7.r8 r4 = r3.f7475a     // Catch: android.os.RemoteException -> L10
            java.lang.String r0 = r5.f8735c     // Catch: android.os.RemoteException -> L10
            android.os.Bundle r5 = r5.f8750r     // Catch: android.os.RemoteException -> L10
            r4.mo4420L0(r0, r5)     // Catch: android.os.RemoteException -> L10
            return
        L10:
            r4 = move-exception
            h6.b r5 = p072e7.C1552a.f7474b
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            java.lang.String r2 = "onRouteSelected"
            r0[r1] = r2
            java.lang.Class<e7.r8> r1 = p072e7.InterfaceC1731r8.class
            java.lang.String r1 = r1.getSimpleName()
            r0[r6] = r1
            java.lang.String r6 = "Unable to call %s on %s."
            r5.m6377b(r4, r6, r0)
            return
    }

    @Override // p085f1.C1974o.b
    /* renamed from: j */
    public final void mo4113j(p085f1.C1974o r4, p085f1.C1974o.i r5, int r6) {
            r3 = this;
            int r4 = r5.f8743k
            r0 = 1
            if (r4 == r0) goto L6
            return
        L6:
            e7.r8 r4 = r3.f7475a     // Catch: android.os.RemoteException -> L10
            java.lang.String r1 = r5.f8735c     // Catch: android.os.RemoteException -> L10
            android.os.Bundle r5 = r5.f8750r     // Catch: android.os.RemoteException -> L10
            r4.mo4422P0(r1, r5, r6)     // Catch: android.os.RemoteException -> L10
            return
        L10:
            r4 = move-exception
            h6.b r5 = p072e7.C1552a.f7474b
            r6 = 2
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r1 = 0
            java.lang.String r2 = "onRouteUnselected"
            r6[r1] = r2
            java.lang.Class<e7.r8> r1 = p072e7.InterfaceC1731r8.class
            java.lang.String r1 = r1.getSimpleName()
            r6[r0] = r1
            java.lang.String r0 = "Unable to call %s on %s."
            r5.m6377b(r4, r0, r6)
            return
    }
}
