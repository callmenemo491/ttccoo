package p124h7;

/* renamed from: h7.q7 */
/* loaded from: classes.dex */
public final class C2817q7 extends p124h7.AbstractC2835r7 {
    public C2817q7(byte[] r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @Override // p124h7.AbstractC2835r7
    /* renamed from: b */
    public final int mo6645b() {
            r1 = this;
            r0 = 12
            return r0
    }

    @Override // p124h7.AbstractC2835r7
    /* renamed from: c */
    public final int[] mo6646c(int[] r5, int r6) {
            r4 = this;
            int r0 = r5.length
            r1 = 0
            r2 = 3
            if (r0 != r2) goto L18
            r0 = 16
            int[] r0 = new int[r0]
            int[] r3 = r4.f11876a
            p124h7.AbstractC2835r7.m7080f(r0, r3)
            r3 = 12
            r0[r3] = r6
            r6 = 13
            java.lang.System.arraycopy(r5, r1, r0, r6, r2)
            return r0
        L18:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            r6 = 1
            java.lang.Object[] r6 = new java.lang.Object[r6]
            int r0 = r0 * 32
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6[r1] = r0
            java.lang.String r0 = "ChaCha20 uses 96-bit nonces, but got a %d-bit nonce"
            java.lang.String r6 = java.lang.String.format(r0, r6)
            r5.<init>(r6)
            throw r5
    }
}
