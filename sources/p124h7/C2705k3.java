package p124h7;

/* renamed from: h7.k3 */
/* loaded from: classes.dex */
public final class C2705k3 implements p124h7.InterfaceC2697jd, p124h7.InterfaceC2534ad {

    /* renamed from: Y */
    public java.lang.Object f11692Y;

    /* renamed from: Z */
    public java.lang.Object f11693Z;

    /* renamed from: a0 */
    public java.lang.Object f11694a0;

    /* renamed from: b0 */
    public java.lang.Object f11695b0;

    /* renamed from: c0 */
    public java.lang.Object f11696c0;

    /* renamed from: d0 */
    public java.lang.Object f11697d0;

    public C2705k3() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f11697d0 = r0
            r1.f11692Y = r0
            r1.f11693Z = r0
            r1.f11694a0 = r0
            r1.f11695b0 = r0
            return
    }

    public C2705k3(int r2) {
            r1 = this;
            r1.<init>()
            r0 = 1
            if (r2 == r0) goto L1b
            r0 = 4
            if (r2 == r0) goto L18
            r0 = 6
            if (r2 == r0) goto L15
            r0 = 7
            if (r2 == r0) goto L12
            java.lang.String r2 = "REQUEST_TYPE_UNSET_ENUM_VALUE"
            goto L1d
        L12:
            java.lang.String r2 = "VERIFY_AND_CHANGE_EMAIL"
            goto L1d
        L15:
            java.lang.String r2 = "EMAIL_SIGNIN"
            goto L1d
        L18:
            java.lang.String r2 = "VERIFY_EMAIL"
            goto L1d
        L1b:
            java.lang.String r2 = "PASSWORD_RESET"
        L1d:
            r1.f11693Z = r2
            return
    }

    public C2705k3(p083f.C1933t r1, p124h7.C2536af r2, p124h7.C2644ge r3, p124h7.C2624fc r4, p124h7.C2752me r5, p124h7.InterfaceC2697jd r6) {
            r0 = this;
            r0.f11697d0 = r1
            r0.f11692Y = r2
            r0.f11693Z = r3
            r0.f11694a0 = r4
            r0.f11695b0 = r5
            r0.f11696c0 = r6
            r0.<init>()
            return
    }

    public C2705k3(p375v9.C6586a r2, java.lang.String r3, java.lang.String r4) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "VERIFY_AND_CHANGE_EMAIL"
            r1.f11693Z = r0
            r1.f11696c0 = r2
            r2 = 0
            r1.f11692Y = r2
            r1.f11694a0 = r3
            r1.f11695b0 = r4
            r1.f11697d0 = r2
            return
    }

    @Override // p124h7.InterfaceC2534ad
    /* renamed from: a */
    public java.lang.String mo27a() {
            r7 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.Object r1 = r7.f11693Z
            java.lang.String r1 = (java.lang.String) r1
            int r2 = r1.hashCode()
            r3 = 2
            r4 = 3
            r5 = 0
            r6 = 1
            switch(r2) {
                case -1452371317: goto L33;
                case -1341836234: goto L29;
                case -1099157829: goto L1f;
                case 870738373: goto L15;
                default: goto L14;
            }
        L14:
            goto L3d
        L15:
            java.lang.String r2 = "EMAIL_SIGNIN"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L3d
            r1 = 2
            goto L3e
        L1f:
            java.lang.String r2 = "VERIFY_AND_CHANGE_EMAIL"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L3d
            r1 = 3
            goto L3e
        L29:
            java.lang.String r2 = "VERIFY_EMAIL"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L3d
            r1 = 1
            goto L3e
        L33:
            java.lang.String r2 = "PASSWORD_RESET"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L3d
            r1 = 0
            goto L3e
        L3d:
            r1 = -1
        L3e:
            if (r1 == 0) goto L4d
            if (r1 == r6) goto L4b
            if (r1 == r3) goto L49
            if (r1 == r4) goto L47
            goto L4e
        L47:
            r5 = 7
            goto L4e
        L49:
            r5 = 6
            goto L4e
        L4b:
            r5 = 4
            goto L4e
        L4d:
            r5 = 1
        L4e:
            java.lang.String r1 = "requestType"
            r0.put(r1, r5)
            java.lang.Object r1 = r7.f11692Y
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L5e
            java.lang.String r2 = "email"
            r0.put(r2, r1)
        L5e:
            java.lang.Object r1 = r7.f11694a0
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L69
            java.lang.String r2 = "newEmail"
            r0.put(r2, r1)
        L69:
            java.lang.Object r1 = r7.f11695b0
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L74
            java.lang.String r2 = "idToken"
            r0.put(r2, r1)
        L74:
            java.lang.Object r1 = r7.f11696c0
            v9.a r1 = (p375v9.C6586a) r1
            if (r1 == 0) goto Lda
            boolean r1 = r1.f25761c0
            java.lang.String r2 = "androidInstallApp"
            r0.put(r2, r1)
            java.lang.Object r1 = r7.f11696c0
            v9.a r1 = (p375v9.C6586a) r1
            boolean r1 = r1.f25763e0
            java.lang.String r2 = "canHandleCodeInApp"
            r0.put(r2, r1)
            java.lang.Object r1 = r7.f11696c0
            v9.a r1 = (p375v9.C6586a) r1
            java.lang.String r1 = r1.f25757Y
            if (r1 == 0) goto L99
            java.lang.String r2 = "continueUrl"
            r0.put(r2, r1)
        L99:
            java.lang.Object r1 = r7.f11696c0
            v9.a r1 = (p375v9.C6586a) r1
            java.lang.String r1 = r1.f25758Z
            if (r1 == 0) goto La6
            java.lang.String r2 = "iosBundleId"
            r0.put(r2, r1)
        La6:
            java.lang.Object r1 = r7.f11696c0
            v9.a r1 = (p375v9.C6586a) r1
            java.lang.String r1 = r1.f25759a0
            if (r1 == 0) goto Lb3
            java.lang.String r2 = "iosAppStoreId"
            r0.put(r2, r1)
        Lb3:
            java.lang.Object r1 = r7.f11696c0
            v9.a r1 = (p375v9.C6586a) r1
            java.lang.String r1 = r1.f25760b0
            if (r1 == 0) goto Lc0
            java.lang.String r2 = "androidPackageName"
            r0.put(r2, r1)
        Lc0:
            java.lang.Object r1 = r7.f11696c0
            v9.a r1 = (p375v9.C6586a) r1
            java.lang.String r1 = r1.f25762d0
            if (r1 == 0) goto Lcd
            java.lang.String r2 = "androidMinimumVersion"
            r0.put(r2, r1)
        Lcd:
            java.lang.Object r1 = r7.f11696c0
            v9.a r1 = (p375v9.C6586a) r1
            java.lang.String r1 = r1.f25766h0
            if (r1 == 0) goto Lda
            java.lang.String r2 = "dynamicLinkDomain"
            r0.put(r2, r1)
        Lda:
            java.lang.Object r1 = r7.f11697d0
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto Le5
            java.lang.String r2 = "tenantId"
            r0.put(r2, r1)
        Le5:
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // p124h7.InterfaceC2697jd
    /* renamed from: b */
    public void mo28b(java.lang.Object r7) {
            r6 = this;
            h7.bf r7 = (p124h7.C2555bf) r7
            java.lang.Object r0 = r6.f11692Y
            h7.af r0 = (p124h7.C2536af) r0
            java.lang.String r1 = "EMAIL"
            boolean r0 = r0.m6470d(r1)
            r1 = 0
            if (r0 == 0) goto L16
            java.lang.Object r0 = r6.f11693Z
            h7.ge r0 = (p124h7.C2644ge) r0
            r0.f11545Z = r1
            goto L24
        L16:
            java.lang.Object r0 = r6.f11692Y
            h7.af r0 = (p124h7.C2536af) r0
            java.lang.String r0 = r0.f11382a0
            if (r0 == 0) goto L24
            java.lang.Object r2 = r6.f11693Z
            h7.ge r2 = (p124h7.C2644ge) r2
            r2.f11545Z = r0
        L24:
            java.lang.Object r0 = r6.f11692Y
            h7.af r0 = (p124h7.C2536af) r0
            java.lang.String r2 = "DISPLAY_NAME"
            boolean r0 = r0.m6470d(r2)
            if (r0 == 0) goto L37
            java.lang.Object r0 = r6.f11693Z
            h7.ge r0 = (p124h7.C2644ge) r0
            r0.f11547b0 = r1
            goto L45
        L37:
            java.lang.Object r0 = r6.f11692Y
            h7.af r0 = (p124h7.C2536af) r0
            java.lang.String r0 = r0.f11381Z
            if (r0 == 0) goto L45
            java.lang.Object r2 = r6.f11693Z
            h7.ge r2 = (p124h7.C2644ge) r2
            r2.f11547b0 = r0
        L45:
            java.lang.Object r0 = r6.f11692Y
            h7.af r0 = (p124h7.C2536af) r0
            java.lang.String r2 = "PHOTO_URL"
            boolean r0 = r0.m6470d(r2)
            if (r0 == 0) goto L58
            java.lang.Object r0 = r6.f11693Z
            h7.ge r0 = (p124h7.C2644ge) r0
            r0.f11548c0 = r1
            goto L66
        L58:
            java.lang.Object r0 = r6.f11692Y
            h7.af r0 = (p124h7.C2536af) r0
            java.lang.String r0 = r0.f11385d0
            if (r0 == 0) goto L66
            java.lang.Object r2 = r6.f11693Z
            h7.ge r2 = (p124h7.C2644ge) r2
            r2.f11548c0 = r0
        L66:
            java.lang.Object r0 = r6.f11692Y
            h7.af r0 = (p124h7.C2536af) r0
            java.lang.String r0 = r0.f11383b0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L8d
            java.lang.Object r0 = r6.f11693Z
            h7.ge r0 = (p124h7.C2644ge) r0
            java.lang.String r2 = "redacted"
            byte[] r2 = r2.getBytes()
            if (r2 != 0) goto L80
            r2 = r1
            goto L85
        L80:
            r3 = 0
            java.lang.String r2 = android.util.Base64.encodeToString(r2, r3)
        L85:
            java.util.Objects.requireNonNull(r0)
            com.google.android.gms.common.internal.C1101a.m3100e(r2)
            r0.f11550e0 = r2
        L8d:
            h7.se r0 = r7.f11409Z
            if (r0 == 0) goto L93
            java.util.List<h7.qe> r1 = r0.f11911Y
        L93:
            if (r1 != 0) goto L9a
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L9a:
            java.lang.Object r0 = r6.f11693Z
            h7.ge r0 = (p124h7.C2644ge) r0
            java.util.Objects.requireNonNull(r0)
            h7.se r2 = new h7.se
            r2.<init>()
            r0.f11549d0 = r2
            java.util.List<h7.qe> r0 = r2.f11911Y
            r0.addAll(r1)
            java.lang.Object r0 = r6.f11694a0
            h7.fc r0 = (p124h7.C2624fc) r0
            java.lang.Object r1 = r6.f11695b0
            h7.me r1 = (p124h7.C2752me) r1
            java.lang.String r2 = "null reference"
            java.util.Objects.requireNonNull(r1, r2)
            java.lang.String r2 = r7.f11410a0
            java.lang.String r3 = r7.f11411b0
            boolean r4 = android.text.TextUtils.isEmpty(r2)
            if (r4 != 0) goto Ld8
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 != 0) goto Ld8
            long r4 = r7.f11412c0
            h7.me r7 = new h7.me
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            java.lang.String r1 = r1.f11775b0
            r7.<init>(r3, r2, r4, r1)
            r1 = r7
        Ld8:
            java.lang.Object r7 = r6.f11693Z
            h7.ge r7 = (p124h7.C2644ge) r7
            r0.m6717e(r1, r7)
            return
    }

    @java.lang.Deprecated
    /* renamed from: c */
    public p124h7.C2705k3 m6938c(p124h7.C2744m6 r7) {
            r6 = this;
            java.lang.String r0 = r7.m6981x()
            h7.cg r1 = r7.m6980w()
            byte[] r1 = r1.m6537C()
            h7.d7 r7 = r7.m6979v()
            int r2 = p124h7.C2723l3.f11729c
            int r7 = r7.ordinal()
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            if (r7 == r5) goto L2f
            if (r7 == r4) goto L2d
            if (r7 == r3) goto L2b
            if (r7 != r2) goto L23
            goto L30
        L23:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Unknown output prefix type"
            r7.<init>(r0)
            throw r7
        L2b:
            r2 = 3
            goto L30
        L2d:
            r2 = 2
            goto L30
        L2f:
            r2 = 1
        L30:
            h7.p1 r7 = p124h7.C2793p1.m7027a(r0, r1, r2)
            r6.f11695b0 = r7
            return r6
    }

    /* renamed from: d */
    public p124h7.C2705k3 m6939d(android.content.Context r1, java.lang.String r2, java.lang.String r3) {
            r0 = this;
            if (r1 == 0) goto L11
            h7.hd r2 = new h7.hd
            r2.<init>(r1, r3)
            r0.f11697d0 = r2
            h7.p3 r2 = new h7.p3
            r2.<init>(r1, r3)
            r0.f11692Y = r2
            return r0
        L11:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "need an Android context"
            r1.<init>(r2)
            throw r1
    }

    @Override // p124h7.InterfaceC2697jd
    /* renamed from: e */
    public void mo29e(java.lang.String r2) {
            r1 = this;
            java.lang.Object r0 = r1.f11696c0
            h7.jd r0 = (p124h7.InterfaceC2697jd) r0
            r0.mo29e(r2)
            return
    }

    /* renamed from: f */
    public synchronized p124h7.C2723l3 m6940f() {
            r4 = this;
            monitor-enter(r4)
            java.lang.Object r0 = r4.f11693Z     // Catch: java.lang.Throwable -> L12
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto Ld
            h7.k1 r0 = r4.m6941g()     // Catch: java.lang.Throwable -> L12
            r4.f11694a0 = r0     // Catch: java.lang.Throwable -> L12
        Ld:
            h7.t1 r0 = r4.m6942h()     // Catch: java.lang.Throwable -> L12 java.io.FileNotFoundException -> L14
            goto L74
        L12:
            r0 = move-exception
            goto L88
        L14:
            r0 = move-exception
            int r1 = p124h7.C2723l3.f11729c     // Catch: java.lang.Throwable -> L12
            java.lang.String r1 = "l3"
            java.lang.String r2 = "keyset not found, will generate a new one"
            android.util.Log.i(r1, r2, r0)     // Catch: java.lang.Throwable -> L12
            java.lang.Object r0 = r4.f11695b0     // Catch: java.lang.Throwable -> L12
            h7.p1 r0 = (p124h7.C2793p1) r0     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L80
            h7.t1 r0 = new h7.t1     // Catch: java.lang.Throwable -> L12
            h7.p6 r1 = p124h7.C2852s6.m7129u()     // Catch: java.lang.Throwable -> L12
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L12
            java.lang.Object r1 = r4.f11695b0     // Catch: java.lang.Throwable -> L12
            h7.p1 r1 = (p124h7.C2793p1) r1     // Catch: java.lang.Throwable -> L12
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L12
            h7.m6 r1 = r1.f11821a     // Catch: java.lang.Throwable -> L7d
            r0.m7147a(r1)     // Catch: java.lang.Throwable -> L7d
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            f.t r1 = r0.m7148b()     // Catch: java.lang.Throwable -> L12
            java.util.Deque<java.lang.ref.WeakReference<org.xmlpull.v1.XmlPullParser>> r1 = r1.f8425Z     // Catch: java.lang.Throwable -> L12
            h7.s6 r1 = (p124h7.C2852s6) r1     // Catch: java.lang.Throwable -> L12
            h7.w6 r1 = p124h7.C2668i2.m6825a(r1)     // Catch: java.lang.Throwable -> L12
            h7.v6 r1 = r1.m7237s()     // Catch: java.lang.Throwable -> L12
            int r1 = r1.m7218r()     // Catch: java.lang.Throwable -> L12
            r0.m7149c(r1)     // Catch: java.lang.Throwable -> L12
            java.lang.Object r1 = r4.f11694a0     // Catch: java.lang.Throwable -> L12
            h7.k1 r1 = (p124h7.InterfaceC2703k1) r1     // Catch: java.lang.Throwable -> L12
            if (r1 == 0) goto L65
            f.t r1 = r0.m7148b()     // Catch: java.lang.Throwable -> L12
            java.lang.Object r2 = r4.f11692Y     // Catch: java.lang.Throwable -> L12
            h7.u1 r2 = (p124h7.InterfaceC2883u1) r2     // Catch: java.lang.Throwable -> L12
            java.lang.Object r3 = r4.f11694a0     // Catch: java.lang.Throwable -> L12
            h7.k1 r3 = (p124h7.InterfaceC2703k1) r3     // Catch: java.lang.Throwable -> L12
            r1.m4784I(r2, r3)     // Catch: java.lang.Throwable -> L12
            goto L74
        L65:
            f.t r1 = r0.m7148b()     // Catch: java.lang.Throwable -> L12
            java.lang.Object r2 = r4.f11692Y     // Catch: java.lang.Throwable -> L12
            h7.u1 r2 = (p124h7.InterfaceC2883u1) r2     // Catch: java.lang.Throwable -> L12
            java.util.Deque<java.lang.ref.WeakReference<org.xmlpull.v1.XmlPullParser>> r1 = r1.f8425Z     // Catch: java.lang.Throwable -> L12
            h7.s6 r1 = (p124h7.C2852s6) r1     // Catch: java.lang.Throwable -> L12
            r2.mo4786l(r1)     // Catch: java.lang.Throwable -> L12
        L74:
            r4.f11696c0 = r0     // Catch: java.lang.Throwable -> L12
            h7.l3 r0 = new h7.l3     // Catch: java.lang.Throwable -> L12
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L12
            monitor-exit(r4)
            return r0
        L7d:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            throw r1     // Catch: java.lang.Throwable -> L12
        L80:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException     // Catch: java.lang.Throwable -> L12
            java.lang.String r1 = "cannot read or generate keyset"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L12
            throw r0     // Catch: java.lang.Throwable -> L12
        L88:
            monitor-exit(r4)
            throw r0
    }

    /* renamed from: g */
    public p124h7.InterfaceC2703k1 m6941g() {
            r11 = this;
            java.lang.String r0 = "l3"
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 0
            r3 = 23
            if (r1 < r3) goto La5
            h7.o3 r1 = new h7.o3
            r1.<init>()
            java.lang.Object r3 = r11.f11693Z
            java.lang.String r3 = (java.lang.String) r3
            boolean r3 = r1.m7017a(r3)
            r4 = 0
            r5 = 1
            java.lang.String r6 = "cannot use Android Keystore, it'll be disabled"
            if (r3 != 0) goto L7d
            java.lang.Object r7 = r11.f11693Z     // Catch: java.security.ProviderException -> L74 java.security.GeneralSecurityException -> L76
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.security.ProviderException -> L74 java.security.GeneralSecurityException -> L76
            h7.o3 r8 = new h7.o3     // Catch: java.security.ProviderException -> L74 java.security.GeneralSecurityException -> L76
            r8.<init>()     // Catch: java.security.ProviderException -> L74 java.security.GeneralSecurityException -> L76
            boolean r8 = r8.m7017a(r7)     // Catch: java.security.ProviderException -> L74 java.security.GeneralSecurityException -> L76
            if (r8 != 0) goto L64
            java.lang.String r8 = "android-keystore://"
            java.lang.String r7 = p124h7.C2584d8.m6592a(r8, r7)     // Catch: java.security.ProviderException -> L74 java.security.GeneralSecurityException -> L76
            java.lang.String r8 = "AES"
            java.lang.String r9 = "AndroidKeyStore"
            javax.crypto.KeyGenerator r8 = javax.crypto.KeyGenerator.getInstance(r8, r9)     // Catch: java.security.ProviderException -> L74 java.security.GeneralSecurityException -> L76
            android.security.keystore.KeyGenParameterSpec$Builder r9 = new android.security.keystore.KeyGenParameterSpec$Builder     // Catch: java.security.ProviderException -> L74 java.security.GeneralSecurityException -> L76
            r10 = 3
            r9.<init>(r7, r10)     // Catch: java.security.ProviderException -> L74 java.security.GeneralSecurityException -> L76
            r7 = 256(0x100, float:3.59E-43)
            android.security.keystore.KeyGenParameterSpec$Builder r7 = r9.setKeySize(r7)     // Catch: java.security.ProviderException -> L74 java.security.GeneralSecurityException -> L76
            java.lang.String r9 = "GCM"
            java.lang.String[] r9 = new java.lang.String[]{r9}     // Catch: java.security.ProviderException -> L74 java.security.GeneralSecurityException -> L76
            android.security.keystore.KeyGenParameterSpec$Builder r7 = r7.setBlockModes(r9)     // Catch: java.security.ProviderException -> L74 java.security.GeneralSecurityException -> L76
            java.lang.String r9 = "NoPadding"
            java.lang.String[] r9 = new java.lang.String[]{r9}     // Catch: java.security.ProviderException -> L74 java.security.GeneralSecurityException -> L76
            android.security.keystore.KeyGenParameterSpec$Builder r7 = r7.setEncryptionPaddings(r9)     // Catch: java.security.ProviderException -> L74 java.security.GeneralSecurityException -> L76
            android.security.keystore.KeyGenParameterSpec r7 = r7.build()     // Catch: java.security.ProviderException -> L74 java.security.GeneralSecurityException -> L76
            r8.init(r7)     // Catch: java.security.ProviderException -> L74 java.security.GeneralSecurityException -> L76
            r8.generateKey()     // Catch: java.security.ProviderException -> L74 java.security.GeneralSecurityException -> L76
            goto L7d
        L64:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch: java.security.ProviderException -> L74 java.security.GeneralSecurityException -> L76
            java.lang.Object[] r3 = new java.lang.Object[r5]     // Catch: java.security.ProviderException -> L74 java.security.GeneralSecurityException -> L76
            r3[r4] = r7     // Catch: java.security.ProviderException -> L74 java.security.GeneralSecurityException -> L76
            java.lang.String r4 = "cannot generate a new key %s because it already exists; please delete it with deleteKey() and try again"
            java.lang.String r3 = java.lang.String.format(r4, r3)     // Catch: java.security.ProviderException -> L74 java.security.GeneralSecurityException -> L76
            r1.<init>(r3)     // Catch: java.security.ProviderException -> L74 java.security.GeneralSecurityException -> L76
            throw r1     // Catch: java.security.ProviderException -> L74 java.security.GeneralSecurityException -> L76
        L74:
            r1 = move-exception
            goto L77
        L76:
            r1 = move-exception
        L77:
            int r3 = p124h7.C2723l3.f11729c
            android.util.Log.w(r0, r6, r1)
            return r2
        L7d:
            java.lang.Object r7 = r11.f11693Z     // Catch: java.security.ProviderException -> L86 java.security.GeneralSecurityException -> L88
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.security.ProviderException -> L86 java.security.GeneralSecurityException -> L88
            h7.k1 r0 = r1.mo7018e(r7)     // Catch: java.security.ProviderException -> L86 java.security.GeneralSecurityException -> L88
            return r0
        L86:
            r1 = move-exception
            goto L89
        L88:
            r1 = move-exception
        L89:
            if (r3 != 0) goto L91
            int r3 = p124h7.C2723l3.f11729c
            android.util.Log.w(r0, r6, r1)
            return r2
        L91:
            java.security.KeyStoreException r0 = new java.security.KeyStoreException
            java.lang.Object[] r2 = new java.lang.Object[r5]
            java.lang.Object r3 = r11.f11693Z
            java.lang.String r3 = (java.lang.String) r3
            r2[r4] = r3
            java.lang.String r3 = "the master key %s exists but is unusable"
            java.lang.String r2 = java.lang.String.format(r3, r2)
            r0.<init>(r2, r1)
            throw r0
        La5:
            int r1 = p124h7.C2723l3.f11729c
            java.lang.String r1 = "Android Keystore requires at least Android M"
            android.util.Log.w(r0, r1)
            return r2
    }

    /* renamed from: h */
    public p124h7.C2865t1 m6942h() {
            r3 = this;
            java.lang.Object r0 = r3.f11694a0
            h7.k1 r0 = (p124h7.InterfaceC2703k1) r0
            if (r0 == 0) goto L1f
            java.lang.Object r1 = r3.f11697d0     // Catch: java.security.GeneralSecurityException -> L13 p124h7.C2611f -> L15
            h7.hd r1 = (p124h7.C2661hd) r1     // Catch: java.security.GeneralSecurityException -> L13 p124h7.C2611f -> L15
            f.t r0 = p083f.C1933t.m4780K(r1, r0)     // Catch: java.security.GeneralSecurityException -> L13 p124h7.C2611f -> L15
            h7.t1 r0 = p124h7.C2865t1.m7145d(r0)     // Catch: java.security.GeneralSecurityException -> L13 p124h7.C2611f -> L15
            return r0
        L13:
            r0 = move-exception
            goto L16
        L15:
            r0 = move-exception
        L16:
            int r1 = p124h7.C2723l3.f11729c
            java.lang.String r1 = "l3"
            java.lang.String r2 = "cannot decrypt keyset: "
            android.util.Log.w(r1, r2, r0)
        L1f:
            java.lang.Object r0 = r3.f11697d0
            h7.hd r0 = (p124h7.C2661hd) r0
            byte[] r0 = r0.m6808h()
            h7.mg r1 = p124h7.C2754mg.m6988a()
            h7.s6 r0 = p124h7.C2852s6.m7131x(r0, r1)
            f.t r0 = p083f.C1933t.m4775A(r0)
            h7.t1 r0 = p124h7.C2865t1.m7145d(r0)
            return r0
    }
}
