package p381w;

/* renamed from: w.b */
/* loaded from: classes.dex */
public class C6761b {
    /* renamed from: a */
    public static void m13677a(p381w.C6766g r36, p365v.C6477d r37, java.util.ArrayList<p381w.C6765f> r38, int r39) {
            r0 = r36
            r10 = r37
            r11 = r38
            w.f$a r12 = p381w.C6765f.a.f26191a0
            r13 = 2
            if (r39 != 0) goto L15
            int r1 = r0.f26201P0
            w.c[] r2 = r0.f26204S0
            r15 = r1
            r16 = r2
            r17 = 0
            goto L1e
        L15:
            int r1 = r0.f26202Q0
            w.c[] r2 = r0.f26203R0
            r15 = r1
            r16 = r2
            r17 = 2
        L1e:
            r9 = 0
        L1f:
            if (r9 >= r15) goto L774
            r1 = r16[r9]
            boolean r2 = r1.f26085t
            r18 = 0
            r8 = 8
            r4 = 1
            if (r2 != 0) goto L198
            int r2 = r1.f26080o
            int r2 = r2 * 2
            w.f r5 = r1.f26066a
            r6 = r5
            r7 = 0
        L34:
            if (r7 != 0) goto L156
            int r14 = r1.f26074i
            int r14 = r14 + r4
            r1.f26074i = r14
            w.f[] r14 = r5.f26109C0
            int r3 = r1.f26080o
            r14[r3] = r18
            w.f[] r14 = r5.f26107B0
            r14[r3] = r18
            int r14 = r5.f26156j0
            if (r14 == r8) goto L11f
            int r14 = r1.f26077l
            int r14 = r14 + r4
            r1.f26077l = r14
            w.f$a r3 = r5.m13714n(r3)
            if (r3 == r12) goto L6a
            int r3 = r1.f26078m
            int r14 = r1.f26080o
            if (r14 != 0) goto L5f
            int r14 = r5.m13721u()
            goto L67
        L5f:
            if (r14 != r4) goto L66
            int r14 = r5.m13715o()
            goto L67
        L66:
            r14 = 0
        L67:
            int r3 = r3 + r14
            r1.f26078m = r3
        L6a:
            int r3 = r1.f26078m
            w.d[] r14 = r5.f26124N
            r14 = r14[r2]
            int r14 = r14.m13681d()
            int r14 = r14 + r3
            r1.f26078m = r14
            w.d[] r3 = r5.f26124N
            int r21 = r2 + 1
            r3 = r3[r21]
            int r3 = r3.m13681d()
            int r3 = r3 + r14
            r1.f26078m = r3
            int r3 = r1.f26079n
            w.d[] r14 = r5.f26124N
            r14 = r14[r2]
            int r14 = r14.m13681d()
            int r14 = r14 + r3
            r1.f26079n = r14
            w.d[] r3 = r5.f26124N
            r3 = r3[r21]
            int r3 = r3.m13681d()
            int r3 = r3 + r14
            r1.f26079n = r3
            w.f r3 = r1.f26067b
            if (r3 != 0) goto La2
            r1.f26067b = r5
        La2:
            r1.f26069d = r5
            w.f$a[] r3 = r5.f26127Q
            int r14 = r1.f26080o
            r8 = r3[r14]
            if (r8 != r12) goto L11f
            int[] r8 = r5.f26163n
            r22 = r8[r14]
            r4 = 3
            if (r22 == 0) goto Lbc
            r13 = r8[r14]
            if (r13 == r4) goto Lbc
            r13 = r8[r14]
            r4 = 2
            if (r13 != r4) goto L11f
        Lbc:
            int r4 = r1.f26075j
            r13 = 1
            int r4 = r4 + r13
            r1.f26075j = r4
            float[] r4 = r5.f26105A0
            r13 = r4[r14]
            r20 = 0
            int r25 = (r13 > r20 ? 1 : (r13 == r20 ? 0 : -1))
            if (r25 <= 0) goto Ld6
            r25 = r7
            float r7 = r1.f26076k
            r4 = r4[r14]
            float r7 = r7 + r4
            r1.f26076k = r7
            goto Ld8
        Ld6:
            r25 = r7
        Ld8:
            int r4 = r5.f26156j0
            r7 = 8
            if (r4 == r7) goto Led
            r3 = r3[r14]
            if (r3 != r12) goto Led
            r3 = r8[r14]
            if (r3 == 0) goto Leb
            r3 = r8[r14]
            r4 = 3
            if (r3 != r4) goto Led
        Leb:
            r3 = 1
            goto Lee
        Led:
            r3 = 0
        Lee:
            if (r3 == 0) goto L10c
            r3 = 0
            int r4 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r4 >= 0) goto Lf9
            r3 = 1
            r1.f26082q = r3
            goto Lfc
        Lf9:
            r3 = 1
            r1.f26083r = r3
        Lfc:
            java.util.ArrayList<w.f> r3 = r1.f26073h
            if (r3 != 0) goto L107
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r1.f26073h = r3
        L107:
            java.util.ArrayList<w.f> r3 = r1.f26073h
            r3.add(r5)
        L10c:
            w.f r3 = r1.f26071f
            if (r3 != 0) goto L112
            r1.f26071f = r5
        L112:
            w.f r3 = r1.f26072g
            if (r3 == 0) goto L11c
            w.f[] r3 = r3.f26107B0
            int r4 = r1.f26080o
            r3[r4] = r5
        L11c:
            r1.f26072g = r5
            goto L121
        L11f:
            r25 = r7
        L121:
            if (r6 == r5) goto L129
            w.f[] r3 = r6.f26109C0
            int r4 = r1.f26080o
            r3[r4] = r5
        L129:
            w.d[] r3 = r5.f26124N
            int r4 = r2 + 1
            r3 = r3[r4]
            w.d r3 = r3.f26091f
            if (r3 == 0) goto L145
            w.f r3 = r3.f26089d
            w.d[] r4 = r3.f26124N
            r6 = r4[r2]
            w.d r6 = r6.f26091f
            if (r6 == 0) goto L145
            r4 = r4[r2]
            w.d r4 = r4.f26091f
            w.f r4 = r4.f26089d
            if (r4 == r5) goto L147
        L145:
            r3 = r18
        L147:
            if (r3 == 0) goto L14c
            r7 = r25
            goto L14e
        L14c:
            r3 = r5
            r7 = 1
        L14e:
            r6 = r5
            r4 = 1
            r8 = 8
            r13 = 2
            r5 = r3
            goto L34
        L156:
            w.f r3 = r1.f26067b
            if (r3 == 0) goto L167
            int r4 = r1.f26078m
            w.d[] r3 = r3.f26124N
            r3 = r3[r2]
            int r3 = r3.m13681d()
            int r4 = r4 - r3
            r1.f26078m = r4
        L167:
            w.f r3 = r1.f26069d
            if (r3 == 0) goto L17a
            int r4 = r1.f26078m
            w.d[] r3 = r3.f26124N
            int r2 = r2 + 1
            r2 = r3[r2]
            int r2 = r2.m13681d()
            int r4 = r4 - r2
            r1.f26078m = r4
        L17a:
            r1.f26068c = r5
            int r2 = r1.f26080o
            if (r2 != 0) goto L187
            boolean r2 = r1.f26081p
            if (r2 == 0) goto L187
            r1.f26070e = r5
            goto L18b
        L187:
            w.f r2 = r1.f26066a
            r1.f26070e = r2
        L18b:
            boolean r2 = r1.f26083r
            if (r2 == 0) goto L195
            boolean r2 = r1.f26082q
            if (r2 == 0) goto L195
            r2 = 1
            goto L196
        L195:
            r2 = 0
        L196:
            r1.f26084s = r2
        L198:
            r2 = 1
            r1.f26085t = r2
            if (r11 == 0) goto L1b0
            w.f r2 = r1.f26066a
            boolean r2 = r11.contains(r2)
            if (r2 == 0) goto L1a6
            goto L1b0
        L1a6:
            r21 = r9
            r19 = r12
            r29 = r15
            r24 = 2
            goto L767
        L1b0:
            w.f r13 = r1.f26066a
            w.f r14 = r1.f26068c
            w.f r8 = r1.f26067b
            w.f r7 = r1.f26069d
            w.f r2 = r1.f26070e
            float r3 = r1.f26076k
            w.f$a[] r4 = r0.f26127Q
            r4 = r4[r39]
            w.f$a r5 = p381w.C6765f.a.f26190Z
            if (r4 != r5) goto L1c6
            r4 = 1
            goto L1c7
        L1c6:
            r4 = 0
        L1c7:
            if (r39 != 0) goto L1e5
            int r5 = r2.f26182w0
            r6 = 1
            if (r5 != 0) goto L1d1
            r23 = 1
            goto L1d3
        L1d1:
            r23 = 0
        L1d3:
            r24 = r9
            r9 = 2
            if (r5 != r6) goto L1db
            r22 = 1
            goto L1dd
        L1db:
            r22 = 0
        L1dd:
            if (r5 != r9) goto L1e2
            r5 = r23
            goto L1fd
        L1e2:
            r5 = r23
            goto L207
        L1e5:
            r24 = r9
            r6 = 1
            r9 = 2
            int r5 = r2.f26184x0
            if (r5 != 0) goto L1f0
            r22 = 1
            goto L1f2
        L1f0:
            r22 = 0
        L1f2:
            if (r5 != r6) goto L1f6
            r6 = 1
            goto L1f7
        L1f6:
            r6 = 0
        L1f7:
            if (r5 != r9) goto L203
            r5 = r22
            r22 = r6
        L1fd:
            r25 = r22
            r22 = r5
            r5 = 1
            goto L20c
        L203:
            r5 = r22
            r22 = r6
        L207:
            r25 = r22
            r22 = r5
            r5 = 0
        L20c:
            r27 = r3
            r9 = r13
            r6 = 0
        L210:
            if (r6 != 0) goto L2e0
            w.d[] r3 = r9.f26124N
            r3 = r3[r17]
            if (r5 == 0) goto L21b
            r28 = 1
            goto L21d
        L21b:
            r28 = 4
        L21d:
            int r29 = r3.m13681d()
            r30 = r6
            w.f$a[] r6 = r9.f26127Q
            r6 = r6[r39]
            if (r6 != r12) goto L231
            int[] r6 = r9.f26163n
            r6 = r6[r39]
            if (r6 != 0) goto L231
            r6 = 1
            goto L232
        L231:
            r6 = 0
        L232:
            w.d r11 = r3.f26091f
            if (r11 == 0) goto L23e
            if (r9 == r13) goto L23e
            int r11 = r11.m13681d()
            int r29 = r11 + r29
        L23e:
            r11 = r29
            if (r5 == 0) goto L24b
            if (r9 == r13) goto L24b
            if (r9 == r8) goto L24b
            r29 = r15
            r28 = 8
            goto L24d
        L24b:
            r29 = r15
        L24d:
            w.d r15 = r3.f26091f
            r31 = r2
            if (r15 == 0) goto L27d
            if (r9 != r8) goto L260
            v.h r2 = r3.f26094i
            v.h r15 = r15.f26094i
            r32 = r13
            r13 = 6
            r10.m13128f(r2, r15, r11, r13)
            goto L26b
        L260:
            r32 = r13
            v.h r2 = r3.f26094i
            v.h r13 = r15.f26094i
            r15 = 8
            r10.m13128f(r2, r13, r11, r15)
        L26b:
            if (r6 == 0) goto L271
            if (r5 != 0) goto L271
            r2 = 5
            goto L273
        L271:
            r2 = r28
        L273:
            v.h r6 = r3.f26094i
            w.d r3 = r3.f26091f
            v.h r3 = r3.f26094i
            r10.m13126d(r6, r3, r11, r2)
            goto L27f
        L27d:
            r32 = r13
        L27f:
            if (r4 == 0) goto L2b1
            int r2 = r9.f26156j0
            r3 = 8
            if (r2 == r3) goto L29f
            w.f$a[] r2 = r9.f26127Q
            r2 = r2[r39]
            if (r2 != r12) goto L29f
            w.d[] r2 = r9.f26124N
            int r3 = r17 + 1
            r3 = r2[r3]
            v.h r3 = r3.f26094i
            r2 = r2[r17]
            v.h r2 = r2.f26094i
            r6 = 5
            r11 = 0
            r10.m13128f(r3, r2, r11, r6)
            goto L2a0
        L29f:
            r11 = 0
        L2a0:
            w.d[] r2 = r9.f26124N
            r2 = r2[r17]
            v.h r2 = r2.f26094i
            w.d[] r3 = r0.f26124N
            r3 = r3[r17]
            v.h r3 = r3.f26094i
            r6 = 8
            r10.m13128f(r2, r3, r11, r6)
        L2b1:
            w.d[] r2 = r9.f26124N
            int r3 = r17 + 1
            r2 = r2[r3]
            w.d r2 = r2.f26091f
            if (r2 == 0) goto L2cd
            w.f r2 = r2.f26089d
            w.d[] r3 = r2.f26124N
            r6 = r3[r17]
            w.d r6 = r6.f26091f
            if (r6 == 0) goto L2cd
            r3 = r3[r17]
            w.d r3 = r3.f26091f
            w.f r3 = r3.f26089d
            if (r3 == r9) goto L2cf
        L2cd:
            r2 = r18
        L2cf:
            if (r2 == 0) goto L2d5
            r9 = r2
            r6 = r30
            goto L2d6
        L2d5:
            r6 = 1
        L2d6:
            r11 = r38
            r15 = r29
            r2 = r31
            r13 = r32
            goto L210
        L2e0:
            r31 = r2
            r32 = r13
            r29 = r15
            if (r7 == 0) goto L349
            w.d[] r2 = r14.f26124N
            int r3 = r17 + 1
            r2 = r2[r3]
            w.d r2 = r2.f26091f
            if (r2 == 0) goto L349
            w.d[] r2 = r7.f26124N
            r2 = r2[r3]
            w.f$a[] r6 = r7.f26127Q
            r6 = r6[r39]
            if (r6 != r12) goto L304
            int[] r6 = r7.f26163n
            r6 = r6[r39]
            if (r6 != 0) goto L304
            r13 = 1
            goto L305
        L304:
            r13 = 0
        L305:
            if (r13 == 0) goto L31d
            if (r5 != 0) goto L31d
            w.d r6 = r2.f26091f
            w.f r9 = r6.f26089d
            if (r9 != r0) goto L31d
            v.h r9 = r2.f26094i
            v.h r6 = r6.f26094i
            int r11 = r2.m13681d()
            int r11 = -r11
            r13 = 5
            r10.m13126d(r9, r6, r11, r13)
            goto L334
        L31d:
            r13 = 5
            if (r5 == 0) goto L334
            w.d r6 = r2.f26091f
            w.f r9 = r6.f26089d
            if (r9 != r0) goto L334
            v.h r9 = r2.f26094i
            v.h r6 = r6.f26094i
            int r11 = r2.m13681d()
            int r11 = -r11
            r15 = 4
            r10.m13126d(r9, r6, r11, r15)
            goto L335
        L334:
            r15 = 4
        L335:
            v.h r6 = r2.f26094i
            w.d[] r9 = r14.f26124N
            r3 = r9[r3]
            w.d r3 = r3.f26091f
            v.h r3 = r3.f26094i
            int r2 = r2.m13681d()
            int r2 = -r2
            r9 = 6
            r10.m13129g(r6, r3, r2, r9)
            goto L34b
        L349:
            r13 = 5
            r15 = 4
        L34b:
            if (r4 == 0) goto L366
            w.d[] r2 = r0.f26124N
            int r3 = r17 + 1
            r2 = r2[r3]
            v.h r2 = r2.f26094i
            w.d[] r4 = r14.f26124N
            r6 = r4[r3]
            v.h r6 = r6.f26094i
            r3 = r4[r3]
            int r3 = r3.m13681d()
            r4 = 8
            r10.m13128f(r2, r6, r3, r4)
        L366:
            java.util.ArrayList<w.f> r2 = r1.f26073h
            if (r2 == 0) goto L476
            int r3 = r2.size()
            r4 = 1
            if (r3 <= r4) goto L476
            boolean r6 = r1.f26082q
            if (r6 == 0) goto L37d
            boolean r6 = r1.f26084s
            if (r6 != 0) goto L37d
            int r6 = r1.f26075j
            float r6 = (float) r6
            goto L37f
        L37d:
            r6 = r27
        L37f:
            r4 = r18
            r9 = 0
            r11 = 0
        L383:
            if (r11 >= r3) goto L476
            java.lang.Object r27 = r2.get(r11)
            r13 = r27
            w.f r13 = (p381w.C6765f) r13
            float[] r15 = r13.f26105A0
            r15 = r15[r39]
            r20 = 0
            int r27 = (r15 > r20 ? 1 : (r15 == r20 ? 0 : -1))
            if (r27 >= 0) goto L3af
            boolean r15 = r1.f26084s
            if (r15 == 0) goto L3ad
            w.d[] r0 = r13.f26124N
            int r13 = r17 + 1
            r13 = r0[r13]
            v.h r13 = r13.f26094i
            r0 = r0[r17]
            v.h r0 = r0.f26094i
            r19 = r12
            r15 = r13
            r12 = 0
            r13 = 4
            goto L3c7
        L3ad:
            r15 = 1065353216(0x3f800000, float:1.0)
        L3af:
            r20 = 0
            int r27 = (r15 > r20 ? 1 : (r15 == r20 ? 0 : -1))
            if (r27 != 0) goto L3d2
            w.d[] r0 = r13.f26124N
            int r13 = r17 + 1
            r13 = r0[r13]
            v.h r13 = r13.f26094i
            r0 = r0[r17]
            v.h r0 = r0.f26094i
            r19 = r12
            r15 = r13
            r12 = 0
            r13 = 8
        L3c7:
            r10.m13126d(r15, r0, r12, r13)
            r20 = r1
            r33 = r2
            r30 = r3
            goto L466
        L3d2:
            r19 = r12
            r12 = 0
            if (r4 == 0) goto L45b
            w.d[] r4 = r4.f26124N
            r12 = r4[r17]
            v.h r12 = r12.f26094i
            int r30 = r17 + 1
            r4 = r4[r30]
            v.h r4 = r4.f26094i
            w.d[] r0 = r13.f26124N
            r33 = r2
            r2 = r0[r17]
            v.h r2 = r2.f26094i
            r0 = r0[r30]
            v.h r0 = r0.f26094i
            r30 = r3
            v.b r3 = r37.m13135m()
            r34 = r13
            r13 = 0
            r3.f25071b = r13
            r20 = r1
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r35 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r35 == 0) goto L441
            int r35 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r35 != 0) goto L407
            goto L441
        L407:
            int r35 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r35 != 0) goto L418
            v.b$a r0 = r3.f25073d
            r2 = 1065353216(0x3f800000, float:1.0)
            r0.mo13091c(r12, r2)
            v.b$a r0 = r3.f25073d
            r0.mo13091c(r4, r1)
            goto L457
        L418:
            r13 = 1065353216(0x3f800000, float:1.0)
            if (r27 != 0) goto L427
            v.b$a r4 = r3.f25073d
            r4.mo13091c(r2, r13)
            v.b$a r2 = r3.f25073d
            r2.mo13091c(r0, r1)
            goto L457
        L427:
            float r9 = r9 / r6
            float r27 = r15 / r6
            float r9 = r9 / r27
            v.b$a r1 = r3.f25073d
            r1.mo13091c(r12, r13)
            v.b$a r1 = r3.f25073d
            r12 = -1082130432(0xffffffffbf800000, float:-1.0)
            r1.mo13091c(r4, r12)
            v.b$a r1 = r3.f25073d
            r1.mo13091c(r0, r9)
            v.b$a r0 = r3.f25073d
            float r1 = -r9
            goto L454
        L441:
            r13 = 1065353216(0x3f800000, float:1.0)
            v.b$a r9 = r3.f25073d
            r9.mo13091c(r12, r13)
            v.b$a r9 = r3.f25073d
            r9.mo13091c(r4, r1)
            v.b$a r4 = r3.f25073d
            r4.mo13091c(r0, r13)
            v.b$a r0 = r3.f25073d
        L454:
            r0.mo13091c(r2, r1)
        L457:
            r10.m13125c(r3)
            goto L463
        L45b:
            r20 = r1
            r33 = r2
            r30 = r3
            r34 = r13
        L463:
            r9 = r15
            r4 = r34
        L466:
            int r11 = r11 + 1
            r13 = 5
            r15 = 4
            r0 = r36
            r12 = r19
            r1 = r20
            r3 = r30
            r2 = r33
            goto L383
        L476:
            r20 = r1
            r19 = r12
            if (r8 == 0) goto L4db
            if (r8 == r7) goto L480
            if (r5 == 0) goto L4db
        L480:
            r0 = r32
            w.d[] r0 = r0.f26124N
            r0 = r0[r17]
            w.d[] r1 = r14.f26124N
            int r2 = r17 + 1
            r1 = r1[r2]
            w.d r0 = r0.f26091f
            if (r0 == 0) goto L494
            v.h r0 = r0.f26094i
            r3 = r0
            goto L496
        L494:
            r3 = r18
        L496:
            w.d r0 = r1.f26091f
            if (r0 == 0) goto L49e
            v.h r0 = r0.f26094i
            r6 = r0
            goto L4a0
        L49e:
            r6 = r18
        L4a0:
            w.d[] r0 = r8.f26124N
            r0 = r0[r17]
            w.d[] r1 = r7.f26124N
            r1 = r1[r2]
            if (r3 == 0) goto L4d3
            if (r6 == 0) goto L4d3
            r2 = r31
            if (r39 != 0) goto L4b3
            float r2 = r2.f26148f0
            goto L4b5
        L4b3:
            float r2 = r2.f26150g0
        L4b5:
            r5 = r2
            int r4 = r0.m13681d()
            int r9 = r1.m13681d()
            v.h r2 = r0.f26094i
            v.h r0 = r1.f26094i
            r11 = 7
            r1 = r37
            r12 = r7
            r7 = r0
            r13 = r8
            r8 = r9
            r15 = r24
            r24 = 2
            r9 = r11
            r1.m13124b(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L706
        L4d3:
            r12 = r7
            r13 = r8
            r15 = r24
            r24 = 2
            goto L706
        L4db:
            r12 = r7
            r13 = r8
            r15 = r24
            r0 = r32
            r24 = 2
            if (r22 == 0) goto L5d9
            if (r13 == 0) goto L5d9
            r1 = r20
            int r2 = r1.f26075j
            if (r2 <= 0) goto L4f4
            int r1 = r1.f26074i
            if (r1 != r2) goto L4f4
            r23 = 1
            goto L4f6
        L4f4:
            r23 = 0
        L4f6:
            r9 = r13
            r11 = r9
        L4f8:
            if (r11 == 0) goto L706
            w.f[] r1 = r11.f26109C0
            r1 = r1[r39]
            r8 = r1
        L4ff:
            if (r8 == 0) goto L50c
            int r1 = r8.f26156j0
            r7 = 8
            if (r1 != r7) goto L50e
            w.f[] r1 = r8.f26109C0
            r8 = r1[r39]
            goto L4ff
        L50c:
            r7 = 8
        L50e:
            if (r8 != 0) goto L519
            if (r11 != r12) goto L513
            goto L519
        L513:
            r21 = r8
            r20 = r9
            goto L5cb
        L519:
            w.d[] r1 = r11.f26124N
            r1 = r1[r17]
            v.h r2 = r1.f26094i
            w.d r3 = r1.f26091f
            if (r3 == 0) goto L526
            v.h r3 = r3.f26094i
            goto L528
        L526:
            r3 = r18
        L528:
            if (r9 == r11) goto L531
            w.d[] r3 = r9.f26124N
            int r4 = r17 + 1
            r3 = r3[r4]
            goto L541
        L531:
            if (r11 != r13) goto L546
            if (r9 != r11) goto L546
            w.d[] r3 = r0.f26124N
            r4 = r3[r17]
            w.d r4 = r4.f26091f
            if (r4 == 0) goto L544
            r3 = r3[r17]
            w.d r3 = r3.f26091f
        L541:
            v.h r3 = r3.f26094i
            goto L546
        L544:
            r3 = r18
        L546:
            int r1 = r1.m13681d()
            w.d[] r4 = r11.f26124N
            int r5 = r17 + 1
            r4 = r4[r5]
            int r4 = r4.m13681d()
            if (r8 == 0) goto L563
            w.d[] r6 = r8.f26124N
            r6 = r6[r17]
            v.h r7 = r6.f26094i
            r20 = r6
            w.d[] r6 = r11.f26124N
            r6 = r6[r5]
            goto L578
        L563:
            w.d[] r6 = r14.f26124N
            r6 = r6[r5]
            w.d r6 = r6.f26091f
            if (r6 == 0) goto L570
            v.h r7 = r6.f26094i
            r20 = r6
            goto L574
        L570:
            r20 = r6
            r7 = r18
        L574:
            w.d[] r6 = r11.f26124N
            r6 = r6[r5]
        L578:
            v.h r6 = r6.f26094i
            if (r20 == 0) goto L582
            int r20 = r20.m13681d()
            int r4 = r4 + r20
        L582:
            r20 = r4
            if (r9 == 0) goto L58f
            w.d[] r4 = r9.f26124N
            r4 = r4[r5]
            int r4 = r4.m13681d()
            int r1 = r1 + r4
        L58f:
            if (r2 == 0) goto L513
            if (r3 == 0) goto L513
            if (r7 == 0) goto L513
            if (r6 == 0) goto L513
            if (r11 != r13) goto L5a1
            w.d[] r1 = r13.f26124N
            r1 = r1[r17]
            int r1 = r1.m13681d()
        L5a1:
            r4 = r1
            if (r11 != r12) goto L5ae
            w.d[] r1 = r12.f26124N
            r1 = r1[r5]
            int r1 = r1.m13681d()
            r20 = r1
        L5ae:
            if (r23 == 0) goto L5b3
            r26 = 8
            goto L5b5
        L5b3:
            r26 = 5
        L5b5:
            r5 = 1056964608(0x3f000000, float:0.5)
            r1 = r37
            r27 = r6
            r6 = r7
            r21 = 8
            r7 = r27
            r21 = r8
            r8 = r20
            r20 = r9
            r9 = r26
            r1.m13124b(r2, r3, r4, r5, r6, r7, r8, r9)
        L5cb:
            int r1 = r11.f26156j0
            r9 = 8
            if (r1 == r9) goto L5d3
            r20 = r11
        L5d3:
            r9 = r20
            r11 = r21
            goto L4f8
        L5d9:
            r1 = r20
            r9 = 8
            if (r25 == 0) goto L706
            if (r13 == 0) goto L706
            int r2 = r1.f26075j
            if (r2 <= 0) goto L5ec
            int r1 = r1.f26074i
            if (r1 != r2) goto L5ec
            r23 = 1
            goto L5ee
        L5ec:
            r23 = 0
        L5ee:
            r8 = r13
            r11 = r8
        L5f0:
            if (r11 == 0) goto L6a9
            w.f[] r1 = r11.f26109C0
            r1 = r1[r39]
        L5f6:
            if (r1 == 0) goto L601
            int r2 = r1.f26156j0
            if (r2 != r9) goto L601
            w.f[] r1 = r1.f26109C0
            r1 = r1[r39]
            goto L5f6
        L601:
            if (r11 == r13) goto L691
            if (r11 == r12) goto L691
            if (r1 == 0) goto L691
            if (r1 != r12) goto L60c
            r7 = r18
            goto L60d
        L60c:
            r7 = r1
        L60d:
            w.d[] r1 = r11.f26124N
            r1 = r1[r17]
            v.h r2 = r1.f26094i
            w.d[] r3 = r8.f26124N
            int r4 = r17 + 1
            r3 = r3[r4]
            v.h r3 = r3.f26094i
            int r1 = r1.m13681d()
            w.d[] r5 = r11.f26124N
            r5 = r5[r4]
            int r5 = r5.m13681d()
            if (r7 == 0) goto L639
            w.d[] r6 = r7.f26124N
            r6 = r6[r17]
            v.h r9 = r6.f26094i
            r20 = r7
            w.d r7 = r6.f26091f
            if (r7 == 0) goto L636
            goto L64b
        L636:
            r7 = r18
            goto L64d
        L639:
            r20 = r7
            w.d[] r6 = r12.f26124N
            r6 = r6[r17]
            if (r6 == 0) goto L645
            v.h r7 = r6.f26094i
            r9 = r7
            goto L647
        L645:
            r9 = r18
        L647:
            w.d[] r7 = r11.f26124N
            r7 = r7[r4]
        L64b:
            v.h r7 = r7.f26094i
        L64d:
            if (r6 == 0) goto L657
            int r6 = r6.m13681d()
            int r6 = r6 + r5
            r21 = r6
            goto L659
        L657:
            r21 = r5
        L659:
            w.d[] r5 = r8.f26124N
            r4 = r5[r4]
            int r4 = r4.m13681d()
            int r4 = r4 + r1
            if (r23 == 0) goto L667
            r26 = 8
            goto L669
        L667:
            r26 = 4
        L669:
            if (r2 == 0) goto L686
            if (r3 == 0) goto L686
            if (r9 == 0) goto L686
            if (r7 == 0) goto L686
            r5 = 1056964608(0x3f000000, float:0.5)
            r1 = r37
            r27 = 4
            r6 = r9
            r28 = r8
            r8 = r21
            r21 = r15
            r15 = 8
            r9 = r26
            r1.m13124b(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L68e
        L686:
            r28 = r8
            r21 = r15
            r15 = 8
            r27 = 4
        L68e:
            r8 = r20
            goto L69a
        L691:
            r28 = r8
            r21 = r15
            r15 = 8
            r27 = 4
            r8 = r1
        L69a:
            int r1 = r11.f26156j0
            if (r1 == r15) goto L6a0
            r28 = r11
        L6a0:
            r11 = r8
            r15 = r21
            r8 = r28
            r9 = 8
            goto L5f0
        L6a9:
            r21 = r15
            w.d[] r1 = r13.f26124N
            r1 = r1[r17]
            w.d[] r0 = r0.f26124N
            r0 = r0[r17]
            w.d r0 = r0.f26091f
            w.d[] r2 = r12.f26124N
            int r3 = r17 + 1
            r11 = r2[r3]
            w.d[] r2 = r14.f26124N
            r2 = r2[r3]
            w.d r15 = r2.f26091f
            if (r0 == 0) goto L6f2
            if (r13 == r12) goto L6d2
            v.h r2 = r1.f26094i
            v.h r0 = r0.f26094i
            int r1 = r1.m13681d()
            r9 = 5
            r10.m13126d(r2, r0, r1, r9)
            goto L6f2
        L6d2:
            r9 = 5
            if (r15 == 0) goto L6f2
            v.h r2 = r1.f26094i
            v.h r3 = r0.f26094i
            int r4 = r1.m13681d()
            r5 = 1056964608(0x3f000000, float:0.5)
            v.h r6 = r11.f26094i
            v.h r7 = r15.f26094i
            int r8 = r11.m13681d()
            r0 = 5
            r1 = r37
            r20 = r14
            r14 = 5
            r9 = r0
            r1.m13124b(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L6f5
        L6f2:
            r20 = r14
            r14 = 5
        L6f5:
            if (r15 == 0) goto L70a
            if (r13 == r12) goto L70a
            v.h r0 = r11.f26094i
            v.h r1 = r15.f26094i
            int r2 = r11.m13681d()
            int r2 = -r2
            r10.m13126d(r0, r1, r2, r14)
            goto L70a
        L706:
            r20 = r14
            r21 = r15
        L70a:
            if (r22 != 0) goto L70e
            if (r25 == 0) goto L767
        L70e:
            if (r13 == 0) goto L767
            if (r13 == r12) goto L767
            w.d[] r0 = r13.f26124N
            r1 = r0[r17]
            w.d[] r2 = r12.f26124N
            int r3 = r17 + 1
            r2 = r2[r3]
            w.d r4 = r1.f26091f
            if (r4 == 0) goto L723
            v.h r4 = r4.f26094i
            goto L725
        L723:
            r4 = r18
        L725:
            w.d r5 = r2.f26091f
            if (r5 == 0) goto L72c
            v.h r5 = r5.f26094i
            goto L72e
        L72c:
            r5 = r18
        L72e:
            r6 = r20
            if (r6 == r12) goto L741
            w.d[] r5 = r6.f26124N
            r5 = r5[r3]
            w.d r5 = r5.f26091f
            if (r5 == 0) goto L73e
            v.h r5 = r5.f26094i
            r18 = r5
        L73e:
            r6 = r18
            goto L742
        L741:
            r6 = r5
        L742:
            if (r13 != r12) goto L748
            r1 = r0[r17]
            r2 = r0[r3]
        L748:
            if (r4 == 0) goto L767
            if (r6 == 0) goto L767
            r5 = 1056964608(0x3f000000, float:0.5)
            int r0 = r1.m13681d()
            w.d[] r7 = r12.f26124N
            r3 = r7[r3]
            int r8 = r3.m13681d()
            v.h r3 = r1.f26094i
            v.h r7 = r2.f26094i
            r9 = 5
            r1 = r37
            r2 = r3
            r3 = r4
            r4 = r0
            r1.m13124b(r2, r3, r4, r5, r6, r7, r8, r9)
        L767:
            int r9 = r21 + 1
            r13 = 2
            r0 = r36
            r11 = r38
            r12 = r19
            r15 = r29
            goto L1f
        L774:
            return
    }
}
