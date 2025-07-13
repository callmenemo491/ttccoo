package p071e6;

/* renamed from: e6.a */
/* loaded from: classes.dex */
public class C1521a extends p270p6.AbstractC5367a {

    @androidx.annotation.RecentlyNonNull
    public static final android.os.Parcelable.Creator<p071e6.C1521a> CREATOR = null;

    /* renamed from: e0 */
    public static final p123h6.C2489b f7383e0 = null;

    /* renamed from: Y */
    public final java.lang.String f7384Y;

    /* renamed from: Z */
    public final java.lang.String f7385Z;

    /* renamed from: a0 */
    public final p071e6.InterfaceC1545t f7386a0;

    /* renamed from: b0 */
    public final p071e6.C1529e f7387b0;

    /* renamed from: c0 */
    public final boolean f7388c0;

    /* renamed from: d0 */
    public final boolean f7389d0;

    static {
            h6.b r0 = new h6.b
            java.lang.String r1 = "CastMediaOptions"
            r0.<init>(r1)
            p071e6.C1521a.f7383e0 = r0
            e6.f r0 = new e6.f
            r0.<init>()
            p071e6.C1521a.CREATOR = r0
            return
    }

    public C1521a(java.lang.String r1, java.lang.String r2, android.os.IBinder r3, p071e6.C1529e r4, boolean r5, boolean r6) {
            r0 = this;
            r0.<init>()
            r0.f7384Y = r1
            r0.f7385Z = r2
            if (r3 != 0) goto Lb
            r1 = 0
            goto L1d
        Lb:
            java.lang.String r1 = "com.google.android.gms.cast.framework.media.IImagePicker"
            android.os.IInterface r1 = r3.queryLocalInterface(r1)
            boolean r2 = r1 instanceof p071e6.InterfaceC1545t
            if (r2 == 0) goto L18
            e6.t r1 = (p071e6.InterfaceC1545t) r1
            goto L1d
        L18:
            e6.n r1 = new e6.n
            r1.<init>(r3)
        L1d:
            r0.f7386a0 = r1
            r0.f7387b0 = r4
            r0.f7388c0 = r5
            r0.f7389d0 = r6
            return
    }

    @androidx.annotation.RecentlyNullable
    /* renamed from: X */
    public p071e6.C1525c m4105X() {
            r5 = this;
            e6.t r0 = r5.f7386a0
            if (r0 == 0) goto L28
            x6.a r0 = r0.mo4108e()     // Catch: android.os.RemoteException -> Lf
            java.lang.Object r0 = p408x6.BinderC6958b.m14124H(r0)     // Catch: android.os.RemoteException -> Lf
            e6.c r0 = (p071e6.C1525c) r0     // Catch: android.os.RemoteException -> Lf
            return r0
        Lf:
            r0 = move-exception
            h6.b r1 = p071e6.C1521a.f7383e0
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            java.lang.String r4 = "getWrappedClientObject"
            r2[r3] = r4
            r3 = 1
            java.lang.Class<e6.t> r4 = p071e6.InterfaceC1545t.class
            java.lang.String r4 = r4.getSimpleName()
            r2[r3] = r4
            java.lang.String r3 = "Unable to call %s on %s."
            r1.m6377b(r0, r3, r2)
        L28:
            r0 = 0
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@androidx.annotation.RecentlyNonNull android.os.Parcel r6, int r7) {
            r5 = this;
            r0 = 20293(0x4f45, float:2.8437E-41)
            int r0 = p270p6.C5369c.m11723k(r6, r0)
            java.lang.String r1 = r5.f7384Y
            r2 = 2
            r3 = 0
            p270p6.C5369c.m11719g(r6, r2, r1, r3)
            java.lang.String r1 = r5.f7385Z
            r2 = 3
            p270p6.C5369c.m11719g(r6, r2, r1, r3)
            e6.t r1 = r5.f7386a0
            if (r1 != 0) goto L19
            r1 = 0
            goto L1d
        L19:
            android.os.IBinder r1 = r1.asBinder()
        L1d:
            r2 = 4
            p270p6.C5369c.m11715c(r6, r2, r1, r3)
            r1 = 5
            e6.e r4 = r5.f7387b0
            p270p6.C5369c.m11718f(r6, r1, r4, r7, r3)
            r7 = 6
            boolean r1 = r5.f7388c0
            p270p6.C5369c.m11724l(r6, r7, r2)
            r6.writeInt(r1)
            r7 = 7
            boolean r1 = r5.f7389d0
            p270p6.C5369c.m11724l(r6, r7, r2)
            r6.writeInt(r1)
            p270p6.C5369c.m11726n(r6, r0)
            return
    }
}
