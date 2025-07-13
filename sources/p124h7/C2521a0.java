package p124h7;

/* renamed from: h7.a0 */
/* loaded from: classes.dex */
public final class C2521a0<T> implements p124h7.InterfaceC2666i0<T> {

    /* renamed from: o */
    public static final int[] f11350o = null;

    /* renamed from: p */
    public static final sun.misc.Unsafe f11351p = null;

    /* renamed from: a */
    public final int[] f11352a;

    /* renamed from: b */
    public final java.lang.Object[] f11353b;

    /* renamed from: c */
    public final int f11354c;

    /* renamed from: d */
    public final int f11355d;

    /* renamed from: e */
    public final p124h7.InterfaceC2935x f11356e;

    /* renamed from: f */
    public final boolean f11357f;

    /* renamed from: g */
    public final boolean f11358g;

    /* renamed from: h */
    public final boolean f11359h;

    /* renamed from: i */
    public final int[] f11360i;

    /* renamed from: j */
    public final int f11361j;

    /* renamed from: k */
    public final int f11362k;

    /* renamed from: l */
    public final p124h7.AbstractC2737m f11363l;

    /* renamed from: m */
    public final p124h7.AbstractC2900v0<?, ?> f11364m;

    /* renamed from: n */
    public final p124h7.AbstractC2772ng<?> f11365n;

    static {
            r0 = 0
            int[] r0 = new int[r0]
            p124h7.C2521a0.f11350o = r0
            sun.misc.Unsafe r0 = p124h7.C2577d1.m6551k()
            p124h7.C2521a0.f11351p = r0
            return
    }

    public C2521a0(int[] r1, java.lang.Object[] r2, int r3, int r4, p124h7.InterfaceC2935x r5, boolean r6, int[] r7, int r8, int r9, p124h7.C2558c0 r10, p124h7.AbstractC2737m r11, p124h7.AbstractC2900v0 r12, p124h7.AbstractC2772ng r13, p124h7.C2863t r14) {
            r0 = this;
            r0.<init>()
            r0.f11352a = r1
            r0.f11353b = r2
            r0.f11354c = r3
            r0.f11355d = r4
            boolean r1 = r5 instanceof p124h7.AbstractC2970yg
            r0.f11358g = r1
            r0.f11359h = r6
            if (r13 == 0) goto L1b
            boolean r1 = r13.mo7010h(r5)
            if (r1 == 0) goto L1b
            r1 = 1
            goto L1c
        L1b:
            r1 = 0
        L1c:
            r0.f11357f = r1
            r0.f11360i = r7
            r0.f11361j = r8
            r0.f11362k = r9
            r0.f11363l = r11
            r0.f11364m = r12
            r0.f11365n = r13
            r0.f11356e = r5
            return
    }

    /* renamed from: B */
    public static <T> boolean m6417B(T r0, long r1) {
            java.lang.Object r0 = p124h7.C2577d1.m6550j(r0, r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
    }

    /* renamed from: D */
    public static final void m6418D(int r1, java.lang.Object r2, p124h7.C2700jg r3) {
            boolean r0 = r2 instanceof java.lang.String
            if (r0 == 0) goto Lc
            java.lang.String r2 = (java.lang.String) r2
            h7.ig r3 = r3.f11684a
            r3.mo6734u(r1, r2)
            return
        Lc:
            h7.cg r2 = (p124h7.AbstractC2574cg) r2
            h7.ig r3 = r3.f11684a
            r3.mo6726m(r1, r2)
            return
    }

    /* renamed from: F */
    public static p124h7.C2936x0 m6419F(java.lang.Object r2) {
            h7.yg r2 = (p124h7.AbstractC2970yg) r2
            h7.x0 r0 = r2.zzc
            h7.x0 r1 = p124h7.C2936x0.f12011f
            if (r0 != r1) goto Le
            h7.x0 r0 = p124h7.C2936x0.m7246b()
            r2.zzc = r0
        Le:
            return r0
    }

    /* renamed from: G */
    public static p124h7.C2521a0 m6420G(p124h7.InterfaceC2899v r7, p124h7.C2558c0 r8, p124h7.AbstractC2737m r9, p124h7.AbstractC2900v0 r10, p124h7.AbstractC2772ng r11, p124h7.C2863t r12) {
            boolean r0 = r7 instanceof p124h7.C2648h0
            if (r0 == 0) goto L11
            r1 = r7
            h7.h0 r1 = (p124h7.C2648h0) r1
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            h7.a0 r7 = m6421H(r1, r2, r3, r4, r5, r6)
            return r7
        L11:
            h7.t0 r7 = (p124h7.C2864t0) r7
            r7 = 0
            throw r7
    }

    /* renamed from: H */
    public static <T> p124h7.C2521a0<T> m6421H(p124h7.C2648h0 r35, p124h7.C2558c0 r36, p124h7.AbstractC2737m r37, p124h7.AbstractC2900v0<?, ?> r38, p124h7.AbstractC2772ng<?> r39, p124h7.C2863t r40) {
            r0 = r35
            int r1 = r0.f11564d
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
            java.lang.String r1 = r0.f11562b
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
            int[] r7 = p124h7.C2521a0.f11350o
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
            sun.misc.Unsafe r8 = p124h7.C2521a0.f11351p
            java.lang.Object[] r2 = r0.f11563c
            h7.x r6 = r0.f11561a
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
            java.lang.reflect.Field r0 = m6426r(r6, r0)
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
            java.lang.reflect.Field r4 = m6426r(r6, r4)
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
            java.lang.reflect.Field r4 = m6426r(r6, r4)
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
            java.lang.reflect.Field r5 = m6426r(r14, r5)
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
            h7.a0 r0 = new h7.a0
            r1 = r35
            h7.x r10 = r1.f11561a
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

    /* renamed from: I */
    public static <T> double m6422I(T r0, long r1) {
            java.lang.Object r0 = p124h7.C2577d1.m6550j(r0, r1)
            java.lang.Double r0 = (java.lang.Double) r0
            double r0 = r0.doubleValue()
            return r0
    }

    /* renamed from: J */
    public static <T> float m6423J(T r0, long r1) {
            java.lang.Object r0 = p124h7.C2577d1.m6550j(r0, r1)
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            return r0
    }

    /* renamed from: M */
    public static <T> int m6424M(T r0, long r1) {
            java.lang.Object r0 = p124h7.C2577d1.m6550j(r0, r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            return r0
    }

    /* renamed from: m */
    public static <T> long m6425m(T r0, long r1) {
            java.lang.Object r0 = p124h7.C2577d1.m6550j(r0, r1)
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            return r0
    }

    /* renamed from: r */
    public static java.lang.reflect.Field m6426r(java.lang.Class<?> r7, java.lang.String r8) {
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
    public final boolean m6427A(T r3, int r4, int r5) {
            r2 = this;
            int[] r0 = r2.f11352a
            int r5 = r5 + 2
            r5 = r0[r5]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r5 = r5 & r0
            long r0 = (long) r5
            int r3 = p124h7.C2577d1.m6547g(r3, r0)
            if (r3 != r4) goto L13
            r3 = 1
            return r3
        L13:
            r3 = 0
            return r3
    }

    /* renamed from: C */
    public final void m6428C(T r17, p124h7.C2700jg r18) {
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            boolean r3 = r0.f11357f
            r4 = 0
            if (r3 != 0) goto L47f
            int[] r3 = r0.f11352a
            int r3 = r3.length
            sun.misc.Unsafe r5 = p124h7.C2521a0.f11351p
            r6 = 1048575(0xfffff, float:1.469367E-39)
            r8 = 0
            r9 = 1048575(0xfffff, float:1.469367E-39)
            r10 = 0
        L18:
            if (r8 >= r3) goto L475
            int r11 = r0.m6449l(r8)
            int[] r12 = r0.f11352a
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
            boolean r11 = r0.m6427A(r1, r13, r8)
            if (r11 == 0) goto L44
            java.lang.Object r6 = r5.getObject(r1, r6)
            h7.i0 r7 = r0.m6451o(r8)
            r2.m6881e(r13, r6, r7)
            goto L44
        L59:
            boolean r11 = r0.m6427A(r1, r13, r8)
            if (r11 == 0) goto L44
            long r6 = m6425m(r1, r6)
            r2.m6878b(r13, r6)
            goto L44
        L67:
            boolean r11 = r0.m6427A(r1, r13, r8)
            if (r11 == 0) goto L44
            int r6 = m6424M(r1, r6)
            r2.m6877a(r13, r6)
            goto L44
        L75:
            boolean r11 = r0.m6427A(r1, r13, r8)
            if (r11 == 0) goto L44
            long r6 = m6425m(r1, r6)
            h7.ig r11 = r2.f11684a
            r11.mo6729p(r13, r6)
            goto L44
        L85:
            boolean r11 = r0.m6427A(r1, r13, r8)
            if (r11 == 0) goto L44
            int r6 = m6424M(r1, r6)
            h7.ig r7 = r2.f11684a
            r7.mo6727n(r13, r6)
            goto L44
        L95:
            boolean r11 = r0.m6427A(r1, r13, r8)
            if (r11 == 0) goto L44
            int r6 = m6424M(r1, r6)
            h7.ig r7 = r2.f11684a
            r7.mo6731r(r13, r6)
            goto L44
        La5:
            boolean r11 = r0.m6427A(r1, r13, r8)
            if (r11 == 0) goto L44
            int r6 = m6424M(r1, r6)
            h7.ig r7 = r2.f11684a
            r7.mo6736w(r13, r6)
            goto L44
        Lb5:
            boolean r11 = r0.m6427A(r1, r13, r8)
            if (r11 == 0) goto L44
            java.lang.Object r6 = r5.getObject(r1, r6)
            h7.cg r6 = (p124h7.AbstractC2574cg) r6
            h7.ig r7 = r2.f11684a
            r7.mo6726m(r13, r6)
            goto L44
        Lc8:
            boolean r11 = r0.m6427A(r1, r13, r8)
            if (r11 == 0) goto L44
            java.lang.Object r6 = r5.getObject(r1, r6)
            h7.i0 r7 = r0.m6451o(r8)
            r2.m6882f(r13, r6, r7)
            goto L44
        Ldb:
            boolean r11 = r0.m6427A(r1, r13, r8)
            if (r11 == 0) goto L44
            java.lang.Object r6 = r5.getObject(r1, r6)
            m6418D(r13, r6, r2)
            goto L44
        Lea:
            boolean r11 = r0.m6427A(r1, r13, r8)
            if (r11 == 0) goto L44
            boolean r6 = m6417B(r1, r6)
            h7.ig r7 = r2.f11684a
            r7.mo6725l(r13, r6)
            goto L44
        Lfb:
            boolean r11 = r0.m6427A(r1, r13, r8)
            if (r11 == 0) goto L44
            int r6 = m6424M(r1, r6)
            h7.ig r7 = r2.f11684a
            r7.mo6727n(r13, r6)
            goto L44
        L10c:
            boolean r11 = r0.m6427A(r1, r13, r8)
            if (r11 == 0) goto L44
            long r6 = m6425m(r1, r6)
            h7.ig r11 = r2.f11684a
            r11.mo6729p(r13, r6)
            goto L44
        L11d:
            boolean r11 = r0.m6427A(r1, r13, r8)
            if (r11 == 0) goto L44
            int r6 = m6424M(r1, r6)
            h7.ig r7 = r2.f11684a
            r7.mo6731r(r13, r6)
            goto L44
        L12e:
            boolean r11 = r0.m6427A(r1, r13, r8)
            if (r11 == 0) goto L44
            long r6 = m6425m(r1, r6)
            h7.ig r11 = r2.f11684a
            r11.mo6738y(r13, r6)
            goto L44
        L13f:
            boolean r11 = r0.m6427A(r1, r13, r8)
            if (r11 == 0) goto L44
            long r6 = m6425m(r1, r6)
            h7.ig r11 = r2.f11684a
            r11.mo6738y(r13, r6)
            goto L44
        L150:
            boolean r11 = r0.m6427A(r1, r13, r8)
            if (r11 == 0) goto L44
            float r6 = m6423J(r1, r6)
            r2.m6880d(r13, r6)
            goto L44
        L15f:
            boolean r11 = r0.m6427A(r1, r13, r8)
            if (r11 == 0) goto L44
            double r6 = m6422I(r1, r6)
            r2.m6879c(r13, r6)
            goto L44
        L16e:
            java.lang.Object r6 = r5.getObject(r1, r6)
            if (r6 != 0) goto L176
            goto L44
        L176:
            java.lang.Object r1 = r0.m6453q(r8)
            h7.r r1 = (p124h7.C2827r) r1
            throw r4
        L17d:
            int[] r11 = r0.f11352a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            h7.i0 r7 = r0.m6451o(r8)
            p124h7.C2702k0.m6917k(r11, r6, r2, r7)
            goto L44
        L190:
            int[] r11 = r0.f11352a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            r7 = 1
            goto L250
        L19d:
            int[] r11 = r0.f11352a
            r11 = r11[r8]
            r12 = r11
            r11 = 1
            goto L25b
        L1a5:
            int[] r11 = r0.f11352a
            r11 = r11[r8]
            r12 = r11
            r11 = 1
            goto L26c
        L1ad:
            int[] r11 = r0.f11352a
            r11 = r11[r8]
            r12 = r11
            r11 = 1
            goto L27d
        L1b5:
            int[] r11 = r0.f11352a
            r11 = r11[r8]
            r12 = r11
            r11 = 1
            goto L28e
        L1bd:
            int[] r11 = r0.f11352a
            r11 = r11[r8]
            r12 = r11
            r11 = 1
            goto L29f
        L1c5:
            int[] r11 = r0.f11352a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            r12 = 1
            p124h7.C2702k0.m6910d(r11, r6, r2, r12)
            goto L44
        L1d5:
            r12 = 1
            int[] r11 = r0.f11352a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            p124h7.C2702k0.m6914h(r11, r6, r2, r12)
            goto L44
        L1e5:
            r12 = 1
            int[] r11 = r0.f11352a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            p124h7.C2702k0.m6915i(r11, r6, r2, r12)
            goto L44
        L1f5:
            r12 = 1
            int[] r11 = r0.f11352a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            p124h7.C2702k0.m6918l(r11, r6, r2, r12)
            goto L44
        L205:
            r12 = 1
            int[] r11 = r0.f11352a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            p124h7.C2702k0.m6928v(r11, r6, r2, r12)
            goto L44
        L215:
            r12 = 1
            int[] r11 = r0.f11352a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            p124h7.C2702k0.m6919m(r11, r6, r2, r12)
            goto L44
        L225:
            r12 = 1
            int[] r11 = r0.f11352a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            p124h7.C2702k0.m6916j(r11, r6, r2, r12)
            goto L44
        L235:
            r12 = 1
            int[] r11 = r0.f11352a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            p124h7.C2702k0.m6912f(r11, r6, r2, r12)
            goto L44
        L245:
            int[] r11 = r0.f11352a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            r7 = 0
        L250:
            p124h7.C2702k0.m6924r(r11, r6, r2, r7)
            goto L44
        L255:
            int[] r11 = r0.f11352a
            r11 = r11[r8]
            r12 = r11
            r11 = 0
        L25b:
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            p124h7.C2702k0.m6923q(r12, r6, r2, r11)
            goto L44
        L266:
            int[] r11 = r0.f11352a
            r11 = r11[r8]
            r12 = r11
            r11 = 0
        L26c:
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            p124h7.C2702k0.m6922p(r12, r6, r2, r11)
            goto L44
        L277:
            int[] r11 = r0.f11352a
            r11 = r11[r8]
            r12 = r11
            r11 = 0
        L27d:
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            p124h7.C2702k0.m6921o(r12, r6, r2, r11)
            goto L44
        L288:
            int[] r11 = r0.f11352a
            r11 = r11[r8]
            r12 = r11
            r11 = 0
        L28e:
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            p124h7.C2702k0.m6913g(r12, r6, r2, r11)
            goto L44
        L299:
            int[] r11 = r0.f11352a
            r11 = r11[r8]
            r12 = r11
            r11 = 0
        L29f:
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            p124h7.C2702k0.m6926t(r12, r6, r2, r11)
            goto L44
        L2aa:
            int[] r11 = r0.f11352a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            p124h7.C2702k0.m6911e(r11, r6, r2)
            goto L44
        L2b9:
            int[] r11 = r0.f11352a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            h7.i0 r7 = r0.m6451o(r8)
            p124h7.C2702k0.m6920n(r11, r6, r2, r7)
            goto L44
        L2cc:
            int[] r11 = r0.f11352a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            p124h7.C2702k0.m6925s(r11, r6, r2)
            goto L44
        L2db:
            int[] r11 = r0.f11352a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            r14 = 0
            p124h7.C2702k0.m6910d(r11, r6, r2, r14)
            goto L46e
        L2eb:
            r14 = 0
            int[] r11 = r0.f11352a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            p124h7.C2702k0.m6914h(r11, r6, r2, r14)
            goto L46e
        L2fb:
            r14 = 0
            int[] r11 = r0.f11352a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            p124h7.C2702k0.m6915i(r11, r6, r2, r14)
            goto L46e
        L30b:
            r14 = 0
            int[] r11 = r0.f11352a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            p124h7.C2702k0.m6918l(r11, r6, r2, r14)
            goto L46e
        L31b:
            r14 = 0
            int[] r11 = r0.f11352a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            p124h7.C2702k0.m6928v(r11, r6, r2, r14)
            goto L46e
        L32b:
            r14 = 0
            int[] r11 = r0.f11352a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            p124h7.C2702k0.m6919m(r11, r6, r2, r14)
            goto L46e
        L33b:
            r14 = 0
            int[] r11 = r0.f11352a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            p124h7.C2702k0.m6916j(r11, r6, r2, r14)
            goto L46e
        L34b:
            r14 = 0
            int[] r11 = r0.f11352a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            p124h7.C2702k0.m6912f(r11, r6, r2, r14)
            goto L46e
        L35b:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L46e
            java.lang.Object r6 = r5.getObject(r1, r6)
            h7.i0 r7 = r0.m6451o(r8)
            r2.m6881e(r13, r6, r7)
            goto L46e
        L36d:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L46e
            long r6 = r5.getLong(r1, r6)
            r2.m6878b(r13, r6)
            goto L46e
        L37b:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L46e
            int r6 = r5.getInt(r1, r6)
            r2.m6877a(r13, r6)
            goto L46e
        L389:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L46e
            long r6 = r5.getLong(r1, r6)
            h7.ig r11 = r2.f11684a
            r11.mo6729p(r13, r6)
            goto L46e
        L399:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L46e
            int r6 = r5.getInt(r1, r6)
            h7.ig r7 = r2.f11684a
            r7.mo6727n(r13, r6)
            goto L46e
        L3a9:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L46e
            int r6 = r5.getInt(r1, r6)
            h7.ig r7 = r2.f11684a
            r7.mo6731r(r13, r6)
            goto L46e
        L3b9:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L46e
            int r6 = r5.getInt(r1, r6)
            h7.ig r7 = r2.f11684a
            r7.mo6736w(r13, r6)
            goto L46e
        L3c9:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L46e
            java.lang.Object r6 = r5.getObject(r1, r6)
            h7.cg r6 = (p124h7.AbstractC2574cg) r6
            h7.ig r7 = r2.f11684a
            r7.mo6726m(r13, r6)
            goto L46e
        L3db:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L46e
            java.lang.Object r6 = r5.getObject(r1, r6)
            h7.i0 r7 = r0.m6451o(r8)
            r2.m6882f(r13, r6, r7)
            goto L46e
        L3ed:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L46e
            java.lang.Object r6 = r5.getObject(r1, r6)
            m6418D(r13, r6, r2)
            goto L46e
        L3fb:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L46e
            boolean r6 = p124h7.C2577d1.m6559s(r1, r6)
            h7.ig r7 = r2.f11684a
            r7.mo6725l(r13, r6)
            goto L46e
        L40a:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L46e
            int r6 = r5.getInt(r1, r6)
            h7.ig r7 = r2.f11684a
            r7.mo6727n(r13, r6)
            goto L46e
        L419:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L46e
            long r6 = r5.getLong(r1, r6)
            h7.ig r11 = r2.f11684a
            r11.mo6729p(r13, r6)
            goto L46e
        L428:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L46e
            int r6 = r5.getInt(r1, r6)
            h7.ig r7 = r2.f11684a
            r7.mo6731r(r13, r6)
            goto L46e
        L437:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L46e
            long r6 = r5.getLong(r1, r6)
            h7.ig r11 = r2.f11684a
            r11.mo6738y(r13, r6)
            goto L46e
        L446:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L46e
            long r6 = r5.getLong(r1, r6)
            h7.ig r11 = r2.f11684a
            r11.mo6738y(r13, r6)
            goto L46e
        L455:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L46e
            float r6 = p124h7.C2577d1.m6546f(r1, r6)
            r2.m6880d(r13, r6)
            goto L46e
        L462:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L46e
            double r6 = p124h7.C2577d1.m6545e(r1, r6)
            r2.m6879c(r13, r6)
        L46e:
            int r8 = r8 + 3
            r6 = 1048575(0xfffff, float:1.469367E-39)
            goto L18
        L475:
            h7.v0<?, ?> r3 = r0.f11364m
            java.lang.Object r1 = r3.mo7183d(r1)
            r3.mo7197r(r1, r2)
            return
        L47f:
            h7.ng<?> r2 = r0.f11365n
            r2.mo7003a(r1)
            throw r4
    }

    /* renamed from: E */
    public final int m6429E(T r30, byte[] r31, int r32, int r33, int r34, p124h7.C2915vf r35) {
            r29 = this;
            r15 = r29
            r14 = r30
            r12 = r31
            r13 = r33
            r11 = r35
            sun.misc.Unsafe r9 = p124h7.C2521a0.f11351p
            r16 = 0
            r0 = r32
            r1 = r34
            r2 = -1
            r3 = 0
            r4 = 0
            r6 = 1048575(0xfffff, float:1.469367E-39)
            r7 = 0
        L19:
            if (r0 >= r13) goto L436
            int r4 = r0 + 1
            r0 = r12[r0]
            if (r0 >= 0) goto L2c
            int r0 = p052d6.C1306f0.m3793v(r0, r12, r4, r11)
            int r4 = r11.f11968a
            r28 = r4
            r4 = r0
            r0 = r28
        L2c:
            int r8 = r0 >>> 3
            r10 = r0 & 7
            r5 = 3
            if (r8 <= r2) goto L43
            int r3 = r3 / r5
            int r2 = r15.f11354c
            if (r8 < r2) goto L41
            int r2 = r15.f11355d
            if (r8 > r2) goto L41
            int r2 = r15.m6448k(r8, r3)
            goto L47
        L41:
            r2 = -1
            goto L47
        L43:
            int r2 = r15.m6436R(r8)
        L47:
            r3 = -1
            if (r2 != r3) goto L5a
            r2 = r4
            r19 = r6
            r20 = r8
            r27 = r9
            r14 = 0
            r17 = -1
            r23 = 0
            r8 = r0
            r6 = r1
            goto L3ba
        L5a:
            int[] r1 = r15.f11352a
            int r18 = r2 + 1
            r5 = r1[r18]
            int r3 = r5 >>> 20
            r3 = r3 & 255(0xff, float:3.57E-43)
            r20 = r8
            r17 = 1048575(0xfffff, float:1.469367E-39)
            r8 = r5 & r17
            r21 = r4
            r22 = r5
            long r4 = (long) r8
            r8 = 17
            if (r3 > r8) goto L2ae
            int r8 = r2 + 2
            r1 = r1[r8]
            int r8 = r1 >>> 20
            r13 = 1
            int r8 = r13 << r8
            r13 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r1 & r13
            r25 = r4
            if (r1 == r6) goto L91
            if (r6 == r13) goto L8b
            long r4 = (long) r6
            r9.putInt(r14, r4, r7)
        L8b:
            long r4 = (long) r1
            int r7 = r9.getInt(r14, r4)
            r6 = r1
        L91:
            r1 = 5
            switch(r3) {
                case 0: goto L269;
                case 1: goto L245;
                case 2: goto L21c;
                case 3: goto L21c;
                case 4: goto L204;
                case 5: goto L1d6;
                case 6: goto L1b8;
                case 7: goto L196;
                case 8: goto L177;
                case 9: goto L151;
                case 10: goto L137;
                case 11: goto L204;
                case 12: goto Lf2;
                case 13: goto L1b8;
                case 14: goto L1d6;
                case 15: goto Le3;
                case 16: goto Lc2;
                default: goto L95;
            }
        L95:
            r5 = r0
            r19 = r6
            r13 = r21
            r0 = 3
            r18 = -1
            r6 = r2
            r1 = r25
            if (r10 != r0) goto L29d
            h7.i0 r0 = r15.m6451o(r6)
            int r3 = r20 << 3
            r4 = r3 | 4
            r21 = r1
            r1 = r31
            r2 = r13
            r3 = r33
            r12 = r21
            r10 = r5
            r5 = r35
            int r4 = p052d6.C1306f0.m3781j(r0, r1, r2, r3, r4, r5)
            r0 = r7 & r8
            if (r0 != 0) goto L285
            java.lang.Object r0 = r11.f11970c
            goto L28f
        Lc2:
            if (r10 != 0) goto Ldd
            r4 = r21
            int r1 = p052d6.C1306f0.m3795x(r12, r4, r11)
            long r3 = r11.f11969b
            long r3 = p124h7.C2592dg.m6619o(r3)
            r10 = r1
            r21 = r3
            r19 = r6
            r18 = -1
            r4 = r0
            r6 = r2
            r2 = r25
            goto L234
        Ldd:
            r10 = r0
            r19 = r6
            r13 = r21
            goto L132
        Le3:
            r4 = r21
            if (r10 != 0) goto L12e
            int r1 = p052d6.C1306f0.m3792u(r12, r4, r11)
            int r3 = r11.f11968a
            int r3 = p124h7.C2592dg.m6618n(r3)
            goto L121
        Lf2:
            r4 = r21
            if (r10 != 0) goto L12e
            int r1 = p052d6.C1306f0.m3792u(r12, r4, r11)
            int r3 = r11.f11968a
            h7.b r4 = r15.m6450n(r2)
            if (r4 == 0) goto L11f
            boolean r4 = r4.m6476a()
            if (r4 == 0) goto L109
            goto L11f
        L109:
            h7.x0 r4 = m6419F(r30)
            long r13 = (long) r3
            java.lang.Long r3 = java.lang.Long.valueOf(r13)
            r4.m7248c(r0, r3)
            r14 = r30
            r5 = r0
            r19 = r6
            r18 = -1
            r6 = r2
            goto L263
        L11f:
            r14 = r30
        L121:
            r4 = r25
            r9.putInt(r14, r4, r3)
            r5 = r0
            r19 = r6
            r18 = -1
            r6 = r2
            goto L262
        L12e:
            r10 = r0
            r13 = r4
            r19 = r6
        L132:
            r18 = -1
            r6 = r2
            goto L201
        L137:
            r5 = r2
            r4 = r21
            r1 = r25
            r3 = 2
            if (r10 != r3) goto L1fa
            int r3 = p052d6.C1306f0.m3773b(r12, r4, r11)
            java.lang.Object r4 = r11.f11970c
            r9.putObject(r14, r1, r4)
            r1 = r3
            r19 = r6
            r18 = -1
            r6 = r5
            r5 = r0
            goto L262
        L151:
            r5 = r2
            r4 = r21
            r1 = r25
            r3 = 2
            if (r10 != r3) goto L173
            h7.i0 r3 = r15.m6451o(r5)
            r13 = r33
            int r3 = p052d6.C1306f0.m3783l(r3, r12, r4, r13, r11)
            r4 = r7 & r8
            if (r4 != 0) goto L168
            goto L190
        L168:
            java.lang.Object r4 = r9.getObject(r14, r1)
            java.lang.Object r10 = r11.f11970c
            java.lang.Object r4 = p124h7.C2575d.m6540c(r4, r10)
            goto L192
        L173:
            r13 = r33
            goto L1fa
        L177:
            r13 = r33
            r5 = r2
            r4 = r21
            r1 = r25
            r3 = 2
            if (r10 != r3) goto L1fa
            r3 = 536870912(0x20000000, float:1.0842022E-19)
            r3 = r22 & r3
            if (r3 != 0) goto L18c
            int r3 = p052d6.C1306f0.m3789r(r12, r4, r11)
            goto L190
        L18c:
            int r3 = p052d6.C1306f0.m3790s(r12, r4, r11)
        L190:
            java.lang.Object r4 = r11.f11970c
        L192:
            r9.putObject(r14, r1, r4)
            goto L1cc
        L196:
            r13 = r33
            r5 = r2
            r4 = r21
            r1 = r25
            if (r10 != 0) goto L1fa
            int r3 = p052d6.C1306f0.m3795x(r12, r4, r11)
            r32 = r3
            long r3 = r11.f11969b
            r21 = 0
            int r10 = (r3 > r21 ? 1 : (r3 == r21 ? 0 : -1))
            if (r10 == 0) goto L1af
            r3 = 1
            goto L1b0
        L1af:
            r3 = 0
        L1b0:
            e7.i8 r4 = p124h7.C2577d1.f11435c
            r4.mo4205c(r14, r1, r3)
            r3 = r32
            goto L1cc
        L1b8:
            r13 = r33
            r5 = r2
            r4 = r21
            r1 = r25
            r3 = 5
            if (r10 != r3) goto L1fa
            int r3 = p052d6.C1306f0.m3779h(r12, r4)
            r9.putInt(r14, r1, r3)
            int r4 = r4 + 4
            r3 = r4
        L1cc:
            r7 = r7 | r8
            r1 = r34
            r4 = r0
            r0 = r3
            r3 = r5
            r2 = r20
            goto L19
        L1d6:
            r13 = r33
            r5 = r2
            r4 = r21
            r1 = r25
            r3 = 1
            if (r10 != r3) goto L1fa
            long r21 = p052d6.C1306f0.m3796y(r12, r4)
            r10 = r0
            r0 = r9
            r2 = r1
            r1 = r30
            r18 = -1
            r13 = r4
            r19 = r6
            r6 = r5
            r4 = r21
            r0.putLong(r1, r2, r4)
            int r4 = r13 + 8
            r1 = r4
            r5 = r10
            goto L262
        L1fa:
            r10 = r0
            r13 = r4
            r19 = r6
            r18 = -1
            r6 = r5
        L201:
            r5 = r10
            goto L29d
        L204:
            r4 = r0
            r19 = r6
            r13 = r21
            r18 = -1
            r6 = r2
            r2 = r25
            if (r10 != 0) goto L242
            int r0 = p052d6.C1306f0.m3792u(r12, r13, r11)
            int r1 = r11.f11968a
            r9.putInt(r14, r2, r1)
            r1 = r0
            r5 = r4
            goto L262
        L21c:
            r4 = r0
            r19 = r6
            r13 = r21
            r18 = -1
            r6 = r2
            r2 = r25
            if (r10 != 0) goto L242
            int r1 = p052d6.C1306f0.m3795x(r12, r13, r11)
            r32 = r1
            long r0 = r11.f11969b
            r10 = r32
            r21 = r0
        L234:
            r0 = r9
            r1 = r30
            r13 = r4
            r4 = r21
            r0.putLong(r1, r2, r4)
            r0 = r7 | r8
            r7 = r0
            r5 = r13
            goto L264
        L242:
            r5 = r4
            goto L29d
        L245:
            r5 = r0
            r19 = r6
            r13 = r21
            r3 = 5
            r18 = -1
            r6 = r2
            r1 = r25
            if (r10 != r3) goto L29d
            int r0 = p052d6.C1306f0.m3779h(r12, r13)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            e7.i8 r3 = p124h7.C2577d1.f11435c
            r3.mo4208f(r14, r1, r0)
            int r4 = r13 + 4
            r1 = r4
        L262:
            r7 = r7 | r8
        L263:
            r10 = r1
        L264:
            r12 = r5
            r23 = r6
            goto L2f0
        L269:
            r5 = r0
            r19 = r6
            r13 = r21
            r0 = 1
            r18 = -1
            r6 = r2
            r1 = r25
            if (r10 != r0) goto L29d
            long r3 = p052d6.C1306f0.m3796y(r12, r13)
            double r3 = java.lang.Double.longBitsToDouble(r3)
            p124h7.C2577d1.m6554n(r14, r1, r3)
            int r4 = r13 + 8
            r10 = r5
            goto L292
        L285:
            java.lang.Object r0 = r9.getObject(r14, r12)
            java.lang.Object r1 = r11.f11970c
            java.lang.Object r0 = p124h7.C2575d.m6540c(r0, r1)
        L28f:
            r9.putObject(r14, r12, r0)
        L292:
            r0 = r7 | r8
            r7 = r0
            r0 = r4
            r23 = r6
            r12 = r10
            r6 = r19
            goto L2f3
        L29d:
            r10 = r5
            r21 = r13
            r23 = r6
            r27 = r9
            r8 = r10
            r2 = r21
            r14 = 0
            r17 = -1
            r6 = r34
            goto L3ba
        L2ae:
            r12 = r4
            r8 = r6
            r18 = -1
            r5 = r0
            r6 = r2
            r0 = 2
            r1 = 27
            if (r3 != r1) goto L310
            if (r10 != r0) goto L300
            java.lang.Object r0 = r9.getObject(r14, r12)
            h7.c r0 = (p124h7.InterfaceC2557c) r0
            boolean r1 = r0.mo6520c()
            if (r1 != 0) goto L2d8
            int r1 = r0.size()
            if (r1 != 0) goto L2d0
            r1 = 10
            goto L2d1
        L2d0:
            int r1 = r1 + r1
        L2d1:
            h7.c r0 = r0.mo6521k(r1)
            r9.putObject(r14, r12, r0)
        L2d8:
            r10 = r0
            h7.i0 r0 = r15.m6451o(r6)
            r1 = r5
            r2 = r31
            r3 = r21
            r4 = r33
            r12 = r5
            r5 = r10
            r23 = r6
            r19 = r8
            r6 = r35
            int r10 = p052d6.C1306f0.m3786o(r0, r1, r2, r3, r4, r5, r6)
        L2f0:
            r6 = r19
            r0 = r10
        L2f3:
            r13 = r33
            r1 = r34
            r4 = r12
            r2 = r20
            r3 = r23
            r12 = r31
            goto L19
        L300:
            r23 = r6
            r19 = r8
            r32 = r5
            r26 = r7
            r27 = r9
            r15 = r21
            r17 = -1
            goto L363
        L310:
            r23 = r6
            r19 = r8
            r8 = r5
            r1 = 49
            if (r3 > r1) goto L34d
            r5 = r22
            long r5 = (long) r5
            r0 = r29
            r1 = r30
            r2 = r31
            r4 = r3
            r3 = r21
            r22 = r4
            r4 = r33
            r24 = r5
            r6 = 0
            r5 = r8
            r15 = r6
            r6 = r20
            r26 = r7
            r7 = r10
            r32 = r8
            r10 = r20
            r8 = r23
            r27 = r9
            r17 = -1
            r9 = r24
            r11 = r22
            r15 = r21
            r14 = r35
            int r4 = r0.m6435Q(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            if (r4 == r15) goto L364
            r0 = r4
            goto L399
        L34d:
            r26 = r7
            r32 = r8
            r27 = r9
            r15 = r21
            r5 = r22
            r17 = -1
            r22 = r3
            r1 = 50
            r9 = r22
            if (r9 != r1) goto L37e
            if (r10 == r0) goto L36d
        L363:
            r4 = r15
        L364:
            r8 = r32
            r6 = r34
            r2 = r4
            r7 = r26
            r14 = 0
            goto L3ba
        L36d:
            r0 = r29
            r1 = r30
            r2 = r31
            r3 = r15
            r4 = r33
            r5 = r23
            r6 = r12
            r0.m6432N(r1, r2, r3, r4, r5, r6)
            r14 = 0
            throw r14
        L37e:
            r14 = 0
            r0 = r29
            r1 = r30
            r2 = r31
            r3 = r15
            r4 = r33
            r8 = r5
            r5 = r32
            r6 = r20
            r7 = r10
            r10 = r12
            r12 = r23
            r13 = r35
            int r0 = r0.m6433O(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 == r15) goto L3b3
        L399:
            r15 = r29
            r14 = r30
            r12 = r31
            r4 = r32
            r13 = r33
            r1 = r34
            r11 = r35
            r6 = r19
            r2 = r20
            r3 = r23
            r7 = r26
            r9 = r27
            goto L19
        L3b3:
            r8 = r32
            r6 = r34
            r2 = r0
            r7 = r26
        L3ba:
            if (r8 != r6) goto L3ca
            if (r6 == 0) goto L3ca
            r9 = r29
            r12 = r30
            r0 = r2
            r1 = r6
            r4 = r8
            r3 = r14
            r6 = r19
            goto L43f
        L3ca:
            r9 = r29
            r3 = r14
            boolean r0 = r9.f11357f
            if (r0 == 0) goto L40f
            r10 = r35
            java.lang.Object r0 = r10.f11971d
            h7.mg r0 = (p124h7.C2754mg) r0
            h7.mg r1 = p124h7.C2754mg.m6988a()
            if (r0 == r1) goto L40c
            h7.x r0 = r9.f11356e
            java.lang.Object r1 = r10.f11971d
            h7.mg r1 = (p124h7.C2754mg) r1
            java.util.Map<h7.lg, h7.xg<?, ?>> r1 = r1.f11779a
            h7.lg r4 = new h7.lg
            r11 = r20
            r4.<init>(r0, r11)
            java.lang.Object r0 = r1.get(r4)
            h7.xg r0 = (p124h7.C2952xg) r0
            if (r0 != 0) goto L406
            h7.x0 r4 = m6419F(r30)
            r0 = r8
            r1 = r31
            r3 = r33
            r5 = r35
            int r0 = p052d6.C1306f0.m3791t(r0, r1, r2, r3, r4, r5)
            r12 = r30
            goto L424
        L406:
            r12 = r30
            r0 = r12
            h7.wg r0 = (p124h7.AbstractC2934wg) r0
            throw r3
        L40c:
            r12 = r30
            goto L413
        L40f:
            r12 = r30
            r10 = r35
        L413:
            r11 = r20
            h7.x0 r4 = m6419F(r30)
            r0 = r8
            r1 = r31
            r3 = r33
            r5 = r35
            int r0 = p052d6.C1306f0.m3791t(r0, r1, r2, r3, r4, r5)
        L424:
            r13 = r33
            r1 = r6
            r4 = r8
            r15 = r9
            r2 = r11
            r14 = r12
            r6 = r19
            r3 = r23
            r9 = r27
            r12 = r31
            r11 = r10
            goto L19
        L436:
            r19 = r6
            r26 = r7
            r27 = r9
            r12 = r14
            r9 = r15
            r3 = 0
        L43f:
            r2 = 1048575(0xfffff, float:1.469367E-39)
            if (r6 == r2) goto L44a
            long r5 = (long) r6
            r2 = r27
            r2.putInt(r12, r5, r7)
        L44a:
            int r2 = r9.f11361j
        L44c:
            int r5 = r9.f11362k
            if (r2 >= r5) goto L45a
            int[] r5 = r9.f11360i
            r5 = r5[r2]
            r9.m6452p(r12, r5, r3)
            int r2 = r2 + 1
            goto L44c
        L45a:
            r2 = r33
            if (r1 != 0) goto L466
            if (r0 != r2) goto L461
            goto L46a
        L461:
            h7.f r0 = p124h7.C2611f.m6686f()
            throw r0
        L466:
            if (r0 > r2) goto L46b
            if (r4 != r1) goto L46b
        L46a:
            return r0
        L46b:
            h7.f r0 = p124h7.C2611f.m6686f()
            throw r0
    }

    /* renamed from: K */
    public final int m6430K(T r15) {
            r14 = this;
            sun.misc.Unsafe r0 = p124h7.C2521a0.f11351p
            r1 = 1048575(0xfffff, float:1.469367E-39)
            r2 = 0
            r3 = 0
            r4 = 1048575(0xfffff, float:1.469367E-39)
            r5 = 0
        Lb:
            int[] r6 = r14.f11352a
            int r6 = r6.length
            if (r2 >= r6) goto L40f
            int r6 = r14.m6449l(r2)
            int[] r7 = r14.f11352a
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
            boolean r1 = r14.m6427A(r15, r8, r2)
            if (r1 == 0) goto L408
            java.lang.Object r1 = r0.getObject(r15, r12)
            h7.x r1 = (p124h7.InterfaceC2935x) r1
            h7.i0 r6 = r14.m6451o(r2)
            int r1 = p124h7.AbstractC2682ig.m6836B(r8, r1, r6)
            goto L407
        L55:
            boolean r6 = r14.m6427A(r15, r8, r2)
            if (r6 == 0) goto L408
            long r6 = m6425m(r15, r12)
            int r8 = r8 << 3
            int r8 = p124h7.AbstractC2682ig.m6841h(r8)
            long r9 = r6 + r6
            long r6 = r6 >> r1
            long r6 = r6 ^ r9
            int r1 = p124h7.AbstractC2682ig.m6842i(r6)
            goto L324
        L6f:
            boolean r1 = r14.m6427A(r15, r8, r2)
            if (r1 == 0) goto L408
            int r1 = m6424M(r15, r12)
            int r6 = r8 << 3
            int r6 = p124h7.AbstractC2682ig.m6841h(r6)
            int r7 = r1 + r1
            int r1 = r1 >> 31
            r1 = r1 ^ r7
            goto Lad
        L85:
            boolean r1 = r14.m6427A(r15, r8, r2)
            if (r1 == 0) goto L408
            goto L165
        L8d:
            boolean r1 = r14.m6427A(r15, r8, r2)
            if (r1 == 0) goto L408
            goto L157
        L95:
            boolean r1 = r14.m6427A(r15, r8, r2)
            if (r1 == 0) goto L408
            goto L124
        L9d:
            boolean r1 = r14.m6427A(r15, r8, r2)
            if (r1 == 0) goto L408
            int r1 = m6424M(r15, r12)
            int r6 = r8 << 3
            int r6 = p124h7.AbstractC2682ig.m6841h(r6)
        Lad:
            int r1 = p124h7.AbstractC2682ig.m6841h(r1)
            goto L3d3
        Lb3:
            boolean r1 = r14.m6427A(r15, r8, r2)
            if (r1 == 0) goto L408
            java.lang.Object r1 = r0.getObject(r15, r12)
            goto Le0
        Lbe:
            boolean r1 = r14.m6427A(r15, r8, r2)
            if (r1 == 0) goto L408
            java.lang.Object r1 = r0.getObject(r15, r12)
            h7.i0 r6 = r14.m6451o(r2)
            int r1 = p124h7.C2702k0.m6896J(r8, r1, r6)
            goto L407
        Ld2:
            boolean r1 = r14.m6427A(r15, r8, r2)
            if (r1 == 0) goto L408
            java.lang.Object r1 = r0.getObject(r15, r12)
            boolean r6 = r1 instanceof p124h7.AbstractC2574cg
            if (r6 == 0) goto Lf4
        Le0:
            h7.cg r1 = (p124h7.AbstractC2574cg) r1
            int r6 = r8 << 3
            int r6 = p124h7.AbstractC2682ig.m6841h(r6)
            int r1 = r1.mo6474h()
            int r7 = p124h7.AbstractC2682ig.m6841h(r1)
            int r7 = r7 + r1
            int r7 = r7 + r6
            goto L251
        Lf4:
            java.lang.String r1 = (java.lang.String) r1
            int r6 = r8 << 3
            int r6 = p124h7.AbstractC2682ig.m6841h(r6)
            int r1 = p124h7.AbstractC2682ig.m6839f(r1)
            goto L3d3
        L102:
            boolean r1 = r14.m6427A(r15, r8, r2)
            if (r1 == 0) goto L408
            int r1 = r8 << 3
            int r1 = p124h7.AbstractC2682ig.m6841h(r1)
            goto L3b5
        L110:
            boolean r1 = r14.m6427A(r15, r8, r2)
            if (r1 == 0) goto L408
            goto L157
        L117:
            boolean r1 = r14.m6427A(r15, r8, r2)
            if (r1 == 0) goto L408
            goto L165
        L11e:
            boolean r1 = r14.m6427A(r15, r8, r2)
            if (r1 == 0) goto L408
        L124:
            int r1 = m6424M(r15, r12)
            int r6 = r8 << 3
            int r6 = p124h7.AbstractC2682ig.m6841h(r6)
            int r1 = p124h7.AbstractC2682ig.m6837C(r1)
            goto L3d3
        L134:
            boolean r1 = r14.m6427A(r15, r8, r2)
            if (r1 == 0) goto L408
            goto L141
        L13b:
            boolean r1 = r14.m6427A(r15, r8, r2)
            if (r1 == 0) goto L408
        L141:
            long r6 = m6425m(r15, r12)
            int r1 = r8 << 3
            int r1 = p124h7.AbstractC2682ig.m6841h(r1)
            int r6 = p124h7.AbstractC2682ig.m6842i(r6)
            goto L3ec
        L151:
            boolean r1 = r14.m6427A(r15, r8, r2)
            if (r1 == 0) goto L408
        L157:
            int r1 = r8 << 3
            int r1 = p124h7.AbstractC2682ig.m6841h(r1)
            goto L3f8
        L15f:
            boolean r1 = r14.m6427A(r15, r8, r2)
            if (r1 == 0) goto L408
        L165:
            int r1 = r8 << 3
            int r1 = p124h7.AbstractC2682ig.m6841h(r1)
            goto L405
        L16d:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.lang.Object r6 = r14.m6453q(r2)
            p124h7.C2863t.m7143a(r8, r1, r6)
            goto L408
        L17a:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            h7.i0 r6 = r14.m6451o(r2)
            int r1 = p124h7.C2702k0.m6891E(r8, r1, r6)
            goto L407
        L18a:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = p124h7.C2702k0.m6901O(r1)
            if (r1 <= 0) goto L408
            goto L247
        L198:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = p124h7.C2702k0.m6899M(r1)
            if (r1 <= 0) goto L408
            goto L247
        L1a6:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = p124h7.C2702k0.m6890D(r1)
            if (r1 <= 0) goto L408
            goto L247
        L1b4:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = p124h7.C2702k0.m6888B(r1)
            if (r1 <= 0) goto L408
            goto L247
        L1c2:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = p124h7.C2702k0.m6932z(r1)
            if (r1 <= 0) goto L408
            goto L247
        L1d0:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = p124h7.C2702k0.m6904R(r1)
            if (r1 <= 0) goto L408
            goto L247
        L1de:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            java.lang.Class<?> r6 = p124h7.C2702k0.f11686a
            int r1 = r1.size()
            if (r1 <= 0) goto L408
            goto L247
        L1ed:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = p124h7.C2702k0.m6888B(r1)
            if (r1 <= 0) goto L408
            goto L247
        L1fa:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = p124h7.C2702k0.m6890D(r1)
            if (r1 <= 0) goto L408
            goto L247
        L207:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = p124h7.C2702k0.m6893G(r1)
            if (r1 <= 0) goto L408
            goto L247
        L214:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = p124h7.C2702k0.m6906T(r1)
            if (r1 <= 0) goto L408
            goto L247
        L221:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = p124h7.C2702k0.m6895I(r1)
            if (r1 <= 0) goto L408
            goto L247
        L22e:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = p124h7.C2702k0.m6888B(r1)
            if (r1 <= 0) goto L408
            goto L247
        L23b:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = p124h7.C2702k0.m6890D(r1)
            if (r1 <= 0) goto L408
        L247:
            int r6 = p124h7.AbstractC2682ig.m6840g(r8)
            int r7 = p124h7.AbstractC2682ig.m6841h(r1)
            int r7 = r7 + r6
            int r7 = r7 + r1
        L251:
            int r3 = r3 + r7
            goto L408
        L254:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            r6 = 0
            int r1 = p124h7.C2702k0.m6900N(r8, r1, r6)
            goto L407
        L261:
            r1 = 0
            java.lang.Object r6 = r0.getObject(r15, r12)
            java.util.List r6 = (java.util.List) r6
            int r1 = p124h7.C2702k0.m6898L(r8, r6, r1)
            goto L407
        L26e:
            r1 = 0
            java.lang.Object r6 = r0.getObject(r15, r12)
            java.util.List r6 = (java.util.List) r6
            int r1 = p124h7.C2702k0.m6931y(r8, r6, r1)
            goto L407
        L27b:
            r1 = 0
            java.lang.Object r6 = r0.getObject(r15, r12)
            java.util.List r6 = (java.util.List) r6
            int r1 = p124h7.C2702k0.m6903Q(r8, r6, r1)
            goto L407
        L288:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = p124h7.C2702k0.m6930x(r8, r1)
            goto L407
        L294:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            h7.i0 r6 = r14.m6451o(r2)
            int r1 = p124h7.C2702k0.m6897K(r8, r1, r6)
            goto L407
        L2a4:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = p124h7.C2702k0.m6902P(r8, r1)
            goto L407
        L2b0:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = p124h7.C2702k0.m6927u(r8, r1)
            goto L407
        L2bc:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            r6 = 0
            int r1 = p124h7.C2702k0.m6892F(r8, r1, r6)
            goto L407
        L2c9:
            r1 = 0
            java.lang.Object r6 = r0.getObject(r15, r12)
            java.util.List r6 = (java.util.List) r6
            int r1 = p124h7.C2702k0.m6905S(r8, r6, r1)
            goto L407
        L2d6:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = p124h7.C2702k0.m6894H(r8, r1)
            goto L407
        L2e2:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = p124h7.C2702k0.m6887A(r8, r1)
            goto L407
        L2ee:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = p124h7.C2702k0.m6889C(r8, r1)
            goto L407
        L2fa:
            r1 = r5 & r7
            if (r1 == 0) goto L408
            java.lang.Object r1 = r0.getObject(r15, r12)
            h7.x r1 = (p124h7.InterfaceC2935x) r1
            h7.i0 r6 = r14.m6451o(r2)
            int r1 = p124h7.AbstractC2682ig.m6836B(r8, r1, r6)
            goto L407
        L30e:
            r6 = r7 & r5
            if (r6 == 0) goto L408
            long r6 = r0.getLong(r15, r12)
            int r8 = r8 << 3
            int r8 = p124h7.AbstractC2682ig.m6841h(r8)
            long r9 = r6 + r6
            long r6 = r6 >> r1
            long r6 = r6 ^ r9
            int r1 = p124h7.AbstractC2682ig.m6842i(r6)
        L324:
            int r1 = r1 + r8
            goto L407
        L327:
            r1 = r5 & r7
            if (r1 == 0) goto L408
            int r1 = r0.getInt(r15, r12)
            int r6 = r8 << 3
            int r6 = p124h7.AbstractC2682ig.m6841h(r6)
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
            int r6 = p124h7.AbstractC2682ig.m6841h(r6)
        L35b:
            int r1 = p124h7.AbstractC2682ig.m6841h(r1)
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
            h7.i0 r6 = r14.m6451o(r2)
            int r1 = p124h7.C2702k0.m6896J(r8, r1, r6)
            goto L407
        L37c:
            r1 = r5 & r7
            if (r1 == 0) goto L408
            java.lang.Object r1 = r0.getObject(r15, r12)
            boolean r6 = r1 instanceof p124h7.AbstractC2574cg
            if (r6 == 0) goto L39e
        L388:
            h7.cg r1 = (p124h7.AbstractC2574cg) r1
            int r6 = r8 << 3
            int r6 = p124h7.AbstractC2682ig.m6841h(r6)
            int r1 = r1.mo6474h()
            int r7 = p124h7.AbstractC2682ig.m6841h(r1)
            int r7 = r7 + r1
            int r7 = r7 + r6
            int r7 = r7 + r3
            r3 = r7
            goto L408
        L39e:
            java.lang.String r1 = (java.lang.String) r1
            int r6 = r8 << 3
            int r6 = p124h7.AbstractC2682ig.m6841h(r6)
            int r1 = p124h7.AbstractC2682ig.m6839f(r1)
            goto L3d3
        L3ab:
            r1 = r5 & r7
            if (r1 == 0) goto L408
            int r1 = r8 << 3
            int r1 = p124h7.AbstractC2682ig.m6841h(r1)
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
            int r6 = p124h7.AbstractC2682ig.m6841h(r6)
            int r1 = p124h7.AbstractC2682ig.m6837C(r1)
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
            int r1 = p124h7.AbstractC2682ig.m6841h(r1)
            int r6 = p124h7.AbstractC2682ig.m6842i(r6)
        L3ec:
            int r1 = r1 + r6
            goto L407
        L3ee:
            r1 = r5 & r7
            if (r1 == 0) goto L408
        L3f2:
            int r1 = r8 << 3
            int r1 = p124h7.AbstractC2682ig.m6841h(r1)
        L3f8:
            int r1 = r1 + 4
            goto L407
        L3fb:
            r1 = r5 & r7
            if (r1 == 0) goto L408
        L3ff:
            int r1 = r8 << 3
            int r1 = p124h7.AbstractC2682ig.m6841h(r1)
        L405:
            int r1 = r1 + 8
        L407:
            int r3 = r3 + r1
        L408:
            int r2 = r2 + 3
            r1 = 1048575(0xfffff, float:1.469367E-39)
            goto Lb
        L40f:
            h7.v0<?, ?> r0 = r14.f11364m
            java.lang.Object r1 = r0.mo7183d(r15)
            int r0 = r0.mo7180a(r1)
            int r0 = r0 + r3
            boolean r1 = r14.f11357f
            if (r1 != 0) goto L41f
            return r0
        L41f:
            h7.ng<?> r0 = r14.f11365n
            r0.mo7003a(r15)
            r15 = 0
            throw r15
    }

    /* renamed from: L */
    public final int m6431L(T r11) {
            r10 = this;
            sun.misc.Unsafe r0 = p124h7.C2521a0.f11351p
            r1 = 0
            r2 = 0
            r3 = 0
        L5:
            int[] r4 = r10.f11352a
            int r4 = r4.length
            if (r2 >= r4) goto L399
            int r4 = r10.m6449l(r2)
            int r5 = r4 >>> 20
            r5 = r5 & 255(0xff, float:3.57E-43)
            int[] r6 = r10.f11352a
            r7 = r6[r2]
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r4 & r8
            long r8 = (long) r4
            h7.sg r4 = p124h7.EnumC2862sg.f11912Z
            int r4 = r4.f11916Y
            if (r5 < r4) goto L2b
            h7.sg r4 = p124h7.EnumC2862sg.f11913a0
            int r4 = r4.f11916Y
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
            boolean r4 = r10.m6427A(r11, r7, r2)
            if (r4 == 0) goto L395
            goto L268
        L3a:
            boolean r5 = r10.m6427A(r11, r7, r2)
            if (r5 == 0) goto L395
            long r5 = m6425m(r11, r8)
            goto L282
        L46:
            boolean r4 = r10.m6427A(r11, r7, r2)
            if (r4 == 0) goto L395
            int r4 = m6424M(r11, r8)
            goto L29e
        L52:
            boolean r4 = r10.m6427A(r11, r7, r2)
            if (r4 == 0) goto L395
            goto L38c
        L5a:
            boolean r4 = r10.m6427A(r11, r7, r2)
            if (r4 == 0) goto L395
            goto L37d
        L62:
            boolean r4 = r10.m6427A(r11, r7, r2)
            if (r4 == 0) goto L395
            goto Lb3
        L69:
            boolean r4 = r10.m6427A(r11, r7, r2)
            if (r4 == 0) goto L395
            int r4 = m6424M(r11, r8)
            goto L2cc
        L75:
            boolean r4 = r10.m6427A(r11, r7, r2)
            if (r4 == 0) goto L395
            goto L2de
        L7d:
            boolean r4 = r10.m6427A(r11, r7, r2)
            if (r4 == 0) goto L395
            goto L2e9
        L85:
            boolean r4 = r10.m6427A(r11, r7, r2)
            if (r4 == 0) goto L395
            java.lang.Object r4 = p124h7.C2577d1.m6550j(r11, r8)
            boolean r5 = r4 instanceof p124h7.AbstractC2574cg
            if (r5 == 0) goto L31a
            goto L305
        L95:
            boolean r4 = r10.m6427A(r11, r7, r2)
            if (r4 == 0) goto L395
            goto L32d
        L9d:
            boolean r4 = r10.m6427A(r11, r7, r2)
            if (r4 == 0) goto L395
            goto L37d
        La5:
            boolean r4 = r10.m6427A(r11, r7, r2)
            if (r4 == 0) goto L395
            goto L38c
        Lad:
            boolean r4 = r10.m6427A(r11, r7, r2)
            if (r4 == 0) goto L395
        Lb3:
            int r4 = m6424M(r11, r8)
            goto L34e
        Lb9:
            boolean r4 = r10.m6427A(r11, r7, r2)
            if (r4 == 0) goto L395
            goto Lc6
        Lc0:
            boolean r4 = r10.m6427A(r11, r7, r2)
            if (r4 == 0) goto L395
        Lc6:
            long r4 = m6425m(r11, r8)
            goto L36b
        Lcc:
            boolean r4 = r10.m6427A(r11, r7, r2)
            if (r4 == 0) goto L395
            goto L37d
        Ld4:
            boolean r4 = r10.m6427A(r11, r7, r2)
            if (r4 == 0) goto L395
            goto L38c
        Ldc:
            java.lang.Object r4 = p124h7.C2577d1.m6550j(r11, r8)
            java.lang.Object r5 = r10.m6453q(r2)
            p124h7.C2863t.m7143a(r7, r4, r5)
            goto L395
        Le9:
            java.lang.Object r4 = p124h7.C2577d1.m6550j(r11, r8)
            java.util.List r4 = (java.util.List) r4
            h7.i0 r5 = r10.m6451o(r2)
            int r4 = p124h7.C2702k0.m6891E(r7, r4, r5)
            goto L394
        Lf9:
            java.lang.Object r4 = r0.getObject(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p124h7.C2702k0.m6901O(r4)
            if (r4 <= 0) goto L395
            goto L1b6
        L107:
            java.lang.Object r4 = r0.getObject(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p124h7.C2702k0.m6899M(r4)
            if (r4 <= 0) goto L395
            goto L1b6
        L115:
            java.lang.Object r4 = r0.getObject(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p124h7.C2702k0.m6890D(r4)
            if (r4 <= 0) goto L395
            goto L1b6
        L123:
            java.lang.Object r4 = r0.getObject(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p124h7.C2702k0.m6888B(r4)
            if (r4 <= 0) goto L395
            goto L1b6
        L131:
            java.lang.Object r4 = r0.getObject(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p124h7.C2702k0.m6932z(r4)
            if (r4 <= 0) goto L395
            goto L1b6
        L13f:
            java.lang.Object r4 = r0.getObject(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p124h7.C2702k0.m6904R(r4)
            if (r4 <= 0) goto L395
            goto L1b6
        L14d:
            java.lang.Object r4 = r0.getObject(r11, r8)
            java.util.List r4 = (java.util.List) r4
            java.lang.Class<?> r5 = p124h7.C2702k0.f11686a
            int r4 = r4.size()
            if (r4 <= 0) goto L395
            goto L1b6
        L15c:
            java.lang.Object r4 = r0.getObject(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p124h7.C2702k0.m6888B(r4)
            if (r4 <= 0) goto L395
            goto L1b6
        L169:
            java.lang.Object r4 = r0.getObject(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p124h7.C2702k0.m6890D(r4)
            if (r4 <= 0) goto L395
            goto L1b6
        L176:
            java.lang.Object r4 = r0.getObject(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p124h7.C2702k0.m6893G(r4)
            if (r4 <= 0) goto L395
            goto L1b6
        L183:
            java.lang.Object r4 = r0.getObject(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p124h7.C2702k0.m6906T(r4)
            if (r4 <= 0) goto L395
            goto L1b6
        L190:
            java.lang.Object r4 = r0.getObject(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p124h7.C2702k0.m6895I(r4)
            if (r4 <= 0) goto L395
            goto L1b6
        L19d:
            java.lang.Object r4 = r0.getObject(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p124h7.C2702k0.m6888B(r4)
            if (r4 <= 0) goto L395
            goto L1b6
        L1aa:
            java.lang.Object r4 = r0.getObject(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p124h7.C2702k0.m6890D(r4)
            if (r4 <= 0) goto L395
        L1b6:
            int r5 = p124h7.AbstractC2682ig.m6840g(r7)
            int r6 = p124h7.AbstractC2682ig.m6841h(r4)
            int r6 = r6 + r5
            int r6 = r6 + r4
            goto L317
        L1c2:
            java.lang.Object r4 = p124h7.C2577d1.m6550j(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p124h7.C2702k0.m6900N(r7, r4, r1)
            goto L394
        L1ce:
            java.lang.Object r4 = p124h7.C2577d1.m6550j(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p124h7.C2702k0.m6898L(r7, r4, r1)
            goto L394
        L1da:
            java.lang.Object r4 = p124h7.C2577d1.m6550j(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p124h7.C2702k0.m6931y(r7, r4, r1)
            goto L394
        L1e6:
            java.lang.Object r4 = p124h7.C2577d1.m6550j(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p124h7.C2702k0.m6903Q(r7, r4, r1)
            goto L394
        L1f2:
            java.lang.Object r4 = p124h7.C2577d1.m6550j(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p124h7.C2702k0.m6930x(r7, r4)
            goto L394
        L1fe:
            java.lang.Object r4 = p124h7.C2577d1.m6550j(r11, r8)
            java.util.List r4 = (java.util.List) r4
            h7.i0 r5 = r10.m6451o(r2)
            int r4 = p124h7.C2702k0.m6897K(r7, r4, r5)
            goto L394
        L20e:
            java.lang.Object r4 = p124h7.C2577d1.m6550j(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p124h7.C2702k0.m6902P(r7, r4)
            goto L394
        L21a:
            java.lang.Object r4 = p124h7.C2577d1.m6550j(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p124h7.C2702k0.m6927u(r7, r4)
            goto L394
        L226:
            java.lang.Object r4 = p124h7.C2577d1.m6550j(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p124h7.C2702k0.m6892F(r7, r4, r1)
            goto L394
        L232:
            java.lang.Object r4 = p124h7.C2577d1.m6550j(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p124h7.C2702k0.m6905S(r7, r4, r1)
            goto L394
        L23e:
            java.lang.Object r4 = p124h7.C2577d1.m6550j(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p124h7.C2702k0.m6894H(r7, r4)
            goto L394
        L24a:
            java.lang.Object r4 = p124h7.C2577d1.m6550j(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p124h7.C2702k0.m6887A(r7, r4)
            goto L394
        L256:
            java.lang.Object r4 = p124h7.C2577d1.m6550j(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p124h7.C2702k0.m6889C(r7, r4)
            goto L394
        L262:
            boolean r4 = r10.m6460y(r11, r2)
            if (r4 == 0) goto L395
        L268:
            java.lang.Object r4 = p124h7.C2577d1.m6550j(r11, r8)
            h7.x r4 = (p124h7.InterfaceC2935x) r4
            h7.i0 r5 = r10.m6451o(r2)
            int r4 = p124h7.AbstractC2682ig.m6836B(r7, r4, r5)
            goto L394
        L278:
            boolean r5 = r10.m6460y(r11, r2)
            if (r5 == 0) goto L395
            long r5 = p124h7.C2577d1.m6548h(r11, r8)
        L282:
            int r7 = r7 << 3
            int r7 = p124h7.AbstractC2682ig.m6841h(r7)
            long r8 = r5 + r5
            long r4 = r5 >> r4
            long r4 = r4 ^ r8
            int r4 = p124h7.AbstractC2682ig.m6842i(r4)
            int r4 = r4 + r7
            goto L394
        L294:
            boolean r4 = r10.m6460y(r11, r2)
            if (r4 == 0) goto L395
            int r4 = p124h7.C2577d1.m6547g(r11, r8)
        L29e:
            int r5 = r7 << 3
            int r5 = p124h7.AbstractC2682ig.m6841h(r5)
            int r6 = r4 + r4
            int r4 = r4 >> 31
            r4 = r4 ^ r6
            goto L2d2
        L2aa:
            boolean r4 = r10.m6460y(r11, r2)
            if (r4 == 0) goto L395
            goto L38c
        L2b2:
            boolean r4 = r10.m6460y(r11, r2)
            if (r4 == 0) goto L395
            goto L37d
        L2ba:
            boolean r4 = r10.m6460y(r11, r2)
            if (r4 == 0) goto L395
            goto L34a
        L2c2:
            boolean r4 = r10.m6460y(r11, r2)
            if (r4 == 0) goto L395
            int r4 = p124h7.C2577d1.m6547g(r11, r8)
        L2cc:
            int r5 = r7 << 3
            int r5 = p124h7.AbstractC2682ig.m6841h(r5)
        L2d2:
            int r4 = p124h7.AbstractC2682ig.m6841h(r4)
            goto L358
        L2d8:
            boolean r4 = r10.m6460y(r11, r2)
            if (r4 == 0) goto L395
        L2de:
            java.lang.Object r4 = p124h7.C2577d1.m6550j(r11, r8)
            goto L305
        L2e3:
            boolean r4 = r10.m6460y(r11, r2)
            if (r4 == 0) goto L395
        L2e9:
            java.lang.Object r4 = p124h7.C2577d1.m6550j(r11, r8)
            h7.i0 r5 = r10.m6451o(r2)
            int r4 = p124h7.C2702k0.m6896J(r7, r4, r5)
            goto L394
        L2f7:
            boolean r4 = r10.m6460y(r11, r2)
            if (r4 == 0) goto L395
            java.lang.Object r4 = p124h7.C2577d1.m6550j(r11, r8)
            boolean r5 = r4 instanceof p124h7.AbstractC2574cg
            if (r5 == 0) goto L31a
        L305:
            h7.cg r4 = (p124h7.AbstractC2574cg) r4
            int r5 = r7 << 3
            int r5 = p124h7.AbstractC2682ig.m6841h(r5)
            int r4 = r4.mo6474h()
            int r6 = p124h7.AbstractC2682ig.m6841h(r4)
            int r6 = r6 + r4
            int r6 = r6 + r5
        L317:
            int r3 = r3 + r6
            goto L395
        L31a:
            java.lang.String r4 = (java.lang.String) r4
            int r5 = r7 << 3
            int r5 = p124h7.AbstractC2682ig.m6841h(r5)
            int r4 = p124h7.AbstractC2682ig.m6839f(r4)
            goto L358
        L327:
            boolean r4 = r10.m6460y(r11, r2)
            if (r4 == 0) goto L395
        L32d:
            int r4 = r7 << 3
            int r4 = p124h7.AbstractC2682ig.m6841h(r4)
            int r4 = r4 + 1
            goto L394
        L336:
            boolean r4 = r10.m6460y(r11, r2)
            if (r4 == 0) goto L395
            goto L37d
        L33d:
            boolean r4 = r10.m6460y(r11, r2)
            if (r4 == 0) goto L395
            goto L38c
        L344:
            boolean r4 = r10.m6460y(r11, r2)
            if (r4 == 0) goto L395
        L34a:
            int r4 = p124h7.C2577d1.m6547g(r11, r8)
        L34e:
            int r5 = r7 << 3
            int r5 = p124h7.AbstractC2682ig.m6841h(r5)
            int r4 = p124h7.AbstractC2682ig.m6837C(r4)
        L358:
            int r4 = r4 + r5
            goto L394
        L35a:
            boolean r4 = r10.m6460y(r11, r2)
            if (r4 == 0) goto L395
            goto L367
        L361:
            boolean r4 = r10.m6460y(r11, r2)
            if (r4 == 0) goto L395
        L367:
            long r4 = p124h7.C2577d1.m6548h(r11, r8)
        L36b:
            int r6 = r7 << 3
            int r6 = p124h7.AbstractC2682ig.m6841h(r6)
            int r4 = p124h7.AbstractC2682ig.m6842i(r4)
            int r4 = r4 + r6
            goto L394
        L377:
            boolean r4 = r10.m6460y(r11, r2)
            if (r4 == 0) goto L395
        L37d:
            int r4 = r7 << 3
            int r4 = p124h7.AbstractC2682ig.m6841h(r4)
            int r4 = r4 + 4
            goto L394
        L386:
            boolean r4 = r10.m6460y(r11, r2)
            if (r4 == 0) goto L395
        L38c:
            int r4 = r7 << 3
            int r4 = p124h7.AbstractC2682ig.m6841h(r4)
            int r4 = r4 + 8
        L394:
            int r3 = r3 + r4
        L395:
            int r2 = r2 + 3
            goto L5
        L399:
            h7.v0<?, ?> r0 = r10.f11364m
            java.lang.Object r11 = r0.mo7183d(r11)
            int r11 = r0.mo7180a(r11)
            int r11 = r11 + r3
            return r11
    }

    /* renamed from: N */
    public final int m6432N(java.lang.Object r1, byte[] r2, int r3, int r4, int r5, long r6) {
            r0 = this;
            sun.misc.Unsafe r2 = p124h7.C2521a0.f11351p
            java.lang.Object r3 = r0.m6453q(r5)
            java.lang.Object r4 = r2.getObject(r1, r6)
            r5 = r4
            h7.s r5 = (p124h7.C2845s) r5
            boolean r5 = r5.f11894Y
            r5 = r5 ^ 1
            if (r5 != 0) goto L14
            goto L20
        L14:
            h7.s r5 = p124h7.C2845s.f11893Z
            h7.s r5 = r5.m7111a()
            p124h7.C2863t.m7144b(r5, r4)
            r2.putObject(r1, r6, r5)
        L20:
            h7.r r3 = (p124h7.C2827r) r3
            r1 = 0
            throw r1
    }

    /* renamed from: O */
    public final int m6433O(T r17, byte[] r18, int r19, int r20, int r21, int r22, int r23, int r24, int r25, long r26, int r28, p124h7.C2915vf r29) {
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
            sun.misc.Unsafe r12 = p124h7.C2521a0.f11351p
            int[] r7 = r0.f11352a
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
            h7.i0 r5 = r0.m6451o(r6)
            r2 = r2 & (-8)
            r6 = r2 | 4
            r2 = r5
            r3 = r18
            r4 = r19
            r5 = r20
            r7 = r29
            int r2 = p052d6.C1306f0.m3781j(r2, r3, r4, r5, r6, r7)
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
            int r2 = p052d6.C1306f0.m3795x(r3, r4, r11)
            long r3 = r11.f11969b
            long r3 = p124h7.C2592dg.m6619o(r3)
            goto L15a
        L62:
            if (r5 == 0) goto L66
            goto L196
        L66:
            int r2 = p052d6.C1306f0.m3792u(r3, r4, r11)
            int r3 = r11.f11968a
            int r3 = p124h7.C2592dg.m6618n(r3)
            goto L14c
        L72:
            if (r5 != 0) goto L196
            int r3 = p052d6.C1306f0.m3792u(r3, r4, r11)
            int r4 = r11.f11968a
            h7.b r5 = r0.m6450n(r6)
            if (r5 == 0) goto L94
            boolean r5 = r5.m6476a()
            if (r5 == 0) goto L87
            goto L94
        L87:
            h7.x0 r1 = m6419F(r17)
            long r4 = (long) r4
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r1.m7248c(r2, r4)
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
            int r2 = p052d6.C1306f0.m3773b(r3, r4, r11)
            java.lang.Object r3 = r11.f11970c
            goto L15e
        Lad:
            if (r5 != r7) goto L196
            h7.i0 r2 = r0.m6451o(r6)
            r5 = r20
            int r2 = p052d6.C1306f0.m3783l(r2, r3, r4, r5, r11)
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
            java.lang.Object r3 = p124h7.C2575d.m6540c(r15, r3)
            goto Ldb
        Lcf:
            if (r5 != r7) goto L196
            int r2 = p052d6.C1306f0.m3792u(r3, r4, r11)
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
            boolean r5 = p124h7.C2631g1.m6746e(r3, r2, r5)
            if (r5 == 0) goto Lee
            goto Lf3
        Lee:
            h7.f r1 = p124h7.C2611f.m6683c()
            throw r1
        Lf3:
            java.lang.String r5 = new java.lang.String
            java.nio.charset.Charset r6 = p124h7.C2575d.f11429a
            r5.<init>(r3, r2, r4, r6)
            r12.putObject(r1, r9, r5)
            int r2 = r2 + r4
        Lfe:
            r12.putInt(r1, r13, r8)
            goto L197
        L103:
            if (r5 != 0) goto L196
            int r2 = p052d6.C1306f0.m3795x(r3, r4, r11)
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
            int r2 = p052d6.C1306f0.m3779h(r18, r19)
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
            long r2 = p052d6.C1306f0.m3796y(r18, r19)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r12.putObject(r1, r9, r2)
            r12.putInt(r1, r13, r8)
            int r1 = r4 + 8
            return r1
        L143:
            if (r5 == 0) goto L146
            goto L196
        L146:
            int r2 = p052d6.C1306f0.m3792u(r3, r4, r11)
            int r3 = r11.f11968a
        L14c:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L15e
        L151:
            if (r5 == 0) goto L154
            goto L196
        L154:
            int r2 = p052d6.C1306f0.m3795x(r3, r4, r11)
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
            int r2 = p052d6.C1306f0.m3779h(r18, r19)
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
            long r2 = p052d6.C1306f0.m3796y(r18, r19)
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

    /* renamed from: P */
    public final int m6434P(T r33, byte[] r34, int r35, int r36, p124h7.C2915vf r37) {
            r32 = this;
            sun.misc.Unsafe r6 = p124h7.C2521a0.f11351p
            r7 = -1
            r13 = r32
            r14 = r33
            r11 = r34
            r0 = r35
            r10 = r36
            r12 = r37
            r1 = 0
            r2 = 1048575(0xfffff, float:1.469367E-39)
            r3 = -1
            r4 = 0
        L15:
            if (r0 >= r10) goto L2c1
            int r5 = r0 + 1
            r0 = r11[r0]
            if (r0 >= 0) goto L23
            int r5 = p052d6.C1306f0.m3793v(r0, r11, r5, r12)
            int r0 = r12.f11968a
        L23:
            r15 = r5
            int r5 = r0 >>> 3
            r9 = r0 & 7
            if (r5 <= r3) goto L3b
            int r4 = r4 / 3
            int r3 = r13.f11354c
            if (r5 < r3) goto L39
            int r3 = r13.f11355d
            if (r5 > r3) goto L39
            int r3 = r13.m6448k(r5, r4)
            goto L3f
        L39:
            r4 = -1
            goto L40
        L3b:
            int r3 = r13.m6436R(r5)
        L3f:
            r4 = r3
        L40:
            if (r4 != r7) goto L4b
            r30 = r0
            r31 = r5
            r17 = r15
            r4 = 0
            goto L2a2
        L4b:
            int[] r3 = r13.f11352a
            int r16 = r4 + 1
            r7 = r3[r16]
            int r8 = r7 >>> 20
            r8 = r8 & 255(0xff, float:3.57E-43)
            r35 = r5
            r16 = 1048575(0xfffff, float:1.469367E-39)
            r5 = r7 & r16
            r22 = r10
            r23 = r11
            long r10 = (long) r5
            r5 = 17
            r30 = r0
            if (r8 > r5) goto L1ef
            int r5 = r4 + 2
            r3 = r3[r5]
            int r5 = r3 >>> 20
            r0 = 1
            int r17 = r0 << r5
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r3 = r3 & r5
            r27 = r10
            if (r3 == r2) goto L88
            if (r2 == r5) goto L7e
            long r10 = (long) r2
            r6.putInt(r14, r10, r1)
        L7e:
            if (r3 == r5) goto L85
            long r1 = (long) r3
            int r1 = r6.getInt(r14, r1)
        L85:
            r10 = r1
            r11 = r3
            goto L8a
        L88:
            r10 = r1
            r11 = r2
        L8a:
            r1 = 5
            switch(r8) {
                case 0: goto L1c9;
                case 1: goto L1b0;
                case 2: goto L196;
                case 3: goto L196;
                case 4: goto L182;
                case 5: goto L167;
                case 6: goto L14f;
                case 7: goto L12a;
                case 8: goto L10b;
                case 9: goto Le8;
                case 10: goto Ld8;
                case 11: goto L182;
                case 12: goto Lc9;
                case 13: goto L14f;
                case 14: goto L167;
                case 15: goto Lb4;
                case 16: goto L93;
                default: goto L8e;
            }
        L8e:
            r31 = r35
        L90:
            r7 = r4
            goto L1ea
        L93:
            if (r9 != 0) goto L8e
            r8 = r23
            int r7 = p052d6.C1306f0.m3795x(r8, r15, r12)
            long r0 = r12.f11969b
            long r15 = p124h7.C2592dg.m6619o(r0)
            r0 = r6
            r1 = r33
            r2 = r27
            r31 = r35
            r9 = r4
            r4 = r15
            r0.putLong(r1, r2, r4)
            r0 = r10 | r17
            r1 = r0
            r15 = r7
            r7 = r9
            goto L1e2
        Lb4:
            r31 = r35
            r8 = r23
            if (r9 != 0) goto L90
            int r0 = p052d6.C1306f0.m3792u(r8, r15, r12)
            int r1 = r12.f11968a
            int r1 = p124h7.C2592dg.m6618n(r1)
            r7 = r4
            r2 = r27
            goto L191
        Lc9:
            r31 = r35
            r8 = r23
            if (r9 != 0) goto L90
            int r0 = p052d6.C1306f0.m3792u(r8, r15, r12)
            r7 = r4
            r2 = r27
            goto L18f
        Ld8:
            r31 = r35
            r8 = r23
            r0 = 2
            if (r9 != r0) goto L90
            int r0 = p052d6.C1306f0.m3773b(r8, r15, r12)
            r5 = r22
            r2 = r27
            goto L101
        Le8:
            r31 = r35
            r8 = r23
            r0 = 2
            if (r9 != r0) goto L90
            h7.i0 r0 = r13.m6451o(r4)
            r5 = r22
            int r0 = p052d6.C1306f0.m3783l(r0, r8, r15, r5, r12)
            r2 = r27
            java.lang.Object r1 = r6.getObject(r14, r2)
            if (r1 != 0) goto L104
        L101:
            java.lang.Object r1 = r12.f11970c
            goto L125
        L104:
            java.lang.Object r7 = r12.f11970c
            java.lang.Object r1 = p124h7.C2575d.m6540c(r1, r7)
            goto L125
        L10b:
            r31 = r35
            r5 = r22
            r8 = r23
            r2 = r27
            r0 = 2
            if (r9 != r0) goto L90
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r0 & r7
            if (r0 != 0) goto L120
            int r0 = p052d6.C1306f0.m3789r(r8, r15, r12)
            goto L101
        L120:
            int r0 = p052d6.C1306f0.m3790s(r8, r15, r12)
            goto L101
        L125:
            r6.putObject(r14, r2, r1)
            r15 = r0
            goto L162
        L12a:
            r31 = r35
            r5 = r22
            r8 = r23
            r2 = r27
            if (r9 != 0) goto L90
            int r1 = p052d6.C1306f0.m3795x(r8, r15, r12)
            r7 = r1
            long r0 = r12.f11969b
            r15 = 0
            int r9 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r9 == 0) goto L143
            r0 = 1
            goto L144
        L143:
            r0 = 0
        L144:
            e7.i8 r1 = p124h7.C2577d1.f11435c
            r1.mo4205c(r14, r2, r0)
            r22 = r5
            r15 = r7
            r7 = r4
            goto L1df
        L14f:
            r31 = r35
            r5 = r22
            r8 = r23
            r2 = r27
            if (r9 != r1) goto L90
            int r0 = p052d6.C1306f0.m3779h(r8, r15)
            r6.putInt(r14, r2, r0)
            int r15 = r15 + 4
        L162:
            r7 = r4
            r22 = r5
            goto L1df
        L167:
            r31 = r35
            r5 = r22
            r8 = r23
            r2 = r27
            if (r9 != r0) goto L90
            long r18 = p052d6.C1306f0.m3796y(r8, r15)
            r0 = r6
            r1 = r33
            r7 = r4
            r22 = r5
            r4 = r18
            r0.putLong(r1, r2, r4)
            goto L1dd
        L182:
            r31 = r35
            r7 = r4
            r8 = r23
            r2 = r27
            if (r9 != 0) goto L1ea
            int r0 = p052d6.C1306f0.m3792u(r8, r15, r12)
        L18f:
            int r1 = r12.f11968a
        L191:
            r6.putInt(r14, r2, r1)
            r15 = r0
            goto L1df
        L196:
            r31 = r35
            r7 = r4
            r8 = r23
            r2 = r27
            if (r9 != 0) goto L1ea
            int r9 = p052d6.C1306f0.m3795x(r8, r15, r12)
            long r4 = r12.f11969b
            r0 = r6
            r1 = r33
            r0.putLong(r1, r2, r4)
            r0 = r10 | r17
            r1 = r0
            r15 = r9
            goto L1e2
        L1b0:
            r31 = r35
            r7 = r4
            r8 = r23
            r2 = r27
            if (r9 != r1) goto L1ea
            int r0 = p052d6.C1306f0.m3779h(r8, r15)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            e7.i8 r1 = p124h7.C2577d1.f11435c
            r1.mo4208f(r14, r2, r0)
            int r15 = r15 + 4
            goto L1df
        L1c9:
            r31 = r35
            r7 = r4
            r8 = r23
            r2 = r27
            if (r9 != r0) goto L1ea
            long r0 = p052d6.C1306f0.m3796y(r8, r15)
            double r0 = java.lang.Double.longBitsToDouble(r0)
            p124h7.C2577d1.m6554n(r14, r2, r0)
        L1dd:
            int r15 = r15 + 8
        L1df:
            r0 = r10 | r17
            r1 = r0
        L1e2:
            r4 = r7
            r2 = r11
            r0 = r15
            r10 = r22
            r11 = r8
            goto L2bc
        L1ea:
            r4 = r7
            r1 = r10
            r2 = r11
            goto L2a0
        L1ef:
            r31 = r35
            r3 = r4
            r4 = r10
            r0 = r23
            r10 = 27
            if (r8 != r10) goto L238
            r10 = 2
            if (r9 != r10) goto L236
            java.lang.Object r7 = r6.getObject(r14, r4)
            h7.c r7 = (p124h7.InterfaceC2557c) r7
            boolean r8 = r7.mo6520c()
            if (r8 != 0) goto L219
            int r8 = r7.size()
            if (r8 != 0) goto L211
            r8 = 10
            goto L212
        L211:
            int r8 = r8 + r8
        L212:
            h7.c r7 = r7.mo6521k(r8)
            r6.putObject(r14, r4, r7)
        L219:
            r20 = r7
            h7.i0 r4 = r13.m6451o(r3)
            r10 = r15
            r15 = r4
            r16 = r30
            r17 = r34
            r18 = r10
            r19 = r36
            r21 = r37
            int r4 = p052d6.C1306f0.m3786o(r15, r16, r17, r18, r19, r20, r21)
            r11 = r0
            r0 = r4
            r10 = r22
            r4 = r3
            goto L2bc
        L236:
            r10 = r15
            goto L268
        L238:
            r10 = r15
            r0 = 49
            if (r8 > r0) goto L261
            long r11 = (long) r7
            r15 = r32
            r16 = r33
            r17 = r34
            r18 = r10
            r19 = r36
            r20 = r30
            r21 = r31
            r22 = r9
            r23 = r3
            r24 = r11
            r26 = r8
            r27 = r4
            r29 = r37
            int r0 = r15.m6435Q(r16, r17, r18, r19, r20, r21, r22, r23, r24, r26, r27, r29)
            if (r0 == r10) goto L25f
            goto L29d
        L25f:
            r15 = r0
            goto L29f
        L261:
            r0 = 50
            if (r8 != r0) goto L27d
            r0 = 2
            if (r9 == r0) goto L26a
        L268:
            r15 = r10
            goto L29f
        L26a:
            r15 = r32
            r16 = r33
            r17 = r34
            r18 = r10
            r19 = r36
            r20 = r3
            r21 = r4
            r15.m6432N(r16, r17, r18, r19, r20, r21)
            r0 = 0
            throw r0
        L27d:
            r15 = r32
            r16 = r33
            r17 = r34
            r18 = r10
            r19 = r36
            r20 = r30
            r21 = r31
            r22 = r9
            r23 = r7
            r24 = r8
            r25 = r4
            r27 = r3
            r28 = r37
            int r0 = r15.m6433O(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r27, r28)
            if (r0 == r10) goto L25f
        L29d:
            r4 = r3
            goto L2b2
        L29f:
            r4 = r3
        L2a0:
            r17 = r15
        L2a2:
            h7.x0 r19 = m6419F(r33)
            r15 = r30
            r16 = r34
            r18 = r36
            r20 = r37
            int r0 = p052d6.C1306f0.m3791t(r15, r16, r17, r18, r19, r20)
        L2b2:
            r13 = r32
            r14 = r33
            r11 = r34
            r10 = r36
            r12 = r37
        L2bc:
            r3 = r31
            r7 = -1
            goto L15
        L2c1:
            r3 = 1048575(0xfffff, float:1.469367E-39)
            if (r2 == r3) goto L2cc
            long r2 = (long) r2
            r4 = r33
            r6.putInt(r4, r2, r1)
        L2cc:
            r1 = r36
            if (r0 != r1) goto L2d1
            return r0
        L2d1:
            h7.f r0 = p124h7.C2611f.m6686f()
            throw r0
    }

    /* renamed from: Q */
    public final int m6435Q(T r17, byte[] r18, int r19, int r20, int r21, int r22, int r23, int r24, long r25, int r27, long r28, p124h7.C2915vf r30) {
            r16 = this;
            r0 = r16
            r1 = r17
            r3 = r18
            r4 = r19
            r5 = r20
            r2 = r21
            r6 = r23
            r8 = r24
            r9 = r28
            r7 = r30
            sun.misc.Unsafe r11 = p124h7.C2521a0.f11351p
            java.lang.Object r12 = r11.getObject(r1, r9)
            h7.c r12 = (p124h7.InterfaceC2557c) r12
            boolean r13 = r12.mo6520c()
            if (r13 != 0) goto L33
            int r13 = r12.size()
            if (r13 != 0) goto L2b
            r13 = 10
            goto L2c
        L2b:
            int r13 = r13 + r13
        L2c:
            h7.c r12 = r12.mo6521k(r13)
            r11.putObject(r1, r9, r12)
        L33:
            r9 = 5
            r10 = 2
            r13 = 0
            r11 = 1
            switch(r27) {
                case 18: goto L38d;
                case 19: goto L344;
                case 20: goto L30c;
                case 21: goto L30c;
                case 22: goto L2f1;
                case 23: goto L2b2;
                case 24: goto L271;
                case 25: goto L21d;
                case 26: goto L176;
                case 27: goto L15b;
                case 28: goto L10e;
                case 29: goto L2f1;
                case 30: goto Ld8;
                case 31: goto L271;
                case 32: goto L2b2;
                case 33: goto L98;
                case 34: goto L58;
                case 35: goto L38d;
                case 36: goto L344;
                case 37: goto L30c;
                case 38: goto L30c;
                case 39: goto L2f1;
                case 40: goto L2b2;
                case 41: goto L271;
                case 42: goto L21d;
                case 43: goto L2f1;
                case 44: goto Ld8;
                case 45: goto L271;
                case 46: goto L2b2;
                case 47: goto L98;
                case 48: goto L58;
                default: goto L3b;
            }
        L3b:
            r1 = 3
            if (r6 != r1) goto L3f5
            h7.i0 r1 = r0.m6451o(r8)
            r6 = r2 & (-8)
            r6 = r6 | 4
            r22 = r1
            r23 = r18
            r24 = r19
            r25 = r20
            r26 = r6
            r27 = r30
            int r4 = p052d6.C1306f0.m3781j(r22, r23, r24, r25, r26, r27)
            goto L3d3
        L58:
            if (r6 != r10) goto L7c
            h7.n r12 = (p124h7.C2755n) r12
            int r1 = p052d6.C1306f0.m3792u(r3, r4, r7)
            int r2 = r7.f11968a
            int r2 = r2 + r1
        L63:
            if (r1 >= r2) goto L73
            int r1 = p052d6.C1306f0.m3795x(r3, r1, r7)
            long r4 = r7.f11969b
            long r4 = p124h7.C2592dg.m6619o(r4)
            r12.m6990h(r4)
            goto L63
        L73:
            if (r1 != r2) goto L77
            goto L3f6
        L77:
            h7.f r1 = p124h7.C2611f.m6687g()
            throw r1
        L7c:
            if (r6 != 0) goto L3f5
            h7.n r12 = (p124h7.C2755n) r12
        L80:
            int r1 = p052d6.C1306f0.m3795x(r3, r4, r7)
            long r8 = r7.f11969b
            long r8 = p124h7.C2592dg.m6619o(r8)
            r12.m6990h(r8)
            if (r1 >= r5) goto L97
            int r4 = p052d6.C1306f0.m3792u(r3, r1, r7)
            int r6 = r7.f11968a
            if (r2 == r6) goto L80
        L97:
            return r1
        L98:
            if (r6 != r10) goto Lbc
            h7.zg r12 = (p124h7.C2988zg) r12
            int r1 = p052d6.C1306f0.m3792u(r3, r4, r7)
            int r2 = r7.f11968a
            int r2 = r2 + r1
        La3:
            if (r1 >= r2) goto Lb3
            int r1 = p052d6.C1306f0.m3792u(r3, r1, r7)
            int r4 = r7.f11968a
            int r4 = p124h7.C2592dg.m6618n(r4)
            r12.m7360h(r4)
            goto La3
        Lb3:
            if (r1 != r2) goto Lb7
            goto L3f6
        Lb7:
            h7.f r1 = p124h7.C2611f.m6687g()
            throw r1
        Lbc:
            if (r6 != 0) goto L3f5
            h7.zg r12 = (p124h7.C2988zg) r12
        Lc0:
            int r1 = p052d6.C1306f0.m3792u(r3, r4, r7)
            int r4 = r7.f11968a
            int r4 = p124h7.C2592dg.m6618n(r4)
            r12.m7360h(r4)
            if (r1 >= r5) goto Ld7
            int r4 = p052d6.C1306f0.m3792u(r3, r1, r7)
            int r6 = r7.f11968a
            if (r2 == r6) goto Lc0
        Ld7:
            return r1
        Ld8:
            if (r6 != r10) goto Ldf
            int r2 = p052d6.C1306f0.m3788q(r3, r4, r12, r7)
            goto Lf0
        Ldf:
            if (r6 != 0) goto L3f5
            r2 = r21
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r12
            r7 = r30
            int r2 = p052d6.C1306f0.m3794w(r2, r3, r4, r5, r6, r7)
        Lf0:
            h7.yg r1 = (p124h7.AbstractC2970yg) r1
            h7.x0 r3 = r1.zzc
            h7.x0 r4 = p124h7.C2936x0.f12011f
            if (r3 != r4) goto Lf9
            r3 = 0
        Lf9:
            h7.b r4 = r0.m6450n(r8)
            h7.v0<?, ?> r5 = r0.f11364m
            r6 = r22
            java.lang.Object r3 = p124h7.C2702k0.m6907a(r6, r12, r4, r3, r5)
            if (r3 != 0) goto L109
            goto L23e
        L109:
            h7.x0 r3 = (p124h7.C2936x0) r3
            r1.zzc = r3
            return r2
        L10e:
            if (r6 != r10) goto L3f5
            int r1 = p052d6.C1306f0.m3792u(r3, r4, r7)
            int r4 = r7.f11968a
            if (r4 < 0) goto L156
            int r6 = r3.length
            int r6 = r6 - r1
            if (r4 > r6) goto L151
            if (r4 != 0) goto L11f
            goto L140
        L11f:
            h7.cg r6 = p124h7.AbstractC2574cg.m6534A(r3, r1, r4)
            r12.add(r6)
            int r1 = r1 + r4
        L127:
            if (r1 >= r5) goto L150
            int r4 = p052d6.C1306f0.m3792u(r3, r1, r7)
            int r6 = r7.f11968a
            if (r2 == r6) goto L132
            goto L150
        L132:
            int r1 = p052d6.C1306f0.m3792u(r3, r4, r7)
            int r4 = r7.f11968a
            if (r4 < 0) goto L14b
            int r6 = r3.length
            int r6 = r6 - r1
            if (r4 > r6) goto L146
            if (r4 != 0) goto L11f
        L140:
            h7.cg r4 = p124h7.AbstractC2574cg.f11427Z
            r12.add(r4)
            goto L127
        L146:
            h7.f r1 = p124h7.C2611f.m6687g()
            throw r1
        L14b:
            h7.f r1 = p124h7.C2611f.m6685e()
            throw r1
        L150:
            return r1
        L151:
            h7.f r1 = p124h7.C2611f.m6687g()
            throw r1
        L156:
            h7.f r1 = p124h7.C2611f.m6685e()
            throw r1
        L15b:
            if (r6 == r10) goto L15f
            goto L3f5
        L15f:
            h7.i0 r1 = r0.m6451o(r8)
            r22 = r1
            r23 = r21
            r24 = r18
            r25 = r19
            r26 = r20
            r27 = r12
            r28 = r30
            int r1 = p052d6.C1306f0.m3786o(r22, r23, r24, r25, r26, r27, r28)
            return r1
        L176:
            if (r6 != r10) goto L3f5
            r8 = 536870912(0x20000000, double:2.65249474E-315)
            long r8 = r25 & r8
            java.lang.String r1 = ""
            int r6 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
            int r4 = p052d6.C1306f0.m3792u(r3, r4, r7)
            if (r6 != 0) goto L1c3
            int r6 = r7.f11968a
            if (r6 < 0) goto L1be
            if (r6 != 0) goto L18e
            goto L1ad
        L18e:
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = p124h7.C2575d.f11429a
            r8.<init>(r3, r4, r6, r9)
        L195:
            r12.add(r8)
            int r4 = r4 + r6
        L199:
            if (r4 >= r5) goto L3f5
            int r6 = p052d6.C1306f0.m3792u(r3, r4, r7)
            int r8 = r7.f11968a
            if (r2 != r8) goto L3f5
            int r4 = p052d6.C1306f0.m3792u(r3, r6, r7)
            int r6 = r7.f11968a
            if (r6 < 0) goto L1b9
            if (r6 != 0) goto L1b1
        L1ad:
            r12.add(r1)
            goto L199
        L1b1:
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = p124h7.C2575d.f11429a
            r8.<init>(r3, r4, r6, r9)
            goto L195
        L1b9:
            h7.f r1 = p124h7.C2611f.m6685e()
            throw r1
        L1be:
            h7.f r1 = p124h7.C2611f.m6685e()
            throw r1
        L1c3:
            int r6 = r7.f11968a
            if (r6 < 0) goto L218
            if (r6 != 0) goto L1cb
        L1c9:
            r8 = r4
            goto L1f2
        L1cb:
            int r8 = r4 + r6
            boolean r9 = p124h7.C2631g1.m6746e(r3, r4, r8)
            if (r9 == 0) goto L213
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = p124h7.C2575d.f11429a
            r9.<init>(r3, r4, r6, r10)
        L1da:
            r12.add(r9)
        L1dd:
            if (r8 >= r5) goto L210
            int r4 = p052d6.C1306f0.m3792u(r3, r8, r7)
            int r6 = r7.f11968a
            if (r2 != r6) goto L210
            int r4 = p052d6.C1306f0.m3792u(r3, r4, r7)
            int r6 = r7.f11968a
            if (r6 < 0) goto L20b
            if (r6 != 0) goto L1f6
            goto L1c9
        L1f2:
            r12.add(r1)
            goto L1dd
        L1f6:
            int r8 = r4 + r6
            boolean r9 = p124h7.C2631g1.m6746e(r3, r4, r8)
            if (r9 == 0) goto L206
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = p124h7.C2575d.f11429a
            r9.<init>(r3, r4, r6, r10)
            goto L1da
        L206:
            h7.f r1 = p124h7.C2611f.m6683c()
            throw r1
        L20b:
            h7.f r1 = p124h7.C2611f.m6685e()
            throw r1
        L210:
            r4 = r8
            goto L3f5
        L213:
            h7.f r1 = p124h7.C2611f.m6683c()
            throw r1
        L218:
            h7.f r1 = p124h7.C2611f.m6685e()
            throw r1
        L21d:
            r1 = 0
            if (r6 != r10) goto L246
            h7.wf r12 = (p124h7.C2933wf) r12
            int r2 = p052d6.C1306f0.m3792u(r3, r4, r7)
            int r4 = r7.f11968a
            int r4 = r4 + r2
        L229:
            if (r2 >= r4) goto L23c
            int r2 = p052d6.C1306f0.m3795x(r3, r2, r7)
            long r5 = r7.f11969b
            int r8 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            if (r8 == 0) goto L237
            r5 = 1
            goto L238
        L237:
            r5 = 0
        L238:
            r12.m7240e(r5)
            goto L229
        L23c:
            if (r2 != r4) goto L241
        L23e:
            r1 = r2
            goto L3f6
        L241:
            h7.f r1 = p124h7.C2611f.m6687g()
            throw r1
        L246:
            if (r6 != 0) goto L3f5
            h7.wf r12 = (p124h7.C2933wf) r12
            int r4 = p052d6.C1306f0.m3795x(r3, r4, r7)
            long r8 = r7.f11969b
            int r6 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
            if (r6 == 0) goto L255
            goto L26e
        L255:
            r6 = 0
        L256:
            r12.m7240e(r6)
            if (r4 >= r5) goto L270
            int r6 = p052d6.C1306f0.m3792u(r3, r4, r7)
            int r8 = r7.f11968a
            if (r2 == r8) goto L264
            goto L270
        L264:
            int r4 = p052d6.C1306f0.m3795x(r3, r6, r7)
            long r8 = r7.f11969b
            int r6 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
            if (r6 == 0) goto L255
        L26e:
            r6 = 1
            goto L256
        L270:
            return r4
        L271:
            if (r6 != r10) goto L291
            h7.zg r12 = (p124h7.C2988zg) r12
            int r1 = p052d6.C1306f0.m3792u(r3, r4, r7)
            int r2 = r7.f11968a
            int r2 = r2 + r1
        L27c:
            if (r1 >= r2) goto L288
            int r4 = p052d6.C1306f0.m3779h(r3, r1)
            r12.m7360h(r4)
            int r1 = r1 + 4
            goto L27c
        L288:
            if (r1 != r2) goto L28c
            goto L3f6
        L28c:
            h7.f r1 = p124h7.C2611f.m6687g()
            throw r1
        L291:
            if (r6 != r9) goto L3f5
            h7.zg r12 = (p124h7.C2988zg) r12
            int r1 = p052d6.C1306f0.m3779h(r18, r19)
        L299:
            r12.m7360h(r1)
            int r4 = r4 + 4
            if (r4 >= r5) goto L2b1
            int r1 = p052d6.C1306f0.m3792u(r3, r4, r7)
            int r6 = r7.f11968a
            if (r2 == r6) goto L2a9
            goto L2b1
        L2a9:
            int r4 = p052d6.C1306f0.m3779h(r3, r1)
            r15 = r4
            r4 = r1
            r1 = r15
            goto L299
        L2b1:
            return r4
        L2b2:
            if (r6 != r10) goto L2d2
            h7.n r12 = (p124h7.C2755n) r12
            int r1 = p052d6.C1306f0.m3792u(r3, r4, r7)
            int r2 = r7.f11968a
            int r2 = r2 + r1
        L2bd:
            if (r1 >= r2) goto L2c9
            long r4 = p052d6.C1306f0.m3796y(r3, r1)
            r12.m6990h(r4)
            int r1 = r1 + 8
            goto L2bd
        L2c9:
            if (r1 != r2) goto L2cd
            goto L3f6
        L2cd:
            h7.f r1 = p124h7.C2611f.m6687g()
            throw r1
        L2d2:
            if (r6 != r11) goto L3f5
            h7.n r12 = (p124h7.C2755n) r12
            long r8 = p052d6.C1306f0.m3796y(r18, r19)
        L2da:
            r12.m6990h(r8)
            int r4 = r4 + 8
            if (r4 >= r5) goto L2f0
            int r1 = p052d6.C1306f0.m3792u(r3, r4, r7)
            int r6 = r7.f11968a
            if (r2 == r6) goto L2ea
            goto L2f0
        L2ea:
            long r8 = p052d6.C1306f0.m3796y(r3, r1)
            r4 = r1
            goto L2da
        L2f0:
            return r4
        L2f1:
            if (r6 != r10) goto L2f9
            int r1 = p052d6.C1306f0.m3788q(r3, r4, r12, r7)
            goto L3f6
        L2f9:
            if (r6 == 0) goto L2fd
            goto L3f5
        L2fd:
            r22 = r18
            r23 = r19
            r24 = r20
            r25 = r12
            r26 = r30
            int r1 = p052d6.C1306f0.m3794w(r21, r22, r23, r24, r25, r26)
            return r1
        L30c:
            if (r6 != r10) goto L32c
            h7.n r12 = (p124h7.C2755n) r12
            int r1 = p052d6.C1306f0.m3792u(r3, r4, r7)
            int r2 = r7.f11968a
            int r2 = r2 + r1
        L317:
            if (r1 >= r2) goto L323
            int r1 = p052d6.C1306f0.m3795x(r3, r1, r7)
            long r4 = r7.f11969b
            r12.m6990h(r4)
            goto L317
        L323:
            if (r1 != r2) goto L327
            goto L3f6
        L327:
            h7.f r1 = p124h7.C2611f.m6687g()
            throw r1
        L32c:
            if (r6 != 0) goto L3f5
            h7.n r12 = (p124h7.C2755n) r12
        L330:
            int r1 = p052d6.C1306f0.m3795x(r3, r4, r7)
            long r8 = r7.f11969b
            r12.m6990h(r8)
            if (r1 >= r5) goto L343
            int r4 = p052d6.C1306f0.m3792u(r3, r1, r7)
            int r6 = r7.f11968a
            if (r2 == r6) goto L330
        L343:
            return r1
        L344:
            if (r6 != r10) goto L368
            h7.tg r12 = (p124h7.C2880tg) r12
            int r1 = p052d6.C1306f0.m3792u(r3, r4, r7)
            int r2 = r7.f11968a
            int r2 = r2 + r1
        L34f:
            if (r1 >= r2) goto L35f
            int r4 = p052d6.C1306f0.m3779h(r3, r1)
            float r4 = java.lang.Float.intBitsToFloat(r4)
            r12.m7175e(r4)
            int r1 = r1 + 4
            goto L34f
        L35f:
            if (r1 != r2) goto L363
            goto L3f6
        L363:
            h7.f r1 = p124h7.C2611f.m6687g()
            throw r1
        L368:
            if (r6 != r9) goto L3f5
            h7.tg r12 = (p124h7.C2880tg) r12
            int r1 = p052d6.C1306f0.m3779h(r18, r19)
        L370:
            float r1 = java.lang.Float.intBitsToFloat(r1)
            r12.m7175e(r1)
            int r4 = r4 + 4
            if (r4 >= r5) goto L38c
            int r1 = p052d6.C1306f0.m3792u(r3, r4, r7)
            int r6 = r7.f11968a
            if (r2 == r6) goto L384
            goto L38c
        L384:
            int r4 = p052d6.C1306f0.m3779h(r3, r1)
            r15 = r4
            r4 = r1
            r1 = r15
            goto L370
        L38c:
            return r4
        L38d:
            if (r6 != r10) goto L3b0
            h7.kg r12 = (p124h7.C2718kg) r12
            int r1 = p052d6.C1306f0.m3792u(r3, r4, r7)
            int r2 = r7.f11968a
            int r2 = r2 + r1
        L398:
            if (r1 >= r2) goto L3a8
            long r4 = p052d6.C1306f0.m3796y(r3, r1)
            double r4 = java.lang.Double.longBitsToDouble(r4)
            r12.m6950e(r4)
            int r1 = r1 + 8
            goto L398
        L3a8:
            if (r1 != r2) goto L3ab
            goto L3f6
        L3ab:
            h7.f r1 = p124h7.C2611f.m6687g()
            throw r1
        L3b0:
            if (r6 != r11) goto L3f5
            h7.kg r12 = (p124h7.C2718kg) r12
            long r8 = p052d6.C1306f0.m3796y(r18, r19)
        L3b8:
            double r8 = java.lang.Double.longBitsToDouble(r8)
            r12.m6950e(r8)
            int r4 = r4 + 8
            if (r4 >= r5) goto L3d2
            int r1 = p052d6.C1306f0.m3792u(r3, r4, r7)
            int r6 = r7.f11968a
            if (r2 == r6) goto L3cc
            goto L3d2
        L3cc:
            long r8 = p052d6.C1306f0.m3796y(r3, r1)
            r4 = r1
            goto L3b8
        L3d2:
            return r4
        L3d3:
            java.lang.Object r8 = r7.f11970c
            r12.add(r8)
            if (r4 >= r5) goto L3f4
            int r8 = p052d6.C1306f0.m3792u(r3, r4, r7)
            int r9 = r7.f11968a
            if (r2 == r9) goto L3e3
            goto L3f4
        L3e3:
            r22 = r1
            r23 = r18
            r24 = r8
            r25 = r20
            r26 = r6
            r27 = r30
            int r4 = p052d6.C1306f0.m3781j(r22, r23, r24, r25, r26, r27)
            goto L3d3
        L3f4:
            return r4
        L3f5:
            r1 = r4
        L3f6:
            return r1
    }

    /* renamed from: R */
    public final int m6436R(int r2) {
            r1 = this;
            int r0 = r1.f11354c
            if (r2 < r0) goto Le
            int r0 = r1.f11355d
            if (r2 > r0) goto Le
            r0 = 0
            int r2 = r1.m6448k(r2, r0)
            return r2
        Le:
            r2 = -1
            return r2
    }

    /* renamed from: S */
    public final int m6437S(int r2) {
            r1 = this;
            int[] r0 = r1.f11352a
            int r2 = r2 + 2
            r2 = r0[r2]
            return r2
    }

    @Override // p124h7.InterfaceC2666i0
    /* renamed from: a */
    public final void mo6438a(T r7, T r8) {
            r6 = this;
            java.util.Objects.requireNonNull(r8)
            r0 = 0
        L4:
            int[] r1 = r6.f11352a
            int r1 = r1.length
            if (r0 >= r1) goto L10a
            int r1 = r6.m6449l(r0)
            r2 = 1048575(0xfffff, float:1.469367E-39)
            r2 = r2 & r1
            long r2 = (long) r2
            int[] r4 = r6.f11352a
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
            boolean r1 = r6.m6427A(r8, r4, r0)
            if (r1 == 0) goto L106
            goto L31
        L26:
            r6.m6455t(r7, r8, r0)
            goto L106
        L2b:
            boolean r1 = r6.m6427A(r8, r4, r0)
            if (r1 == 0) goto L106
        L31:
            java.lang.Object r1 = p124h7.C2577d1.m6550j(r8, r2)
            e7.i8 r5 = p124h7.C2577d1.f11435c
            r5.m4264N(r7, r2, r1)
            r6.m6458w(r7, r4, r0)
            goto L106
        L3f:
            java.lang.Class<?> r1 = p124h7.C2702k0.f11686a
            java.lang.Object r1 = p124h7.C2577d1.m6550j(r7, r2)
            java.lang.Object r4 = p124h7.C2577d1.m6550j(r8, r2)
            java.lang.Object r1 = p124h7.C2863t.m7144b(r1, r4)
            e7.i8 r4 = p124h7.C2577d1.f11435c
            r4.m4264N(r7, r2, r1)
            goto L106
        L54:
            h7.m r1 = r6.f11363l
            r1.mo6886c(r7, r8, r2)
            goto L106
        L5b:
            boolean r1 = r6.m6460y(r8, r0)
            if (r1 == 0) goto L106
            goto Lde
        L63:
            boolean r1 = r6.m6460y(r8, r0)
            if (r1 == 0) goto L106
            goto Lc7
        L6a:
            boolean r1 = r6.m6460y(r8, r0)
            if (r1 == 0) goto L106
            goto Lde
        L72:
            boolean r1 = r6.m6460y(r8, r0)
            if (r1 == 0) goto L106
            goto Lc7
        L79:
            boolean r1 = r6.m6460y(r8, r0)
            if (r1 == 0) goto L106
            goto Lc7
        L80:
            boolean r1 = r6.m6460y(r8, r0)
            if (r1 == 0) goto L106
            goto Lc7
        L87:
            boolean r1 = r6.m6460y(r8, r0)
            if (r1 == 0) goto L106
            goto L99
        L8e:
            r6.m6454s(r7, r8, r0)
            goto L106
        L93:
            boolean r1 = r6.m6460y(r8, r0)
            if (r1 == 0) goto L106
        L99:
            java.lang.Object r1 = p124h7.C2577d1.m6550j(r8, r2)
            e7.i8 r4 = p124h7.C2577d1.f11435c
            r4.m4264N(r7, r2, r1)
            goto L103
        La3:
            boolean r1 = r6.m6460y(r8, r0)
            if (r1 == 0) goto L106
            boolean r1 = p124h7.C2577d1.m6559s(r8, r2)
            e7.i8 r4 = p124h7.C2577d1.f11435c
            r4.mo4205c(r7, r2, r1)
            goto L103
        Lb3:
            boolean r1 = r6.m6460y(r8, r0)
            if (r1 == 0) goto L106
            goto Lc7
        Lba:
            boolean r1 = r6.m6460y(r8, r0)
            if (r1 == 0) goto L106
            goto Lde
        Lc1:
            boolean r1 = r6.m6460y(r8, r0)
            if (r1 == 0) goto L106
        Lc7:
            int r1 = p124h7.C2577d1.m6547g(r8, r2)
            e7.i8 r4 = p124h7.C2577d1.f11435c
            r4.m4262F(r7, r2, r1)
            goto L103
        Ld1:
            boolean r1 = r6.m6460y(r8, r0)
            if (r1 == 0) goto L106
            goto Lde
        Ld8:
            boolean r1 = r6.m6460y(r8, r0)
            if (r1 == 0) goto L106
        Lde:
            long r4 = p124h7.C2577d1.m6548h(r8, r2)
            p124h7.C2577d1.m6555o(r7, r2, r4)
            goto L103
        Le6:
            boolean r1 = r6.m6460y(r8, r0)
            if (r1 == 0) goto L106
            float r1 = p124h7.C2577d1.m6546f(r8, r2)
            e7.i8 r4 = p124h7.C2577d1.f11435c
            r4.mo4208f(r7, r2, r1)
            goto L103
        Lf6:
            boolean r1 = r6.m6460y(r8, r0)
            if (r1 == 0) goto L106
            double r4 = p124h7.C2577d1.m6545e(r8, r2)
            p124h7.C2577d1.m6554n(r7, r2, r4)
        L103:
            r6.m6457v(r7, r0)
        L106:
            int r0 = r0 + 3
            goto L4
        L10a:
            h7.v0<?, ?> r0 = r6.f11364m
            java.lang.Class<?> r1 = p124h7.C2702k0.f11686a
            java.lang.Object r1 = r0.mo7183d(r7)
            java.lang.Object r2 = r0.mo7183d(r8)
            java.lang.Object r1 = r0.mo7184e(r1, r2)
            r0.mo7194o(r7, r1)
            boolean r7 = r6.f11357f
            if (r7 != 0) goto L122
            return
        L122:
            h7.ng<?> r7 = r6.f11365n
            r7.mo7003a(r8)
            r7 = 0
            throw r7
    }

    @Override // p124h7.InterfaceC2666i0
    /* renamed from: b */
    public final int mo6439b(T r9) {
            r8 = this;
            int[] r0 = r8.f11352a
            int r0 = r0.length
            r1 = 0
            r2 = 0
        L5:
            if (r1 >= r0) goto L129
            int r3 = r8.m6449l(r1)
            int[] r4 = r8.f11352a
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
            boolean r3 = r8.m6427A(r9, r4, r1)
            if (r3 == 0) goto L125
            goto Lcb
        L27:
            boolean r3 = r8.m6427A(r9, r4, r1)
            if (r3 == 0) goto L125
            goto La2
        L2f:
            boolean r3 = r8.m6427A(r9, r4, r1)
            if (r3 == 0) goto L125
            goto L8d
        L36:
            boolean r3 = r8.m6427A(r9, r4, r1)
            if (r3 == 0) goto L125
            goto La2
        L3e:
            boolean r3 = r8.m6427A(r9, r4, r1)
            if (r3 == 0) goto L125
            goto L8d
        L45:
            boolean r3 = r8.m6427A(r9, r4, r1)
            if (r3 == 0) goto L125
            goto L8d
        L4c:
            boolean r3 = r8.m6427A(r9, r4, r1)
            if (r3 == 0) goto L125
            goto L8d
        L53:
            boolean r3 = r8.m6427A(r9, r4, r1)
            if (r3 == 0) goto L125
            goto Lcb
        L5b:
            boolean r3 = r8.m6427A(r9, r4, r1)
            if (r3 == 0) goto L125
            goto Lcb
        L63:
            boolean r3 = r8.m6427A(r9, r4, r1)
            if (r3 == 0) goto L125
            goto Le4
        L6b:
            boolean r3 = r8.m6427A(r9, r4, r1)
            if (r3 == 0) goto L125
            int r2 = r2 * 53
            boolean r3 = m6417B(r9, r5)
            goto Lf7
        L79:
            boolean r3 = r8.m6427A(r9, r4, r1)
            if (r3 == 0) goto L125
            goto L8d
        L80:
            boolean r3 = r8.m6427A(r9, r4, r1)
            if (r3 == 0) goto L125
            goto La2
        L87:
            boolean r3 = r8.m6427A(r9, r4, r1)
            if (r3 == 0) goto L125
        L8d:
            int r2 = r2 * 53
            int r3 = m6424M(r9, r5)
            goto L123
        L95:
            boolean r3 = r8.m6427A(r9, r4, r1)
            if (r3 == 0) goto L125
            goto La2
        L9c:
            boolean r3 = r8.m6427A(r9, r4, r1)
            if (r3 == 0) goto L125
        La2:
            int r2 = r2 * 53
            long r3 = m6425m(r9, r5)
            goto L11f
        Laa:
            boolean r3 = r8.m6427A(r9, r4, r1)
            if (r3 == 0) goto L125
            int r2 = r2 * 53
            float r3 = m6423J(r9, r5)
            goto L110
        Lb7:
            boolean r3 = r8.m6427A(r9, r4, r1)
            if (r3 == 0) goto L125
            int r2 = r2 * 53
            double r3 = m6422I(r9, r5)
            goto L11b
        Lc4:
            java.lang.Object r3 = p124h7.C2577d1.m6550j(r9, r5)
            if (r3 == 0) goto Le0
            goto Ldc
        Lcb:
            int r2 = r2 * 53
            java.lang.Object r3 = p124h7.C2577d1.m6550j(r9, r5)
            int r3 = r3.hashCode()
            goto L123
        Ld6:
            java.lang.Object r3 = p124h7.C2577d1.m6550j(r9, r5)
            if (r3 == 0) goto Le0
        Ldc:
            int r7 = r3.hashCode()
        Le0:
            int r2 = r2 * 53
            int r2 = r2 + r7
            goto L125
        Le4:
            int r2 = r2 * 53
            java.lang.Object r3 = p124h7.C2577d1.m6550j(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L123
        Lf1:
            int r2 = r2 * 53
            boolean r3 = p124h7.C2577d1.m6559s(r9, r5)
        Lf7:
            int r3 = p124h7.C2575d.m6538a(r3)
            goto L123
        Lfc:
            int r2 = r2 * 53
            int r3 = p124h7.C2577d1.m6547g(r9, r5)
            goto L123
        L103:
            int r2 = r2 * 53
            long r3 = p124h7.C2577d1.m6548h(r9, r5)
            goto L11f
        L10a:
            int r2 = r2 * 53
            float r3 = p124h7.C2577d1.m6546f(r9, r5)
        L110:
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L123
        L115:
            int r2 = r2 * 53
            double r3 = p124h7.C2577d1.m6545e(r9, r5)
        L11b:
            long r3 = java.lang.Double.doubleToLongBits(r3)
        L11f:
            int r3 = p124h7.C2575d.m6539b(r3)
        L123:
            int r3 = r3 + r2
            r2 = r3
        L125:
            int r1 = r1 + 3
            goto L5
        L129:
            int r2 = r2 * 53
            h7.v0<?, ?> r0 = r8.f11364m
            java.lang.Object r0 = r0.mo7183d(r9)
            int r0 = r0.hashCode()
            int r0 = r0 + r2
            boolean r1 = r8.f11357f
            if (r1 != 0) goto L13b
            return r0
        L13b:
            h7.ng<?> r0 = r8.f11365n
            r0.mo7003a(r9)
            r9 = 0
            throw r9
    }

    @Override // p124h7.InterfaceC2666i0
    /* renamed from: c */
    public final void mo6440c(T r7) {
            r6 = this;
            int r0 = r6.f11361j
        L2:
            int r1 = r6.f11362k
            if (r0 >= r1) goto L27
            int[] r1 = r6.f11360i
            r1 = r1[r0]
            int r1 = r6.m6449l(r1)
            r2 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r1 & r2
            long r1 = (long) r1
            java.lang.Object r3 = p124h7.C2577d1.m6550j(r7, r1)
            if (r3 == 0) goto L24
            r4 = r3
            h7.s r4 = (p124h7.C2845s) r4
            r5 = 0
            r4.f11894Y = r5
            e7.i8 r4 = p124h7.C2577d1.f11435c
            r4.m4264N(r7, r1, r3)
        L24:
            int r0 = r0 + 1
            goto L2
        L27:
            int[] r0 = r6.f11360i
            int r0 = r0.length
        L2a:
            if (r1 >= r0) goto L39
            h7.m r2 = r6.f11363l
            int[] r3 = r6.f11360i
            r3 = r3[r1]
            long r3 = (long) r3
            r2.mo6885b(r7, r3)
            int r1 = r1 + 1
            goto L2a
        L39:
            h7.v0<?, ?> r0 = r6.f11364m
            r0.mo7192m(r7)
            boolean r0 = r6.f11357f
            if (r0 == 0) goto L47
            h7.ng<?> r0 = r6.f11365n
            r0.mo7007e(r7)
        L47:
            return
    }

    @Override // p124h7.InterfaceC2666i0
    /* renamed from: d */
    public final T mo6441d() {
            r3 = this;
            h7.x r0 = r3.f11356e
            h7.yg r0 = (p124h7.AbstractC2970yg) r0
            r1 = 4
            r2 = 0
            java.lang.Object r0 = r0.mo6484h(r1, r2, r2)
            return r0
    }

    @Override // p124h7.InterfaceC2666i0
    /* renamed from: e */
    public final int mo6442e(T r2) {
            r1 = this;
            boolean r0 = r1.f11359h
            if (r0 == 0) goto L9
            int r2 = r1.m6431L(r2)
            goto Ld
        L9:
            int r2 = r1.m6430K(r2)
        Ld:
            return r2
    }

    @Override // p124h7.InterfaceC2666i0
    /* renamed from: f */
    public final void mo6443f(T r11, p124h7.C2700jg r12) {
            r10 = this;
            boolean r0 = r10.f11359h
            if (r0 == 0) goto L460
            boolean r0 = r10.f11357f
            r1 = 0
            if (r0 != 0) goto L45a
            int[] r0 = r10.f11352a
            int r0 = r0.length
            r2 = 0
            r3 = 0
        Le:
            if (r3 >= r0) goto L450
            int r4 = r10.m6449l(r3)
            int[] r5 = r10.f11352a
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
            boolean r5 = r10.m6427A(r11, r6, r3)
            if (r5 == 0) goto L44c
            goto L308
        L2d:
            boolean r5 = r10.m6427A(r11, r6, r3)
            if (r5 == 0) goto L44c
            r4 = r4 & r9
            long r4 = (long) r4
            long r4 = m6425m(r11, r4)
            goto L323
        L3b:
            boolean r5 = r10.m6427A(r11, r6, r3)
            if (r5 == 0) goto L44c
            r4 = r4 & r9
            long r4 = (long) r4
            int r4 = m6424M(r11, r4)
            goto L334
        L49:
            boolean r5 = r10.m6427A(r11, r6, r3)
            if (r5 == 0) goto L44c
            r4 = r4 & r9
            long r4 = (long) r4
            long r4 = m6425m(r11, r4)
            goto L345
        L57:
            boolean r5 = r10.m6427A(r11, r6, r3)
            if (r5 == 0) goto L44c
            r4 = r4 & r9
            long r4 = (long) r4
            int r4 = m6424M(r11, r4)
            goto L358
        L65:
            boolean r5 = r10.m6427A(r11, r6, r3)
            if (r5 == 0) goto L44c
            r4 = r4 & r9
            long r4 = (long) r4
            int r4 = m6424M(r11, r4)
            goto L36b
        L73:
            boolean r5 = r10.m6427A(r11, r6, r3)
            if (r5 == 0) goto L44c
            r4 = r4 & r9
            long r4 = (long) r4
            int r4 = m6424M(r11, r4)
            goto L37e
        L81:
            boolean r5 = r10.m6427A(r11, r6, r3)
            if (r5 == 0) goto L44c
            goto L38b
        L89:
            boolean r5 = r10.m6427A(r11, r6, r3)
            if (r5 == 0) goto L44c
            goto L3a0
        L91:
            boolean r5 = r10.m6427A(r11, r6, r3)
            if (r5 == 0) goto L44c
            goto L3b5
        L99:
            boolean r5 = r10.m6427A(r11, r6, r3)
            if (r5 == 0) goto L44c
            r4 = r4 & r9
            long r4 = (long) r4
            boolean r4 = m6417B(r11, r4)
            goto L3cc
        La7:
            boolean r5 = r10.m6427A(r11, r6, r3)
            if (r5 == 0) goto L44c
            r4 = r4 & r9
            long r4 = (long) r4
            int r4 = m6424M(r11, r4)
            goto L3df
        Lb5:
            boolean r5 = r10.m6427A(r11, r6, r3)
            if (r5 == 0) goto L44c
            r4 = r4 & r9
            long r4 = (long) r4
            long r4 = m6425m(r11, r4)
            goto L3f1
        Lc3:
            boolean r5 = r10.m6427A(r11, r6, r3)
            if (r5 == 0) goto L44c
            r4 = r4 & r9
            long r4 = (long) r4
            int r4 = m6424M(r11, r4)
            goto L403
        Ld1:
            boolean r5 = r10.m6427A(r11, r6, r3)
            if (r5 == 0) goto L44c
            r4 = r4 & r9
            long r4 = (long) r4
            long r4 = m6425m(r11, r4)
            goto L415
        Ldf:
            boolean r5 = r10.m6427A(r11, r6, r3)
            if (r5 == 0) goto L44c
            r4 = r4 & r9
            long r4 = (long) r4
            long r4 = m6425m(r11, r4)
            goto L427
        Led:
            boolean r5 = r10.m6427A(r11, r6, r3)
            if (r5 == 0) goto L44c
            r4 = r4 & r9
            long r4 = (long) r4
            float r4 = m6423J(r11, r4)
            goto L439
        Lfb:
            boolean r5 = r10.m6427A(r11, r6, r3)
            if (r5 == 0) goto L44c
            r4 = r4 & r9
            long r4 = (long) r4
            double r4 = m6422I(r11, r4)
            goto L449
        L109:
            r4 = r4 & r9
            long r4 = (long) r4
            java.lang.Object r4 = p124h7.C2577d1.m6550j(r11, r4)
            if (r4 != 0) goto L113
            goto L44c
        L113:
            java.lang.Object r11 = r10.m6453q(r3)
            h7.r r11 = (p124h7.C2827r) r11
            throw r1
        L11a:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = p124h7.C2577d1.m6550j(r11, r6)
            java.util.List r4 = (java.util.List) r4
            h7.i0 r6 = r10.m6451o(r3)
            p124h7.C2702k0.m6917k(r5, r4, r12, r6)
            goto L44c
        L12d:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = p124h7.C2577d1.m6550j(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p124h7.C2702k0.m6924r(r5, r4, r12, r8)
            goto L44c
        L13c:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = p124h7.C2577d1.m6550j(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p124h7.C2702k0.m6923q(r5, r4, r12, r8)
            goto L44c
        L14b:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = p124h7.C2577d1.m6550j(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p124h7.C2702k0.m6922p(r5, r4, r12, r8)
            goto L44c
        L15a:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = p124h7.C2577d1.m6550j(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p124h7.C2702k0.m6921o(r5, r4, r12, r8)
            goto L44c
        L169:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = p124h7.C2577d1.m6550j(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p124h7.C2702k0.m6913g(r5, r4, r12, r8)
            goto L44c
        L178:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = p124h7.C2577d1.m6550j(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p124h7.C2702k0.m6926t(r5, r4, r12, r8)
            goto L44c
        L187:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = p124h7.C2577d1.m6550j(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p124h7.C2702k0.m6910d(r5, r4, r12, r8)
            goto L44c
        L196:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = p124h7.C2577d1.m6550j(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p124h7.C2702k0.m6914h(r5, r4, r12, r8)
            goto L44c
        L1a5:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = p124h7.C2577d1.m6550j(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p124h7.C2702k0.m6915i(r5, r4, r12, r8)
            goto L44c
        L1b4:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = p124h7.C2577d1.m6550j(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p124h7.C2702k0.m6918l(r5, r4, r12, r8)
            goto L44c
        L1c3:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = p124h7.C2577d1.m6550j(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p124h7.C2702k0.m6928v(r5, r4, r12, r8)
            goto L44c
        L1d2:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = p124h7.C2577d1.m6550j(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p124h7.C2702k0.m6919m(r5, r4, r12, r8)
            goto L44c
        L1e1:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = p124h7.C2577d1.m6550j(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p124h7.C2702k0.m6916j(r5, r4, r12, r8)
            goto L44c
        L1f0:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = p124h7.C2577d1.m6550j(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p124h7.C2702k0.m6912f(r5, r4, r12, r8)
            goto L44c
        L1ff:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = p124h7.C2577d1.m6550j(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p124h7.C2702k0.m6924r(r5, r4, r12, r2)
            goto L44c
        L20e:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = p124h7.C2577d1.m6550j(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p124h7.C2702k0.m6923q(r5, r4, r12, r2)
            goto L44c
        L21d:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = p124h7.C2577d1.m6550j(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p124h7.C2702k0.m6922p(r5, r4, r12, r2)
            goto L44c
        L22c:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = p124h7.C2577d1.m6550j(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p124h7.C2702k0.m6921o(r5, r4, r12, r2)
            goto L44c
        L23b:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = p124h7.C2577d1.m6550j(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p124h7.C2702k0.m6913g(r5, r4, r12, r2)
            goto L44c
        L24a:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = p124h7.C2577d1.m6550j(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p124h7.C2702k0.m6926t(r5, r4, r12, r2)
            goto L44c
        L259:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = p124h7.C2577d1.m6550j(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p124h7.C2702k0.m6911e(r5, r4, r12)
            goto L44c
        L268:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = p124h7.C2577d1.m6550j(r11, r6)
            java.util.List r4 = (java.util.List) r4
            h7.i0 r6 = r10.m6451o(r3)
            p124h7.C2702k0.m6920n(r5, r4, r12, r6)
            goto L44c
        L27b:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = p124h7.C2577d1.m6550j(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p124h7.C2702k0.m6925s(r5, r4, r12)
            goto L44c
        L28a:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = p124h7.C2577d1.m6550j(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p124h7.C2702k0.m6910d(r5, r4, r12, r2)
            goto L44c
        L299:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = p124h7.C2577d1.m6550j(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p124h7.C2702k0.m6914h(r5, r4, r12, r2)
            goto L44c
        L2a8:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = p124h7.C2577d1.m6550j(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p124h7.C2702k0.m6915i(r5, r4, r12, r2)
            goto L44c
        L2b7:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = p124h7.C2577d1.m6550j(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p124h7.C2702k0.m6918l(r5, r4, r12, r2)
            goto L44c
        L2c6:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = p124h7.C2577d1.m6550j(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p124h7.C2702k0.m6928v(r5, r4, r12, r2)
            goto L44c
        L2d5:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = p124h7.C2577d1.m6550j(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p124h7.C2702k0.m6919m(r5, r4, r12, r2)
            goto L44c
        L2e4:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = p124h7.C2577d1.m6550j(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p124h7.C2702k0.m6916j(r5, r4, r12, r2)
            goto L44c
        L2f3:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = p124h7.C2577d1.m6550j(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p124h7.C2702k0.m6912f(r5, r4, r12, r2)
            goto L44c
        L302:
            boolean r5 = r10.m6460y(r11, r3)
            if (r5 == 0) goto L44c
        L308:
            r4 = r4 & r9
            long r4 = (long) r4
            java.lang.Object r4 = p124h7.C2577d1.m6550j(r11, r4)
            h7.i0 r5 = r10.m6451o(r3)
            r12.m6881e(r6, r4, r5)
            goto L44c
        L317:
            boolean r5 = r10.m6460y(r11, r3)
            if (r5 == 0) goto L44c
            r4 = r4 & r9
            long r4 = (long) r4
            long r4 = p124h7.C2577d1.m6548h(r11, r4)
        L323:
            r12.m6878b(r6, r4)
            goto L44c
        L328:
            boolean r5 = r10.m6460y(r11, r3)
            if (r5 == 0) goto L44c
            r4 = r4 & r9
            long r4 = (long) r4
            int r4 = p124h7.C2577d1.m6547g(r11, r4)
        L334:
            r12.m6877a(r6, r4)
            goto L44c
        L339:
            boolean r5 = r10.m6460y(r11, r3)
            if (r5 == 0) goto L44c
            r4 = r4 & r9
            long r4 = (long) r4
            long r4 = p124h7.C2577d1.m6548h(r11, r4)
        L345:
            h7.ig r7 = r12.f11684a
            r7.mo6729p(r6, r4)
            goto L44c
        L34c:
            boolean r5 = r10.m6460y(r11, r3)
            if (r5 == 0) goto L44c
            r4 = r4 & r9
            long r4 = (long) r4
            int r4 = p124h7.C2577d1.m6547g(r11, r4)
        L358:
            h7.ig r5 = r12.f11684a
            r5.mo6727n(r6, r4)
            goto L44c
        L35f:
            boolean r5 = r10.m6460y(r11, r3)
            if (r5 == 0) goto L44c
            r4 = r4 & r9
            long r4 = (long) r4
            int r4 = p124h7.C2577d1.m6547g(r11, r4)
        L36b:
            h7.ig r5 = r12.f11684a
            r5.mo6731r(r6, r4)
            goto L44c
        L372:
            boolean r5 = r10.m6460y(r11, r3)
            if (r5 == 0) goto L44c
            r4 = r4 & r9
            long r4 = (long) r4
            int r4 = p124h7.C2577d1.m6547g(r11, r4)
        L37e:
            h7.ig r5 = r12.f11684a
            r5.mo6736w(r6, r4)
            goto L44c
        L385:
            boolean r5 = r10.m6460y(r11, r3)
            if (r5 == 0) goto L44c
        L38b:
            r4 = r4 & r9
            long r4 = (long) r4
            java.lang.Object r4 = p124h7.C2577d1.m6550j(r11, r4)
            h7.cg r4 = (p124h7.AbstractC2574cg) r4
            h7.ig r5 = r12.f11684a
            r5.mo6726m(r6, r4)
            goto L44c
        L39a:
            boolean r5 = r10.m6460y(r11, r3)
            if (r5 == 0) goto L44c
        L3a0:
            r4 = r4 & r9
            long r4 = (long) r4
            java.lang.Object r4 = p124h7.C2577d1.m6550j(r11, r4)
            h7.i0 r5 = r10.m6451o(r3)
            r12.m6882f(r6, r4, r5)
            goto L44c
        L3af:
            boolean r5 = r10.m6460y(r11, r3)
            if (r5 == 0) goto L44c
        L3b5:
            r4 = r4 & r9
            long r4 = (long) r4
            java.lang.Object r4 = p124h7.C2577d1.m6550j(r11, r4)
            m6418D(r6, r4, r12)
            goto L44c
        L3c0:
            boolean r5 = r10.m6460y(r11, r3)
            if (r5 == 0) goto L44c
            r4 = r4 & r9
            long r4 = (long) r4
            boolean r4 = p124h7.C2577d1.m6559s(r11, r4)
        L3cc:
            h7.ig r5 = r12.f11684a
            r5.mo6725l(r6, r4)
            goto L44c
        L3d3:
            boolean r5 = r10.m6460y(r11, r3)
            if (r5 == 0) goto L44c
            r4 = r4 & r9
            long r4 = (long) r4
            int r4 = p124h7.C2577d1.m6547g(r11, r4)
        L3df:
            h7.ig r5 = r12.f11684a
            r5.mo6727n(r6, r4)
            goto L44c
        L3e5:
            boolean r5 = r10.m6460y(r11, r3)
            if (r5 == 0) goto L44c
            r4 = r4 & r9
            long r4 = (long) r4
            long r4 = p124h7.C2577d1.m6548h(r11, r4)
        L3f1:
            h7.ig r7 = r12.f11684a
            r7.mo6729p(r6, r4)
            goto L44c
        L3f7:
            boolean r5 = r10.m6460y(r11, r3)
            if (r5 == 0) goto L44c
            r4 = r4 & r9
            long r4 = (long) r4
            int r4 = p124h7.C2577d1.m6547g(r11, r4)
        L403:
            h7.ig r5 = r12.f11684a
            r5.mo6731r(r6, r4)
            goto L44c
        L409:
            boolean r5 = r10.m6460y(r11, r3)
            if (r5 == 0) goto L44c
            r4 = r4 & r9
            long r4 = (long) r4
            long r4 = p124h7.C2577d1.m6548h(r11, r4)
        L415:
            h7.ig r7 = r12.f11684a
            r7.mo6738y(r6, r4)
            goto L44c
        L41b:
            boolean r5 = r10.m6460y(r11, r3)
            if (r5 == 0) goto L44c
            r4 = r4 & r9
            long r4 = (long) r4
            long r4 = p124h7.C2577d1.m6548h(r11, r4)
        L427:
            h7.ig r7 = r12.f11684a
            r7.mo6738y(r6, r4)
            goto L44c
        L42d:
            boolean r5 = r10.m6460y(r11, r3)
            if (r5 == 0) goto L44c
            r4 = r4 & r9
            long r4 = (long) r4
            float r4 = p124h7.C2577d1.m6546f(r11, r4)
        L439:
            r12.m6880d(r6, r4)
            goto L44c
        L43d:
            boolean r5 = r10.m6460y(r11, r3)
            if (r5 == 0) goto L44c
            r4 = r4 & r9
            long r4 = (long) r4
            double r4 = p124h7.C2577d1.m6545e(r11, r4)
        L449:
            r12.m6879c(r6, r4)
        L44c:
            int r3 = r3 + 3
            goto Le
        L450:
            h7.v0<?, ?> r0 = r10.f11364m
            java.lang.Object r11 = r0.mo7183d(r11)
            r0.mo7197r(r11, r12)
            return
        L45a:
            h7.ng<?> r12 = r10.f11365n
            r12.mo7003a(r11)
            throw r1
        L460:
            r10.m6428C(r11, r12)
            return
    }

    @Override // p124h7.InterfaceC2666i0
    /* renamed from: g */
    public final void mo6444g(T r17, p124h7.C2610eg r18, p124h7.C2754mg r19) {
            r16 = this;
            r1 = r16
            r2 = r17
            r0 = r18
            r10 = r19
            java.util.Objects.requireNonNull(r19)
            h7.v0<?, ?> r11 = r1.f11364m
            h7.ng<?> r12 = r1.f11365n
            r3 = 0
            r14 = 0
        L11:
            int r4 = r18.m6675u()     // Catch: java.lang.Throwable -> Lad
            int r5 = r1.m6436R(r4)     // Catch: java.lang.Throwable -> Lad
            if (r5 >= 0) goto L80
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 != r5) goto L36
            int r0 = r1.f11361j
        L22:
            int r3 = r1.f11362k
            if (r0 >= r3) goto L30
            int[] r3 = r1.f11360i
            r3 = r3[r0]
            r1.m6452p(r2, r3, r14)
            int r0 = r0 + 1
            goto L22
        L30:
            if (r14 == 0) goto L57f
            r11.mo7193n(r2, r14)
            return
        L36:
            boolean r5 = r1.f11357f     // Catch: java.lang.Throwable -> Lad
            if (r5 != 0) goto L3c
            r5 = 0
            goto L43
        L3c:
            h7.x r5 = r1.f11356e     // Catch: java.lang.Throwable -> Lad
            java.lang.Object r4 = r12.mo7005c(r10, r5, r4)     // Catch: java.lang.Throwable -> Lad
            r5 = r4
        L43:
            if (r5 == 0) goto L5a
            if (r3 != 0) goto L4b
            h7.rg r3 = r12.mo7004b(r2)     // Catch: java.lang.Throwable -> Lad
        L4b:
            r15 = r3
            r3 = r12
            r4 = r18
            r6 = r19
            r7 = r15
            r8 = r14
            r9 = r11
            java.lang.Object r14 = r3.mo7006d(r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> Lad
            r3 = r15
            goto L11
        L5a:
            r11.mo7196q(r0)     // Catch: java.lang.Throwable -> Lad
            if (r14 != 0) goto L64
            java.lang.Object r4 = r11.mo7182c(r2)     // Catch: java.lang.Throwable -> Lad
            r14 = r4
        L64:
            boolean r4 = r11.m7195p(r14, r0)     // Catch: java.lang.Throwable -> Lad
            if (r4 != 0) goto L11
            int r0 = r1.f11361j
        L6c:
            int r3 = r1.f11362k
            if (r0 >= r3) goto L7a
            int[] r3 = r1.f11360i
            r3 = r3[r0]
            r1.m6452p(r2, r3, r14)
            int r0 = r0 + 1
            goto L6c
        L7a:
            if (r14 == 0) goto L57f
            r11.mo7193n(r2, r14)
            return
        L80:
            int r6 = r1.m6449l(r5)     // Catch: java.lang.Throwable -> Lad
            int r7 = r6 >>> 20
            r7 = r7 & 255(0xff, float:3.57E-43)
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r9 = 3
            r15 = 1
            r13 = 0
            switch(r7) {
                case 0: goto L525;
                case 1: goto L50e;
                case 2: goto L505;
                case 3: goto L4f7;
                case 4: goto L4e7;
                case 5: goto L4de;
                case 6: goto L4d3;
                case 7: goto L4c1;
                case 8: goto L4bc;
                case 9: goto L487;
                case 10: goto L47c;
                case 11: goto L472;
                case 12: goto L44c;
                case 13: goto L43c;
                case 14: goto L42f;
                case 15: goto L418;
                case 16: goto L403;
                case 17: goto L3d0;
                case 18: goto L3c7;
                case 19: goto L3be;
                case 20: goto L3b5;
                case 21: goto L3ac;
                case 22: goto L3a3;
                case 23: goto L39a;
                case 24: goto L391;
                case 25: goto L388;
                case 26: goto L362;
                case 27: goto L350;
                case 28: goto L342;
                case 29: goto L339;
                case 30: goto L326;
                case 31: goto L31d;
                case 32: goto L314;
                case 33: goto L30b;
                case 34: goto L302;
                case 35: goto L2f7;
                case 36: goto L2ec;
                case 37: goto L2e1;
                case 38: goto L2d6;
                case 39: goto L2cb;
                case 40: goto L2c0;
                case 41: goto L2b5;
                case 42: goto L2aa;
                case 43: goto L29f;
                case 44: goto L28d;
                case 45: goto L281;
                case 46: goto L275;
                case 47: goto L269;
                case 48: goto L25d;
                case 49: goto L24a;
                case 50: goto L20e;
                case 51: goto L1f2;
                case 52: goto L1da;
                case 53: goto L1cc;
                case 54: goto L1b9;
                case 55: goto L1a6;
                case 56: goto L198;
                case 57: goto L18a;
                case 58: goto L177;
                case 59: goto L172;
                case 60: goto L13b;
                case 61: goto L131;
                case 62: goto L123;
                case 63: goto L101;
                case 64: goto Lee;
                case 65: goto Ldc;
                case 66: goto Lc6;
                case 67: goto Lb0;
                case 68: goto L99;
                default: goto L91;
            }
        L91:
            if (r14 != 0) goto L53e
            java.lang.Object r4 = r11.mo7185f()     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            goto L53d
        L99:
            r6 = r6 & r8
            long r6 = (long) r6     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            h7.i0 r8 = r1.m6451o(r5)     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            r0.m6674r(r9)     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            java.lang.Object r8 = r0.m6671o(r8, r10)     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            e7.i8 r9 = p124h7.C2577d1.f11435c     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
        La8:
            r9.m4264N(r2, r6, r8)     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            goto L209
        Lad:
            r0 = move-exception
            goto L580
        Lb0:
            r6 = r6 & r8
            long r6 = (long) r6     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            r0.m6674r(r13)     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            h7.dg r8 = r0.f11499a     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            long r8 = r8.m6626g()     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            long r8 = p124h7.C2592dg.m6619o(r8)     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            java.lang.Long r8 = java.lang.Long.valueOf(r8)     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            e7.i8 r9 = p124h7.C2577d1.f11435c     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            goto La8
        Lc6:
            r6 = r6 & r8
            long r6 = (long) r6     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            r0.m6674r(r13)     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            h7.dg r8 = r0.f11499a     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            int r8 = r8.m6623d()     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            int r8 = p124h7.C2592dg.m6618n(r8)     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            e7.i8 r9 = p124h7.C2577d1.f11435c     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            goto La8
        Ldc:
            r6 = r6 & r8
            long r6 = (long) r6     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            r0.m6674r(r15)     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            h7.dg r8 = r0.f11499a     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            long r8 = r8.m6625f()     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            java.lang.Long r8 = java.lang.Long.valueOf(r8)     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            e7.i8 r9 = p124h7.C2577d1.f11435c     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            goto La8
        Lee:
            r6 = r6 & r8
            long r6 = (long) r6     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            r8 = 5
            r0.m6674r(r8)     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            h7.dg r8 = r0.f11499a     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            int r8 = r8.m6622c()     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            e7.i8 r9 = p124h7.C2577d1.f11435c     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            goto La8
        L101:
            r0.m6674r(r13)     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            h7.dg r7 = r0.f11499a     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            int r7 = r7.m6623d()     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            h7.b r9 = r1.m6450n(r5)     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            if (r9 == 0) goto L116
            boolean r9 = r9.m6476a()     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            if (r9 == 0) goto L462
        L116:
            r6 = r6 & r8
            long r8 = (long) r6     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            java.lang.Integer r6 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            e7.i8 r7 = p124h7.C2577d1.f11435c     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            r7.m4264N(r2, r8, r6)     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            goto L209
        L123:
            r6 = r6 & r8
            long r6 = (long) r6     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            int r8 = r18.m6677w()     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            e7.i8 r9 = p124h7.C2577d1.f11435c     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            goto La8
        L131:
            r6 = r6 & r8
            long r6 = (long) r6     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            h7.cg r8 = r18.m6680z()     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            e7.i8 r9 = p124h7.C2577d1.f11435c     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            goto La8
        L13b:
            boolean r7 = r1.m6427A(r2, r4, r5)     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            r6 = r6 & r8
            if (r7 == 0) goto L15b
            long r6 = (long) r6     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            java.lang.Object r8 = p124h7.C2577d1.m6550j(r2, r6)     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            h7.i0 r9 = r1.m6451o(r5)     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            r13 = 2
            r0.m6674r(r13)     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            java.lang.Object r9 = r0.m6672p(r9, r10)     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            java.lang.Object r8 = p124h7.C2575d.m6540c(r8, r9)     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            e7.i8 r9 = p124h7.C2577d1.f11435c     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            goto La8
        L15b:
            long r6 = (long) r6     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            h7.i0 r8 = r1.m6451o(r5)     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            r9 = 2
            r0.m6674r(r9)     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            java.lang.Object r8 = r0.m6672p(r8, r10)     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            e7.i8 r9 = p124h7.C2577d1.f11435c     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            r9.m4264N(r2, r6, r8)     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            r1.m6457v(r2, r5)     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            goto L209
        L172:
            r1.m6456u(r2, r6, r0)     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            goto L209
        L177:
            r6 = r6 & r8
            long r6 = (long) r6     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            r0.m6674r(r13)     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            h7.dg r8 = r0.f11499a     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            boolean r8 = r8.m6631l()     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            e7.i8 r9 = p124h7.C2577d1.f11435c     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            goto La8
        L18a:
            r6 = r6 & r8
            long r6 = (long) r6     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            int r8 = r18.m6676v()     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            e7.i8 r9 = p124h7.C2577d1.f11435c     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            goto La8
        L198:
            r6 = r6 & r8
            long r6 = (long) r6     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            long r8 = r18.m6678x()     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            java.lang.Long r8 = java.lang.Long.valueOf(r8)     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            e7.i8 r9 = p124h7.C2577d1.f11435c     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            goto La8
        L1a6:
            r6 = r6 & r8
            long r6 = (long) r6     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            r0.m6674r(r13)     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            h7.dg r8 = r0.f11499a     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            int r8 = r8.m6623d()     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            e7.i8 r9 = p124h7.C2577d1.f11435c     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            goto La8
        L1b9:
            r6 = r6 & r8
            long r6 = (long) r6     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            r0.m6674r(r13)     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            h7.dg r8 = r0.f11499a     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            long r8 = r8.m6626g()     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            java.lang.Long r8 = java.lang.Long.valueOf(r8)     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            e7.i8 r9 = p124h7.C2577d1.f11435c     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            goto La8
        L1cc:
            r6 = r6 & r8
            long r6 = (long) r6     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            long r8 = r18.m6679y()     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            java.lang.Long r8 = java.lang.Long.valueOf(r8)     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            e7.i8 r9 = p124h7.C2577d1.f11435c     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            goto La8
        L1da:
            r6 = r6 & r8
            long r6 = (long) r6     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            r8 = 5
            r0.m6674r(r8)     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            h7.dg r8 = r0.f11499a     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            int r8 = r8.m6622c()     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            float r8 = java.lang.Float.intBitsToFloat(r8)     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            java.lang.Float r8 = java.lang.Float.valueOf(r8)     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            e7.i8 r9 = p124h7.C2577d1.f11435c     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            goto La8
        L1f2:
            r6 = r6 & r8
            long r6 = (long) r6     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            r0.m6674r(r15)     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            h7.dg r8 = r0.f11499a     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            long r8 = r8.m6625f()     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            double r8 = java.lang.Double.longBitsToDouble(r8)     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            java.lang.Double r8 = java.lang.Double.valueOf(r8)     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            e7.i8 r9 = p124h7.C2577d1.f11435c     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            goto La8
        L209:
            r1.m6458w(r2, r4, r5)     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            goto L11
        L20e:
            java.lang.Object r4 = r1.m6453q(r5)     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            int r5 = r1.m6449l(r5)     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            r5 = r5 & r8
            long r5 = (long) r5     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            java.lang.Object r7 = p124h7.C2577d1.m6550j(r2, r5)     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            if (r7 == 0) goto L236
            r8 = r7
            h7.s r8 = (p124h7.C2845s) r8     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            boolean r8 = r8.f11894Y     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            r8 = r8 ^ r15
            if (r8 == 0) goto L241
            h7.s r8 = p124h7.C2845s.f11893Z     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            h7.s r8 = r8.m7111a()     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            p124h7.C2863t.m7144b(r8, r7)     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            e7.i8 r7 = p124h7.C2577d1.f11435c     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            r7.m4264N(r2, r5, r8)     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            r7 = r8
            goto L241
        L236:
            h7.s r7 = p124h7.C2845s.f11893Z     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L247
            h7.s r7 = r7.m7111a()     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            e7.i8 r8 = p124h7.C2577d1.f11435c     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L247
            r8.m4264N(r2, r5, r7)     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L247
        L241:
            h7.s r7 = (p124h7.C2845s) r7     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            h7.r r4 = (p124h7.C2827r) r4     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            r7 = 0
            throw r7     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
        L247:
            r7 = 0
            goto L55a
        L24a:
            r7 = 0
            r4 = r6 & r8
            long r8 = (long) r4     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            h7.i0 r4 = r1.m6451o(r5)     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            h7.m r5 = r1.f11363l     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            java.util.List r5 = r5.mo6884a(r2, r8)     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            r0.m6659c(r5, r4, r10)     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            goto L11
        L25d:
            r7 = 0
            h7.m r4 = r1.f11363l     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
        L260:
            r5 = r6 & r8
            long r5 = (long) r5     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            java.util.List r4 = r4.mo6884a(r2, r5)     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            goto L306
        L269:
            r7 = 0
            h7.m r4 = r1.f11363l     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
        L26c:
            r5 = r6 & r8
            long r5 = (long) r5     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            java.util.List r4 = r4.mo6884a(r2, r5)     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            goto L30f
        L275:
            r7 = 0
            h7.m r4 = r1.f11363l     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
        L278:
            r5 = r6 & r8
            long r5 = (long) r5     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            java.util.List r4 = r4.mo6884a(r2, r5)     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            goto L318
        L281:
            r7 = 0
            h7.m r4 = r1.f11363l     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
        L284:
            r5 = r6 & r8
            long r5 = (long) r5     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            java.util.List r4 = r4.mo6884a(r2, r5)     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            goto L321
        L28d:
            r7 = 0
            h7.m r9 = r1.f11363l     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            r6 = r6 & r8
            long r7 = (long) r6     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            java.util.List r6 = r9.mo6884a(r2, r7)     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            r0.m6655F(r6)     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
        L299:
            h7.b r5 = r1.m6450n(r5)     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            goto L333
        L29f:
            h7.m r4 = r1.f11363l     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
        L2a1:
            r5 = r6 & r8
            long r5 = (long) r5     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            java.util.List r4 = r4.mo6884a(r2, r5)     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            goto L33d
        L2aa:
            h7.m r4 = r1.f11363l     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
        L2ac:
            r5 = r6 & r8
            long r5 = (long) r5     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            java.util.List r4 = r4.mo6884a(r2, r5)     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            goto L38c
        L2b5:
            h7.m r4 = r1.f11363l     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
        L2b7:
            r5 = r6 & r8
            long r5 = (long) r5     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            java.util.List r4 = r4.mo6884a(r2, r5)     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            goto L395
        L2c0:
            h7.m r4 = r1.f11363l     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
        L2c2:
            r5 = r6 & r8
            long r5 = (long) r5     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            java.util.List r4 = r4.mo6884a(r2, r5)     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            goto L39e
        L2cb:
            h7.m r4 = r1.f11363l     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
        L2cd:
            r5 = r6 & r8
            long r5 = (long) r5     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            java.util.List r4 = r4.mo6884a(r2, r5)     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            goto L3a7
        L2d6:
            h7.m r4 = r1.f11363l     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
        L2d8:
            r5 = r6 & r8
            long r5 = (long) r5     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            java.util.List r4 = r4.mo6884a(r2, r5)     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            goto L3b0
        L2e1:
            h7.m r4 = r1.f11363l     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
        L2e3:
            r5 = r6 & r8
            long r5 = (long) r5     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            java.util.List r4 = r4.mo6884a(r2, r5)     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            goto L3b9
        L2ec:
            h7.m r4 = r1.f11363l     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
        L2ee:
            r5 = r6 & r8
            long r5 = (long) r5     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            java.util.List r4 = r4.mo6884a(r2, r5)     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            goto L3c2
        L2f7:
            h7.m r4 = r1.f11363l     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
        L2f9:
            r5 = r6 & r8
            long r5 = (long) r5     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            java.util.List r4 = r4.mo6884a(r2, r5)     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            goto L3cb
        L302:
            h7.m r4 = r1.f11363l     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            goto L260
        L306:
            r0.m6666j(r4)     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            goto L11
        L30b:
            h7.m r4 = r1.f11363l     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            goto L26c
        L30f:
            r0.m6665i(r4)     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            goto L11
        L314:
            h7.m r4 = r1.f11363l     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            goto L278
        L318:
            r0.m6664h(r4)     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            goto L11
        L31d:
            h7.m r4 = r1.f11363l     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            goto L284
        L321:
            r0.m6663g(r4)     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            goto L11
        L326:
            h7.m r7 = r1.f11363l     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            r6 = r6 & r8
            long r8 = (long) r6     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            java.util.List r6 = r7.mo6884a(r2, r8)     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            r0.m6655F(r6)     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            goto L299
        L333:
            java.lang.Object r14 = p124h7.C2702k0.m6907a(r4, r6, r5, r14, r11)     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            goto L11
        L339:
            h7.m r4 = r1.f11363l     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            goto L2a1
        L33d:
            r0.m6668l(r4)     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            goto L11
        L342:
            h7.m r4 = r1.f11363l     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            r5 = r6 & r8
            long r5 = (long) r5     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            java.util.List r4 = r4.mo6884a(r2, r5)     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            r0.m6653D(r4)     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            goto L11
        L350:
            h7.i0 r4 = r1.m6451o(r5)     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            r5 = r6 & r8
            long r5 = (long) r5     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            h7.m r7 = r1.f11363l     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            java.util.List r5 = r7.mo6884a(r2, r5)     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            r0.m6662f(r5, r4, r10)     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            goto L11
        L362:
            r4 = 536870912(0x20000000, float:1.0842022E-19)
            r4 = r4 & r6
            if (r4 == 0) goto L369
            r4 = 1
            goto L36a
        L369:
            r4 = 0
        L36a:
            if (r4 == 0) goto L37a
            h7.m r4 = r1.f11363l     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            r5 = r6 & r8
            long r5 = (long) r5     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            java.util.List r4 = r4.mo6884a(r2, r5)     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            r0.m6667k(r4, r15)     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            goto L11
        L37a:
            h7.m r4 = r1.f11363l     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            r5 = r6 & r8
            long r5 = (long) r5     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            java.util.List r4 = r4.mo6884a(r2, r5)     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            r0.m6667k(r4, r13)     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            goto L11
        L388:
            h7.m r4 = r1.f11363l     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            goto L2ac
        L38c:
            r0.m6652C(r4)     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            goto L11
        L391:
            h7.m r4 = r1.f11363l     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            goto L2b7
        L395:
            r0.m6656G(r4)     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            goto L11
        L39a:
            h7.m r4 = r1.f11363l     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            goto L2c2
        L39e:
            r0.m6657a(r4)     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            goto L11
        L3a3:
            h7.m r4 = r1.f11363l     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            goto L2cd
        L3a7:
            r0.m6660d(r4)     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            goto L11
        L3ac:
            h7.m r4 = r1.f11363l     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            goto L2d8
        L3b0:
            r0.m6669m(r4)     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            goto L11
        L3b5:
            h7.m r4 = r1.f11363l     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            goto L2e3
        L3b9:
            r0.m6661e(r4)     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            goto L11
        L3be:
            h7.m r4 = r1.f11363l     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            goto L2ee
        L3c2:
            r0.m6658b(r4)     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            goto L11
        L3c7:
            h7.m r4 = r1.f11363l     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            goto L2f9
        L3cb:
            r0.m6654E(r4)     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            goto L11
        L3d0:
            boolean r4 = r1.m6460y(r2, r5)     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            if (r4 == 0) goto L3ee
            r4 = r6 & r8
            long r6 = (long) r4     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            java.lang.Object r4 = p124h7.C2577d1.m6550j(r2, r6)     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            h7.i0 r5 = r1.m6451o(r5)     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            r0.m6674r(r9)     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            java.lang.Object r5 = r0.m6671o(r5, r10)     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
        L3e8:
            java.lang.Object r4 = p124h7.C2575d.m6540c(r4, r5)     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            goto L4a2
        L3ee:
            r4 = r6 & r8
            long r6 = (long) r4     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            h7.i0 r4 = r1.m6451o(r5)     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            r0.m6674r(r9)     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            java.lang.Object r4 = r0.m6671o(r4, r10)     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            e7.i8 r8 = p124h7.C2577d1.f11435c     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
        L3fe:
            r8.m4264N(r2, r6, r4)     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            goto L538
        L403:
            r4 = r6 & r8
            long r6 = (long) r4     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            r0.m6674r(r13)     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            h7.dg r4 = r0.f11499a     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            long r8 = r4.m6626g()     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            long r8 = p124h7.C2592dg.m6619o(r8)     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
        L413:
            p124h7.C2577d1.m6555o(r2, r6, r8)     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            goto L538
        L418:
            r4 = r6 & r8
            long r6 = (long) r4     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            r0.m6674r(r13)     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            h7.dg r4 = r0.f11499a     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            int r4 = r4.m6623d()     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            int r4 = p124h7.C2592dg.m6618n(r4)     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            e7.i8 r8 = p124h7.C2577d1.f11435c     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
        L42a:
            r8.m4262F(r2, r6, r4)     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            goto L538
        L42f:
            r4 = r6 & r8
            long r6 = (long) r4     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            r0.m6674r(r15)     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            h7.dg r4 = r0.f11499a     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            long r8 = r4.m6625f()     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            goto L413
        L43c:
            r4 = r6 & r8
            long r6 = (long) r4     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            r4 = 5
            r0.m6674r(r4)     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            h7.dg r4 = r0.f11499a     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            int r4 = r4.m6622c()     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            e7.i8 r8 = p124h7.C2577d1.f11435c     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            goto L42a
        L44c:
            r0.m6674r(r13)     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            h7.dg r7 = r0.f11499a     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            int r7 = r7.m6623d()     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            h7.b r9 = r1.m6450n(r5)     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            if (r9 == 0) goto L468
            boolean r9 = r9.m6476a()     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            if (r9 == 0) goto L462
            goto L468
        L462:
            java.lang.Object r14 = p124h7.C2702k0.m6908b(r4, r7, r14, r11)     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            goto L11
        L468:
            r4 = r6 & r8
            long r8 = (long) r4     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            e7.i8 r4 = p124h7.C2577d1.f11435c     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            r4.m4262F(r2, r8, r7)     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            goto L538
        L472:
            r4 = r6 & r8
            long r6 = (long) r4     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            int r4 = r18.m6677w()     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            e7.i8 r8 = p124h7.C2577d1.f11435c     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            goto L42a
        L47c:
            r4 = r6 & r8
            long r6 = (long) r4     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            h7.cg r4 = r18.m6680z()     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            e7.i8 r8 = p124h7.C2577d1.f11435c     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            goto L3fe
        L487:
            boolean r4 = r1.m6460y(r2, r5)     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            if (r4 == 0) goto L4a9
            r4 = r6 & r8
            long r6 = (long) r4     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            java.lang.Object r4 = p124h7.C2577d1.m6550j(r2, r6)     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            h7.i0 r5 = r1.m6451o(r5)     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            r8 = 2
            r0.m6674r(r8)     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            java.lang.Object r5 = r0.m6672p(r5, r10)     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            goto L3e8
        L4a2:
            e7.i8 r5 = p124h7.C2577d1.f11435c     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            r5.m4264N(r2, r6, r4)     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            goto L11
        L4a9:
            r4 = r6 & r8
            long r6 = (long) r4     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            h7.i0 r4 = r1.m6451o(r5)     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            r8 = 2
            r0.m6674r(r8)     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            java.lang.Object r4 = r0.m6672p(r4, r10)     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            e7.i8 r8 = p124h7.C2577d1.f11435c     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            goto L3fe
        L4bc:
            r1.m6456u(r2, r6, r0)     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            goto L538
        L4c1:
            r4 = r6 & r8
            long r6 = (long) r4     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            r0.m6674r(r13)     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            h7.dg r4 = r0.f11499a     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            boolean r4 = r4.m6631l()     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            e7.i8 r8 = p124h7.C2577d1.f11435c     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            r8.mo4205c(r2, r6, r4)     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            goto L538
        L4d3:
            r4 = r6 & r8
            long r6 = (long) r4     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            int r4 = r18.m6676v()     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            e7.i8 r8 = p124h7.C2577d1.f11435c     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            goto L42a
        L4de:
            r4 = r6 & r8
            long r6 = (long) r4     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            long r8 = r18.m6678x()     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            goto L413
        L4e7:
            r4 = r6 & r8
            long r6 = (long) r4     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            r0.m6674r(r13)     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            h7.dg r4 = r0.f11499a     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            int r4 = r4.m6623d()     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            e7.i8 r8 = p124h7.C2577d1.f11435c     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            goto L42a
        L4f7:
            r4 = r6 & r8
            long r6 = (long) r4     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            r0.m6674r(r13)     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            h7.dg r4 = r0.f11499a     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            long r8 = r4.m6626g()     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            goto L413
        L505:
            r4 = r6 & r8
            long r6 = (long) r4     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            long r8 = r18.m6679y()     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            goto L413
        L50e:
            r4 = r6 & r8
            long r6 = (long) r4     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            r4 = 5
            r0.m6674r(r4)     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            h7.dg r4 = r0.f11499a     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            int r4 = r4.m6622c()     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            float r4 = java.lang.Float.intBitsToFloat(r4)     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            e7.i8 r8 = p124h7.C2577d1.f11435c     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            r8.mo4208f(r2, r6, r4)     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            goto L538
        L525:
            r4 = r6 & r8
            long r6 = (long) r4     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            r0.m6674r(r15)     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            h7.dg r4 = r0.f11499a     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            long r8 = r4.m6625f()     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            double r8 = java.lang.Double.longBitsToDouble(r8)     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            p124h7.C2577d1.m6554n(r2, r6, r8)     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
        L538:
            r1.m6457v(r2, r5)     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            goto L11
        L53d:
            r14 = r4
        L53e:
            boolean r4 = r11.m7195p(r14, r0)     // Catch: java.lang.Throwable -> Lad p124h7.C2593e -> L55a
            if (r4 != 0) goto L11
            int r0 = r1.f11361j
        L546:
            int r3 = r1.f11362k
            if (r0 >= r3) goto L554
            int[] r3 = r1.f11360i
            r3 = r3[r0]
            r1.m6452p(r2, r3, r14)
            int r0 = r0 + 1
            goto L546
        L554:
            if (r14 == 0) goto L57f
            r11.mo7193n(r2, r14)
            return
        L55a:
            r11.mo7196q(r0)     // Catch: java.lang.Throwable -> Lad
            if (r14 != 0) goto L564
            java.lang.Object r4 = r11.mo7182c(r2)     // Catch: java.lang.Throwable -> Lad
            r14 = r4
        L564:
            boolean r4 = r11.m7195p(r14, r0)     // Catch: java.lang.Throwable -> Lad
            if (r4 != 0) goto L11
            int r0 = r1.f11361j
        L56c:
            int r3 = r1.f11362k
            if (r0 >= r3) goto L57a
            int[] r3 = r1.f11360i
            r3 = r3[r0]
            r1.m6452p(r2, r3, r14)
            int r0 = r0 + 1
            goto L56c
        L57a:
            if (r14 == 0) goto L57f
            r11.mo7193n(r2, r14)
        L57f:
            return
        L580:
            int r3 = r1.f11361j
        L582:
            int r4 = r1.f11362k
            if (r3 >= r4) goto L590
            int[] r4 = r1.f11360i
            r4 = r4[r3]
            r1.m6452p(r2, r4, r14)
            int r3 = r3 + 1
            goto L582
        L590:
            if (r14 == 0) goto L595
            r11.mo7193n(r2, r14)
        L595:
            throw r0
    }

    @Override // p124h7.InterfaceC2666i0
    /* renamed from: h */
    public final boolean mo6445h(T r9, T r10) {
            r8 = this;
            int[] r0 = r8.f11352a
            int r0 = r0.length
            r1 = 0
            r2 = 0
        L5:
            if (r2 >= r0) goto L1ba
            int r3 = r8.m6449l(r2)
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
            int r3 = r8.m6437S(r2)
            r3 = r3 & r4
            long r3 = (long) r3
            int r7 = p124h7.C2577d1.m6547g(r9, r3)
            int r3 = p124h7.C2577d1.m6547g(r10, r3)
            if (r7 != r3) goto L1b5
            java.lang.Object r3 = p124h7.C2577d1.m6550j(r9, r5)
            java.lang.Object r4 = p124h7.C2577d1.m6550j(r10, r5)
            boolean r3 = p124h7.C2702k0.m6909c(r3, r4)
            if (r3 != 0) goto L1b6
            goto L1b5
        L3a:
            java.lang.Object r3 = p124h7.C2577d1.m6550j(r9, r5)
            java.lang.Object r4 = p124h7.C2577d1.m6550j(r10, r5)
            boolean r3 = p124h7.C2702k0.m6909c(r3, r4)
            if (r3 != 0) goto L1b6
            goto L1b5
        L4a:
            boolean r3 = r8.m6459x(r9, r10, r2)
            if (r3 == 0) goto L1b5
            java.lang.Object r3 = p124h7.C2577d1.m6550j(r9, r5)
            java.lang.Object r4 = p124h7.C2577d1.m6550j(r10, r5)
            boolean r3 = p124h7.C2702k0.m6909c(r3, r4)
            if (r3 == 0) goto L1b5
            goto L1b6
        L60:
            boolean r3 = r8.m6459x(r9, r10, r2)
            if (r3 == 0) goto L1b5
            long r3 = p124h7.C2577d1.m6548h(r9, r5)
            long r5 = p124h7.C2577d1.m6548h(r10, r5)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L1b5
            goto L1b6
        L74:
            boolean r3 = r8.m6459x(r9, r10, r2)
            if (r3 == 0) goto L1b5
            int r3 = p124h7.C2577d1.m6547g(r9, r5)
            int r4 = p124h7.C2577d1.m6547g(r10, r5)
            if (r3 != r4) goto L1b5
            goto L1b6
        L86:
            boolean r3 = r8.m6459x(r9, r10, r2)
            if (r3 == 0) goto L1b5
            long r3 = p124h7.C2577d1.m6548h(r9, r5)
            long r5 = p124h7.C2577d1.m6548h(r10, r5)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L1b5
            goto L1b6
        L9a:
            boolean r3 = r8.m6459x(r9, r10, r2)
            if (r3 == 0) goto L1b5
            int r3 = p124h7.C2577d1.m6547g(r9, r5)
            int r4 = p124h7.C2577d1.m6547g(r10, r5)
            if (r3 != r4) goto L1b5
            goto L1b6
        Lac:
            boolean r3 = r8.m6459x(r9, r10, r2)
            if (r3 == 0) goto L1b5
            int r3 = p124h7.C2577d1.m6547g(r9, r5)
            int r4 = p124h7.C2577d1.m6547g(r10, r5)
            if (r3 != r4) goto L1b5
            goto L1b6
        Lbe:
            boolean r3 = r8.m6459x(r9, r10, r2)
            if (r3 == 0) goto L1b5
            int r3 = p124h7.C2577d1.m6547g(r9, r5)
            int r4 = p124h7.C2577d1.m6547g(r10, r5)
            if (r3 != r4) goto L1b5
            goto L1b6
        Ld0:
            boolean r3 = r8.m6459x(r9, r10, r2)
            if (r3 == 0) goto L1b5
            java.lang.Object r3 = p124h7.C2577d1.m6550j(r9, r5)
            java.lang.Object r4 = p124h7.C2577d1.m6550j(r10, r5)
            boolean r3 = p124h7.C2702k0.m6909c(r3, r4)
            if (r3 == 0) goto L1b5
            goto L1b6
        Le6:
            boolean r3 = r8.m6459x(r9, r10, r2)
            if (r3 == 0) goto L1b5
            java.lang.Object r3 = p124h7.C2577d1.m6550j(r9, r5)
            java.lang.Object r4 = p124h7.C2577d1.m6550j(r10, r5)
            boolean r3 = p124h7.C2702k0.m6909c(r3, r4)
            if (r3 == 0) goto L1b5
            goto L1b6
        Lfc:
            boolean r3 = r8.m6459x(r9, r10, r2)
            if (r3 == 0) goto L1b5
            java.lang.Object r3 = p124h7.C2577d1.m6550j(r9, r5)
            java.lang.Object r4 = p124h7.C2577d1.m6550j(r10, r5)
            boolean r3 = p124h7.C2702k0.m6909c(r3, r4)
            if (r3 == 0) goto L1b5
            goto L1b6
        L112:
            boolean r3 = r8.m6459x(r9, r10, r2)
            if (r3 == 0) goto L1b5
            boolean r3 = p124h7.C2577d1.m6559s(r9, r5)
            boolean r4 = p124h7.C2577d1.m6559s(r10, r5)
            if (r3 != r4) goto L1b5
            goto L1b6
        L124:
            boolean r3 = r8.m6459x(r9, r10, r2)
            if (r3 == 0) goto L1b5
            int r3 = p124h7.C2577d1.m6547g(r9, r5)
            int r4 = p124h7.C2577d1.m6547g(r10, r5)
            if (r3 != r4) goto L1b5
            goto L1b6
        L136:
            boolean r3 = r8.m6459x(r9, r10, r2)
            if (r3 == 0) goto L1b5
            long r3 = p124h7.C2577d1.m6548h(r9, r5)
            long r5 = p124h7.C2577d1.m6548h(r10, r5)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L1b5
            goto L1b6
        L14a:
            boolean r3 = r8.m6459x(r9, r10, r2)
            if (r3 == 0) goto L1b5
            int r3 = p124h7.C2577d1.m6547g(r9, r5)
            int r4 = p124h7.C2577d1.m6547g(r10, r5)
            if (r3 != r4) goto L1b5
            goto L1b6
        L15b:
            boolean r3 = r8.m6459x(r9, r10, r2)
            if (r3 == 0) goto L1b5
            long r3 = p124h7.C2577d1.m6548h(r9, r5)
            long r5 = p124h7.C2577d1.m6548h(r10, r5)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L1b5
            goto L1b6
        L16e:
            boolean r3 = r8.m6459x(r9, r10, r2)
            if (r3 == 0) goto L1b5
            long r3 = p124h7.C2577d1.m6548h(r9, r5)
            long r5 = p124h7.C2577d1.m6548h(r10, r5)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L1b5
            goto L1b6
        L181:
            boolean r3 = r8.m6459x(r9, r10, r2)
            if (r3 == 0) goto L1b5
            float r3 = p124h7.C2577d1.m6546f(r9, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
            float r4 = p124h7.C2577d1.m6546f(r10, r5)
            int r4 = java.lang.Float.floatToIntBits(r4)
            if (r3 != r4) goto L1b5
            goto L1b6
        L19a:
            boolean r3 = r8.m6459x(r9, r10, r2)
            if (r3 == 0) goto L1b5
            double r3 = p124h7.C2577d1.m6545e(r9, r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            double r5 = p124h7.C2577d1.m6545e(r10, r5)
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
            h7.v0<?, ?> r0 = r8.f11364m
            java.lang.Object r0 = r0.mo7183d(r9)
            h7.v0<?, ?> r2 = r8.f11364m
            java.lang.Object r2 = r2.mo7183d(r10)
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L1cd
            return r1
        L1cd:
            boolean r0 = r8.f11357f
            if (r0 != 0) goto L1d3
            r9 = 1
            return r9
        L1d3:
            h7.ng<?> r0 = r8.f11365n
            r0.mo7003a(r9)
            h7.ng<?> r9 = r8.f11365n
            r9.mo7003a(r10)
            r9 = 0
            throw r9
    }

    @Override // p124h7.InterfaceC2666i0
    /* renamed from: i */
    public final void mo6446i(T r9, byte[] r10, int r11, int r12, p124h7.C2915vf r13) {
            r8 = this;
            boolean r0 = r8.f11359h
            if (r0 == 0) goto L8
            r8.m6434P(r9, r10, r11, r12, r13)
            return
        L8:
            r6 = 0
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r7 = r13
            r1.m6429E(r2, r3, r4, r5, r6, r7)
            return
    }

    @Override // p124h7.InterfaceC2666i0
    /* renamed from: j */
    public final boolean mo6447j(T r19) {
            r18 = this;
            r6 = r18
            r7 = r19
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r9 = 0
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r1 = 0
            r10 = 0
        Ld:
            int r2 = r6.f11361j
            r11 = 0
            r3 = 1
            if (r10 >= r2) goto Lf9
            int[] r2 = r6.f11360i
            r12 = r2[r10]
            int[] r2 = r6.f11352a
            r13 = r2[r12]
            int r14 = r6.m6449l(r12)
            int[] r2 = r6.f11352a
            int r4 = r12 + 2
            r2 = r2[r4]
            r4 = r2 & r8
            int r2 = r2 >>> 20
            int r15 = r3 << r2
            if (r4 == r0) goto L3b
            if (r4 == r8) goto L36
            sun.misc.Unsafe r0 = p124h7.C2521a0.f11351p
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
            boolean r0 = r0.m6461z(r1, r2, r3, r4, r5)
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
            java.lang.Object r0 = p124h7.C2577d1.m6550j(r7, r0)
            h7.s r0 = (p124h7.C2845s) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L88
            goto Lf1
        L88:
            java.lang.Object r0 = r6.m6453q(r12)
            h7.r r0 = (p124h7.C2827r) r0
            throw r11
        L8f:
            boolean r0 = r6.m6427A(r7, r13, r12)
            if (r0 == 0) goto Lf1
            h7.i0 r0 = r6.m6451o(r12)
            r1 = r14 & r8
            long r1 = (long) r1
            java.lang.Object r1 = p124h7.C2577d1.m6550j(r7, r1)
            boolean r0 = r0.mo6447j(r1)
            if (r0 != 0) goto Lf1
            return r9
        La7:
            r0 = r14 & r8
            long r0 = (long) r0
            java.lang.Object r0 = p124h7.C2577d1.m6550j(r7, r0)
            java.util.List r0 = (java.util.List) r0
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto Lf1
            h7.i0 r1 = r6.m6451o(r12)
            r2 = 0
        Lbb:
            int r3 = r0.size()
            if (r2 >= r3) goto Lf1
            java.lang.Object r3 = r0.get(r2)
            boolean r3 = r1.mo6447j(r3)
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
            boolean r0 = r0.m6461z(r1, r2, r3, r4, r5)
            if (r0 == 0) goto Lf1
            h7.i0 r0 = r6.m6451o(r12)
            r1 = r14 & r8
            long r1 = (long) r1
            java.lang.Object r1 = p124h7.C2577d1.m6550j(r7, r1)
            boolean r0 = r0.mo6447j(r1)
            if (r0 != 0) goto Lf1
            return r9
        Lf1:
            int r10 = r10 + 1
            r0 = r16
            r1 = r17
            goto Ld
        Lf9:
            boolean r0 = r6.f11357f
            if (r0 != 0) goto Lfe
            return r3
        Lfe:
            h7.ng<?> r0 = r6.f11365n
            r0.mo7003a(r7)
            throw r11
    }

    /* renamed from: k */
    public final int m6448k(int r6, int r7) {
            r5 = this;
            int[] r0 = r5.f11352a
            int r0 = r0.length
            int r0 = r0 / 3
            r1 = -1
            int r0 = r0 + r1
        L7:
            if (r7 > r0) goto L20
            int r2 = r0 + r7
            int r2 = r2 >>> 1
            int r3 = r2 * 3
            int[] r4 = r5.f11352a
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

    /* renamed from: l */
    public final int m6449l(int r2) {
            r1 = this;
            int[] r0 = r1.f11352a
            int r2 = r2 + 1
            r2 = r0[r2]
            return r2
    }

    /* renamed from: n */
    public final p124h7.InterfaceC2539b m6450n(int r2) {
            r1 = this;
            int r2 = r2 / 3
            java.lang.Object[] r0 = r1.f11353b
            int r2 = r2 + r2
            int r2 = r2 + 1
            r2 = r0[r2]
            h7.b r2 = (p124h7.InterfaceC2539b) r2
            return r2
    }

    /* renamed from: o */
    public final p124h7.InterfaceC2666i0 m6451o(int r4) {
            r3 = this;
            int r4 = r4 / 3
            int r4 = r4 + r4
            java.lang.Object[] r0 = r3.f11353b
            r1 = r0[r4]
            h7.i0 r1 = (p124h7.InterfaceC2666i0) r1
            if (r1 == 0) goto Lc
            return r1
        Lc:
            h7.f0 r1 = p124h7.C2612f0.f11504c
            int r2 = r4 + 1
            r0 = r0[r2]
            java.lang.Class r0 = (java.lang.Class) r0
            h7.i0 r0 = r1.m6688a(r0)
            java.lang.Object[] r1 = r3.f11353b
            r1[r4] = r0
            return r0
    }

    /* renamed from: p */
    public final java.lang.Object m6452p(java.lang.Object r3, int r4, java.lang.Object r5) {
            r2 = this;
            int[] r0 = r2.f11352a
            r1 = r0[r4]
            int r1 = r4 + 1
            r0 = r0[r1]
            r1 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r1
            long r0 = (long) r0
            java.lang.Object r3 = p124h7.C2577d1.m6550j(r3, r0)
            if (r3 != 0) goto L14
            return r5
        L14:
            h7.b r0 = r2.m6450n(r4)
            if (r0 != 0) goto L1b
            return r5
        L1b:
            h7.s r3 = (p124h7.C2845s) r3
            java.lang.Object r3 = r2.m6453q(r4)
            h7.r r3 = (p124h7.C2827r) r3
            r3 = 0
            throw r3
    }

    /* renamed from: q */
    public final java.lang.Object m6453q(int r2) {
            r1 = this;
            int r2 = r2 / 3
            java.lang.Object[] r0 = r1.f11353b
            int r2 = r2 + r2
            r2 = r0[r2]
            return r2
    }

    /* renamed from: s */
    public final void m6454s(T r4, T r5, int r6) {
            r3 = this;
            int[] r0 = r3.f11352a
            int r1 = r6 + 1
            r0 = r0[r1]
            r1 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r1
            long r0 = (long) r0
            boolean r2 = r3.m6460y(r5, r6)
            if (r2 != 0) goto L12
            return
        L12:
            java.lang.Object r2 = p124h7.C2577d1.m6550j(r4, r0)
            java.lang.Object r5 = p124h7.C2577d1.m6550j(r5, r0)
            if (r2 == 0) goto L2c
            if (r5 != 0) goto L1f
            goto L2c
        L1f:
            java.lang.Object r5 = p124h7.C2575d.m6540c(r2, r5)
            e7.i8 r2 = p124h7.C2577d1.f11435c
            r2.m4264N(r4, r0, r5)
            r3.m6457v(r4, r6)
            return
        L2c:
            if (r5 == 0) goto L36
            e7.i8 r2 = p124h7.C2577d1.f11435c
            r2.m4264N(r4, r0, r5)
            r3.m6457v(r4, r6)
        L36:
            return
    }

    /* renamed from: t */
    public final void m6455t(T r5, T r6, int r7) {
            r4 = this;
            int[] r0 = r4.f11352a
            int r1 = r7 + 1
            r1 = r0[r1]
            r0 = r0[r7]
            r2 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r1 & r2
            long r1 = (long) r1
            boolean r3 = r4.m6427A(r6, r0, r7)
            if (r3 != 0) goto L14
            return
        L14:
            boolean r3 = r4.m6427A(r5, r0, r7)
            if (r3 == 0) goto L1f
            java.lang.Object r3 = p124h7.C2577d1.m6550j(r5, r1)
            goto L20
        L1f:
            r3 = 0
        L20:
            java.lang.Object r6 = p124h7.C2577d1.m6550j(r6, r1)
            if (r3 == 0) goto L36
            if (r6 != 0) goto L29
            goto L36
        L29:
            java.lang.Object r6 = p124h7.C2575d.m6540c(r3, r6)
            e7.i8 r3 = p124h7.C2577d1.f11435c
            r3.m4264N(r5, r1, r6)
            r4.m6458w(r5, r0, r7)
            return
        L36:
            if (r6 == 0) goto L40
            e7.i8 r3 = p124h7.C2577d1.f11435c
            r3.m4264N(r5, r1, r6)
            r4.m6458w(r5, r0, r7)
        L40:
            return
    }

    /* renamed from: u */
    public final void m6456u(java.lang.Object r3, int r4, p124h7.C2610eg r5) {
            r2 = this;
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r0 & r4
            if (r0 == 0) goto L7
            r0 = 1
            goto L8
        L7:
            r0 = 0
        L8:
            r1 = 1048575(0xfffff, float:1.469367E-39)
            if (r0 == 0) goto L19
            r4 = r4 & r1
            long r0 = (long) r4
            java.lang.String r4 = r5.m6651B()
        L13:
            e7.i8 r5 = p124h7.C2577d1.f11435c
            r5.m4264N(r3, r0, r4)
            return
        L19:
            boolean r0 = r2.f11358g
            r4 = r4 & r1
            if (r0 == 0) goto L24
            long r0 = (long) r4
            java.lang.String r4 = r5.m6650A()
            goto L13
        L24:
            long r0 = (long) r4
            h7.cg r4 = r5.m6680z()
            goto L13
    }

    /* renamed from: v */
    public final void m6457v(T r6, int r7) {
            r5 = this;
            int[] r0 = r5.f11352a
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
            int r2 = p124h7.C2577d1.m6547g(r6, r0)
            r3 = 1
            int r7 = r7 >>> 20
            int r7 = r3 << r7
            r7 = r7 | r2
            e7.i8 r2 = p124h7.C2577d1.f11435c
            r2.m4262F(r6, r0, r7)
            return
    }

    /* renamed from: w */
    public final void m6458w(T r3, int r4, int r5) {
            r2 = this;
            int[] r0 = r2.f11352a
            int r5 = r5 + 2
            r5 = r0[r5]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r5 = r5 & r0
            long r0 = (long) r5
            e7.i8 r5 = p124h7.C2577d1.f11435c
            r5.m4262F(r3, r0, r4)
            return
    }

    /* renamed from: x */
    public final boolean m6459x(T r1, T r2, int r3) {
            r0 = this;
            boolean r1 = r0.m6460y(r1, r3)
            boolean r2 = r0.m6460y(r2, r3)
            if (r1 != r2) goto Lc
            r1 = 1
            return r1
        Lc:
            r1 = 0
            return r1
    }

    /* renamed from: y */
    public final boolean m6460y(T r11, int r12) {
            r10 = this;
            int[] r0 = r10.f11352a
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
            java.lang.Object r11 = p124h7.C2577d1.m6550j(r11, r0)
            if (r11 == 0) goto L31
            return r8
        L31:
            return r7
        L32:
            long r11 = p124h7.C2577d1.m6548h(r11, r0)
            int r0 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r0 == 0) goto L3b
            return r8
        L3b:
            return r7
        L3c:
            int r11 = p124h7.C2577d1.m6547g(r11, r0)
            if (r11 == 0) goto L43
            return r8
        L43:
            return r7
        L44:
            long r11 = p124h7.C2577d1.m6548h(r11, r0)
            int r0 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r0 == 0) goto L4d
            return r8
        L4d:
            return r7
        L4e:
            int r11 = p124h7.C2577d1.m6547g(r11, r0)
            if (r11 == 0) goto L55
            return r8
        L55:
            return r7
        L56:
            int r11 = p124h7.C2577d1.m6547g(r11, r0)
            if (r11 == 0) goto L5d
            return r8
        L5d:
            return r7
        L5e:
            int r11 = p124h7.C2577d1.m6547g(r11, r0)
            if (r11 == 0) goto L65
            return r8
        L65:
            return r7
        L66:
            h7.cg r12 = p124h7.AbstractC2574cg.f11427Z
            java.lang.Object r11 = p124h7.C2577d1.m6550j(r11, r0)
            boolean r11 = r12.equals(r11)
            if (r11 != 0) goto L73
            return r8
        L73:
            return r7
        L74:
            java.lang.Object r11 = p124h7.C2577d1.m6550j(r11, r0)
            if (r11 == 0) goto L7b
            return r8
        L7b:
            return r7
        L7c:
            java.lang.Object r11 = p124h7.C2577d1.m6550j(r11, r0)
            boolean r12 = r11 instanceof java.lang.String
            if (r12 == 0) goto L8e
            java.lang.String r11 = (java.lang.String) r11
            boolean r11 = r11.isEmpty()
            if (r11 != 0) goto L8d
            return r8
        L8d:
            return r7
        L8e:
            boolean r12 = r11 instanceof p124h7.AbstractC2574cg
            if (r12 == 0) goto L9c
            h7.cg r12 = p124h7.AbstractC2574cg.f11427Z
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
            boolean r11 = p124h7.C2577d1.m6559s(r11, r0)
            return r11
        La7:
            int r11 = p124h7.C2577d1.m6547g(r11, r0)
            if (r11 == 0) goto Lae
            return r8
        Lae:
            return r7
        Laf:
            long r11 = p124h7.C2577d1.m6548h(r11, r0)
            int r0 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r0 == 0) goto Lb8
            return r8
        Lb8:
            return r7
        Lb9:
            int r11 = p124h7.C2577d1.m6547g(r11, r0)
            if (r11 == 0) goto Lc0
            return r8
        Lc0:
            return r7
        Lc1:
            long r11 = p124h7.C2577d1.m6548h(r11, r0)
            int r0 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r0 == 0) goto Lca
            return r8
        Lca:
            return r7
        Lcb:
            long r11 = p124h7.C2577d1.m6548h(r11, r0)
            int r0 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r0 == 0) goto Ld4
            return r8
        Ld4:
            return r7
        Ld5:
            float r11 = p124h7.C2577d1.m6546f(r11, r0)
            r12 = 0
            int r11 = (r11 > r12 ? 1 : (r11 == r12 ? 0 : -1))
            if (r11 == 0) goto Ldf
            return r8
        Ldf:
            return r7
        Le0:
            double r11 = p124h7.C2577d1.m6545e(r11, r0)
            r0 = 0
            int r2 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r2 == 0) goto Leb
            return r8
        Leb:
            return r7
        Lec:
            int r11 = p124h7.C2577d1.m6547g(r11, r3)
            int r12 = r1 >>> 20
            int r12 = r8 << r12
            r11 = r11 & r12
            if (r11 == 0) goto Lf8
            return r8
        Lf8:
            return r7
    }

    /* renamed from: z */
    public final boolean m6461z(T r2, int r3, int r4, int r5, int r6) {
            r1 = this;
            r0 = 1048575(0xfffff, float:1.469367E-39)
            if (r4 != r0) goto La
            boolean r2 = r1.m6460y(r2, r3)
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
}
