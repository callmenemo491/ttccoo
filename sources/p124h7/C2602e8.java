package p124h7;

/* renamed from: h7.e8 */
/* loaded from: classes.dex */
public final class C2602e8 extends p124h7.AbstractC2835r7 {
    public C2602e8(byte[] r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @Override // p124h7.AbstractC2835r7
    /* renamed from: b */
    public final int mo6645b() {
            r1 = this;
            r0 = 24
            return r0
    }

    @Override // p124h7.AbstractC2835r7
    /* renamed from: c */
    public final int[] mo6646c(int[] r12, int r13) {
            r11 = this;
            int r0 = r12.length
            r1 = 1
            r2 = 6
            r3 = 0
            if (r0 != r2) goto L57
            r0 = 16
            int[] r4 = new int[r0]
            int[] r5 = r11.f11876a
            int[] r0 = new int[r0]
            p124h7.AbstractC2835r7.m7080f(r0, r5)
            r5 = r12[r3]
            r6 = 12
            r0[r6] = r5
            r1 = r12[r1]
            r5 = 13
            r0[r5] = r1
            r1 = 2
            r1 = r12[r1]
            r7 = 14
            r0[r7] = r1
            r1 = 3
            r1 = r12[r1]
            r8 = 15
            r0[r8] = r1
            p124h7.AbstractC2835r7.m7081g(r0)
            r1 = r0[r6]
            r9 = 4
            r0[r9] = r1
            r1 = r0[r5]
            r10 = 5
            r0[r10] = r1
            r1 = r0[r7]
            r0[r2] = r1
            r1 = 7
            r2 = r0[r8]
            r0[r1] = r2
            r1 = 8
            int[] r0 = java.util.Arrays.copyOf(r0, r1)
            p124h7.AbstractC2835r7.m7080f(r4, r0)
            r4[r6] = r13
            r4[r5] = r3
            r13 = r12[r9]
            r4[r7] = r13
            r12 = r12[r10]
            r4[r8] = r12
            return r4
        L57:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.Object[] r13 = new java.lang.Object[r1]
            int r0 = r0 * 32
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r13[r3] = r0
            java.lang.String r0 = "XChaCha20 uses 192-bit nonces, but got a %d-bit nonce"
            java.lang.String r13 = java.lang.String.format(r0, r13)
            r12.<init>(r13)
            throw r12
    }
}
