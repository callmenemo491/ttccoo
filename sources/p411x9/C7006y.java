package p411x9;

/* renamed from: x9.y */
/* loaded from: classes.dex */
public final class C7006y implements p270p6.InterfaceC5370d {
    public static final android.os.Parcelable.Creator<p411x9.C7006y> CREATOR = null;

    /* renamed from: Y */
    public final java.lang.String f27302Y;

    /* renamed from: Z */
    public final java.lang.String f27303Z;

    /* renamed from: a0 */
    public final java.util.Map<java.lang.String, java.lang.Object> f27304a0;

    /* renamed from: b0 */
    public final boolean f27305b0;

    static {
            x9.z r0 = new x9.z
            r0.<init>()
            p411x9.C7006y.CREATOR = r0
            return
    }

    public C7006y(java.lang.String r1, java.lang.String r2, boolean r3) {
            r0 = this;
            r0.<init>()
            com.google.android.gms.common.internal.C1101a.m3100e(r1)
            com.google.android.gms.common.internal.C1101a.m3100e(r2)
            r0.f27302Y = r1
            r0.f27303Z = r2
            java.util.Map r1 = p411x9.C6994m.m14144c(r2)
            r0.f27304a0 = r1
            r0.f27305b0 = r3
            return
    }

    public C7006y(boolean r1) {
            r0 = this;
            r0.<init>()
            r0.f27305b0 = r1
            r1 = 0
            r0.f27303Z = r1
            r0.f27302Y = r1
            return
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r4, int r5) {
            r3 = this;
            r5 = 20293(0x4f45, float:2.8437E-41)
            int r5 = p270p6.C5369c.m11723k(r4, r5)
            r0 = 1
            java.lang.String r1 = r3.f27302Y
            r2 = 0
            p270p6.C5369c.m11719g(r4, r0, r1, r2)
            r0 = 2
            java.lang.String r1 = r3.f27303Z
            p270p6.C5369c.m11719g(r4, r0, r1, r2)
            r0 = 3
            boolean r1 = r3.f27305b0
            r2 = 4
            p270p6.C5369c.m11724l(r4, r0, r2)
            r4.writeInt(r1)
            p270p6.C5369c.m11726n(r4, r5)
            return
    }
}
