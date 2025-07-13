package p072e7;

/* renamed from: e7.d7 */
/* loaded from: classes.dex */
public final class C1590d7<T> implements p072e7.InterfaceC1670l7<T> {

    /* renamed from: l */
    public static final int[] f7524l = null;

    /* renamed from: m */
    public static final sun.misc.Unsafe f7525m = null;

    /* renamed from: a */
    public final int[] f7526a;

    /* renamed from: b */
    public final java.lang.Object[] f7527b;

    /* renamed from: c */
    public final p072e7.InterfaceC1560a7 f7528c;

    /* renamed from: d */
    public final boolean f7529d;

    /* renamed from: e */
    public final boolean f7530e;

    /* renamed from: f */
    public final int[] f7531f;

    /* renamed from: g */
    public final int f7532g;

    /* renamed from: h */
    public final int f7533h;

    /* renamed from: i */
    public final p072e7.AbstractC1699o6 f7534i;

    /* renamed from: j */
    public final p072e7.AbstractC1803z7<?, ?> f7535j;

    /* renamed from: k */
    public final p072e7.AbstractC1698o5<?> f7536k;

    static {
            r0 = 0
            int[] r0 = new int[r0]
            p072e7.C1590d7.f7524l = r0
            sun.misc.Unsafe r0 = p072e7.C1651j8.m4305k()
            p072e7.C1590d7.f7525m = r0
            return
    }

    public C1590d7(int[] r1, java.lang.Object[] r2, p072e7.InterfaceC1560a7 r3, boolean r4, int[] r5, int r6, int r7, p072e7.C1610f7 r8, p072e7.AbstractC1699o6 r9, p072e7.AbstractC1803z7 r10, p072e7.AbstractC1698o5 r11, p072e7.C1766v6 r12) {
            r0 = this;
            r0.<init>()
            r0.f7526a = r1
            r0.f7527b = r2
            r0.f7530e = r4
            if (r11 == 0) goto L13
            boolean r1 = r11.mo4409c(r3)
            if (r1 == 0) goto L13
            r1 = 1
            goto L14
        L13:
            r1 = 0
        L14:
            r0.f7529d = r1
            r0.f7531f = r5
            r0.f7532g = r6
            r0.f7533h = r7
            r0.f7534i = r9
            r0.f7535j = r10
            r0.f7536k = r11
            r0.f7528c = r3
            return
    }

    /* renamed from: k */
    public static <T> boolean m4150k(T r0, long r1) {
            java.lang.Object r0 = p072e7.C1651j8.m4304j(r0, r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
    }

    /* renamed from: m */
    public static final void m4151m(int r1, java.lang.Object r2, p072e7.C1678m5 r3) {
            boolean r0 = r2 instanceof java.lang.String
            if (r0 == 0) goto Lc
            java.lang.String r2 = (java.lang.String) r2
            e7.l5 r3 = r3.f7690a
            r3.mo4288y(r1, r2)
            return
        Lc:
            e7.i5 r2 = (p072e7.AbstractC1638i5) r2
            e7.l5 r3 = r3.f7690a
            r3.mo4281q(r1, r2)
            return
    }

    /* renamed from: n */
    public static p072e7.C1590d7 m4152n(p072e7.InterfaceC1793y6 r7, p072e7.C1610f7 r8, p072e7.AbstractC1699o6 r9, p072e7.AbstractC1803z7 r10, p072e7.AbstractC1698o5 r11, p072e7.C1766v6 r12) {
            boolean r0 = r7 instanceof p072e7.C1660k7
            if (r0 == 0) goto L11
            r1 = r7
            e7.k7 r1 = (p072e7.C1660k7) r1
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            e7.d7 r7 = m4153o(r1, r2, r3, r4, r5, r6)
            return r7
        L11:
            e7.x7 r7 = (p072e7.C1785x7) r7
            r7 = 0
            throw r7
    }

    /* renamed from: o */
    public static <T> p072e7.C1590d7<T> m4153o(p072e7.C1660k7 r33, p072e7.C1610f7 r34, p072e7.AbstractC1699o6 r35, p072e7.AbstractC1803z7<?, ?> r36, p072e7.AbstractC1698o5<?> r37, p072e7.C1766v6 r38) {
            r0 = r33
            int r1 = r0.f7679d
            r2 = 1
            r1 = r1 & r2
            r3 = 2
            if (r1 != r2) goto Lb
            r1 = 1
            goto Lc
        Lb:
            r1 = 2
        Lc:
            r4 = 0
            if (r1 != r3) goto L11
            r9 = 1
            goto L12
        L11:
            r9 = 0
        L12:
            java.lang.String r1 = r0.f7677b
            int r3 = r1.length()
            char r5 = r1.charAt(r4)
            r6 = 55296(0xd800, float:7.7486E-41)
            if (r5 < r6) goto L2c
            r5 = 1
        L22:
            int r7 = r5 + 1
            char r5 = r1.charAt(r5)
            if (r5 < r6) goto L2d
            r5 = r7
            goto L22
        L2c:
            r7 = 1
        L2d:
            int r5 = r7 + 1
            char r7 = r1.charAt(r7)
            if (r7 < r6) goto L4c
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            r10 = 13
        L39:
            int r11 = r5 + 1
            char r5 = r1.charAt(r5)
            if (r5 < r6) goto L49
            r5 = r5 & 8191(0x1fff, float:1.1478E-41)
            int r5 = r5 << r10
            r7 = r7 | r5
            int r10 = r10 + 13
            r5 = r11
            goto L39
        L49:
            int r5 = r5 << r10
            r7 = r7 | r5
            r5 = r11
        L4c:
            if (r7 != 0) goto L58
            int[] r7 = p072e7.C1590d7.f7524l
            r12 = r7
            r7 = 0
            r10 = 0
            r11 = 0
            r13 = 0
            r15 = 0
            goto L149
        L58:
            int r7 = r5 + 1
            char r5 = r1.charAt(r5)
            if (r5 < r6) goto L77
            r5 = r5 & 8191(0x1fff, float:1.1478E-41)
            r10 = 13
        L64:
            int r11 = r7 + 1
            char r7 = r1.charAt(r7)
            if (r7 < r6) goto L74
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            int r7 = r7 << r10
            r5 = r5 | r7
            int r10 = r10 + 13
            r7 = r11
            goto L64
        L74:
            int r7 = r7 << r10
            r5 = r5 | r7
            r7 = r11
        L77:
            int r10 = r7 + 1
            char r7 = r1.charAt(r7)
            if (r7 < r6) goto L96
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            r11 = 13
        L83:
            int r12 = r10 + 1
            char r10 = r1.charAt(r10)
            if (r10 < r6) goto L93
            r10 = r10 & 8191(0x1fff, float:1.1478E-41)
            int r10 = r10 << r11
            r7 = r7 | r10
            int r11 = r11 + 13
            r10 = r12
            goto L83
        L93:
            int r10 = r10 << r11
            r7 = r7 | r10
            r10 = r12
        L96:
            int r11 = r10 + 1
            char r10 = r1.charAt(r10)
            if (r10 < r6) goto La9
        L9e:
            int r10 = r11 + 1
            char r11 = r1.charAt(r11)
            if (r11 < r6) goto La8
            r11 = r10
            goto L9e
        La8:
            r11 = r10
        La9:
            int r10 = r11 + 1
            char r11 = r1.charAt(r11)
            if (r11 < r6) goto Lbc
        Lb1:
            int r11 = r10 + 1
            char r10 = r1.charAt(r10)
            if (r10 < r6) goto Lbb
            r10 = r11
            goto Lb1
        Lbb:
            r10 = r11
        Lbc:
            int r11 = r10 + 1
            char r10 = r1.charAt(r10)
            if (r10 < r6) goto Ldb
            r10 = r10 & 8191(0x1fff, float:1.1478E-41)
            r12 = 13
        Lc8:
            int r13 = r11 + 1
            char r11 = r1.charAt(r11)
            if (r11 < r6) goto Ld8
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            int r11 = r11 << r12
            r10 = r10 | r11
            int r12 = r12 + 13
            r11 = r13
            goto Lc8
        Ld8:
            int r11 = r11 << r12
            r10 = r10 | r11
            r11 = r13
        Ldb:
            int r12 = r11 + 1
            char r11 = r1.charAt(r11)
            if (r11 < r6) goto Lfa
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            r13 = 13
        Le7:
            int r14 = r12 + 1
            char r12 = r1.charAt(r12)
            if (r12 < r6) goto Lf7
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            int r12 = r12 << r13
            r11 = r11 | r12
            int r13 = r13 + 13
            r12 = r14
            goto Le7
        Lf7:
            int r12 = r12 << r13
            r11 = r11 | r12
            r12 = r14
        Lfa:
            int r13 = r12 + 1
            char r12 = r1.charAt(r12)
            if (r12 < r6) goto L119
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            r14 = 13
        L106:
            int r15 = r13 + 1
            char r13 = r1.charAt(r13)
            if (r13 < r6) goto L116
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            int r13 = r13 << r14
            r12 = r12 | r13
            int r14 = r14 + 13
            r13 = r15
            goto L106
        L116:
            int r13 = r13 << r14
            r12 = r12 | r13
            r13 = r15
        L119:
            int r14 = r13 + 1
            char r13 = r1.charAt(r13)
            if (r13 < r6) goto L13a
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            r15 = 13
        L125:
            int r16 = r14 + 1
            char r14 = r1.charAt(r14)
            if (r14 < r6) goto L136
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            int r14 = r14 << r15
            r13 = r13 | r14
            int r15 = r15 + 13
            r14 = r16
            goto L125
        L136:
            int r14 = r14 << r15
            r13 = r13 | r14
            r14 = r16
        L13a:
            int r15 = r13 + r11
            int r15 = r15 + r12
            int[] r12 = new int[r15]
            int r15 = r5 + r5
            int r15 = r15 + r7
            r7 = r5
            r5 = r14
            r32 = r13
            r13 = r11
            r11 = r32
        L149:
            sun.misc.Unsafe r14 = p072e7.C1590d7.f7525m
            java.lang.Object[] r4 = r0.f7678c
            e7.a7 r8 = r0.f7676a
            java.lang.Class r8 = r8.getClass()
            int r2 = r10 * 3
            int[] r2 = new int[r2]
            int r10 = r10 + r10
            java.lang.Object[] r10 = new java.lang.Object[r10]
            int r13 = r13 + r11
            r21 = r11
            r22 = r13
            r19 = 0
            r20 = 0
        L163:
            if (r5 >= r3) goto L3bf
            int r23 = r5 + 1
            char r5 = r1.charAt(r5)
            if (r5 < r6) goto L192
            r5 = r5 & 8191(0x1fff, float:1.1478E-41)
            r6 = r23
            r23 = 13
        L173:
            int r25 = r6 + 1
            char r6 = r1.charAt(r6)
            r26 = r3
            r3 = 55296(0xd800, float:7.7486E-41)
            if (r6 < r3) goto L18c
            r3 = r6 & 8191(0x1fff, float:1.1478E-41)
            int r3 = r3 << r23
            r5 = r5 | r3
            int r23 = r23 + 13
            r6 = r25
            r3 = r26
            goto L173
        L18c:
            int r3 = r6 << r23
            r5 = r5 | r3
            r3 = r25
            goto L196
        L192:
            r26 = r3
            r3 = r23
        L196:
            int r6 = r3 + 1
            char r3 = r1.charAt(r3)
            r23 = r6
            r6 = 55296(0xd800, float:7.7486E-41)
            if (r3 < r6) goto L1c8
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            r6 = r23
            r23 = 13
        L1a9:
            int r25 = r6 + 1
            char r6 = r1.charAt(r6)
            r27 = r13
            r13 = 55296(0xd800, float:7.7486E-41)
            if (r6 < r13) goto L1c2
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            int r6 = r6 << r23
            r3 = r3 | r6
            int r23 = r23 + 13
            r6 = r25
            r13 = r27
            goto L1a9
        L1c2:
            int r6 = r6 << r23
            r3 = r3 | r6
            r6 = r25
            goto L1cc
        L1c8:
            r27 = r13
            r6 = r23
        L1cc:
            r13 = r3 & 255(0xff, float:3.57E-43)
            r23 = r11
            r11 = r3 & 1024(0x400, float:1.435E-42)
            if (r11 == 0) goto L1da
            int r11 = r20 + 1
            r12[r20] = r19
            r20 = r11
        L1da:
            r11 = 51
            if (r13 < r11) goto L282
            int r11 = r6 + 1
            char r6 = r1.charAt(r6)
            r25 = r11
            r11 = 55296(0xd800, float:7.7486E-41)
            if (r6 < r11) goto L20e
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            r11 = r25
            r25 = 13
        L1f1:
            int r31 = r11 + 1
            char r11 = r1.charAt(r11)
            r0 = 55296(0xd800, float:7.7486E-41)
            if (r11 < r0) goto L208
            r0 = r11 & 8191(0x1fff, float:1.1478E-41)
            int r0 = r0 << r25
            r6 = r6 | r0
            int r25 = r25 + 13
            r0 = r33
            r11 = r31
            goto L1f1
        L208:
            int r0 = r11 << r25
            r6 = r6 | r0
            r11 = r31
            goto L210
        L20e:
            r11 = r25
        L210:
            int r0 = r13 + (-51)
            r25 = r11
            r11 = 9
            if (r0 == r11) goto L231
            r11 = 17
            if (r0 != r11) goto L21d
            goto L231
        L21d:
            r11 = 12
            if (r0 != r11) goto L23f
            if (r9 != 0) goto L23f
            int r0 = r19 / 3
            int r11 = r15 + 1
            int r0 = r0 + r0
            r18 = 1
            int r0 = r0 + 1
            r15 = r4[r15]
            r10[r0] = r15
            goto L23e
        L231:
            int r0 = r19 / 3
            int r11 = r15 + 1
            int r0 = r0 + r0
            r18 = 1
            int r0 = r0 + 1
            r15 = r4[r15]
            r10[r0] = r15
        L23e:
            r15 = r11
        L23f:
            int r6 = r6 + r6
            r0 = r4[r6]
            boolean r11 = r0 instanceof java.lang.reflect.Field
            if (r11 == 0) goto L249
            java.lang.reflect.Field r0 = (java.lang.reflect.Field) r0
            goto L251
        L249:
            java.lang.String r0 = (java.lang.String) r0
            java.lang.reflect.Field r0 = m4158z(r8, r0)
            r4[r6] = r0
        L251:
            r11 = r1
            long r0 = r14.objectFieldOffset(r0)
            int r1 = (int) r0
            int r6 = r6 + 1
            r0 = r4[r6]
            r28 = r1
            boolean r1 = r0 instanceof java.lang.reflect.Field
            if (r1 == 0) goto L264
            java.lang.reflect.Field r0 = (java.lang.reflect.Field) r0
            goto L26c
        L264:
            java.lang.String r0 = (java.lang.String) r0
            java.lang.reflect.Field r0 = m4158z(r8, r0)
            r4[r6] = r0
        L26c:
            long r0 = r14.objectFieldOffset(r0)
            int r1 = (int) r0
            r30 = r7
            r29 = r8
            r0 = r25
            r6 = 0
            r18 = 1
            r32 = r28
            r28 = r1
            r1 = r32
            goto L387
        L282:
            r11 = r1
            int r0 = r15 + 1
            r1 = r4[r15]
            java.lang.String r1 = (java.lang.String) r1
            java.lang.reflect.Field r1 = m4158z(r8, r1)
            r15 = 9
            if (r13 == r15) goto L2f6
            r15 = 17
            if (r13 != r15) goto L296
            goto L2f6
        L296:
            r15 = 27
            if (r13 == r15) goto L2e6
            r15 = 49
            if (r13 != r15) goto L29f
            goto L2e6
        L29f:
            r15 = 12
            if (r13 == r15) goto L2d6
            r15 = 30
            if (r13 == r15) goto L2d6
            r15 = 44
            if (r13 != r15) goto L2ac
            goto L2d6
        L2ac:
            r15 = 50
            if (r13 != r15) goto L2cc
            int r15 = r21 + 1
            r12[r21] = r19
            int r21 = r19 / 3
            int r21 = r21 + r21
            int r28 = r0 + 1
            r0 = r4[r0]
            r10[r21] = r0
            r0 = r3 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L2cf
            int r0 = r28 + 1
            int r21 = r21 + 1
            r28 = r4[r28]
            r10[r21] = r28
            r21 = r15
        L2cc:
            r18 = 1
            goto L303
        L2cf:
            r21 = r15
            r15 = r28
            r18 = 1
            goto L304
        L2d6:
            if (r9 != 0) goto L2cc
            int r15 = r19 / 3
            int r28 = r0 + 1
            int r15 = r15 + r15
            r18 = 1
            int r15 = r15 + 1
            r0 = r4[r0]
            r10[r15] = r0
            goto L2f3
        L2e6:
            r18 = 1
            int r15 = r19 / 3
            int r28 = r0 + 1
            int r15 = r15 + r15
            int r15 = r15 + 1
            r0 = r4[r0]
            r10[r15] = r0
        L2f3:
            r15 = r28
            goto L304
        L2f6:
            r18 = 1
            int r15 = r19 / 3
            int r15 = r15 + r15
            int r15 = r15 + 1
            java.lang.Class r28 = r1.getType()
            r10[r15] = r28
        L303:
            r15 = r0
        L304:
            long r0 = r14.objectFieldOffset(r1)
            int r1 = (int) r0
            r0 = r3 & 4096(0x1000, float:5.74E-42)
            r28 = 1048575(0xfffff, float:1.469367E-39)
            r29 = r11
            r11 = 4096(0x1000, float:5.74E-42)
            if (r0 != r11) goto L371
            r0 = 17
            if (r13 > r0) goto L371
            int r0 = r6 + 1
            r11 = r29
            char r6 = r11.charAt(r6)
            r28 = r0
            r0 = 55296(0xd800, float:7.7486E-41)
            if (r6 < r0) goto L348
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            r24 = r6
            r6 = r28
            r28 = 13
        L32f:
            int r29 = r6 + 1
            char r6 = r11.charAt(r6)
            if (r6 < r0) goto L342
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            int r6 = r6 << r28
            r24 = r24 | r6
            int r28 = r28 + 13
            r6 = r29
            goto L32f
        L342:
            int r6 = r6 << r28
            r6 = r24 | r6
            r28 = r29
        L348:
            int r24 = r7 + r7
            int r29 = r6 / 32
            int r29 = r29 + r24
            r0 = r4[r29]
            r30 = r7
            boolean r7 = r0 instanceof java.lang.reflect.Field
            if (r7 == 0) goto L359
            java.lang.reflect.Field r0 = (java.lang.reflect.Field) r0
            goto L361
        L359:
            java.lang.String r0 = (java.lang.String) r0
            java.lang.reflect.Field r0 = m4158z(r8, r0)
            r4[r29] = r0
        L361:
            r29 = r8
            long r7 = r14.objectFieldOffset(r0)
            int r0 = (int) r7
            int r6 = r6 % 32
            r32 = r28
            r28 = r0
            r0 = r32
            goto L379
        L371:
            r30 = r7
            r11 = r29
            r29 = r8
            r0 = r6
            r6 = 0
        L379:
            r7 = 18
            if (r13 < r7) goto L387
            r7 = 49
            if (r13 > r7) goto L387
            int r7 = r22 + 1
            r12[r22] = r1
            r22 = r7
        L387:
            int r7 = r19 + 1
            r2[r19] = r5
            int r5 = r7 + 1
            r8 = r3 & 512(0x200, float:7.17E-43)
            if (r8 == 0) goto L394
            r8 = 536870912(0x20000000, float:1.0842022E-19)
            goto L395
        L394:
            r8 = 0
        L395:
            r3 = r3 & 256(0x100, float:3.59E-43)
            if (r3 == 0) goto L39c
            r3 = 268435456(0x10000000, float:2.524355E-29)
            goto L39d
        L39c:
            r3 = 0
        L39d:
            r3 = r3 | r8
            int r8 = r13 << 20
            r3 = r3 | r8
            r1 = r1 | r3
            r2[r7] = r1
            int r19 = r5 + 1
            int r1 = r6 << 20
            r1 = r1 | r28
            r2[r5] = r1
            r5 = r0
            r1 = r11
            r11 = r23
            r3 = r26
            r13 = r27
            r8 = r29
            r7 = r30
            r6 = 55296(0xd800, float:7.7486E-41)
            r0 = r33
            goto L163
        L3bf:
            r23 = r11
            r27 = r13
            e7.d7 r0 = new e7.d7
            r1 = r33
            e7.a7 r8 = r1.f7676a
            r5 = r0
            r6 = r2
            r7 = r10
            r10 = r12
            r11 = r23
            r12 = r27
            r13 = r34
            r14 = r35
            r15 = r36
            r16 = r37
            r17 = r38
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return r0
    }

    /* renamed from: p */
    public static <T> double m4154p(T r0, long r1) {
            java.lang.Object r0 = p072e7.C1651j8.m4304j(r0, r1)
            java.lang.Double r0 = (java.lang.Double) r0
            double r0 = r0.doubleValue()
            return r0
    }

    /* renamed from: q */
    public static <T> float m4155q(T r0, long r1) {
            java.lang.Object r0 = p072e7.C1651j8.m4304j(r0, r1)
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            return r0
    }

    /* renamed from: t */
    public static <T> int m4156t(T r0, long r1) {
            java.lang.Object r0 = p072e7.C1651j8.m4304j(r0, r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            return r0
    }

    /* renamed from: w */
    public static <T> long m4157w(T r0, long r1) {
            java.lang.Object r0 = p072e7.C1651j8.m4304j(r0, r1)
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            return r0
    }

    /* renamed from: z */
    public static java.lang.reflect.Field m4158z(java.lang.Class<?> r7, java.lang.String r8) {
            java.lang.reflect.Field r7 = r7.getDeclaredField(r8)     // Catch: java.lang.NoSuchFieldException -> L5
            return r7
        L5:
            java.lang.reflect.Field[] r0 = r7.getDeclaredFields()
            int r1 = r0.length
            r2 = 0
        Lb:
            if (r2 >= r1) goto L1d
            r3 = r0[r2]
            java.lang.String r4 = r3.getName()
            boolean r4 = r8.equals(r4)
            if (r4 == 0) goto L1a
            return r3
        L1a:
            int r2 = r2 + 1
            goto Lb
        L1d:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r7 = r7.getName()
            java.lang.String r0 = java.util.Arrays.toString(r0)
            java.lang.String r2 = java.lang.String.valueOf(r8)
            int r2 = r2.length()
            int r3 = r7.length()
            java.lang.String r4 = java.lang.String.valueOf(r0)
            int r4 = r4.length()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r6 = 40
            int r2 = androidx.appcompat.widget.C0267d.m705a(r2, r6, r3, r4)
            r5.<init>(r2)
            java.lang.String r2 = "Field "
            java.lang.String r3 = " for "
            p179k1.C3661s.m8090a(r5, r2, r8, r3, r7)
            java.lang.String r7 = " not found. Known fields are "
            java.lang.String r7 = p346u.C6269n.m12888a(r5, r7, r0)
            r1.<init>(r7)
            throw r1
    }

    /* renamed from: A */
    public final void m4159A(T r4, T r5, int r6) {
            r3 = this;
            int[] r0 = r3.f7526a
            int r1 = r6 + 1
            r0 = r0[r1]
            r1 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r1
            long r0 = (long) r0
            boolean r2 = r3.m4164a(r5, r6)
            if (r2 != 0) goto L12
            return
        L12:
            java.lang.Object r2 = p072e7.C1651j8.m4304j(r4, r0)
            java.lang.Object r5 = p072e7.C1651j8.m4304j(r5, r0)
            if (r2 == 0) goto L2c
            if (r5 != 0) goto L1f
            goto L2c
        L1f:
            java.lang.Object r5 = p072e7.C1619g6.m4202b(r2, r5)
            e7.i8 r2 = p072e7.C1651j8.f7668c
            r2.m4264N(r4, r0, r5)
            r3.m4161C(r4, r6)
            return
        L2c:
            if (r5 == 0) goto L36
            e7.i8 r2 = p072e7.C1651j8.f7668c
            r2.m4264N(r4, r0, r5)
            r3.m4161C(r4, r6)
        L36:
            return
    }

    /* renamed from: B */
    public final void m4160B(T r5, T r6, int r7) {
            r4 = this;
            int[] r0 = r4.f7526a
            int r1 = r7 + 1
            r1 = r0[r1]
            r0 = r0[r7]
            r2 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r1 & r2
            long r1 = (long) r1
            boolean r3 = r4.m4173j(r6, r0, r7)
            if (r3 != 0) goto L14
            return
        L14:
            boolean r3 = r4.m4173j(r5, r0, r7)
            if (r3 == 0) goto L1f
            java.lang.Object r3 = p072e7.C1651j8.m4304j(r5, r1)
            goto L20
        L1f:
            r3 = 0
        L20:
            java.lang.Object r6 = p072e7.C1651j8.m4304j(r6, r1)
            if (r3 == 0) goto L36
            if (r6 != 0) goto L29
            goto L36
        L29:
            java.lang.Object r6 = p072e7.C1619g6.m4202b(r3, r6)
            e7.i8 r3 = p072e7.C1651j8.f7668c
            r3.m4264N(r5, r1, r6)
            r4.m4162D(r5, r0, r7)
            return
        L36:
            if (r6 == 0) goto L40
            e7.i8 r3 = p072e7.C1651j8.f7668c
            r3.m4264N(r5, r1, r6)
            r4.m4162D(r5, r0, r7)
        L40:
            return
    }

    /* renamed from: C */
    public final void m4161C(T r6, int r7) {
            r5 = this;
            int[] r0 = r5.f7526a
            int r7 = r7 + 2
            r7 = r0[r7]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r7
            long r0 = (long) r0
            r2 = 1048575(0xfffff, double:5.18065E-318)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L13
            return
        L13:
            int r2 = p072e7.C1651j8.m4301g(r6, r0)
            r3 = 1
            int r7 = r7 >>> 20
            int r7 = r3 << r7
            r7 = r7 | r2
            e7.i8 r2 = p072e7.C1651j8.f7668c
            r2.m4262F(r6, r0, r7)
            return
    }

    /* renamed from: D */
    public final void m4162D(T r3, int r4, int r5) {
            r2 = this;
            int[] r0 = r2.f7526a
            int r5 = r5 + 2
            r5 = r0[r5]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r5 = r5 & r0
            long r0 = (long) r5
            e7.i8 r5 = p072e7.C1651j8.f7668c
            r5.m4262F(r3, r0, r4)
            return
    }

    /* renamed from: E */
    public final boolean m4163E(T r1, T r2, int r3) {
            r0 = this;
            boolean r1 = r0.m4164a(r1, r3)
            boolean r2 = r0.m4164a(r2, r3)
            if (r1 != r2) goto Lc
            r1 = 1
            return r1
        Lc:
            r1 = 0
            return r1
    }

    /* renamed from: a */
    public final boolean m4164a(T r11, int r12) {
            r10 = this;
            int[] r0 = r10.f7526a
            int r1 = r12 + 2
            r1 = r0[r1]
            r2 = 1048575(0xfffff, float:1.469367E-39)
            r3 = r1 & r2
            long r3 = (long) r3
            r5 = 1048575(0xfffff, double:5.18065E-318)
            r7 = 0
            r8 = 1
            int r9 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r9 != 0) goto Lef
            int r12 = r12 + r8
            r12 = r0[r12]
            r0 = r12 & r2
            long r0 = (long) r0
            int r12 = r12 >>> 20
            r12 = r12 & 255(0xff, float:3.57E-43)
            r2 = 0
            switch(r12) {
                case 0: goto Le1;
                case 1: goto Ld5;
                case 2: goto Lcb;
                case 3: goto Lc1;
                case 4: goto Lb9;
                case 5: goto Laf;
                case 6: goto La7;
                case 7: goto La2;
                case 8: goto L7c;
                case 9: goto L74;
                case 10: goto L66;
                case 11: goto L5e;
                case 12: goto L56;
                case 13: goto L4e;
                case 14: goto L44;
                case 15: goto L3c;
                case 16: goto L32;
                case 17: goto L2a;
                default: goto L24;
            }
        L24:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            r11.<init>()
            throw r11
        L2a:
            java.lang.Object r11 = p072e7.C1651j8.m4304j(r11, r0)
            if (r11 == 0) goto L31
            return r8
        L31:
            return r7
        L32:
            long r11 = p072e7.C1651j8.m4302h(r11, r0)
            int r0 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r0 == 0) goto L3b
            return r8
        L3b:
            return r7
        L3c:
            int r11 = p072e7.C1651j8.m4301g(r11, r0)
            if (r11 == 0) goto L43
            return r8
        L43:
            return r7
        L44:
            long r11 = p072e7.C1651j8.m4302h(r11, r0)
            int r0 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r0 == 0) goto L4d
            return r8
        L4d:
            return r7
        L4e:
            int r11 = p072e7.C1651j8.m4301g(r11, r0)
            if (r11 == 0) goto L55
            return r8
        L55:
            return r7
        L56:
            int r11 = p072e7.C1651j8.m4301g(r11, r0)
            if (r11 == 0) goto L5d
            return r8
        L5d:
            return r7
        L5e:
            int r11 = p072e7.C1651j8.m4301g(r11, r0)
            if (r11 == 0) goto L65
            return r8
        L65:
            return r7
        L66:
            e7.i5 r12 = p072e7.AbstractC1638i5.f7635Z
            java.lang.Object r11 = p072e7.C1651j8.m4304j(r11, r0)
            boolean r11 = r12.equals(r11)
            if (r11 != 0) goto L73
            return r8
        L73:
            return r7
        L74:
            java.lang.Object r11 = p072e7.C1651j8.m4304j(r11, r0)
            if (r11 == 0) goto L7b
            return r8
        L7b:
            return r7
        L7c:
            java.lang.Object r11 = p072e7.C1651j8.m4304j(r11, r0)
            boolean r12 = r11 instanceof java.lang.String
            if (r12 == 0) goto L8e
            java.lang.String r11 = (java.lang.String) r11
            boolean r11 = r11.isEmpty()
            if (r11 != 0) goto L8d
            return r8
        L8d:
            return r7
        L8e:
            boolean r12 = r11 instanceof p072e7.AbstractC1638i5
            if (r12 == 0) goto L9c
            e7.i5 r12 = p072e7.AbstractC1638i5.f7635Z
            boolean r11 = r12.equals(r11)
            if (r11 != 0) goto L9b
            return r8
        L9b:
            return r7
        L9c:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            r11.<init>()
            throw r11
        La2:
            boolean r11 = p072e7.C1651j8.m4311q(r11, r0)
            return r11
        La7:
            int r11 = p072e7.C1651j8.m4301g(r11, r0)
            if (r11 == 0) goto Lae
            return r8
        Lae:
            return r7
        Laf:
            long r11 = p072e7.C1651j8.m4302h(r11, r0)
            int r0 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r0 == 0) goto Lb8
            return r8
        Lb8:
            return r7
        Lb9:
            int r11 = p072e7.C1651j8.m4301g(r11, r0)
            if (r11 == 0) goto Lc0
            return r8
        Lc0:
            return r7
        Lc1:
            long r11 = p072e7.C1651j8.m4302h(r11, r0)
            int r0 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r0 == 0) goto Lca
            return r8
        Lca:
            return r7
        Lcb:
            long r11 = p072e7.C1651j8.m4302h(r11, r0)
            int r0 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r0 == 0) goto Ld4
            return r8
        Ld4:
            return r7
        Ld5:
            float r11 = p072e7.C1651j8.m4300f(r11, r0)
            int r11 = java.lang.Float.floatToRawIntBits(r11)
            if (r11 == 0) goto Le0
            return r8
        Le0:
            return r7
        Le1:
            double r11 = p072e7.C1651j8.m4299e(r11, r0)
            long r11 = java.lang.Double.doubleToRawLongBits(r11)
            int r0 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r0 == 0) goto Lee
            return r8
        Lee:
            return r7
        Lef:
            int r11 = p072e7.C1651j8.m4301g(r11, r3)
            int r12 = r1 >>> 20
            int r12 = r8 << r12
            r11 = r11 & r12
            if (r11 == 0) goto Lfb
            return r8
        Lfb:
            return r7
    }

    @Override // p072e7.InterfaceC1670l7
    /* renamed from: b */
    public final int mo4165b(T r10) {
            r9 = this;
            int[] r0 = r9.f7526a
            int r0 = r0.length
            r1 = 0
            r2 = 0
        L5:
            if (r1 >= r0) goto L133
            int r3 = r9.m4178v(r1)
            int[] r4 = r9.f7526a
            r4 = r4[r1]
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r5 = r5 & r3
            long r5 = (long) r5
            int r3 = r3 >>> 20
            r3 = r3 & 255(0xff, float:3.57E-43)
            r7 = 37
            r8 = 1231(0x4cf, float:1.725E-42)
            switch(r3) {
                case 0: goto L11f;
                case 1: goto L114;
                case 2: goto L10d;
                case 3: goto L10d;
                case 4: goto L106;
                case 5: goto L10d;
                case 6: goto L106;
                case 7: goto Lf7;
                case 8: goto Lea;
                case 9: goto Ldc;
                case 10: goto Ld1;
                case 11: goto L106;
                case 12: goto L106;
                case 13: goto L106;
                case 14: goto L10d;
                case 15: goto L106;
                case 16: goto L10d;
                case 17: goto Lca;
                case 18: goto Ld1;
                case 19: goto Ld1;
                case 20: goto Ld1;
                case 21: goto Ld1;
                case 22: goto Ld1;
                case 23: goto Ld1;
                case 24: goto Ld1;
                case 25: goto Ld1;
                case 26: goto Ld1;
                case 27: goto Ld1;
                case 28: goto Ld1;
                case 29: goto Ld1;
                case 30: goto Ld1;
                case 31: goto Ld1;
                case 32: goto Ld1;
                case 33: goto Ld1;
                case 34: goto Ld1;
                case 35: goto Ld1;
                case 36: goto Ld1;
                case 37: goto Ld1;
                case 38: goto Ld1;
                case 39: goto Ld1;
                case 40: goto Ld1;
                case 41: goto Ld1;
                case 42: goto Ld1;
                case 43: goto Ld1;
                case 44: goto Ld1;
                case 45: goto Ld1;
                case 46: goto Ld1;
                case 47: goto Ld1;
                case 48: goto Ld1;
                case 49: goto Ld1;
                case 50: goto Ld1;
                case 51: goto Lbd;
                case 52: goto Lb0;
                case 53: goto La2;
                case 54: goto L9b;
                case 55: goto L8d;
                case 56: goto L86;
                case 57: goto L7f;
                case 58: goto L6d;
                case 59: goto L65;
                case 60: goto L5d;
                case 61: goto L55;
                case 62: goto L4e;
                case 63: goto L47;
                case 64: goto L40;
                case 65: goto L38;
                case 66: goto L31;
                case 67: goto L29;
                case 68: goto L21;
                default: goto L1f;
            }
        L1f:
            goto L12f
        L21:
            boolean r3 = r9.m4173j(r10, r4, r1)
            if (r3 == 0) goto L12f
            goto Ld1
        L29:
            boolean r3 = r9.m4173j(r10, r4, r1)
            if (r3 == 0) goto L12f
            goto La8
        L31:
            boolean r3 = r9.m4173j(r10, r4, r1)
            if (r3 == 0) goto L12f
            goto L93
        L38:
            boolean r3 = r9.m4173j(r10, r4, r1)
            if (r3 == 0) goto L12f
            goto La8
        L40:
            boolean r3 = r9.m4173j(r10, r4, r1)
            if (r3 == 0) goto L12f
            goto L93
        L47:
            boolean r3 = r9.m4173j(r10, r4, r1)
            if (r3 == 0) goto L12f
            goto L93
        L4e:
            boolean r3 = r9.m4173j(r10, r4, r1)
            if (r3 == 0) goto L12f
            goto L93
        L55:
            boolean r3 = r9.m4173j(r10, r4, r1)
            if (r3 == 0) goto L12f
            goto Ld1
        L5d:
            boolean r3 = r9.m4173j(r10, r4, r1)
            if (r3 == 0) goto L12f
            goto Ld1
        L65:
            boolean r3 = r9.m4173j(r10, r4, r1)
            if (r3 == 0) goto L12f
            goto Lea
        L6d:
            boolean r3 = r9.m4173j(r10, r4, r1)
            if (r3 == 0) goto L12f
            int r2 = r2 * 53
            boolean r3 = m4150k(r10, r5)
            java.nio.charset.Charset r4 = p072e7.C1619g6.f7568a
            if (r3 == 0) goto L102
            goto L104
        L7f:
            boolean r3 = r9.m4173j(r10, r4, r1)
            if (r3 == 0) goto L12f
            goto L93
        L86:
            boolean r3 = r9.m4173j(r10, r4, r1)
            if (r3 == 0) goto L12f
            goto La8
        L8d:
            boolean r3 = r9.m4173j(r10, r4, r1)
            if (r3 == 0) goto L12f
        L93:
            int r2 = r2 * 53
            int r3 = m4156t(r10, r5)
            goto L12d
        L9b:
            boolean r3 = r9.m4173j(r10, r4, r1)
            if (r3 == 0) goto L12f
            goto La8
        La2:
            boolean r3 = r9.m4173j(r10, r4, r1)
            if (r3 == 0) goto L12f
        La8:
            int r2 = r2 * 53
            long r3 = m4157w(r10, r5)
            goto L129
        Lb0:
            boolean r3 = r9.m4173j(r10, r4, r1)
            if (r3 == 0) goto L12f
            int r2 = r2 * 53
            float r3 = m4155q(r10, r5)
            goto L11a
        Lbd:
            boolean r3 = r9.m4173j(r10, r4, r1)
            if (r3 == 0) goto L12f
            int r2 = r2 * 53
            double r3 = m4154p(r10, r5)
            goto L125
        Lca:
            java.lang.Object r3 = p072e7.C1651j8.m4304j(r10, r5)
            if (r3 == 0) goto Le6
            goto Le2
        Ld1:
            int r2 = r2 * 53
            java.lang.Object r3 = p072e7.C1651j8.m4304j(r10, r5)
            int r3 = r3.hashCode()
            goto L12d
        Ldc:
            java.lang.Object r3 = p072e7.C1651j8.m4304j(r10, r5)
            if (r3 == 0) goto Le6
        Le2:
            int r7 = r3.hashCode()
        Le6:
            int r2 = r2 * 53
            int r2 = r2 + r7
            goto L12f
        Lea:
            int r2 = r2 * 53
            java.lang.Object r3 = p072e7.C1651j8.m4304j(r10, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L12d
        Lf7:
            int r2 = r2 * 53
            boolean r3 = p072e7.C1651j8.m4311q(r10, r5)
            java.nio.charset.Charset r4 = p072e7.C1619g6.f7568a
            if (r3 == 0) goto L102
            goto L104
        L102:
            r8 = 1237(0x4d5, float:1.733E-42)
        L104:
            int r2 = r2 + r8
            goto L12f
        L106:
            int r2 = r2 * 53
            int r3 = p072e7.C1651j8.m4301g(r10, r5)
            goto L12d
        L10d:
            int r2 = r2 * 53
            long r3 = p072e7.C1651j8.m4302h(r10, r5)
            goto L129
        L114:
            int r2 = r2 * 53
            float r3 = p072e7.C1651j8.m4300f(r10, r5)
        L11a:
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L12d
        L11f:
            int r2 = r2 * 53
            double r3 = p072e7.C1651j8.m4299e(r10, r5)
        L125:
            long r3 = java.lang.Double.doubleToLongBits(r3)
        L129:
            int r3 = p072e7.C1619g6.m4201a(r3)
        L12d:
            int r3 = r3 + r2
            r2 = r3
        L12f:
            int r1 = r1 + 3
            goto L5
        L133:
            int r2 = r2 * 53
            e7.z7<?, ?> r0 = r9.f7535j
            java.lang.Object r0 = r0.mo4133c(r10)
            int r0 = r0.hashCode()
            int r0 = r0 + r2
            boolean r1 = r9.f7529d
            if (r1 != 0) goto L145
            return r0
        L145:
            e7.o5<?> r0 = r9.f7536k
            r0.mo4407a(r10)
            r10 = 0
            throw r10
    }

    @Override // p072e7.InterfaceC1670l7
    /* renamed from: c */
    public final boolean mo4166c(T r19) {
            r18 = this;
            r6 = r18
            r7 = r19
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r9 = 0
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r1 = 0
            r10 = 0
        Ld:
            int r2 = r6.f7532g
            r11 = 0
            r3 = 1
            if (r10 >= r2) goto Lf9
            int[] r2 = r6.f7531f
            r12 = r2[r10]
            int[] r2 = r6.f7526a
            r13 = r2[r12]
            int r14 = r6.m4178v(r12)
            int[] r2 = r6.f7526a
            int r4 = r12 + 2
            r2 = r2[r4]
            r4 = r2 & r8
            int r2 = r2 >>> 20
            int r15 = r3 << r2
            if (r4 == r0) goto L3b
            if (r4 == r8) goto L36
            sun.misc.Unsafe r0 = p072e7.C1590d7.f7525m
            long r1 = (long) r4
            int r1 = r0.getInt(r7, r1)
        L36:
            r17 = r1
            r16 = r4
            goto L3f
        L3b:
            r16 = r0
            r17 = r1
        L3f:
            r0 = 268435456(0x10000000, float:2.524355E-29)
            r0 = r0 & r14
            if (r0 == 0) goto L56
            r0 = r18
            r1 = r19
            r2 = r12
            r3 = r16
            r4 = r17
            r5 = r15
            boolean r0 = r0.m4167d(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L55
            goto L56
        L55:
            return r9
        L56:
            int r0 = r14 >>> 20
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = 9
            if (r0 == r1) goto Lcf
            r1 = 17
            if (r0 == r1) goto Lcf
            r1 = 27
            if (r0 == r1) goto La7
            r1 = 60
            if (r0 == r1) goto L8f
            r1 = 68
            if (r0 == r1) goto L8f
            r1 = 49
            if (r0 == r1) goto La7
            r1 = 50
            if (r0 == r1) goto L78
            goto Lf1
        L78:
            r0 = r14 & r8
            long r0 = (long) r0
            java.lang.Object r0 = p072e7.C1651j8.m4304j(r7, r0)
            e7.u6 r0 = (p072e7.C1757u6) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L88
            goto Lf1
        L88:
            java.lang.Object r0 = r6.m4180y(r12)
            e7.t6 r0 = (p072e7.C1748t6) r0
            throw r11
        L8f:
            boolean r0 = r6.m4173j(r7, r13, r12)
            if (r0 == 0) goto Lf1
            e7.l7 r0 = r6.m4179x(r12)
            r1 = r14 & r8
            long r1 = (long) r1
            java.lang.Object r1 = p072e7.C1651j8.m4304j(r7, r1)
            boolean r0 = r0.mo4166c(r1)
            if (r0 != 0) goto Lf1
            return r9
        La7:
            r0 = r14 & r8
            long r0 = (long) r0
            java.lang.Object r0 = p072e7.C1651j8.m4304j(r7, r0)
            java.util.List r0 = (java.util.List) r0
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto Lf1
            e7.l7 r1 = r6.m4179x(r12)
            r2 = 0
        Lbb:
            int r3 = r0.size()
            if (r2 >= r3) goto Lf1
            java.lang.Object r3 = r0.get(r2)
            boolean r3 = r1.mo4166c(r3)
            if (r3 != 0) goto Lcc
            return r9
        Lcc:
            int r2 = r2 + 1
            goto Lbb
        Lcf:
            r0 = r18
            r1 = r19
            r2 = r12
            r3 = r16
            r4 = r17
            r5 = r15
            boolean r0 = r0.m4167d(r1, r2, r3, r4, r5)
            if (r0 == 0) goto Lf1
            e7.l7 r0 = r6.m4179x(r12)
            r1 = r14 & r8
            long r1 = (long) r1
            java.lang.Object r1 = p072e7.C1651j8.m4304j(r7, r1)
            boolean r0 = r0.mo4166c(r1)
            if (r0 != 0) goto Lf1
            return r9
        Lf1:
            int r10 = r10 + 1
            r0 = r16
            r1 = r17
            goto Ld
        Lf9:
            boolean r0 = r6.f7529d
            if (r0 != 0) goto Lfe
            return r3
        Lfe:
            e7.o5<?> r0 = r6.f7536k
            r0.mo4407a(r7)
            throw r11
    }

    /* renamed from: d */
    public final boolean m4167d(T r2, int r3, int r4, int r5, int r6) {
            r1 = this;
            r0 = 1048575(0xfffff, float:1.469367E-39)
            if (r4 != r0) goto La
            boolean r2 = r1.m4164a(r2, r3)
            return r2
        La:
            r2 = r5 & r6
            if (r2 == 0) goto L10
            r2 = 1
            return r2
        L10:
            r2 = 0
            return r2
    }

    @Override // p072e7.InterfaceC1670l7
    /* renamed from: e */
    public final int mo4168e(T r2) {
            r1 = this;
            boolean r0 = r1.f7530e
            if (r0 == 0) goto L9
            int r2 = r1.m4176s(r2)
            goto Ld
        L9:
            int r2 = r1.m4175r(r2)
        Ld:
            return r2
    }

    @Override // p072e7.InterfaceC1670l7
    /* renamed from: f */
    public final void mo4169f(T r10, T r11) {
            r9 = this;
            java.util.Objects.requireNonNull(r11)
            r0 = 0
        L4:
            int[] r1 = r9.f7526a
            int r1 = r1.length
            if (r0 >= r1) goto L135
            int r1 = r9.m4178v(r0)
            r2 = 1048575(0xfffff, float:1.469367E-39)
            r2 = r2 & r1
            long r5 = (long) r2
            int[] r2 = r9.f7526a
            r2 = r2[r0]
            int r1 = r1 >>> 20
            r1 = r1 & 255(0xff, float:3.57E-43)
            switch(r1) {
                case 0: goto L11e;
                case 1: goto L10e;
                case 2: goto L100;
                case 3: goto Lf9;
                case 4: goto Le9;
                case 5: goto Le2;
                case 6: goto Ldb;
                case 7: goto Lcb;
                case 8: goto Lbb;
                case 9: goto Lb6;
                case 10: goto Laf;
                case 11: goto La8;
                case 12: goto La1;
                case 13: goto L9a;
                case 14: goto L92;
                case 15: goto L8b;
                case 16: goto L83;
                case 17: goto Lb6;
                case 18: goto L7c;
                case 19: goto L7c;
                case 20: goto L7c;
                case 21: goto L7c;
                case 22: goto L7c;
                case 23: goto L7c;
                case 24: goto L7c;
                case 25: goto L7c;
                case 26: goto L7c;
                case 27: goto L7c;
                case 28: goto L7c;
                case 29: goto L7c;
                case 30: goto L7c;
                case 31: goto L7c;
                case 32: goto L7c;
                case 33: goto L7c;
                case 34: goto L7c;
                case 35: goto L7c;
                case 36: goto L7c;
                case 37: goto L7c;
                case 38: goto L7c;
                case 39: goto L7c;
                case 40: goto L7c;
                case 41: goto L7c;
                case 42: goto L7c;
                case 43: goto L7c;
                case 44: goto L7c;
                case 45: goto L7c;
                case 46: goto L7c;
                case 47: goto L7c;
                case 48: goto L7c;
                case 49: goto L7c;
                case 50: goto L3f;
                case 51: goto L2b;
                case 52: goto L2b;
                case 53: goto L2b;
                case 54: goto L2b;
                case 55: goto L2b;
                case 56: goto L2b;
                case 57: goto L2b;
                case 58: goto L2b;
                case 59: goto L2b;
                case 60: goto L26;
                case 61: goto L1f;
                case 62: goto L1f;
                case 63: goto L1f;
                case 64: goto L1f;
                case 65: goto L1f;
                case 66: goto L1f;
                case 67: goto L1f;
                case 68: goto L26;
                default: goto L1d;
            }
        L1d:
            goto L131
        L1f:
            boolean r1 = r9.m4173j(r11, r2, r0)
            if (r1 == 0) goto L131
            goto L31
        L26:
            r9.m4160B(r10, r11, r0)
            goto L131
        L2b:
            boolean r1 = r9.m4173j(r11, r2, r0)
            if (r1 == 0) goto L131
        L31:
            java.lang.Object r1 = p072e7.C1651j8.m4304j(r11, r5)
            e7.i8 r3 = p072e7.C1651j8.f7668c
            r3.m4264N(r10, r5, r1)
            r9.m4162D(r10, r2, r0)
            goto L131
        L3f:
            java.lang.Class<?> r1 = p072e7.C1690n7.f7703a
            java.lang.Object r1 = p072e7.C1651j8.m4304j(r10, r5)
            java.lang.Object r2 = p072e7.C1651j8.m4304j(r11, r5)
            e7.u6 r1 = (p072e7.C1757u6) r1
            e7.u6 r2 = (p072e7.C1757u6) r2
            boolean r3 = r2.isEmpty()
            if (r3 != 0) goto L75
            boolean r3 = r1.f7807Y
            if (r3 != 0) goto L69
            boolean r3 = r1.isEmpty()
            if (r3 == 0) goto L63
            e7.u6 r1 = new e7.u6
            r1.<init>()
            goto L69
        L63:
            e7.u6 r3 = new e7.u6
            r3.<init>(r1)
            r1 = r3
        L69:
            r1.m4455b()
            boolean r3 = r2.isEmpty()
            if (r3 != 0) goto L75
            r1.putAll(r2)
        L75:
            e7.i8 r2 = p072e7.C1651j8.f7668c
            r2.m4264N(r10, r5, r1)
            goto L131
        L7c:
            e7.o6 r1 = r9.f7534i
            r1.mo4347b(r10, r11, r5)
            goto L131
        L83:
            boolean r1 = r9.m4164a(r11, r0)
            if (r1 == 0) goto L131
            goto L106
        L8b:
            boolean r1 = r9.m4164a(r11, r0)
            if (r1 == 0) goto L131
            goto Lef
        L92:
            boolean r1 = r9.m4164a(r11, r0)
            if (r1 == 0) goto L131
            goto L106
        L9a:
            boolean r1 = r9.m4164a(r11, r0)
            if (r1 == 0) goto L131
            goto Lef
        La1:
            boolean r1 = r9.m4164a(r11, r0)
            if (r1 == 0) goto L131
            goto Lef
        La8:
            boolean r1 = r9.m4164a(r11, r0)
            if (r1 == 0) goto L131
            goto Lef
        Laf:
            boolean r1 = r9.m4164a(r11, r0)
            if (r1 == 0) goto L131
            goto Lc1
        Lb6:
            r9.m4159A(r10, r11, r0)
            goto L131
        Lbb:
            boolean r1 = r9.m4164a(r11, r0)
            if (r1 == 0) goto L131
        Lc1:
            java.lang.Object r1 = p072e7.C1651j8.m4304j(r11, r5)
            e7.i8 r2 = p072e7.C1651j8.f7668c
            r2.m4264N(r10, r5, r1)
            goto L12e
        Lcb:
            boolean r1 = r9.m4164a(r11, r0)
            if (r1 == 0) goto L131
            boolean r1 = p072e7.C1651j8.m4311q(r11, r5)
            e7.i8 r2 = p072e7.C1651j8.f7668c
            r2.mo4205c(r10, r5, r1)
            goto L12e
        Ldb:
            boolean r1 = r9.m4164a(r11, r0)
            if (r1 == 0) goto L131
            goto Lef
        Le2:
            boolean r1 = r9.m4164a(r11, r0)
            if (r1 == 0) goto L131
            goto L106
        Le9:
            boolean r1 = r9.m4164a(r11, r0)
            if (r1 == 0) goto L131
        Lef:
            int r1 = p072e7.C1651j8.m4301g(r11, r5)
            e7.i8 r2 = p072e7.C1651j8.f7668c
            r2.m4262F(r10, r5, r1)
            goto L12e
        Lf9:
            boolean r1 = r9.m4164a(r11, r0)
            if (r1 == 0) goto L131
            goto L106
        L100:
            boolean r1 = r9.m4164a(r11, r0)
            if (r1 == 0) goto L131
        L106:
            long r1 = p072e7.C1651j8.m4302h(r11, r5)
            p072e7.C1651j8.m4307m(r10, r5, r1)
            goto L12e
        L10e:
            boolean r1 = r9.m4164a(r11, r0)
            if (r1 == 0) goto L131
            float r1 = p072e7.C1651j8.m4300f(r11, r5)
            e7.i8 r2 = p072e7.C1651j8.f7668c
            r2.mo4208f(r10, r5, r1)
            goto L12e
        L11e:
            boolean r1 = r9.m4164a(r11, r0)
            if (r1 == 0) goto L131
            double r7 = p072e7.C1651j8.m4299e(r11, r5)
            e7.i8 r3 = p072e7.C1651j8.f7668c
            r4 = r10
            r3.mo4207e(r4, r5, r7)
        L12e:
            r9.m4161C(r10, r0)
        L131:
            int r0 = r0 + 3
            goto L4
        L135:
            e7.z7<?, ?> r0 = r9.f7535j
            java.lang.Class<?> r1 = p072e7.C1690n7.f7703a
            java.lang.Object r1 = r0.mo4133c(r10)
            java.lang.Object r2 = r0.mo4133c(r11)
            java.lang.Object r1 = r0.mo4134d(r1, r2)
            r0.mo4136f(r10, r1)
            boolean r10 = r9.f7529d
            if (r10 != 0) goto L14d
            return
        L14d:
            e7.o5<?> r10 = r9.f7536k
            r10.mo4407a(r11)
            r10 = 0
            throw r10
    }

    @Override // p072e7.InterfaceC1670l7
    /* renamed from: g */
    public final void mo4170g(T r11, p072e7.C1678m5 r12) {
            r10 = this;
            boolean r0 = r10.f7530e
            if (r0 == 0) goto L460
            boolean r0 = r10.f7529d
            r1 = 0
            if (r0 != 0) goto L45a
            int[] r0 = r10.f7526a
            int r0 = r0.length
            r2 = 0
            r3 = 0
        Le:
            if (r3 >= r0) goto L450
            int r4 = r10.m4178v(r3)
            int[] r5 = r10.f7526a
            r6 = r5[r3]
            int r7 = r4 >>> 20
            r7 = r7 & 255(0xff, float:3.57E-43)
            r8 = 1
            r9 = 1048575(0xfffff, float:1.469367E-39)
            switch(r7) {
                case 0: goto L43d;
                case 1: goto L42d;
                case 2: goto L41b;
                case 3: goto L409;
                case 4: goto L3f7;
                case 5: goto L3e5;
                case 6: goto L3d3;
                case 7: goto L3c0;
                case 8: goto L3af;
                case 9: goto L39a;
                case 10: goto L385;
                case 11: goto L372;
                case 12: goto L35f;
                case 13: goto L34c;
                case 14: goto L339;
                case 15: goto L328;
                case 16: goto L317;
                case 17: goto L302;
                case 18: goto L2f3;
                case 19: goto L2e4;
                case 20: goto L2d5;
                case 21: goto L2c6;
                case 22: goto L2b7;
                case 23: goto L2a8;
                case 24: goto L299;
                case 25: goto L28a;
                case 26: goto L27b;
                case 27: goto L268;
                case 28: goto L259;
                case 29: goto L24a;
                case 30: goto L23b;
                case 31: goto L22c;
                case 32: goto L21d;
                case 33: goto L20e;
                case 34: goto L1ff;
                case 35: goto L1f0;
                case 36: goto L1e1;
                case 37: goto L1d2;
                case 38: goto L1c3;
                case 39: goto L1b4;
                case 40: goto L1a5;
                case 41: goto L196;
                case 42: goto L187;
                case 43: goto L178;
                case 44: goto L169;
                case 45: goto L15a;
                case 46: goto L14b;
                case 47: goto L13c;
                case 48: goto L12d;
                case 49: goto L11a;
                case 50: goto L109;
                case 51: goto Lfb;
                case 52: goto Led;
                case 53: goto Ldf;
                case 54: goto Ld1;
                case 55: goto Lc3;
                case 56: goto Lb5;
                case 57: goto La7;
                case 58: goto L99;
                case 59: goto L91;
                case 60: goto L89;
                case 61: goto L81;
                case 62: goto L73;
                case 63: goto L65;
                case 64: goto L57;
                case 65: goto L49;
                case 66: goto L3b;
                case 67: goto L2d;
                case 68: goto L25;
                default: goto L23;
            }
        L23:
            goto L44c
        L25:
            boolean r5 = r10.m4173j(r11, r6, r3)
            if (r5 == 0) goto L44c
            goto L308
        L2d:
            boolean r5 = r10.m4173j(r11, r6, r3)
            if (r5 == 0) goto L44c
            r4 = r4 & r9
            long r4 = (long) r4
            long r4 = m4157w(r11, r4)
            goto L323
        L3b:
            boolean r5 = r10.m4173j(r11, r6, r3)
            if (r5 == 0) goto L44c
            r4 = r4 & r9
            long r4 = (long) r4
            int r4 = m4156t(r11, r4)
            goto L334
        L49:
            boolean r5 = r10.m4173j(r11, r6, r3)
            if (r5 == 0) goto L44c
            r4 = r4 & r9
            long r4 = (long) r4
            long r4 = m4157w(r11, r4)
            goto L345
        L57:
            boolean r5 = r10.m4173j(r11, r6, r3)
            if (r5 == 0) goto L44c
            r4 = r4 & r9
            long r4 = (long) r4
            int r4 = m4156t(r11, r4)
            goto L358
        L65:
            boolean r5 = r10.m4173j(r11, r6, r3)
            if (r5 == 0) goto L44c
            r4 = r4 & r9
            long r4 = (long) r4
            int r4 = m4156t(r11, r4)
            goto L36b
        L73:
            boolean r5 = r10.m4173j(r11, r6, r3)
            if (r5 == 0) goto L44c
            r4 = r4 & r9
            long r4 = (long) r4
            int r4 = m4156t(r11, r4)
            goto L37e
        L81:
            boolean r5 = r10.m4173j(r11, r6, r3)
            if (r5 == 0) goto L44c
            goto L38b
        L89:
            boolean r5 = r10.m4173j(r11, r6, r3)
            if (r5 == 0) goto L44c
            goto L3a0
        L91:
            boolean r5 = r10.m4173j(r11, r6, r3)
            if (r5 == 0) goto L44c
            goto L3b5
        L99:
            boolean r5 = r10.m4173j(r11, r6, r3)
            if (r5 == 0) goto L44c
            r4 = r4 & r9
            long r4 = (long) r4
            boolean r4 = m4150k(r11, r4)
            goto L3cc
        La7:
            boolean r5 = r10.m4173j(r11, r6, r3)
            if (r5 == 0) goto L44c
            r4 = r4 & r9
            long r4 = (long) r4
            int r4 = m4156t(r11, r4)
            goto L3df
        Lb5:
            boolean r5 = r10.m4173j(r11, r6, r3)
            if (r5 == 0) goto L44c
            r4 = r4 & r9
            long r4 = (long) r4
            long r4 = m4157w(r11, r4)
            goto L3f1
        Lc3:
            boolean r5 = r10.m4173j(r11, r6, r3)
            if (r5 == 0) goto L44c
            r4 = r4 & r9
            long r4 = (long) r4
            int r4 = m4156t(r11, r4)
            goto L403
        Ld1:
            boolean r5 = r10.m4173j(r11, r6, r3)
            if (r5 == 0) goto L44c
            r4 = r4 & r9
            long r4 = (long) r4
            long r4 = m4157w(r11, r4)
            goto L415
        Ldf:
            boolean r5 = r10.m4173j(r11, r6, r3)
            if (r5 == 0) goto L44c
            r4 = r4 & r9
            long r4 = (long) r4
            long r4 = m4157w(r11, r4)
            goto L427
        Led:
            boolean r5 = r10.m4173j(r11, r6, r3)
            if (r5 == 0) goto L44c
            r4 = r4 & r9
            long r4 = (long) r4
            float r4 = m4155q(r11, r4)
            goto L439
        Lfb:
            boolean r5 = r10.m4173j(r11, r6, r3)
            if (r5 == 0) goto L44c
            r4 = r4 & r9
            long r4 = (long) r4
            double r4 = m4154p(r11, r4)
            goto L449
        L109:
            r4 = r4 & r9
            long r4 = (long) r4
            java.lang.Object r4 = p072e7.C1651j8.m4304j(r11, r4)
            if (r4 != 0) goto L113
            goto L44c
        L113:
            java.lang.Object r11 = r10.m4180y(r3)
            e7.t6 r11 = (p072e7.C1748t6) r11
            throw r1
        L11a:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = p072e7.C1651j8.m4304j(r11, r6)
            java.util.List r4 = (java.util.List) r4
            e7.l7 r6 = r10.m4179x(r3)
            p072e7.C1690n7.m4383i(r5, r4, r12, r6)
            goto L44c
        L12d:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = p072e7.C1651j8.m4304j(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p072e7.C1690n7.m4390p(r5, r4, r12, r8)
            goto L44c
        L13c:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = p072e7.C1651j8.m4304j(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p072e7.C1690n7.m4389o(r5, r4, r12, r8)
            goto L44c
        L14b:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = p072e7.C1651j8.m4304j(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p072e7.C1690n7.m4388n(r5, r4, r12, r8)
            goto L44c
        L15a:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = p072e7.C1651j8.m4304j(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p072e7.C1690n7.m4387m(r5, r4, r12, r8)
            goto L44c
        L169:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = p072e7.C1651j8.m4304j(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p072e7.C1690n7.m4379e(r5, r4, r12, r8)
            goto L44c
        L178:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = p072e7.C1651j8.m4304j(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p072e7.C1690n7.m4392r(r5, r4, r12, r8)
            goto L44c
        L187:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = p072e7.C1651j8.m4304j(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p072e7.C1690n7.m4376b(r5, r4, r12, r8)
            goto L44c
        L196:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = p072e7.C1651j8.m4304j(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p072e7.C1690n7.m4380f(r5, r4, r12, r8)
            goto L44c
        L1a5:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = p072e7.C1651j8.m4304j(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p072e7.C1690n7.m4381g(r5, r4, r12, r8)
            goto L44c
        L1b4:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = p072e7.C1651j8.m4304j(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p072e7.C1690n7.m4384j(r5, r4, r12, r8)
            goto L44c
        L1c3:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = p072e7.C1651j8.m4304j(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p072e7.C1690n7.m4393s(r5, r4, r12, r8)
            goto L44c
        L1d2:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = p072e7.C1651j8.m4304j(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p072e7.C1690n7.m4385k(r5, r4, r12, r8)
            goto L44c
        L1e1:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = p072e7.C1651j8.m4304j(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p072e7.C1690n7.m4382h(r5, r4, r12, r8)
            goto L44c
        L1f0:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = p072e7.C1651j8.m4304j(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p072e7.C1690n7.m4378d(r5, r4, r12, r8)
            goto L44c
        L1ff:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = p072e7.C1651j8.m4304j(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p072e7.C1690n7.m4390p(r5, r4, r12, r2)
            goto L44c
        L20e:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = p072e7.C1651j8.m4304j(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p072e7.C1690n7.m4389o(r5, r4, r12, r2)
            goto L44c
        L21d:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = p072e7.C1651j8.m4304j(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p072e7.C1690n7.m4388n(r5, r4, r12, r2)
            goto L44c
        L22c:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = p072e7.C1651j8.m4304j(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p072e7.C1690n7.m4387m(r5, r4, r12, r2)
            goto L44c
        L23b:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = p072e7.C1651j8.m4304j(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p072e7.C1690n7.m4379e(r5, r4, r12, r2)
            goto L44c
        L24a:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = p072e7.C1651j8.m4304j(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p072e7.C1690n7.m4392r(r5, r4, r12, r2)
            goto L44c
        L259:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = p072e7.C1651j8.m4304j(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p072e7.C1690n7.m4377c(r5, r4, r12)
            goto L44c
        L268:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = p072e7.C1651j8.m4304j(r11, r6)
            java.util.List r4 = (java.util.List) r4
            e7.l7 r6 = r10.m4179x(r3)
            p072e7.C1690n7.m4386l(r5, r4, r12, r6)
            goto L44c
        L27b:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = p072e7.C1651j8.m4304j(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p072e7.C1690n7.m4391q(r5, r4, r12)
            goto L44c
        L28a:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = p072e7.C1651j8.m4304j(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p072e7.C1690n7.m4376b(r5, r4, r12, r2)
            goto L44c
        L299:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = p072e7.C1651j8.m4304j(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p072e7.C1690n7.m4380f(r5, r4, r12, r2)
            goto L44c
        L2a8:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = p072e7.C1651j8.m4304j(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p072e7.C1690n7.m4381g(r5, r4, r12, r2)
            goto L44c
        L2b7:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = p072e7.C1651j8.m4304j(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p072e7.C1690n7.m4384j(r5, r4, r12, r2)
            goto L44c
        L2c6:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = p072e7.C1651j8.m4304j(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p072e7.C1690n7.m4393s(r5, r4, r12, r2)
            goto L44c
        L2d5:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = p072e7.C1651j8.m4304j(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p072e7.C1690n7.m4385k(r5, r4, r12, r2)
            goto L44c
        L2e4:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = p072e7.C1651j8.m4304j(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p072e7.C1690n7.m4382h(r5, r4, r12, r2)
            goto L44c
        L2f3:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = p072e7.C1651j8.m4304j(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p072e7.C1690n7.m4378d(r5, r4, r12, r2)
            goto L44c
        L302:
            boolean r5 = r10.m4164a(r11, r3)
            if (r5 == 0) goto L44c
        L308:
            r4 = r4 & r9
            long r4 = (long) r4
            java.lang.Object r4 = p072e7.C1651j8.m4304j(r11, r4)
            e7.l7 r5 = r10.m4179x(r3)
            r12.m4343d(r6, r4, r5)
            goto L44c
        L317:
            boolean r5 = r10.m4164a(r11, r3)
            if (r5 == 0) goto L44c
            r4 = r4 & r9
            long r4 = (long) r4
            long r4 = p072e7.C1651j8.m4302h(r11, r4)
        L323:
            r12.m4340a(r6, r4)
            goto L44c
        L328:
            boolean r5 = r10.m4164a(r11, r3)
            if (r5 == 0) goto L44c
            r4 = r4 & r9
            long r4 = (long) r4
            int r4 = p072e7.C1651j8.m4301g(r11, r4)
        L334:
            r12.m4345f(r6, r4)
            goto L44c
        L339:
            boolean r5 = r10.m4164a(r11, r3)
            if (r5 == 0) goto L44c
            r4 = r4 & r9
            long r4 = (long) r4
            long r4 = p072e7.C1651j8.m4302h(r11, r4)
        L345:
            e7.l5 r7 = r12.f7690a
            r7.mo4284u(r6, r4)
            goto L44c
        L34c:
            boolean r5 = r10.m4164a(r11, r3)
            if (r5 == 0) goto L44c
            r4 = r4 & r9
            long r4 = (long) r4
            int r4 = p072e7.C1651j8.m4301g(r11, r4)
        L358:
            e7.l5 r5 = r12.f7690a
            r5.mo4282r(r6, r4)
            goto L44c
        L35f:
            boolean r5 = r10.m4164a(r11, r3)
            if (r5 == 0) goto L44c
            r4 = r4 & r9
            long r4 = (long) r4
            int r4 = p072e7.C1651j8.m4301g(r11, r4)
        L36b:
            e7.l5 r5 = r12.f7690a
            r5.mo4286w(r6, r4)
            goto L44c
        L372:
            boolean r5 = r10.m4164a(r11, r3)
            if (r5 == 0) goto L44c
            r4 = r4 & r9
            long r4 = (long) r4
            int r4 = p072e7.C1651j8.m4301g(r11, r4)
        L37e:
            e7.l5 r5 = r12.f7690a
            r5.mo4272A(r6, r4)
            goto L44c
        L385:
            boolean r5 = r10.m4164a(r11, r3)
            if (r5 == 0) goto L44c
        L38b:
            r4 = r4 & r9
            long r4 = (long) r4
            java.lang.Object r4 = p072e7.C1651j8.m4304j(r11, r4)
            e7.i5 r4 = (p072e7.AbstractC1638i5) r4
            e7.l5 r5 = r12.f7690a
            r5.mo4281q(r6, r4)
            goto L44c
        L39a:
            boolean r5 = r10.m4164a(r11, r3)
            if (r5 == 0) goto L44c
        L3a0:
            r4 = r4 & r9
            long r4 = (long) r4
            java.lang.Object r4 = p072e7.C1651j8.m4304j(r11, r4)
            e7.l7 r5 = r10.m4179x(r3)
            r12.m4344e(r6, r4, r5)
            goto L44c
        L3af:
            boolean r5 = r10.m4164a(r11, r3)
            if (r5 == 0) goto L44c
        L3b5:
            r4 = r4 & r9
            long r4 = (long) r4
            java.lang.Object r4 = p072e7.C1651j8.m4304j(r11, r4)
            m4151m(r6, r4, r12)
            goto L44c
        L3c0:
            boolean r5 = r10.m4164a(r11, r3)
            if (r5 == 0) goto L44c
            r4 = r4 & r9
            long r4 = (long) r4
            boolean r4 = p072e7.C1651j8.m4311q(r11, r4)
        L3cc:
            e7.l5 r5 = r12.f7690a
            r5.mo4280p(r6, r4)
            goto L44c
        L3d3:
            boolean r5 = r10.m4164a(r11, r3)
            if (r5 == 0) goto L44c
            r4 = r4 & r9
            long r4 = (long) r4
            int r4 = p072e7.C1651j8.m4301g(r11, r4)
        L3df:
            e7.l5 r5 = r12.f7690a
            r5.mo4282r(r6, r4)
            goto L44c
        L3e5:
            boolean r5 = r10.m4164a(r11, r3)
            if (r5 == 0) goto L44c
            r4 = r4 & r9
            long r4 = (long) r4
            long r4 = p072e7.C1651j8.m4302h(r11, r4)
        L3f1:
            e7.l5 r7 = r12.f7690a
            r7.mo4284u(r6, r4)
            goto L44c
        L3f7:
            boolean r5 = r10.m4164a(r11, r3)
            if (r5 == 0) goto L44c
            r4 = r4 & r9
            long r4 = (long) r4
            int r4 = p072e7.C1651j8.m4301g(r11, r4)
        L403:
            e7.l5 r5 = r12.f7690a
            r5.mo4286w(r6, r4)
            goto L44c
        L409:
            boolean r5 = r10.m4164a(r11, r3)
            if (r5 == 0) goto L44c
            r4 = r4 & r9
            long r4 = (long) r4
            long r4 = p072e7.C1651j8.m4302h(r11, r4)
        L415:
            e7.l5 r7 = r12.f7690a
            r7.mo4274C(r6, r4)
            goto L44c
        L41b:
            boolean r5 = r10.m4164a(r11, r3)
            if (r5 == 0) goto L44c
            r4 = r4 & r9
            long r4 = (long) r4
            long r4 = p072e7.C1651j8.m4302h(r11, r4)
        L427:
            e7.l5 r7 = r12.f7690a
            r7.mo4274C(r6, r4)
            goto L44c
        L42d:
            boolean r5 = r10.m4164a(r11, r3)
            if (r5 == 0) goto L44c
            r4 = r4 & r9
            long r4 = (long) r4
            float r4 = p072e7.C1651j8.m4300f(r11, r4)
        L439:
            r12.m4342c(r6, r4)
            goto L44c
        L43d:
            boolean r5 = r10.m4164a(r11, r3)
            if (r5 == 0) goto L44c
            r4 = r4 & r9
            long r4 = (long) r4
            double r4 = p072e7.C1651j8.m4299e(r11, r4)
        L449:
            r12.m4341b(r6, r4)
        L44c:
            int r3 = r3 + 3
            goto Le
        L450:
            e7.z7<?, ?> r0 = r10.f7535j
            java.lang.Object r11 = r0.mo4133c(r11)
            r0.mo4137g(r11, r12)
            return
        L45a:
            e7.o5<?> r12 = r10.f7536k
            r12.mo4407a(r11)
            throw r1
        L460:
            r10.m4174l(r11, r12)
            return
    }

    @Override // p072e7.InterfaceC1670l7
    /* renamed from: h */
    public final boolean mo4171h(T r9, T r10) {
            r8 = this;
            int[] r0 = r8.f7526a
            int r0 = r0.length
            r1 = 0
            r2 = 0
        L5:
            if (r2 >= r0) goto L1ba
            int r3 = r8.m4178v(r2)
            r4 = 1048575(0xfffff, float:1.469367E-39)
            r5 = r3 & r4
            long r5 = (long) r5
            int r3 = r3 >>> 20
            r3 = r3 & 255(0xff, float:3.57E-43)
            switch(r3) {
                case 0: goto L19a;
                case 1: goto L181;
                case 2: goto L16e;
                case 3: goto L15b;
                case 4: goto L14a;
                case 5: goto L136;
                case 6: goto L124;
                case 7: goto L112;
                case 8: goto Lfc;
                case 9: goto Le6;
                case 10: goto Ld0;
                case 11: goto Lbe;
                case 12: goto Lac;
                case 13: goto L9a;
                case 14: goto L86;
                case 15: goto L74;
                case 16: goto L60;
                case 17: goto L4a;
                case 18: goto L3a;
                case 19: goto L3a;
                case 20: goto L3a;
                case 21: goto L3a;
                case 22: goto L3a;
                case 23: goto L3a;
                case 24: goto L3a;
                case 25: goto L3a;
                case 26: goto L3a;
                case 27: goto L3a;
                case 28: goto L3a;
                case 29: goto L3a;
                case 30: goto L3a;
                case 31: goto L3a;
                case 32: goto L3a;
                case 33: goto L3a;
                case 34: goto L3a;
                case 35: goto L3a;
                case 36: goto L3a;
                case 37: goto L3a;
                case 38: goto L3a;
                case 39: goto L3a;
                case 40: goto L3a;
                case 41: goto L3a;
                case 42: goto L3a;
                case 43: goto L3a;
                case 44: goto L3a;
                case 45: goto L3a;
                case 46: goto L3a;
                case 47: goto L3a;
                case 48: goto L3a;
                case 49: goto L3a;
                case 50: goto L3a;
                case 51: goto L1a;
                case 52: goto L1a;
                case 53: goto L1a;
                case 54: goto L1a;
                case 55: goto L1a;
                case 56: goto L1a;
                case 57: goto L1a;
                case 58: goto L1a;
                case 59: goto L1a;
                case 60: goto L1a;
                case 61: goto L1a;
                case 62: goto L1a;
                case 63: goto L1a;
                case 64: goto L1a;
                case 65: goto L1a;
                case 66: goto L1a;
                case 67: goto L1a;
                case 68: goto L1a;
                default: goto L18;
            }
        L18:
            goto L1b6
        L1a:
            int r3 = r8.m4177u(r2)
            r3 = r3 & r4
            long r3 = (long) r3
            int r7 = p072e7.C1651j8.m4301g(r9, r3)
            int r3 = p072e7.C1651j8.m4301g(r10, r3)
            if (r7 != r3) goto L1b5
            java.lang.Object r3 = p072e7.C1651j8.m4304j(r9, r5)
            java.lang.Object r4 = p072e7.C1651j8.m4304j(r10, r5)
            boolean r3 = p072e7.C1690n7.m4375a(r3, r4)
            if (r3 != 0) goto L1b6
            goto L1b5
        L3a:
            java.lang.Object r3 = p072e7.C1651j8.m4304j(r9, r5)
            java.lang.Object r4 = p072e7.C1651j8.m4304j(r10, r5)
            boolean r3 = p072e7.C1690n7.m4375a(r3, r4)
            if (r3 != 0) goto L1b6
            goto L1b5
        L4a:
            boolean r3 = r8.m4163E(r9, r10, r2)
            if (r3 == 0) goto L1b5
            java.lang.Object r3 = p072e7.C1651j8.m4304j(r9, r5)
            java.lang.Object r4 = p072e7.C1651j8.m4304j(r10, r5)
            boolean r3 = p072e7.C1690n7.m4375a(r3, r4)
            if (r3 == 0) goto L1b5
            goto L1b6
        L60:
            boolean r3 = r8.m4163E(r9, r10, r2)
            if (r3 == 0) goto L1b5
            long r3 = p072e7.C1651j8.m4302h(r9, r5)
            long r5 = p072e7.C1651j8.m4302h(r10, r5)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L1b5
            goto L1b6
        L74:
            boolean r3 = r8.m4163E(r9, r10, r2)
            if (r3 == 0) goto L1b5
            int r3 = p072e7.C1651j8.m4301g(r9, r5)
            int r4 = p072e7.C1651j8.m4301g(r10, r5)
            if (r3 != r4) goto L1b5
            goto L1b6
        L86:
            boolean r3 = r8.m4163E(r9, r10, r2)
            if (r3 == 0) goto L1b5
            long r3 = p072e7.C1651j8.m4302h(r9, r5)
            long r5 = p072e7.C1651j8.m4302h(r10, r5)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L1b5
            goto L1b6
        L9a:
            boolean r3 = r8.m4163E(r9, r10, r2)
            if (r3 == 0) goto L1b5
            int r3 = p072e7.C1651j8.m4301g(r9, r5)
            int r4 = p072e7.C1651j8.m4301g(r10, r5)
            if (r3 != r4) goto L1b5
            goto L1b6
        Lac:
            boolean r3 = r8.m4163E(r9, r10, r2)
            if (r3 == 0) goto L1b5
            int r3 = p072e7.C1651j8.m4301g(r9, r5)
            int r4 = p072e7.C1651j8.m4301g(r10, r5)
            if (r3 != r4) goto L1b5
            goto L1b6
        Lbe:
            boolean r3 = r8.m4163E(r9, r10, r2)
            if (r3 == 0) goto L1b5
            int r3 = p072e7.C1651j8.m4301g(r9, r5)
            int r4 = p072e7.C1651j8.m4301g(r10, r5)
            if (r3 != r4) goto L1b5
            goto L1b6
        Ld0:
            boolean r3 = r8.m4163E(r9, r10, r2)
            if (r3 == 0) goto L1b5
            java.lang.Object r3 = p072e7.C1651j8.m4304j(r9, r5)
            java.lang.Object r4 = p072e7.C1651j8.m4304j(r10, r5)
            boolean r3 = p072e7.C1690n7.m4375a(r3, r4)
            if (r3 == 0) goto L1b5
            goto L1b6
        Le6:
            boolean r3 = r8.m4163E(r9, r10, r2)
            if (r3 == 0) goto L1b5
            java.lang.Object r3 = p072e7.C1651j8.m4304j(r9, r5)
            java.lang.Object r4 = p072e7.C1651j8.m4304j(r10, r5)
            boolean r3 = p072e7.C1690n7.m4375a(r3, r4)
            if (r3 == 0) goto L1b5
            goto L1b6
        Lfc:
            boolean r3 = r8.m4163E(r9, r10, r2)
            if (r3 == 0) goto L1b5
            java.lang.Object r3 = p072e7.C1651j8.m4304j(r9, r5)
            java.lang.Object r4 = p072e7.C1651j8.m4304j(r10, r5)
            boolean r3 = p072e7.C1690n7.m4375a(r3, r4)
            if (r3 == 0) goto L1b5
            goto L1b6
        L112:
            boolean r3 = r8.m4163E(r9, r10, r2)
            if (r3 == 0) goto L1b5
            boolean r3 = p072e7.C1651j8.m4311q(r9, r5)
            boolean r4 = p072e7.C1651j8.m4311q(r10, r5)
            if (r3 != r4) goto L1b5
            goto L1b6
        L124:
            boolean r3 = r8.m4163E(r9, r10, r2)
            if (r3 == 0) goto L1b5
            int r3 = p072e7.C1651j8.m4301g(r9, r5)
            int r4 = p072e7.C1651j8.m4301g(r10, r5)
            if (r3 != r4) goto L1b5
            goto L1b6
        L136:
            boolean r3 = r8.m4163E(r9, r10, r2)
            if (r3 == 0) goto L1b5
            long r3 = p072e7.C1651j8.m4302h(r9, r5)
            long r5 = p072e7.C1651j8.m4302h(r10, r5)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L1b5
            goto L1b6
        L14a:
            boolean r3 = r8.m4163E(r9, r10, r2)
            if (r3 == 0) goto L1b5
            int r3 = p072e7.C1651j8.m4301g(r9, r5)
            int r4 = p072e7.C1651j8.m4301g(r10, r5)
            if (r3 != r4) goto L1b5
            goto L1b6
        L15b:
            boolean r3 = r8.m4163E(r9, r10, r2)
            if (r3 == 0) goto L1b5
            long r3 = p072e7.C1651j8.m4302h(r9, r5)
            long r5 = p072e7.C1651j8.m4302h(r10, r5)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L1b5
            goto L1b6
        L16e:
            boolean r3 = r8.m4163E(r9, r10, r2)
            if (r3 == 0) goto L1b5
            long r3 = p072e7.C1651j8.m4302h(r9, r5)
            long r5 = p072e7.C1651j8.m4302h(r10, r5)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L1b5
            goto L1b6
        L181:
            boolean r3 = r8.m4163E(r9, r10, r2)
            if (r3 == 0) goto L1b5
            float r3 = p072e7.C1651j8.m4300f(r9, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
            float r4 = p072e7.C1651j8.m4300f(r10, r5)
            int r4 = java.lang.Float.floatToIntBits(r4)
            if (r3 != r4) goto L1b5
            goto L1b6
        L19a:
            boolean r3 = r8.m4163E(r9, r10, r2)
            if (r3 == 0) goto L1b5
            double r3 = p072e7.C1651j8.m4299e(r9, r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            double r5 = p072e7.C1651j8.m4299e(r10, r5)
            long r5 = java.lang.Double.doubleToLongBits(r5)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L1b5
            goto L1b6
        L1b5:
            return r1
        L1b6:
            int r2 = r2 + 3
            goto L5
        L1ba:
            e7.z7<?, ?> r0 = r8.f7535j
            java.lang.Object r0 = r0.mo4133c(r9)
            e7.z7<?, ?> r2 = r8.f7535j
            java.lang.Object r2 = r2.mo4133c(r10)
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L1cd
            return r1
        L1cd:
            boolean r0 = r8.f7529d
            if (r0 != 0) goto L1d3
            r9 = 1
            return r9
        L1d3:
            e7.o5<?> r0 = r8.f7536k
            r0.mo4407a(r9)
            e7.o5<?> r9 = r8.f7536k
            r9.mo4407a(r10)
            r9 = 0
            throw r9
    }

    @Override // p072e7.InterfaceC1670l7
    /* renamed from: i */
    public final void mo4172i(T r7) {
            r6 = this;
            int r0 = r6.f7532g
        L2:
            int r1 = r6.f7533h
            if (r0 >= r1) goto L27
            int[] r1 = r6.f7531f
            r1 = r1[r0]
            int r1 = r6.m4178v(r1)
            r2 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r1 & r2
            long r1 = (long) r1
            java.lang.Object r3 = p072e7.C1651j8.m4304j(r7, r1)
            if (r3 == 0) goto L24
            r4 = r3
            e7.u6 r4 = (p072e7.C1757u6) r4
            r5 = 0
            r4.f7807Y = r5
            e7.i8 r4 = p072e7.C1651j8.f7668c
            r4.m4264N(r7, r1, r3)
        L24:
            int r0 = r0 + 1
            goto L2
        L27:
            int[] r0 = r6.f7531f
            int r0 = r0.length
        L2a:
            if (r1 >= r0) goto L39
            e7.o6 r2 = r6.f7534i
            int[] r3 = r6.f7531f
            r3 = r3[r1]
            long r3 = (long) r3
            r2.mo4346a(r7, r3)
            int r1 = r1 + 1
            goto L2a
        L39:
            e7.z7<?, ?> r0 = r6.f7535j
            r0.mo4135e(r7)
            boolean r0 = r6.f7529d
            if (r0 == 0) goto L47
            e7.o5<?> r0 = r6.f7536k
            r0.mo4408b(r7)
        L47:
            return
    }

    /* renamed from: j */
    public final boolean m4173j(T r3, int r4, int r5) {
            r2 = this;
            int[] r0 = r2.f7526a
            int r5 = r5 + 2
            r5 = r0[r5]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r5 = r5 & r0
            long r0 = (long) r5
            int r3 = p072e7.C1651j8.m4301g(r3, r0)
            if (r3 != r4) goto L13
            r3 = 1
            return r3
        L13:
            r3 = 0
            return r3
    }

    /* renamed from: l */
    public final void m4174l(T r17, p072e7.C1678m5 r18) {
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            boolean r3 = r0.f7529d
            r4 = 0
            if (r3 != 0) goto L47f
            int[] r3 = r0.f7526a
            int r3 = r3.length
            sun.misc.Unsafe r5 = p072e7.C1590d7.f7525m
            r6 = 1048575(0xfffff, float:1.469367E-39)
            r8 = 0
            r9 = 1048575(0xfffff, float:1.469367E-39)
            r10 = 0
        L18:
            if (r8 >= r3) goto L475
            int r11 = r0.m4178v(r8)
            int[] r12 = r0.f7526a
            r13 = r12[r8]
            int r14 = r11 >>> 20
            r14 = r14 & 255(0xff, float:3.57E-43)
            r15 = 17
            r7 = 1
            if (r14 > r15) goto L3e
            int r15 = r8 + 2
            r12 = r12[r15]
            r15 = r12 & r6
            if (r15 == r9) goto L39
            long r9 = (long) r15
            int r10 = r5.getInt(r1, r9)
            r9 = r15
        L39:
            int r12 = r12 >>> 20
            int r12 = r7 << r12
            goto L3f
        L3e:
            r12 = 0
        L3f:
            r11 = r11 & r6
            long r6 = (long) r11
            switch(r14) {
                case 0: goto L462;
                case 1: goto L455;
                case 2: goto L446;
                case 3: goto L437;
                case 4: goto L428;
                case 5: goto L419;
                case 6: goto L40a;
                case 7: goto L3fb;
                case 8: goto L3ed;
                case 9: goto L3db;
                case 10: goto L3c9;
                case 11: goto L3b9;
                case 12: goto L3a9;
                case 13: goto L399;
                case 14: goto L389;
                case 15: goto L37b;
                case 16: goto L36d;
                case 17: goto L35b;
                case 18: goto L34b;
                case 19: goto L33b;
                case 20: goto L32b;
                case 21: goto L31b;
                case 22: goto L30b;
                case 23: goto L2fb;
                case 24: goto L2eb;
                case 25: goto L2db;
                case 26: goto L2cc;
                case 27: goto L2b9;
                case 28: goto L2aa;
                case 29: goto L299;
                case 30: goto L288;
                case 31: goto L277;
                case 32: goto L266;
                case 33: goto L255;
                case 34: goto L245;
                case 35: goto L235;
                case 36: goto L225;
                case 37: goto L215;
                case 38: goto L205;
                case 39: goto L1f5;
                case 40: goto L1e5;
                case 41: goto L1d5;
                case 42: goto L1c5;
                case 43: goto L1bd;
                case 44: goto L1b5;
                case 45: goto L1ad;
                case 46: goto L1a5;
                case 47: goto L19d;
                case 48: goto L190;
                case 49: goto L17d;
                case 50: goto L16e;
                case 51: goto L15f;
                case 52: goto L150;
                case 53: goto L13f;
                case 54: goto L12e;
                case 55: goto L11d;
                case 56: goto L10c;
                case 57: goto Lfb;
                case 58: goto Lea;
                case 59: goto Ldb;
                case 60: goto Lc8;
                case 61: goto Lb5;
                case 62: goto La5;
                case 63: goto L95;
                case 64: goto L85;
                case 65: goto L75;
                case 66: goto L67;
                case 67: goto L59;
                case 68: goto L47;
                default: goto L44;
            }
        L44:
            r14 = 0
            goto L46e
        L47:
            boolean r11 = r0.m4173j(r1, r13, r8)
            if (r11 == 0) goto L44
            java.lang.Object r6 = r5.getObject(r1, r6)
            e7.l7 r7 = r0.m4179x(r8)
            r2.m4343d(r13, r6, r7)
            goto L44
        L59:
            boolean r11 = r0.m4173j(r1, r13, r8)
            if (r11 == 0) goto L44
            long r6 = m4157w(r1, r6)
            r2.m4340a(r13, r6)
            goto L44
        L67:
            boolean r11 = r0.m4173j(r1, r13, r8)
            if (r11 == 0) goto L44
            int r6 = m4156t(r1, r6)
            r2.m4345f(r13, r6)
            goto L44
        L75:
            boolean r11 = r0.m4173j(r1, r13, r8)
            if (r11 == 0) goto L44
            long r6 = m4157w(r1, r6)
            e7.l5 r11 = r2.f7690a
            r11.mo4284u(r13, r6)
            goto L44
        L85:
            boolean r11 = r0.m4173j(r1, r13, r8)
            if (r11 == 0) goto L44
            int r6 = m4156t(r1, r6)
            e7.l5 r7 = r2.f7690a
            r7.mo4282r(r13, r6)
            goto L44
        L95:
            boolean r11 = r0.m4173j(r1, r13, r8)
            if (r11 == 0) goto L44
            int r6 = m4156t(r1, r6)
            e7.l5 r7 = r2.f7690a
            r7.mo4286w(r13, r6)
            goto L44
        La5:
            boolean r11 = r0.m4173j(r1, r13, r8)
            if (r11 == 0) goto L44
            int r6 = m4156t(r1, r6)
            e7.l5 r7 = r2.f7690a
            r7.mo4272A(r13, r6)
            goto L44
        Lb5:
            boolean r11 = r0.m4173j(r1, r13, r8)
            if (r11 == 0) goto L44
            java.lang.Object r6 = r5.getObject(r1, r6)
            e7.i5 r6 = (p072e7.AbstractC1638i5) r6
            e7.l5 r7 = r2.f7690a
            r7.mo4281q(r13, r6)
            goto L44
        Lc8:
            boolean r11 = r0.m4173j(r1, r13, r8)
            if (r11 == 0) goto L44
            java.lang.Object r6 = r5.getObject(r1, r6)
            e7.l7 r7 = r0.m4179x(r8)
            r2.m4344e(r13, r6, r7)
            goto L44
        Ldb:
            boolean r11 = r0.m4173j(r1, r13, r8)
            if (r11 == 0) goto L44
            java.lang.Object r6 = r5.getObject(r1, r6)
            m4151m(r13, r6, r2)
            goto L44
        Lea:
            boolean r11 = r0.m4173j(r1, r13, r8)
            if (r11 == 0) goto L44
            boolean r6 = m4150k(r1, r6)
            e7.l5 r7 = r2.f7690a
            r7.mo4280p(r13, r6)
            goto L44
        Lfb:
            boolean r11 = r0.m4173j(r1, r13, r8)
            if (r11 == 0) goto L44
            int r6 = m4156t(r1, r6)
            e7.l5 r7 = r2.f7690a
            r7.mo4282r(r13, r6)
            goto L44
        L10c:
            boolean r11 = r0.m4173j(r1, r13, r8)
            if (r11 == 0) goto L44
            long r6 = m4157w(r1, r6)
            e7.l5 r11 = r2.f7690a
            r11.mo4284u(r13, r6)
            goto L44
        L11d:
            boolean r11 = r0.m4173j(r1, r13, r8)
            if (r11 == 0) goto L44
            int r6 = m4156t(r1, r6)
            e7.l5 r7 = r2.f7690a
            r7.mo4286w(r13, r6)
            goto L44
        L12e:
            boolean r11 = r0.m4173j(r1, r13, r8)
            if (r11 == 0) goto L44
            long r6 = m4157w(r1, r6)
            e7.l5 r11 = r2.f7690a
            r11.mo4274C(r13, r6)
            goto L44
        L13f:
            boolean r11 = r0.m4173j(r1, r13, r8)
            if (r11 == 0) goto L44
            long r6 = m4157w(r1, r6)
            e7.l5 r11 = r2.f7690a
            r11.mo4274C(r13, r6)
            goto L44
        L150:
            boolean r11 = r0.m4173j(r1, r13, r8)
            if (r11 == 0) goto L44
            float r6 = m4155q(r1, r6)
            r2.m4342c(r13, r6)
            goto L44
        L15f:
            boolean r11 = r0.m4173j(r1, r13, r8)
            if (r11 == 0) goto L44
            double r6 = m4154p(r1, r6)
            r2.m4341b(r13, r6)
            goto L44
        L16e:
            java.lang.Object r6 = r5.getObject(r1, r6)
            if (r6 != 0) goto L176
            goto L44
        L176:
            java.lang.Object r1 = r0.m4180y(r8)
            e7.t6 r1 = (p072e7.C1748t6) r1
            throw r4
        L17d:
            int[] r11 = r0.f7526a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            e7.l7 r7 = r0.m4179x(r8)
            p072e7.C1690n7.m4383i(r11, r6, r2, r7)
            goto L44
        L190:
            int[] r11 = r0.f7526a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            r7 = 1
            goto L250
        L19d:
            int[] r11 = r0.f7526a
            r11 = r11[r8]
            r12 = r11
            r11 = 1
            goto L25b
        L1a5:
            int[] r11 = r0.f7526a
            r11 = r11[r8]
            r12 = r11
            r11 = 1
            goto L26c
        L1ad:
            int[] r11 = r0.f7526a
            r11 = r11[r8]
            r12 = r11
            r11 = 1
            goto L27d
        L1b5:
            int[] r11 = r0.f7526a
            r11 = r11[r8]
            r12 = r11
            r11 = 1
            goto L28e
        L1bd:
            int[] r11 = r0.f7526a
            r11 = r11[r8]
            r12 = r11
            r11 = 1
            goto L29f
        L1c5:
            int[] r11 = r0.f7526a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            r12 = 1
            p072e7.C1690n7.m4376b(r11, r6, r2, r12)
            goto L44
        L1d5:
            r12 = 1
            int[] r11 = r0.f7526a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            p072e7.C1690n7.m4380f(r11, r6, r2, r12)
            goto L44
        L1e5:
            r12 = 1
            int[] r11 = r0.f7526a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            p072e7.C1690n7.m4381g(r11, r6, r2, r12)
            goto L44
        L1f5:
            r12 = 1
            int[] r11 = r0.f7526a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            p072e7.C1690n7.m4384j(r11, r6, r2, r12)
            goto L44
        L205:
            r12 = 1
            int[] r11 = r0.f7526a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            p072e7.C1690n7.m4393s(r11, r6, r2, r12)
            goto L44
        L215:
            r12 = 1
            int[] r11 = r0.f7526a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            p072e7.C1690n7.m4385k(r11, r6, r2, r12)
            goto L44
        L225:
            r12 = 1
            int[] r11 = r0.f7526a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            p072e7.C1690n7.m4382h(r11, r6, r2, r12)
            goto L44
        L235:
            r12 = 1
            int[] r11 = r0.f7526a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            p072e7.C1690n7.m4378d(r11, r6, r2, r12)
            goto L44
        L245:
            int[] r11 = r0.f7526a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            r7 = 0
        L250:
            p072e7.C1690n7.m4390p(r11, r6, r2, r7)
            goto L44
        L255:
            int[] r11 = r0.f7526a
            r11 = r11[r8]
            r12 = r11
            r11 = 0
        L25b:
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            p072e7.C1690n7.m4389o(r12, r6, r2, r11)
            goto L44
        L266:
            int[] r11 = r0.f7526a
            r11 = r11[r8]
            r12 = r11
            r11 = 0
        L26c:
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            p072e7.C1690n7.m4388n(r12, r6, r2, r11)
            goto L44
        L277:
            int[] r11 = r0.f7526a
            r11 = r11[r8]
            r12 = r11
            r11 = 0
        L27d:
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            p072e7.C1690n7.m4387m(r12, r6, r2, r11)
            goto L44
        L288:
            int[] r11 = r0.f7526a
            r11 = r11[r8]
            r12 = r11
            r11 = 0
        L28e:
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            p072e7.C1690n7.m4379e(r12, r6, r2, r11)
            goto L44
        L299:
            int[] r11 = r0.f7526a
            r11 = r11[r8]
            r12 = r11
            r11 = 0
        L29f:
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            p072e7.C1690n7.m4392r(r12, r6, r2, r11)
            goto L44
        L2aa:
            int[] r11 = r0.f7526a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            p072e7.C1690n7.m4377c(r11, r6, r2)
            goto L44
        L2b9:
            int[] r11 = r0.f7526a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            e7.l7 r7 = r0.m4179x(r8)
            p072e7.C1690n7.m4386l(r11, r6, r2, r7)
            goto L44
        L2cc:
            int[] r11 = r0.f7526a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            p072e7.C1690n7.m4391q(r11, r6, r2)
            goto L44
        L2db:
            int[] r11 = r0.f7526a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            r14 = 0
            p072e7.C1690n7.m4376b(r11, r6, r2, r14)
            goto L46e
        L2eb:
            r14 = 0
            int[] r11 = r0.f7526a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            p072e7.C1690n7.m4380f(r11, r6, r2, r14)
            goto L46e
        L2fb:
            r14 = 0
            int[] r11 = r0.f7526a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            p072e7.C1690n7.m4381g(r11, r6, r2, r14)
            goto L46e
        L30b:
            r14 = 0
            int[] r11 = r0.f7526a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            p072e7.C1690n7.m4384j(r11, r6, r2, r14)
            goto L46e
        L31b:
            r14 = 0
            int[] r11 = r0.f7526a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            p072e7.C1690n7.m4393s(r11, r6, r2, r14)
            goto L46e
        L32b:
            r14 = 0
            int[] r11 = r0.f7526a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            p072e7.C1690n7.m4385k(r11, r6, r2, r14)
            goto L46e
        L33b:
            r14 = 0
            int[] r11 = r0.f7526a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            p072e7.C1690n7.m4382h(r11, r6, r2, r14)
            goto L46e
        L34b:
            r14 = 0
            int[] r11 = r0.f7526a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            p072e7.C1690n7.m4378d(r11, r6, r2, r14)
            goto L46e
        L35b:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L46e
            java.lang.Object r6 = r5.getObject(r1, r6)
            e7.l7 r7 = r0.m4179x(r8)
            r2.m4343d(r13, r6, r7)
            goto L46e
        L36d:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L46e
            long r6 = r5.getLong(r1, r6)
            r2.m4340a(r13, r6)
            goto L46e
        L37b:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L46e
            int r6 = r5.getInt(r1, r6)
            r2.m4345f(r13, r6)
            goto L46e
        L389:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L46e
            long r6 = r5.getLong(r1, r6)
            e7.l5 r11 = r2.f7690a
            r11.mo4284u(r13, r6)
            goto L46e
        L399:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L46e
            int r6 = r5.getInt(r1, r6)
            e7.l5 r7 = r2.f7690a
            r7.mo4282r(r13, r6)
            goto L46e
        L3a9:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L46e
            int r6 = r5.getInt(r1, r6)
            e7.l5 r7 = r2.f7690a
            r7.mo4286w(r13, r6)
            goto L46e
        L3b9:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L46e
            int r6 = r5.getInt(r1, r6)
            e7.l5 r7 = r2.f7690a
            r7.mo4272A(r13, r6)
            goto L46e
        L3c9:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L46e
            java.lang.Object r6 = r5.getObject(r1, r6)
            e7.i5 r6 = (p072e7.AbstractC1638i5) r6
            e7.l5 r7 = r2.f7690a
            r7.mo4281q(r13, r6)
            goto L46e
        L3db:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L46e
            java.lang.Object r6 = r5.getObject(r1, r6)
            e7.l7 r7 = r0.m4179x(r8)
            r2.m4344e(r13, r6, r7)
            goto L46e
        L3ed:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L46e
            java.lang.Object r6 = r5.getObject(r1, r6)
            m4151m(r13, r6, r2)
            goto L46e
        L3fb:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L46e
            boolean r6 = p072e7.C1651j8.m4311q(r1, r6)
            e7.l5 r7 = r2.f7690a
            r7.mo4280p(r13, r6)
            goto L46e
        L40a:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L46e
            int r6 = r5.getInt(r1, r6)
            e7.l5 r7 = r2.f7690a
            r7.mo4282r(r13, r6)
            goto L46e
        L419:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L46e
            long r6 = r5.getLong(r1, r6)
            e7.l5 r11 = r2.f7690a
            r11.mo4284u(r13, r6)
            goto L46e
        L428:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L46e
            int r6 = r5.getInt(r1, r6)
            e7.l5 r7 = r2.f7690a
            r7.mo4286w(r13, r6)
            goto L46e
        L437:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L46e
            long r6 = r5.getLong(r1, r6)
            e7.l5 r11 = r2.f7690a
            r11.mo4274C(r13, r6)
            goto L46e
        L446:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L46e
            long r6 = r5.getLong(r1, r6)
            e7.l5 r11 = r2.f7690a
            r11.mo4274C(r13, r6)
            goto L46e
        L455:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L46e
            float r6 = p072e7.C1651j8.m4300f(r1, r6)
            r2.m4342c(r13, r6)
            goto L46e
        L462:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L46e
            double r6 = p072e7.C1651j8.m4299e(r1, r6)
            r2.m4341b(r13, r6)
        L46e:
            int r8 = r8 + 3
            r6 = 1048575(0xfffff, float:1.469367E-39)
            goto L18
        L475:
            e7.z7<?, ?> r3 = r0.f7535j
            java.lang.Object r1 = r3.mo4133c(r1)
            r3.mo4137g(r1, r2)
            return
        L47f:
            e7.o5<?> r2 = r0.f7536k
            r2.mo4407a(r1)
            throw r4
    }

    /* renamed from: r */
    public final int m4175r(T r15) {
            r14 = this;
            sun.misc.Unsafe r0 = p072e7.C1590d7.f7525m
            r1 = 1048575(0xfffff, float:1.469367E-39)
            r2 = 0
            r3 = 0
            r4 = 1048575(0xfffff, float:1.469367E-39)
            r5 = 0
        Lb:
            int[] r6 = r14.f7526a
            int r6 = r6.length
            if (r2 >= r6) goto L40f
            int r6 = r14.m4178v(r2)
            int[] r7 = r14.f7526a
            r8 = r7[r2]
            int r9 = r6 >>> 20
            r9 = r9 & 255(0xff, float:3.57E-43)
            r10 = 17
            r11 = 1
            if (r9 > r10) goto L35
            int r10 = r2 + 2
            r7 = r7[r10]
            r10 = r7 & r1
            int r7 = r7 >>> 20
            int r7 = r11 << r7
            if (r10 == r4) goto L36
            long r4 = (long) r10
            int r4 = r0.getInt(r15, r4)
            r5 = r4
            r4 = r10
            goto L36
        L35:
            r7 = 0
        L36:
            r1 = r1 & r6
            long r12 = (long) r1
            r1 = 63
            switch(r9) {
                case 0: goto L3fb;
                case 1: goto L3ee;
                case 2: goto L3da;
                case 3: goto L3d5;
                case 4: goto L3c1;
                case 5: goto L3bc;
                case 6: goto L3b7;
                case 7: goto L3ab;
                case 8: goto L37c;
                case 9: goto L36a;
                case 10: goto L361;
                case 11: goto L34d;
                case 12: goto L347;
                case 13: goto L341;
                case 14: goto L33b;
                case 15: goto L327;
                case 16: goto L30e;
                case 17: goto L2fa;
                case 18: goto L2ee;
                case 19: goto L2e2;
                case 20: goto L2d6;
                case 21: goto L2c9;
                case 22: goto L2bc;
                case 23: goto L2ee;
                case 24: goto L2e2;
                case 25: goto L2b0;
                case 26: goto L2a4;
                case 27: goto L294;
                case 28: goto L288;
                case 29: goto L27b;
                case 30: goto L26e;
                case 31: goto L2e2;
                case 32: goto L2ee;
                case 33: goto L261;
                case 34: goto L254;
                case 35: goto L23b;
                case 36: goto L22e;
                case 37: goto L221;
                case 38: goto L214;
                case 39: goto L207;
                case 40: goto L1fa;
                case 41: goto L1ed;
                case 42: goto L1de;
                case 43: goto L1d0;
                case 44: goto L1c2;
                case 45: goto L1b4;
                case 46: goto L1a6;
                case 47: goto L198;
                case 48: goto L18a;
                case 49: goto L17a;
                case 50: goto L16d;
                case 51: goto L15f;
                case 52: goto L151;
                case 53: goto L13b;
                case 54: goto L134;
                case 55: goto L11e;
                case 56: goto L117;
                case 57: goto L110;
                case 58: goto L102;
                case 59: goto Ld2;
                case 60: goto Lbe;
                case 61: goto Lb3;
                case 62: goto L9d;
                case 63: goto L95;
                case 64: goto L8d;
                case 65: goto L85;
                case 66: goto L6f;
                case 67: goto L55;
                case 68: goto L3f;
                default: goto L3d;
            }
        L3d:
            goto L408
        L3f:
            boolean r1 = r14.m4173j(r15, r8, r2)
            if (r1 == 0) goto L408
            java.lang.Object r1 = r0.getObject(r15, r12)
            e7.a7 r1 = (p072e7.InterfaceC1560a7) r1
            e7.l7 r6 = r14.m4179x(r2)
            int r1 = p072e7.AbstractC1668l5.m4326F(r8, r1, r6)
            goto L407
        L55:
            boolean r6 = r14.m4173j(r15, r8, r2)
            if (r6 == 0) goto L408
            long r6 = m4157w(r15, r12)
            int r8 = r8 << 3
            int r8 = p072e7.AbstractC1668l5.m4331m(r8)
            long r9 = r6 + r6
            long r6 = r6 >> r1
            long r6 = r6 ^ r9
            int r1 = p072e7.AbstractC1668l5.m4332n(r6)
            goto L324
        L6f:
            boolean r1 = r14.m4173j(r15, r8, r2)
            if (r1 == 0) goto L408
            int r1 = m4156t(r15, r12)
            int r6 = r8 << 3
            int r6 = p072e7.AbstractC1668l5.m4331m(r6)
            int r7 = r1 + r1
            int r1 = r1 >> 31
            r1 = r1 ^ r7
            goto Lad
        L85:
            boolean r1 = r14.m4173j(r15, r8, r2)
            if (r1 == 0) goto L408
            goto L165
        L8d:
            boolean r1 = r14.m4173j(r15, r8, r2)
            if (r1 == 0) goto L408
            goto L157
        L95:
            boolean r1 = r14.m4173j(r15, r8, r2)
            if (r1 == 0) goto L408
            goto L124
        L9d:
            boolean r1 = r14.m4173j(r15, r8, r2)
            if (r1 == 0) goto L408
            int r1 = m4156t(r15, r12)
            int r6 = r8 << 3
            int r6 = p072e7.AbstractC1668l5.m4331m(r6)
        Lad:
            int r1 = p072e7.AbstractC1668l5.m4331m(r1)
            goto L3d3
        Lb3:
            boolean r1 = r14.m4173j(r15, r8, r2)
            if (r1 == 0) goto L408
            java.lang.Object r1 = r0.getObject(r15, r12)
            goto Le0
        Lbe:
            boolean r1 = r14.m4173j(r15, r8, r2)
            if (r1 == 0) goto L408
            java.lang.Object r1 = r0.getObject(r15, r12)
            e7.l7 r6 = r14.m4179x(r2)
            int r1 = p072e7.C1690n7.m4364H(r8, r1, r6)
            goto L407
        Ld2:
            boolean r1 = r14.m4173j(r15, r8, r2)
            if (r1 == 0) goto L408
            java.lang.Object r1 = r0.getObject(r15, r12)
            boolean r6 = r1 instanceof p072e7.AbstractC1638i5
            if (r6 == 0) goto Lf4
        Le0:
            e7.i5 r1 = (p072e7.AbstractC1638i5) r1
            int r6 = r8 << 3
            int r6 = p072e7.AbstractC1668l5.m4331m(r6)
            int r1 = r1.mo4195h()
            int r7 = p072e7.AbstractC1668l5.m4331m(r1)
            int r7 = r7 + r1
            int r7 = r7 + r6
            goto L251
        Lf4:
            java.lang.String r1 = (java.lang.String) r1
            int r6 = r8 << 3
            int r6 = p072e7.AbstractC1668l5.m4331m(r6)
            int r1 = p072e7.AbstractC1668l5.m4329I(r1)
            goto L3d3
        L102:
            boolean r1 = r14.m4173j(r15, r8, r2)
            if (r1 == 0) goto L408
            int r1 = r8 << 3
            int r1 = p072e7.AbstractC1668l5.m4331m(r1)
            goto L3b5
        L110:
            boolean r1 = r14.m4173j(r15, r8, r2)
            if (r1 == 0) goto L408
            goto L157
        L117:
            boolean r1 = r14.m4173j(r15, r8, r2)
            if (r1 == 0) goto L408
            goto L165
        L11e:
            boolean r1 = r14.m4173j(r15, r8, r2)
            if (r1 == 0) goto L408
        L124:
            int r1 = m4156t(r15, r12)
            int r6 = r8 << 3
            int r6 = p072e7.AbstractC1668l5.m4331m(r6)
            int r1 = p072e7.AbstractC1668l5.m4327G(r1)
            goto L3d3
        L134:
            boolean r1 = r14.m4173j(r15, r8, r2)
            if (r1 == 0) goto L408
            goto L141
        L13b:
            boolean r1 = r14.m4173j(r15, r8, r2)
            if (r1 == 0) goto L408
        L141:
            long r6 = m4157w(r15, r12)
            int r1 = r8 << 3
            int r1 = p072e7.AbstractC1668l5.m4331m(r1)
            int r6 = p072e7.AbstractC1668l5.m4332n(r6)
            goto L3ec
        L151:
            boolean r1 = r14.m4173j(r15, r8, r2)
            if (r1 == 0) goto L408
        L157:
            int r1 = r8 << 3
            int r1 = p072e7.AbstractC1668l5.m4331m(r1)
            goto L3f8
        L15f:
            boolean r1 = r14.m4173j(r15, r8, r2)
            if (r1 == 0) goto L408
        L165:
            int r1 = r8 << 3
            int r1 = p072e7.AbstractC1668l5.m4331m(r1)
            goto L405
        L16d:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.lang.Object r6 = r14.m4180y(r2)
            p072e7.C1766v6.m4462a(r8, r1, r6)
            goto L408
        L17a:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            e7.l7 r6 = r14.m4179x(r2)
            int r1 = p072e7.C1690n7.m4359C(r8, r1, r6)
            goto L407
        L18a:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = p072e7.C1690n7.m4369M(r1)
            if (r1 <= 0) goto L408
            goto L247
        L198:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = p072e7.C1690n7.m4367K(r1)
            if (r1 <= 0) goto L408
            goto L247
        L1a6:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = p072e7.C1690n7.m4358B(r1)
            if (r1 <= 0) goto L408
            goto L247
        L1b4:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = p072e7.C1690n7.m4400z(r1)
            if (r1 <= 0) goto L408
            goto L247
        L1c2:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = p072e7.C1690n7.m4398x(r1)
            if (r1 <= 0) goto L408
            goto L247
        L1d0:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = p072e7.C1690n7.m4372P(r1)
            if (r1 <= 0) goto L408
            goto L247
        L1de:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            java.lang.Class<?> r6 = p072e7.C1690n7.f7703a
            int r1 = r1.size()
            if (r1 <= 0) goto L408
            goto L247
        L1ed:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = p072e7.C1690n7.m4400z(r1)
            if (r1 <= 0) goto L408
            goto L247
        L1fa:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = p072e7.C1690n7.m4358B(r1)
            if (r1 <= 0) goto L408
            goto L247
        L207:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = p072e7.C1690n7.m4361E(r1)
            if (r1 <= 0) goto L408
            goto L247
        L214:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = p072e7.C1690n7.m4374R(r1)
            if (r1 <= 0) goto L408
            goto L247
        L221:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = p072e7.C1690n7.m4363G(r1)
            if (r1 <= 0) goto L408
            goto L247
        L22e:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = p072e7.C1690n7.m4400z(r1)
            if (r1 <= 0) goto L408
            goto L247
        L23b:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = p072e7.C1690n7.m4358B(r1)
            if (r1 <= 0) goto L408
        L247:
            int r6 = p072e7.AbstractC1668l5.m4330J(r8)
            int r7 = p072e7.AbstractC1668l5.m4331m(r1)
            int r7 = r7 + r6
            int r7 = r7 + r1
        L251:
            int r3 = r3 + r7
            goto L408
        L254:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            r6 = 0
            int r1 = p072e7.C1690n7.m4368L(r8, r1, r6)
            goto L407
        L261:
            r1 = 0
            java.lang.Object r6 = r0.getObject(r15, r12)
            java.util.List r6 = (java.util.List) r6
            int r1 = p072e7.C1690n7.m4366J(r8, r6, r1)
            goto L407
        L26e:
            r1 = 0
            java.lang.Object r6 = r0.getObject(r15, r12)
            java.util.List r6 = (java.util.List) r6
            int r1 = p072e7.C1690n7.m4397w(r8, r6, r1)
            goto L407
        L27b:
            r1 = 0
            java.lang.Object r6 = r0.getObject(r15, r12)
            java.util.List r6 = (java.util.List) r6
            int r1 = p072e7.C1690n7.m4371O(r8, r6, r1)
            goto L407
        L288:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = p072e7.C1690n7.m4396v(r8, r1)
            goto L407
        L294:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            e7.l7 r6 = r14.m4179x(r2)
            int r1 = p072e7.C1690n7.m4365I(r8, r1, r6)
            goto L407
        L2a4:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = p072e7.C1690n7.m4370N(r8, r1)
            goto L407
        L2b0:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = p072e7.C1690n7.m4395u(r8, r1)
            goto L407
        L2bc:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            r6 = 0
            int r1 = p072e7.C1690n7.m4360D(r8, r1, r6)
            goto L407
        L2c9:
            r1 = 0
            java.lang.Object r6 = r0.getObject(r15, r12)
            java.util.List r6 = (java.util.List) r6
            int r1 = p072e7.C1690n7.m4373Q(r8, r6, r1)
            goto L407
        L2d6:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = p072e7.C1690n7.m4362F(r8, r1)
            goto L407
        L2e2:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = p072e7.C1690n7.m4399y(r8, r1)
            goto L407
        L2ee:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = p072e7.C1690n7.m4357A(r8, r1)
            goto L407
        L2fa:
            r1 = r5 & r7
            if (r1 == 0) goto L408
            java.lang.Object r1 = r0.getObject(r15, r12)
            e7.a7 r1 = (p072e7.InterfaceC1560a7) r1
            e7.l7 r6 = r14.m4179x(r2)
            int r1 = p072e7.AbstractC1668l5.m4326F(r8, r1, r6)
            goto L407
        L30e:
            r6 = r7 & r5
            if (r6 == 0) goto L408
            long r6 = r0.getLong(r15, r12)
            int r8 = r8 << 3
            int r8 = p072e7.AbstractC1668l5.m4331m(r8)
            long r9 = r6 + r6
            long r6 = r6 >> r1
            long r6 = r6 ^ r9
            int r1 = p072e7.AbstractC1668l5.m4332n(r6)
        L324:
            int r1 = r1 + r8
            goto L407
        L327:
            r1 = r5 & r7
            if (r1 == 0) goto L408
            int r1 = r0.getInt(r15, r12)
            int r6 = r8 << 3
            int r6 = p072e7.AbstractC1668l5.m4331m(r6)
            int r7 = r1 + r1
            int r1 = r1 >> 31
            r1 = r1 ^ r7
            goto L35b
        L33b:
            r1 = r5 & r7
            if (r1 == 0) goto L408
            goto L3ff
        L341:
            r1 = r5 & r7
            if (r1 == 0) goto L408
            goto L3f2
        L347:
            r1 = r5 & r7
            if (r1 == 0) goto L408
            goto L3c5
        L34d:
            r1 = r5 & r7
            if (r1 == 0) goto L408
            int r1 = r0.getInt(r15, r12)
            int r6 = r8 << 3
            int r6 = p072e7.AbstractC1668l5.m4331m(r6)
        L35b:
            int r1 = p072e7.AbstractC1668l5.m4331m(r1)
            goto L3d3
        L361:
            r1 = r5 & r7
            if (r1 == 0) goto L408
            java.lang.Object r1 = r0.getObject(r15, r12)
            goto L388
        L36a:
            r1 = r5 & r7
            if (r1 == 0) goto L408
            java.lang.Object r1 = r0.getObject(r15, r12)
            e7.l7 r6 = r14.m4179x(r2)
            int r1 = p072e7.C1690n7.m4364H(r8, r1, r6)
            goto L407
        L37c:
            r1 = r5 & r7
            if (r1 == 0) goto L408
            java.lang.Object r1 = r0.getObject(r15, r12)
            boolean r6 = r1 instanceof p072e7.AbstractC1638i5
            if (r6 == 0) goto L39e
        L388:
            e7.i5 r1 = (p072e7.AbstractC1638i5) r1
            int r6 = r8 << 3
            int r6 = p072e7.AbstractC1668l5.m4331m(r6)
            int r1 = r1.mo4195h()
            int r7 = p072e7.AbstractC1668l5.m4331m(r1)
            int r7 = r7 + r1
            int r7 = r7 + r6
            int r7 = r7 + r3
            r3 = r7
            goto L408
        L39e:
            java.lang.String r1 = (java.lang.String) r1
            int r6 = r8 << 3
            int r6 = p072e7.AbstractC1668l5.m4331m(r6)
            int r1 = p072e7.AbstractC1668l5.m4329I(r1)
            goto L3d3
        L3ab:
            r1 = r5 & r7
            if (r1 == 0) goto L408
            int r1 = r8 << 3
            int r1 = p072e7.AbstractC1668l5.m4331m(r1)
        L3b5:
            int r1 = r1 + r11
            goto L407
        L3b7:
            r1 = r5 & r7
            if (r1 == 0) goto L408
            goto L3f2
        L3bc:
            r1 = r5 & r7
            if (r1 == 0) goto L408
            goto L3ff
        L3c1:
            r1 = r5 & r7
            if (r1 == 0) goto L408
        L3c5:
            int r1 = r0.getInt(r15, r12)
            int r6 = r8 << 3
            int r6 = p072e7.AbstractC1668l5.m4331m(r6)
            int r1 = p072e7.AbstractC1668l5.m4327G(r1)
        L3d3:
            int r1 = r1 + r6
            goto L407
        L3d5:
            r1 = r5 & r7
            if (r1 == 0) goto L408
            goto L3de
        L3da:
            r1 = r5 & r7
            if (r1 == 0) goto L408
        L3de:
            long r6 = r0.getLong(r15, r12)
            int r1 = r8 << 3
            int r1 = p072e7.AbstractC1668l5.m4331m(r1)
            int r6 = p072e7.AbstractC1668l5.m4332n(r6)
        L3ec:
            int r1 = r1 + r6
            goto L407
        L3ee:
            r1 = r5 & r7
            if (r1 == 0) goto L408
        L3f2:
            int r1 = r8 << 3
            int r1 = p072e7.AbstractC1668l5.m4331m(r1)
        L3f8:
            int r1 = r1 + 4
            goto L407
        L3fb:
            r1 = r5 & r7
            if (r1 == 0) goto L408
        L3ff:
            int r1 = r8 << 3
            int r1 = p072e7.AbstractC1668l5.m4331m(r1)
        L405:
            int r1 = r1 + 8
        L407:
            int r3 = r3 + r1
        L408:
            int r2 = r2 + 3
            r1 = 1048575(0xfffff, float:1.469367E-39)
            goto Lb
        L40f:
            e7.z7<?, ?> r0 = r14.f7535j
            java.lang.Object r1 = r0.mo4133c(r15)
            int r0 = r0.mo4131a(r1)
            int r0 = r0 + r3
            boolean r1 = r14.f7529d
            if (r1 != 0) goto L41f
            return r0
        L41f:
            e7.o5<?> r0 = r14.f7536k
            r0.mo4407a(r15)
            r15 = 0
            throw r15
    }

    /* renamed from: s */
    public final int m4176s(T r11) {
            r10 = this;
            sun.misc.Unsafe r0 = p072e7.C1590d7.f7525m
            r1 = 0
            r2 = 0
            r3 = 0
        L5:
            int[] r4 = r10.f7526a
            int r4 = r4.length
            if (r2 >= r4) goto L399
            int r4 = r10.m4178v(r2)
            int r5 = r4 >>> 20
            r5 = r5 & 255(0xff, float:3.57E-43)
            int[] r6 = r10.f7526a
            r7 = r6[r2]
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r4 & r8
            long r8 = (long) r4
            e7.t5 r4 = p072e7.EnumC1747t5.f7786Z
            int r4 = r4.f7790Y
            if (r5 < r4) goto L2b
            e7.t5 r4 = p072e7.EnumC1747t5.f7787a0
            int r4 = r4.f7790Y
            if (r5 > r4) goto L2b
            int r4 = r2 + 2
            r4 = r6[r4]
        L2b:
            r4 = 63
            switch(r5) {
                case 0: goto L386;
                case 1: goto L377;
                case 2: goto L361;
                case 3: goto L35a;
                case 4: goto L344;
                case 5: goto L33d;
                case 6: goto L336;
                case 7: goto L327;
                case 8: goto L2f7;
                case 9: goto L2e3;
                case 10: goto L2d8;
                case 11: goto L2c2;
                case 12: goto L2ba;
                case 13: goto L2b2;
                case 14: goto L2aa;
                case 15: goto L294;
                case 16: goto L278;
                case 17: goto L262;
                case 18: goto L256;
                case 19: goto L24a;
                case 20: goto L23e;
                case 21: goto L232;
                case 22: goto L226;
                case 23: goto L256;
                case 24: goto L24a;
                case 25: goto L21a;
                case 26: goto L20e;
                case 27: goto L1fe;
                case 28: goto L1f2;
                case 29: goto L1e6;
                case 30: goto L1da;
                case 31: goto L24a;
                case 32: goto L256;
                case 33: goto L1ce;
                case 34: goto L1c2;
                case 35: goto L1aa;
                case 36: goto L19d;
                case 37: goto L190;
                case 38: goto L183;
                case 39: goto L176;
                case 40: goto L169;
                case 41: goto L15c;
                case 42: goto L14d;
                case 43: goto L13f;
                case 44: goto L131;
                case 45: goto L123;
                case 46: goto L115;
                case 47: goto L107;
                case 48: goto Lf9;
                case 49: goto Le9;
                case 50: goto Ldc;
                case 51: goto Ld4;
                case 52: goto Lcc;
                case 53: goto Lc0;
                case 54: goto Lb9;
                case 55: goto Lad;
                case 56: goto La5;
                case 57: goto L9d;
                case 58: goto L95;
                case 59: goto L85;
                case 60: goto L7d;
                case 61: goto L75;
                case 62: goto L69;
                case 63: goto L62;
                case 64: goto L5a;
                case 65: goto L52;
                case 66: goto L46;
                case 67: goto L3a;
                case 68: goto L32;
                default: goto L30;
            }
        L30:
            goto L395
        L32:
            boolean r4 = r10.m4173j(r11, r7, r2)
            if (r4 == 0) goto L395
            goto L268
        L3a:
            boolean r5 = r10.m4173j(r11, r7, r2)
            if (r5 == 0) goto L395
            long r5 = m4157w(r11, r8)
            goto L282
        L46:
            boolean r4 = r10.m4173j(r11, r7, r2)
            if (r4 == 0) goto L395
            int r4 = m4156t(r11, r8)
            goto L29e
        L52:
            boolean r4 = r10.m4173j(r11, r7, r2)
            if (r4 == 0) goto L395
            goto L38c
        L5a:
            boolean r4 = r10.m4173j(r11, r7, r2)
            if (r4 == 0) goto L395
            goto L37d
        L62:
            boolean r4 = r10.m4173j(r11, r7, r2)
            if (r4 == 0) goto L395
            goto Lb3
        L69:
            boolean r4 = r10.m4173j(r11, r7, r2)
            if (r4 == 0) goto L395
            int r4 = m4156t(r11, r8)
            goto L2cc
        L75:
            boolean r4 = r10.m4173j(r11, r7, r2)
            if (r4 == 0) goto L395
            goto L2de
        L7d:
            boolean r4 = r10.m4173j(r11, r7, r2)
            if (r4 == 0) goto L395
            goto L2e9
        L85:
            boolean r4 = r10.m4173j(r11, r7, r2)
            if (r4 == 0) goto L395
            java.lang.Object r4 = p072e7.C1651j8.m4304j(r11, r8)
            boolean r5 = r4 instanceof p072e7.AbstractC1638i5
            if (r5 == 0) goto L31a
            goto L305
        L95:
            boolean r4 = r10.m4173j(r11, r7, r2)
            if (r4 == 0) goto L395
            goto L32d
        L9d:
            boolean r4 = r10.m4173j(r11, r7, r2)
            if (r4 == 0) goto L395
            goto L37d
        La5:
            boolean r4 = r10.m4173j(r11, r7, r2)
            if (r4 == 0) goto L395
            goto L38c
        Lad:
            boolean r4 = r10.m4173j(r11, r7, r2)
            if (r4 == 0) goto L395
        Lb3:
            int r4 = m4156t(r11, r8)
            goto L34e
        Lb9:
            boolean r4 = r10.m4173j(r11, r7, r2)
            if (r4 == 0) goto L395
            goto Lc6
        Lc0:
            boolean r4 = r10.m4173j(r11, r7, r2)
            if (r4 == 0) goto L395
        Lc6:
            long r4 = m4157w(r11, r8)
            goto L36b
        Lcc:
            boolean r4 = r10.m4173j(r11, r7, r2)
            if (r4 == 0) goto L395
            goto L37d
        Ld4:
            boolean r4 = r10.m4173j(r11, r7, r2)
            if (r4 == 0) goto L395
            goto L38c
        Ldc:
            java.lang.Object r4 = p072e7.C1651j8.m4304j(r11, r8)
            java.lang.Object r5 = r10.m4180y(r2)
            p072e7.C1766v6.m4462a(r7, r4, r5)
            goto L395
        Le9:
            java.lang.Object r4 = p072e7.C1651j8.m4304j(r11, r8)
            java.util.List r4 = (java.util.List) r4
            e7.l7 r5 = r10.m4179x(r2)
            int r4 = p072e7.C1690n7.m4359C(r7, r4, r5)
            goto L394
        Lf9:
            java.lang.Object r4 = r0.getObject(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p072e7.C1690n7.m4369M(r4)
            if (r4 <= 0) goto L395
            goto L1b6
        L107:
            java.lang.Object r4 = r0.getObject(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p072e7.C1690n7.m4367K(r4)
            if (r4 <= 0) goto L395
            goto L1b6
        L115:
            java.lang.Object r4 = r0.getObject(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p072e7.C1690n7.m4358B(r4)
            if (r4 <= 0) goto L395
            goto L1b6
        L123:
            java.lang.Object r4 = r0.getObject(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p072e7.C1690n7.m4400z(r4)
            if (r4 <= 0) goto L395
            goto L1b6
        L131:
            java.lang.Object r4 = r0.getObject(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p072e7.C1690n7.m4398x(r4)
            if (r4 <= 0) goto L395
            goto L1b6
        L13f:
            java.lang.Object r4 = r0.getObject(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p072e7.C1690n7.m4372P(r4)
            if (r4 <= 0) goto L395
            goto L1b6
        L14d:
            java.lang.Object r4 = r0.getObject(r11, r8)
            java.util.List r4 = (java.util.List) r4
            java.lang.Class<?> r5 = p072e7.C1690n7.f7703a
            int r4 = r4.size()
            if (r4 <= 0) goto L395
            goto L1b6
        L15c:
            java.lang.Object r4 = r0.getObject(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p072e7.C1690n7.m4400z(r4)
            if (r4 <= 0) goto L395
            goto L1b6
        L169:
            java.lang.Object r4 = r0.getObject(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p072e7.C1690n7.m4358B(r4)
            if (r4 <= 0) goto L395
            goto L1b6
        L176:
            java.lang.Object r4 = r0.getObject(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p072e7.C1690n7.m4361E(r4)
            if (r4 <= 0) goto L395
            goto L1b6
        L183:
            java.lang.Object r4 = r0.getObject(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p072e7.C1690n7.m4374R(r4)
            if (r4 <= 0) goto L395
            goto L1b6
        L190:
            java.lang.Object r4 = r0.getObject(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p072e7.C1690n7.m4363G(r4)
            if (r4 <= 0) goto L395
            goto L1b6
        L19d:
            java.lang.Object r4 = r0.getObject(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p072e7.C1690n7.m4400z(r4)
            if (r4 <= 0) goto L395
            goto L1b6
        L1aa:
            java.lang.Object r4 = r0.getObject(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p072e7.C1690n7.m4358B(r4)
            if (r4 <= 0) goto L395
        L1b6:
            int r5 = p072e7.AbstractC1668l5.m4330J(r7)
            int r6 = p072e7.AbstractC1668l5.m4331m(r4)
            int r6 = r6 + r5
            int r6 = r6 + r4
            goto L317
        L1c2:
            java.lang.Object r4 = p072e7.C1651j8.m4304j(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p072e7.C1690n7.m4368L(r7, r4, r1)
            goto L394
        L1ce:
            java.lang.Object r4 = p072e7.C1651j8.m4304j(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p072e7.C1690n7.m4366J(r7, r4, r1)
            goto L394
        L1da:
            java.lang.Object r4 = p072e7.C1651j8.m4304j(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p072e7.C1690n7.m4397w(r7, r4, r1)
            goto L394
        L1e6:
            java.lang.Object r4 = p072e7.C1651j8.m4304j(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p072e7.C1690n7.m4371O(r7, r4, r1)
            goto L394
        L1f2:
            java.lang.Object r4 = p072e7.C1651j8.m4304j(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p072e7.C1690n7.m4396v(r7, r4)
            goto L394
        L1fe:
            java.lang.Object r4 = p072e7.C1651j8.m4304j(r11, r8)
            java.util.List r4 = (java.util.List) r4
            e7.l7 r5 = r10.m4179x(r2)
            int r4 = p072e7.C1690n7.m4365I(r7, r4, r5)
            goto L394
        L20e:
            java.lang.Object r4 = p072e7.C1651j8.m4304j(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p072e7.C1690n7.m4370N(r7, r4)
            goto L394
        L21a:
            java.lang.Object r4 = p072e7.C1651j8.m4304j(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p072e7.C1690n7.m4395u(r7, r4)
            goto L394
        L226:
            java.lang.Object r4 = p072e7.C1651j8.m4304j(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p072e7.C1690n7.m4360D(r7, r4, r1)
            goto L394
        L232:
            java.lang.Object r4 = p072e7.C1651j8.m4304j(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p072e7.C1690n7.m4373Q(r7, r4, r1)
            goto L394
        L23e:
            java.lang.Object r4 = p072e7.C1651j8.m4304j(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p072e7.C1690n7.m4362F(r7, r4)
            goto L394
        L24a:
            java.lang.Object r4 = p072e7.C1651j8.m4304j(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p072e7.C1690n7.m4399y(r7, r4)
            goto L394
        L256:
            java.lang.Object r4 = p072e7.C1651j8.m4304j(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p072e7.C1690n7.m4357A(r7, r4)
            goto L394
        L262:
            boolean r4 = r10.m4164a(r11, r2)
            if (r4 == 0) goto L395
        L268:
            java.lang.Object r4 = p072e7.C1651j8.m4304j(r11, r8)
            e7.a7 r4 = (p072e7.InterfaceC1560a7) r4
            e7.l7 r5 = r10.m4179x(r2)
            int r4 = p072e7.AbstractC1668l5.m4326F(r7, r4, r5)
            goto L394
        L278:
            boolean r5 = r10.m4164a(r11, r2)
            if (r5 == 0) goto L395
            long r5 = p072e7.C1651j8.m4302h(r11, r8)
        L282:
            int r7 = r7 << 3
            int r7 = p072e7.AbstractC1668l5.m4331m(r7)
            long r8 = r5 + r5
            long r4 = r5 >> r4
            long r4 = r4 ^ r8
            int r4 = p072e7.AbstractC1668l5.m4332n(r4)
            int r4 = r4 + r7
            goto L394
        L294:
            boolean r4 = r10.m4164a(r11, r2)
            if (r4 == 0) goto L395
            int r4 = p072e7.C1651j8.m4301g(r11, r8)
        L29e:
            int r5 = r7 << 3
            int r5 = p072e7.AbstractC1668l5.m4331m(r5)
            int r6 = r4 + r4
            int r4 = r4 >> 31
            r4 = r4 ^ r6
            goto L2d2
        L2aa:
            boolean r4 = r10.m4164a(r11, r2)
            if (r4 == 0) goto L395
            goto L38c
        L2b2:
            boolean r4 = r10.m4164a(r11, r2)
            if (r4 == 0) goto L395
            goto L37d
        L2ba:
            boolean r4 = r10.m4164a(r11, r2)
            if (r4 == 0) goto L395
            goto L34a
        L2c2:
            boolean r4 = r10.m4164a(r11, r2)
            if (r4 == 0) goto L395
            int r4 = p072e7.C1651j8.m4301g(r11, r8)
        L2cc:
            int r5 = r7 << 3
            int r5 = p072e7.AbstractC1668l5.m4331m(r5)
        L2d2:
            int r4 = p072e7.AbstractC1668l5.m4331m(r4)
            goto L358
        L2d8:
            boolean r4 = r10.m4164a(r11, r2)
            if (r4 == 0) goto L395
        L2de:
            java.lang.Object r4 = p072e7.C1651j8.m4304j(r11, r8)
            goto L305
        L2e3:
            boolean r4 = r10.m4164a(r11, r2)
            if (r4 == 0) goto L395
        L2e9:
            java.lang.Object r4 = p072e7.C1651j8.m4304j(r11, r8)
            e7.l7 r5 = r10.m4179x(r2)
            int r4 = p072e7.C1690n7.m4364H(r7, r4, r5)
            goto L394
        L2f7:
            boolean r4 = r10.m4164a(r11, r2)
            if (r4 == 0) goto L395
            java.lang.Object r4 = p072e7.C1651j8.m4304j(r11, r8)
            boolean r5 = r4 instanceof p072e7.AbstractC1638i5
            if (r5 == 0) goto L31a
        L305:
            e7.i5 r4 = (p072e7.AbstractC1638i5) r4
            int r5 = r7 << 3
            int r5 = p072e7.AbstractC1668l5.m4331m(r5)
            int r4 = r4.mo4195h()
            int r6 = p072e7.AbstractC1668l5.m4331m(r4)
            int r6 = r6 + r4
            int r6 = r6 + r5
        L317:
            int r3 = r3 + r6
            goto L395
        L31a:
            java.lang.String r4 = (java.lang.String) r4
            int r5 = r7 << 3
            int r5 = p072e7.AbstractC1668l5.m4331m(r5)
            int r4 = p072e7.AbstractC1668l5.m4329I(r4)
            goto L358
        L327:
            boolean r4 = r10.m4164a(r11, r2)
            if (r4 == 0) goto L395
        L32d:
            int r4 = r7 << 3
            int r4 = p072e7.AbstractC1668l5.m4331m(r4)
            int r4 = r4 + 1
            goto L394
        L336:
            boolean r4 = r10.m4164a(r11, r2)
            if (r4 == 0) goto L395
            goto L37d
        L33d:
            boolean r4 = r10.m4164a(r11, r2)
            if (r4 == 0) goto L395
            goto L38c
        L344:
            boolean r4 = r10.m4164a(r11, r2)
            if (r4 == 0) goto L395
        L34a:
            int r4 = p072e7.C1651j8.m4301g(r11, r8)
        L34e:
            int r5 = r7 << 3
            int r5 = p072e7.AbstractC1668l5.m4331m(r5)
            int r4 = p072e7.AbstractC1668l5.m4327G(r4)
        L358:
            int r4 = r4 + r5
            goto L394
        L35a:
            boolean r4 = r10.m4164a(r11, r2)
            if (r4 == 0) goto L395
            goto L367
        L361:
            boolean r4 = r10.m4164a(r11, r2)
            if (r4 == 0) goto L395
        L367:
            long r4 = p072e7.C1651j8.m4302h(r11, r8)
        L36b:
            int r6 = r7 << 3
            int r6 = p072e7.AbstractC1668l5.m4331m(r6)
            int r4 = p072e7.AbstractC1668l5.m4332n(r4)
            int r4 = r4 + r6
            goto L394
        L377:
            boolean r4 = r10.m4164a(r11, r2)
            if (r4 == 0) goto L395
        L37d:
            int r4 = r7 << 3
            int r4 = p072e7.AbstractC1668l5.m4331m(r4)
            int r4 = r4 + 4
            goto L394
        L386:
            boolean r4 = r10.m4164a(r11, r2)
            if (r4 == 0) goto L395
        L38c:
            int r4 = r7 << 3
            int r4 = p072e7.AbstractC1668l5.m4331m(r4)
            int r4 = r4 + 8
        L394:
            int r3 = r3 + r4
        L395:
            int r2 = r2 + 3
            goto L5
        L399:
            e7.z7<?, ?> r0 = r10.f7535j
            java.lang.Object r11 = r0.mo4133c(r11)
            int r11 = r0.mo4131a(r11)
            int r11 = r11 + r3
            return r11
    }

    /* renamed from: u */
    public final int m4177u(int r2) {
            r1 = this;
            int[] r0 = r1.f7526a
            int r2 = r2 + 2
            r2 = r0[r2]
            return r2
    }

    /* renamed from: v */
    public final int m4178v(int r2) {
            r1 = this;
            int[] r0 = r1.f7526a
            int r2 = r2 + 1
            r2 = r0[r2]
            return r2
    }

    /* renamed from: x */
    public final p072e7.InterfaceC1670l7 m4179x(int r4) {
            r3 = this;
            int r4 = r4 / 3
            int r4 = r4 + r4
            java.lang.Object[] r0 = r3.f7527b
            r1 = r0[r4]
            e7.l7 r1 = (p072e7.InterfaceC1670l7) r1
            if (r1 == 0) goto Lc
            return r1
        Lc:
            e7.i7 r1 = p072e7.C1640i7.f7650c
            int r2 = r4 + 1
            r0 = r0[r2]
            java.lang.Class r0 = (java.lang.Class) r0
            e7.l7 r0 = r1.m4233a(r0)
            java.lang.Object[] r1 = r3.f7527b
            r1[r4] = r0
            return r0
    }

    /* renamed from: y */
    public final java.lang.Object m4180y(int r2) {
            r1 = this;
            int r2 = r2 / 3
            java.lang.Object[] r0 = r1.f7527b
            int r2 = r2 + r2
            r2 = r0[r2]
            return r2
    }
}
