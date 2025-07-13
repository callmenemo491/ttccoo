package p240nj;

/* renamed from: nj.h */
/* loaded from: classes.dex */
public class C4850h extends p124h7.AbstractC2947xb {
    public C4850h() {
            r1 = this;
            r0 = 2
            r1.<init>(r0)
            return
    }

    @Override // p124h7.AbstractC2947xb
    /* renamed from: c */
    public p240nj.AbstractC4848f mo7310c(p240nj.AbstractC4848f r11, java.math.BigInteger r12) {
            r10 = this;
            nj.c r0 = r11.f19286a
            java.math.BigInteger r1 = r0.f19251d
            if (r1 != 0) goto Ld
            int r1 = r0.mo10880m()
            int r1 = r1 + 1
            goto L11
        Ld:
            int r1 = r1.bitLength()
        L11:
            int r2 = r12.bitLength()
            if (r2 > r1) goto L59
            nj.i r11 = p240nj.C4852j.m10953a(r11)
            nj.e r2 = r11.f19296b
            int r3 = r11.f19297c
            int r1 = r1 + r3
            int r1 = r1 + (-1)
            int r1 = r1 / r3
            nj.f r0 = r0.mo10881n()
            int r3 = r3 * r1
            int[] r12 = p085f1.AbstractC1972m.m5014s(r3, r12)
            int r3 = r3 + (-1)
            r4 = 0
            r5 = 0
        L31:
            if (r5 >= r1) goto L52
            int r6 = r3 - r5
            r7 = 0
        L36:
            if (r6 < 0) goto L47
            int r8 = r6 >>> 5
            r8 = r12[r8]
            r9 = r6 & 31
            int r8 = r8 >>> r9
            int r9 = r8 >>> 1
            r7 = r7 ^ r9
            int r7 = r7 << 1
            r7 = r7 ^ r8
            int r6 = r6 - r1
            goto L36
        L47:
            nj.f r6 = r2.mo10889b(r7)
            nj.f r0 = r0.mo10944y(r6)
            int r5 = r5 + 1
            goto L31
        L52:
            nj.f r11 = r11.f19295a
            nj.f r11 = r0.mo10920a(r11)
            return r11
        L59:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "fixed-point comb doesn't support scalars larger than the curve order"
            r11.<init>(r12)
            throw r11
    }
}
