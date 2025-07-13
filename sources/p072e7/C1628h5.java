package p072e7;

/* renamed from: e7.h5 */
/* loaded from: classes.dex */
public class C1628h5 extends p072e7.AbstractC1638i5 {

    /* renamed from: a0 */
    public final byte[] f7581a0;

    public C1628h5(byte[] r1) {
            r0 = this;
            r0.<init>()
            java.util.Objects.requireNonNull(r1)
            r0.f7581a0 = r1
            return
    }

    @Override // p072e7.AbstractC1638i5
    /* renamed from: a */
    public byte mo4193a(int r2) {
            r1 = this;
            byte[] r0 = r1.f7581a0
            r2 = r0[r2]
            return r2
    }

    @Override // p072e7.AbstractC1638i5
    /* renamed from: e */
    public byte mo4194e(int r2) {
            r1 = this;
            byte[] r0 = r1.f7581a0
            r2 = r0[r2]
            return r2
    }

    @Override // p072e7.AbstractC1638i5
    public final boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof p072e7.AbstractC1638i5
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            int r1 = r7.mo4195h()
            r3 = r8
            e7.i5 r3 = (p072e7.AbstractC1638i5) r3
            int r3 = r3.mo4195h()
            if (r1 == r3) goto L18
            return r2
        L18:
            int r1 = r7.mo4195h()
            if (r1 != 0) goto L1f
            return r0
        L1f:
            boolean r1 = r8 instanceof p072e7.C1628h5
            if (r1 == 0) goto L8e
            e7.h5 r8 = (p072e7.C1628h5) r8
            int r1 = r7.f7636Y
            int r3 = r8.f7636Y
            if (r1 == 0) goto L31
            if (r3 == 0) goto L31
            if (r1 != r3) goto L30
            goto L31
        L30:
            return r2
        L31:
            int r1 = r7.mo4195h()
            int r2 = r8.mo4195h()
            if (r1 > r2) goto L6e
            int r2 = r8.mo4195h()
            if (r1 > r2) goto L5a
            byte[] r2 = r7.f7581a0
            byte[] r3 = r8.f7581a0
            r8.mo4196u()
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
            int r8 = r8.mo4195h()
            r2 = 59
            java.lang.String r3 = "Ran off end of other: 0, "
            java.lang.String r4 = ", "
            java.lang.String r8 = p304r4.C5785f.m12134a(r2, r3, r1, r4, r8)
            r0.<init>(r8)
            throw r0
        L6e:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            int r0 = r7.mo4195h()
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

    @Override // p072e7.AbstractC1638i5
    /* renamed from: h */
    public int mo4195h() {
            r1 = this;
            byte[] r0 = r1.f7581a0
            int r0 = r0.length
            return r0
    }

    @Override // p072e7.AbstractC1638i5
    /* renamed from: i */
    public final int mo4219i(int r3, int r4, int r5) {
            r2 = this;
            byte[] r4 = r2.f7581a0
            java.nio.charset.Charset r0 = p072e7.C1619g6.f7568a
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

    @Override // p072e7.AbstractC1638i5
    /* renamed from: l */
    public final p072e7.AbstractC1638i5 mo4220l(int r2, int r3) {
            r1 = this;
            int r2 = r1.mo4195h()
            r0 = 0
            p072e7.AbstractC1638i5.m4232q(r0, r3, r2)
            if (r3 != 0) goto Ld
            e7.i5 r2 = p072e7.AbstractC1638i5.f7635Z
            return r2
        Ld:
            e7.f5 r2 = new e7.f5
            byte[] r0 = r1.f7581a0
            r2.<init>(r0, r3)
            return r2
    }

    @Override // p072e7.AbstractC1638i5
    /* renamed from: m */
    public final java.lang.String mo4221m(java.nio.charset.Charset r5) {
            r4 = this;
            java.lang.String r0 = new java.lang.String
            byte[] r1 = r4.f7581a0
            int r2 = r4.mo4195h()
            r3 = 0
            r0.<init>(r1, r3, r2, r5)
            return r0
    }

    @Override // p072e7.AbstractC1638i5
    /* renamed from: n */
    public final void mo4222n(p367v1.C6488b r4) {
            r3 = this;
            byte[] r0 = r3.f7581a0
            int r1 = r3.mo4195h()
            e7.j5 r4 = (p072e7.C1648j5) r4
            r2 = 0
            r4.m4277L(r0, r2, r1)
            return
    }

    @Override // p072e7.AbstractC1638i5
    /* renamed from: p */
    public final boolean mo4223p() {
            r4 = this;
            byte[] r0 = r4.f7581a0
            int r1 = r4.mo4195h()
            e7.k8 r2 = p072e7.C1681m8.f7692a
            r3 = 0
            boolean r0 = r2.m4320a(r0, r3, r1)
            return r0
    }

    /* renamed from: u */
    public int mo4196u() {
            r1 = this;
            r0 = 0
            return r0
    }
}
