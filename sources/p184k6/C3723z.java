package p184k6;

/* renamed from: k6.z */
/* loaded from: classes.dex */
public final class C3723z extends p270p6.AbstractC5367a {
    public static final android.os.Parcelable.Creator<p184k6.C3723z> CREATOR = null;

    /* renamed from: Y */
    public final java.lang.String f16440Y;

    /* renamed from: Z */
    public final p184k6.AbstractBinderC3711n f16441Z;

    /* renamed from: a0 */
    public final boolean f16442a0;

    /* renamed from: b0 */
    public final boolean f16443b0;

    static {
            k6.y r0 = new k6.y
            r0.<init>()
            p184k6.C3723z.CREATOR = r0
            return
    }

    public C3723z(java.lang.String r5, android.os.IBinder r6, boolean r7, boolean r8) {
            r4 = this;
            r4.<init>()
            r4.f16440Y = r5
            java.lang.String r5 = "Could not unwrap certificate"
            java.lang.String r0 = "GoogleCertificatesQuery"
            r1 = 0
            if (r6 != 0) goto Ld
            goto L3f
        Ld:
            int r2 = p248o6.AbstractBinderC4935t0.f19543a     // Catch: android.os.RemoteException -> L3b
            java.lang.String r2 = "com.google.android.gms.common.internal.ICertData"
            android.os.IInterface r2 = r6.queryLocalInterface(r2)     // Catch: android.os.RemoteException -> L3b
            boolean r3 = r2 instanceof p248o6.InterfaceC4931r0     // Catch: android.os.RemoteException -> L3b
            if (r3 == 0) goto L1c
            o6.r0 r2 = (p248o6.InterfaceC4931r0) r2     // Catch: android.os.RemoteException -> L3b
            goto L21
        L1c:
            o6.s0 r2 = new o6.s0     // Catch: android.os.RemoteException -> L3b
            r2.<init>(r6)     // Catch: android.os.RemoteException -> L3b
        L21:
            x6.a r6 = r2.mo8176b()     // Catch: android.os.RemoteException -> L3b
            if (r6 != 0) goto L29
            r6 = r1
            goto L2f
        L29:
            java.lang.Object r6 = p408x6.BinderC6958b.m14124H(r6)
            byte[] r6 = (byte[]) r6
        L2f:
            if (r6 == 0) goto L37
            k6.q r1 = new k6.q
            r1.<init>(r6)
            goto L3f
        L37:
            android.util.Log.e(r0, r5)
            goto L3f
        L3b:
            r6 = move-exception
            android.util.Log.e(r0, r5, r6)
        L3f:
            r4.f16441Z = r1
            r4.f16442a0 = r7
            r4.f16443b0 = r8
            return
    }

    public C3723z(java.lang.String r1, p184k6.AbstractBinderC3711n r2, boolean r3, boolean r4) {
            r0 = this;
            r0.<init>()
            r0.f16440Y = r1
            r0.f16441Z = r2
            r0.f16442a0 = r3
            r0.f16443b0 = r4
            return
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r5, int r6) {
            r4 = this;
            r6 = 20293(0x4f45, float:2.8437E-41)
            int r6 = p270p6.C5369c.m11723k(r5, r6)
            r0 = 1
            java.lang.String r1 = r4.f16440Y
            r2 = 0
            p270p6.C5369c.m11719g(r5, r0, r1, r2)
            r0 = 2
            k6.n r1 = r4.f16441Z
            if (r1 != 0) goto L1b
            java.lang.String r1 = "GoogleCertificatesQuery"
            java.lang.String r3 = "certificate binder is null"
            android.util.Log.w(r1, r3)
            r1 = 0
            goto L1e
        L1b:
            java.util.Objects.requireNonNull(r1)
        L1e:
            p270p6.C5369c.m11715c(r5, r0, r1, r2)
            r0 = 3
            boolean r1 = r4.f16442a0
            r2 = 4
            p270p6.C5369c.m11724l(r5, r0, r2)
            r5.writeInt(r1)
            boolean r0 = r4.f16443b0
            p270p6.C5369c.m11724l(r5, r2, r2)
            r5.writeInt(r0)
            p270p6.C5369c.m11726n(r5, r6)
            return
    }
}
