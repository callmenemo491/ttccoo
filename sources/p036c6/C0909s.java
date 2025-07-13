package p036c6;

/* renamed from: c6.s */
/* loaded from: classes.dex */
public class C0909s extends p270p6.AbstractC5367a {

    @androidx.annotation.RecentlyNonNull
    public static final android.os.Parcelable.Creator<p036c6.C0909s> CREATOR = null;

    /* renamed from: Y */
    public final java.lang.String f4865Y;

    /* renamed from: Z */
    public final java.lang.String f4866Z;

    static {
            c6.y0 r0 = new c6.y0
            r0.<init>()
            p036c6.C0909s.CREATOR = r0
            return
    }

    public C0909s(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            r0.<init>()
            r0.f4865Y = r1
            r0.f4866Z = r2
            return
    }

    @androidx.annotation.RecentlyNullable
    /* renamed from: X */
    public static p036c6.C0909s m2633X(org.json.JSONObject r2) {
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            java.lang.String r0 = "adTagUrl"
            java.lang.String r0 = p123h6.C2487a.m6364c(r2, r0)
            java.lang.String r1 = "adsResponse"
            java.lang.String r2 = p123h6.C2487a.m6364c(r2, r1)
            c6.s r1 = new c6.s
            r1.<init>(r0, r2)
            return r1
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p036c6.C0909s
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            c6.s r5 = (p036c6.C0909s) r5
            java.lang.String r1 = r4.f4865Y
            java.lang.String r3 = r5.f4865Y
            boolean r1 = p123h6.C2487a.m6368g(r1, r3)
            if (r1 == 0) goto L21
            java.lang.String r1 = r4.f4866Z
            java.lang.String r5 = r5.f4866Z
            boolean r5 = p123h6.C2487a.m6368g(r1, r5)
            if (r5 == 0) goto L21
            return r0
        L21:
            return r2
    }

    public int hashCode() {
            r3 = this;
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = r3.f4865Y
            r2 = 0
            r0[r2] = r1
            java.lang.String r1 = r3.f4866Z
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
            r0 = 2
            java.lang.String r1 = r3.f4865Y
            r2 = 0
            p270p6.C5369c.m11719g(r4, r0, r1, r2)
            r0 = 3
            java.lang.String r1 = r3.f4866Z
            p270p6.C5369c.m11719g(r4, r0, r1, r2)
            p270p6.C5369c.m11726n(r4, r5)
            return
    }
}
