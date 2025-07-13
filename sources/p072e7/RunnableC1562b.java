package p072e7;

/* renamed from: e7.b */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1562b implements java.lang.Runnable {

    /* renamed from: Y */
    public final /* synthetic */ int f7486Y;

    /* renamed from: Z */
    public final /* synthetic */ java.lang.Object f7487Z;

    /* renamed from: a0 */
    public final /* synthetic */ java.lang.Object f7488a0;

    /* renamed from: b0 */
    public final /* synthetic */ java.lang.Object f7489b0;

    /* renamed from: c0 */
    public final /* synthetic */ java.lang.Object f7490c0;

    public RunnableC1562b(com.google.android.gms.measurement.internal.AppMeasurementDynamiteService r2, p185k7.InterfaceC3956r0 r3, java.lang.String r4, java.lang.String r5) {
            r1 = this;
            r0 = 5
            r1.f7486Y = r0
            r1.f7490c0 = r2
            r1.f7487Z = r3
            r1.f7488a0 = r4
            r1.f7489b0 = r5
            r1.<init>()
            return
    }

    public RunnableC1562b(com.google.android.gms.measurement.internal.AppMeasurementDynamiteService r2, p185k7.InterfaceC3956r0 r3, p249o7.C5077q r4, java.lang.String r5) {
            r1 = this;
            r0 = 2
            r1.f7486Y = r0
            r1.f7490c0 = r2
            r1.f7487Z = r3
            r1.f7488a0 = r4
            r1.f7489b0 = r5
            r1.<init>()
            return
    }

    public /* synthetic */ RunnableC1562b(p072e7.C1572c r2, p085f1.C1974o.i r3, p085f1.C1974o.i r4, p072e7.C1782x4 r5) {
            r1 = this;
            r0 = 0
            r1.f7486Y = r0
            r1.<init>()
            r1.f7487Z = r2
            r1.f7488a0 = r3
            r1.f7489b0 = r4
            r1.f7490c0 = r5
            return
    }

    public RunnableC1562b(p249o7.C4979d5 r2, java.util.concurrent.atomic.AtomicReference r3, java.lang.String r4, java.lang.String r5) {
            r1 = this;
            r0 = 1
            r1.f7486Y = r0
            r1.f7490c0 = r2
            r1.f7487Z = r3
            r1.f7488a0 = r4
            r1.f7489b0 = r5
            r1.<init>()
            return
    }

    public RunnableC1562b(p249o7.C5036k6 r2, java.lang.String r3, android.os.Bundle r4) {
            r1 = this;
            r0 = 4
            r1.f7486Y = r0
            r1.f7490c0 = r2
            r1.f7487Z = r3
            java.lang.String r2 = "_err"
            r1.f7488a0 = r2
            r1.f7489b0 = r4
            r1.<init>()
            return
    }

    public RunnableC1562b(p249o7.C5123v5 r2, p249o7.C5077q r3, java.lang.String r4, p185k7.InterfaceC3956r0 r5) {
            r1 = this;
            r0 = 3
            r1.f7486Y = r0
            r1.f7490c0 = r2
            r1.f7487Z = r3
            r1.f7488a0 = r4
            r1.f7489b0 = r5
            r1.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r25 = this;
            r1 = r25
            int r0 = r1.f7486Y
            r2 = 0
            java.lang.String r3 = "null reference"
            r4 = 0
            switch(r0) {
                case 0: goto L13b;
                case 1: goto L10d;
                case 2: goto Lb7;
                case 3: goto L52;
                case 4: goto Ld;
                default: goto Lb;
            }
        Lb:
            goto L2ea
        Ld:
            java.lang.Object r0 = r1.f7490c0
            o7.k6 r0 = (p249o7.C5036k6) r0
            o7.m6 r0 = r0.f19811Y
            com.google.android.gms.measurement.internal.f r4 = r0.m11345Q()
            java.lang.Object r0 = r1.f7487Z
            r5 = r0
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r0 = r1.f7488a0
            r6 = r0
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r0 = r1.f7489b0
            r7 = r0
            android.os.Bundle r7 = (android.os.Bundle) r7
            java.lang.Object r0 = r1.f7490c0
            o7.k6 r0 = (p249o7.C5036k6) r0
            o7.m6 r0 = r0.f19811Y
            u6.c r0 = r0.mo3163e()
            u6.d r0 = (p353u6.C6341d) r0
            java.util.Objects.requireNonNull(r0)
            long r9 = java.lang.System.currentTimeMillis()
            r11 = 0
            r12 = 1
            java.lang.String r8 = "auto"
            o7.q r0 = r4.m3236t0(r5, r6, r7, r8, r9, r11, r12)
            java.lang.Object r2 = r1.f7490c0
            o7.k6 r2 = (p249o7.C5036k6) r2
            o7.m6 r2 = r2.f19811Y
            java.util.Objects.requireNonNull(r0, r3)
            java.lang.Object r3 = r1.f7487Z
            java.lang.String r3 = (java.lang.String) r3
            r2.m11351j(r0, r3)
            return
        L52:
            java.lang.Object r0 = r1.f7490c0     // Catch: java.lang.Throwable -> L7f android.os.RemoteException -> L81
            r2 = r0
            o7.v5 r2 = (p249o7.C5123v5) r2     // Catch: java.lang.Throwable -> L7f android.os.RemoteException -> L81
            o7.z2 r2 = r2.f20135d     // Catch: java.lang.Throwable -> L7f android.os.RemoteException -> L81
            if (r2 != 0) goto L6b
            o7.v5 r0 = (p249o7.C5123v5) r0     // Catch: java.lang.Throwable -> L7f android.os.RemoteException -> L81
            com.google.android.gms.measurement.internal.d r0 = r0.f5736a     // Catch: java.lang.Throwable -> L7f android.os.RemoteException -> L81
            com.google.android.gms.measurement.internal.b r0 = r0.mo3162d()     // Catch: java.lang.Throwable -> L7f android.os.RemoteException -> L81
            o7.f3 r0 = r0.f5672f     // Catch: java.lang.Throwable -> L7f android.os.RemoteException -> L81
            java.lang.String r2 = "Discarding data. Failed to send event to service to bundle"
            r0.m11169c(r2)     // Catch: java.lang.Throwable -> L7f android.os.RemoteException -> L81
            goto L93
        L6b:
            java.lang.Object r0 = r1.f7487Z     // Catch: java.lang.Throwable -> L7f android.os.RemoteException -> L81
            o7.q r0 = (p249o7.C5077q) r0     // Catch: java.lang.Throwable -> L7f android.os.RemoteException -> L81
            java.lang.Object r3 = r1.f7488a0     // Catch: java.lang.Throwable -> L7f android.os.RemoteException -> L81
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L7f android.os.RemoteException -> L81
            byte[] r4 = r2.mo11308q0(r0, r3)     // Catch: java.lang.Throwable -> L7f android.os.RemoteException -> L81
            java.lang.Object r0 = r1.f7490c0     // Catch: java.lang.Throwable -> L7f android.os.RemoteException -> L81
            o7.v5 r0 = (p249o7.C5123v5) r0     // Catch: java.lang.Throwable -> L7f android.os.RemoteException -> L81
            r0.m11433t()     // Catch: java.lang.Throwable -> L7f android.os.RemoteException -> L81
            goto L93
        L7f:
            r0 = move-exception
            goto La5
        L81:
            r0 = move-exception
            java.lang.Object r2 = r1.f7490c0     // Catch: java.lang.Throwable -> L7f
            o7.v5 r2 = (p249o7.C5123v5) r2     // Catch: java.lang.Throwable -> L7f
            com.google.android.gms.measurement.internal.d r2 = r2.f5736a     // Catch: java.lang.Throwable -> L7f
            com.google.android.gms.measurement.internal.b r2 = r2.mo3162d()     // Catch: java.lang.Throwable -> L7f
            o7.f3 r2 = r2.f5672f     // Catch: java.lang.Throwable -> L7f
            java.lang.String r3 = "Failed to send event to the service to bundle"
            r2.m11170d(r3, r0)     // Catch: java.lang.Throwable -> L7f
        L93:
            java.lang.Object r0 = r1.f7490c0
            o7.v5 r0 = (p249o7.C5123v5) r0
            com.google.android.gms.measurement.internal.d r0 = r0.f5736a
            com.google.android.gms.measurement.internal.f r0 = r0.m3158A()
            java.lang.Object r2 = r1.f7489b0
            k7.r0 r2 = (p185k7.InterfaceC3956r0) r2
            r0.m3201F(r2, r4)
            return
        La5:
            java.lang.Object r2 = r1.f7490c0
            o7.v5 r2 = (p249o7.C5123v5) r2
            com.google.android.gms.measurement.internal.d r2 = r2.f5736a
            com.google.android.gms.measurement.internal.f r2 = r2.m3158A()
            java.lang.Object r3 = r1.f7489b0
            k7.r0 r3 = (p185k7.InterfaceC3956r0) r3
            r2.m3201F(r3, r4)
            throw r0
        Lb7:
            java.lang.Object r0 = r1.f7490c0
            com.google.android.gms.measurement.internal.AppMeasurementDynamiteService r0 = (com.google.android.gms.measurement.internal.AppMeasurementDynamiteService) r0
            com.google.android.gms.measurement.internal.d r0 = r0.f5656a
            o7.v5 r0 = r0.m3179y()
            java.lang.Object r3 = r1.f7487Z
            k7.r0 r3 = (p185k7.InterfaceC3956r0) r3
            java.lang.Object r4 = r1.f7488a0
            o7.q r4 = (p249o7.C5077q) r4
            java.lang.Object r5 = r1.f7489b0
            java.lang.String r5 = (java.lang.String) r5
            r0.mo3183i()
            r0.m11419j()
            com.google.android.gms.measurement.internal.d r6 = r0.f5736a
            com.google.android.gms.measurement.internal.f r6 = r6.m3158A()
            java.util.Objects.requireNonNull(r6)
            k6.f r7 = p184k6.C3703f.f16409b
            com.google.android.gms.measurement.internal.d r6 = r6.f5736a
            android.content.Context r6 = r6.f5710a
            r8 = 12451000(0xbdfcb8, float:1.7447567E-38)
            int r6 = r7.mo8164b(r6, r8)
            if (r6 == 0) goto L104
            com.google.android.gms.measurement.internal.d r4 = r0.f5736a
            com.google.android.gms.measurement.internal.b r4 = r4.mo3162d()
            o7.f3 r4 = r4.f5675i
            java.lang.String r5 = "Not bundling data. Service unavailable or out of date"
            r4.m11169c(r5)
            com.google.android.gms.measurement.internal.d r0 = r0.f5736a
            com.google.android.gms.measurement.internal.f r0 = r0.m3158A()
            byte[] r2 = new byte[r2]
            r0.m3201F(r3, r2)
            goto L10c
        L104:
            e7.b r2 = new e7.b
            r2.<init>(r0, r4, r5, r3)
            r0.m11434u(r2)
        L10c:
            return
        L10d:
            java.lang.Object r0 = r1.f7490c0
            o7.d5 r0 = (p249o7.C4979d5) r0
            com.google.android.gms.measurement.internal.d r0 = r0.f5736a
            o7.v5 r0 = r0.m3179y()
            java.lang.Object r3 = r1.f7487Z
            r5 = r3
            java.util.concurrent.atomic.AtomicReference r5 = (java.util.concurrent.atomic.AtomicReference) r5
            java.lang.Object r3 = r1.f7488a0
            r6 = r3
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r3 = r1.f7489b0
            r7 = r3
            java.lang.String r7 = (java.lang.String) r7
            r0.mo3183i()
            r0.m11419j()
            o7.u6 r8 = r0.m11431r(r2)
            o7.r5 r2 = new o7.r5
            r3 = r2
            r4 = r0
            r3.<init>(r4, r5, r6, r7, r8)
            r0.m11434u(r2)
            return
        L13b:
            java.lang.Object r0 = r1.f7487Z
            e7.c r0 = (p072e7.C1572c) r0
            java.lang.Object r5 = r1.f7488a0
            f1.o$i r5 = (p085f1.C1974o.i) r5
            java.lang.Object r6 = r1.f7489b0
            f1.o$i r6 = (p085f1.C1974o.i) r6
            java.lang.Object r7 = r1.f7490c0
            e7.x4 r7 = (p072e7.C1782x4) r7
            e7.g r8 = r0.f7496a
            java.util.Objects.requireNonNull(r8)
            java.util.HashSet r0 = new java.util.HashSet
            java.util.Set<d6.i> r9 = r8.f7558a
            r0.<init>(r9)
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L169
            h6.b r0 = p072e7.C1612g.f7557f
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r3 = "No need to prepare transfer without any callback"
            r0.m6376a(r3, r2)
        L166:
            r2 = r4
            goto L2e6
        L169:
            int r0 = r5.f8743k
            r5 = 1
            if (r0 != r5) goto L2db
            int r0 = r6.f8743k
            if (r0 == 0) goto L174
            goto L2db
        L174:
            d6.f r0 = r8.f7560c
            if (r0 != 0) goto L17a
            r0 = r4
            goto L182
        L17a:
            com.google.android.gms.cast.framework.a r0 = r0.m3770c()
            if (r0 == 0) goto L182
            r0.f5448l = r8
        L182:
            if (r0 != 0) goto L18e
            h6.b r0 = p072e7.C1612g.f7557f
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r3 = "No need to prepare transfer when there is no Cast session"
            r0.m6376a(r3, r2)
            goto L166
        L18e:
            com.google.android.gms.cast.framework.media.b r0 = r0.m2979k()
            if (r0 == 0) goto L2c0
            boolean r6 = r0.m3001h()
            if (r6 != 0) goto L19c
            goto L2c0
        L19c:
            h6.b r6 = p072e7.C1612g.f7557f
            java.lang.Object[] r9 = new java.lang.Object[r2]
            java.lang.String r10 = "Prepare route transfer for changing endpoint"
            r6.m6376a(r10, r9)
            r8.f7562e = r4
            r8.f7559b = r5
            r8.f7561d = r7
            java.lang.String r6 = "Must be called from the main thread."
            com.google.android.gms.common.internal.C1101a.m3099d(r6)
            boolean r6 = r0.m3016x()
            if (r6 == 0) goto L298
            c6.p r6 = r0.m2998e()
            java.util.Objects.requireNonNull(r6, r3)
            r9 = 262144(0x40000, double:1.295163E-318)
            long r6 = r6.f4831f0
            long r6 = r6 & r9
            r9 = 0
            int r3 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r3 == 0) goto L1cb
            r3 = 1
            goto L1cc
        L1cb:
            r3 = 0
        L1cc:
            if (r3 == 0) goto L235
            h6.n r3 = r0.f5490c
            java.util.Objects.requireNonNull(r3)
            org.json.JSONObject r6 = new org.json.JSONObject
            r6.<init>()
            long r9 = r3.m6415a()
            java.lang.String r0 = "requestId"
            r6.put(r0, r9)     // Catch: org.json.JSONException -> L202
            java.lang.String r0 = "type"
            java.lang.String r7 = "STORE_SESSION"
            r6.put(r0, r7)     // Catch: org.json.JSONException -> L202
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> L202
            r0.<init>()     // Catch: org.json.JSONException -> L202
            java.lang.String r7 = "assistant_supported"
            r0.put(r7, r5)     // Catch: org.json.JSONException -> L202
            java.lang.String r7 = "display_supported"
            r0.put(r7, r5)     // Catch: org.json.JSONException -> L202
            java.lang.String r7 = "is_group"
            r0.put(r7, r2)     // Catch: org.json.JSONException -> L202
            java.lang.String r7 = "targetDeviceCapabilities"
            r6.put(r7, r0)     // Catch: org.json.JSONException -> L202
            goto L212
        L202:
            r0 = move-exception
            h6.b r7 = r3.f11332a
            java.lang.Object[] r11 = new java.lang.Object[r2]
            java.lang.String r12 = r7.f11253a
            java.lang.String r13 = "store session failed to create JSON message"
            java.lang.String r7 = r7.m6380e(r13, r11)
            android.util.Log.w(r12, r7, r0)
        L212:
            java.lang.String r0 = r6.toString()     // Catch: java.lang.IllegalStateException -> L22e
            r3.m6416b(r0, r9, r4)     // Catch: java.lang.IllegalStateException -> L22e
            h6.q r0 = r3.f11323x
            f.t r4 = new f.t
            r4.<init>(r3)
            r0.m6409a(r9, r4)
            s7.j r0 = new s7.j
            r0.<init>()
            r3.f11324y = r0
            s7.q<TResult> r0 = r0.f23075a
            goto L2a1
        L22e:
            r0 = move-exception
            s7.i r0 = p327s7.C5988l.m12463d(r0)
            goto L2a1
        L235:
            s7.q r3 = new s7.q
            r3.<init>()
            java.lang.String r6 = "RemoteMediaClient"
            java.lang.String r7 = "create SessionState with cached mediaInfo and mediaStatus"
            android.util.Log.d(r6, r7)
            com.google.android.gms.cast.MediaInfo r10 = r0.m2997d()
            c6.p r6 = r0.m2998e()
            if (r10 == 0) goto L292
            if (r6 != 0) goto L24e
            goto L292
        L24e:
            r23 = 0
            r22 = 0
            r21 = 0
            r20 = 0
            r19 = 0
            java.lang.Boolean r12 = java.lang.Boolean.TRUE
            long r13 = r0.m2995b()
            c6.m r11 = r6.f4845t0
            r0 = r3
            double r2 = r6.f4827b0
            r4 = 4611686018427387904(0x4000000000000000, double:2.0)
            int r4 = java.lang.Double.compare(r2, r4)
            if (r4 > 0) goto L28a
            r4 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            int r4 = java.lang.Double.compare(r2, r4)
            if (r4 < 0) goto L28a
            long[] r4 = r6.f4834i0
            org.json.JSONObject r5 = r6.f4838m0
            c6.j r6 = new c6.j
            r9 = r6
            r15 = r2
            r17 = r4
            r18 = r5
            r9.<init>(r10, r11, r12, r13, r15, r17, r18, r19, r20, r21, r22, r23)
            c6.q r2 = new c6.q
            r3 = 0
            r2.<init>(r6, r3)
            r4 = r2
            goto L294
        L28a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "playbackRate must be between PLAYBACK_RATE_MIN and PLAYBACK_RATE_MAX"
            r0.<init>(r2)
            throw r0
        L292:
            r0 = r3
            r4 = 0
        L294:
            r0.m12473r(r4)
            goto L2a1
        L298:
            h6.l r0 = new h6.l
            r0.<init>()
            s7.i r0 = p327s7.C5988l.m12463d(r0)
        L2a1:
            e7.f r2 = new e7.f
            r3 = 1
            r2.<init>(r8, r3)
            s7.q r0 = (p327s7.C5993q) r0
            java.util.Objects.requireNonNull(r0)
            java.util.concurrent.Executor r3 = p327s7.C5987k.f23076a
            r0.mo12446d(r3, r2)
            e7.f r2 = new e7.f
            r4 = 0
            r2.<init>(r8, r4)
            r0.mo12445c(r3, r2)
            e7.i2 r0 = p072e7.EnumC1635i2.f7598O0
            p072e7.C1576c3.m4139b(r0)
            goto L2e9
        L2c0:
            r4 = 0
            h6.b r0 = p072e7.C1612g.f7557f
            java.lang.Object[] r2 = new java.lang.Object[r4]
            java.lang.String r3 = "No need to prepare transfer when there is no media session"
            r0.m6376a(r3, r2)
            d6.f r0 = r8.f7560c
            if (r0 != 0) goto L2cf
            goto L2d9
        L2cf:
            com.google.android.gms.cast.framework.a r0 = r0.m3770c()
            if (r0 == 0) goto L2d9
            r2 = 0
            r0.f5448l = r2
            goto L2e6
        L2d9:
            r2 = 0
            goto L2e6
        L2db:
            r2 = r4
            h6.b r0 = p072e7.C1612g.f7557f
            r3 = 0
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r4 = "No need to prepare transfer for non cast-to-phone case"
            r0.m6376a(r4, r3)
        L2e6:
            r7.m4485g(r2)
        L2e9:
            return
        L2ea:
            java.lang.Object r0 = r1.f7490c0
            com.google.android.gms.measurement.internal.AppMeasurementDynamiteService r0 = (com.google.android.gms.measurement.internal.AppMeasurementDynamiteService) r0
            com.google.android.gms.measurement.internal.d r0 = r0.f5656a
            o7.v5 r0 = r0.m3179y()
            java.lang.Object r2 = r1.f7487Z
            r7 = r2
            k7.r0 r7 = (p185k7.InterfaceC3956r0) r7
            java.lang.Object r2 = r1.f7488a0
            r4 = r2
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r2 = r1.f7489b0
            r5 = r2
            java.lang.String r5 = (java.lang.String) r5
            r0.mo3183i()
            r0.m11419j()
            r2 = 0
            o7.u6 r6 = r0.m11431r(r2)
            o7.r5 r8 = new o7.r5
            r2 = r8
            r3 = r0
            r2.<init>(r3, r4, r5, r6, r7)
            r0.m11434u(r8)
            return
    }
}
