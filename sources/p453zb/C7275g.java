package p453zb;

/* renamed from: zb.g */
/* loaded from: classes.dex */
public final class C7275g extends p366v0.AbstractC6484c {

    /* renamed from: e */
    public static final byte[] f27925e = null;

    /* renamed from: b */
    public byte[] f27926b;

    /* renamed from: c */
    public final int[] f27927c;

    /* renamed from: d */
    public p453zb.C7270b f27928d;

    static {
            r0 = 0
            byte[] r0 = new byte[r0]
            p453zb.C7275g.f27925e = r0
            return
    }

    public C7275g(sb.AbstractC6014h r1) {
            r0 = this;
            r0.<init>(r1)
            byte[] r1 = p453zb.C7275g.f27925e
            r0.f27926b = r1
            r1 = 32
            int[] r1 = new int[r1]
            r0.f27927c = r1
            return
    }

    /* renamed from: m */
    public static int m14387m(int[] r9) {
            int r0 = r9.length
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
        L6:
            if (r2 >= r0) goto L18
            r6 = r9[r2]
            if (r6 <= r3) goto Lf
            r3 = r9[r2]
            r5 = r2
        Lf:
            r6 = r9[r2]
            if (r6 <= r4) goto L15
            r4 = r9[r2]
        L15:
            int r2 = r2 + 1
            goto L6
        L18:
            r2 = 0
            r3 = 0
        L1a:
            if (r1 >= r0) goto L2b
            int r6 = r1 - r5
            r7 = r9[r1]
            int r7 = r7 * r6
            int r7 = r7 * r6
            if (r7 <= r3) goto L28
            r2 = r1
            r3 = r7
        L28:
            int r1 = r1 + 1
            goto L1a
        L2b:
            if (r5 <= r2) goto L2e
            goto L31
        L2e:
            r8 = r5
            r5 = r2
            r2 = r8
        L31:
            int r1 = r5 - r2
            int r0 = r0 / 16
            if (r1 <= r0) goto L56
            int r0 = r5 + (-1)
            r1 = -1
            r1 = r0
            r3 = -1
        L3c:
            if (r0 <= r2) goto L53
            int r6 = r0 - r2
            int r6 = r6 * r6
            int r7 = r5 - r0
            int r7 = r7 * r6
            r6 = r9[r0]
            int r6 = r4 - r6
            int r6 = r6 * r7
            if (r6 <= r3) goto L50
            r1 = r0
            r3 = r6
        L50:
            int r0 = r0 + (-1)
            goto L3c
        L53:
            int r9 = r1 << 3
            return r9
        L56:
            sb.k r9 = sb.C6017k.f23200a0
            throw r9
    }

    @Override // p366v0.AbstractC6484c
    /* renamed from: b */
    public p366v0.AbstractC6484c mo13169b(sb.AbstractC6014h r2) {
            r1 = this;
            zb.g r0 = new zb.g
            r0.<init>(r2)
            return r0
    }

    @Override // p366v0.AbstractC6484c
    /* renamed from: d */
    public p453zb.C7270b mo13171d() {
            r21 = this;
            r0 = r21
            zb.b r1 = r0.f27928d
            if (r1 == 0) goto L7
            return r1
        L7:
            java.lang.Object r1 = r0.f25150a
            r2 = r1
            sb.h r2 = (sb.AbstractC6014h) r2
            int r3 = r2.f23196a
            int r4 = r2.f23197b
            r5 = 40
            r7 = 0
            r8 = 1
            if (r3 < r5) goto L190
            if (r4 < r5) goto L190
            byte[] r1 = r2.mo12492a()
            int r2 = r3 >> 3
            r5 = r3 & 7
            if (r5 == 0) goto L24
            int r2 = r2 + 1
        L24:
            int r5 = r4 >> 3
            r9 = r4 & 7
            if (r9 == 0) goto L2c
            int r5 = r5 + 1
        L2c:
            r9 = 2
            int[] r10 = new int[r9]
            r10[r8] = r2
            r10[r7] = r5
            java.lang.Class<int> r11 = int.class
            java.lang.Object r10 = java.lang.reflect.Array.newInstance(r11, r10)
            int[][] r10 = (int[][]) r10
            r11 = 0
        L3c:
            r12 = 8
            if (r11 >= r5) goto Led
            int r13 = r11 << 3
            int r14 = r4 + (-8)
            if (r13 <= r14) goto L47
            r13 = r14
        L47:
            r14 = 0
        L48:
            if (r14 >= r2) goto Le6
            int r15 = r14 << 3
            int r7 = r3 + (-8)
            if (r15 <= r7) goto L51
            r15 = r7
        L51:
            int r7 = r13 * r3
            int r7 = r7 + r15
            r9 = 255(0xff, float:3.57E-43)
            r15 = 0
            r16 = 0
            r17 = 0
        L5b:
            if (r15 >= r12) goto Lb0
            r8 = r17
            r6 = 0
        L60:
            if (r6 >= r12) goto L7a
            int r17 = r7 + r6
            r12 = r1[r17]
            r20 = r7
            r7 = 255(0xff, float:3.57E-43)
            r12 = r12 & r7
            int r16 = r16 + r12
            if (r12 >= r9) goto L70
            r9 = r12
        L70:
            if (r12 <= r8) goto L73
            r8 = r12
        L73:
            int r6 = r6 + 1
            r7 = r20
            r12 = 8
            goto L60
        L7a:
            r20 = r7
            int r6 = r8 - r9
            r7 = 24
            if (r6 <= r7) goto La6
            r7 = r20
        L84:
            r6 = 1
            int r15 = r15 + r6
            int r7 = r7 + r3
            r6 = 8
            if (r15 >= r6) goto La3
            r12 = 0
        L8c:
            if (r12 >= r6) goto La0
            int r6 = r7 + r12
            r6 = r1[r6]
            r17 = r7
            r7 = 255(0xff, float:3.57E-43)
            r6 = r6 & r7
            int r16 = r16 + r6
            int r12 = r12 + 1
            r7 = r17
            r6 = 8
            goto L8c
        La0:
            r17 = r7
            goto L84
        La3:
            r17 = r7
            goto La8
        La6:
            r7 = r20
        La8:
            r6 = 1
            int r15 = r15 + r6
            int r7 = r7 + r3
            r17 = r8
            r12 = 8
            goto L5b
        Lb0:
            int r6 = r16 >> 6
            int r7 = r17 - r9
            r8 = 24
            if (r7 > r8) goto Ld9
            int r6 = r9 / 2
            if (r11 <= 0) goto Ld9
            if (r14 <= 0) goto Ld9
            int r7 = r11 + (-1)
            r8 = r10[r7]
            r8 = r8[r14]
            r12 = r10[r11]
            int r15 = r14 + (-1)
            r12 = r12[r15]
            r16 = 2
            int r12 = r12 * 2
            int r12 = r12 + r8
            r7 = r10[r7]
            r7 = r7[r15]
            int r12 = r12 + r7
            int r12 = r12 / 4
            if (r9 >= r12) goto Ld9
            r6 = r12
        Ld9:
            r7 = r10[r11]
            r7[r14] = r6
            int r14 = r14 + 1
            r7 = 0
            r8 = 1
            r9 = 2
            r12 = 8
            goto L48
        Le6:
            int r11 = r11 + 1
            r7 = 0
            r8 = 1
            r9 = 2
            goto L3c
        Led:
            zb.b r6 = new zb.b
            r6.<init>(r3, r4)
            r7 = 0
        Lf3:
            if (r7 >= r5) goto L18d
            int r8 = r7 << 3
            int r9 = r4 + (-8)
            if (r8 <= r9) goto Lfc
            r8 = r9
        Lfc:
            r9 = 0
        Lfd:
            if (r9 >= r2) goto L183
            int r11 = r9 << 3
            int r12 = r3 + (-8)
            if (r11 <= r12) goto L106
            r11 = r12
        L106:
            int r12 = r2 + (-3)
            r13 = 2
            if (r9 >= r13) goto L10e
            r16 = 2
            goto L115
        L10e:
            if (r9 <= r12) goto L113
            r16 = r12
            goto L115
        L113:
            r16 = r9
        L115:
            int r12 = r5 + (-3)
            if (r7 >= r13) goto L11b
            r12 = 2
            goto L11f
        L11b:
            if (r7 <= r12) goto L11e
            goto L11f
        L11e:
            r12 = r7
        L11f:
            r14 = -2
            r15 = 0
        L121:
            if (r14 > r13) goto L149
            int r13 = r12 + r14
            r13 = r10[r13]
            int r17 = r16 + (-2)
            r17 = r13[r17]
            int r19 = r16 + (-1)
            r19 = r13[r19]
            int r17 = r17 + r19
            r19 = r13[r16]
            int r17 = r17 + r19
            int r19 = r16 + 1
            r19 = r13[r19]
            int r17 = r17 + r19
            r18 = 2
            int r19 = r16 + 2
            r13 = r13[r19]
            int r17 = r17 + r13
            int r15 = r17 + r15
            int r14 = r14 + 1
            r13 = 2
            goto L121
        L149:
            r18 = 2
            int r15 = r15 / 25
            int r12 = r8 * r3
            int r12 = r12 + r11
            r13 = 0
        L151:
            r14 = 8
            if (r13 >= r14) goto L17b
            r16 = r2
            r2 = 0
        L158:
            if (r2 >= r14) goto L173
            int r17 = r12 + r2
            r14 = r1[r17]
            r17 = r1
            r1 = 255(0xff, float:3.57E-43)
            r14 = r14 & r1
            if (r14 > r15) goto L16c
            int r1 = r11 + r2
            int r14 = r8 + r13
            r6.m14376f(r1, r14)
        L16c:
            int r2 = r2 + 1
            r1 = r17
            r14 = 8
            goto L158
        L173:
            r17 = r1
            int r13 = r13 + 1
            int r12 = r12 + r3
            r2 = r16
            goto L151
        L17b:
            r17 = r1
            r16 = r2
            int r9 = r9 + 1
            goto Lfd
        L183:
            r17 = r1
            r16 = r2
            r18 = 2
            int r7 = r7 + 1
            goto Lf3
        L18d:
            r0.f27928d = r6
            goto L1ee
        L190:
            sb.h r1 = (sb.AbstractC6014h) r1
            int r2 = r1.f23196a
            int r3 = r1.f23197b
            zb.b r4 = new zb.b
            r4.<init>(r2, r3)
            r0.m14388n(r2)
            int[] r5 = r0.f27927c
            r6 = 1
        L1a1:
            r7 = 5
            if (r6 >= r7) goto L1c8
            int r8 = r3 * r6
            int r8 = r8 / r7
            byte[] r9 = r0.f27926b
            byte[] r8 = r1.mo12493b(r8, r9)
            int r9 = r2 << 2
            int r9 = r9 / r7
            int r7 = r2 / 5
        L1b2:
            if (r7 >= r9) goto L1c4
            r10 = r8[r7]
            r11 = 255(0xff, float:3.57E-43)
            r10 = r10 & r11
            int r10 = r10 >> 3
            r11 = r5[r10]
            r12 = 1
            int r11 = r11 + r12
            r5[r10] = r11
            int r7 = r7 + 1
            goto L1b2
        L1c4:
            r12 = 1
            int r6 = r6 + 1
            goto L1a1
        L1c8:
            int r5 = m14387m(r5)
            byte[] r1 = r1.mo12492a()
            r6 = 0
        L1d1:
            if (r6 >= r3) goto L1ec
            int r7 = r6 * r2
            r8 = 0
        L1d6:
            if (r8 >= r2) goto L1e7
            int r9 = r7 + r8
            r9 = r1[r9]
            r10 = 255(0xff, float:3.57E-43)
            r9 = r9 & r10
            if (r9 >= r5) goto L1e4
            r4.m14376f(r8, r6)
        L1e4:
            int r8 = r8 + 1
            goto L1d6
        L1e7:
            r10 = 255(0xff, float:3.57E-43)
            int r6 = r6 + 1
            goto L1d1
        L1ec:
            r0.f27928d = r4
        L1ee:
            zb.b r1 = r0.f27928d
            return r1
    }

    @Override // p366v0.AbstractC6484c
    /* renamed from: e */
    public p453zb.C7269a mo13172e(int r10, p453zb.C7269a r11) {
            r9 = this;
            java.lang.Object r0 = r9.f25150a
            sb.h r0 = (sb.AbstractC6014h) r0
            int r1 = r0.f23196a
            r2 = 0
            if (r11 == 0) goto L1b
            int r3 = r11.f27901Z
            if (r3 >= r1) goto Le
            goto L1b
        Le:
            int[] r3 = r11.f27900Y
            int r3 = r3.length
            r4 = 0
        L12:
            if (r4 >= r3) goto L20
            int[] r5 = r11.f27900Y
            r5[r4] = r2
            int r4 = r4 + 1
            goto L12
        L1b:
            zb.a r11 = new zb.a
            r11.<init>(r1)
        L20:
            r9.m14388n(r1)
            byte[] r3 = r9.f27926b
            byte[] r10 = r0.mo12493b(r10, r3)
            int[] r0 = r9.f27927c
            r3 = 0
        L2c:
            r4 = 3
            r5 = 1
            if (r3 >= r1) goto L3e
            r6 = r10[r3]
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r4 = r6 >> 3
            r6 = r0[r4]
            int r6 = r6 + r5
            r0[r4] = r6
            int r3 = r3 + 1
            goto L2c
        L3e:
            int r0 = m14387m(r0)
            if (r1 >= r4) goto L52
        L44:
            if (r2 >= r1) goto L76
            r3 = r10[r2]
            r3 = r3 & 255(0xff, float:3.57E-43)
            if (r3 >= r0) goto L4f
            r11.m14370o(r2)
        L4f:
            int r2 = r2 + 1
            goto L44
        L52:
            r2 = r10[r2]
            r2 = r2 & 255(0xff, float:3.57E-43)
            r3 = r10[r5]
            r3 = r3 & 255(0xff, float:3.57E-43)
            r8 = r3
            r3 = r2
            r2 = r8
        L5d:
            int r4 = r1 + (-1)
            if (r5 >= r4) goto L76
            int r4 = r5 + 1
            r6 = r10[r4]
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r7 = r2 << 2
            int r7 = r7 - r3
            int r7 = r7 - r6
            int r7 = r7 / 2
            if (r7 >= r0) goto L72
            r11.m14370o(r5)
        L72:
            r3 = r2
            r5 = r4
            r2 = r6
            goto L5d
        L76:
            return r11
    }

    /* renamed from: n */
    public final void m14388n(int r3) {
            r2 = this;
            byte[] r0 = r2.f27926b
            int r0 = r0.length
            if (r0 >= r3) goto L9
            byte[] r3 = new byte[r3]
            r2.f27926b = r3
        L9:
            r3 = 0
            r0 = 0
        Lb:
            r1 = 32
            if (r0 >= r1) goto L16
            int[] r1 = r2.f27927c
            r1[r0] = r3
            int r0 = r0 + 1
            goto Lb
        L16:
            return
    }
}
