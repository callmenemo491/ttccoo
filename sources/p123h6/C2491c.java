package p123h6;

/* renamed from: h6.c */
/* loaded from: classes.dex */
public final class C2491c extends p270p6.AbstractC5367a {
    public static final android.os.Parcelable.Creator<p123h6.C2491c> CREATOR = null;

    /* renamed from: Y */
    public final java.lang.String f11259Y;

    static {
            h6.r r0 = new h6.r
            r0.<init>()
            p123h6.C2491c.CREATOR = r0
            return
    }

    public C2491c() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f11259Y = r0
            return
    }

    public C2491c(java.lang.String r1) {
            r0 = this;
            r0.<init>()
            r0.f11259Y = r1
            return
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r2 != r1) goto L4
            r2 = 1
            return r2
        L4:
            boolean r0 = r2 instanceof p123h6.C2491c
            if (r0 != 0) goto La
            r2 = 0
            return r2
        La:
            h6.c r2 = (p123h6.C2491c) r2
            java.lang.String r0 = r1.f11259Y
            java.lang.String r2 = r2.f11259Y
            boolean r2 = p123h6.C2487a.m6368g(r0, r2)
            return r2
    }

    public final int hashCode() {
            r3 = this;
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = r3.f11259Y
            r2 = 0
            r0[r2] = r1
            int r0 = java.util.Arrays.hashCode(r0)
            return r0
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r4, int r5) {
            r3 = this;
            r5 = 20293(0x4f45, float:2.8437E-41)
            int r5 = p270p6.C5369c.m11723k(r4, r5)
            r0 = 2
            java.lang.String r1 = r3.f11259Y
            r2 = 0
            p270p6.C5369c.m11719g(r4, r0, r1, r2)
            p270p6.C5369c.m11726n(r4, r5)
            return
    }
}
