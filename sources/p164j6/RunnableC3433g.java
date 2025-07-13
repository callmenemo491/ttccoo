package p164j6;

/* renamed from: j6.g */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC3433g implements java.lang.Runnable {

    /* renamed from: Y */
    public final /* synthetic */ int f14884Y;

    /* renamed from: Z */
    public final java.lang.Object f14885Z;

    /* renamed from: a0 */
    public final java.lang.Object f14886a0;

    /* renamed from: b0 */
    public final java.lang.Object f14887b0;

    /* renamed from: c0 */
    public final boolean f14888c0;

    /* renamed from: d0 */
    public final java.lang.Object f14889d0;

    public RunnableC3433g(com.google.android.gms.measurement.internal.AppMeasurementDynamiteService r2, p185k7.InterfaceC3956r0 r3, java.lang.String r4, java.lang.String r5, boolean r6) {
            r1 = this;
            r0 = 3
            r1.f14884Y = r0
            r1.f14889d0 = r2
            r1.f14885Z = r3
            r1.f14886a0 = r4
            r1.f14887b0 = r5
            r1.f14888c0 = r6
            r1.<init>()
            return
    }

    public RunnableC3433g(p164j6.AbstractC3428b r2, android.content.Intent r3, android.content.Context r4, boolean r5, android.content.BroadcastReceiver.PendingResult r6) {
            r1 = this;
            r0 = 0
            r1.f14884Y = r0
            r1.<init>()
            r1.f14885Z = r2
            r1.f14886a0 = r3
            r1.f14887b0 = r4
            r1.f14888c0 = r5
            r1.f14889d0 = r6
            return
    }

    public RunnableC3433g(p249o7.C4971c5 r2, boolean r3, android.net.Uri r4, java.lang.String r5, java.lang.String r6) {
            r1 = this;
            r0 = 2
            r1.f14884Y = r0
            r1.f14889d0 = r2
            r1.f14888c0 = r3
            r1.f14885Z = r4
            r1.f14886a0 = r5
            r1.f14887b0 = r6
            r1.<init>()
            return
    }

    public RunnableC3433g(p249o7.C4979d5 r2, java.util.concurrent.atomic.AtomicReference r3, java.lang.String r4, java.lang.String r5, boolean r6) {
            r1 = this;
            r0 = 1
            r1.f14884Y = r0
            r1.f14889d0 = r2
            r1.f14885Z = r3
            r1.f14886a0 = r4
            r1.f14887b0 = r5
            r1.f14888c0 = r6
            r1.<init>()
            return
    }

    public RunnableC3433g(p249o7.C5123v5 r2, p249o7.C5116u6 r3, boolean r4, p249o7.C4957b r5, p249o7.C4957b r6) {
            r1 = this;
            r0 = 5
            r1.f14884Y = r0
            r1.f14889d0 = r2
            r1.f14885Z = r3
            r1.f14888c0 = r4
            r1.f14886a0 = r5
            r1.f14887b0 = r6
            r1.<init>()
            return
    }

    public RunnableC3433g(p249o7.C5123v5 r2, p249o7.C5116u6 r3, boolean r4, p249o7.C5077q r5, java.lang.String r6) {
            r1 = this;
            r0 = 4
            r1.f14884Y = r0
            r1.f14889d0 = r2
            r1.f14885Z = r3
            r1.f14888c0 = r4
            r1.f14886a0 = r5
            r1.f14887b0 = r6
            r1.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r17 = this;
            r1 = r17
            int r0 = r1.f14884Y
            java.lang.String r3 = "null reference"
            r4 = 0
            switch(r0) {
                case 0: goto L204;
                case 1: goto L1d4;
                case 2: goto L77;
                case 3: goto L47;
                case 4: goto Ld;
                default: goto La;
            }
        La:
            r2 = 0
            goto L240
        Ld:
            java.lang.Object r0 = r1.f14889d0
            o7.v5 r0 = (p249o7.C5123v5) r0
            o7.z2 r4 = r0.f20135d
            if (r4 != 0) goto L23
            com.google.android.gms.measurement.internal.d r0 = r0.f5736a
            com.google.android.gms.measurement.internal.b r0 = r0.mo3162d()
            o7.f3 r0 = r0.f5672f
            java.lang.String r2 = "Discarding data. Failed to send event to service"
            r0.m11169c(r2)
            goto L46
        L23:
            java.lang.Object r0 = r1.f14885Z
            o7.u6 r0 = (p249o7.C5116u6) r0
            java.util.Objects.requireNonNull(r0, r3)
            java.lang.Object r0 = r1.f14889d0
            o7.v5 r0 = (p249o7.C5123v5) r0
            boolean r3 = r1.f14888c0
            if (r3 == 0) goto L34
            r2 = 0
            goto L38
        L34:
            java.lang.Object r2 = r1.f14886a0
            o7.q r2 = (p249o7.C5077q) r2
        L38:
            java.lang.Object r3 = r1.f14885Z
            o7.u6 r3 = (p249o7.C5116u6) r3
            r0.m11426m(r4, r2, r3)
            java.lang.Object r0 = r1.f14889d0
            o7.v5 r0 = (p249o7.C5123v5) r0
            r0.m11433t()
        L46:
            return
        L47:
            java.lang.Object r0 = r1.f14889d0
            com.google.android.gms.measurement.internal.AppMeasurementDynamiteService r0 = (com.google.android.gms.measurement.internal.AppMeasurementDynamiteService) r0
            com.google.android.gms.measurement.internal.d r0 = r0.f5656a
            o7.v5 r0 = r0.m3179y()
            java.lang.Object r2 = r1.f14885Z
            r11 = r2
            k7.r0 r11 = (p185k7.InterfaceC3956r0) r11
            java.lang.Object r2 = r1.f14886a0
            r7 = r2
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r2 = r1.f14887b0
            r8 = r2
            java.lang.String r8 = (java.lang.String) r8
            boolean r10 = r1.f14888c0
            r0.mo3183i()
            r0.m11419j()
            o7.u6 r9 = r0.m11431r(r4)
            o7.n5 r2 = new o7.n5
            r5 = r2
            r6 = r0
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r0.m11434u(r2)
            return
        L77:
            java.lang.Object r0 = r1.f14889d0
            r3 = r0
            o7.c5 r3 = (p249o7.C4971c5) r3
            boolean r0 = r1.f14888c0
            java.lang.Object r5 = r1.f14885Z
            android.net.Uri r5 = (android.net.Uri) r5
            java.lang.Object r6 = r1.f14886a0
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r7 = r1.f14887b0
            java.lang.String r7 = (java.lang.String) r7
            o7.d5 r8 = r3.f19621Y
            r8.mo3183i()
            o7.d5 r8 = r3.f19621Y     // Catch: java.lang.RuntimeException -> L1c3
            com.google.android.gms.measurement.internal.d r8 = r8.f5736a     // Catch: java.lang.RuntimeException -> L1c3
            com.google.android.gms.measurement.internal.f r8 = r8.m3158A()     // Catch: java.lang.RuntimeException -> L1c3
            boolean r9 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.RuntimeException -> L1c3
            java.lang.String r10 = "Activity created with data 'referrer' without required params"
            java.lang.String r11 = "_cis"
            java.lang.String r12 = "utm_medium"
            java.lang.String r13 = "utm_source"
            java.lang.String r14 = "utm_campaign"
            java.lang.String r15 = "gclid"
            if (r9 == 0) goto Laa
            goto Lcd
        Laa:
            boolean r9 = r7.contains(r15)     // Catch: java.lang.RuntimeException -> L1c3
            if (r9 != 0) goto Lcf
            boolean r9 = r7.contains(r14)     // Catch: java.lang.RuntimeException -> L1c3
            if (r9 != 0) goto Lcf
            boolean r9 = r7.contains(r13)     // Catch: java.lang.RuntimeException -> L1c3
            if (r9 != 0) goto Lcf
            boolean r9 = r7.contains(r12)     // Catch: java.lang.RuntimeException -> L1c3
            if (r9 != 0) goto Lcf
            com.google.android.gms.measurement.internal.d r8 = r8.f5736a     // Catch: java.lang.RuntimeException -> L1c3
            com.google.android.gms.measurement.internal.b r8 = r8.mo3162d()     // Catch: java.lang.RuntimeException -> L1c3
            o7.f3 r8 = r8.f5679m     // Catch: java.lang.RuntimeException -> L1c3
            r8.m11169c(r10)     // Catch: java.lang.RuntimeException -> L1c3
        Lcd:
            r2 = 0
            goto Lf1
        Lcf:
            java.lang.String r9 = "https://google.com/search?"
            int r16 = r7.length()     // Catch: java.lang.RuntimeException -> L1c3
            if (r16 == 0) goto Ldc
            java.lang.String r9 = r9.concat(r7)     // Catch: java.lang.RuntimeException -> L1c3
            goto Le2
        Ldc:
            java.lang.String r2 = new java.lang.String     // Catch: java.lang.RuntimeException -> L1c3
            r2.<init>(r9)     // Catch: java.lang.RuntimeException -> L1c3
            r9 = r2
        Le2:
            android.net.Uri r2 = android.net.Uri.parse(r9)     // Catch: java.lang.RuntimeException -> L1c3
            android.os.Bundle r2 = r8.m3231q0(r2)     // Catch: java.lang.RuntimeException -> L1c3
            if (r2 == 0) goto Lf1
            java.lang.String r8 = "referrer"
            r2.putString(r11, r8)     // Catch: java.lang.RuntimeException -> L1c3
        Lf1:
            java.lang.String r8 = "_cmp"
            if (r0 == 0) goto L136
            o7.d5 r0 = r3.f19621Y     // Catch: java.lang.RuntimeException -> L1c3
            com.google.android.gms.measurement.internal.d r0 = r0.f5736a     // Catch: java.lang.RuntimeException -> L1c3
            com.google.android.gms.measurement.internal.f r0 = r0.m3158A()     // Catch: java.lang.RuntimeException -> L1c3
            android.os.Bundle r0 = r0.m3231q0(r5)     // Catch: java.lang.RuntimeException -> L1c3
            if (r0 == 0) goto L136
            java.lang.String r5 = "intent"
            r0.putString(r11, r5)     // Catch: java.lang.RuntimeException -> L1c3
            boolean r5 = r0.containsKey(r15)     // Catch: java.lang.RuntimeException -> L1c3
            if (r5 != 0) goto L12a
            if (r2 == 0) goto L12a
            boolean r5 = r2.containsKey(r15)     // Catch: java.lang.RuntimeException -> L1c3
            if (r5 == 0) goto L12a
            r5 = 1
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch: java.lang.RuntimeException -> L1c3
            java.lang.String r9 = r2.getString(r15)     // Catch: java.lang.RuntimeException -> L1c3
            r5[r4] = r9     // Catch: java.lang.RuntimeException -> L1c3
            java.lang.String r4 = "_cer"
            java.lang.String r9 = "gclid=%s"
            java.lang.String r5 = java.lang.String.format(r9, r5)     // Catch: java.lang.RuntimeException -> L1c3
            r0.putString(r4, r5)     // Catch: java.lang.RuntimeException -> L1c3
        L12a:
            o7.d5 r4 = r3.f19621Y     // Catch: java.lang.RuntimeException -> L1c3
            r4.m11133p(r6, r8, r0)     // Catch: java.lang.RuntimeException -> L1c3
            o7.d5 r4 = r3.f19621Y     // Catch: java.lang.RuntimeException -> L1c3
            o7.w6 r4 = r4.f19643n     // Catch: java.lang.RuntimeException -> L1c3
            r4.m11442a(r6, r0)     // Catch: java.lang.RuntimeException -> L1c3
        L136:
            boolean r0 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.RuntimeException -> L1c3
            if (r0 == 0) goto L13e
            goto L1d3
        L13e:
            o7.d5 r0 = r3.f19621Y     // Catch: java.lang.RuntimeException -> L1c3
            com.google.android.gms.measurement.internal.d r0 = r0.f5736a     // Catch: java.lang.RuntimeException -> L1c3
            com.google.android.gms.measurement.internal.b r0 = r0.mo3162d()     // Catch: java.lang.RuntimeException -> L1c3
            o7.f3 r0 = r0.f5679m     // Catch: java.lang.RuntimeException -> L1c3
            java.lang.String r4 = "Activity created with referrer"
            r0.m11170d(r4, r7)     // Catch: java.lang.RuntimeException -> L1c3
            o7.d5 r0 = r3.f19621Y     // Catch: java.lang.RuntimeException -> L1c3
            com.google.android.gms.measurement.internal.d r0 = r0.f5736a     // Catch: java.lang.RuntimeException -> L1c3
            o7.f r0 = r0.f5716g     // Catch: java.lang.RuntimeException -> L1c3
            o7.u2<java.lang.Boolean> r4 = p249o7.C5120v2.f20083a0     // Catch: java.lang.RuntimeException -> L1c3
            r5 = 0
            boolean r0 = r0.m11162v(r5, r4)     // Catch: java.lang.RuntimeException -> L1c3
            if (r0 == 0) goto L181
            if (r2 == 0) goto L16b
            o7.d5 r0 = r3.f19621Y     // Catch: java.lang.RuntimeException -> L1c3
            r0.m11133p(r6, r8, r2)     // Catch: java.lang.RuntimeException -> L1c3
            o7.d5 r0 = r3.f19621Y     // Catch: java.lang.RuntimeException -> L1c3
            o7.w6 r0 = r0.f19643n     // Catch: java.lang.RuntimeException -> L1c3
            r0.m11442a(r6, r2)     // Catch: java.lang.RuntimeException -> L1c3
            goto L17a
        L16b:
            o7.d5 r0 = r3.f19621Y     // Catch: java.lang.RuntimeException -> L1c3
            com.google.android.gms.measurement.internal.d r0 = r0.f5736a     // Catch: java.lang.RuntimeException -> L1c3
            com.google.android.gms.measurement.internal.b r0 = r0.mo3162d()     // Catch: java.lang.RuntimeException -> L1c3
            o7.f3 r0 = r0.f5679m     // Catch: java.lang.RuntimeException -> L1c3
            java.lang.String r2 = "Referrer does not contain valid parameters"
            r0.m11170d(r2, r7)     // Catch: java.lang.RuntimeException -> L1c3
        L17a:
            o7.d5 r0 = r3.f19621Y     // Catch: java.lang.RuntimeException -> L1c3
            r2 = 0
            r0.m11121A(r2)     // Catch: java.lang.RuntimeException -> L1c3
            goto L1d3
        L181:
            boolean r0 = r7.contains(r15)     // Catch: java.lang.RuntimeException -> L1c3
            if (r0 == 0) goto L1b5
            boolean r0 = r7.contains(r14)     // Catch: java.lang.RuntimeException -> L1c3
            if (r0 != 0) goto L1a9
            boolean r0 = r7.contains(r13)     // Catch: java.lang.RuntimeException -> L1c3
            if (r0 != 0) goto L1a9
            boolean r0 = r7.contains(r12)     // Catch: java.lang.RuntimeException -> L1c3
            if (r0 != 0) goto L1a9
            java.lang.String r0 = "utm_term"
            boolean r0 = r7.contains(r0)     // Catch: java.lang.RuntimeException -> L1c3
            if (r0 != 0) goto L1a9
            java.lang.String r0 = "utm_content"
            boolean r0 = r7.contains(r0)     // Catch: java.lang.RuntimeException -> L1c3
            if (r0 == 0) goto L1b5
        L1a9:
            boolean r0 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.RuntimeException -> L1c3
            if (r0 != 0) goto L1d3
            o7.d5 r0 = r3.f19621Y     // Catch: java.lang.RuntimeException -> L1c3
            r0.m11121A(r7)     // Catch: java.lang.RuntimeException -> L1c3
            goto L1d3
        L1b5:
            o7.d5 r0 = r3.f19621Y     // Catch: java.lang.RuntimeException -> L1c3
            com.google.android.gms.measurement.internal.d r0 = r0.f5736a     // Catch: java.lang.RuntimeException -> L1c3
            com.google.android.gms.measurement.internal.b r0 = r0.mo3162d()     // Catch: java.lang.RuntimeException -> L1c3
            o7.f3 r0 = r0.f5679m     // Catch: java.lang.RuntimeException -> L1c3
            r0.m11169c(r10)     // Catch: java.lang.RuntimeException -> L1c3
            goto L1d3
        L1c3:
            r0 = move-exception
            o7.d5 r2 = r3.f19621Y
            com.google.android.gms.measurement.internal.d r2 = r2.f5736a
            com.google.android.gms.measurement.internal.b r2 = r2.mo3162d()
            o7.f3 r2 = r2.f5672f
            java.lang.String r3 = "Throwable caught in handleReferrerForOnActivityCreated"
            r2.m11170d(r3, r0)
        L1d3:
            return
        L1d4:
            java.lang.Object r0 = r1.f14889d0
            o7.d5 r0 = (p249o7.C4979d5) r0
            com.google.android.gms.measurement.internal.d r0 = r0.f5736a
            o7.v5 r0 = r0.m3179y()
            java.lang.Object r2 = r1.f14885Z
            r7 = r2
            java.util.concurrent.atomic.AtomicReference r7 = (java.util.concurrent.atomic.AtomicReference) r7
            java.lang.Object r2 = r1.f14886a0
            r8 = r2
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r2 = r1.f14887b0
            r9 = r2
            java.lang.String r9 = (java.lang.String) r9
            boolean r11 = r1.f14888c0
            r0.mo3183i()
            r0.m11419j()
            o7.u6 r10 = r0.m11431r(r4)
            o7.n5 r2 = new o7.n5
            r5 = r2
            r6 = r0
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r0.m11434u(r2)
            return
        L204:
            r2 = 0
            java.lang.Object r0 = r1.f14885Z
            j6.b r0 = (p164j6.AbstractC3428b) r0
            java.lang.Object r3 = r1.f14886a0
            android.content.Intent r3 = (android.content.Intent) r3
            java.lang.Object r4 = r1.f14887b0
            android.content.Context r4 = (android.content.Context) r4
            boolean r5 = r1.f14888c0
            java.lang.Object r6 = r1.f14889d0
            android.content.BroadcastReceiver$PendingResult r6 = (android.content.BroadcastReceiver.PendingResult) r6
            java.util.Objects.requireNonNull(r0)
            java.lang.String r7 = "wrapped_intent"
            android.os.Parcelable r7 = r3.getParcelableExtra(r7)     // Catch: java.lang.Throwable -> L23b
            boolean r8 = r7 instanceof android.content.Intent     // Catch: java.lang.Throwable -> L23b
            if (r8 == 0) goto L227
            r2 = r7
            android.content.Intent r2 = (android.content.Intent) r2     // Catch: java.lang.Throwable -> L23b
        L227:
            if (r2 == 0) goto L22e
            int r0 = r0.m7883a(r4, r2)     // Catch: java.lang.Throwable -> L23b
            goto L232
        L22e:
            int r0 = r0.m7884b(r4, r3)     // Catch: java.lang.Throwable -> L23b
        L232:
            if (r5 == 0) goto L237
            r6.setResultCode(r0)     // Catch: java.lang.Throwable -> L23b
        L237:
            r6.finish()
            return
        L23b:
            r0 = move-exception
            r6.finish()
            throw r0
        L240:
            java.lang.Object r0 = r1.f14889d0
            o7.v5 r0 = (p249o7.C5123v5) r0
            o7.z2 r4 = r0.f20135d
            if (r4 != 0) goto L256
            com.google.android.gms.measurement.internal.d r0 = r0.f5736a
            com.google.android.gms.measurement.internal.b r0 = r0.mo3162d()
            o7.f3 r0 = r0.f5672f
            java.lang.String r2 = "Discarding data. Failed to send conditional user property to service"
            r0.m11169c(r2)
            goto L278
        L256:
            java.lang.Object r0 = r1.f14885Z
            o7.u6 r0 = (p249o7.C5116u6) r0
            java.util.Objects.requireNonNull(r0, r3)
            java.lang.Object r0 = r1.f14889d0
            o7.v5 r0 = (p249o7.C5123v5) r0
            boolean r3 = r1.f14888c0
            if (r3 == 0) goto L266
            goto L26a
        L266:
            java.lang.Object r2 = r1.f14886a0
            o7.b r2 = (p249o7.C4957b) r2
        L26a:
            java.lang.Object r3 = r1.f14885Z
            o7.u6 r3 = (p249o7.C5116u6) r3
            r0.m11426m(r4, r2, r3)
            java.lang.Object r0 = r1.f14889d0
            o7.v5 r0 = (p249o7.C5123v5) r0
            r0.m11433t()
        L278:
            return
    }
}
