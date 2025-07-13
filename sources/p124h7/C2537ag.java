package p124h7;

/* renamed from: h7.ag */
/* loaded from: classes.dex */
public final class C2537ag extends p124h7.C2556bg {

    /* renamed from: b0 */
    public final int f11389b0;

    public C2537ag(byte[] r2, int r3) {
            r1 = this;
            r1.<init>(r2)
            int r2 = r2.length
            r0 = 0
            p124h7.AbstractC2574cg.m6535w(r0, r3, r2)
            r1.f11389b0 = r3
            return
    }

    @Override // p124h7.C2556bg
    /* renamed from: D */
    public final int mo6471D() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // p124h7.C2556bg, p124h7.AbstractC2574cg
    /* renamed from: a */
    public final byte mo6472a(int r6) {
            r5 = this;
            int r0 = r5.f11389b0
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
            byte[] r0 = r5.f11413a0
            r6 = r0[r6]
            return r6
    }

    @Override // p124h7.C2556bg, p124h7.AbstractC2574cg
    /* renamed from: e */
    public final byte mo6473e(int r2) {
            r1 = this;
            byte[] r0 = r1.f11413a0
            r2 = r0[r2]
            return r2
    }

    @Override // p124h7.C2556bg, p124h7.AbstractC2574cg
    /* renamed from: h */
    public final int mo6474h() {
            r1 = this;
            int r0 = r1.f11389b0
            return r0
    }

    @Override // p124h7.C2556bg, p124h7.AbstractC2574cg
    /* renamed from: i */
    public final void mo6475i(byte[] r1, int r2, int r3, int r4) {
            r0 = this;
            byte[] r2 = r0.f11413a0
            r3 = 0
            java.lang.System.arraycopy(r2, r3, r1, r3, r4)
            return
    }
}
