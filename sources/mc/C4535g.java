package mc;

/* renamed from: mc.g */
/* loaded from: classes.dex */
public final class C4535g {

    /* renamed from: a */
    public static final p124h7.C2839rb f18439a = null;

    static {
            h7.rb r0 = new h7.rb
            r1 = 21
            r0.<init>(r1)
            mc.C4535g.f18439a = r0
            return
    }

    /* renamed from: a */
    public static mc.C4531c m10443a(mc.C4533e r15) {
            r0 = 0
            if (r15 != 0) goto L4
            return r0
        L4:
            mc.a r1 = r15.m10441A()
            r2 = -1
            r3 = 0
            r4 = 1
            if (r1 != 0) goto L10
            r5 = r0
            goto L7e
        L10:
            wa.b<s9.a> r5 = r15.f12118b
            mc.c r5 = (mc.C4531c) r5
            boolean r6 = r15.f18437d
            if (r6 == 0) goto L1b
            sb.q r7 = r5.f18425b
            goto L1d
        L1b:
            sb.q r7 = r5.f18427d
        L1d:
            if (r6 == 0) goto L22
            sb.q r5 = r5.f18426c
            goto L24
        L22:
            sb.q r5 = r5.f18428e
        L24:
            float r6 = r7.f23223b
            int r6 = (int) r6
            int r6 = r15.m7391r(r6)
            float r5 = r5.f23223b
            int r5 = (int) r5
            int r5 = r15.m7391r(r5)
            java.util.Map<java.lang.String, java.lang.String> r7 = r15.f12119c
            mc.a[] r7 = (mc.C4529a[]) r7
            r8 = -1
            r9 = 0
            r10 = 1
        L39:
            if (r6 >= r5) goto L62
            r11 = r7[r6]
            if (r11 == 0) goto L5f
            r11 = r7[r6]
            r11.m10435b()
            int r12 = r11.f18422f
            int r13 = r12 - r8
            if (r13 != 0) goto L4d
            int r9 = r9 + 1
            goto L5f
        L4d:
            if (r13 != r4) goto L56
            int r10 = java.lang.Math.max(r10, r9)
            int r8 = r11.f18422f
            goto L5e
        L56:
            int r11 = r1.f18422f
            if (r12 < r11) goto L5d
            r7[r6] = r0
            goto L5f
        L5d:
            r8 = r12
        L5e:
            r9 = 1
        L5f:
            int r6 = r6 + 1
            goto L39
        L62:
            int r1 = r1.f18422f
            int[] r5 = new int[r1]
            java.util.Map<java.lang.String, java.lang.String> r6 = r15.f12119c
            mc.a[] r6 = (mc.C4529a[]) r6
            int r7 = r6.length
            r8 = 0
        L6c:
            if (r8 >= r7) goto L7e
            r9 = r6[r8]
            if (r9 == 0) goto L7b
            int r9 = r9.f18422f
            if (r9 >= r1) goto L7b
            r10 = r5[r9]
            int r10 = r10 + r4
            r5[r9] = r10
        L7b:
            int r8 = r8 + 1
            goto L6c
        L7e:
            if (r5 != 0) goto L81
            return r0
        L81:
            int r0 = r5.length
            r1 = 0
            r6 = -1
        L84:
            if (r1 >= r0) goto L8f
            r7 = r5[r1]
            int r6 = java.lang.Math.max(r6, r7)
            int r1 = r1 + 1
            goto L84
        L8f:
            int r0 = r5.length
            r1 = 0
            r7 = 0
        L92:
            if (r1 >= r0) goto L9e
            r8 = r5[r1]
            int r9 = r6 - r8
            int r7 = r7 + r9
            if (r8 > 0) goto L9e
            int r1 = r1 + 1
            goto L92
        L9e:
            java.util.Map<java.lang.String, java.lang.String> r0 = r15.f12119c
            mc.a[] r0 = (mc.C4529a[]) r0
            r1 = 0
        La3:
            if (r7 <= 0) goto Lae
            r8 = r0[r1]
            if (r8 != 0) goto Lae
            int r7 = r7 + (-1)
            int r1 = r1 + 1
            goto La3
        Lae:
            int r1 = r5.length
            int r1 = r1 - r4
            r8 = 0
        Lb1:
            if (r1 < 0) goto Lbf
            r9 = r5[r1]
            int r9 = r6 - r9
            int r8 = r8 + r9
            r9 = r5[r1]
            if (r9 > 0) goto Lbf
            int r1 = r1 + (-1)
            goto Lb1
        Lbf:
            int r1 = r0.length
            int r1 = r1 - r4
        Lc1:
            if (r8 <= 0) goto Lcc
            r4 = r0[r1]
            if (r4 != 0) goto Lcc
            int r8 = r8 + (-1)
            int r1 = r1 + (-1)
            goto Lc1
        Lcc:
            wa.b<s9.a> r0 = r15.f12118b
            mc.c r0 = (mc.C4531c) r0
            boolean r15 = r15.f18437d
            sb.q r1 = r0.f18425b
            sb.q r4 = r0.f18426c
            sb.q r5 = r0.f18427d
            sb.q r6 = r0.f18428e
            if (r7 <= 0) goto Lf8
            if (r15 == 0) goto Le0
            r9 = r1
            goto Le1
        Le0:
            r9 = r5
        Le1:
            float r10 = r9.f23223b
            int r10 = (int) r10
            int r10 = r10 - r7
            if (r10 >= 0) goto Le8
            goto Le9
        Le8:
            r3 = r10
        Le9:
            sb.q r7 = new sb.q
            float r9 = r9.f23222a
            float r3 = (float) r3
            r7.<init>(r9, r3)
            if (r15 == 0) goto Lf5
            r1 = r7
            goto Lf8
        Lf5:
            r11 = r1
            r13 = r7
            goto Lfa
        Lf8:
            r11 = r1
            r13 = r5
        Lfa:
            if (r8 <= 0) goto L11c
            if (r15 == 0) goto L100
            r1 = r4
            goto L101
        L100:
            r1 = r6
        L101:
            float r3 = r1.f23223b
            int r3 = (int) r3
            int r3 = r3 + r8
            zb.b r5 = r0.f18424a
            int r5 = r5.f27903Z
            if (r3 < r5) goto L10d
            int r3 = r5 + (-1)
        L10d:
            sb.q r2 = new sb.q
            float r1 = r1.f23222a
            float r3 = (float) r3
            r2.<init>(r1, r3)
            if (r15 == 0) goto L119
            r4 = r2
            goto L11c
        L119:
            r14 = r2
            r12 = r4
            goto L11e
        L11c:
            r12 = r4
            r14 = r6
        L11e:
            r0.m10438a()
            mc.c r15 = new mc.c
            zb.b r10 = r0.f18424a
            r9 = r15
            r9.<init>(r10, r11, r12, r13, r14)
            return r15
    }

    /* renamed from: b */
    public static p453zb.C7273e m10444b(int[] r28, int r29, int[] r30) {
            r0 = r28
            r1 = r30
            int r2 = r0.length
            if (r2 == 0) goto L36e
            int r2 = r29 + 1
            r3 = 1
            int r2 = r3 << r2
            if (r1 == 0) goto L15
            int r4 = r1.length
            int r5 = r2 / 2
            int r5 = r5 + 3
            if (r4 > r5) goto L369
        L15:
            if (r2 < 0) goto L369
            r4 = 512(0x200, float:7.17E-43)
            if (r2 > r4) goto L369
            h7.rb r4 = mc.C4535g.f18439a
            hb.h r5 = new hb.h
            java.lang.Object r6 = r4.f11884Z
            nc.a r6 = (nc.C4723a) r6
            r5.<init>(r6, r0)
            int[] r6 = new int[r2]
            r7 = 0
            r8 = r2
            r9 = 0
        L2b:
            if (r8 <= 0) goto L43
            java.lang.Object r10 = r4.f11884Z
            nc.a r10 = (nc.C4723a) r10
            int[] r10 = r10.f18838a
            r10 = r10[r8]
            int r10 = r5.m7384j(r10)
            int r11 = r2 - r8
            r6[r11] = r10
            if (r10 == 0) goto L40
            r9 = 1
        L40:
            int r8 = r8 + (-1)
            goto L2b
        L43:
            r5 = 2
            if (r9 != 0) goto L49
            r4 = 0
            goto Lce
        L49:
            java.lang.Object r8 = r4.f11884Z
            nc.a r8 = (nc.C4723a) r8
            hb.h r8 = r8.f18841d
            if (r1 == 0) goto L78
            int r9 = r1.length
            r10 = 0
        L53:
            if (r10 >= r9) goto L78
            r11 = r1[r10]
            java.lang.Object r12 = r4.f11884Z
            nc.a r12 = (nc.C4723a) r12
            int r13 = r0.length
            int r13 = r13 - r3
            int r13 = r13 - r11
            int[] r11 = r12.f18838a
            r11 = r11[r13]
            hb.h r13 = new hb.h
            int[] r14 = new int[r5]
            int r11 = r12.m10785e(r7, r11)
            r14[r7] = r11
            r14[r3] = r3
            r13.<init>(r12, r14)
            hb.h r8 = r8.m7395v(r13)
            int r10 = r10 + 1
            goto L53
        L78:
            hb.h r8 = new hb.h
            java.lang.Object r9 = r4.f11884Z
            nc.a r9 = (nc.C4723a) r9
            r8.<init>(r9, r6)
            java.lang.Object r6 = r4.f11884Z
            nc.a r6 = (nc.C4723a) r6
            hb.h r6 = r6.m10782b(r2, r3)
            hb.h[] r6 = r4.m7097s(r6, r8, r2)
            r8 = r6[r7]
            r6 = r6[r3]
            int[] r9 = r4.m7090k(r8)
            int[] r6 = r4.m7092m(r6, r8, r9)
            r8 = 0
        L9a:
            int r10 = r9.length
            if (r8 >= r10) goto Lcd
            int r10 = r0.length
            int r10 = r10 - r3
            java.lang.Object r11 = r4.f11884Z
            nc.a r11 = (nc.C4723a) r11
            r12 = r9[r8]
            java.util.Objects.requireNonNull(r11)
            if (r12 == 0) goto Lc7
            int[] r11 = r11.f18839b
            r11 = r11[r12]
            int r10 = r10 - r11
            if (r10 < 0) goto Lc2
            java.lang.Object r11 = r4.f11884Z
            nc.a r11 = (nc.C4723a) r11
            r12 = r0[r10]
            r13 = r6[r8]
            int r11 = r11.m10785e(r12, r13)
            r0[r10] = r11
            int r8 = r8 + 1
            goto L9a
        Lc2:
            sb.b r0 = sb.C6008b.m12490a()
            throw r0
        Lc7:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        Lcd:
            int r4 = r9.length
        Lce:
            int r6 = r0.length
            r8 = 4
            if (r6 < r8) goto L364
            r6 = r0[r7]
            int r8 = r0.length
            if (r6 > r8) goto L35f
            if (r6 != 0) goto Le6
            int r6 = r0.length
            if (r2 >= r6) goto Le1
            int r6 = r0.length
            int r6 = r6 - r2
            r0[r7] = r6
            goto Le6
        Le1:
            sb.f r0 = sb.C6012f.m12491a()
            throw r0
        Le6:
            java.lang.String r2 = java.lang.String.valueOf(r29)
            char[] r6 = mc.C4532d.f18433a
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            int r8 = r0.length
            int r8 = r8 << r3
            r6.<init>(r8)
            java.nio.charset.Charset r8 = mc.C4532d.f18435c
            r9 = r0[r3]
            lc.b r10 = new lc.b
            r10.<init>()
            r11 = 2
        Lfd:
            r12 = r0[r7]
            if (r11 >= r12) goto L339
            r12 = 913(0x391, float:1.28E-42)
            if (r9 == r12) goto L31e
            r12 = 924(0x39c, float:1.295E-42)
            r13 = 900(0x384, float:1.261E-42)
            r15 = 901(0x385, float:1.263E-42)
            r14 = 928(0x3a0, float:1.3E-42)
            switch(r9) {
                case 900: goto L171;
                case 901: goto L16e;
                case 902: goto L118;
                default: goto L110;
            }
        L110:
            switch(r9) {
                case 922: goto L314;
                case 923: goto L314;
                case 924: goto L16e;
                case 925: goto L1f0;
                case 926: goto L1ec;
                case 927: goto L1da;
                case 928: goto L174;
                default: goto L113;
            }
        L113:
            r14 = r4
            int r11 = r11 + (-1)
            goto L319
        L118:
            r9 = 15
            int[] r9 = new int[r9]
            r17 = 0
            r18 = 0
        L120:
            r3 = r0[r7]
            if (r11 >= r3) goto L16b
            if (r17 != 0) goto L16b
            int r3 = r11 + 1
            r11 = r0[r11]
            r5 = r0[r7]
            if (r3 != r5) goto L130
            r17 = 1
        L130:
            if (r11 >= r13) goto L137
            r9[r18] = r11
            int r18 = r18 + 1
            goto L148
        L137:
            if (r11 == r13) goto L14b
            if (r11 == r15) goto L14b
            if (r11 == r12) goto L14b
            if (r11 == r14) goto L14b
            r5 = 923(0x39b, float:1.293E-42)
            if (r11 == r5) goto L14b
            r5 = 922(0x39a, float:1.292E-42)
            if (r11 != r5) goto L148
            goto L14b
        L148:
            r5 = r18
            goto L151
        L14b:
            int r3 = r3 + (-1)
            r5 = r18
            r17 = 1
        L151:
            int r18 = r5 % 15
            if (r18 == 0) goto L15b
            r14 = 902(0x386, float:1.264E-42)
            if (r11 == r14) goto L15b
            if (r17 == 0) goto L165
        L15b:
            if (r5 <= 0) goto L165
            java.lang.String r5 = mc.C4532d.m10439a(r9, r5)
            r6.append(r5)
            r5 = 0
        L165:
            r11 = r3
            r18 = r5
            r14 = 928(0x3a0, float:1.3E-42)
            goto L120
        L16b:
            r14 = r4
            goto L312
        L16e:
            r3 = 2
            goto L1f6
        L171:
            r14 = r4
            goto L319
        L174:
            int r3 = r11 + 2
            r5 = r0[r7]
            if (r3 > r5) goto L1d5
            r3 = 2
            int[] r5 = new int[r3]
            r9 = 0
        L17e:
            if (r9 >= r3) goto L189
            r12 = r0[r11]
            r5[r9] = r12
            int r9 = r9 + 1
            int r11 = r11 + 1
            goto L17e
        L189:
            java.lang.String r5 = mc.C4532d.m10439a(r5, r3)
            java.lang.Integer.parseInt(r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            int r5 = mc.C4532d.m10440b(r0, r11, r5)
            r9 = r0[r5]
            r11 = 923(0x39b, float:1.293E-42)
            if (r9 != r11) goto L1cc
            int r5 = r5 + 1
            r9 = r0[r7]
            int r9 = r9 - r5
            int[] r9 = new int[r9]
            r11 = 0
            r12 = 0
        L1a8:
            r14 = r0[r7]
            if (r5 >= r14) goto L1c8
            if (r11 != 0) goto L1c8
            int r14 = r5 + 1
            r5 = r0[r5]
            if (r5 >= r13) goto L1bb
            int r15 = r12 + 1
            r9[r12] = r5
            r5 = r14
            r12 = r15
            goto L1a8
        L1bb:
            r11 = 922(0x39a, float:1.292E-42)
            if (r5 != r11) goto L1c3
            int r5 = r14 + 1
            r11 = 1
            goto L1a8
        L1c3:
            sb.f r0 = sb.C6012f.m12491a()
            throw r0
        L1c8:
            java.util.Arrays.copyOf(r9, r12)
            goto L1f3
        L1cc:
            r11 = 922(0x39a, float:1.292E-42)
            r9 = r0[r5]
            if (r9 != r11) goto L1f3
            int r5 = r5 + 1
            goto L1f3
        L1d5:
            sb.f r0 = sb.C6012f.m12491a()
            throw r0
        L1da:
            r3 = 2
            int r5 = r11 + 1
            r8 = r0[r11]
            zb.d r8 = p453zb.EnumC7272d.m14380e(r8)
            java.lang.String r8 = r8.name()
            java.nio.charset.Charset r8 = java.nio.charset.Charset.forName(r8)
            goto L1f3
        L1ec:
            r3 = 2
            int r5 = r11 + 2
            goto L1f3
        L1f0:
            r3 = 2
            int r5 = r11 + 1
        L1f3:
            r14 = r4
            goto L327
        L1f6:
            java.io.ByteArrayOutputStream r5 = new java.io.ByteArrayOutputStream
            r5.<init>()
            r16 = 900(0x384, double:4.447E-321)
            r19 = 0
            r14 = 6
            if (r9 != r15) goto L293
            int[] r9 = new int[r14]
            int r21 = r11 + 1
            r11 = r0[r11]
            r22 = 0
        L20a:
            r3 = r11
            r24 = r19
            r11 = r21
            r23 = 0
        L211:
            r14 = r0[r7]
            if (r11 >= r14) goto L275
            if (r22 != 0) goto L275
            int r14 = r23 + 1
            r9[r23] = r3
            long r24 = r24 * r16
            r27 = r8
            long r7 = (long) r3
            long r24 = r24 + r7
            int r3 = r11 + 1
            r7 = r0[r11]
            if (r7 == r13) goto L265
            if (r7 == r15) goto L265
            r8 = 902(0x386, float:1.264E-42)
            if (r7 == r8) goto L265
            if (r7 == r12) goto L265
            r8 = 928(0x3a0, float:1.3E-42)
            if (r7 == r8) goto L265
            r8 = 923(0x39b, float:1.293E-42)
            if (r7 == r8) goto L265
            r8 = 922(0x39a, float:1.292E-42)
            if (r7 != r8) goto L23d
            goto L265
        L23d:
            int r8 = r14 % 5
            if (r8 != 0) goto L263
            if (r14 <= 0) goto L263
            r8 = 0
            r11 = 6
        L245:
            if (r8 >= r11) goto L25a
            int r11 = 5 - r8
            int r11 = r11 * 8
            long r12 = r24 >> r11
            int r11 = (int) r12
            byte r11 = (byte) r11
            r5.write(r11)
            int r8 = r8 + 1
            r11 = 6
            r12 = 924(0x39c, float:1.295E-42)
            r13 = 900(0x384, float:1.261E-42)
            goto L245
        L25a:
            r21 = r3
            r11 = r7
            r8 = r27
            r3 = 2
            r7 = 0
            r14 = 6
            goto L20a
        L263:
            r11 = r3
            goto L26a
        L265:
            int r3 = r3 + (-1)
            r11 = r3
            r22 = 1
        L26a:
            r3 = r7
            r23 = r14
            r8 = r27
            r7 = 0
            r12 = 924(0x39c, float:1.295E-42)
            r13 = 900(0x384, float:1.261E-42)
            goto L211
        L275:
            r27 = r8
            r8 = r0[r7]
            if (r11 != r8) goto L285
            r7 = 900(0x384, float:1.261E-42)
            if (r3 >= r7) goto L285
            int r7 = r23 + 1
            r9[r23] = r3
            r3 = r7
            goto L287
        L285:
            r3 = r23
        L287:
            r7 = 0
        L288:
            if (r7 >= r3) goto L303
            r8 = r9[r7]
            byte r8 = (byte) r8
            r5.write(r8)
            int r7 = r7 + 1
            goto L288
        L293:
            r27 = r8
            r3 = 924(0x39c, float:1.295E-42)
            if (r9 != r3) goto L303
            r8 = r19
            r3 = 0
            r7 = 0
            r26 = 0
        L29f:
            r12 = r0[r3]
            if (r11 >= r12) goto L303
            if (r7 != 0) goto L303
            int r12 = r11 + 1
            r11 = r0[r11]
            r13 = 900(0x384, float:1.261E-42)
            if (r11 >= r13) goto L2ba
            int r26 = r26 + 1
            long r8 = r8 * r16
            r14 = r4
            long r3 = (long) r11
            long r8 = r8 + r3
            r11 = r12
            r3 = 922(0x39a, float:1.292E-42)
            r4 = 924(0x39c, float:1.295E-42)
            goto L2e1
        L2ba:
            r14 = r4
            if (r11 == r13) goto L2d9
            if (r11 == r15) goto L2d9
            r3 = 902(0x386, float:1.264E-42)
            if (r11 == r3) goto L2d9
            r4 = 924(0x39c, float:1.295E-42)
            if (r11 == r4) goto L2d6
            r3 = 928(0x3a0, float:1.3E-42)
            if (r11 == r3) goto L2d6
            r3 = 923(0x39b, float:1.293E-42)
            if (r11 == r3) goto L2d6
            r3 = 922(0x39a, float:1.292E-42)
            if (r11 != r3) goto L2d4
            goto L2dd
        L2d4:
            r11 = r12
            goto L2e1
        L2d6:
            r3 = 922(0x39a, float:1.292E-42)
            goto L2dd
        L2d9:
            r3 = 922(0x39a, float:1.292E-42)
            r4 = 924(0x39c, float:1.295E-42)
        L2dd:
            int r12 = r12 + (-1)
            r11 = r12
            r7 = 1
        L2e1:
            int r12 = r26 % 5
            if (r12 != 0) goto L300
            if (r26 <= 0) goto L300
            r3 = 6
            r12 = 0
        L2e9:
            if (r12 >= r3) goto L2fc
            int r23 = 5 - r12
            int r23 = r23 * 8
            long r3 = r8 >> r23
            int r4 = (int) r3
            byte r3 = (byte) r4
            r5.write(r3)
            int r12 = r12 + 1
            r3 = 6
            r4 = 924(0x39c, float:1.295E-42)
            goto L2e9
        L2fc:
            r8 = r19
            r26 = 0
        L300:
            r4 = r14
            r3 = 0
            goto L29f
        L303:
            r14 = r4
            java.lang.String r3 = new java.lang.String
            byte[] r4 = r5.toByteArray()
            r8 = r27
            r3.<init>(r4, r8)
            r6.append(r3)
        L312:
            r5 = r11
            goto L327
        L314:
            sb.f r0 = sb.C6012f.m12491a()
            throw r0
        L319:
            int r5 = mc.C4532d.m10440b(r0, r11, r6)
            goto L327
        L31e:
            r14 = r4
            int r5 = r11 + 1
            r3 = r0[r11]
            char r3 = (char) r3
            r6.append(r3)
        L327:
            int r3 = r0.length
            if (r5 >= r3) goto L334
            int r11 = r5 + 1
            r9 = r0[r5]
            r4 = r14
            r3 = 1
            r5 = 2
            r7 = 0
            goto Lfd
        L334:
            sb.f r0 = sb.C6012f.m12491a()
            throw r0
        L339:
            r14 = r4
            int r0 = r6.length()
            if (r0 == 0) goto L35a
            zb.e r0 = new zb.e
            java.lang.String r3 = r6.toString()
            r4 = 0
            r0.<init>(r4, r3, r4, r2)
            r0.f27921h = r10
            java.lang.Integer r2 = java.lang.Integer.valueOf(r14)
            r0.f27919f = r2
            int r1 = r1.length
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.f27920g = r1
            return r0
        L35a:
            sb.f r0 = sb.C6012f.m12491a()
            throw r0
        L35f:
            sb.f r0 = sb.C6012f.m12491a()
            throw r0
        L364:
            sb.f r0 = sb.C6012f.m12491a()
            throw r0
        L369:
            sb.b r0 = sb.C6008b.m12490a()
            throw r0
        L36e:
            sb.f r0 = sb.C6012f.m12491a()
            throw r0
    }

    /* renamed from: c */
    public static mc.C4529a m10445c(p453zb.C7270b r18, int r19, int r20, boolean r21, int r22, int r23, int r24, int r25) {
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r23
            r4 = -1
            r5 = 1
            if (r21 == 0) goto Le
            r6 = -1
            goto Lf
        Le:
            r6 = 1
        Lf:
            r7 = 0
            r10 = r21
            r9 = r22
            r8 = 0
        L15:
            r11 = 2
            if (r8 >= r11) goto L38
        L18:
            if (r10 == 0) goto L1d
            if (r9 < r1) goto L32
            goto L1f
        L1d:
            if (r9 >= r2) goto L32
        L1f:
            boolean r12 = r0.m14372b(r9, r3)
            if (r10 != r12) goto L32
            int r12 = r22 - r9
            int r12 = java.lang.Math.abs(r12)
            if (r12 <= r11) goto L30
            r9 = r22
            goto L38
        L30:
            int r9 = r9 + r6
            goto L18
        L32:
            int r6 = -r6
            r10 = r10 ^ 1
            int r8 = r8 + 1
            goto L15
        L38:
            r6 = 8
            int[] r8 = new int[r6]
            if (r21 == 0) goto L40
            r10 = 1
            goto L41
        L40:
            r10 = -1
        L41:
            r14 = r21
            r12 = r9
            r13 = 0
        L45:
            if (r21 == 0) goto L4a
            if (r12 >= r2) goto L60
            goto L4c
        L4a:
            if (r12 < r1) goto L60
        L4c:
            if (r13 >= r6) goto L60
            boolean r15 = r0.m14372b(r12, r3)
            if (r15 != r14) goto L5b
            r15 = r8[r13]
            int r15 = r15 + r5
            r8[r13] = r15
            int r12 = r12 + r10
            goto L45
        L5b:
            int r13 = r13 + 1
            r14 = r14 ^ 1
            goto L45
        L60:
            r0 = 7
            r3 = 0
            if (r13 == r6) goto L6d
            if (r21 == 0) goto L67
            r1 = r2
        L67:
            if (r12 != r1) goto L6c
            if (r13 != r0) goto L6c
            goto L6d
        L6c:
            r8 = r3
        L6d:
            if (r8 != 0) goto L70
            return r3
        L70:
            int r1 = p185k7.C4038x4.m9100m(r8)
            if (r21 == 0) goto L79
            int r2 = r9 + r1
            goto L96
        L79:
            r2 = 0
        L7a:
            int r10 = r8.length
            int r10 = r10 / r11
            if (r2 >= r10) goto L8f
            r10 = r8[r2]
            int r12 = r8.length
            int r12 = r12 - r5
            int r12 = r12 - r2
            r12 = r8[r12]
            r8[r2] = r12
            int r12 = r8.length
            int r12 = r12 - r5
            int r12 = r12 - r2
            r8[r12] = r10
            int r2 = r2 + 1
            goto L7a
        L8f:
            int r2 = r9 - r1
            r17 = r9
            r9 = r2
            r2 = r17
        L96:
            int r10 = r24 + (-2)
            if (r10 > r1) goto La0
            int r10 = r25 + 2
            if (r1 > r10) goto La0
            r1 = 1
            goto La1
        La0:
            r1 = 0
        La1:
            if (r1 != 0) goto La4
            return r3
        La4:
            float[][] r1 = mc.C4534f.f18438a
            int r1 = p185k7.C4038x4.m9100m(r8)
            float r1 = (float) r1
            int[] r10 = new int[r6]
            r12 = 0
            r13 = 0
            r14 = 0
        Lb0:
            r15 = 17
            if (r12 >= r15) goto Ld6
            r15 = 1107820544(0x42080000, float:34.0)
            float r15 = r1 / r15
            float r0 = (float) r12
            float r0 = r0 * r1
            r16 = 1099431936(0x41880000, float:17.0)
            float r0 = r0 / r16
            float r0 = r0 + r15
            r15 = r8[r13]
            int r15 = r15 + r14
            float r15 = (float) r15
            int r0 = (r15 > r0 ? 1 : (r15 == r0 ? 0 : -1))
            if (r0 > 0) goto Lcd
            r0 = r8[r13]
            int r14 = r14 + r0
            int r13 = r13 + 1
        Lcd:
            r0 = r10[r13]
            int r0 = r0 + r5
            r10[r13] = r0
            int r12 = r12 + 1
            r0 = 7
            goto Lb0
        Ld6:
            r0 = 0
            r12 = 0
        Ld9:
            if (r12 >= r6) goto Lf0
            r13 = 0
        Ldc:
            r14 = r10[r12]
            if (r13 >= r14) goto Led
            long r0 = r0 << r5
            int r14 = r12 % 2
            if (r14 != 0) goto Le7
            r14 = 1
            goto Le8
        Le7:
            r14 = 0
        Le8:
            long r14 = (long) r14
            long r0 = r0 | r14
            int r13 = r13 + 1
            goto Ldc
        Led:
            int r12 = r12 + 1
            goto Ld9
        Lf0:
            int r1 = (int) r0
            int r0 = lc.C4262a.m9569a(r1)
            if (r0 != r4) goto Lf8
            r1 = -1
        Lf8:
            if (r1 == r4) goto Lfb
            goto L13b
        Lfb:
            int r0 = p185k7.C4038x4.m9100m(r8)
            float[] r1 = new float[r6]
            r10 = 0
        L102:
            if (r10 >= r6) goto L10e
            r12 = r8[r10]
            float r12 = (float) r12
            float r13 = (float) r0
            float r12 = r12 / r13
            r1[r10] = r12
            int r10 = r10 + 1
            goto L102
        L10e:
            r0 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r8 = -1
            r10 = 0
        L113:
            float[][] r12 = mc.C4534f.f18438a
            int r13 = r12.length
            if (r10 >= r13) goto L13a
            r13 = 0
            r12 = r12[r10]
            r14 = 0
        L11c:
            if (r14 >= r6) goto L12e
            r15 = r12[r14]
            r16 = r1[r14]
            float r15 = r15 - r16
            float r15 = r15 * r15
            float r13 = r13 + r15
            int r15 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r15 >= 0) goto L12e
            int r14 = r14 + 1
            goto L11c
        L12e:
            int r12 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r12 >= 0) goto L137
            int[] r0 = lc.C4262a.f17464b
            r8 = r0[r10]
            r0 = r13
        L137:
            int r10 = r10 + 1
            goto L113
        L13a:
            r1 = r8
        L13b:
            int r0 = lc.C4262a.m9569a(r1)
            if (r0 != r4) goto L142
            return r3
        L142:
            mc.a r3 = new mc.a
            int[] r4 = new int[r6]
            r6 = r1
            r1 = 7
            r8 = 0
        L149:
            r10 = r6 & 1
            if (r10 == r8) goto L175
            int r1 = r1 + (-1)
            if (r1 < 0) goto L153
            r8 = r10
            goto L175
        L153:
            r1 = r4[r7]
            r5 = r4[r11]
            int r1 = r1 - r5
            r5 = 4
            r5 = r4[r5]
            int r1 = r1 + r5
            r5 = 6
            r4 = r4[r5]
            int r1 = r1 - r4
            int r1 = r1 + 9
            int r1 = r1 % 9
            r4 = 1
            r18 = r3
            r19 = r9
            r20 = r2
            r21 = r1
            r22 = r0
            r23 = r4
            r18.<init>(r19, r20, r21, r22, r23)
            return r3
        L175:
            r10 = r4[r1]
            int r10 = r10 + r5
            r4[r1] = r10
            int r6 = r6 >> 1
            goto L149
    }

    /* renamed from: d */
    public static mc.C4533e m10446d(p453zb.C7270b r16, mc.C4531c r17, sb.C6023q r18, boolean r19, int r20, int r21) {
            r0 = r17
            r1 = r18
            r10 = r19
            mc.e r11 = new mc.e
            r11.<init>(r0, r10)
            r2 = 0
            r12 = 0
        Ld:
            r2 = 2
            if (r12 >= r2) goto L57
            if (r12 != 0) goto L15
            r2 = 1
            r13 = 1
            goto L17
        L15:
            r2 = -1
            r13 = -1
        L17:
            float r2 = r1.f23222a
            int r2 = (int) r2
            float r3 = r1.f23223b
            int r3 = (int) r3
            r14 = r2
            r15 = r3
        L1f:
            int r2 = r0.f18432i
            if (r15 > r2) goto L54
            int r2 = r0.f18431h
            if (r15 < r2) goto L54
            r3 = 0
            r9 = r16
            int r4 = r9.f27902Y
            r2 = r16
            r5 = r19
            r6 = r14
            r7 = r15
            r8 = r20
            r9 = r21
            mc.a r2 = m10445c(r2, r3, r4, r5, r6, r7, r8, r9)
            if (r2 == 0) goto L52
            java.util.Map<java.lang.String, java.lang.String> r3 = r11.f12119c
            mc.a[] r3 = (mc.C4529a[]) r3
            wa.b<s9.a> r4 = r11.f12118b
            mc.c r4 = (mc.C4531c) r4
            int r4 = r4.f18431h
            int r4 = r15 - r4
            r3[r4] = r2
            if (r10 == 0) goto L4f
            int r2 = r2.f18418b
            goto L51
        L4f:
            int r2 = r2.f18419c
        L51:
            r14 = r2
        L52:
            int r15 = r15 + r13
            goto L1f
        L54:
            int r12 = r12 + 1
            goto Ld
        L57:
            return r11
    }

    /* renamed from: e */
    public static boolean m10447e(p164j6.C3434h r1, int r2) {
            if (r2 < 0) goto L9
            int r1 = r1.f14895c0
            r0 = 1
            int r1 = r1 + r0
            if (r2 > r1) goto L9
            return r0
        L9:
            r1 = 0
            return r1
    }
}
