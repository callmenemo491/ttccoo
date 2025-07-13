package p249o7;

/* renamed from: o7.v4 */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC5122v4 implements java.lang.Runnable {

    /* renamed from: Y */
    public final /* synthetic */ int f20131Y;

    /* renamed from: Z */
    public final /* synthetic */ p249o7.C4979d5 f20132Z;

    /* renamed from: a0 */
    public final /* synthetic */ android.os.Bundle f20133a0;

    public RunnableC5122v4(p249o7.C4979d5 r2, android.os.Bundle r3, int r4) {
            r1 = this;
            r1.f20131Y = r4
            r0 = 1
            if (r4 == r0) goto L18
            r0 = 2
            if (r4 == r0) goto L10
            r1.<init>()
            r1.f20132Z = r2
            r1.f20133a0 = r3
            return
        L10:
            r1.f20132Z = r2
            r1.f20133a0 = r3
            r1.<init>()
            return
        L18:
            r1.f20132Z = r2
            r1.f20133a0 = r3
            r1.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r42 = this;
            r0 = r42
            int r1 = r0.f20131Y
            java.lang.String r2 = "time_to_live"
            java.lang.String r3 = "trigger_timeout"
            java.lang.String r4 = "trigger_event_name"
            java.lang.String r5 = "creation_timestamp"
            java.lang.String r6 = "expired_event_params"
            java.lang.String r7 = "expired_event_name"
            java.lang.String r8 = "origin"
            java.lang.String r9 = "name"
            java.lang.String r10 = "null reference"
            java.lang.String r11 = "app_id"
            switch(r1) {
                case 0: goto Lf8;
                case 1: goto L1d;
                default: goto L1b;
            }
        L1b:
            goto L220
        L1d:
            o7.d5 r1 = r0.f20132Z
            android.os.Bundle r12 = r0.f20133a0
            r1.mo3183i()
            r1.m11419j()
            java.util.Objects.requireNonNull(r12, r10)
            java.lang.String r14 = r12.getString(r9)
            java.lang.String r8 = r12.getString(r8)
            com.google.android.gms.common.internal.C1101a.m3100e(r14)
            com.google.android.gms.common.internal.C1101a.m3100e(r8)
            java.lang.String r9 = "value"
            java.lang.Object r13 = r12.get(r9)
            java.util.Objects.requireNonNull(r13, r10)
            com.google.android.gms.measurement.internal.d r10 = r1.f5736a
            boolean r10 = r10.m3165g()
            if (r10 != 0) goto L58
            com.google.android.gms.measurement.internal.d r1 = r1.f5736a
            com.google.android.gms.measurement.internal.b r1 = r1.mo3162d()
            o7.f3 r1 = r1.f5680n
            java.lang.String r2 = "Conditional property not set since app measurement is disabled"
            r1.m11169c(r2)
            goto Lf7
        L58:
            o7.p6 r10 = new o7.p6
            java.lang.String r13 = "triggered_timestamp"
            long r15 = r12.getLong(r13)
            java.lang.Object r17 = r12.get(r9)
            r13 = r10
            r18 = r8
            r13.<init>(r14, r15, r17, r18)
            com.google.android.gms.measurement.internal.d r9 = r1.f5736a     // Catch: java.lang.IllegalArgumentException -> Lf7
            com.google.android.gms.measurement.internal.f r15 = r9.m3158A()     // Catch: java.lang.IllegalArgumentException -> Lf7
            java.lang.String r16 = r12.getString(r11)     // Catch: java.lang.IllegalArgumentException -> Lf7
            java.lang.String r9 = "triggered_event_name"
            java.lang.String r17 = r12.getString(r9)     // Catch: java.lang.IllegalArgumentException -> Lf7
            java.lang.String r9 = "triggered_event_params"
            android.os.Bundle r18 = r12.getBundle(r9)     // Catch: java.lang.IllegalArgumentException -> Lf7
            r20 = 0
            r22 = 1
            r23 = 1
            r19 = r8
            o7.q r26 = r15.m3236t0(r16, r17, r18, r19, r20, r22, r23)     // Catch: java.lang.IllegalArgumentException -> Lf7
            com.google.android.gms.measurement.internal.d r9 = r1.f5736a     // Catch: java.lang.IllegalArgumentException -> Lf7
            com.google.android.gms.measurement.internal.f r15 = r9.m3158A()     // Catch: java.lang.IllegalArgumentException -> Lf7
            java.lang.String r16 = r12.getString(r11)     // Catch: java.lang.IllegalArgumentException -> Lf7
            java.lang.String r9 = "timed_out_event_name"
            java.lang.String r17 = r12.getString(r9)     // Catch: java.lang.IllegalArgumentException -> Lf7
            java.lang.String r9 = "timed_out_event_params"
            android.os.Bundle r18 = r12.getBundle(r9)     // Catch: java.lang.IllegalArgumentException -> Lf7
            r20 = 0
            r22 = 1
            r23 = 1
            r19 = r8
            o7.q r9 = r15.m3236t0(r16, r17, r18, r19, r20, r22, r23)     // Catch: java.lang.IllegalArgumentException -> Lf7
            com.google.android.gms.measurement.internal.d r13 = r1.f5736a     // Catch: java.lang.IllegalArgumentException -> Lf7
            com.google.android.gms.measurement.internal.f r15 = r13.m3158A()     // Catch: java.lang.IllegalArgumentException -> Lf7
            java.lang.String r16 = r12.getString(r11)     // Catch: java.lang.IllegalArgumentException -> Lf7
            java.lang.String r17 = r12.getString(r7)     // Catch: java.lang.IllegalArgumentException -> Lf7
            android.os.Bundle r18 = r12.getBundle(r6)     // Catch: java.lang.IllegalArgumentException -> Lf7
            r20 = 0
            r22 = 1
            r23 = 1
            r19 = r8
            o7.q r29 = r15.m3236t0(r16, r17, r18, r19, r20, r22, r23)     // Catch: java.lang.IllegalArgumentException -> Lf7
            o7.b r6 = new o7.b
            java.lang.String r16 = r12.getString(r11)
            long r19 = r12.getLong(r5)
            r21 = 0
            java.lang.String r22 = r12.getString(r4)
            long r24 = r12.getLong(r3)
            long r27 = r12.getLong(r2)
            r15 = r6
            r17 = r8
            r18 = r10
            r23 = r9
            r15.<init>(r16, r17, r18, r19, r21, r22, r23, r24, r26, r27, r29)
            com.google.android.gms.measurement.internal.d r1 = r1.f5736a
            o7.v5 r1 = r1.m3179y()
            r1.m11427n(r6)
        Lf7:
            return
        Lf8:
            o7.d5 r1 = r0.f20132Z
            android.os.Bundle r2 = r0.f20133a0
            if (r2 != 0) goto L110
            com.google.android.gms.measurement.internal.d r1 = r1.f5736a
            com.google.android.gms.measurement.internal.c r1 = r1.m3175t()
            o7.o3 r1 = r1.f5701v
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            r1.m11377b(r2)
            goto L21f
        L110:
            com.google.android.gms.measurement.internal.d r3 = r1.f5736a
            com.google.android.gms.measurement.internal.c r3 = r3.m3175t()
            o7.o3 r3 = r3.f5701v
            android.os.Bundle r3 = r3.m11376a()
            java.util.Set r4 = r2.keySet()
            java.util.Iterator r4 = r4.iterator()
        L124:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L1a7
            java.lang.Object r5 = r4.next()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r6 = r2.get(r5)
            if (r6 == 0) goto L16d
            boolean r7 = r6 instanceof java.lang.String
            if (r7 != 0) goto L16d
            boolean r7 = r6 instanceof java.lang.Long
            if (r7 != 0) goto L16d
            boolean r7 = r6 instanceof java.lang.Double
            if (r7 != 0) goto L16d
            com.google.android.gms.measurement.internal.d r7 = r1.f5736a
            com.google.android.gms.measurement.internal.f r7 = r7.m3158A()
            boolean r7 = r7.m3215T(r6)
            if (r7 == 0) goto L15f
            com.google.android.gms.measurement.internal.d r7 = r1.f5736a
            com.google.android.gms.measurement.internal.f r8 = r7.m3158A()
            o7.s6 r9 = r1.f19645p
            r10 = 0
            r11 = 27
            r12 = 0
            r13 = 0
            r14 = 0
            r8.m3196A(r9, r10, r11, r12, r13, r14)
        L15f:
            com.google.android.gms.measurement.internal.d r7 = r1.f5736a
            com.google.android.gms.measurement.internal.b r7 = r7.mo3162d()
            o7.f3 r7 = r7.f5677k
            java.lang.String r8 = "Invalid default event parameter type. Name, value"
            r7.m11171e(r8, r5, r6)
            goto L124
        L16d:
            boolean r7 = com.google.android.gms.measurement.internal.C1115f.m3184V(r5)
            if (r7 == 0) goto L181
            com.google.android.gms.measurement.internal.d r6 = r1.f5736a
            com.google.android.gms.measurement.internal.b r6 = r6.mo3162d()
            o7.f3 r6 = r6.f5677k
            java.lang.String r7 = "Invalid default event parameter name. Name"
            r6.m11170d(r7, r5)
            goto L124
        L181:
            if (r6 != 0) goto L187
            r3.remove(r5)
            goto L124
        L187:
            com.google.android.gms.measurement.internal.d r7 = r1.f5736a
            com.google.android.gms.measurement.internal.f r7 = r7.m3158A()
            com.google.android.gms.measurement.internal.d r8 = r1.f5736a
            java.util.Objects.requireNonNull(r8)
            r8 = 100
            java.lang.String r9 = "param"
            boolean r7 = r7.m3209N(r9, r5, r8, r6)
            if (r7 == 0) goto L124
            com.google.android.gms.measurement.internal.d r7 = r1.f5736a
            com.google.android.gms.measurement.internal.f r7 = r7.m3158A()
            r7.m3197B(r3, r5, r6)
            goto L124
        L1a7:
            com.google.android.gms.measurement.internal.d r2 = r1.f5736a
            r2.m3158A()
            com.google.android.gms.measurement.internal.d r2 = r1.f5736a
            o7.f r2 = r2.f5716g
            int r2 = r2.m11153m()
            int r4 = r3.size()
            r5 = 0
            if (r4 > r2) goto L1bc
            goto L1fc
        L1bc:
            java.util.TreeSet r4 = new java.util.TreeSet
            java.util.Set r6 = r3.keySet()
            r4.<init>(r6)
            java.util.Iterator r4 = r4.iterator()
            r6 = 0
        L1ca:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L1de
            java.lang.Object r7 = r4.next()
            java.lang.String r7 = (java.lang.String) r7
            int r6 = r6 + 1
            if (r6 <= r2) goto L1ca
            r3.remove(r7)
            goto L1ca
        L1de:
            com.google.android.gms.measurement.internal.d r2 = r1.f5736a
            com.google.android.gms.measurement.internal.f r6 = r2.m3158A()
            o7.s6 r7 = r1.f19645p
            r8 = 0
            r9 = 26
            r10 = 0
            r11 = 0
            r12 = 0
            r6.m3196A(r7, r8, r9, r10, r11, r12)
            com.google.android.gms.measurement.internal.d r2 = r1.f5736a
            com.google.android.gms.measurement.internal.b r2 = r2.mo3162d()
            o7.f3 r2 = r2.f5677k
            java.lang.String r4 = "Too many default event parameters set. Discarding beyond event parameter limit"
            r2.m11169c(r4)
        L1fc:
            com.google.android.gms.measurement.internal.d r2 = r1.f5736a
            com.google.android.gms.measurement.internal.c r2 = r2.m3175t()
            o7.o3 r2 = r2.f5701v
            r2.m11377b(r3)
            com.google.android.gms.measurement.internal.d r1 = r1.f5736a
            o7.v5 r1 = r1.m3179y()
            r1.mo3183i()
            r1.m11419j()
            o7.u6 r2 = r1.m11431r(r5)
            c6.h0 r4 = new c6.h0
            r4.<init>(r1, r2, r3)
            r1.m11434u(r4)
        L21f:
            return
        L220:
            o7.d5 r1 = r0.f20132Z
            android.os.Bundle r12 = r0.f20133a0
            r1.mo3183i()
            r1.m11419j()
            java.util.Objects.requireNonNull(r12, r10)
            java.lang.String r10 = r12.getString(r9)
            com.google.android.gms.common.internal.C1101a.m3100e(r10)
            com.google.android.gms.measurement.internal.d r10 = r1.f5736a
            boolean r10 = r10.m3165g()
            if (r10 == 0) goto L2e0
            com.google.android.gms.measurement.internal.d r10 = r1.f5736a
            o7.f r10 = r10.f5716g
            o7.u2<java.lang.Boolean> r13 = p249o7.C5120v2.f20111o0
            r14 = 0
            boolean r10 = r10.m11162v(r14, r13)
            if (r10 == 0) goto L25a
            o7.p6 r10 = new o7.p6
            java.lang.String r16 = r12.getString(r9)
            r17 = 0
            r19 = 0
            java.lang.String r20 = ""
            r15 = r10
            r15.<init>(r16, r17, r19, r20)
            goto L26b
        L25a:
            o7.p6 r10 = new o7.p6
            java.lang.String r22 = r12.getString(r9)
            r23 = 0
            r25 = 0
            r26 = 0
            r21 = r10
            r21.<init>(r22, r23, r25, r26)
        L26b:
            r30 = r10
            com.google.android.gms.measurement.internal.d r9 = r1.f5736a     // Catch: java.lang.IllegalArgumentException -> L2ed
            com.google.android.gms.measurement.internal.f r15 = r9.m3158A()     // Catch: java.lang.IllegalArgumentException -> L2ed
            java.lang.String r16 = r12.getString(r11)     // Catch: java.lang.IllegalArgumentException -> L2ed
            java.lang.String r17 = r12.getString(r7)     // Catch: java.lang.IllegalArgumentException -> L2ed
            android.os.Bundle r18 = r12.getBundle(r6)     // Catch: java.lang.IllegalArgumentException -> L2ed
            com.google.android.gms.measurement.internal.d r6 = r1.f5736a     // Catch: java.lang.IllegalArgumentException -> L2ed
            o7.f r6 = r6.f5716g     // Catch: java.lang.IllegalArgumentException -> L2ed
            boolean r6 = r6.m11162v(r14, r13)     // Catch: java.lang.IllegalArgumentException -> L2ed
            java.lang.String r7 = ""
            if (r6 == 0) goto L28e
            r19 = r7
            goto L294
        L28e:
            java.lang.String r6 = r12.getString(r8)     // Catch: java.lang.IllegalArgumentException -> L2ed
            r19 = r6
        L294:
            long r20 = r12.getLong(r5)     // Catch: java.lang.IllegalArgumentException -> L2ed
            r22 = 1
            r23 = 1
            o7.q r41 = r15.m3236t0(r16, r17, r18, r19, r20, r22, r23)     // Catch: java.lang.IllegalArgumentException -> L2ed
            o7.b r6 = new o7.b
            java.lang.String r28 = r12.getString(r11)
            com.google.android.gms.measurement.internal.d r9 = r1.f5736a
            o7.f r9 = r9.f5716g
            boolean r9 = r9.m11162v(r14, r13)
            if (r9 == 0) goto L2b1
            goto L2b5
        L2b1:
            java.lang.String r7 = r12.getString(r8)
        L2b5:
            r29 = r7
            long r31 = r12.getLong(r5)
            java.lang.String r5 = "active"
            boolean r33 = r12.getBoolean(r5)
            java.lang.String r34 = r12.getString(r4)
            r35 = 0
            long r36 = r12.getLong(r3)
            r38 = 0
            long r39 = r12.getLong(r2)
            r27 = r6
            r27.<init>(r28, r29, r30, r31, r33, r34, r35, r36, r38, r39, r41)
            com.google.android.gms.measurement.internal.d r1 = r1.f5736a
            o7.v5 r1 = r1.m3179y()
            r1.m11427n(r6)
            goto L2ed
        L2e0:
            com.google.android.gms.measurement.internal.d r1 = r1.f5736a
            com.google.android.gms.measurement.internal.b r1 = r1.mo3162d()
            o7.f3 r1 = r1.f5680n
            java.lang.String r2 = "Conditional property not cleared since app measurement is disabled"
            r1.m11169c(r2)
        L2ed:
            return
    }
}
