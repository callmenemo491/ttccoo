package p124h7;

/* renamed from: h7.bg */
/* loaded from: classes.dex */
public class C2556bg extends p124h7.AbstractC2574cg {

    /* renamed from: a0 */
    public final byte[] f11413a0;

    public C2556bg(byte[] r1) {
            r0 = this;
            r0.<init>()
            java.util.Objects.requireNonNull(r1)
            r0.f11413a0 = r1
            return
    }

    /* renamed from: D */
    public int mo6471D() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // p124h7.AbstractC2574cg
    /* renamed from: a */
    public byte mo6472a(int r2) {
            r1 = this;
            byte[] r0 = r1.f11413a0
            r2 = r0[r2]
            return r2
    }

    @Override // p124h7.AbstractC2574cg
    /* renamed from: e */
    public byte mo6473e(int r2) {
            r1 = this;
            byte[] r0 = r1.f11413a0
            r2 = r0[r2]
            return r2
    }

    @Override // p124h7.AbstractC2574cg
    public final boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof p124h7.AbstractC2574cg
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            int r1 = r7.mo6474h()
            r3 = r8
            h7.cg r3 = (p124h7.AbstractC2574cg) r3
            int r3 = r3.mo6474h()
            if (r1 == r3) goto L18
            return r2
        L18:
            int r1 = r7.mo6474h()
            if (r1 != 0) goto L1f
            return r0
        L1f:
            boolean r1 = r8 instanceof p124h7.C2556bg
            if (r1 == 0) goto L8e
            h7.bg r8 = (p124h7.C2556bg) r8
            int r1 = r7.f11428Y
            int r3 = r8.f11428Y
            if (r1 == 0) goto L31
            if (r3 == 0) goto L31
            if (r1 != r3) goto L30
            goto L31
        L30:
            return r2
        L31:
            int r1 = r7.mo6474h()
            int r2 = r8.mo6474h()
            if (r1 > r2) goto L6e
            int r2 = r8.mo6474h()
            if (r1 > r2) goto L5a
            byte[] r2 = r7.f11413a0
            byte[] r3 = r8.f11413a0
            r8.mo6471D()
            r8 = 0
            r4 = 0
        L4a:
            if (r8 >= r1) goto L59
            r5 = r2[r8]
            r6 = r3[r4]
            if (r5 == r6) goto L54
            r0 = 0
            goto L59
        L54:
            int r8 = r8 + 1
            int r4 = r4 + 1
            goto L4a
        L59:
            return r0
        L5a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            int r8 = r8.mo6474h()
            r2 = 59
            java.lang.String r3 = "Ran off end of other: 0, "
            java.lang.String r4 = ", "
            java.lang.String r8 = p304r4.C5785f.m12134a(r2, r3, r1, r4, r8)
            r0.<init>(r8)
            throw r0
        L6e:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            int r0 = r7.mo6474h()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = 40
            r2.<init>(r3)
            java.lang.String r3 = "Length too large: "
            r2.append(r3)
            r2.append(r1)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r8.<init>(r0)
            throw r8
        L8e:
            boolean r8 = r8.equals(r7)
            return r8
    }

    @Override // p124h7.AbstractC2574cg
    /* renamed from: h */
    public int mo6474h() {
            r1 = this;
            byte[] r0 = r1.f11413a0
            int r0 = r0.length
            return r0
    }

    @Override // p124h7.AbstractC2574cg
    /* renamed from: i */
    public void mo6475i(byte[] r1, int r2, int r3, int r4) {
            r0 = this;
            byte[] r2 = r0.f11413a0
            r3 = 0
            java.lang.System.arraycopy(r2, r3, r1, r3, r4)
            return
    }

    @Override // p124h7.AbstractC2574cg
    /* renamed from: l */
    public final int mo6513l(int r3, int r4, int r5) {
            r2 = this;
            byte[] r4 = r2.f11413a0
            java.nio.charset.Charset r0 = p124h7.C2575d.f11429a
            r0 = 0
        L5:
            if (r0 >= r5) goto Lf
            int r3 = r3 * 31
            r1 = r4[r0]
            int r3 = r3 + r1
            int r0 = r0 + 1
            goto L5
        Lf:
            return r3
    }

    @Override // p124h7.AbstractC2574cg
    /* renamed from: m */
    public final p124h7.AbstractC2574cg mo6514m(int r2, int r3) {
            r1 = this;
            int r2 = r1.mo6474h()
            r0 = 0
            int r2 = p124h7.AbstractC2574cg.m6535w(r0, r3, r2)
            if (r2 != 0) goto Le
            h7.cg r2 = p124h7.AbstractC2574cg.f11427Z
            return r2
        Le:
            h7.ag r3 = new h7.ag
            byte[] r0 = r1.f11413a0
            r3.<init>(r0, r2)
            return r3
    }

    @Override // p124h7.AbstractC2574cg
    /* renamed from: n */
    public final p124h7.C2592dg mo6515n() {
            r3 = this;
            byte[] r0 = r3.f11413a0
            int r1 = r3.mo6474h()
            h7.dg r2 = new h7.dg
            r2.<init>(r0, r1)
            r2.m6621b(r1)     // Catch: p124h7.C2611f -> Lf
            return r2
        Lf:
            r0 = move-exception
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r0)
            throw r1
    }

    @Override // p124h7.AbstractC2574cg
    /* renamed from: p */
    public final java.lang.String mo6516p(java.nio.charset.Charset r5) {
            r4 = this;
            java.lang.String r0 = new java.lang.String
            byte[] r1 = r4.f11413a0
            int r2 = r4.mo6474h()
            r3 = 0
            r0.<init>(r1, r3, r2, r5)
            return r0
    }

    @Override // p124h7.AbstractC2574cg
    /* renamed from: q */
    public final void mo6517q(p124h7.AbstractC2951xf r4) {
            r3 = this;
            byte[] r0 = r3.f11413a0
            int r1 = r3.mo6474h()
            r2 = 0
            r4.mo6723d(r0, r2, r1)
            return
    }

    @Override // p124h7.AbstractC2574cg
    /* renamed from: u */
    public final boolean mo6518u() {
            r3 = this;
            byte[] r0 = r3.f11413a0
            int r1 = r3.mo6474h()
            r2 = 0
            boolean r0 = p124h7.C2631g1.m6746e(r0, r2, r1)
            return r0
    }
}
