package p185k7;

/* renamed from: k7.i7 */
/* loaded from: classes.dex */
public final class C3844i7<T> implements p185k7.InterfaceC3950q7<T> {

    /* renamed from: n */
    public static final int[] f16680n = null;

    /* renamed from: o */
    public static final sun.misc.Unsafe f16681o = null;

    /* renamed from: a */
    public final int[] f16682a;

    /* renamed from: b */
    public final java.lang.Object[] f16683b;

    /* renamed from: c */
    public final int f16684c;

    /* renamed from: d */
    public final int f16685d;

    /* renamed from: e */
    public final p185k7.InterfaceC3802f7 f16686e;

    /* renamed from: f */
    public final boolean f16687f;

    /* renamed from: g */
    public final boolean f16688g;

    /* renamed from: h */
    public final int[] f16689h;

    /* renamed from: i */
    public final int f16690i;

    /* renamed from: j */
    public final int f16691j;

    /* renamed from: k */
    public final p185k7.AbstractC3988t6 f16692k;

    /* renamed from: l */
    public final p185k7.AbstractC3761c8<?, ?> f16693l;

    /* renamed from: m */
    public final p185k7.AbstractC3961r5<?> f16694m;

    static {
            r0 = 0
            int[] r0 = new int[r0]
            p185k7.C3844i7.f16680n = r0
            sun.misc.Unsafe r0 = p185k7.C3859j8.m8737k()
            p185k7.C3844i7.f16681o = r0
            return
    }

    public C3844i7(int[] r1, java.lang.Object[] r2, int r3, int r4, p185k7.InterfaceC3802f7 r5, boolean r6, int[] r7, int r8, int r9, p185k7.C3872k7 r10, p185k7.AbstractC3988t6 r11, p185k7.AbstractC3761c8 r12, p185k7.AbstractC3961r5 r13, p185k7.C3746b7 r14) {
            r0 = this;
            r0.<init>()
            r0.f16682a = r1
            r0.f16683b = r2
            r0.f16684c = r3
            r0.f16685d = r4
            r0.f16688g = r6
            if (r13 == 0) goto L17
            boolean r1 = r13.mo8921c(r5)
            if (r1 == 0) goto L17
            r1 = 1
            goto L18
        L17:
            r1 = 0
        L18:
            r0.f16687f = r1
            r0.f16689h = r7
            r0.f16690i = r8
            r0.f16691j = r9
            r0.f16692k = r11
            r0.f16693l = r12
            r0.f16694m = r13
            r0.f16686e = r5
            return
    }

    /* renamed from: B */
    public static p185k7.C3775d8 m8663B(java.lang.Object r2) {
            k7.d6 r2 = (p185k7.AbstractC3773d6) r2
            k7.d8 r0 = r2.zzc
            k7.d8 r1 = p185k7.C3775d8.f16560f
            if (r0 != r1) goto Le
            k7.d8 r0 = p185k7.C3775d8.m8502b()
            r2.zzc = r0
        Le:
            return r0
    }

    /* renamed from: C */
    public static p185k7.C3844i7 m8664C(p185k7.InterfaceC3774d7 r7, p185k7.C3872k7 r8, p185k7.AbstractC3988t6 r9, p185k7.AbstractC3761c8 r10, p185k7.AbstractC3961r5 r11, p185k7.C3746b7 r12) {
            boolean r0 = r7 instanceof p185k7.C3937p7
            if (r0 == 0) goto L11
            r1 = r7
            k7.p7 r1 = (p185k7.C3937p7) r1
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            k7.i7 r7 = m8665D(r1, r2, r3, r4, r5, r6)
            return r7
        L11:
            k7.a8 r7 = (p185k7.C3733a8) r7
            r7 = 0
            throw r7
    }

    /* renamed from: D */
    public static <T> p185k7.C3844i7<T> m8665D(p185k7.C3937p7 r35, p185k7.C3872k7 r36, p185k7.AbstractC3988t6 r37, p185k7.AbstractC3761c8<?, ?> r38, p185k7.AbstractC3961r5<?> r39, p185k7.C3746b7 r40) {
            r0 = r35
            int r1 = r0.f16834d
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
            java.lang.String r1 = r0.f16832b
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
            r9 = 13
        L39:
            int r10 = r5 + 1
            char r5 = r1.charAt(r5)
            if (r5 < r6) goto L49
            r5 = r5 & 8191(0x1fff, float:1.1478E-41)
            int r5 = r5 << r9
            r7 = r7 | r5
            int r9 = r9 + 13
            r5 = r10
            goto L39
        L49:
            int r5 = r5 << r9
            r7 = r7 | r5
            r5 = r10
        L4c:
            if (r7 != 0) goto L59
            int[] r7 = p185k7.C3844i7.f16680n
            r13 = r7
            r7 = 0
            r9 = 0
            r10 = 0
            r12 = 0
            r14 = 0
            r15 = 0
            goto L16a
        L59:
            int r7 = r5 + 1
            char r5 = r1.charAt(r5)
            if (r5 < r6) goto L78
            r5 = r5 & 8191(0x1fff, float:1.1478E-41)
            r9 = 13
        L65:
            int r10 = r7 + 1
            char r7 = r1.charAt(r7)
            if (r7 < r6) goto L75
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            int r7 = r7 << r9
            r5 = r5 | r7
            int r9 = r9 + 13
            r7 = r10
            goto L65
        L75:
            int r7 = r7 << r9
            r5 = r5 | r7
            r7 = r10
        L78:
            int r9 = r7 + 1
            char r7 = r1.charAt(r7)
            if (r7 < r6) goto L97
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            r10 = 13
        L84:
            int r12 = r9 + 1
            char r9 = r1.charAt(r9)
            if (r9 < r6) goto L94
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            int r9 = r9 << r10
            r7 = r7 | r9
            int r10 = r10 + 13
            r9 = r12
            goto L84
        L94:
            int r9 = r9 << r10
            r7 = r7 | r9
            r9 = r12
        L97:
            int r10 = r9 + 1
            char r9 = r1.charAt(r9)
            if (r9 < r6) goto Lb6
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            r12 = 13
        La3:
            int r13 = r10 + 1
            char r10 = r1.charAt(r10)
            if (r10 < r6) goto Lb3
            r10 = r10 & 8191(0x1fff, float:1.1478E-41)
            int r10 = r10 << r12
            r9 = r9 | r10
            int r12 = r12 + 13
            r10 = r13
            goto La3
        Lb3:
            int r10 = r10 << r12
            r9 = r9 | r10
            r10 = r13
        Lb6:
            int r12 = r10 + 1
            char r10 = r1.charAt(r10)
            if (r10 < r6) goto Ld5
            r10 = r10 & 8191(0x1fff, float:1.1478E-41)
            r13 = 13
        Lc2:
            int r14 = r12 + 1
            char r12 = r1.charAt(r12)
            if (r12 < r6) goto Ld2
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            int r12 = r12 << r13
            r10 = r10 | r12
            int r13 = r13 + 13
            r12 = r14
            goto Lc2
        Ld2:
            int r12 = r12 << r13
            r10 = r10 | r12
            r12 = r14
        Ld5:
            int r13 = r12 + 1
            char r12 = r1.charAt(r12)
            if (r12 < r6) goto Lf4
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            r14 = 13
        Le1:
            int r15 = r13 + 1
            char r13 = r1.charAt(r13)
            if (r13 < r6) goto Lf1
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            int r13 = r13 << r14
            r12 = r12 | r13
            int r14 = r14 + 13
            r13 = r15
            goto Le1
        Lf1:
            int r13 = r13 << r14
            r12 = r12 | r13
            r13 = r15
        Lf4:
            int r14 = r13 + 1
            char r13 = r1.charAt(r13)
            if (r13 < r6) goto L115
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            r15 = 13
        L100:
            int r16 = r14 + 1
            char r14 = r1.charAt(r14)
            if (r14 < r6) goto L111
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            int r14 = r14 << r15
            r13 = r13 | r14
            int r15 = r15 + 13
            r14 = r16
            goto L100
        L111:
            int r14 = r14 << r15
            r13 = r13 | r14
            r14 = r16
        L115:
            int r15 = r14 + 1
            char r14 = r1.charAt(r14)
            if (r14 < r6) goto L138
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            r16 = 13
        L121:
            int r17 = r15 + 1
            char r15 = r1.charAt(r15)
            if (r15 < r6) goto L133
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            int r15 = r15 << r16
            r14 = r14 | r15
            int r16 = r16 + 13
            r15 = r17
            goto L121
        L133:
            int r15 = r15 << r16
            r14 = r14 | r15
            r15 = r17
        L138:
            int r16 = r15 + 1
            char r15 = r1.charAt(r15)
            if (r15 < r6) goto L15d
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            r4 = r16
            r16 = 13
        L146:
            int r18 = r4 + 1
            char r4 = r1.charAt(r4)
            if (r4 < r6) goto L158
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            int r4 = r4 << r16
            r15 = r15 | r4
            int r16 = r16 + 13
            r4 = r18
            goto L146
        L158:
            int r4 = r4 << r16
            r15 = r15 | r4
            r16 = r18
        L15d:
            int r4 = r15 + r13
            int r4 = r4 + r14
            int[] r4 = new int[r4]
            int r14 = r5 + r5
            int r14 = r14 + r7
            r7 = r13
            r13 = r4
            r4 = r5
            r5 = r16
        L16a:
            sun.misc.Unsafe r8 = p185k7.C3844i7.f16681o
            java.lang.Object[] r2 = r0.f16833c
            k7.f7 r6 = r0.f16831a
            java.lang.Class r6 = r6.getClass()
            r20 = r5
            int r5 = r12 * 3
            int[] r5 = new int[r5]
            int r12 = r12 + r12
            java.lang.Object[] r12 = new java.lang.Object[r12]
            int r21 = r15 + r7
            r23 = r15
            r7 = r20
            r24 = r21
            r20 = 0
            r22 = 0
        L189:
            if (r7 >= r3) goto L3e4
            int r25 = r7 + 1
            char r7 = r1.charAt(r7)
            r26 = r3
            r3 = 55296(0xd800, float:7.7486E-41)
            if (r7 < r3) goto L1bd
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            r3 = r25
            r25 = 13
        L19e:
            int r27 = r3 + 1
            char r3 = r1.charAt(r3)
            r28 = r15
            r15 = 55296(0xd800, float:7.7486E-41)
            if (r3 < r15) goto L1b7
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            int r3 = r3 << r25
            r7 = r7 | r3
            int r25 = r25 + 13
            r3 = r27
            r15 = r28
            goto L19e
        L1b7:
            int r3 = r3 << r25
            r7 = r7 | r3
            r3 = r27
            goto L1c1
        L1bd:
            r28 = r15
            r3 = r25
        L1c1:
            int r15 = r3 + 1
            char r3 = r1.charAt(r3)
            r25 = r15
            r15 = 55296(0xd800, float:7.7486E-41)
            if (r3 < r15) goto L1f3
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            r15 = r25
            r25 = 13
        L1d4:
            int r27 = r15 + 1
            char r15 = r1.charAt(r15)
            r29 = r10
            r10 = 55296(0xd800, float:7.7486E-41)
            if (r15 < r10) goto L1ed
            r10 = r15 & 8191(0x1fff, float:1.1478E-41)
            int r10 = r10 << r25
            r3 = r3 | r10
            int r25 = r25 + 13
            r15 = r27
            r10 = r29
            goto L1d4
        L1ed:
            int r10 = r15 << r25
            r3 = r3 | r10
            r15 = r27
            goto L1f7
        L1f3:
            r29 = r10
            r15 = r25
        L1f7:
            r10 = r3 & 255(0xff, float:3.57E-43)
            r25 = r9
            r9 = r3 & 1024(0x400, float:1.435E-42)
            if (r9 == 0) goto L205
            int r9 = r22 + 1
            r13[r22] = r20
            r22 = r9
        L205:
            r9 = 51
            if (r10 < r9) goto L2b0
            int r9 = r15 + 1
            char r15 = r1.charAt(r15)
            r27 = r9
            r9 = 55296(0xd800, float:7.7486E-41)
            if (r15 < r9) goto L23d
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            r32 = 13
            r34 = r27
            r27 = r15
            r15 = r34
        L220:
            int r33 = r15 + 1
            char r15 = r1.charAt(r15)
            if (r15 < r9) goto L236
            r9 = r15 & 8191(0x1fff, float:1.1478E-41)
            int r9 = r9 << r32
            r27 = r27 | r9
            int r32 = r32 + 13
            r15 = r33
            r9 = 55296(0xd800, float:7.7486E-41)
            goto L220
        L236:
            int r9 = r15 << r32
            r15 = r27 | r9
            r9 = r33
            goto L23f
        L23d:
            r9 = r27
        L23f:
            r27 = r9
            int r9 = r10 + (-51)
            r0 = 9
            if (r9 == r0) goto L260
            r0 = 17
            if (r9 != r0) goto L24c
            goto L260
        L24c:
            r0 = 12
            if (r9 != r0) goto L26e
            if (r11 != 0) goto L26e
            int r0 = r20 / 3
            int r9 = r14 + 1
            int r0 = r0 + r0
            r18 = 1
            int r0 = r0 + 1
            r14 = r2[r14]
            r12[r0] = r14
            goto L26d
        L260:
            int r0 = r20 / 3
            int r9 = r14 + 1
            int r0 = r0 + r0
            r18 = 1
            int r0 = r0 + 1
            r14 = r2[r14]
            r12[r0] = r14
        L26d:
            r14 = r9
        L26e:
            int r15 = r15 + r15
            r0 = r2[r15]
            boolean r9 = r0 instanceof java.lang.reflect.Field
            if (r9 == 0) goto L278
            java.lang.reflect.Field r0 = (java.lang.reflect.Field) r0
            goto L280
        L278:
            java.lang.String r0 = (java.lang.String) r0
            java.lang.reflect.Field r0 = m8670o(r6, r0)
            r2[r15] = r0
        L280:
            r9 = r4
            r32 = r5
            long r4 = r8.objectFieldOffset(r0)
            int r0 = (int) r4
            int r15 = r15 + 1
            r4 = r2[r15]
            boolean r5 = r4 instanceof java.lang.reflect.Field
            if (r5 == 0) goto L293
            java.lang.reflect.Field r4 = (java.lang.reflect.Field) r4
            goto L29b
        L293:
            java.lang.String r4 = (java.lang.String) r4
            java.lang.reflect.Field r4 = m8670o(r6, r4)
            r2[r15] = r4
        L29b:
            long r4 = r8.objectFieldOffset(r4)
            int r5 = (int) r4
            r4 = r0
            r19 = r1
            r31 = r14
            r15 = r27
            r0 = 55296(0xd800, float:7.7486E-41)
            r18 = 1
            r14 = r6
            r6 = 0
            goto L3ab
        L2b0:
            r9 = r4
            r32 = r5
            int r0 = r14 + 1
            r4 = r2[r14]
            java.lang.String r4 = (java.lang.String) r4
            java.lang.reflect.Field r4 = m8670o(r6, r4)
            r5 = 49
            r14 = 9
            if (r10 == r14) goto L325
            r14 = 17
            if (r10 != r14) goto L2c8
            goto L325
        L2c8:
            r14 = 27
            if (r10 == r14) goto L314
            if (r10 != r5) goto L2cf
            goto L314
        L2cf:
            r14 = 12
            if (r10 == r14) goto L304
            r14 = 30
            if (r10 == r14) goto L304
            r14 = 44
            if (r10 != r14) goto L2dc
            goto L304
        L2dc:
            r14 = 50
            if (r10 != r14) goto L301
            int r14 = r23 + 1
            r13[r23] = r20
            int r23 = r20 / 3
            int r23 = r23 + r23
            int r27 = r0 + 1
            r0 = r2[r0]
            r12[r23] = r0
            r0 = r3 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L2fd
            int r0 = r27 + 1
            int r23 = r23 + 1
            r27 = r2[r27]
            r12[r23] = r27
            r23 = r14
            goto L301
        L2fd:
            r23 = r14
            r0 = r27
        L301:
            r18 = 1
            goto L332
        L304:
            if (r11 != 0) goto L301
            int r14 = r20 / 3
            int r27 = r0 + 1
            int r14 = r14 + r14
            r18 = 1
            int r14 = r14 + 1
            r0 = r2[r0]
            r12[r14] = r0
            goto L321
        L314:
            r18 = 1
            int r14 = r20 / 3
            int r27 = r0 + 1
            int r14 = r14 + r14
            int r14 = r14 + 1
            r0 = r2[r0]
            r12[r14] = r0
        L321:
            r14 = r6
            r0 = r27
            goto L333
        L325:
            r18 = 1
            int r14 = r20 / 3
            int r14 = r14 + r14
            int r14 = r14 + 1
            java.lang.Class r27 = r4.getType()
            r12[r14] = r27
        L332:
            r14 = r6
        L333:
            long r5 = r8.objectFieldOffset(r4)
            int r4 = (int) r5
            r5 = r3 & 4096(0x1000, float:5.74E-42)
            r6 = 4096(0x1000, float:5.74E-42)
            if (r5 != r6) goto L392
            r5 = 17
            if (r10 > r5) goto L392
            int r5 = r15 + 1
            char r6 = r1.charAt(r15)
            r15 = 55296(0xd800, float:7.7486E-41)
            if (r6 < r15) goto L367
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            r19 = 13
        L351:
            int r30 = r5 + 1
            char r5 = r1.charAt(r5)
            if (r5 < r15) goto L363
            r5 = r5 & 8191(0x1fff, float:1.1478E-41)
            int r5 = r5 << r19
            r6 = r6 | r5
            int r19 = r19 + 13
            r5 = r30
            goto L351
        L363:
            int r5 = r5 << r19
            r6 = r6 | r5
            goto L369
        L367:
            r30 = r5
        L369:
            int r5 = r9 + r9
            int r19 = r6 / 32
            int r19 = r19 + r5
            r5 = r2[r19]
            boolean r15 = r5 instanceof java.lang.reflect.Field
            if (r15 == 0) goto L378
            java.lang.reflect.Field r5 = (java.lang.reflect.Field) r5
            goto L380
        L378:
            java.lang.String r5 = (java.lang.String) r5
            java.lang.reflect.Field r5 = m8670o(r14, r5)
            r2[r19] = r5
        L380:
            r31 = r0
            r19 = r1
            long r0 = r8.objectFieldOffset(r5)
            int r1 = (int) r0
            int r6 = r6 % 32
            r5 = r1
            r15 = r30
            r0 = 55296(0xd800, float:7.7486E-41)
            goto L39d
        L392:
            r31 = r0
            r19 = r1
            r0 = 55296(0xd800, float:7.7486E-41)
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r6 = 0
        L39d:
            r1 = 18
            if (r10 < r1) goto L3ab
            r1 = 49
            if (r10 > r1) goto L3ab
            int r1 = r24 + 1
            r13[r24] = r4
            r24 = r1
        L3ab:
            int r1 = r20 + 1
            r32[r20] = r7
            int r7 = r1 + 1
            r0 = r3 & 512(0x200, float:7.17E-43)
            if (r0 == 0) goto L3b8
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            goto L3b9
        L3b8:
            r0 = 0
        L3b9:
            r3 = r3 & 256(0x100, float:3.59E-43)
            if (r3 == 0) goto L3c0
            r3 = 268435456(0x10000000, float:2.524355E-29)
            goto L3c1
        L3c0:
            r3 = 0
        L3c1:
            r0 = r0 | r3
            int r3 = r10 << 20
            r0 = r0 | r3
            r0 = r0 | r4
            r32[r1] = r0
            int r20 = r7 + 1
            int r0 = r6 << 20
            r0 = r0 | r5
            r32[r7] = r0
            r0 = r35
            r4 = r9
            r6 = r14
            r7 = r15
            r1 = r19
            r9 = r25
            r3 = r26
            r15 = r28
            r10 = r29
            r14 = r31
            r5 = r32
            goto L189
        L3e4:
            r32 = r5
            r25 = r9
            r29 = r10
            r28 = r15
            k7.i7 r0 = new k7.i7
            r1 = r35
            k7.f7 r10 = r1.f16831a
            r1 = r32
            r5 = r0
            r6 = r1
            r7 = r12
            r8 = r25
            r9 = r29
            r12 = r13
            r13 = r28
            r14 = r21
            r15 = r36
            r16 = r37
            r17 = r38
            r18 = r39
            r19 = r40
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return r0
    }

    /* renamed from: E */
    public static <T> double m8666E(T r0, long r1) {
            java.lang.Object r0 = p185k7.C3859j8.m8736j(r0, r1)
            java.lang.Double r0 = (java.lang.Double) r0
            double r0 = r0.doubleValue()
            return r0
    }

    /* renamed from: F */
    public static <T> float m8667F(T r0, long r1) {
            java.lang.Object r0 = p185k7.C3859j8.m8736j(r0, r1)
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            return r0
    }

    /* renamed from: I */
    public static <T> int m8668I(T r0, long r1) {
            java.lang.Object r0 = p185k7.C3859j8.m8736j(r0, r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            return r0
    }

    /* renamed from: k */
    public static <T> long m8669k(T r0, long r1) {
            java.lang.Object r0 = p185k7.C3859j8.m8736j(r0, r1)
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            return r0
    }

    /* renamed from: o */
    public static java.lang.reflect.Field m8670o(java.lang.Class<?> r7, java.lang.String r8) {
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

    /* renamed from: x */
    public static <T> boolean m8671x(T r0, long r1) {
            java.lang.Object r0 = p185k7.C3859j8.m8736j(r0, r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
    }

    /* renamed from: z */
    public static final void m8672z(int r1, java.lang.Object r2, p185k7.C3909n5 r3) {
            boolean r0 = r2 instanceof java.lang.String
            if (r0 == 0) goto Lc
            java.lang.String r2 = (java.lang.String) r2
            k7.m5 r3 = r3.f16756a
            r3.mo8779y(r1, r2)
            return
        Lc:
            k7.i5 r2 = (p185k7.AbstractC3842i5) r2
            k7.m5 r3 = r3.f16756a
            r3.mo8772q(r1, r2)
            return
    }

    /* renamed from: A */
    public final int m8673A(T r33, byte[] r34, int r35, int r36, int r37, p124h7.C2915vf r38) {
            r32 = this;
            r15 = r32
            r14 = r33
            r12 = r36
            r13 = r38
            sun.misc.Unsafe r11 = p185k7.C3844i7.f16681o
            r4 = r34
            r0 = r35
            r1 = r37
            r6 = r12
            r2 = -1
            r3 = 0
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r7 = 0
            r16 = 0
        L19:
            r17 = 0
            if (r0 >= r6) goto L491
            int r9 = r0 + 1
            r0 = r4[r0]
            if (r0 >= 0) goto L2e
            int r0 = p124h7.C2939x3.m7269S(r0, r4, r9, r13)
            int r9 = r13.f11968a
            r31 = r9
            r9 = r0
            r0 = r31
        L2e:
            int r10 = r0 >>> 3
            r8 = r0 & 7
            r35 = r0
            r0 = 3
            if (r10 <= r2) goto L49
            int r3 = r3 / r0
            int r2 = r15.f16684c
            if (r10 < r2) goto L45
            int r2 = r15.f16685d
            if (r10 > r2) goto L45
            int r2 = r15.m8681O(r10, r3)
            goto L46
        L45:
            r2 = -1
        L46:
            r3 = r2
            r2 = 0
            goto L59
        L49:
            int r2 = r15.f16684c
            if (r10 < r2) goto L57
            int r2 = r15.f16685d
            if (r10 > r2) goto L57
            r2 = 0
            int r3 = r15.m8681O(r10, r2)
            goto L59
        L57:
            r2 = 0
            r3 = -1
        L59:
            r12 = -1
            if (r3 != r12) goto L6e
            r6 = r1
            r18 = r5
            r2 = r9
            r22 = r10
            r30 = r11
            r19 = -1
            r20 = 0
            r27 = 0
            r9 = r35
            goto L416
        L6e:
            int[] r1 = r15.f16682a
            int r16 = r3 + 1
            r12 = r1[r16]
            int r2 = r12 >>> 20
            r2 = r2 & 255(0xff, float:3.57E-43)
            r16 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r12 & r16
            r16 = r9
            r22 = r10
            long r9 = (long) r0
            r0 = 17
            r23 = r12
            if (r2 > r0) goto L309
            int r0 = r3 + 2
            r0 = r1[r0]
            int r1 = r0 >>> 20
            r12 = 1
            int r25 = r12 << r1
            r1 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r1
            if (r0 == r5) goto La5
            if (r5 == r1) goto L9d
            long r12 = (long) r5
            r11.putInt(r14, r12, r7)
        L9d:
            long r12 = (long) r0
            int r7 = r11.getInt(r14, r12)
            r12 = r7
            r7 = r0
            goto La7
        La5:
            r12 = r7
            r7 = r5
        La7:
            r0 = 5
            switch(r2) {
                case 0: goto L2ac;
                case 1: goto L28a;
                case 2: goto L25c;
                case 3: goto L25c;
                case 4: goto L23f;
                case 5: goto L210;
                case 6: goto L1f5;
                case 7: goto L1cc;
                case 8: goto L1a6;
                case 9: goto L173;
                case 10: goto L15b;
                case 11: goto L23f;
                case 12: goto L123;
                case 13: goto L1f5;
                case 14: goto L210;
                case 15: goto L108;
                case 16: goto Ld8;
                default: goto Lab;
            }
        Lab:
            r5 = r35
            r13 = r38
            r35 = r7
            r0 = 3
            r20 = 0
            r7 = r3
            r3 = r16
            r16 = 1048575(0xfffff, float:1.469367E-39)
            if (r8 != r0) goto L2db
            k7.q7 r0 = r15.m8693m(r7)
            int r1 = r22 << 3
            r4 = r1 | 4
            r1 = r34
            r2 = r3
            r3 = r36
            r6 = r5
            r5 = r38
            int r0 = p124h7.C2939x3.m7300z(r0, r1, r2, r3, r4, r5)
            r1 = r12 & r25
            if (r1 != 0) goto L2dd
            java.lang.Object r1 = r13.f11970c
            goto L2e7
        Ld8:
            if (r8 != 0) goto Lf7
            r13 = r38
            r5 = r16
            int r8 = p124h7.C2939x3.m7273W(r4, r5, r13)
            long r1 = r13.f11969b
            long r17 = p185k7.C3856j5.m8726b(r1)
            r5 = r35
            r0 = r11
            r16 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r33
            r35 = r7
            r20 = 0
            r7 = r3
            goto L277
        Lf7:
            r10 = r35
            r13 = r38
            r35 = r7
            r5 = r16
            r16 = 1048575(0xfffff, float:1.469367E-39)
            r20 = 0
            r7 = r3
            r3 = r5
            goto L287
        L108:
            r2 = r35
            r13 = r38
            r35 = r7
            r5 = r16
            r16 = 1048575(0xfffff, float:1.469367E-39)
            r20 = 0
            r7 = r3
            if (r8 != 0) goto L239
            int r0 = p124h7.C2939x3.m7267Q(r4, r5, r13)
            int r1 = r13.f11968a
            int r1 = p185k7.C3856j5.m8725a(r1)
            goto L157
        L123:
            r2 = r35
            r13 = r38
            r35 = r7
            r5 = r16
            r16 = 1048575(0xfffff, float:1.469367E-39)
            r20 = 0
            r7 = r3
            if (r8 != 0) goto L239
            int r0 = p124h7.C2939x3.m7267Q(r4, r5, r13)
            int r1 = r13.f11968a
            k7.g6 r3 = r15.m8692l(r7)
            if (r3 == 0) goto L157
            boolean r3 = r3.mo8232a(r1)
            if (r3 == 0) goto L146
            goto L157
        L146:
            k7.d8 r3 = m8663B(r33)
            long r8 = (long) r1
            java.lang.Long r1 = java.lang.Long.valueOf(r8)
            r3.m8504c(r2, r1)
            r5 = r35
            r8 = r2
            goto L352
        L157:
            r11.putInt(r14, r9, r1)
            goto L19e
        L15b:
            r2 = r35
            r13 = r38
            r35 = r7
            r5 = r16
            r0 = 2
            r16 = 1048575(0xfffff, float:1.469367E-39)
            r20 = 0
            r7 = r3
            if (r8 != r0) goto L239
            int r0 = p124h7.C2939x3.m7291q(r4, r5, r13)
        L170:
            java.lang.Object r1 = r13.f11970c
            goto L19b
        L173:
            r2 = r35
            r13 = r38
            r35 = r7
            r5 = r16
            r0 = 2
            r16 = 1048575(0xfffff, float:1.469367E-39)
            r20 = 0
            r7 = r3
            if (r8 != r0) goto L239
            k7.q7 r0 = r15.m8693m(r7)
            int r0 = p124h7.C2939x3.m7253C(r0, r4, r5, r6, r13)
            r1 = r12 & r25
            if (r1 != 0) goto L191
            goto L170
        L191:
            java.lang.Object r1 = r11.getObject(r14, r9)
            java.lang.Object r3 = r13.f11970c
            java.lang.Object r1 = p185k7.C3871k6.m8783c(r1, r3)
        L19b:
            r11.putObject(r14, r9, r1)
        L19e:
            r1 = r12 | r25
            r8 = r0
            r0 = r1
            r1 = r6
            r6 = r2
            goto L2f2
        L1a6:
            r2 = r35
            r13 = r38
            r35 = r7
            r5 = r16
            r0 = 2
            r16 = 1048575(0xfffff, float:1.469367E-39)
            r20 = 0
            r7 = r3
            if (r8 != r0) goto L239
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r23 & r0
            if (r0 != 0) goto L1c2
            int r0 = p124h7.C2939x3.m7261K(r4, r5, r13)
            goto L1c6
        L1c2:
            int r0 = p124h7.C2939x3.m7263M(r4, r5, r13)
        L1c6:
            java.lang.Object r1 = r13.f11970c
            r11.putObject(r14, r9, r1)
            goto L20e
        L1cc:
            r2 = r35
            r13 = r38
            r35 = r7
            r5 = r16
            r16 = 1048575(0xfffff, float:1.469367E-39)
            r20 = 0
            r7 = r3
            if (r8 != 0) goto L239
            int r0 = p124h7.C2939x3.m7273W(r4, r5, r13)
            r3 = r0
            long r0 = r13.f11969b
            r23 = 0
            int r5 = (r0 > r23 ? 1 : (r0 == r23 ? 0 : -1))
            if (r5 == 0) goto L1eb
            r0 = 1
            goto L1ec
        L1eb:
            r0 = 0
        L1ec:
            e7.i8 r1 = p185k7.C3859j8.f16708c
            r1.mo4205c(r14, r9, r0)
            r5 = r2
            r0 = r3
            goto L258
        L1f5:
            r2 = r35
            r13 = r38
            r35 = r7
            r5 = r16
            r16 = 1048575(0xfffff, float:1.469367E-39)
            r20 = 0
            r7 = r3
            if (r8 != r0) goto L239
            int r0 = p124h7.C2939x3.m7297w(r4, r5)
            r11.putInt(r14, r9, r0)
            int r0 = r5 + 4
        L20e:
            r5 = r2
            goto L258
        L210:
            r2 = r35
            r13 = r38
            r35 = r7
            r5 = r16
            r0 = 1
            r16 = 1048575(0xfffff, float:1.469367E-39)
            r20 = 0
            r7 = r3
            if (r8 != r0) goto L239
            long r17 = p124h7.C2939x3.m7274X(r4, r5)
            r0 = r11
            r1 = r33
            r8 = r2
            r2 = r9
            r9 = r4
            r10 = r5
            r4 = r17
            r0.putLong(r1, r2, r4)
            int r0 = r10 + 8
            r1 = r12 | r25
            r5 = r8
            r4 = r9
            goto L2cd
        L239:
            r8 = r2
            r10 = r5
            r6 = r8
            r3 = r10
            goto L2fa
        L23f:
            r5 = r35
            r13 = r38
            r35 = r7
            r20 = 0
            r7 = r3
            r3 = r16
            r16 = 1048575(0xfffff, float:1.469367E-39)
            if (r8 != 0) goto L286
            int r0 = p124h7.C2939x3.m7267Q(r4, r3, r13)
            int r1 = r13.f11968a
            r11.putInt(r14, r9, r1)
        L258:
            r1 = r12 | r25
            goto L2cd
        L25c:
            r5 = r35
            r13 = r38
            r35 = r7
            r20 = 0
            r7 = r3
            r3 = r16
            r16 = 1048575(0xfffff, float:1.469367E-39)
            if (r8 != 0) goto L286
            int r8 = p124h7.C2939x3.m7273W(r4, r3, r13)
            long r2 = r13.f11969b
            r0 = r11
            r1 = r33
            r17 = r2
        L277:
            r2 = r9
            r9 = r4
            r10 = r5
            r4 = r17
            r0.putLong(r1, r2, r4)
            r0 = r12 | r25
            r1 = r6
            r4 = r9
            r6 = r10
            goto L2f2
        L286:
            r10 = r5
        L287:
            r6 = r10
            goto L2fa
        L28a:
            r5 = r35
            r13 = r38
            r1 = r4
            r35 = r7
            r20 = 0
            r7 = r3
            r3 = r16
            r16 = 1048575(0xfffff, float:1.469367E-39)
            if (r8 != r0) goto L2db
            int r0 = p124h7.C2939x3.m7297w(r1, r3)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            e7.i8 r2 = p185k7.C3859j8.f16708c
            r2.mo4208f(r14, r9, r0)
            int r0 = r3 + 4
            r4 = r1
            goto L258
        L2ac:
            r5 = r35
            r13 = r38
            r1 = r4
            r35 = r7
            r0 = 1
            r20 = 0
            r7 = r3
            r3 = r16
            r16 = 1048575(0xfffff, float:1.469367E-39)
            if (r8 != r0) goto L2db
            long r17 = p124h7.C2939x3.m7274X(r1, r3)
            r4 = r1
            double r0 = java.lang.Double.longBitsToDouble(r17)
            p185k7.C3859j8.m8739m(r14, r9, r0)
            int r0 = r3 + 8
            goto L258
        L2cd:
            r12 = r36
            r16 = r5
            r3 = r7
            r2 = r22
            r5 = r35
            r7 = r1
            r1 = r37
            goto L19
        L2db:
            r6 = r5
            goto L2fa
        L2dd:
            java.lang.Object r1 = r11.getObject(r14, r9)
            java.lang.Object r2 = r13.f11970c
            java.lang.Object r1 = p185k7.C3871k6.m8783c(r1, r2)
        L2e7:
            r11.putObject(r14, r9, r1)
            r1 = r12 | r25
            r4 = r34
            r8 = r0
            r0 = r1
            r1 = r36
        L2f2:
            r5 = r35
            r12 = r0
            r0 = r8
            r8 = r6
            r6 = r1
            goto L352
        L2fa:
            r18 = r35
            r2 = r3
            r9 = r6
            r27 = r7
            r30 = r11
            r7 = r12
            r19 = -1
            r6 = r37
            goto L416
        L309:
            r6 = r35
            r12 = r7
            r20 = 0
            r7 = r3
            r3 = r16
            r16 = 1048575(0xfffff, float:1.469367E-39)
            r0 = 27
            if (r2 != r0) goto L36d
            r0 = 2
            if (r8 != r0) goto L35e
            java.lang.Object r0 = r11.getObject(r14, r9)
            k7.j6 r0 = (p185k7.InterfaceC3857j6) r0
            boolean r1 = r0.mo8199c()
            if (r1 != 0) goto L338
            int r1 = r0.size()
            if (r1 != 0) goto L330
            r1 = 10
            goto L331
        L330:
            int r1 = r1 + r1
        L331:
            k7.j6 r0 = r0.mo8299k(r1)
            r11.putObject(r14, r9, r0)
        L338:
            r8 = r0
            k7.q7 r0 = r15.m8693m(r7)
            r1 = r6
            r2 = r34
            r4 = r36
            r18 = r5
            r5 = r8
            r8 = r6
            r6 = r38
            int r0 = p124h7.C2939x3.m7256F(r0, r1, r2, r3, r4, r5, r6)
            r4 = r34
            r6 = r36
            r5 = r18
        L352:
            r1 = r37
            r3 = r7
            r16 = r8
            r7 = r12
            r2 = r22
            r12 = r36
            goto L19
        L35e:
            r18 = r5
            r15 = r3
            r25 = r6
            r27 = r7
            r30 = r11
            r26 = r12
            r19 = -1
            goto L3c5
        L36d:
            r18 = r5
            r0 = 49
            if (r2 > r0) goto L3ab
            r5 = r23
            long r4 = (long) r5
            r0 = r32
            r1 = r33
            r35 = r2
            r2 = r34
            r21 = r3
            r23 = r4
            r4 = r36
            r5 = r6
            r25 = r6
            r6 = r22
            r27 = r7
            r26 = r12
            r7 = r8
            r8 = r27
            r28 = r9
            r12 = r21
            r19 = -1
            r9 = r23
            r30 = r11
            r11 = r35
            r15 = r12
            r12 = r28
            r14 = r38
            int r0 = r0.m8679M(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            if (r0 == r15) goto L3a8
            goto L3f4
        L3a8:
            r9 = r0
            goto L40f
        L3ab:
            r35 = r2
            r15 = r3
            r25 = r6
            r27 = r7
            r28 = r9
            r30 = r11
            r26 = r12
            r5 = r23
            r19 = -1
            r0 = 50
            r9 = r35
            if (r9 != r0) goto L3d8
            r0 = 2
            if (r8 == r0) goto L3c7
        L3c5:
            r9 = r15
            goto L40f
        L3c7:
            r0 = r32
            r1 = r33
            r2 = r34
            r3 = r15
            r4 = r36
            r5 = r27
            r6 = r28
            r0.m8676J(r1, r2, r3, r4, r5, r6)
            throw r17
        L3d8:
            r0 = r32
            r1 = r33
            r2 = r34
            r3 = r15
            r4 = r36
            r10 = r5
            r5 = r25
            r6 = r22
            r7 = r8
            r8 = r10
            r10 = r28
            r12 = r27
            r13 = r38
            int r0 = r0.m8677K(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 == r15) goto L3a8
        L3f4:
            r15 = r32
            r14 = r33
            r4 = r34
            r6 = r36
            r12 = r6
            r1 = r37
            r13 = r38
            r5 = r18
            r2 = r22
            r16 = r25
            r7 = r26
            r3 = r27
            r11 = r30
            goto L19
        L40f:
            r6 = r37
            r2 = r9
            r9 = r25
            r7 = r26
        L416:
            if (r9 != r6) goto L424
            if (r6 == 0) goto L424
            r8 = r32
            r12 = r33
            r0 = r2
            r1 = r6
            r5 = r18
            goto L49b
        L424:
            r8 = r32
            boolean r0 = r8.f16687f
            if (r0 == 0) goto L468
            r10 = r38
            java.lang.Object r0 = r10.f11971d
            k7.q5 r0 = (p185k7.C3948q5) r0
            k7.q5 r1 = p185k7.C3948q5.m8909a()
            if (r0 == r1) goto L465
            k7.f7 r0 = r8.f16686e
            java.lang.Object r1 = r10.f11971d
            k7.q5 r1 = (p185k7.C3948q5) r1
            java.util.Map<k7.p5, k7.c6<?, ?>> r1 = r1.f16847a
            k7.p5 r3 = new k7.p5
            r11 = r22
            r3.<init>(r0, r11)
            java.lang.Object r0 = r1.get(r3)
            k7.c6 r0 = (p185k7.C3759c6) r0
            if (r0 != 0) goto L45f
            k7.d8 r4 = m8663B(r33)
            r0 = r9
            r1 = r34
            r3 = r36
            r5 = r38
            int r0 = p124h7.C2939x3.m7265O(r0, r1, r2, r3, r4, r5)
            r12 = r33
            goto L47d
        L45f:
            r12 = r33
            r0 = r12
            k7.b6 r0 = (p185k7.AbstractC3745b6) r0
            throw r17
        L465:
            r12 = r33
            goto L46c
        L468:
            r12 = r33
            r10 = r38
        L46c:
            r11 = r22
            k7.d8 r4 = m8663B(r33)
            r0 = r9
            r1 = r34
            r3 = r36
            r5 = r38
            int r0 = p124h7.C2939x3.m7265O(r0, r1, r2, r3, r4, r5)
        L47d:
            r4 = r34
            r1 = r6
            r15 = r8
            r16 = r9
            r13 = r10
            r2 = r11
            r14 = r12
            r5 = r18
            r3 = r27
            r11 = r30
            r6 = r36
            r12 = r6
            goto L19
        L491:
            r18 = r5
            r26 = r7
            r30 = r11
            r12 = r14
            r8 = r15
            r9 = r16
        L49b:
            r2 = 1048575(0xfffff, float:1.469367E-39)
            if (r5 == r2) goto L4a6
            long r3 = (long) r5
            r5 = r30
            r5.putInt(r12, r3, r7)
        L4a6:
            int r3 = r8.f16690i
        L4a8:
            int r4 = r8.f16691j
            if (r3 >= r4) goto L4d3
            int[] r4 = r8.f16689h
            r4 = r4[r3]
            int[] r5 = r8.f16682a
            r5 = r5[r4]
            int r5 = r8.m8691j(r4)
            r5 = r5 & r2
            long r5 = (long) r5
            java.lang.Object r5 = p185k7.C3859j8.m8736j(r12, r5)
            if (r5 != 0) goto L4c1
            goto L4c7
        L4c1:
            k7.g6 r6 = r8.m8692l(r4)
            if (r6 != 0) goto L4ca
        L4c7:
            int r3 = r3 + 1
            goto L4a8
        L4ca:
            k7.a7 r5 = (p185k7.C3732a7) r5
            java.lang.Object r0 = r8.m8694n(r4)
            k7.y6 r0 = (p185k7.C4053y6) r0
            throw r17
        L4d3:
            r2 = r36
            if (r1 != 0) goto L4df
            if (r0 != r2) goto L4da
            goto L4e3
        L4da:
            k7.m6 r0 = p185k7.C3897m6.m8828c()
            throw r0
        L4df:
            if (r0 > r2) goto L4e4
            if (r9 != r1) goto L4e4
        L4e3:
            return r0
        L4e4:
            k7.m6 r0 = p185k7.C3897m6.m8828c()
            throw r0
    }

    /* renamed from: G */
    public final int m8674G(T r15) {
            r14 = this;
            sun.misc.Unsafe r0 = p185k7.C3844i7.f16681o
            r1 = 1048575(0xfffff, float:1.469367E-39)
            r2 = 0
            r3 = 0
            r4 = 1048575(0xfffff, float:1.469367E-39)
            r5 = 0
        Lb:
            int[] r6 = r14.f16682a
            int r6 = r6.length
            if (r2 >= r6) goto L40f
            int r6 = r14.m8691j(r2)
            int[] r7 = r14.f16682a
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
            boolean r1 = r14.m8702w(r15, r8, r2)
            if (r1 == 0) goto L408
            java.lang.Object r1 = r0.getObject(r15, r12)
            k7.f7 r1 = (p185k7.InterfaceC3802f7) r1
            k7.q7 r6 = r14.m8693m(r2)
            int r1 = p185k7.AbstractC3896m5.m8819F(r8, r1, r6)
            goto L407
        L55:
            boolean r6 = r14.m8702w(r15, r8, r2)
            if (r6 == 0) goto L408
            long r6 = m8669k(r15, r12)
            int r8 = r8 << 3
            int r8 = p185k7.AbstractC3896m5.m8824m(r8)
            long r9 = r6 + r6
            long r6 = r6 >> r1
            long r6 = r6 ^ r9
            int r1 = p185k7.AbstractC3896m5.m8825n(r6)
            goto L324
        L6f:
            boolean r1 = r14.m8702w(r15, r8, r2)
            if (r1 == 0) goto L408
            int r1 = m8668I(r15, r12)
            int r6 = r8 << 3
            int r6 = p185k7.AbstractC3896m5.m8824m(r6)
            int r7 = r1 + r1
            int r1 = r1 >> 31
            r1 = r1 ^ r7
            goto Lad
        L85:
            boolean r1 = r14.m8702w(r15, r8, r2)
            if (r1 == 0) goto L408
            goto L165
        L8d:
            boolean r1 = r14.m8702w(r15, r8, r2)
            if (r1 == 0) goto L408
            goto L157
        L95:
            boolean r1 = r14.m8702w(r15, r8, r2)
            if (r1 == 0) goto L408
            goto L124
        L9d:
            boolean r1 = r14.m8702w(r15, r8, r2)
            if (r1 == 0) goto L408
            int r1 = m8668I(r15, r12)
            int r6 = r8 << 3
            int r6 = p185k7.AbstractC3896m5.m8824m(r6)
        Lad:
            int r1 = p185k7.AbstractC3896m5.m8824m(r1)
            goto L3d3
        Lb3:
            boolean r1 = r14.m8702w(r15, r8, r2)
            if (r1 == 0) goto L408
            java.lang.Object r1 = r0.getObject(r15, r12)
            goto Le0
        Lbe:
            boolean r1 = r14.m8702w(r15, r8, r2)
            if (r1 == 0) goto L408
            java.lang.Object r1 = r0.getObject(r15, r12)
            k7.q7 r6 = r14.m8693m(r2)
            int r1 = p185k7.C3976s7.m8967H(r8, r1, r6)
            goto L407
        Ld2:
            boolean r1 = r14.m8702w(r15, r8, r2)
            if (r1 == 0) goto L408
            java.lang.Object r1 = r0.getObject(r15, r12)
            boolean r6 = r1 instanceof p185k7.AbstractC3842i5
            if (r6 == 0) goto Lf4
        Le0:
            k7.i5 r1 = (p185k7.AbstractC3842i5) r1
            int r6 = r8 << 3
            int r6 = p185k7.AbstractC3896m5.m8824m(r6)
            int r1 = r1.mo8520h()
            int r7 = p185k7.AbstractC3896m5.m8824m(r1)
            int r7 = r7 + r1
            int r7 = r7 + r6
            goto L251
        Lf4:
            java.lang.String r1 = (java.lang.String) r1
            int r6 = r8 << 3
            int r6 = p185k7.AbstractC3896m5.m8824m(r6)
            int r1 = p185k7.AbstractC3896m5.m8822I(r1)
            goto L3d3
        L102:
            boolean r1 = r14.m8702w(r15, r8, r2)
            if (r1 == 0) goto L408
            int r1 = r8 << 3
            int r1 = p185k7.AbstractC3896m5.m8824m(r1)
            goto L3b5
        L110:
            boolean r1 = r14.m8702w(r15, r8, r2)
            if (r1 == 0) goto L408
            goto L157
        L117:
            boolean r1 = r14.m8702w(r15, r8, r2)
            if (r1 == 0) goto L408
            goto L165
        L11e:
            boolean r1 = r14.m8702w(r15, r8, r2)
            if (r1 == 0) goto L408
        L124:
            int r1 = m8668I(r15, r12)
            int r6 = r8 << 3
            int r6 = p185k7.AbstractC3896m5.m8824m(r6)
            int r1 = p185k7.AbstractC3896m5.m8820G(r1)
            goto L3d3
        L134:
            boolean r1 = r14.m8702w(r15, r8, r2)
            if (r1 == 0) goto L408
            goto L141
        L13b:
            boolean r1 = r14.m8702w(r15, r8, r2)
            if (r1 == 0) goto L408
        L141:
            long r6 = m8669k(r15, r12)
            int r1 = r8 << 3
            int r1 = p185k7.AbstractC3896m5.m8824m(r1)
            int r6 = p185k7.AbstractC3896m5.m8825n(r6)
            goto L3ec
        L151:
            boolean r1 = r14.m8702w(r15, r8, r2)
            if (r1 == 0) goto L408
        L157:
            int r1 = r8 << 3
            int r1 = p185k7.AbstractC3896m5.m8824m(r1)
            goto L3f8
        L15f:
            boolean r1 = r14.m8702w(r15, r8, r2)
            if (r1 == 0) goto L408
        L165:
            int r1 = r8 << 3
            int r1 = p185k7.AbstractC3896m5.m8824m(r1)
            goto L405
        L16d:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.lang.Object r6 = r14.m8694n(r2)
            p185k7.C3746b7.m8226a(r8, r1, r6)
            goto L408
        L17a:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            k7.q7 r6 = r14.m8693m(r2)
            int r1 = p185k7.C3976s7.m8962C(r8, r1, r6)
            goto L407
        L18a:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = p185k7.C3976s7.m8972M(r1)
            if (r1 <= 0) goto L408
            goto L247
        L198:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = p185k7.C3976s7.m8970K(r1)
            if (r1 <= 0) goto L408
            goto L247
        L1a6:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = p185k7.C3976s7.m8961B(r1)
            if (r1 <= 0) goto L408
            goto L247
        L1b4:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = p185k7.C3976s7.m9003z(r1)
            if (r1 <= 0) goto L408
            goto L247
        L1c2:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = p185k7.C3976s7.m9001x(r1)
            if (r1 <= 0) goto L408
            goto L247
        L1d0:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = p185k7.C3976s7.m8975P(r1)
            if (r1 <= 0) goto L408
            goto L247
        L1de:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            java.lang.Class<?> r6 = p185k7.C3976s7.f16860a
            int r1 = r1.size()
            if (r1 <= 0) goto L408
            goto L247
        L1ed:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = p185k7.C3976s7.m9003z(r1)
            if (r1 <= 0) goto L408
            goto L247
        L1fa:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = p185k7.C3976s7.m8961B(r1)
            if (r1 <= 0) goto L408
            goto L247
        L207:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = p185k7.C3976s7.m8964E(r1)
            if (r1 <= 0) goto L408
            goto L247
        L214:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = p185k7.C3976s7.m8977R(r1)
            if (r1 <= 0) goto L408
            goto L247
        L221:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = p185k7.C3976s7.m8966G(r1)
            if (r1 <= 0) goto L408
            goto L247
        L22e:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = p185k7.C3976s7.m9003z(r1)
            if (r1 <= 0) goto L408
            goto L247
        L23b:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = p185k7.C3976s7.m8961B(r1)
            if (r1 <= 0) goto L408
        L247:
            int r6 = p185k7.AbstractC3896m5.m8823J(r8)
            int r7 = p185k7.AbstractC3896m5.m8824m(r1)
            int r7 = r7 + r6
            int r7 = r7 + r1
        L251:
            int r3 = r3 + r7
            goto L408
        L254:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            r6 = 0
            int r1 = p185k7.C3976s7.m8971L(r8, r1, r6)
            goto L407
        L261:
            r1 = 0
            java.lang.Object r6 = r0.getObject(r15, r12)
            java.util.List r6 = (java.util.List) r6
            int r1 = p185k7.C3976s7.m8969J(r8, r6, r1)
            goto L407
        L26e:
            r1 = 0
            java.lang.Object r6 = r0.getObject(r15, r12)
            java.util.List r6 = (java.util.List) r6
            int r1 = p185k7.C3976s7.m9000w(r8, r6, r1)
            goto L407
        L27b:
            r1 = 0
            java.lang.Object r6 = r0.getObject(r15, r12)
            java.util.List r6 = (java.util.List) r6
            int r1 = p185k7.C3976s7.m8974O(r8, r6, r1)
            goto L407
        L288:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = p185k7.C3976s7.m8999v(r8, r1)
            goto L407
        L294:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            k7.q7 r6 = r14.m8693m(r2)
            int r1 = p185k7.C3976s7.m8968I(r8, r1, r6)
            goto L407
        L2a4:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = p185k7.C3976s7.m8973N(r8, r1)
            goto L407
        L2b0:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = p185k7.C3976s7.m8996s(r8, r1)
            goto L407
        L2bc:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            r6 = 0
            int r1 = p185k7.C3976s7.m8963D(r8, r1, r6)
            goto L407
        L2c9:
            r1 = 0
            java.lang.Object r6 = r0.getObject(r15, r12)
            java.util.List r6 = (java.util.List) r6
            int r1 = p185k7.C3976s7.m8976Q(r8, r6, r1)
            goto L407
        L2d6:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = p185k7.C3976s7.m8965F(r8, r1)
            goto L407
        L2e2:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = p185k7.C3976s7.m9002y(r8, r1)
            goto L407
        L2ee:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = p185k7.C3976s7.m8960A(r8, r1)
            goto L407
        L2fa:
            r1 = r5 & r7
            if (r1 == 0) goto L408
            java.lang.Object r1 = r0.getObject(r15, r12)
            k7.f7 r1 = (p185k7.InterfaceC3802f7) r1
            k7.q7 r6 = r14.m8693m(r2)
            int r1 = p185k7.AbstractC3896m5.m8819F(r8, r1, r6)
            goto L407
        L30e:
            r6 = r7 & r5
            if (r6 == 0) goto L408
            long r6 = r0.getLong(r15, r12)
            int r8 = r8 << 3
            int r8 = p185k7.AbstractC3896m5.m8824m(r8)
            long r9 = r6 + r6
            long r6 = r6 >> r1
            long r6 = r6 ^ r9
            int r1 = p185k7.AbstractC3896m5.m8825n(r6)
        L324:
            int r1 = r1 + r8
            goto L407
        L327:
            r1 = r5 & r7
            if (r1 == 0) goto L408
            int r1 = r0.getInt(r15, r12)
            int r6 = r8 << 3
            int r6 = p185k7.AbstractC3896m5.m8824m(r6)
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
            int r6 = p185k7.AbstractC3896m5.m8824m(r6)
        L35b:
            int r1 = p185k7.AbstractC3896m5.m8824m(r1)
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
            k7.q7 r6 = r14.m8693m(r2)
            int r1 = p185k7.C3976s7.m8967H(r8, r1, r6)
            goto L407
        L37c:
            r1 = r5 & r7
            if (r1 == 0) goto L408
            java.lang.Object r1 = r0.getObject(r15, r12)
            boolean r6 = r1 instanceof p185k7.AbstractC3842i5
            if (r6 == 0) goto L39e
        L388:
            k7.i5 r1 = (p185k7.AbstractC3842i5) r1
            int r6 = r8 << 3
            int r6 = p185k7.AbstractC3896m5.m8824m(r6)
            int r1 = r1.mo8520h()
            int r7 = p185k7.AbstractC3896m5.m8824m(r1)
            int r7 = r7 + r1
            int r7 = r7 + r6
            int r7 = r7 + r3
            r3 = r7
            goto L408
        L39e:
            java.lang.String r1 = (java.lang.String) r1
            int r6 = r8 << 3
            int r6 = p185k7.AbstractC3896m5.m8824m(r6)
            int r1 = p185k7.AbstractC3896m5.m8822I(r1)
            goto L3d3
        L3ab:
            r1 = r5 & r7
            if (r1 == 0) goto L408
            int r1 = r8 << 3
            int r1 = p185k7.AbstractC3896m5.m8824m(r1)
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
            int r6 = p185k7.AbstractC3896m5.m8824m(r6)
            int r1 = p185k7.AbstractC3896m5.m8820G(r1)
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
            int r1 = p185k7.AbstractC3896m5.m8824m(r1)
            int r6 = p185k7.AbstractC3896m5.m8825n(r6)
        L3ec:
            int r1 = r1 + r6
            goto L407
        L3ee:
            r1 = r5 & r7
            if (r1 == 0) goto L408
        L3f2:
            int r1 = r8 << 3
            int r1 = p185k7.AbstractC3896m5.m8824m(r1)
        L3f8:
            int r1 = r1 + 4
            goto L407
        L3fb:
            r1 = r5 & r7
            if (r1 == 0) goto L408
        L3ff:
            int r1 = r8 << 3
            int r1 = p185k7.AbstractC3896m5.m8824m(r1)
        L405:
            int r1 = r1 + 8
        L407:
            int r3 = r3 + r1
        L408:
            int r2 = r2 + 3
            r1 = 1048575(0xfffff, float:1.469367E-39)
            goto Lb
        L40f:
            k7.c8<?, ?> r0 = r14.f16693l
            java.lang.Object r1 = r0.mo8302c(r15)
            int r0 = r0.mo8300a(r1)
            int r0 = r0 + r3
            boolean r1 = r14.f16687f
            if (r1 != 0) goto L41f
            return r0
        L41f:
            k7.r5<?> r0 = r14.f16694m
            r0.mo8919a(r15)
            r15 = 0
            throw r15
    }

    /* renamed from: H */
    public final int m8675H(T r11) {
            r10 = this;
            sun.misc.Unsafe r0 = p185k7.C3844i7.f16681o
            r1 = 0
            r2 = 0
            r3 = 0
        L5:
            int[] r4 = r10.f16682a
            int r4 = r4.length
            if (r2 >= r4) goto L399
            int r4 = r10.m8691j(r2)
            int r5 = r4 >>> 20
            r5 = r5 & 255(0xff, float:3.57E-43)
            int[] r6 = r10.f16682a
            r7 = r6[r2]
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r4 & r8
            long r8 = (long) r4
            k7.w5 r4 = p185k7.EnumC4026w5.f16923Z
            int r4 = r4.f16927Y
            if (r5 < r4) goto L2b
            k7.w5 r4 = p185k7.EnumC4026w5.f16924a0
            int r4 = r4.f16927Y
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
            boolean r4 = r10.m8702w(r11, r7, r2)
            if (r4 == 0) goto L395
            goto L268
        L3a:
            boolean r5 = r10.m8702w(r11, r7, r2)
            if (r5 == 0) goto L395
            long r5 = m8669k(r11, r8)
            goto L282
        L46:
            boolean r4 = r10.m8702w(r11, r7, r2)
            if (r4 == 0) goto L395
            int r4 = m8668I(r11, r8)
            goto L29e
        L52:
            boolean r4 = r10.m8702w(r11, r7, r2)
            if (r4 == 0) goto L395
            goto L38c
        L5a:
            boolean r4 = r10.m8702w(r11, r7, r2)
            if (r4 == 0) goto L395
            goto L37d
        L62:
            boolean r4 = r10.m8702w(r11, r7, r2)
            if (r4 == 0) goto L395
            goto Lb3
        L69:
            boolean r4 = r10.m8702w(r11, r7, r2)
            if (r4 == 0) goto L395
            int r4 = m8668I(r11, r8)
            goto L2cc
        L75:
            boolean r4 = r10.m8702w(r11, r7, r2)
            if (r4 == 0) goto L395
            goto L2de
        L7d:
            boolean r4 = r10.m8702w(r11, r7, r2)
            if (r4 == 0) goto L395
            goto L2e9
        L85:
            boolean r4 = r10.m8702w(r11, r7, r2)
            if (r4 == 0) goto L395
            java.lang.Object r4 = p185k7.C3859j8.m8736j(r11, r8)
            boolean r5 = r4 instanceof p185k7.AbstractC3842i5
            if (r5 == 0) goto L31a
            goto L305
        L95:
            boolean r4 = r10.m8702w(r11, r7, r2)
            if (r4 == 0) goto L395
            goto L32d
        L9d:
            boolean r4 = r10.m8702w(r11, r7, r2)
            if (r4 == 0) goto L395
            goto L37d
        La5:
            boolean r4 = r10.m8702w(r11, r7, r2)
            if (r4 == 0) goto L395
            goto L38c
        Lad:
            boolean r4 = r10.m8702w(r11, r7, r2)
            if (r4 == 0) goto L395
        Lb3:
            int r4 = m8668I(r11, r8)
            goto L34e
        Lb9:
            boolean r4 = r10.m8702w(r11, r7, r2)
            if (r4 == 0) goto L395
            goto Lc6
        Lc0:
            boolean r4 = r10.m8702w(r11, r7, r2)
            if (r4 == 0) goto L395
        Lc6:
            long r4 = m8669k(r11, r8)
            goto L36b
        Lcc:
            boolean r4 = r10.m8702w(r11, r7, r2)
            if (r4 == 0) goto L395
            goto L37d
        Ld4:
            boolean r4 = r10.m8702w(r11, r7, r2)
            if (r4 == 0) goto L395
            goto L38c
        Ldc:
            java.lang.Object r4 = p185k7.C3859j8.m8736j(r11, r8)
            java.lang.Object r5 = r10.m8694n(r2)
            p185k7.C3746b7.m8226a(r7, r4, r5)
            goto L395
        Le9:
            java.lang.Object r4 = p185k7.C3859j8.m8736j(r11, r8)
            java.util.List r4 = (java.util.List) r4
            k7.q7 r5 = r10.m8693m(r2)
            int r4 = p185k7.C3976s7.m8962C(r7, r4, r5)
            goto L394
        Lf9:
            java.lang.Object r4 = r0.getObject(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p185k7.C3976s7.m8972M(r4)
            if (r4 <= 0) goto L395
            goto L1b6
        L107:
            java.lang.Object r4 = r0.getObject(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p185k7.C3976s7.m8970K(r4)
            if (r4 <= 0) goto L395
            goto L1b6
        L115:
            java.lang.Object r4 = r0.getObject(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p185k7.C3976s7.m8961B(r4)
            if (r4 <= 0) goto L395
            goto L1b6
        L123:
            java.lang.Object r4 = r0.getObject(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p185k7.C3976s7.m9003z(r4)
            if (r4 <= 0) goto L395
            goto L1b6
        L131:
            java.lang.Object r4 = r0.getObject(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p185k7.C3976s7.m9001x(r4)
            if (r4 <= 0) goto L395
            goto L1b6
        L13f:
            java.lang.Object r4 = r0.getObject(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p185k7.C3976s7.m8975P(r4)
            if (r4 <= 0) goto L395
            goto L1b6
        L14d:
            java.lang.Object r4 = r0.getObject(r11, r8)
            java.util.List r4 = (java.util.List) r4
            java.lang.Class<?> r5 = p185k7.C3976s7.f16860a
            int r4 = r4.size()
            if (r4 <= 0) goto L395
            goto L1b6
        L15c:
            java.lang.Object r4 = r0.getObject(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p185k7.C3976s7.m9003z(r4)
            if (r4 <= 0) goto L395
            goto L1b6
        L169:
            java.lang.Object r4 = r0.getObject(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p185k7.C3976s7.m8961B(r4)
            if (r4 <= 0) goto L395
            goto L1b6
        L176:
            java.lang.Object r4 = r0.getObject(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p185k7.C3976s7.m8964E(r4)
            if (r4 <= 0) goto L395
            goto L1b6
        L183:
            java.lang.Object r4 = r0.getObject(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p185k7.C3976s7.m8977R(r4)
            if (r4 <= 0) goto L395
            goto L1b6
        L190:
            java.lang.Object r4 = r0.getObject(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p185k7.C3976s7.m8966G(r4)
            if (r4 <= 0) goto L395
            goto L1b6
        L19d:
            java.lang.Object r4 = r0.getObject(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p185k7.C3976s7.m9003z(r4)
            if (r4 <= 0) goto L395
            goto L1b6
        L1aa:
            java.lang.Object r4 = r0.getObject(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p185k7.C3976s7.m8961B(r4)
            if (r4 <= 0) goto L395
        L1b6:
            int r5 = p185k7.AbstractC3896m5.m8823J(r7)
            int r6 = p185k7.AbstractC3896m5.m8824m(r4)
            int r6 = r6 + r5
            int r6 = r6 + r4
            goto L317
        L1c2:
            java.lang.Object r4 = p185k7.C3859j8.m8736j(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p185k7.C3976s7.m8971L(r7, r4, r1)
            goto L394
        L1ce:
            java.lang.Object r4 = p185k7.C3859j8.m8736j(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p185k7.C3976s7.m8969J(r7, r4, r1)
            goto L394
        L1da:
            java.lang.Object r4 = p185k7.C3859j8.m8736j(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p185k7.C3976s7.m9000w(r7, r4, r1)
            goto L394
        L1e6:
            java.lang.Object r4 = p185k7.C3859j8.m8736j(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p185k7.C3976s7.m8974O(r7, r4, r1)
            goto L394
        L1f2:
            java.lang.Object r4 = p185k7.C3859j8.m8736j(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p185k7.C3976s7.m8999v(r7, r4)
            goto L394
        L1fe:
            java.lang.Object r4 = p185k7.C3859j8.m8736j(r11, r8)
            java.util.List r4 = (java.util.List) r4
            k7.q7 r5 = r10.m8693m(r2)
            int r4 = p185k7.C3976s7.m8968I(r7, r4, r5)
            goto L394
        L20e:
            java.lang.Object r4 = p185k7.C3859j8.m8736j(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p185k7.C3976s7.m8973N(r7, r4)
            goto L394
        L21a:
            java.lang.Object r4 = p185k7.C3859j8.m8736j(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p185k7.C3976s7.m8996s(r7, r4)
            goto L394
        L226:
            java.lang.Object r4 = p185k7.C3859j8.m8736j(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p185k7.C3976s7.m8963D(r7, r4, r1)
            goto L394
        L232:
            java.lang.Object r4 = p185k7.C3859j8.m8736j(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p185k7.C3976s7.m8976Q(r7, r4, r1)
            goto L394
        L23e:
            java.lang.Object r4 = p185k7.C3859j8.m8736j(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p185k7.C3976s7.m8965F(r7, r4)
            goto L394
        L24a:
            java.lang.Object r4 = p185k7.C3859j8.m8736j(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p185k7.C3976s7.m9002y(r7, r4)
            goto L394
        L256:
            java.lang.Object r4 = p185k7.C3859j8.m8736j(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p185k7.C3976s7.m8960A(r7, r4)
            goto L394
        L262:
            boolean r4 = r10.m8700u(r11, r2)
            if (r4 == 0) goto L395
        L268:
            java.lang.Object r4 = p185k7.C3859j8.m8736j(r11, r8)
            k7.f7 r4 = (p185k7.InterfaceC3802f7) r4
            k7.q7 r5 = r10.m8693m(r2)
            int r4 = p185k7.AbstractC3896m5.m8819F(r7, r4, r5)
            goto L394
        L278:
            boolean r5 = r10.m8700u(r11, r2)
            if (r5 == 0) goto L395
            long r5 = p185k7.C3859j8.m8734h(r11, r8)
        L282:
            int r7 = r7 << 3
            int r7 = p185k7.AbstractC3896m5.m8824m(r7)
            long r8 = r5 + r5
            long r4 = r5 >> r4
            long r4 = r4 ^ r8
            int r4 = p185k7.AbstractC3896m5.m8825n(r4)
            int r4 = r4 + r7
            goto L394
        L294:
            boolean r4 = r10.m8700u(r11, r2)
            if (r4 == 0) goto L395
            int r4 = p185k7.C3859j8.m8733g(r11, r8)
        L29e:
            int r5 = r7 << 3
            int r5 = p185k7.AbstractC3896m5.m8824m(r5)
            int r6 = r4 + r4
            int r4 = r4 >> 31
            r4 = r4 ^ r6
            goto L2d2
        L2aa:
            boolean r4 = r10.m8700u(r11, r2)
            if (r4 == 0) goto L395
            goto L38c
        L2b2:
            boolean r4 = r10.m8700u(r11, r2)
            if (r4 == 0) goto L395
            goto L37d
        L2ba:
            boolean r4 = r10.m8700u(r11, r2)
            if (r4 == 0) goto L395
            goto L34a
        L2c2:
            boolean r4 = r10.m8700u(r11, r2)
            if (r4 == 0) goto L395
            int r4 = p185k7.C3859j8.m8733g(r11, r8)
        L2cc:
            int r5 = r7 << 3
            int r5 = p185k7.AbstractC3896m5.m8824m(r5)
        L2d2:
            int r4 = p185k7.AbstractC3896m5.m8824m(r4)
            goto L358
        L2d8:
            boolean r4 = r10.m8700u(r11, r2)
            if (r4 == 0) goto L395
        L2de:
            java.lang.Object r4 = p185k7.C3859j8.m8736j(r11, r8)
            goto L305
        L2e3:
            boolean r4 = r10.m8700u(r11, r2)
            if (r4 == 0) goto L395
        L2e9:
            java.lang.Object r4 = p185k7.C3859j8.m8736j(r11, r8)
            k7.q7 r5 = r10.m8693m(r2)
            int r4 = p185k7.C3976s7.m8967H(r7, r4, r5)
            goto L394
        L2f7:
            boolean r4 = r10.m8700u(r11, r2)
            if (r4 == 0) goto L395
            java.lang.Object r4 = p185k7.C3859j8.m8736j(r11, r8)
            boolean r5 = r4 instanceof p185k7.AbstractC3842i5
            if (r5 == 0) goto L31a
        L305:
            k7.i5 r4 = (p185k7.AbstractC3842i5) r4
            int r5 = r7 << 3
            int r5 = p185k7.AbstractC3896m5.m8824m(r5)
            int r4 = r4.mo8520h()
            int r6 = p185k7.AbstractC3896m5.m8824m(r4)
            int r6 = r6 + r4
            int r6 = r6 + r5
        L317:
            int r3 = r3 + r6
            goto L395
        L31a:
            java.lang.String r4 = (java.lang.String) r4
            int r5 = r7 << 3
            int r5 = p185k7.AbstractC3896m5.m8824m(r5)
            int r4 = p185k7.AbstractC3896m5.m8822I(r4)
            goto L358
        L327:
            boolean r4 = r10.m8700u(r11, r2)
            if (r4 == 0) goto L395
        L32d:
            int r4 = r7 << 3
            int r4 = p185k7.AbstractC3896m5.m8824m(r4)
            int r4 = r4 + 1
            goto L394
        L336:
            boolean r4 = r10.m8700u(r11, r2)
            if (r4 == 0) goto L395
            goto L37d
        L33d:
            boolean r4 = r10.m8700u(r11, r2)
            if (r4 == 0) goto L395
            goto L38c
        L344:
            boolean r4 = r10.m8700u(r11, r2)
            if (r4 == 0) goto L395
        L34a:
            int r4 = p185k7.C3859j8.m8733g(r11, r8)
        L34e:
            int r5 = r7 << 3
            int r5 = p185k7.AbstractC3896m5.m8824m(r5)
            int r4 = p185k7.AbstractC3896m5.m8820G(r4)
        L358:
            int r4 = r4 + r5
            goto L394
        L35a:
            boolean r4 = r10.m8700u(r11, r2)
            if (r4 == 0) goto L395
            goto L367
        L361:
            boolean r4 = r10.m8700u(r11, r2)
            if (r4 == 0) goto L395
        L367:
            long r4 = p185k7.C3859j8.m8734h(r11, r8)
        L36b:
            int r6 = r7 << 3
            int r6 = p185k7.AbstractC3896m5.m8824m(r6)
            int r4 = p185k7.AbstractC3896m5.m8825n(r4)
            int r4 = r4 + r6
            goto L394
        L377:
            boolean r4 = r10.m8700u(r11, r2)
            if (r4 == 0) goto L395
        L37d:
            int r4 = r7 << 3
            int r4 = p185k7.AbstractC3896m5.m8824m(r4)
            int r4 = r4 + 4
            goto L394
        L386:
            boolean r4 = r10.m8700u(r11, r2)
            if (r4 == 0) goto L395
        L38c:
            int r4 = r7 << 3
            int r4 = p185k7.AbstractC3896m5.m8824m(r4)
            int r4 = r4 + 8
        L394:
            int r3 = r3 + r4
        L395:
            int r2 = r2 + 3
            goto L5
        L399:
            k7.c8<?, ?> r0 = r10.f16693l
            java.lang.Object r11 = r0.mo8302c(r11)
            int r11 = r0.mo8300a(r11)
            int r11 = r11 + r3
            return r11
    }

    /* renamed from: J */
    public final int m8676J(java.lang.Object r2, byte[] r3, int r4, int r5, int r6, long r7) {
            r1 = this;
            sun.misc.Unsafe r3 = p185k7.C3844i7.f16681o
            java.lang.Object r4 = r1.m8694n(r6)
            java.lang.Object r5 = r3.getObject(r2, r7)
            r6 = r5
            k7.a7 r6 = (p185k7.C3732a7) r6
            boolean r6 = r6.f16456Y
            if (r6 != 0) goto L2b
            k7.a7 r6 = p185k7.C3732a7.f16455Z
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L1f
            k7.a7 r6 = new k7.a7
            r6.<init>()
            goto L25
        L1f:
            k7.a7 r0 = new k7.a7
            r0.<init>(r6)
            r6 = r0
        L25:
            p185k7.C3746b7.m8227b(r6, r5)
            r3.putObject(r2, r7, r6)
        L2b:
            k7.y6 r4 = (p185k7.C4053y6) r4
            r2 = 0
            throw r2
    }

    /* renamed from: K */
    public final int m8677K(T r17, byte[] r18, int r19, int r20, int r21, int r22, int r23, int r24, int r25, long r26, int r28, p124h7.C2915vf r29) {
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
            sun.misc.Unsafe r12 = p185k7.C3844i7.f16681o
            int[] r7 = r0.f16682a
            int r13 = r6 + 2
            r7 = r7[r13]
            r13 = 1048575(0xfffff, float:1.469367E-39)
            r7 = r7 & r13
            long r13 = (long) r7
            r7 = 2
            r15 = 5
            switch(r25) {
                case 51: goto L17d;
                case 52: goto L165;
                case 53: goto L151;
                case 54: goto L151;
                case 55: goto L143;
                case 56: goto L12e;
                case 57: goto L119;
                case 58: goto L103;
                case 59: goto Lcf;
                case 60: goto Lad;
                case 61: goto La1;
                case 62: goto L143;
                case 63: goto L72;
                case 64: goto L119;
                case 65: goto L12e;
                case 66: goto L62;
                case 67: goto L52;
                case 68: goto L28;
                default: goto L26;
            }
        L26:
            goto L196
        L28:
            r7 = 3
            if (r5 != r7) goto L196
            k7.q7 r5 = r0.m8693m(r6)
            r2 = r2 & (-8)
            r6 = r2 | 4
            r2 = r5
            r3 = r18
            r4 = r19
            r5 = r20
            r7 = r29
            int r2 = p124h7.C2939x3.m7300z(r2, r3, r4, r5, r6, r7)
            int r3 = r12.getInt(r1, r13)
            if (r3 != r8) goto L4b
            java.lang.Object r15 = r12.getObject(r1, r9)
            goto L4c
        L4b:
            r15 = 0
        L4c:
            java.lang.Object r3 = r11.f11970c
            if (r15 != 0) goto Lca
            goto Ldb
        L52:
            if (r5 == 0) goto L56
            goto L196
        L56:
            int r2 = p124h7.C2939x3.m7273W(r3, r4, r11)
            long r3 = r11.f11969b
            long r3 = p185k7.C3856j5.m8726b(r3)
            goto L15a
        L62:
            if (r5 == 0) goto L66
            goto L196
        L66:
            int r2 = p124h7.C2939x3.m7267Q(r3, r4, r11)
            int r3 = r11.f11968a
            int r3 = p185k7.C3856j5.m8725a(r3)
            goto L14c
        L72:
            if (r5 != 0) goto L196
            int r3 = p124h7.C2939x3.m7267Q(r3, r4, r11)
            int r4 = r11.f11968a
            k7.g6 r5 = r0.m8692l(r6)
            if (r5 == 0) goto L94
            boolean r5 = r5.mo8232a(r4)
            if (r5 == 0) goto L87
            goto L94
        L87:
            k7.d8 r1 = m8663B(r17)
            long r4 = (long) r4
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r1.m8504c(r2, r4)
            goto L9e
        L94:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            r12.putObject(r1, r9, r2)
            r12.putInt(r1, r13, r8)
        L9e:
            r2 = r3
            goto L197
        La1:
            if (r5 == r7) goto La5
            goto L196
        La5:
            int r2 = p124h7.C2939x3.m7291q(r3, r4, r11)
            java.lang.Object r3 = r11.f11970c
            goto L15e
        Lad:
            if (r5 != r7) goto L196
            k7.q7 r2 = r0.m8693m(r6)
            r5 = r20
            int r2 = p124h7.C2939x3.m7253C(r2, r3, r4, r5, r11)
            int r3 = r12.getInt(r1, r13)
            if (r3 != r8) goto Lc4
            java.lang.Object r15 = r12.getObject(r1, r9)
            goto Lc5
        Lc4:
            r15 = 0
        Lc5:
            java.lang.Object r3 = r11.f11970c
            if (r15 != 0) goto Lca
            goto Ldb
        Lca:
            java.lang.Object r3 = p185k7.C3871k6.m8783c(r15, r3)
            goto Ldb
        Lcf:
            if (r5 != r7) goto L196
            int r2 = p124h7.C2939x3.m7267Q(r3, r4, r11)
            int r4 = r11.f11968a
            if (r4 != 0) goto Ldf
            java.lang.String r3 = ""
        Ldb:
            r12.putObject(r1, r9, r3)
            goto Lfe
        Ldf:
            r5 = 536870912(0x20000000, float:1.0842022E-19)
            r5 = r24 & r5
            if (r5 == 0) goto Lf3
            int r5 = r2 + r4
            boolean r5 = p185k7.C3899m8.m8833d(r3, r2, r5)
            if (r5 == 0) goto Lee
            goto Lf3
        Lee:
            k7.m6 r1 = p185k7.C3897m6.m8826a()
            throw r1
        Lf3:
            java.lang.String r5 = new java.lang.String
            java.nio.charset.Charset r6 = p185k7.C3871k6.f16722a
            r5.<init>(r3, r2, r4, r6)
            r12.putObject(r1, r9, r5)
            int r2 = r2 + r4
        Lfe:
            r12.putInt(r1, r13, r8)
            goto L197
        L103:
            if (r5 != 0) goto L196
            int r2 = p124h7.C2939x3.m7273W(r3, r4, r11)
            long r3 = r11.f11969b
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L113
            r15 = 1
            goto L114
        L113:
            r15 = 0
        L114:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r15)
            goto L15e
        L119:
            if (r5 == r15) goto L11d
            goto L196
        L11d:
            int r2 = p124h7.C2939x3.m7297w(r18, r19)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r12.putObject(r1, r9, r2)
            r12.putInt(r1, r13, r8)
            int r1 = r4 + 4
            return r1
        L12e:
            r2 = 1
            if (r5 == r2) goto L132
            goto L196
        L132:
            long r2 = p124h7.C2939x3.m7274X(r18, r19)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r12.putObject(r1, r9, r2)
            r12.putInt(r1, r13, r8)
            int r1 = r4 + 8
            return r1
        L143:
            if (r5 == 0) goto L146
            goto L196
        L146:
            int r2 = p124h7.C2939x3.m7267Q(r3, r4, r11)
            int r3 = r11.f11968a
        L14c:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L15e
        L151:
            if (r5 == 0) goto L154
            goto L196
        L154:
            int r2 = p124h7.C2939x3.m7273W(r3, r4, r11)
            long r3 = r11.f11969b
        L15a:
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
        L15e:
            r12.putObject(r1, r9, r3)
            r12.putInt(r1, r13, r8)
            return r2
        L165:
            if (r5 == r15) goto L168
            goto L196
        L168:
            int r2 = p124h7.C2939x3.m7297w(r18, r19)
            float r2 = java.lang.Float.intBitsToFloat(r2)
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            r12.putObject(r1, r9, r2)
            r12.putInt(r1, r13, r8)
            int r1 = r4 + 4
            return r1
        L17d:
            r2 = 1
            if (r5 == r2) goto L181
            goto L196
        L181:
            long r2 = p124h7.C2939x3.m7274X(r18, r19)
            double r2 = java.lang.Double.longBitsToDouble(r2)
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
            r12.putObject(r1, r9, r2)
            r12.putInt(r1, r13, r8)
            int r1 = r4 + 8
            return r1
        L196:
            r2 = r4
        L197:
            return r2
    }

    /* renamed from: L */
    public final int m8678L(T r30, byte[] r31, int r32, int r33, p124h7.C2915vf r34) {
            r29 = this;
            r15 = r33
            sun.misc.Unsafe r14 = p185k7.C3844i7.f16681o
            r12 = -1
            r13 = 1048575(0xfffff, float:1.469367E-39)
            r11 = 0
            r6 = r29
            r4 = r30
            r7 = r31
            r0 = r32
            r8 = r34
            r1 = -1
            r2 = 0
            r9 = 0
            r10 = 1048575(0xfffff, float:1.469367E-39)
        L19:
            if (r0 >= r15) goto L356
            int r3 = r0 + 1
            r0 = r7[r0]
            if (r0 >= 0) goto L2b
            int r0 = p124h7.C2939x3.m7269S(r0, r7, r3, r8)
            int r3 = r8.f11968a
            r5 = r0
            r16 = r3
            goto L2e
        L2b:
            r16 = r0
            r5 = r3
        L2e:
            int r3 = r16 >>> 3
            r0 = r16 & 7
            if (r3 <= r1) goto L43
            int r2 = r2 / 3
            int r1 = r6.f16684c
            if (r3 < r1) goto L51
            int r1 = r6.f16685d
            if (r3 > r1) goto L51
            int r1 = r6.m8681O(r3, r2)
            goto L4f
        L43:
            int r1 = r6.f16684c
            if (r3 < r1) goto L51
            int r1 = r6.f16685d
            if (r3 > r1) goto L51
            int r1 = r6.m8681O(r3, r11)
        L4f:
            r2 = r1
            goto L52
        L51:
            r2 = -1
        L52:
            if (r2 != r12) goto L5d
            r24 = r3
            r12 = r14
            r2 = 0
            r25 = 1048575(0xfffff, float:1.469367E-39)
            goto L232
        L5d:
            int[] r1 = r6.f16682a
            int r17 = r2 + 1
            r11 = r1[r17]
            int r12 = r11 >>> 20
            r12 = r12 & 255(0xff, float:3.57E-43)
            r32 = r3
            r3 = r11 & r13
            r19 = r14
            long r13 = (long) r3
            r3 = 17
            r21 = r11
            if (r12 > r3) goto L23d
            int r3 = r2 + 2
            r1 = r1[r3]
            int r3 = r1 >>> 20
            r11 = 1
            int r23 = r11 << r3
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r1 & r3
            r20 = r12
            if (r1 == r10) goto L9a
            if (r10 == r3) goto L8e
            long r11 = (long) r10
            r10 = r19
            r10.putInt(r4, r11, r9)
            goto L90
        L8e:
            r10 = r19
        L90:
            if (r1 == r3) goto L97
            long r11 = (long) r1
            int r9 = r10.getInt(r4, r11)
        L97:
            r12 = r10
            r10 = r1
            goto L9c
        L9a:
            r12 = r19
        L9c:
            r1 = 5
            switch(r20) {
                case 0: goto L20e;
                case 1: goto L1e4;
                case 2: goto L1c5;
                case 3: goto L1c5;
                case 4: goto L1b2;
                case 5: goto L18f;
                case 6: goto L175;
                case 7: goto L157;
                case 8: goto L138;
                case 9: goto L116;
                case 10: goto Lfb;
                case 11: goto L1b2;
                case 12: goto Le8;
                case 13: goto L175;
                case 14: goto L18f;
                case 15: goto Ld4;
                case 16: goto La8;
                default: goto La0;
            }
        La0:
            r24 = r32
            r4 = r2
            r25 = 1048575(0xfffff, float:1.469367E-39)
            goto L231
        La8:
            if (r0 != 0) goto Lcc
            int r11 = p124h7.C2939x3.m7273W(r7, r5, r8)
            long r0 = r8.f11969b
            long r19 = p185k7.C3856j5.m8726b(r0)
            r0 = r12
            r1 = r30
            r24 = r32
            r5 = r2
            r25 = 1048575(0xfffff, float:1.469367E-39)
            r2 = r13
            r13 = r4
            r14 = r5
            r4 = r19
            r0.putLong(r1, r2, r4)
            r0 = r9 | r23
            r9 = r0
            r0 = r11
            r11 = r13
            r4 = r14
            goto L111
        Lcc:
            r24 = r32
            r25 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r2
            goto L231
        Ld4:
            r24 = r32
            r11 = r4
            r25 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r2
            if (r0 != 0) goto L231
            int r0 = p124h7.C2939x3.m7267Q(r7, r5, r8)
            int r1 = r8.f11968a
            int r1 = p185k7.C3856j5.m8725a(r1)
            goto Lf7
        Le8:
            r24 = r32
            r11 = r4
            r25 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r2
            if (r0 != 0) goto L231
            int r0 = p124h7.C2939x3.m7267Q(r7, r5, r8)
            int r1 = r8.f11968a
        Lf7:
            r12.putInt(r11, r13, r1)
            goto L10e
        Lfb:
            r24 = r32
            r11 = r4
            r1 = 2
            r25 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r2
            if (r0 != r1) goto L231
            int r0 = p124h7.C2939x3.m7291q(r7, r5, r8)
            java.lang.Object r1 = r8.f11970c
            r12.putObject(r11, r13, r1)
        L10e:
            r1 = r9 | r23
            r9 = r1
        L111:
            r19 = r4
            r13 = r6
            goto L284
        L116:
            r24 = r32
            r11 = r4
            r1 = 2
            r25 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r2
            if (r0 != r1) goto L231
            k7.q7 r0 = r6.m8693m(r4)
            int r0 = p124h7.C2939x3.m7253C(r0, r7, r5, r15, r8)
            java.lang.Object r1 = r12.getObject(r11, r13)
            if (r1 != 0) goto L131
        L12e:
            java.lang.Object r1 = r8.f11970c
            goto L152
        L131:
            java.lang.Object r2 = r8.f11970c
            java.lang.Object r1 = p185k7.C3871k6.m8783c(r1, r2)
            goto L152
        L138:
            r24 = r32
            r11 = r4
            r1 = 2
            r25 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r2
            if (r0 != r1) goto L231
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r21 & r0
            if (r0 != 0) goto L14d
            int r0 = p124h7.C2939x3.m7261K(r7, r5, r8)
            goto L12e
        L14d:
            int r0 = p124h7.C2939x3.m7263M(r7, r5, r8)
            goto L12e
        L152:
            r12.putObject(r11, r13, r1)
            goto L1fc
        L157:
            r24 = r32
            r11 = r4
            r25 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r2
            if (r0 != 0) goto L1ac
            int r0 = p124h7.C2939x3.m7273W(r7, r5, r8)
            long r1 = r8.f11969b
            r19 = 0
            int r3 = (r1 > r19 ? 1 : (r1 == r19 ? 0 : -1))
            if (r3 == 0) goto L16e
            r1 = 1
            goto L16f
        L16e:
            r1 = 0
        L16f:
            e7.i8 r2 = p185k7.C3859j8.f16708c
            r2.mo4205c(r11, r13, r1)
            goto L188
        L175:
            r24 = r32
            r11 = r4
            r25 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r2
            if (r0 != r1) goto L1ac
            int r0 = p124h7.C2939x3.m7297w(r7, r5)
            r12.putInt(r11, r13, r0)
            int r5 = r5 + 4
            r0 = r5
        L188:
            r9 = r9 | r23
            r2 = r4
            r4 = r11
            r14 = r12
            goto L289
        L18f:
            r24 = r32
            r11 = r4
            r1 = 1
            r25 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r2
            if (r0 != r1) goto L1ac
            long r19 = p124h7.C2939x3.m7274X(r7, r5)
            r0 = r12
            r1 = r30
            r2 = r13
            r14 = r4
            r13 = r5
            r4 = r19
            r0.putLong(r1, r2, r4)
            int r0 = r13 + 8
            r4 = r14
            goto L1fc
        L1ac:
            r14 = r4
            r13 = r5
            r5 = r13
            r4 = r14
            goto L231
        L1b2:
            r24 = r32
            r11 = r4
            r25 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r2
            if (r0 != 0) goto L231
            int r0 = p124h7.C2939x3.m7267Q(r7, r5, r8)
            int r1 = r8.f11968a
            r12.putInt(r11, r13, r1)
            goto L1fc
        L1c5:
            r24 = r32
            r11 = r4
            r25 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r2
            if (r0 != 0) goto L231
            int r16 = p124h7.C2939x3.m7273W(r7, r5, r8)
            long r2 = r8.f11969b
            r0 = r12
            r1 = r30
            r19 = r2
            r2 = r13
            r13 = r4
            r4 = r19
            r0.putLong(r1, r2, r4)
            r0 = r9 | r23
            r4 = r13
            goto L201
        L1e4:
            r24 = r32
            r11 = r4
            r25 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r2
            if (r0 != r1) goto L231
            int r0 = p124h7.C2939x3.m7297w(r7, r5)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            e7.i8 r1 = p185k7.C3859j8.f16708c
            r1.mo4208f(r11, r13, r0)
            int r0 = r5 + 4
        L1fc:
            r1 = r9 | r23
            r16 = r0
            r0 = r1
        L201:
            r9 = r0
            r2 = r4
            r4 = r11
            r28 = r12
            r0 = r16
            r18 = 0
            r21 = -1
            goto L34e
        L20e:
            r24 = r32
            r11 = r4
            r1 = 1
            r25 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r2
            if (r0 != r1) goto L231
            long r0 = p124h7.C2939x3.m7274X(r7, r5)
            double r0 = java.lang.Double.longBitsToDouble(r0)
            p185k7.C3859j8.m8739m(r11, r13, r0)
            int r5 = r5 + 8
            r0 = r9 | r23
            r2 = r4
            r4 = r11
            r28 = r12
            r18 = 0
            r21 = -1
            goto L34c
        L231:
            r2 = r4
        L232:
            r19 = r2
            r2 = r5
            r28 = r12
            r18 = 0
            r21 = -1
            goto L330
        L23d:
            r24 = r32
            r11 = r4
            r20 = r12
            r12 = r19
            r25 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r2
            r1 = 27
            r3 = r20
            if (r3 != r1) goto L2a1
            r1 = 2
            if (r0 != r1) goto L292
            java.lang.Object r0 = r12.getObject(r11, r13)
            k7.j6 r0 = (p185k7.InterfaceC3857j6) r0
            boolean r1 = r0.mo8199c()
            if (r1 != 0) goto L26e
            int r1 = r0.size()
            if (r1 != 0) goto L266
            r1 = 10
            goto L267
        L266:
            int r1 = r1 + r1
        L267:
            k7.j6 r0 = r0.mo8299k(r1)
            r12.putObject(r11, r13, r0)
        L26e:
            r13 = r0
            k7.q7 r0 = r6.m8693m(r4)
            r1 = r16
            r2 = r31
            r3 = r5
            r19 = r4
            r4 = r33
            r5 = r13
            r13 = r6
            r6 = r34
            int r0 = p124h7.C2939x3.m7256F(r0, r1, r2, r3, r4, r5, r6)
        L284:
            r4 = r11
            r14 = r12
            r6 = r13
            r2 = r19
        L289:
            r1 = r24
        L28b:
            r11 = 0
            r12 = -1
            r13 = 1048575(0xfffff, float:1.469367E-39)
            goto L19
        L292:
            r19 = r4
            r15 = r5
            r27 = r9
            r26 = r10
            r28 = r12
            r18 = 0
            r21 = -1
            goto L2f7
        L2a1:
            r19 = r4
            r1 = 49
            if (r3 > r1) goto L2de
            r8 = r21
            long r7 = (long) r8
            r11 = r0
            r0 = r29
            r1 = r30
            r2 = r31
            r6 = r3
            r3 = r5
            r4 = r33
            r15 = r5
            r5 = r16
            r20 = r6
            r6 = r24
            r21 = r7
            r7 = r11
            r8 = r19
            r11 = r9
            r26 = r10
            r9 = r21
            r27 = r11
            r18 = 0
            r11 = r20
            r17 = r12
            r21 = -1
            r12 = r13
            r28 = r17
            r14 = r34
            int r0 = r0.m8679M(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            if (r0 == r15) goto L2dc
            goto L323
        L2dc:
            r5 = r0
            goto L32b
        L2de:
            r11 = r0
            r20 = r3
            r15 = r5
            r27 = r9
            r26 = r10
            r28 = r12
            r8 = r21
            r18 = 0
            r21 = -1
            r0 = 50
            r9 = r20
            if (r9 != r0) goto L30a
            r0 = 2
            if (r11 == r0) goto L2f9
        L2f7:
            r5 = r15
            goto L32b
        L2f9:
            r0 = r29
            r1 = r30
            r2 = r31
            r3 = r15
            r4 = r33
            r5 = r19
            r6 = r13
            r0.m8676J(r1, r2, r3, r4, r5, r6)
            r0 = 0
            throw r0
        L30a:
            r0 = r29
            r1 = r30
            r2 = r31
            r3 = r15
            r4 = r33
            r5 = r16
            r6 = r24
            r7 = r11
            r10 = r13
            r12 = r19
            r13 = r34
            int r0 = r0.m8677K(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 == r15) goto L2dc
        L323:
            r5 = r0
            r2 = r19
            r10 = r26
            r9 = r27
            goto L343
        L32b:
            r2 = r5
            r10 = r26
            r9 = r27
        L330:
            k7.d8 r4 = m8663B(r30)
            r0 = r16
            r1 = r31
            r3 = r33
            r5 = r34
            int r0 = p124h7.C2939x3.m7265O(r0, r1, r2, r3, r4, r5)
            r5 = r0
            r2 = r19
        L343:
            r6 = r29
            r4 = r30
            r7 = r31
            r8 = r34
            r0 = r9
        L34c:
            r9 = r0
            r0 = r5
        L34e:
            r15 = r33
            r1 = r24
            r14 = r28
            goto L28b
        L356:
            r27 = r9
            r28 = r14
            r1 = 1048575(0xfffff, float:1.469367E-39)
            if (r10 == r1) goto L369
            long r1 = (long) r10
            r3 = r30
            r9 = r27
            r4 = r28
            r4.putInt(r3, r1, r9)
        L369:
            r1 = r33
            if (r0 != r1) goto L36e
            return r0
        L36e:
            k7.m6 r0 = p185k7.C3897m6.m8828c()
            throw r0
    }

    /* renamed from: M */
    public final int m8679M(T r18, byte[] r19, int r20, int r21, int r22, int r23, int r24, int r25, long r26, int r28, long r29, p124h7.C2915vf r31) {
            r17 = this;
            r0 = r17
            r1 = r18
            r3 = r19
            r4 = r20
            r5 = r21
            r2 = r22
            r8 = r23
            r6 = r24
            r9 = r25
            r10 = r29
            r7 = r31
            sun.misc.Unsafe r12 = p185k7.C3844i7.f16681o
            java.lang.Object r13 = r12.getObject(r1, r10)
            k7.j6 r13 = (p185k7.InterfaceC3857j6) r13
            boolean r14 = r13.mo8199c()
            if (r14 != 0) goto L35
            int r14 = r13.size()
            if (r14 != 0) goto L2d
            r14 = 10
            goto L2e
        L2d:
            int r14 = r14 + r14
        L2e:
            k7.j6 r13 = r13.mo8299k(r14)
            r12.putObject(r1, r10, r13)
        L35:
            r10 = 5
            r11 = 2
            r14 = 0
            r12 = 1
            switch(r28) {
                case 18: goto L3f9;
                case 19: goto L3ae;
                case 20: goto L376;
                case 21: goto L376;
                case 22: goto L35b;
                case 23: goto L31c;
                case 24: goto L2d9;
                case 25: goto L287;
                case 26: goto L1e0;
                case 27: goto L1c5;
                case 28: goto L178;
                case 29: goto L35b;
                case 30: goto Lda;
                case 31: goto L2d9;
                case 32: goto L31c;
                case 33: goto L9a;
                case 34: goto L5a;
                case 35: goto L3f9;
                case 36: goto L3ae;
                case 37: goto L376;
                case 38: goto L376;
                case 39: goto L35b;
                case 40: goto L31c;
                case 41: goto L2d9;
                case 42: goto L287;
                case 43: goto L35b;
                case 44: goto Lda;
                case 45: goto L2d9;
                case 46: goto L31c;
                case 47: goto L9a;
                case 48: goto L5a;
                default: goto L3d;
            }
        L3d:
            r1 = 3
            if (r6 != r1) goto L461
            k7.q7 r1 = r0.m8693m(r9)
            r6 = r2 & (-8)
            r6 = r6 | 4
            r23 = r1
            r24 = r19
            r25 = r20
            r26 = r21
            r27 = r6
            r28 = r31
            int r4 = p124h7.C2939x3.m7300z(r23, r24, r25, r26, r27, r28)
            goto L43f
        L5a:
            if (r6 != r11) goto L7e
            k7.u6 r13 = (p185k7.C4001u6) r13
            int r1 = p124h7.C2939x3.m7267Q(r3, r4, r7)
            int r2 = r7.f11968a
            int r2 = r2 + r1
        L65:
            if (r1 >= r2) goto L75
            int r1 = p124h7.C2939x3.m7273W(r3, r1, r7)
            long r4 = r7.f11969b
            long r4 = p185k7.C3856j5.m8726b(r4)
            r13.m9059i(r4)
            goto L65
        L75:
            if (r1 != r2) goto L79
            goto L462
        L79:
            k7.m6 r1 = p185k7.C3897m6.m8829d()
            throw r1
        L7e:
            if (r6 != 0) goto L461
            k7.u6 r13 = (p185k7.C4001u6) r13
        L82:
            int r1 = p124h7.C2939x3.m7273W(r3, r4, r7)
            long r8 = r7.f11969b
            long r8 = p185k7.C3856j5.m8726b(r8)
            r13.m9059i(r8)
            if (r1 >= r5) goto L99
            int r4 = p124h7.C2939x3.m7267Q(r3, r1, r7)
            int r6 = r7.f11968a
            if (r2 == r6) goto L82
        L99:
            return r1
        L9a:
            if (r6 != r11) goto Lbe
            k7.f6 r13 = (p185k7.C3801f6) r13
            int r1 = p124h7.C2939x3.m7267Q(r3, r4, r7)
            int r2 = r7.f11968a
            int r2 = r2 + r1
        La5:
            if (r1 >= r2) goto Lb5
            int r1 = p124h7.C2939x3.m7267Q(r3, r1, r7)
            int r4 = r7.f11968a
            int r4 = p185k7.C3856j5.m8725a(r4)
            r13.m8538i(r4)
            goto La5
        Lb5:
            if (r1 != r2) goto Lb9
            goto L462
        Lb9:
            k7.m6 r1 = p185k7.C3897m6.m8829d()
            throw r1
        Lbe:
            if (r6 != 0) goto L461
            k7.f6 r13 = (p185k7.C3801f6) r13
        Lc2:
            int r1 = p124h7.C2939x3.m7267Q(r3, r4, r7)
            int r4 = r7.f11968a
            int r4 = p185k7.C3856j5.m8725a(r4)
            r13.m8538i(r4)
            if (r1 >= r5) goto Ld9
            int r4 = p124h7.C2939x3.m7267Q(r3, r1, r7)
            int r6 = r7.f11968a
            if (r2 == r6) goto Lc2
        Ld9:
            return r1
        Lda:
            if (r6 != r11) goto Le1
            int r2 = p124h7.C2939x3.m7259I(r3, r4, r13, r7)
            goto Lf2
        Le1:
            if (r6 != 0) goto L461
            r2 = r22
            r3 = r19
            r4 = r20
            r5 = r21
            r6 = r13
            r7 = r31
            int r2 = p124h7.C2939x3.m7271U(r2, r3, r4, r5, r6, r7)
        Lf2:
            k7.d6 r1 = (p185k7.AbstractC3773d6) r1
            k7.d8 r3 = r1.zzc
            k7.d8 r4 = p185k7.C3775d8.f16560f
            if (r3 != r4) goto Lfb
            r3 = 0
        Lfb:
            k7.g6 r4 = r0.m8692l(r9)
            k7.c8<?, ?> r5 = r0.f16693l
            java.lang.Class<?> r6 = p185k7.C3976s7.f16860a
            if (r4 != 0) goto L106
            goto L16e
        L106:
            boolean r6 = r13 instanceof java.util.RandomAccess
            if (r6 == 0) goto L146
            int r6 = r13.size()
            r7 = 0
            r12 = 0
        L110:
            if (r12 >= r6) goto L13b
            java.lang.Object r9 = r13.get(r12)
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            boolean r10 = r4.mo8232a(r9)
            if (r10 == 0) goto L12e
            if (r12 == r7) goto L12b
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r13.set(r7, r9)
        L12b:
            int r7 = r7 + 1
            goto L138
        L12e:
            if (r3 != 0) goto L134
            java.lang.Object r3 = r5.mo8304e()
        L134:
            long r9 = (long) r9
            r5.mo8305f(r3, r8, r9)
        L138:
            int r12 = r12 + 1
            goto L110
        L13b:
            if (r7 != r6) goto L13e
            goto L16e
        L13e:
            java.util.List r4 = r13.subList(r7, r6)
            r4.clear()
            goto L16e
        L146:
            java.util.Iterator r6 = r13.iterator()
        L14a:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L16e
            java.lang.Object r7 = r6.next()
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            boolean r9 = r4.mo8232a(r7)
            if (r9 != 0) goto L14a
            if (r3 != 0) goto L166
            java.lang.Object r3 = r5.mo8304e()
        L166:
            long r9 = (long) r7
            r5.mo8305f(r3, r8, r9)
            r6.remove()
            goto L14a
        L16e:
            if (r3 != 0) goto L173
            r1 = r2
            goto L462
        L173:
            k7.d8 r3 = (p185k7.C3775d8) r3
            r1.zzc = r3
            return r2
        L178:
            if (r6 != r11) goto L461
            int r1 = p124h7.C2939x3.m7267Q(r3, r4, r7)
            int r4 = r7.f11968a
            if (r4 < 0) goto L1c0
            int r6 = r3.length
            int r6 = r6 - r1
            if (r4 > r6) goto L1bb
            if (r4 != 0) goto L189
            goto L1aa
        L189:
            k7.i5 r6 = p185k7.AbstractC3842i5.m8662u(r3, r1, r4)
            r13.add(r6)
            int r1 = r1 + r4
        L191:
            if (r1 >= r5) goto L1ba
            int r4 = p124h7.C2939x3.m7267Q(r3, r1, r7)
            int r6 = r7.f11968a
            if (r2 == r6) goto L19c
            goto L1ba
        L19c:
            int r1 = p124h7.C2939x3.m7267Q(r3, r4, r7)
            int r4 = r7.f11968a
            if (r4 < 0) goto L1b5
            int r6 = r3.length
            int r6 = r6 - r1
            if (r4 > r6) goto L1b0
            if (r4 != 0) goto L189
        L1aa:
            k7.i5 r4 = p185k7.AbstractC3842i5.f16678Z
            r13.add(r4)
            goto L191
        L1b0:
            k7.m6 r1 = p185k7.C3897m6.m8829d()
            throw r1
        L1b5:
            k7.m6 r1 = p185k7.C3897m6.m8827b()
            throw r1
        L1ba:
            return r1
        L1bb:
            k7.m6 r1 = p185k7.C3897m6.m8829d()
            throw r1
        L1c0:
            k7.m6 r1 = p185k7.C3897m6.m8827b()
            throw r1
        L1c5:
            if (r6 == r11) goto L1c9
            goto L461
        L1c9:
            k7.q7 r1 = r0.m8693m(r9)
            r23 = r1
            r24 = r22
            r25 = r19
            r26 = r20
            r27 = r21
            r28 = r13
            r29 = r31
            int r1 = p124h7.C2939x3.m7256F(r23, r24, r25, r26, r27, r28, r29)
            return r1
        L1e0:
            if (r6 != r11) goto L461
            r8 = 536870912(0x20000000, double:2.65249474E-315)
            long r8 = r26 & r8
            java.lang.String r1 = ""
            int r6 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            int r4 = p124h7.C2939x3.m7267Q(r3, r4, r7)
            if (r6 != 0) goto L22d
            int r6 = r7.f11968a
            if (r6 < 0) goto L228
            if (r6 != 0) goto L1f8
            goto L217
        L1f8:
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = p185k7.C3871k6.f16722a
            r8.<init>(r3, r4, r6, r9)
        L1ff:
            r13.add(r8)
            int r4 = r4 + r6
        L203:
            if (r4 >= r5) goto L461
            int r6 = p124h7.C2939x3.m7267Q(r3, r4, r7)
            int r8 = r7.f11968a
            if (r2 != r8) goto L461
            int r4 = p124h7.C2939x3.m7267Q(r3, r6, r7)
            int r6 = r7.f11968a
            if (r6 < 0) goto L223
            if (r6 != 0) goto L21b
        L217:
            r13.add(r1)
            goto L203
        L21b:
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = p185k7.C3871k6.f16722a
            r8.<init>(r3, r4, r6, r9)
            goto L1ff
        L223:
            k7.m6 r1 = p185k7.C3897m6.m8827b()
            throw r1
        L228:
            k7.m6 r1 = p185k7.C3897m6.m8827b()
            throw r1
        L22d:
            int r6 = r7.f11968a
            if (r6 < 0) goto L282
            if (r6 != 0) goto L235
        L233:
            r8 = r4
            goto L25c
        L235:
            int r8 = r4 + r6
            boolean r9 = p185k7.C3899m8.m8833d(r3, r4, r8)
            if (r9 == 0) goto L27d
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = p185k7.C3871k6.f16722a
            r9.<init>(r3, r4, r6, r10)
        L244:
            r13.add(r9)
        L247:
            if (r8 >= r5) goto L27a
            int r4 = p124h7.C2939x3.m7267Q(r3, r8, r7)
            int r6 = r7.f11968a
            if (r2 != r6) goto L27a
            int r4 = p124h7.C2939x3.m7267Q(r3, r4, r7)
            int r6 = r7.f11968a
            if (r6 < 0) goto L275
            if (r6 != 0) goto L260
            goto L233
        L25c:
            r13.add(r1)
            goto L247
        L260:
            int r8 = r4 + r6
            boolean r9 = p185k7.C3899m8.m8833d(r3, r4, r8)
            if (r9 == 0) goto L270
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = p185k7.C3871k6.f16722a
            r9.<init>(r3, r4, r6, r10)
            goto L244
        L270:
            k7.m6 r1 = p185k7.C3897m6.m8826a()
            throw r1
        L275:
            k7.m6 r1 = p185k7.C3897m6.m8827b()
            throw r1
        L27a:
            r4 = r8
            goto L461
        L27d:
            k7.m6 r1 = p185k7.C3897m6.m8826a()
            throw r1
        L282:
            k7.m6 r1 = p185k7.C3897m6.m8827b()
            throw r1
        L287:
            if (r6 != r11) goto L2ae
            k7.c5 r13 = (p185k7.C3758c5) r13
            int r1 = p124h7.C2939x3.m7267Q(r3, r4, r7)
            int r2 = r7.f11968a
            int r2 = r2 + r1
        L292:
            if (r1 >= r2) goto L2a5
            int r1 = p124h7.C2939x3.m7273W(r3, r1, r7)
            long r4 = r7.f11969b
            int r6 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r6 == 0) goto L2a0
            r4 = 1
            goto L2a1
        L2a0:
            r4 = 0
        L2a1:
            r13.m8296e(r4)
            goto L292
        L2a5:
            if (r1 != r2) goto L2a9
            goto L462
        L2a9:
            k7.m6 r1 = p185k7.C3897m6.m8829d()
            throw r1
        L2ae:
            if (r6 != 0) goto L461
            k7.c5 r13 = (p185k7.C3758c5) r13
            int r1 = p124h7.C2939x3.m7273W(r3, r4, r7)
            long r8 = r7.f11969b
            int r4 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r4 == 0) goto L2bd
            goto L2d6
        L2bd:
            r4 = 0
        L2be:
            r13.m8296e(r4)
            if (r1 >= r5) goto L2d8
            int r4 = p124h7.C2939x3.m7267Q(r3, r1, r7)
            int r6 = r7.f11968a
            if (r2 == r6) goto L2cc
            goto L2d8
        L2cc:
            int r1 = p124h7.C2939x3.m7273W(r3, r4, r7)
            long r8 = r7.f11969b
            int r4 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r4 == 0) goto L2bd
        L2d6:
            r4 = 1
            goto L2be
        L2d8:
            return r1
        L2d9:
            if (r6 != r11) goto L2f9
            k7.f6 r13 = (p185k7.C3801f6) r13
            int r1 = p124h7.C2939x3.m7267Q(r3, r4, r7)
            int r2 = r7.f11968a
            int r2 = r2 + r1
        L2e4:
            if (r1 >= r2) goto L2f0
            int r4 = p124h7.C2939x3.m7297w(r3, r1)
            r13.m8538i(r4)
            int r1 = r1 + 4
            goto L2e4
        L2f0:
            if (r1 != r2) goto L2f4
            goto L462
        L2f4:
            k7.m6 r1 = p185k7.C3897m6.m8829d()
            throw r1
        L2f9:
            if (r6 != r10) goto L461
            k7.f6 r13 = (p185k7.C3801f6) r13
            int r1 = p124h7.C2939x3.m7297w(r19, r20)
        L301:
            r13.m8538i(r1)
            int r4 = r4 + 4
            if (r4 >= r5) goto L31b
            int r1 = p124h7.C2939x3.m7267Q(r3, r4, r7)
            int r6 = r7.f11968a
            if (r2 == r6) goto L311
            goto L31b
        L311:
            int r4 = p124h7.C2939x3.m7297w(r3, r1)
            r16 = r4
            r4 = r1
            r1 = r16
            goto L301
        L31b:
            return r4
        L31c:
            if (r6 != r11) goto L33c
            k7.u6 r13 = (p185k7.C4001u6) r13
            int r1 = p124h7.C2939x3.m7267Q(r3, r4, r7)
            int r2 = r7.f11968a
            int r2 = r2 + r1
        L327:
            if (r1 >= r2) goto L333
            long r4 = p124h7.C2939x3.m7274X(r3, r1)
            r13.m9059i(r4)
            int r1 = r1 + 8
            goto L327
        L333:
            if (r1 != r2) goto L337
            goto L462
        L337:
            k7.m6 r1 = p185k7.C3897m6.m8829d()
            throw r1
        L33c:
            if (r6 != r12) goto L461
            k7.u6 r13 = (p185k7.C4001u6) r13
            long r8 = p124h7.C2939x3.m7274X(r19, r20)
        L344:
            r13.m9059i(r8)
            int r4 = r4 + 8
            if (r4 >= r5) goto L35a
            int r1 = p124h7.C2939x3.m7267Q(r3, r4, r7)
            int r6 = r7.f11968a
            if (r2 == r6) goto L354
            goto L35a
        L354:
            long r8 = p124h7.C2939x3.m7274X(r3, r1)
            r4 = r1
            goto L344
        L35a:
            return r4
        L35b:
            if (r6 != r11) goto L363
            int r1 = p124h7.C2939x3.m7259I(r3, r4, r13, r7)
            goto L462
        L363:
            if (r6 == 0) goto L367
            goto L461
        L367:
            r23 = r19
            r24 = r20
            r25 = r21
            r26 = r13
            r27 = r31
            int r1 = p124h7.C2939x3.m7271U(r22, r23, r24, r25, r26, r27)
            return r1
        L376:
            if (r6 != r11) goto L396
            k7.u6 r13 = (p185k7.C4001u6) r13
            int r1 = p124h7.C2939x3.m7267Q(r3, r4, r7)
            int r2 = r7.f11968a
            int r2 = r2 + r1
        L381:
            if (r1 >= r2) goto L38d
            int r1 = p124h7.C2939x3.m7273W(r3, r1, r7)
            long r4 = r7.f11969b
            r13.m9059i(r4)
            goto L381
        L38d:
            if (r1 != r2) goto L391
            goto L462
        L391:
            k7.m6 r1 = p185k7.C3897m6.m8829d()
            throw r1
        L396:
            if (r6 != 0) goto L461
            k7.u6 r13 = (p185k7.C4001u6) r13
        L39a:
            int r1 = p124h7.C2939x3.m7273W(r3, r4, r7)
            long r8 = r7.f11969b
            r13.m9059i(r8)
            if (r1 >= r5) goto L3ad
            int r4 = p124h7.C2939x3.m7267Q(r3, r1, r7)
            int r6 = r7.f11968a
            if (r2 == r6) goto L39a
        L3ad:
            return r1
        L3ae:
            if (r6 != r11) goto L3d2
            k7.x5 r13 = (p185k7.C4039x5) r13
            int r1 = p124h7.C2939x3.m7267Q(r3, r4, r7)
            int r2 = r7.f11968a
            int r2 = r2 + r1
        L3b9:
            if (r1 >= r2) goto L3c9
            int r4 = p124h7.C2939x3.m7297w(r3, r1)
            float r4 = java.lang.Float.intBitsToFloat(r4)
            r13.m9106e(r4)
            int r1 = r1 + 4
            goto L3b9
        L3c9:
            if (r1 != r2) goto L3cd
            goto L462
        L3cd:
            k7.m6 r1 = p185k7.C3897m6.m8829d()
            throw r1
        L3d2:
            if (r6 != r10) goto L461
            k7.x5 r13 = (p185k7.C4039x5) r13
            int r1 = p124h7.C2939x3.m7297w(r19, r20)
        L3da:
            float r1 = java.lang.Float.intBitsToFloat(r1)
            r13.m9106e(r1)
            int r4 = r4 + 4
            if (r4 >= r5) goto L3f8
            int r1 = p124h7.C2939x3.m7267Q(r3, r4, r7)
            int r6 = r7.f11968a
            if (r2 == r6) goto L3ee
            goto L3f8
        L3ee:
            int r4 = p124h7.C2939x3.m7297w(r3, r1)
            r16 = r4
            r4 = r1
            r1 = r16
            goto L3da
        L3f8:
            return r4
        L3f9:
            if (r6 != r11) goto L41c
            k7.o5 r13 = (p185k7.C3922o5) r13
            int r1 = p124h7.C2939x3.m7267Q(r3, r4, r7)
            int r2 = r7.f11968a
            int r2 = r2 + r1
        L404:
            if (r1 >= r2) goto L414
            long r4 = p124h7.C2939x3.m7274X(r3, r1)
            double r4 = java.lang.Double.longBitsToDouble(r4)
            r13.m8862e(r4)
            int r1 = r1 + 8
            goto L404
        L414:
            if (r1 != r2) goto L417
            goto L462
        L417:
            k7.m6 r1 = p185k7.C3897m6.m8829d()
            throw r1
        L41c:
            if (r6 != r12) goto L461
            k7.o5 r13 = (p185k7.C3922o5) r13
            long r8 = p124h7.C2939x3.m7274X(r19, r20)
        L424:
            double r8 = java.lang.Double.longBitsToDouble(r8)
            r13.m8862e(r8)
            int r4 = r4 + 8
            if (r4 >= r5) goto L43e
            int r1 = p124h7.C2939x3.m7267Q(r3, r4, r7)
            int r6 = r7.f11968a
            if (r2 == r6) goto L438
            goto L43e
        L438:
            long r8 = p124h7.C2939x3.m7274X(r3, r1)
            r4 = r1
            goto L424
        L43e:
            return r4
        L43f:
            java.lang.Object r8 = r7.f11970c
            r13.add(r8)
            if (r4 >= r5) goto L460
            int r8 = p124h7.C2939x3.m7267Q(r3, r4, r7)
            int r9 = r7.f11968a
            if (r2 == r9) goto L44f
            goto L460
        L44f:
            r23 = r1
            r24 = r19
            r25 = r8
            r26 = r21
            r27 = r6
            r28 = r31
            int r4 = p124h7.C2939x3.m7300z(r23, r24, r25, r26, r27, r28)
            goto L43f
        L460:
            return r4
        L461:
            r1 = r4
        L462:
            return r1
    }

    /* renamed from: N */
    public final int m8680N(int r2) {
            r1 = this;
            int[] r0 = r1.f16682a
            int r2 = r2 + 2
            r2 = r0[r2]
            return r2
    }

    /* renamed from: O */
    public final int m8681O(int r6, int r7) {
            r5 = this;
            int[] r0 = r5.f16682a
            int r0 = r0.length
            int r0 = r0 / 3
            r1 = -1
            int r0 = r0 + r1
        L7:
            if (r7 > r0) goto L20
            int r2 = r0 + r7
            int r2 = r2 >>> 1
            int r3 = r2 * 3
            int[] r4 = r5.f16682a
            r4 = r4[r3]
            if (r6 != r4) goto L16
            return r3
        L16:
            if (r6 >= r4) goto L1c
            int r2 = r2 + (-1)
            r0 = r2
            goto L7
        L1c:
            int r2 = r2 + 1
            r7 = r2
            goto L7
        L20:
            return r1
    }

    @Override // p185k7.InterfaceC3950q7
    /* renamed from: a */
    public final void mo8682a(T r7, T r8) {
            r6 = this;
            java.util.Objects.requireNonNull(r8)
            r0 = 0
        L4:
            int[] r1 = r6.f16682a
            int r1 = r1.length
            if (r0 >= r1) goto L10a
            int r1 = r6.m8691j(r0)
            r2 = 1048575(0xfffff, float:1.469367E-39)
            r2 = r2 & r1
            long r2 = (long) r2
            int[] r4 = r6.f16682a
            r4 = r4[r0]
            int r1 = r1 >>> 20
            r1 = r1 & 255(0xff, float:3.57E-43)
            switch(r1) {
                case 0: goto Lf6;
                case 1: goto Le6;
                case 2: goto Ld8;
                case 3: goto Ld1;
                case 4: goto Lc1;
                case 5: goto Lba;
                case 6: goto Lb3;
                case 7: goto La3;
                case 8: goto L93;
                case 9: goto L8e;
                case 10: goto L87;
                case 11: goto L80;
                case 12: goto L79;
                case 13: goto L72;
                case 14: goto L6a;
                case 15: goto L63;
                case 16: goto L5b;
                case 17: goto L8e;
                case 18: goto L54;
                case 19: goto L54;
                case 20: goto L54;
                case 21: goto L54;
                case 22: goto L54;
                case 23: goto L54;
                case 24: goto L54;
                case 25: goto L54;
                case 26: goto L54;
                case 27: goto L54;
                case 28: goto L54;
                case 29: goto L54;
                case 30: goto L54;
                case 31: goto L54;
                case 32: goto L54;
                case 33: goto L54;
                case 34: goto L54;
                case 35: goto L54;
                case 36: goto L54;
                case 37: goto L54;
                case 38: goto L54;
                case 39: goto L54;
                case 40: goto L54;
                case 41: goto L54;
                case 42: goto L54;
                case 43: goto L54;
                case 44: goto L54;
                case 45: goto L54;
                case 46: goto L54;
                case 47: goto L54;
                case 48: goto L54;
                case 49: goto L54;
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
            goto L106
        L1f:
            boolean r1 = r6.m8702w(r8, r4, r0)
            if (r1 == 0) goto L106
            goto L31
        L26:
            r6.m8696q(r7, r8, r0)
            goto L106
        L2b:
            boolean r1 = r6.m8702w(r8, r4, r0)
            if (r1 == 0) goto L106
        L31:
            java.lang.Object r1 = p185k7.C3859j8.m8736j(r8, r2)
            e7.i8 r5 = p185k7.C3859j8.f16708c
            r5.m4264N(r7, r2, r1)
            r6.m8698s(r7, r4, r0)
            goto L106
        L3f:
            java.lang.Class<?> r1 = p185k7.C3976s7.f16860a
            java.lang.Object r1 = p185k7.C3859j8.m8736j(r7, r2)
            java.lang.Object r4 = p185k7.C3859j8.m8736j(r8, r2)
            java.lang.Object r1 = p185k7.C3746b7.m8227b(r1, r4)
            e7.i8 r4 = p185k7.C3859j8.f16708c
            r4.m4264N(r7, r2, r1)
            goto L106
        L54:
            k7.t6 r1 = r6.f16692k
            r1.mo8923b(r7, r8, r2)
            goto L106
        L5b:
            boolean r1 = r6.m8700u(r8, r0)
            if (r1 == 0) goto L106
            goto Lde
        L63:
            boolean r1 = r6.m8700u(r8, r0)
            if (r1 == 0) goto L106
            goto Lc7
        L6a:
            boolean r1 = r6.m8700u(r8, r0)
            if (r1 == 0) goto L106
            goto Lde
        L72:
            boolean r1 = r6.m8700u(r8, r0)
            if (r1 == 0) goto L106
            goto Lc7
        L79:
            boolean r1 = r6.m8700u(r8, r0)
            if (r1 == 0) goto L106
            goto Lc7
        L80:
            boolean r1 = r6.m8700u(r8, r0)
            if (r1 == 0) goto L106
            goto Lc7
        L87:
            boolean r1 = r6.m8700u(r8, r0)
            if (r1 == 0) goto L106
            goto L99
        L8e:
            r6.m8695p(r7, r8, r0)
            goto L106
        L93:
            boolean r1 = r6.m8700u(r8, r0)
            if (r1 == 0) goto L106
        L99:
            java.lang.Object r1 = p185k7.C3859j8.m8736j(r8, r2)
            e7.i8 r4 = p185k7.C3859j8.f16708c
            r4.m4264N(r7, r2, r1)
            goto L103
        La3:
            boolean r1 = r6.m8700u(r8, r0)
            if (r1 == 0) goto L106
            boolean r1 = p185k7.C3859j8.m8744r(r8, r2)
            e7.i8 r4 = p185k7.C3859j8.f16708c
            r4.mo4205c(r7, r2, r1)
            goto L103
        Lb3:
            boolean r1 = r6.m8700u(r8, r0)
            if (r1 == 0) goto L106
            goto Lc7
        Lba:
            boolean r1 = r6.m8700u(r8, r0)
            if (r1 == 0) goto L106
            goto Lde
        Lc1:
            boolean r1 = r6.m8700u(r8, r0)
            if (r1 == 0) goto L106
        Lc7:
            int r1 = p185k7.C3859j8.m8733g(r8, r2)
            e7.i8 r4 = p185k7.C3859j8.f16708c
            r4.m4262F(r7, r2, r1)
            goto L103
        Ld1:
            boolean r1 = r6.m8700u(r8, r0)
            if (r1 == 0) goto L106
            goto Lde
        Ld8:
            boolean r1 = r6.m8700u(r8, r0)
            if (r1 == 0) goto L106
        Lde:
            long r4 = p185k7.C3859j8.m8734h(r8, r2)
            p185k7.C3859j8.m8740n(r7, r2, r4)
            goto L103
        Le6:
            boolean r1 = r6.m8700u(r8, r0)
            if (r1 == 0) goto L106
            float r1 = p185k7.C3859j8.m8732f(r8, r2)
            e7.i8 r4 = p185k7.C3859j8.f16708c
            r4.mo4208f(r7, r2, r1)
            goto L103
        Lf6:
            boolean r1 = r6.m8700u(r8, r0)
            if (r1 == 0) goto L106
            double r4 = p185k7.C3859j8.m8731e(r8, r2)
            p185k7.C3859j8.m8739m(r7, r2, r4)
        L103:
            r6.m8697r(r7, r0)
        L106:
            int r0 = r0 + 3
            goto L4
        L10a:
            k7.c8<?, ?> r0 = r6.f16693l
            java.lang.Class<?> r1 = p185k7.C3976s7.f16860a
            java.lang.Object r1 = r0.mo8302c(r7)
            java.lang.Object r2 = r0.mo8302c(r8)
            java.lang.Object r1 = r0.mo8303d(r1, r2)
            r0.mo8307h(r7, r1)
            boolean r7 = r6.f16687f
            if (r7 != 0) goto L122
            return
        L122:
            k7.r5<?> r7 = r6.f16694m
            r7.mo8919a(r8)
            r7 = 0
            throw r7
    }

    @Override // p185k7.InterfaceC3950q7
    /* renamed from: b */
    public final int mo8683b(T r9) {
            r8 = this;
            int[] r0 = r8.f16682a
            int r0 = r0.length
            r1 = 0
            r2 = 0
        L5:
            if (r1 >= r0) goto L129
            int r3 = r8.m8691j(r1)
            int[] r4 = r8.f16682a
            r4 = r4[r1]
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r5 = r5 & r3
            long r5 = (long) r5
            int r3 = r3 >>> 20
            r3 = r3 & 255(0xff, float:3.57E-43)
            r7 = 37
            switch(r3) {
                case 0: goto L115;
                case 1: goto L10a;
                case 2: goto L103;
                case 3: goto L103;
                case 4: goto Lfc;
                case 5: goto L103;
                case 6: goto Lfc;
                case 7: goto Lf1;
                case 8: goto Le4;
                case 9: goto Ld6;
                case 10: goto Lcb;
                case 11: goto Lfc;
                case 12: goto Lfc;
                case 13: goto Lfc;
                case 14: goto L103;
                case 15: goto Lfc;
                case 16: goto L103;
                case 17: goto Lc4;
                case 18: goto Lcb;
                case 19: goto Lcb;
                case 20: goto Lcb;
                case 21: goto Lcb;
                case 22: goto Lcb;
                case 23: goto Lcb;
                case 24: goto Lcb;
                case 25: goto Lcb;
                case 26: goto Lcb;
                case 27: goto Lcb;
                case 28: goto Lcb;
                case 29: goto Lcb;
                case 30: goto Lcb;
                case 31: goto Lcb;
                case 32: goto Lcb;
                case 33: goto Lcb;
                case 34: goto Lcb;
                case 35: goto Lcb;
                case 36: goto Lcb;
                case 37: goto Lcb;
                case 38: goto Lcb;
                case 39: goto Lcb;
                case 40: goto Lcb;
                case 41: goto Lcb;
                case 42: goto Lcb;
                case 43: goto Lcb;
                case 44: goto Lcb;
                case 45: goto Lcb;
                case 46: goto Lcb;
                case 47: goto Lcb;
                case 48: goto Lcb;
                case 49: goto Lcb;
                case 50: goto Lcb;
                case 51: goto Lb7;
                case 52: goto Laa;
                case 53: goto L9c;
                case 54: goto L95;
                case 55: goto L87;
                case 56: goto L80;
                case 57: goto L79;
                case 58: goto L6b;
                case 59: goto L63;
                case 60: goto L5b;
                case 61: goto L53;
                case 62: goto L4c;
                case 63: goto L45;
                case 64: goto L3e;
                case 65: goto L36;
                case 66: goto L2f;
                case 67: goto L27;
                case 68: goto L1f;
                default: goto L1d;
            }
        L1d:
            goto L125
        L1f:
            boolean r3 = r8.m8702w(r9, r4, r1)
            if (r3 == 0) goto L125
            goto Lcb
        L27:
            boolean r3 = r8.m8702w(r9, r4, r1)
            if (r3 == 0) goto L125
            goto La2
        L2f:
            boolean r3 = r8.m8702w(r9, r4, r1)
            if (r3 == 0) goto L125
            goto L8d
        L36:
            boolean r3 = r8.m8702w(r9, r4, r1)
            if (r3 == 0) goto L125
            goto La2
        L3e:
            boolean r3 = r8.m8702w(r9, r4, r1)
            if (r3 == 0) goto L125
            goto L8d
        L45:
            boolean r3 = r8.m8702w(r9, r4, r1)
            if (r3 == 0) goto L125
            goto L8d
        L4c:
            boolean r3 = r8.m8702w(r9, r4, r1)
            if (r3 == 0) goto L125
            goto L8d
        L53:
            boolean r3 = r8.m8702w(r9, r4, r1)
            if (r3 == 0) goto L125
            goto Lcb
        L5b:
            boolean r3 = r8.m8702w(r9, r4, r1)
            if (r3 == 0) goto L125
            goto Lcb
        L63:
            boolean r3 = r8.m8702w(r9, r4, r1)
            if (r3 == 0) goto L125
            goto Le4
        L6b:
            boolean r3 = r8.m8702w(r9, r4, r1)
            if (r3 == 0) goto L125
            int r2 = r2 * 53
            boolean r3 = m8671x(r9, r5)
            goto Lf7
        L79:
            boolean r3 = r8.m8702w(r9, r4, r1)
            if (r3 == 0) goto L125
            goto L8d
        L80:
            boolean r3 = r8.m8702w(r9, r4, r1)
            if (r3 == 0) goto L125
            goto La2
        L87:
            boolean r3 = r8.m8702w(r9, r4, r1)
            if (r3 == 0) goto L125
        L8d:
            int r2 = r2 * 53
            int r3 = m8668I(r9, r5)
            goto L123
        L95:
            boolean r3 = r8.m8702w(r9, r4, r1)
            if (r3 == 0) goto L125
            goto La2
        L9c:
            boolean r3 = r8.m8702w(r9, r4, r1)
            if (r3 == 0) goto L125
        La2:
            int r2 = r2 * 53
            long r3 = m8669k(r9, r5)
            goto L11f
        Laa:
            boolean r3 = r8.m8702w(r9, r4, r1)
            if (r3 == 0) goto L125
            int r2 = r2 * 53
            float r3 = m8667F(r9, r5)
            goto L110
        Lb7:
            boolean r3 = r8.m8702w(r9, r4, r1)
            if (r3 == 0) goto L125
            int r2 = r2 * 53
            double r3 = m8666E(r9, r5)
            goto L11b
        Lc4:
            java.lang.Object r3 = p185k7.C3859j8.m8736j(r9, r5)
            if (r3 == 0) goto Le0
            goto Ldc
        Lcb:
            int r2 = r2 * 53
            java.lang.Object r3 = p185k7.C3859j8.m8736j(r9, r5)
            int r3 = r3.hashCode()
            goto L123
        Ld6:
            java.lang.Object r3 = p185k7.C3859j8.m8736j(r9, r5)
            if (r3 == 0) goto Le0
        Ldc:
            int r7 = r3.hashCode()
        Le0:
            int r2 = r2 * 53
            int r2 = r2 + r7
            goto L125
        Le4:
            int r2 = r2 * 53
            java.lang.Object r3 = p185k7.C3859j8.m8736j(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L123
        Lf1:
            int r2 = r2 * 53
            boolean r3 = p185k7.C3859j8.m8744r(r9, r5)
        Lf7:
            int r3 = p185k7.C3871k6.m8781a(r3)
            goto L123
        Lfc:
            int r2 = r2 * 53
            int r3 = p185k7.C3859j8.m8733g(r9, r5)
            goto L123
        L103:
            int r2 = r2 * 53
            long r3 = p185k7.C3859j8.m8734h(r9, r5)
            goto L11f
        L10a:
            int r2 = r2 * 53
            float r3 = p185k7.C3859j8.m8732f(r9, r5)
        L110:
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L123
        L115:
            int r2 = r2 * 53
            double r3 = p185k7.C3859j8.m8731e(r9, r5)
        L11b:
            long r3 = java.lang.Double.doubleToLongBits(r3)
        L11f:
            int r3 = p185k7.C3871k6.m8782b(r3)
        L123:
            int r3 = r3 + r2
            r2 = r3
        L125:
            int r1 = r1 + 3
            goto L5
        L129:
            int r2 = r2 * 53
            k7.c8<?, ?> r0 = r8.f16693l
            java.lang.Object r0 = r0.mo8302c(r9)
            int r0 = r0.hashCode()
            int r0 = r0 + r2
            boolean r1 = r8.f16687f
            if (r1 != 0) goto L13b
            return r0
        L13b:
            k7.r5<?> r0 = r8.f16694m
            r0.mo8919a(r9)
            r9 = 0
            throw r9
    }

    @Override // p185k7.InterfaceC3950q7
    /* renamed from: c */
    public final void mo8684c(T r7) {
            r6 = this;
            int r0 = r6.f16690i
        L2:
            int r1 = r6.f16691j
            if (r0 >= r1) goto L27
            int[] r1 = r6.f16689h
            r1 = r1[r0]
            int r1 = r6.m8691j(r1)
            r2 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r1 & r2
            long r1 = (long) r1
            java.lang.Object r3 = p185k7.C3859j8.m8736j(r7, r1)
            if (r3 == 0) goto L24
            r4 = r3
            k7.a7 r4 = (p185k7.C3732a7) r4
            r5 = 0
            r4.f16456Y = r5
            e7.i8 r4 = p185k7.C3859j8.f16708c
            r4.m4264N(r7, r1, r3)
        L24:
            int r0 = r0 + 1
            goto L2
        L27:
            int[] r0 = r6.f16689h
            int r0 = r0.length
        L2a:
            if (r1 >= r0) goto L39
            k7.t6 r2 = r6.f16692k
            int[] r3 = r6.f16689h
            r3 = r3[r1]
            long r3 = (long) r3
            r2.mo8922a(r7, r3)
            int r1 = r1 + 1
            goto L2a
        L39:
            k7.c8<?, ?> r0 = r6.f16693l
            r0.mo8306g(r7)
            boolean r0 = r6.f16687f
            if (r0 == 0) goto L47
            k7.r5<?> r0 = r6.f16694m
            r0.mo8920b(r7)
        L47:
            return
    }

    @Override // p185k7.InterfaceC3950q7
    /* renamed from: d */
    public final T mo8685d() {
            r3 = this;
            k7.f7 r0 = r3.f16686e
            k7.d6 r0 = (p185k7.AbstractC3773d6) r0
            r1 = 4
            r2 = 0
            java.lang.Object r0 = r0.mo8189r(r1, r2, r2)
            return r0
    }

    @Override // p185k7.InterfaceC3950q7
    /* renamed from: e */
    public final int mo8686e(T r2) {
            r1 = this;
            boolean r0 = r1.f16688g
            if (r0 == 0) goto L9
            int r2 = r1.m8675H(r2)
            goto Ld
        L9:
            int r2 = r1.m8674G(r2)
        Ld:
            return r2
    }

    @Override // p185k7.InterfaceC3950q7
    /* renamed from: f */
    public final boolean mo8687f(T r19) {
            r18 = this;
            r6 = r18
            r7 = r19
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r9 = 0
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r1 = 0
            r10 = 0
        Ld:
            int r2 = r6.f16690i
            r11 = 0
            r3 = 1
            if (r10 >= r2) goto Lf9
            int[] r2 = r6.f16689h
            r12 = r2[r10]
            int[] r2 = r6.f16682a
            r13 = r2[r12]
            int r14 = r6.m8691j(r12)
            int[] r2 = r6.f16682a
            int r4 = r12 + 2
            r2 = r2[r4]
            r4 = r2 & r8
            int r2 = r2 >>> 20
            int r15 = r3 << r2
            if (r4 == r0) goto L3b
            if (r4 == r8) goto L36
            sun.misc.Unsafe r0 = p185k7.C3844i7.f16681o
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
            boolean r0 = r0.m8701v(r1, r2, r3, r4, r5)
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
            java.lang.Object r0 = p185k7.C3859j8.m8736j(r7, r0)
            k7.a7 r0 = (p185k7.C3732a7) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L88
            goto Lf1
        L88:
            java.lang.Object r0 = r6.m8694n(r12)
            k7.y6 r0 = (p185k7.C4053y6) r0
            throw r11
        L8f:
            boolean r0 = r6.m8702w(r7, r13, r12)
            if (r0 == 0) goto Lf1
            k7.q7 r0 = r6.m8693m(r12)
            r1 = r14 & r8
            long r1 = (long) r1
            java.lang.Object r1 = p185k7.C3859j8.m8736j(r7, r1)
            boolean r0 = r0.mo8687f(r1)
            if (r0 != 0) goto Lf1
            return r9
        La7:
            r0 = r14 & r8
            long r0 = (long) r0
            java.lang.Object r0 = p185k7.C3859j8.m8736j(r7, r0)
            java.util.List r0 = (java.util.List) r0
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto Lf1
            k7.q7 r1 = r6.m8693m(r12)
            r2 = 0
        Lbb:
            int r3 = r0.size()
            if (r2 >= r3) goto Lf1
            java.lang.Object r3 = r0.get(r2)
            boolean r3 = r1.mo8687f(r3)
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
            boolean r0 = r0.m8701v(r1, r2, r3, r4, r5)
            if (r0 == 0) goto Lf1
            k7.q7 r0 = r6.m8693m(r12)
            r1 = r14 & r8
            long r1 = (long) r1
            java.lang.Object r1 = p185k7.C3859j8.m8736j(r7, r1)
            boolean r0 = r0.mo8687f(r1)
            if (r0 != 0) goto Lf1
            return r9
        Lf1:
            int r10 = r10 + 1
            r0 = r16
            r1 = r17
            goto Ld
        Lf9:
            boolean r0 = r6.f16687f
            if (r0 != 0) goto Lfe
            return r3
        Lfe:
            k7.r5<?> r0 = r6.f16694m
            r0.mo8919a(r7)
            throw r11
    }

    @Override // p185k7.InterfaceC3950q7
    /* renamed from: g */
    public final void mo8688g(T r11, p185k7.C3909n5 r12) {
            r10 = this;
            boolean r0 = r10.f16688g
            if (r0 == 0) goto L460
            boolean r0 = r10.f16687f
            r1 = 0
            if (r0 != 0) goto L45a
            int[] r0 = r10.f16682a
            int r0 = r0.length
            r2 = 0
            r3 = 0
        Le:
            if (r3 >= r0) goto L450
            int r4 = r10.m8691j(r3)
            int[] r5 = r10.f16682a
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
            boolean r5 = r10.m8702w(r11, r6, r3)
            if (r5 == 0) goto L44c
            goto L308
        L2d:
            boolean r5 = r10.m8702w(r11, r6, r3)
            if (r5 == 0) goto L44c
            r4 = r4 & r9
            long r4 = (long) r4
            long r4 = m8669k(r11, r4)
            goto L323
        L3b:
            boolean r5 = r10.m8702w(r11, r6, r3)
            if (r5 == 0) goto L44c
            r4 = r4 & r9
            long r4 = (long) r4
            int r4 = m8668I(r11, r4)
            goto L334
        L49:
            boolean r5 = r10.m8702w(r11, r6, r3)
            if (r5 == 0) goto L44c
            r4 = r4 & r9
            long r4 = (long) r4
            long r4 = m8669k(r11, r4)
            goto L345
        L57:
            boolean r5 = r10.m8702w(r11, r6, r3)
            if (r5 == 0) goto L44c
            r4 = r4 & r9
            long r4 = (long) r4
            int r4 = m8668I(r11, r4)
            goto L358
        L65:
            boolean r5 = r10.m8702w(r11, r6, r3)
            if (r5 == 0) goto L44c
            r4 = r4 & r9
            long r4 = (long) r4
            int r4 = m8668I(r11, r4)
            goto L36b
        L73:
            boolean r5 = r10.m8702w(r11, r6, r3)
            if (r5 == 0) goto L44c
            r4 = r4 & r9
            long r4 = (long) r4
            int r4 = m8668I(r11, r4)
            goto L37e
        L81:
            boolean r5 = r10.m8702w(r11, r6, r3)
            if (r5 == 0) goto L44c
            goto L38b
        L89:
            boolean r5 = r10.m8702w(r11, r6, r3)
            if (r5 == 0) goto L44c
            goto L3a0
        L91:
            boolean r5 = r10.m8702w(r11, r6, r3)
            if (r5 == 0) goto L44c
            goto L3b5
        L99:
            boolean r5 = r10.m8702w(r11, r6, r3)
            if (r5 == 0) goto L44c
            r4 = r4 & r9
            long r4 = (long) r4
            boolean r4 = m8671x(r11, r4)
            goto L3cc
        La7:
            boolean r5 = r10.m8702w(r11, r6, r3)
            if (r5 == 0) goto L44c
            r4 = r4 & r9
            long r4 = (long) r4
            int r4 = m8668I(r11, r4)
            goto L3df
        Lb5:
            boolean r5 = r10.m8702w(r11, r6, r3)
            if (r5 == 0) goto L44c
            r4 = r4 & r9
            long r4 = (long) r4
            long r4 = m8669k(r11, r4)
            goto L3f1
        Lc3:
            boolean r5 = r10.m8702w(r11, r6, r3)
            if (r5 == 0) goto L44c
            r4 = r4 & r9
            long r4 = (long) r4
            int r4 = m8668I(r11, r4)
            goto L403
        Ld1:
            boolean r5 = r10.m8702w(r11, r6, r3)
            if (r5 == 0) goto L44c
            r4 = r4 & r9
            long r4 = (long) r4
            long r4 = m8669k(r11, r4)
            goto L415
        Ldf:
            boolean r5 = r10.m8702w(r11, r6, r3)
            if (r5 == 0) goto L44c
            r4 = r4 & r9
            long r4 = (long) r4
            long r4 = m8669k(r11, r4)
            goto L427
        Led:
            boolean r5 = r10.m8702w(r11, r6, r3)
            if (r5 == 0) goto L44c
            r4 = r4 & r9
            long r4 = (long) r4
            float r4 = m8667F(r11, r4)
            goto L439
        Lfb:
            boolean r5 = r10.m8702w(r11, r6, r3)
            if (r5 == 0) goto L44c
            r4 = r4 & r9
            long r4 = (long) r4
            double r4 = m8666E(r11, r4)
            goto L449
        L109:
            r4 = r4 & r9
            long r4 = (long) r4
            java.lang.Object r4 = p185k7.C3859j8.m8736j(r11, r4)
            if (r4 != 0) goto L113
            goto L44c
        L113:
            java.lang.Object r11 = r10.m8694n(r3)
            k7.y6 r11 = (p185k7.C4053y6) r11
            throw r1
        L11a:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = p185k7.C3859j8.m8736j(r11, r6)
            java.util.List r4 = (java.util.List) r4
            k7.q7 r6 = r10.m8693m(r3)
            p185k7.C3976s7.m8986i(r5, r4, r12, r6)
            goto L44c
        L12d:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = p185k7.C3859j8.m8736j(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p185k7.C3976s7.m8993p(r5, r4, r12, r8)
            goto L44c
        L13c:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = p185k7.C3859j8.m8736j(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p185k7.C3976s7.m8992o(r5, r4, r12, r8)
            goto L44c
        L14b:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = p185k7.C3859j8.m8736j(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p185k7.C3976s7.m8991n(r5, r4, r12, r8)
            goto L44c
        L15a:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = p185k7.C3859j8.m8736j(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p185k7.C3976s7.m8990m(r5, r4, r12, r8)
            goto L44c
        L169:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = p185k7.C3859j8.m8736j(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p185k7.C3976s7.m8982e(r5, r4, r12, r8)
            goto L44c
        L178:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = p185k7.C3859j8.m8736j(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p185k7.C3976s7.m8995r(r5, r4, r12, r8)
            goto L44c
        L187:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = p185k7.C3859j8.m8736j(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p185k7.C3976s7.m8979b(r5, r4, r12, r8)
            goto L44c
        L196:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = p185k7.C3859j8.m8736j(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p185k7.C3976s7.m8983f(r5, r4, r12, r8)
            goto L44c
        L1a5:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = p185k7.C3859j8.m8736j(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p185k7.C3976s7.m8984g(r5, r4, r12, r8)
            goto L44c
        L1b4:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = p185k7.C3859j8.m8736j(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p185k7.C3976s7.m8987j(r5, r4, r12, r8)
            goto L44c
        L1c3:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = p185k7.C3859j8.m8736j(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p185k7.C3976s7.m8997t(r5, r4, r12, r8)
            goto L44c
        L1d2:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = p185k7.C3859j8.m8736j(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p185k7.C3976s7.m8988k(r5, r4, r12, r8)
            goto L44c
        L1e1:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = p185k7.C3859j8.m8736j(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p185k7.C3976s7.m8985h(r5, r4, r12, r8)
            goto L44c
        L1f0:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = p185k7.C3859j8.m8736j(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p185k7.C3976s7.m8981d(r5, r4, r12, r8)
            goto L44c
        L1ff:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = p185k7.C3859j8.m8736j(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p185k7.C3976s7.m8993p(r5, r4, r12, r2)
            goto L44c
        L20e:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = p185k7.C3859j8.m8736j(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p185k7.C3976s7.m8992o(r5, r4, r12, r2)
            goto L44c
        L21d:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = p185k7.C3859j8.m8736j(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p185k7.C3976s7.m8991n(r5, r4, r12, r2)
            goto L44c
        L22c:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = p185k7.C3859j8.m8736j(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p185k7.C3976s7.m8990m(r5, r4, r12, r2)
            goto L44c
        L23b:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = p185k7.C3859j8.m8736j(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p185k7.C3976s7.m8982e(r5, r4, r12, r2)
            goto L44c
        L24a:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = p185k7.C3859j8.m8736j(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p185k7.C3976s7.m8995r(r5, r4, r12, r2)
            goto L44c
        L259:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = p185k7.C3859j8.m8736j(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p185k7.C3976s7.m8980c(r5, r4, r12)
            goto L44c
        L268:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = p185k7.C3859j8.m8736j(r11, r6)
            java.util.List r4 = (java.util.List) r4
            k7.q7 r6 = r10.m8693m(r3)
            p185k7.C3976s7.m8989l(r5, r4, r12, r6)
            goto L44c
        L27b:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = p185k7.C3859j8.m8736j(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p185k7.C3976s7.m8994q(r5, r4, r12)
            goto L44c
        L28a:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = p185k7.C3859j8.m8736j(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p185k7.C3976s7.m8979b(r5, r4, r12, r2)
            goto L44c
        L299:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = p185k7.C3859j8.m8736j(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p185k7.C3976s7.m8983f(r5, r4, r12, r2)
            goto L44c
        L2a8:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = p185k7.C3859j8.m8736j(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p185k7.C3976s7.m8984g(r5, r4, r12, r2)
            goto L44c
        L2b7:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = p185k7.C3859j8.m8736j(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p185k7.C3976s7.m8987j(r5, r4, r12, r2)
            goto L44c
        L2c6:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = p185k7.C3859j8.m8736j(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p185k7.C3976s7.m8997t(r5, r4, r12, r2)
            goto L44c
        L2d5:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = p185k7.C3859j8.m8736j(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p185k7.C3976s7.m8988k(r5, r4, r12, r2)
            goto L44c
        L2e4:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = p185k7.C3859j8.m8736j(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p185k7.C3976s7.m8985h(r5, r4, r12, r2)
            goto L44c
        L2f3:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = p185k7.C3859j8.m8736j(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p185k7.C3976s7.m8981d(r5, r4, r12, r2)
            goto L44c
        L302:
            boolean r5 = r10.m8700u(r11, r3)
            if (r5 == 0) goto L44c
        L308:
            r4 = r4 & r9
            long r4 = (long) r4
            java.lang.Object r4 = p185k7.C3859j8.m8736j(r11, r4)
            k7.q7 r5 = r10.m8693m(r3)
            r12.m8846e(r6, r4, r5)
            goto L44c
        L317:
            boolean r5 = r10.m8700u(r11, r3)
            if (r5 == 0) goto L44c
            r4 = r4 & r9
            long r4 = (long) r4
            long r4 = p185k7.C3859j8.m8734h(r11, r4)
        L323:
            r12.m8843b(r6, r4)
            goto L44c
        L328:
            boolean r5 = r10.m8700u(r11, r3)
            if (r5 == 0) goto L44c
            r4 = r4 & r9
            long r4 = (long) r4
            int r4 = p185k7.C3859j8.m8733g(r11, r4)
        L334:
            r12.m8842a(r6, r4)
            goto L44c
        L339:
            boolean r5 = r10.m8700u(r11, r3)
            if (r5 == 0) goto L44c
            r4 = r4 & r9
            long r4 = (long) r4
            long r4 = p185k7.C3859j8.m8734h(r11, r4)
        L345:
            k7.m5 r7 = r12.f16756a
            r7.mo8775u(r6, r4)
            goto L44c
        L34c:
            boolean r5 = r10.m8700u(r11, r3)
            if (r5 == 0) goto L44c
            r4 = r4 & r9
            long r4 = (long) r4
            int r4 = p185k7.C3859j8.m8733g(r11, r4)
        L358:
            k7.m5 r5 = r12.f16756a
            r5.mo8773r(r6, r4)
            goto L44c
        L35f:
            boolean r5 = r10.m8700u(r11, r3)
            if (r5 == 0) goto L44c
            r4 = r4 & r9
            long r4 = (long) r4
            int r4 = p185k7.C3859j8.m8733g(r11, r4)
        L36b:
            k7.m5 r5 = r12.f16756a
            r5.mo8777w(r6, r4)
            goto L44c
        L372:
            boolean r5 = r10.m8700u(r11, r3)
            if (r5 == 0) goto L44c
            r4 = r4 & r9
            long r4 = (long) r4
            int r4 = p185k7.C3859j8.m8733g(r11, r4)
        L37e:
            k7.m5 r5 = r12.f16756a
            r5.mo8763A(r6, r4)
            goto L44c
        L385:
            boolean r5 = r10.m8700u(r11, r3)
            if (r5 == 0) goto L44c
        L38b:
            r4 = r4 & r9
            long r4 = (long) r4
            java.lang.Object r4 = p185k7.C3859j8.m8736j(r11, r4)
            k7.i5 r4 = (p185k7.AbstractC3842i5) r4
            k7.m5 r5 = r12.f16756a
            r5.mo8772q(r6, r4)
            goto L44c
        L39a:
            boolean r5 = r10.m8700u(r11, r3)
            if (r5 == 0) goto L44c
        L3a0:
            r4 = r4 & r9
            long r4 = (long) r4
            java.lang.Object r4 = p185k7.C3859j8.m8736j(r11, r4)
            k7.q7 r5 = r10.m8693m(r3)
            r12.m8847f(r6, r4, r5)
            goto L44c
        L3af:
            boolean r5 = r10.m8700u(r11, r3)
            if (r5 == 0) goto L44c
        L3b5:
            r4 = r4 & r9
            long r4 = (long) r4
            java.lang.Object r4 = p185k7.C3859j8.m8736j(r11, r4)
            m8672z(r6, r4, r12)
            goto L44c
        L3c0:
            boolean r5 = r10.m8700u(r11, r3)
            if (r5 == 0) goto L44c
            r4 = r4 & r9
            long r4 = (long) r4
            boolean r4 = p185k7.C3859j8.m8744r(r11, r4)
        L3cc:
            k7.m5 r5 = r12.f16756a
            r5.mo8771p(r6, r4)
            goto L44c
        L3d3:
            boolean r5 = r10.m8700u(r11, r3)
            if (r5 == 0) goto L44c
            r4 = r4 & r9
            long r4 = (long) r4
            int r4 = p185k7.C3859j8.m8733g(r11, r4)
        L3df:
            k7.m5 r5 = r12.f16756a
            r5.mo8773r(r6, r4)
            goto L44c
        L3e5:
            boolean r5 = r10.m8700u(r11, r3)
            if (r5 == 0) goto L44c
            r4 = r4 & r9
            long r4 = (long) r4
            long r4 = p185k7.C3859j8.m8734h(r11, r4)
        L3f1:
            k7.m5 r7 = r12.f16756a
            r7.mo8775u(r6, r4)
            goto L44c
        L3f7:
            boolean r5 = r10.m8700u(r11, r3)
            if (r5 == 0) goto L44c
            r4 = r4 & r9
            long r4 = (long) r4
            int r4 = p185k7.C3859j8.m8733g(r11, r4)
        L403:
            k7.m5 r5 = r12.f16756a
            r5.mo8777w(r6, r4)
            goto L44c
        L409:
            boolean r5 = r10.m8700u(r11, r3)
            if (r5 == 0) goto L44c
            r4 = r4 & r9
            long r4 = (long) r4
            long r4 = p185k7.C3859j8.m8734h(r11, r4)
        L415:
            k7.m5 r7 = r12.f16756a
            r7.mo8765C(r6, r4)
            goto L44c
        L41b:
            boolean r5 = r10.m8700u(r11, r3)
            if (r5 == 0) goto L44c
            r4 = r4 & r9
            long r4 = (long) r4
            long r4 = p185k7.C3859j8.m8734h(r11, r4)
        L427:
            k7.m5 r7 = r12.f16756a
            r7.mo8765C(r6, r4)
            goto L44c
        L42d:
            boolean r5 = r10.m8700u(r11, r3)
            if (r5 == 0) goto L44c
            r4 = r4 & r9
            long r4 = (long) r4
            float r4 = p185k7.C3859j8.m8732f(r11, r4)
        L439:
            r12.m8845d(r6, r4)
            goto L44c
        L43d:
            boolean r5 = r10.m8700u(r11, r3)
            if (r5 == 0) goto L44c
            r4 = r4 & r9
            long r4 = (long) r4
            double r4 = p185k7.C3859j8.m8731e(r11, r4)
        L449:
            r12.m8844c(r6, r4)
        L44c:
            int r3 = r3 + 3
            goto Le
        L450:
            k7.c8<?, ?> r0 = r10.f16693l
            java.lang.Object r11 = r0.mo8302c(r11)
            r0.mo8308i(r11, r12)
            return
        L45a:
            k7.r5<?> r12 = r10.f16694m
            r12.mo8919a(r11)
            throw r1
        L460:
            r10.m8703y(r11, r12)
            return
    }

    @Override // p185k7.InterfaceC3950q7
    /* renamed from: h */
    public final boolean mo8689h(T r9, T r10) {
            r8 = this;
            int[] r0 = r8.f16682a
            int r0 = r0.length
            r1 = 0
            r2 = 0
        L5:
            if (r2 >= r0) goto L1ba
            int r3 = r8.m8691j(r2)
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
            int r3 = r8.m8680N(r2)
            r3 = r3 & r4
            long r3 = (long) r3
            int r7 = p185k7.C3859j8.m8733g(r9, r3)
            int r3 = p185k7.C3859j8.m8733g(r10, r3)
            if (r7 != r3) goto L1b5
            java.lang.Object r3 = p185k7.C3859j8.m8736j(r9, r5)
            java.lang.Object r4 = p185k7.C3859j8.m8736j(r10, r5)
            boolean r3 = p185k7.C3976s7.m8978a(r3, r4)
            if (r3 != 0) goto L1b6
            goto L1b5
        L3a:
            java.lang.Object r3 = p185k7.C3859j8.m8736j(r9, r5)
            java.lang.Object r4 = p185k7.C3859j8.m8736j(r10, r5)
            boolean r3 = p185k7.C3976s7.m8978a(r3, r4)
            if (r3 != 0) goto L1b6
            goto L1b5
        L4a:
            boolean r3 = r8.m8699t(r9, r10, r2)
            if (r3 == 0) goto L1b5
            java.lang.Object r3 = p185k7.C3859j8.m8736j(r9, r5)
            java.lang.Object r4 = p185k7.C3859j8.m8736j(r10, r5)
            boolean r3 = p185k7.C3976s7.m8978a(r3, r4)
            if (r3 == 0) goto L1b5
            goto L1b6
        L60:
            boolean r3 = r8.m8699t(r9, r10, r2)
            if (r3 == 0) goto L1b5
            long r3 = p185k7.C3859j8.m8734h(r9, r5)
            long r5 = p185k7.C3859j8.m8734h(r10, r5)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L1b5
            goto L1b6
        L74:
            boolean r3 = r8.m8699t(r9, r10, r2)
            if (r3 == 0) goto L1b5
            int r3 = p185k7.C3859j8.m8733g(r9, r5)
            int r4 = p185k7.C3859j8.m8733g(r10, r5)
            if (r3 != r4) goto L1b5
            goto L1b6
        L86:
            boolean r3 = r8.m8699t(r9, r10, r2)
            if (r3 == 0) goto L1b5
            long r3 = p185k7.C3859j8.m8734h(r9, r5)
            long r5 = p185k7.C3859j8.m8734h(r10, r5)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L1b5
            goto L1b6
        L9a:
            boolean r3 = r8.m8699t(r9, r10, r2)
            if (r3 == 0) goto L1b5
            int r3 = p185k7.C3859j8.m8733g(r9, r5)
            int r4 = p185k7.C3859j8.m8733g(r10, r5)
            if (r3 != r4) goto L1b5
            goto L1b6
        Lac:
            boolean r3 = r8.m8699t(r9, r10, r2)
            if (r3 == 0) goto L1b5
            int r3 = p185k7.C3859j8.m8733g(r9, r5)
            int r4 = p185k7.C3859j8.m8733g(r10, r5)
            if (r3 != r4) goto L1b5
            goto L1b6
        Lbe:
            boolean r3 = r8.m8699t(r9, r10, r2)
            if (r3 == 0) goto L1b5
            int r3 = p185k7.C3859j8.m8733g(r9, r5)
            int r4 = p185k7.C3859j8.m8733g(r10, r5)
            if (r3 != r4) goto L1b5
            goto L1b6
        Ld0:
            boolean r3 = r8.m8699t(r9, r10, r2)
            if (r3 == 0) goto L1b5
            java.lang.Object r3 = p185k7.C3859j8.m8736j(r9, r5)
            java.lang.Object r4 = p185k7.C3859j8.m8736j(r10, r5)
            boolean r3 = p185k7.C3976s7.m8978a(r3, r4)
            if (r3 == 0) goto L1b5
            goto L1b6
        Le6:
            boolean r3 = r8.m8699t(r9, r10, r2)
            if (r3 == 0) goto L1b5
            java.lang.Object r3 = p185k7.C3859j8.m8736j(r9, r5)
            java.lang.Object r4 = p185k7.C3859j8.m8736j(r10, r5)
            boolean r3 = p185k7.C3976s7.m8978a(r3, r4)
            if (r3 == 0) goto L1b5
            goto L1b6
        Lfc:
            boolean r3 = r8.m8699t(r9, r10, r2)
            if (r3 == 0) goto L1b5
            java.lang.Object r3 = p185k7.C3859j8.m8736j(r9, r5)
            java.lang.Object r4 = p185k7.C3859j8.m8736j(r10, r5)
            boolean r3 = p185k7.C3976s7.m8978a(r3, r4)
            if (r3 == 0) goto L1b5
            goto L1b6
        L112:
            boolean r3 = r8.m8699t(r9, r10, r2)
            if (r3 == 0) goto L1b5
            boolean r3 = p185k7.C3859j8.m8744r(r9, r5)
            boolean r4 = p185k7.C3859j8.m8744r(r10, r5)
            if (r3 != r4) goto L1b5
            goto L1b6
        L124:
            boolean r3 = r8.m8699t(r9, r10, r2)
            if (r3 == 0) goto L1b5
            int r3 = p185k7.C3859j8.m8733g(r9, r5)
            int r4 = p185k7.C3859j8.m8733g(r10, r5)
            if (r3 != r4) goto L1b5
            goto L1b6
        L136:
            boolean r3 = r8.m8699t(r9, r10, r2)
            if (r3 == 0) goto L1b5
            long r3 = p185k7.C3859j8.m8734h(r9, r5)
            long r5 = p185k7.C3859j8.m8734h(r10, r5)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L1b5
            goto L1b6
        L14a:
            boolean r3 = r8.m8699t(r9, r10, r2)
            if (r3 == 0) goto L1b5
            int r3 = p185k7.C3859j8.m8733g(r9, r5)
            int r4 = p185k7.C3859j8.m8733g(r10, r5)
            if (r3 != r4) goto L1b5
            goto L1b6
        L15b:
            boolean r3 = r8.m8699t(r9, r10, r2)
            if (r3 == 0) goto L1b5
            long r3 = p185k7.C3859j8.m8734h(r9, r5)
            long r5 = p185k7.C3859j8.m8734h(r10, r5)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L1b5
            goto L1b6
        L16e:
            boolean r3 = r8.m8699t(r9, r10, r2)
            if (r3 == 0) goto L1b5
            long r3 = p185k7.C3859j8.m8734h(r9, r5)
            long r5 = p185k7.C3859j8.m8734h(r10, r5)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L1b5
            goto L1b6
        L181:
            boolean r3 = r8.m8699t(r9, r10, r2)
            if (r3 == 0) goto L1b5
            float r3 = p185k7.C3859j8.m8732f(r9, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
            float r4 = p185k7.C3859j8.m8732f(r10, r5)
            int r4 = java.lang.Float.floatToIntBits(r4)
            if (r3 != r4) goto L1b5
            goto L1b6
        L19a:
            boolean r3 = r8.m8699t(r9, r10, r2)
            if (r3 == 0) goto L1b5
            double r3 = p185k7.C3859j8.m8731e(r9, r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            double r5 = p185k7.C3859j8.m8731e(r10, r5)
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
            k7.c8<?, ?> r0 = r8.f16693l
            java.lang.Object r0 = r0.mo8302c(r9)
            k7.c8<?, ?> r2 = r8.f16693l
            java.lang.Object r2 = r2.mo8302c(r10)
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L1cd
            return r1
        L1cd:
            boolean r0 = r8.f16687f
            if (r0 != 0) goto L1d3
            r9 = 1
            return r9
        L1d3:
            k7.r5<?> r0 = r8.f16694m
            r0.mo8919a(r9)
            k7.r5<?> r9 = r8.f16694m
            r9.mo8919a(r10)
            r9 = 0
            throw r9
    }

    @Override // p185k7.InterfaceC3950q7
    /* renamed from: i */
    public final void mo8690i(T r9, byte[] r10, int r11, int r12, p124h7.C2915vf r13) {
            r8 = this;
            boolean r0 = r8.f16688g
            if (r0 == 0) goto L8
            r8.m8678L(r9, r10, r11, r12, r13)
            return
        L8:
            r6 = 0
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r7 = r13
            r1.m8673A(r2, r3, r4, r5, r6, r7)
            return
    }

    /* renamed from: j */
    public final int m8691j(int r2) {
            r1 = this;
            int[] r0 = r1.f16682a
            int r2 = r2 + 1
            r2 = r0[r2]
            return r2
    }

    /* renamed from: l */
    public final p185k7.InterfaceC3815g6 m8692l(int r2) {
            r1 = this;
            int r2 = r2 / 3
            java.lang.Object[] r0 = r1.f16683b
            int r2 = r2 + r2
            int r2 = r2 + 1
            r2 = r0[r2]
            k7.g6 r2 = (p185k7.InterfaceC3815g6) r2
            return r2
    }

    /* renamed from: m */
    public final p185k7.InterfaceC3950q7 m8693m(int r4) {
            r3 = this;
            int r4 = r4 / 3
            int r4 = r4 + r4
            java.lang.Object[] r0 = r3.f16683b
            r1 = r0[r4]
            k7.q7 r1 = (p185k7.InterfaceC3950q7) r1
            if (r1 == 0) goto Lc
            return r1
        Lc:
            k7.n7 r1 = p185k7.C3911n7.f16770c
            int r2 = r4 + 1
            r0 = r0[r2]
            java.lang.Class r0 = (java.lang.Class) r0
            k7.q7 r0 = r1.m8848a(r0)
            java.lang.Object[] r1 = r3.f16683b
            r1[r4] = r0
            return r0
    }

    /* renamed from: n */
    public final java.lang.Object m8694n(int r2) {
            r1 = this;
            int r2 = r2 / 3
            java.lang.Object[] r0 = r1.f16683b
            int r2 = r2 + r2
            r2 = r0[r2]
            return r2
    }

    /* renamed from: p */
    public final void m8695p(T r4, T r5, int r6) {
            r3 = this;
            int[] r0 = r3.f16682a
            int r1 = r6 + 1
            r0 = r0[r1]
            r1 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r1
            long r0 = (long) r0
            boolean r2 = r3.m8700u(r5, r6)
            if (r2 != 0) goto L12
            return
        L12:
            java.lang.Object r2 = p185k7.C3859j8.m8736j(r4, r0)
            java.lang.Object r5 = p185k7.C3859j8.m8736j(r5, r0)
            if (r2 == 0) goto L2c
            if (r5 != 0) goto L1f
            goto L2c
        L1f:
            java.lang.Object r5 = p185k7.C3871k6.m8783c(r2, r5)
            e7.i8 r2 = p185k7.C3859j8.f16708c
            r2.m4264N(r4, r0, r5)
            r3.m8697r(r4, r6)
            return
        L2c:
            if (r5 == 0) goto L36
            e7.i8 r2 = p185k7.C3859j8.f16708c
            r2.m4264N(r4, r0, r5)
            r3.m8697r(r4, r6)
        L36:
            return
    }

    /* renamed from: q */
    public final void m8696q(T r5, T r6, int r7) {
            r4 = this;
            int[] r0 = r4.f16682a
            int r1 = r7 + 1
            r1 = r0[r1]
            r0 = r0[r7]
            r2 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r1 & r2
            long r1 = (long) r1
            boolean r3 = r4.m8702w(r6, r0, r7)
            if (r3 != 0) goto L14
            return
        L14:
            boolean r3 = r4.m8702w(r5, r0, r7)
            if (r3 == 0) goto L1f
            java.lang.Object r3 = p185k7.C3859j8.m8736j(r5, r1)
            goto L20
        L1f:
            r3 = 0
        L20:
            java.lang.Object r6 = p185k7.C3859j8.m8736j(r6, r1)
            if (r3 == 0) goto L36
            if (r6 != 0) goto L29
            goto L36
        L29:
            java.lang.Object r6 = p185k7.C3871k6.m8783c(r3, r6)
            e7.i8 r3 = p185k7.C3859j8.f16708c
            r3.m4264N(r5, r1, r6)
            r4.m8698s(r5, r0, r7)
            return
        L36:
            if (r6 == 0) goto L40
            e7.i8 r3 = p185k7.C3859j8.f16708c
            r3.m4264N(r5, r1, r6)
            r4.m8698s(r5, r0, r7)
        L40:
            return
    }

    /* renamed from: r */
    public final void m8697r(T r6, int r7) {
            r5 = this;
            int[] r0 = r5.f16682a
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
            int r2 = p185k7.C3859j8.m8733g(r6, r0)
            r3 = 1
            int r7 = r7 >>> 20
            int r7 = r3 << r7
            r7 = r7 | r2
            e7.i8 r2 = p185k7.C3859j8.f16708c
            r2.m4262F(r6, r0, r7)
            return
    }

    /* renamed from: s */
    public final void m8698s(T r3, int r4, int r5) {
            r2 = this;
            int[] r0 = r2.f16682a
            int r5 = r5 + 2
            r5 = r0[r5]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r5 = r5 & r0
            long r0 = (long) r5
            e7.i8 r5 = p185k7.C3859j8.f16708c
            r5.m4262F(r3, r0, r4)
            return
    }

    /* renamed from: t */
    public final boolean m8699t(T r1, T r2, int r3) {
            r0 = this;
            boolean r1 = r0.m8700u(r1, r3)
            boolean r2 = r0.m8700u(r2, r3)
            if (r1 != r2) goto Lc
            r1 = 1
            return r1
        Lc:
            r1 = 0
            return r1
    }

    /* renamed from: u */
    public final boolean m8700u(T r11, int r12) {
            r10 = this;
            int[] r0 = r10.f16682a
            int r1 = r12 + 2
            r1 = r0[r1]
            r2 = 1048575(0xfffff, float:1.469367E-39)
            r3 = r1 & r2
            long r3 = (long) r3
            r5 = 1048575(0xfffff, double:5.18065E-318)
            r7 = 0
            r8 = 1
            int r9 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r9 != 0) goto Lec
            int r12 = r12 + r8
            r12 = r0[r12]
            r0 = r12 & r2
            long r0 = (long) r0
            int r12 = r12 >>> 20
            r12 = r12 & 255(0xff, float:3.57E-43)
            r2 = 0
            switch(r12) {
                case 0: goto Le0;
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
            java.lang.Object r11 = p185k7.C3859j8.m8736j(r11, r0)
            if (r11 == 0) goto L31
            return r8
        L31:
            return r7
        L32:
            long r11 = p185k7.C3859j8.m8734h(r11, r0)
            int r0 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r0 == 0) goto L3b
            return r8
        L3b:
            return r7
        L3c:
            int r11 = p185k7.C3859j8.m8733g(r11, r0)
            if (r11 == 0) goto L43
            return r8
        L43:
            return r7
        L44:
            long r11 = p185k7.C3859j8.m8734h(r11, r0)
            int r0 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r0 == 0) goto L4d
            return r8
        L4d:
            return r7
        L4e:
            int r11 = p185k7.C3859j8.m8733g(r11, r0)
            if (r11 == 0) goto L55
            return r8
        L55:
            return r7
        L56:
            int r11 = p185k7.C3859j8.m8733g(r11, r0)
            if (r11 == 0) goto L5d
            return r8
        L5d:
            return r7
        L5e:
            int r11 = p185k7.C3859j8.m8733g(r11, r0)
            if (r11 == 0) goto L65
            return r8
        L65:
            return r7
        L66:
            k7.i5 r12 = p185k7.AbstractC3842i5.f16678Z
            java.lang.Object r11 = p185k7.C3859j8.m8736j(r11, r0)
            boolean r11 = r12.equals(r11)
            if (r11 != 0) goto L73
            return r8
        L73:
            return r7
        L74:
            java.lang.Object r11 = p185k7.C3859j8.m8736j(r11, r0)
            if (r11 == 0) goto L7b
            return r8
        L7b:
            return r7
        L7c:
            java.lang.Object r11 = p185k7.C3859j8.m8736j(r11, r0)
            boolean r12 = r11 instanceof java.lang.String
            if (r12 == 0) goto L8e
            java.lang.String r11 = (java.lang.String) r11
            boolean r11 = r11.isEmpty()
            if (r11 != 0) goto L8d
            return r8
        L8d:
            return r7
        L8e:
            boolean r12 = r11 instanceof p185k7.AbstractC3842i5
            if (r12 == 0) goto L9c
            k7.i5 r12 = p185k7.AbstractC3842i5.f16678Z
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
            boolean r11 = p185k7.C3859j8.m8744r(r11, r0)
            return r11
        La7:
            int r11 = p185k7.C3859j8.m8733g(r11, r0)
            if (r11 == 0) goto Lae
            return r8
        Lae:
            return r7
        Laf:
            long r11 = p185k7.C3859j8.m8734h(r11, r0)
            int r0 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r0 == 0) goto Lb8
            return r8
        Lb8:
            return r7
        Lb9:
            int r11 = p185k7.C3859j8.m8733g(r11, r0)
            if (r11 == 0) goto Lc0
            return r8
        Lc0:
            return r7
        Lc1:
            long r11 = p185k7.C3859j8.m8734h(r11, r0)
            int r0 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r0 == 0) goto Lca
            return r8
        Lca:
            return r7
        Lcb:
            long r11 = p185k7.C3859j8.m8734h(r11, r0)
            int r0 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r0 == 0) goto Ld4
            return r8
        Ld4:
            return r7
        Ld5:
            float r11 = p185k7.C3859j8.m8732f(r11, r0)
            r12 = 0
            int r11 = (r11 > r12 ? 1 : (r11 == r12 ? 0 : -1))
            if (r11 == 0) goto Ldf
            return r8
        Ldf:
            return r7
        Le0:
            double r11 = p185k7.C3859j8.m8731e(r11, r0)
            r0 = 0
            int r2 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r2 == 0) goto Leb
            return r8
        Leb:
            return r7
        Lec:
            int r11 = p185k7.C3859j8.m8733g(r11, r3)
            int r12 = r1 >>> 20
            int r12 = r8 << r12
            r11 = r11 & r12
            if (r11 == 0) goto Lf8
            return r8
        Lf8:
            return r7
    }

    /* renamed from: v */
    public final boolean m8701v(T r2, int r3, int r4, int r5, int r6) {
            r1 = this;
            r0 = 1048575(0xfffff, float:1.469367E-39)
            if (r4 != r0) goto La
            boolean r2 = r1.m8700u(r2, r3)
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

    /* renamed from: w */
    public final boolean m8702w(T r3, int r4, int r5) {
            r2 = this;
            int[] r0 = r2.f16682a
            int r5 = r5 + 2
            r5 = r0[r5]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r5 = r5 & r0
            long r0 = (long) r5
            int r3 = p185k7.C3859j8.m8733g(r3, r0)
            if (r3 != r4) goto L13
            r3 = 1
            return r3
        L13:
            r3 = 0
            return r3
    }

    /* renamed from: y */
    public final void m8703y(T r17, p185k7.C3909n5 r18) {
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            boolean r3 = r0.f16687f
            r4 = 0
            if (r3 != 0) goto L47f
            int[] r3 = r0.f16682a
            int r3 = r3.length
            sun.misc.Unsafe r5 = p185k7.C3844i7.f16681o
            r6 = 1048575(0xfffff, float:1.469367E-39)
            r8 = 0
            r9 = 1048575(0xfffff, float:1.469367E-39)
            r10 = 0
        L18:
            if (r8 >= r3) goto L475
            int r11 = r0.m8691j(r8)
            int[] r12 = r0.f16682a
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
            boolean r11 = r0.m8702w(r1, r13, r8)
            if (r11 == 0) goto L44
            java.lang.Object r6 = r5.getObject(r1, r6)
            k7.q7 r7 = r0.m8693m(r8)
            r2.m8846e(r13, r6, r7)
            goto L44
        L59:
            boolean r11 = r0.m8702w(r1, r13, r8)
            if (r11 == 0) goto L44
            long r6 = m8669k(r1, r6)
            r2.m8843b(r13, r6)
            goto L44
        L67:
            boolean r11 = r0.m8702w(r1, r13, r8)
            if (r11 == 0) goto L44
            int r6 = m8668I(r1, r6)
            r2.m8842a(r13, r6)
            goto L44
        L75:
            boolean r11 = r0.m8702w(r1, r13, r8)
            if (r11 == 0) goto L44
            long r6 = m8669k(r1, r6)
            k7.m5 r11 = r2.f16756a
            r11.mo8775u(r13, r6)
            goto L44
        L85:
            boolean r11 = r0.m8702w(r1, r13, r8)
            if (r11 == 0) goto L44
            int r6 = m8668I(r1, r6)
            k7.m5 r7 = r2.f16756a
            r7.mo8773r(r13, r6)
            goto L44
        L95:
            boolean r11 = r0.m8702w(r1, r13, r8)
            if (r11 == 0) goto L44
            int r6 = m8668I(r1, r6)
            k7.m5 r7 = r2.f16756a
            r7.mo8777w(r13, r6)
            goto L44
        La5:
            boolean r11 = r0.m8702w(r1, r13, r8)
            if (r11 == 0) goto L44
            int r6 = m8668I(r1, r6)
            k7.m5 r7 = r2.f16756a
            r7.mo8763A(r13, r6)
            goto L44
        Lb5:
            boolean r11 = r0.m8702w(r1, r13, r8)
            if (r11 == 0) goto L44
            java.lang.Object r6 = r5.getObject(r1, r6)
            k7.i5 r6 = (p185k7.AbstractC3842i5) r6
            k7.m5 r7 = r2.f16756a
            r7.mo8772q(r13, r6)
            goto L44
        Lc8:
            boolean r11 = r0.m8702w(r1, r13, r8)
            if (r11 == 0) goto L44
            java.lang.Object r6 = r5.getObject(r1, r6)
            k7.q7 r7 = r0.m8693m(r8)
            r2.m8847f(r13, r6, r7)
            goto L44
        Ldb:
            boolean r11 = r0.m8702w(r1, r13, r8)
            if (r11 == 0) goto L44
            java.lang.Object r6 = r5.getObject(r1, r6)
            m8672z(r13, r6, r2)
            goto L44
        Lea:
            boolean r11 = r0.m8702w(r1, r13, r8)
            if (r11 == 0) goto L44
            boolean r6 = m8671x(r1, r6)
            k7.m5 r7 = r2.f16756a
            r7.mo8771p(r13, r6)
            goto L44
        Lfb:
            boolean r11 = r0.m8702w(r1, r13, r8)
            if (r11 == 0) goto L44
            int r6 = m8668I(r1, r6)
            k7.m5 r7 = r2.f16756a
            r7.mo8773r(r13, r6)
            goto L44
        L10c:
            boolean r11 = r0.m8702w(r1, r13, r8)
            if (r11 == 0) goto L44
            long r6 = m8669k(r1, r6)
            k7.m5 r11 = r2.f16756a
            r11.mo8775u(r13, r6)
            goto L44
        L11d:
            boolean r11 = r0.m8702w(r1, r13, r8)
            if (r11 == 0) goto L44
            int r6 = m8668I(r1, r6)
            k7.m5 r7 = r2.f16756a
            r7.mo8777w(r13, r6)
            goto L44
        L12e:
            boolean r11 = r0.m8702w(r1, r13, r8)
            if (r11 == 0) goto L44
            long r6 = m8669k(r1, r6)
            k7.m5 r11 = r2.f16756a
            r11.mo8765C(r13, r6)
            goto L44
        L13f:
            boolean r11 = r0.m8702w(r1, r13, r8)
            if (r11 == 0) goto L44
            long r6 = m8669k(r1, r6)
            k7.m5 r11 = r2.f16756a
            r11.mo8765C(r13, r6)
            goto L44
        L150:
            boolean r11 = r0.m8702w(r1, r13, r8)
            if (r11 == 0) goto L44
            float r6 = m8667F(r1, r6)
            r2.m8845d(r13, r6)
            goto L44
        L15f:
            boolean r11 = r0.m8702w(r1, r13, r8)
            if (r11 == 0) goto L44
            double r6 = m8666E(r1, r6)
            r2.m8844c(r13, r6)
            goto L44
        L16e:
            java.lang.Object r6 = r5.getObject(r1, r6)
            if (r6 != 0) goto L176
            goto L44
        L176:
            java.lang.Object r1 = r0.m8694n(r8)
            k7.y6 r1 = (p185k7.C4053y6) r1
            throw r4
        L17d:
            int[] r11 = r0.f16682a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            k7.q7 r7 = r0.m8693m(r8)
            p185k7.C3976s7.m8986i(r11, r6, r2, r7)
            goto L44
        L190:
            int[] r11 = r0.f16682a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            r7 = 1
            goto L250
        L19d:
            int[] r11 = r0.f16682a
            r11 = r11[r8]
            r12 = r11
            r11 = 1
            goto L25b
        L1a5:
            int[] r11 = r0.f16682a
            r11 = r11[r8]
            r12 = r11
            r11 = 1
            goto L26c
        L1ad:
            int[] r11 = r0.f16682a
            r11 = r11[r8]
            r12 = r11
            r11 = 1
            goto L27d
        L1b5:
            int[] r11 = r0.f16682a
            r11 = r11[r8]
            r12 = r11
            r11 = 1
            goto L28e
        L1bd:
            int[] r11 = r0.f16682a
            r11 = r11[r8]
            r12 = r11
            r11 = 1
            goto L29f
        L1c5:
            int[] r11 = r0.f16682a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            r12 = 1
            p185k7.C3976s7.m8979b(r11, r6, r2, r12)
            goto L44
        L1d5:
            r12 = 1
            int[] r11 = r0.f16682a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            p185k7.C3976s7.m8983f(r11, r6, r2, r12)
            goto L44
        L1e5:
            r12 = 1
            int[] r11 = r0.f16682a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            p185k7.C3976s7.m8984g(r11, r6, r2, r12)
            goto L44
        L1f5:
            r12 = 1
            int[] r11 = r0.f16682a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            p185k7.C3976s7.m8987j(r11, r6, r2, r12)
            goto L44
        L205:
            r12 = 1
            int[] r11 = r0.f16682a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            p185k7.C3976s7.m8997t(r11, r6, r2, r12)
            goto L44
        L215:
            r12 = 1
            int[] r11 = r0.f16682a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            p185k7.C3976s7.m8988k(r11, r6, r2, r12)
            goto L44
        L225:
            r12 = 1
            int[] r11 = r0.f16682a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            p185k7.C3976s7.m8985h(r11, r6, r2, r12)
            goto L44
        L235:
            r12 = 1
            int[] r11 = r0.f16682a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            p185k7.C3976s7.m8981d(r11, r6, r2, r12)
            goto L44
        L245:
            int[] r11 = r0.f16682a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            r7 = 0
        L250:
            p185k7.C3976s7.m8993p(r11, r6, r2, r7)
            goto L44
        L255:
            int[] r11 = r0.f16682a
            r11 = r11[r8]
            r12 = r11
            r11 = 0
        L25b:
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            p185k7.C3976s7.m8992o(r12, r6, r2, r11)
            goto L44
        L266:
            int[] r11 = r0.f16682a
            r11 = r11[r8]
            r12 = r11
            r11 = 0
        L26c:
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            p185k7.C3976s7.m8991n(r12, r6, r2, r11)
            goto L44
        L277:
            int[] r11 = r0.f16682a
            r11 = r11[r8]
            r12 = r11
            r11 = 0
        L27d:
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            p185k7.C3976s7.m8990m(r12, r6, r2, r11)
            goto L44
        L288:
            int[] r11 = r0.f16682a
            r11 = r11[r8]
            r12 = r11
            r11 = 0
        L28e:
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            p185k7.C3976s7.m8982e(r12, r6, r2, r11)
            goto L44
        L299:
            int[] r11 = r0.f16682a
            r11 = r11[r8]
            r12 = r11
            r11 = 0
        L29f:
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            p185k7.C3976s7.m8995r(r12, r6, r2, r11)
            goto L44
        L2aa:
            int[] r11 = r0.f16682a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            p185k7.C3976s7.m8980c(r11, r6, r2)
            goto L44
        L2b9:
            int[] r11 = r0.f16682a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            k7.q7 r7 = r0.m8693m(r8)
            p185k7.C3976s7.m8989l(r11, r6, r2, r7)
            goto L44
        L2cc:
            int[] r11 = r0.f16682a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            p185k7.C3976s7.m8994q(r11, r6, r2)
            goto L44
        L2db:
            int[] r11 = r0.f16682a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            r14 = 0
            p185k7.C3976s7.m8979b(r11, r6, r2, r14)
            goto L46e
        L2eb:
            r14 = 0
            int[] r11 = r0.f16682a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            p185k7.C3976s7.m8983f(r11, r6, r2, r14)
            goto L46e
        L2fb:
            r14 = 0
            int[] r11 = r0.f16682a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            p185k7.C3976s7.m8984g(r11, r6, r2, r14)
            goto L46e
        L30b:
            r14 = 0
            int[] r11 = r0.f16682a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            p185k7.C3976s7.m8987j(r11, r6, r2, r14)
            goto L46e
        L31b:
            r14 = 0
            int[] r11 = r0.f16682a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            p185k7.C3976s7.m8997t(r11, r6, r2, r14)
            goto L46e
        L32b:
            r14 = 0
            int[] r11 = r0.f16682a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            p185k7.C3976s7.m8988k(r11, r6, r2, r14)
            goto L46e
        L33b:
            r14 = 0
            int[] r11 = r0.f16682a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            p185k7.C3976s7.m8985h(r11, r6, r2, r14)
            goto L46e
        L34b:
            r14 = 0
            int[] r11 = r0.f16682a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            p185k7.C3976s7.m8981d(r11, r6, r2, r14)
            goto L46e
        L35b:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L46e
            java.lang.Object r6 = r5.getObject(r1, r6)
            k7.q7 r7 = r0.m8693m(r8)
            r2.m8846e(r13, r6, r7)
            goto L46e
        L36d:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L46e
            long r6 = r5.getLong(r1, r6)
            r2.m8843b(r13, r6)
            goto L46e
        L37b:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L46e
            int r6 = r5.getInt(r1, r6)
            r2.m8842a(r13, r6)
            goto L46e
        L389:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L46e
            long r6 = r5.getLong(r1, r6)
            k7.m5 r11 = r2.f16756a
            r11.mo8775u(r13, r6)
            goto L46e
        L399:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L46e
            int r6 = r5.getInt(r1, r6)
            k7.m5 r7 = r2.f16756a
            r7.mo8773r(r13, r6)
            goto L46e
        L3a9:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L46e
            int r6 = r5.getInt(r1, r6)
            k7.m5 r7 = r2.f16756a
            r7.mo8777w(r13, r6)
            goto L46e
        L3b9:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L46e
            int r6 = r5.getInt(r1, r6)
            k7.m5 r7 = r2.f16756a
            r7.mo8763A(r13, r6)
            goto L46e
        L3c9:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L46e
            java.lang.Object r6 = r5.getObject(r1, r6)
            k7.i5 r6 = (p185k7.AbstractC3842i5) r6
            k7.m5 r7 = r2.f16756a
            r7.mo8772q(r13, r6)
            goto L46e
        L3db:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L46e
            java.lang.Object r6 = r5.getObject(r1, r6)
            k7.q7 r7 = r0.m8693m(r8)
            r2.m8847f(r13, r6, r7)
            goto L46e
        L3ed:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L46e
            java.lang.Object r6 = r5.getObject(r1, r6)
            m8672z(r13, r6, r2)
            goto L46e
        L3fb:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L46e
            boolean r6 = p185k7.C3859j8.m8744r(r1, r6)
            k7.m5 r7 = r2.f16756a
            r7.mo8771p(r13, r6)
            goto L46e
        L40a:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L46e
            int r6 = r5.getInt(r1, r6)
            k7.m5 r7 = r2.f16756a
            r7.mo8773r(r13, r6)
            goto L46e
        L419:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L46e
            long r6 = r5.getLong(r1, r6)
            k7.m5 r11 = r2.f16756a
            r11.mo8775u(r13, r6)
            goto L46e
        L428:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L46e
            int r6 = r5.getInt(r1, r6)
            k7.m5 r7 = r2.f16756a
            r7.mo8777w(r13, r6)
            goto L46e
        L437:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L46e
            long r6 = r5.getLong(r1, r6)
            k7.m5 r11 = r2.f16756a
            r11.mo8765C(r13, r6)
            goto L46e
        L446:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L46e
            long r6 = r5.getLong(r1, r6)
            k7.m5 r11 = r2.f16756a
            r11.mo8765C(r13, r6)
            goto L46e
        L455:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L46e
            float r6 = p185k7.C3859j8.m8732f(r1, r6)
            r2.m8845d(r13, r6)
            goto L46e
        L462:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L46e
            double r6 = p185k7.C3859j8.m8731e(r1, r6)
            r2.m8844c(r13, r6)
        L46e:
            int r8 = r8 + 3
            r6 = 1048575(0xfffff, float:1.469367E-39)
            goto L18
        L475:
            k7.c8<?, ?> r3 = r0.f16693l
            java.lang.Object r1 = r3.mo8302c(r1)
            r3.mo8308i(r1, r2)
            return
        L47f:
            k7.r5<?> r2 = r0.f16694m
            r2.mo8919a(r1)
            throw r4
    }
}
