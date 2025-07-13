package p212m0;

/* renamed from: m0.b */
/* loaded from: classes.dex */
public class C4312b<F, S> {

    /* renamed from: a */
    public final F f17582a;

    /* renamed from: b */
    public final S f17583b;

    public C4312b(F r1, S r2) {
            r0 = this;
            r0.<init>()
            r0.f17582a = r1
            r0.f17583b = r2
            return
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof p212m0.C4312b
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            m0.b r4 = (p212m0.C4312b) r4
            F r0 = r4.f17582a
            F r2 = r3.f17582a
            boolean r0 = java.util.Objects.equals(r0, r2)
            if (r0 == 0) goto L1d
            S r4 = r4.f17583b
            S r0 = r3.f17583b
            boolean r4 = java.util.Objects.equals(r4, r0)
            if (r4 == 0) goto L1d
            r1 = 1
        L1d:
            return r1
    }

    public int hashCode() {
            r3 = this;
            F r0 = r3.f17582a
            r1 = 0
            if (r0 != 0) goto L7
            r0 = 0
            goto Lb
        L7:
            int r0 = r0.hashCode()
        Lb:
            S r2 = r3.f17583b
            if (r2 != 0) goto L10
            goto L14
        L10:
            int r1 = r2.hashCode()
        L14:
            r0 = r0 ^ r1
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = "Pair{"
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            F r1 = r2.f17582a
            r0.append(r1)
            java.lang.String r1 = " "
            r0.append(r1)
            S r1 = r2.f17583b
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
