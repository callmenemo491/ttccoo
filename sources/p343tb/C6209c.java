package p343tb;

/* renamed from: tb.c */
/* loaded from: classes.dex */
public final class C6209c implements sb.InterfaceC6025s {

    /* renamed from: Y */
    public static final java.nio.charset.Charset f24160Y = null;

    static {
            java.lang.String r0 = "ISO-8859-1"
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)
            p343tb.C6209c.f24160Y = r0
            return
    }

    public C6209c() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // sb.InterfaceC6025s
    /* renamed from: d */
    public p453zb.C7270b mo7086d(java.lang.String r19, sb.EnumC6007a r20, int r21, int r22, java.util.Map<sb.EnumC6011e, ?> r23) {
            r18 = this;
            r0 = r20
            r1 = r23
            java.nio.charset.Charset r2 = p343tb.C6209c.f24160Y
            r3 = 0
            r4 = 33
            if (r1 == 0) goto L48
            sb.e r5 = sb.EnumC6011e.f23183Z
            boolean r6 = r1.containsKey(r5)
            if (r6 == 0) goto L1f
            java.lang.Object r2 = r1.get(r5)
            java.lang.String r2 = r2.toString()
            java.nio.charset.Charset r2 = java.nio.charset.Charset.forName(r2)
        L1f:
            sb.e r5 = sb.EnumC6011e.f23182Y
            boolean r6 = r1.containsKey(r5)
            if (r6 == 0) goto L33
            java.lang.Object r4 = r1.get(r5)
            java.lang.String r4 = r4.toString()
            int r4 = java.lang.Integer.parseInt(r4)
        L33:
            sb.e r5 = sb.EnumC6011e.f23191h0
            boolean r6 = r1.containsKey(r5)
            if (r6 == 0) goto L48
            java.lang.Object r1 = r1.get(r5)
            java.lang.String r1 = r1.toString()
            int r1 = java.lang.Integer.parseInt(r1)
            goto L49
        L48:
            r1 = 0
        L49:
            sb.a r5 = sb.EnumC6007a.f23151Y
            if (r0 != r5) goto L450
            r5 = r19
            byte[] r0 = r5.getBytes(r2)
            wb.d r2 = new wb.d
            r2.<init>(r0)
            wb.e r0 = p393wb.C6828e.f26568e
            java.util.List r0 = java.util.Collections.singletonList(r0)
            r5 = 0
        L5f:
            byte[] r6 = r2.f26567a
            int r7 = r6.length
            r8 = 32
            r9 = 10
            r10 = 3
            r11 = 4
            r12 = 2
            r13 = 1
            if (r5 >= r7) goto L16f
            int r7 = r5 + 1
            int r14 = r6.length
            if (r7 >= r14) goto L74
            r14 = r6[r7]
            goto L75
        L74:
            r14 = 0
        L75:
            r6 = r6[r5]
            r15 = 13
            if (r6 == r15) goto L94
            r9 = 44
            if (r6 == r9) goto L90
            r9 = 46
            if (r6 == r9) goto L8c
            r9 = 58
            if (r6 == r9) goto L88
            goto L98
        L88:
            if (r14 != r8) goto L98
            r6 = 5
            goto L99
        L8c:
            if (r14 != r8) goto L98
            r6 = 3
            goto L99
        L90:
            if (r14 != r8) goto L98
            r6 = 4
            goto L99
        L94:
            if (r14 != r9) goto L98
            r6 = 2
            goto L99
        L98:
            r6 = 0
        L99:
            if (r6 <= 0) goto Lee
            java.util.LinkedList r8 = new java.util.LinkedList
            r8.<init>()
            java.util.Iterator r0 = r0.iterator()
        La4:
            boolean r9 = r0.hasNext()
            if (r9 == 0) goto Le7
            java.lang.Object r9 = r0.next()
            wb.e r9 = (p393wb.C6828e) r9
            wb.e r14 = r9.m13910b(r5)
            wb.e r15 = r14.m13912d(r11, r6)
            r8.add(r15)
            int r15 = r9.f26569a
            if (r15 == r11) goto Lc6
            wb.e r15 = r14.m13913e(r11, r6)
            r8.add(r15)
        Lc6:
            if (r6 == r10) goto Lca
            if (r6 != r11) goto Ld7
        Lca:
            int r15 = 16 - r6
            wb.e r14 = r14.m13912d(r12, r15)
            wb.e r14 = r14.m13912d(r12, r13)
            r8.add(r14)
        Ld7:
            int r14 = r9.f26571c
            if (r14 <= 0) goto La4
            wb.e r9 = r9.m13909a(r5)
            wb.e r9 = r9.m13909a(r7)
            r8.add(r9)
            goto La4
        Le7:
            java.util.Collection r0 = p393wb.C6827d.m13908a(r8)
            r5 = r7
            goto L16c
        Lee:
            java.util.LinkedList r6 = new java.util.LinkedList
            r6.<init>()
            java.util.Iterator r0 = r0.iterator()
        Lf7:
            boolean r7 = r0.hasNext()
            if (r7 == 0) goto L168
            java.lang.Object r7 = r0.next()
            wb.e r7 = (p393wb.C6828e) r7
            byte[] r8 = r2.f26567a
            r8 = r8[r5]
            r8 = r8 & 255(0xff, float:3.57E-43)
            char r8 = (char) r8
            int[][] r9 = p393wb.C6827d.f26565d
            int r10 = r7.f26569a
            r9 = r9[r10]
            r9 = r9[r8]
            if (r9 <= 0) goto L116
            r9 = 1
            goto L117
        L116:
            r9 = 0
        L117:
            r10 = 0
            r14 = 0
        L119:
            if (r10 > r11) goto L150
            int[][] r11 = p393wb.C6827d.f26565d
            r11 = r11[r10]
            r11 = r11[r8]
            if (r11 <= 0) goto L14b
            if (r14 != 0) goto L129
            wb.e r14 = r7.m13910b(r5)
        L129:
            if (r9 == 0) goto L131
            int r15 = r7.f26569a
            if (r10 == r15) goto L131
            if (r10 != r12) goto L138
        L131:
            wb.e r12 = r14.m13912d(r10, r11)
            r6.add(r12)
        L138:
            if (r9 != 0) goto L14b
            int[][] r12 = p393wb.C6827d.f26566e
            int r15 = r7.f26569a
            r12 = r12[r15]
            r12 = r12[r10]
            if (r12 < 0) goto L14b
            wb.e r11 = r14.m13913e(r10, r11)
            r6.add(r11)
        L14b:
            int r10 = r10 + 1
            r11 = 4
            r12 = 2
            goto L119
        L150:
            int r9 = r7.f26571c
            if (r9 > 0) goto L15e
            int[][] r9 = p393wb.C6827d.f26565d
            int r10 = r7.f26569a
            r9 = r9[r10]
            r8 = r9[r8]
            if (r8 != 0) goto L165
        L15e:
            wb.e r7 = r7.m13909a(r5)
            r6.add(r7)
        L165:
            r11 = 4
            r12 = 2
            goto Lf7
        L168:
            java.util.Collection r0 = p393wb.C6827d.m13908a(r6)
        L16c:
            int r5 = r5 + r13
            goto L5f
        L16f:
            wb.c r5 = new wb.c
            r5.<init>(r2)
            java.lang.Object r0 = java.util.Collections.min(r0, r5)
            wb.e r0 = (p393wb.C6828e) r0
            byte[] r2 = r2.f26567a
            java.util.Objects.requireNonNull(r0)
            java.util.LinkedList r5 = new java.util.LinkedList
            r5.<init>()
            int r6 = r2.length
            wb.e r0 = r0.m13910b(r6)
            wb.f r0 = r0.f26570b
        L18b:
            if (r0 == 0) goto L193
            r5.addFirst(r0)
            wb.f r0 = r0.f26574a
            goto L18b
        L193:
            zb.a r0 = new zb.a
            r0.<init>()
            java.util.Iterator r5 = r5.iterator()
        L19c:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L1ac
            java.lang.Object r6 = r5.next()
            wb.f r6 = (p393wb.AbstractC6829f) r6
            r6.mo13904b(r0, r2)
            goto L19c
        L1ac:
            int r2 = r0.f27901Z
            r5 = 100
            r6 = 11
            int r4 = p121h4.C2484y.m6352a(r4, r2, r5, r6)
            int r2 = r2 + r4
            if (r1 == 0) goto L20e
            if (r1 >= 0) goto L1bd
            r2 = 1
            goto L1be
        L1bd:
            r2 = 0
        L1be:
            int r5 = java.lang.Math.abs(r1)
            if (r2 == 0) goto L1c5
            r8 = 4
        L1c5:
            if (r5 > r8) goto L1fa
            if (r2 == 0) goto L1cc
            r1 = 88
            goto L1ce
        L1cc:
            r1 = 112(0x70, float:1.57E-43)
        L1ce:
            int r3 = r5 << 4
            int r1 = r1 + r3
            int r1 = r1 * r5
            int[] r3 = p393wb.C6825b.f26562a
            r3 = r3[r5]
            int r7 = r1 % r3
            int r7 = r1 - r7
            zb.a r0 = p393wb.C6825b.m13907c(r0, r3)
            int r8 = r0.f27901Z
            int r4 = r4 + r8
            java.lang.String r9 = "Data to large for user specified layer"
            if (r4 > r7) goto L1f4
            if (r2 == 0) goto L255
            int r4 = r3 << 6
            if (r8 > r4) goto L1ee
            goto L255
        L1ee:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r9)
            throw r0
        L1f4:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r9)
            throw r0
        L1fa:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.Object[] r2 = new java.lang.Object[r13]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2[r3] = r1
            java.lang.String r1 = "Illegal value %s for layers"
            java.lang.String r1 = java.lang.String.format(r1, r2)
            r0.<init>(r1)
            throw r0
        L20e:
            r1 = 0
            r3 = 0
            r5 = 0
        L211:
            if (r1 > r8) goto L448
            if (r1 > r10) goto L217
            r7 = 1
            goto L218
        L217:
            r7 = 0
        L218:
            if (r7 == 0) goto L21d
            int r8 = r1 + 1
            goto L21e
        L21d:
            r8 = r1
        L21e:
            if (r7 == 0) goto L223
            r9 = 88
            goto L225
        L223:
            r9 = 112(0x70, float:1.57E-43)
        L225:
            int r11 = r8 << 4
            int r9 = r9 + r11
            int r9 = r9 * r8
            if (r2 > r9) goto L43b
            int[] r11 = p393wb.C6825b.f26562a
            r12 = r11[r8]
            if (r5 == r12) goto L23d
            r3 = r11[r8]
            zb.a r5 = p393wb.C6825b.m13907c(r0, r3)
            r17 = r5
            r5 = r3
            r3 = r17
        L23d:
            int r11 = r9 % r5
            int r11 = r9 - r11
            if (r7 == 0) goto L249
            int r12 = r3.f27901Z
            int r14 = r5 << 6
            if (r12 > r14) goto L43b
        L249:
            int r12 = r3.f27901Z
            int r12 = r12 + r4
            if (r12 <= r11) goto L250
            goto L43b
        L250:
            r0 = r3
            r3 = r5
            r2 = r7
            r5 = r8
            r1 = r9
        L255:
            zb.a r1 = p393wb.C6825b.m13906b(r0, r1, r3)
            int r0 = r0.f27901Z
            int r0 = r0 / r3
            zb.a r3 = new zb.a
            r3.<init>()
            int r4 = r5 + (-1)
            if (r2 == 0) goto L272
            r7 = 2
            r3.m14362c(r4, r7)
            int r0 = r0 + (-1)
            r4 = 6
            r3.m14362c(r0, r4)
            r0 = 28
            goto L27d
        L272:
            r7 = 5
            r3.m14362c(r4, r7)
            int r0 = r0 + (-1)
            r3.m14362c(r0, r6)
            r0 = 40
        L27d:
            r4 = 4
            zb.a r0 = p393wb.C6825b.m13906b(r3, r0, r4)
            if (r2 == 0) goto L285
            goto L287
        L285:
            r6 = 14
        L287:
            int r3 = r5 << 2
            int r6 = r6 + r3
            int[] r3 = new int[r6]
            if (r2 == 0) goto L298
            r4 = 0
        L28f:
            if (r4 >= r6) goto L296
            r3[r4] = r4
            int r4 = r4 + 1
            goto L28f
        L296:
            r8 = r6
            goto L2bd
        L298:
            int r4 = r6 + 1
            int r7 = r6 / 2
            int r8 = r7 + (-1)
            int r8 = r8 / 15
            int r8 = r8 * 2
            int r8 = r8 + r4
            int r4 = r8 / 2
            r9 = 0
        L2a6:
            if (r9 >= r7) goto L2bd
            int r10 = r9 / 15
            int r10 = r10 + r9
            int r11 = r7 - r9
            int r11 = r11 - r13
            int r12 = r4 - r10
            int r12 = r12 + (-1)
            r3[r11] = r12
            int r11 = r7 + r9
            int r10 = r10 + r4
            int r10 = r10 + r13
            r3[r11] = r10
            int r9 = r9 + 1
            goto L2a6
        L2bd:
            zb.b r4 = new zb.b
            r4.<init>(r8, r8)
            r7 = 0
            r9 = 0
        L2c4:
            if (r7 >= r5) goto L34c
            int r10 = r5 - r7
            int r10 = r10 << 2
            if (r2 == 0) goto L2cf
            r11 = 9
            goto L2d1
        L2cf:
            r11 = 12
        L2d1:
            int r10 = r10 + r11
            r11 = 0
        L2d3:
            if (r11 >= r10) goto L345
            int r12 = r11 << 1
            r13 = 0
        L2d8:
            r14 = 2
            if (r13 >= r14) goto L342
            int r14 = r9 + r12
            int r14 = r14 + r13
            boolean r14 = r1.m14364e(r14)
            if (r14 == 0) goto L2f0
            int r14 = r7 << 1
            int r15 = r14 + r13
            r15 = r3[r15]
            int r14 = r14 + r11
            r14 = r3[r14]
            r4.m14376f(r15, r14)
        L2f0:
            int r14 = r10 << 1
            int r14 = r14 + r9
            int r14 = r14 + r12
            int r14 = r14 + r13
            boolean r14 = r1.m14364e(r14)
            if (r14 == 0) goto L30c
            int r14 = r7 << 1
            int r15 = r14 + r11
            r15 = r3[r15]
            int r16 = r6 + (-1)
            int r16 = r16 - r14
            int r16 = r16 - r13
            r14 = r3[r16]
            r4.m14376f(r15, r14)
        L30c:
            int r14 = r10 << 2
            int r14 = r14 + r9
            int r14 = r14 + r12
            int r14 = r14 + r13
            boolean r14 = r1.m14364e(r14)
            if (r14 == 0) goto L326
            int r14 = r6 + (-1)
            int r15 = r7 << 1
            int r14 = r14 - r15
            int r15 = r14 - r13
            r15 = r3[r15]
            int r14 = r14 - r11
            r14 = r3[r14]
            r4.m14376f(r15, r14)
        L326:
            int r14 = r10 * 6
            int r14 = r14 + r9
            int r14 = r14 + r12
            int r14 = r14 + r13
            boolean r14 = r1.m14364e(r14)
            if (r14 == 0) goto L33f
            int r14 = r6 + (-1)
            int r15 = r7 << 1
            int r14 = r14 - r15
            int r14 = r14 - r11
            r14 = r3[r14]
            int r15 = r15 + r13
            r15 = r3[r15]
            r4.m14376f(r14, r15)
        L33f:
            int r13 = r13 + 1
            goto L2d8
        L342:
            int r11 = r11 + 1
            goto L2d3
        L345:
            int r10 = r10 << 3
            int r9 = r9 + r10
            int r7 = r7 + 1
            goto L2c4
        L34c:
            int r1 = r8 / 2
            r3 = 7
            r5 = 0
            if (r2 == 0) goto L38c
        L352:
            if (r5 >= r3) goto L3cb
            int r7 = r1 + (-3)
            int r7 = r7 + r5
            boolean r9 = r0.m14364e(r5)
            if (r9 == 0) goto L362
            int r9 = r1 + (-5)
            r4.m14376f(r7, r9)
        L362:
            int r9 = r5 + 7
            boolean r9 = r0.m14364e(r9)
            if (r9 == 0) goto L36f
            int r9 = r1 + 5
            r4.m14376f(r9, r7)
        L36f:
            int r9 = 20 - r5
            boolean r9 = r0.m14364e(r9)
            if (r9 == 0) goto L37c
            int r9 = r1 + 5
            r4.m14376f(r7, r9)
        L37c:
            int r9 = 27 - r5
            boolean r9 = r0.m14364e(r9)
            if (r9 == 0) goto L389
            int r9 = r1 + (-5)
            r4.m14376f(r9, r7)
        L389:
            int r5 = r5 + 1
            goto L352
        L38c:
            r7 = 10
        L38e:
            if (r5 >= r7) goto L3cb
            int r9 = r1 + (-5)
            int r9 = r9 + r5
            int r10 = r5 / 5
            int r10 = r10 + r9
            boolean r9 = r0.m14364e(r5)
            if (r9 == 0) goto L3a1
            int r9 = r1 + (-7)
            r4.m14376f(r10, r9)
        L3a1:
            int r9 = r5 + 10
            boolean r9 = r0.m14364e(r9)
            if (r9 == 0) goto L3ae
            int r9 = r1 + 7
            r4.m14376f(r9, r10)
        L3ae:
            int r9 = 29 - r5
            boolean r9 = r0.m14364e(r9)
            if (r9 == 0) goto L3bb
            int r9 = r1 + 7
            r4.m14376f(r10, r9)
        L3bb:
            int r9 = 39 - r5
            boolean r9 = r0.m14364e(r9)
            if (r9 == 0) goto L3c8
            int r9 = r1 + (-7)
            r4.m14376f(r9, r10)
        L3c8:
            int r5 = r5 + 1
            goto L38e
        L3cb:
            if (r2 == 0) goto L3d2
            r0 = 5
            p393wb.C6825b.m13905a(r4, r1, r0)
            goto L3f9
        L3d2:
            p393wb.C6825b.m13905a(r4, r1, r3)
            r0 = 0
            r2 = 0
        L3d7:
            int r3 = r6 / 2
            int r3 = r3 + (-1)
            if (r0 >= r3) goto L3f9
            r3 = r1 & 1
        L3df:
            if (r3 >= r8) goto L3f4
            int r5 = r1 - r2
            r4.m14376f(r5, r3)
            int r7 = r1 + r2
            r4.m14376f(r7, r3)
            r4.m14376f(r3, r5)
            r4.m14376f(r3, r7)
            int r3 = r3 + 2
            goto L3df
        L3f4:
            int r0 = r0 + 15
            int r2 = r2 + 16
            goto L3d7
        L3f9:
            int r0 = r4.f27902Y
            int r1 = r4.f27903Z
            r7 = r21
            int r2 = java.lang.Math.max(r7, r0)
            r8 = r22
            int r3 = java.lang.Math.max(r8, r1)
            int r5 = r2 / r0
            int r6 = r3 / r1
            int r5 = java.lang.Math.min(r5, r6)
            int r6 = r0 * r5
            int r6 = r2 - r6
            int r6 = r6 / 2
            int r7 = r1 * r5
            int r7 = r3 - r7
            int r7 = r7 / 2
            zb.b r8 = new zb.b
            r8.<init>(r2, r3)
            r2 = 0
        L423:
            if (r2 >= r1) goto L43a
            r3 = 0
            r9 = r6
        L427:
            if (r3 >= r0) goto L436
            boolean r10 = r4.m14372b(r3, r2)
            if (r10 == 0) goto L432
            r8.m14377g(r9, r7, r5, r5)
        L432:
            int r3 = r3 + 1
            int r9 = r9 + r5
            goto L427
        L436:
            int r2 = r2 + 1
            int r7 = r7 + r5
            goto L423
        L43a:
            return r8
        L43b:
            r7 = r21
            r8 = r22
            int r1 = r1 + 1
            r9 = 32
            r13 = 1
            r8 = 32
            goto L211
        L448:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Data too large for an Aztec code"
            r0.<init>(r1)
            throw r0
        L450:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Can only encode AZTEC, but got "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
    }
}
