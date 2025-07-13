package com.google.firebase.auth;

/* loaded from: classes.dex */
public abstract class FirebaseAuth implements p411x9.InterfaceC6976b {

    /* renamed from: a */
    public p251o9.C5180d f6579a;

    /* renamed from: b */
    public final java.util.List<com.google.firebase.auth.FirebaseAuth.InterfaceC1241b> f6580b;

    /* renamed from: c */
    public final java.util.List<p411x9.InterfaceC6974a> f6581c;

    /* renamed from: d */
    public java.util.List<com.google.firebase.auth.FirebaseAuth.InterfaceC1240a> f6582d;

    /* renamed from: e */
    public p124h7.C2588dc f6583e;

    /* renamed from: f */
    public p375v9.AbstractC6614o f6584f;

    /* renamed from: g */
    public final java.lang.Object f6585g;

    /* renamed from: h */
    public final java.lang.Object f6586h;

    /* renamed from: i */
    public java.lang.String f6587i;

    /* renamed from: j */
    public final p411x9.C6998q f6588j;

    /* renamed from: k */
    public final p411x9.C7003v f6589k;

    /* renamed from: l */
    public p411x9.C7000s f6590l;

    /* renamed from: m */
    public p411x9.ExecutorC7001t f6591m;

    /* renamed from: com.google.firebase.auth.FirebaseAuth$a */
    public interface InterfaceC1240a {
        /* renamed from: a */
        void m3635a(com.google.firebase.auth.FirebaseAuth r1);
    }

    /* renamed from: com.google.firebase.auth.FirebaseAuth$b */
    public interface InterfaceC1241b {
        /* renamed from: a */
        void m3636a(com.google.firebase.auth.FirebaseAuth r1);
    }

    public FirebaseAuth(p251o9.C5180d r12) {
            r11 = this;
            r12.m11497a()
            o9.h r0 = r12.f20314c
            java.lang.String r0 = r0.f20324a
            com.google.android.gms.common.internal.C1101a.m3100e(r0)
            h7.xc r1 = new h7.xc
            r1.<init>(r0)
            r12.m11497a()
            android.content.Context r0 = r12.f20312a
            l6.a<h7.xc> r2 = p124h7.C2966yc.f12039a
            h7.dc r2 = new h7.dc
            r2.<init>(r0, r1)
            x9.q r0 = new x9.q
            r12.m11497a()
            android.content.Context r1 = r12.f20312a
            java.lang.String r3 = r12.m11498e()
            r0.<init>(r1, r3)
            x9.v r1 = p411x9.C7003v.f27299b
            r11.<init>()
            java.util.concurrent.CopyOnWriteArrayList r3 = new java.util.concurrent.CopyOnWriteArrayList
            r3.<init>()
            r11.f6580b = r3
            java.util.concurrent.CopyOnWriteArrayList r3 = new java.util.concurrent.CopyOnWriteArrayList
            r3.<init>()
            r11.f6581c = r3
            java.util.concurrent.CopyOnWriteArrayList r3 = new java.util.concurrent.CopyOnWriteArrayList
            r3.<init>()
            r11.f6582d = r3
            java.lang.Object r3 = new java.lang.Object
            r3.<init>()
            r11.f6585g = r3
            java.lang.Object r3 = new java.lang.Object
            r3.<init>()
            r11.f6586h = r3
            x9.t r3 = p411x9.ExecutorC7001t.f27296Z
            r11.f6591m = r3
            r11.f6579a = r12
            r11.f6583e = r2
            r11.f6588j = r0
            java.lang.String r12 = "null reference"
            java.util.Objects.requireNonNull(r1, r12)
            r11.f6589k = r1
            java.lang.String r12 = "type"
            android.content.SharedPreferences r1 = r0.f27292a
            java.lang.String r2 = "com.google.firebase.auth.FIREBASE_USER"
            r3 = 0
            java.lang.String r1 = r1.getString(r2, r3)
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 == 0) goto L74
            goto L90
        L74:
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Exception -> L90
            r2.<init>(r1)     // Catch: java.lang.Exception -> L90
            boolean r1 = r2.has(r12)     // Catch: java.lang.Exception -> L90
            if (r1 == 0) goto L90
            java.lang.String r1 = "com.google.firebase.auth.internal.DefaultFirebaseUser"
            java.lang.String r12 = r2.optString(r12)     // Catch: java.lang.Exception -> L90
            boolean r12 = r1.equalsIgnoreCase(r12)     // Catch: java.lang.Exception -> L90
            if (r12 == 0) goto L90
            x9.f0 r12 = r0.m14147a(r2)     // Catch: java.lang.Exception -> L90
            goto L91
        L90:
            r12 = r3
        L91:
            r11.f6584f = r12
            r0 = 0
            r1 = 1
            if (r12 == 0) goto Lbf
            x9.q r2 = r11.f6588j
            java.util.Objects.requireNonNull(r2)
            android.content.SharedPreferences r2 = r2.f27292a
            java.lang.Object[] r4 = new java.lang.Object[r1]
            x9.c0 r12 = r12.f27264Z
            java.lang.String r12 = r12.f27249Y
            r4[r0] = r12
            java.lang.String r12 = "com.google.firebase.auth.GET_TOKEN_RESPONSE.%s"
            java.lang.String r12 = java.lang.String.format(r12, r4)
            java.lang.String r12 = r2.getString(r12, r3)
            if (r12 == 0) goto Lb7
            h7.me r12 = p124h7.C2752me.m6985X(r12)
            goto Lb8
        Lb7:
            r12 = r3
        Lb8:
            if (r12 == 0) goto Lbf
            v9.o r2 = r11.f6584f
            m3630e(r11, r2, r12, r0, r0)
        Lbf:
            x9.v r12 = r11.f6589k
            x9.p r12 = r12.f27300a
            java.util.Objects.requireNonNull(r12)
            o9.d r12 = r11.f6579a
            r12.m11497a()
            android.content.Context r12 = r12.f20312a
            java.lang.String r2 = "com.google.firebase.auth.internal.ProcessDeathHelper"
            android.content.SharedPreferences r12 = r12.getSharedPreferences(r2, r0)
            java.lang.String r2 = "firebaseAppName"
            java.lang.String r4 = ""
            java.lang.String r2 = r12.getString(r2, r4)
            o9.d r4 = r11.f6579a
            r4.m11497a()
            java.lang.String r4 = r4.f20313b
            boolean r2 = r4.equals(r2)
            if (r2 != 0) goto Lea
            goto L41f
        Lea:
            java.lang.String r2 = "verifyAssertionRequest"
            boolean r2 = r12.contains(r2)
            r4 = 0
            r6 = -1
            if (r2 == 0) goto L3b8
            java.lang.String r2 = "verifyAssertionRequest"
            java.lang.String r7 = ""
            java.lang.String r2 = r12.getString(r2, r7)
            android.os.Parcelable$Creator<h7.if> r7 = p124h7.C2681if.CREATOR
            if (r2 != 0) goto L103
            r2 = r3
            goto L109
        L103:
            r8 = 10
            byte[] r2 = android.util.Base64.decode(r2, r8)
        L109:
            java.lang.String r8 = "null reference"
            java.util.Objects.requireNonNull(r7, r8)
            android.os.Parcel r8 = android.os.Parcel.obtain()
            int r9 = r2.length
            r8.unmarshall(r2, r0, r9)
            r8.setDataPosition(r0)
            java.lang.Object r2 = r7.createFromParcel(r8)
            p6.d r2 = (p270p6.InterfaceC5370d) r2
            r8.recycle()
            h7.if r2 = (p124h7.C2681if) r2
            java.lang.String r7 = "operation"
            java.lang.String r8 = ""
            java.lang.String r7 = r12.getString(r7, r8)
            java.lang.String r8 = "tenantId"
            java.lang.String r8 = r12.getString(r8, r3)
            java.lang.String r9 = "firebaseUserUid"
            java.lang.String r10 = ""
            java.lang.String r9 = r12.getString(r9, r10)
            java.lang.String r10 = "timestamp"
            r12.getLong(r10, r4)
            if (r8 == 0) goto L150
            com.google.android.gms.common.internal.C1101a.m3100e(r8)
            java.lang.Object r4 = r11.f6586h
            monitor-enter(r4)
            r11.f6587i = r8     // Catch: java.lang.Throwable -> L14d
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L14d
            r2.f11655l0 = r8
            goto L150
        L14d:
            r12 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L14d
            throw r12
        L150:
            int r4 = r7.hashCode()
            r5 = -98509410(0xfffffffffa20dd9e, float:-2.088156E35)
            r8 = 2
            if (r4 == r5) goto L178
            r5 = 175006864(0xa6e6490, float:1.1478197E-32)
            if (r4 == r5) goto L16e
            r5 = 1450464913(0x56745691, float:6.716316E13)
            if (r4 == r5) goto L165
            goto L182
        L165:
            java.lang.String r4 = "com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN"
            boolean r4 = r7.equals(r4)
            if (r4 == 0) goto L182
            goto L183
        L16e:
            java.lang.String r0 = "com.google.firebase.auth.internal.NONGMSCORE_LINK"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L182
            r0 = 1
            goto L183
        L178:
            java.lang.String r0 = "com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L182
            r0 = 2
            goto L183
        L182:
            r0 = -1
        L183:
            r4 = 17072(0x42b0, float:2.3923E-41)
            if (r0 == 0) goto L304
            if (r0 == r1) goto L279
            if (r0 == r8) goto L18d
            goto L3ef
        L18d:
            v9.o r0 = r11.f6584f
            java.lang.String r0 = r0.mo13465a0()
            boolean r0 = r0.equals(r9)
            if (r0 == 0) goto L3ef
            v9.o r0 = r11.f6584f
            v9.j0 r2 = p375v9.C6605j0.m13458Y(r2)
            java.lang.String r5 = "null reference"
            java.util.Objects.requireNonNull(r0, r5)
            v9.c r2 = r2.m13459X()
            boolean r5 = r2 instanceof p375v9.C6594e
            if (r5 == 0) goto L228
            v9.e r2 = (p375v9.C6594e) r2
            java.lang.String r5 = r2.f25776Z
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            java.lang.String r6 = "password"
            if (r5 != 0) goto L1ba
            r5 = r6
            goto L1bc
        L1ba:
            java.lang.String r5 = "emailLink"
        L1bc:
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L1ee
            h7.dc r3 = r11.f6583e
            o9.d r4 = r11.f6579a
            java.lang.String r5 = r2.f25775Y
            java.lang.String r2 = r2.f25776Z
            com.google.android.gms.common.internal.C1101a.m3100e(r2)
            java.lang.String r6 = r0.mo13464Z()
            v9.n0 r7 = new v9.n0
            r7.<init>(r11, r1)
            java.util.Objects.requireNonNull(r3)
            h7.ub r1 = new h7.ub
            r1.<init>(r5, r2, r6)
            r1.m6833f(r4)
            r1.m6834g(r0)
            r1.m6831d(r7)
            r1.f11633f = r7
            r3.m6865a(r1)
            goto L3ef
        L1ee:
            java.lang.String r5 = r2.f25777a0
            com.google.android.gms.common.internal.C1101a.m3100e(r5)
            boolean r5 = r11.m3633f(r5)
            if (r5 == 0) goto L207
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            r0.<init>(r4, r3)
            o9.e r0 = p124h7.C2678ic.m6827a(r0)
            p327s7.C5988l.m12463d(r0)
            goto L3ef
        L207:
            h7.dc r3 = r11.f6583e
            o9.d r4 = r11.f6579a
            v9.n0 r5 = new v9.n0
            r5.<init>(r11, r1)
            java.util.Objects.requireNonNull(r3)
            h7.tb r1 = new h7.tb
            r1.<init>(r2)
            r1.m6833f(r4)
            r1.m6834g(r0)
            r1.m6831d(r5)
            r1.f11633f = r5
            r3.m6865a(r1)
            goto L3ef
        L228:
            boolean r3 = r2 instanceof p375v9.C6624v
            if (r3 == 0) goto L254
            h7.dc r3 = r11.f6583e
            o9.d r4 = r11.f6579a
            v9.v r2 = (p375v9.C6624v) r2
            java.lang.String r5 = r11.f6587i
            v9.n0 r6 = new v9.n0
            r6.<init>(r11, r1)
            java.util.Objects.requireNonNull(r3)
            p124h7.C2769nd.m7002a()
            h7.vb r1 = new h7.vb
            r1.<init>(r2, r5)
            r1.m6833f(r4)
            r1.m6834g(r0)
            r1.m6831d(r6)
            r1.f11633f = r6
            r3.m6865a(r1)
            goto L3ef
        L254:
            h7.dc r3 = r11.f6583e
            o9.d r4 = r11.f6579a
            java.lang.String r5 = r0.mo13464Z()
            v9.n0 r6 = new v9.n0
            r6.<init>(r11, r1)
            java.util.Objects.requireNonNull(r3)
            h7.sb r1 = new h7.sb
            r1.<init>(r2, r5)
            r1.m6833f(r4)
            r1.m6834g(r0)
            r1.m6831d(r6)
            r1.f11633f = r6
            r3.m6865a(r1)
            goto L3ef
        L279:
            v9.o r0 = r11.f6584f
            java.lang.String r0 = r0.mo13465a0()
            boolean r0 = r0.equals(r9)
            if (r0 == 0) goto L3ef
            v9.o r0 = r11.f6584f
            v9.j0 r2 = p375v9.C6605j0.m13458Y(r2)
            java.lang.String r4 = "null reference"
            java.util.Objects.requireNonNull(r0, r4)
            h7.dc r5 = r11.f6583e
            o9.d r6 = r11.f6579a
            v9.c r2 = r2.m13459X()
            v9.n0 r7 = new v9.n0
            r7.<init>(r11, r1)
            java.util.Objects.requireNonNull(r5)
            java.util.Objects.requireNonNull(r6, r4)
            java.util.List r4 = r0.mo13473i0()
            if (r4 == 0) goto L2c5
            r8 = r2
            v9.j0 r8 = (p375v9.C6605j0) r8
            java.lang.String r8 = r8.f25781Y
            boolean r4 = r4.contains(r8)
            if (r4 != 0) goto L2b5
            goto L2c5
        L2b5:
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            r1 = 17015(0x4277, float:2.3843E-41)
            r0.<init>(r1, r3)
            o9.e r0 = p124h7.C2678ic.m6827a(r0)
            p327s7.C5988l.m12463d(r0)
            goto L3ef
        L2c5:
            boolean r3 = r2 instanceof p375v9.C6594e
            if (r3 == 0) goto L2e0
            v9.e r2 = (p375v9.C6594e) r2
            java.lang.String r3 = r2.f25777a0
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            r1 = r1 ^ r3
            if (r1 != 0) goto L2da
            h7.nb r1 = new h7.nb
            r1.<init>(r2)
            goto L2f4
        L2da:
            h7.qb r1 = new h7.qb
            r1.<init>(r2)
            goto L2f4
        L2e0:
            boolean r1 = r2 instanceof p375v9.C6624v
            if (r1 == 0) goto L2ef
            v9.v r2 = (p375v9.C6624v) r2
            p124h7.C2769nd.m7002a()
            h7.pb r1 = new h7.pb
            r1.<init>(r2)
            goto L2f4
        L2ef:
            h7.ob r1 = new h7.ob
            r1.<init>(r2)
        L2f4:
            r1.m6833f(r6)
            r1.m6834g(r0)
            r1.m6831d(r7)
            r1.f11633f = r7
            r5.m6865a(r1)
            goto L3ef
        L304:
            v9.j0 r0 = p375v9.C6605j0.m13458Y(r2)
            v9.c r0 = r0.m13459X()
            boolean r2 = r0 instanceof p375v9.C6594e
            if (r2 == 0) goto L375
            v9.e r0 = (p375v9.C6594e) r0
            java.lang.String r2 = r0.f25777a0
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            r1 = r1 ^ r2
            if (r1 != 0) goto L340
            h7.dc r1 = r11.f6583e
            o9.d r2 = r11.f6579a
            java.lang.String r3 = r0.f25775Y
            java.lang.String r0 = r0.f25776Z
            com.google.android.gms.common.internal.C1101a.m3100e(r0)
            java.lang.String r4 = r11.f6587i
            v9.o0 r5 = new v9.o0
            r5.<init>(r11)
            java.util.Objects.requireNonNull(r1)
            h7.zb r6 = new h7.zb
            r6.<init>(r3, r0, r4)
            r6.m6833f(r2)
            r6.m6831d(r5)
            r1.m6865a(r6)
            goto L3ef
        L340:
            java.lang.String r1 = r0.f25777a0
            com.google.android.gms.common.internal.C1101a.m3100e(r1)
            boolean r1 = r11.m3633f(r1)
            if (r1 == 0) goto L359
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            r0.<init>(r4, r3)
            o9.e r0 = p124h7.C2678ic.m6827a(r0)
            p327s7.C5988l.m12463d(r0)
            goto L3ef
        L359:
            h7.dc r1 = r11.f6583e
            o9.d r2 = r11.f6579a
            v9.o0 r3 = new v9.o0
            r3.<init>(r11)
            java.util.Objects.requireNonNull(r1)
            h7.ac r4 = new h7.ac
            r4.<init>(r0)
            r4.m6833f(r2)
            r4.m6831d(r3)
            r1.m6865a(r4)
            goto L3ef
        L375:
            boolean r1 = r0 instanceof p375v9.C6624v
            if (r1 == 0) goto L39b
            v9.v r0 = (p375v9.C6624v) r0
            h7.dc r1 = r11.f6583e
            o9.d r2 = r11.f6579a
            java.lang.String r3 = r11.f6587i
            v9.o0 r4 = new v9.o0
            r4.<init>(r11)
            java.util.Objects.requireNonNull(r1)
            p124h7.C2769nd.m7002a()
            h7.bc r5 = new h7.bc
            r5.<init>(r0, r3)
            r5.m6833f(r2)
            r5.m6831d(r4)
            r1.m6865a(r5)
            goto L3ef
        L39b:
            h7.dc r1 = r11.f6583e
            o9.d r2 = r11.f6579a
            java.lang.String r3 = r11.f6587i
            v9.o0 r4 = new v9.o0
            r4.<init>(r11)
            java.util.Objects.requireNonNull(r1)
            h7.yb r5 = new h7.yb
            r5.<init>(r0, r3)
            r5.m6833f(r2)
            r5.m6831d(r4)
            r1.m6865a(r5)
            goto L3ef
        L3b8:
            java.lang.String r1 = "recaptchaToken"
            boolean r1 = r12.contains(r1)
            if (r1 == 0) goto L3f3
            java.lang.String r1 = "recaptchaToken"
            java.lang.String r2 = ""
            java.lang.String r1 = r12.getString(r1, r2)
            java.lang.String r2 = "operation"
            java.lang.String r3 = ""
            java.lang.String r2 = r12.getString(r2, r3)
            java.lang.String r3 = "timestamp"
            r12.getLong(r3, r4)
            int r3 = r2.hashCode()
            r4 = -214796028(0xfffffffff3327904, float:-1.4140065E31)
            if (r3 == r4) goto L3df
            goto L3e8
        L3df:
            java.lang.String r3 = "com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L3e8
            goto L3e9
        L3e8:
            r0 = -1
        L3e9:
            if (r0 == 0) goto L3ec
            goto L3ef
        L3ec:
            p327s7.C5988l.m12464e(r1)
        L3ef:
            p411x9.C6997p.m14146a(r12)
            goto L41f
        L3f3:
            java.lang.String r0 = "statusCode"
            boolean r0 = r12.contains(r0)
            if (r0 == 0) goto L41f
            java.lang.String r0 = "statusCode"
            r1 = 17062(0x42a6, float:2.3909E-41)
            int r0 = r12.getInt(r0, r1)
            java.lang.String r1 = "statusMessage"
            java.lang.String r2 = ""
            java.lang.String r1 = r12.getString(r1, r2)
            com.google.android.gms.common.api.Status r2 = new com.google.android.gms.common.api.Status
            r2.<init>(r0, r1)
            java.lang.String r0 = "timestamp"
            r12.getLong(r0, r4)
            p411x9.C6997p.m14146a(r12)
            o9.e r12 = p124h7.C2678ic.m6827a(r2)
            p327s7.C5988l.m12463d(r12)
        L41f:
            return
    }

    /* renamed from: c */
    public static void m3628c(com.google.firebase.auth.FirebaseAuth r2, p375v9.AbstractC6614o r3) {
            if (r3 == 0) goto L27
            java.lang.String r3 = r3.mo13465a0()
            java.lang.String r0 = java.lang.String.valueOf(r3)
            int r0 = r0.length()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r0 = r0 + 47
            r1.<init>(r0)
            java.lang.String r0 = "Notifying auth state listeners about user ( "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r3 = " )."
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            goto L29
        L27:
            java.lang.String r3 = "Notifying auth state listeners about a sign-out event."
        L29:
            java.lang.String r0 = "FirebaseAuth"
            android.util.Log.d(r0, r3)
            x9.t r3 = r2.f6591m
            com.google.firebase.auth.b r0 = new com.google.firebase.auth.b
            r0.<init>(r2)
            android.os.Handler r2 = r3.f27297Y
            r2.post(r0)
            return
    }

    /* renamed from: d */
    public static void m3629d(com.google.firebase.auth.FirebaseAuth r3, p375v9.AbstractC6614o r4) {
            if (r4 == 0) goto L27
            java.lang.String r0 = r4.mo13465a0()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            int r1 = r1.length()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r1 = r1 + 45
            r2.<init>(r1)
            java.lang.String r1 = "Notifying id token listeners about user ( "
            r2.append(r1)
            r2.append(r0)
            java.lang.String r0 = " )."
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            goto L29
        L27:
            java.lang.String r0 = "Notifying id token listeners about a sign-out event."
        L29:
            java.lang.String r1 = "FirebaseAuth"
            android.util.Log.d(r1, r0)
            if (r4 == 0) goto L35
            java.lang.String r4 = r4.mo13471g0()
            goto L36
        L35:
            r4 = 0
        L36:
            bb.b r0 = new bb.b
            r0.<init>(r4)
            x9.t r4 = r3.f6591m
            com.google.firebase.auth.a r1 = new com.google.firebase.auth.a
            r1.<init>(r3, r0)
            android.os.Handler r3 = r4.f27297Y
            r3.post(r1)
            return
    }

    /* renamed from: e */
    public static void m3630e(com.google.firebase.auth.FirebaseAuth r15, p375v9.AbstractC6614o r16, p124h7.C2752me r17, boolean r18, boolean r19) {
            r0 = r15
            r1 = r16
            r2 = r17
            java.lang.String r3 = "null reference"
            java.util.Objects.requireNonNull(r1, r3)
            java.util.Objects.requireNonNull(r2, r3)
            v9.o r4 = r0.f6584f
            r6 = 1
            if (r4 == 0) goto L24
            java.lang.String r4 = r16.mo13465a0()
            v9.o r7 = r0.f6584f
            java.lang.String r7 = r7.mo13465a0()
            boolean r4 = r4.equals(r7)
            if (r4 == 0) goto L24
            r4 = 1
            goto L25
        L24:
            r4 = 0
        L25:
            if (r4 != 0) goto L2b
            if (r19 != 0) goto L2a
            goto L2b
        L2a:
            return
        L2b:
            v9.o r7 = r0.f6584f
            if (r7 != 0) goto L32
            r4 = 1
            r7 = 1
            goto L47
        L32:
            h7.me r7 = r7.mo13470f0()
            java.lang.String r7 = r7.f11773Z
            java.lang.String r8 = r2.f11773Z
            boolean r7 = r7.equals(r8)
            r7 = r7 ^ r6
            if (r4 == 0) goto L45
            if (r7 != 0) goto L45
            r7 = 0
            goto L46
        L45:
            r7 = 1
        L46:
            r4 = r4 ^ r6
        L47:
            v9.o r8 = r0.f6584f
            if (r8 != 0) goto L4e
            r0.f6584f = r1
            goto L6d
        L4e:
            java.util.List r9 = r16.mo13463Y()
            r8.mo13469e0(r9)
            boolean r8 = r16.mo13466b0()
            if (r8 != 0) goto L60
            v9.o r8 = r0.f6584f
            r8.mo13468d0()
        L60:
            x9.d r8 = r16.mo13462X()
            java.util.List r8 = r8.m14140a()
            v9.o r9 = r0.f6584f
            r9.mo13475k0(r8)
        L6d:
            if (r18 == 0) goto L189
            x9.q r8 = r0.f6588j
            v9.o r9 = r0.f6584f
            java.util.Objects.requireNonNull(r8)
            java.util.Objects.requireNonNull(r9, r3)
            org.json.JSONObject r10 = new org.json.JSONObject
            r10.<init>()
            java.lang.Class<x9.f0> r11 = p411x9.C6985f0.class
            java.lang.Class r12 = r9.getClass()
            boolean r11 = r11.isAssignableFrom(r12)
            if (r11 == 0) goto L170
            x9.f0 r9 = (p411x9.C6985f0) r9
            java.lang.String r11 = "cachedTokenState"
            java.lang.String r12 = r9.mo13472h0()     // Catch: java.lang.Exception -> L159
            r10.put(r11, r12)     // Catch: java.lang.Exception -> L159
            java.lang.String r11 = "applicationName"
            java.lang.String r12 = r9.f27265a0     // Catch: java.lang.Exception -> L159
            o9.d r12 = p251o9.C5180d.m11495d(r12)     // Catch: java.lang.Exception -> L159
            r12.m11497a()     // Catch: java.lang.Exception -> L159
            java.lang.String r12 = r12.f20313b     // Catch: java.lang.Exception -> L159
            r10.put(r11, r12)     // Catch: java.lang.Exception -> L159
            java.lang.String r11 = "type"
            java.lang.String r12 = "com.google.firebase.auth.internal.DefaultFirebaseUser"
            r10.put(r11, r12)     // Catch: java.lang.Exception -> L159
            java.util.List<x9.c0> r11 = r9.f27267c0     // Catch: java.lang.Exception -> L159
            if (r11 == 0) goto Ld3
            org.json.JSONArray r11 = new org.json.JSONArray     // Catch: java.lang.Exception -> L159
            r11.<init>()     // Catch: java.lang.Exception -> L159
            java.util.List<x9.c0> r12 = r9.f27267c0     // Catch: java.lang.Exception -> L159
            r13 = 0
        Lb8:
            int r14 = r12.size()     // Catch: java.lang.Exception -> L159
            if (r13 >= r14) goto Lce
            java.lang.Object r14 = r12.get(r13)     // Catch: java.lang.Exception -> L159
            x9.c0 r14 = (p411x9.C6979c0) r14     // Catch: java.lang.Exception -> L159
            java.lang.String r14 = r14.m14139X()     // Catch: java.lang.Exception -> L159
            r11.put(r14)     // Catch: java.lang.Exception -> L159
            int r13 = r13 + 1
            goto Lb8
        Lce:
            java.lang.String r12 = "userInfos"
            r10.put(r12, r11)     // Catch: java.lang.Exception -> L159
        Ld3:
            java.lang.String r11 = "anonymous"
            boolean r12 = r9.mo13466b0()     // Catch: java.lang.Exception -> L159
            r10.put(r11, r12)     // Catch: java.lang.Exception -> L159
            java.lang.String r11 = "version"
            java.lang.String r12 = "2"
            r10.put(r11, r12)     // Catch: java.lang.Exception -> L159
            x9.h0 r11 = r9.f27271g0     // Catch: java.lang.Exception -> L159
            if (r11 == 0) goto L107
            java.lang.String r12 = "userMetadata"
            org.json.JSONObject r13 = new org.json.JSONObject     // Catch: java.lang.Exception -> L159
            r13.<init>()     // Catch: java.lang.Exception -> L159
            java.lang.String r14 = "lastSignInTimestamp"
            r19 = r7
            long r6 = r11.f27278Y     // Catch: org.json.JSONException -> L103 java.lang.Exception -> L159
            r13.put(r14, r6)     // Catch: org.json.JSONException -> L103 java.lang.Exception -> L159
            java.lang.String r6 = "creationTimestamp"
            r14 = r6
            long r5 = r11.f27279Z     // Catch: org.json.JSONException -> L103 java.lang.Exception -> L159
            r11 = r14
            r13.put(r11, r5)     // Catch: org.json.JSONException -> L103 java.lang.Exception -> L159
            goto L103
        L101:
            r19 = r7
        L103:
            r10.put(r12, r13)     // Catch: java.lang.Exception -> L159
            goto L109
        L107:
            r19 = r7
        L109:
            x9.n r5 = r9.f27274j0     // Catch: java.lang.Exception -> L159
            if (r5 == 0) goto L128
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch: java.lang.Exception -> L159
            r6.<init>()     // Catch: java.lang.Exception -> L159
            java.util.List<v9.w> r5 = r5.f27289Y     // Catch: java.lang.Exception -> L159
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Exception -> L159
        L118:
            boolean r9 = r5.hasNext()     // Catch: java.lang.Exception -> L159
            if (r9 == 0) goto L12d
            java.lang.Object r9 = r5.next()     // Catch: java.lang.Exception -> L159
            v9.w r9 = (p375v9.C6625w) r9     // Catch: java.lang.Exception -> L159
            r6.add(r9)     // Catch: java.lang.Exception -> L159
            goto L118
        L128:
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch: java.lang.Exception -> L159
            r6.<init>()     // Catch: java.lang.Exception -> L159
        L12d:
            boolean r5 = r6.isEmpty()     // Catch: java.lang.Exception -> L159
            if (r5 != 0) goto L154
            org.json.JSONArray r5 = new org.json.JSONArray     // Catch: java.lang.Exception -> L159
            r5.<init>()     // Catch: java.lang.Exception -> L159
            r9 = 0
        L139:
            int r11 = r6.size()     // Catch: java.lang.Exception -> L159
            if (r9 >= r11) goto L14f
            java.lang.Object r11 = r6.get(r9)     // Catch: java.lang.Exception -> L159
            v9.s r11 = (p375v9.AbstractC6621s) r11     // Catch: java.lang.Exception -> L159
            org.json.JSONObject r11 = r11.mo13476X()     // Catch: java.lang.Exception -> L159
            r5.put(r11)     // Catch: java.lang.Exception -> L159
            int r9 = r9 + 1
            goto L139
        L14f:
            java.lang.String r6 = "userMultiFactorInfo"
            r10.put(r6, r5)     // Catch: java.lang.Exception -> L159
        L154:
            java.lang.String r5 = r10.toString()     // Catch: java.lang.Exception -> L159
            goto L173
        L159:
            r0 = move-exception
            r6.a r1 = r8.f27293b
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r3 = r1.f22479a
            java.lang.String r4 = "Failed to turn object into JSON"
            java.lang.String r1 = r1.m12162c(r4, r2)
            android.util.Log.wtf(r3, r1, r0)
            h7.g8 r1 = new h7.g8
            r1.<init>(r0)
            throw r1
        L170:
            r19 = r7
            r5 = 0
        L173:
            boolean r6 = android.text.TextUtils.isEmpty(r5)
            if (r6 != 0) goto L18b
            android.content.SharedPreferences r6 = r8.f27292a
            android.content.SharedPreferences$Editor r6 = r6.edit()
            java.lang.String r8 = "com.google.firebase.auth.FIREBASE_USER"
            android.content.SharedPreferences$Editor r5 = r6.putString(r8, r5)
            r5.apply()
            goto L18b
        L189:
            r19 = r7
        L18b:
            if (r19 == 0) goto L199
            v9.o r5 = r0.f6584f
            if (r5 == 0) goto L194
            r5.mo13474j0(r2)
        L194:
            v9.o r5 = r0.f6584f
            m3629d(r15, r5)
        L199:
            if (r4 == 0) goto L1a0
            v9.o r4 = r0.f6584f
            m3628c(r15, r4)
        L1a0:
            if (r18 == 0) goto L1c8
            x9.q r4 = r0.f6588j
            java.util.Objects.requireNonNull(r4)
            android.content.SharedPreferences r4 = r4.f27292a
            android.content.SharedPreferences$Editor r4 = r4.edit()
            r5 = 1
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.String r1 = r16.mo13465a0()
            r6 = 0
            r5[r6] = r1
            java.lang.String r1 = "com.google.firebase.auth.GET_TOKEN_RESPONSE.%s"
            java.lang.String r1 = java.lang.String.format(r1, r5)
            java.lang.String r2 = r17.m6986Y()
            android.content.SharedPreferences$Editor r1 = r4.putString(r1, r2)
            r1.apply()
        L1c8:
            v9.o r1 = r0.f6584f
            if (r1 == 0) goto L20d
            x9.s r2 = r0.f6590l
            if (r2 != 0) goto L1dc
            o9.d r2 = r0.f6579a
            java.util.Objects.requireNonNull(r2, r3)
            x9.s r3 = new x9.s
            r3.<init>(r2)
            r0.f6590l = r3
        L1dc:
            x9.s r0 = r0.f6590l
            h7.me r1 = r1.mo13470f0()
            java.util.Objects.requireNonNull(r0)
            if (r1 != 0) goto L1e8
            goto L20d
        L1e8:
            java.lang.Long r2 = r1.f11774a0
            r3 = 0
            if (r2 != 0) goto L1f0
            r5 = r3
            goto L1f4
        L1f0:
            long r5 = r2.longValue()
        L1f4:
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 > 0) goto L1fa
            r5 = 3600(0xe10, double:1.7786E-320)
        L1fa:
            java.lang.Long r1 = r1.f11776c0
            long r1 = r1.longValue()
            x9.i r0 = r0.f27295a
            r3 = 1000(0x3e8, double:4.94E-321)
            long r5 = r5 * r3
            long r5 = r5 + r1
            r0.f27281a = r5
            r1 = -1
            r0.f27282b = r1
        L20d:
            return
    }

    @androidx.annotation.Keep
    public static com.google.firebase.auth.FirebaseAuth getInstance() {
            o9.d r0 = p251o9.C5180d.m11494c()
            java.lang.Class<com.google.firebase.auth.FirebaseAuth> r1 = com.google.firebase.auth.FirebaseAuth.class
            r0.m11497a()
            y9.i r0 = r0.f20315d
            java.lang.Object r0 = r0.mo14246a(r1)
            com.google.firebase.auth.FirebaseAuth r0 = (com.google.firebase.auth.FirebaseAuth) r0
            return r0
    }

    @androidx.annotation.Keep
    public static com.google.firebase.auth.FirebaseAuth getInstance(p251o9.C5180d r1) {
            java.lang.Class<com.google.firebase.auth.FirebaseAuth> r0 = com.google.firebase.auth.FirebaseAuth.class
            r1.m11497a()
            y9.i r1 = r1.f20315d
            java.lang.Object r1 = r1.mo14246a(r0)
            com.google.firebase.auth.FirebaseAuth r1 = (com.google.firebase.auth.FirebaseAuth) r1
            return r1
    }

    /* renamed from: a */
    public p327s7.AbstractC5985i<p375v9.InterfaceC6592d> m3631a() {
            r5 = this;
            v9.o r0 = r5.f6584f
            if (r0 == 0) goto L1b
            boolean r0 = r0.mo13466b0()
            if (r0 == 0) goto L1b
            v9.o r0 = r5.f6584f
            x9.f0 r0 = (p411x9.C6985f0) r0
            r1 = 0
            r0.f27272h0 = r1
            x9.a0 r1 = new x9.a0
            r1.<init>(r0)
            s7.i r0 = p327s7.C5988l.m12464e(r1)
            return r0
        L1b:
            h7.dc r0 = r5.f6583e
            o9.d r1 = r5.f6579a
            v9.o0 r2 = new v9.o0
            r2.<init>(r5)
            java.lang.String r3 = r5.f6587i
            java.util.Objects.requireNonNull(r0)
            h7.wb r4 = new h7.wb
            r4.<init>(r3)
            r4.m6833f(r1)
            r4.m6831d(r2)
            s7.i r0 = r0.m6865a(r4)
            return r0
    }

    /* renamed from: b */
    public void m3632b() {
            r5 = this;
            x9.q r0 = r5.f6588j
            java.lang.String r1 = "null reference"
            java.util.Objects.requireNonNull(r0, r1)
            v9.o r0 = r5.f6584f
            r1 = 0
            if (r0 == 0) goto L2d
            x9.q r2 = r5.f6588j
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            java.lang.String r0 = r0.mo13465a0()
            r3[r4] = r0
            java.lang.String r0 = "com.google.firebase.auth.GET_TOKEN_RESPONSE.%s"
            java.lang.String r0 = java.lang.String.format(r0, r3)
            android.content.SharedPreferences r2 = r2.f27292a
            android.content.SharedPreferences$Editor r2 = r2.edit()
            android.content.SharedPreferences$Editor r0 = r2.remove(r0)
            r0.apply()
            r5.f6584f = r1
        L2d:
            x9.q r0 = r5.f6588j
            android.content.SharedPreferences r0 = r0.f27292a
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r2 = "com.google.firebase.auth.FIREBASE_USER"
            android.content.SharedPreferences$Editor r0 = r0.remove(r2)
            r0.apply()
            m3629d(r5, r1)
            m3628c(r5, r1)
            x9.s r0 = r5.f6590l
            if (r0 == 0) goto L51
            x9.i r0 = r0.f27295a
            android.os.Handler r1 = r0.f27284d
            java.lang.Runnable r0 = r0.f27285e
            r1.removeCallbacks(r0)
        L51:
            return
    }

    /* renamed from: f */
    public final boolean m3633f(java.lang.String r2) {
            r1 = this;
            int r0 = p375v9.C6588b.f25772c
            com.google.android.gms.common.internal.C1101a.m3100e(r2)
            v9.b r0 = new v9.b     // Catch: java.lang.IllegalArgumentException -> Lb
            r0.<init>(r2)     // Catch: java.lang.IllegalArgumentException -> Lb
            goto Lc
        Lb:
            r0 = 0
        Lc:
            if (r0 == 0) goto L1a
            java.lang.String r2 = r1.f6587i
            java.lang.String r0 = r0.f25774b
            boolean r2 = android.text.TextUtils.equals(r2, r0)
            if (r2 != 0) goto L1a
            r2 = 1
            return r2
        L1a:
            r2 = 0
            return r2
    }

    /* renamed from: g */
    public final p327s7.AbstractC5985i<p375v9.C6616p> m3634g(p375v9.AbstractC6614o r5, boolean r6) {
            r4 = this;
            if (r5 != 0) goto L13
            com.google.android.gms.common.api.Status r5 = new com.google.android.gms.common.api.Status
            r6 = 17495(0x4457, float:2.4516E-41)
            r0 = 0
            r5.<init>(r6, r0)
            o9.e r5 = p124h7.C2678ic.m6827a(r5)
            s7.i r5 = p327s7.C5988l.m12463d(r5)
            return r5
        L13:
            h7.me r0 = r5.mo13470f0()
            boolean r1 = r0.m6987Z()
            if (r1 == 0) goto L2a
            if (r6 != 0) goto L2a
            java.lang.String r5 = r0.f11773Z
            v9.p r5 = p411x9.C6993l.m14141a(r5)
            s7.i r5 = p327s7.C5988l.m12464e(r5)
            return r5
        L2a:
            h7.dc r6 = r4.f6583e
            o9.d r1 = r4.f6579a
            java.lang.String r0 = r0.f11772Y
            v9.n0 r2 = new v9.n0
            r3 = 0
            r2.<init>(r4, r3)
            java.util.Objects.requireNonNull(r6)
            h7.mb r3 = new h7.mb
            r3.<init>(r0)
            r3.m6833f(r1)
            r3.m6834g(r5)
            r3.m6831d(r2)
            r3.m6832e(r2)
            h7.fb r5 = r6.m6866b()
            l6.c<O extends h7.gb> r5 = r5.f11513a
            m6.k r6 = r3.mo6465a()
            s7.i r5 = r5.m9326b(r6)
            return r5
    }
}
