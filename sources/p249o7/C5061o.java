package p249o7;

/* renamed from: o7.o */
/* loaded from: classes.dex */
public final class C5061o extends p270p6.AbstractC5367a implements java.lang.Iterable<java.lang.String> {
    public static final android.os.Parcelable.Creator<p249o7.C5061o> CREATOR = null;

    /* renamed from: Y */
    public final android.os.Bundle f19913Y;

    static {
            o7.p r0 = new o7.p
            r0.<init>()
            p249o7.C5061o.CREATOR = r0
            return
    }

    public C5061o(android.os.Bundle r1) {
            r0 = this;
            r0.<init>()
            r0.f19913Y = r1
            return
    }

    /* renamed from: X */
    public final android.os.Bundle m11371X() {
            r2 = this;
            android.os.Bundle r0 = new android.os.Bundle
            android.os.Bundle r1 = r2.f19913Y
            r0.<init>(r1)
            return r0
    }

    /* renamed from: Y */
    public final java.lang.Double m11372Y() {
            r2 = this;
            android.os.Bundle r0 = r2.f19913Y
            java.lang.String r1 = "value"
            double r0 = r0.getDouble(r1)
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            return r0
    }

    /* renamed from: Z */
    public final java.lang.Long m11373Z() {
            r2 = this;
            android.os.Bundle r0 = r2.f19913Y
            java.lang.String r1 = "value"
            long r0 = r0.getLong(r1)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            return r0
    }

    /* renamed from: a0 */
    public final java.lang.Object m11374a0(java.lang.String r2) {
            r1 = this;
            android.os.Bundle r0 = r1.f19913Y
            java.lang.Object r2 = r0.get(r2)
            return r2
    }

    /* renamed from: b0 */
    public final java.lang.String m11375b0(java.lang.String r2) {
            r1 = this;
            android.os.Bundle r0 = r1.f19913Y
            java.lang.String r2 = r0.getString(r2)
            return r2
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator<java.lang.String> iterator() {
            r1 = this;
            e7.d8 r0 = new e7.d8
            r0.<init>(r1)
            return r0
    }

    public final java.lang.String toString() {
            r1 = this;
            android.os.Bundle r0 = r1.f19913Y
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r4, int r5) {
            r3 = this;
            r5 = 20293(0x4f45, float:2.8437E-41)
            int r5 = p270p6.C5369c.m11723k(r4, r5)
            r0 = 2
            android.os.Bundle r1 = r3.m11371X()
            r2 = 0
            p270p6.C5369c.m11714b(r4, r0, r1, r2)
            p270p6.C5369c.m11726n(r4, r5)
            return
    }
}
