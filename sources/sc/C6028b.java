package sc;

/* renamed from: sc.b */
/* loaded from: classes.dex */
public final class C6028b {

    /* renamed from: a */
    public final p453zb.C7270b f23225a;

    /* renamed from: b */
    public final java.util.List<sc.C6027a> f23226b;

    /* renamed from: c */
    public final int f23227c;

    /* renamed from: d */
    public final int f23228d;

    /* renamed from: e */
    public final int f23229e;

    /* renamed from: f */
    public final int f23230f;

    /* renamed from: g */
    public final float f23231g;

    /* renamed from: h */
    public final int[] f23232h;

    /* renamed from: i */
    public final sb.InterfaceC6024r f23233i;

    public C6028b(p453zb.C7270b r2, int r3, int r4, int r5, int r6, float r7, sb.InterfaceC6024r r8) {
            r1 = this;
            r1.<init>()
            r1.f23225a = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r0 = 5
            r2.<init>(r0)
            r1.f23226b = r2
            r1.f23227c = r3
            r1.f23228d = r4
            r1.f23229e = r5
            r1.f23230f = r6
            r1.f23231g = r7
            r2 = 3
            int[] r2 = new int[r2]
            r1.f23232h = r2
            r1.f23233i = r8
            return
    }

    /* renamed from: a */
    public static float m12504a(int[] r1, int r2) {
            r0 = 2
            r0 = r1[r0]
            int r2 = r2 - r0
            float r2 = (float) r2
            r0 = 1
            r1 = r1[r0]
            float r1 = (float) r1
            r0 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r0
            float r2 = r2 - r1
            return r2
    }

    /* renamed from: b */
    public final boolean m12505b(int[] r6) {
            r5 = this;
            float r0 = r5.f23231g
            r1 = 1073741824(0x40000000, float:2.0)
            float r1 = r0 / r1
            r2 = 0
            r3 = 0
        L8:
            r4 = 3
            if (r3 >= r4) goto L1c
            r4 = r6[r3]
            float r4 = (float) r4
            float r4 = r0 - r4
            float r4 = java.lang.Math.abs(r4)
            int r4 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r4 < 0) goto L19
            return r2
        L19:
            int r3 = r3 + 1
            goto L8
        L1c:
            r6 = 1
            return r6
    }

    /* renamed from: c */
    public final sc.C6027a m12506c(int[] r13, int r14, int r15) {
            r12 = this;
            r0 = 0
            r1 = r13[r0]
            r2 = 1
            r3 = r13[r2]
            int r1 = r1 + r3
            r3 = 2
            r4 = r13[r3]
            int r1 = r1 + r4
            float r15 = m12504a(r13, r15)
            int r4 = (int) r15
            r5 = r13[r2]
            int r5 = r5 * 2
            zb.b r6 = r12.f23225a
            int r7 = r6.f27903Z
            int[] r8 = r12.f23232h
            r8[r0] = r0
            r8[r2] = r0
            r8[r3] = r0
            r9 = r14
        L21:
            if (r9 < 0) goto L35
            boolean r10 = r6.m14372b(r4, r9)
            if (r10 == 0) goto L35
            r10 = r8[r2]
            if (r10 > r5) goto L35
            r10 = r8[r2]
            int r10 = r10 + r2
            r8[r2] = r10
            int r9 = r9 + (-1)
            goto L21
        L35:
            r10 = 2143289344(0x7fc00000, float:NaN)
            if (r9 < 0) goto Lab
            r11 = r8[r2]
            if (r11 <= r5) goto L3f
            goto Lab
        L3f:
            if (r9 < 0) goto L53
            boolean r11 = r6.m14372b(r4, r9)
            if (r11 != 0) goto L53
            r11 = r8[r0]
            if (r11 > r5) goto L53
            r11 = r8[r0]
            int r11 = r11 + r2
            r8[r0] = r11
            int r9 = r9 + (-1)
            goto L3f
        L53:
            r9 = r8[r0]
            if (r9 <= r5) goto L58
            goto Lab
        L58:
            int r14 = r14 + r2
        L59:
            if (r14 >= r7) goto L6d
            boolean r9 = r6.m14372b(r4, r14)
            if (r9 == 0) goto L6d
            r9 = r8[r2]
            if (r9 > r5) goto L6d
            r9 = r8[r2]
            int r9 = r9 + r2
            r8[r2] = r9
            int r14 = r14 + 1
            goto L59
        L6d:
            if (r14 == r7) goto Lab
            r9 = r8[r2]
            if (r9 <= r5) goto L74
            goto Lab
        L74:
            if (r14 >= r7) goto L88
            boolean r9 = r6.m14372b(r4, r14)
            if (r9 != 0) goto L88
            r9 = r8[r3]
            if (r9 > r5) goto L88
            r9 = r8[r3]
            int r9 = r9 + r2
            r8[r3] = r9
            int r14 = r14 + 1
            goto L74
        L88:
            r4 = r8[r3]
            if (r4 <= r5) goto L8d
            goto Lab
        L8d:
            r4 = r8[r0]
            r5 = r8[r2]
            int r4 = r4 + r5
            r5 = r8[r3]
            int r4 = r4 + r5
            int r4 = r4 - r1
            int r4 = java.lang.Math.abs(r4)
            int r4 = r4 * 5
            int r1 = r1 * 2
            if (r4 < r1) goto La1
            goto Lab
        La1:
            boolean r1 = r12.m12505b(r8)
            if (r1 == 0) goto Lab
            float r10 = m12504a(r8, r14)
        Lab:
            boolean r14 = java.lang.Float.isNaN(r10)
            if (r14 != 0) goto L125
            r14 = r13[r0]
            r1 = r13[r2]
            int r14 = r14 + r1
            r13 = r13[r3]
            int r14 = r14 + r13
            float r13 = (float) r14
            r14 = 1077936128(0x40400000, float:3.0)
            float r13 = r13 / r14
            java.util.List<sc.a> r14 = r12.f23226b
            java.util.Iterator r14 = r14.iterator()
        Lc3:
            boolean r1 = r14.hasNext()
            if (r1 == 0) goto L114
            java.lang.Object r1 = r14.next()
            sc.a r1 = (sc.C6027a) r1
            float r3 = r1.f23223b
            float r3 = r10 - r3
            float r3 = java.lang.Math.abs(r3)
            int r3 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r3 > 0) goto Lfd
            float r3 = r1.f23222a
            float r3 = r15 - r3
            float r3 = java.lang.Math.abs(r3)
            int r3 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r3 > 0) goto Lfd
            float r3 = r1.f23224c
            float r3 = r13 - r3
            float r3 = java.lang.Math.abs(r3)
            r4 = 1065353216(0x3f800000, float:1.0)
            int r4 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r4 <= 0) goto Lfb
            float r4 = r1.f23224c
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 > 0) goto Lfd
        Lfb:
            r3 = 1
            goto Lfe
        Lfd:
            r3 = 0
        Lfe:
            if (r3 == 0) goto Lc3
            float r14 = r1.f23222a
            float r14 = r14 + r15
            r15 = 1073741824(0x40000000, float:2.0)
            float r14 = r14 / r15
            float r0 = r1.f23223b
            float r0 = r0 + r10
            float r0 = r0 / r15
            float r1 = r1.f23224c
            float r1 = r1 + r13
            float r1 = r1 / r15
            sc.a r13 = new sc.a
            r13.<init>(r14, r0, r1)
            return r13
        L114:
            sc.a r14 = new sc.a
            r14.<init>(r15, r10, r13)
            java.util.List<sc.a> r13 = r12.f23226b
            r13.add(r14)
            sb.r r13 = r12.f23233i
            if (r13 == 0) goto L125
            r13.mo12503a(r14)
        L125:
            r13 = 0
            return r13
    }
}
