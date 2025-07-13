package p072e7;

/* renamed from: e7.f5 */
/* loaded from: classes.dex */
public final class C1608f5 extends p072e7.C1628h5 {

    /* renamed from: b0 */
    public final int f7556b0;

    public C1608f5(byte[] r2, int r3) {
            r1 = this;
            r1.<init>(r2)
            int r2 = r2.length
            r0 = 0
            p072e7.AbstractC1638i5.m4232q(r0, r3, r2)
            r1.f7556b0 = r3
            return
    }

    @Override // p072e7.C1628h5, p072e7.AbstractC1638i5
    /* renamed from: a */
    public final byte mo4193a(int r6) {
            r5 = this;
            int r0 = r5.f7556b0
            int r1 = r6 + 1
            int r1 = r0 - r1
            r1 = r1 | r6
            if (r1 >= 0) goto L29
            if (r6 >= 0) goto L19
            java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
            r1 = 22
            java.lang.String r2 = "Index < 0: "
            java.lang.String r6 = p064e.C1490d.m4039a(r1, r2, r6)
            r0.<init>(r6)
            throw r0
        L19:
            java.lang.ArrayIndexOutOfBoundsException r1 = new java.lang.ArrayIndexOutOfBoundsException
            r2 = 40
            java.lang.String r3 = "Index > length: "
            java.lang.String r4 = ", "
            java.lang.String r6 = p304r4.C5785f.m12134a(r2, r3, r6, r4, r0)
            r1.<init>(r6)
            throw r1
        L29:
            byte[] r0 = r5.f7581a0
            r6 = r0[r6]
            return r6
    }

    @Override // p072e7.C1628h5, p072e7.AbstractC1638i5
    /* renamed from: e */
    public final byte mo4194e(int r2) {
            r1 = this;
            byte[] r0 = r1.f7581a0
            r2 = r0[r2]
            return r2
    }

    @Override // p072e7.C1628h5, p072e7.AbstractC1638i5
    /* renamed from: h */
    public final int mo4195h() {
            r1 = this;
            int r0 = r1.f7556b0
            return r0
    }

    @Override // p072e7.C1628h5
    /* renamed from: u */
    public final int mo4196u() {
            r1 = this;
            r0 = 0
            return r0
    }
}
