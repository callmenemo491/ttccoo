package p248o6;

/* renamed from: o6.d0 */
/* loaded from: classes.dex */
public final class C4903d0 extends p270p6.AbstractC5367a {
    public static final android.os.Parcelable.Creator<p248o6.C4903d0> CREATOR = null;

    /* renamed from: Y */
    public final int f19470Y;

    /* renamed from: Z */
    public android.os.IBinder f19471Z;

    /* renamed from: a0 */
    public p184k6.C3698b f19472a0;

    /* renamed from: b0 */
    public boolean f19473b0;

    /* renamed from: c0 */
    public boolean f19474c0;

    static {
            o6.f0 r0 = new o6.f0
            r0.<init>()
            p248o6.C4903d0.CREATOR = r0
            return
    }

    public C4903d0(int r1, android.os.IBinder r2, p184k6.C3698b r3, boolean r4, boolean r5) {
            r0 = this;
            r0.<init>()
            r0.f19470Y = r1
            r0.f19471Z = r2
            r0.f19472a0 = r3
            r0.f19473b0 = r4
            r0.f19474c0 = r5
            return
    }

    /* renamed from: X */
    public final p248o6.InterfaceC4916k m11065X() {
            r1 = this;
            android.os.IBinder r0 = r1.f19471Z
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            o6.k r0 = p248o6.InterfaceC4916k.a.m11071x(r0)
            return r0
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L4
            return r0
        L4:
            r1 = 1
            if (r4 != r5) goto L8
            return r1
        L8:
            boolean r2 = r5 instanceof p248o6.C4903d0
            if (r2 != 0) goto Ld
            return r0
        Ld:
            o6.d0 r5 = (p248o6.C4903d0) r5
            k6.b r2 = r4.f19472a0
            k6.b r3 = r5.f19472a0
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L28
            o6.k r2 = r4.m11065X()
            o6.k r5 = r5.m11065X()
            boolean r5 = p248o6.C4924o.m11074a(r2, r5)
            if (r5 == 0) goto L28
            return r1
        L28:
            return r0
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r6, int r7) {
            r5 = this;
            r0 = 20293(0x4f45, float:2.8437E-41)
            int r0 = p270p6.C5369c.m11723k(r6, r0)
            r1 = 1
            int r2 = r5.f19470Y
            r3 = 4
            p270p6.C5369c.m11724l(r6, r1, r3)
            r6.writeInt(r2)
            r1 = 2
            android.os.IBinder r2 = r5.f19471Z
            r4 = 0
            p270p6.C5369c.m11715c(r6, r1, r2, r4)
            r1 = 3
            k6.b r2 = r5.f19472a0
            p270p6.C5369c.m11718f(r6, r1, r2, r7, r4)
            boolean r7 = r5.f19473b0
            p270p6.C5369c.m11724l(r6, r3, r3)
            r6.writeInt(r7)
            r7 = 5
            boolean r1 = r5.f19474c0
            p270p6.C5369c.m11724l(r6, r7, r3)
            r6.writeInt(r1)
            p270p6.C5369c.m11726n(r6, r0)
            return
    }
}
