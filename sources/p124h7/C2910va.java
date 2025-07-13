package p124h7;

/* renamed from: h7.va */
/* loaded from: classes.dex */
public final class C2910va extends p270p6.AbstractC5367a {
    public static final android.os.Parcelable.Creator<p124h7.C2910va> CREATOR = null;

    /* renamed from: Y */
    public final com.google.android.gms.common.api.Status f11954Y;

    /* renamed from: Z */
    public final p375v9.C6605j0 f11955Z;

    /* renamed from: a0 */
    public final java.lang.String f11956a0;

    /* renamed from: b0 */
    public final java.lang.String f11957b0;

    static {
            h7.wa r0 = new h7.wa
            r0.<init>()
            p124h7.C2910va.CREATOR = r0
            return
    }

    public C2910va(com.google.android.gms.common.api.Status r1, p375v9.C6605j0 r2, java.lang.String r3, java.lang.String r4) {
            r0 = this;
            r0.<init>()
            r0.f11954Y = r1
            r0.f11955Z = r2
            r0.f11956a0 = r3
            r0.f11957b0 = r4
            return
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r5, int r6) {
            r4 = this;
            r0 = 20293(0x4f45, float:2.8437E-41)
            int r0 = p270p6.C5369c.m11723k(r5, r0)
            r1 = 1
            com.google.android.gms.common.api.Status r2 = r4.f11954Y
            r3 = 0
            p270p6.C5369c.m11718f(r5, r1, r2, r6, r3)
            r1 = 2
            v9.j0 r2 = r4.f11955Z
            p270p6.C5369c.m11718f(r5, r1, r2, r6, r3)
            r6 = 3
            java.lang.String r1 = r4.f11956a0
            p270p6.C5369c.m11719g(r5, r6, r1, r3)
            r6 = 4
            java.lang.String r1 = r4.f11957b0
            p270p6.C5369c.m11719g(r5, r6, r1, r3)
            p270p6.C5369c.m11726n(r5, r0)
            return
    }
}
