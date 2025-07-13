package cc;

/* renamed from: cc.c */
/* loaded from: classes.dex */
public final class C0944c {

    /* renamed from: a */
    public final /* synthetic */ int f4922a;

    /* renamed from: b */
    public final p124h7.C2839rb f4923b;

    public C0944c(int r2) {
            r1 = this;
            r1.f4922a = r2
            r0 = 1
            if (r2 == r0) goto L22
            r0 = 2
            if (r2 == r0) goto L15
            r1.<init>()
            h7.rb r2 = new h7.rb
            ac.a r0 = ac.C0055a.f136m
            r2.<init>(r0)
            r1.f4923b = r2
            return
        L15:
            r1.<init>()
            h7.rb r2 = new h7.rb
            ac.a r0 = ac.C0055a.f135l
            r2.<init>(r0)
            r1.f4923b = r2
            return
        L22:
            r1.<init>()
            h7.rb r2 = new h7.rb
            ac.a r0 = ac.C0055a.f138o
            r2.<init>(r0)
            r1.f4923b = r2
            return
    }

    /* renamed from: a */
    public void m2666a(byte[] r8, int r9, int r10, int r11, int r12) {
            r7 = this;
            int r0 = r10 + r11
            if (r12 != 0) goto L6
            r1 = 1
            goto L7
        L6:
            r1 = 2
        L7:
            int r2 = r0 / r1
            int[] r2 = new int[r2]
            r3 = 0
            r4 = 0
        Ld:
            if (r4 >= r0) goto L24
            if (r12 == 0) goto L17
            int r5 = r4 % 2
            int r6 = r12 + (-1)
            if (r5 != r6) goto L21
        L17:
            int r5 = r4 / r1
            int r6 = r4 + r9
            r6 = r8[r6]
            r6 = r6 & 255(0xff, float:3.57E-43)
            r2[r5] = r6
        L21:
            int r4 = r4 + 1
            goto Ld
        L24:
            h7.rb r0 = r7.f4923b     // Catch: ac.C0057c -> L41
            int r11 = r11 / r1
            r0.m7088i(r2, r11)     // Catch: ac.C0057c -> L41
        L2a:
            if (r3 >= r10) goto L40
            if (r12 == 0) goto L34
            int r11 = r3 % 2
            int r0 = r12 + (-1)
            if (r11 != r0) goto L3d
        L34:
            int r11 = r3 + r9
            int r0 = r3 / r1
            r0 = r2[r0]
            byte r0 = (byte) r0
            r8[r11] = r0
        L3d:
            int r3 = r3 + 1
            goto L2a
        L40:
            return
        L41:
            sb.b r8 = sb.C6008b.m12490a()
            throw r8
    }

    /* renamed from: b */
    public p453zb.C7273e m2667b(p407x5.C6948c r32, java.util.Map<sb.EnumC6009c, ?> r33) {
            r31 = this;
            r0 = r31
            r1 = r32
            rc.h r2 = r32.m14115e()
            rc.e r3 = r32.m14114d()
            rc.d r3 = r3.f22507a
            rc.e r4 = r32.m14114d()
            rc.h r5 = r32.m14115e()
            rc.b[] r6 = p312rc.EnumC5807b.values()
            byte r4 = r4.f22508b
            r4 = r6[r4]
            java.lang.Object r6 = r1.f27120a
            zb.b r6 = (p453zb.C7270b) r6
            int r7 = r6.f27903Z
            r4.m12174g(r6, r7)
            int r4 = r5.m12187c()
            zb.b r6 = new zb.b
            r6.<init>(r4, r4)
            r8 = 0
            r9 = 9
            r6.m14377g(r8, r8, r9, r9)
            int r10 = r4 + (-8)
            r11 = 8
            r6.m14377g(r10, r8, r11, r9)
            r6.m14377g(r8, r10, r9, r11)
            int[] r10 = r5.f22526b
            int r10 = r10.length
            r12 = 0
        L44:
            r13 = 5
            if (r12 >= r10) goto L71
            int[] r14 = r5.f22526b
            r14 = r14[r12]
            int r14 = r14 + (-2)
            r15 = 0
        L4e:
            if (r15 >= r10) goto L6c
            if (r12 != 0) goto L58
            if (r15 == 0) goto L67
            int r11 = r10 + (-1)
            if (r15 == r11) goto L67
        L58:
            int r11 = r10 + (-1)
            if (r12 != r11) goto L5e
            if (r15 == 0) goto L67
        L5e:
            int[] r11 = r5.f22526b
            r11 = r11[r15]
            int r11 = r11 + (-2)
            r6.m14377g(r11, r14, r13, r13)
        L67:
            int r15 = r15 + 1
            r11 = 8
            goto L4e
        L6c:
            int r12 = r12 + 1
            r11 = 8
            goto L44
        L71:
            int r10 = r4 + (-17)
            r11 = 6
            r12 = 1
            r6.m14377g(r11, r9, r12, r10)
            r6.m14377g(r9, r11, r10, r12)
            int r10 = r5.f22525a
            r14 = 3
            if (r10 <= r11) goto L88
            int r4 = r4 + (-11)
            r6.m14377g(r4, r8, r14, r11)
            r6.m14377g(r8, r4, r11, r14)
        L88:
            int r4 = r5.f22528d
            byte[] r10 = new byte[r4]
            int r15 = r7 + (-1)
            r9 = r15
            r13 = 0
            r16 = 1
            r17 = 0
            r18 = 0
        L96:
            r14 = 2
            if (r9 <= 0) goto Lff
            if (r9 != r11) goto L9d
            int r9 = r9 + (-1)
        L9d:
            r11 = 0
        L9e:
            if (r11 >= r7) goto Lf3
            if (r16 == 0) goto La7
            int r20 = r15 - r11
            r12 = r20
            goto La8
        La7:
            r12 = r11
        La8:
            if (r8 >= r14) goto Le9
            int r14 = r9 - r8
            boolean r22 = r6.m14372b(r14, r12)
            if (r22 != 0) goto Ldd
            r22 = r6
            int r6 = r17 + 1
            int r17 = r18 << 1
            r23 = r7
            java.lang.Object r7 = r1.f27120a
            zb.b r7 = (p453zb.C7270b) r7
            boolean r7 = r7.m14372b(r14, r12)
            if (r7 == 0) goto Lc7
            r7 = r17 | 1
            goto Lc9
        Lc7:
            r7 = r17
        Lc9:
            r14 = 8
            if (r6 != r14) goto Ld8
            int r6 = r13 + 1
            byte r7 = (byte) r7
            r10[r13] = r7
            r13 = r6
            r17 = 0
            r18 = 0
            goto Le1
        Ld8:
            r17 = r6
            r18 = r7
            goto Le1
        Ldd:
            r22 = r6
            r23 = r7
        Le1:
            int r8 = r8 + 1
            r6 = r22
            r7 = r23
            r14 = 2
            goto La8
        Le9:
            r22 = r6
            r23 = r7
            int r11 = r11 + 1
            r8 = 0
            r12 = 1
            r14 = 2
            goto L9e
        Lf3:
            r22 = r6
            r23 = r7
            r16 = r16 ^ 1
            int r9 = r9 + (-2)
            r8 = 0
            r11 = 6
            r12 = 1
            goto L96
        Lff:
            int r1 = r5.f22528d
            if (r13 != r1) goto L3a5
            int r1 = r2.f22528d
            if (r4 != r1) goto L39f
            rc.h$b[] r1 = r2.f22527c
            int r4 = r3.ordinal()
            r1 = r1[r4]
            rc.h$a[] r4 = r1.f22532b
            int r5 = r4.length
            r6 = 0
            r7 = 0
        L114:
            if (r6 >= r5) goto L11e
            r8 = r4[r6]
            int r8 = r8.f22529a
            int r7 = r7 + r8
            int r6 = r6 + 1
            goto L114
        L11e:
            rc.a[] r5 = new p312rc.C5806a[r7]
            int r6 = r4.length
            r8 = 0
            r9 = 0
        L123:
            if (r8 >= r6) goto L149
            r11 = r4[r8]
            r12 = 0
        L128:
            int r13 = r11.f22529a
            if (r12 >= r13) goto L144
            int r13 = r11.f22530b
            int r14 = r1.f22531a
            int r14 = r14 + r13
            int r15 = r9 + 1
            r16 = r4
            rc.a r4 = new rc.a
            byte[] r14 = new byte[r14]
            r4.<init>(r13, r14)
            r5[r9] = r4
            int r12 = r12 + 1
            r9 = r15
            r4 = r16
            goto L128
        L144:
            r16 = r4
            int r8 = r8 + 1
            goto L123
        L149:
            r4 = 0
            r6 = r5[r4]
            byte[] r4 = r6.f22499b
            int r4 = r4.length
            int r6 = r7 + (-1)
        L151:
            if (r6 < 0) goto L15d
            r8 = r5[r6]
            byte[] r8 = r8.f22499b
            int r8 = r8.length
            if (r8 == r4) goto L15d
            int r6 = r6 + (-1)
            goto L151
        L15d:
            r8 = 1
            int r6 = r6 + r8
            int r1 = r1.f22531a
            int r4 = r4 - r1
            r1 = 0
            r8 = 0
        L164:
            if (r1 >= r4) goto L17c
            r11 = r8
            r8 = 0
        L168:
            if (r8 >= r9) goto L178
            r12 = r5[r8]
            byte[] r12 = r12.f22499b
            int r13 = r11 + 1
            r11 = r10[r11]
            r12[r1] = r11
            int r8 = r8 + 1
            r11 = r13
            goto L168
        L178:
            int r1 = r1 + 1
            r8 = r11
            goto L164
        L17c:
            r1 = r6
        L17d:
            if (r1 >= r9) goto L18d
            r11 = r5[r1]
            byte[] r11 = r11.f22499b
            int r12 = r8 + 1
            r8 = r10[r8]
            r11[r4] = r8
            int r1 = r1 + 1
            r8 = r12
            goto L17d
        L18d:
            r1 = 0
            r11 = r5[r1]
            byte[] r11 = r11.f22499b
            int r11 = r11.length
        L193:
            if (r4 >= r11) goto L1b1
            r12 = r8
            r8 = 0
        L197:
            if (r8 >= r9) goto L1ad
            if (r8 >= r6) goto L19d
            r13 = r4
            goto L19f
        L19d:
            int r13 = r4 + 1
        L19f:
            r14 = r5[r8]
            byte[] r14 = r14.f22499b
            int r15 = r12 + 1
            r12 = r10[r12]
            r14[r13] = r12
            int r8 = r8 + 1
            r12 = r15
            goto L197
        L1ad:
            int r4 = r4 + 1
            r8 = r12
            goto L193
        L1b1:
            r4 = 0
            r6 = 0
        L1b3:
            if (r4 >= r7) goto L1bd
            r8 = r5[r4]
            int r8 = r8.f22498a
            int r6 = r6 + r8
            int r4 = r4 + 1
            goto L1b3
        L1bd:
            byte[] r9 = new byte[r6]
            r4 = 0
            r6 = 0
        L1c1:
            if (r4 >= r7) goto L22d
            r8 = r5[r4]
            byte[] r10 = r8.f22499b
            int r8 = r8.f22498a
            int r11 = r0.f4922a
            switch(r11) {
                case 0: goto L1cf;
                default: goto L1ce;
            }
        L1ce:
            goto L1f5
        L1cf:
            int r11 = r10.length
            int[] r12 = new int[r11]
            r13 = 0
        L1d3:
            if (r13 >= r11) goto L1de
            r14 = r10[r13]
            r14 = r14 & 255(0xff, float:3.57E-43)
            r12[r13] = r14
            int r13 = r13 + 1
            goto L1d3
        L1de:
            h7.rb r11 = r0.f4923b     // Catch: ac.C0057c -> L1f0
            int r13 = r10.length     // Catch: ac.C0057c -> L1f0
            int r13 = r13 - r8
            r11.m7088i(r12, r13)     // Catch: ac.C0057c -> L1f0
            r11 = 0
        L1e6:
            if (r11 >= r8) goto L216
            r13 = r12[r11]
            byte r13 = (byte) r13
            r10[r11] = r13
            int r11 = r11 + 1
            goto L1e6
        L1f0:
            sb.b r1 = sb.C6008b.m12490a()
            throw r1
        L1f5:
            int r11 = r10.length
            int[] r12 = new int[r11]
            r13 = 0
        L1f9:
            if (r13 >= r11) goto L204
            r14 = r10[r13]
            r14 = r14 & 255(0xff, float:3.57E-43)
            r12[r13] = r14
            int r13 = r13 + 1
            goto L1f9
        L204:
            h7.rb r11 = r0.f4923b     // Catch: ac.C0057c -> L228
            int r13 = r10.length     // Catch: ac.C0057c -> L228
            int r13 = r13 - r8
            r11.m7088i(r12, r13)     // Catch: ac.C0057c -> L228
            r11 = 0
        L20c:
            if (r11 >= r8) goto L216
            r13 = r12[r11]
            byte r13 = (byte) r13
            r10[r11] = r13
            int r11 = r11 + 1
            goto L20c
        L216:
            r11 = r6
            r6 = 0
        L218:
            if (r6 >= r8) goto L224
            int r12 = r11 + 1
            r13 = r10[r6]
            r9[r11] = r13
            int r6 = r6 + 1
            r11 = r12
            goto L218
        L224:
            int r4 = r4 + 1
            r6 = r11
            goto L1c1
        L228:
            sb.b r1 = sb.C6008b.m12490a()
            throw r1
        L22d:
            char[] r4 = p312rc.C5808c.f22501a
            rc.f r4 = p312rc.EnumC5811f.f22518j0
            rc.f r5 = p312rc.EnumC5811f.f22517i0
            rc.f r6 = p312rc.EnumC5811f.f22515g0
            rc.f r7 = p312rc.EnumC5811f.f22514f0
            rc.f r8 = p312rc.EnumC5811f.f22516h0
            rc.f r10 = p312rc.EnumC5811f.f22513e0
            rc.f r11 = p312rc.EnumC5811f.f22512d0
            rc.f r12 = p312rc.EnumC5811f.f22511c0
            rc.f r13 = p312rc.EnumC5811f.f22510b0
            rc.f r14 = p312rc.EnumC5811f.f22509a0
            zb.c r15 = new zb.c
            r15.<init>(r9)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r0 = 50
            r1.<init>(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r16 = r9
            r9 = 1
            r0.<init>(r9)
            r17 = -1
            r21 = r3
            r9 = 0
            r18 = -1
            r19 = 0
        L260:
            int r3 = r15.m14378a()     // Catch: java.lang.IllegalArgumentException -> L39a
            r28 = r6
            r6 = 4
            if (r3 >= r6) goto L26a
            goto L2a7
        L26a:
            int r3 = r15.m14379b(r6)     // Catch: java.lang.IllegalArgumentException -> L39a
            if (r3 == 0) goto L2a7
            r6 = 1
            if (r3 == r6) goto L2a5
            r6 = 2
            if (r3 == r6) goto L2a3
            r6 = 3
            if (r3 == r6) goto L2a1
            r6 = 4
            if (r3 == r6) goto L29f
            r6 = 5
            if (r3 == r6) goto L29d
            r6 = 7
            if (r3 == r6) goto L29b
            r6 = 8
            if (r3 == r6) goto L298
            r6 = 9
            if (r3 == r6) goto L296
            r6 = 13
            if (r3 != r6) goto L290
            r3 = r4
            goto L2a8
        L290:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch: java.lang.IllegalArgumentException -> L39a
            r0.<init>()     // Catch: java.lang.IllegalArgumentException -> L39a
            throw r0     // Catch: java.lang.IllegalArgumentException -> L39a
        L296:
            r3 = r5
            goto L2a8
        L298:
            r3 = r28
            goto L2a8
        L29b:
            r3 = r7
            goto L2a8
        L29d:
            r3 = r8
            goto L2a8
        L29f:
            r3 = r10
            goto L2a8
        L2a1:
            r3 = r11
            goto L2a8
        L2a3:
            r3 = r12
            goto L2a8
        L2a5:
            r3 = r13
            goto L2a8
        L2a7:
            r3 = r14
        L2a8:
            if (r3 == r14) goto L36d
            if (r3 == r8) goto L364
            if (r3 != r5) goto L2b0
            goto L364
        L2b0:
            r6 = 16
            if (r3 != r11) goto L2cd
            r29 = r5
            int r5 = r15.m14378a()     // Catch: java.lang.IllegalArgumentException -> L39a
            if (r5 < r6) goto L2c8
            r5 = 8
            int r17 = r15.m14379b(r5)     // Catch: java.lang.IllegalArgumentException -> L39a
            int r18 = r15.m14379b(r5)     // Catch: java.lang.IllegalArgumentException -> L39a
            goto L36f
        L2c8:
            sb.f r0 = sb.C6012f.m12491a()     // Catch: java.lang.IllegalArgumentException -> L39a
            throw r0     // Catch: java.lang.IllegalArgumentException -> L39a
        L2cd:
            r29 = r5
            if (r3 != r7) goto L316
            r5 = 8
            int r6 = r15.m14379b(r5)     // Catch: java.lang.IllegalArgumentException -> L39a
            r5 = r6 & 128(0x80, float:1.8E-43)
            if (r5 != 0) goto L2e0
            r5 = r6 & 127(0x7f, float:1.78E-43)
            r30 = r7
            goto L304
        L2e0:
            r5 = r6 & 192(0xc0, float:2.69E-43)
            r30 = r7
            r7 = 128(0x80, float:1.8E-43)
            if (r5 != r7) goto L2f1
            r5 = 8
            int r7 = r15.m14379b(r5)     // Catch: java.lang.IllegalArgumentException -> L39a
            r6 = r6 & 63
            goto L301
        L2f1:
            r5 = 8
            r7 = r6 & 224(0xe0, float:3.14E-43)
            r5 = 192(0xc0, float:2.69E-43)
            if (r7 != r5) goto L311
            r5 = 16
            int r7 = r15.m14379b(r5)     // Catch: java.lang.IllegalArgumentException -> L39a
            r6 = r6 & 31
        L301:
            int r5 = r6 << r5
            r5 = r5 | r7
        L304:
            zb.d r19 = p453zb.EnumC7272d.m14380e(r5)     // Catch: java.lang.IllegalArgumentException -> L39a
            if (r19 == 0) goto L30c
            goto L371
        L30c:
            sb.f r0 = sb.C6012f.m12491a()     // Catch: java.lang.IllegalArgumentException -> L39a
            throw r0     // Catch: java.lang.IllegalArgumentException -> L39a
        L311:
            sb.f r0 = sb.C6012f.m12491a()     // Catch: java.lang.IllegalArgumentException -> L39a
            throw r0     // Catch: java.lang.IllegalArgumentException -> L39a
        L316:
            r30 = r7
            if (r3 != r4) goto L32e
            r5 = 4
            int r5 = r15.m14379b(r5)     // Catch: java.lang.IllegalArgumentException -> L39a
            int r6 = r3.m12183e(r2)     // Catch: java.lang.IllegalArgumentException -> L39a
            int r6 = r15.m14379b(r6)     // Catch: java.lang.IllegalArgumentException -> L39a
            r7 = 1
            if (r5 != r7) goto L354
            p312rc.C5808c.m12177c(r15, r1, r6)     // Catch: java.lang.IllegalArgumentException -> L39a
            goto L354
        L32e:
            r7 = 1
            int r5 = r3.m12183e(r2)     // Catch: java.lang.IllegalArgumentException -> L39a
            int r5 = r15.m14379b(r5)     // Catch: java.lang.IllegalArgumentException -> L39a
            if (r3 != r13) goto L33d
            p312rc.C5808c.m12179e(r15, r1, r5)     // Catch: java.lang.IllegalArgumentException -> L39a
            goto L354
        L33d:
            if (r3 != r12) goto L343
            p312rc.C5808c.m12175a(r15, r1, r5, r9)     // Catch: java.lang.IllegalArgumentException -> L39a
            goto L354
        L343:
            if (r3 != r10) goto L357
            r22 = r15
            r23 = r1
            r24 = r5
            r25 = r19
            r26 = r0
            r27 = r33
            p312rc.C5808c.m12176b(r22, r23, r24, r25, r26, r27)     // Catch: java.lang.IllegalArgumentException -> L39a
        L354:
            r6 = r28
            goto L374
        L357:
            r6 = r28
            if (r3 != r6) goto L35f
            p312rc.C5808c.m12178d(r15, r1, r5)     // Catch: java.lang.IllegalArgumentException -> L39a
            goto L374
        L35f:
            sb.f r0 = sb.C6012f.m12491a()     // Catch: java.lang.IllegalArgumentException -> L39a
            throw r0     // Catch: java.lang.IllegalArgumentException -> L39a
        L364:
            r29 = r5
            r30 = r7
            r6 = r28
            r7 = 1
            r9 = 1
            goto L374
        L36d:
            r29 = r5
        L36f:
            r30 = r7
        L371:
            r6 = r28
            r7 = 1
        L374:
            if (r3 != r14) goto L394
            zb.e r2 = new zb.e
            java.lang.String r10 = r1.toString()
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L384
            r11 = 0
            goto L385
        L384:
            r11 = r0
        L385:
            java.lang.String r12 = r21.toString()
            r8 = r2
            r9 = r16
            r13 = r17
            r14 = r18
            r8.<init>(r9, r10, r11, r12, r13, r14)
            return r2
        L394:
            r5 = r29
            r7 = r30
            goto L260
        L39a:
            sb.f r0 = sb.C6012f.m12491a()
            throw r0
        L39f:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        L3a5:
            sb.f r0 = sb.C6012f.m12491a()
            throw r0
    }

    /* renamed from: c */
    public p453zb.C7273e m2668c(p453zb.C7270b r23) {
            r22 = this;
            r7 = r22
            r0 = r23
            int r1 = r7.f4922a
            r14 = 4
            r15 = 2
            switch(r1) {
                case 0: goto Le;
                default: goto Lb;
            }
        Lb:
            r15 = 3
            goto L57e
        Le:
            androidx.fragment.app.l0 r1 = new androidx.fragment.app.l0
            r1.<init>(r0)
            java.lang.Object r0 = r1.f2232b0
            r2 = r0
            cc.d r2 = (cc.C0945d) r2
            int r3 = r2.f4931g
            byte[] r0 = new byte[r3]
            java.util.ArrayList<androidx.fragment.app.n> r8 = r1.f2230Z
            zb.b r8 = (p453zb.C7270b) r8
            int r9 = r8.f27903Z
            int r8 = r8.f27902Y
            r12 = 0
            r13 = 4
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
        L30:
            if (r13 != r9) goto L49
            if (r12 != 0) goto L49
            if (r16 != 0) goto L49
            int r16 = r17 + 1
            int r6 = r1.m1260R(r9, r8)
            byte r6 = (byte) r6
            r0[r17] = r6
            int r13 = r13 + (-2)
            int r12 = r12 + 2
            r6 = r16
            r16 = 1
            goto Le8
        L49:
            int r6 = r9 + (-2)
            if (r13 != r6) goto L66
            if (r12 != 0) goto L66
            r21 = r8 & 3
            if (r21 == 0) goto L66
            if (r18 != 0) goto L66
            int r6 = r17 + 1
            int r11 = r1.m1261S(r9, r8)
            byte r11 = (byte) r11
            r0[r17] = r11
            int r13 = r13 + (-2)
            int r12 = r12 + 2
            r18 = 1
            goto Le8
        L66:
            int r11 = r9 + 4
            if (r13 != r11) goto L82
            if (r12 != r15) goto L82
            r11 = r8 & 7
            if (r11 != 0) goto L82
            if (r19 != 0) goto L82
            int r6 = r17 + 1
            int r11 = r1.m1262T(r9, r8)
            byte r11 = (byte) r11
            r0[r17] = r11
            int r13 = r13 + (-2)
            int r12 = r12 + 2
            r19 = 1
            goto Le8
        L82:
            if (r13 != r6) goto L9c
            if (r12 != 0) goto L9c
            r6 = r8 & 7
            if (r6 != r14) goto L9c
            if (r20 != 0) goto L9c
            int r6 = r17 + 1
            int r11 = r1.m1263U(r9, r8)
            byte r11 = (byte) r11
            r0[r17] = r11
            int r13 = r13 + (-2)
            int r12 = r12 + 2
            r20 = 1
            goto Le8
        L9c:
            if (r13 >= r9) goto Lb5
            if (r12 < 0) goto Lb5
            java.util.HashMap<java.lang.String, androidx.fragment.app.j0> r6 = r1.f2231a0
            zb.b r6 = (p453zb.C7270b) r6
            boolean r6 = r6.m14372b(r12, r13)
            if (r6 != 0) goto Lb5
            int r6 = r17 + 1
            int r11 = r1.m1265W(r13, r12, r9, r8)
            byte r11 = (byte) r11
            r0[r17] = r11
            r17 = r6
        Lb5:
            int r13 = r13 + (-2)
            int r12 = r12 + 2
            if (r13 < 0) goto Lbd
            if (r12 < r8) goto L9c
        Lbd:
            int r13 = r13 + 1
            int r12 = r12 + 3
        Lc1:
            if (r13 < 0) goto Lda
            if (r12 >= r8) goto Lda
            java.util.HashMap<java.lang.String, androidx.fragment.app.j0> r6 = r1.f2231a0
            zb.b r6 = (p453zb.C7270b) r6
            boolean r6 = r6.m14372b(r12, r13)
            if (r6 != 0) goto Lda
            int r6 = r17 + 1
            int r11 = r1.m1265W(r13, r12, r9, r8)
            byte r11 = (byte) r11
            r0[r17] = r11
            r17 = r6
        Lda:
            int r13 = r13 + 2
            int r12 = r12 + (-2)
            if (r13 >= r9) goto Le2
            if (r12 >= 0) goto Lc1
        Le2:
            int r13 = r13 + 3
            int r12 = r12 + 1
            r6 = r17
        Le8:
            if (r13 < r9) goto L577
            if (r12 < r8) goto L577
            java.lang.Object r1 = r1.f2232b0
            cc.d r1 = (cc.C0945d) r1
            int r1 = r1.f4931g
            if (r6 != r1) goto L572
            cc.d$c r1 = r2.f4930f
            cc.d$b[] r6 = r1.f4935b
            int r8 = r6.length
            r9 = 0
            r11 = 0
        Lfb:
            if (r9 >= r8) goto L105
            r12 = r6[r9]
            int r12 = r12.f4932a
            int r11 = r11 + r12
            int r9 = r9 + 1
            goto Lfb
        L105:
            cc.a[] r8 = new cc.C0942a[r11]
            int r9 = r6.length
            r12 = 0
            r13 = 0
        L10a:
            if (r12 >= r9) goto L12d
            r14 = r6[r12]
            r10 = 0
        L10f:
            int r15 = r14.f4932a
            if (r10 >= r15) goto L128
            int r15 = r14.f4933b
            int r4 = r1.f4934a
            int r4 = r4 + r15
            int r16 = r13 + 1
            cc.a r5 = new cc.a
            byte[] r4 = new byte[r4]
            r5.<init>(r15, r4)
            r8[r13] = r5
            int r10 = r10 + 1
            r13 = r16
            goto L10f
        L128:
            int r12 = r12 + 1
            r14 = 4
            r15 = 2
            goto L10a
        L12d:
            r4 = 0
            r5 = r8[r4]
            byte[] r4 = r5.f4916b
            int r4 = r4.length
            int r1 = r1.f4934a
            int r4 = r4 - r1
            int r1 = r4 + (-1)
            r5 = 0
            r6 = 0
        L13a:
            if (r5 >= r1) goto L150
            r9 = 0
        L13d:
            if (r9 >= r13) goto L14d
            r10 = r8[r9]
            byte[] r10 = r10.f4916b
            int r12 = r6 + 1
            r6 = r0[r6]
            r10[r5] = r6
            int r9 = r9 + 1
            r6 = r12
            goto L13d
        L14d:
            int r5 = r5 + 1
            goto L13a
        L150:
            int r2 = r2.f4925a
            r5 = 24
            if (r2 != r5) goto L158
            r2 = 1
            goto L159
        L158:
            r2 = 0
        L159:
            r5 = 8
            if (r2 == 0) goto L160
            r9 = 8
            goto L161
        L160:
            r9 = r13
        L161:
            r10 = 0
        L162:
            if (r10 >= r9) goto L172
            r12 = r8[r10]
            byte[] r12 = r12.f4916b
            int r14 = r6 + 1
            r6 = r0[r6]
            r12[r1] = r6
            int r10 = r10 + 1
            r6 = r14
            goto L162
        L172:
            r10 = 0
            r1 = r8[r10]
            byte[] r1 = r1.f4916b
            int r1 = r1.length
        L178:
            r9 = 7
            if (r4 >= r1) goto L19e
            r10 = 0
        L17c:
            if (r10 >= r13) goto L19b
            if (r2 == 0) goto L184
            int r12 = r10 + 8
            int r12 = r12 % r13
            goto L185
        L184:
            r12 = r10
        L185:
            if (r2 == 0) goto L18c
            if (r12 <= r9) goto L18c
            int r14 = r4 + (-1)
            goto L18d
        L18c:
            r14 = r4
        L18d:
            r12 = r8[r12]
            byte[] r12 = r12.f4916b
            int r15 = r6 + 1
            r6 = r0[r6]
            r12[r14] = r6
            int r10 = r10 + 1
            r6 = r15
            goto L17c
        L19b:
            int r4 = r4 + 1
            goto L178
        L19e:
            if (r6 != r3) goto L56c
            r0 = 0
            r1 = 0
        L1a2:
            if (r0 >= r11) goto L1ac
            r2 = r8[r0]
            int r2 = r2.f4915a
            int r1 = r1 + r2
            int r0 = r0 + 1
            goto L1a2
        L1ac:
            byte[] r0 = new byte[r1]
            r1 = 0
        L1af:
            if (r1 >= r11) goto L219
            r2 = r8[r1]
            byte[] r3 = r2.f4916b
            int r2 = r2.f4915a
            int r4 = r7.f4922a
            switch(r4) {
                case 0: goto L1bd;
                default: goto L1bc;
            }
        L1bc:
            goto L1e3
        L1bd:
            int r4 = r3.length
            int[] r6 = new int[r4]
            r10 = 0
        L1c1:
            if (r10 >= r4) goto L1cc
            r12 = r3[r10]
            r12 = r12 & 255(0xff, float:3.57E-43)
            r6[r10] = r12
            int r10 = r10 + 1
            goto L1c1
        L1cc:
            h7.rb r4 = r7.f4923b     // Catch: ac.C0057c -> L1de
            int r10 = r3.length     // Catch: ac.C0057c -> L1de
            int r10 = r10 - r2
            r4.m7088i(r6, r10)     // Catch: ac.C0057c -> L1de
            r4 = 0
        L1d4:
            if (r4 >= r2) goto L204
            r10 = r6[r4]
            byte r10 = (byte) r10
            r3[r4] = r10
            int r4 = r4 + 1
            goto L1d4
        L1de:
            sb.b r0 = sb.C6008b.m12490a()
            throw r0
        L1e3:
            int r4 = r3.length
            int[] r6 = new int[r4]
            r10 = 0
        L1e7:
            if (r10 >= r4) goto L1f2
            r12 = r3[r10]
            r12 = r12 & 255(0xff, float:3.57E-43)
            r6[r10] = r12
            int r10 = r10 + 1
            goto L1e7
        L1f2:
            h7.rb r4 = r7.f4923b     // Catch: ac.C0057c -> L214
            int r10 = r3.length     // Catch: ac.C0057c -> L214
            int r10 = r10 - r2
            r4.m7088i(r6, r10)     // Catch: ac.C0057c -> L214
            r4 = 0
        L1fa:
            if (r4 >= r2) goto L204
            r10 = r6[r4]
            byte r10 = (byte) r10
            r3[r4] = r10
            int r4 = r4 + 1
            goto L1fa
        L204:
            r4 = 0
        L205:
            if (r4 >= r2) goto L211
            int r6 = r4 * r11
            int r6 = r6 + r1
            r10 = r3[r4]
            r0[r6] = r10
            int r4 = r4 + 1
            goto L205
        L211:
            int r1 = r1 + 1
            goto L1af
        L214:
            sb.b r0 = sb.C6008b.m12490a()
            throw r0
        L219:
            zb.c r1 = new zb.c
            r1.<init>(r0)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = 100
            r2.<init>(r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r4 = 0
            r3.<init>(r4)
            java.util.ArrayList r4 = new java.util.ArrayList
            r6 = 1
            r4.<init>(r6)
            r6 = 2
        L232:
            r8 = 254(0xfe, float:3.56E-43)
            r10 = 128(0x80, float:1.8E-43)
            r11 = 2
            if (r6 != r11) goto L2e1
            r6 = 0
        L23a:
            int r11 = r1.m14379b(r5)
            if (r11 == 0) goto L2dc
            if (r11 > r10) goto L24e
            if (r6 == 0) goto L246
            int r11 = r11 + 128
        L246:
            r6 = 1
            int r11 = r11 - r6
            char r6 = (char) r11
            r2.append(r6)
            goto L4ac
        L24e:
            r12 = 129(0x81, float:1.81E-43)
            if (r11 != r12) goto L257
            r5 = 1
            r6 = 1
        L254:
            r15 = 3
            goto L53a
        L257:
            r12 = 229(0xe5, float:3.21E-43)
            if (r11 > r12) goto L26a
            int r11 = r11 + (-130)
            r12 = 10
            if (r11 >= r12) goto L266
            r12 = 48
            r2.append(r12)
        L266:
            r2.append(r11)
            goto L28f
        L26a:
            r12 = 230(0xe6, float:3.22E-43)
            if (r11 != r12) goto L271
            r5 = 1
            r6 = 3
            goto L254
        L271:
            r12 = 231(0xe7, float:3.24E-43)
            if (r11 != r12) goto L278
            r5 = 1
            r6 = 7
            goto L254
        L278:
            r12 = 232(0xe8, float:3.25E-43)
            if (r11 != r12) goto L282
            r12 = 29
            r2.append(r12)
            goto L28f
        L282:
            r12 = 233(0xe9, float:3.27E-43)
            if (r11 == r12) goto L28f
            r12 = 234(0xea, float:3.28E-43)
            if (r11 == r12) goto L28f
            r12 = 235(0xeb, float:3.3E-43)
            if (r11 != r12) goto L291
            r6 = 1
        L28f:
            r14 = 0
            goto L2d4
        L291:
            r12 = 236(0xec, float:3.31E-43)
            if (r11 != r12) goto L298
            java.lang.String r11 = "[)>\u001e05\u001d"
            goto L29e
        L298:
            r12 = 237(0xed, float:3.32E-43)
            if (r11 != r12) goto L2a8
            java.lang.String r11 = "[)>\u001e06\u001d"
        L29e:
            r2.append(r11)
            java.lang.String r11 = "\u001e\u0004"
            r14 = 0
            r3.insert(r14, r11)
            goto L2d4
        L2a8:
            r14 = 0
            r12 = 238(0xee, float:3.34E-43)
            if (r11 != r12) goto L2b0
            r5 = 1
            r6 = 5
            goto L254
        L2b0:
            r12 = 239(0xef, float:3.35E-43)
            if (r11 != r12) goto L2b7
            r5 = 1
            r6 = 4
            goto L254
        L2b7:
            r12 = 240(0xf0, float:3.36E-43)
            if (r11 != r12) goto L2be
            r5 = 1
            r6 = 6
            goto L254
        L2be:
            r12 = 241(0xf1, float:3.38E-43)
            if (r11 == r12) goto L2d4
            r12 = 242(0xf2, float:3.39E-43)
            if (r11 < r12) goto L2d4
            if (r11 != r8) goto L2cf
            int r11 = r1.m14378a()
            if (r11 != 0) goto L2cf
            goto L2d4
        L2cf:
            sb.f r0 = sb.C6012f.m12491a()
            throw r0
        L2d4:
            int r11 = r1.m14378a()
            if (r11 > 0) goto L23a
            goto L4ac
        L2dc:
            sb.f r0 = sb.C6012f.m12491a()
            throw r0
        L2e1:
            r14 = 0
            int r6 = p365v.C6480g.m13148b(r6)
            r11 = 27
            r12 = 2
            if (r6 == r12) goto L4a1
            r12 = 3
            if (r6 == r12) goto L404
            r12 = 4
            if (r6 == r12) goto L3ab
            r10 = 5
            if (r6 == r10) goto L374
            r8 = 6
            if (r6 != r8) goto L36f
            int r6 = r1.f27907b
            r8 = 1
            int r6 = r6 + r8
            int r8 = r1.m14379b(r5)
            int r10 = r6 + 1
            int r6 = cc.C0943b.m2665b(r8, r6)
            if (r6 != 0) goto L30d
            int r6 = r1.m14378a()
            int r6 = r6 / r5
            goto L322
        L30d:
            r8 = 250(0xfa, float:3.5E-43)
            if (r6 >= r8) goto L312
            goto L322
        L312:
            int r6 = r6 + (-249)
            int r6 = r6 * 250
            int r8 = r1.m14379b(r5)
            int r11 = r10 + 1
            int r8 = cc.C0943b.m2665b(r8, r10)
            int r6 = r6 + r8
            r10 = r11
        L322:
            if (r6 < 0) goto L36a
            byte[] r8 = new byte[r6]
            r11 = r10
            r10 = 0
        L328:
            if (r10 >= r6) goto L346
            int r12 = r1.m14378a()
            if (r12 < r5) goto L341
            int r12 = r1.m14379b(r5)
            int r13 = r11 + 1
            int r11 = cc.C0943b.m2665b(r12, r11)
            byte r11 = (byte) r11
            r8[r10] = r11
            int r10 = r10 + 1
            r11 = r13
            goto L328
        L341:
            sb.f r0 = sb.C6012f.m12491a()
            throw r0
        L346:
            r4.add(r8)
            java.lang.String r6 = new java.lang.String     // Catch: java.io.UnsupportedEncodingException -> L355
            java.lang.String r10 = "ISO8859_1"
            r6.<init>(r8, r10)     // Catch: java.io.UnsupportedEncodingException -> L355
            r2.append(r6)     // Catch: java.io.UnsupportedEncodingException -> L355
            goto L4ac
        L355:
            r0 = move-exception
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Platform does not support required encoding: "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L36a:
            sb.f r0 = sb.C6012f.m12491a()
            throw r0
        L36f:
            sb.f r0 = sb.C6012f.m12491a()
            throw r0
        L374:
            int r6 = r1.m14378a()
            r8 = 16
            if (r6 > r8) goto L37e
            goto L4ac
        L37e:
            r6 = 0
        L37f:
            r8 = 4
            if (r6 >= r8) goto L3a3
            r8 = 6
            int r10 = r1.m14379b(r8)
            r8 = 31
            if (r10 != r8) goto L396
            int r6 = r1.f27908c
            int r6 = 8 - r6
            if (r6 == r5) goto L4ac
            r1.m14379b(r6)
            goto L4ac
        L396:
            r8 = r10 & 32
            if (r8 != 0) goto L39c
            r10 = r10 | 64
        L39c:
            char r8 = (char) r10
            r2.append(r8)
            int r6 = r6 + 1
            goto L37f
        L3a3:
            int r6 = r1.m14378a()
            if (r6 > 0) goto L374
            goto L4ac
        L3ab:
            r6 = 3
            int[] r12 = new int[r6]
        L3ae:
            int r10 = r1.m14378a()
            if (r10 != r5) goto L3b6
            goto L4ac
        L3b6:
            int r10 = r1.m14379b(r5)
            if (r10 != r8) goto L3be
            goto L4ac
        L3be:
            int r11 = r1.m14379b(r5)
            cc.C0943b.m2664a(r10, r11, r12)
            r10 = 0
        L3c6:
            if (r10 >= r6) goto L3fa
            r11 = r12[r10]
            if (r11 != 0) goto L3cf
            r11 = 13
            goto L3ee
        L3cf:
            r13 = 1
            if (r11 != r13) goto L3d5
            r11 = 42
            goto L3ee
        L3d5:
            r13 = 2
            if (r11 != r13) goto L3db
            r11 = 62
            goto L3ee
        L3db:
            if (r11 != r6) goto L3e0
            r11 = 32
            goto L3ee
        L3e0:
            r6 = 14
            if (r11 >= r6) goto L3e7
            int r11 = r11 + 44
            goto L3ed
        L3e7:
            r6 = 40
            if (r11 >= r6) goto L3f5
            int r11 = r11 + 51
        L3ed:
            char r11 = (char) r11
        L3ee:
            r2.append(r11)
            int r10 = r10 + 1
            r6 = 3
            goto L3c6
        L3f5:
            sb.f r0 = sb.C6012f.m12491a()
            throw r0
        L3fa:
            int r6 = r1.m14378a()
            if (r6 > 0) goto L402
            goto L4ac
        L402:
            r6 = 3
            goto L3ae
        L404:
            r6 = 3
            int[] r12 = new int[r6]
            r13 = 0
            r15 = 0
        L409:
            int r9 = r1.m14378a()
            if (r9 != r5) goto L411
            goto L4ac
        L411:
            int r9 = r1.m14379b(r5)
            if (r9 != r8) goto L419
            goto L4ac
        L419:
            int r14 = r1.m14379b(r5)
            cc.C0943b.m2664a(r9, r14, r12)
            r9 = 0
        L421:
            if (r9 >= r6) goto L494
            r14 = r12[r9]
            if (r15 == 0) goto L46f
            r8 = 1
            if (r15 == r8) goto L45f
            r8 = 2
            if (r15 == r8) goto L443
            if (r15 != r6) goto L43e
            char[] r6 = cc.C0943b.f4921e
            int r8 = r6.length
            if (r14 >= r8) goto L439
            char r6 = r6[r14]
            if (r13 == 0) goto L46a
            goto L44c
        L439:
            sb.f r0 = sb.C6012f.m12491a()
            throw r0
        L43e:
            sb.f r0 = sb.C6012f.m12491a()
            throw r0
        L443:
            char[] r6 = cc.C0943b.f4920d
            int r8 = r6.length
            if (r14 >= r8) goto L44f
            char r6 = r6[r14]
            if (r13 == 0) goto L46a
        L44c:
            int r6 = r6 + r10
            char r6 = (char) r6
            goto L464
        L44f:
            if (r14 != r11) goto L454
            r6 = 29
            goto L46a
        L454:
            r6 = 30
            if (r14 != r6) goto L45a
            r13 = 1
            goto L46d
        L45a:
            sb.f r0 = sb.C6012f.m12491a()
            throw r0
        L45f:
            if (r13 == 0) goto L469
            int r14 = r14 + 128
            char r6 = (char) r14
        L464:
            r2.append(r6)
            r13 = 0
            goto L46d
        L469:
            char r6 = (char) r14
        L46a:
            r2.append(r6)
        L46d:
            r15 = 0
            goto L489
        L46f:
            if (r14 >= r6) goto L475
            int r6 = r14 + 1
            r15 = r6
            goto L489
        L475:
            char[] r6 = cc.C0943b.f4919c
            int r8 = r6.length
            if (r14 >= r8) goto L48f
            char r6 = r6[r14]
            if (r13 == 0) goto L486
            int r6 = r6 + 128
            char r6 = (char) r6
            r2.append(r6)
            r13 = 0
            goto L489
        L486:
            r2.append(r6)
        L489:
            int r9 = r9 + 1
            r6 = 3
            r8 = 254(0xfe, float:3.56E-43)
            goto L421
        L48f:
            sb.f r0 = sb.C6012f.m12491a()
            throw r0
        L494:
            int r6 = r1.m14378a()
            if (r6 > 0) goto L49b
            goto L4ac
        L49b:
            r6 = 3
            r8 = 254(0xfe, float:3.56E-43)
            r14 = 0
            goto L409
        L4a1:
            r6 = 3
            int[] r8 = new int[r6]
            r9 = 0
            r10 = 0
        L4a6:
            int r12 = r1.m14378a()
            if (r12 != r5) goto L4af
        L4ac:
            r15 = 3
            goto L538
        L4af:
            int r12 = r1.m14379b(r5)
            r13 = 254(0xfe, float:3.56E-43)
            if (r12 != r13) goto L4b8
            goto L4ac
        L4b8:
            int r14 = r1.m14379b(r5)
            cc.C0943b.m2664a(r12, r14, r8)
            r12 = r10
            r10 = r9
            r9 = 0
        L4c2:
            if (r9 >= r6) goto L531
            r14 = r8[r9]
            if (r12 == 0) goto L50b
            r15 = 1
            if (r12 == r15) goto L4fa
            r15 = 2
            if (r12 == r15) goto L4dd
            if (r12 != r6) goto L4d8
            if (r10 == 0) goto L4d5
            int r14 = r14 + 224
            goto L4fe
        L4d5:
            int r14 = r14 + 96
            goto L504
        L4d8:
            sb.f r0 = sb.C6012f.m12491a()
            throw r0
        L4dd:
            char[] r6 = cc.C0943b.f4918b
            int r12 = r6.length
            if (r14 >= r12) goto L4ea
            char r12 = r6[r14]
            if (r10 == 0) goto L505
            int r12 = r12 + 128
            char r6 = (char) r12
            goto L4ff
        L4ea:
            if (r14 != r11) goto L4ef
            r12 = 29
            goto L505
        L4ef:
            r6 = 30
            if (r14 != r6) goto L4f5
            r10 = 1
            goto L508
        L4f5:
            sb.f r0 = sb.C6012f.m12491a()
            throw r0
        L4fa:
            if (r10 == 0) goto L504
            int r14 = r14 + 128
        L4fe:
            char r6 = (char) r14
        L4ff:
            r2.append(r6)
            r10 = 0
            goto L508
        L504:
            char r12 = (char) r14
        L505:
            r2.append(r12)
        L508:
            r12 = 0
            r15 = 3
            goto L526
        L50b:
            r15 = 3
            if (r14 >= r15) goto L512
            int r6 = r14 + 1
            r12 = r6
            goto L526
        L512:
            char[] r6 = cc.C0943b.f4917a
            int r5 = r6.length
            if (r14 >= r5) goto L52c
            char r5 = r6[r14]
            if (r10 == 0) goto L523
            int r5 = r5 + 128
            char r5 = (char) r5
            r2.append(r5)
            r10 = 0
            goto L526
        L523:
            r2.append(r5)
        L526:
            int r9 = r9 + 1
            r5 = 8
            r6 = 3
            goto L4c2
        L52c:
            sb.f r0 = sb.C6012f.m12491a()
            throw r0
        L531:
            r15 = 3
            int r5 = r1.m14378a()
            if (r5 > 0) goto L565
        L538:
            r5 = 1
            r6 = 2
        L53a:
            if (r6 == r5) goto L548
            int r5 = r1.m14378a()
            if (r5 > 0) goto L543
            goto L548
        L543:
            r5 = 8
            r9 = 7
            goto L232
        L548:
            int r1 = r3.length()
            if (r1 <= 0) goto L551
            r2.append(r3)
        L551:
            zb.e r1 = new zb.e
            java.lang.String r2 = r2.toString()
            boolean r3 = r4.isEmpty()
            if (r3 == 0) goto L560
            r3 = 0
            r4 = 0
            goto L561
        L560:
            r3 = 0
        L561:
            r1.<init>(r0, r2, r4, r3)
            return r1
        L565:
            r9 = r10
            r10 = r12
            r5 = 8
            r6 = 3
            goto L4a6
        L56c:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        L572:
            sb.f r0 = sb.C6012f.m12491a()
            throw r0
        L577:
            r15 = 3
            r17 = r6
            r14 = 4
            r15 = 2
            goto L30
        L57e:
            r8 = 144(0x90, float:2.02E-43)
            byte[] r9 = new byte[r8]
            int r1 = r0.f27903Z
            int r2 = r0.f27902Y
            r4 = 0
        L587:
            if (r4 >= r1) goto L5b4
            int[][] r3 = p113gc.C2324a.f10563a
            r3 = r3[r4]
            r5 = 0
        L58e:
            if (r5 >= r2) goto L5b0
            r6 = r3[r5]
            if (r6 < 0) goto L5ac
            boolean r10 = r0.m14372b(r5, r4)
            if (r10 == 0) goto L5ac
            int r10 = r6 / 6
            r11 = r9[r10]
            int r6 = r6 % 6
            r12 = 5
            int r6 = 5 - r6
            r12 = 1
            int r6 = r12 << r6
            byte r6 = (byte) r6
            r6 = r6 | r11
            byte r6 = (byte) r6
            r9[r10] = r6
            goto L5ad
        L5ac:
            r12 = 1
        L5ad:
            int r5 = r5 + 1
            goto L58e
        L5b0:
            r12 = 1
            int r4 = r4 + 1
            goto L587
        L5b4:
            r12 = 1
            r3 = 0
            r4 = 10
            r5 = 10
            r6 = 0
            r1 = r22
            r2 = r9
            r0 = 1
            r10 = 0
            r11 = 3
            r1.m2666a(r2, r3, r4, r5, r6)
            r1 = r9[r10]
            r12 = r1 & 15
            r1 = 2
            if (r12 == r1) goto L5f5
            if (r12 == r11) goto L5f5
            r1 = 4
            if (r12 == r1) goto L5f5
            r1 = 5
            if (r12 != r1) goto L5f0
            r13 = 20
            r14 = 68
            r15 = 56
            r6 = 1
            r3 = 20
            r4 = 68
            r5 = 56
            r1 = r22
            r2 = r9
            r1.m2666a(r2, r3, r4, r5, r6)
            r6 = 2
            r3 = r13
            r4 = r14
            r5 = r15
            r1.m2666a(r2, r3, r4, r5, r6)
            r1 = 78
            goto L611
        L5f0:
            sb.f r0 = sb.C6012f.m12491a()
            throw r0
        L5f5:
            r13 = 20
            r14 = 84
            r15 = 40
            r6 = 1
            r3 = 20
            r4 = 84
            r5 = 40
            r1 = r22
            r2 = r9
            r1.m2666a(r2, r3, r4, r5, r6)
            r6 = 2
            r3 = r13
            r4 = r14
            r5 = r15
            r1.m2666a(r2, r3, r4, r5, r6)
            r1 = 94
        L611:
            byte[] r2 = new byte[r1]
            r3 = 10
            java.lang.System.arraycopy(r9, r10, r2, r10, r3)
            r4 = 20
            int r1 = r1 - r3
            java.lang.System.arraycopy(r9, r4, r2, r3, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r8)
            r3 = 2
            if (r12 == r3) goto L63f
            if (r12 == r11) goto L63e
            r3 = 4
            if (r12 == r3) goto L633
            r3 = 5
            if (r12 == r3) goto L630
            goto L756
        L630:
            r3 = 77
            goto L635
        L633:
            r3 = 93
        L635:
            java.lang.String r0 = p113gc.C2325b.m6084b(r2, r0, r3)
            r1.append(r0)
            goto L756
        L63e:
            r3 = 2
        L63f:
            if (r12 != r3) goto L667
            r3 = 30
            byte[] r0 = new byte[r3]
            r0 = {x0772: FILL_ARRAY_DATA , data: [33, 34, 35, 36, 25, 26, 27, 28, 29, 30, 19, 20, 21, 22, 23, 24, 13, 14, 15, 16, 17, 18, 7, 8, 9, 10, 11, 12, 1, 2} // fill-array
            int r0 = p113gc.C2325b.m6083a(r2, r0)
            java.text.DecimalFormat r3 = new java.text.DecimalFormat
            r4 = 6
            byte[] r4 = new byte[r4]
            r4 = {x0786: FILL_ARRAY_DATA , data: [39, 40, 41, 42, 31, 32} // fill-array
            int r4 = p113gc.C2325b.m6083a(r2, r4)
            java.lang.String r5 = "0000000000"
            java.lang.String r4 = r5.substring(r10, r4)
            r3.<init>(r4)
            long r4 = (long) r0
            java.lang.String r0 = r3.format(r4)
            goto L6d9
        L667:
            r4 = 6
            char[] r3 = new char[r4]
            java.lang.String[] r5 = p113gc.C2325b.f10564a
            r6 = r5[r10]
            byte[] r8 = new byte[r4]
            r8 = {x078e: FILL_ARRAY_DATA , data: [39, 40, 41, 42, 31, 32} // fill-array
            int r8 = p113gc.C2325b.m6083a(r2, r8)
            char r6 = r6.charAt(r8)
            r3[r10] = r6
            r6 = r5[r10]
            byte[] r8 = new byte[r4]
            r8 = {x0796: FILL_ARRAY_DATA , data: [33, 34, 35, 36, 25, 26} // fill-array
            int r8 = p113gc.C2325b.m6083a(r2, r8)
            char r6 = r6.charAt(r8)
            r3[r0] = r6
            r0 = r5[r10]
            byte[] r6 = new byte[r4]
            r6 = {x079e: FILL_ARRAY_DATA , data: [27, 28, 29, 30, 19, 20} // fill-array
            int r6 = p113gc.C2325b.m6083a(r2, r6)
            char r0 = r0.charAt(r6)
            r6 = 2
            r3[r6] = r0
            r0 = r5[r10]
            byte[] r6 = new byte[r4]
            r6 = {x07a6: FILL_ARRAY_DATA , data: [21, 22, 23, 24, 13, 14} // fill-array
            int r6 = p113gc.C2325b.m6083a(r2, r6)
            char r0 = r0.charAt(r6)
            r3[r11] = r0
            r0 = r5[r10]
            byte[] r6 = new byte[r4]
            r6 = {x07ae: FILL_ARRAY_DATA , data: [15, 16, 17, 18, 7, 8} // fill-array
            int r6 = p113gc.C2325b.m6083a(r2, r6)
            char r0 = r0.charAt(r6)
            r6 = 4
            r3[r6] = r0
            r0 = r5[r10]
            byte[] r4 = new byte[r4]
            r4 = {x07b6: FILL_ARRAY_DATA , data: [9, 10, 11, 12, 1, 2} // fill-array
            int r4 = p113gc.C2325b.m6083a(r2, r4)
            char r0 = r0.charAt(r4)
            r4 = 5
            r3[r4] = r0
            java.lang.String r0 = java.lang.String.valueOf(r3)
        L6d9:
            java.text.DecimalFormat r3 = new java.text.DecimalFormat
            java.lang.String r4 = "000"
            r3.<init>(r4)
            r4 = 10
            byte[] r5 = new byte[r4]
            r5 = {x07be: FILL_ARRAY_DATA , data: [53, 54, 43, 44, 45, 46, 47, 48, 37, 38} // fill-array
            int r5 = p113gc.C2325b.m6083a(r2, r5)
            long r5 = (long) r5
            java.lang.String r5 = r3.format(r5)
            byte[] r6 = new byte[r4]
            r6 = {x07c8: FILL_ARRAY_DATA , data: [55, 56, 57, 58, 59, 60, 49, 50, 51, 52} // fill-array
            int r6 = p113gc.C2325b.m6083a(r2, r6)
            long r8 = (long) r6
            java.lang.String r3 = r3.format(r8)
            r6 = 84
            java.lang.String r4 = p113gc.C2325b.m6084b(r2, r4, r6)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            java.lang.String r6 = "[)>\u001e01\u001d"
            boolean r4 = r4.startsWith(r6)
            if (r4 == 0) goto L736
            r4 = 9
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r0)
            r8 = 29
            r6.append(r8)
            r6.append(r5)
            r6.append(r8)
            r6.append(r3)
            r6.append(r8)
            java.lang.String r0 = r6.toString()
            r1.insert(r4, r0)
            goto L756
        L736:
            r8 = 29
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r0)
            r4.append(r8)
            r4.append(r5)
            r4.append(r8)
            r4.append(r3)
            r4.append(r8)
            java.lang.String r0 = r4.toString()
            r1.insert(r10, r0)
        L756:
            zb.e r0 = new zb.e
            java.lang.String r1 = r1.toString()
            java.lang.String r3 = java.lang.String.valueOf(r12)
            r4 = 0
            r0.<init>(r2, r1, r4, r3)
            return r0
    }

    /* renamed from: d */
    public p453zb.C7273e m2669d(p453zb.C7270b r4, java.util.Map<sb.EnumC6009c, ?> r5) {
            r3 = this;
            x5.c r0 = new x5.c
            r0.<init>(r4)
            r4 = 0
            zb.e r4 = r3.m2667b(r0, r5)     // Catch: sb.C6008b -> Lb sb.C6012f -> Lf
            return r4
        Lb:
            r1 = move-exception
            r2 = r1
            r1 = r4
            goto L11
        Lf:
            r1 = move-exception
            r2 = r4
        L11:
            r0.m14116f()     // Catch: sb.C6008b -> L30 sb.C6012f -> L32
            r0.f27121b = r4     // Catch: sb.C6008b -> L30 sb.C6012f -> L32
            r0.f27122c = r4     // Catch: sb.C6008b -> L30 sb.C6012f -> L32
            r4 = 1
            r0.f27123d = r4     // Catch: sb.C6008b -> L30 sb.C6012f -> L32
            r0.m14115e()     // Catch: sb.C6008b -> L30 sb.C6012f -> L32
            r0.m14114d()     // Catch: sb.C6008b -> L30 sb.C6012f -> L32
            r0.m14113c()     // Catch: sb.C6008b -> L30 sb.C6012f -> L32
            zb.e r5 = r3.m2667b(r0, r5)     // Catch: sb.C6008b -> L30 sb.C6012f -> L32
            rc.g r0 = new rc.g     // Catch: sb.C6008b -> L30 sb.C6012f -> L32
            r0.<init>(r4)     // Catch: sb.C6008b -> L30 sb.C6012f -> L32
            r5.f27921h = r0     // Catch: sb.C6008b -> L30 sb.C6012f -> L32
            return r5
        L30:
            r4 = move-exception
            goto L33
        L32:
            r4 = move-exception
        L33:
            if (r1 != 0) goto L39
            if (r2 == 0) goto L38
            throw r2
        L38:
            throw r4
        L39:
            throw r1
    }
}
