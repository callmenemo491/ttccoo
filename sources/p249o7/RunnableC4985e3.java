package p249o7;

/* renamed from: o7.e3 */
/* loaded from: classes.dex */
public final class RunnableC4985e3 implements java.lang.Runnable {

    /* renamed from: Y */
    public final /* synthetic */ int f19653Y;

    /* renamed from: Z */
    public final int f19654Z;

    /* renamed from: a0 */
    public final java.lang.String f19655a0;

    /* renamed from: b0 */
    public final java.lang.Object f19656b0;

    /* renamed from: c0 */
    public final java.lang.Object f19657c0;

    /* renamed from: d0 */
    public final java.lang.Object f19658d0;

    /* renamed from: e0 */
    public final java.lang.Object f19659e0;

    public RunnableC4985e3(com.google.android.gms.measurement.internal.C1111b r2, int r3, java.lang.String r4, java.lang.Object r5, java.lang.Object r6, java.lang.Object r7) {
            r1 = this;
            r0 = 0
            r1.f19653Y = r0
            r1.f19659e0 = r2
            r1.f19654Z = r3
            r1.f19655a0 = r4
            r1.f19656b0 = r5
            r1.f19657c0 = r6
            r1.f19658d0 = r7
            r1.<init>()
            return
    }

    public RunnableC4985e3(java.lang.String r2, p249o7.InterfaceC5017i3 r3, int r4, java.lang.Throwable r5, byte[] r6, java.util.Map r7) {
            r1 = this;
            r0 = 1
            r1.f19653Y = r0
            r1.<init>()
            java.lang.String r0 = "null reference"
            java.util.Objects.requireNonNull(r3, r0)
            r1.f19656b0 = r3
            r1.f19654Z = r4
            r1.f19657c0 = r5
            r1.f19658d0 = r6
            r1.f19655a0 = r2
            r1.f19659e0 = r7
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r13 = this;
            int r0 = r13.f19653Y
            switch(r0) {
                case 0: goto L7;
                default: goto L5;
            }
        L5:
            goto L183
        L7:
            java.lang.Object r0 = r13.f19659e0
            com.google.android.gms.measurement.internal.b r0 = (com.google.android.gms.measurement.internal.C1111b) r0
            com.google.android.gms.measurement.internal.d r0 = r0.f5736a
            com.google.android.gms.measurement.internal.c r0 = r0.m3175t()
            boolean r1 = r0.m11318o()
            if (r1 == 0) goto L174
            java.lang.Object r1 = r13.f19659e0
            com.google.android.gms.measurement.internal.b r1 = (com.google.android.gms.measurement.internal.C1111b) r1
            char r2 = r1.f5669c
            r3 = 1
            r4 = 0
            if (r2 != 0) goto L8a
            com.google.android.gms.measurement.internal.d r1 = r1.f5736a
            o7.f r1 = r1.f5716g
            java.lang.Boolean r2 = r1.f19667d
            if (r2 != 0) goto L69
            monitor-enter(r1)
            java.lang.Boolean r2 = r1.f19667d     // Catch: java.lang.Throwable -> L66
            if (r2 != 0) goto L64
            com.google.android.gms.measurement.internal.d r2 = r1.f5736a     // Catch: java.lang.Throwable -> L66
            android.content.Context r2 = r2.f5710a     // Catch: java.lang.Throwable -> L66
            android.content.pm.ApplicationInfo r2 = r2.getApplicationInfo()     // Catch: java.lang.Throwable -> L66
            java.lang.String r5 = p353u6.C6346i.m12996a()     // Catch: java.lang.Throwable -> L66
            if (r2 == 0) goto L4f
            java.lang.String r2 = r2.processName     // Catch: java.lang.Throwable -> L66
            if (r2 == 0) goto L48
            boolean r2 = r2.equals(r5)     // Catch: java.lang.Throwable -> L66
            if (r2 == 0) goto L48
            r2 = 1
            goto L49
        L48:
            r2 = 0
        L49:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch: java.lang.Throwable -> L66
            r1.f19667d = r2     // Catch: java.lang.Throwable -> L66
        L4f:
            java.lang.Boolean r2 = r1.f19667d     // Catch: java.lang.Throwable -> L66
            if (r2 != 0) goto L64
            java.lang.Boolean r2 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L66
            r1.f19667d = r2     // Catch: java.lang.Throwable -> L66
            com.google.android.gms.measurement.internal.d r2 = r1.f5736a     // Catch: java.lang.Throwable -> L66
            com.google.android.gms.measurement.internal.b r2 = r2.mo3162d()     // Catch: java.lang.Throwable -> L66
            o7.f3 r2 = r2.f5672f     // Catch: java.lang.Throwable -> L66
            java.lang.String r5 = "My process not in the list of running processes"
            r2.m11169c(r5)     // Catch: java.lang.Throwable -> L66
        L64:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L66
            goto L69
        L66:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L66
            throw r0
        L69:
            java.lang.Boolean r1 = r1.f19667d
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L7d
            java.lang.Object r1 = r13.f19659e0
            com.google.android.gms.measurement.internal.b r1 = (com.google.android.gms.measurement.internal.C1111b) r1
            com.google.android.gms.measurement.internal.d r2 = r1.f5736a
            java.util.Objects.requireNonNull(r2)
            r2 = 67
            goto L88
        L7d:
            java.lang.Object r1 = r13.f19659e0
            com.google.android.gms.measurement.internal.b r1 = (com.google.android.gms.measurement.internal.C1111b) r1
            com.google.android.gms.measurement.internal.d r2 = r1.f5736a
            java.util.Objects.requireNonNull(r2)
            r2 = 99
        L88:
            r1.f5669c = r2
        L8a:
            java.lang.Object r1 = r13.f19659e0
            com.google.android.gms.measurement.internal.b r1 = (com.google.android.gms.measurement.internal.C1111b) r1
            long r5 = r1.f5670d
            r7 = 0
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 >= 0) goto La2
            com.google.android.gms.measurement.internal.d r2 = r1.f5736a
            o7.f r2 = r2.f5716g
            r2.m11157q()
            r5 = 43042(0xa822, double:2.12656E-319)
            r1.f5670d = r5
        La2:
            int r1 = r13.f19654Z
            java.lang.String r2 = "01VDIWEA?"
            char r1 = r2.charAt(r1)
            java.lang.Object r2 = r13.f19659e0
            com.google.android.gms.measurement.internal.b r2 = (com.google.android.gms.measurement.internal.C1111b) r2
            char r5 = r2.f5669c
            long r9 = r2.f5670d
            java.lang.String r2 = r13.f19655a0
            java.lang.Object r6 = r13.f19656b0
            java.lang.Object r11 = r13.f19657c0
            java.lang.Object r12 = r13.f19658d0
            java.lang.String r2 = com.google.android.gms.measurement.internal.C1111b.m3135v(r3, r2, r6, r11, r12)
            java.lang.String r3 = java.lang.String.valueOf(r2)
            int r3 = r3.length()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            int r3 = r3 + 24
            r6.<init>(r3)
            java.lang.String r3 = "2"
            r6.append(r3)
            r6.append(r1)
            r6.append(r5)
            r6.append(r9)
            java.lang.String r1 = ":"
            r6.append(r1)
            r6.append(r2)
            java.lang.String r1 = r6.toString()
            int r2 = r1.length()
            r3 = 1024(0x400, float:1.435E-42)
            if (r2 <= r3) goto Lf5
            java.lang.String r1 = r13.f19655a0
            java.lang.String r1 = r1.substring(r4, r3)
        Lf5:
            o7.q3 r0 = r0.f5683d
            if (r0 == 0) goto L182
            com.google.android.gms.measurement.internal.c r2 = r0.f19962e
            r2.mo3183i()
            com.google.android.gms.measurement.internal.c r2 = r0.f19962e
            android.content.SharedPreferences r2 = r2.m3147p()
            java.lang.String r3 = r0.f19958a
            long r2 = r2.getLong(r3, r7)
            int r4 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r4 != 0) goto L111
            r0.m11413a()
        L111:
            if (r1 != 0) goto L115
            java.lang.String r1 = ""
        L115:
            com.google.android.gms.measurement.internal.c r2 = r0.f19962e
            android.content.SharedPreferences r2 = r2.m3147p()
            java.lang.String r3 = r0.f19959b
            long r2 = r2.getLong(r3, r7)
            r4 = 1
            int r6 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r6 > 0) goto L13f
            com.google.android.gms.measurement.internal.c r2 = r0.f19962e
            android.content.SharedPreferences r2 = r2.m3147p()
            android.content.SharedPreferences$Editor r2 = r2.edit()
            java.lang.String r3 = r0.f19960c
            r2.putString(r3, r1)
            java.lang.String r0 = r0.f19959b
            r2.putLong(r0, r4)
            r2.apply()
            goto L182
        L13f:
            com.google.android.gms.measurement.internal.c r6 = r0.f19962e
            com.google.android.gms.measurement.internal.d r6 = r6.f5736a
            com.google.android.gms.measurement.internal.f r6 = r6.m3158A()
            java.security.SecureRandom r6 = r6.m3235t()
            long r6 = r6.nextLong()
            long r2 = r2 + r4
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            long r8 = r4 / r2
            com.google.android.gms.measurement.internal.c r10 = r0.f19962e
            android.content.SharedPreferences r10 = r10.m3147p()
            android.content.SharedPreferences$Editor r10 = r10.edit()
            long r4 = r4 & r6
            int r6 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r6 >= 0) goto L16b
            java.lang.String r4 = r0.f19960c
            r10.putString(r4, r1)
        L16b:
            java.lang.String r0 = r0.f19959b
            r10.putLong(r0, r2)
            r10.apply()
            goto L182
        L174:
            r0 = 6
            java.lang.Object r1 = r13.f19659e0
            com.google.android.gms.measurement.internal.b r1 = (com.google.android.gms.measurement.internal.C1111b) r1
            java.lang.String r1 = r1.m3144x()
            java.lang.String r2 = "Persisted config not initialized. Not logging error/warn"
            android.util.Log.println(r0, r1, r2)
        L182:
            return
        L183:
            java.lang.Object r0 = r13.f19656b0
            r1 = r0
            o7.i3 r1 = (p249o7.InterfaceC5017i3) r1
            java.lang.String r2 = r13.f19655a0
            int r3 = r13.f19654Z
            java.lang.Object r0 = r13.f19657c0
            r4 = r0
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            java.lang.Object r0 = r13.f19658d0
            r5 = r0
            byte[] r5 = (byte[]) r5
            java.lang.Object r0 = r13.f19659e0
            r6 = r0
            java.util.Map r6 = (java.util.Map) r6
            r1.mo812b(r2, r3, r4, r5, r6)
            return
    }
}
