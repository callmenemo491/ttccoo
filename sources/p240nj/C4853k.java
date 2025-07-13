package p240nj;

/* renamed from: nj.k */
/* loaded from: classes.dex */
public class C4853k extends p124h7.AbstractC2947xb {

    /* renamed from: Z */
    public final p240nj.AbstractC4845c f19300Z;

    /* renamed from: a0 */
    public final p318rj.InterfaceC5932a f19301a0;

    public C4853k(p240nj.AbstractC4845c r2, p318rj.InterfaceC5932a r3) {
            r1 = this;
            r0 = 2
            r1.<init>(r0)
            java.math.BigInteger r0 = r2.f19251d
            if (r0 == 0) goto Ld
            r1.f19300Z = r2
            r1.f19301a0 = r3
            return
        Ld:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Need curve with known group order"
            r2.<init>(r3)
            throw r2
    }

    @Override // p124h7.AbstractC2947xb
    /* renamed from: c */
    public p240nj.AbstractC4848f mo7310c(p240nj.AbstractC4848f r13, java.math.BigInteger r14) {
            r12 = this;
            nj.c r0 = r12.f19300Z
            nj.c r1 = r13.f19286a
            boolean r0 = r0.m10878k(r1)
            if (r0 == 0) goto La5
            nj.c r0 = r13.f19286a
            java.math.BigInteger r0 = r0.f19251d
            rj.a r1 = r12.f19301a0
            java.math.BigInteger r14 = r14.mod(r0)
            java.math.BigInteger[] r14 = r1.mo12297c(r14)
            r0 = 0
            r1 = r14[r0]
            r2 = 1
            r14 = r14[r2]
            rj.a r3 = r12.f19301a0
            h7.rb r3 = r3.mo12295a()
            rj.a r4 = r12.f19301a0
            boolean r4 = r4.mo12296b()
            if (r4 == 0) goto L98
            int r4 = r1.signum()
            if (r4 >= 0) goto L34
            r4 = 1
            goto L35
        L34:
            r4 = 0
        L35:
            int r5 = r14.signum()
            if (r5 >= 0) goto L3c
            r0 = 1
        L3c:
            java.math.BigInteger r1 = r1.abs()
            java.math.BigInteger r14 = r14.abs()
            r5 = 2
            r6 = 16
            int r7 = r1.bitLength()
            int r8 = r14.bitLength()
            int r7 = java.lang.Math.max(r7, r8)
            int r7 = p240nj.AbstractC4862t.m10985c(r7)
            int r6 = java.lang.Math.min(r6, r7)
            int r5 = java.lang.Math.max(r5, r6)
            nj.f r2 = p240nj.AbstractC4862t.m10986d(r13, r5, r2, r3)
            nj.s r13 = p240nj.AbstractC4862t.m10984b(r13)
            nj.s r2 = p240nj.AbstractC4862t.m10984b(r2)
            if (r4 == 0) goto L70
            nj.f[] r3 = r13.f19317b
            goto L72
        L70:
            nj.f[] r3 = r13.f19316a
        L72:
            r6 = r3
            if (r0 == 0) goto L78
            nj.f[] r3 = r2.f19317b
            goto L7a
        L78:
            nj.f[] r3 = r2.f19316a
        L7a:
            r9 = r3
            if (r4 == 0) goto L80
            nj.f[] r13 = r13.f19316a
            goto L82
        L80:
            nj.f[] r13 = r13.f19317b
        L82:
            r7 = r13
            if (r0 == 0) goto L88
            nj.f[] r13 = r2.f19316a
            goto L8a
        L88:
            nj.f[] r13 = r2.f19317b
        L8a:
            r10 = r13
            byte[] r8 = p240nj.AbstractC4862t.m10983a(r5, r1)
            byte[] r11 = p240nj.AbstractC4862t.m10983a(r5, r14)
            nj.f r13 = p240nj.C4843a.m10863c(r6, r7, r8, r9, r10, r11)
            return r13
        L98:
            java.lang.Object r0 = r3.f11884Z
            nj.d r0 = (p240nj.AbstractC4846d) r0
            nj.f r0 = r13.mo10938s(r0)
            nj.f r13 = p240nj.C4843a.m10862b(r13, r1, r0, r14)
            return r13
        La5:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            r13.<init>()
            throw r13
    }
}
