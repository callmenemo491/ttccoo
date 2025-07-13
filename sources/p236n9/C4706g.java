package p236n9;

/* renamed from: n9.g */
/* loaded from: classes.dex */
public class C4706g extends p236n9.AbstractC4707h {
    public C4706g(byte[] r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @Override // p236n9.AbstractC4707h
    /* renamed from: d */
    public int[] mo10757d(int[] r4, int r5) {
            r3 = this;
            int r0 = r4.length
            r1 = 0
            r2 = 3
            if (r0 != r2) goto L19
            r0 = 16
            int[] r0 = new int[r0]
            int[] r2 = r3.f18812a
            p236n9.AbstractC4707h.m10761k(r0, r2)
            r2 = 12
            r0[r2] = r5
            r5 = 13
            int r2 = r4.length
            java.lang.System.arraycopy(r4, r1, r0, r5, r2)
            return r0
        L19:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            int r4 = r4.length
            int r4 = r4 * 32
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r0[r1] = r4
            java.lang.String r4 = "ChaCha20 uses 96-bit nonces, but got a %d-bit nonce"
            java.lang.String r4 = java.lang.String.format(r4, r0)
            r5.<init>(r4)
            throw r5
    }

    @Override // p236n9.AbstractC4707h
    /* renamed from: g */
    public int mo10758g() {
            r1 = this;
            r0 = 12
            return r0
    }
}
