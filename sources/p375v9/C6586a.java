package p375v9;

/* renamed from: v9.a */
/* loaded from: classes.dex */
public class C6586a extends p270p6.AbstractC5367a {
    public static final android.os.Parcelable.Creator<p375v9.C6586a> CREATOR = null;

    /* renamed from: Y */
    public final java.lang.String f25757Y;

    /* renamed from: Z */
    public final java.lang.String f25758Z;

    /* renamed from: a0 */
    public final java.lang.String f25759a0;

    /* renamed from: b0 */
    public final java.lang.String f25760b0;

    /* renamed from: c0 */
    public final boolean f25761c0;

    /* renamed from: d0 */
    public final java.lang.String f25762d0;

    /* renamed from: e0 */
    public final boolean f25763e0;

    /* renamed from: f0 */
    public java.lang.String f25764f0;

    /* renamed from: g0 */
    public int f25765g0;

    /* renamed from: h0 */
    public java.lang.String f25766h0;

    static {
            v9.h0 r0 = new v9.h0
            r0.<init>()
            p375v9.C6586a.CREATOR = r0
            return
    }

    public C6586a(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, boolean r5, java.lang.String r6, boolean r7, java.lang.String r8, int r9, java.lang.String r10) {
            r0 = this;
            r0.<init>()
            r0.f25757Y = r1
            r0.f25758Z = r2
            r0.f25759a0 = r3
            r0.f25760b0 = r4
            r0.f25761c0 = r5
            r0.f25762d0 = r6
            r0.f25763e0 = r7
            r0.f25764f0 = r8
            r0.f25765g0 = r9
            r0.f25766h0 = r10
            return
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r5, int r6) {
            r4 = this;
            r6 = 20293(0x4f45, float:2.8437E-41)
            int r6 = p270p6.C5369c.m11723k(r5, r6)
            java.lang.String r0 = r4.f25757Y
            r1 = 1
            r2 = 0
            p270p6.C5369c.m11719g(r5, r1, r0, r2)
            java.lang.String r0 = r4.f25758Z
            r1 = 2
            p270p6.C5369c.m11719g(r5, r1, r0, r2)
            java.lang.String r0 = r4.f25759a0
            r1 = 3
            p270p6.C5369c.m11719g(r5, r1, r0, r2)
            java.lang.String r0 = r4.f25760b0
            r1 = 4
            p270p6.C5369c.m11719g(r5, r1, r0, r2)
            boolean r0 = r4.f25761c0
            r3 = 5
            p270p6.C5369c.m11724l(r5, r3, r1)
            r5.writeInt(r0)
            java.lang.String r0 = r4.f25762d0
            r3 = 6
            p270p6.C5369c.m11719g(r5, r3, r0, r2)
            boolean r0 = r4.f25763e0
            r3 = 7
            p270p6.C5369c.m11724l(r5, r3, r1)
            r5.writeInt(r0)
            java.lang.String r0 = r4.f25764f0
            r3 = 8
            p270p6.C5369c.m11719g(r5, r3, r0, r2)
            int r0 = r4.f25765g0
            r3 = 9
            p270p6.C5369c.m11724l(r5, r3, r1)
            r5.writeInt(r0)
            java.lang.String r0 = r4.f25766h0
            r1 = 10
            p270p6.C5369c.m11719g(r5, r1, r0, r2)
            p270p6.C5369c.m11726n(r5, r6)
            return
    }
}
