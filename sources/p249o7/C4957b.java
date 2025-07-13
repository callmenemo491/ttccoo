package p249o7;

/* renamed from: o7.b */
/* loaded from: classes.dex */
public final class C4957b extends p270p6.AbstractC5367a {
    public static final android.os.Parcelable.Creator<p249o7.C4957b> CREATOR = null;

    /* renamed from: Y */
    public java.lang.String f19587Y;

    /* renamed from: Z */
    public java.lang.String f19588Z;

    /* renamed from: a0 */
    public p249o7.C5076p6 f19589a0;

    /* renamed from: b0 */
    public long f19590b0;

    /* renamed from: c0 */
    public boolean f19591c0;

    /* renamed from: d0 */
    public java.lang.String f19592d0;

    /* renamed from: e0 */
    public final p249o7.C5077q f19593e0;

    /* renamed from: f0 */
    public long f19594f0;

    /* renamed from: g0 */
    public p249o7.C5077q f19595g0;

    /* renamed from: h0 */
    public final long f19596h0;

    /* renamed from: i0 */
    public final p249o7.C5077q f19597i0;

    static {
            o7.c r0 = new o7.c
            r0.<init>()
            p249o7.C4957b.CREATOR = r0
            return
    }

    public C4957b(java.lang.String r1, java.lang.String r2, p249o7.C5076p6 r3, long r4, boolean r6, java.lang.String r7, p249o7.C5077q r8, long r9, p249o7.C5077q r11, long r12, p249o7.C5077q r14) {
            r0 = this;
            r0.<init>()
            r0.f19587Y = r1
            r0.f19588Z = r2
            r0.f19589a0 = r3
            r0.f19590b0 = r4
            r0.f19591c0 = r6
            r0.f19592d0 = r7
            r0.f19593e0 = r8
            r0.f19594f0 = r9
            r0.f19595g0 = r11
            r0.f19596h0 = r12
            r0.f19597i0 = r14
            return
    }

    public C4957b(p249o7.C4957b r3) {
            r2 = this;
            r2.<init>()
            java.lang.String r0 = r3.f19587Y
            r2.f19587Y = r0
            java.lang.String r0 = r3.f19588Z
            r2.f19588Z = r0
            o7.p6 r0 = r3.f19589a0
            r2.f19589a0 = r0
            long r0 = r3.f19590b0
            r2.f19590b0 = r0
            boolean r0 = r3.f19591c0
            r2.f19591c0 = r0
            java.lang.String r0 = r3.f19592d0
            r2.f19592d0 = r0
            o7.q r0 = r3.f19593e0
            r2.f19593e0 = r0
            long r0 = r3.f19594f0
            r2.f19594f0 = r0
            o7.q r0 = r3.f19595g0
            r2.f19595g0 = r0
            long r0 = r3.f19596h0
            r2.f19596h0 = r0
            o7.q r3 = r3.f19597i0
            r2.f19597i0 = r3
            return
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r8, int r9) {
            r7 = this;
            r0 = 20293(0x4f45, float:2.8437E-41)
            int r0 = p270p6.C5369c.m11723k(r8, r0)
            r1 = 2
            java.lang.String r2 = r7.f19587Y
            r3 = 0
            p270p6.C5369c.m11719g(r8, r1, r2, r3)
            r1 = 3
            java.lang.String r2 = r7.f19588Z
            p270p6.C5369c.m11719g(r8, r1, r2, r3)
            o7.p6 r1 = r7.f19589a0
            r2 = 4
            p270p6.C5369c.m11718f(r8, r2, r1, r9, r3)
            r1 = 5
            long r4 = r7.f19590b0
            r6 = 8
            p270p6.C5369c.m11724l(r8, r1, r6)
            r8.writeLong(r4)
            r1 = 6
            boolean r4 = r7.f19591c0
            p270p6.C5369c.m11724l(r8, r1, r2)
            r8.writeInt(r4)
            r1 = 7
            java.lang.String r2 = r7.f19592d0
            p270p6.C5369c.m11719g(r8, r1, r2, r3)
            o7.q r1 = r7.f19593e0
            p270p6.C5369c.m11718f(r8, r6, r1, r9, r3)
            r1 = 9
            long r4 = r7.f19594f0
            p270p6.C5369c.m11724l(r8, r1, r6)
            r8.writeLong(r4)
            r1 = 10
            o7.q r2 = r7.f19595g0
            p270p6.C5369c.m11718f(r8, r1, r2, r9, r3)
            r1 = 11
            long r4 = r7.f19596h0
            p270p6.C5369c.m11724l(r8, r1, r6)
            r8.writeLong(r4)
            r1 = 12
            o7.q r2 = r7.f19597i0
            p270p6.C5369c.m11718f(r8, r1, r2, r9, r3)
            p270p6.C5369c.m11726n(r8, r0)
            return
    }
}
