package p164j6;

/* renamed from: j6.a */
/* loaded from: classes.dex */
public final class C3427a extends p270p6.AbstractC5367a {
    public static final android.os.Parcelable.Creator<p164j6.C3427a> CREATOR = null;

    /* renamed from: Y */
    public android.content.Intent f14872Y;

    static {
            j6.e r0 = new j6.e
            r0.<init>()
            p164j6.C3427a.CREATOR = r0
            return
    }

    public C3427a(android.content.Intent r1) {
            r0 = this;
            r0.<init>()
            r0.f14872Y = r1
            return
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r5, int r6) {
            r4 = this;
            r0 = 20293(0x4f45, float:2.8437E-41)
            int r0 = p270p6.C5369c.m11723k(r5, r0)
            r1 = 1
            android.content.Intent r2 = r4.f14872Y
            r3 = 0
            p270p6.C5369c.m11718f(r5, r1, r2, r6, r3)
            p270p6.C5369c.m11726n(r5, r0)
            return
    }
}
