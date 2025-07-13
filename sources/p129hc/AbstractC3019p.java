package p129hc;

/* renamed from: hc.p */
/* loaded from: classes.dex */
public abstract class AbstractC3019p implements sb.InterfaceC6019m {
    public AbstractC3019p() {
            r0 = this;
            r0.<init>()
            return
    }

    /* renamed from: f */
    public static float m7420f(int[] r9, int[] r10, float r11) {
            int r0 = r9.length
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
        L5:
            if (r2 >= r0) goto L10
            r5 = r9[r2]
            int r3 = r3 + r5
            r5 = r10[r2]
            int r4 = r4 + r5
            int r2 = r2 + 1
            goto L5
        L10:
            r2 = 2139095040(0x7f800000, float:Infinity)
            if (r3 >= r4) goto L15
            return r2
        L15:
            float r3 = (float) r3
            float r4 = (float) r4
            float r4 = r3 / r4
            float r11 = r11 * r4
            r5 = 0
        L1c:
            if (r1 >= r0) goto L37
            r6 = r9[r1]
            r7 = r10[r1]
            float r7 = (float) r7
            float r7 = r7 * r4
            float r6 = (float) r6
            int r8 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r8 <= 0) goto L2c
            float r6 = r6 - r7
            goto L2e
        L2c:
            float r6 = r7 - r6
        L2e:
            int r7 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r7 <= 0) goto L33
            return r2
        L33:
            float r5 = r5 + r6
            int r1 = r1 + 1
            goto L1c
        L37:
            float r5 = r5 / r3
            return r5
    }

    /* renamed from: g */
    public static void m7421g(p453zb.C7269a r6, int r7, int[] r8) {
            int r0 = r8.length
            r1 = 0
            java.util.Arrays.fill(r8, r1, r0, r1)
            int r2 = r6.f27901Z
            if (r7 >= r2) goto L35
            boolean r3 = r6.m14364e(r7)
            r4 = 1
            r3 = r3 ^ r4
        Lf:
            if (r7 >= r2) goto L29
            boolean r5 = r6.m14364e(r7)
            r5 = r5 ^ r3
            if (r5 == 0) goto L1e
            r5 = r8[r1]
            int r5 = r5 + r4
            r8[r1] = r5
            goto L26
        L1e:
            int r1 = r1 + 1
            if (r1 == r0) goto L29
            r8[r1] = r4
            r3 = r3 ^ 1
        L26:
            int r7 = r7 + 1
            goto Lf
        L29:
            if (r1 == r0) goto L34
            int r0 = r0 - r4
            if (r1 != r0) goto L31
            if (r7 != r2) goto L31
            goto L34
        L31:
            sb.k r6 = sb.C6017k.f23200a0
            throw r6
        L34:
            return
        L35:
            sb.k r6 = sb.C6017k.f23200a0
            throw r6
    }

    /* renamed from: h */
    public static void m7422h(p453zb.C7269a r3, int r4, int[] r5) {
            int r0 = r5.length
            boolean r1 = r3.m14364e(r4)
        L5:
            if (r4 <= 0) goto L16
            if (r0 < 0) goto L16
            int r4 = r4 + (-1)
            boolean r2 = r3.m14364e(r4)
            if (r2 == r1) goto L5
            int r0 = r0 + (-1)
            r1 = r1 ^ 1
            goto L5
        L16:
            if (r0 >= 0) goto L1e
            int r4 = r4 + 1
            m7421g(r3, r4, r5)
            return
        L1e:
            sb.k r3 = sb.C6017k.f23200a0
            throw r3
    }

    @Override // sb.InterfaceC6019m
    /* renamed from: a */
    public sb.C6021o mo2335a(p128hb.C3003h r2) {
            r1 = this;
            r0 = 0
            sb.o r2 = r1.mo2337c(r2, r0)
            return r2
    }

    @Override // sb.InterfaceC6019m
    /* renamed from: b */
    public void mo2336b() {
            r0 = this;
            return
    }

    @Override // sb.InterfaceC6019m
    /* renamed from: c */
    public sb.C6021o mo2337c(p128hb.C3003h r6, java.util.Map<sb.EnumC6009c, ?> r7) {
            r5 = this;
            sb.p r0 = sb.EnumC6022p.f23211Y
            sb.o r6 = r5.m7423e(r6, r7)     // Catch: sb.C6017k -> L7
            return r6
        L7:
            r1 = move-exception
            r2 = 0
            if (r7 == 0) goto L15
            sb.c r3 = sb.EnumC6009c.f23172b0
            boolean r3 = r7.containsKey(r3)
            if (r3 == 0) goto L15
            r3 = 1
            goto L16
        L15:
            r3 = 0
        L16:
            if (r3 == 0) goto L8c
            wa.b<s9.a> r3 = r6.f12118b
            v0.c r3 = (p366v0.AbstractC6484c) r3
            java.lang.Object r3 = r3.f25150a
            sb.h r3 = (sb.AbstractC6014h) r3
            boolean r3 = r3.mo12495d()
            if (r3 == 0) goto L8c
            wa.b<s9.a> r1 = r6.f12118b
            v0.c r1 = (p366v0.AbstractC6484c) r1
            java.lang.Object r1 = r1.f25150a
            sb.h r1 = (sb.AbstractC6014h) r1
            sb.h r1 = r1.mo12496e()
            hb.h r3 = new hb.h
            wa.b<s9.a> r6 = r6.f12118b
            v0.c r6 = (p366v0.AbstractC6484c) r6
            v0.c r6 = r6.mo13169b(r1)
            r3.<init>(r6)
            sb.o r6 = r5.m7423e(r3, r7)
            java.util.Map<sb.p, java.lang.Object> r7 = r6.f23210e
            r1 = 270(0x10e, float:3.78E-43)
            if (r7 == 0) goto L5c
            boolean r4 = r7.containsKey(r0)
            if (r4 == 0) goto L5c
            java.lang.Object r7 = r7.get(r0)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            int r7 = r7 + r1
            int r1 = r7 % 360
        L5c:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r1)
            r6.m12500b(r0, r7)
            sb.q[] r7 = r6.f23208c
            if (r7 == 0) goto L8b
            wa.b<s9.a> r0 = r3.f12118b
            v0.c r0 = (p366v0.AbstractC6484c) r0
            java.lang.Object r0 = r0.f25150a
            sb.h r0 = (sb.AbstractC6014h) r0
            int r0 = r0.f23197b
        L71:
            int r1 = r7.length
            if (r2 >= r1) goto L8b
            sb.q r1 = new sb.q
            float r3 = (float) r0
            r4 = r7[r2]
            float r4 = r4.f23223b
            float r3 = r3 - r4
            r4 = 1065353216(0x3f800000, float:1.0)
            float r3 = r3 - r4
            r4 = r7[r2]
            float r4 = r4.f23222a
            r1.<init>(r3, r4)
            r7[r2] = r1
            int r2 = r2 + 1
            goto L71
        L8b:
            return r6
        L8c:
            throw r1
    }

    /* renamed from: d */
    public abstract sb.C6021o mo7401d(int r1, p453zb.C7269a r2, java.util.Map<sb.EnumC6009c, ?> r3);

    /* renamed from: e */
    public final sb.C6021o m7423e(p128hb.C3003h r20, java.util.Map<sb.EnumC6009c, ?> r21) {
            r19 = this;
            r0 = r20
            r1 = r21
            wa.b<s9.a> r2 = r0.f12118b
            v0.c r2 = (p366v0.AbstractC6484c) r2
            java.lang.Object r2 = r2.f25150a
            r3 = r2
            sb.h r3 = (sb.AbstractC6014h) r3
            int r3 = r3.f23196a
            sb.h r2 = (sb.AbstractC6014h) r2
            int r2 = r2.f23197b
            zb.a r4 = new zb.a
            r4.<init>(r3)
            int r5 = r2 >> 1
            r6 = 0
            r7 = 1
            if (r1 == 0) goto L28
            sb.c r8 = sb.EnumC6009c.f23172b0
            boolean r8 = r1.containsKey(r8)
            if (r8 == 0) goto L28
            r8 = 1
            goto L29
        L28:
            r8 = 0
        L29:
            if (r8 == 0) goto L2e
            r9 = 8
            goto L2f
        L2e:
            r9 = 5
        L2f:
            int r9 = r2 >> r9
            int r9 = java.lang.Math.max(r7, r9)
            if (r8 == 0) goto L39
            r8 = r2
            goto L3b
        L39:
            r8 = 15
        L3b:
            r10 = 0
        L3c:
            if (r10 >= r8) goto Le1
            int r11 = r10 + 1
            int r12 = r11 / 2
            r10 = r10 & 1
            if (r10 != 0) goto L48
            r10 = 1
            goto L49
        L48:
            r10 = 0
        L49:
            if (r10 == 0) goto L4c
            goto L4d
        L4c:
            int r12 = -r12
        L4d:
            int r12 = r12 * r9
            int r12 = r12 + r5
            if (r12 < 0) goto Le1
            if (r12 >= r2) goto Le1
            wa.b<s9.a> r10 = r0.f12118b     // Catch: sb.C6017k -> Ld4
            v0.c r10 = (p366v0.AbstractC6484c) r10     // Catch: sb.C6017k -> Ld4
            zb.a r4 = r10.mo13172e(r12, r4)     // Catch: sb.C6017k -> Ld4
            r10 = 0
        L5d:
            r13 = 2
            if (r10 >= r13) goto Ld4
            if (r10 != r7) goto L80
            r4.m14369m()
            if (r1 == 0) goto L80
            sb.c r13 = sb.EnumC6009c.f23178h0
            boolean r14 = r1.containsKey(r13)
            if (r14 == 0) goto L80
            java.util.EnumMap r14 = new java.util.EnumMap
            java.lang.Class<sb.c> r15 = sb.EnumC6009c.class
            r14.<init>(r15)
            r14.putAll(r1)
            r14.remove(r13)
            r13 = r19
            r1 = r14
            goto L82
        L80:
            r13 = r19
        L82:
            sb.o r14 = r13.mo7401d(r12, r4, r1)     // Catch: sb.AbstractC6020n -> Lc5
            if (r10 != r7) goto Lc4
            sb.p r15 = sb.EnumC6022p.f23211Y     // Catch: sb.AbstractC6020n -> Lc5
            r16 = 180(0xb4, float:2.52E-43)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r16)     // Catch: sb.AbstractC6020n -> Lc5
            r14.m12500b(r15, r7)     // Catch: sb.AbstractC6020n -> Lc5
            sb.q[] r7 = r14.f23208c     // Catch: sb.AbstractC6020n -> Lc5
            if (r7 == 0) goto Lc4
            sb.q r15 = new sb.q     // Catch: sb.AbstractC6020n -> Lc5
            float r0 = (float) r3
            r16 = r1
            r1 = r7[r6]     // Catch: sb.AbstractC6020n -> Lc7
            float r1 = r1.f23222a     // Catch: sb.AbstractC6020n -> Lc7
            float r1 = r0 - r1
            r17 = 1065353216(0x3f800000, float:1.0)
            float r1 = r1 - r17
            r18 = r2
            r2 = r7[r6]     // Catch: sb.AbstractC6020n -> Lc9
            float r2 = r2.f23223b     // Catch: sb.AbstractC6020n -> Lc9
            r15.<init>(r1, r2)     // Catch: sb.AbstractC6020n -> Lc9
            r7[r6] = r15     // Catch: sb.AbstractC6020n -> Lc9
            sb.q r1 = new sb.q     // Catch: sb.AbstractC6020n -> Lc9
            r2 = 1
            r15 = r7[r2]     // Catch: sb.AbstractC6020n -> Lca
            float r15 = r15.f23222a     // Catch: sb.AbstractC6020n -> Lca
            float r0 = r0 - r15
            float r0 = r0 - r17
            r15 = r7[r2]     // Catch: sb.AbstractC6020n -> Lca
            float r15 = r15.f23223b     // Catch: sb.AbstractC6020n -> Lca
            r1.<init>(r0, r15)     // Catch: sb.AbstractC6020n -> Lca
            r7[r2] = r1     // Catch: sb.AbstractC6020n -> Lca
        Lc4:
            return r14
        Lc5:
            r16 = r1
        Lc7:
            r18 = r2
        Lc9:
            r2 = 1
        Lca:
            int r10 = r10 + 1
            r0 = r20
            r1 = r16
            r2 = r18
            r7 = 1
            goto L5d
        Ld4:
            r13 = r19
            r18 = r2
            r2 = 1
            r0 = r20
            r10 = r11
            r2 = r18
            r7 = 1
            goto L3c
        Le1:
            r13 = r19
            sb.k r0 = sb.C6017k.f23200a0
            throw r0
    }
}
