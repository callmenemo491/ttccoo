package p240nj;

/* renamed from: nj.a */
/* loaded from: classes.dex */
public class C4843a {
    /* renamed from: a */
    public static p240nj.AbstractC4848f m10861a(p240nj.AbstractC4848f r1) {
            r0 = 0
            boolean r0 = r1.m10929j(r0, r0)
            if (r0 == 0) goto L8
            return r1
        L8:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "Invalid result"
            r1.<init>(r0)
            throw r1
    }

    /* renamed from: b */
    public static p240nj.AbstractC4848f m10862b(p240nj.AbstractC4848f r11, java.math.BigInteger r12, p240nj.AbstractC4848f r13, java.math.BigInteger r14) {
            int r0 = r12.signum()
            r1 = 0
            r2 = 1
            if (r0 >= 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            int r3 = r14.signum()
            if (r3 >= 0) goto L12
            r1 = 1
        L12:
            java.math.BigInteger r12 = r12.abs()
            java.math.BigInteger r14 = r14.abs()
            int r3 = r12.bitLength()
            int r3 = p240nj.AbstractC4862t.m10985c(r3)
            r4 = 16
            int r3 = java.lang.Math.min(r4, r3)
            r5 = 2
            int r3 = java.lang.Math.max(r5, r3)
            int r6 = r14.bitLength()
            int r6 = p240nj.AbstractC4862t.m10985c(r6)
            int r4 = java.lang.Math.min(r4, r6)
            int r4 = java.lang.Math.max(r5, r4)
            nj.s r11 = p240nj.AbstractC4862t.m10987e(r11, r3, r2)
            nj.s r13 = p240nj.AbstractC4862t.m10987e(r13, r4, r2)
            if (r0 == 0) goto L4a
            nj.f[] r2 = r11.f19317b
            goto L4c
        L4a:
            nj.f[] r2 = r11.f19316a
        L4c:
            r5 = r2
            if (r1 == 0) goto L52
            nj.f[] r2 = r13.f19317b
            goto L54
        L52:
            nj.f[] r2 = r13.f19316a
        L54:
            r8 = r2
            if (r0 == 0) goto L5a
            nj.f[] r11 = r11.f19316a
            goto L5c
        L5a:
            nj.f[] r11 = r11.f19317b
        L5c:
            r6 = r11
            if (r1 == 0) goto L62
            nj.f[] r11 = r13.f19316a
            goto L64
        L62:
            nj.f[] r11 = r13.f19317b
        L64:
            r9 = r11
            byte[] r7 = p240nj.AbstractC4862t.m10983a(r3, r12)
            byte[] r10 = p240nj.AbstractC4862t.m10983a(r4, r14)
            nj.f r11 = m10863c(r5, r6, r7, r8, r9, r10)
            return r11
    }

    /* renamed from: c */
    public static p240nj.AbstractC4848f m10863c(p240nj.AbstractC4848f[] r8, p240nj.AbstractC4848f[] r9, byte[] r10, p240nj.AbstractC4848f[] r11, p240nj.AbstractC4848f[] r12, byte[] r13) {
            int r0 = r10.length
            int r1 = r13.length
            int r0 = java.lang.Math.max(r0, r1)
            r1 = 0
            r2 = r8[r1]
            nj.c r2 = r2.f19286a
            nj.f r2 = r2.mo10881n()
            int r0 = r0 + (-1)
            r4 = r2
            r3 = 0
        L13:
            if (r0 < 0) goto L60
            int r5 = r10.length
            if (r0 >= r5) goto L1b
            r5 = r10[r0]
            goto L1c
        L1b:
            r5 = 0
        L1c:
            int r6 = r13.length
            if (r0 >= r6) goto L22
            r6 = r13[r0]
            goto L23
        L22:
            r6 = 0
        L23:
            r7 = r5 | r6
            if (r7 != 0) goto L2a
            int r3 = r3 + 1
            goto L5d
        L2a:
            if (r5 == 0) goto L3e
            int r7 = java.lang.Math.abs(r5)
            if (r5 >= 0) goto L34
            r5 = r9
            goto L35
        L34:
            r5 = r8
        L35:
            int r7 = r7 >>> 1
            r5 = r5[r7]
            nj.f r5 = r2.mo10920a(r5)
            goto L3f
        L3e:
            r5 = r2
        L3f:
            if (r6 == 0) goto L52
            int r7 = java.lang.Math.abs(r6)
            if (r6 >= 0) goto L49
            r6 = r12
            goto L4a
        L49:
            r6 = r11
        L4a:
            int r7 = r7 >>> 1
            r6 = r6[r7]
            nj.f r5 = r5.mo10920a(r6)
        L52:
            if (r3 <= 0) goto L59
            nj.f r4 = r4.mo10942w(r3)
            r3 = 0
        L59:
            nj.f r4 = r4.mo10944y(r5)
        L5d:
            int r0 = r0 + (-1)
            goto L13
        L60:
            if (r3 <= 0) goto L66
            nj.f r4 = r4.mo10942w(r3)
        L66:
            return r4
    }

    /* renamed from: d */
    public static p240nj.AbstractC4848f m10864d(boolean[] r13, p240nj.C4861s[] r14, byte[][] r15) {
            int r0 = r15.length
            r1 = 0
            r2 = 0
            r3 = 0
        L4:
            if (r2 >= r0) goto L10
            r4 = r15[r2]
            int r4 = r4.length
            int r3 = java.lang.Math.max(r3, r4)
            int r2 = r2 + 1
            goto L4
        L10:
            r2 = r14[r1]
            nj.f[] r2 = r2.f19316a
            r2 = r2[r1]
            nj.c r2 = r2.f19286a
            nj.f r2 = r2.mo10881n()
            r4 = 1
            int r3 = r3 - r4
            r6 = r2
            r5 = 0
        L20:
            if (r3 < 0) goto L62
            r8 = r2
            r7 = 0
        L24:
            if (r7 >= r0) goto L4f
            r9 = r15[r7]
            int r10 = r9.length
            if (r3 >= r10) goto L2e
            r9 = r9[r3]
            goto L2f
        L2e:
            r9 = 0
        L2f:
            if (r9 == 0) goto L4c
            int r10 = java.lang.Math.abs(r9)
            r11 = r14[r7]
            if (r9 >= 0) goto L3b
            r9 = 1
            goto L3c
        L3b:
            r9 = 0
        L3c:
            boolean r12 = r13[r7]
            if (r9 != r12) goto L43
            nj.f[] r9 = r11.f19316a
            goto L45
        L43:
            nj.f[] r9 = r11.f19317b
        L45:
            int r10 = r10 >>> r4
            r9 = r9[r10]
            nj.f r8 = r8.mo10920a(r9)
        L4c:
            int r7 = r7 + 1
            goto L24
        L4f:
            if (r8 != r2) goto L54
            int r5 = r5 + 1
            goto L5f
        L54:
            if (r5 <= 0) goto L5b
            nj.f r6 = r6.mo10942w(r5)
            r5 = 0
        L5b:
            nj.f r6 = r6.mo10944y(r8)
        L5f:
            int r3 = r3 + (-1)
            goto L20
        L62:
            if (r5 <= 0) goto L68
            nj.f r6 = r6.mo10942w(r5)
        L68:
            return r6
    }

    /* renamed from: e */
    public static p240nj.AbstractC4848f m10865e(p240nj.AbstractC4845c r1, p240nj.AbstractC4848f r2) {
            nj.c r0 = r2.f19286a
            boolean r0 = r1.m10878k(r0)
            if (r0 == 0) goto Ld
            nj.f r1 = r1.mo10882o(r2)
            return r1
        Ld:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Point must be on the same curve"
            r1.<init>(r2)
            throw r1
    }

    /* renamed from: f */
    public static boolean m10866f(p240nj.AbstractC4845c r3) {
            sj.a r3 = r3.f19248a
            int r0 = r3.mo12527b()
            r1 = 1
            if (r0 <= r1) goto L1a
            java.math.BigInteger r0 = r3.mo12528c()
            java.math.BigInteger r2 = p240nj.InterfaceC4844b.f19245T
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L1a
            boolean r3 = r3 instanceof sj.InterfaceC6084e
            if (r3 == 0) goto L1a
            goto L1b
        L1a:
            r1 = 0
        L1b:
            return r1
    }

    /* renamed from: g */
    public static boolean m10867g(p240nj.AbstractC4845c r1) {
            sj.a r1 = r1.f19248a
            int r1 = r1.mo12527b()
            r0 = 1
            if (r1 != r0) goto La
            goto Lb
        La:
            r0 = 0
        Lb:
            return r0
    }
}
