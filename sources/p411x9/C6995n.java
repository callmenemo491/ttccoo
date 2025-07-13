package p411x9;

/* renamed from: x9.n */
/* loaded from: classes.dex */
public final class C6995n extends p270p6.AbstractC5367a {
    public static final android.os.Parcelable.Creator<p411x9.C6995n> CREATOR = null;

    /* renamed from: Y */
    public final java.util.List<p375v9.C6625w> f27289Y;

    static {
            x9.o r0 = new x9.o
            r0.<init>()
            p411x9.C6995n.CREATOR = r0
            return
    }

    public C6995n(java.util.List<p375v9.C6625w> r1) {
            r0 = this;
            r0.<init>()
            if (r1 != 0) goto La
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        La:
            r0.f27289Y = r1
            return
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r4, int r5) {
            r3 = this;
            r5 = 20293(0x4f45, float:2.8437E-41)
            int r5 = p270p6.C5369c.m11723k(r4, r5)
            r0 = 1
            java.util.List<v9.w> r1 = r3.f27289Y
            r2 = 0
            p270p6.C5369c.m11722j(r4, r0, r1, r2)
            p270p6.C5369c.m11726n(r4, r5)
            return
    }
}
