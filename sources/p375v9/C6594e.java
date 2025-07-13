package p375v9;

/* renamed from: v9.e */
/* loaded from: classes.dex */
public class C6594e extends p375v9.AbstractC6590c {
    public static final android.os.Parcelable.Creator<p375v9.C6594e> CREATOR = null;

    /* renamed from: Y */
    public java.lang.String f25775Y;

    /* renamed from: Z */
    public java.lang.String f25776Z;

    /* renamed from: a0 */
    public final java.lang.String f25777a0;

    /* renamed from: b0 */
    public java.lang.String f25778b0;

    /* renamed from: c0 */
    public boolean f25779c0;

    static {
            v9.l0 r0 = new v9.l0
            r0.<init>()
            p375v9.C6594e.CREATOR = r0
            return
    }

    public C6594e(java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, boolean r6) {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            com.google.android.gms.common.internal.C1101a.m3100e(r2)
            r1.f25775Y = r2
            boolean r2 = android.text.TextUtils.isEmpty(r3)
            if (r2 == 0) goto L1e
            boolean r2 = android.text.TextUtils.isEmpty(r4)
            if (r2 != 0) goto L16
            goto L1e
        L16:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Cannot create an EmailAuthCredential without a password or emailLink."
            r2.<init>(r3)
            throw r2
        L1e:
            r1.f25776Z = r3
            r1.f25777a0 = r4
            r1.f25778b0 = r5
            r1.f25779c0 = r6
            return
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r4, int r5) {
            r3 = this;
            r5 = 20293(0x4f45, float:2.8437E-41)
            int r5 = p270p6.C5369c.m11723k(r4, r5)
            r0 = 1
            java.lang.String r1 = r3.f25775Y
            r2 = 0
            p270p6.C5369c.m11719g(r4, r0, r1, r2)
            r0 = 2
            java.lang.String r1 = r3.f25776Z
            p270p6.C5369c.m11719g(r4, r0, r1, r2)
            r0 = 3
            java.lang.String r1 = r3.f25777a0
            p270p6.C5369c.m11719g(r4, r0, r1, r2)
            java.lang.String r0 = r3.f25778b0
            r1 = 4
            p270p6.C5369c.m11719g(r4, r1, r0, r2)
            r0 = 5
            boolean r2 = r3.f25779c0
            p270p6.C5369c.m11724l(r4, r0, r1)
            r4.writeInt(r2)
            p270p6.C5369c.m11726n(r4, r5)
            return
    }
}
