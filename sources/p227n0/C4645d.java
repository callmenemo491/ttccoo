package p227n0;

/* renamed from: n0.d */
/* loaded from: classes.dex */
public final class C4645d {

    /* renamed from: a */
    public final java.lang.Object f18551a;

    public C4645d(java.lang.Object r1) {
            r0 = this;
            r0.<init>()
            r0.f18551a = r1
            return
    }

    public boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L4
            r3 = 1
            return r3
        L4:
            if (r3 == 0) goto L1a
            java.lang.Class<n0.d> r0 = p227n0.C4645d.class
            java.lang.Class r1 = r3.getClass()
            if (r0 == r1) goto Lf
            goto L1a
        Lf:
            n0.d r3 = (p227n0.C4645d) r3
            java.lang.Object r0 = r2.f18551a
            java.lang.Object r3 = r3.f18551a
            boolean r3 = java.util.Objects.equals(r0, r3)
            return r3
        L1a:
            r3 = 0
            return r3
    }

    public int hashCode() {
            r1 = this;
            java.lang.Object r0 = r1.f18551a
            if (r0 != 0) goto L6
            r0 = 0
            goto La
        L6:
            int r0 = r0.hashCode()
        La:
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = "DisplayCutoutCompat{"
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.Object r1 = r2.f18551a
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
