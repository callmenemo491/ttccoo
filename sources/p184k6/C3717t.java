package p184k6;

/* renamed from: k6.t */
/* loaded from: classes.dex */
public final class C3717t extends p270p6.AbstractC5367a {
    public static final android.os.Parcelable.Creator<p184k6.C3717t> CREATOR = null;

    /* renamed from: Y */
    public final java.lang.String f16432Y;

    /* renamed from: Z */
    public final boolean f16433Z;

    /* renamed from: a0 */
    public final boolean f16434a0;

    /* renamed from: b0 */
    public final android.content.Context f16435b0;

    /* renamed from: c0 */
    public final boolean f16436c0;

    static {
            k6.w r0 = new k6.w
            r0.<init>()
            p184k6.C3717t.CREATOR = r0
            return
    }

    public C3717t(java.lang.String r1, boolean r2, boolean r3, android.os.IBinder r4, boolean r5) {
            r0 = this;
            r0.<init>()
            r0.f16432Y = r1
            r0.f16433Z = r2
            r0.f16434a0 = r3
            x6.a r1 = p408x6.InterfaceC6957a.a.m14123x(r4)
            java.lang.Object r1 = p408x6.BinderC6958b.m14124H(r1)
            android.content.Context r1 = (android.content.Context) r1
            r0.f16435b0 = r1
            r0.f16436c0 = r5
            return
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r5, int r6) {
            r4 = this;
            r6 = 20293(0x4f45, float:2.8437E-41)
            int r6 = p270p6.C5369c.m11723k(r5, r6)
            r0 = 1
            java.lang.String r1 = r4.f16432Y
            r2 = 0
            p270p6.C5369c.m11719g(r5, r0, r1, r2)
            r0 = 2
            boolean r1 = r4.f16433Z
            r3 = 4
            p270p6.C5369c.m11724l(r5, r0, r3)
            r5.writeInt(r1)
            r0 = 3
            boolean r1 = r4.f16434a0
            p270p6.C5369c.m11724l(r5, r0, r3)
            r5.writeInt(r1)
            android.content.Context r0 = r4.f16435b0
            x6.b r1 = new x6.b
            r1.<init>(r0)
            p270p6.C5369c.m11715c(r5, r3, r1, r2)
            r0 = 5
            boolean r1 = r4.f16436c0
            p270p6.C5369c.m11724l(r5, r0, r3)
            r5.writeInt(r1)
            p270p6.C5369c.m11726n(r5, r6)
            return
    }
}
