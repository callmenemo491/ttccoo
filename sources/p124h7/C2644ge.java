package p124h7;

/* renamed from: h7.ge */
/* loaded from: classes.dex */
public final class C2644ge extends p270p6.AbstractC5367a {
    public static final android.os.Parcelable.Creator<p124h7.C2644ge> CREATOR = null;

    /* renamed from: Y */
    public java.lang.String f11544Y;

    /* renamed from: Z */
    public java.lang.String f11545Z;

    /* renamed from: a0 */
    public boolean f11546a0;

    /* renamed from: b0 */
    public java.lang.String f11547b0;

    /* renamed from: c0 */
    public java.lang.String f11548c0;

    /* renamed from: d0 */
    public p124h7.C2860se f11549d0;

    /* renamed from: e0 */
    public java.lang.String f11550e0;

    /* renamed from: f0 */
    public java.lang.String f11551f0;

    /* renamed from: g0 */
    public long f11552g0;

    /* renamed from: h0 */
    public long f11553h0;

    /* renamed from: i0 */
    public boolean f11554i0;

    /* renamed from: j0 */
    public p375v9.C6605j0 f11555j0;

    /* renamed from: k0 */
    public java.util.List<p124h7.C2788oe> f11556k0;

    static {
            h7.he r0 = new h7.he
            r0.<init>()
            p124h7.C2644ge.CREATOR = r0
            return
    }

    public C2644ge() {
            r1 = this;
            r1.<init>()
            h7.se r0 = new h7.se
            r0.<init>()
            r1.f11549d0 = r0
            return
    }

    public C2644ge(java.lang.String r1, java.lang.String r2, boolean r3, java.lang.String r4, java.lang.String r5, p124h7.C2860se r6, java.lang.String r7, java.lang.String r8, long r9, long r11, boolean r13, p375v9.C6605j0 r14, java.util.List<p124h7.C2788oe> r15) {
            r0 = this;
            r0.<init>()
            r0.f11544Y = r1
            r0.f11545Z = r2
            r0.f11546a0 = r3
            r0.f11547b0 = r4
            r0.f11548c0 = r5
            if (r6 != 0) goto L15
            h7.se r1 = new h7.se
            r1.<init>()
            goto L24
        L15:
            java.util.List<h7.qe> r1 = r6.f11911Y
            h7.se r2 = new h7.se
            r2.<init>()
            if (r1 == 0) goto L23
            java.util.List<h7.qe> r3 = r2.f11911Y
            r3.addAll(r1)
        L23:
            r1 = r2
        L24:
            r0.f11549d0 = r1
            r0.f11550e0 = r7
            r0.f11551f0 = r8
            r0.f11552g0 = r9
            r0.f11553h0 = r11
            r0.f11554i0 = r13
            r0.f11555j0 = r14
            if (r15 != 0) goto L39
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
        L39:
            r0.f11556k0 = r15
            return
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r8, int r9) {
            r7 = this;
            r0 = 20293(0x4f45, float:2.8437E-41)
            int r0 = p270p6.C5369c.m11723k(r8, r0)
            r1 = 2
            java.lang.String r2 = r7.f11544Y
            r3 = 0
            p270p6.C5369c.m11719g(r8, r1, r2, r3)
            r1 = 3
            java.lang.String r2 = r7.f11545Z
            p270p6.C5369c.m11719g(r8, r1, r2, r3)
            boolean r1 = r7.f11546a0
            r2 = 4
            p270p6.C5369c.m11724l(r8, r2, r2)
            r8.writeInt(r1)
            r1 = 5
            java.lang.String r4 = r7.f11547b0
            p270p6.C5369c.m11719g(r8, r1, r4, r3)
            r1 = 6
            java.lang.String r4 = r7.f11548c0
            p270p6.C5369c.m11719g(r8, r1, r4, r3)
            r1 = 7
            h7.se r4 = r7.f11549d0
            p270p6.C5369c.m11718f(r8, r1, r4, r9, r3)
            java.lang.String r1 = r7.f11550e0
            r4 = 8
            p270p6.C5369c.m11719g(r8, r4, r1, r3)
            r1 = 9
            java.lang.String r5 = r7.f11551f0
            p270p6.C5369c.m11719g(r8, r1, r5, r3)
            r1 = 10
            long r5 = r7.f11552g0
            p270p6.C5369c.m11724l(r8, r1, r4)
            r8.writeLong(r5)
            r1 = 11
            long r5 = r7.f11553h0
            p270p6.C5369c.m11724l(r8, r1, r4)
            r8.writeLong(r5)
            r1 = 12
            boolean r4 = r7.f11554i0
            p270p6.C5369c.m11724l(r8, r1, r2)
            r8.writeInt(r4)
            r1 = 13
            v9.j0 r2 = r7.f11555j0
            p270p6.C5369c.m11718f(r8, r1, r2, r9, r3)
            r9 = 14
            java.util.List<h7.oe> r1 = r7.f11556k0
            p270p6.C5369c.m11722j(r8, r9, r1, r3)
            p270p6.C5369c.m11726n(r8, r0)
            return
    }
}
