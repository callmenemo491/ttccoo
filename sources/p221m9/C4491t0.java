package p221m9;

/* renamed from: m9.t0 */
/* loaded from: classes.dex */
public final class C4491t0<T> implements p221m9.InterfaceC4447e1<T> {

    /* renamed from: r */
    public static final int[] f18228r = null;

    /* renamed from: s */
    public static final sun.misc.Unsafe f18229s = null;

    /* renamed from: a */
    public final int[] f18230a;

    /* renamed from: b */
    public final java.lang.Object[] f18231b;

    /* renamed from: c */
    public final int f18232c;

    /* renamed from: d */
    public final int f18233d;

    /* renamed from: e */
    public final p221m9.InterfaceC4482q0 f18234e;

    /* renamed from: f */
    public final boolean f18235f;

    /* renamed from: g */
    public final boolean f18236g;

    /* renamed from: h */
    public final boolean f18237h;

    /* renamed from: i */
    public final boolean f18238i;

    /* renamed from: j */
    public final int[] f18239j;

    /* renamed from: k */
    public final int f18240k;

    /* renamed from: l */
    public final int f18241l;

    /* renamed from: m */
    public final p221m9.InterfaceC4497v0 f18242m;

    /* renamed from: n */
    public final p221m9.AbstractC4452g0 f18243n;

    /* renamed from: o */
    public final p221m9.AbstractC4471m1<?, ?> f18244o;

    /* renamed from: p */
    public final p221m9.AbstractC4481q<?> f18245p;

    /* renamed from: q */
    public final p221m9.InterfaceC4467l0 f18246q;

    static {
            r0 = 0
            int[] r0 = new int[r0]
            p221m9.C4491t0.f18228r = r0
            sun.misc.Unsafe r0 = p221m9.C4483q1.m10251o()
            p221m9.C4491t0.f18229s = r0
            return
    }

    public C4491t0(int[] r1, java.lang.Object[] r2, int r3, int r4, p221m9.InterfaceC4482q0 r5, boolean r6, boolean r7, int[] r8, int r9, int r10, p221m9.InterfaceC4497v0 r11, p221m9.AbstractC4452g0 r12, p221m9.AbstractC4471m1<?, ?> r13, p221m9.AbstractC4481q<?> r14, p221m9.InterfaceC4467l0 r15) {
            r0 = this;
            r0.<init>()
            r0.f18230a = r1
            r0.f18231b = r2
            r0.f18232c = r3
            r0.f18233d = r4
            boolean r1 = r5 instanceof p221m9.AbstractC4501x
            r0.f18236g = r1
            r0.f18237h = r6
            if (r14 == 0) goto L1b
            boolean r1 = r14.mo10227e(r5)
            if (r1 == 0) goto L1b
            r1 = 1
            goto L1c
        L1b:
            r1 = 0
        L1c:
            r0.f18235f = r1
            r0.f18238i = r7
            r0.f18239j = r8
            r0.f18240k = r9
            r0.f18241l = r10
            r0.f18242m = r11
            r0.f18243n = r12
            r0.f18244o = r13
            r0.f18245p = r14
            r0.f18234e = r5
            r0.f18246q = r15
            return
    }

    /* renamed from: A */
    public static <T> p221m9.C4491t0<T> m10319A(p221m9.C4441c1 r36, p221m9.InterfaceC4497v0 r37, p221m9.AbstractC4452g0 r38, p221m9.AbstractC4471m1<?, ?> r39, p221m9.AbstractC4481q<?> r40, p221m9.InterfaceC4467l0 r41) {
            r0 = r36
            int r1 = r0.f18117d
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
            r11 = 1
            goto L12
        L11:
            r11 = 0
        L12:
            java.lang.String r1 = r0.f18115b
            int r5 = r1.length()
            char r6 = r1.charAt(r4)
            r7 = 55296(0xd800, float:7.7486E-41)
            if (r6 < r7) goto L39
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            r9 = 1
            r10 = 13
        L26:
            int r12 = r9 + 1
            char r9 = r1.charAt(r9)
            if (r9 < r7) goto L36
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            int r9 = r9 << r10
            r6 = r6 | r9
            int r10 = r10 + 13
            r9 = r12
            goto L26
        L36:
            int r9 = r9 << r10
            r6 = r6 | r9
            goto L3a
        L39:
            r12 = 1
        L3a:
            int r9 = r12 + 1
            char r10 = r1.charAt(r12)
            if (r10 < r7) goto L59
            r10 = r10 & 8191(0x1fff, float:1.1478E-41)
            r12 = 13
        L46:
            int r13 = r9 + 1
            char r9 = r1.charAt(r9)
            if (r9 < r7) goto L56
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            int r9 = r9 << r12
            r10 = r10 | r9
            int r12 = r12 + 13
            r9 = r13
            goto L46
        L56:
            int r9 = r9 << r12
            r10 = r10 | r9
            r9 = r13
        L59:
            if (r10 != 0) goto L66
            int[] r10 = p221m9.C4491t0.f18228r
            r14 = r10
            r2 = 0
            r8 = 0
            r10 = 0
            r12 = 0
            r13 = 0
            r15 = 0
            goto L18f
        L66:
            int r10 = r9 + 1
            char r9 = r1.charAt(r9)
            if (r9 < r7) goto L85
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            r12 = 13
        L72:
            int r13 = r10 + 1
            char r10 = r1.charAt(r10)
            if (r10 < r7) goto L82
            r10 = r10 & 8191(0x1fff, float:1.1478E-41)
            int r10 = r10 << r12
            r9 = r9 | r10
            int r12 = r12 + 13
            r10 = r13
            goto L72
        L82:
            int r10 = r10 << r12
            r9 = r9 | r10
            r10 = r13
        L85:
            int r12 = r10 + 1
            char r10 = r1.charAt(r10)
            if (r10 < r7) goto La4
            r10 = r10 & 8191(0x1fff, float:1.1478E-41)
            r13 = 13
        L91:
            int r14 = r12 + 1
            char r12 = r1.charAt(r12)
            if (r12 < r7) goto La1
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            int r12 = r12 << r13
            r10 = r10 | r12
            int r13 = r13 + 13
            r12 = r14
            goto L91
        La1:
            int r12 = r12 << r13
            r10 = r10 | r12
            r12 = r14
        La4:
            int r13 = r12 + 1
            char r12 = r1.charAt(r12)
            if (r12 < r7) goto Lc3
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            r14 = 13
        Lb0:
            int r15 = r13 + 1
            char r13 = r1.charAt(r13)
            if (r13 < r7) goto Lc0
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            int r13 = r13 << r14
            r12 = r12 | r13
            int r14 = r14 + 13
            r13 = r15
            goto Lb0
        Lc0:
            int r13 = r13 << r14
            r12 = r12 | r13
            r13 = r15
        Lc3:
            int r14 = r13 + 1
            char r13 = r1.charAt(r13)
            if (r13 < r7) goto Le4
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            r15 = 13
        Lcf:
            int r16 = r14 + 1
            char r14 = r1.charAt(r14)
            if (r14 < r7) goto Le0
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            int r14 = r14 << r15
            r13 = r13 | r14
            int r15 = r15 + 13
            r14 = r16
            goto Lcf
        Le0:
            int r14 = r14 << r15
            r13 = r13 | r14
            r14 = r16
        Le4:
            int r15 = r14 + 1
            char r14 = r1.charAt(r14)
            if (r14 < r7) goto L107
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            r16 = 13
        Lf0:
            int r17 = r15 + 1
            char r15 = r1.charAt(r15)
            if (r15 < r7) goto L102
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            int r15 = r15 << r16
            r14 = r14 | r15
            int r16 = r16 + 13
            r15 = r17
            goto Lf0
        L102:
            int r15 = r15 << r16
            r14 = r14 | r15
            r15 = r17
        L107:
            int r16 = r15 + 1
            char r15 = r1.charAt(r15)
            if (r15 < r7) goto L12d
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            r4 = r16
            r16 = 13
        L115:
            int r18 = r4 + 1
            char r4 = r1.charAt(r4)
            if (r4 < r7) goto L127
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            int r4 = r4 << r16
            r15 = r15 | r4
            int r16 = r16 + 13
            r4 = r18
            goto L115
        L127:
            int r4 = r4 << r16
            r15 = r15 | r4
            r4 = r18
            goto L12f
        L12d:
            r4 = r16
        L12f:
            int r16 = r4 + 1
            char r4 = r1.charAt(r4)
            if (r4 < r7) goto L155
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r8 = r16
            r16 = 13
        L13d:
            int r19 = r8 + 1
            char r8 = r1.charAt(r8)
            if (r8 < r7) goto L14f
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            int r8 = r8 << r16
            r4 = r4 | r8
            int r16 = r16 + 13
            r8 = r19
            goto L13d
        L14f:
            int r8 = r8 << r16
            r4 = r4 | r8
            r8 = r19
            goto L157
        L155:
            r8 = r16
        L157:
            int r16 = r8 + 1
            char r8 = r1.charAt(r8)
            if (r8 < r7) goto L17c
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            r2 = r16
            r16 = 13
        L165:
            int r20 = r2 + 1
            char r2 = r1.charAt(r2)
            if (r2 < r7) goto L177
            r2 = r2 & 8191(0x1fff, float:1.1478E-41)
            int r2 = r2 << r16
            r8 = r8 | r2
            int r16 = r16 + 13
            r2 = r20
            goto L165
        L177:
            int r2 = r2 << r16
            r8 = r8 | r2
            r16 = r20
        L17c:
            int r2 = r8 + r15
            int r2 = r2 + r4
            int[] r2 = new int[r2]
            int r4 = r9 * 2
            int r4 = r4 + r10
            r10 = r14
            r14 = r2
            r2 = r9
            r9 = r16
            r35 = r15
            r15 = r8
            r8 = r12
            r12 = r35
        L18f:
            sun.misc.Unsafe r7 = p221m9.C4491t0.f18229s
            java.lang.Object[] r3 = r0.f18116c
            r21 = r4
            m9.q0 r4 = r0.f18114a
            java.lang.Class r4 = r4.getClass()
            r22 = r9
            int r9 = r10 * 3
            int[] r9 = new int[r9]
            r20 = 2
            int r10 = r10 * 2
            java.lang.Object[] r10 = new java.lang.Object[r10]
            int r23 = r15 + r12
            r25 = r15
            r12 = r22
            r26 = r23
            r22 = 0
            r24 = 0
        L1b3:
            if (r12 >= r5) goto L417
            int r27 = r12 + 1
            char r12 = r1.charAt(r12)
            r28 = r5
            r5 = 55296(0xd800, float:7.7486E-41)
            if (r12 < r5) goto L1e7
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            r5 = r27
            r27 = 13
        L1c8:
            int r29 = r5 + 1
            char r5 = r1.charAt(r5)
            r30 = r15
            r15 = 55296(0xd800, float:7.7486E-41)
            if (r5 < r15) goto L1e1
            r5 = r5 & 8191(0x1fff, float:1.1478E-41)
            int r5 = r5 << r27
            r12 = r12 | r5
            int r27 = r27 + 13
            r5 = r29
            r15 = r30
            goto L1c8
        L1e1:
            int r5 = r5 << r27
            r12 = r12 | r5
            r5 = r29
            goto L1eb
        L1e7:
            r30 = r15
            r5 = r27
        L1eb:
            int r15 = r5 + 1
            char r5 = r1.charAt(r5)
            r27 = r15
            r15 = 55296(0xd800, float:7.7486E-41)
            if (r5 < r15) goto L21d
            r5 = r5 & 8191(0x1fff, float:1.1478E-41)
            r15 = r27
            r27 = 13
        L1fe:
            int r29 = r15 + 1
            char r15 = r1.charAt(r15)
            r31 = r11
            r11 = 55296(0xd800, float:7.7486E-41)
            if (r15 < r11) goto L217
            r11 = r15 & 8191(0x1fff, float:1.1478E-41)
            int r11 = r11 << r27
            r5 = r5 | r11
            int r27 = r27 + 13
            r15 = r29
            r11 = r31
            goto L1fe
        L217:
            int r11 = r15 << r27
            r5 = r5 | r11
            r15 = r29
            goto L221
        L21d:
            r31 = r11
            r15 = r27
        L221:
            r11 = r5 & 255(0xff, float:3.57E-43)
            r27 = r13
            r13 = r5 & 1024(0x400, float:1.435E-42)
            if (r13 == 0) goto L22f
            int r13 = r22 + 1
            r14[r22] = r24
            r22 = r13
        L22f:
            r13 = 51
            if (r11 < r13) goto L2e1
            int r13 = r15 + 1
            char r15 = r1.charAt(r15)
            r29 = r13
            r13 = 55296(0xd800, float:7.7486E-41)
            if (r15 < r13) goto L267
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            r33 = 13
            r35 = r29
            r29 = r15
            r15 = r35
        L24a:
            int r34 = r15 + 1
            char r15 = r1.charAt(r15)
            if (r15 < r13) goto L260
            r13 = r15 & 8191(0x1fff, float:1.1478E-41)
            int r13 = r13 << r33
            r29 = r29 | r13
            int r33 = r33 + 13
            r15 = r34
            r13 = 55296(0xd800, float:7.7486E-41)
            goto L24a
        L260:
            int r13 = r15 << r33
            r15 = r29 | r13
            r13 = r34
            goto L269
        L267:
            r13 = r29
        L269:
            r29 = r13
            int r13 = r11 + (-51)
            r33 = r8
            r8 = 9
            if (r13 == r8) goto L292
            r8 = 17
            if (r13 != r8) goto L278
            goto L292
        L278:
            r8 = 12
            if (r13 != r8) goto L290
            r8 = r6 & 1
            r13 = 1
            if (r8 != r13) goto L290
            int r8 = r24 / 3
            r19 = 2
            int r8 = r8 * 2
            int r8 = r8 + r13
            int r13 = r21 + 1
            r21 = r3[r21]
            r10[r8] = r21
            r21 = r13
        L290:
            r13 = 2
            goto L2a3
        L292:
            int r8 = r24 / 3
            r13 = 2
            int r8 = r8 * 2
            r19 = 1
            int r8 = r8 + 1
            int r20 = r21 + 1
            r21 = r3[r21]
            r10[r8] = r21
            r21 = r20
        L2a3:
            int r15 = r15 * 2
            r8 = r3[r15]
            boolean r13 = r8 instanceof java.lang.reflect.Field
            if (r13 == 0) goto L2ae
            java.lang.reflect.Field r8 = (java.lang.reflect.Field) r8
            goto L2b6
        L2ae:
            java.lang.String r8 = (java.lang.String) r8
            java.lang.reflect.Field r8 = m10326R(r4, r8)
            r3[r15] = r8
        L2b6:
            r13 = r9
            long r8 = r7.objectFieldOffset(r8)
            int r9 = (int) r8
            int r15 = r15 + 1
            r8 = r3[r15]
            r32 = r9
            boolean r9 = r8 instanceof java.lang.reflect.Field
            if (r9 == 0) goto L2c9
            java.lang.reflect.Field r8 = (java.lang.reflect.Field) r8
            goto L2d1
        L2c9:
            java.lang.String r8 = (java.lang.String) r8
            java.lang.reflect.Field r8 = m10326R(r4, r8)
            r3[r15] = r8
        L2d1:
            long r8 = r7.objectFieldOffset(r8)
            int r9 = (int) r8
            r0 = r6
            r6 = r9
            r9 = r32
            r15 = 0
            r32 = r29
            r29 = r5
            goto L3dc
        L2e1:
            r33 = r8
            r13 = r9
            int r8 = r21 + 1
            r9 = r3[r21]
            java.lang.String r9 = (java.lang.String) r9
            java.lang.reflect.Field r9 = m10326R(r4, r9)
            r0 = 9
            if (r11 == r0) goto L362
            r0 = 17
            if (r11 != r0) goto L2f8
            goto L362
        L2f8:
            r0 = 27
            if (r11 == r0) goto L34f
            r0 = 49
            if (r11 != r0) goto L301
            goto L34f
        L301:
            r0 = 12
            if (r11 == r0) goto L33a
            r0 = 30
            if (r11 == r0) goto L33a
            r0 = 44
            if (r11 != r0) goto L30e
            goto L33a
        L30e:
            r0 = 50
            if (r11 != r0) goto L336
            int r0 = r25 + 1
            r14[r25] = r24
            int r25 = r24 / 3
            r20 = 2
            int r25 = r25 * 2
            int r29 = r8 + 1
            r8 = r3[r8]
            r10[r25] = r8
            r8 = r5 & 2048(0x800, float:2.87E-42)
            if (r8 == 0) goto L32f
            int r25 = r25 + 1
            int r8 = r29 + 1
            r29 = r3[r29]
            r10[r25] = r29
            goto L331
        L32f:
            r8 = r29
        L331:
            r25 = r0
            r29 = r5
            goto L372
        L336:
            r29 = r5
            r5 = 1
            goto L372
        L33a:
            r0 = r6 & 1
            r29 = r5
            r5 = 1
            if (r0 != r5) goto L372
            int r0 = r24 / 3
            r19 = 2
            int r0 = r0 * 2
            int r0 = r0 + r5
            int r20 = r8 + 1
            r8 = r3[r8]
            r10[r0] = r8
            goto L35f
        L34f:
            r29 = r5
            r5 = 1
            r19 = 2
            int r0 = r24 / 3
            int r0 = r0 * 2
            int r0 = r0 + r5
            int r20 = r8 + 1
            r8 = r3[r8]
            r10[r0] = r8
        L35f:
            r8 = r20
            goto L372
        L362:
            r29 = r5
            r5 = 1
            r19 = 2
            int r0 = r24 / 3
            int r0 = r0 * 2
            int r0 = r0 + r5
            java.lang.Class r19 = r9.getType()
            r10[r0] = r19
        L372:
            r0 = r6
            long r5 = r7.objectFieldOffset(r9)
            int r9 = (int) r5
            r5 = r0 & 1
            r6 = 1
            if (r5 != r6) goto L3c8
            r5 = 17
            if (r11 > r5) goto L3c8
            int r5 = r15 + 1
            char r15 = r1.charAt(r15)
            r6 = 55296(0xd800, float:7.7486E-41)
            if (r15 < r6) goto L3a6
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            r16 = 13
        L390:
            int r32 = r5 + 1
            char r5 = r1.charAt(r5)
            if (r5 < r6) goto L3a2
            r5 = r5 & 8191(0x1fff, float:1.1478E-41)
            int r5 = r5 << r16
            r15 = r15 | r5
            int r16 = r16 + 13
            r5 = r32
            goto L390
        L3a2:
            int r5 = r5 << r16
            r15 = r15 | r5
            goto L3a8
        L3a6:
            r32 = r5
        L3a8:
            r5 = 2
            int r16 = r2 * 2
            int r20 = r15 / 32
            int r20 = r20 + r16
            r5 = r3[r20]
            boolean r6 = r5 instanceof java.lang.reflect.Field
            if (r6 == 0) goto L3b8
            java.lang.reflect.Field r5 = (java.lang.reflect.Field) r5
            goto L3c0
        L3b8:
            java.lang.String r5 = (java.lang.String) r5
            java.lang.reflect.Field r5 = m10326R(r4, r5)
            r3[r20] = r5
        L3c0:
            long r5 = r7.objectFieldOffset(r5)
            int r6 = (int) r5
            int r15 = r15 % 32
            goto L3cc
        L3c8:
            r32 = r15
            r6 = 0
            r15 = 0
        L3cc:
            r5 = 18
            if (r11 < r5) goto L3da
            r5 = 49
            if (r11 > r5) goto L3da
            int r5 = r26 + 1
            r14[r26] = r9
            r26 = r5
        L3da:
            r21 = r8
        L3dc:
            int r5 = r24 + 1
            r13[r24] = r12
            int r8 = r5 + 1
            r20 = r0
            r12 = r29
            r0 = r12 & 512(0x200, float:7.17E-43)
            if (r0 == 0) goto L3ed
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            goto L3ee
        L3ed:
            r0 = 0
        L3ee:
            r12 = r12 & 256(0x100, float:3.59E-43)
            if (r12 == 0) goto L3f5
            r12 = 268435456(0x10000000, float:2.524355E-29)
            goto L3f6
        L3f5:
            r12 = 0
        L3f6:
            r0 = r0 | r12
            int r11 = r11 << 20
            r0 = r0 | r11
            r0 = r0 | r9
            r13[r5] = r0
            int r24 = r8 + 1
            int r0 = r15 << 20
            r0 = r0 | r6
            r13[r8] = r0
            r0 = r36
            r9 = r13
            r6 = r20
            r13 = r27
            r5 = r28
            r15 = r30
            r11 = r31
            r12 = r32
            r8 = r33
            goto L1b3
        L417:
            r33 = r8
            r31 = r11
            r27 = r13
            r30 = r15
            r13 = r9
            m9.t0 r0 = new m9.t0
            r1 = r36
            m9.q0 r1 = r1.f18114a
            r12 = 0
            r5 = r0
            r6 = r13
            r7 = r10
            r9 = r27
            r10 = r1
            r13 = r14
            r14 = r30
            r15 = r23
            r16 = r37
            r17 = r38
            r18 = r39
            r19 = r40
            r20 = r41
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return r0
    }

    /* renamed from: B */
    public static long m10320B(int r2) {
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r2 = r2 & r0
            long r0 = (long) r2
            return r0
    }

    /* renamed from: C */
    public static <T> boolean m10321C(T r0, long r1) {
            java.lang.Object r0 = p221m9.C4483q1.m10250n(r0, r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
    }

    /* renamed from: D */
    public static <T> double m10322D(T r0, long r1) {
            java.lang.Object r0 = p221m9.C4483q1.m10250n(r0, r1)
            java.lang.Double r0 = (java.lang.Double) r0
            double r0 = r0.doubleValue()
            return r0
    }

    /* renamed from: E */
    public static <T> float m10323E(T r0, long r1) {
            java.lang.Object r0 = p221m9.C4483q1.m10250n(r0, r1)
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            return r0
    }

    /* renamed from: F */
    public static <T> int m10324F(T r0, long r1) {
            java.lang.Object r0 = p221m9.C4483q1.m10250n(r0, r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            return r0
    }

    /* renamed from: G */
    public static <T> long m10325G(T r0, long r1) {
            java.lang.Object r0 = p221m9.C4483q1.m10250n(r0, r1)
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            return r0
    }

    /* renamed from: R */
    public static java.lang.reflect.Field m10326R(java.lang.Class<?> r5, java.lang.String r6) {
            java.lang.reflect.Field r5 = r5.getDeclaredField(r6)     // Catch: java.lang.NoSuchFieldException -> L5
            return r5
        L5:
            java.lang.reflect.Field[] r0 = r5.getDeclaredFields()
            int r1 = r0.length
            r2 = 0
        Lb:
            if (r2 >= r1) goto L1d
            r3 = r0[r2]
            java.lang.String r4 = r3.getName()
            boolean r4 = r6.equals(r4)
            if (r4 == 0) goto L1a
            return r3
        L1a:
            int r2 = r2 + 1
            goto Lb
        L1d:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Field "
            java.lang.String r3 = " for "
            java.lang.StringBuilder r6 = androidx.activity.result.C0196d.m449a(r2, r6, r3)
            java.lang.String r5 = r5.getName()
            r6.append(r5)
            java.lang.String r5 = " not found. Known fields are "
            r6.append(r5)
            java.lang.String r5 = java.util.Arrays.toString(r0)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            r1.<init>(r5)
            throw r1
    }

    /* renamed from: V */
    public static int m10327V(int r1) {
            r0 = 267386880(0xff00000, float:2.3665827E-29)
            r1 = r1 & r0
            int r1 = r1 >>> 20
            return r1
    }

    /* renamed from: p */
    public static p221m9.C4474n1 m10328p(java.lang.Object r2) {
            m9.x r2 = (p221m9.AbstractC4501x) r2
            m9.n1 r0 = r2.unknownFields
            m9.n1 r1 = p221m9.C4474n1.f18195f
            if (r0 != r1) goto Le
            m9.n1 r0 = p221m9.C4474n1.m10217b()
            r2.unknownFields = r0
        Le:
            return r0
    }

    /* renamed from: v */
    public static java.util.List<?> m10329v(java.lang.Object r0, long r1) {
            java.lang.Object r0 = p221m9.C4483q1.m10250n(r0, r1)
            java.util.List r0 = (java.util.List) r0
            return r0
    }

    /* renamed from: z */
    public static p221m9.C4491t0 m10330z(p221m9.InterfaceC4476o0 r7, p221m9.InterfaceC4497v0 r8, p221m9.AbstractC4452g0 r9, p221m9.AbstractC4471m1 r10, p221m9.AbstractC4481q r11, p221m9.InterfaceC4467l0 r12) {
            boolean r0 = r7 instanceof p221m9.C4441c1
            if (r0 == 0) goto L11
            r1 = r7
            m9.c1 r1 = (p221m9.C4441c1) r1
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            m9.t0 r7 = m10319A(r1, r2, r3, r4, r5, r6)
            return r7
        L11:
            m9.j1 r7 = (p221m9.C4462j1) r7
            r7 = 0
            throw r7
    }

    /* renamed from: H */
    public final <K, V> int m10331H(T r5, byte[] r6, int r7, int r8, int r9, long r10, p221m9.C4445e.a r12) {
            r4 = this;
            sun.misc.Unsafe r0 = p221m9.C4491t0.f18229s
            java.lang.Object[] r1 = r4.f18231b
            int r9 = r9 / 3
            int r9 = r9 * 2
            r9 = r1[r9]
            java.lang.Object r1 = r0.getObject(r5, r10)
            m9.l0 r2 = r4.f18246q
            boolean r2 = r2.mo10190d(r1)
            if (r2 == 0) goto L25
            m9.l0 r2 = r4.f18246q
            java.lang.Object r2 = r2.mo10188b(r9)
            m9.l0 r3 = r4.f18246q
            r3.mo10187a(r2, r1)
            r0.putObject(r5, r10, r2)
            r1 = r2
        L25:
            m9.l0 r5 = r4.f18246q
            r5.mo10192f(r9)
            m9.l0 r5 = r4.f18246q
            r5.mo10194h(r1)
            int r5 = p221m9.C4445e.m9977t(r6, r7, r12)
            int r6 = r12.f18122a
            if (r6 < 0) goto L40
            int r8 = r8 - r5
            if (r6 <= r8) goto L3b
            goto L40
        L3b:
            r5 = 0
            java.util.Objects.requireNonNull(r5)
            throw r5
        L40:
            m9.a0 r5 = p221m9.C4434a0.m9902h()
            throw r5
    }

    /* renamed from: I */
    public final int m10332I(T r17, byte[] r18, int r19, int r20, int r21, int r22, int r23, int r24, int r25, long r26, int r28, p221m9.C4445e.a r29) {
            r16 = this;
            r0 = r16
            r1 = r17
            r3 = r18
            r4 = r19
            r2 = r21
            r8 = r22
            r5 = r23
            r9 = r26
            r6 = r28
            r11 = r29
            sun.misc.Unsafe r12 = p221m9.C4491t0.f18229s
            int[] r7 = r0.f18230a
            int r13 = r6 + 2
            r7 = r7[r13]
            r13 = 1048575(0xfffff, float:1.469367E-39)
            r7 = r7 & r13
            long r13 = (long) r7
            r15 = 2
            r7 = 3
            switch(r25) {
                case 51: goto L166;
                case 52: goto L151;
                case 53: goto L141;
                case 54: goto L141;
                case 55: goto L134;
                case 56: goto L128;
                case 57: goto L11c;
                case 58: goto L106;
                case 59: goto Ld7;
                case 60: goto Lb3;
                case 61: goto La9;
                case 62: goto L134;
                case 63: goto L73;
                case 64: goto L11c;
                case 65: goto L128;
                case 66: goto L65;
                case 67: goto L57;
                case 68: goto L28;
                default: goto L26;
            }
        L26:
            goto L17e
        L28:
            if (r5 != r7) goto L17e
            r2 = r2 & (-8)
            r7 = r2 | 4
            m9.e1 r2 = r0.m10352o(r6)
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r7
            r7 = r29
            int r2 = p221m9.C4445e.m9961d(r2, r3, r4, r5, r6, r7)
            int r3 = r12.getInt(r1, r13)
            if (r3 != r8) goto L4a
            java.lang.Object r15 = r12.getObject(r1, r9)
            goto L4b
        L4a:
            r15 = 0
        L4b:
            java.lang.Object r3 = r11.f18124c
            if (r15 != 0) goto L51
            goto L14d
        L51:
            java.lang.Object r3 = p221m9.C4505z.m10387c(r15, r3)
            goto L14d
        L57:
            if (r5 != 0) goto L17e
            int r2 = p221m9.C4445e.m9979v(r3, r4, r11)
            long r3 = r11.f18123b
            long r3 = p221m9.AbstractC4457i.m10073c(r3)
            goto L149
        L65:
            if (r5 != 0) goto L17e
            int r2 = p221m9.C4445e.m9977t(r3, r4, r11)
            int r3 = r11.f18122a
            int r3 = p221m9.AbstractC4457i.m10072b(r3)
            goto L13c
        L73:
            if (r5 != 0) goto L17e
            int r3 = p221m9.C4445e.m9977t(r3, r4, r11)
            int r4 = r11.f18122a
            java.lang.Object[] r5 = r0.f18231b
            int r6 = r6 / r7
            int r6 = r6 * 2
            r7 = 1
            int r6 = r6 + r7
            r5 = r5[r6]
            m9.z$b r5 = (p221m9.C4505z.b) r5
            if (r5 == 0) goto L9c
            boolean r5 = r5.m10388a(r4)
            if (r5 == 0) goto L8f
            goto L9c
        L8f:
            m9.n1 r1 = m10328p(r17)
            long r4 = (long) r4
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r1.m10220c(r2, r4)
            goto La6
        L9c:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            r12.putObject(r1, r9, r2)
            r12.putInt(r1, r13, r8)
        La6:
            r2 = r3
            goto L17f
        La9:
            if (r5 != r15) goto L17e
            int r2 = p221m9.C4445e.m9958a(r3, r4, r11)
            java.lang.Object r3 = r11.f18124c
            goto L14d
        Lb3:
            if (r5 != r15) goto L17e
            m9.e1 r2 = r0.m10352o(r6)
            r5 = r20
            int r2 = p221m9.C4445e.m9962e(r2, r3, r4, r5, r11)
            int r3 = r12.getInt(r1, r13)
            if (r3 != r8) goto Lca
            java.lang.Object r15 = r12.getObject(r1, r9)
            goto Lcb
        Lca:
            r15 = 0
        Lcb:
            java.lang.Object r3 = r11.f18124c
            if (r15 != 0) goto Ld1
            goto L14d
        Ld1:
            java.lang.Object r3 = p221m9.C4505z.m10387c(r15, r3)
            goto L14d
        Ld7:
            if (r5 != r15) goto L17e
            int r2 = p221m9.C4445e.m9977t(r3, r4, r11)
            int r4 = r11.f18122a
            if (r4 != 0) goto Le5
            java.lang.String r3 = ""
            goto L14d
        Le5:
            r5 = 536870912(0x20000000, float:1.0842022E-19)
            r5 = r24 & r5
            if (r5 == 0) goto Lf9
            int r5 = r2 + r4
            boolean r5 = p221m9.C4486r1.m10285e(r3, r2, r5)
            if (r5 == 0) goto Lf4
            goto Lf9
        Lf4:
            m9.a0 r1 = p221m9.C4434a0.m9897c()
            throw r1
        Lf9:
            java.lang.String r5 = new java.lang.String
            java.nio.charset.Charset r6 = p221m9.C4505z.f18308a
            r5.<init>(r3, r2, r4, r6)
            r12.putObject(r1, r9, r5)
            int r2 = r2 + r4
            goto L17a
        L106:
            if (r5 != 0) goto L17e
            int r2 = p221m9.C4445e.m9979v(r3, r4, r11)
            long r3 = r11.f18123b
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L116
            r7 = 1
            goto L117
        L116:
            r7 = 0
        L117:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r7)
            goto L14d
        L11c:
            r2 = 5
            if (r5 != r2) goto L17e
            int r2 = p221m9.C4445e.m9959b(r18, r19)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L160
        L128:
            r2 = 1
            if (r5 != r2) goto L17e
            long r2 = p221m9.C4445e.m9960c(r18, r19)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            goto L175
        L134:
            if (r5 != 0) goto L17e
            int r2 = p221m9.C4445e.m9977t(r3, r4, r11)
            int r3 = r11.f18122a
        L13c:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L14d
        L141:
            if (r5 != 0) goto L17e
            int r2 = p221m9.C4445e.m9979v(r3, r4, r11)
            long r3 = r11.f18123b
        L149:
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
        L14d:
            r12.putObject(r1, r9, r3)
            goto L17a
        L151:
            r2 = 5
            if (r5 != r2) goto L17e
            int r2 = p221m9.C4445e.m9959b(r18, r19)
            float r2 = java.lang.Float.intBitsToFloat(r2)
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
        L160:
            r12.putObject(r1, r9, r2)
            int r2 = r4 + 4
            goto L17a
        L166:
            r2 = 1
            if (r5 != r2) goto L17e
            long r2 = p221m9.C4445e.m9960c(r18, r19)
            double r2 = java.lang.Double.longBitsToDouble(r2)
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
        L175:
            r12.putObject(r1, r9, r2)
            int r2 = r4 + 8
        L17a:
            r12.putInt(r1, r13, r8)
            goto L17f
        L17e:
            r2 = r4
        L17f:
            return r2
    }

    /* renamed from: J */
    public int m10333J(T r30, byte[] r31, int r32, int r33, int r34, p221m9.C4445e.a r35) {
            r29 = this;
            r15 = r29
            r14 = r30
            r12 = r31
            r13 = r33
            r11 = r35
            sun.misc.Unsafe r9 = p221m9.C4491t0.f18229s
            r16 = 0
            r0 = r32
            r1 = r34
            r2 = -1
            r3 = 0
            r4 = 0
            r7 = -1
            r8 = 0
        L17:
            if (r0 >= r13) goto L45e
            int r4 = r0 + 1
            r0 = r12[r0]
            if (r0 >= 0) goto L28
            int r0 = p221m9.C4445e.m9976s(r0, r12, r4, r11)
            int r4 = r11.f18122a
            r5 = r4
            r4 = r0
            goto L29
        L28:
            r5 = r0
        L29:
            int r0 = r5 >>> 3
            r10 = r5 & 7
            r6 = 3
            if (r0 <= r2) goto L41
            int r3 = r3 / r6
            int r2 = r15.f18232c
            if (r0 < r2) goto L3e
            int r2 = r15.f18233d
            if (r0 > r2) goto L3e
            int r2 = r15.m10343U(r0, r3)
            goto L45
        L3e:
            r2 = -1
            r3 = -1
            goto L47
        L41:
            int r2 = r15.m10336M(r0)
        L45:
            r3 = r2
            r2 = -1
        L47:
            if (r3 != r2) goto L55
            r17 = r0
            r6 = r1
            r2 = r4
            r27 = r9
            r15 = 0
            r19 = 0
            r9 = r5
            goto L3e5
        L55:
            int[] r1 = r15.f18230a
            int r2 = r3 + 1
            r2 = r1[r2]
            int r1 = m10327V(r2)
            r18 = r7
            long r6 = m10320B(r2)
            r20 = r5
            r5 = 17
            r21 = r2
            if (r1 > r5) goto L2db
            int[] r5 = r15.f18230a
            int r22 = r3 + 2
            r5 = r5[r22]
            int r22 = r5 >>> 20
            r2 = 1
            int r22 = r2 << r22
            r24 = 1048575(0xfffff, float:1.469367E-39)
            r5 = r5 & r24
            r2 = r18
            if (r5 == r2) goto L90
            r13 = -1
            if (r2 == r13) goto L88
            long r12 = (long) r2
            r9.putInt(r14, r12, r8)
        L88:
            long r12 = (long) r5
            int r8 = r9.getInt(r14, r12)
            r12 = r8
            r8 = r5
            goto L92
        L90:
            r12 = r8
            r8 = r2
        L92:
            r2 = 5
            switch(r1) {
                case 0: goto L2a6;
                case 1: goto L286;
                case 2: goto L24e;
                case 3: goto L24e;
                case 4: goto L231;
                case 5: goto L207;
                case 6: goto L1ec;
                case 7: goto L1c5;
                case 8: goto L1a2;
                case 9: goto L173;
                case 10: goto L151;
                case 11: goto L231;
                case 12: goto L11c;
                case 13: goto L1ec;
                case 14: goto L207;
                case 15: goto L107;
                case 16: goto Leb;
                case 17: goto La6;
                default: goto L96;
            }
        L96:
            r5 = r31
            r13 = r0
            r18 = r8
            r8 = r20
            r17 = -1
            r28 = r4
            r4 = r3
            r3 = r28
            goto L2cb
        La6:
            r1 = 3
            if (r10 != r1) goto Le1
            int r1 = r0 << 3
            r5 = r1 | 4
            m9.e1 r1 = r15.m10352o(r3)
            r13 = r0
            r0 = r1
            r1 = r31
            r2 = r4
            r10 = r3
            r3 = r33
            r4 = r5
            r18 = r8
            r8 = r20
            r5 = r35
            int r0 = p221m9.C4445e.m9961d(r0, r1, r2, r3, r4, r5)
            r1 = r12 & r22
            if (r1 != 0) goto Lcb
            java.lang.Object r1 = r11.f18124c
            goto Ld5
        Lcb:
            java.lang.Object r1 = r9.getObject(r14, r6)
            java.lang.Object r2 = r11.f18124c
            java.lang.Object r1 = p221m9.C4505z.m10387c(r1, r2)
        Ld5:
            r9.putObject(r14, r6, r1)
            r1 = r12 | r22
            r5 = r31
            r4 = r10
            r17 = -1
            goto L2c6
        Le1:
            r13 = r0
            r18 = r8
            r8 = r20
            r5 = r3
            r3 = r31
            goto L16b
        Leb:
            r13 = r0
            r5 = r3
            r18 = r8
            r8 = r20
            r3 = r31
            if (r10 != 0) goto L16b
            int r0 = p221m9.C4445e.m9979v(r3, r4, r11)
            long r1 = r11.f18123b
            long r1 = p221m9.AbstractC4457i.m10073c(r1)
            r10 = r0
            r19 = r1
            r4 = r3
            r17 = -1
            goto L264
        L107:
            r13 = r0
            r5 = r3
            r18 = r8
            r8 = r20
            r3 = r31
            if (r10 != 0) goto L16b
            int r0 = p221m9.C4445e.m9977t(r3, r4, r11)
            int r1 = r11.f18122a
            int r1 = p221m9.AbstractC4457i.m10072b(r1)
            goto L14c
        L11c:
            r13 = r0
            r5 = r3
            r18 = r8
            r8 = r20
            r3 = r31
            if (r10 != 0) goto L16b
            int r0 = p221m9.C4445e.m9977t(r3, r4, r11)
            int r1 = r11.f18122a
            m9.z$b r2 = r15.m10350m(r5)
            if (r2 == 0) goto L14c
            boolean r2 = r2.m10388a(r1)
            if (r2 == 0) goto L139
            goto L14c
        L139:
            m9.n1 r2 = m10328p(r30)
            long r6 = (long) r1
            java.lang.Long r1 = java.lang.Long.valueOf(r6)
            r2.m10220c(r8, r1)
            r4 = r5
            r1 = r12
            r17 = -1
            r5 = r3
            goto L2c6
        L14c:
            r4 = r3
            r17 = -1
            goto L244
        L151:
            r13 = r0
            r5 = r3
            r18 = r8
            r8 = r20
            r0 = 2
            r3 = r31
            if (r10 != r0) goto L16b
            int r0 = p221m9.C4445e.m9958a(r3, r4, r11)
            java.lang.Object r1 = r11.f18124c
            r9.putObject(r14, r6, r1)
            r4 = r5
            r17 = -1
            r5 = r3
            goto L2c4
        L16b:
            r17 = -1
            r28 = r5
            r5 = r3
            r3 = r4
            goto L283
        L173:
            r13 = r0
            r5 = r3
            r18 = r8
            r8 = r20
            r0 = 2
            r3 = r31
            if (r10 != r0) goto L19c
            m9.e1 r0 = r15.m10352o(r5)
            r1 = r33
            r17 = -1
            int r0 = p221m9.C4445e.m9962e(r0, r3, r4, r1, r11)
            r2 = r12 & r22
            if (r2 != 0) goto L191
        L18e:
            java.lang.Object r2 = r11.f18124c
            goto L1c1
        L191:
            java.lang.Object r2 = r9.getObject(r14, r6)
            java.lang.Object r4 = r11.f18124c
            java.lang.Object r2 = p221m9.C4505z.m10387c(r2, r4)
            goto L1c1
        L19c:
            r1 = r33
            r17 = -1
            goto L229
        L1a2:
            r1 = r33
            r13 = r0
            r5 = r3
            r18 = r8
            r8 = r20
            r0 = 2
            r17 = -1
            r3 = r31
            if (r10 != r0) goto L229
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r21 & r0
            if (r0 != 0) goto L1bc
            int r0 = p221m9.C4445e.m9973p(r3, r4, r11)
            goto L18e
        L1bc:
            int r0 = p221m9.C4445e.m9974q(r3, r4, r11)
            goto L18e
        L1c1:
            r9.putObject(r14, r6, r2)
            goto L201
        L1c5:
            r1 = r33
            r13 = r0
            r5 = r3
            r18 = r8
            r8 = r20
            r17 = -1
            r3 = r31
            if (r10 != 0) goto L229
            int r0 = p221m9.C4445e.m9979v(r3, r4, r11)
            r32 = r0
            long r0 = r11.f18123b
            r19 = 0
            int r2 = (r0 > r19 ? 1 : (r0 == r19 ? 0 : -1))
            if (r2 == 0) goto L1e3
            r2 = 1
            goto L1e4
        L1e3:
            r2 = 0
        L1e4:
            m9.q1$e r0 = p221m9.C4483q1.f18215f
            r0.mo10266k(r14, r6, r2)
            r0 = r32
            goto L201
        L1ec:
            r13 = r0
            r5 = r3
            r18 = r8
            r8 = r20
            r17 = -1
            r3 = r31
            if (r10 != r2) goto L229
            int r0 = p221m9.C4445e.m9959b(r3, r4)
            r9.putInt(r14, r6, r0)
            int r0 = r4 + 4
        L201:
            r1 = r12 | r22
            r6 = r3
            r7 = r5
            goto L273
        L207:
            r13 = r0
            r5 = r3
            r18 = r8
            r8 = r20
            r0 = 1
            r17 = -1
            r3 = r31
            if (r10 != r0) goto L229
            long r19 = p221m9.C4445e.m9960c(r3, r4)
            r0 = r9
            r1 = r30
            r10 = r3
            r2 = r6
            r7 = r4
            r6 = r5
            r4 = r19
            r0.putLong(r1, r2, r4)
            r4 = r6
            r3 = r7
            r5 = r10
            goto L2c2
        L229:
            r10 = r3
            r7 = r4
            r6 = r5
            r4 = r6
            r3 = r7
            r5 = r10
            goto L2cb
        L231:
            r13 = r0
            r5 = r3
            r3 = r4
            r18 = r8
            r8 = r20
            r17 = -1
            r4 = r31
            if (r10 != 0) goto L280
            int r0 = p221m9.C4445e.m9977t(r4, r3, r11)
            int r1 = r11.f18122a
        L244:
            r9.putInt(r14, r6, r1)
            r28 = r5
            r5 = r4
            r4 = r28
            goto L2c4
        L24e:
            r13 = r0
            r5 = r3
            r3 = r4
            r18 = r8
            r8 = r20
            r17 = -1
            r4 = r31
            if (r10 != 0) goto L280
            int r0 = p221m9.C4445e.m9979v(r4, r3, r11)
            long r1 = r11.f18123b
            r10 = r0
            r19 = r1
        L264:
            r0 = r9
            r1 = r30
            r2 = r6
            r6 = r4
            r7 = r5
            r4 = r19
            r0.putLong(r1, r2, r4)
            r0 = r12 | r22
            r1 = r0
            r0 = r10
        L273:
            r12 = r6
            r3 = r7
            r4 = r8
            r2 = r13
            r7 = r18
            r13 = r33
            r8 = r1
            r1 = r34
            goto L17
        L280:
            r28 = r5
            r5 = r4
        L283:
            r4 = r28
            goto L2cb
        L286:
            r5 = r31
            r13 = r0
            r18 = r8
            r8 = r20
            r17 = -1
            r28 = r4
            r4 = r3
            r3 = r28
            if (r10 != r2) goto L2cb
            int r0 = p221m9.C4445e.m9959b(r5, r3)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            m9.q1$e r1 = p221m9.C4483q1.f18215f
            r1.mo10269n(r14, r6, r0)
            int r0 = r3 + 4
            goto L2c4
        L2a6:
            r5 = r31
            r13 = r0
            r18 = r8
            r8 = r20
            r0 = 1
            r17 = -1
            r28 = r4
            r4 = r3
            r3 = r28
            if (r10 != r0) goto L2cb
            long r0 = p221m9.C4445e.m9960c(r5, r3)
            double r0 = java.lang.Double.longBitsToDouble(r0)
            p221m9.C4483q1.m10256t(r14, r6, r0)
        L2c2:
            int r0 = r3 + 8
        L2c4:
            r1 = r12 | r22
        L2c6:
            r12 = r1
            r19 = r4
            goto L323
        L2cb:
            r6 = r34
            r2 = r3
            r19 = r4
            r27 = r9
            r17 = r13
            r7 = r18
            r15 = 0
            r9 = r8
            r8 = r12
            goto L3e5
        L2db:
            r13 = r0
            r5 = r12
            r2 = r18
            r17 = -1
            r12 = r8
            r8 = r20
            r28 = r4
            r4 = r3
            r3 = r28
            r0 = 27
            if (r1 != r0) goto L33e
            r0 = 2
            if (r10 != r0) goto L32e
            java.lang.Object r0 = r9.getObject(r14, r6)
            m9.z$c r0 = (p221m9.C4505z.c) r0
            boolean r1 = r0.mo9908U()
            if (r1 != 0) goto L30e
            int r1 = r0.size()
            if (r1 != 0) goto L305
            r1 = 10
            goto L307
        L305:
            int r1 = r1 * 2
        L307:
            m9.z$c r0 = r0.mo9905B(r1)
            r9.putObject(r14, r6, r0)
        L30e:
            r6 = r0
            m9.e1 r0 = r15.m10352o(r4)
            r1 = r8
            r18 = r2
            r2 = r31
            r19 = r4
            r4 = r33
            r5 = r6
            r6 = r35
            int r0 = p221m9.C4445e.m9963f(r0, r1, r2, r3, r4, r5, r6)
        L323:
            r7 = r18
            r1 = r34
            r4 = r8
            r8 = r12
            r2 = r13
            r3 = r19
            goto L458
        L32e:
            r19 = r4
            r18 = r2
            r14 = r3
            r32 = r8
            r27 = r9
            r26 = r12
            r17 = r13
            r15 = 0
            goto L394
        L33e:
            r18 = r2
            r19 = r4
            r0 = 49
            if (r1 > r0) goto L37b
            r2 = r21
            long r4 = (long) r2
            r0 = r29
            r2 = r1
            r1 = r30
            r20 = r2
            r2 = r31
            r21 = r3
            r22 = r4
            r4 = r33
            r5 = r8
            r24 = r6
            r7 = 0
            r6 = r13
            r15 = r7
            r7 = r10
            r26 = r12
            r12 = r8
            r8 = r19
            r27 = r9
            r9 = r22
            r11 = r20
            r32 = r12
            r17 = r13
            r12 = r24
            r14 = r35
            int r0 = r0.m10335L(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            r14 = r21
            if (r0 == r14) goto L3dc
            goto L3c8
        L37b:
            r20 = r1
            r14 = r3
            r24 = r6
            r32 = r8
            r27 = r9
            r26 = r12
            r17 = r13
            r2 = r21
            r15 = 0
            r0 = 50
            r9 = r20
            if (r9 != r0) goto L3ad
            r0 = 2
            if (r10 == r0) goto L39a
        L394:
            r9 = r32
            r6 = r34
            r2 = r14
            goto L3e1
        L39a:
            r0 = r29
            r1 = r30
            r2 = r31
            r3 = r14
            r4 = r33
            r5 = r19
            r6 = r24
            r8 = r35
            r0.m10331H(r1, r2, r3, r4, r5, r6, r8)
            throw r15
        L3ad:
            r0 = r29
            r1 = r30
            r8 = r2
            r2 = r31
            r3 = r14
            r4 = r33
            r5 = r32
            r6 = r17
            r7 = r10
            r10 = r24
            r12 = r19
            r13 = r35
            int r0 = r0.m10332I(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 == r14) goto L3dc
        L3c8:
            r10 = r29
            r13 = r30
            r9 = r32
            r1 = r34
            r11 = r35
            r12 = r17
            r7 = r18
            r3 = r19
            r8 = r26
            goto L452
        L3dc:
            r9 = r32
            r6 = r34
            r2 = r0
        L3e1:
            r7 = r18
            r8 = r26
        L3e5:
            if (r9 != r6) goto L3f3
            if (r6 == 0) goto L3f3
            r10 = r29
            r13 = r30
            r0 = r2
            r1 = r6
            r4 = r9
            r3 = r15
            goto L467
        L3f3:
            r10 = r29
            r3 = r15
            boolean r0 = r10.f18235f
            if (r0 == 0) goto L43a
            r11 = r35
            m9.p r0 = r11.f18125d
            m9.p r1 = p221m9.C4478p.m10222a()
            if (r0 == r1) goto L437
            m9.q0 r0 = r10.f18234e
            m9.p r1 = r11.f18125d
            java.util.Map<m9.p$a, m9.x$e<?, ?>> r1 = r1.f18204a
            m9.p$a r4 = new m9.p$a
            r12 = r17
            r4.<init>(r0, r12)
            java.lang.Object r0 = r1.get(r4)
            m9.x$e r0 = (p221m9.AbstractC4501x.e) r0
            if (r0 != 0) goto L42b
            m9.n1 r4 = m10328p(r30)
            r0 = r9
            r1 = r31
            r3 = r33
            r5 = r35
            int r0 = p221m9.C4445e.m9975r(r0, r1, r2, r3, r4, r5)
            r13 = r30
            goto L44f
        L42b:
            r13 = r30
            r0 = r13
            m9.x$c r0 = (p221m9.AbstractC4501x.c) r0
            r0.m10380w()
            java.util.Objects.requireNonNull(r3)
            throw r3
        L437:
            r13 = r30
            goto L43e
        L43a:
            r13 = r30
            r11 = r35
        L43e:
            r12 = r17
            m9.n1 r4 = m10328p(r30)
            r0 = r9
            r1 = r31
            r3 = r33
            r5 = r35
            int r0 = p221m9.C4445e.m9975r(r0, r1, r2, r3, r4, r5)
        L44f:
            r1 = r6
            r3 = r19
        L452:
            r4 = r9
            r15 = r10
            r2 = r12
            r14 = r13
            r9 = r27
        L458:
            r12 = r31
            r13 = r33
            goto L17
        L45e:
            r18 = r7
            r26 = r8
            r27 = r9
            r13 = r14
            r10 = r15
            r3 = 0
        L467:
            r2 = -1
            if (r7 == r2) goto L470
            long r5 = (long) r7
            r2 = r27
            r2.putInt(r13, r5, r8)
        L470:
            int r2 = r10.f18240k
        L472:
            int r5 = r10.f18241l
            if (r2 >= r5) goto L482
            int[] r5 = r10.f18239j
            r5 = r5[r2]
            m9.m1<?, ?> r6 = r10.f18244o
            r10.m10349l(r13, r5, r3, r6)
            int r2 = r2 + 1
            goto L472
        L482:
            r2 = r33
            if (r1 != 0) goto L48e
            if (r0 != r2) goto L489
            goto L492
        L489:
            m9.a0 r0 = p221m9.C4434a0.m9901g()
            throw r0
        L48e:
            if (r0 > r2) goto L493
            if (r4 != r1) goto L493
        L492:
            return r0
        L493:
            m9.a0 r0 = p221m9.C4434a0.m9901g()
            throw r0
    }

    /* renamed from: K */
    public final int m10334K(T r30, byte[] r31, int r32, int r33, p221m9.C4445e.a r34) {
            r29 = this;
            sun.misc.Unsafe r6 = p221m9.C4491t0.f18229s
            r8 = -1
            r12 = r29
            r13 = r30
            r10 = r31
            r0 = r32
            r9 = r33
            r11 = r34
            r1 = -1
            r2 = 0
        L11:
            if (r0 >= r9) goto L20c
            int r3 = r0 + 1
            r0 = r10[r0]
            if (r0 >= 0) goto L1f
            int r3 = p221m9.C4445e.m9976s(r0, r10, r3, r11)
            int r0 = r11.f18122a
        L1f:
            r15 = r3
            int r14 = r0 >>> 3
            r3 = r0 & 7
            if (r14 <= r1) goto L37
            int r2 = r2 / 3
            int r1 = r12.f18232c
            if (r14 < r1) goto L35
            int r1 = r12.f18233d
            if (r14 > r1) goto L35
            int r1 = r12.m10343U(r14, r2)
            goto L3b
        L35:
            r4 = -1
            goto L3c
        L37:
            int r1 = r12.m10336M(r14)
        L3b:
            r4 = r1
        L3c:
            if (r4 != r8) goto L44
            r5 = r14
            r16 = r15
            r4 = 0
            goto L1ed
        L44:
            int[] r1 = r12.f18230a
            int r2 = r4 + 1
            r1 = r1[r2]
            int r2 = m10327V(r1)
            long r7 = m10320B(r1)
            r5 = 17
            r32 = r14
            r14 = 2
            if (r2 > r5) goto L142
            r5 = 1
            switch(r2) {
                case 0: goto L128;
                case 1: goto L114;
                case 2: goto L100;
                case 3: goto L100;
                case 4: goto Lf3;
                case 5: goto Le2;
                case 6: goto Ld2;
                case 7: goto Lbc;
                case 8: goto La7;
                case 9: goto L8d;
                case 10: goto L86;
                case 11: goto Lf3;
                case 12: goto L7e;
                case 13: goto Ld2;
                case 14: goto Le2;
                case 15: goto L6f;
                case 16: goto L5f;
                default: goto L5d;
            }
        L5d:
            goto L17e
        L5f:
            if (r3 != 0) goto L17e
            int r0 = p221m9.C4445e.m9979v(r10, r15, r11)
            long r1 = r11.f18123b
            long r1 = p221m9.AbstractC4457i.m10073c(r1)
            r15 = r0
            r14 = r4
            goto L10a
        L6f:
            if (r3 != 0) goto L83
            int r0 = p221m9.C4445e.m9977t(r10, r15, r11)
            int r1 = r11.f18122a
            int r1 = p221m9.AbstractC4457i.m10072b(r1)
            r14 = r4
            goto Lfc
        L7e:
            if (r3 != 0) goto L83
            r14 = r4
            goto Lf6
        L83:
            r14 = r4
            goto L13d
        L86:
            if (r3 != r14) goto L17e
            int r0 = p221m9.C4445e.m9958a(r10, r15, r11)
            goto L9d
        L8d:
            if (r3 != r14) goto L17e
            m9.e1 r0 = r12.m10352o(r4)
            int r0 = p221m9.C4445e.m9962e(r0, r10, r15, r9, r11)
            java.lang.Object r1 = r6.getObject(r13, r7)
            if (r1 != 0) goto La0
        L9d:
            java.lang.Object r1 = r11.f18124c
            goto Lb8
        La0:
            java.lang.Object r2 = r11.f18124c
            java.lang.Object r1 = p221m9.C4505z.m10387c(r1, r2)
            goto Lb8
        La7:
            if (r3 != r14) goto L17e
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r0 & r1
            if (r0 != 0) goto Lb3
            int r0 = p221m9.C4445e.m9973p(r10, r15, r11)
            goto L9d
        Lb3:
            int r0 = p221m9.C4445e.m9974q(r10, r15, r11)
            goto L9d
        Lb8:
            r6.putObject(r13, r7, r1)
            goto Lde
        Lbc:
            if (r3 != 0) goto L17e
            int r0 = p221m9.C4445e.m9979v(r10, r15, r11)
            long r1 = r11.f18123b
            r14 = 0
            int r3 = (r1 > r14 ? 1 : (r1 == r14 ? 0 : -1))
            if (r3 == 0) goto Lcb
            goto Lcc
        Lcb:
            r5 = 0
        Lcc:
            m9.q1$e r1 = p221m9.C4483q1.f18215f
            r1.mo10266k(r13, r7, r5)
            goto Lde
        Ld2:
            r1 = 5
            if (r3 != r1) goto L17e
            int r0 = p221m9.C4445e.m9959b(r10, r15)
            r6.putInt(r13, r7, r0)
            int r0 = r15 + 4
        Lde:
            r5 = r32
            goto L207
        Le2:
            if (r3 != r5) goto L17e
            long r16 = p221m9.C4445e.m9960c(r10, r15)
            r0 = r6
            r1 = r30
            r2 = r7
            r14 = r4
            r4 = r16
            r0.putLong(r1, r2, r4)
            goto L136
        Lf3:
            r14 = r4
            if (r3 != 0) goto L13d
        Lf6:
            int r0 = p221m9.C4445e.m9977t(r10, r15, r11)
            int r1 = r11.f18122a
        Lfc:
            r6.putInt(r13, r7, r1)
            goto L138
        L100:
            r14 = r4
            if (r3 != 0) goto L13d
            int r0 = p221m9.C4445e.m9979v(r10, r15, r11)
            long r1 = r11.f18123b
            r15 = r0
        L10a:
            r4 = r1
            r0 = r6
            r1 = r30
            r2 = r7
            r0.putLong(r1, r2, r4)
            r0 = r15
            goto L138
        L114:
            r14 = r4
            r1 = 5
            if (r3 != r1) goto L13d
            int r0 = p221m9.C4445e.m9959b(r10, r15)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            m9.q1$e r1 = p221m9.C4483q1.f18215f
            r1.mo10269n(r13, r7, r0)
            int r0 = r15 + 4
            goto L138
        L128:
            r14 = r4
            if (r3 != r5) goto L13d
            long r0 = p221m9.C4445e.m9960c(r10, r15)
            double r0 = java.lang.Double.longBitsToDouble(r0)
            p221m9.C4483q1.m10256t(r13, r7, r0)
        L136:
            int r0 = r15 + 8
        L138:
            r5 = r32
            r2 = r14
            goto L208
        L13d:
            r5 = r32
            r4 = r14
        L140:
            r1 = r15
            goto L181
        L142:
            r5 = 27
            if (r2 != r5) goto L183
            if (r3 != r14) goto L17e
            java.lang.Object r1 = r6.getObject(r13, r7)
            m9.z$c r1 = (p221m9.C4505z.c) r1
            boolean r2 = r1.mo9908U()
            if (r2 != 0) goto L166
            int r2 = r1.size()
            if (r2 != 0) goto L15d
            r2 = 10
            goto L15f
        L15d:
            int r2 = r2 * 2
        L15f:
            m9.z$c r1 = r1.mo9905B(r2)
            r6.putObject(r13, r7, r1)
        L166:
            r19 = r1
            m9.e1 r14 = r12.m10352o(r4)
            r5 = r32
            r1 = r15
            r15 = r0
            r16 = r31
            r17 = r1
            r18 = r33
            r20 = r34
            int r0 = p221m9.C4445e.m9963f(r14, r15, r16, r17, r18, r19, r20)
            goto L207
        L17e:
            r5 = r32
            goto L140
        L181:
            r9 = r1
            goto L1b2
        L183:
            r5 = r32
            r9 = r15
            r10 = 49
            if (r2 > r10) goto L1ac
            long r10 = (long) r1
            r14 = r29
            r15 = r30
            r16 = r31
            r17 = r9
            r18 = r33
            r19 = r0
            r20 = r5
            r21 = r3
            r22 = r4
            r23 = r10
            r25 = r2
            r26 = r7
            r28 = r34
            int r1 = r14.m10335L(r15, r16, r17, r18, r19, r20, r21, r22, r23, r25, r26, r28)
            if (r1 == r9) goto L1eb
            goto L1fc
        L1ac:
            r10 = 50
            if (r2 != r10) goto L1ca
            if (r3 == r14) goto L1b5
        L1b2:
            r16 = r9
            goto L1ed
        L1b5:
            r14 = r29
            r15 = r30
            r16 = r31
            r17 = r9
            r18 = r33
            r19 = r4
            r20 = r7
            r22 = r34
            r14.m10331H(r15, r16, r17, r18, r19, r20, r22)
            r0 = 0
            throw r0
        L1ca:
            r14 = r29
            r15 = r30
            r16 = r31
            r17 = r9
            r18 = r33
            r19 = r0
            r20 = r5
            r21 = r3
            r22 = r1
            r23 = r2
            r24 = r7
            r26 = r4
            r27 = r34
            int r1 = r14.m10332I(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r26, r27)
            if (r1 == r9) goto L1eb
            goto L1fc
        L1eb:
            r16 = r1
        L1ed:
            m9.n1 r18 = m10328p(r30)
            r14 = r0
            r15 = r31
            r17 = r33
            r19 = r34
            int r1 = p221m9.C4445e.m9975r(r14, r15, r16, r17, r18, r19)
        L1fc:
            r12 = r29
            r13 = r30
            r10 = r31
            r9 = r33
            r11 = r34
            r0 = r1
        L207:
            r2 = r4
        L208:
            r1 = r5
            r8 = -1
            goto L11
        L20c:
            if (r0 != r9) goto L20f
            return r0
        L20f:
            m9.a0 r0 = p221m9.C4434a0.m9901g()
            throw r0
    }

    /* renamed from: L */
    public final int m10335L(T r19, byte[] r20, int r21, int r22, int r23, int r24, int r25, int r26, long r27, int r29, long r30, p221m9.C4445e.a r32) {
            r18 = this;
            r0 = r18
            r1 = r19
            r3 = r20
            r4 = r21
            r5 = r22
            r2 = r23
            r6 = r25
            r8 = r26
            r9 = r30
            r7 = r32
            sun.misc.Unsafe r11 = p221m9.C4491t0.f18229s
            java.lang.Object r12 = r11.getObject(r1, r9)
            m9.z$c r12 = (p221m9.C4505z.c) r12
            boolean r13 = r12.mo9908U()
            r14 = 2
            if (r13 != 0) goto L35
            int r13 = r12.size()
            if (r13 != 0) goto L2c
            r13 = 10
            goto L2e
        L2c:
            int r13 = r13 * 2
        L2e:
            m9.z$c r12 = r12.mo9905B(r13)
            r11.putObject(r1, r9, r12)
        L35:
            r9 = 5
            r10 = 1
            r15 = 0
            r11 = 3
            switch(r29) {
                case 18: goto L302;
                case 19: goto L2da;
                case 20: goto L2ba;
                case 21: goto L2ba;
                case 22: goto L2a0;
                case 23: goto L27a;
                case 24: goto L254;
                case 25: goto L221;
                case 26: goto L169;
                case 27: goto L14f;
                case 28: goto L102;
                case 29: goto L2a0;
                case 30: goto Lc5;
                case 31: goto L254;
                case 32: goto L27a;
                case 33: goto La0;
                case 34: goto L7b;
                case 35: goto L302;
                case 36: goto L2da;
                case 37: goto L2ba;
                case 38: goto L2ba;
                case 39: goto L2a0;
                case 40: goto L27a;
                case 41: goto L254;
                case 42: goto L221;
                case 43: goto L2a0;
                case 44: goto Lc5;
                case 45: goto L254;
                case 46: goto L27a;
                case 47: goto La0;
                case 48: goto L7b;
                case 49: goto L3f;
                default: goto L3d;
            }
        L3d:
            goto L32a
        L3f:
            if (r6 != r11) goto L32a
            m9.e1 r1 = r0.m10352o(r8)
            r6 = r2 & (-8)
            r6 = r6 | 4
            r24 = r1
            r25 = r20
            r26 = r21
            r27 = r22
            r28 = r6
            r29 = r32
            int r4 = p221m9.C4445e.m9961d(r24, r25, r26, r27, r28, r29)
        L59:
            java.lang.Object r8 = r7.f18124c
            r12.add(r8)
            if (r4 >= r5) goto L32a
            int r8 = p221m9.C4445e.m9977t(r3, r4, r7)
            int r9 = r7.f18122a
            if (r2 == r9) goto L6a
            goto L32a
        L6a:
            r24 = r1
            r25 = r20
            r26 = r8
            r27 = r22
            r28 = r6
            r29 = r32
            int r4 = p221m9.C4445e.m9961d(r24, r25, r26, r27, r28, r29)
            goto L59
        L7b:
            if (r6 != r14) goto L83
            int r1 = p221m9.C4445e.m9970m(r3, r4, r12, r7)
            goto L32b
        L83:
            if (r6 != 0) goto L32a
            m9.h0 r12 = (p221m9.C4455h0) r12
        L87:
            int r1 = p221m9.C4445e.m9979v(r3, r4, r7)
            long r8 = r7.f18123b
            long r8 = p221m9.AbstractC4457i.m10073c(r8)
            r12.m10067e(r8)
            if (r1 >= r5) goto L32b
            int r4 = p221m9.C4445e.m9977t(r3, r1, r7)
            int r6 = r7.f18122a
            if (r2 == r6) goto L87
            goto L32b
        La0:
            if (r6 != r14) goto La8
            int r1 = p221m9.C4445e.m9969l(r3, r4, r12, r7)
            goto L32b
        La8:
            if (r6 != 0) goto L32a
            m9.y r12 = (p221m9.C4503y) r12
        Lac:
            int r1 = p221m9.C4445e.m9977t(r3, r4, r7)
            int r4 = r7.f18122a
            int r4 = p221m9.AbstractC4457i.m10072b(r4)
            r12.m10381e(r4)
            if (r1 >= r5) goto L32b
            int r4 = p221m9.C4445e.m9977t(r3, r1, r7)
            int r6 = r7.f18122a
            if (r2 == r6) goto Lac
            goto L32b
        Lc5:
            if (r6 != r14) goto Lcc
            int r2 = p221m9.C4445e.m9971n(r3, r4, r12, r7)
            goto Ldd
        Lcc:
            if (r6 != 0) goto L32a
            r2 = r23
            r3 = r20
            r4 = r21
            r5 = r22
            r6 = r12
            r7 = r32
            int r2 = p221m9.C4445e.m9978u(r2, r3, r4, r5, r6, r7)
        Ldd:
            m9.x r1 = (p221m9.AbstractC4501x) r1
            m9.n1 r3 = r1.unknownFields
            m9.n1 r4 = p221m9.C4474n1.f18195f
            if (r3 != r4) goto Le6
            r3 = 0
        Le6:
            java.lang.Object[] r4 = r0.f18231b
            int r5 = r8 / 3
            int r5 = r5 * 2
            int r5 = r5 + r10
            r4 = r4[r5]
            m9.z$b r4 = (p221m9.C4505z.b) r4
            m9.m1<?, ?> r5 = r0.f18244o
            r6 = r24
            java.lang.Object r3 = p221m9.C4453g1.m10050y(r6, r12, r4, r3, r5)
            m9.n1 r3 = (p221m9.C4474n1) r3
            if (r3 == 0) goto Lff
            r1.unknownFields = r3
        Lff:
            r1 = r2
            goto L32b
        L102:
            if (r6 != r14) goto L32a
            int r1 = p221m9.C4445e.m9977t(r3, r4, r7)
            int r4 = r7.f18122a
            if (r4 < 0) goto L14a
            int r6 = r3.length
            int r6 = r6 - r1
            if (r4 > r6) goto L145
            if (r4 != 0) goto L113
            goto L135
        L113:
            m9.h r6 = p221m9.AbstractC4454h.m10054i(r3, r1, r4)
            r12.add(r6)
            int r1 = r1 + r4
        L11b:
            if (r1 >= r5) goto L32b
            int r4 = p221m9.C4445e.m9977t(r3, r1, r7)
            int r6 = r7.f18122a
            if (r2 == r6) goto L127
            goto L32b
        L127:
            int r1 = p221m9.C4445e.m9977t(r3, r4, r7)
            int r4 = r7.f18122a
            if (r4 < 0) goto L140
            int r6 = r3.length
            int r6 = r6 - r1
            if (r4 > r6) goto L13b
            if (r4 != 0) goto L113
        L135:
            m9.h r4 = p221m9.AbstractC4454h.f18139Z
            r12.add(r4)
            goto L11b
        L13b:
            m9.a0 r1 = p221m9.C4434a0.m9902h()
            throw r1
        L140:
            m9.a0 r1 = p221m9.C4434a0.m9900f()
            throw r1
        L145:
            m9.a0 r1 = p221m9.C4434a0.m9902h()
            throw r1
        L14a:
            m9.a0 r1 = p221m9.C4434a0.m9900f()
            throw r1
        L14f:
            if (r6 != r14) goto L32a
            m9.e1 r1 = r0.m10352o(r8)
            r24 = r1
            r25 = r23
            r26 = r20
            r27 = r21
            r28 = r22
            r29 = r12
            r30 = r32
            int r1 = p221m9.C4445e.m9963f(r24, r25, r26, r27, r28, r29, r30)
            goto L32b
        L169:
            if (r6 != r14) goto L32a
            r8 = 536870912(0x20000000, double:2.65249474E-315)
            long r8 = r27 & r8
            java.lang.String r1 = ""
            int r6 = (r8 > r15 ? 1 : (r8 == r15 ? 0 : -1))
            if (r6 != 0) goto L1b8
            int r4 = p221m9.C4445e.m9977t(r3, r4, r7)
            int r6 = r7.f18122a
            if (r6 < 0) goto L1b3
            if (r6 != 0) goto L181
            goto L1a2
        L181:
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = p221m9.C4505z.f18308a
            r8.<init>(r3, r4, r6, r9)
        L188:
            r12.add(r8)
            int r4 = r4 + r6
        L18c:
            if (r4 >= r5) goto L32a
            int r6 = p221m9.C4445e.m9977t(r3, r4, r7)
            int r8 = r7.f18122a
            if (r2 == r8) goto L198
            goto L32a
        L198:
            int r4 = p221m9.C4445e.m9977t(r3, r6, r7)
            int r6 = r7.f18122a
            if (r6 < 0) goto L1ae
            if (r6 != 0) goto L1a6
        L1a2:
            r12.add(r1)
            goto L18c
        L1a6:
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = p221m9.C4505z.f18308a
            r8.<init>(r3, r4, r6, r9)
            goto L188
        L1ae:
            m9.a0 r1 = p221m9.C4434a0.m9900f()
            throw r1
        L1b3:
            m9.a0 r1 = p221m9.C4434a0.m9900f()
            throw r1
        L1b8:
            int r4 = p221m9.C4445e.m9977t(r3, r4, r7)
            int r6 = r7.f18122a
            if (r6 < 0) goto L21c
            if (r6 != 0) goto L1ca
            r17 = r2
            r2 = r1
            r1 = r4
            r4 = r3
            r3 = r17
            goto L1f6
        L1ca:
            int r8 = r4 + r6
            boolean r9 = p221m9.C4486r1.m10285e(r3, r4, r8)
            if (r9 == 0) goto L217
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = p221m9.C4505z.f18308a
            r9.<init>(r3, r4, r6, r10)
        L1d9:
            r12.add(r9)
            r4 = r3
            r3 = r2
            r2 = r1
            r1 = r8
        L1e0:
            if (r1 >= r5) goto L32b
            int r6 = p221m9.C4445e.m9977t(r4, r1, r7)
            int r8 = r7.f18122a
            if (r3 == r8) goto L1ec
            goto L32b
        L1ec:
            int r1 = p221m9.C4445e.m9977t(r4, r6, r7)
            int r6 = r7.f18122a
            if (r6 < 0) goto L212
            if (r6 != 0) goto L1fa
        L1f6:
            r12.add(r2)
            goto L1e0
        L1fa:
            int r8 = r1 + r6
            boolean r9 = p221m9.C4486r1.m10285e(r4, r1, r8)
            if (r9 == 0) goto L20d
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = p221m9.C4505z.f18308a
            r9.<init>(r4, r1, r6, r10)
            r1 = r2
            r2 = r3
            r3 = r4
            goto L1d9
        L20d:
            m9.a0 r1 = p221m9.C4434a0.m9897c()
            throw r1
        L212:
            m9.a0 r1 = p221m9.C4434a0.m9900f()
            throw r1
        L217:
            m9.a0 r1 = p221m9.C4434a0.m9897c()
            throw r1
        L21c:
            m9.a0 r1 = p221m9.C4434a0.m9900f()
            throw r1
        L221:
            if (r6 != r14) goto L229
            int r1 = p221m9.C4445e.m9964g(r3, r4, r12, r7)
            goto L32b
        L229:
            if (r6 != 0) goto L32a
            m9.f r12 = (p221m9.C4448f) r12
            int r1 = p221m9.C4445e.m9979v(r3, r4, r7)
            long r8 = r7.f18123b
            int r4 = (r8 > r15 ? 1 : (r8 == r15 ? 0 : -1))
            if (r4 == 0) goto L238
            goto L252
        L238:
            r4 = 0
        L239:
            r12.m9996e(r4)
            if (r1 >= r5) goto L32b
            int r4 = p221m9.C4445e.m9977t(r3, r1, r7)
            int r6 = r7.f18122a
            if (r2 == r6) goto L248
            goto L32b
        L248:
            int r1 = p221m9.C4445e.m9979v(r3, r4, r7)
            long r8 = r7.f18123b
            int r4 = (r8 > r15 ? 1 : (r8 == r15 ? 0 : -1))
            if (r4 == 0) goto L238
        L252:
            r4 = 1
            goto L239
        L254:
            if (r6 != r14) goto L25c
            int r1 = p221m9.C4445e.m9966i(r3, r4, r12, r7)
            goto L32b
        L25c:
            if (r6 != r9) goto L32a
            m9.y r12 = (p221m9.C4503y) r12
            int r1 = p221m9.C4445e.m9959b(r20, r21)
        L264:
            r12.m10381e(r1)
            int r1 = r4 + 4
            if (r1 >= r5) goto L32b
            int r4 = p221m9.C4445e.m9977t(r3, r1, r7)
            int r6 = r7.f18122a
            if (r2 == r6) goto L275
            goto L32b
        L275:
            int r1 = p221m9.C4445e.m9959b(r3, r4)
            goto L264
        L27a:
            if (r6 != r14) goto L282
            int r1 = p221m9.C4445e.m9967j(r3, r4, r12, r7)
            goto L32b
        L282:
            if (r6 != r10) goto L32a
            m9.h0 r12 = (p221m9.C4455h0) r12
            long r8 = p221m9.C4445e.m9960c(r20, r21)
        L28a:
            r12.m10067e(r8)
            int r1 = r4 + 8
            if (r1 >= r5) goto L32b
            int r4 = p221m9.C4445e.m9977t(r3, r1, r7)
            int r6 = r7.f18122a
            if (r2 == r6) goto L29b
            goto L32b
        L29b:
            long r8 = p221m9.C4445e.m9960c(r3, r4)
            goto L28a
        L2a0:
            if (r6 != r14) goto L2a8
            int r1 = p221m9.C4445e.m9971n(r3, r4, r12, r7)
            goto L32b
        L2a8:
            if (r6 != 0) goto L32a
            r24 = r20
            r25 = r21
            r26 = r22
            r27 = r12
            r28 = r32
            int r1 = p221m9.C4445e.m9978u(r23, r24, r25, r26, r27, r28)
            goto L32b
        L2ba:
            if (r6 != r14) goto L2c2
            int r1 = p221m9.C4445e.m9972o(r3, r4, r12, r7)
            goto L32b
        L2c2:
            if (r6 != 0) goto L32a
            m9.h0 r12 = (p221m9.C4455h0) r12
        L2c6:
            int r1 = p221m9.C4445e.m9979v(r3, r4, r7)
            long r8 = r7.f18123b
            r12.m10067e(r8)
            if (r1 >= r5) goto L32b
            int r4 = p221m9.C4445e.m9977t(r3, r1, r7)
            int r6 = r7.f18122a
            if (r2 == r6) goto L2c6
            goto L32b
        L2da:
            if (r6 != r14) goto L2e1
            int r1 = p221m9.C4445e.m9968k(r3, r4, r12, r7)
            goto L32b
        L2e1:
            if (r6 != r9) goto L32a
            m9.v r12 = (p221m9.C4496v) r12
            int r1 = p221m9.C4445e.m9959b(r20, r21)
        L2e9:
            float r1 = java.lang.Float.intBitsToFloat(r1)
            r12.m10362e(r1)
            int r1 = r4 + 4
            if (r1 >= r5) goto L32b
            int r4 = p221m9.C4445e.m9977t(r3, r1, r7)
            int r6 = r7.f18122a
            if (r2 == r6) goto L2fd
            goto L32b
        L2fd:
            int r1 = p221m9.C4445e.m9959b(r3, r4)
            goto L2e9
        L302:
            if (r6 != r14) goto L309
            int r1 = p221m9.C4445e.m9965h(r3, r4, r12, r7)
            goto L32b
        L309:
            if (r6 != r10) goto L32a
            m9.m r12 = (p221m9.C4469m) r12
            long r8 = p221m9.C4445e.m9960c(r20, r21)
        L311:
            double r8 = java.lang.Double.longBitsToDouble(r8)
            r12.m10195e(r8)
            int r1 = r4 + 8
            if (r1 >= r5) goto L32b
            int r4 = p221m9.C4445e.m9977t(r3, r1, r7)
            int r6 = r7.f18122a
            if (r2 == r6) goto L325
            goto L32b
        L325:
            long r8 = p221m9.C4445e.m9960c(r3, r4)
            goto L311
        L32a:
            r1 = r4
        L32b:
            return r1
    }

    /* renamed from: M */
    public final int m10336M(int r2) {
            r1 = this;
            int r0 = r1.f18232c
            if (r2 < r0) goto Le
            int r0 = r1.f18233d
            if (r2 > r0) goto Le
            r0 = 0
            int r2 = r1.m10343U(r2, r0)
            return r2
        Le:
            r2 = -1
            return r2
    }

    /* renamed from: N */
    public final <E> void m10337N(java.lang.Object r2, long r3, p221m9.InterfaceC4444d1 r5, p221m9.InterfaceC4447e1<E> r6, p221m9.C4478p r7) {
            r1 = this;
            m9.g0 r0 = r1.f18243n
            java.util.List r2 = r0.mo10002c(r2, r3)
            r5.mo9946o(r2, r6, r7)
            return
    }

    /* renamed from: O */
    public final <E> void m10338O(java.lang.Object r3, int r4, p221m9.InterfaceC4444d1 r5, p221m9.InterfaceC4447e1<E> r6, p221m9.C4478p r7) {
            r2 = this;
            long r0 = m10320B(r4)
            m9.g0 r4 = r2.f18243n
            java.util.List r3 = r4.mo10002c(r3, r0)
            r5.mo9932a(r3, r6, r7)
            return
    }

    /* renamed from: P */
    public final void m10339P(java.lang.Object r3, int r4, p221m9.InterfaceC4444d1 r5) {
            r2 = this;
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r0 & r4
            if (r0 == 0) goto L7
            r0 = 1
            goto L8
        L7:
            r0 = 0
        L8:
            if (r0 == 0) goto L13
            long r0 = m10320B(r4)
            java.lang.String r4 = r5.mo9928K()
            goto L28
        L13:
            boolean r0 = r2.f18236g
            if (r0 == 0) goto L20
            long r0 = m10320B(r4)
            java.lang.String r4 = r5.mo9945n()
            goto L28
        L20:
            long r0 = m10320B(r4)
            m9.h r4 = r5.mo9954w()
        L28:
            m9.q1$e r5 = p221m9.C4483q1.f18215f
            r5.m10278q(r3, r0, r4)
            return
    }

    /* renamed from: Q */
    public final void m10340Q(java.lang.Object r4, int r5, p221m9.InterfaceC4444d1 r6) {
            r3 = this;
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r0 & r5
            if (r0 == 0) goto L7
            r0 = 1
            goto L8
        L7:
            r0 = 0
        L8:
            if (r0 == 0) goto L18
            m9.g0 r0 = r3.f18243n
            long r1 = m10320B(r5)
            java.util.List r4 = r0.mo10002c(r4, r1)
            r6.mo9953v(r4)
            goto L25
        L18:
            m9.g0 r0 = r3.f18243n
            long r1 = m10320B(r5)
            java.util.List r4 = r0.mo10002c(r4, r1)
            r6.mo9950s(r4)
        L25:
            return
    }

    /* renamed from: S */
    public final void m10341S(T r4, int r5) {
            r3 = this;
            boolean r0 = r3.f18237h
            if (r0 == 0) goto L5
            return
        L5:
            int[] r0 = r3.f18230a
            int r5 = r5 + 2
            r5 = r0[r5]
            r0 = 1
            int r1 = r5 >>> 20
            int r0 = r0 << r1
            r1 = 1048575(0xfffff, float:1.469367E-39)
            r5 = r5 & r1
            long r1 = (long) r5
            int r5 = p221m9.C4483q1.m10248l(r4, r1)
            r5 = r5 | r0
            m9.q1$e r0 = p221m9.C4483q1.f18215f
            r0.m10276o(r4, r1, r5)
            return
    }

    /* renamed from: T */
    public final void m10342T(T r3, int r4, int r5) {
            r2 = this;
            int[] r0 = r2.f18230a
            int r5 = r5 + 2
            r5 = r0[r5]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r5 = r5 & r0
            long r0 = (long) r5
            m9.q1$e r5 = p221m9.C4483q1.f18215f
            r5.m10276o(r3, r0, r4)
            return
    }

    /* renamed from: U */
    public final int m10343U(int r5, int r6) {
            r4 = this;
            int[] r0 = r4.f18230a
            int r0 = r0.length
            int r0 = r0 / 3
            int r0 = r0 + (-1)
        L7:
            if (r6 > r0) goto L20
            int r1 = r0 + r6
            int r1 = r1 >>> 1
            int r2 = r1 * 3
            int[] r3 = r4.f18230a
            r3 = r3[r2]
            if (r5 != r3) goto L16
            return r2
        L16:
            if (r5 >= r3) goto L1c
            int r1 = r1 + (-1)
            r0 = r1
            goto L7
        L1c:
            int r1 = r1 + 1
            r6 = r1
            goto L7
        L20:
            r5 = -1
            return r5
    }

    /* renamed from: W */
    public final int m10344W(int r2) {
            r1 = this;
            int[] r0 = r1.f18230a
            int r2 = r2 + 1
            r2 = r0[r2]
            return r2
    }

    /* renamed from: X */
    public final void m10345X(T r18, p221m9.InterfaceC4498v1 r19) {
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            boolean r3 = r0.f18235f
            if (r3 == 0) goto L21
            m9.q<?> r3 = r0.f18245p
            m9.t r3 = r3.mo10225c(r1)
            boolean r5 = r3.m10306h()
            if (r5 != 0) goto L21
            java.util.Iterator r3 = r3.m10308k()
            java.lang.Object r5 = r3.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            goto L23
        L21:
            r3 = 0
            r5 = 0
        L23:
            r6 = -1
            int[] r7 = r0.f18230a
            int r7 = r7.length
            sun.misc.Unsafe r8 = p221m9.C4491t0.f18229s
            r10 = 0
            r11 = 0
        L2b:
            if (r10 >= r7) goto L530
            int r12 = r0.m10344W(r10)
            int[] r13 = r0.f18230a
            r13 = r13[r10]
            int r14 = m10327V(r12)
            boolean r15 = r0.f18237h
            if (r15 != 0) goto L5e
            r15 = 17
            if (r14 > r15) goto L5e
            int[] r15 = r0.f18230a
            int r16 = r10 + 2
            r15 = r15[r16]
            r16 = 1048575(0xfffff, float:1.469367E-39)
            r9 = r15 & r16
            r16 = r5
            if (r9 == r6) goto L56
            long r4 = (long) r9
            int r11 = r8.getInt(r1, r4)
            r6 = r9
        L56:
            int r4 = r15 >>> 20
            r5 = 1
            int r4 = r5 << r4
            r5 = r16
            goto L63
        L5e:
            r16 = r5
            r5 = r16
            r4 = 0
        L63:
            if (r5 == 0) goto L81
            m9.q<?> r9 = r0.f18245p
            int r9 = r9.mo10223a(r5)
            if (r9 > r13) goto L81
            m9.q<?> r9 = r0.f18245p
            r9.mo10232j(r2, r5)
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L7f
            java.lang.Object r5 = r3.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            goto L63
        L7f:
            r5 = 0
            goto L63
        L81:
            r15 = r5
            r9 = r6
            long r5 = m10320B(r12)
            switch(r14) {
                case 0: goto L51c;
                case 1: goto L50d;
                case 2: goto L4fc;
                case 3: goto L4eb;
                case 4: goto L4da;
                case 5: goto L4c9;
                case 6: goto L4b8;
                case 7: goto L4a6;
                case 8: goto L499;
                case 9: goto L485;
                case 10: goto L471;
                case 11: goto L45f;
                case 12: goto L44d;
                case 13: goto L43b;
                case 14: goto L429;
                case 15: goto L419;
                case 16: goto L409;
                case 17: goto L3f5;
                case 18: goto L3e5;
                case 19: goto L3d5;
                case 20: goto L3c5;
                case 21: goto L3b5;
                case 22: goto L3a5;
                case 23: goto L395;
                case 24: goto L385;
                case 25: goto L375;
                case 26: goto L366;
                case 27: goto L353;
                case 28: goto L344;
                case 29: goto L334;
                case 30: goto L324;
                case 31: goto L314;
                case 32: goto L304;
                case 33: goto L2f4;
                case 34: goto L2e4;
                case 35: goto L2d4;
                case 36: goto L2c4;
                case 37: goto L2b4;
                case 38: goto L2a4;
                case 39: goto L294;
                case 40: goto L284;
                case 41: goto L274;
                case 42: goto L264;
                case 43: goto L254;
                case 44: goto L244;
                case 45: goto L234;
                case 46: goto L224;
                case 47: goto L214;
                case 48: goto L204;
                case 49: goto L1f1;
                case 50: goto L1e8;
                case 51: goto L1d6;
                case 52: goto L1c4;
                case 53: goto L1b0;
                case 54: goto L19c;
                case 55: goto L188;
                case 56: goto L174;
                case 57: goto L160;
                case 58: goto L14c;
                case 59: goto L13d;
                case 60: goto L127;
                case 61: goto L111;
                case 62: goto Lfd;
                case 63: goto Lea;
                case 64: goto Ld7;
                case 65: goto Lc4;
                case 66: goto Lb3;
                case 67: goto La2;
                case 68: goto L8d;
                default: goto L8a;
            }
        L8a:
            r12 = 0
            goto L52a
        L8d:
            boolean r4 = r0.m10357u(r1, r13, r10)
            if (r4 == 0) goto L8a
            java.lang.Object r4 = r8.getObject(r1, r5)
            m9.e1 r5 = r0.m10352o(r10)
            r6 = r2
            m9.l r6 = (p221m9.C4466l) r6
            r6.m10182c(r13, r4, r5)
            goto L8a
        La2:
            boolean r4 = r0.m10357u(r1, r13, r10)
            if (r4 == 0) goto L8a
            long r4 = m10325G(r1, r5)
            r6 = r2
            m9.l r6 = (p221m9.C4466l) r6
            r6.m10186g(r13, r4)
            goto L8a
        Lb3:
            boolean r4 = r0.m10357u(r1, r13, r10)
            if (r4 == 0) goto L8a
            int r4 = m10324F(r1, r5)
            r5 = r2
            m9.l r5 = (p221m9.C4466l) r5
            r5.m10185f(r13, r4)
            goto L8a
        Lc4:
            boolean r4 = r0.m10357u(r1, r13, r10)
            if (r4 == 0) goto L8a
            long r4 = m10325G(r1, r5)
            r6 = r2
            m9.l r6 = (p221m9.C4466l) r6
            m9.k r6 = r6.f18190a
            r6.mo10161S(r13, r4)
            goto L8a
        Ld7:
            boolean r4 = r0.m10357u(r1, r13, r10)
            if (r4 == 0) goto L8a
            int r4 = m10324F(r1, r5)
            r5 = r2
            m9.l r5 = (p221m9.C4466l) r5
            m9.k r5 = r5.f18190a
            r5.mo10159Q(r13, r4)
            goto L8a
        Lea:
            boolean r4 = r0.m10357u(r1, r13, r10)
            if (r4 == 0) goto L8a
            int r4 = m10324F(r1, r5)
            r5 = r2
            m9.l r5 = (p221m9.C4466l) r5
            m9.k r5 = r5.f18190a
            r5.mo10163U(r13, r4)
            goto L8a
        Lfd:
            boolean r4 = r0.m10357u(r1, r13, r10)
            if (r4 == 0) goto L8a
            int r4 = m10324F(r1, r5)
            r5 = r2
            m9.l r5 = (p221m9.C4466l) r5
            m9.k r5 = r5.f18190a
            r5.mo10170b0(r13, r4)
            goto L8a
        L111:
            boolean r4 = r0.m10357u(r1, r13, r10)
            if (r4 == 0) goto L8a
            java.lang.Object r4 = r8.getObject(r1, r5)
            m9.h r4 = (p221m9.AbstractC4454h) r4
            r5 = r2
            m9.l r5 = (p221m9.C4466l) r5
            m9.k r5 = r5.f18190a
            r5.mo10158P(r13, r4)
            goto L8a
        L127:
            boolean r4 = r0.m10357u(r1, r13, r10)
            if (r4 == 0) goto L8a
            java.lang.Object r4 = r8.getObject(r1, r5)
            m9.e1 r5 = r0.m10352o(r10)
            r6 = r2
            m9.l r6 = (p221m9.C4466l) r6
            r6.m10183d(r13, r4, r5)
            goto L8a
        L13d:
            boolean r4 = r0.m10357u(r1, r13, r10)
            if (r4 == 0) goto L8a
            java.lang.Object r4 = r8.getObject(r1, r5)
            r0.m10347Z(r13, r4, r2)
            goto L8a
        L14c:
            boolean r4 = r0.m10357u(r1, r13, r10)
            if (r4 == 0) goto L8a
            boolean r4 = m10321C(r1, r5)
            r5 = r2
            m9.l r5 = (p221m9.C4466l) r5
            m9.k r5 = r5.f18190a
            r5.mo10157O(r13, r4)
            goto L8a
        L160:
            boolean r4 = r0.m10357u(r1, r13, r10)
            if (r4 == 0) goto L8a
            int r4 = m10324F(r1, r5)
            r5 = r2
            m9.l r5 = (p221m9.C4466l) r5
            m9.k r5 = r5.f18190a
            r5.mo10159Q(r13, r4)
            goto L8a
        L174:
            boolean r4 = r0.m10357u(r1, r13, r10)
            if (r4 == 0) goto L8a
            long r4 = m10325G(r1, r5)
            r6 = r2
            m9.l r6 = (p221m9.C4466l) r6
            m9.k r6 = r6.f18190a
            r6.mo10161S(r13, r4)
            goto L8a
        L188:
            boolean r4 = r0.m10357u(r1, r13, r10)
            if (r4 == 0) goto L8a
            int r4 = m10324F(r1, r5)
            r5 = r2
            m9.l r5 = (p221m9.C4466l) r5
            m9.k r5 = r5.f18190a
            r5.mo10163U(r13, r4)
            goto L8a
        L19c:
            boolean r4 = r0.m10357u(r1, r13, r10)
            if (r4 == 0) goto L8a
            long r4 = m10325G(r1, r5)
            r6 = r2
            m9.l r6 = (p221m9.C4466l) r6
            m9.k r6 = r6.f18190a
            r6.mo10172d0(r13, r4)
            goto L8a
        L1b0:
            boolean r4 = r0.m10357u(r1, r13, r10)
            if (r4 == 0) goto L8a
            long r4 = m10325G(r1, r5)
            r6 = r2
            m9.l r6 = (p221m9.C4466l) r6
            m9.k r6 = r6.f18190a
            r6.mo10172d0(r13, r4)
            goto L8a
        L1c4:
            boolean r4 = r0.m10357u(r1, r13, r10)
            if (r4 == 0) goto L8a
            float r4 = m10323E(r1, r5)
            r5 = r2
            m9.l r5 = (p221m9.C4466l) r5
            r5.m10181b(r13, r4)
            goto L8a
        L1d6:
            boolean r4 = r0.m10357u(r1, r13, r10)
            if (r4 == 0) goto L8a
            double r4 = m10322D(r1, r5)
            r6 = r2
            m9.l r6 = (p221m9.C4466l) r6
            r6.m10180a(r13, r4)
            goto L8a
        L1e8:
            java.lang.Object r4 = r8.getObject(r1, r5)
            r0.m10346Y(r2, r13, r4, r10)
            goto L8a
        L1f1:
            int[] r4 = r0.f18230a
            r4 = r4[r10]
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            m9.e1 r6 = r0.m10352o(r10)
            p221m9.C4453g1.m10015K(r4, r5, r2, r6)
            goto L8a
        L204:
            int[] r4 = r0.f18230a
            r4 = r4[r10]
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            r12 = 1
            p221m9.C4453g1.m10022R(r4, r5, r2, r12)
            goto L8a
        L214:
            r12 = 1
            int[] r4 = r0.f18230a
            r4 = r4[r10]
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p221m9.C4453g1.m10021Q(r4, r5, r2, r12)
            goto L8a
        L224:
            r12 = 1
            int[] r4 = r0.f18230a
            r4 = r4[r10]
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p221m9.C4453g1.m10020P(r4, r5, r2, r12)
            goto L8a
        L234:
            r12 = 1
            int[] r4 = r0.f18230a
            r4 = r4[r10]
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p221m9.C4453g1.m10019O(r4, r5, r2, r12)
            goto L8a
        L244:
            r12 = 1
            int[] r4 = r0.f18230a
            r4 = r4[r10]
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p221m9.C4453g1.m10011G(r4, r5, r2, r12)
            goto L8a
        L254:
            r12 = 1
            int[] r4 = r0.f18230a
            r4 = r4[r10]
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p221m9.C4453g1.m10024T(r4, r5, r2, r12)
            goto L8a
        L264:
            r12 = 1
            int[] r4 = r0.f18230a
            r4 = r4[r10]
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p221m9.C4453g1.m10008D(r4, r5, r2, r12)
            goto L8a
        L274:
            r12 = 1
            int[] r4 = r0.f18230a
            r4 = r4[r10]
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p221m9.C4453g1.m10012H(r4, r5, r2, r12)
            goto L8a
        L284:
            r12 = 1
            int[] r4 = r0.f18230a
            r4 = r4[r10]
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p221m9.C4453g1.m10013I(r4, r5, r2, r12)
            goto L8a
        L294:
            r12 = 1
            int[] r4 = r0.f18230a
            r4 = r4[r10]
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p221m9.C4453g1.m10016L(r4, r5, r2, r12)
            goto L8a
        L2a4:
            r12 = 1
            int[] r4 = r0.f18230a
            r4 = r4[r10]
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p221m9.C4453g1.m10025U(r4, r5, r2, r12)
            goto L8a
        L2b4:
            r12 = 1
            int[] r4 = r0.f18230a
            r4 = r4[r10]
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p221m9.C4453g1.m10017M(r4, r5, r2, r12)
            goto L8a
        L2c4:
            r12 = 1
            int[] r4 = r0.f18230a
            r4 = r4[r10]
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p221m9.C4453g1.m10014J(r4, r5, r2, r12)
            goto L8a
        L2d4:
            r12 = 1
            int[] r4 = r0.f18230a
            r4 = r4[r10]
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p221m9.C4453g1.m10010F(r4, r5, r2, r12)
            goto L8a
        L2e4:
            int[] r4 = r0.f18230a
            r4 = r4[r10]
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            r12 = 0
            p221m9.C4453g1.m10022R(r4, r5, r2, r12)
            goto L52a
        L2f4:
            r12 = 0
            int[] r4 = r0.f18230a
            r4 = r4[r10]
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p221m9.C4453g1.m10021Q(r4, r5, r2, r12)
            goto L52a
        L304:
            r12 = 0
            int[] r4 = r0.f18230a
            r4 = r4[r10]
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p221m9.C4453g1.m10020P(r4, r5, r2, r12)
            goto L52a
        L314:
            r12 = 0
            int[] r4 = r0.f18230a
            r4 = r4[r10]
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p221m9.C4453g1.m10019O(r4, r5, r2, r12)
            goto L52a
        L324:
            r12 = 0
            int[] r4 = r0.f18230a
            r4 = r4[r10]
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p221m9.C4453g1.m10011G(r4, r5, r2, r12)
            goto L52a
        L334:
            r12 = 0
            int[] r4 = r0.f18230a
            r4 = r4[r10]
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p221m9.C4453g1.m10024T(r4, r5, r2, r12)
            goto L52a
        L344:
            int[] r4 = r0.f18230a
            r4 = r4[r10]
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p221m9.C4453g1.m10009E(r4, r5, r2)
            goto L8a
        L353:
            int[] r4 = r0.f18230a
            r4 = r4[r10]
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            m9.e1 r6 = r0.m10352o(r10)
            p221m9.C4453g1.m10018N(r4, r5, r2, r6)
            goto L8a
        L366:
            int[] r4 = r0.f18230a
            r4 = r4[r10]
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p221m9.C4453g1.m10023S(r4, r5, r2)
            goto L8a
        L375:
            int[] r4 = r0.f18230a
            r4 = r4[r10]
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            r12 = 0
            p221m9.C4453g1.m10008D(r4, r5, r2, r12)
            goto L52a
        L385:
            r12 = 0
            int[] r4 = r0.f18230a
            r4 = r4[r10]
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p221m9.C4453g1.m10012H(r4, r5, r2, r12)
            goto L52a
        L395:
            r12 = 0
            int[] r4 = r0.f18230a
            r4 = r4[r10]
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p221m9.C4453g1.m10013I(r4, r5, r2, r12)
            goto L52a
        L3a5:
            r12 = 0
            int[] r4 = r0.f18230a
            r4 = r4[r10]
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p221m9.C4453g1.m10016L(r4, r5, r2, r12)
            goto L52a
        L3b5:
            r12 = 0
            int[] r4 = r0.f18230a
            r4 = r4[r10]
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p221m9.C4453g1.m10025U(r4, r5, r2, r12)
            goto L52a
        L3c5:
            r12 = 0
            int[] r4 = r0.f18230a
            r4 = r4[r10]
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p221m9.C4453g1.m10017M(r4, r5, r2, r12)
            goto L52a
        L3d5:
            r12 = 0
            int[] r4 = r0.f18230a
            r4 = r4[r10]
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p221m9.C4453g1.m10014J(r4, r5, r2, r12)
            goto L52a
        L3e5:
            r12 = 0
            int[] r4 = r0.f18230a
            r4 = r4[r10]
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p221m9.C4453g1.m10010F(r4, r5, r2, r12)
            goto L52a
        L3f5:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L52a
            java.lang.Object r4 = r8.getObject(r1, r5)
            m9.e1 r5 = r0.m10352o(r10)
            r6 = r2
            m9.l r6 = (p221m9.C4466l) r6
            r6.m10182c(r13, r4, r5)
            goto L52a
        L409:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L52a
            long r4 = r8.getLong(r1, r5)
            r6 = r2
            m9.l r6 = (p221m9.C4466l) r6
            r6.m10186g(r13, r4)
            goto L52a
        L419:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L52a
            int r4 = r8.getInt(r1, r5)
            r5 = r2
            m9.l r5 = (p221m9.C4466l) r5
            r5.m10185f(r13, r4)
            goto L52a
        L429:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L52a
            long r4 = r8.getLong(r1, r5)
            r6 = r2
            m9.l r6 = (p221m9.C4466l) r6
            m9.k r6 = r6.f18190a
            r6.mo10161S(r13, r4)
            goto L52a
        L43b:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L52a
            int r4 = r8.getInt(r1, r5)
            r5 = r2
            m9.l r5 = (p221m9.C4466l) r5
            m9.k r5 = r5.f18190a
            r5.mo10159Q(r13, r4)
            goto L52a
        L44d:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L52a
            int r4 = r8.getInt(r1, r5)
            r5 = r2
            m9.l r5 = (p221m9.C4466l) r5
            m9.k r5 = r5.f18190a
            r5.mo10163U(r13, r4)
            goto L52a
        L45f:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L52a
            int r4 = r8.getInt(r1, r5)
            r5 = r2
            m9.l r5 = (p221m9.C4466l) r5
            m9.k r5 = r5.f18190a
            r5.mo10170b0(r13, r4)
            goto L52a
        L471:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L52a
            java.lang.Object r4 = r8.getObject(r1, r5)
            m9.h r4 = (p221m9.AbstractC4454h) r4
            r5 = r2
            m9.l r5 = (p221m9.C4466l) r5
            m9.k r5 = r5.f18190a
            r5.mo10158P(r13, r4)
            goto L52a
        L485:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L52a
            java.lang.Object r4 = r8.getObject(r1, r5)
            m9.e1 r5 = r0.m10352o(r10)
            r6 = r2
            m9.l r6 = (p221m9.C4466l) r6
            r6.m10183d(r13, r4, r5)
            goto L52a
        L499:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L52a
            java.lang.Object r4 = r8.getObject(r1, r5)
            r0.m10347Z(r13, r4, r2)
            goto L52a
        L4a6:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L52a
            boolean r4 = p221m9.C4483q1.m10242f(r1, r5)
            r5 = r2
            m9.l r5 = (p221m9.C4466l) r5
            m9.k r5 = r5.f18190a
            r5.mo10157O(r13, r4)
            goto L52a
        L4b8:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L52a
            int r4 = r8.getInt(r1, r5)
            r5 = r2
            m9.l r5 = (p221m9.C4466l) r5
            m9.k r5 = r5.f18190a
            r5.mo10159Q(r13, r4)
            goto L52a
        L4c9:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L52a
            long r4 = r8.getLong(r1, r5)
            r6 = r2
            m9.l r6 = (p221m9.C4466l) r6
            m9.k r6 = r6.f18190a
            r6.mo10161S(r13, r4)
            goto L52a
        L4da:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L52a
            int r4 = r8.getInt(r1, r5)
            r5 = r2
            m9.l r5 = (p221m9.C4466l) r5
            m9.k r5 = r5.f18190a
            r5.mo10163U(r13, r4)
            goto L52a
        L4eb:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L52a
            long r4 = r8.getLong(r1, r5)
            r6 = r2
            m9.l r6 = (p221m9.C4466l) r6
            m9.k r6 = r6.f18190a
            r6.mo10172d0(r13, r4)
            goto L52a
        L4fc:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L52a
            long r4 = r8.getLong(r1, r5)
            r6 = r2
            m9.l r6 = (p221m9.C4466l) r6
            m9.k r6 = r6.f18190a
            r6.mo10172d0(r13, r4)
            goto L52a
        L50d:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L52a
            float r4 = p221m9.C4483q1.m10247k(r1, r5)
            r5 = r2
            m9.l r5 = (p221m9.C4466l) r5
            r5.m10181b(r13, r4)
            goto L52a
        L51c:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L52a
            double r4 = p221m9.C4483q1.m10246j(r1, r5)
            r6 = r2
            m9.l r6 = (p221m9.C4466l) r6
            r6.m10180a(r13, r4)
        L52a:
            int r10 = r10 + 3
            r6 = r9
            r5 = r15
            goto L2b
        L530:
            r16 = r5
        L532:
            if (r5 == 0) goto L549
            m9.q<?> r4 = r0.f18245p
            r4.mo10232j(r2, r5)
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L547
            java.lang.Object r4 = r3.next()
            r5 = r4
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            goto L532
        L547:
            r5 = 0
            goto L532
        L549:
            m9.m1<?, ?> r3 = r0.f18244o
            java.lang.Object r1 = r3.mo10204g(r1)
            r3.mo10216s(r1, r2)
            return
    }

    /* renamed from: Y */
    public final <K, V> void m10346Y(p221m9.InterfaceC4498v1 r4, int r5, java.lang.Object r6, int r7) {
            r3 = this;
            if (r6 == 0) goto L42
            m9.l0 r0 = r3.f18246q
            java.lang.Object[] r1 = r3.f18231b
            int r7 = r7 / 3
            r2 = 2
            int r7 = r7 * 2
            r7 = r1[r7]
            r0.mo10192f(r7)
            m9.l0 r7 = r3.f18246q
            java.util.Map r6 = r7.mo10193g(r6)
            m9.l r4 = (p221m9.C4466l) r4
            m9.k r7 = r4.f18190a
            java.util.Objects.requireNonNull(r7)
            java.util.Set r6 = r6.entrySet()
            java.util.Iterator r6 = r6.iterator()
            boolean r7 = r6.hasNext()
            if (r7 != 0) goto L2c
            goto L42
        L2c:
            java.lang.Object r6 = r6.next()
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            m9.k r4 = r4.f18190a
            r4.mo10169a0(r5, r2)
            r6.getKey()
            r6.getValue()
            r4 = 0
            java.util.Objects.requireNonNull(r4)
            throw r4
        L42:
            return
    }

    /* renamed from: Z */
    public final void m10347Z(int r2, java.lang.Object r3, p221m9.InterfaceC4498v1 r4) {
            r1 = this;
            boolean r0 = r3 instanceof java.lang.String
            if (r0 == 0) goto Le
            java.lang.String r3 = (java.lang.String) r3
            m9.l r4 = (p221m9.C4466l) r4
            m9.k r4 = r4.f18190a
            r4.mo10168Z(r2, r3)
            goto L17
        Le:
            m9.h r3 = (p221m9.AbstractC4454h) r3
            m9.l r4 = (p221m9.C4466l) r4
            m9.k r4 = r4.f18190a
            r4.mo10158P(r2, r3)
        L17:
            return
    }

    @Override // p221m9.InterfaceC4447e1
    /* renamed from: a */
    public void mo9986a(T r7, T r8) {
            r6 = this;
            java.util.Objects.requireNonNull(r8)
            r0 = 0
        L4:
            int[] r1 = r6.f18230a
            int r2 = r1.length
            if (r0 >= r2) goto L10b
            int r2 = r0 + 1
            r1 = r1[r2]
            long r2 = m10320B(r1)
            int[] r4 = r6.f18230a
            r4 = r4[r0]
            int r1 = m10327V(r1)
            switch(r1) {
                case 0: goto Lf7;
                case 1: goto Le7;
                case 2: goto Ld9;
                case 3: goto Ld2;
                case 4: goto Lc2;
                case 5: goto Lbb;
                case 6: goto Lb4;
                case 7: goto La4;
                case 8: goto L94;
                case 9: goto L8f;
                case 10: goto L88;
                case 11: goto L81;
                case 12: goto L7a;
                case 13: goto L73;
                case 14: goto L6b;
                case 15: goto L64;
                case 16: goto L5c;
                case 17: goto L8f;
                case 18: goto L55;
                case 19: goto L55;
                case 20: goto L55;
                case 21: goto L55;
                case 22: goto L55;
                case 23: goto L55;
                case 24: goto L55;
                case 25: goto L55;
                case 26: goto L55;
                case 27: goto L55;
                case 28: goto L55;
                case 29: goto L55;
                case 30: goto L55;
                case 31: goto L55;
                case 32: goto L55;
                case 33: goto L55;
                case 34: goto L55;
                case 35: goto L55;
                case 36: goto L55;
                case 37: goto L55;
                case 38: goto L55;
                case 39: goto L55;
                case 40: goto L55;
                case 41: goto L55;
                case 42: goto L55;
                case 43: goto L55;
                case 44: goto L55;
                case 45: goto L55;
                case 46: goto L55;
                case 47: goto L55;
                case 48: goto L55;
                case 49: goto L55;
                case 50: goto L3e;
                case 51: goto L2a;
                case 52: goto L2a;
                case 53: goto L2a;
                case 54: goto L2a;
                case 55: goto L2a;
                case 56: goto L2a;
                case 57: goto L2a;
                case 58: goto L2a;
                case 59: goto L2a;
                case 60: goto L25;
                case 61: goto L1e;
                case 62: goto L1e;
                case 63: goto L1e;
                case 64: goto L1e;
                case 65: goto L1e;
                case 66: goto L1e;
                case 67: goto L1e;
                case 68: goto L25;
                default: goto L1c;
            }
        L1c:
            goto L107
        L1e:
            boolean r1 = r6.m10357u(r8, r4, r0)
            if (r1 == 0) goto L107
            goto L30
        L25:
            r6.m10360y(r7, r8, r0)
            goto L107
        L2a:
            boolean r1 = r6.m10357u(r8, r4, r0)
            if (r1 == 0) goto L107
        L30:
            java.lang.Object r1 = p221m9.C4483q1.m10250n(r8, r2)
            m9.q1$e r5 = p221m9.C4483q1.f18215f
            r5.m10278q(r7, r2, r1)
            r6.m10342T(r7, r4, r0)
            goto L107
        L3e:
            m9.l0 r1 = r6.f18246q
            java.lang.Class<?> r4 = p221m9.C4453g1.f18135a
            java.lang.Object r4 = p221m9.C4483q1.m10250n(r7, r2)
            java.lang.Object r5 = p221m9.C4483q1.m10250n(r8, r2)
            java.lang.Object r1 = r1.mo10187a(r4, r5)
            m9.q1$e r4 = p221m9.C4483q1.f18215f
            r4.m10278q(r7, r2, r1)
            goto L107
        L55:
            m9.g0 r1 = r6.f18243n
            r1.mo10001b(r7, r8, r2)
            goto L107
        L5c:
            boolean r1 = r6.m10355s(r8, r0)
            if (r1 == 0) goto L107
            goto Ldf
        L64:
            boolean r1 = r6.m10355s(r8, r0)
            if (r1 == 0) goto L107
            goto Lc8
        L6b:
            boolean r1 = r6.m10355s(r8, r0)
            if (r1 == 0) goto L107
            goto Ldf
        L73:
            boolean r1 = r6.m10355s(r8, r0)
            if (r1 == 0) goto L107
            goto Lc8
        L7a:
            boolean r1 = r6.m10355s(r8, r0)
            if (r1 == 0) goto L107
            goto Lc8
        L81:
            boolean r1 = r6.m10355s(r8, r0)
            if (r1 == 0) goto L107
            goto Lc8
        L88:
            boolean r1 = r6.m10355s(r8, r0)
            if (r1 == 0) goto L107
            goto L9a
        L8f:
            r6.m10359x(r7, r8, r0)
            goto L107
        L94:
            boolean r1 = r6.m10355s(r8, r0)
            if (r1 == 0) goto L107
        L9a:
            java.lang.Object r1 = p221m9.C4483q1.m10250n(r8, r2)
            m9.q1$e r4 = p221m9.C4483q1.f18215f
            r4.m10278q(r7, r2, r1)
            goto L104
        La4:
            boolean r1 = r6.m10355s(r8, r0)
            if (r1 == 0) goto L107
            boolean r1 = p221m9.C4483q1.m10242f(r8, r2)
            m9.q1$e r4 = p221m9.C4483q1.f18215f
            r4.mo10266k(r7, r2, r1)
            goto L104
        Lb4:
            boolean r1 = r6.m10355s(r8, r0)
            if (r1 == 0) goto L107
            goto Lc8
        Lbb:
            boolean r1 = r6.m10355s(r8, r0)
            if (r1 == 0) goto L107
            goto Ldf
        Lc2:
            boolean r1 = r6.m10355s(r8, r0)
            if (r1 == 0) goto L107
        Lc8:
            int r1 = p221m9.C4483q1.m10248l(r8, r2)
            m9.q1$e r4 = p221m9.C4483q1.f18215f
            r4.m10276o(r7, r2, r1)
            goto L104
        Ld2:
            boolean r1 = r6.m10355s(r8, r0)
            if (r1 == 0) goto L107
            goto Ldf
        Ld9:
            boolean r1 = r6.m10355s(r8, r0)
            if (r1 == 0) goto L107
        Ldf:
            long r4 = p221m9.C4483q1.m10249m(r8, r2)
            p221m9.C4483q1.m10259w(r7, r2, r4)
            goto L104
        Le7:
            boolean r1 = r6.m10355s(r8, r0)
            if (r1 == 0) goto L107
            float r1 = p221m9.C4483q1.m10247k(r8, r2)
            m9.q1$e r4 = p221m9.C4483q1.f18215f
            r4.mo10269n(r7, r2, r1)
            goto L104
        Lf7:
            boolean r1 = r6.m10355s(r8, r0)
            if (r1 == 0) goto L107
            double r4 = p221m9.C4483q1.m10246j(r8, r2)
            p221m9.C4483q1.m10256t(r7, r2, r4)
        L104:
            r6.m10341S(r7, r0)
        L107:
            int r0 = r0 + 3
            goto L4
        L10b:
            m9.m1<?, ?> r0 = r6.f18244o
            java.lang.Class<?> r1 = p221m9.C4453g1.f18135a
            java.lang.Object r1 = r0.mo10204g(r7)
            java.lang.Object r2 = r0.mo10204g(r8)
            java.lang.Object r1 = r0.mo10208k(r1, r2)
            r0.mo10212o(r7, r1)
            boolean r0 = r6.f18235f
            if (r0 == 0) goto L127
            m9.q<?> r0 = r6.f18245p
            p221m9.C4453g1.m10005A(r0, r7, r8)
        L127:
            return
    }

    @Override // p221m9.InterfaceC4447e1
    /* renamed from: b */
    public void mo9987b(T r13, p221m9.InterfaceC4498v1 r14) {
            r12 = this;
            java.util.Objects.requireNonNull(r14)
            boolean r0 = r12.f18237h
            if (r0 == 0) goto L597
            boolean r0 = r12.f18235f
            r1 = 0
            if (r0 == 0) goto L23
            m9.q<?> r0 = r12.f18245p
            m9.t r0 = r0.mo10225c(r13)
            boolean r2 = r0.m10306h()
            if (r2 != 0) goto L23
            java.util.Iterator r0 = r0.m10308k()
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            goto L25
        L23:
            r0 = r1
            r2 = r0
        L25:
            int[] r3 = r12.f18230a
            int r3 = r3.length
            r4 = 0
            r5 = 0
        L2a:
            if (r5 >= r3) goto L577
            int r6 = r12.m10344W(r5)
            int[] r7 = r12.f18230a
            r7 = r7[r5]
        L34:
            if (r2 == 0) goto L52
            m9.q<?> r8 = r12.f18245p
            int r8 = r8.mo10223a(r2)
            if (r8 > r7) goto L52
            m9.q<?> r8 = r12.f18245p
            r8.mo10232j(r14, r2)
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L50
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            goto L34
        L50:
            r2 = r1
            goto L34
        L52:
            int r8 = m10327V(r6)
            r9 = 1
            switch(r8) {
                case 0: goto L55f;
                case 1: goto L54a;
                case 2: goto L533;
                case 3: goto L51c;
                case 4: goto L505;
                case 5: goto L4ee;
                case 6: goto L4d6;
                case 7: goto L4be;
                case 8: goto L4ab;
                case 9: goto L491;
                case 10: goto L477;
                case 11: goto L45f;
                case 12: goto L447;
                case 13: goto L42f;
                case 14: goto L417;
                case 15: goto L401;
                case 16: goto L3eb;
                case 17: goto L3d1;
                case 18: goto L3be;
                case 19: goto L3ab;
                case 20: goto L398;
                case 21: goto L385;
                case 22: goto L372;
                case 23: goto L35f;
                case 24: goto L34c;
                case 25: goto L339;
                case 26: goto L326;
                case 27: goto L30f;
                case 28: goto L2fc;
                case 29: goto L2e9;
                case 30: goto L2d6;
                case 31: goto L2c3;
                case 32: goto L2b0;
                case 33: goto L29d;
                case 34: goto L28a;
                case 35: goto L277;
                case 36: goto L264;
                case 37: goto L251;
                case 38: goto L23e;
                case 39: goto L22b;
                case 40: goto L218;
                case 41: goto L205;
                case 42: goto L1f2;
                case 43: goto L1df;
                case 44: goto L1cc;
                case 45: goto L1b9;
                case 46: goto L1a6;
                case 47: goto L193;
                case 48: goto L180;
                case 49: goto L169;
                case 50: goto L15c;
                case 51: goto L14c;
                case 52: goto L13c;
                case 53: goto L12c;
                case 54: goto L11c;
                case 55: goto L10c;
                case 56: goto Lfc;
                case 57: goto Lec;
                case 58: goto Ldc;
                case 59: goto Ld4;
                case 60: goto Lcc;
                case 61: goto Lc4;
                case 62: goto Lb4;
                case 63: goto La4;
                case 64: goto L94;
                case 65: goto L84;
                case 66: goto L74;
                case 67: goto L64;
                case 68: goto L5c;
                default: goto L5a;
            }
        L5a:
            goto L573
        L5c:
            boolean r8 = r12.m10357u(r13, r7, r5)
            if (r8 == 0) goto L573
            goto L3d7
        L64:
            boolean r8 = r12.m10357u(r13, r7, r5)
            if (r8 == 0) goto L573
            long r8 = m10320B(r6)
            long r8 = m10325G(r13, r8)
            goto L3f9
        L74:
            boolean r8 = r12.m10357u(r13, r7, r5)
            if (r8 == 0) goto L573
            long r8 = m10320B(r6)
            int r6 = m10324F(r13, r8)
            goto L40f
        L84:
            boolean r8 = r12.m10357u(r13, r7, r5)
            if (r8 == 0) goto L573
            long r8 = m10320B(r6)
            long r8 = m10325G(r13, r8)
            goto L425
        L94:
            boolean r8 = r12.m10357u(r13, r7, r5)
            if (r8 == 0) goto L573
            long r8 = m10320B(r6)
            int r6 = m10324F(r13, r8)
            goto L43d
        La4:
            boolean r8 = r12.m10357u(r13, r7, r5)
            if (r8 == 0) goto L573
            long r8 = m10320B(r6)
            int r6 = m10324F(r13, r8)
            goto L455
        Lb4:
            boolean r8 = r12.m10357u(r13, r7, r5)
            if (r8 == 0) goto L573
            long r8 = m10320B(r6)
            int r6 = m10324F(r13, r8)
            goto L46d
        Lc4:
            boolean r8 = r12.m10357u(r13, r7, r5)
            if (r8 == 0) goto L573
            goto L47d
        Lcc:
            boolean r8 = r12.m10357u(r13, r7, r5)
            if (r8 == 0) goto L573
            goto L497
        Ld4:
            boolean r8 = r12.m10357u(r13, r7, r5)
            if (r8 == 0) goto L573
            goto L4b1
        Ldc:
            boolean r8 = r12.m10357u(r13, r7, r5)
            if (r8 == 0) goto L573
            long r8 = m10320B(r6)
            boolean r6 = m10321C(r13, r8)
            goto L4cc
        Lec:
            boolean r8 = r12.m10357u(r13, r7, r5)
            if (r8 == 0) goto L573
            long r8 = m10320B(r6)
            int r6 = m10324F(r13, r8)
            goto L4e4
        Lfc:
            boolean r8 = r12.m10357u(r13, r7, r5)
            if (r8 == 0) goto L573
            long r8 = m10320B(r6)
            long r8 = m10325G(r13, r8)
            goto L4fc
        L10c:
            boolean r8 = r12.m10357u(r13, r7, r5)
            if (r8 == 0) goto L573
            long r8 = m10320B(r6)
            int r6 = m10324F(r13, r8)
            goto L513
        L11c:
            boolean r8 = r12.m10357u(r13, r7, r5)
            if (r8 == 0) goto L573
            long r8 = m10320B(r6)
            long r8 = m10325G(r13, r8)
            goto L52a
        L12c:
            boolean r8 = r12.m10357u(r13, r7, r5)
            if (r8 == 0) goto L573
            long r8 = m10320B(r6)
            long r8 = m10325G(r13, r8)
            goto L541
        L13c:
            boolean r8 = r12.m10357u(r13, r7, r5)
            if (r8 == 0) goto L573
            long r8 = m10320B(r6)
            float r6 = m10323E(r13, r8)
            goto L558
        L14c:
            boolean r8 = r12.m10357u(r13, r7, r5)
            if (r8 == 0) goto L573
            long r8 = m10320B(r6)
            double r8 = m10322D(r13, r8)
            goto L56d
        L15c:
            long r8 = m10320B(r6)
            java.lang.Object r6 = p221m9.C4483q1.m10250n(r13, r8)
            r12.m10346Y(r14, r7, r6, r5)
            goto L573
        L169:
            int[] r7 = r12.f18230a
            r7 = r7[r5]
            long r8 = m10320B(r6)
            java.lang.Object r6 = p221m9.C4483q1.m10250n(r13, r8)
            java.util.List r6 = (java.util.List) r6
            m9.e1 r8 = r12.m10352o(r5)
            p221m9.C4453g1.m10015K(r7, r6, r14, r8)
            goto L573
        L180:
            int[] r7 = r12.f18230a
            r7 = r7[r5]
            long r10 = m10320B(r6)
            java.lang.Object r6 = p221m9.C4483q1.m10250n(r13, r10)
            java.util.List r6 = (java.util.List) r6
            p221m9.C4453g1.m10022R(r7, r6, r14, r9)
            goto L573
        L193:
            int[] r7 = r12.f18230a
            r7 = r7[r5]
            long r10 = m10320B(r6)
            java.lang.Object r6 = p221m9.C4483q1.m10250n(r13, r10)
            java.util.List r6 = (java.util.List) r6
            p221m9.C4453g1.m10021Q(r7, r6, r14, r9)
            goto L573
        L1a6:
            int[] r7 = r12.f18230a
            r7 = r7[r5]
            long r10 = m10320B(r6)
            java.lang.Object r6 = p221m9.C4483q1.m10250n(r13, r10)
            java.util.List r6 = (java.util.List) r6
            p221m9.C4453g1.m10020P(r7, r6, r14, r9)
            goto L573
        L1b9:
            int[] r7 = r12.f18230a
            r7 = r7[r5]
            long r10 = m10320B(r6)
            java.lang.Object r6 = p221m9.C4483q1.m10250n(r13, r10)
            java.util.List r6 = (java.util.List) r6
            p221m9.C4453g1.m10019O(r7, r6, r14, r9)
            goto L573
        L1cc:
            int[] r7 = r12.f18230a
            r7 = r7[r5]
            long r10 = m10320B(r6)
            java.lang.Object r6 = p221m9.C4483q1.m10250n(r13, r10)
            java.util.List r6 = (java.util.List) r6
            p221m9.C4453g1.m10011G(r7, r6, r14, r9)
            goto L573
        L1df:
            int[] r7 = r12.f18230a
            r7 = r7[r5]
            long r10 = m10320B(r6)
            java.lang.Object r6 = p221m9.C4483q1.m10250n(r13, r10)
            java.util.List r6 = (java.util.List) r6
            p221m9.C4453g1.m10024T(r7, r6, r14, r9)
            goto L573
        L1f2:
            int[] r7 = r12.f18230a
            r7 = r7[r5]
            long r10 = m10320B(r6)
            java.lang.Object r6 = p221m9.C4483q1.m10250n(r13, r10)
            java.util.List r6 = (java.util.List) r6
            p221m9.C4453g1.m10008D(r7, r6, r14, r9)
            goto L573
        L205:
            int[] r7 = r12.f18230a
            r7 = r7[r5]
            long r10 = m10320B(r6)
            java.lang.Object r6 = p221m9.C4483q1.m10250n(r13, r10)
            java.util.List r6 = (java.util.List) r6
            p221m9.C4453g1.m10012H(r7, r6, r14, r9)
            goto L573
        L218:
            int[] r7 = r12.f18230a
            r7 = r7[r5]
            long r10 = m10320B(r6)
            java.lang.Object r6 = p221m9.C4483q1.m10250n(r13, r10)
            java.util.List r6 = (java.util.List) r6
            p221m9.C4453g1.m10013I(r7, r6, r14, r9)
            goto L573
        L22b:
            int[] r7 = r12.f18230a
            r7 = r7[r5]
            long r10 = m10320B(r6)
            java.lang.Object r6 = p221m9.C4483q1.m10250n(r13, r10)
            java.util.List r6 = (java.util.List) r6
            p221m9.C4453g1.m10016L(r7, r6, r14, r9)
            goto L573
        L23e:
            int[] r7 = r12.f18230a
            r7 = r7[r5]
            long r10 = m10320B(r6)
            java.lang.Object r6 = p221m9.C4483q1.m10250n(r13, r10)
            java.util.List r6 = (java.util.List) r6
            p221m9.C4453g1.m10025U(r7, r6, r14, r9)
            goto L573
        L251:
            int[] r7 = r12.f18230a
            r7 = r7[r5]
            long r10 = m10320B(r6)
            java.lang.Object r6 = p221m9.C4483q1.m10250n(r13, r10)
            java.util.List r6 = (java.util.List) r6
            p221m9.C4453g1.m10017M(r7, r6, r14, r9)
            goto L573
        L264:
            int[] r7 = r12.f18230a
            r7 = r7[r5]
            long r10 = m10320B(r6)
            java.lang.Object r6 = p221m9.C4483q1.m10250n(r13, r10)
            java.util.List r6 = (java.util.List) r6
            p221m9.C4453g1.m10014J(r7, r6, r14, r9)
            goto L573
        L277:
            int[] r7 = r12.f18230a
            r7 = r7[r5]
            long r10 = m10320B(r6)
            java.lang.Object r6 = p221m9.C4483q1.m10250n(r13, r10)
            java.util.List r6 = (java.util.List) r6
            p221m9.C4453g1.m10010F(r7, r6, r14, r9)
            goto L573
        L28a:
            int[] r7 = r12.f18230a
            r7 = r7[r5]
            long r8 = m10320B(r6)
            java.lang.Object r6 = p221m9.C4483q1.m10250n(r13, r8)
            java.util.List r6 = (java.util.List) r6
            p221m9.C4453g1.m10022R(r7, r6, r14, r4)
            goto L573
        L29d:
            int[] r7 = r12.f18230a
            r7 = r7[r5]
            long r8 = m10320B(r6)
            java.lang.Object r6 = p221m9.C4483q1.m10250n(r13, r8)
            java.util.List r6 = (java.util.List) r6
            p221m9.C4453g1.m10021Q(r7, r6, r14, r4)
            goto L573
        L2b0:
            int[] r7 = r12.f18230a
            r7 = r7[r5]
            long r8 = m10320B(r6)
            java.lang.Object r6 = p221m9.C4483q1.m10250n(r13, r8)
            java.util.List r6 = (java.util.List) r6
            p221m9.C4453g1.m10020P(r7, r6, r14, r4)
            goto L573
        L2c3:
            int[] r7 = r12.f18230a
            r7 = r7[r5]
            long r8 = m10320B(r6)
            java.lang.Object r6 = p221m9.C4483q1.m10250n(r13, r8)
            java.util.List r6 = (java.util.List) r6
            p221m9.C4453g1.m10019O(r7, r6, r14, r4)
            goto L573
        L2d6:
            int[] r7 = r12.f18230a
            r7 = r7[r5]
            long r8 = m10320B(r6)
            java.lang.Object r6 = p221m9.C4483q1.m10250n(r13, r8)
            java.util.List r6 = (java.util.List) r6
            p221m9.C4453g1.m10011G(r7, r6, r14, r4)
            goto L573
        L2e9:
            int[] r7 = r12.f18230a
            r7 = r7[r5]
            long r8 = m10320B(r6)
            java.lang.Object r6 = p221m9.C4483q1.m10250n(r13, r8)
            java.util.List r6 = (java.util.List) r6
            p221m9.C4453g1.m10024T(r7, r6, r14, r4)
            goto L573
        L2fc:
            int[] r7 = r12.f18230a
            r7 = r7[r5]
            long r8 = m10320B(r6)
            java.lang.Object r6 = p221m9.C4483q1.m10250n(r13, r8)
            java.util.List r6 = (java.util.List) r6
            p221m9.C4453g1.m10009E(r7, r6, r14)
            goto L573
        L30f:
            int[] r7 = r12.f18230a
            r7 = r7[r5]
            long r8 = m10320B(r6)
            java.lang.Object r6 = p221m9.C4483q1.m10250n(r13, r8)
            java.util.List r6 = (java.util.List) r6
            m9.e1 r8 = r12.m10352o(r5)
            p221m9.C4453g1.m10018N(r7, r6, r14, r8)
            goto L573
        L326:
            int[] r7 = r12.f18230a
            r7 = r7[r5]
            long r8 = m10320B(r6)
            java.lang.Object r6 = p221m9.C4483q1.m10250n(r13, r8)
            java.util.List r6 = (java.util.List) r6
            p221m9.C4453g1.m10023S(r7, r6, r14)
            goto L573
        L339:
            int[] r7 = r12.f18230a
            r7 = r7[r5]
            long r8 = m10320B(r6)
            java.lang.Object r6 = p221m9.C4483q1.m10250n(r13, r8)
            java.util.List r6 = (java.util.List) r6
            p221m9.C4453g1.m10008D(r7, r6, r14, r4)
            goto L573
        L34c:
            int[] r7 = r12.f18230a
            r7 = r7[r5]
            long r8 = m10320B(r6)
            java.lang.Object r6 = p221m9.C4483q1.m10250n(r13, r8)
            java.util.List r6 = (java.util.List) r6
            p221m9.C4453g1.m10012H(r7, r6, r14, r4)
            goto L573
        L35f:
            int[] r7 = r12.f18230a
            r7 = r7[r5]
            long r8 = m10320B(r6)
            java.lang.Object r6 = p221m9.C4483q1.m10250n(r13, r8)
            java.util.List r6 = (java.util.List) r6
            p221m9.C4453g1.m10013I(r7, r6, r14, r4)
            goto L573
        L372:
            int[] r7 = r12.f18230a
            r7 = r7[r5]
            long r8 = m10320B(r6)
            java.lang.Object r6 = p221m9.C4483q1.m10250n(r13, r8)
            java.util.List r6 = (java.util.List) r6
            p221m9.C4453g1.m10016L(r7, r6, r14, r4)
            goto L573
        L385:
            int[] r7 = r12.f18230a
            r7 = r7[r5]
            long r8 = m10320B(r6)
            java.lang.Object r6 = p221m9.C4483q1.m10250n(r13, r8)
            java.util.List r6 = (java.util.List) r6
            p221m9.C4453g1.m10025U(r7, r6, r14, r4)
            goto L573
        L398:
            int[] r7 = r12.f18230a
            r7 = r7[r5]
            long r8 = m10320B(r6)
            java.lang.Object r6 = p221m9.C4483q1.m10250n(r13, r8)
            java.util.List r6 = (java.util.List) r6
            p221m9.C4453g1.m10017M(r7, r6, r14, r4)
            goto L573
        L3ab:
            int[] r7 = r12.f18230a
            r7 = r7[r5]
            long r8 = m10320B(r6)
            java.lang.Object r6 = p221m9.C4483q1.m10250n(r13, r8)
            java.util.List r6 = (java.util.List) r6
            p221m9.C4453g1.m10014J(r7, r6, r14, r4)
            goto L573
        L3be:
            int[] r7 = r12.f18230a
            r7 = r7[r5]
            long r8 = m10320B(r6)
            java.lang.Object r6 = p221m9.C4483q1.m10250n(r13, r8)
            java.util.List r6 = (java.util.List) r6
            p221m9.C4453g1.m10010F(r7, r6, r14, r4)
            goto L573
        L3d1:
            boolean r8 = r12.m10355s(r13, r5)
            if (r8 == 0) goto L573
        L3d7:
            long r8 = m10320B(r6)
            java.lang.Object r6 = p221m9.C4483q1.m10250n(r13, r8)
            m9.e1 r8 = r12.m10352o(r5)
            r9 = r14
            m9.l r9 = (p221m9.C4466l) r9
            r9.m10182c(r7, r6, r8)
            goto L573
        L3eb:
            boolean r8 = r12.m10355s(r13, r5)
            if (r8 == 0) goto L573
            long r8 = m10320B(r6)
            long r8 = p221m9.C4483q1.m10249m(r13, r8)
        L3f9:
            r6 = r14
            m9.l r6 = (p221m9.C4466l) r6
            r6.m10186g(r7, r8)
            goto L573
        L401:
            boolean r8 = r12.m10355s(r13, r5)
            if (r8 == 0) goto L573
            long r8 = m10320B(r6)
            int r6 = p221m9.C4483q1.m10248l(r13, r8)
        L40f:
            r8 = r14
            m9.l r8 = (p221m9.C4466l) r8
            r8.m10185f(r7, r6)
            goto L573
        L417:
            boolean r8 = r12.m10355s(r13, r5)
            if (r8 == 0) goto L573
            long r8 = m10320B(r6)
            long r8 = p221m9.C4483q1.m10249m(r13, r8)
        L425:
            r6 = r14
            m9.l r6 = (p221m9.C4466l) r6
            m9.k r6 = r6.f18190a
            r6.mo10161S(r7, r8)
            goto L573
        L42f:
            boolean r8 = r12.m10355s(r13, r5)
            if (r8 == 0) goto L573
            long r8 = m10320B(r6)
            int r6 = p221m9.C4483q1.m10248l(r13, r8)
        L43d:
            r8 = r14
            m9.l r8 = (p221m9.C4466l) r8
            m9.k r8 = r8.f18190a
            r8.mo10159Q(r7, r6)
            goto L573
        L447:
            boolean r8 = r12.m10355s(r13, r5)
            if (r8 == 0) goto L573
            long r8 = m10320B(r6)
            int r6 = p221m9.C4483q1.m10248l(r13, r8)
        L455:
            r8 = r14
            m9.l r8 = (p221m9.C4466l) r8
            m9.k r8 = r8.f18190a
            r8.mo10163U(r7, r6)
            goto L573
        L45f:
            boolean r8 = r12.m10355s(r13, r5)
            if (r8 == 0) goto L573
            long r8 = m10320B(r6)
            int r6 = p221m9.C4483q1.m10248l(r13, r8)
        L46d:
            r8 = r14
            m9.l r8 = (p221m9.C4466l) r8
            m9.k r8 = r8.f18190a
            r8.mo10170b0(r7, r6)
            goto L573
        L477:
            boolean r8 = r12.m10355s(r13, r5)
            if (r8 == 0) goto L573
        L47d:
            long r8 = m10320B(r6)
            java.lang.Object r6 = p221m9.C4483q1.m10250n(r13, r8)
            m9.h r6 = (p221m9.AbstractC4454h) r6
            r8 = r14
            m9.l r8 = (p221m9.C4466l) r8
            m9.k r8 = r8.f18190a
            r8.mo10158P(r7, r6)
            goto L573
        L491:
            boolean r8 = r12.m10355s(r13, r5)
            if (r8 == 0) goto L573
        L497:
            long r8 = m10320B(r6)
            java.lang.Object r6 = p221m9.C4483q1.m10250n(r13, r8)
            m9.e1 r8 = r12.m10352o(r5)
            r9 = r14
            m9.l r9 = (p221m9.C4466l) r9
            r9.m10183d(r7, r6, r8)
            goto L573
        L4ab:
            boolean r8 = r12.m10355s(r13, r5)
            if (r8 == 0) goto L573
        L4b1:
            long r8 = m10320B(r6)
            java.lang.Object r6 = p221m9.C4483q1.m10250n(r13, r8)
            r12.m10347Z(r7, r6, r14)
            goto L573
        L4be:
            boolean r8 = r12.m10355s(r13, r5)
            if (r8 == 0) goto L573
            long r8 = m10320B(r6)
            boolean r6 = p221m9.C4483q1.m10242f(r13, r8)
        L4cc:
            r8 = r14
            m9.l r8 = (p221m9.C4466l) r8
            m9.k r8 = r8.f18190a
            r8.mo10157O(r7, r6)
            goto L573
        L4d6:
            boolean r8 = r12.m10355s(r13, r5)
            if (r8 == 0) goto L573
            long r8 = m10320B(r6)
            int r6 = p221m9.C4483q1.m10248l(r13, r8)
        L4e4:
            r8 = r14
            m9.l r8 = (p221m9.C4466l) r8
            m9.k r8 = r8.f18190a
            r8.mo10159Q(r7, r6)
            goto L573
        L4ee:
            boolean r8 = r12.m10355s(r13, r5)
            if (r8 == 0) goto L573
            long r8 = m10320B(r6)
            long r8 = p221m9.C4483q1.m10249m(r13, r8)
        L4fc:
            r6 = r14
            m9.l r6 = (p221m9.C4466l) r6
            m9.k r6 = r6.f18190a
            r6.mo10161S(r7, r8)
            goto L573
        L505:
            boolean r8 = r12.m10355s(r13, r5)
            if (r8 == 0) goto L573
            long r8 = m10320B(r6)
            int r6 = p221m9.C4483q1.m10248l(r13, r8)
        L513:
            r8 = r14
            m9.l r8 = (p221m9.C4466l) r8
            m9.k r8 = r8.f18190a
            r8.mo10163U(r7, r6)
            goto L573
        L51c:
            boolean r8 = r12.m10355s(r13, r5)
            if (r8 == 0) goto L573
            long r8 = m10320B(r6)
            long r8 = p221m9.C4483q1.m10249m(r13, r8)
        L52a:
            r6 = r14
            m9.l r6 = (p221m9.C4466l) r6
            m9.k r6 = r6.f18190a
            r6.mo10172d0(r7, r8)
            goto L573
        L533:
            boolean r8 = r12.m10355s(r13, r5)
            if (r8 == 0) goto L573
            long r8 = m10320B(r6)
            long r8 = p221m9.C4483q1.m10249m(r13, r8)
        L541:
            r6 = r14
            m9.l r6 = (p221m9.C4466l) r6
            m9.k r6 = r6.f18190a
            r6.mo10172d0(r7, r8)
            goto L573
        L54a:
            boolean r8 = r12.m10355s(r13, r5)
            if (r8 == 0) goto L573
            long r8 = m10320B(r6)
            float r6 = p221m9.C4483q1.m10247k(r13, r8)
        L558:
            r8 = r14
            m9.l r8 = (p221m9.C4466l) r8
            r8.m10181b(r7, r6)
            goto L573
        L55f:
            boolean r8 = r12.m10355s(r13, r5)
            if (r8 == 0) goto L573
            long r8 = m10320B(r6)
            double r8 = p221m9.C4483q1.m10246j(r13, r8)
        L56d:
            r6 = r14
            m9.l r6 = (p221m9.C4466l) r6
            r6.m10180a(r7, r8)
        L573:
            int r5 = r5 + 3
            goto L2a
        L577:
            if (r2 == 0) goto L58d
            m9.q<?> r3 = r12.f18245p
            r3.mo10232j(r14, r2)
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L58b
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            goto L577
        L58b:
            r2 = r1
            goto L577
        L58d:
            m9.m1<?, ?> r0 = r12.f18244o
            java.lang.Object r13 = r0.mo10204g(r13)
            r0.mo10216s(r13, r14)
            goto L59a
        L597:
            r12.m10345X(r13, r14)
        L59a:
            return
    }

    @Override // p221m9.InterfaceC4447e1
    /* renamed from: c */
    public void mo9988c(T r9, byte[] r10, int r11, int r12, p221m9.C4445e.a r13) {
            r8 = this;
            boolean r0 = r8.f18237h
            if (r0 == 0) goto L8
            r8.m10334K(r9, r10, r11, r12, r13)
            goto L12
        L8:
            r6 = 0
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r7 = r13
            r1.m10333J(r2, r3, r4, r5, r6, r7)
        L12:
            return
    }

    @Override // p221m9.InterfaceC4447e1
    /* renamed from: d */
    public void mo9989d(T r6) {
            r5 = this;
            int r0 = r5.f18240k
        L2:
            int r1 = r5.f18241l
            if (r0 >= r1) goto L27
            int[] r1 = r5.f18239j
            r1 = r1[r0]
            int r1 = r5.m10344W(r1)
            long r1 = m10320B(r1)
            java.lang.Object r3 = p221m9.C4483q1.m10250n(r6, r1)
            if (r3 != 0) goto L19
            goto L24
        L19:
            m9.l0 r4 = r5.f18246q
            java.lang.Object r3 = r4.mo10191e(r3)
            m9.q1$e r4 = p221m9.C4483q1.f18215f
            r4.m10278q(r6, r1, r3)
        L24:
            int r0 = r0 + 1
            goto L2
        L27:
            int[] r0 = r5.f18239j
            int r0 = r0.length
        L2a:
            if (r1 >= r0) goto L39
            m9.g0 r2 = r5.f18243n
            int[] r3 = r5.f18239j
            r3 = r3[r1]
            long r3 = (long) r3
            r2.mo10000a(r6, r3)
            int r1 = r1 + 1
            goto L2a
        L39:
            m9.m1<?, ?> r0 = r5.f18244o
            r0.mo10207j(r6)
            boolean r0 = r5.f18235f
            if (r0 == 0) goto L47
            m9.q<?> r0 = r5.f18245p
            r0.mo10228f(r6)
        L47:
            return
    }

    @Override // p221m9.InterfaceC4447e1
    /* renamed from: e */
    public final boolean mo9990e(T r13) {
            r12 = this;
            r0 = 0
            r1 = -1
            r2 = 0
            r3 = 0
        L4:
            int r4 = r12.f18240k
            r5 = 1
            if (r2 >= r4) goto Lf2
            int[] r4 = r12.f18239j
            r4 = r4[r2]
            int[] r6 = r12.f18230a
            r6 = r6[r4]
            int r7 = r12.m10344W(r4)
            boolean r8 = r12.f18237h
            if (r8 != 0) goto L32
            int[] r8 = r12.f18230a
            int r9 = r4 + 2
            r8 = r8[r9]
            r9 = 1048575(0xfffff, float:1.469367E-39)
            r9 = r9 & r8
            int r8 = r8 >>> 20
            int r8 = r5 << r8
            if (r9 == r1) goto L33
            sun.misc.Unsafe r1 = p221m9.C4491t0.f18229s
            long r10 = (long) r9
            int r3 = r1.getInt(r13, r10)
            r1 = r9
            goto L33
        L32:
            r8 = 0
        L33:
            r9 = 268435456(0x10000000, float:2.524355E-29)
            r9 = r9 & r7
            if (r9 == 0) goto L3a
            r9 = 1
            goto L3b
        L3a:
            r9 = 0
        L3b:
            if (r9 == 0) goto L44
            boolean r9 = r12.m10356t(r13, r4, r3, r8)
            if (r9 != 0) goto L44
            return r0
        L44:
            int r9 = m10327V(r7)
            r10 = 9
            if (r9 == r10) goto Ld5
            r10 = 17
            if (r9 == r10) goto Ld5
            r8 = 27
            if (r9 == r8) goto La7
            r8 = 60
            if (r9 == r8) goto L8e
            r8 = 68
            if (r9 == r8) goto L8e
            r6 = 49
            if (r9 == r6) goto La7
            r5 = 50
            if (r9 == r5) goto L66
            goto Lee
        L66:
            m9.l0 r5 = r12.f18246q
            long r6 = m10320B(r7)
            java.lang.Object r6 = p221m9.C4483q1.m10250n(r13, r6)
            java.util.Map r5 = r5.mo10193g(r6)
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L7c
            goto Lee
        L7c:
            java.lang.Object[] r13 = r12.f18231b
            int r4 = r4 / 3
            int r4 = r4 * 2
            r13 = r13[r4]
            m9.l0 r0 = r12.f18246q
            r0.mo10192f(r13)
            r13 = 0
            java.util.Objects.requireNonNull(r13)
            throw r13
        L8e:
            boolean r5 = r12.m10357u(r13, r6, r4)
            if (r5 == 0) goto Lee
            m9.e1 r4 = r12.m10352o(r4)
            long r5 = m10320B(r7)
            java.lang.Object r5 = p221m9.C4483q1.m10250n(r13, r5)
            boolean r4 = r4.mo9990e(r5)
            if (r4 != 0) goto Lee
            return r0
        La7:
            long r6 = m10320B(r7)
            java.lang.Object r6 = p221m9.C4483q1.m10250n(r13, r6)
            java.util.List r6 = (java.util.List) r6
            boolean r7 = r6.isEmpty()
            if (r7 == 0) goto Lb8
            goto Ld2
        Lb8:
            m9.e1 r4 = r12.m10352o(r4)
            r7 = 0
        Lbd:
            int r8 = r6.size()
            if (r7 >= r8) goto Ld2
            java.lang.Object r8 = r6.get(r7)
            boolean r8 = r4.mo9990e(r8)
            if (r8 != 0) goto Lcf
            r5 = 0
            goto Ld2
        Lcf:
            int r7 = r7 + 1
            goto Lbd
        Ld2:
            if (r5 != 0) goto Lee
            return r0
        Ld5:
            boolean r5 = r12.m10356t(r13, r4, r3, r8)
            if (r5 == 0) goto Lee
            m9.e1 r4 = r12.m10352o(r4)
            long r5 = m10320B(r7)
            java.lang.Object r5 = p221m9.C4483q1.m10250n(r13, r5)
            boolean r4 = r4.mo9990e(r5)
            if (r4 != 0) goto Lee
            return r0
        Lee:
            int r2 = r2 + 1
            goto L4
        Lf2:
            boolean r1 = r12.f18235f
            if (r1 == 0) goto L103
            m9.q<?> r1 = r12.f18245p
            m9.t r13 = r1.mo10225c(r13)
            boolean r13 = r13.m10307i()
            if (r13 != 0) goto L103
            return r0
        L103:
            return r5
    }

    @Override // p221m9.InterfaceC4447e1
    /* renamed from: f */
    public boolean mo9991f(T r10, T r11) {
            r9 = this;
            int[] r0 = r9.f18230a
            int r0 = r0.length
            r1 = 0
            r2 = 0
        L5:
            r3 = 1
            if (r2 >= r0) goto L1c6
            int[] r4 = r9.f18230a
            int r5 = r2 + 1
            r4 = r4[r5]
            long r5 = m10320B(r4)
            int r4 = m10327V(r4)
            switch(r4) {
                case 0: goto L1a3;
                case 1: goto L18a;
                case 2: goto L177;
                case 3: goto L164;
                case 4: goto L153;
                case 5: goto L13f;
                case 6: goto L12d;
                case 7: goto L11b;
                case 8: goto L105;
                case 9: goto Lef;
                case 10: goto Ld9;
                case 11: goto Lc7;
                case 12: goto Lb5;
                case 13: goto La3;
                case 14: goto L8f;
                case 15: goto L7d;
                case 16: goto L69;
                case 17: goto L53;
                case 18: goto L45;
                case 19: goto L45;
                case 20: goto L45;
                case 21: goto L45;
                case 22: goto L45;
                case 23: goto L45;
                case 24: goto L45;
                case 25: goto L45;
                case 26: goto L45;
                case 27: goto L45;
                case 28: goto L45;
                case 29: goto L45;
                case 30: goto L45;
                case 31: goto L45;
                case 32: goto L45;
                case 33: goto L45;
                case 34: goto L45;
                case 35: goto L45;
                case 36: goto L45;
                case 37: goto L45;
                case 38: goto L45;
                case 39: goto L45;
                case 40: goto L45;
                case 41: goto L45;
                case 42: goto L45;
                case 43: goto L45;
                case 44: goto L45;
                case 45: goto L45;
                case 46: goto L45;
                case 47: goto L45;
                case 48: goto L45;
                case 49: goto L45;
                case 50: goto L45;
                case 51: goto L1b;
                case 52: goto L1b;
                case 53: goto L1b;
                case 54: goto L1b;
                case 55: goto L1b;
                case 56: goto L1b;
                case 57: goto L1b;
                case 58: goto L1b;
                case 59: goto L1b;
                case 60: goto L1b;
                case 61: goto L1b;
                case 62: goto L1b;
                case 63: goto L1b;
                case 64: goto L1b;
                case 65: goto L1b;
                case 66: goto L1b;
                case 67: goto L1b;
                case 68: goto L1b;
                default: goto L19;
            }
        L19:
            goto L1bf
        L1b:
            int[] r4 = r9.f18230a
            int r7 = r2 + 2
            r4 = r4[r7]
            r7 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r4 & r7
            long r7 = (long) r4
            int r4 = p221m9.C4483q1.m10248l(r10, r7)
            int r7 = p221m9.C4483q1.m10248l(r11, r7)
            if (r4 != r7) goto L32
            r4 = 1
            goto L33
        L32:
            r4 = 0
        L33:
            if (r4 == 0) goto L1be
            java.lang.Object r4 = p221m9.C4483q1.m10250n(r10, r5)
            java.lang.Object r5 = p221m9.C4483q1.m10250n(r11, r5)
            boolean r4 = p221m9.C4453g1.m10006B(r4, r5)
            if (r4 == 0) goto L1be
            goto L1bf
        L45:
            java.lang.Object r3 = p221m9.C4483q1.m10250n(r10, r5)
            java.lang.Object r4 = p221m9.C4483q1.m10250n(r11, r5)
            boolean r3 = p221m9.C4453g1.m10006B(r3, r4)
            goto L1bf
        L53:
            boolean r4 = r9.m10348k(r10, r11, r2)
            if (r4 == 0) goto L1be
            java.lang.Object r4 = p221m9.C4483q1.m10250n(r10, r5)
            java.lang.Object r5 = p221m9.C4483q1.m10250n(r11, r5)
            boolean r4 = p221m9.C4453g1.m10006B(r4, r5)
            if (r4 == 0) goto L1be
            goto L1bf
        L69:
            boolean r4 = r9.m10348k(r10, r11, r2)
            if (r4 == 0) goto L1be
            long r7 = p221m9.C4483q1.m10249m(r10, r5)
            long r4 = p221m9.C4483q1.m10249m(r11, r5)
            int r6 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r6 != 0) goto L1be
            goto L1bf
        L7d:
            boolean r4 = r9.m10348k(r10, r11, r2)
            if (r4 == 0) goto L1be
            int r4 = p221m9.C4483q1.m10248l(r10, r5)
            int r5 = p221m9.C4483q1.m10248l(r11, r5)
            if (r4 != r5) goto L1be
            goto L1bf
        L8f:
            boolean r4 = r9.m10348k(r10, r11, r2)
            if (r4 == 0) goto L1be
            long r7 = p221m9.C4483q1.m10249m(r10, r5)
            long r4 = p221m9.C4483q1.m10249m(r11, r5)
            int r6 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r6 != 0) goto L1be
            goto L1bf
        La3:
            boolean r4 = r9.m10348k(r10, r11, r2)
            if (r4 == 0) goto L1be
            int r4 = p221m9.C4483q1.m10248l(r10, r5)
            int r5 = p221m9.C4483q1.m10248l(r11, r5)
            if (r4 != r5) goto L1be
            goto L1bf
        Lb5:
            boolean r4 = r9.m10348k(r10, r11, r2)
            if (r4 == 0) goto L1be
            int r4 = p221m9.C4483q1.m10248l(r10, r5)
            int r5 = p221m9.C4483q1.m10248l(r11, r5)
            if (r4 != r5) goto L1be
            goto L1bf
        Lc7:
            boolean r4 = r9.m10348k(r10, r11, r2)
            if (r4 == 0) goto L1be
            int r4 = p221m9.C4483q1.m10248l(r10, r5)
            int r5 = p221m9.C4483q1.m10248l(r11, r5)
            if (r4 != r5) goto L1be
            goto L1bf
        Ld9:
            boolean r4 = r9.m10348k(r10, r11, r2)
            if (r4 == 0) goto L1be
            java.lang.Object r4 = p221m9.C4483q1.m10250n(r10, r5)
            java.lang.Object r5 = p221m9.C4483q1.m10250n(r11, r5)
            boolean r4 = p221m9.C4453g1.m10006B(r4, r5)
            if (r4 == 0) goto L1be
            goto L1bf
        Lef:
            boolean r4 = r9.m10348k(r10, r11, r2)
            if (r4 == 0) goto L1be
            java.lang.Object r4 = p221m9.C4483q1.m10250n(r10, r5)
            java.lang.Object r5 = p221m9.C4483q1.m10250n(r11, r5)
            boolean r4 = p221m9.C4453g1.m10006B(r4, r5)
            if (r4 == 0) goto L1be
            goto L1bf
        L105:
            boolean r4 = r9.m10348k(r10, r11, r2)
            if (r4 == 0) goto L1be
            java.lang.Object r4 = p221m9.C4483q1.m10250n(r10, r5)
            java.lang.Object r5 = p221m9.C4483q1.m10250n(r11, r5)
            boolean r4 = p221m9.C4453g1.m10006B(r4, r5)
            if (r4 == 0) goto L1be
            goto L1bf
        L11b:
            boolean r4 = r9.m10348k(r10, r11, r2)
            if (r4 == 0) goto L1be
            boolean r4 = p221m9.C4483q1.m10242f(r10, r5)
            boolean r5 = p221m9.C4483q1.m10242f(r11, r5)
            if (r4 != r5) goto L1be
            goto L1bf
        L12d:
            boolean r4 = r9.m10348k(r10, r11, r2)
            if (r4 == 0) goto L1be
            int r4 = p221m9.C4483q1.m10248l(r10, r5)
            int r5 = p221m9.C4483q1.m10248l(r11, r5)
            if (r4 != r5) goto L1be
            goto L1bf
        L13f:
            boolean r4 = r9.m10348k(r10, r11, r2)
            if (r4 == 0) goto L1be
            long r7 = p221m9.C4483q1.m10249m(r10, r5)
            long r4 = p221m9.C4483q1.m10249m(r11, r5)
            int r6 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r6 != 0) goto L1be
            goto L1bf
        L153:
            boolean r4 = r9.m10348k(r10, r11, r2)
            if (r4 == 0) goto L1be
            int r4 = p221m9.C4483q1.m10248l(r10, r5)
            int r5 = p221m9.C4483q1.m10248l(r11, r5)
            if (r4 != r5) goto L1be
            goto L1bf
        L164:
            boolean r4 = r9.m10348k(r10, r11, r2)
            if (r4 == 0) goto L1be
            long r7 = p221m9.C4483q1.m10249m(r10, r5)
            long r4 = p221m9.C4483q1.m10249m(r11, r5)
            int r6 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r6 != 0) goto L1be
            goto L1bf
        L177:
            boolean r4 = r9.m10348k(r10, r11, r2)
            if (r4 == 0) goto L1be
            long r7 = p221m9.C4483q1.m10249m(r10, r5)
            long r4 = p221m9.C4483q1.m10249m(r11, r5)
            int r6 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r6 != 0) goto L1be
            goto L1bf
        L18a:
            boolean r4 = r9.m10348k(r10, r11, r2)
            if (r4 == 0) goto L1be
            float r4 = p221m9.C4483q1.m10247k(r10, r5)
            int r4 = java.lang.Float.floatToIntBits(r4)
            float r5 = p221m9.C4483q1.m10247k(r11, r5)
            int r5 = java.lang.Float.floatToIntBits(r5)
            if (r4 != r5) goto L1be
            goto L1bf
        L1a3:
            boolean r4 = r9.m10348k(r10, r11, r2)
            if (r4 == 0) goto L1be
            double r7 = p221m9.C4483q1.m10246j(r10, r5)
            long r7 = java.lang.Double.doubleToLongBits(r7)
            double r4 = p221m9.C4483q1.m10246j(r11, r5)
            long r4 = java.lang.Double.doubleToLongBits(r4)
            int r6 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r6 != 0) goto L1be
            goto L1bf
        L1be:
            r3 = 0
        L1bf:
            if (r3 != 0) goto L1c2
            return r1
        L1c2:
            int r2 = r2 + 3
            goto L5
        L1c6:
            m9.m1<?, ?> r0 = r9.f18244o
            java.lang.Object r0 = r0.mo10204g(r10)
            m9.m1<?, ?> r2 = r9.f18244o
            java.lang.Object r2 = r2.mo10204g(r11)
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L1d9
            return r1
        L1d9:
            boolean r0 = r9.f18235f
            if (r0 == 0) goto L1ee
            m9.q<?> r0 = r9.f18245p
            m9.t r10 = r0.mo10225c(r10)
            m9.q<?> r0 = r9.f18245p
            m9.t r11 = r0.mo10225c(r11)
            boolean r10 = r10.equals(r11)
            return r10
        L1ee:
            return r3
    }

    @Override // p221m9.InterfaceC4447e1
    /* renamed from: g */
    public int mo9992g(T r2) {
            r1 = this;
            boolean r0 = r1.f18237h
            if (r0 == 0) goto L9
            int r2 = r1.m10354r(r2)
            goto Ld
        L9:
            int r2 = r1.m10353q(r2)
        Ld:
            return r2
    }

    @Override // p221m9.InterfaceC4447e1
    /* renamed from: h */
    public T mo9993h() {
            r2 = this;
            m9.v0 r0 = r2.f18242m
            m9.q0 r1 = r2.f18234e
            java.lang.Object r0 = r0.mo10365a(r1)
            return r0
    }

    @Override // p221m9.InterfaceC4447e1
    /* renamed from: i */
    public void mo9994i(T r17, p221m9.InterfaceC4444d1 r18, p221m9.C4478p r19) {
            r16 = this;
            r8 = r16
            r9 = r17
            r0 = r18
            r10 = r19
            java.util.Objects.requireNonNull(r19)
            m9.m1<?, ?> r11 = r8.f18244o
            m9.q<?> r12 = r8.f18245p
            r13 = 0
            r14 = r13
            r15 = r14
        L12:
            int r1 = r18.mo9949r()     // Catch: java.lang.Throwable -> L4f0
            int r3 = r8.m10336M(r1)     // Catch: java.lang.Throwable -> L4f0
            if (r3 >= 0) goto L89
            r2 = 2147483647(0x7fffffff, float:NaN)
            if (r1 != r2) goto L38
            int r0 = r8.f18240k
        L23:
            int r1 = r8.f18241l
            if (r0 >= r1) goto L31
            int[] r1 = r8.f18239j
            r1 = r1[r0]
            r8.m10349l(r9, r1, r14, r11)
            int r0 = r0 + 1
            goto L23
        L31:
            if (r14 == 0) goto L4ef
        L33:
            r11.mo10211n(r9, r14)
            goto L4ef
        L38:
            boolean r2 = r8.f18235f     // Catch: java.lang.Throwable -> L4f0
            if (r2 != 0) goto L3e
            r3 = r13
            goto L45
        L3e:
            m9.q0 r2 = r8.f18234e     // Catch: java.lang.Throwable -> L4f0
            java.lang.Object r1 = r12.mo10224b(r10, r2, r1)     // Catch: java.lang.Throwable -> L4f0
            r3 = r1
        L45:
            if (r3 == 0) goto L5b
            if (r15 != 0) goto L4e
            m9.t r1 = r12.mo10226d(r9)     // Catch: java.lang.Throwable -> L4f0
            r15 = r1
        L4e:
            r1 = r12
            r2 = r18
            r4 = r19
            r5 = r15
            r6 = r14
            r7 = r11
            java.lang.Object r14 = r1.mo10229g(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L4f0
            goto L12
        L5b:
            boolean r1 = r11.mo10213p(r0)     // Catch: java.lang.Throwable -> L4f0
            if (r1 == 0) goto L68
            boolean r1 = r18.mo9919B()     // Catch: java.lang.Throwable -> L4f0
            if (r1 == 0) goto L76
            goto L12
        L68:
            if (r14 != 0) goto L6f
            java.lang.Object r1 = r11.mo10203f(r9)     // Catch: java.lang.Throwable -> L4f0
            r14 = r1
        L6f:
            boolean r1 = r11.m10209l(r14, r0)     // Catch: java.lang.Throwable -> L4f0
            if (r1 == 0) goto L76
            goto L12
        L76:
            int r0 = r8.f18240k
        L78:
            int r1 = r8.f18241l
            if (r0 >= r1) goto L86
            int[] r1 = r8.f18239j
            r1 = r1[r0]
            r8.m10349l(r9, r1, r14, r11)
            int r0 = r0 + 1
            goto L78
        L86:
            if (r14 == 0) goto L4ef
            goto L33
        L89:
            int r4 = r8.m10344W(r3)     // Catch: java.lang.Throwable -> L4f0
            int r2 = m10327V(r4)     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            switch(r2) {
                case 0: goto L483;
                case 1: goto L477;
                case 2: goto L46d;
                case 3: goto L463;
                case 4: goto L459;
                case 5: goto L44f;
                case 6: goto L445;
                case 7: goto L439;
                case 8: goto L435;
                case 9: goto L406;
                case 10: goto L3fd;
                case 11: goto L3f4;
                case 12: goto L3d4;
                case 13: goto L3cb;
                case 14: goto L3c2;
                case 15: goto L3b5;
                case 16: goto L3a8;
                case 17: goto L377;
                case 18: goto L36a;
                case 19: goto L35d;
                case 20: goto L350;
                case 21: goto L343;
                case 22: goto L336;
                case 23: goto L329;
                case 24: goto L31c;
                case 25: goto L30f;
                case 26: goto L30a;
                case 27: goto L2f8;
                case 28: goto L2e9;
                case 29: goto L2dc;
                case 30: goto L2c7;
                case 31: goto L2ba;
                case 32: goto L2ad;
                case 33: goto L2a0;
                case 34: goto L293;
                case 35: goto L287;
                case 36: goto L27b;
                case 37: goto L26f;
                case 38: goto L263;
                case 39: goto L257;
                case 40: goto L24b;
                case 41: goto L23f;
                case 42: goto L233;
                case 43: goto L227;
                case 44: goto L214;
                case 45: goto L208;
                case 46: goto L1fc;
                case 47: goto L1f0;
                case 48: goto L1e4;
                case 49: goto L1ce;
                case 50: goto L1bd;
                case 51: goto L1aa;
                case 52: goto L19c;
                case 53: goto L18e;
                case 54: goto L180;
                case 55: goto L172;
                case 56: goto L164;
                case 57: goto L156;
                case 58: goto L148;
                case 59: goto L144;
                case 60: goto L110;
                case 61: goto L107;
                case 62: goto Lfa;
                case 63: goto Le1;
                case 64: goto Ld4;
                case 65: goto Lc7;
                case 66: goto Lba;
                case 67: goto Lad;
                case 68: goto L9c;
                default: goto L94;
            }     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
        L94:
            if (r14 != 0) goto L494
            java.lang.Object r1 = r11.mo10210m()     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            goto L493
        L9c:
            long r4 = m10320B(r4)     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            m9.e1 r2 = r8.m10352o(r3)     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            java.lang.Object r2 = r0.mo9920C(r2, r10)     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
        La8:
            p221m9.C4483q1.m10260x(r9, r4, r2)     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            goto L1b8
        Lad:
            long r4 = m10320B(r4)     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            long r6 = r18.mo9941j()     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            java.lang.Long r2 = java.lang.Long.valueOf(r6)     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            goto La8
        Lba:
            long r4 = m10320B(r4)     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            int r2 = r18.mo9939h()     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            goto La8
        Lc7:
            long r4 = m10320B(r4)     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            long r6 = r18.mo9951t()     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            java.lang.Long r2 = java.lang.Long.valueOf(r6)     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            goto La8
        Ld4:
            long r4 = m10320B(r4)     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            int r2 = r18.mo9921D()     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            goto La8
        Le1:
            int r2 = r18.mo9934c()     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            m9.z$b r5 = r8.m10350m(r3)     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            if (r5 == 0) goto Lf1
            boolean r5 = r5.m10388a(r2)     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            if (r5 == 0) goto L3e5
        Lf1:
            long r4 = m10320B(r4)     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            goto La8
        Lfa:
            long r4 = m10320B(r4)     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            int r2 = r18.mo9956y()     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            goto La8
        L107:
            long r4 = m10320B(r4)     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            m9.h r2 = r18.mo9954w()     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            goto La8
        L110:
            boolean r2 = r8.m10357u(r9, r1, r3)     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            if (r2 == 0) goto L130
            long r5 = m10320B(r4)     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            java.lang.Object r2 = p221m9.C4483q1.m10250n(r9, r5)     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            m9.e1 r5 = r8.m10352o(r3)     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            java.lang.Object r5 = r0.mo9924G(r5, r10)     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            java.lang.Object r2 = p221m9.C4505z.m10387c(r2, r5)     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            long r4 = m10320B(r4)     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            goto La8
        L130:
            long r4 = m10320B(r4)     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            m9.e1 r2 = r8.m10352o(r3)     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            java.lang.Object r2 = r0.mo9924G(r2, r10)     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            p221m9.C4483q1.m10260x(r9, r4, r2)     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            r8.m10341S(r9, r3)     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            goto L1b8
        L144:
            r8.m10339P(r9, r4, r0)     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            goto L1b8
        L148:
            long r4 = m10320B(r4)     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            boolean r2 = r18.mo9948q()     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            goto La8
        L156:
            long r4 = m10320B(r4)     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            int r2 = r18.mo9947p()     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            goto La8
        L164:
            long r4 = m10320B(r4)     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            long r6 = r18.mo9937f()     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            java.lang.Long r2 = java.lang.Long.valueOf(r6)     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            goto La8
        L172:
            long r4 = m10320B(r4)     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            int r2 = r18.mo9957z()     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            goto La8
        L180:
            long r4 = m10320B(r4)     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            long r6 = r18.mo9935d()     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            java.lang.Long r2 = java.lang.Long.valueOf(r6)     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            goto La8
        L18e:
            long r4 = m10320B(r4)     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            long r6 = r18.mo9927J()     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            java.lang.Long r2 = java.lang.Long.valueOf(r6)     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            goto La8
        L19c:
            long r4 = m10320B(r4)     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            float r2 = r18.readFloat()     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            java.lang.Float r2 = java.lang.Float.valueOf(r2)     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            goto La8
        L1aa:
            long r4 = m10320B(r4)     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            double r6 = r18.readDouble()     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            java.lang.Double r2 = java.lang.Double.valueOf(r6)     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            goto La8
        L1b8:
            r8.m10342T(r9, r1, r3)     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            goto L12
        L1bd:
            java.lang.Object r4 = r8.m10351n(r3)     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            r1 = r16
            r2 = r17
            r5 = r19
            r6 = r18
            r1.m10358w(r2, r3, r4, r5, r6)     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            goto L12
        L1ce:
            long r4 = m10320B(r4)     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            m9.e1 r6 = r8.m10352o(r3)     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            r1 = r16
            r2 = r17
            r3 = r4
            r5 = r18
            r7 = r19
            r1.m10337N(r2, r3, r5, r6, r7)     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            goto L12
        L1e4:
            m9.g0 r1 = r8.f18243n     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            long r2 = m10320B(r4)     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
        L1ea:
            java.util.List r1 = r1.mo10002c(r9, r2)     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            goto L29b
        L1f0:
            m9.g0 r1 = r8.f18243n     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            long r2 = m10320B(r4)     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
        L1f6:
            java.util.List r1 = r1.mo10002c(r9, r2)     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            goto L2a8
        L1fc:
            m9.g0 r1 = r8.f18243n     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            long r2 = m10320B(r4)     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
        L202:
            java.util.List r1 = r1.mo10002c(r9, r2)     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            goto L2b5
        L208:
            m9.g0 r1 = r8.f18243n     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            long r2 = m10320B(r4)     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
        L20e:
            java.util.List r1 = r1.mo10002c(r9, r2)     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            goto L2c2
        L214:
            m9.g0 r2 = r8.f18243n     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            long r4 = m10320B(r4)     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            java.util.List r2 = r2.mo10002c(r9, r4)     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            r0.mo9931N(r2)     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
        L221:
            m9.z$b r3 = r8.m10350m(r3)     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            goto L2d6
        L227:
            m9.g0 r1 = r8.f18243n     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            long r2 = m10320B(r4)     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
        L22d:
            java.util.List r1 = r1.mo10002c(r9, r2)     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            goto L2e4
        L233:
            m9.g0 r1 = r8.f18243n     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            long r2 = m10320B(r4)     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
        L239:
            java.util.List r1 = r1.mo10002c(r9, r2)     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            goto L317
        L23f:
            m9.g0 r1 = r8.f18243n     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            long r2 = m10320B(r4)     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
        L245:
            java.util.List r1 = r1.mo10002c(r9, r2)     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            goto L324
        L24b:
            m9.g0 r1 = r8.f18243n     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            long r2 = m10320B(r4)     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
        L251:
            java.util.List r1 = r1.mo10002c(r9, r2)     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            goto L331
        L257:
            m9.g0 r1 = r8.f18243n     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            long r2 = m10320B(r4)     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
        L25d:
            java.util.List r1 = r1.mo10002c(r9, r2)     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            goto L33e
        L263:
            m9.g0 r1 = r8.f18243n     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            long r2 = m10320B(r4)     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
        L269:
            java.util.List r1 = r1.mo10002c(r9, r2)     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            goto L34b
        L26f:
            m9.g0 r1 = r8.f18243n     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            long r2 = m10320B(r4)     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
        L275:
            java.util.List r1 = r1.mo10002c(r9, r2)     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            goto L358
        L27b:
            m9.g0 r1 = r8.f18243n     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            long r2 = m10320B(r4)     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
        L281:
            java.util.List r1 = r1.mo10002c(r9, r2)     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            goto L365
        L287:
            m9.g0 r1 = r8.f18243n     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            long r2 = m10320B(r4)     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
        L28d:
            java.util.List r1 = r1.mo10002c(r9, r2)     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            goto L372
        L293:
            m9.g0 r1 = r8.f18243n     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            long r2 = m10320B(r4)     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            goto L1ea
        L29b:
            r0.mo9940i(r1)     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            goto L12
        L2a0:
            m9.g0 r1 = r8.f18243n     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            long r2 = m10320B(r4)     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            goto L1f6
        L2a8:
            r0.mo9933b(r1)     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            goto L12
        L2ad:
            m9.g0 r1 = r8.f18243n     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            long r2 = m10320B(r4)     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            goto L202
        L2b5:
            r0.mo9926I(r1)     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            goto L12
        L2ba:
            m9.g0 r1 = r8.f18243n     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            long r2 = m10320B(r4)     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            goto L20e
        L2c2:
            r0.mo9938g(r1)     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            goto L12
        L2c7:
            m9.g0 r2 = r8.f18243n     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            long r4 = m10320B(r4)     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            java.util.List r2 = r2.mo10002c(r9, r4)     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            r0.mo9931N(r2)     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            goto L221
        L2d6:
            java.lang.Object r14 = p221m9.C4453g1.m10050y(r1, r2, r3, r14, r11)     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            goto L12
        L2dc:
            m9.g0 r1 = r8.f18243n     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            long r2 = m10320B(r4)     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            goto L22d
        L2e4:
            r0.mo9942k(r1)     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            goto L12
        L2e9:
            m9.g0 r1 = r8.f18243n     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            long r2 = m10320B(r4)     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            java.util.List r1 = r1.mo10002c(r9, r2)     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            r0.mo9922E(r1)     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            goto L12
        L2f8:
            m9.e1 r5 = r8.m10352o(r3)     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            r1 = r16
            r2 = r17
            r3 = r4
            r4 = r18
            r6 = r19
            r1.m10338O(r2, r3, r4, r5, r6)     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            goto L12
        L30a:
            r8.m10340Q(r9, r4, r0)     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            goto L12
        L30f:
            m9.g0 r1 = r8.f18243n     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            long r2 = m10320B(r4)     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            goto L239
        L317:
            r0.mo9943l(r1)     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            goto L12
        L31c:
            m9.g0 r1 = r8.f18243n     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            long r2 = m10320B(r4)     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            goto L245
        L324:
            r0.mo9936e(r1)     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            goto L12
        L329:
            m9.g0 r1 = r8.f18243n     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            long r2 = m10320B(r4)     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            goto L251
        L331:
            r0.mo9929L(r1)     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            goto L12
        L336:
            m9.g0 r1 = r8.f18243n     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            long r2 = m10320B(r4)     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            goto L25d
        L33e:
            r0.mo9930M(r1)     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            goto L12
        L343:
            m9.g0 r1 = r8.f18243n     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            long r2 = m10320B(r4)     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            goto L269
        L34b:
            r0.mo9952u(r1)     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            goto L12
        L350:
            m9.g0 r1 = r8.f18243n     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            long r2 = m10320B(r4)     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            goto L275
        L358:
            r0.mo9925H(r1)     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            goto L12
        L35d:
            m9.g0 r1 = r8.f18243n     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            long r2 = m10320B(r4)     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            goto L281
        L365:
            r0.mo9955x(r1)     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            goto L12
        L36a:
            m9.g0 r1 = r8.f18243n     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            long r2 = m10320B(r4)     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            goto L28d
        L372:
            r0.mo9923F(r1)     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            goto L12
        L377:
            boolean r1 = r8.m10355s(r9, r3)     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            if (r1 == 0) goto L397
            long r1 = m10320B(r4)     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            java.lang.Object r1 = p221m9.C4483q1.m10250n(r9, r1)     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            m9.e1 r2 = r8.m10352o(r3)     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            java.lang.Object r2 = r0.mo9920C(r2, r10)     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            java.lang.Object r1 = p221m9.C4505z.m10387c(r1, r2)     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
        L391:
            long r2 = m10320B(r4)     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            goto L422
        L397:
            long r1 = m10320B(r4)     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            m9.e1 r4 = r8.m10352o(r3)     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            java.lang.Object r4 = r0.mo9920C(r4, r10)     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
        L3a3:
            p221m9.C4483q1.m10260x(r9, r1, r4)     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            goto L48e
        L3a8:
            long r1 = m10320B(r4)     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            long r4 = r18.mo9941j()     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
        L3b0:
            p221m9.C4483q1.m10259w(r9, r1, r4)     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            goto L48e
        L3b5:
            long r1 = m10320B(r4)     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            int r4 = r18.mo9939h()     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
        L3bd:
            p221m9.C4483q1.m10258v(r9, r1, r4)     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            goto L48e
        L3c2:
            long r1 = m10320B(r4)     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            long r4 = r18.mo9951t()     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            goto L3b0
        L3cb:
            long r1 = m10320B(r4)     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            int r4 = r18.mo9921D()     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            goto L3bd
        L3d4:
            int r2 = r18.mo9934c()     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            m9.z$b r5 = r8.m10350m(r3)     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            if (r5 == 0) goto L3eb
            boolean r5 = r5.m10388a(r2)     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            if (r5 == 0) goto L3e5
            goto L3eb
        L3e5:
            java.lang.Object r14 = p221m9.C4453g1.m10007C(r1, r2, r14, r11)     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            goto L12
        L3eb:
            long r4 = m10320B(r4)     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            p221m9.C4483q1.m10258v(r9, r4, r2)     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            goto L48e
        L3f4:
            long r1 = m10320B(r4)     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            int r4 = r18.mo9956y()     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            goto L3bd
        L3fd:
            long r1 = m10320B(r4)     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            m9.h r4 = r18.mo9954w()     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            goto L3a3
        L406:
            boolean r1 = r8.m10355s(r9, r3)     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            if (r1 == 0) goto L427
            long r1 = m10320B(r4)     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            java.lang.Object r1 = p221m9.C4483q1.m10250n(r9, r1)     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            m9.e1 r2 = r8.m10352o(r3)     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            java.lang.Object r2 = r0.mo9924G(r2, r10)     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            java.lang.Object r1 = p221m9.C4505z.m10387c(r1, r2)     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            goto L391
        L422:
            p221m9.C4483q1.m10260x(r9, r2, r1)     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            goto L12
        L427:
            long r1 = m10320B(r4)     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            m9.e1 r4 = r8.m10352o(r3)     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            java.lang.Object r4 = r0.mo9924G(r4, r10)     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            goto L3a3
        L435:
            r8.m10339P(r9, r4, r0)     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            goto L48e
        L439:
            long r1 = m10320B(r4)     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            boolean r4 = r18.mo9948q()     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            p221m9.C4483q1.m10252p(r9, r1, r4)     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            goto L48e
        L445:
            long r1 = m10320B(r4)     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            int r4 = r18.mo9947p()     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            goto L3bd
        L44f:
            long r1 = m10320B(r4)     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            long r4 = r18.mo9937f()     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            goto L3b0
        L459:
            long r1 = m10320B(r4)     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            int r4 = r18.mo9957z()     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            goto L3bd
        L463:
            long r1 = m10320B(r4)     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            long r4 = r18.mo9935d()     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            goto L3b0
        L46d:
            long r1 = m10320B(r4)     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            long r4 = r18.mo9927J()     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            goto L3b0
        L477:
            long r1 = m10320B(r4)     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            float r4 = r18.readFloat()     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            p221m9.C4483q1.m10257u(r9, r1, r4)     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            goto L48e
        L483:
            long r1 = m10320B(r4)     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            double r4 = r18.readDouble()     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            p221m9.C4483q1.m10256t(r9, r1, r4)     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
        L48e:
            r8.m10341S(r9, r3)     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            goto L12
        L493:
            r14 = r1
        L494:
            boolean r1 = r11.m10209l(r14, r0)     // Catch: p221m9.C4434a0.a -> L4ae java.lang.Throwable -> L4f0
            if (r1 != 0) goto L12
            int r0 = r8.f18240k
        L49c:
            int r1 = r8.f18241l
            if (r0 >= r1) goto L4aa
            int[] r1 = r8.f18239j
            r1 = r1[r0]
            r8.m10349l(r9, r1, r14, r11)
            int r0 = r0 + 1
            goto L49c
        L4aa:
            if (r14 == 0) goto L4ef
            goto L33
        L4ae:
            boolean r1 = r11.mo10213p(r0)     // Catch: java.lang.Throwable -> L4f0
            if (r1 == 0) goto L4ce
            boolean r1 = r18.mo9919B()     // Catch: java.lang.Throwable -> L4f0
            if (r1 != 0) goto L12
            int r0 = r8.f18240k
        L4bc:
            int r1 = r8.f18241l
            if (r0 >= r1) goto L4ca
            int[] r1 = r8.f18239j
            r1 = r1[r0]
            r8.m10349l(r9, r1, r14, r11)
            int r0 = r0 + 1
            goto L4bc
        L4ca:
            if (r14 == 0) goto L4ef
            goto L33
        L4ce:
            if (r14 != 0) goto L4d5
            java.lang.Object r1 = r11.mo10203f(r9)     // Catch: java.lang.Throwable -> L4f0
            r14 = r1
        L4d5:
            boolean r1 = r11.m10209l(r14, r0)     // Catch: java.lang.Throwable -> L4f0
            if (r1 != 0) goto L12
            int r0 = r8.f18240k
        L4dd:
            int r1 = r8.f18241l
            if (r0 >= r1) goto L4eb
            int[] r1 = r8.f18239j
            r1 = r1[r0]
            r8.m10349l(r9, r1, r14, r11)
            int r0 = r0 + 1
            goto L4dd
        L4eb:
            if (r14 == 0) goto L4ef
            goto L33
        L4ef:
            return
        L4f0:
            r0 = move-exception
            int r1 = r8.f18240k
        L4f3:
            int r2 = r8.f18241l
            if (r1 >= r2) goto L501
            int[] r2 = r8.f18239j
            r2 = r2[r1]
            r8.m10349l(r9, r2, r14, r11)
            int r1 = r1 + 1
            goto L4f3
        L501:
            if (r14 == 0) goto L506
            r11.mo10211n(r9, r14)
        L506:
            throw r0
    }

    @Override // p221m9.InterfaceC4447e1
    /* renamed from: j */
    public int mo9995j(T r9) {
            r8 = this;
            int[] r0 = r8.f18230a
            int r0 = r0.length
            r1 = 0
            r2 = 0
        L5:
            if (r1 >= r0) goto L12d
            int r3 = r8.m10344W(r1)
            int[] r4 = r8.f18230a
            r4 = r4[r1]
            long r5 = m10320B(r3)
            int r3 = m10327V(r3)
            r7 = 37
            switch(r3) {
                case 0: goto L119;
                case 1: goto L10e;
                case 2: goto L107;
                case 3: goto L107;
                case 4: goto L100;
                case 5: goto L107;
                case 6: goto L100;
                case 7: goto Lf5;
                case 8: goto Le8;
                case 9: goto Lda;
                case 10: goto Lcf;
                case 11: goto L100;
                case 12: goto L100;
                case 13: goto L100;
                case 14: goto L107;
                case 15: goto L100;
                case 16: goto L107;
                case 17: goto Lc8;
                case 18: goto Lcf;
                case 19: goto Lcf;
                case 20: goto Lcf;
                case 21: goto Lcf;
                case 22: goto Lcf;
                case 23: goto Lcf;
                case 24: goto Lcf;
                case 25: goto Lcf;
                case 26: goto Lcf;
                case 27: goto Lcf;
                case 28: goto Lcf;
                case 29: goto Lcf;
                case 30: goto Lcf;
                case 31: goto Lcf;
                case 32: goto Lcf;
                case 33: goto Lcf;
                case 34: goto Lcf;
                case 35: goto Lcf;
                case 36: goto Lcf;
                case 37: goto Lcf;
                case 38: goto Lcf;
                case 39: goto Lcf;
                case 40: goto Lcf;
                case 41: goto Lcf;
                case 42: goto Lcf;
                case 43: goto Lcf;
                case 44: goto Lcf;
                case 45: goto Lcf;
                case 46: goto Lcf;
                case 47: goto Lcf;
                case 48: goto Lcf;
                case 49: goto Lcf;
                case 50: goto Lcf;
                case 51: goto Lbb;
                case 52: goto Lae;
                case 53: goto La0;
                case 54: goto L99;
                case 55: goto L8b;
                case 56: goto L84;
                case 57: goto L7d;
                case 58: goto L6f;
                case 59: goto L67;
                case 60: goto L59;
                case 61: goto L51;
                case 62: goto L4a;
                case 63: goto L43;
                case 64: goto L3c;
                case 65: goto L34;
                case 66: goto L2d;
                case 67: goto L25;
                case 68: goto L1e;
                default: goto L1c;
            }
        L1c:
            goto L129
        L1e:
            boolean r3 = r8.m10357u(r9, r4, r1)
            if (r3 == 0) goto L129
            goto L5f
        L25:
            boolean r3 = r8.m10357u(r9, r4, r1)
            if (r3 == 0) goto L129
            goto La6
        L2d:
            boolean r3 = r8.m10357u(r9, r4, r1)
            if (r3 == 0) goto L129
            goto L91
        L34:
            boolean r3 = r8.m10357u(r9, r4, r1)
            if (r3 == 0) goto L129
            goto La6
        L3c:
            boolean r3 = r8.m10357u(r9, r4, r1)
            if (r3 == 0) goto L129
            goto L91
        L43:
            boolean r3 = r8.m10357u(r9, r4, r1)
            if (r3 == 0) goto L129
            goto L91
        L4a:
            boolean r3 = r8.m10357u(r9, r4, r1)
            if (r3 == 0) goto L129
            goto L91
        L51:
            boolean r3 = r8.m10357u(r9, r4, r1)
            if (r3 == 0) goto L129
            goto Lcf
        L59:
            boolean r3 = r8.m10357u(r9, r4, r1)
            if (r3 == 0) goto L129
        L5f:
            java.lang.Object r3 = p221m9.C4483q1.m10250n(r9, r5)
            int r2 = r2 * 53
            goto Ld5
        L67:
            boolean r3 = r8.m10357u(r9, r4, r1)
            if (r3 == 0) goto L129
            goto Le8
        L6f:
            boolean r3 = r8.m10357u(r9, r4, r1)
            if (r3 == 0) goto L129
            int r2 = r2 * 53
            boolean r3 = m10321C(r9, r5)
            goto Lfb
        L7d:
            boolean r3 = r8.m10357u(r9, r4, r1)
            if (r3 == 0) goto L129
            goto L91
        L84:
            boolean r3 = r8.m10357u(r9, r4, r1)
            if (r3 == 0) goto L129
            goto La6
        L8b:
            boolean r3 = r8.m10357u(r9, r4, r1)
            if (r3 == 0) goto L129
        L91:
            int r2 = r2 * 53
            int r3 = m10324F(r9, r5)
            goto L127
        L99:
            boolean r3 = r8.m10357u(r9, r4, r1)
            if (r3 == 0) goto L129
            goto La6
        La0:
            boolean r3 = r8.m10357u(r9, r4, r1)
            if (r3 == 0) goto L129
        La6:
            int r2 = r2 * 53
            long r3 = m10325G(r9, r5)
            goto L123
        Lae:
            boolean r3 = r8.m10357u(r9, r4, r1)
            if (r3 == 0) goto L129
            int r2 = r2 * 53
            float r3 = m10323E(r9, r5)
            goto L114
        Lbb:
            boolean r3 = r8.m10357u(r9, r4, r1)
            if (r3 == 0) goto L129
            int r2 = r2 * 53
            double r3 = m10322D(r9, r5)
            goto L11f
        Lc8:
            java.lang.Object r3 = p221m9.C4483q1.m10250n(r9, r5)
            if (r3 == 0) goto Le4
            goto Le0
        Lcf:
            int r2 = r2 * 53
            java.lang.Object r3 = p221m9.C4483q1.m10250n(r9, r5)
        Ld5:
            int r3 = r3.hashCode()
            goto L127
        Lda:
            java.lang.Object r3 = p221m9.C4483q1.m10250n(r9, r5)
            if (r3 == 0) goto Le4
        Le0:
            int r7 = r3.hashCode()
        Le4:
            int r2 = r2 * 53
            int r2 = r2 + r7
            goto L129
        Le8:
            int r2 = r2 * 53
            java.lang.Object r3 = p221m9.C4483q1.m10250n(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L127
        Lf5:
            int r2 = r2 * 53
            boolean r3 = p221m9.C4483q1.m10242f(r9, r5)
        Lfb:
            int r3 = p221m9.C4505z.m10385a(r3)
            goto L127
        L100:
            int r2 = r2 * 53
            int r3 = p221m9.C4483q1.m10248l(r9, r5)
            goto L127
        L107:
            int r2 = r2 * 53
            long r3 = p221m9.C4483q1.m10249m(r9, r5)
            goto L123
        L10e:
            int r2 = r2 * 53
            float r3 = p221m9.C4483q1.m10247k(r9, r5)
        L114:
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L127
        L119:
            int r2 = r2 * 53
            double r3 = p221m9.C4483q1.m10246j(r9, r5)
        L11f:
            long r3 = java.lang.Double.doubleToLongBits(r3)
        L123:
            int r3 = p221m9.C4505z.m10386b(r3)
        L127:
            int r3 = r3 + r2
            r2 = r3
        L129:
            int r1 = r1 + 3
            goto L5
        L12d:
            int r2 = r2 * 53
            m9.m1<?, ?> r0 = r8.f18244o
            java.lang.Object r0 = r0.mo10204g(r9)
            int r0 = r0.hashCode()
            int r0 = r0 + r2
            boolean r1 = r8.f18235f
            if (r1 == 0) goto L14b
            int r0 = r0 * 53
            m9.q<?> r1 = r8.f18245p
            m9.t r9 = r1.mo10225c(r9)
            int r9 = r9.hashCode()
            int r0 = r0 + r9
        L14b:
            return r0
    }

    /* renamed from: k */
    public final boolean m10348k(T r1, T r2, int r3) {
            r0 = this;
            boolean r1 = r0.m10355s(r1, r3)
            boolean r2 = r0.m10355s(r2, r3)
            if (r1 != r2) goto Lc
            r1 = 1
            goto Ld
        Lc:
            r1 = 0
        Ld:
            return r1
    }

    /* renamed from: l */
    public final <UT, UB> UB m10349l(java.lang.Object r4, int r5, UB r6, p221m9.AbstractC4471m1<UT, UB> r7) {
            r3 = this;
            int[] r0 = r3.f18230a
            r1 = r0[r5]
            int r1 = r5 + 1
            r0 = r0[r1]
            long r0 = m10320B(r0)
            java.lang.Object r4 = p221m9.C4483q1.m10250n(r4, r0)
            if (r4 != 0) goto L13
            return r6
        L13:
            java.lang.Object[] r0 = r3.f18231b
            int r5 = r5 / 3
            int r5 = r5 * 2
            int r1 = r5 + 1
            r0 = r0[r1]
            m9.z$b r0 = (p221m9.C4505z.b) r0
            if (r0 != 0) goto L22
            return r6
        L22:
            m9.l0 r1 = r3.f18246q
            java.util.Map r4 = r1.mo10194h(r4)
            m9.l0 r1 = r3.f18246q
            java.lang.Object[] r2 = r3.f18231b
            r5 = r2[r5]
            r1.mo10192f(r5)
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L39:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L65
            java.lang.Object r5 = r4.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r1 = r5.getValue()
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            boolean r1 = r0.m10388a(r1)
            if (r1 != 0) goto L39
            if (r6 != 0) goto L5a
            r7.mo10210m()
        L5a:
            r5.getKey()
            r5.getValue()
            r4 = 0
            java.util.Objects.requireNonNull(r4)
            throw r4
        L65:
            return r6
    }

    /* renamed from: m */
    public final p221m9.C4505z.b m10350m(int r2) {
            r1 = this;
            java.lang.Object[] r0 = r1.f18231b
            int r2 = r2 / 3
            int r2 = r2 * 2
            int r2 = r2 + 1
            r2 = r0[r2]
            m9.z$b r2 = (p221m9.C4505z.b) r2
            return r2
    }

    /* renamed from: n */
    public final java.lang.Object m10351n(int r2) {
            r1 = this;
            java.lang.Object[] r0 = r1.f18231b
            int r2 = r2 / 3
            int r2 = r2 * 2
            r2 = r0[r2]
            return r2
    }

    /* renamed from: o */
    public final p221m9.InterfaceC4447e1 m10352o(int r4) {
            r3 = this;
            int r4 = r4 / 3
            int r4 = r4 * 2
            java.lang.Object[] r0 = r3.f18231b
            r1 = r0[r4]
            m9.e1 r1 = (p221m9.InterfaceC4447e1) r1
            if (r1 == 0) goto Ld
            return r1
        Ld:
            m9.a1 r1 = p221m9.C4435a1.f18092c
            int r2 = r4 + 1
            r0 = r0[r2]
            java.lang.Class r0 = (java.lang.Class) r0
            m9.e1 r0 = r1.m9903a(r0)
            java.lang.Object[] r1 = r3.f18231b
            r1[r4] = r0
            return r0
    }

    /* renamed from: q */
    public final int m10353q(T r17) {
            r16 = this;
            r0 = r16
            r1 = r17
            sun.misc.Unsafe r2 = p221m9.C4491t0.f18229s
            r3 = -1
            r4 = 0
            r5 = 0
            r6 = 0
        La:
            int[] r7 = r0.f18230a
            int r7 = r7.length
            if (r4 >= r7) goto L3de
            int r7 = r0.m10344W(r4)
            int[] r8 = r0.f18230a
            r8 = r8[r4]
            int r9 = m10327V(r7)
            r10 = 17
            r11 = 1048575(0xfffff, float:1.469367E-39)
            r12 = 1
            if (r9 > r10) goto L36
            int[] r10 = r0.f18230a
            int r13 = r4 + 2
            r10 = r10[r13]
            r11 = r11 & r10
            int r13 = r10 >>> 20
            int r12 = r12 << r13
            if (r11 == r3) goto L50
            long r13 = (long) r11
            int r6 = r2.getInt(r1, r13)
            r3 = r11
            goto L50
        L36:
            boolean r10 = r0.f18238i
            if (r10 == 0) goto L4e
            m9.u r10 = p221m9.EnumC4493u.f18268a0
            int r10 = r10.f18272Y
            if (r9 < r10) goto L4e
            m9.u r10 = p221m9.EnumC4493u.f18269b0
            int r10 = r10.f18272Y
            if (r9 > r10) goto L4e
            int[] r10 = r0.f18230a
            int r12 = r4 + 2
            r10 = r10[r12]
            r10 = r10 & r11
            goto L4f
        L4e:
            r10 = 0
        L4f:
            r12 = 0
        L50:
            long r13 = m10320B(r7)
            r7 = 0
            r15 = r12
            r11 = 0
            switch(r9) {
                case 0: goto L3d1;
                case 1: goto L3c8;
                case 2: goto L3bb;
                case 3: goto L3ae;
                case 4: goto L3a1;
                case 5: goto L396;
                case 6: goto L38c;
                case 7: goto L382;
                case 8: goto L367;
                case 9: goto L355;
                case 10: goto L345;
                case 11: goto L337;
                case 12: goto L329;
                case 13: goto L31e;
                case 14: goto L312;
                case 15: goto L304;
                case 16: goto L2f6;
                case 17: goto L2e2;
                case 18: goto L2d5;
                case 19: goto L2c8;
                case 20: goto L2bb;
                case 21: goto L2ae;
                case 22: goto L2a1;
                case 23: goto L2d5;
                case 24: goto L2c8;
                case 25: goto L294;
                case 26: goto L288;
                case 27: goto L278;
                case 28: goto L26c;
                case 29: goto L25f;
                case 30: goto L252;
                case 31: goto L2c8;
                case 32: goto L2d5;
                case 33: goto L245;
                case 34: goto L238;
                case 35: goto L217;
                case 36: goto L206;
                case 37: goto L1f5;
                case 38: goto L1e4;
                case 39: goto L1d3;
                case 40: goto L1c2;
                case 41: goto L1b1;
                case 42: goto L19d;
                case 43: goto L18b;
                case 44: goto L179;
                case 45: goto L167;
                case 46: goto L155;
                case 47: goto L143;
                case 48: goto L131;
                case 49: goto L121;
                case 50: goto L111;
                case 51: goto L109;
                case 52: goto L101;
                case 53: goto Lf5;
                case 54: goto Le9;
                case 55: goto Ldd;
                case 56: goto Ld5;
                case 57: goto Lcd;
                case 58: goto Lc5;
                case 59: goto Lb5;
                case 60: goto Lad;
                case 61: goto La5;
                case 62: goto L99;
                case 63: goto L8d;
                case 64: goto L85;
                case 65: goto L7d;
                case 66: goto L71;
                case 67: goto L65;
                case 68: goto L5d;
                default: goto L5b;
            }
        L5b:
            goto L3da
        L5d:
            boolean r7 = r0.m10357u(r1, r8, r4)
            if (r7 == 0) goto L3da
            goto L2e6
        L65:
            boolean r7 = r0.m10357u(r1, r8, r4)
            if (r7 == 0) goto L3da
            long r9 = m10325G(r1, r13)
            goto L2fe
        L71:
            boolean r7 = r0.m10357u(r1, r8, r4)
            if (r7 == 0) goto L3da
            int r7 = m10324F(r1, r13)
            goto L30c
        L7d:
            boolean r7 = r0.m10357u(r1, r8, r4)
            if (r7 == 0) goto L3da
            goto L316
        L85:
            boolean r7 = r0.m10357u(r1, r8, r4)
            if (r7 == 0) goto L3da
            goto L322
        L8d:
            boolean r7 = r0.m10357u(r1, r8, r4)
            if (r7 == 0) goto L3da
            int r7 = m10324F(r1, r13)
            goto L331
        L99:
            boolean r7 = r0.m10357u(r1, r8, r4)
            if (r7 == 0) goto L3da
            int r7 = m10324F(r1, r13)
            goto L33f
        La5:
            boolean r7 = r0.m10357u(r1, r8, r4)
            if (r7 == 0) goto L3da
            goto L349
        Lad:
            boolean r7 = r0.m10357u(r1, r8, r4)
            if (r7 == 0) goto L3da
            goto L359
        Lb5:
            boolean r7 = r0.m10357u(r1, r8, r4)
            if (r7 == 0) goto L3da
            java.lang.Object r7 = r2.getObject(r1, r13)
            boolean r9 = r7 instanceof p221m9.AbstractC4454h
            if (r9 == 0) goto L37a
            goto L373
        Lc5:
            boolean r7 = r0.m10357u(r1, r8, r4)
            if (r7 == 0) goto L3da
            goto L386
        Lcd:
            boolean r7 = r0.m10357u(r1, r8, r4)
            if (r7 == 0) goto L3da
            goto L390
        Ld5:
            boolean r7 = r0.m10357u(r1, r8, r4)
            if (r7 == 0) goto L3da
            goto L39a
        Ldd:
            boolean r7 = r0.m10357u(r1, r8, r4)
            if (r7 == 0) goto L3da
            int r7 = m10324F(r1, r13)
            goto L3a9
        Le9:
            boolean r7 = r0.m10357u(r1, r8, r4)
            if (r7 == 0) goto L3da
            long r9 = m10325G(r1, r13)
            goto L3b6
        Lf5:
            boolean r7 = r0.m10357u(r1, r8, r4)
            if (r7 == 0) goto L3da
            long r9 = m10325G(r1, r13)
            goto L3c3
        L101:
            boolean r9 = r0.m10357u(r1, r8, r4)
            if (r9 == 0) goto L3da
            goto L3cc
        L109:
            boolean r7 = r0.m10357u(r1, r8, r4)
            if (r7 == 0) goto L3da
            goto L3d5
        L111:
            m9.l0 r7 = r0.f18246q
            java.lang.Object r9 = r2.getObject(r1, r13)
            java.lang.Object r10 = r0.m10351n(r4)
            int r7 = r7.mo10189c(r8, r9, r10)
            goto L3d9
        L121:
            java.lang.Object r7 = r2.getObject(r1, r13)
            java.util.List r7 = (java.util.List) r7
            m9.e1 r9 = r0.m10352o(r4)
            int r7 = p221m9.C4453g1.m10034i(r8, r7, r9)
            goto L3d9
        L131:
            java.lang.Object r7 = r2.getObject(r1, r13)
            java.util.List r7 = (java.util.List) r7
            int r7 = p221m9.C4453g1.m10044s(r7)
            if (r7 <= 0) goto L3da
            boolean r9 = r0.f18238i
            if (r9 == 0) goto L22b
            goto L227
        L143:
            java.lang.Object r7 = r2.getObject(r1, r13)
            java.util.List r7 = (java.util.List) r7
            int r7 = p221m9.C4453g1.m10042q(r7)
            if (r7 <= 0) goto L3da
            boolean r9 = r0.f18238i
            if (r9 == 0) goto L22b
            goto L227
        L155:
            java.lang.Object r7 = r2.getObject(r1, r13)
            java.util.List r7 = (java.util.List) r7
            int r7 = p221m9.C4453g1.m10033h(r7)
            if (r7 <= 0) goto L3da
            boolean r9 = r0.f18238i
            if (r9 == 0) goto L22b
            goto L227
        L167:
            java.lang.Object r7 = r2.getObject(r1, r13)
            java.util.List r7 = (java.util.List) r7
            int r7 = p221m9.C4453g1.m10031f(r7)
            if (r7 <= 0) goto L3da
            boolean r9 = r0.f18238i
            if (r9 == 0) goto L22b
            goto L227
        L179:
            java.lang.Object r7 = r2.getObject(r1, r13)
            java.util.List r7 = (java.util.List) r7
            int r7 = p221m9.C4453g1.m10029d(r7)
            if (r7 <= 0) goto L3da
            boolean r9 = r0.f18238i
            if (r9 == 0) goto L22b
            goto L227
        L18b:
            java.lang.Object r7 = r2.getObject(r1, r13)
            java.util.List r7 = (java.util.List) r7
            int r7 = p221m9.C4453g1.m10047v(r7)
            if (r7 <= 0) goto L3da
            boolean r9 = r0.f18238i
            if (r9 == 0) goto L22b
            goto L227
        L19d:
            java.lang.Object r7 = r2.getObject(r1, r13)
            java.util.List r7 = (java.util.List) r7
            java.lang.Class<?> r9 = p221m9.C4453g1.f18135a
            int r7 = r7.size()
            if (r7 <= 0) goto L3da
            boolean r9 = r0.f18238i
            if (r9 == 0) goto L22b
            goto L227
        L1b1:
            java.lang.Object r7 = r2.getObject(r1, r13)
            java.util.List r7 = (java.util.List) r7
            int r7 = p221m9.C4453g1.m10031f(r7)
            if (r7 <= 0) goto L3da
            boolean r9 = r0.f18238i
            if (r9 == 0) goto L22b
            goto L227
        L1c2:
            java.lang.Object r7 = r2.getObject(r1, r13)
            java.util.List r7 = (java.util.List) r7
            int r7 = p221m9.C4453g1.m10033h(r7)
            if (r7 <= 0) goto L3da
            boolean r9 = r0.f18238i
            if (r9 == 0) goto L22b
            goto L227
        L1d3:
            java.lang.Object r7 = r2.getObject(r1, r13)
            java.util.List r7 = (java.util.List) r7
            int r7 = p221m9.C4453g1.m10036k(r7)
            if (r7 <= 0) goto L3da
            boolean r9 = r0.f18238i
            if (r9 == 0) goto L22b
            goto L227
        L1e4:
            java.lang.Object r7 = r2.getObject(r1, r13)
            java.util.List r7 = (java.util.List) r7
            int r7 = p221m9.C4453g1.m10049x(r7)
            if (r7 <= 0) goto L3da
            boolean r9 = r0.f18238i
            if (r9 == 0) goto L22b
            goto L227
        L1f5:
            java.lang.Object r7 = r2.getObject(r1, r13)
            java.util.List r7 = (java.util.List) r7
            int r7 = p221m9.C4453g1.m10038m(r7)
            if (r7 <= 0) goto L3da
            boolean r9 = r0.f18238i
            if (r9 == 0) goto L22b
            goto L227
        L206:
            java.lang.Object r7 = r2.getObject(r1, r13)
            java.util.List r7 = (java.util.List) r7
            int r7 = p221m9.C4453g1.m10031f(r7)
            if (r7 <= 0) goto L3da
            boolean r9 = r0.f18238i
            if (r9 == 0) goto L22b
            goto L227
        L217:
            java.lang.Object r7 = r2.getObject(r1, r13)
            java.util.List r7 = (java.util.List) r7
            int r7 = p221m9.C4453g1.m10033h(r7)
            if (r7 <= 0) goto L3da
            boolean r9 = r0.f18238i
            if (r9 == 0) goto L22b
        L227:
            long r9 = (long) r10
            r2.putInt(r1, r9, r7)
        L22b:
            int r8 = p221m9.AbstractC4463k.m10131F(r8)
            int r9 = p221m9.AbstractC4463k.m10133H(r7)
            int r9 = r9 + r8
            int r9 = r9 + r7
            int r5 = r5 + r9
            goto L3da
        L238:
            java.lang.Object r7 = r2.getObject(r1, r13)
            java.util.List r7 = (java.util.List) r7
            r9 = 0
            int r7 = p221m9.C4453g1.m10043r(r8, r7, r9)
            goto L3d9
        L245:
            r7 = 0
            java.lang.Object r9 = r2.getObject(r1, r13)
            java.util.List r9 = (java.util.List) r9
            int r7 = p221m9.C4453g1.m10041p(r8, r9, r7)
            goto L3d9
        L252:
            r7 = 0
            java.lang.Object r9 = r2.getObject(r1, r13)
            java.util.List r9 = (java.util.List) r9
            int r7 = p221m9.C4453g1.m10028c(r8, r9, r7)
            goto L3d9
        L25f:
            r7 = 0
            java.lang.Object r9 = r2.getObject(r1, r13)
            java.util.List r9 = (java.util.List) r9
            int r7 = p221m9.C4453g1.m10046u(r8, r9, r7)
            goto L3d9
        L26c:
            java.lang.Object r7 = r2.getObject(r1, r13)
            java.util.List r7 = (java.util.List) r7
            int r7 = p221m9.C4453g1.m10027b(r8, r7)
            goto L3d9
        L278:
            java.lang.Object r7 = r2.getObject(r1, r13)
            java.util.List r7 = (java.util.List) r7
            m9.e1 r9 = r0.m10352o(r4)
            int r7 = p221m9.C4453g1.m10040o(r8, r7, r9)
            goto L3d9
        L288:
            java.lang.Object r7 = r2.getObject(r1, r13)
            java.util.List r7 = (java.util.List) r7
            int r7 = p221m9.C4453g1.m10045t(r8, r7)
            goto L3d9
        L294:
            java.lang.Object r7 = r2.getObject(r1, r13)
            java.util.List r7 = (java.util.List) r7
            r9 = 0
            int r7 = p221m9.C4453g1.m10026a(r8, r7, r9)
            goto L3d9
        L2a1:
            r7 = 0
            java.lang.Object r9 = r2.getObject(r1, r13)
            java.util.List r9 = (java.util.List) r9
            int r7 = p221m9.C4453g1.m10035j(r8, r9, r7)
            goto L3d9
        L2ae:
            r7 = 0
            java.lang.Object r9 = r2.getObject(r1, r13)
            java.util.List r9 = (java.util.List) r9
            int r7 = p221m9.C4453g1.m10048w(r8, r9, r7)
            goto L3d9
        L2bb:
            r7 = 0
            java.lang.Object r9 = r2.getObject(r1, r13)
            java.util.List r9 = (java.util.List) r9
            int r7 = p221m9.C4453g1.m10037l(r8, r9, r7)
            goto L3d9
        L2c8:
            r7 = 0
            java.lang.Object r9 = r2.getObject(r1, r13)
            java.util.List r9 = (java.util.List) r9
            int r7 = p221m9.C4453g1.m10030e(r8, r9, r7)
            goto L3d9
        L2d5:
            r7 = 0
            java.lang.Object r9 = r2.getObject(r1, r13)
            java.util.List r9 = (java.util.List) r9
            int r7 = p221m9.C4453g1.m10032g(r8, r9, r7)
            goto L3d9
        L2e2:
            r7 = r6 & r15
            if (r7 == 0) goto L3da
        L2e6:
            java.lang.Object r7 = r2.getObject(r1, r13)
            m9.q0 r7 = (p221m9.InterfaceC4482q0) r7
            m9.e1 r9 = r0.m10352o(r4)
            int r7 = p221m9.AbstractC4463k.m10146r(r8, r7, r9)
            goto L3d9
        L2f6:
            r7 = r6 & r15
            if (r7 == 0) goto L3da
            long r9 = r2.getLong(r1, r13)
        L2fe:
            int r7 = p221m9.AbstractC4463k.m10127B(r8, r9)
            goto L3d9
        L304:
            r7 = r6 & r15
            if (r7 == 0) goto L3da
            int r7 = r2.getInt(r1, r13)
        L30c:
            int r7 = p221m9.AbstractC4463k.m10154z(r8, r7)
            goto L3d9
        L312:
            r7 = r6 & r15
            if (r7 == 0) goto L3da
        L316:
            r9 = 0
            int r7 = p221m9.AbstractC4463k.m10153y(r8, r9)
            goto L3d9
        L31e:
            r7 = r6 & r15
            if (r7 == 0) goto L3da
        L322:
            r7 = 0
            int r7 = p221m9.AbstractC4463k.m10152x(r8, r7)
            goto L3d9
        L329:
            r7 = r6 & r15
            if (r7 == 0) goto L3da
            int r7 = r2.getInt(r1, r13)
        L331:
            int r7 = p221m9.AbstractC4463k.m10142n(r8, r7)
            goto L3d9
        L337:
            r7 = r6 & r15
            if (r7 == 0) goto L3da
            int r7 = r2.getInt(r1, r13)
        L33f:
            int r7 = p221m9.AbstractC4463k.m10132G(r8, r7)
            goto L3d9
        L345:
            r7 = r6 & r15
            if (r7 == 0) goto L3da
        L349:
            java.lang.Object r7 = r2.getObject(r1, r13)
            m9.h r7 = (p221m9.AbstractC4454h) r7
            int r7 = p221m9.AbstractC4463k.m10139k(r8, r7)
            goto L3d9
        L355:
            r7 = r6 & r15
            if (r7 == 0) goto L3da
        L359:
            java.lang.Object r7 = r2.getObject(r1, r13)
            m9.e1 r9 = r0.m10352o(r4)
            int r7 = p221m9.C4453g1.m10039n(r8, r7, r9)
            goto L3d9
        L367:
            r7 = r6 & r15
            if (r7 == 0) goto L3da
            java.lang.Object r7 = r2.getObject(r1, r13)
            boolean r9 = r7 instanceof p221m9.AbstractC4454h
            if (r9 == 0) goto L37a
        L373:
            m9.h r7 = (p221m9.AbstractC4454h) r7
            int r7 = p221m9.AbstractC4463k.m10139k(r8, r7)
            goto L380
        L37a:
            java.lang.String r7 = (java.lang.String) r7
            int r7 = p221m9.AbstractC4463k.m10129D(r8, r7)
        L380:
            int r5 = r5 + r7
            goto L3da
        L382:
            r7 = r6 & r15
            if (r7 == 0) goto L3da
        L386:
            r7 = 1
            int r7 = p221m9.AbstractC4463k.m10138j(r8, r7)
            goto L3d9
        L38c:
            r7 = r6 & r15
            if (r7 == 0) goto L3da
        L390:
            r7 = 0
            int r7 = p221m9.AbstractC4463k.m10143o(r8, r7)
            goto L3d9
        L396:
            r7 = r6 & r15
            if (r7 == 0) goto L3da
        L39a:
            r9 = 0
            int r7 = p221m9.AbstractC4463k.m10144p(r8, r9)
            goto L3d9
        L3a1:
            r7 = r6 & r15
            if (r7 == 0) goto L3da
            int r7 = r2.getInt(r1, r13)
        L3a9:
            int r7 = p221m9.AbstractC4463k.m10147s(r8, r7)
            goto L3d9
        L3ae:
            r7 = r6 & r15
            if (r7 == 0) goto L3da
            long r9 = r2.getLong(r1, r13)
        L3b6:
            int r7 = p221m9.AbstractC4463k.m10134I(r8, r9)
            goto L3d9
        L3bb:
            r7 = r6 & r15
            if (r7 == 0) goto L3da
            long r9 = r2.getLong(r1, r13)
        L3c3:
            int r7 = p221m9.AbstractC4463k.m10149u(r8, r9)
            goto L3d9
        L3c8:
            r9 = r6 & r15
            if (r9 == 0) goto L3da
        L3cc:
            int r7 = p221m9.AbstractC4463k.m10145q(r8, r7)
            goto L3d9
        L3d1:
            r7 = r6 & r15
            if (r7 == 0) goto L3da
        L3d5:
            int r7 = p221m9.AbstractC4463k.m10141m(r8, r11)
        L3d9:
            int r5 = r5 + r7
        L3da:
            int r4 = r4 + 3
            goto La
        L3de:
            r2 = 0
            m9.m1<?, ?> r3 = r0.f18244o
            java.lang.Object r4 = r3.mo10204g(r1)
            int r3 = r3.mo10205h(r4)
            int r3 = r3 + r5
            boolean r4 = r0.f18235f
            if (r4 == 0) goto L43c
            m9.q<?> r4 = r0.f18245p
            m9.t r1 = r4.mo10225c(r1)
            r4 = 0
        L3f5:
            m9.i1<T extends m9.t$a<T>, java.lang.Object> r5 = r1.f18225a
            int r5 = r5.m10112d()
            if (r4 >= r5) goto L415
            m9.i1<T extends m9.t$a<T>, java.lang.Object> r5 = r1.f18225a
            java.util.Map$Entry r5 = r5.m10111c(r4)
            java.lang.Object r6 = r5.getKey()
            m9.t$a r6 = (p221m9.C4490t.a) r6
            java.lang.Object r5 = r5.getValue()
            int r5 = p221m9.C4490t.m10301e(r6, r5)
            int r2 = r2 + r5
            int r4 = r4 + 1
            goto L3f5
        L415:
            m9.i1<T extends m9.t$a<T>, java.lang.Object> r1 = r1.f18225a
            java.lang.Iterable r1 = r1.m10113e()
            java.util.Iterator r1 = r1.iterator()
        L41f:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L43b
            java.lang.Object r4 = r1.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r5 = r4.getKey()
            m9.t$a r5 = (p221m9.C4490t.a) r5
            java.lang.Object r4 = r4.getValue()
            int r4 = p221m9.C4490t.m10301e(r5, r4)
            int r2 = r2 + r4
            goto L41f
        L43b:
            int r3 = r3 + r2
        L43c:
            return r3
    }

    /* renamed from: r */
    public final int m10354r(T r14) {
            r13 = this;
            sun.misc.Unsafe r0 = p221m9.C4491t0.f18229s
            r1 = 0
            r2 = 0
            r3 = 0
        L5:
            int[] r4 = r13.f18230a
            int r4 = r4.length
            if (r2 >= r4) goto L3af
            int r4 = r13.m10344W(r2)
            int r5 = m10327V(r4)
            int[] r6 = r13.f18230a
            r6 = r6[r2]
            long r7 = m10320B(r4)
            m9.u r4 = p221m9.EnumC4493u.f18268a0
            int r4 = r4.f18272Y
            if (r5 < r4) goto L31
            m9.u r4 = p221m9.EnumC4493u.f18269b0
            int r4 = r4.f18272Y
            if (r5 > r4) goto L31
            int[] r4 = r13.f18230a
            int r9 = r2 + 2
            r4 = r4[r9]
            r9 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r4 & r9
            goto L32
        L31:
            r4 = 0
        L32:
            r9 = 1
            r10 = 0
            r11 = 0
            switch(r5) {
                case 0: goto L39e;
                case 1: goto L393;
                case 2: goto L384;
                case 3: goto L375;
                case 4: goto L366;
                case 5: goto L35b;
                case 6: goto L350;
                case 7: goto L345;
                case 8: goto L32f;
                case 9: goto L31b;
                case 10: goto L309;
                case 11: goto L2f9;
                case 12: goto L2e9;
                case 13: goto L2dd;
                case 14: goto L2d1;
                case 15: goto L2c1;
                case 16: goto L2b1;
                case 17: goto L29b;
                case 18: goto L291;
                case 19: goto L287;
                case 20: goto L27d;
                case 21: goto L273;
                case 22: goto L269;
                case 23: goto L291;
                case 24: goto L287;
                case 25: goto L25f;
                case 26: goto L255;
                case 27: goto L247;
                case 28: goto L23d;
                case 29: goto L233;
                case 30: goto L229;
                case 31: goto L287;
                case 32: goto L291;
                case 33: goto L21f;
                case 34: goto L215;
                case 35: goto L1f3;
                case 36: goto L1e2;
                case 37: goto L1d1;
                case 38: goto L1c0;
                case 39: goto L1af;
                case 40: goto L19e;
                case 41: goto L18d;
                case 42: goto L179;
                case 43: goto L167;
                case 44: goto L155;
                case 45: goto L143;
                case 46: goto L131;
                case 47: goto L11f;
                case 48: goto L10d;
                case 49: goto Lff;
                case 50: goto Lef;
                case 51: goto Le7;
                case 52: goto Ldf;
                case 53: goto Ld3;
                case 54: goto Lc7;
                case 55: goto Lbb;
                case 56: goto Lb3;
                case 57: goto Lab;
                case 58: goto La3;
                case 59: goto L93;
                case 60: goto L8b;
                case 61: goto L83;
                case 62: goto L77;
                case 63: goto L6b;
                case 64: goto L63;
                case 65: goto L5b;
                case 66: goto L4f;
                case 67: goto L43;
                case 68: goto L3b;
                default: goto L39;
            }
        L39:
            goto L3ab
        L3b:
            boolean r4 = r13.m10357u(r14, r6, r2)
            if (r4 == 0) goto L3ab
            goto L2a1
        L43:
            boolean r4 = r13.m10357u(r14, r6, r2)
            if (r4 == 0) goto L3ab
            long r4 = m10325G(r14, r7)
            goto L2bb
        L4f:
            boolean r4 = r13.m10357u(r14, r6, r2)
            if (r4 == 0) goto L3ab
            int r4 = m10324F(r14, r7)
            goto L2cb
        L5b:
            boolean r4 = r13.m10357u(r14, r6, r2)
            if (r4 == 0) goto L3ab
            goto L2d7
        L63:
            boolean r4 = r13.m10357u(r14, r6, r2)
            if (r4 == 0) goto L3ab
            goto L2e3
        L6b:
            boolean r4 = r13.m10357u(r14, r6, r2)
            if (r4 == 0) goto L3ab
            int r4 = m10324F(r14, r7)
            goto L2f3
        L77:
            boolean r4 = r13.m10357u(r14, r6, r2)
            if (r4 == 0) goto L3ab
            int r4 = m10324F(r14, r7)
            goto L303
        L83:
            boolean r4 = r13.m10357u(r14, r6, r2)
            if (r4 == 0) goto L3ab
            goto L30f
        L8b:
            boolean r4 = r13.m10357u(r14, r6, r2)
            if (r4 == 0) goto L3ab
            goto L321
        L93:
            boolean r4 = r13.m10357u(r14, r6, r2)
            if (r4 == 0) goto L3ab
            java.lang.Object r4 = p221m9.C4483q1.m10250n(r14, r7)
            boolean r5 = r4 instanceof p221m9.AbstractC4454h
            if (r5 == 0) goto L33e
            goto L33d
        La3:
            boolean r4 = r13.m10357u(r14, r6, r2)
            if (r4 == 0) goto L3ab
            goto L34b
        Lab:
            boolean r4 = r13.m10357u(r14, r6, r2)
            if (r4 == 0) goto L3ab
            goto L356
        Lb3:
            boolean r4 = r13.m10357u(r14, r6, r2)
            if (r4 == 0) goto L3ab
            goto L361
        Lbb:
            boolean r4 = r13.m10357u(r14, r6, r2)
            if (r4 == 0) goto L3ab
            int r4 = m10324F(r14, r7)
            goto L370
        Lc7:
            boolean r4 = r13.m10357u(r14, r6, r2)
            if (r4 == 0) goto L3ab
            long r4 = m10325G(r14, r7)
            goto L37f
        Ld3:
            boolean r4 = r13.m10357u(r14, r6, r2)
            if (r4 == 0) goto L3ab
            long r4 = m10325G(r14, r7)
            goto L38e
        Ldf:
            boolean r4 = r13.m10357u(r14, r6, r2)
            if (r4 == 0) goto L3ab
            goto L399
        Le7:
            boolean r4 = r13.m10357u(r14, r6, r2)
            if (r4 == 0) goto L3ab
            goto L3a4
        Lef:
            m9.l0 r4 = r13.f18246q
            java.lang.Object r5 = p221m9.C4483q1.m10250n(r14, r7)
            java.lang.Object r7 = r13.m10351n(r2)
            int r4 = r4.mo10189c(r6, r5, r7)
            goto L3aa
        Lff:
            java.util.List r4 = m10329v(r14, r7)
            m9.e1 r5 = r13.m10352o(r2)
            int r4 = p221m9.C4453g1.m10034i(r6, r4, r5)
            goto L3aa
        L10d:
            java.lang.Object r5 = r0.getObject(r14, r7)
            java.util.List r5 = (java.util.List) r5
            int r5 = p221m9.C4453g1.m10044s(r5)
            if (r5 <= 0) goto L3ab
            boolean r7 = r13.f18238i
            if (r7 == 0) goto L207
            goto L203
        L11f:
            java.lang.Object r5 = r0.getObject(r14, r7)
            java.util.List r5 = (java.util.List) r5
            int r5 = p221m9.C4453g1.m10042q(r5)
            if (r5 <= 0) goto L3ab
            boolean r7 = r13.f18238i
            if (r7 == 0) goto L207
            goto L203
        L131:
            java.lang.Object r5 = r0.getObject(r14, r7)
            java.util.List r5 = (java.util.List) r5
            int r5 = p221m9.C4453g1.m10033h(r5)
            if (r5 <= 0) goto L3ab
            boolean r7 = r13.f18238i
            if (r7 == 0) goto L207
            goto L203
        L143:
            java.lang.Object r5 = r0.getObject(r14, r7)
            java.util.List r5 = (java.util.List) r5
            int r5 = p221m9.C4453g1.m10031f(r5)
            if (r5 <= 0) goto L3ab
            boolean r7 = r13.f18238i
            if (r7 == 0) goto L207
            goto L203
        L155:
            java.lang.Object r5 = r0.getObject(r14, r7)
            java.util.List r5 = (java.util.List) r5
            int r5 = p221m9.C4453g1.m10029d(r5)
            if (r5 <= 0) goto L3ab
            boolean r7 = r13.f18238i
            if (r7 == 0) goto L207
            goto L203
        L167:
            java.lang.Object r5 = r0.getObject(r14, r7)
            java.util.List r5 = (java.util.List) r5
            int r5 = p221m9.C4453g1.m10047v(r5)
            if (r5 <= 0) goto L3ab
            boolean r7 = r13.f18238i
            if (r7 == 0) goto L207
            goto L203
        L179:
            java.lang.Object r5 = r0.getObject(r14, r7)
            java.util.List r5 = (java.util.List) r5
            java.lang.Class<?> r7 = p221m9.C4453g1.f18135a
            int r5 = r5.size()
            if (r5 <= 0) goto L3ab
            boolean r7 = r13.f18238i
            if (r7 == 0) goto L207
            goto L203
        L18d:
            java.lang.Object r5 = r0.getObject(r14, r7)
            java.util.List r5 = (java.util.List) r5
            int r5 = p221m9.C4453g1.m10031f(r5)
            if (r5 <= 0) goto L3ab
            boolean r7 = r13.f18238i
            if (r7 == 0) goto L207
            goto L203
        L19e:
            java.lang.Object r5 = r0.getObject(r14, r7)
            java.util.List r5 = (java.util.List) r5
            int r5 = p221m9.C4453g1.m10033h(r5)
            if (r5 <= 0) goto L3ab
            boolean r7 = r13.f18238i
            if (r7 == 0) goto L207
            goto L203
        L1af:
            java.lang.Object r5 = r0.getObject(r14, r7)
            java.util.List r5 = (java.util.List) r5
            int r5 = p221m9.C4453g1.m10036k(r5)
            if (r5 <= 0) goto L3ab
            boolean r7 = r13.f18238i
            if (r7 == 0) goto L207
            goto L203
        L1c0:
            java.lang.Object r5 = r0.getObject(r14, r7)
            java.util.List r5 = (java.util.List) r5
            int r5 = p221m9.C4453g1.m10049x(r5)
            if (r5 <= 0) goto L3ab
            boolean r7 = r13.f18238i
            if (r7 == 0) goto L207
            goto L203
        L1d1:
            java.lang.Object r5 = r0.getObject(r14, r7)
            java.util.List r5 = (java.util.List) r5
            int r5 = p221m9.C4453g1.m10038m(r5)
            if (r5 <= 0) goto L3ab
            boolean r7 = r13.f18238i
            if (r7 == 0) goto L207
            goto L203
        L1e2:
            java.lang.Object r5 = r0.getObject(r14, r7)
            java.util.List r5 = (java.util.List) r5
            int r5 = p221m9.C4453g1.m10031f(r5)
            if (r5 <= 0) goto L3ab
            boolean r7 = r13.f18238i
            if (r7 == 0) goto L207
            goto L203
        L1f3:
            java.lang.Object r5 = r0.getObject(r14, r7)
            java.util.List r5 = (java.util.List) r5
            int r5 = p221m9.C4453g1.m10033h(r5)
            if (r5 <= 0) goto L3ab
            boolean r7 = r13.f18238i
            if (r7 == 0) goto L207
        L203:
            long r7 = (long) r4
            r0.putInt(r14, r7, r5)
        L207:
            int r4 = p221m9.AbstractC4463k.m10131F(r6)
            int r6 = p221m9.AbstractC4463k.m10133H(r5)
            int r6 = r6 + r4
            int r6 = r6 + r5
            int r6 = r6 + r3
            r3 = r6
            goto L3ab
        L215:
            java.util.List r4 = m10329v(r14, r7)
            int r4 = p221m9.C4453g1.m10043r(r6, r4, r1)
            goto L3aa
        L21f:
            java.util.List r4 = m10329v(r14, r7)
            int r4 = p221m9.C4453g1.m10041p(r6, r4, r1)
            goto L3aa
        L229:
            java.util.List r4 = m10329v(r14, r7)
            int r4 = p221m9.C4453g1.m10028c(r6, r4, r1)
            goto L3aa
        L233:
            java.util.List r4 = m10329v(r14, r7)
            int r4 = p221m9.C4453g1.m10046u(r6, r4, r1)
            goto L3aa
        L23d:
            java.util.List r4 = m10329v(r14, r7)
            int r4 = p221m9.C4453g1.m10027b(r6, r4)
            goto L3aa
        L247:
            java.util.List r4 = m10329v(r14, r7)
            m9.e1 r5 = r13.m10352o(r2)
            int r4 = p221m9.C4453g1.m10040o(r6, r4, r5)
            goto L3aa
        L255:
            java.util.List r4 = m10329v(r14, r7)
            int r4 = p221m9.C4453g1.m10045t(r6, r4)
            goto L3aa
        L25f:
            java.util.List r4 = m10329v(r14, r7)
            int r4 = p221m9.C4453g1.m10026a(r6, r4, r1)
            goto L3aa
        L269:
            java.util.List r4 = m10329v(r14, r7)
            int r4 = p221m9.C4453g1.m10035j(r6, r4, r1)
            goto L3aa
        L273:
            java.util.List r4 = m10329v(r14, r7)
            int r4 = p221m9.C4453g1.m10048w(r6, r4, r1)
            goto L3aa
        L27d:
            java.util.List r4 = m10329v(r14, r7)
            int r4 = p221m9.C4453g1.m10037l(r6, r4, r1)
            goto L3aa
        L287:
            java.util.List r4 = m10329v(r14, r7)
            int r4 = p221m9.C4453g1.m10030e(r6, r4, r1)
            goto L3aa
        L291:
            java.util.List r4 = m10329v(r14, r7)
            int r4 = p221m9.C4453g1.m10032g(r6, r4, r1)
            goto L3aa
        L29b:
            boolean r4 = r13.m10355s(r14, r2)
            if (r4 == 0) goto L3ab
        L2a1:
            java.lang.Object r4 = p221m9.C4483q1.m10250n(r14, r7)
            m9.q0 r4 = (p221m9.InterfaceC4482q0) r4
            m9.e1 r5 = r13.m10352o(r2)
            int r4 = p221m9.AbstractC4463k.m10146r(r6, r4, r5)
            goto L3aa
        L2b1:
            boolean r4 = r13.m10355s(r14, r2)
            if (r4 == 0) goto L3ab
            long r4 = p221m9.C4483q1.m10249m(r14, r7)
        L2bb:
            int r4 = p221m9.AbstractC4463k.m10127B(r6, r4)
            goto L3aa
        L2c1:
            boolean r4 = r13.m10355s(r14, r2)
            if (r4 == 0) goto L3ab
            int r4 = p221m9.C4483q1.m10248l(r14, r7)
        L2cb:
            int r4 = p221m9.AbstractC4463k.m10154z(r6, r4)
            goto L3aa
        L2d1:
            boolean r4 = r13.m10355s(r14, r2)
            if (r4 == 0) goto L3ab
        L2d7:
            int r4 = p221m9.AbstractC4463k.m10153y(r6, r11)
            goto L3aa
        L2dd:
            boolean r4 = r13.m10355s(r14, r2)
            if (r4 == 0) goto L3ab
        L2e3:
            int r4 = p221m9.AbstractC4463k.m10152x(r6, r1)
            goto L3aa
        L2e9:
            boolean r4 = r13.m10355s(r14, r2)
            if (r4 == 0) goto L3ab
            int r4 = p221m9.C4483q1.m10248l(r14, r7)
        L2f3:
            int r4 = p221m9.AbstractC4463k.m10142n(r6, r4)
            goto L3aa
        L2f9:
            boolean r4 = r13.m10355s(r14, r2)
            if (r4 == 0) goto L3ab
            int r4 = p221m9.C4483q1.m10248l(r14, r7)
        L303:
            int r4 = p221m9.AbstractC4463k.m10132G(r6, r4)
            goto L3aa
        L309:
            boolean r4 = r13.m10355s(r14, r2)
            if (r4 == 0) goto L3ab
        L30f:
            java.lang.Object r4 = p221m9.C4483q1.m10250n(r14, r7)
        L313:
            m9.h r4 = (p221m9.AbstractC4454h) r4
            int r4 = p221m9.AbstractC4463k.m10139k(r6, r4)
            goto L3aa
        L31b:
            boolean r4 = r13.m10355s(r14, r2)
            if (r4 == 0) goto L3ab
        L321:
            java.lang.Object r4 = p221m9.C4483q1.m10250n(r14, r7)
            m9.e1 r5 = r13.m10352o(r2)
            int r4 = p221m9.C4453g1.m10039n(r6, r4, r5)
            goto L3aa
        L32f:
            boolean r4 = r13.m10355s(r14, r2)
            if (r4 == 0) goto L3ab
            java.lang.Object r4 = p221m9.C4483q1.m10250n(r14, r7)
            boolean r5 = r4 instanceof p221m9.AbstractC4454h
            if (r5 == 0) goto L33e
        L33d:
            goto L313
        L33e:
            java.lang.String r4 = (java.lang.String) r4
            int r4 = p221m9.AbstractC4463k.m10129D(r6, r4)
            goto L3aa
        L345:
            boolean r4 = r13.m10355s(r14, r2)
            if (r4 == 0) goto L3ab
        L34b:
            int r4 = p221m9.AbstractC4463k.m10138j(r6, r9)
            goto L3aa
        L350:
            boolean r4 = r13.m10355s(r14, r2)
            if (r4 == 0) goto L3ab
        L356:
            int r4 = p221m9.AbstractC4463k.m10143o(r6, r1)
            goto L3aa
        L35b:
            boolean r4 = r13.m10355s(r14, r2)
            if (r4 == 0) goto L3ab
        L361:
            int r4 = p221m9.AbstractC4463k.m10144p(r6, r11)
            goto L3aa
        L366:
            boolean r4 = r13.m10355s(r14, r2)
            if (r4 == 0) goto L3ab
            int r4 = p221m9.C4483q1.m10248l(r14, r7)
        L370:
            int r4 = p221m9.AbstractC4463k.m10147s(r6, r4)
            goto L3aa
        L375:
            boolean r4 = r13.m10355s(r14, r2)
            if (r4 == 0) goto L3ab
            long r4 = p221m9.C4483q1.m10249m(r14, r7)
        L37f:
            int r4 = p221m9.AbstractC4463k.m10134I(r6, r4)
            goto L3aa
        L384:
            boolean r4 = r13.m10355s(r14, r2)
            if (r4 == 0) goto L3ab
            long r4 = p221m9.C4483q1.m10249m(r14, r7)
        L38e:
            int r4 = p221m9.AbstractC4463k.m10149u(r6, r4)
            goto L3aa
        L393:
            boolean r4 = r13.m10355s(r14, r2)
            if (r4 == 0) goto L3ab
        L399:
            int r4 = p221m9.AbstractC4463k.m10145q(r6, r10)
            goto L3aa
        L39e:
            boolean r4 = r13.m10355s(r14, r2)
            if (r4 == 0) goto L3ab
        L3a4:
            r4 = 0
            int r4 = p221m9.AbstractC4463k.m10141m(r6, r4)
        L3aa:
            int r3 = r3 + r4
        L3ab:
            int r2 = r2 + 3
            goto L5
        L3af:
            m9.m1<?, ?> r0 = r13.f18244o
            java.lang.Object r14 = r0.mo10204g(r14)
            int r14 = r0.mo10205h(r14)
            int r14 = r14 + r3
            return r14
    }

    /* renamed from: s */
    public final boolean m10355s(T r8, int r9) {
            r7 = this;
            boolean r0 = r7.f18237h
            r1 = 0
            r2 = 1
            if (r0 == 0) goto Lda
            int[] r0 = r7.f18230a
            int r9 = r9 + r2
            r9 = r0[r9]
            long r3 = m10320B(r9)
            int r9 = m10327V(r9)
            r5 = 0
            switch(r9) {
                case 0: goto Lce;
                case 1: goto Lc3;
                case 2: goto Lb9;
                case 3: goto Laf;
                case 4: goto La7;
                case 5: goto L9d;
                case 6: goto L95;
                case 7: goto L90;
                case 8: goto L6e;
                case 9: goto L66;
                case 10: goto L5a;
                case 11: goto L52;
                case 12: goto L4a;
                case 13: goto L42;
                case 14: goto L38;
                case 15: goto L30;
                case 16: goto L26;
                case 17: goto L1e;
                default: goto L18;
            }
        L18:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            r8.<init>()
            throw r8
        L1e:
            java.lang.Object r8 = p221m9.C4483q1.m10250n(r8, r3)
            if (r8 == 0) goto L25
            r1 = 1
        L25:
            return r1
        L26:
            long r8 = p221m9.C4483q1.m10249m(r8, r3)
            int r0 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r0 == 0) goto L2f
            r1 = 1
        L2f:
            return r1
        L30:
            int r8 = p221m9.C4483q1.m10248l(r8, r3)
            if (r8 == 0) goto L37
            r1 = 1
        L37:
            return r1
        L38:
            long r8 = p221m9.C4483q1.m10249m(r8, r3)
            int r0 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r0 == 0) goto L41
            r1 = 1
        L41:
            return r1
        L42:
            int r8 = p221m9.C4483q1.m10248l(r8, r3)
            if (r8 == 0) goto L49
            r1 = 1
        L49:
            return r1
        L4a:
            int r8 = p221m9.C4483q1.m10248l(r8, r3)
            if (r8 == 0) goto L51
            r1 = 1
        L51:
            return r1
        L52:
            int r8 = p221m9.C4483q1.m10248l(r8, r3)
            if (r8 == 0) goto L59
            r1 = 1
        L59:
            return r1
        L5a:
            m9.h r9 = p221m9.AbstractC4454h.f18139Z
            java.lang.Object r8 = p221m9.C4483q1.m10250n(r8, r3)
            boolean r8 = r9.equals(r8)
            r8 = r8 ^ r2
            return r8
        L66:
            java.lang.Object r8 = p221m9.C4483q1.m10250n(r8, r3)
            if (r8 == 0) goto L6d
            r1 = 1
        L6d:
            return r1
        L6e:
            java.lang.Object r8 = p221m9.C4483q1.m10250n(r8, r3)
            boolean r9 = r8 instanceof java.lang.String
            if (r9 == 0) goto L7e
            java.lang.String r8 = (java.lang.String) r8
            boolean r8 = r8.isEmpty()
            r8 = r8 ^ r2
            return r8
        L7e:
            boolean r9 = r8 instanceof p221m9.AbstractC4454h
            if (r9 == 0) goto L8a
            m9.h r9 = p221m9.AbstractC4454h.f18139Z
            boolean r8 = r9.equals(r8)
            r8 = r8 ^ r2
            return r8
        L8a:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            r8.<init>()
            throw r8
        L90:
            boolean r8 = p221m9.C4483q1.m10242f(r8, r3)
            return r8
        L95:
            int r8 = p221m9.C4483q1.m10248l(r8, r3)
            if (r8 == 0) goto L9c
            r1 = 1
        L9c:
            return r1
        L9d:
            long r8 = p221m9.C4483q1.m10249m(r8, r3)
            int r0 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r0 == 0) goto La6
            r1 = 1
        La6:
            return r1
        La7:
            int r8 = p221m9.C4483q1.m10248l(r8, r3)
            if (r8 == 0) goto Lae
            r1 = 1
        Lae:
            return r1
        Laf:
            long r8 = p221m9.C4483q1.m10249m(r8, r3)
            int r0 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r0 == 0) goto Lb8
            r1 = 1
        Lb8:
            return r1
        Lb9:
            long r8 = p221m9.C4483q1.m10249m(r8, r3)
            int r0 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r0 == 0) goto Lc2
            r1 = 1
        Lc2:
            return r1
        Lc3:
            float r8 = p221m9.C4483q1.m10247k(r8, r3)
            r9 = 0
            int r8 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r8 == 0) goto Lcd
            r1 = 1
        Lcd:
            return r1
        Lce:
            double r8 = p221m9.C4483q1.m10246j(r8, r3)
            r3 = 0
            int r0 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r0 == 0) goto Ld9
            r1 = 1
        Ld9:
            return r1
        Lda:
            int[] r0 = r7.f18230a
            int r9 = r9 + 2
            r9 = r0[r9]
            int r0 = r9 >>> 20
            int r0 = r2 << r0
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r9 = r9 & r3
            long r3 = (long) r9
            int r8 = p221m9.C4483q1.m10248l(r8, r3)
            r8 = r8 & r0
            if (r8 == 0) goto Lf1
            r1 = 1
        Lf1:
            return r1
    }

    /* renamed from: t */
    public final boolean m10356t(T r2, int r3, int r4, int r5) {
            r1 = this;
            boolean r0 = r1.f18237h
            if (r0 == 0) goto L9
            boolean r2 = r1.m10355s(r2, r3)
            return r2
        L9:
            r2 = r4 & r5
            if (r2 == 0) goto Lf
            r2 = 1
            goto L10
        Lf:
            r2 = 0
        L10:
            return r2
    }

    /* renamed from: u */
    public final boolean m10357u(T r3, int r4, int r5) {
            r2 = this;
            int[] r0 = r2.f18230a
            int r5 = r5 + 2
            r5 = r0[r5]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r5 = r5 & r0
            long r0 = (long) r5
            int r3 = p221m9.C4483q1.m10248l(r3, r0)
            if (r3 != r4) goto L13
            r3 = 1
            goto L14
        L13:
            r3 = 0
        L14:
            return r3
    }

    /* renamed from: w */
    public final <K, V> void m10358w(java.lang.Object r5, int r6, java.lang.Object r7, p221m9.C4478p r8, p221m9.InterfaceC4444d1 r9) {
            r4 = this;
            int[] r0 = r4.f18230a
            int r6 = r6 + 1
            r6 = r0[r6]
            long r0 = m10320B(r6)
            java.lang.Object r6 = p221m9.C4483q1.m10250n(r5, r0)
            if (r6 != 0) goto L1c
            m9.l0 r6 = r4.f18246q
            java.lang.Object r6 = r6.mo10188b(r7)
            m9.q1$e r2 = p221m9.C4483q1.f18215f
            r2.m10278q(r5, r0, r6)
            goto L35
        L1c:
            m9.l0 r2 = r4.f18246q
            boolean r2 = r2.mo10190d(r6)
            if (r2 == 0) goto L35
            m9.l0 r2 = r4.f18246q
            java.lang.Object r2 = r2.mo10188b(r7)
            m9.l0 r3 = r4.f18246q
            r3.mo10187a(r2, r6)
            m9.q1$e r6 = p221m9.C4483q1.f18215f
            r6.m10278q(r5, r0, r2)
            r6 = r2
        L35:
            m9.l0 r5 = r4.f18246q
            java.util.Map r5 = r5.mo10194h(r6)
            m9.l0 r6 = r4.f18246q
            r6.mo10192f(r7)
            r6 = 0
            r9.mo9918A(r5, r6, r8)
            return
    }

    /* renamed from: x */
    public final void m10359x(T r4, T r5, int r6) {
            r3 = this;
            int[] r0 = r3.f18230a
            int r1 = r6 + 1
            r0 = r0[r1]
            long r0 = m10320B(r0)
            boolean r2 = r3.m10355s(r5, r6)
            if (r2 != 0) goto L11
            return
        L11:
            java.lang.Object r2 = p221m9.C4483q1.m10250n(r4, r0)
            java.lang.Object r5 = p221m9.C4483q1.m10250n(r5, r0)
            if (r2 == 0) goto L22
            if (r5 == 0) goto L22
            java.lang.Object r5 = p221m9.C4505z.m10387c(r2, r5)
            goto L24
        L22:
            if (r5 == 0) goto L2c
        L24:
            m9.q1$e r2 = p221m9.C4483q1.f18215f
            r2.m10278q(r4, r0, r5)
            r3.m10341S(r4, r6)
        L2c:
            return
    }

    /* renamed from: y */
    public final void m10360y(T r5, T r6, int r7) {
            r4 = this;
            int[] r0 = r4.f18230a
            int r1 = r7 + 1
            r1 = r0[r1]
            r0 = r0[r7]
            long r1 = m10320B(r1)
            boolean r3 = r4.m10357u(r6, r0, r7)
            if (r3 != 0) goto L13
            return
        L13:
            java.lang.Object r3 = p221m9.C4483q1.m10250n(r5, r1)
            java.lang.Object r6 = p221m9.C4483q1.m10250n(r6, r1)
            if (r3 == 0) goto L24
            if (r6 == 0) goto L24
            java.lang.Object r6 = p221m9.C4505z.m10387c(r3, r6)
            goto L26
        L24:
            if (r6 == 0) goto L2e
        L26:
            m9.q1$e r3 = p221m9.C4483q1.f18215f
            r3.m10278q(r5, r1, r6)
            r4.m10342T(r5, r0, r7)
        L2e:
            return
    }
}
