package p052d6;

/* renamed from: d6.b */
/* loaded from: classes.dex */
public class C1297b extends p270p6.AbstractC5367a {

    @androidx.annotation.RecentlyNonNull
    public static final android.os.Parcelable.Creator<p052d6.C1297b> CREATOR = null;

    /* renamed from: Y */
    public java.lang.String f6817Y;

    /* renamed from: Z */
    public final java.util.List<java.lang.String> f6818Z;

    /* renamed from: a0 */
    public boolean f6819a0;

    /* renamed from: b0 */
    public p036c6.C0887h f6820b0;

    /* renamed from: c0 */
    public final boolean f6821c0;

    /* renamed from: d0 */
    public final p071e6.C1521a f6822d0;

    /* renamed from: e0 */
    public final boolean f6823e0;

    /* renamed from: f0 */
    public final double f6824f0;

    /* renamed from: g0 */
    public final boolean f6825g0;

    /* renamed from: h0 */
    public final boolean f6826h0;

    /* renamed from: i0 */
    public final boolean f6827i0;

    static {
            d6.c0 r0 = new d6.c0
            r0.<init>()
            p052d6.C1297b.CREATOR = r0
            return
    }

    public C1297b(java.lang.String r3, java.util.List<java.lang.String> r4, boolean r5, p036c6.C0887h r6, boolean r7, p071e6.C1521a r8, boolean r9, double r10, boolean r12, boolean r13, boolean r14) {
            r2 = this;
            r2.<init>()
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            r1 = 1
            if (r1 != r0) goto Lc
            java.lang.String r3 = ""
        Lc:
            r2.f6817Y = r3
            if (r4 != 0) goto L12
            r3 = 0
            goto L16
        L12:
            int r3 = r4.size()
        L16:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r3)
            r2.f6818Z = r0
            if (r3 <= 0) goto L22
            r0.addAll(r4)
        L22:
            r2.f6819a0 = r5
            if (r6 != 0) goto L2b
            c6.h r6 = new c6.h
            r6.<init>()
        L2b:
            r2.f6820b0 = r6
            r2.f6821c0 = r7
            r2.f6822d0 = r8
            r2.f6823e0 = r9
            r2.f6824f0 = r10
            r2.f6825g0 = r12
            r2.f6826h0 = r13
            r2.f6827i0 = r14
            return
    }

    @androidx.annotation.RecentlyNonNull
    /* renamed from: X */
    public java.util.List<java.lang.String> m3765X() {
            r1 = this;
            java.util.List<java.lang.String> r0 = r1.f6818Z
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            return r0
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@androidx.annotation.RecentlyNonNull android.os.Parcel r6, int r7) {
            r5 = this;
            r0 = 20293(0x4f45, float:2.8437E-41)
            int r0 = p270p6.C5369c.m11723k(r6, r0)
            java.lang.String r1 = r5.f6817Y
            r2 = 2
            r3 = 0
            p270p6.C5369c.m11719g(r6, r2, r1, r3)
            java.util.List r1 = r5.m3765X()
            r2 = 3
            p270p6.C5369c.m11720h(r6, r2, r1, r3)
            boolean r1 = r5.f6819a0
            r2 = 4
            p270p6.C5369c.m11724l(r6, r2, r2)
            r6.writeInt(r1)
            c6.h r1 = r5.f6820b0
            r4 = 5
            p270p6.C5369c.m11718f(r6, r4, r1, r7, r3)
            boolean r1 = r5.f6821c0
            r4 = 6
            p270p6.C5369c.m11724l(r6, r4, r2)
            r6.writeInt(r1)
            e6.a r1 = r5.f6822d0
            r4 = 7
            p270p6.C5369c.m11718f(r6, r4, r1, r7, r3)
            boolean r7 = r5.f6823e0
            r1 = 8
            p270p6.C5369c.m11724l(r6, r1, r2)
            r6.writeInt(r7)
            double r3 = r5.f6824f0
            r7 = 9
            p270p6.C5369c.m11724l(r6, r7, r1)
            r6.writeDouble(r3)
            boolean r7 = r5.f6825g0
            r1 = 10
            p270p6.C5369c.m11724l(r6, r1, r2)
            r6.writeInt(r7)
            boolean r7 = r5.f6826h0
            r1 = 11
            p270p6.C5369c.m11724l(r6, r1, r2)
            r6.writeInt(r7)
            boolean r7 = r5.f6827i0
            r1 = 12
            p270p6.C5369c.m11724l(r6, r1, r2)
            r6.writeInt(r7)
            p270p6.C5369c.m11726n(r6, r0)
            return
    }
}
