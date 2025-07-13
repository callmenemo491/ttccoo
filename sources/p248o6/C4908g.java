package p248o6;

/* renamed from: o6.g */
/* loaded from: classes.dex */
public class C4908g extends p270p6.AbstractC5367a {

    @androidx.annotation.RecentlyNonNull
    public static final android.os.Parcelable.Creator<p248o6.C4908g> CREATOR = null;

    /* renamed from: Y */
    public final int f19480Y;

    /* renamed from: Z */
    public final int f19481Z;

    /* renamed from: a0 */
    public int f19482a0;

    /* renamed from: b0 */
    public java.lang.String f19483b0;

    /* renamed from: c0 */
    public android.os.IBinder f19484c0;

    /* renamed from: d0 */
    public com.google.android.gms.common.api.Scope[] f19485d0;

    /* renamed from: e0 */
    public android.os.Bundle f19486e0;

    /* renamed from: f0 */
    public android.accounts.Account f19487f0;

    /* renamed from: g0 */
    public p184k6.C3701d[] f19488g0;

    /* renamed from: h0 */
    public p184k6.C3701d[] f19489h0;

    /* renamed from: i0 */
    public boolean f19490i0;

    /* renamed from: j0 */
    public int f19491j0;

    /* renamed from: k0 */
    public boolean f19492k0;

    /* renamed from: l0 */
    public final java.lang.String f19493l0;

    static {
            o6.k0 r0 = new o6.k0
            r0.<init>()
            p248o6.C4908g.CREATOR = r0
            return
    }

    public C4908g(int r1, int r2, int r3, java.lang.String r4, android.os.IBinder r5, com.google.android.gms.common.api.Scope[] r6, android.os.Bundle r7, android.accounts.Account r8, p184k6.C3701d[] r9, p184k6.C3701d[] r10, boolean r11, int r12, boolean r13, java.lang.String r14) {
            r0 = this;
            r0.<init>()
            r0.f19480Y = r1
            r0.f19481Z = r2
            r0.f19482a0 = r3
            java.lang.String r2 = "com.google.android.gms"
            boolean r3 = r2.equals(r4)
            if (r3 == 0) goto L14
            r0.f19483b0 = r2
            goto L16
        L14:
            r0.f19483b0 = r4
        L16:
            r2 = 2
            if (r1 >= r2) goto L41
            r1 = 0
            if (r5 == 0) goto L3e
            o6.k r2 = p248o6.InterfaceC4916k.a.m11071x(r5)
            int r3 = p248o6.BinderC4894a.f19407a
            if (r2 == 0) goto L3e
            long r3 = android.os.Binder.clearCallingIdentity()
            android.accounts.Account r1 = r2.mo11070a()     // Catch: java.lang.Throwable -> L2d android.os.RemoteException -> L2f
            goto L36
        L2d:
            r1 = move-exception
            goto L3a
        L2f:
            java.lang.String r2 = "AccountAccessor"
            java.lang.String r5 = "Remote account accessor probably died"
            android.util.Log.w(r2, r5)     // Catch: java.lang.Throwable -> L2d
        L36:
            android.os.Binder.restoreCallingIdentity(r3)
            goto L3e
        L3a:
            android.os.Binder.restoreCallingIdentity(r3)
            throw r1
        L3e:
            r0.f19487f0 = r1
            goto L45
        L41:
            r0.f19484c0 = r5
            r0.f19487f0 = r8
        L45:
            r0.f19485d0 = r6
            r0.f19486e0 = r7
            r0.f19488g0 = r9
            r0.f19489h0 = r10
            r0.f19490i0 = r11
            r0.f19491j0 = r12
            r0.f19492k0 = r13
            r0.f19493l0 = r14
            return
    }

    public C4908g(int r2, java.lang.String r3) {
            r1 = this;
            r1.<init>()
            r0 = 6
            r1.f19480Y = r0
            int r0 = p184k6.C3703f.f16408a
            r1.f19482a0 = r0
            r1.f19481Z = r2
            r2 = 1
            r1.f19490i0 = r2
            r1.f19493l0 = r3
            return
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@androidx.annotation.RecentlyNonNull android.os.Parcel r6, int r7) {
            r5 = this;
            r0 = 20293(0x4f45, float:2.8437E-41)
            int r0 = p270p6.C5369c.m11723k(r6, r0)
            r1 = 1
            int r2 = r5.f19480Y
            r3 = 4
            p270p6.C5369c.m11724l(r6, r1, r3)
            r6.writeInt(r2)
            r1 = 2
            int r2 = r5.f19481Z
            p270p6.C5369c.m11724l(r6, r1, r3)
            r6.writeInt(r2)
            r1 = 3
            int r2 = r5.f19482a0
            p270p6.C5369c.m11724l(r6, r1, r3)
            r6.writeInt(r2)
            java.lang.String r1 = r5.f19483b0
            r2 = 0
            p270p6.C5369c.m11719g(r6, r3, r1, r2)
            r1 = 5
            android.os.IBinder r4 = r5.f19484c0
            p270p6.C5369c.m11715c(r6, r1, r4, r2)
            r1 = 6
            com.google.android.gms.common.api.Scope[] r4 = r5.f19485d0
            p270p6.C5369c.m11721i(r6, r1, r4, r7, r2)
            r1 = 7
            android.os.Bundle r4 = r5.f19486e0
            p270p6.C5369c.m11714b(r6, r1, r4, r2)
            r1 = 8
            android.accounts.Account r4 = r5.f19487f0
            p270p6.C5369c.m11718f(r6, r1, r4, r7, r2)
            r1 = 10
            k6.d[] r4 = r5.f19488g0
            p270p6.C5369c.m11721i(r6, r1, r4, r7, r2)
            r1 = 11
            k6.d[] r4 = r5.f19489h0
            p270p6.C5369c.m11721i(r6, r1, r4, r7, r2)
            r7 = 12
            boolean r1 = r5.f19490i0
            p270p6.C5369c.m11724l(r6, r7, r3)
            r6.writeInt(r1)
            r7 = 13
            int r1 = r5.f19491j0
            p270p6.C5369c.m11724l(r6, r7, r3)
            r6.writeInt(r1)
            r7 = 14
            boolean r1 = r5.f19492k0
            p270p6.C5369c.m11724l(r6, r7, r3)
            r6.writeInt(r1)
            r7 = 15
            java.lang.String r1 = r5.f19493l0
            p270p6.C5369c.m11719g(r6, r7, r1, r2)
            p270p6.C5369c.m11726n(r6, r0)
            return
    }
}
