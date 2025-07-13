package p375v9;

/* renamed from: v9.a0 */
/* loaded from: classes.dex */
public class C6587a0 extends p270p6.AbstractC5367a {
    public static final android.os.Parcelable.Creator<p375v9.C6587a0> CREATOR = null;

    /* renamed from: Y */
    public java.lang.String f25767Y;

    /* renamed from: Z */
    public java.lang.String f25768Z;

    /* renamed from: a0 */
    public boolean f25769a0;

    /* renamed from: b0 */
    public boolean f25770b0;

    /* renamed from: c0 */
    public android.net.Uri f25771c0;

    static {
            v9.g0 r0 = new v9.g0
            r0.<init>()
            p375v9.C6587a0.CREATOR = r0
            return
    }

    public C6587a0(java.lang.String r1, java.lang.String r2, boolean r3, boolean r4) {
            r0 = this;
            r0.<init>()
            r0.f25767Y = r1
            r0.f25768Z = r2
            r0.f25769a0 = r3
            r0.f25770b0 = r4
            boolean r1 = android.text.TextUtils.isEmpty(r2)
            if (r1 == 0) goto L13
            r1 = 0
            goto L17
        L13:
            android.net.Uri r1 = android.net.Uri.parse(r2)
        L17:
            r0.f25771c0 = r1
            return
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r4, int r5) {
            r3 = this;
            r5 = 20293(0x4f45, float:2.8437E-41)
            int r5 = p270p6.C5369c.m11723k(r4, r5)
            r0 = 2
            java.lang.String r1 = r3.f25767Y
            r2 = 0
            p270p6.C5369c.m11719g(r4, r0, r1, r2)
            r0 = 3
            java.lang.String r1 = r3.f25768Z
            p270p6.C5369c.m11719g(r4, r0, r1, r2)
            boolean r0 = r3.f25769a0
            r1 = 4
            p270p6.C5369c.m11724l(r4, r1, r1)
            r4.writeInt(r0)
            r0 = 5
            boolean r2 = r3.f25770b0
            p270p6.C5369c.m11724l(r4, r0, r1)
            r4.writeInt(r2)
            p270p6.C5369c.m11726n(r4, r5)
            return
    }
}
