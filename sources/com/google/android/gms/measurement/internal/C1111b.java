package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.b */
/* loaded from: classes.dex */
public final class C1111b extends p249o7.AbstractC5050m4 {

    /* renamed from: c */
    public char f5669c;

    /* renamed from: d */
    public long f5670d;

    /* renamed from: e */
    public java.lang.String f5671e;

    /* renamed from: f */
    public final p249o7.C4993f3 f5672f;

    /* renamed from: g */
    public final p249o7.C4993f3 f5673g;

    /* renamed from: h */
    public final p249o7.C4993f3 f5674h;

    /* renamed from: i */
    public final p249o7.C4993f3 f5675i;

    /* renamed from: j */
    public final p249o7.C4993f3 f5676j;

    /* renamed from: k */
    public final p249o7.C4993f3 f5677k;

    /* renamed from: l */
    public final p249o7.C4993f3 f5678l;

    /* renamed from: m */
    public final p249o7.C4993f3 f5679m;

    /* renamed from: n */
    public final p249o7.C4993f3 f5680n;

    public C1111b(com.google.android.gms.measurement.internal.C1113d r4) {
            r3 = this;
            r3.<init>(r4)
            r4 = 0
            r3.f5669c = r4
            r0 = -1
            r3.f5670d = r0
            o7.f3 r0 = new o7.f3
            r1 = 6
            r0.<init>(r3, r1, r4, r4)
            r3.f5672f = r0
            o7.f3 r0 = new o7.f3
            r2 = 1
            r0.<init>(r3, r1, r2, r4)
            r3.f5673g = r0
            o7.f3 r0 = new o7.f3
            r0.<init>(r3, r1, r4, r2)
            r3.f5674h = r0
            o7.f3 r0 = new o7.f3
            r1 = 5
            r0.<init>(r3, r1, r4, r4)
            r3.f5675i = r0
            o7.f3 r0 = new o7.f3
            r0.<init>(r3, r1, r2, r4)
            r3.f5676j = r0
            o7.f3 r0 = new o7.f3
            r0.<init>(r3, r1, r4, r2)
            r3.f5677k = r0
            o7.f3 r0 = new o7.f3
            r1 = 4
            r0.<init>(r3, r1, r4, r4)
            r3.f5678l = r0
            o7.f3 r0 = new o7.f3
            r1 = 3
            r0.<init>(r3, r1, r4, r4)
            r3.f5679m = r0
            o7.f3 r0 = new o7.f3
            r1 = 2
            r0.<init>(r3, r1, r4, r4)
            r3.f5680n = r0
            return
    }

    /* renamed from: u */
    public static java.lang.Object m3134u(java.lang.String r1) {
            if (r1 != 0) goto L4
            r1 = 0
            return r1
        L4:
            o7.g3 r0 = new o7.g3
            r0.<init>(r1)
            return r0
    }

    /* renamed from: v */
    public static java.lang.String m3135v(boolean r2, java.lang.String r3, java.lang.Object r4, java.lang.Object r5, java.lang.Object r6) {
            java.lang.String r0 = ""
            if (r3 != 0) goto L5
            r3 = r0
        L5:
            java.lang.String r4 = m3136w(r2, r4)
            java.lang.String r5 = m3136w(r2, r5)
            java.lang.String r2 = m3136w(r2, r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            boolean r1 = android.text.TextUtils.isEmpty(r3)
            if (r1 != 0) goto L21
            r6.append(r3)
            java.lang.String r0 = ": "
        L21:
            boolean r3 = android.text.TextUtils.isEmpty(r4)
            java.lang.String r1 = ", "
            if (r3 != 0) goto L30
            r6.append(r0)
            r6.append(r4)
            r0 = r1
        L30:
            boolean r3 = android.text.TextUtils.isEmpty(r5)
            if (r3 != 0) goto L3d
            r6.append(r0)
            r6.append(r5)
            goto L3e
        L3d:
            r1 = r0
        L3e:
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L4a
            r6.append(r1)
            r6.append(r2)
        L4a:
            java.lang.String r2 = r6.toString()
            return r2
    }

    /* renamed from: w */
    public static java.lang.String m3136w(boolean r8, java.lang.Object r9) {
            java.lang.String r0 = ""
            if (r9 != 0) goto L5
            return r0
        L5:
            boolean r1 = r9 instanceof java.lang.Integer
            if (r1 == 0) goto L14
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            long r1 = (long) r9
            java.lang.Long r9 = java.lang.Long.valueOf(r1)
        L14:
            boolean r1 = r9 instanceof java.lang.Long
            java.lang.String r2 = "-"
            r3 = 0
            if (r1 == 0) goto L98
            if (r8 != 0) goto L22
            java.lang.String r8 = java.lang.String.valueOf(r9)
            return r8
        L22:
            r8 = r9
            java.lang.Long r8 = (java.lang.Long) r8
            long r4 = r8.longValue()
            long r4 = java.lang.Math.abs(r4)
            r6 = 100
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 >= 0) goto L38
            java.lang.String r8 = java.lang.String.valueOf(r9)
            return r8
        L38:
            java.lang.String r9 = java.lang.String.valueOf(r9)
            char r9 = r9.charAt(r3)
            r1 = 45
            if (r9 != r1) goto L45
            r0 = r2
        L45:
            long r8 = r8.longValue()
            long r8 = java.lang.Math.abs(r8)
            java.lang.String r8 = java.lang.String.valueOf(r8)
            int r9 = r8.length()
            int r9 = r9 + (-1)
            double r1 = (double) r9
            r3 = 4621819117588971520(0x4024000000000000, double:10.0)
            double r1 = java.lang.Math.pow(r3, r1)
            long r1 = java.lang.Math.round(r1)
            int r8 = r8.length()
            double r8 = (double) r8
            double r8 = java.lang.Math.pow(r3, r8)
            r3 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            double r8 = r8 + r3
            long r8 = java.lang.Math.round(r8)
            int r3 = r0.length()
            int r4 = r0.length()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            int r3 = r3 + 43
            int r3 = r3 + r4
            r5.<init>(r3)
            r5.append(r0)
            r5.append(r1)
            java.lang.String r1 = "..."
            r5.append(r1)
            r5.append(r0)
            r5.append(r8)
            java.lang.String r8 = r5.toString()
            return r8
        L98:
            boolean r0 = r9 instanceof java.lang.Boolean
            if (r0 == 0) goto La1
            java.lang.String r8 = java.lang.String.valueOf(r9)
            return r8
        La1:
            boolean r0 = r9 instanceof java.lang.Throwable
            if (r0 == 0) goto Lf6
            java.lang.Throwable r9 = (java.lang.Throwable) r9
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            if (r8 == 0) goto Lb4
            java.lang.Class r8 = r9.getClass()
            java.lang.String r8 = r8.getName()
            goto Lb8
        Lb4:
            java.lang.String r8 = r9.toString()
        Lb8:
            r0.<init>(r8)
            java.lang.Class<com.google.android.gms.measurement.internal.d> r8 = com.google.android.gms.measurement.internal.C1113d.class
            java.lang.String r8 = r8.getCanonicalName()
            java.lang.String r8 = m3137z(r8)
            java.lang.StackTraceElement[] r9 = r9.getStackTrace()
            int r1 = r9.length
        Lca:
            if (r3 >= r1) goto Lf1
            r2 = r9[r3]
            boolean r4 = r2.isNativeMethod()
            if (r4 == 0) goto Ld5
            goto Lee
        Ld5:
            java.lang.String r4 = r2.getClassName()
            if (r4 == 0) goto Lee
            java.lang.String r4 = m3137z(r4)
            boolean r4 = r4.equals(r8)
            if (r4 == 0) goto Lee
            java.lang.String r8 = ": "
            r0.append(r8)
            r0.append(r2)
            goto Lf1
        Lee:
            int r3 = r3 + 1
            goto Lca
        Lf1:
            java.lang.String r8 = r0.toString()
            return r8
        Lf6:
            boolean r0 = r9 instanceof p249o7.C5001g3
            if (r0 == 0) goto Lff
            o7.g3 r9 = (p249o7.C5001g3) r9
            java.lang.String r8 = r9.f19699a
            return r8
        Lff:
            if (r8 == 0) goto L102
            return r2
        L102:
            java.lang.String r8 = java.lang.String.valueOf(r9)
            return r8
    }

    /* renamed from: z */
    public static java.lang.String m3137z(java.lang.String r2) {
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L9
            java.lang.String r2 = ""
            return r2
        L9:
            r0 = 46
            int r0 = r2.lastIndexOf(r0)
            r1 = -1
            if (r0 != r1) goto L13
            return r2
        L13:
            r1 = 0
            java.lang.String r2 = r2.substring(r1, r0)
            return r2
    }

    @Override // p249o7.AbstractC5050m4
    /* renamed from: k */
    public final boolean mo3138k() {
            r1 = this;
            r0 = 0
            return r0
    }

    /* renamed from: p */
    public final p249o7.C4993f3 m3139p() {
            r1 = this;
            o7.f3 r0 = r1.f5679m
            return r0
    }

    /* renamed from: q */
    public final p249o7.C4993f3 m3140q() {
            r1 = this;
            o7.f3 r0 = r1.f5672f
            return r0
    }

    /* renamed from: r */
    public final p249o7.C4993f3 m3141r() {
            r1 = this;
            o7.f3 r0 = r1.f5680n
            return r0
    }

    /* renamed from: s */
    public final p249o7.C4993f3 m3142s() {
            r1 = this;
            o7.f3 r0 = r1.f5675i
            return r0
    }

    /* renamed from: t */
    public final p249o7.C4993f3 m3143t() {
            r1 = this;
            o7.f3 r0 = r1.f5677k
            return r0
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"logTagDoNotUseDirectly"})
    /* renamed from: x */
    public final java.lang.String m3144x() {
            r2 = this;
            monitor-enter(r2)
            java.lang.String r0 = r2.f5671e     // Catch: java.lang.Throwable -> L24
            if (r0 != 0) goto L19
            com.google.android.gms.measurement.internal.d r0 = r2.f5736a     // Catch: java.lang.Throwable -> L24
            java.lang.String r1 = r0.f5713d     // Catch: java.lang.Throwable -> L24
            if (r1 == 0) goto Le
            r2.f5671e = r1     // Catch: java.lang.Throwable -> L24
            goto L19
        Le:
            o7.f r0 = r0.f5716g     // Catch: java.lang.Throwable -> L24
            com.google.android.gms.measurement.internal.d r0 = r0.f5736a     // Catch: java.lang.Throwable -> L24
            java.util.Objects.requireNonNull(r0)     // Catch: java.lang.Throwable -> L24
            java.lang.String r0 = "FA"
            r2.f5671e = r0     // Catch: java.lang.Throwable -> L24
        L19:
            java.lang.String r0 = r2.f5671e     // Catch: java.lang.Throwable -> L24
            java.lang.String r1 = "null reference"
            java.util.Objects.requireNonNull(r0, r1)     // Catch: java.lang.Throwable -> L24
            java.lang.String r0 = r2.f5671e     // Catch: java.lang.Throwable -> L24
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L24
            return r0
        L24:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L24
            throw r0
    }

    /* renamed from: y */
    public final void m3145y(int r8, boolean r9, boolean r10, java.lang.String r11, java.lang.Object r12, java.lang.Object r13, java.lang.Object r14) {
            r7 = this;
            if (r9 != 0) goto L18
            java.lang.String r9 = r7.m3144x()
            boolean r9 = android.util.Log.isLoggable(r9, r8)
            if (r9 == 0) goto L18
            r9 = 0
            java.lang.String r9 = m3135v(r9, r11, r12, r13, r14)
            java.lang.String r0 = r7.m3144x()
            android.util.Log.println(r8, r0, r9)
        L18:
            if (r10 != 0) goto L5b
            r9 = 5
            if (r8 < r9) goto L5b
            java.lang.String r9 = "null reference"
            java.util.Objects.requireNonNull(r11, r9)
            com.google.android.gms.measurement.internal.d r9 = r7.f5736a
            o7.f4 r9 = r9.f5719j
            r10 = 6
            if (r9 != 0) goto L33
            java.lang.String r8 = r7.m3144x()
            java.lang.String r9 = "Scheduler not set. Not logging error/warn"
            android.util.Log.println(r10, r8, r9)
            return
        L33:
            boolean r0 = r9.m11318o()
            if (r0 != 0) goto L43
            java.lang.String r8 = r7.m3144x()
            java.lang.String r9 = "Scheduler not initialized. Not logging error/warn"
            android.util.Log.println(r10, r8, r9)
            return
        L43:
            r10 = 9
            if (r8 < r10) goto L4c
            r8 = 8
            r2 = 8
            goto L4d
        L4c:
            r2 = r8
        L4d:
            o7.e3 r8 = new o7.e3
            r0 = r8
            r1 = r7
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r9.m11176s(r8)
        L5b:
            return
    }
}
