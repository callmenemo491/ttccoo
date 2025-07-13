package p385w3;

/* renamed from: w3.e */
/* loaded from: classes.dex */
public final class C6783e {

    /* renamed from: a */
    public final p335t3.C6149b f26329a;

    /* renamed from: b */
    public final byte[] f26330b;

    public C6783e(p335t3.C6149b r2, byte[] r3) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "encoding is null"
            java.util.Objects.requireNonNull(r2, r0)
            java.lang.String r0 = "bytes is null"
            java.util.Objects.requireNonNull(r3, r0)
            r1.f26329a = r2
            r1.f26330b = r3
            return
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            if (r3 != r4) goto L4
            r4 = 1
            return r4
        L4:
            boolean r0 = r4 instanceof p385w3.C6783e
            r1 = 0
            if (r0 != 0) goto La
            return r1
        La:
            w3.e r4 = (p385w3.C6783e) r4
            t3.b r0 = r3.f26329a
            t3.b r2 = r4.f26329a
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L17
            return r1
        L17:
            byte[] r0 = r3.f26330b
            byte[] r4 = r4.f26330b
            boolean r4 = java.util.Arrays.equals(r0, r4)
            return r4
    }

    public int hashCode() {
            r2 = this;
            t3.b r0 = r2.f26329a
            int r0 = r0.hashCode()
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            int r0 = r0 * r1
            byte[] r1 = r2.f26330b
            int r1 = java.util.Arrays.hashCode(r1)
            r0 = r0 ^ r1
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = "EncodedPayload{encoding="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            t3.b r1 = r2.f26329a
            r0.append(r1)
            java.lang.String r1 = ", bytes=[...]}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
