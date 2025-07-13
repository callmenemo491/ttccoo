package p150ic;

/* renamed from: ic.e */
/* loaded from: classes.dex */
public final class C3129e extends p150ic.AbstractC3125a {

    /* renamed from: i */
    public static final int[] f12547i = null;

    /* renamed from: j */
    public static final int[] f12548j = null;

    /* renamed from: k */
    public static final int[] f12549k = null;

    /* renamed from: l */
    public static final int[] f12550l = null;

    /* renamed from: m */
    public static final int[] f12551m = null;

    /* renamed from: n */
    public static final int[] f12552n = null;

    /* renamed from: o */
    public static final int[][] f12553o = null;

    /* renamed from: g */
    public final java.util.List<p150ic.C3128d> f12554g;

    /* renamed from: h */
    public final java.util.List<p150ic.C3128d> f12555h;

    static {
            r0 = 5
            int[] r1 = new int[r0]
            r1 = {x007a: FILL_ARRAY_DATA , data: [1, 10, 34, 70, 126} // fill-array
            p150ic.C3129e.f12547i = r1
            r1 = 4
            int[] r2 = new int[r1]
            r2 = {x0088: FILL_ARRAY_DATA , data: [4, 20, 48, 81} // fill-array
            p150ic.C3129e.f12548j = r2
            int[] r2 = new int[r0]
            r2 = {x0094: FILL_ARRAY_DATA , data: [0, 161, 961, 2015, 2715} // fill-array
            p150ic.C3129e.f12549k = r2
            int[] r2 = new int[r1]
            r2 = {x00a2: FILL_ARRAY_DATA , data: [0, 336, 1036, 1516} // fill-array
            p150ic.C3129e.f12550l = r2
            int[] r2 = new int[r0]
            r2 = {x00ae: FILL_ARRAY_DATA , data: [8, 6, 4, 3, 1} // fill-array
            p150ic.C3129e.f12551m = r2
            int[] r2 = new int[r1]
            r2 = {x00bc: FILL_ARRAY_DATA , data: [2, 4, 6, 8} // fill-array
            p150ic.C3129e.f12552n = r2
            r2 = 9
            int[][] r2 = new int[r2][]
            int[] r3 = new int[r1]
            r3 = {x00c8: FILL_ARRAY_DATA , data: [3, 8, 2, 1} // fill-array
            r4 = 0
            r2[r4] = r3
            int[] r3 = new int[r1]
            r3 = {x00d4: FILL_ARRAY_DATA , data: [3, 5, 5, 1} // fill-array
            r4 = 1
            r2[r4] = r3
            int[] r3 = new int[r1]
            r3 = {x00e0: FILL_ARRAY_DATA , data: [3, 3, 7, 1} // fill-array
            r4 = 2
            r2[r4] = r3
            int[] r3 = new int[r1]
            r3 = {x00ec: FILL_ARRAY_DATA , data: [3, 1, 9, 1} // fill-array
            r4 = 3
            r2[r4] = r3
            int[] r3 = new int[r1]
            r3 = {x00f8: FILL_ARRAY_DATA , data: [2, 7, 4, 1} // fill-array
            r2[r1] = r3
            int[] r3 = new int[r1]
            r3 = {x0104: FILL_ARRAY_DATA , data: [2, 5, 6, 1} // fill-array
            r2[r0] = r3
            int[] r0 = new int[r1]
            r0 = {x0110: FILL_ARRAY_DATA , data: [2, 3, 8, 1} // fill-array
            r3 = 6
            r2[r3] = r0
            int[] r0 = new int[r1]
            r0 = {x011c: FILL_ARRAY_DATA , data: [1, 5, 7, 1} // fill-array
            r3 = 7
            r2[r3] = r0
            int[] r0 = new int[r1]
            r0 = {x0128: FILL_ARRAY_DATA , data: [1, 3, 9, 1} // fill-array
            r1 = 8
            r2[r1] = r0
            p150ic.C3129e.f12553o = r2
            return
    }

    public C3129e() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f12554g = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f12555h = r0
            return
    }

    /* renamed from: m */
    public static void m7593m(java.util.Collection<p150ic.C3128d> r6, p150ic.C3128d r7) {
            if (r7 != 0) goto L3
            return
        L3:
            r0 = 0
            java.util.Iterator r1 = r6.iterator()
        L8:
            boolean r2 = r1.hasNext()
            r3 = 1
            if (r2 == 0) goto L21
            java.lang.Object r2 = r1.next()
            ic.d r2 = (p150ic.C3128d) r2
            int r4 = r2.f12540a
            int r5 = r7.f12540a
            if (r4 != r5) goto L8
            int r0 = r2.f12546d
            int r0 = r0 + r3
            r2.f12546d = r0
            r0 = 1
        L21:
            if (r0 != 0) goto L26
            r6.add(r7)
        L26:
            return
    }

    @Override // p129hc.AbstractC3019p, sb.InterfaceC6019m
    /* renamed from: b */
    public void mo2336b() {
            r1 = this;
            java.util.List<ic.d> r0 = r1.f12554g
            r0.clear()
            java.util.List<ic.d> r0 = r1.f12555h
            r0.clear()
            return
    }

    @Override // p129hc.AbstractC3019p
    /* renamed from: d */
    public sb.C6021o mo7401d(int r9, p453zb.C7269a r10, java.util.Map<sb.EnumC6009c, ?> r11) {
            r8 = this;
            r0 = 0
            ic.d r1 = r8.m7595o(r10, r0, r9, r11)
            java.util.List<ic.d> r2 = r8.f12554g
            m7593m(r2, r1)
            r10.m14369m()
            r1 = 1
            ic.d r9 = r8.m7595o(r10, r1, r9, r11)
            java.util.List<ic.d> r11 = r8.f12555h
            m7593m(r11, r9)
            r10.m14369m()
            java.util.List<ic.d> r9 = r8.f12554g
            java.util.Iterator r9 = r9.iterator()
        L20:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto Le5
            java.lang.Object r10 = r9.next()
            ic.d r10 = (p150ic.C3128d) r10
            int r11 = r10.f12546d
            if (r11 <= r1) goto L20
            java.util.List<ic.d> r11 = r8.f12555h
            java.util.Iterator r11 = r11.iterator()
        L36:
            boolean r2 = r11.hasNext()
            if (r2 == 0) goto L20
            java.lang.Object r2 = r11.next()
            ic.d r2 = (p150ic.C3128d) r2
            int r3 = r2.f12546d
            if (r3 <= r1) goto L36
            int r3 = r10.f12541b
            int r4 = r2.f12541b
            int r4 = r4 * 16
            int r4 = r4 + r3
            int r4 = r4 % 79
            ic.c r3 = r10.f12545c
            int r3 = r3.f12542a
            int r3 = r3 * 9
            ic.c r5 = r2.f12545c
            int r5 = r5.f12542a
            int r3 = r3 + r5
            r5 = 72
            if (r3 <= r5) goto L60
            int r3 = r3 + (-1)
        L60:
            r5 = 8
            if (r3 <= r5) goto L66
            int r3 = r3 + (-1)
        L66:
            if (r4 != r3) goto L6a
            r3 = 1
            goto L6b
        L6a:
            r3 = 0
        L6b:
            if (r3 == 0) goto L36
            int r9 = r10.f12540a
            long r3 = (long) r9
            r5 = 4537077(0x453af5, double:2.241614E-317)
            long r3 = r3 * r5
            int r9 = r2.f12540a
            long r5 = (long) r9
            long r3 = r3 + r5
            java.lang.String r9 = java.lang.String.valueOf(r3)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r3 = 14
            r11.<init>(r3)
            int r3 = r9.length()
            r4 = 13
            int r3 = 13 - r3
        L8c:
            r5 = 48
            if (r3 <= 0) goto L96
            r11.append(r5)
            int r3 = r3 + (-1)
            goto L8c
        L96:
            r11.append(r9)
            r9 = 0
            r3 = 0
        L9b:
            if (r9 >= r4) goto Lac
            char r6 = r11.charAt(r9)
            int r6 = r6 - r5
            r7 = r9 & 1
            if (r7 != 0) goto La8
            int r6 = r6 * 3
        La8:
            int r3 = r3 + r6
            int r9 = r9 + 1
            goto L9b
        Lac:
            r9 = 10
            int r3 = r3 % r9
            int r3 = 10 - r3
            if (r3 != r9) goto Lb4
            r3 = 0
        Lb4:
            r11.append(r3)
            ic.c r9 = r10.f12545c
            sb.q[] r9 = r9.f12544c
            ic.c r10 = r2.f12545c
            sb.q[] r10 = r10.f12544c
            sb.o r2 = new sb.o
            java.lang.String r11 = r11.toString()
            java.lang.String r11 = java.lang.String.valueOf(r11)
            r3 = 0
            r4 = 4
            sb.q[] r4 = new sb.C6023q[r4]
            r5 = r9[r0]
            r4[r0] = r5
            r9 = r9[r1]
            r4[r1] = r9
            r9 = 2
            r0 = r10[r0]
            r4[r9] = r0
            r9 = r10[r1]
            r10 = 3
            r4[r10] = r9
            sb.a r9 = sb.EnumC6007a.f23163k0
            r2.<init>(r11, r3, r4, r9)
            return r2
        Le5:
            sb.k r9 = sb.C6017k.f23200a0
            throw r9
    }

    /* renamed from: n */
    public final p150ic.C3126b m7594n(p453zb.C7269a r19, p150ic.C3127c r20, boolean r21) {
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            int[] r4 = r0.f12535b
            r5 = 0
            r4[r5] = r5
            r6 = 1
            r4[r6] = r5
            r7 = 2
            r4[r7] = r5
            r8 = 3
            r4[r8] = r5
            r9 = 4
            r4[r9] = r5
            r10 = 5
            r4[r10] = r5
            r11 = 6
            r4[r11] = r5
            r11 = 7
            r4[r11] = r5
            if (r3 == 0) goto L2c
            int[] r2 = r2.f12543b
            r2 = r2[r5]
            p129hc.AbstractC3019p.m7422h(r1, r2, r4)
            goto L46
        L2c:
            int[] r2 = r2.f12543b
            r2 = r2[r6]
            int r2 = r2 + r6
            p129hc.AbstractC3019p.m7421g(r1, r2, r4)
            int r1 = r4.length
            int r1 = r1 - r6
            r2 = 0
        L37:
            if (r2 >= r1) goto L46
            r11 = r4[r2]
            r12 = r4[r1]
            r4[r2] = r12
            r4[r1] = r11
            int r2 = r2 + 1
            int r1 = r1 + (-1)
            goto L37
        L46:
            if (r3 == 0) goto L4b
            r1 = 16
            goto L4d
        L4b:
            r1 = 15
        L4d:
            int r2 = p185k7.C4038x4.m9100m(r4)
            float r2 = (float) r2
            float r11 = (float) r1
            float r2 = r2 / r11
            int[] r11 = r0.f12538e
            int[] r12 = r0.f12539f
            float[] r13 = r0.f12536c
            float[] r14 = r0.f12537d
            r15 = 0
        L5d:
            int r5 = r4.length
            if (r15 >= r5) goto L8b
            r5 = r4[r15]
            float r5 = (float) r5
            float r5 = r5 / r2
            r16 = 1056964608(0x3f000000, float:0.5)
            float r7 = r5 + r16
            int r7 = (int) r7
            r8 = 8
            if (r7 > 0) goto L6f
            r7 = 1
            goto L73
        L6f:
            if (r7 <= r8) goto L73
            r7 = 8
        L73:
            int r8 = r15 / 2
            r17 = r15 & 1
            if (r17 != 0) goto L80
            r11[r8] = r7
            float r7 = (float) r7
            float r5 = r5 - r7
            r13[r8] = r5
            goto L86
        L80:
            r12[r8] = r7
            float r7 = (float) r7
            float r5 = r5 - r7
            r14[r8] = r5
        L86:
            int r15 = r15 + 1
            r7 = 2
            r8 = 3
            goto L5d
        L8b:
            int[] r2 = r0.f12538e
            int r2 = p185k7.C4038x4.m9100m(r2)
            int[] r4 = r0.f12539f
            int r4 = p185k7.C4038x4.m9100m(r4)
            r5 = 12
            r7 = 10
            if (r3 == 0) goto Lae
            if (r2 <= r5) goto La2
            r8 = 0
            r10 = 1
            goto La8
        La2:
            if (r2 >= r9) goto La6
            r8 = 1
            goto La7
        La6:
            r8 = 0
        La7:
            r10 = 0
        La8:
            if (r4 <= r5) goto Lab
            goto Lbd
        Lab:
            if (r4 >= r9) goto Lc4
            goto Lc2
        Lae:
            r8 = 11
            if (r2 <= r8) goto Lb5
            r8 = 0
            r10 = 1
            goto Lbb
        Lb5:
            if (r2 >= r10) goto Lb9
            r8 = 1
            goto Lba
        Lb9:
            r8 = 0
        Lba:
            r10 = 0
        Lbb:
            if (r4 <= r7) goto Lc0
        Lbd:
            r13 = 0
            r14 = 1
            goto Lc6
        Lc0:
            if (r4 >= r9) goto Lc4
        Lc2:
            r13 = 1
            goto Lc5
        Lc4:
            r13 = 0
        Lc5:
            r14 = 0
        Lc6:
            int r15 = r2 + r4
            int r15 = r15 - r1
            r1 = r2 & 1
            if (r1 != r3) goto Lcf
            r1 = 1
            goto Ld0
        Lcf:
            r1 = 0
        Ld0:
            r7 = r4 & 1
            if (r7 != r6) goto Ld6
            r7 = 1
            goto Ld7
        Ld6:
            r7 = 0
        Ld7:
            if (r15 != r6) goto Le7
            if (r1 == 0) goto Le1
            if (r7 != 0) goto Lde
            goto L106
        Lde:
            sb.k r1 = sb.C6017k.f23200a0
            throw r1
        Le1:
            if (r7 == 0) goto Le4
            goto L103
        Le4:
            sb.k r1 = sb.C6017k.f23200a0
            throw r1
        Le7:
            r9 = -1
            if (r15 != r9) goto Lfa
            if (r1 == 0) goto Lf3
            if (r7 != 0) goto Lf0
            r8 = 1
            goto L10d
        Lf0:
            sb.k r1 = sb.C6017k.f23200a0
            throw r1
        Lf3:
            if (r7 == 0) goto Lf7
            r13 = 1
            goto L10d
        Lf7:
            sb.k r1 = sb.C6017k.f23200a0
            throw r1
        Lfa:
            if (r15 != 0) goto L1ca
            if (r1 == 0) goto L10b
            if (r7 == 0) goto L108
            if (r2 >= r4) goto L105
            r8 = 1
        L103:
            r14 = 1
            goto L10d
        L105:
            r13 = 1
        L106:
            r10 = 1
            goto L10d
        L108:
            sb.k r1 = sb.C6017k.f23200a0
            throw r1
        L10b:
            if (r7 != 0) goto L1c7
        L10d:
            if (r8 == 0) goto L11c
            if (r10 != 0) goto L119
            int[] r1 = r0.f12538e
            float[] r2 = r0.f12536c
            p150ic.AbstractC3125a.m7590j(r1, r2)
            goto L11c
        L119:
            sb.k r1 = sb.C6017k.f23200a0
            throw r1
        L11c:
            if (r10 == 0) goto L125
            int[] r1 = r0.f12538e
            float[] r2 = r0.f12536c
            p150ic.AbstractC3125a.m7589i(r1, r2)
        L125:
            if (r13 == 0) goto L134
            if (r14 != 0) goto L131
            int[] r1 = r0.f12539f
            float[] r2 = r0.f12536c
            p150ic.AbstractC3125a.m7590j(r1, r2)
            goto L134
        L131:
            sb.k r1 = sb.C6017k.f23200a0
            throw r1
        L134:
            if (r14 == 0) goto L13d
            int[] r1 = r0.f12539f
            float[] r2 = r0.f12537d
            p150ic.AbstractC3125a.m7589i(r1, r2)
        L13d:
            int r1 = r11.length
            int r1 = r1 - r6
            r2 = 0
            r4 = 0
        L141:
            if (r1 < 0) goto L14e
            int r2 = r2 * 9
            r7 = r11[r1]
            int r2 = r2 + r7
            r7 = r11[r1]
            int r4 = r4 + r7
            int r1 = r1 + (-1)
            goto L141
        L14e:
            int r1 = r12.length
            int r1 = r1 - r6
            r7 = 0
            r8 = 0
        L152:
            if (r1 < 0) goto L15f
            int r7 = r7 * 9
            r9 = r12[r1]
            int r7 = r7 + r9
            r9 = r12[r1]
            int r8 = r8 + r9
            int r1 = r1 + (-1)
            goto L152
        L15f:
            r1 = 3
            int r7 = r7 * 3
            int r7 = r7 + r2
            if (r3 == 0) goto L195
            r1 = r4 & 1
            if (r1 != 0) goto L192
            if (r4 > r5) goto L192
            r1 = 4
            if (r4 < r1) goto L192
            int r5 = r5 - r4
            r1 = 2
            int r5 = r5 / r1
            int[] r1 = p150ic.C3129e.f12551m
            r1 = r1[r5]
            int r2 = 9 - r1
            r3 = 0
            int r1 = p185k7.C3836i.m8621f(r11, r1, r3)
            int r2 = p185k7.C3836i.m8621f(r12, r2, r6)
            int[] r3 = p150ic.C3129e.f12547i
            r3 = r3[r5]
            int[] r4 = p150ic.C3129e.f12549k
            r4 = r4[r5]
            ic.b r5 = new ic.b
            int r1 = r1 * r3
            int r1 = r1 + r2
            int r1 = r1 + r4
            r5.<init>(r1, r7)
            return r5
        L192:
            sb.k r1 = sb.C6017k.f23200a0
            throw r1
        L195:
            r1 = r8 & 1
            if (r1 != 0) goto L1c4
            r1 = 10
            if (r8 > r1) goto L1c4
            r2 = 4
            if (r8 < r2) goto L1c4
            int r1 = r1 - r8
            r2 = 2
            int r1 = r1 / r2
            int[] r2 = p150ic.C3129e.f12552n
            r2 = r2[r1]
            int r3 = 9 - r2
            int r2 = p185k7.C3836i.m8621f(r11, r2, r6)
            r4 = 0
            int r3 = p185k7.C3836i.m8621f(r12, r3, r4)
            int[] r4 = p150ic.C3129e.f12548j
            r4 = r4[r1]
            int[] r5 = p150ic.C3129e.f12550l
            r1 = r5[r1]
            ic.b r5 = new ic.b
            int r3 = r3 * r4
            int r3 = r3 + r2
            int r3 = r3 + r1
            r5.<init>(r3, r7)
            return r5
        L1c4:
            sb.k r1 = sb.C6017k.f23200a0
            throw r1
        L1c7:
            sb.k r1 = sb.C6017k.f23200a0
            throw r1
        L1ca:
            sb.k r1 = sb.C6017k.f23200a0
            throw r1
    }

    /* renamed from: o */
    public final p150ic.C3128d m7595o(p453zb.C7269a r7, boolean r8, int r9, java.util.Map<sb.EnumC6009c, ?> r10) {
            r6 = this;
            r0 = 0
            r1 = 0
            int[] r2 = r6.m7596p(r7, r1, r8)     // Catch: sb.C6017k -> L4f
            ic.c r3 = r6.m7597q(r7, r9, r8, r2)     // Catch: sb.C6017k -> L4f
            if (r10 != 0) goto Le
            r10 = r0
            goto L16
        Le:
            sb.c r4 = sb.EnumC6009c.f23178h0     // Catch: sb.C6017k -> L4f
            java.lang.Object r10 = r10.get(r4)     // Catch: sb.C6017k -> L4f
            sb.r r10 = (sb.InterfaceC6024r) r10     // Catch: sb.C6017k -> L4f
        L16:
            r4 = 1
            if (r10 == 0) goto L33
            r5 = r2[r1]     // Catch: sb.C6017k -> L4f
            r2 = r2[r4]     // Catch: sb.C6017k -> L4f
            int r5 = r5 + r2
            float r2 = (float) r5     // Catch: sb.C6017k -> L4f
            r5 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r5
            if (r8 == 0) goto L2a
            int r8 = r7.f27901Z     // Catch: sb.C6017k -> L4f
            int r8 = r8 - r4
            float r8 = (float) r8     // Catch: sb.C6017k -> L4f
            float r2 = r8 - r2
        L2a:
            sb.q r8 = new sb.q     // Catch: sb.C6017k -> L4f
            float r9 = (float) r9     // Catch: sb.C6017k -> L4f
            r8.<init>(r2, r9)     // Catch: sb.C6017k -> L4f
            r10.mo12503a(r8)     // Catch: sb.C6017k -> L4f
        L33:
            ic.b r8 = r6.m7594n(r7, r3, r4)     // Catch: sb.C6017k -> L4f
            ic.b r7 = r6.m7594n(r7, r3, r1)     // Catch: sb.C6017k -> L4f
            ic.d r9 = new ic.d     // Catch: sb.C6017k -> L4f
            int r10 = r8.f12540a     // Catch: sb.C6017k -> L4f
            int r10 = r10 * 1597
            int r1 = r7.f12540a     // Catch: sb.C6017k -> L4f
            int r10 = r10 + r1
            int r8 = r8.f12541b     // Catch: sb.C6017k -> L4f
            int r7 = r7.f12541b     // Catch: sb.C6017k -> L4f
            int r7 = r7 * 4
            int r7 = r7 + r8
            r9.<init>(r10, r7, r3)     // Catch: sb.C6017k -> L4f
            return r9
        L4f:
            return r0
    }

    /* renamed from: p */
    public final int[] m7596p(p453zb.C7269a r11, int r12, boolean r13) {
            r10 = this;
            int[] r0 = r10.f12534a
            r1 = 0
            r0[r1] = r1
            r2 = 1
            r0[r2] = r1
            r3 = 2
            r0[r3] = r1
            r4 = 3
            r0[r4] = r1
            int r5 = r11.f27901Z
            r6 = 0
        L11:
            if (r12 >= r5) goto L1d
            boolean r6 = r11.m14364e(r12)
            r6 = r6 ^ r2
            if (r13 == r6) goto L1d
            int r12 = r12 + 1
            goto L11
        L1d:
            r13 = r12
            r7 = 0
        L1f:
            if (r12 >= r5) goto L5b
            boolean r8 = r11.m14364e(r12)
            r8 = r8 ^ r6
            if (r8 == 0) goto L2e
            r8 = r0[r7]
            int r8 = r8 + r2
            r0[r7] = r8
            goto L58
        L2e:
            if (r7 != r4) goto L52
            boolean r8 = p150ic.AbstractC3125a.m7591k(r0)
            if (r8 == 0) goto L3d
            int[] r11 = new int[r3]
            r11[r1] = r13
            r11[r2] = r12
            return r11
        L3d:
            r8 = r0[r1]
            r9 = r0[r2]
            int r8 = r8 + r9
            int r13 = r13 + r8
            r8 = r0[r3]
            r0[r1] = r8
            r8 = r0[r4]
            r0[r2] = r8
            r0[r3] = r1
            r0[r4] = r1
            int r7 = r7 + (-1)
            goto L54
        L52:
            int r7 = r7 + 1
        L54:
            r0[r7] = r2
            r6 = r6 ^ 1
        L58:
            int r12 = r12 + 1
            goto L1f
        L5b:
            sb.k r11 = sb.C6017k.f23200a0
            throw r11
    }

    /* renamed from: q */
    public final p150ic.C3127c m7597q(p453zb.C7269a r12, int r13, boolean r14, int[] r15) {
            r11 = this;
            r0 = 0
            r1 = r15[r0]
            boolean r1 = r12.m14364e(r1)
            r2 = r15[r0]
            r3 = 1
            int r2 = r2 - r3
        Lb:
            if (r2 < 0) goto L17
            boolean r4 = r12.m14364e(r2)
            r4 = r4 ^ r1
            if (r4 == 0) goto L17
            int r2 = r2 + (-1)
            goto Lb
        L17:
            int r2 = r2 + r3
            r1 = r15[r0]
            int r1 = r1 - r2
            int[] r4 = r11.f12534a
            int r5 = r4.length
            int r5 = r5 - r3
            java.lang.System.arraycopy(r4, r0, r4, r3, r5)
            r4[r0] = r1
            int[][] r1 = p150ic.C3129e.f12553o
            int r6 = p150ic.AbstractC3125a.m7592l(r4, r1)
            r1 = r15[r3]
            if (r14 == 0) goto L38
            int r12 = r12.f27901Z
            int r14 = r12 + (-1)
            int r14 = r14 - r2
            int r12 = r12 - r3
            int r12 = r12 - r1
            r9 = r12
            r8 = r14
            goto L3a
        L38:
            r9 = r1
            r8 = r2
        L3a:
            ic.c r12 = new ic.c
            r14 = 2
            int[] r7 = new int[r14]
            r7[r0] = r2
            r14 = r15[r3]
            r7[r3] = r14
            r5 = r12
            r10 = r13
            r5.<init>(r6, r7, r8, r9, r10)
            return r12
    }
}
