package com.bumptech.glide;

/* JADX WARN: Unexpected interfaces in signature: [java.lang.Cloneable] */
/* renamed from: com.bumptech.glide.i */
/* loaded from: classes.dex */
public class C1005i<TranscodeType> extends p033c3.AbstractC0855a<com.bumptech.glide.C1005i<TranscodeType>> {

    /* renamed from: A0 */
    public final java.lang.Class<TranscodeType> f5150A0;

    /* renamed from: B0 */
    public final com.bumptech.glide.C1001e f5151B0;

    /* renamed from: C0 */
    public com.bumptech.glide.AbstractC1007k<?, ? super TranscodeType> f5152C0;

    /* renamed from: D0 */
    public java.lang.Object f5153D0;

    /* renamed from: E0 */
    public java.util.List<p033c3.InterfaceC0861g<TranscodeType>> f5154E0;

    /* renamed from: F0 */
    public com.bumptech.glide.C1005i<TranscodeType> f5155F0;

    /* renamed from: G0 */
    public com.bumptech.glide.C1005i<TranscodeType> f5156G0;

    /* renamed from: H0 */
    public boolean f5157H0;

    /* renamed from: I0 */
    public boolean f5158I0;

    /* renamed from: J0 */
    public boolean f5159J0;

    /* renamed from: y0 */
    public final android.content.Context f5160y0;

    /* renamed from: z0 */
    public final com.bumptech.glide.ComponentCallbacks2C1006j f5161z0;

    /* renamed from: com.bumptech.glide.i$a */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f5162a = null;

        /* renamed from: b */
        public static final /* synthetic */ int[] f5163b = null;

        static {
                com.bumptech.glide.g[] r0 = com.bumptech.glide.EnumC1003g.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.bumptech.glide.C1005i.a.f5163b = r0
                r1 = 1
                r2 = 3
                r0[r2] = r1     // Catch: java.lang.NoSuchFieldError -> Ld
            Ld:
                r0 = 2
                int[] r3 = com.bumptech.glide.C1005i.a.f5163b     // Catch: java.lang.NoSuchFieldError -> L12
                r3[r0] = r0     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r3 = com.bumptech.glide.C1005i.a.f5163b     // Catch: java.lang.NoSuchFieldError -> L16
                r3[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L16
            L16:
                r3 = 4
                int[] r4 = com.bumptech.glide.C1005i.a.f5163b     // Catch: java.lang.NoSuchFieldError -> L1c
                r5 = 0
                r4[r5] = r3     // Catch: java.lang.NoSuchFieldError -> L1c
            L1c:
                android.widget.ImageView$ScaleType[] r4 = android.widget.ImageView.ScaleType.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                com.bumptech.glide.C1005i.a.f5162a = r4
                android.widget.ImageView$ScaleType r5 = android.widget.ImageView.ScaleType.CENTER_CROP     // Catch: java.lang.NoSuchFieldError -> L2d
                int r5 = r5.ordinal()     // Catch: java.lang.NoSuchFieldError -> L2d
                r4[r5] = r1     // Catch: java.lang.NoSuchFieldError -> L2d
            L2d:
                int[] r1 = com.bumptech.glide.C1005i.a.f5162a     // Catch: java.lang.NoSuchFieldError -> L37
                android.widget.ImageView$ScaleType r4 = android.widget.ImageView.ScaleType.CENTER_INSIDE     // Catch: java.lang.NoSuchFieldError -> L37
                int r4 = r4.ordinal()     // Catch: java.lang.NoSuchFieldError -> L37
                r1[r4] = r0     // Catch: java.lang.NoSuchFieldError -> L37
            L37:
                int[] r0 = com.bumptech.glide.C1005i.a.f5162a     // Catch: java.lang.NoSuchFieldError -> L41
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_CENTER     // Catch: java.lang.NoSuchFieldError -> L41
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L41
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L41
            L41:
                int[] r0 = com.bumptech.glide.C1005i.a.f5162a     // Catch: java.lang.NoSuchFieldError -> L4b
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_START     // Catch: java.lang.NoSuchFieldError -> L4b
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L4b
                r0[r1] = r3     // Catch: java.lang.NoSuchFieldError -> L4b
            L4b:
                int[] r0 = com.bumptech.glide.C1005i.a.f5162a     // Catch: java.lang.NoSuchFieldError -> L56
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_END     // Catch: java.lang.NoSuchFieldError -> L56
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L56
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L56
            L56:
                int[] r0 = com.bumptech.glide.C1005i.a.f5162a     // Catch: java.lang.NoSuchFieldError -> L61
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_XY     // Catch: java.lang.NoSuchFieldError -> L61
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L61
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L61
            L61:
                int[] r0 = com.bumptech.glide.C1005i.a.f5162a     // Catch: java.lang.NoSuchFieldError -> L6c
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER     // Catch: java.lang.NoSuchFieldError -> L6c
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L6c
                r2 = 7
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L6c
            L6c:
                int[] r0 = com.bumptech.glide.C1005i.a.f5162a     // Catch: java.lang.NoSuchFieldError -> L78
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.MATRIX     // Catch: java.lang.NoSuchFieldError -> L78
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L78
                r2 = 8
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L78
            L78:
                return
        }
    }

    static {
            c3.h r0 = new c3.h
            r0.<init>()
            m2.k r1 = p214m2.AbstractC4333k.f17721b
            c3.a r0 = r0.mo2534e(r1)
            c3.h r0 = (p033c3.C0862h) r0
            com.bumptech.glide.g r1 = com.bumptech.glide.EnumC1003g.f5138b0
            c3.a r0 = r0.mo2548x(r1)
            c3.h r0 = (p033c3.C0862h) r0
            r1 = 1
            c3.a r0 = r0.mo2524B(r1)
            c3.h r0 = (p033c3.C0862h) r0
            return
    }

    @android.annotation.SuppressLint({"CheckResult"})
    public C1005i(com.bumptech.glide.ComponentCallbacks2C0999c r4, com.bumptech.glide.ComponentCallbacks2C1006j r5, java.lang.Class<TranscodeType> r6, android.content.Context r7) {
            r3 = this;
            r3.<init>()
            r0 = 1
            r3.f5157H0 = r0
            r3.f5161z0 = r5
            r3.f5150A0 = r6
            r3.f5160y0 = r7
            com.bumptech.glide.c r7 = r5.f5166Y
            com.bumptech.glide.e r7 = r7.f5099a0
            java.util.Map<java.lang.Class<?>, com.bumptech.glide.k<?, ?>> r0 = r7.f5128f
            java.lang.Object r0 = r0.get(r6)
            com.bumptech.glide.k r0 = (com.bumptech.glide.AbstractC1007k) r0
            if (r0 != 0) goto L43
            java.util.Map<java.lang.Class<?>, com.bumptech.glide.k<?, ?>> r7 = r7.f5128f
            java.util.Set r7 = r7.entrySet()
            java.util.Iterator r7 = r7.iterator()
        L24:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L43
            java.lang.Object r1 = r7.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.Class r2 = (java.lang.Class) r2
            boolean r2 = r2.isAssignableFrom(r6)
            if (r2 == 0) goto L24
            java.lang.Object r0 = r1.getValue()
            com.bumptech.glide.k r0 = (com.bumptech.glide.AbstractC1007k) r0
            goto L24
        L43:
            if (r0 != 0) goto L47
            com.bumptech.glide.k<?, ?> r0 = com.bumptech.glide.C1001e.f5122k
        L47:
            r3.f5152C0 = r0
            com.bumptech.glide.e r4 = r4.f5099a0
            r3.f5151B0 = r4
            java.util.concurrent.CopyOnWriteArrayList<c3.g<java.lang.Object>> r4 = r5.f5174g0
            java.util.Iterator r4 = r4.iterator()
        L53:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L63
            java.lang.Object r6 = r4.next()
            c3.g r6 = (p033c3.InterfaceC0861g) r6
            r3.mo2747H(r6)
            goto L53
        L63:
            monitor-enter(r5)
            c3.h r4 = r5.f5175h0     // Catch: java.lang.Throwable -> L6b
            monitor-exit(r5)
            r3.mo2748I(r4)
            return
        L6b:
            r4 = move-exception
            monitor-exit(r5)
            throw r4
    }

    /* renamed from: H */
    public com.bumptech.glide.C1005i<TranscodeType> mo2747H(p033c3.InterfaceC0861g<TranscodeType> r2) {
            r1 = this;
            boolean r0 = r1.f4642t0
            if (r0 == 0) goto Ld
            com.bumptech.glide.i r0 = r1.mo2750K()
            com.bumptech.glide.i r2 = r0.mo2747H(r2)
            return r2
        Ld:
            if (r2 == 0) goto L1f
            java.util.List<c3.g<TranscodeType>> r0 = r1.f5154E0
            if (r0 != 0) goto L1a
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f5154E0 = r0
        L1a:
            java.util.List<c3.g<TranscodeType>> r0 = r1.f5154E0
            r0.add(r2)
        L1f:
            r1.m2549y()
            r2 = r1
            com.bumptech.glide.i r2 = (com.bumptech.glide.C1005i) r2
            return r2
    }

    /* renamed from: I */
    public com.bumptech.glide.C1005i<TranscodeType> mo2748I(p033c3.AbstractC0855a<?> r2) {
            r1 = this;
            java.lang.String r0 = "Argument must not be null"
            java.util.Objects.requireNonNull(r2, r0)
            c3.a r2 = super.mo2530a(r2)
            com.bumptech.glide.i r2 = (com.bumptech.glide.C1005i) r2
            return r2
    }

    /* renamed from: J */
    public final p033c3.InterfaceC0858d m2749J(java.lang.Object r20, p049d3.InterfaceC1275g<TranscodeType> r21, p033c3.InterfaceC0861g<TranscodeType> r22, p033c3.InterfaceC0859e r23, com.bumptech.glide.AbstractC1007k<?, ? super TranscodeType> r24, com.bumptech.glide.EnumC1003g r25, int r26, int r27, p033c3.AbstractC0855a<?> r28, java.util.concurrent.Executor r29) {
            r19 = this;
            r11 = r19
            r12 = r20
            r13 = r28
            com.bumptech.glide.i<TranscodeType> r0 = r11.f5156G0
            if (r0 == 0) goto L14
            c3.b r0 = new c3.b
            r1 = r23
            r0.<init>(r12, r1)
            r5 = r0
            r14 = r5
            goto L19
        L14:
            r1 = r23
            r0 = 0
            r14 = r0
            r5 = r1
        L19:
            com.bumptech.glide.i<TranscodeType> r0 = r11.f5155F0
            if (r0 == 0) goto Lb2
            boolean r1 = r11.f5159J0
            if (r1 != 0) goto Laa
            com.bumptech.glide.k<?, ? super TranscodeType> r1 = r0.f5152C0
            boolean r2 = r0.f5157H0
            if (r2 == 0) goto L2a
            r15 = r24
            goto L2b
        L2a:
            r15 = r1
        L2b:
            int r0 = r0.f4621Y
            r1 = 8
            boolean r0 = p033c3.AbstractC0855a.m2522m(r0, r1)
            if (r0 == 0) goto L3c
            com.bumptech.glide.i<TranscodeType> r0 = r11.f5155F0
            com.bumptech.glide.g r0 = r0.f4624b0
            r7 = r25
            goto L42
        L3c:
            r7 = r25
            com.bumptech.glide.g r0 = r11.m2751M(r7)
        L42:
            r16 = r0
            com.bumptech.glide.i<TranscodeType> r0 = r11.f5155F0
            int r1 = r0.f4631i0
            int r0 = r0.f4630h0
            boolean r2 = p106g3.C2238j.m5850j(r26, r27)
            if (r2 == 0) goto L65
            com.bumptech.glide.i<TranscodeType> r2 = r11.f5155F0
            int r3 = r2.f4631i0
            int r2 = r2.f4630h0
            boolean r2 = p106g3.C2238j.m5850j(r3, r2)
            if (r2 != 0) goto L65
            int r0 = r13.f4631i0
            int r1 = r13.f4630h0
            r17 = r0
            r18 = r1
            goto L69
        L65:
            r18 = r0
            r17 = r1
        L69:
            c3.k r10 = new c3.k
            r10.<init>(r12, r5)
            r0 = r19
            r1 = r20
            r2 = r21
            r3 = r22
            r4 = r28
            r5 = r10
            r6 = r24
            r7 = r25
            r8 = r26
            r9 = r27
            r23 = r10
            r10 = r29
            c3.d r10 = r0.m2760W(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r0 = 1
            r11.f5159J0 = r0
            com.bumptech.glide.i<TranscodeType> r9 = r11.f5155F0
            r0 = r9
            r4 = r23
            r5 = r15
            r6 = r16
            r7 = r17
            r8 = r18
            r15 = r10
            r10 = r29
            c3.d r0 = r0.m2749J(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r1 = 0
            r11.f5159J0 = r1
            r1 = r23
            r1.f4695c = r15
            r1.f4696d = r0
            r15 = r1
            goto Lcb
        Laa:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()"
            r0.<init>(r1)
            throw r0
        Lb2:
            r7 = r25
            r0 = r19
            r1 = r20
            r2 = r21
            r3 = r22
            r4 = r28
            r6 = r24
            r8 = r26
            r9 = r27
            r10 = r29
            c3.d r10 = r0.m2760W(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r15 = r10
        Lcb:
            if (r14 != 0) goto Lce
            return r15
        Lce:
            com.bumptech.glide.i<TranscodeType> r0 = r11.f5156G0
            int r1 = r0.f4631i0
            int r0 = r0.f4630h0
            boolean r2 = p106g3.C2238j.m5850j(r26, r27)
            if (r2 == 0) goto Led
            com.bumptech.glide.i<TranscodeType> r2 = r11.f5156G0
            int r3 = r2.f4631i0
            int r2 = r2.f4630h0
            boolean r2 = p106g3.C2238j.m5850j(r3, r2)
            if (r2 != 0) goto Led
            int r0 = r13.f4631i0
            int r1 = r13.f4630h0
            r7 = r0
            r8 = r1
            goto Lef
        Led:
            r8 = r0
            r7 = r1
        Lef:
            com.bumptech.glide.i<TranscodeType> r9 = r11.f5156G0
            com.bumptech.glide.k<?, ? super TranscodeType> r5 = r9.f5152C0
            com.bumptech.glide.g r6 = r9.f4624b0
            r0 = r9
            r1 = r20
            r2 = r21
            r3 = r22
            r4 = r14
            r10 = r29
            c3.d r0 = r0.m2749J(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r14.f4649c = r15
            r14.f4650d = r0
            return r14
    }

    /* renamed from: K */
    public com.bumptech.glide.C1005i<TranscodeType> mo2750K() {
            r3 = this;
            c3.a r0 = super.mo2532c()
            com.bumptech.glide.i r0 = (com.bumptech.glide.C1005i) r0
            com.bumptech.glide.k<?, ? super TranscodeType> r1 = r0.f5152C0
            com.bumptech.glide.k r1 = r1.m2775a()
            r0.f5152C0 = r1
            java.util.List<c3.g<TranscodeType>> r1 = r0.f5154E0
            if (r1 == 0) goto L1b
            java.util.ArrayList r1 = new java.util.ArrayList
            java.util.List<c3.g<TranscodeType>> r2 = r0.f5154E0
            r1.<init>(r2)
            r0.f5154E0 = r1
        L1b:
            com.bumptech.glide.i<TranscodeType> r1 = r0.f5155F0
            if (r1 == 0) goto L25
            com.bumptech.glide.i r1 = r1.mo2750K()
            r0.f5155F0 = r1
        L25:
            com.bumptech.glide.i<TranscodeType> r1 = r0.f5156G0
            if (r1 == 0) goto L2f
            com.bumptech.glide.i r1 = r1.mo2750K()
            r0.f5156G0 = r1
        L2f:
            return r0
    }

    /* renamed from: M */
    public final com.bumptech.glide.EnumC1003g m2751M(com.bumptech.glide.EnumC1003g r3) {
            r2 = this;
            int r3 = r3.ordinal()
            if (r3 == 0) goto L2a
            r0 = 1
            if (r3 == r0) goto L2a
            r0 = 2
            if (r3 == r0) goto L27
            r0 = 3
            if (r3 != r0) goto L12
            com.bumptech.glide.g r3 = com.bumptech.glide.EnumC1003g.f5137a0
            return r3
        L12:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "unknown priority: "
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            com.bumptech.glide.g r1 = r2.f4624b0
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r3.<init>(r0)
            throw r3
        L27:
            com.bumptech.glide.g r3 = com.bumptech.glide.EnumC1003g.f5136Z
            return r3
        L2a:
            com.bumptech.glide.g r3 = com.bumptech.glide.EnumC1003g.f5135Y
            return r3
    }

    /* renamed from: N */
    public final <Y extends p049d3.InterfaceC1275g<TranscodeType>> Y m2752N(Y r15, p033c3.InterfaceC0861g<TranscodeType> r16, p033c3.AbstractC0855a<?> r17, java.util.concurrent.Executor r18) {
            r14 = this;
            r12 = r14
            r0 = r15
            r13 = r17
            java.lang.String r1 = "Argument must not be null"
            java.util.Objects.requireNonNull(r15, r1)
            boolean r1 = r12.f5158I0
            if (r1 == 0) goto L8f
            java.lang.Object r2 = new java.lang.Object
            r2.<init>()
            com.bumptech.glide.k<?, ? super TranscodeType> r6 = r12.f5152C0
            com.bumptech.glide.g r7 = r13.f4624b0
            int r8 = r13.f4631i0
            int r9 = r13.f4630h0
            r5 = 0
            r1 = r14
            r3 = r15
            r4 = r16
            r10 = r17
            r11 = r18
            c3.d r1 = r1.m2749J(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            c3.d r2 = r15.mo2573j()
            boolean r3 = r1.mo2556f(r2)
            if (r3 == 0) goto L4f
            boolean r3 = r13.f4629g0
            if (r3 != 0) goto L3d
            boolean r3 = r2.mo2559i()
            if (r3 == 0) goto L3d
            r3 = 1
            goto L3e
        L3d:
            r3 = 0
        L3e:
            if (r3 != 0) goto L4f
            java.lang.String r1 = "Argument must not be null"
            java.util.Objects.requireNonNull(r2, r1)
            boolean r1 = r2.isRunning()
            if (r1 != 0) goto L4e
            r2.mo2557g()
        L4e:
            return r0
        L4f:
            com.bumptech.glide.j r2 = r12.f5161z0
            r2.m2769r(r15)
            r15.mo2570g(r1)
            com.bumptech.glide.j r2 = r12.f5161z0
            monitor-enter(r2)
            z2.p r3 = r2.f5171d0     // Catch: java.lang.Throwable -> L8c
            java.util.Set<d3.g<?>> r3 = r3.f27836Y     // Catch: java.lang.Throwable -> L8c
            r3.add(r15)     // Catch: java.lang.Throwable -> L8c
            z2.n r3 = r2.f5169b0     // Catch: java.lang.Throwable -> L8c
            java.util.Set<c3.d> r4 = r3.f27826Z     // Catch: java.lang.Throwable -> L8c
            java.util.Set r4 = (java.util.Set) r4     // Catch: java.lang.Throwable -> L8c
            r4.add(r1)     // Catch: java.lang.Throwable -> L8c
            boolean r4 = r3.f27828b0     // Catch: java.lang.Throwable -> L8c
            if (r4 != 0) goto L72
            r1.mo2557g()     // Catch: java.lang.Throwable -> L8c
            goto L8a
        L72:
            r1.clear()     // Catch: java.lang.Throwable -> L8c
            r4 = 2
            java.lang.String r5 = "RequestTracker"
            boolean r4 = android.util.Log.isLoggable(r5, r4)     // Catch: java.lang.Throwable -> L8c
            if (r4 == 0) goto L83
            java.lang.String r4 = "Paused, delaying request"
            android.util.Log.v(r5, r4)     // Catch: java.lang.Throwable -> L8c
        L83:
            java.util.List<c3.d> r3 = r3.f27827a0     // Catch: java.lang.Throwable -> L8c
            java.util.List r3 = (java.util.List) r3     // Catch: java.lang.Throwable -> L8c
            r3.add(r1)     // Catch: java.lang.Throwable -> L8c
        L8a:
            monitor-exit(r2)
            return r0
        L8c:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L8f:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "You must call #load() before calling #into()"
            r0.<init>(r1)
            throw r0
    }

    /* renamed from: O */
    public p049d3.AbstractC1276h<android.widget.ImageView, TranscodeType> m2753O(android.widget.ImageView r4) {
            r3 = this;
            p106g3.C2238j.m5841a()
            java.lang.String r0 = "Argument must not be null"
            java.util.Objects.requireNonNull(r4, r0)
            int r0 = r3.f4621Y
            r1 = 2048(0x800, float:2.87E-42)
            boolean r0 = p033c3.AbstractC0855a.m2522m(r0, r1)
            if (r0 != 0) goto L47
            boolean r0 = r3.f4634l0
            if (r0 == 0) goto L47
            android.widget.ImageView$ScaleType r0 = r4.getScaleType()
            if (r0 == 0) goto L47
            int[] r0 = com.bumptech.glide.C1005i.a.f5162a
            android.widget.ImageView$ScaleType r1 = r4.getScaleType()
            int r1 = r1.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L3e;
                case 2: goto L35;
                case 3: goto L2c;
                case 4: goto L2c;
                case 5: goto L2c;
                case 6: goto L35;
                default: goto L2b;
            }
        L2b:
            goto L47
        L2c:
            c3.a r0 = r3.mo2532c()
            c3.a r0 = r0.mo2543s()
            goto L48
        L35:
            c3.a r0 = r3.mo2532c()
            c3.a r0 = r0.mo2542r()
            goto L48
        L3e:
            c3.a r0 = r3.mo2532c()
            c3.a r0 = r0.mo2541q()
            goto L48
        L47:
            r0 = r3
        L48:
            com.bumptech.glide.e r1 = r3.f5151B0
            java.lang.Class<TranscodeType> r2 = r3.f5150A0
            v1.b r1 = r1.f5125c
            java.util.Objects.requireNonNull(r1)
            java.lang.Class<android.graphics.Bitmap> r1 = android.graphics.Bitmap.class
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L5f
            d3.b r1 = new d3.b
            r1.<init>(r4)
            goto L6c
        L5f:
            java.lang.Class<android.graphics.drawable.Drawable> r1 = android.graphics.drawable.Drawable.class
            boolean r1 = r1.isAssignableFrom(r2)
            if (r1 == 0) goto L75
            d3.d r1 = new d3.d
            r1.<init>(r4)
        L6c:
            r4 = 0
            java.util.concurrent.Executor r2 = p106g3.C2233e.f10200a
            r3.m2752N(r1, r4, r0, r2)
            d3.h r1 = (p049d3.AbstractC1276h) r1
            return r1
        L75:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unhandled class: "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r1 = ", try .as*(Class).transcode(ResourceTranscoder)"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r4.<init>(r0)
            throw r4
    }

    /* renamed from: P */
    public com.bumptech.glide.C1005i<TranscodeType> mo2754P(p033c3.InterfaceC0861g<TranscodeType> r2) {
            r1 = this;
            boolean r0 = r1.f4642t0
            if (r0 == 0) goto Ld
            com.bumptech.glide.i r0 = r1.mo2750K()
            com.bumptech.glide.i r2 = r0.mo2754P(r2)
            return r2
        Ld:
            r0 = 0
            r1.f5154E0 = r0
            com.bumptech.glide.i r2 = r1.mo2747H(r2)
            return r2
    }

    /* renamed from: R */
    public com.bumptech.glide.C1005i<TranscodeType> mo2755R(android.graphics.drawable.Drawable r2) {
            r1 = this;
            com.bumptech.glide.i r2 = r1.m2759V(r2)
            m2.k r0 = p214m2.AbstractC4333k.f17720a
            c3.h r0 = p033c3.C0862h.m2578H(r0)
            com.bumptech.glide.i r2 = r2.mo2748I(r0)
            return r2
    }

    /* renamed from: S */
    public com.bumptech.glide.C1005i<TranscodeType> mo2756S(android.net.Uri r1) {
            r0 = this;
            com.bumptech.glide.i r1 = r0.m2759V(r1)
            return r1
    }

    /* renamed from: T */
    public com.bumptech.glide.C1005i<TranscodeType> mo2757T(java.lang.Object r1) {
            r0 = this;
            com.bumptech.glide.i r1 = r0.m2759V(r1)
            return r1
    }

    /* renamed from: U */
    public com.bumptech.glide.C1005i<TranscodeType> mo2758U(java.lang.String r1) {
            r0 = this;
            com.bumptech.glide.i r1 = r0.m2759V(r1)
            return r1
    }

    /* renamed from: V */
    public final com.bumptech.glide.C1005i<TranscodeType> m2759V(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r1.f4642t0
            if (r0 == 0) goto Ld
            com.bumptech.glide.i r0 = r1.mo2750K()
            com.bumptech.glide.i r2 = r0.m2759V(r2)
            return r2
        Ld:
            r1.f5153D0 = r2
            r2 = 1
            r1.f5158I0 = r2
            r1.m2549y()
            r2 = r1
            com.bumptech.glide.i r2 = (com.bumptech.glide.C1005i) r2
            return r2
    }

    /* renamed from: W */
    public final p033c3.InterfaceC0858d m2760W(java.lang.Object r20, p049d3.InterfaceC1275g<TranscodeType> r21, p033c3.InterfaceC0861g<TranscodeType> r22, p033c3.AbstractC0855a<?> r23, p033c3.InterfaceC0859e r24, com.bumptech.glide.AbstractC1007k<?, ? super TranscodeType> r25, com.bumptech.glide.EnumC1003g r26, int r27, int r28, java.util.concurrent.Executor r29) {
            r19 = this;
            r0 = r19
            android.content.Context r2 = r0.f5160y0
            com.bumptech.glide.e r3 = r0.f5151B0
            java.lang.Object r5 = r0.f5153D0
            java.lang.Class<TranscodeType> r6 = r0.f5150A0
            java.util.List<c3.g<TranscodeType>> r13 = r0.f5154E0
            m2.l r15 = r3.f5129g
            java.util.Objects.requireNonNull(r25)
            e3.c<?> r16 = p068e3.C1512a.f7361b
            c3.j r18 = new c3.j
            r1 = r18
            r4 = r20
            r7 = r23
            r8 = r27
            r9 = r28
            r10 = r26
            r11 = r21
            r12 = r22
            r14 = r24
            r17 = r29
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return r18
    }

    /* renamed from: X */
    public p033c3.InterfaceFutureC0857c<TranscodeType> m2761X(int r2, int r3) {
            r1 = this;
            c3.f r0 = new c3.f
            r0.<init>(r2, r3)
            java.util.concurrent.Executor r2 = p106g3.C2233e.f10201b
            r1.m2752N(r0, r0, r1, r2)
            return r0
    }

    /* renamed from: Y */
    public com.bumptech.glide.C1005i<TranscodeType> mo2762Y(com.bumptech.glide.C1005i<TranscodeType> r2) {
            r1 = this;
            boolean r0 = r1.f4642t0
            if (r0 == 0) goto Ld
            com.bumptech.glide.i r0 = r1.mo2750K()
            com.bumptech.glide.i r2 = r0.mo2762Y(r2)
            return r2
        Ld:
            r1.f5155F0 = r2
            r1.m2549y()
            r2 = r1
            com.bumptech.glide.i r2 = (com.bumptech.glide.C1005i) r2
            return r2
    }

    @Override // p033c3.AbstractC0855a
    /* renamed from: a */
    public /* bridge */ /* synthetic */ p033c3.AbstractC0855a mo2530a(p033c3.AbstractC0855a r1) {
            r0 = this;
            com.bumptech.glide.i r1 = r0.mo2748I(r1)
            return r1
    }

    @Override // p033c3.AbstractC0855a
    /* renamed from: c */
    public /* bridge */ /* synthetic */ p033c3.AbstractC0855a mo2532c() {
            r1 = this;
            com.bumptech.glide.i r0 = r1.mo2750K()
            return r0
    }

    @Override // p033c3.AbstractC0855a
    public /* bridge */ /* synthetic */ java.lang.Object clone() {
            r1 = this;
            com.bumptech.glide.i r0 = r1.mo2750K()
            return r0
    }
}
