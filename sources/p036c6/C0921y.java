package p036c6;

/* renamed from: c6.y */
/* loaded from: classes.dex */
public final class C0921y extends p270p6.AbstractC5367a {
    public static final android.os.Parcelable.Creator<p036c6.C0921y> CREATOR = null;

    /* renamed from: Y */
    public final p036c6.C0917w f4874Y;

    /* renamed from: Z */
    public final p036c6.C0917w f4875Z;

    static {
            c6.z r0 = new c6.z
            r0.<init>()
            p036c6.C0921y.CREATOR = r0
            return
    }

    public C0921y(p036c6.C0917w r1, p036c6.C0917w r2) {
            r0 = this;
            r0.<init>()
            r0.f4874Y = r1
            r0.f4875Z = r2
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p036c6.C0921y
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            c6.y r5 = (p036c6.C0921y) r5
            c6.w r1 = r4.f4874Y
            c6.w r3 = r5.f4874Y
            boolean r1 = p123h6.C2487a.m6368g(r1, r3)
            if (r1 == 0) goto L21
            c6.w r1 = r4.f4875Z
            c6.w r5 = r5.f4875Z
            boolean r5 = p123h6.C2487a.m6368g(r1, r5)
            if (r5 == 0) goto L21
            return r0
        L21:
            return r2
    }

    public final int hashCode() {
            r3 = this;
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            c6.w r1 = r3.f4874Y
            r2 = 0
            r0[r2] = r1
            c6.w r1 = r3.f4875Z
            r2 = 1
            r0[r2] = r1
            int r0 = java.util.Arrays.hashCode(r0)
            return r0
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r5, int r6) {
            r4 = this;
            r0 = 20293(0x4f45, float:2.8437E-41)
            int r0 = p270p6.C5369c.m11723k(r5, r0)
            r1 = 2
            c6.w r2 = r4.f4874Y
            r3 = 0
            p270p6.C5369c.m11718f(r5, r1, r2, r6, r3)
            r1 = 3
            c6.w r2 = r4.f4875Z
            p270p6.C5369c.m11718f(r5, r1, r2, r6, r3)
            p270p6.C5369c.m11726n(r5, r0)
            return
    }
}
