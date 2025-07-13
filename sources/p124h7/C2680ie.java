package p124h7;

/* renamed from: h7.ie */
/* loaded from: classes.dex */
public final class C2680ie extends p270p6.AbstractC5367a {
    public static final android.os.Parcelable.Creator<p124h7.C2680ie> CREATOR = null;

    /* renamed from: Y */
    public final java.util.List<p124h7.C2644ge> f11641Y;

    static {
            h7.je r0 = new h7.je
            r0.<init>()
            p124h7.C2680ie.CREATOR = r0
            return
    }

    public C2680ie() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f11641Y = r0
            return
    }

    public C2680ie(java.util.List<p124h7.C2644ge> r1) {
            r0 = this;
            r0.<init>()
            if (r1 != 0) goto La
            java.util.List r1 = java.util.Collections.emptyList()
            goto Le
        La:
            java.util.List r1 = java.util.Collections.unmodifiableList(r1)
        Le:
            r0.f11641Y = r1
            return
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r4, int r5) {
            r3 = this;
            r5 = 20293(0x4f45, float:2.8437E-41)
            int r5 = p270p6.C5369c.m11723k(r4, r5)
            r0 = 2
            java.util.List<h7.ge> r1 = r3.f11641Y
            r2 = 0
            p270p6.C5369c.m11722j(r4, r0, r1, r2)
            p270p6.C5369c.m11726n(r4, r5)
            return
    }
}
