package p401x;

/* renamed from: x.h */
/* loaded from: classes.dex */
public class C6900h {

    /* renamed from: a */
    public static p401x.C6894b.a f26841a;

    static {
            x.b$a r0 = new x.b$a
            r0.<init>()
            p401x.C6900h.f26841a = r0
            return
    }

    /* renamed from: a */
    public static boolean m13981a(p381w.C6765f r8) {
            w.f$a r0 = p381w.C6765f.a.f26191a0
            w.f$a r1 = p381w.C6765f.a.f26190Z
            w.f$a r2 = p381w.C6765f.a.f26189Y
            w.f$a r3 = r8.m13716p()
            w.f$a r4 = r8.m13720t()
            w.f r5 = r8.f26128R
            if (r5 == 0) goto L15
            w.g r5 = (p381w.C6766g) r5
            goto L16
        L15:
            r5 = 0
        L16:
            if (r5 == 0) goto L1c
            w.f$a r6 = r5.m13716p()
        L1c:
            if (r5 == 0) goto L22
            w.f$a r5 = r5.m13720t()
        L22:
            r5 = 0
            r6 = 0
            r7 = 1
            if (r3 == r2) goto L44
            if (r3 == r1) goto L44
            if (r3 != r0) goto L3b
            int r3 = r8.f26159l
            if (r3 != 0) goto L3b
            float r3 = r8.f26131U
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 != 0) goto L3b
            boolean r3 = r8.m13724x(r6)
            if (r3 != 0) goto L44
        L3b:
            boolean r3 = r8.mo13670C()
            if (r3 == 0) goto L42
            goto L44
        L42:
            r3 = 0
            goto L45
        L44:
            r3 = 1
        L45:
            if (r4 == r2) goto L64
            if (r4 == r1) goto L64
            if (r4 != r0) goto L5b
            int r0 = r8.f26161m
            if (r0 != 0) goto L5b
            float r0 = r8.f26131U
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 != 0) goto L5b
            boolean r0 = r8.m13724x(r7)
            if (r0 != 0) goto L64
        L5b:
            boolean r0 = r8.mo13671D()
            if (r0 == 0) goto L62
            goto L64
        L62:
            r0 = 0
            goto L65
        L64:
            r0 = 1
        L65:
            float r8 = r8.f26131U
            int r8 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r8 <= 0) goto L70
            if (r3 != 0) goto L6f
            if (r0 == 0) goto L70
        L6f:
            return r7
        L70:
            if (r3 == 0) goto L75
            if (r0 == 0) goto L75
            r6 = 1
        L75:
            return r6
    }

    /* renamed from: b */
    public static void m13982b(p381w.C6765f r16, p401x.C6894b.b r17, boolean r18) {
            r0 = r16
            r1 = r17
            r2 = r18
            w.f$a r3 = p381w.C6765f.a.f26191a0
            boolean r4 = r0 instanceof p381w.C6766g
            r5 = 0
            if (r4 != 0) goto L21
            boolean r4 = r16.m13692B()
            if (r4 == 0) goto L21
            boolean r4 = m13981a(r16)
            if (r4 == 0) goto L21
            x.b$a r4 = new x.b$a
            r4.<init>()
            p381w.C6766g.m13727a0(r0, r1, r4, r5)
        L21:
            w.d$a r4 = p381w.C6763d.a.f26095Y
            w.d r4 = r0.mo13712l(r4)
            w.d$a r6 = p381w.C6763d.a.f26097a0
            w.d r6 = r0.mo13712l(r6)
            int r7 = r4.m13680c()
            int r8 = r6.m13680c()
            java.util.HashSet<w.d> r9 = r4.f26086a
            r10 = 0
            r11 = 8
            if (r9 == 0) goto L10f
            boolean r4 = r4.f26088c
            if (r4 == 0) goto L10f
            java.util.Iterator r4 = r9.iterator()
        L44:
            boolean r9 = r4.hasNext()
            if (r9 == 0) goto L10f
            java.lang.Object r9 = r4.next()
            w.d r9 = (p381w.C6763d) r9
            w.f r13 = r9.f26089d
            boolean r14 = m13981a(r13)
            boolean r15 = r13.m13692B()
            if (r15 == 0) goto L66
            if (r14 == 0) goto L66
            x.b$a r15 = new x.b$a
            r15.<init>()
            p381w.C6766g.m13727a0(r13, r1, r15, r5)
        L66:
            w.f$a r15 = r13.m13716p()
            if (r15 != r3) goto Lbe
            if (r14 == 0) goto L6f
            goto Lbe
        L6f:
            w.f$a r14 = r13.m13716p()
            if (r14 != r3) goto L44
            int r14 = r13.f26167p
            if (r14 < 0) goto L44
            int r14 = r13.f26165o
            if (r14 < 0) goto L44
            int r14 = r13.f26156j0
            if (r14 == r11) goto L8b
            int r14 = r13.f26159l
            if (r14 != 0) goto L44
            float r14 = r13.f26131U
            int r14 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
            if (r14 != 0) goto L44
        L8b:
            boolean r14 = r13.m13726z()
            if (r14 != 0) goto L44
            boolean r14 = r13.f26108C
            if (r14 != 0) goto L44
            w.d r14 = r13.f26114F
            if (r9 != r14) goto La3
            w.d r15 = r13.f26118H
            w.d r15 = r15.f26091f
            if (r15 == 0) goto La3
            boolean r15 = r15.f26088c
            if (r15 != 0) goto Laf
        La3:
            w.d r15 = r13.f26118H
            if (r9 != r15) goto Lb1
            w.d r9 = r14.f26091f
            if (r9 == 0) goto Lb1
            boolean r9 = r9.f26088c
            if (r9 == 0) goto Lb1
        Laf:
            r9 = 1
            goto Lb2
        Lb1:
            r9 = 0
        Lb2:
            if (r9 == 0) goto L44
            boolean r9 = r13.m13726z()
            if (r9 != 0) goto L44
            m13984d(r0, r1, r13, r2)
            goto L44
        Lbe:
            boolean r14 = r13.m13692B()
            if (r14 == 0) goto Lc6
            goto L44
        Lc6:
            w.d r14 = r13.f26114F
            if (r9 != r14) goto Lde
            w.d r15 = r13.f26118H
            w.d r15 = r15.f26091f
            if (r15 != 0) goto Lde
            int r9 = r14.m13681d()
            int r9 = r9 + r7
            int r14 = r13.m13721u()
            int r14 = r14 + r9
            r13.m13697I(r9, r14)
            goto Lf5
        Lde:
            w.d r15 = r13.f26118H
            if (r9 != r15) goto Lfa
            w.d r12 = r14.f26091f
            if (r12 != 0) goto Lfa
            int r9 = r15.m13681d()
            int r9 = r7 - r9
            int r12 = r13.m13721u()
            int r12 = r9 - r12
            r13.m13697I(r12, r9)
        Lf5:
            m13982b(r13, r1, r2)
            goto L44
        Lfa:
            if (r9 != r14) goto L44
            w.d r9 = r15.f26091f
            if (r9 == 0) goto L44
            boolean r9 = r9.f26088c
            if (r9 == 0) goto L44
            boolean r9 = r13.m13726z()
            if (r9 != 0) goto L44
            m13983c(r1, r13, r2)
            goto L44
        L10f:
            boolean r4 = r0 instanceof p381w.C6768i
            if (r4 == 0) goto L114
            return
        L114:
            java.util.HashSet<w.d> r4 = r6.f26086a
            if (r4 == 0) goto L1e3
            boolean r6 = r6.f26088c
            if (r6 == 0) goto L1e3
            java.util.Iterator r4 = r4.iterator()
        L120:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L1e3
            java.lang.Object r6 = r4.next()
            w.d r6 = (p381w.C6763d) r6
            w.f r7 = r6.f26089d
            boolean r9 = m13981a(r7)
            boolean r12 = r7.m13692B()
            if (r12 == 0) goto L142
            if (r9 == 0) goto L142
            x.b$a r12 = new x.b$a
            r12.<init>()
            p381w.C6766g.m13727a0(r7, r1, r12, r5)
        L142:
            w.d r12 = r7.f26114F
            if (r6 != r12) goto L150
            w.d r13 = r7.f26118H
            w.d r13 = r13.f26091f
            if (r13 == 0) goto L150
            boolean r13 = r13.f26088c
            if (r13 != 0) goto L15c
        L150:
            w.d r13 = r7.f26118H
            if (r6 != r13) goto L15e
            w.d r12 = r12.f26091f
            if (r12 == 0) goto L15e
            boolean r12 = r12.f26088c
            if (r12 == 0) goto L15e
        L15c:
            r12 = 1
            goto L15f
        L15e:
            r12 = 0
        L15f:
            w.f$a r13 = r7.m13716p()
            if (r13 != r3) goto L19a
            if (r9 == 0) goto L168
            goto L19a
        L168:
            w.f$a r6 = r7.m13716p()
            if (r6 != r3) goto L120
            int r6 = r7.f26167p
            if (r6 < 0) goto L120
            int r6 = r7.f26165o
            if (r6 < 0) goto L120
            int r6 = r7.f26156j0
            if (r6 == r11) goto L184
            int r6 = r7.f26159l
            if (r6 != 0) goto L120
            float r6 = r7.f26131U
            int r6 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r6 != 0) goto L120
        L184:
            boolean r6 = r7.m13726z()
            if (r6 != 0) goto L120
            boolean r6 = r7.f26108C
            if (r6 != 0) goto L120
            if (r12 == 0) goto L120
            boolean r6 = r7.m13726z()
            if (r6 != 0) goto L120
            m13984d(r0, r1, r7, r2)
            goto L120
        L19a:
            boolean r9 = r7.m13692B()
            if (r9 == 0) goto L1a2
            goto L120
        L1a2:
            w.d r9 = r7.f26114F
            if (r6 != r9) goto L1ba
            w.d r13 = r7.f26118H
            w.d r13 = r13.f26091f
            if (r13 != 0) goto L1ba
            int r6 = r9.m13681d()
            int r6 = r6 + r8
            int r9 = r7.m13721u()
            int r9 = r9 + r6
            r7.m13697I(r6, r9)
            goto L1d1
        L1ba:
            w.d r13 = r7.f26118H
            if (r6 != r13) goto L1d6
            w.d r6 = r9.f26091f
            if (r6 != 0) goto L1d6
            int r6 = r13.m13681d()
            int r6 = r8 - r6
            int r9 = r7.m13721u()
            int r9 = r6 - r9
            r7.m13697I(r9, r6)
        L1d1:
            m13982b(r7, r1, r2)
            goto L120
        L1d6:
            if (r12 == 0) goto L120
            boolean r6 = r7.m13726z()
            if (r6 != 0) goto L120
            m13983c(r1, r7, r2)
            goto L120
        L1e3:
            return
    }

    /* renamed from: c */
    public static void m13983c(p401x.C6894b.b r6, p381w.C6765f r7, boolean r8) {
            float r0 = r7.f26148f0
            w.d r1 = r7.f26114F
            w.d r1 = r1.f26091f
            int r1 = r1.m13680c()
            w.d r2 = r7.f26118H
            w.d r2 = r2.f26091f
            int r2 = r2.m13680c()
            w.d r3 = r7.f26114F
            int r3 = r3.m13681d()
            int r3 = r3 + r1
            w.d r4 = r7.f26118H
            int r4 = r4.m13681d()
            int r4 = r2 - r4
            r5 = 1056964608(0x3f000000, float:0.5)
            if (r1 != r2) goto L28
            r0 = 1056964608(0x3f000000, float:0.5)
            goto L2a
        L28:
            r1 = r3
            r2 = r4
        L2a:
            int r3 = r7.m13721u()
            int r4 = r2 - r1
            int r4 = r4 - r3
            if (r1 <= r2) goto L36
            int r4 = r1 - r2
            int r4 = r4 - r3
        L36:
            float r4 = (float) r4
            float r0 = r0 * r4
            float r0 = r0 + r5
            int r0 = (int) r0
            int r0 = r0 + r1
            int r4 = r0 + r3
            if (r1 <= r2) goto L42
            int r4 = r0 - r3
        L42:
            r7.m13697I(r0, r4)
            m13982b(r7, r6, r8)
            return
    }

    /* renamed from: d */
    public static void m13984d(p381w.C6765f r7, p401x.C6894b.b r8, p381w.C6765f r9, boolean r10) {
            float r0 = r9.f26148f0
            w.d r1 = r9.f26114F
            w.d r1 = r1.f26091f
            int r1 = r1.m13680c()
            w.d r2 = r9.f26114F
            int r2 = r2.m13681d()
            int r2 = r2 + r1
            w.d r1 = r9.f26118H
            w.d r1 = r1.f26091f
            int r1 = r1.m13680c()
            w.d r3 = r9.f26118H
            int r3 = r3.m13681d()
            int r1 = r1 - r3
            if (r1 < r2) goto L68
            int r3 = r9.m13721u()
            int r4 = r9.f26156j0
            r5 = 8
            r6 = 1056964608(0x3f000000, float:0.5)
            if (r4 == r5) goto L59
            int r4 = r9.f26159l
            r5 = 2
            if (r4 != r5) goto L47
            boolean r3 = r7 instanceof p381w.C6766g
            if (r3 == 0) goto L38
            goto L3a
        L38:
            w.f r7 = r7.f26128R
        L3a:
            int r7 = r7.m13721u()
            float r3 = r9.f26148f0
            float r3 = r3 * r6
            float r7 = (float) r7
            float r3 = r3 * r7
            int r3 = (int) r3
            goto L4b
        L47:
            if (r4 != 0) goto L4b
            int r3 = r1 - r2
        L4b:
            int r7 = r9.f26165o
            int r3 = java.lang.Math.max(r7, r3)
            int r7 = r9.f26167p
            if (r7 <= 0) goto L59
            int r3 = java.lang.Math.min(r7, r3)
        L59:
            int r1 = r1 - r2
            int r1 = r1 - r3
            float r7 = (float) r1
            float r0 = r0 * r7
            float r0 = r0 + r6
            int r7 = (int) r0
            int r2 = r2 + r7
            int r3 = r3 + r2
            r9.m13697I(r2, r3)
            m13982b(r9, r8, r10)
        L68:
            return
    }

    /* renamed from: e */
    public static void m13985e(p401x.C6894b.b r6, p381w.C6765f r7) {
            float r0 = r7.f26150g0
            w.d r1 = r7.f26116G
            w.d r1 = r1.f26091f
            int r1 = r1.m13680c()
            w.d r2 = r7.f26119I
            w.d r2 = r2.f26091f
            int r2 = r2.m13680c()
            w.d r3 = r7.f26116G
            int r3 = r3.m13681d()
            int r3 = r3 + r1
            w.d r4 = r7.f26119I
            int r4 = r4.m13681d()
            int r4 = r2 - r4
            r5 = 1056964608(0x3f000000, float:0.5)
            if (r1 != r2) goto L28
            r0 = 1056964608(0x3f000000, float:0.5)
            goto L2a
        L28:
            r1 = r3
            r2 = r4
        L2a:
            int r3 = r7.m13715o()
            int r4 = r2 - r1
            int r4 = r4 - r3
            if (r1 <= r2) goto L36
            int r4 = r1 - r2
            int r4 = r4 - r3
        L36:
            float r4 = (float) r4
            float r0 = r0 * r4
            float r0 = r0 + r5
            int r0 = (int) r0
            int r4 = r1 + r0
            int r5 = r4 + r3
            if (r1 <= r2) goto L45
            int r4 = r1 - r0
            int r5 = r4 - r3
        L45:
            r7.m13698J(r4, r5)
            m13987g(r7, r6)
            return
    }

    /* renamed from: f */
    public static void m13986f(p381w.C6765f r7, p401x.C6894b.b r8, p381w.C6765f r9) {
            float r0 = r9.f26150g0
            w.d r1 = r9.f26116G
            w.d r1 = r1.f26091f
            int r1 = r1.m13680c()
            w.d r2 = r9.f26116G
            int r2 = r2.m13681d()
            int r2 = r2 + r1
            w.d r1 = r9.f26119I
            w.d r1 = r1.f26091f
            int r1 = r1.m13680c()
            w.d r3 = r9.f26119I
            int r3 = r3.m13681d()
            int r1 = r1 - r3
            if (r1 < r2) goto L66
            int r3 = r9.m13715o()
            int r4 = r9.f26156j0
            r5 = 8
            r6 = 1056964608(0x3f000000, float:0.5)
            if (r4 == r5) goto L57
            int r4 = r9.f26161m
            r5 = 2
            if (r4 != r5) goto L45
            boolean r3 = r7 instanceof p381w.C6766g
            if (r3 == 0) goto L38
            goto L3a
        L38:
            w.f r7 = r7.f26128R
        L3a:
            int r7 = r7.m13715o()
            float r3 = r0 * r6
            float r7 = (float) r7
            float r3 = r3 * r7
            int r3 = (int) r3
            goto L49
        L45:
            if (r4 != 0) goto L49
            int r3 = r1 - r2
        L49:
            int r7 = r9.f26171r
            int r3 = java.lang.Math.max(r7, r3)
            int r7 = r9.f26173s
            if (r7 <= 0) goto L57
            int r3 = java.lang.Math.min(r7, r3)
        L57:
            int r1 = r1 - r2
            int r1 = r1 - r3
            float r7 = (float) r1
            float r0 = r0 * r7
            float r0 = r0 + r6
            int r7 = (int) r0
            int r2 = r2 + r7
            int r3 = r3 + r2
            r9.m13698J(r2, r3)
            m13987g(r9, r8)
        L66:
            return
    }

    /* renamed from: g */
    public static void m13987g(p381w.C6765f r14, p401x.C6894b.b r15) {
            w.f$a r0 = p381w.C6765f.a.f26191a0
            boolean r1 = r14 instanceof p381w.C6766g
            r2 = 0
            if (r1 != 0) goto L1b
            boolean r1 = r14.m13692B()
            if (r1 == 0) goto L1b
            boolean r1 = m13981a(r14)
            if (r1 == 0) goto L1b
            x.b$a r1 = new x.b$a
            r1.<init>()
            p381w.C6766g.m13727a0(r14, r15, r1, r2)
        L1b:
            w.d$a r1 = p381w.C6763d.a.f26096Z
            w.d r1 = r14.mo13712l(r1)
            w.d$a r3 = p381w.C6763d.a.f26098b0
            w.d r3 = r14.mo13712l(r3)
            int r4 = r1.m13680c()
            int r5 = r3.m13680c()
            java.util.HashSet<w.d> r6 = r1.f26086a
            r7 = 0
            r8 = 8
            r9 = 1
            if (r6 == 0) goto L104
            boolean r1 = r1.f26088c
            if (r1 == 0) goto L104
            java.util.Iterator r1 = r6.iterator()
        L3f:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L104
            java.lang.Object r6 = r1.next()
            w.d r6 = (p381w.C6763d) r6
            w.f r10 = r6.f26089d
            boolean r11 = m13981a(r10)
            boolean r12 = r10.m13692B()
            if (r12 == 0) goto L61
            if (r11 == 0) goto L61
            x.b$a r12 = new x.b$a
            r12.<init>()
            p381w.C6766g.m13727a0(r10, r15, r12, r2)
        L61:
            w.f$a r12 = r10.m13720t()
            if (r12 != r0) goto Lb9
            if (r11 == 0) goto L6a
            goto Lb9
        L6a:
            w.f$a r11 = r10.m13720t()
            if (r11 != r0) goto L3f
            int r11 = r10.f26173s
            if (r11 < 0) goto L3f
            int r11 = r10.f26171r
            if (r11 < 0) goto L3f
            int r11 = r10.f26156j0
            if (r11 == r8) goto L86
            int r11 = r10.f26161m
            if (r11 != 0) goto L3f
            float r11 = r10.f26131U
            int r11 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r11 != 0) goto L3f
        L86:
            boolean r11 = r10.m13691A()
            if (r11 != 0) goto L3f
            boolean r11 = r10.f26108C
            if (r11 != 0) goto L3f
            w.d r11 = r10.f26116G
            if (r6 != r11) goto L9e
            w.d r12 = r10.f26119I
            w.d r12 = r12.f26091f
            if (r12 == 0) goto L9e
            boolean r12 = r12.f26088c
            if (r12 != 0) goto Laa
        L9e:
            w.d r12 = r10.f26119I
            if (r6 != r12) goto Lac
            w.d r6 = r11.f26091f
            if (r6 == 0) goto Lac
            boolean r6 = r6.f26088c
            if (r6 == 0) goto Lac
        Laa:
            r6 = 1
            goto Lad
        Lac:
            r6 = 0
        Lad:
            if (r6 == 0) goto L3f
            boolean r6 = r10.m13691A()
            if (r6 != 0) goto L3f
            m13986f(r14, r15, r10)
            goto L3f
        Lb9:
            boolean r11 = r10.m13692B()
            if (r11 == 0) goto Lc1
            goto L3f
        Lc1:
            w.d r11 = r10.f26116G
            if (r6 != r11) goto Ld9
            w.d r12 = r10.f26119I
            w.d r12 = r12.f26091f
            if (r12 != 0) goto Ld9
            int r6 = r11.m13681d()
            int r6 = r6 + r4
            int r11 = r10.m13715o()
            int r11 = r11 + r6
            r10.m13698J(r6, r11)
            goto Lf0
        Ld9:
            w.d r12 = r10.f26119I
            if (r6 != r12) goto Lf5
            w.d r13 = r12.f26091f
            if (r13 != 0) goto Lf5
            int r6 = r12.m13681d()
            int r6 = r4 - r6
            int r11 = r10.m13715o()
            int r11 = r6 - r11
            r10.m13698J(r11, r6)
        Lf0:
            m13987g(r10, r15)
            goto L3f
        Lf5:
            if (r6 != r11) goto L3f
            w.d r6 = r12.f26091f
            if (r6 == 0) goto L3f
            boolean r6 = r6.f26088c
            if (r6 == 0) goto L3f
            m13985e(r15, r10)
            goto L3f
        L104:
            boolean r1 = r14 instanceof p381w.C6768i
            if (r1 == 0) goto L109
            return
        L109:
            java.util.HashSet<w.d> r1 = r3.f26086a
            if (r1 == 0) goto L1d8
            boolean r3 = r3.f26088c
            if (r3 == 0) goto L1d8
            java.util.Iterator r1 = r1.iterator()
        L115:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L1d8
            java.lang.Object r3 = r1.next()
            w.d r3 = (p381w.C6763d) r3
            w.f r4 = r3.f26089d
            boolean r6 = m13981a(r4)
            boolean r10 = r4.m13692B()
            if (r10 == 0) goto L137
            if (r6 == 0) goto L137
            x.b$a r10 = new x.b$a
            r10.<init>()
            p381w.C6766g.m13727a0(r4, r15, r10, r2)
        L137:
            w.d r10 = r4.f26116G
            if (r3 != r10) goto L145
            w.d r11 = r4.f26119I
            w.d r11 = r11.f26091f
            if (r11 == 0) goto L145
            boolean r11 = r11.f26088c
            if (r11 != 0) goto L151
        L145:
            w.d r11 = r4.f26119I
            if (r3 != r11) goto L153
            w.d r10 = r10.f26091f
            if (r10 == 0) goto L153
            boolean r10 = r10.f26088c
            if (r10 == 0) goto L153
        L151:
            r10 = 1
            goto L154
        L153:
            r10 = 0
        L154:
            w.f$a r11 = r4.m13720t()
            if (r11 != r0) goto L18f
            if (r6 == 0) goto L15d
            goto L18f
        L15d:
            w.f$a r3 = r4.m13720t()
            if (r3 != r0) goto L115
            int r3 = r4.f26173s
            if (r3 < 0) goto L115
            int r3 = r4.f26171r
            if (r3 < 0) goto L115
            int r3 = r4.f26156j0
            if (r3 == r8) goto L179
            int r3 = r4.f26161m
            if (r3 != 0) goto L115
            float r3 = r4.f26131U
            int r3 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r3 != 0) goto L115
        L179:
            boolean r3 = r4.m13691A()
            if (r3 != 0) goto L115
            boolean r3 = r4.f26108C
            if (r3 != 0) goto L115
            if (r10 == 0) goto L115
            boolean r3 = r4.m13691A()
            if (r3 != 0) goto L115
            m13986f(r14, r15, r4)
            goto L115
        L18f:
            boolean r6 = r4.m13692B()
            if (r6 == 0) goto L197
            goto L115
        L197:
            w.d r6 = r4.f26116G
            if (r3 != r6) goto L1af
            w.d r11 = r4.f26119I
            w.d r11 = r11.f26091f
            if (r11 != 0) goto L1af
            int r3 = r6.m13681d()
            int r3 = r3 + r5
            int r6 = r4.m13715o()
            int r6 = r6 + r3
            r4.m13698J(r3, r6)
            goto L1c6
        L1af:
            w.d r11 = r4.f26119I
            if (r3 != r11) goto L1cb
            w.d r3 = r6.f26091f
            if (r3 != 0) goto L1cb
            int r3 = r11.m13681d()
            int r3 = r5 - r3
            int r6 = r4.m13715o()
            int r6 = r3 - r6
            r4.m13698J(r6, r3)
        L1c6:
            m13987g(r4, r15)
            goto L115
        L1cb:
            if (r10 == 0) goto L115
            boolean r3 = r4.m13691A()
            if (r3 != 0) goto L115
            m13985e(r15, r4)
            goto L115
        L1d8:
            w.d$a r1 = p381w.C6763d.a.f26099c0
            w.d r14 = r14.mo13712l(r1)
            java.util.HashSet<w.d> r1 = r14.f26086a
            if (r1 == 0) goto L24b
            boolean r1 = r14.f26088c
            if (r1 == 0) goto L24b
            int r1 = r14.m13680c()
            java.util.HashSet<w.d> r14 = r14.f26086a
            java.util.Iterator r14 = r14.iterator()
        L1f0:
            boolean r3 = r14.hasNext()
            if (r3 == 0) goto L24b
            java.lang.Object r3 = r14.next()
            w.d r3 = (p381w.C6763d) r3
            w.f r4 = r3.f26089d
            boolean r5 = m13981a(r4)
            boolean r6 = r4.m13692B()
            if (r6 == 0) goto L212
            if (r5 == 0) goto L212
            x.b$a r6 = new x.b$a
            r6.<init>()
            p381w.C6766g.m13727a0(r4, r15, r6, r2)
        L212:
            w.f$a r6 = r4.m13720t()
            if (r6 != r0) goto L21a
            if (r5 == 0) goto L1f0
        L21a:
            boolean r5 = r4.m13692B()
            if (r5 == 0) goto L221
            goto L1f0
        L221:
            w.d r5 = r4.f26120J
            if (r3 != r5) goto L1f0
            boolean r3 = r4.f26104A
            if (r3 != 0) goto L22a
            goto L245
        L22a:
            int r3 = r4.f26142c0
            int r3 = r1 - r3
            int r5 = r4.f26130T
            int r5 = r5 + r3
            r4.f26134X = r3
            w.d r6 = r4.f26116G
            r6.m13689l(r3)
            w.d r3 = r4.f26119I
            r3.m13689l(r5)
            w.d r3 = r4.f26120J
            r3.f26087b = r1
            r3.f26088c = r9
            r4.f26153i = r9
        L245:
            m13987g(r4, r15)     // Catch: java.lang.Throwable -> L249
            goto L1f0
        L249:
            r14 = move-exception
            throw r14
        L24b:
            return
    }
}
