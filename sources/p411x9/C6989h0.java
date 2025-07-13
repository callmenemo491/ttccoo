package p411x9;

/* renamed from: x9.h0 */
/* loaded from: classes.dex */
public final class C6989h0 implements p270p6.InterfaceC5370d {
    public static final android.os.Parcelable.Creator<p411x9.C6989h0> CREATOR = null;

    /* renamed from: Y */
    public final long f27278Y;

    /* renamed from: Z */
    public final long f27279Z;

    static {
            x9.c r0 = new x9.c
            r0.<init>()
            p411x9.C6989h0.CREATOR = r0
            return
    }

    public C6989h0(long r1, long r3) {
            r0 = this;
            r0.<init>()
            r0.f27278Y = r1
            r0.f27279Z = r3
            return
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r5, int r6) {
            r4 = this;
            r6 = 20293(0x4f45, float:2.8437E-41)
            int r6 = p270p6.C5369c.m11723k(r5, r6)
            r0 = 1
            long r1 = r4.f27278Y
            r3 = 8
            p270p6.C5369c.m11724l(r5, r0, r3)
            r5.writeLong(r1)
            r0 = 2
            long r1 = r4.f27279Z
            p270p6.C5369c.m11724l(r5, r0, r3)
            r5.writeLong(r1)
            p270p6.C5369c.m11726n(r5, r6)
            return
    }
}
