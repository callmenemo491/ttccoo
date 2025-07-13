package p236n9;

/* renamed from: n9.s */
/* loaded from: classes.dex */
public class C4718s extends p236n9.AbstractC4707h {
    public C4718s(byte[] r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @Override // p236n9.AbstractC4707h
    /* renamed from: d */
    public int[] mo10757d(int[] r12, int r13) {
            r11 = this;
            int r0 = r12.length
            r1 = 1
            r2 = 6
            r3 = 0
            if (r0 != r2) goto L57
            r0 = 16
            int[] r4 = new int[r0]
            int[] r5 = r11.f18812a
            int[] r0 = new int[r0]
            p236n9.AbstractC4707h.m10761k(r0, r5)
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
            p236n9.AbstractC4707h.m10762l(r0)
            r1 = r0[r6]
            r9 = 4
            r0[r9] = r1
            r1 = r0[r5]
            r10 = 5
            r0[r10] = r1
            r1 = r0[r7]
            r0[r2] = r1
            r1 = r0[r8]
            r2 = 7
            r0[r2] = r1
            r1 = 8
            int[] r0 = java.util.Arrays.copyOf(r0, r1)
            p236n9.AbstractC4707h.m10761k(r4, r0)
            r4[r6] = r13
            r4[r5] = r3
            r13 = r12[r9]
            r4[r7] = r13
            r12 = r12[r10]
            r4[r8] = r12
            return r4
        L57:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.Object[] r0 = new java.lang.Object[r1]
            int r12 = r12.length
            int r12 = r12 * 32
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r0[r3] = r12
            java.lang.String r12 = "XChaCha20 uses 192-bit nonces, but got a %d-bit nonce"
            java.lang.String r12 = java.lang.String.format(r12, r0)
            r13.<init>(r12)
            throw r13
    }

    @Override // p236n9.AbstractC4707h
    /* renamed from: g */
    public int mo10758g() {
            r1 = this;
            r0 = 24
            return r0
    }
}
