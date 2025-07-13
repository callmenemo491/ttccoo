package p411x9;

/* renamed from: x9.g */
/* loaded from: classes.dex */
public final class C6986g extends p375v9.AbstractC6590c {
    public static final android.os.Parcelable.Creator<p411x9.C6986g> CREATOR = null;

    /* renamed from: Y */
    public java.lang.String f27275Y;

    /* renamed from: Z */
    public java.lang.String f27276Z;

    /* renamed from: a0 */
    public java.util.List<p375v9.C6625w> f27277a0;

    static {
            x9.h r0 = new x9.h
            r0.<init>()
            p411x9.C6986g.CREATOR = r0
            return
    }

    public C6986g() {
            r1 = this;
            r0 = 1
            r1.<init>(r0)
            return
    }

    public C6986g(java.lang.String r2, java.lang.String r3, java.util.List<p375v9.C6625w> r4) {
            r1 = this;
            r0 = 1
            r1.<init>(r0)
            r1.f27275Y = r2
            r1.f27276Z = r3
            r1.f27277a0 = r4
            return
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r4, int r5) {
            r3 = this;
            r5 = 20293(0x4f45, float:2.8437E-41)
            int r5 = p270p6.C5369c.m11723k(r4, r5)
            r0 = 1
            java.lang.String r1 = r3.f27275Y
            r2 = 0
            p270p6.C5369c.m11719g(r4, r0, r1, r2)
            r0 = 2
            java.lang.String r1 = r3.f27276Z
            p270p6.C5369c.m11719g(r4, r0, r1, r2)
            r0 = 3
            java.util.List<v9.w> r1 = r3.f27277a0
            p270p6.C5369c.m11722j(r4, r0, r1, r2)
            p270p6.C5369c.m11726n(r4, r5)
            return
    }
}
