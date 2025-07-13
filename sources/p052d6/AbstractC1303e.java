package p052d6;

/* renamed from: d6.e */
/* loaded from: classes.dex */
public abstract class AbstractC1303e {

    /* renamed from: b */
    public static final p123h6.C2489b f6833b = null;

    /* renamed from: a */
    public final p052d6.InterfaceC1329r f6834a;

    static {
            h6.b r0 = new h6.b
            java.lang.String r1 = "Session"
            r0.<init>(r1)
            p052d6.AbstractC1303e.f6833b = r0
            return
    }

    public AbstractC1303e(@androidx.annotation.RecentlyNonNull android.content.Context r3, @androidx.annotation.RecentlyNonNull java.lang.String r4, @androidx.annotation.RecentlyNonNull java.lang.String r5) {
            r2 = this;
            r2.<init>()
            d6.z r0 = new d6.z
            r0.<init>(r2)
            h6.b r1 = p072e7.C1726r3.f7765a
            e7.w6 r3 = p072e7.C1726r3.m4430a(r3)     // Catch: p052d6.C1337y -> L13 android.os.RemoteException -> L15
            d6.r r3 = r3.mo4482v1(r4, r5, r0)     // Catch: p052d6.C1337y -> L13 android.os.RemoteException -> L15
            goto L2f
        L13:
            r3 = move-exception
            goto L16
        L15:
            r3 = move-exception
        L16:
            h6.b r4 = p072e7.C1726r3.f7765a
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r0 = 0
            java.lang.String r1 = "newSessionImpl"
            r5[r0] = r1
            r0 = 1
            java.lang.Class<e7.w6> r1 = p072e7.InterfaceC1775w6.class
            java.lang.String r1 = r1.getSimpleName()
            r5[r0] = r1
            java.lang.String r0 = "Unable to call %s on %s."
            r4.m6377b(r3, r0, r5)
            r3 = 0
        L2f:
            r2.f6834a = r3
            return
    }

    /* renamed from: a */
    public abstract void mo2971a(boolean r1);

    /* renamed from: b */
    public long mo2972b() {
            r2 = this;
            java.lang.String r0 = "Must be called from the main thread."
            com.google.android.gms.common.internal.C1101a.m3099d(r0)
            r0 = 0
            return r0
    }

    /* renamed from: c */
    public final void m3766c(int r5) {
            r4 = this;
            d6.r r0 = r4.f6834a
            if (r0 == 0) goto L21
            r0.mo3817Y1(r5)     // Catch: android.os.RemoteException -> L8
            return
        L8:
            r5 = move-exception
            h6.b r0 = p052d6.AbstractC1303e.f6833b
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            java.lang.String r3 = "notifySessionEnded"
            r1[r2] = r3
            r2 = 1
            java.lang.Class<d6.r> r3 = p052d6.InterfaceC1329r.class
            java.lang.String r3 = r3.getSimpleName()
            r1[r2] = r3
            java.lang.String r2 = "Unable to call %s on %s."
            r0.m6377b(r5, r2, r1)
        L21:
            return
    }

    /* renamed from: d */
    public void mo2973d(@androidx.annotation.RecentlyNonNull android.os.Bundle r1) {
            r0 = this;
            return
    }

    /* renamed from: e */
    public void mo2974e(@androidx.annotation.RecentlyNonNull android.os.Bundle r1) {
            r0 = this;
            return
    }

    /* renamed from: f */
    public abstract void mo2975f(@androidx.annotation.RecentlyNonNull android.os.Bundle r1);

    /* renamed from: g */
    public abstract void mo2976g(@androidx.annotation.RecentlyNonNull android.os.Bundle r1);

    /* renamed from: h */
    public void mo2977h(@androidx.annotation.RecentlyNonNull android.os.Bundle r1) {
            r0 = this;
            return
    }

    @androidx.annotation.RecentlyNullable
    /* renamed from: i */
    public final p408x6.InterfaceC6957a m3767i() {
            r6 = this;
            d6.r r0 = r6.f6834a
            r1 = 0
            if (r0 == 0) goto L23
            x6.a r0 = r0.mo3819e()     // Catch: android.os.RemoteException -> La
            return r0
        La:
            r0 = move-exception
            h6.b r2 = p052d6.AbstractC1303e.f6833b
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            java.lang.String r5 = "getWrappedObject"
            r3[r4] = r5
            r4 = 1
            java.lang.Class<d6.r> r5 = p052d6.InterfaceC1329r.class
            java.lang.String r5 = r5.getSimpleName()
            r3[r4] = r5
            java.lang.String r4 = "Unable to call %s on %s."
            r2.m6377b(r0, r4, r3)
        L23:
            return r1
    }
}
