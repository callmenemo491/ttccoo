package sb;

/* renamed from: sb.l */
/* loaded from: classes.dex */
public final class C6018l extends sb.AbstractC6014h {

    /* renamed from: c */
    public final byte[] f23201c;

    /* renamed from: d */
    public final int f23202d;

    /* renamed from: e */
    public final int f23203e;

    public C6018l(byte[] r3, int r4, int r5, int r6, int r7, int r8, int r9, boolean r10) {
            r2 = this;
            r2.<init>(r8, r9)
            int r0 = r6 + r8
            if (r0 > r4) goto L37
            int r0 = r7 + r9
            if (r0 > r5) goto L37
            r2.f23201c = r3
            r2.f23202d = r4
            r2.f23203e = r5
            if (r10 == 0) goto L36
            int r7 = r7 * r4
            int r7 = r7 + r6
            r4 = 0
        L17:
            if (r4 >= r9) goto L36
            int r5 = r8 / 2
            int r5 = r5 + r7
            int r6 = r7 + r8
            int r6 = r6 + (-1)
            r10 = r7
        L21:
            if (r10 >= r5) goto L30
            r0 = r3[r10]
            r1 = r3[r6]
            r3[r10] = r1
            r3[r6] = r0
            int r10 = r10 + 1
            int r6 = r6 + (-1)
            goto L21
        L30:
            int r4 = r4 + 1
            int r5 = r2.f23202d
            int r7 = r7 + r5
            goto L17
        L36:
            return
        L37:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "Crop rectangle does not fit within image data."
            r3.<init>(r4)
            throw r3
    }

    @Override // sb.AbstractC6014h
    /* renamed from: a */
    public byte[] mo12492a() {
            r7 = this;
            int r0 = r7.f23196a
            int r1 = r7.f23197b
            int r2 = r7.f23202d
            if (r0 != r2) goto Lf
            int r3 = r7.f23203e
            if (r1 != r3) goto Lf
            byte[] r0 = r7.f23201c
            return r0
        Lf:
            int r3 = r0 * r1
            byte[] r4 = new byte[r3]
            r5 = 0
            int r6 = r5 * r2
            int r6 = r6 + r5
            if (r0 != r2) goto L1f
            byte[] r0 = r7.f23201c
            java.lang.System.arraycopy(r0, r6, r4, r5, r3)
            return r4
        L1f:
            if (r5 >= r1) goto L2e
            int r2 = r5 * r0
            byte[] r3 = r7.f23201c
            java.lang.System.arraycopy(r3, r6, r4, r2, r0)
            int r2 = r7.f23202d
            int r6 = r6 + r2
            int r5 = r5 + 1
            goto L1f
        L2e:
            return r4
    }

    @Override // sb.AbstractC6014h
    /* renamed from: b */
    public byte[] mo12493b(int r4, byte[] r5) {
            r3 = this;
            if (r4 < 0) goto L1c
            int r0 = r3.f23197b
            if (r4 >= r0) goto L1c
            int r0 = r3.f23196a
            if (r5 == 0) goto Ld
            int r1 = r5.length
            if (r1 >= r0) goto Lf
        Ld:
            byte[] r5 = new byte[r0]
        Lf:
            r1 = 0
            int r4 = r4 + r1
            int r2 = r3.f23202d
            int r4 = r4 * r2
            int r4 = r4 + r1
            byte[] r2 = r3.f23201c
            java.lang.System.arraycopy(r2, r4, r5, r1, r0)
            return r5
        L1c:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Requested row is outside the image: "
            java.lang.String r4 = p422y.C7094d.m14209a(r0, r4)
            r5.<init>(r4)
            throw r5
    }
}
