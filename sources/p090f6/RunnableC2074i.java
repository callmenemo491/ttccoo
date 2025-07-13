package p090f6;

/* renamed from: f6.i */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC2074i implements java.lang.Runnable {

    /* renamed from: Y */
    public final /* synthetic */ int f9477Y;

    /* renamed from: Z */
    public final java.lang.Object f9478Z;

    public RunnableC2074i(com.google.firebase.messaging.FirebaseMessaging r2) {
            r1 = this;
            r0 = 11
            r1.f9477Y = r0
            r1.<init>()
            r1.f9478Z = r2
            return
    }

    public RunnableC2074i(p057db.C1390b0 r2) {
            r1 = this;
            r0 = 12
            r1.f9477Y = r0
            r1.<init>()
            r1.f9478Z = r2
            return
    }

    public RunnableC2074i(p057db.ServiceConnectionC1412m0.a r2) {
            r1 = this;
            r0 = 13
            r1.f9477Y = r0
            r1.<init>()
            r1.f9478Z = r2
            return
    }

    public /* synthetic */ RunnableC2074i(p072e7.C1576c3 r2) {
            r1 = this;
            r0 = 7
            r1.f9477Y = r0
            r1.<init>()
            r1.f9478Z = r2
            return
    }

    public /* synthetic */ RunnableC2074i(p072e7.C1624h1 r2) {
            r1 = this;
            r0 = 6
            r1.f9477Y = r0
            r1.<init>()
            r1.f9478Z = r2
            return
    }

    public /* synthetic */ RunnableC2074i(p090f6.C2077l r2) {
            r1 = this;
            r0 = 0
            r1.f9477Y = r0
            r1.<init>()
            r1.f9478Z = r2
            return
    }

    public /* synthetic */ RunnableC2074i(p123h6.C2510q r2) {
            r1 = this;
            r0 = 2
            r1.f9477Y = r0
            r1.<init>()
            r1.f9478Z = r2
            return
    }

    public RunnableC2074i(p218m6.BinderC4407t r2) {
            r1 = this;
            r0 = 5
            r1.f9477Y = r0
            r1.f9478Z = r2
            r1.<init>()
            return
    }

    public /* synthetic */ RunnableC2074i(p249o7.RunnableC4964b6 r2) {
            r1 = this;
            r0 = 8
            r1.f9477Y = r0
            r1.<init>()
            r1.f9478Z = r2
            return
    }

    public RunnableC2074i(p307r7.C5798a r2) {
            r1 = this;
            r0 = 9
            r1.f9477Y = r0
            r1.f9478Z = r2
            r1.<init>()
            return
    }

    public RunnableC2074i(p327s7.C5986j r2) {
            r1 = this;
            r0 = 3
            r1.f9477Y = r0
            r1.<init>()
            r1.f9478Z = r2
            return
    }

    public RunnableC2074i(p327s7.C5990n r2) {
            r1 = this;
            r0 = 10
            r1.f9477Y = r0
            r1.f9478Z = r2
            r1.<init>()
            return
    }

    @Override // java.lang.Runnable
    public void run() {
            r13 = this;
            int r0 = r13.f9477Y
            r1 = 0
            r2 = 1
            r3 = 0
            switch(r0) {
                case 0: goto L2b2;
                case 1: goto L8;
                case 2: goto L298;
                case 3: goto L27d;
                case 4: goto L8;
                case 5: goto L26b;
                case 6: goto L23d;
                case 7: goto L11f;
                case 8: goto L81;
                case 9: goto L79;
                case 10: goto L59;
                case 11: goto L49;
                case 12: goto La;
                default: goto L8;
            }
        L8:
            goto L2ba
        La:
            java.lang.Object r0 = r13.f9478Z
            db.b0 r0 = (p057db.C1390b0) r0
            java.util.ArrayDeque<java.lang.String> r1 = r0.f7005d
            monitor-enter(r1)
            android.content.SharedPreferences r2 = r0.f7002a     // Catch: java.lang.Throwable -> L46
            android.content.SharedPreferences$Editor r2 = r2.edit()     // Catch: java.lang.Throwable -> L46
            java.lang.String r3 = r0.f7003b     // Catch: java.lang.Throwable -> L46
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L46
            r4.<init>()     // Catch: java.lang.Throwable -> L46
            java.util.ArrayDeque<java.lang.String> r5 = r0.f7005d     // Catch: java.lang.Throwable -> L46
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> L46
        L24:
            boolean r6 = r5.hasNext()     // Catch: java.lang.Throwable -> L46
            if (r6 == 0) goto L39
            java.lang.Object r6 = r5.next()     // Catch: java.lang.Throwable -> L46
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Throwable -> L46
            r4.append(r6)     // Catch: java.lang.Throwable -> L46
            java.lang.String r6 = r0.f7004c     // Catch: java.lang.Throwable -> L46
            r4.append(r6)     // Catch: java.lang.Throwable -> L46
            goto L24
        L39:
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Throwable -> L46
            android.content.SharedPreferences$Editor r0 = r2.putString(r3, r0)     // Catch: java.lang.Throwable -> L46
            r0.commit()     // Catch: java.lang.Throwable -> L46
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L46
            return
        L46:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L46
            throw r0
        L49:
            java.lang.Object r0 = r13.f9478Z
            com.google.firebase.messaging.FirebaseMessaging r0 = (com.google.firebase.messaging.FirebaseMessaging) r0
            com.google.firebase.messaging.FirebaseMessaging$a r1 = r0.f6613g
            boolean r1 = r1.m3663b()
            if (r1 == 0) goto L58
            r0.m3659g()
        L58:
            return
        L59:
            java.lang.Object r0 = r13.f9478Z
            s7.n r0 = (p327s7.C5990n) r0
            java.lang.Object r0 = r0.f23094a0
            monitor-enter(r0)
            java.lang.Object r1 = r13.f9478Z     // Catch: java.lang.Throwable -> L76
            r2 = r1
            s7.n r2 = (p327s7.C5990n) r2     // Catch: java.lang.Throwable -> L76
            java.lang.Object r2 = r2.f23095b0     // Catch: java.lang.Throwable -> L76
            s7.c r2 = (p327s7.InterfaceC5979c) r2     // Catch: java.lang.Throwable -> L76
            if (r2 == 0) goto L74
            s7.n r1 = (p327s7.C5990n) r1     // Catch: java.lang.Throwable -> L76
            java.lang.Object r1 = r1.f23095b0     // Catch: java.lang.Throwable -> L76
            s7.c r1 = (p327s7.InterfaceC5979c) r1     // Catch: java.lang.Throwable -> L76
            r1.mo7372a()     // Catch: java.lang.Throwable -> L76
        L74:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L76
            return
        L76:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L76
            throw r1
        L79:
            java.lang.Object r0 = r13.f9478Z
            r7.a r0 = (p307r7.C5798a) r0
            r0.m12168d()
            return
        L81:
            java.lang.Object r0 = r13.f9478Z
            o7.b6 r0 = (p249o7.RunnableC4964b6) r0
            androidx.appcompat.widget.x r4 = r0.f19611a0
            long r8 = r0.f19609Y
            long r5 = r0.f19610Z
            java.lang.Object r0 = r4.f1482a0
            o7.f6 r0 = (p249o7.C4996f6) r0
            r0.mo3183i()
            java.lang.Object r0 = r4.f1482a0
            o7.f6 r0 = (p249o7.C4996f6) r0
            com.google.android.gms.measurement.internal.d r0 = r0.f5736a
            com.google.android.gms.measurement.internal.b r0 = r0.mo3162d()
            o7.f3 r0 = r0.f5679m
            java.lang.String r7 = "Application going to the background"
            r0.m11169c(r7)
            java.lang.Object r0 = r4.f1482a0
            o7.f6 r0 = (p249o7.C4996f6) r0
            com.google.android.gms.measurement.internal.d r0 = r0.f5736a
            com.google.android.gms.measurement.internal.c r0 = r0.m3175t()
            o7.n3 r0 = r0.f5695p
            r0.m11369a(r2)
            android.os.Bundle r10 = new android.os.Bundle
            r10.<init>()
            java.lang.Object r0 = r4.f1482a0
            o7.f6 r0 = (p249o7.C4996f6) r0
            com.google.android.gms.measurement.internal.d r0 = r0.f5736a
            o7.f r0 = r0.f5716g
            boolean r0 = r0.m11163w()
            if (r0 != 0) goto L10d
            java.lang.Object r0 = r4.f1482a0
            o7.f6 r0 = (p249o7.C4996f6) r0
            o7.d6 r0 = r0.f19691e
            o7.k r0 = r0.f19648c
            r0.m11284a()
            java.lang.Object r0 = r4.f1482a0
            o7.f6 r0 = (p249o7.C4996f6) r0
            com.google.android.gms.measurement.internal.d r0 = r0.f5736a
            o7.f r0 = r0.f5716g
            o7.u2<java.lang.Boolean> r7 = p249o7.C5120v2.f20095g0
            boolean r0 = r0.m11162v(r3, r7)
            if (r0 == 0) goto L103
            java.lang.Object r0 = r4.f1482a0
            o7.f6 r0 = (p249o7.C4996f6) r0
            o7.d6 r0 = r0.f19691e
            long r11 = r0.f19647b
            r0.f19647b = r5
            long r11 = r5 - r11
            java.lang.String r0 = "_et"
            r10.putLong(r0, r11)
            java.lang.Object r0 = r4.f1482a0
            o7.f6 r0 = (p249o7.C4996f6) r0
            com.google.android.gms.measurement.internal.d r0 = r0.f5736a
            o7.m5 r0 = r0.m3178x()
            o7.j5 r0 = r0.m11322p(r2)
            com.google.android.gms.measurement.internal.C1115f.m3195x(r0, r10, r2)
            goto L104
        L103:
            r2 = 0
        L104:
            java.lang.Object r0 = r4.f1482a0
            o7.f6 r0 = (p249o7.C4996f6) r0
            o7.d6 r0 = r0.f19691e
            r0.m11144a(r1, r2, r5)
        L10d:
            java.lang.Object r0 = r4.f1482a0
            o7.f6 r0 = (p249o7.C4996f6) r0
            com.google.android.gms.measurement.internal.d r0 = r0.f5736a
            o7.d5 r5 = r0.m3176v()
            java.lang.String r6 = "auto"
            java.lang.String r7 = "_ab"
            r5.m11134q(r6, r7, r8, r10)
            return
        L11f:
            java.lang.Object r0 = r13.f9478Z
            e7.c3 r0 = (p072e7.C1576c3) r0
            java.util.Set<e7.i2> r3 = r0.f7509f
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L12d
            goto L23c
        L12d:
            java.util.Set<e7.i2> r3 = r0.f7510g
            java.util.Set<e7.i2> r4 = r0.f7509f
            boolean r3 = r3.equals(r4)
            if (r2 == r3) goto L13b
            r2 = 86400000(0x5265c00, double:4.2687272E-316)
            goto L13e
        L13b:
            r2 = 172800000(0xa4cb800, double:8.53745436E-316)
        L13e:
            long r4 = java.lang.System.currentTimeMillis()
            long r6 = r0.f7511h
            r8 = 0
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 == 0) goto L150
            long r6 = r4 - r6
            int r10 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r10 < 0) goto L23c
        L150:
            h6.b r2 = p072e7.C1576c3.f7501i
            java.lang.Object[] r3 = new java.lang.Object[r1]
            java.lang.String r6 = "Upload the feature usage report."
            r2.m6376a(r6, r3)
            e7.q2 r2 = p072e7.C1725r2.m4426i()
            java.lang.String r3 = p072e7.C1576c3.f7502j
            boolean r6 = r2.f7817a0
            if (r6 == 0) goto L168
            r2.m4461e()
            r2.f7817a0 = r1
        L168:
            MessageType extends e7.x5<MessageType, BuilderType> r6 = r2.f7816Z
            e7.r2 r6 = (p072e7.C1725r2) r6
            p072e7.C1725r2.m4429o(r6, r3)
            java.lang.String r3 = r0.f7506c
            boolean r6 = r2.f7817a0
            if (r6 == 0) goto L17a
            r2.m4461e()
            r2.f7817a0 = r1
        L17a:
            MessageType extends e7.x5<MessageType, BuilderType> r6 = r2.f7816Z
            e7.r2 r6 = (p072e7.C1725r2) r6
            p072e7.C1725r2.m4428n(r6, r3)
            e7.x5 r2 = r2.m4459c()
            e7.r2 r2 = (p072e7.C1725r2) r2
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Set<e7.i2> r6 = r0.f7509f
            r3.addAll(r6)
            e7.m2 r6 = p072e7.C1685n2.m4352i()
            boolean r7 = r6.f7817a0
            if (r7 == 0) goto L19e
            r6.m4461e()
            r6.f7817a0 = r1
        L19e:
            MessageType extends e7.x5<MessageType, BuilderType> r7 = r6.f7816Z
            e7.n2 r7 = (p072e7.C1685n2) r7
            p072e7.C1685n2.m4355o(r7, r3)
            boolean r3 = r6.f7817a0
            if (r3 == 0) goto L1ae
            r6.m4461e()
            r6.f7817a0 = r1
        L1ae:
            MessageType extends e7.x5<MessageType, BuilderType> r3 = r6.f7816Z
            e7.n2 r3 = (p072e7.C1685n2) r3
            p072e7.C1685n2.m4354n(r3, r2)
            e7.x5 r2 = r6.m4459c()
            e7.n2 r2 = (p072e7.C1685n2) r2
            e7.y2 r3 = p072e7.C1798z2.m4500l()
            boolean r6 = r3.f7817a0
            if (r6 == 0) goto L1c8
            r3.m4461e()
            r3.f7817a0 = r1
        L1c8:
            MessageType extends e7.x5<MessageType, BuilderType> r1 = r3.f7816Z
            e7.z2 r1 = (p072e7.C1798z2) r1
            p072e7.C1798z2.m4506s(r1, r2)
            e7.x5 r1 = r3.m4459c()
            e7.z2 r1 = (p072e7.C1798z2) r1
            e7.l r2 = r0.f7504a
            r3 = 243(0xf3, float:3.4E-43)
            r2.m4321a(r1, r3)
            android.content.SharedPreferences r1 = r0.f7505b
            android.content.SharedPreferences$Editor r1 = r1.edit()
            java.util.Set<e7.i2> r2 = r0.f7510g
            java.util.Set<e7.i2> r3 = r0.f7509f
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L231
            java.util.Set<e7.i2> r2 = r0.f7510g
            r2.clear()
            java.util.Set<e7.i2> r2 = r0.f7510g
            java.util.Set<e7.i2> r3 = r0.f7509f
            r2.addAll(r3)
            java.util.Set<e7.i2> r2 = r0.f7510g
            java.util.Iterator r2 = r2.iterator()
        L1fe:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L231
            java.lang.Object r3 = r2.next()
            e7.i2 r3 = (p072e7.EnumC1635i2) r3
            int r3 = r3.f7634Y
            java.lang.String r3 = java.lang.Integer.toString(r3)
            java.lang.String r6 = r0.m4140c(r3)
            java.lang.String r7 = "feature_usage_timestamp_reported_feature_"
            java.lang.String r3 = p072e7.C1576c3.m4138a(r7, r3)
            boolean r7 = android.text.TextUtils.equals(r6, r3)
            if (r7 != 0) goto L1fe
            android.content.SharedPreferences r7 = r0.f7505b
            long r10 = r7.getLong(r6, r8)
            r1.remove(r6)
            int r6 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r6 == 0) goto L1fe
            r1.putLong(r3, r10)
            goto L1fe
        L231:
            r0.f7511h = r4
            java.lang.String r0 = "feature_usage_last_report_time"
            android.content.SharedPreferences$Editor r0 = r1.putLong(r0, r4)
            r0.apply()
        L23c:
            return
        L23d:
            java.lang.Object r0 = r13.f9478Z
            e7.h1 r0 = (p072e7.C1624h1) r0
            e7.q1 r1 = r0.f7579f
            if (r1 == 0) goto L258
            e7.a2 r2 = r0.f7575b
            e7.y2 r1 = r2.m4116b(r1)
            e7.x5 r1 = r1.m4459c()
            e7.z2 r1 = (p072e7.C1798z2) r1
            e7.l r2 = r0.f7574a
            r3 = 223(0xdf, float:3.12E-43)
            r2.m4321a(r1, r3)
        L258:
            android.os.Handler r1 = r0.f7577d
            java.lang.String r2 = "null reference"
            java.util.Objects.requireNonNull(r1, r2)
            java.lang.Runnable r0 = r0.f7576c
            java.util.Objects.requireNonNull(r0, r2)
            r2 = 300000(0x493e0, double:1.482197E-318)
            r1.postDelayed(r0, r2)
            return
        L26b:
            java.lang.Object r0 = r13.f9478Z
            m6.t r0 = (p218m6.BinderC4407t) r0
            m6.u r0 = r0.f17985g
            k6.b r1 = new k6.b
            r2 = 4
            r1.<init>(r2)
            com.google.android.gms.common.api.internal.b$c r0 = (com.google.android.gms.common.api.internal.C1082b.c) r0
            r0.m3083b(r1)
            return
        L27d:
            java.lang.Object r0 = r13.f9478Z
            s7.j r0 = (p327s7.C5986j) r0
            int r1 = p164j6.C3429c.f14874h
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "TIMEOUT"
            r1.<init>(r2)
            boolean r0 = r0.m12458a(r1)
            if (r0 == 0) goto L297
            java.lang.String r0 = "Rpc"
            java.lang.String r1 = "No response"
            android.util.Log.w(r0, r1)
        L297:
            return
        L298:
            java.lang.Object r0 = r13.f9478Z
            h6.q r0 = (p123h6.C2510q) r0
            java.lang.Object r2 = p123h6.C2510q.f11326g
            monitor-enter(r2)
            long r4 = r0.f11329c     // Catch: java.lang.Throwable -> L2af
            r6 = -1
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 != 0) goto L2a8
            goto L2ad
        L2a8:
            r1 = 15
            r0.m6414f(r1, r3)     // Catch: java.lang.Throwable -> L2af
        L2ad:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2af
            return
        L2af:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2af
            throw r0
        L2b2:
            java.lang.Object r0 = r13.f9478Z
            f6.l r0 = (p090f6.C2077l) r0
            r0.m5499l(r1)
            return
        L2ba:
            java.lang.Object r0 = r13.f9478Z
            db.m0$a r0 = (p057db.ServiceConnectionC1412m0.a) r0
            android.content.Intent r1 = r0.f7079a
            java.lang.String r1 = r1.getAction()
            java.lang.String r2 = java.lang.String.valueOf(r1)
            int r2 = r2.length()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r2 = r2 + 61
            r3.<init>(r2)
            java.lang.String r2 = "Service took too long to process intent: "
            r3.append(r2)
            r3.append(r1)
            java.lang.String r1 = " App may get closed."
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            java.lang.String r2 = "FirebaseMessaging"
            android.util.Log.w(r2, r1)
            r0.m3938a()
            return
    }
}
