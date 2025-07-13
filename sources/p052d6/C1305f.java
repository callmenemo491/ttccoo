package p052d6;

/* renamed from: d6.f */
/* loaded from: classes.dex */
public class C1305f {

    /* renamed from: c */
    public static final p123h6.C2489b f6836c = null;

    /* renamed from: a */
    public final p052d6.InterfaceC1332t f6837a;

    /* renamed from: b */
    public final android.content.Context f6838b;

    static {
            h6.b r0 = new h6.b
            java.lang.String r1 = "SessionManager"
            r0.<init>(r1)
            p052d6.C1305f.f6836c = r0
            return
    }

    public C1305f(p052d6.InterfaceC1332t r1, android.content.Context r2) {
            r0 = this;
            r0.<init>()
            r0.f6837a = r1
            r0.f6838b = r2
            return
    }

    /* renamed from: a */
    public <T extends p052d6.AbstractC1303e> void m3768a(@androidx.annotation.RecentlyNonNull p052d6.InterfaceC1307g<T> r4, @androidx.annotation.RecentlyNonNull java.lang.Class<T> r5) {
            r3 = this;
            java.lang.String r0 = "Must be called from the main thread."
            com.google.android.gms.common.internal.C1101a.m3099d(r0)
            d6.t r0 = r3.f6837a     // Catch: android.os.RemoteException -> L10
            com.google.android.gms.cast.framework.b r1 = new com.google.android.gms.cast.framework.b     // Catch: android.os.RemoteException -> L10
            r1.<init>(r4, r5)     // Catch: android.os.RemoteException -> L10
            r0.mo3831n0(r1)     // Catch: android.os.RemoteException -> L10
            return
        L10:
            r4 = move-exception
            h6.b r5 = p052d6.C1305f.f6836c
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            java.lang.String r2 = "addSessionManagerListener"
            r0[r1] = r2
            r1 = 1
            java.lang.Class<d6.t> r2 = p052d6.InterfaceC1332t.class
            java.lang.String r2 = r2.getSimpleName()
            r0[r1] = r2
            java.lang.String r1 = "Unable to call %s on %s."
            r5.m6377b(r4, r1, r0)
            return
    }

    /* renamed from: b */
    public void m3769b(boolean r7) {
            r6 = this;
            java.lang.String r0 = "Must be called from the main thread."
            com.google.android.gms.common.internal.C1101a.m3099d(r0)
            r0 = 0
            r1 = 1
            h6.b r2 = p052d6.C1305f.f6836c     // Catch: android.os.RemoteException -> L24
            java.lang.Object[] r3 = new java.lang.Object[r1]     // Catch: android.os.RemoteException -> L24
            android.content.Context r4 = r6.f6838b     // Catch: android.os.RemoteException -> L24
            java.lang.String r4 = r4.getPackageName()     // Catch: android.os.RemoteException -> L24
            r3[r0] = r4     // Catch: android.os.RemoteException -> L24
            java.lang.String r4 = "End session for %s"
            java.lang.String r5 = r2.f11253a     // Catch: android.os.RemoteException -> L24
            java.lang.String r2 = r2.m6380e(r4, r3)     // Catch: android.os.RemoteException -> L24
            android.util.Log.i(r5, r2)     // Catch: android.os.RemoteException -> L24
            d6.t r2 = r6.f6837a     // Catch: android.os.RemoteException -> L24
            r2.mo3832s0(r1, r7)     // Catch: android.os.RemoteException -> L24
            return
        L24:
            r7 = move-exception
            h6.b r2 = p052d6.C1305f.f6836c
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r4 = "endCurrentSession"
            r3[r0] = r4
            java.lang.Class<d6.t> r0 = p052d6.InterfaceC1332t.class
            java.lang.String r0 = r0.getSimpleName()
            r3[r1] = r0
            java.lang.String r0 = "Unable to call %s on %s."
            r2.m6377b(r7, r0, r3)
            return
    }

    @androidx.annotation.RecentlyNullable
    /* renamed from: c */
    public com.google.android.gms.cast.framework.C1062a m3770c() {
            r2 = this;
            java.lang.String r0 = "Must be called from the main thread."
            com.google.android.gms.common.internal.C1101a.m3099d(r0)
            d6.e r0 = r2.m3771d()
            if (r0 == 0) goto L12
            boolean r1 = r0 instanceof com.google.android.gms.cast.framework.C1062a
            if (r1 == 0) goto L12
            com.google.android.gms.cast.framework.a r0 = (com.google.android.gms.cast.framework.C1062a) r0
            return r0
        L12:
            r0 = 0
            return r0
    }

    @androidx.annotation.RecentlyNullable
    /* renamed from: d */
    public p052d6.AbstractC1303e m3771d() {
            r5 = this;
            java.lang.String r0 = "Must be called from the main thread."
            com.google.android.gms.common.internal.C1101a.m3099d(r0)
            d6.t r0 = r5.f6837a     // Catch: android.os.RemoteException -> L12
            x6.a r0 = r0.mo3830h()     // Catch: android.os.RemoteException -> L12
            java.lang.Object r0 = p408x6.BinderC6958b.m14124H(r0)     // Catch: android.os.RemoteException -> L12
            d6.e r0 = (p052d6.AbstractC1303e) r0     // Catch: android.os.RemoteException -> L12
            return r0
        L12:
            r0 = move-exception
            h6.b r1 = p052d6.C1305f.f6836c
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            java.lang.String r4 = "getWrappedCurrentSession"
            r2[r3] = r4
            r3 = 1
            java.lang.Class<d6.t> r4 = p052d6.InterfaceC1332t.class
            java.lang.String r4 = r4.getSimpleName()
            r2[r3] = r4
            java.lang.String r3 = "Unable to call %s on %s."
            r1.m6377b(r0, r3, r2)
            r0 = 0
            return r0
    }
}
