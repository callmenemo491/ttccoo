package p089f5;

/* renamed from: f5.c */
/* loaded from: classes.dex */
public final class C2061c extends p427y4.AbstractC7117h {

    /* renamed from: a */
    public final p371v5.C6571u f9431a;

    /* renamed from: b */
    public final p216m4.C4355b0 f9432b;

    /* renamed from: c */
    public p371v5.C6576z f9433c;

    public C2061c() {
            r1 = this;
            r1.<init>()
            v5.u r0 = new v5.u
            r0.<init>()
            r1.f9431a = r0
            m4.b0 r0 = new m4.b0
            r0.<init>()
            r1.f9432b = r0
            return
    }

    @Override // p427y4.AbstractC7117h
    /* renamed from: b */
    public p427y4.C7110a mo33b(p427y4.C7114e r55, java.nio.ByteBuffer r56) {
            r54 = this;
            r0 = r54
            r1 = r55
            v5.z r2 = r0.f9433c
            if (r2 == 0) goto L12
            long r3 = r1.f27508g0
            long r5 = r2.m13446d()
            int r2 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r2 == 0) goto L23
        L12:
            v5.z r2 = new v5.z
            long r3 = r1.f12360c0
            r2.<init>(r3)
            r0.f9433c = r2
            long r3 = r1.f12360c0
            long r5 = r1.f27508g0
            long r3 = r3 - r5
            r2.m13443a(r3)
        L23:
            byte[] r1 = r56.array()
            int r2 = r56.limit()
            v5.u r3 = r0.f9431a
            r3.m13394D(r1, r2)
            m4.b0 r3 = r0.f9432b
            r3.m9771p(r1, r2)
            m4.b0 r1 = r0.f9432b
            r2 = 39
            r1.m9775t(r2)
            m4.b0 r1 = r0.f9432b
            r2 = 1
            int r1 = r1.m9766k(r2)
            long r3 = (long) r1
            r1 = 32
            long r3 = r3 << r1
            m4.b0 r5 = r0.f9432b
            int r5 = r5.m9766k(r1)
            long r5 = (long) r5
            long r11 = r3 | r5
            m4.b0 r3 = r0.f9432b
            r4 = 20
            r3.m9775t(r4)
            m4.b0 r3 = r0.f9432b
            r4 = 12
            int r3 = r3.m9766k(r4)
            m4.b0 r4 = r0.f9432b
            r5 = 8
            int r4 = r4.m9766k(r5)
            v5.u r5 = r0.f9431a
            r6 = 14
            r5.m13397G(r6)
            r5 = 0
            if (r4 == 0) goto L2b5
            r7 = 255(0xff, float:3.57E-43)
            if (r4 == r7) goto L297
            r3 = 4
            r7 = 128(0x80, double:6.3E-322)
            r17 = 0
            r19 = 1
            if (r4 == r3) goto L18d
            r3 = 5
            if (r4 == r3) goto L9a
            r1 = 6
            if (r4 == r1) goto L86
            goto L2ba
        L86:
            v5.u r1 = r0.f9431a
            v5.z r3 = r0.f9433c
            long r4 = p089f5.C2065g.m5488a(r1, r11)
            long r7 = r3.m13444b(r4)
            f5.g r1 = new f5.g
            r1.<init>(r4, r7)
            r5 = r1
            goto L2ba
        L9a:
            v5.u r3 = r0.f9431a
            v5.z r4 = r0.f9433c
            long r22 = r3.m13419v()
            int r5 = r3.m13418u()
            r5 = r5 & 128(0x80, float:1.8E-43)
            if (r5 == 0) goto Lad
            r24 = 1
            goto Laf
        Lad:
            r24 = 0
        Laf:
            java.util.List r5 = java.util.Collections.emptyList()
            if (r24 != 0) goto L164
            int r9 = r3.m13418u()
            r10 = r9 & 128(0x80, float:1.8E-43)
            if (r10 == 0) goto Lbf
            r10 = 1
            goto Lc0
        Lbf:
            r10 = 0
        Lc0:
            r21 = r9 & 64
            if (r21 == 0) goto Lc7
            r21 = 1
            goto Lc9
        Lc7:
            r21 = 0
        Lc9:
            r25 = r9 & 32
            if (r25 == 0) goto Ld0
            r25 = 1
            goto Ld2
        Ld0:
            r25 = 0
        Ld2:
            r9 = r9 & 16
            if (r9 == 0) goto Ld8
            r9 = 1
            goto Ld9
        Ld8:
            r9 = 0
        Ld9:
            if (r21 == 0) goto Le2
            if (r9 != 0) goto Le2
            long r26 = p089f5.C2065g.m5488a(r3, r11)
            goto Le7
        Le2:
            r26 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        Le7:
            if (r21 != 0) goto L11d
            int r5 = r3.m13418u()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r5)
            r6 = 0
        Lf3:
            if (r6 >= r5) goto L11c
            int r29 = r3.m13418u()
            if (r9 != 0) goto L102
            long r30 = p089f5.C2065g.m5488a(r3, r11)
            r13 = r30
            goto L107
        L102:
            r13 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L107:
            f5.d$b r15 = new f5.d$b
            long r32 = r4.m13444b(r13)
            r34 = 0
            r28 = r15
            r30 = r13
            r28.<init>(r29, r30, r32, r34)
            r2.add(r15)
            int r6 = r6 + 1
            goto Lf3
        L11c:
            r5 = r2
        L11d:
            if (r25 == 0) goto L13d
            int r2 = r3.m13418u()
            long r11 = (long) r2
            long r6 = r11 & r7
            int r2 = (r6 > r17 ? 1 : (r6 == r17 ? 0 : -1))
            if (r2 == 0) goto L12c
            r2 = 1
            goto L12d
        L12c:
            r2 = 0
        L12d:
            long r6 = r11 & r19
            long r6 = r6 << r1
            long r11 = r3.m13419v()
            long r6 = r6 | r11
            r11 = 1000(0x3e8, double:4.94E-321)
            long r6 = r6 * r11
            r11 = 90
            long r6 = r6 / r11
            goto L143
        L13d:
            r2 = 0
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L143:
            int r1 = r3.m13423z()
            int r8 = r3.m13418u()
            int r3 = r3.m13418u()
            r36 = r1
            r33 = r2
            r38 = r3
            r32 = r5
            r34 = r6
            r37 = r8
            r25 = r10
            r1 = r26
            r27 = r9
            r26 = r21
            goto L17e
        L164:
            r32 = r5
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r25 = 0
            r26 = 0
            r27 = 0
            r33 = 0
            r34 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r36 = 0
            r37 = 0
            r38 = 0
        L17e:
            f5.d r5 = new f5.d
            r21 = r5
            long r30 = r4.m13444b(r1)
            r28 = r1
            r21.<init>(r22, r24, r25, r26, r27, r28, r30, r32, r33, r34, r36, r37, r38)
            goto L2ba
        L18d:
            v5.u r2 = r0.f9431a
            int r3 = r2.m13418u()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r3)
            r6 = 0
        L199:
            if (r6 >= r3) goto L291
            long r40 = r2.m13419v()
            int r9 = r2.m13418u()
            r9 = r9 & 128(0x80, float:1.8E-43)
            if (r9 == 0) goto L1aa
            r42 = 1
            goto L1ac
        L1aa:
            r42 = 0
        L1ac:
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            if (r42 != 0) goto L25b
            int r10 = r2.m13418u()
            r11 = r10 & 128(0x80, float:1.8E-43)
            if (r11 == 0) goto L1bd
            r11 = 1
            goto L1be
        L1bd:
            r11 = 0
        L1be:
            r12 = r10 & 64
            if (r12 == 0) goto L1c4
            r12 = 1
            goto L1c5
        L1c4:
            r12 = 0
        L1c5:
            r10 = r10 & 32
            if (r10 == 0) goto L1cb
            r10 = 1
            goto L1cc
        L1cb:
            r10 = 0
        L1cc:
            if (r12 == 0) goto L1d3
            long r13 = r2.m13419v()
            goto L1d8
        L1d3:
            r13 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L1d8:
            if (r12 != 0) goto L207
            int r9 = r2.m13418u()
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>(r9)
            r1 = 0
        L1e4:
            if (r1 >= r9) goto L203
            int r7 = r2.m13418u()
            r23 = r9
            long r8 = r2.m13419v()
            r24 = r3
            f5.f$b r3 = new f5.f$b
            r3.<init>(r7, r8, r5)
            r15.add(r3)
            int r1 = r1 + 1
            r9 = r23
            r3 = r24
            r7 = 128(0x80, double:6.3E-322)
            goto L1e4
        L203:
            r24 = r3
            r9 = r15
            goto L209
        L207:
            r24 = r3
        L209:
            if (r10 == 0) goto L22e
            int r1 = r2.m13418u()
            long r7 = (long) r1
            r21 = 128(0x80, double:6.3E-322)
            long r25 = r7 & r21
            int r1 = (r25 > r17 ? 1 : (r25 == r17 ? 0 : -1))
            if (r1 == 0) goto L21a
            r1 = 1
            goto L21b
        L21a:
            r1 = 0
        L21b:
            long r7 = r7 & r19
            r3 = 32
            long r7 = r7 << r3
            long r15 = r2.m13419v()
            long r7 = r7 | r15
            r15 = 1000(0x3e8, double:4.94E-321)
            long r7 = r7 * r15
            r25 = 90
            long r7 = r7 / r25
            goto L23c
        L22e:
            r3 = 32
            r15 = 1000(0x3e8, double:4.94E-321)
            r21 = 128(0x80, double:6.3E-322)
            r25 = 90
            r1 = 0
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L23c:
            int r10 = r2.m13423z()
            int r23 = r2.m13418u()
            int r27 = r2.m13418u()
            r48 = r1
            r49 = r7
            r45 = r9
            r51 = r10
            r43 = r11
            r44 = r12
            r46 = r13
            r52 = r23
            r53 = r27
            goto L27d
        L25b:
            r24 = r3
            r21 = r7
            r3 = 32
            r15 = 1000(0x3e8, double:4.94E-321)
            r25 = 90
            r45 = r9
            r43 = 0
            r44 = 0
            r46 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r48 = 0
            r49 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r51 = 0
            r52 = 0
            r53 = 0
        L27d:
            f5.f$c r1 = new f5.f$c
            r39 = r1
            r39.<init>(r40, r42, r43, r44, r45, r46, r48, r49, r51, r52, r53)
            r4.add(r1)
            int r6 = r6 + 1
            r7 = r21
            r3 = r24
            r1 = 32
            goto L199
        L291:
            f5.f r5 = new f5.f
            r5.<init>(r4)
            goto L2ba
        L297:
            v5.u r1 = r0.f9431a
            long r8 = r1.m13419v()
            int r3 = r3 + (-4)
            byte[] r10 = new byte[r3]
            byte[] r2 = r1.f25710a
            int r4 = r1.f25711b
            r5 = 0
            java.lang.System.arraycopy(r2, r4, r10, r5, r3)
            int r2 = r1.f25711b
            int r2 = r2 + r3
            r1.f25711b = r2
            f5.a r5 = new f5.a
            r7 = r5
            r7.<init>(r8, r10, r11)
            goto L2ba
        L2b5:
            f5.e r5 = new f5.e
            r5.<init>()
        L2ba:
            if (r5 != 0) goto L2c5
            y4.a r1 = new y4.a
            r2 = 0
            y4.a$b[] r2 = new p427y4.C7110a.b[r2]
            r1.<init>(r2)
            goto L2d0
        L2c5:
            r2 = 0
            y4.a r1 = new y4.a
            r3 = 1
            y4.a$b[] r3 = new p427y4.C7110a.b[r3]
            r3[r2] = r5
            r1.<init>(r3)
        L2d0:
            return r1
    }
}
