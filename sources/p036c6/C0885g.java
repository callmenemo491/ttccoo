package p036c6;

/* renamed from: c6.g */
/* loaded from: classes.dex */
public class C0885g extends p270p6.AbstractC5367a {

    @androidx.annotation.RecentlyNonNull
    public static final android.os.Parcelable.Creator<p036c6.C0885g> CREATOR = null;

    /* renamed from: Y */
    public final java.lang.String f4760Y;

    /* renamed from: Z */
    public final java.lang.String f4761Z;

    static {
            c6.v r0 = new c6.v
            r0.<init>()
            p036c6.C0885g.CREATOR = r0
            return
    }

    public C0885g(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            r0.<init>()
            r0.f4760Y = r1
            r0.f4761Z = r2
            return
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p036c6.C0885g
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            c6.g r5 = (p036c6.C0885g) r5
            java.lang.String r1 = r4.f4760Y
            java.lang.String r3 = r5.f4760Y
            boolean r1 = p248o6.C4924o.m11074a(r1, r3)
            if (r1 == 0) goto L21
            java.lang.String r1 = r4.f4761Z
            java.lang.String r5 = r5.f4761Z
            boolean r5 = p248o6.C4924o.m11074a(r1, r5)
            if (r5 == 0) goto L21
            return r0
        L21:
            return r2
    }

    public int hashCode() {
            r3 = this;
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = r3.f4760Y
            r2 = 0
            r0[r2] = r1
            java.lang.String r1 = r3.f4761Z
            r2 = 1
            r0[r2] = r1
            int r0 = java.util.Arrays.hashCode(r0)
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@androidx.annotation.RecentlyNonNull android.os.Parcel r4, int r5) {
            r3 = this;
            r5 = 20293(0x4f45, float:2.8437E-41)
            int r5 = p270p6.C5369c.m11723k(r4, r5)
            r0 = 1
            java.lang.String r1 = r3.f4760Y
            r2 = 0
            p270p6.C5369c.m11719g(r4, r0, r1, r2)
            r0 = 2
            java.lang.String r1 = r3.f4761Z
            p270p6.C5369c.m11719g(r4, r0, r1, r2)
            p270p6.C5369c.m11726n(r4, r5)
            return
    }
}
