package p124h7;

/* renamed from: h7.xc */
/* loaded from: classes.dex */
public final class C2948xc extends p124h7.AbstractC2641gb {

    /* renamed from: Z */
    public final java.lang.String f12022Z;

    public /* synthetic */ C2948xc(java.lang.String r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "A valid API key must be provided"
            com.google.android.gms.common.internal.C1101a.m3101f(r2, r0)
            r1.f12022Z = r2
            return
    }

    public final java.lang.Object clone() {
            r2 = this;
            java.lang.String r0 = r2.f12022Z
            com.google.android.gms.common.internal.C1101a.m3100e(r0)
            h7.xc r1 = new h7.xc
            r1.<init>(r0)
            return r1
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p124h7.C2948xc
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            h7.xc r5 = (p124h7.C2948xc) r5
            java.lang.String r1 = r4.f12022Z
            java.lang.String r3 = r5.f12022Z
            boolean r1 = p248o6.C4924o.m11074a(r1, r3)
            if (r1 == 0) goto L1d
            boolean r1 = r4.f11542Y
            boolean r5 = r5.f11542Y
            if (r1 != r5) goto L1d
            return r0
        L1d:
            return r2
    }

    public final int hashCode() {
            r4 = this;
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.String r2 = r4.f12022Z
            r3 = 0
            r1[r3] = r2
            int r1 = java.util.Arrays.hashCode(r1)
            boolean r2 = r4.f11542Y
            r0 = r0 ^ r2
            int r1 = r1 + r0
            return r1
    }
}
