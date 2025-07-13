package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.f */
/* loaded from: classes.dex */
public final class C1115f extends p249o7.AbstractC5050m4 {

    /* renamed from: g */
    public static final java.lang.String[] f5737g = null;

    /* renamed from: h */
    public static final java.lang.String[] f5738h = null;

    /* renamed from: c */
    public java.security.SecureRandom f5739c;

    /* renamed from: d */
    public final java.util.concurrent.atomic.AtomicLong f5740d;

    /* renamed from: e */
    public int f5741e;

    /* renamed from: f */
    public java.lang.Integer f5742f;

    static {
            java.lang.String r0 = "firebase_"
            java.lang.String r1 = "google_"
            java.lang.String r2 = "ga_"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2}
            com.google.android.gms.measurement.internal.C1115f.f5737g = r0
            java.lang.String r0 = "_err"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            com.google.android.gms.measurement.internal.C1115f.f5738h = r0
            java.lang.String r0 = "^([^\\s@]+)@([^\\s@]+\\.[^\\s@]+)$"
            java.util.regex.Pattern.compile(r0)
            java.lang.String r0 = "^(gmail|googlemail)\\."
            java.util.regex.Pattern.compile(r0)
            java.lang.String r0 = "[\\s-()/.]+"
            java.util.regex.Pattern.compile(r0)
            java.lang.String r0 = "^\\+\\d{11,15}$"
            java.util.regex.Pattern.compile(r0)
            java.lang.String r0 = "[0-9`~!@#$%^&*()_\\-+=:;<>,.?|/\\\\\\[\\]]+"
            java.util.regex.Pattern.compile(r0)
            java.lang.String r0 = "\\s+"
            java.util.regex.Pattern.compile(r0)
            return
    }

    public C1115f(com.google.android.gms.measurement.internal.C1113d r3) {
            r2 = this;
            r2.<init>(r3)
            r3 = 0
            r2.f5742f = r3
            java.util.concurrent.atomic.AtomicLong r3 = new java.util.concurrent.atomic.AtomicLong
            r0 = 0
            r3.<init>(r0)
            r2.f5740d = r3
            return
    }

    /* renamed from: V */
    public static boolean m3184V(java.lang.String r1) {
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L10
            java.lang.String r0 = "_"
            boolean r1 = r1.startsWith(r0)
            if (r1 == 0) goto L10
            r1 = 1
            return r1
        L10:
            r1 = 0
            return r1
    }

    /* renamed from: W */
    public static boolean m3185W(java.lang.String r3) {
            com.google.android.gms.common.internal.C1101a.m3100e(r3)
            r0 = 0
            char r1 = r3.charAt(r0)
            r2 = 95
            if (r1 != r2) goto L16
            java.lang.String r1 = "_ep"
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L15
            goto L16
        L15:
            return r0
        L16:
            r3 = 1
            return r3
    }

    /* renamed from: X */
    public static boolean m3186X(android.content.Context r4) {
            java.lang.String r0 = "null reference"
            java.util.Objects.requireNonNull(r4, r0)
            r0 = 0
            android.content.pm.PackageManager r1 = r4.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L20
            if (r1 != 0) goto Ld
            return r0
        Ld:
            android.content.ComponentName r2 = new android.content.ComponentName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L20
            java.lang.String r3 = "com.google.android.gms.measurement.AppMeasurementReceiver"
            r2.<init>(r4, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L20
            android.content.pm.ActivityInfo r4 = r1.getReceiverInfo(r2, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L20
            if (r4 == 0) goto L20
            boolean r4 = r4.enabled     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L20
            if (r4 == 0) goto L20
            r4 = 1
            return r4
        L20:
            return r0
    }

    /* renamed from: Y */
    public static boolean m3187Y(android.content.Context r2) {
            java.lang.String r0 = "null reference"
            java.util.Objects.requireNonNull(r2, r0)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r0 < r1) goto L12
            java.lang.String r0 = "com.google.android.gms.measurement.AppMeasurementJobService"
        Ld:
            boolean r2 = m3191g0(r2, r0)
            return r2
        L12:
            java.lang.String r0 = "com.google.android.gms.measurement.AppMeasurementService"
            goto Ld
    }

    /* renamed from: Z */
    public static boolean m3188Z(java.lang.String r0, java.lang.String r1) {
            if (r0 != 0) goto L7
            if (r1 == 0) goto L5
            goto L7
        L5:
            r0 = 1
            return r0
        L7:
            if (r0 != 0) goto Lb
            r0 = 0
            return r0
        Lb:
            boolean r0 = r0.equals(r1)
            return r0
    }

    /* renamed from: c0 */
    public static final boolean m3189c0(android.os.Bundle r6, int r7) {
            java.lang.String r0 = "_err"
            long r1 = r6.getLong(r0)
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L12
            long r1 = (long) r7
            r6.putLong(r0, r1)
            r6 = 1
            return r6
        L12:
            r6 = 0
            return r6
    }

    /* renamed from: f0 */
    public static boolean m3190f0(java.lang.String r4, java.lang.String[] r5) {
            int r0 = r5.length
            r1 = 0
            r2 = 0
        L3:
            if (r2 >= r0) goto L12
            r3 = r5[r2]
            boolean r3 = m3188Z(r4, r3)
            if (r3 == 0) goto Lf
            r4 = 1
            return r4
        Lf:
            int r2 = r2 + 1
            goto L3
        L12:
            return r1
    }

    /* renamed from: g0 */
    public static boolean m3191g0(android.content.Context r3, java.lang.String r4) {
            r0 = 0
            android.content.pm.PackageManager r1 = r3.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L19
            if (r1 != 0) goto L8
            return r0
        L8:
            android.content.ComponentName r2 = new android.content.ComponentName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L19
            r2.<init>(r3, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L19
            android.content.pm.ServiceInfo r3 = r1.getServiceInfo(r2, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L19
            if (r3 == 0) goto L19
            boolean r3 = r3.enabled     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L19
            if (r3 == 0) goto L19
            r3 = 1
            return r3
        L19:
            return r0
    }

    /* renamed from: n0 */
    public static long m3192n0(byte[] r8) {
            java.lang.String r0 = "null reference"
            java.util.Objects.requireNonNull(r8, r0)
            int r0 = r8.length
            r1 = 0
            if (r0 <= 0) goto Lb
            r2 = 1
            goto Lc
        Lb:
            r2 = 0
        Lc:
            com.google.android.gms.common.internal.C1101a.m3105j(r2)
            int r0 = r0 + (-1)
            r2 = 0
        L13:
            if (r0 < 0) goto L27
            int r4 = r8.length
            int r4 = r4 + (-8)
            if (r0 < r4) goto L27
            r4 = r8[r0]
            long r4 = (long) r4
            r6 = 255(0xff, double:1.26E-321)
            long r4 = r4 & r6
            long r4 = r4 << r1
            long r2 = r2 + r4
            int r1 = r1 + 8
            int r0 = r0 + (-1)
            goto L13
        L27:
            return r2
    }

    /* renamed from: s */
    public static java.security.MessageDigest m3193s(java.lang.String r2) {
            java.lang.String r2 = "MD5"
            r0 = 0
        L3:
            r1 = 2
            if (r0 >= r1) goto L11
            java.security.MessageDigest r1 = java.security.MessageDigest.getInstance(r2)     // Catch: java.security.NoSuchAlgorithmException -> Le
            if (r1 != 0) goto Ld
            goto Le
        Ld:
            return r1
        Le:
            int r0 = r0 + 1
            goto L3
        L11:
            r2 = 0
            return r2
    }

    /* renamed from: u */
    public static java.util.ArrayList<android.os.Bundle> m3194u(java.util.List<p249o7.C4957b> r6) {
            if (r6 != 0) goto L9
            java.util.ArrayList r6 = new java.util.ArrayList
            r0 = 0
            r6.<init>(r0)
            return r6
        L9:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r6.size()
            r0.<init>(r1)
            java.util.Iterator r6 = r6.iterator()
        L16:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto Lc8
            java.lang.Object r1 = r6.next()
            o7.b r1 = (p249o7.C4957b) r1
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            java.lang.String r3 = r1.f19587Y
            java.lang.String r4 = "app_id"
            r2.putString(r4, r3)
            java.lang.String r3 = r1.f19588Z
            java.lang.String r4 = "origin"
            r2.putString(r4, r3)
            long r3 = r1.f19590b0
            java.lang.String r5 = "creation_timestamp"
            r2.putLong(r5, r3)
            o7.p6 r3 = r1.f19589a0
            java.lang.String r3 = r3.f19945Z
            java.lang.String r4 = "name"
            r2.putString(r4, r3)
            o7.p6 r3 = r1.f19589a0
            java.lang.Object r3 = r3.m11412X()
            p124h7.C2939x3.m7298x(r2, r3)
            boolean r3 = r1.f19591c0
            java.lang.String r4 = "active"
            r2.putBoolean(r4, r3)
            java.lang.String r3 = r1.f19592d0
            if (r3 == 0) goto L5e
            java.lang.String r4 = "trigger_event_name"
            r2.putString(r4, r3)
        L5e:
            o7.q r3 = r1.f19593e0
            if (r3 == 0) goto L78
            java.lang.String r3 = r3.f19951Y
            java.lang.String r4 = "timed_out_event_name"
            r2.putString(r4, r3)
            o7.q r3 = r1.f19593e0
            o7.o r3 = r3.f19952Z
            if (r3 == 0) goto L78
            android.os.Bundle r3 = r3.m11371X()
            java.lang.String r4 = "timed_out_event_params"
            r2.putBundle(r4, r3)
        L78:
            long r3 = r1.f19594f0
            java.lang.String r5 = "trigger_timeout"
            r2.putLong(r5, r3)
            o7.q r3 = r1.f19595g0
            if (r3 == 0) goto L99
            java.lang.String r3 = r3.f19951Y
            java.lang.String r4 = "triggered_event_name"
            r2.putString(r4, r3)
            o7.q r3 = r1.f19595g0
            o7.o r3 = r3.f19952Z
            if (r3 == 0) goto L99
            android.os.Bundle r3 = r3.m11371X()
            java.lang.String r4 = "triggered_event_params"
            r2.putBundle(r4, r3)
        L99:
            o7.p6 r3 = r1.f19589a0
            long r3 = r3.f19946a0
            java.lang.String r5 = "triggered_timestamp"
            r2.putLong(r5, r3)
            long r3 = r1.f19596h0
            java.lang.String r5 = "time_to_live"
            r2.putLong(r5, r3)
            o7.q r3 = r1.f19597i0
            if (r3 == 0) goto Lc3
            java.lang.String r3 = r3.f19951Y
            java.lang.String r4 = "expired_event_name"
            r2.putString(r4, r3)
            o7.q r1 = r1.f19597i0
            o7.o r1 = r1.f19952Z
            if (r1 == 0) goto Lc3
            android.os.Bundle r1 = r1.m11371X()
            java.lang.String r3 = "expired_event_params"
            r2.putBundle(r3, r1)
        Lc3:
            r0.add(r2)
            goto L16
        Lc8:
            return r0
    }

    /* renamed from: x */
    public static void m3195x(p249o7.C5027j5 r4, android.os.Bundle r5, boolean r6) {
            java.lang.String r0 = "_si"
            java.lang.String r1 = "_sn"
            java.lang.String r2 = "_sc"
            if (r5 == 0) goto L31
            if (r4 == 0) goto L31
            boolean r3 = r5.containsKey(r2)
            if (r3 == 0) goto L15
            if (r6 == 0) goto L13
            goto L15
        L13:
            r6 = 0
            goto L31
        L15:
            java.lang.String r6 = r4.f19787a
            if (r6 == 0) goto L1d
            r5.putString(r1, r6)
            goto L20
        L1d:
            r5.remove(r1)
        L20:
            java.lang.String r6 = r4.f19788b
            if (r6 == 0) goto L28
            r5.putString(r2, r6)
            goto L2b
        L28:
            r5.remove(r2)
        L2b:
            long r1 = r4.f19789c
            r5.putLong(r0, r1)
            return
        L31:
            if (r5 == 0) goto L40
            if (r4 != 0) goto L40
            if (r6 == 0) goto L40
            r5.remove(r1)
            r5.remove(r2)
            r5.remove(r0)
        L40:
            return
    }

    /* renamed from: A */
    public final void m3196A(p249o7.InterfaceC5100s6 r3, java.lang.String r4, int r5, java.lang.String r6, java.lang.String r7, int r8) {
            r2 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            m3189c0(r0, r5)
            boolean r1 = android.text.TextUtils.isEmpty(r6)
            if (r1 != 0) goto L17
            boolean r1 = android.text.TextUtils.isEmpty(r7)
            if (r1 != 0) goto L17
            r0.putString(r6, r7)
        L17:
            r6 = 6
            if (r5 == r6) goto L20
            r6 = 7
            if (r5 == r6) goto L20
            r6 = 2
            if (r5 != r6) goto L26
        L20:
            long r5 = (long) r8
            java.lang.String r7 = "_el"
            r0.putLong(r7, r5)
        L26:
            java.lang.String r5 = "_err"
            r3.mo11289a(r4, r5, r0)
            return
    }

    /* renamed from: B */
    public final void m3197B(android.os.Bundle r3, java.lang.String r4, java.lang.Object r5) {
            r2 = this;
            if (r3 != 0) goto L3
            return
        L3:
            boolean r0 = r5 instanceof java.lang.Long
            if (r0 == 0) goto L11
            java.lang.Long r5 = (java.lang.Long) r5
            long r0 = r5.longValue()
            r3.putLong(r4, r0)
            return
        L11:
            boolean r0 = r5 instanceof java.lang.String
            if (r0 == 0) goto L1d
            java.lang.String r5 = java.lang.String.valueOf(r5)
            r3.putString(r4, r5)
            return
        L1d:
            boolean r0 = r5 instanceof java.lang.Double
            if (r0 == 0) goto L2b
            java.lang.Double r5 = (java.lang.Double) r5
            double r0 = r5.doubleValue()
            r3.putDouble(r4, r0)
            return
        L2b:
            boolean r0 = r5 instanceof android.os.Bundle[]
            if (r0 == 0) goto L35
            android.os.Bundle[] r5 = (android.os.Bundle[]) r5
            r3.putParcelableArray(r4, r5)
            return
        L35:
            if (r4 == 0) goto L58
            if (r5 == 0) goto L42
            java.lang.Class r3 = r5.getClass()
            java.lang.String r3 = r3.getSimpleName()
            goto L43
        L42:
            r3 = 0
        L43:
            com.google.android.gms.measurement.internal.d r5 = r2.f5736a
            com.google.android.gms.measurement.internal.b r5 = r5.mo3162d()
            o7.f3 r5 = r5.f5677k
            com.google.android.gms.measurement.internal.d r0 = r2.f5736a
            o7.c3 r0 = r0.f5722m
            java.lang.String r4 = r0.m11117e(r4)
            java.lang.String r0 = "Not putting event parameter. Invalid value type. name, type"
            r5.m11171e(r0, r4, r3)
        L58:
            return
    }

    /* renamed from: C */
    public final void m3198C(p185k7.InterfaceC3956r0 r3, boolean r4) {
            r2 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = "r"
            r0.putBoolean(r1, r4)
            r3.mo8749D(r0)     // Catch: android.os.RemoteException -> Le
            return
        Le:
            r3 = move-exception
            com.google.android.gms.measurement.internal.d r4 = r2.f5736a
            com.google.android.gms.measurement.internal.b r4 = r4.mo3162d()
            o7.f3 r4 = r4.f5675i
            java.lang.String r0 = "Error returning boolean value to wrapper"
            r4.m11170d(r0, r3)
            return
    }

    /* renamed from: D */
    public final void m3199D(p185k7.InterfaceC3956r0 r3, java.util.ArrayList<android.os.Bundle> r4) {
            r2 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = "r"
            r0.putParcelableArrayList(r1, r4)
            r3.mo8749D(r0)     // Catch: android.os.RemoteException -> Le
            return
        Le:
            r3 = move-exception
            com.google.android.gms.measurement.internal.d r4 = r2.f5736a
            com.google.android.gms.measurement.internal.b r4 = r4.mo3162d()
            o7.f3 r4 = r4.f5675i
            java.lang.String r0 = "Error returning bundle list to wrapper"
            r4.m11170d(r0, r3)
            return
    }

    /* renamed from: E */
    public final void m3200E(p185k7.InterfaceC3956r0 r2, android.os.Bundle r3) {
            r1 = this;
            r2.mo8749D(r3)     // Catch: android.os.RemoteException -> L4
            return
        L4:
            r2 = move-exception
            com.google.android.gms.measurement.internal.d r3 = r1.f5736a
            com.google.android.gms.measurement.internal.b r3 = r3.mo3162d()
            o7.f3 r3 = r3.f5675i
            java.lang.String r0 = "Error returning bundle value to wrapper"
            r3.m11170d(r0, r2)
            return
    }

    /* renamed from: F */
    public final void m3201F(p185k7.InterfaceC3956r0 r3, byte[] r4) {
            r2 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = "r"
            r0.putByteArray(r1, r4)
            r3.mo8749D(r0)     // Catch: android.os.RemoteException -> Le
            return
        Le:
            r3 = move-exception
            com.google.android.gms.measurement.internal.d r4 = r2.f5736a
            com.google.android.gms.measurement.internal.b r4 = r4.mo3162d()
            o7.f3 r4 = r4.f5675i
            java.lang.String r0 = "Error returning byte array to wrapper"
            r4.m11170d(r0, r3)
            return
    }

    /* renamed from: G */
    public final void m3202G(p185k7.InterfaceC3956r0 r3, int r4) {
            r2 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = "r"
            r0.putInt(r1, r4)
            r3.mo8749D(r0)     // Catch: android.os.RemoteException -> Le
            return
        Le:
            r3 = move-exception
            com.google.android.gms.measurement.internal.d r4 = r2.f5736a
            com.google.android.gms.measurement.internal.b r4 = r4.mo3162d()
            o7.f3 r4 = r4.f5675i
            java.lang.String r0 = "Error returning int value to wrapper"
            r4.m11170d(r0, r3)
            return
    }

    /* renamed from: H */
    public final void m3203H(p185k7.InterfaceC3956r0 r3, long r4) {
            r2 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = "r"
            r0.putLong(r1, r4)
            r3.mo8749D(r0)     // Catch: android.os.RemoteException -> Le
            return
        Le:
            r3 = move-exception
            com.google.android.gms.measurement.internal.d r4 = r2.f5736a
            com.google.android.gms.measurement.internal.b r4 = r4.mo3162d()
            o7.f3 r4 = r4.f5675i
            java.lang.String r5 = "Error returning long value to wrapper"
            r4.m11170d(r5, r3)
            return
    }

    /* renamed from: I */
    public final void m3204I(p185k7.InterfaceC3956r0 r3, java.lang.String r4) {
            r2 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = "r"
            r0.putString(r1, r4)
            r3.mo8749D(r0)     // Catch: android.os.RemoteException -> Le
            return
        Le:
            r3 = move-exception
            com.google.android.gms.measurement.internal.d r4 = r2.f5736a
            com.google.android.gms.measurement.internal.b r4 = r4.mo3162d()
            o7.f3 r4 = r4.f5675i
            java.lang.String r0 = "Error returning string value to wrapper"
            r4.m11170d(r0, r3)
            return
    }

    /* renamed from: J */
    public final void m3205J(java.lang.String r18, java.lang.String r19, java.lang.String r20, android.os.Bundle r21, java.util.List<java.lang.String> r22, boolean r23) {
            r17 = this;
            r9 = r17
            r10 = r19
            r11 = r21
            r12 = r22
            if (r11 != 0) goto Lb
            return
        Lb:
            com.google.android.gms.measurement.internal.d r0 = r9.f5736a
            java.util.Objects.requireNonNull(r0)
            java.util.TreeSet r0 = new java.util.TreeSet
            java.util.Set r1 = r21.keySet()
            r0.<init>(r1)
            java.util.Iterator r13 = r0.iterator()
            r15 = 0
        L1e:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto Ld7
            java.lang.Object r0 = r13.next()
            r8 = r0
            java.lang.String r8 = (java.lang.String) r8
            if (r12 == 0) goto L36
            boolean r0 = r12.contains(r8)
            if (r0 != 0) goto L34
            goto L36
        L34:
            r0 = 0
            goto L44
        L36:
            if (r23 != 0) goto L3d
            int r0 = r9.m3224k0(r8)
            goto L3e
        L3d:
            r0 = 0
        L3e:
            if (r0 != 0) goto L44
            int r0 = r9.m3223j0(r8)
        L44:
            if (r0 == 0) goto L53
            r1 = 3
            if (r0 != r1) goto L4b
            r1 = r8
            goto L4c
        L4b:
            r1 = 0
        L4c:
            r9.m3238w(r11, r0, r8, r1)
            r11.remove(r8)
            goto L1e
        L53:
            java.lang.Object r0 = r11.get(r8)
            boolean r0 = r9.m3215T(r0)
            if (r0 == 0) goto L70
            com.google.android.gms.measurement.internal.d r0 = r9.f5736a
            com.google.android.gms.measurement.internal.b r0 = r0.mo3162d()
            o7.f3 r0 = r0.f5677k
            java.lang.String r1 = "Nested Bundle parameters are not allowed; discarded. event name, param name, child param name"
            r7 = r20
            r0.m11172f(r1, r10, r7, r8)
            r0 = 22
            r14 = r8
            goto L8c
        L70:
            r7 = r20
            java.lang.Object r4 = r11.get(r8)
            r16 = 0
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r8
            r5 = r21
            r6 = r22
            r7 = r23
            r14 = r8
            r8 = r16
            int r0 = r0.m3210O(r1, r2, r3, r4, r5, r6, r7, r8)
        L8c:
            if (r0 == 0) goto L9e
            java.lang.String r1 = "_ev"
            boolean r1 = r1.equals(r14)
            if (r1 != 0) goto L9e
            java.lang.Object r1 = r11.get(r14)
            r9.m3238w(r11, r0, r14, r1)
            goto Ld2
        L9e:
            boolean r0 = m3185W(r14)
            if (r0 == 0) goto L1e
            java.lang.String[] r0 = p249o7.C5074p4.f19940d
            boolean r0 = m3190f0(r14, r0)
            if (r0 != 0) goto L1e
            int r15 = r15 + 1
            if (r15 <= 0) goto L1e
            com.google.android.gms.measurement.internal.d r0 = r9.f5736a
            com.google.android.gms.measurement.internal.b r0 = r0.mo3162d()
            o7.f3 r0 = r0.f5674h
            com.google.android.gms.measurement.internal.d r1 = r9.f5736a
            o7.c3 r1 = r1.f5722m
            java.lang.String r1 = r1.m11116d(r10)
            com.google.android.gms.measurement.internal.d r2 = r9.f5736a
            o7.c3 r2 = r2.f5722m
            java.lang.String r2 = r2.m11114b(r11)
            java.lang.String r3 = "Item cannot contain custom parameters"
            r0.m11171e(r3, r1, r2)
            r0 = 23
            m3189c0(r11, r0)
        Ld2:
            r11.remove(r14)
            goto L1e
        Ld7:
            return
    }

    /* renamed from: K */
    public final boolean m3206K(java.lang.String r6, java.lang.String r7, java.lang.String r8) {
            r5 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            java.lang.String r1 = "^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$"
            java.lang.String r2 = "null reference"
            r3 = 0
            if (r0 != 0) goto L2e
            java.util.Objects.requireNonNull(r6, r2)
            boolean r7 = r6.matches(r1)
            if (r7 != 0) goto L65
            com.google.android.gms.measurement.internal.d r7 = r5.f5736a
            boolean r7 = r7.m3166h()
            if (r7 == 0) goto L2d
            com.google.android.gms.measurement.internal.d r7 = r5.f5736a
            com.google.android.gms.measurement.internal.b r7 = r7.mo3162d()
            o7.f3 r7 = r7.f5674h
            java.lang.Object r6 = com.google.android.gms.measurement.internal.C1111b.m3134u(r6)
            java.lang.String r8 = "Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id"
            r7.m11170d(r8, r6)
        L2d:
            return r3
        L2e:
            p185k7.C3847ia.m8706c()
            com.google.android.gms.measurement.internal.d r6 = r5.f5736a
            o7.f r6 = r6.f5716g
            r0 = 0
            o7.u2<java.lang.Boolean> r4 = p249o7.C5120v2.f20089d0
            boolean r6 = r6.m11162v(r0, r4)
            if (r6 == 0) goto L44
            boolean r6 = android.text.TextUtils.isEmpty(r8)
            if (r6 == 0) goto L65
        L44:
            boolean r6 = android.text.TextUtils.isEmpty(r7)
            if (r6 != 0) goto L67
            java.util.Objects.requireNonNull(r7, r2)
            boolean r6 = r7.matches(r1)
            if (r6 != 0) goto L65
            com.google.android.gms.measurement.internal.d r6 = r5.f5736a
            com.google.android.gms.measurement.internal.b r6 = r6.mo3162d()
            o7.f3 r6 = r6.f5674h
            java.lang.Object r7 = com.google.android.gms.measurement.internal.C1111b.m3134u(r7)
            java.lang.String r8 = "Invalid admob_app_id. Analytics disabled."
            r6.m11170d(r8, r7)
            return r3
        L65:
            r6 = 1
            return r6
        L67:
            com.google.android.gms.measurement.internal.d r6 = r5.f5736a
            boolean r6 = r6.m3166h()
            if (r6 == 0) goto L7c
            com.google.android.gms.measurement.internal.d r6 = r5.f5736a
            com.google.android.gms.measurement.internal.b r6 = r6.mo3162d()
            o7.f3 r6 = r6.f5674h
            java.lang.String r7 = "Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI"
            r6.m11169c(r7)
        L7c:
            return r3
    }

    /* renamed from: L */
    public final boolean m3207L(java.lang.String r4, int r5, java.lang.String r6) {
            r3 = this;
            r0 = 0
            if (r6 != 0) goto L11
            com.google.android.gms.measurement.internal.d r5 = r3.f5736a
            com.google.android.gms.measurement.internal.b r5 = r5.mo3162d()
            o7.f3 r5 = r5.f5674h
            java.lang.String r6 = "Name is required and can't be null. Type"
            r5.m11170d(r6, r4)
            return r0
        L11:
            int r1 = r6.length()
            int r1 = r6.codePointCount(r0, r1)
            if (r1 <= r5) goto L2d
            com.google.android.gms.measurement.internal.d r1 = r3.f5736a
            com.google.android.gms.measurement.internal.b r1 = r1.mo3162d()
            o7.f3 r1 = r1.f5674h
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.String r2 = "Name is too long. Type, maximum supported length, name"
            r1.m11172f(r2, r4, r5, r6)
            return r0
        L2d:
            r4 = 1
            return r4
    }

    /* renamed from: M */
    public final boolean m3208M(java.lang.String r5, java.lang.String[] r6, java.lang.String[] r7, java.lang.String r8) {
            r4 = this;
            r0 = 0
            if (r8 != 0) goto L11
            com.google.android.gms.measurement.internal.d r6 = r4.f5736a
            com.google.android.gms.measurement.internal.b r6 = r6.mo3162d()
            o7.f3 r6 = r6.f5674h
            java.lang.String r7 = "Name is required and can't be null. Type"
            r6.m11170d(r7, r5)
            return r0
        L11:
            java.lang.String[] r1 = com.google.android.gms.measurement.internal.C1115f.f5737g
            r2 = 0
        L14:
            r3 = 3
            if (r2 >= r3) goto L30
            r3 = r1[r2]
            boolean r3 = r8.startsWith(r3)
            if (r3 == 0) goto L2d
            com.google.android.gms.measurement.internal.d r6 = r4.f5736a
            com.google.android.gms.measurement.internal.b r6 = r6.mo3162d()
            o7.f3 r6 = r6.f5674h
            java.lang.String r7 = "Name starts with reserved prefix. Type, name"
            r6.m11171e(r7, r5, r8)
            return r0
        L2d:
            int r2 = r2 + 1
            goto L14
        L30:
            if (r6 == 0) goto L4e
            boolean r6 = m3190f0(r8, r6)
            if (r6 == 0) goto L4e
            if (r7 == 0) goto L40
            boolean r6 = m3190f0(r8, r7)
            if (r6 != 0) goto L4e
        L40:
            com.google.android.gms.measurement.internal.d r6 = r4.f5736a
            com.google.android.gms.measurement.internal.b r6 = r6.mo3162d()
            o7.f3 r6 = r6.f5674h
            java.lang.String r7 = "Name is reserved. Type, name"
            r6.m11171e(r7, r5, r8)
            return r0
        L4e:
            r5 = 1
            return r5
    }

    /* renamed from: N */
    public final boolean m3209N(java.lang.String r4, java.lang.String r5, int r6, java.lang.Object r7) {
            r3 = this;
            r0 = 1
            if (r7 != 0) goto L4
            return r0
        L4:
            boolean r1 = r7 instanceof java.lang.Long
            if (r1 != 0) goto L54
            boolean r1 = r7 instanceof java.lang.Float
            if (r1 != 0) goto L54
            boolean r1 = r7 instanceof java.lang.Integer
            if (r1 != 0) goto L54
            boolean r1 = r7 instanceof java.lang.Byte
            if (r1 != 0) goto L54
            boolean r1 = r7 instanceof java.lang.Short
            if (r1 != 0) goto L54
            boolean r1 = r7 instanceof java.lang.Boolean
            if (r1 != 0) goto L54
            boolean r1 = r7 instanceof java.lang.Double
            if (r1 == 0) goto L21
            goto L54
        L21:
            boolean r1 = r7 instanceof java.lang.String
            r2 = 0
            if (r1 != 0) goto L30
            boolean r1 = r7 instanceof java.lang.Character
            if (r1 != 0) goto L30
            boolean r1 = r7 instanceof java.lang.CharSequence
            if (r1 == 0) goto L2f
            goto L30
        L2f:
            return r2
        L30:
            java.lang.String r7 = java.lang.String.valueOf(r7)
            int r1 = r7.length()
            int r1 = r7.codePointCount(r2, r1)
            if (r1 <= r6) goto L54
            com.google.android.gms.measurement.internal.d r6 = r3.f5736a
            com.google.android.gms.measurement.internal.b r6 = r6.mo3162d()
            o7.f3 r6 = r6.f5677k
            int r7 = r7.length()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.String r0 = "Value is too long; discarded. Value kind, name, value length"
            r6.m11172f(r0, r4, r5, r7)
            return r2
        L54:
            return r0
    }

    /* renamed from: O */
    public final int m3210O(java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.Object r18, android.os.Bundle r19, java.util.List<java.lang.String> r20, boolean r21, boolean r22) {
            r14 = this;
            r7 = r14
            r8 = r17
            r0 = r18
            r1 = r19
            r14.mo3183i()
            boolean r2 = r14.m3215T(r0)
            r3 = 0
            java.lang.String r4 = "param"
            if (r2 == 0) goto Lab
            if (r22 == 0) goto La8
            java.lang.String[] r2 = p249o7.C5074p4.f19939c
            boolean r2 = m3190f0(r8, r2)
            if (r2 != 0) goto L20
            r0 = 20
            return r0
        L20:
            com.google.android.gms.measurement.internal.d r2 = r7.f5736a
            o7.v5 r2 = r2.m3179y()
            r2.mo3183i()
            r2.m11419j()
            boolean r5 = r2.m11430q()
            if (r5 != 0) goto L33
            goto L45
        L33:
            com.google.android.gms.measurement.internal.d r2 = r2.f5736a
            com.google.android.gms.measurement.internal.f r2 = r2.m3158A()
            int r2 = r2.m3226m0()
            r5 = 200900(0x310c4, float:2.81521E-40)
            if (r2 >= r5) goto L45
            r0 = 25
            return r0
        L45:
            com.google.android.gms.measurement.internal.d r2 = r7.f5736a
            java.util.Objects.requireNonNull(r2)
            boolean r2 = r0 instanceof android.os.Parcelable[]
            if (r2 == 0) goto L53
            r5 = r0
            android.os.Parcelable[] r5 = (android.os.Parcelable[]) r5
            int r5 = r5.length
            goto L5e
        L53:
            boolean r5 = r0 instanceof java.util.ArrayList
            if (r5 == 0) goto Lab
            r5 = r0
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            int r5 = r5.size()
        L5e:
            r6 = 200(0xc8, float:2.8E-43)
            if (r5 <= r6) goto Lab
            com.google.android.gms.measurement.internal.d r9 = r7.f5736a
            com.google.android.gms.measurement.internal.b r9 = r9.mo3162d()
            o7.f3 r9 = r9.f5677k
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.String r10 = "Parameter array is too long; discarded. Value kind, name, array length"
            r9.m11172f(r10, r4, r8, r5)
            com.google.android.gms.measurement.internal.d r5 = r7.f5736a
            java.util.Objects.requireNonNull(r5)
            if (r2 == 0) goto L8a
            r2 = r0
            android.os.Parcelable[] r2 = (android.os.Parcelable[]) r2
            int r5 = r2.length
            if (r5 <= r6) goto La3
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r6)
            android.os.Parcelable[] r2 = (android.os.Parcelable[]) r2
            r1.putParcelableArray(r8, r2)
            goto La3
        L8a:
            boolean r2 = r0 instanceof java.util.ArrayList
            if (r2 == 0) goto La3
            r2 = r0
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            int r5 = r2.size()
            if (r5 <= r6) goto La3
            java.util.ArrayList r5 = new java.util.ArrayList
            java.util.List r2 = r2.subList(r3, r6)
            r5.<init>(r2)
            r1.putParcelableArrayList(r8, r5)
        La3:
            r1 = 17
            r9 = 17
            goto Lac
        La8:
            r0 = 21
            return r0
        Lab:
            r9 = 0
        Lac:
            com.google.android.gms.measurement.internal.d r1 = r7.f5736a
            o7.f r1 = r1.f5716g
            o7.u2<java.lang.Boolean> r2 = p249o7.C5120v2.f20074S
            r10 = r15
            boolean r1 = r1.m11162v(r15, r2)
            if (r1 == 0) goto Lbf
            boolean r1 = m3184V(r16)
            if (r1 != 0) goto Lc5
        Lbf:
            boolean r1 = m3184V(r17)
            if (r1 == 0) goto Lcd
        Lc5:
            com.google.android.gms.measurement.internal.d r1 = r7.f5736a
            java.util.Objects.requireNonNull(r1)
            r1 = 256(0x100, float:3.59E-43)
            goto Ld4
        Lcd:
            com.google.android.gms.measurement.internal.d r1 = r7.f5736a
            java.util.Objects.requireNonNull(r1)
            r1 = 100
        Ld4:
            boolean r1 = r14.m3209N(r4, r8, r1, r0)
            if (r1 == 0) goto Ldb
            return r9
        Ldb:
            if (r22 == 0) goto L167
            boolean r1 = r0 instanceof android.os.Bundle
            if (r1 == 0) goto Lf3
            r4 = r0
            android.os.Bundle r4 = (android.os.Bundle) r4
            r0 = r14
            r1 = r15
            r2 = r16
            r3 = r17
            r5 = r20
            r6 = r21
            r0.m3205J(r1, r2, r3, r4, r5, r6)
            goto L166
        Lf3:
            boolean r1 = r0 instanceof android.os.Parcelable[]
            if (r1 == 0) goto L126
            r11 = r0
            android.os.Parcelable[] r11 = (android.os.Parcelable[]) r11
            int r12 = r11.length
            r13 = 0
        Lfc:
            if (r13 >= r12) goto L166
            r0 = r11[r13]
            boolean r1 = r0 instanceof android.os.Bundle
            if (r1 != 0) goto L113
            com.google.android.gms.measurement.internal.d r1 = r7.f5736a
            com.google.android.gms.measurement.internal.b r1 = r1.mo3162d()
            o7.f3 r1 = r1.f5677k
            java.lang.Class r0 = r0.getClass()
            java.lang.String r2 = "All Parcelable[] elements must be of type Bundle. Value type, name"
            goto L14f
        L113:
            r4 = r0
            android.os.Bundle r4 = (android.os.Bundle) r4
            r0 = r14
            r1 = r15
            r2 = r16
            r3 = r17
            r5 = r20
            r6 = r21
            r0.m3205J(r1, r2, r3, r4, r5, r6)
            int r13 = r13 + 1
            goto Lfc
        L126:
            boolean r1 = r0 instanceof java.util.ArrayList
            if (r1 == 0) goto L167
            r11 = r0
            java.util.ArrayList r11 = (java.util.ArrayList) r11
            int r12 = r11.size()
            r13 = 0
        L132:
            if (r13 >= r12) goto L166
            java.lang.Object r0 = r11.get(r13)
            boolean r1 = r0 instanceof android.os.Bundle
            if (r1 != 0) goto L153
            com.google.android.gms.measurement.internal.d r1 = r7.f5736a
            com.google.android.gms.measurement.internal.b r1 = r1.mo3162d()
            o7.f3 r1 = r1.f5677k
            if (r0 == 0) goto L14b
            java.lang.Class r0 = r0.getClass()
            goto L14d
        L14b:
            java.lang.String r0 = "null"
        L14d:
            java.lang.String r2 = "All ArrayList elements must be of type Bundle. Value type, name"
        L14f:
            r1.m11171e(r2, r0, r8)
            goto L167
        L153:
            r4 = r0
            android.os.Bundle r4 = (android.os.Bundle) r4
            r0 = r14
            r1 = r15
            r2 = r16
            r3 = r17
            r5 = r20
            r6 = r21
            r0.m3205J(r1, r2, r3, r4, r5, r6)
            int r13 = r13 + 1
            goto L132
        L166:
            return r9
        L167:
            r0 = 4
            return r0
    }

    /* renamed from: P */
    public final boolean m3211P(java.lang.String r7, java.lang.String r8) {
            r6 = this;
            r0 = 0
            if (r8 != 0) goto L11
            com.google.android.gms.measurement.internal.d r8 = r6.f5736a
            com.google.android.gms.measurement.internal.b r8 = r8.mo3162d()
            o7.f3 r8 = r8.f5674h
            java.lang.String r1 = "Name is required and can't be null. Type"
            r8.m11170d(r1, r7)
            return r0
        L11:
            int r1 = r8.length()
            if (r1 != 0) goto L25
            com.google.android.gms.measurement.internal.d r8 = r6.f5736a
            com.google.android.gms.measurement.internal.b r8 = r8.mo3162d()
            o7.f3 r8 = r8.f5674h
            java.lang.String r1 = "Name is required and can't be empty. Type"
            r8.m11170d(r1, r7)
            return r0
        L25:
            int r1 = r8.codePointAt(r0)
            boolean r2 = java.lang.Character.isLetter(r1)
            r3 = 95
            if (r2 != 0) goto L44
            if (r1 != r3) goto L36
            r1 = 95
            goto L44
        L36:
            com.google.android.gms.measurement.internal.d r1 = r6.f5736a
            com.google.android.gms.measurement.internal.b r1 = r1.mo3162d()
            o7.f3 r1 = r1.f5674h
            java.lang.String r2 = "Name must start with a letter or _ (underscore). Type, name"
            r1.m11171e(r2, r7, r8)
            return r0
        L44:
            int r2 = r8.length()
            int r1 = java.lang.Character.charCount(r1)
        L4c:
            if (r1 >= r2) goto L6f
            int r4 = r8.codePointAt(r1)
            if (r4 == r3) goto L69
            boolean r5 = java.lang.Character.isLetterOrDigit(r4)
            if (r5 == 0) goto L5b
            goto L69
        L5b:
            com.google.android.gms.measurement.internal.d r1 = r6.f5736a
            com.google.android.gms.measurement.internal.b r1 = r1.mo3162d()
            o7.f3 r1 = r1.f5674h
            java.lang.String r2 = "Name must consist of letters, digits or _ (underscores). Type, name"
            r1.m11171e(r2, r7, r8)
            return r0
        L69:
            int r4 = java.lang.Character.charCount(r4)
            int r1 = r1 + r4
            goto L4c
        L6f:
            r7 = 1
            return r7
    }

    /* renamed from: Q */
    public final boolean m3212Q(java.lang.String r6, java.lang.String r7) {
            r5 = this;
            r0 = 0
            if (r7 != 0) goto L11
            com.google.android.gms.measurement.internal.d r7 = r5.f5736a
            com.google.android.gms.measurement.internal.b r7 = r7.mo3162d()
            o7.f3 r7 = r7.f5674h
            java.lang.String r1 = "Name is required and can't be null. Type"
            r7.m11170d(r1, r6)
            return r0
        L11:
            int r1 = r7.length()
            if (r1 != 0) goto L25
            com.google.android.gms.measurement.internal.d r7 = r5.f5736a
            com.google.android.gms.measurement.internal.b r7 = r7.mo3162d()
            o7.f3 r7 = r7.f5674h
            java.lang.String r1 = "Name is required and can't be empty. Type"
            r7.m11170d(r1, r6)
            return r0
        L25:
            int r1 = r7.codePointAt(r0)
            boolean r2 = java.lang.Character.isLetter(r1)
            if (r2 != 0) goto L3d
            com.google.android.gms.measurement.internal.d r1 = r5.f5736a
            com.google.android.gms.measurement.internal.b r1 = r1.mo3162d()
            o7.f3 r1 = r1.f5674h
            java.lang.String r2 = "Name must start with a letter. Type, name"
            r1.m11171e(r2, r6, r7)
            return r0
        L3d:
            int r2 = r7.length()
            int r1 = java.lang.Character.charCount(r1)
        L45:
            if (r1 >= r2) goto L6a
            int r3 = r7.codePointAt(r1)
            r4 = 95
            if (r3 == r4) goto L64
            boolean r4 = java.lang.Character.isLetterOrDigit(r3)
            if (r4 == 0) goto L56
            goto L64
        L56:
            com.google.android.gms.measurement.internal.d r1 = r5.f5736a
            com.google.android.gms.measurement.internal.b r1 = r1.mo3162d()
            o7.f3 r1 = r1.f5674h
            java.lang.String r2 = "Name must consist of letters, digits or _ (underscores). Type, name"
            r1.m11171e(r2, r6, r7)
            return r0
        L64:
            int r3 = java.lang.Character.charCount(r3)
            int r1 = r1 + r3
            goto L45
        L6a:
            r6 = 1
            return r6
    }

    /* renamed from: R */
    public final boolean m3213R(java.lang.String r3) {
            r2 = this;
            r2.mo3183i()
            com.google.android.gms.measurement.internal.d r0 = r2.f5736a
            android.content.Context r0 = r0.f5710a
            w6.b r0 = p388w6.C6816c.m13887a(r0)
            android.content.Context r0 = r0.f26525a
            int r0 = r0.checkCallingOrSelfPermission(r3)
            if (r0 != 0) goto L15
            r3 = 1
            return r3
        L15:
            com.google.android.gms.measurement.internal.d r0 = r2.f5736a
            com.google.android.gms.measurement.internal.b r0 = r0.mo3162d()
            o7.f3 r0 = r0.f5679m
            java.lang.String r1 = "Permission not granted"
            r0.m11170d(r1, r3)
            r3 = 0
            return r3
    }

    /* renamed from: S */
    public final boolean m3214S(java.lang.String r4) {
            r3 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 == 0) goto L8
            r4 = 0
            return r4
        L8:
            com.google.android.gms.measurement.internal.d r0 = r3.f5736a
            o7.f r0 = r0.f5716g
            java.lang.String r1 = "debug.firebase.analytics.app"
            java.lang.String r2 = ""
            java.lang.String r0 = r0.m11151k(r1, r2)
            com.google.android.gms.measurement.internal.d r1 = r3.f5736a
            java.util.Objects.requireNonNull(r1)
            boolean r4 = r0.equals(r4)
            return r4
    }

    /* renamed from: T */
    public final boolean m3215T(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof android.os.Parcelable[]
            if (r0 != 0) goto Lf
            boolean r0 = r2 instanceof java.util.ArrayList
            if (r0 != 0) goto Lf
            boolean r2 = r2 instanceof android.os.Bundle
            if (r2 == 0) goto Ld
            goto Lf
        Ld:
            r2 = 0
            return r2
        Lf:
            r2 = 1
            return r2
    }

    /* renamed from: U */
    public final boolean m3216U(android.content.Context r3, java.lang.String r4) {
            r2 = this;
            javax.security.auth.x500.X500Principal r0 = new javax.security.auth.x500.X500Principal
            java.lang.String r1 = "CN=Android Debug,O=Android,C=US"
            r0.<init>(r1)
            w6.b r3 = p388w6.C6816c.m13887a(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L41 java.security.cert.CertificateException -> L4d
            r1 = 64
            android.content.Context r3 = r3.f26525a     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L41 java.security.cert.CertificateException -> L4d
            android.content.pm.PackageManager r3 = r3.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L41 java.security.cert.CertificateException -> L4d
            android.content.pm.PackageInfo r3 = r3.getPackageInfo(r4, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L41 java.security.cert.CertificateException -> L4d
            if (r3 == 0) goto L5b
            android.content.pm.Signature[] r3 = r3.signatures     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L41 java.security.cert.CertificateException -> L4d
            if (r3 == 0) goto L5b
            int r4 = r3.length     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L41 java.security.cert.CertificateException -> L4d
            if (r4 <= 0) goto L5b
            r4 = 0
            r3 = r3[r4]     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L41 java.security.cert.CertificateException -> L4d
            java.lang.String r4 = "X.509"
            java.security.cert.CertificateFactory r4 = java.security.cert.CertificateFactory.getInstance(r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L41 java.security.cert.CertificateException -> L4d
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L41 java.security.cert.CertificateException -> L4d
            byte[] r3 = r3.toByteArray()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L41 java.security.cert.CertificateException -> L4d
            r1.<init>(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L41 java.security.cert.CertificateException -> L4d
            java.security.cert.Certificate r3 = r4.generateCertificate(r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L41 java.security.cert.CertificateException -> L4d
            java.security.cert.X509Certificate r3 = (java.security.cert.X509Certificate) r3     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L41 java.security.cert.CertificateException -> L4d
            javax.security.auth.x500.X500Principal r3 = r3.getSubjectX500Principal()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L41 java.security.cert.CertificateException -> L4d
            boolean r3 = r3.equals(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L41 java.security.cert.CertificateException -> L4d
            return r3
        L41:
            r3 = move-exception
            com.google.android.gms.measurement.internal.d r4 = r2.f5736a
            com.google.android.gms.measurement.internal.b r4 = r4.mo3162d()
            o7.f3 r4 = r4.f5672f
            java.lang.String r0 = "Package name not found"
            goto L58
        L4d:
            r3 = move-exception
            com.google.android.gms.measurement.internal.d r4 = r2.f5736a
            com.google.android.gms.measurement.internal.b r4 = r4.mo3162d()
            o7.f3 r4 = r4.f5672f
            java.lang.String r0 = "Error obtaining certificate"
        L58:
            r4.m11170d(r0, r3)
        L5b:
            r3 = 1
            return r3
    }

    /* renamed from: a0 */
    public final boolean m3217a0(java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8) {
            r4 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            boolean r1 = android.text.TextUtils.isEmpty(r6)
            r2 = 1
            r3 = 0
            if (r0 != 0) goto L1b
            if (r1 != 0) goto L1b
            java.lang.String r7 = "null reference"
            java.util.Objects.requireNonNull(r5, r7)
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L1a
            return r2
        L1a:
            return r3
        L1b:
            if (r0 == 0) goto L3b
            if (r1 == 0) goto L3b
            boolean r5 = android.text.TextUtils.isEmpty(r7)
            if (r5 != 0) goto L33
            boolean r5 = android.text.TextUtils.isEmpty(r8)
            if (r5 != 0) goto L33
            boolean r5 = r7.equals(r8)
            if (r5 != 0) goto L32
            return r2
        L32:
            return r3
        L33:
            boolean r5 = android.text.TextUtils.isEmpty(r8)
            if (r5 != 0) goto L3a
            return r2
        L3a:
            return r3
        L3b:
            if (r0 != 0) goto L53
            boolean r5 = android.text.TextUtils.isEmpty(r8)
            if (r5 == 0) goto L44
            return r3
        L44:
            boolean r5 = android.text.TextUtils.isEmpty(r7)
            if (r5 != 0) goto L52
            boolean r5 = r7.equals(r8)
            if (r5 != 0) goto L51
            goto L52
        L51:
            return r3
        L52:
            return r2
        L53:
            boolean r5 = android.text.TextUtils.isEmpty(r7)
            if (r5 != 0) goto L61
            boolean r5 = r7.equals(r8)
            if (r5 != 0) goto L60
            goto L61
        L60:
            return r3
        L61:
            return r2
    }

    /* renamed from: b0 */
    public final byte[] m3218b0(android.os.Parcelable r3) {
            r2 = this;
            if (r3 != 0) goto L4
            r3 = 0
            return r3
        L4:
            android.os.Parcel r0 = android.os.Parcel.obtain()
            r1 = 0
            r3.writeToParcel(r0, r1)     // Catch: java.lang.Throwable -> L14
            byte[] r3 = r0.marshall()     // Catch: java.lang.Throwable -> L14
            r0.recycle()
            return r3
        L14:
            r3 = move-exception
            r0.recycle()
            throw r3
    }

    /* renamed from: d0 */
    public final int m3219d0(java.lang.String r4) {
            r3 = this;
            java.lang.String r0 = "_ldl"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L10
            com.google.android.gms.measurement.internal.d r4 = r3.f5736a
            java.util.Objects.requireNonNull(r4)
            r4 = 2048(0x800, float:2.87E-42)
            return r4
        L10:
            java.lang.String r0 = "_id"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L3d
            com.google.android.gms.measurement.internal.d r0 = r3.f5736a
            o7.f r0 = r0.f5716g
            r1 = 0
            o7.u2<java.lang.Boolean> r2 = p249o7.C5120v2.f20085b0
            boolean r0 = r0.m11162v(r1, r2)
            if (r0 == 0) goto L35
            java.lang.String r0 = "_lgclid"
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L35
            com.google.android.gms.measurement.internal.d r4 = r3.f5736a
            java.util.Objects.requireNonNull(r4)
            r4 = 100
            return r4
        L35:
            com.google.android.gms.measurement.internal.d r4 = r3.f5736a
            java.util.Objects.requireNonNull(r4)
            r4 = 36
            return r4
        L3d:
            com.google.android.gms.measurement.internal.d r4 = r3.f5736a
            java.util.Objects.requireNonNull(r4)
            r4 = 256(0x100, float:3.59E-43)
            return r4
    }

    /* renamed from: e0 */
    public final java.lang.Object m3220e0(int r3, java.lang.Object r4, boolean r5, boolean r6) {
            r2 = this;
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof java.lang.Long
            if (r1 != 0) goto Lb3
            boolean r1 = r4 instanceof java.lang.Double
            if (r1 == 0) goto Le
            goto Lb3
        Le:
            boolean r1 = r4 instanceof java.lang.Integer
            if (r1 == 0) goto L1e
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r3 = r4.intValue()
            long r3 = (long) r3
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            return r3
        L1e:
            boolean r1 = r4 instanceof java.lang.Byte
            if (r1 == 0) goto L2e
            java.lang.Byte r4 = (java.lang.Byte) r4
            byte r3 = r4.byteValue()
            long r3 = (long) r3
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            return r3
        L2e:
            boolean r1 = r4 instanceof java.lang.Short
            if (r1 == 0) goto L3e
            java.lang.Short r4 = (java.lang.Short) r4
            short r3 = r4.shortValue()
            long r3 = (long) r3
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            return r3
        L3e:
            boolean r1 = r4 instanceof java.lang.Boolean
            if (r1 == 0) goto L55
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r3 = r4.booleanValue()
            r4 = 1
            if (r4 == r3) goto L4e
            r3 = 0
            goto L50
        L4e:
            r3 = 1
        L50:
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            return r3
        L55:
            boolean r1 = r4 instanceof java.lang.Float
            if (r1 == 0) goto L64
            java.lang.Float r4 = (java.lang.Float) r4
            double r3 = r4.doubleValue()
            java.lang.Double r3 = java.lang.Double.valueOf(r3)
            return r3
        L64:
            boolean r1 = r4 instanceof java.lang.String
            if (r1 != 0) goto Laa
            boolean r1 = r4 instanceof java.lang.Character
            if (r1 != 0) goto Laa
            boolean r1 = r4 instanceof java.lang.CharSequence
            if (r1 == 0) goto L71
            goto Laa
        L71:
            if (r6 == 0) goto La9
            boolean r3 = r4 instanceof android.os.Bundle[]
            if (r3 != 0) goto L7b
            boolean r3 = r4 instanceof android.os.Parcelable[]
            if (r3 == 0) goto La9
        L7b:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            android.os.Parcelable[] r4 = (android.os.Parcelable[]) r4
            int r5 = r4.length
            r6 = 0
        L84:
            if (r6 >= r5) goto L9e
            r0 = r4[r6]
            boolean r1 = r0 instanceof android.os.Bundle
            if (r1 == 0) goto L9b
            android.os.Bundle r0 = (android.os.Bundle) r0
            android.os.Bundle r0 = r2.m3233r0(r0)
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L9b
            r3.add(r0)
        L9b:
            int r6 = r6 + 1
            goto L84
        L9e:
            int r4 = r3.size()
            android.os.Bundle[] r4 = new android.os.Bundle[r4]
            java.lang.Object[] r3 = r3.toArray(r4)
            return r3
        La9:
            return r0
        Laa:
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r3 = r2.m3232r(r4, r3, r5)
            return r3
        Lb3:
            return r4
    }

    /* renamed from: h0 */
    public final int m3221h0(java.lang.String r3, java.lang.Object r4) {
            r2 = this;
            java.lang.String r0 = "_ldl"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto Lf
            int r0 = r2.m3219d0(r3)
            java.lang.String r1 = "user property referrer"
            goto L15
        Lf:
            int r0 = r2.m3219d0(r3)
            java.lang.String r1 = "user property"
        L15:
            boolean r3 = r2.m3209N(r1, r3, r0, r4)
            if (r3 == 0) goto L1d
            r3 = 0
            return r3
        L1d:
            r3 = 7
            return r3
    }

    /* renamed from: i0 */
    public final int m3222i0(java.lang.String r5) {
            r4 = this;
            java.lang.String r0 = "event"
            boolean r1 = r4.m3211P(r0, r5)
            r2 = 2
            if (r1 != 0) goto La
            return r2
        La:
            java.lang.String[] r1 = p249o7.C5066o4.f19921a
            java.lang.String[] r3 = p249o7.C5066o4.f19922b
            boolean r1 = r4.m3208M(r0, r1, r3, r5)
            if (r1 != 0) goto L17
            r5 = 13
            return r5
        L17:
            com.google.android.gms.measurement.internal.d r1 = r4.f5736a
            java.util.Objects.requireNonNull(r1)
            r1 = 40
            boolean r5 = r4.m3207L(r0, r1, r5)
            if (r5 != 0) goto L25
            return r2
        L25:
            r5 = 0
            return r5
    }

    @Override // p249o7.AbstractC5050m4
    /* renamed from: j */
    public final void mo3146j() {
            r6 = this;
            r6.mo3183i()
            java.security.SecureRandom r0 = new java.security.SecureRandom
            r0.<init>()
            long r1 = r0.nextLong()
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L27
            long r1 = r0.nextLong()
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L27
            com.google.android.gms.measurement.internal.d r0 = r6.f5736a
            com.google.android.gms.measurement.internal.b r0 = r0.mo3162d()
            o7.f3 r0 = r0.f5675i
            java.lang.String r3 = "Utils falling back to Random for random id"
            r0.m11169c(r3)
        L27:
            java.util.concurrent.atomic.AtomicLong r0 = r6.f5740d
            r0.set(r1)
            return
    }

    /* renamed from: j0 */
    public final int m3223j0(java.lang.String r4) {
            r3 = this;
            java.lang.String r0 = "event param"
            boolean r1 = r3.m3211P(r0, r4)
            r2 = 3
            if (r1 != 0) goto La
            return r2
        La:
            r1 = 0
            boolean r1 = r3.m3208M(r0, r1, r1, r4)
            if (r1 != 0) goto L14
            r4 = 14
            return r4
        L14:
            com.google.android.gms.measurement.internal.d r1 = r3.f5736a
            java.util.Objects.requireNonNull(r1)
            r1 = 40
            boolean r4 = r3.m3207L(r0, r1, r4)
            if (r4 != 0) goto L22
            return r2
        L22:
            r4 = 0
            return r4
    }

    @Override // p249o7.AbstractC5050m4
    /* renamed from: k */
    public final boolean mo3138k() {
            r1 = this;
            r0 = 1
            return r0
    }

    /* renamed from: k0 */
    public final int m3224k0(java.lang.String r4) {
            r3 = this;
            java.lang.String r0 = "event param"
            boolean r1 = r3.m3212Q(r0, r4)
            r2 = 3
            if (r1 != 0) goto La
            return r2
        La:
            r1 = 0
            boolean r1 = r3.m3208M(r0, r1, r1, r4)
            if (r1 != 0) goto L14
            r4 = 14
            return r4
        L14:
            com.google.android.gms.measurement.internal.d r1 = r3.f5736a
            java.util.Objects.requireNonNull(r1)
            r1 = 40
            boolean r4 = r3.m3207L(r0, r1, r4)
            if (r4 != 0) goto L22
            return r2
        L22:
            r4 = 0
            return r4
    }

    /* renamed from: l0 */
    public final int m3225l0(java.lang.String r5) {
            r4 = this;
            java.lang.String r0 = "user property"
            boolean r1 = r4.m3211P(r0, r5)
            r2 = 6
            if (r1 != 0) goto La
            return r2
        La:
            java.lang.String[] r1 = p249o7.C5082q4.f19963a
            r3 = 0
            boolean r1 = r4.m3208M(r0, r1, r3, r5)
            if (r1 != 0) goto L16
            r5 = 15
            return r5
        L16:
            com.google.android.gms.measurement.internal.d r1 = r4.f5736a
            java.util.Objects.requireNonNull(r1)
            r1 = 24
            boolean r5 = r4.m3207L(r0, r1, r5)
            if (r5 != 0) goto L24
            return r2
        L24:
            r5 = 0
            return r5
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"this.apkVersion"})
    /* renamed from: m0 */
    public final int m3226m0() {
            r3 = this;
            java.lang.Integer r0 = r3.f5742f
            if (r0 != 0) goto L2c
            k6.f r0 = p184k6.C3703f.f16409b
            com.google.android.gms.measurement.internal.d r1 = r3.f5736a
            android.content.Context r1 = r1.f5710a
            java.util.Objects.requireNonNull(r0)
            boolean r0 = p184k6.C3705h.f16411a
            r0 = 0
            android.content.pm.PackageManager r1 = r1.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L1d
            java.lang.String r2 = "com.google.android.gms"
            android.content.pm.PackageInfo r0 = r1.getPackageInfo(r2, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L1d
            int r0 = r0.versionCode
            goto L24
        L1d:
            java.lang.String r1 = "GooglePlayServicesUtil"
            java.lang.String r2 = "Google Play services is missing."
            android.util.Log.w(r1, r2)
        L24:
            int r0 = r0 / 1000
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.f5742f = r0
        L2c:
            java.lang.Integer r0 = r3.f5742f
            int r0 = r0.intValue()
            return r0
    }

    /* renamed from: o0 */
    public final long m3227o0() {
            r6 = this;
            java.util.concurrent.atomic.AtomicLong r0 = r6.f5740d
            long r0 = r0.get()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            java.util.concurrent.atomic.AtomicLong r0 = r6.f5740d
            monitor-enter(r0)
            if (r4 != 0) goto L37
            java.util.Random r1 = new java.util.Random     // Catch: java.lang.Throwable -> L34
            long r2 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L34
            com.google.android.gms.measurement.internal.d r4 = r6.f5736a     // Catch: java.lang.Throwable -> L34
            u6.c r4 = r4.f5723n     // Catch: java.lang.Throwable -> L34
            u6.d r4 = (p353u6.C6341d) r4     // Catch: java.lang.Throwable -> L34
            java.util.Objects.requireNonNull(r4)     // Catch: java.lang.Throwable -> L34
            long r4 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L34
            long r2 = r2 ^ r4
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L34
            long r1 = r1.nextLong()     // Catch: java.lang.Throwable -> L34
            int r3 = r6.f5741e     // Catch: java.lang.Throwable -> L34
            int r3 = r3 + 1
            r6.f5741e = r3     // Catch: java.lang.Throwable -> L34
            long r3 = (long) r3     // Catch: java.lang.Throwable -> L34
            long r1 = r1 + r3
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L34
            return r1
        L34:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L34
            throw r1
        L37:
            java.util.concurrent.atomic.AtomicLong r1 = r6.f5740d     // Catch: java.lang.Throwable -> L48
            r2 = -1
            r4 = 1
            r1.compareAndSet(r2, r4)     // Catch: java.lang.Throwable -> L48
            java.util.concurrent.atomic.AtomicLong r1 = r6.f5740d     // Catch: java.lang.Throwable -> L48
            long r1 = r1.getAndIncrement()     // Catch: java.lang.Throwable -> L48
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L48
            return r1
        L48:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L48
            throw r1
    }

    /* renamed from: p */
    public final java.lang.Object m3228p(java.lang.String r4, java.lang.Object r5) {
            r3 = this;
            java.lang.String r0 = "_ev"
            boolean r0 = r0.equals(r4)
            r1 = 256(0x100, float:3.59E-43)
            r2 = 1
            if (r0 == 0) goto L15
            com.google.android.gms.measurement.internal.d r4 = r3.f5736a
            java.util.Objects.requireNonNull(r4)
            java.lang.Object r4 = r3.m3220e0(r1, r5, r2, r2)
            return r4
        L15:
            boolean r4 = m3184V(r4)
            if (r4 == 0) goto L21
            com.google.android.gms.measurement.internal.d r4 = r3.f5736a
            java.util.Objects.requireNonNull(r4)
            goto L28
        L21:
            com.google.android.gms.measurement.internal.d r4 = r3.f5736a
            java.util.Objects.requireNonNull(r4)
            r1 = 100
        L28:
            r4 = 0
            java.lang.Object r4 = r3.m3220e0(r1, r5, r4, r2)
            return r4
    }

    /* renamed from: p0 */
    public final long m3229p0(long r3, long r5) {
            r2 = this;
            r0 = 60000(0xea60, double:2.9644E-319)
            long r5 = r5 * r0
            long r5 = r5 + r3
            r3 = 86400000(0x5265c00, double:4.2687272E-316)
            long r5 = r5 / r3
            return r5
    }

    /* renamed from: q */
    public final java.lang.Object m3230q(java.lang.String r3, java.lang.Object r4) {
            r2 = this;
            java.lang.String r0 = "_ldl"
            boolean r0 = r0.equals(r3)
            r1 = 0
            int r3 = r2.m3219d0(r3)
            if (r0 == 0) goto L13
            r0 = 1
            java.lang.Object r3 = r2.m3220e0(r3, r4, r0, r1)
            return r3
        L13:
            java.lang.Object r3 = r2.m3220e0(r3, r4, r1, r1)
            return r3
    }

    /* renamed from: q0 */
    public final android.os.Bundle m3231q0(android.net.Uri r8) {
            r7 = this;
            r0 = 0
            if (r8 == 0) goto Lcd
            boolean r1 = r8.isHierarchical()     // Catch: java.lang.UnsupportedOperationException -> Lbf
            java.lang.String r2 = "gclid"
            if (r1 == 0) goto L22
            java.lang.String r1 = "utm_campaign"
            java.lang.String r1 = r8.getQueryParameter(r1)     // Catch: java.lang.UnsupportedOperationException -> Lbf
            java.lang.String r3 = "utm_source"
            java.lang.String r3 = r8.getQueryParameter(r3)     // Catch: java.lang.UnsupportedOperationException -> Lbf
            java.lang.String r4 = "utm_medium"
            java.lang.String r4 = r8.getQueryParameter(r4)     // Catch: java.lang.UnsupportedOperationException -> Lbf
            java.lang.String r5 = r8.getQueryParameter(r2)     // Catch: java.lang.UnsupportedOperationException -> Lbf
            goto L26
        L22:
            r1 = r0
            r3 = r1
            r4 = r3
            r5 = r4
        L26:
            boolean r6 = android.text.TextUtils.isEmpty(r1)
            if (r6 == 0) goto L40
            boolean r6 = android.text.TextUtils.isEmpty(r3)
            if (r6 == 0) goto L40
            boolean r6 = android.text.TextUtils.isEmpty(r4)
            if (r6 == 0) goto L40
            boolean r6 = android.text.TextUtils.isEmpty(r5)
            if (r6 != 0) goto L3f
            goto L40
        L3f:
            return r0
        L40:
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            boolean r6 = android.text.TextUtils.isEmpty(r1)
            if (r6 != 0) goto L50
            java.lang.String r6 = "campaign"
            r0.putString(r6, r1)
        L50:
            boolean r1 = android.text.TextUtils.isEmpty(r3)
            if (r1 != 0) goto L5b
            java.lang.String r1 = "source"
            r0.putString(r1, r3)
        L5b:
            boolean r1 = android.text.TextUtils.isEmpty(r4)
            if (r1 != 0) goto L66
            java.lang.String r1 = "medium"
            r0.putString(r1, r4)
        L66:
            boolean r1 = android.text.TextUtils.isEmpty(r5)
            if (r1 != 0) goto L6f
            r0.putString(r2, r5)
        L6f:
            java.lang.String r1 = "utm_term"
            java.lang.String r1 = r8.getQueryParameter(r1)
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L80
            java.lang.String r2 = "term"
            r0.putString(r2, r1)
        L80:
            java.lang.String r1 = "utm_content"
            java.lang.String r1 = r8.getQueryParameter(r1)
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L91
            java.lang.String r2 = "content"
            r0.putString(r2, r1)
        L91:
            java.lang.String r1 = "aclid"
            java.lang.String r2 = r8.getQueryParameter(r1)
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto La0
            r0.putString(r1, r2)
        La0:
            java.lang.String r1 = "cp1"
            java.lang.String r2 = r8.getQueryParameter(r1)
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto Laf
            r0.putString(r1, r2)
        Laf:
            java.lang.String r1 = "anid"
            java.lang.String r8 = r8.getQueryParameter(r1)
            boolean r2 = android.text.TextUtils.isEmpty(r8)
            if (r2 != 0) goto Lbe
            r0.putString(r1, r8)
        Lbe:
            return r0
        Lbf:
            r8 = move-exception
            com.google.android.gms.measurement.internal.d r1 = r7.f5736a
            com.google.android.gms.measurement.internal.b r1 = r1.mo3162d()
            o7.f3 r1 = r1.f5675i
            java.lang.String r2 = "Install referrer url isn't a hierarchical URI"
            r1.m11170d(r2, r8)
        Lcd:
            return r0
    }

    /* renamed from: r */
    public final java.lang.String m3232r(java.lang.String r4, int r5, boolean r6) {
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            int r1 = r4.length()
            r2 = 0
            int r1 = r4.codePointCount(r2, r1)
            if (r1 <= r5) goto L25
            if (r6 == 0) goto L24
            int r5 = r4.offsetByCodePoints(r2, r5)
            java.lang.String r4 = r4.substring(r2, r5)
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r5 = "..."
            java.lang.String r4 = r4.concat(r5)
            return r4
        L24:
            return r0
        L25:
            return r4
    }

    /* renamed from: r0 */
    public final android.os.Bundle m3233r0(android.os.Bundle r6) {
            r5 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            if (r6 == 0) goto L3f
            java.util.Set r1 = r6.keySet()
            java.util.Iterator r1 = r1.iterator()
        Lf:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L3f
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r6.get(r2)
            java.lang.Object r3 = r5.m3228p(r2, r3)
            if (r3 != 0) goto L3b
            com.google.android.gms.measurement.internal.d r3 = r5.f5736a
            com.google.android.gms.measurement.internal.b r3 = r3.mo3162d()
            o7.f3 r3 = r3.f5677k
            com.google.android.gms.measurement.internal.d r4 = r5.f5736a
            o7.c3 r4 = r4.f5722m
            java.lang.String r2 = r4.m11117e(r2)
            java.lang.String r4 = "Param value can't be null"
            r3.m11170d(r4, r2)
            goto Lf
        L3b:
            r5.m3197B(r0, r2, r3)
            goto Lf
        L3f:
            return r0
    }

    /* renamed from: s0 */
    public final android.os.Bundle m3234s0(java.lang.String r20, java.lang.String r21, android.os.Bundle r22, java.util.List<java.lang.String> r23, boolean r24) {
            r19 = this;
            r9 = r19
            r10 = r21
            r11 = r22
            r12 = r23
            java.lang.String[] r0 = p249o7.C5066o4.f19924d
            boolean r13 = m3190f0(r10, r0)
            android.os.Bundle r14 = new android.os.Bundle
            r14.<init>(r11)
            com.google.android.gms.measurement.internal.d r0 = r9.f5736a
            o7.f r0 = r0.f5716g
            int r15 = r0.m11153m()
            java.util.TreeSet r0 = new java.util.TreeSet
            java.util.Set r1 = r22.keySet()
            r0.<init>(r1)
            java.util.Iterator r16 = r0.iterator()
            r17 = 0
            r18 = 0
        L2c:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto Le8
            java.lang.Object r0 = r16.next()
            r8 = r0
            java.lang.String r8 = (java.lang.String) r8
            if (r12 == 0) goto L44
            boolean r0 = r12.contains(r8)
            if (r0 != 0) goto L42
            goto L44
        L42:
            r0 = 0
            goto L52
        L44:
            if (r24 != 0) goto L4b
            int r0 = r9.m3224k0(r8)
            goto L4c
        L4b:
            r0 = 0
        L4c:
            if (r0 != 0) goto L52
            int r0 = r9.m3223j0(r8)
        L52:
            if (r0 == 0) goto L62
            r1 = 3
            if (r0 != r1) goto L59
            r1 = r8
            goto L5a
        L59:
            r1 = 0
        L5a:
            r9.m3238w(r14, r0, r8, r1)
            r14.remove(r8)
            goto Le4
        L62:
            java.lang.Object r4 = r11.get(r8)
            r0 = r19
            r1 = r20
            r2 = r21
            r3 = r8
            r5 = r14
            r6 = r23
            r7 = r24
            r12 = r8
            r8 = r13
            int r0 = r0.m3210O(r1, r2, r3, r4, r5, r6, r7, r8)
            r1 = 17
            if (r0 != r1) goto L82
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r9.m3238w(r14, r1, r12, r0)
            goto L9e
        L82:
            if (r0 == 0) goto L9e
            java.lang.String r1 = "_ev"
            boolean r1 = r1.equals(r12)
            if (r1 != 0) goto L9e
            r1 = 21
            if (r0 != r1) goto L92
            r8 = r10
            goto L93
        L92:
            r8 = r12
        L93:
            java.lang.Object r1 = r11.get(r12)
            r9.m3238w(r14, r0, r8, r1)
            r14.remove(r12)
            goto Le4
        L9e:
            boolean r0 = m3185W(r12)
            if (r0 == 0) goto Le4
            int r0 = r18 + 1
            if (r0 <= r15) goto Le2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = 48
            r1.<init>(r2)
            java.lang.String r2 = "Event can't contain more than "
            r1.append(r2)
            r1.append(r15)
            java.lang.String r2 = " params"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.google.android.gms.measurement.internal.d r2 = r9.f5736a
            com.google.android.gms.measurement.internal.b r2 = r2.mo3162d()
            o7.f3 r2 = r2.f5674h
            com.google.android.gms.measurement.internal.d r3 = r9.f5736a
            o7.c3 r3 = r3.f5722m
            java.lang.String r3 = r3.m11116d(r10)
            com.google.android.gms.measurement.internal.d r4 = r9.f5736a
            o7.c3 r4 = r4.f5722m
            java.lang.String r4 = r4.m11114b(r11)
            r2.m11171e(r1, r3, r4)
            r1 = 5
            m3189c0(r14, r1)
            r14.remove(r12)
        Le2:
            r18 = r0
        Le4:
            r12 = r23
            goto L2c
        Le8:
            return r14
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"this.secureRandom"})
    /* renamed from: t */
    public final java.security.SecureRandom m3235t() {
            r1 = this;
            r1.mo3183i()
            java.security.SecureRandom r0 = r1.f5739c
            if (r0 != 0) goto Le
            java.security.SecureRandom r0 = new java.security.SecureRandom
            r0.<init>()
            r1.f5739c = r0
        Le:
            java.security.SecureRandom r0 = r1.f5739c
            return r0
    }

    /* renamed from: t0 */
    public final p249o7.C5077q m3236t0(java.lang.String r7, java.lang.String r8, android.os.Bundle r9, java.lang.String r10, long r11, boolean r13, boolean r14) {
            r6 = this;
            boolean r14 = android.text.TextUtils.isEmpty(r8)
            if (r14 == 0) goto L8
            r7 = 0
            return r7
        L8:
            int r14 = r6.m3222i0(r8)
            if (r14 != 0) goto L44
            android.os.Bundle r3 = new android.os.Bundle
            if (r9 == 0) goto L16
            r3.<init>(r9)
            goto L19
        L16:
            r3.<init>()
        L19:
            java.lang.String r9 = "_o"
            r3.putString(r9, r10)
            java.util.List r4 = java.util.Collections.singletonList(r9)
            r5 = 1
            r0 = r6
            r1 = r7
            r2 = r8
            android.os.Bundle r7 = r0.m3234s0(r1, r2, r3, r4, r5)
            if (r13 == 0) goto L30
            android.os.Bundle r7 = r6.m3233r0(r7)
        L30:
            java.lang.String r9 = "null reference"
            java.util.Objects.requireNonNull(r7, r9)
            o7.q r9 = new o7.q
            o7.o r2 = new o7.o
            r2.<init>(r7)
            r0 = r9
            r1 = r8
            r3 = r10
            r4 = r11
            r0.<init>(r1, r2, r3, r4)
            return r9
        L44:
            com.google.android.gms.measurement.internal.d r7 = r6.f5736a
            com.google.android.gms.measurement.internal.b r7 = r7.mo3162d()
            o7.f3 r7 = r7.f5672f
            com.google.android.gms.measurement.internal.d r9 = r6.f5736a
            o7.c3 r9 = r9.f5722m
            java.lang.String r8 = r9.m11118f(r8)
            java.lang.String r9 = "Invalid conditional property event name"
            r7.m11170d(r9, r8)
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            r7.<init>()
            throw r7
    }

    /* renamed from: v */
    public final void m3237v(android.os.Bundle r7, long r8) {
            r6 = this;
            java.lang.String r0 = "_et"
            long r1 = r7.getLong(r0)
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L1d
            com.google.android.gms.measurement.internal.d r3 = r6.f5736a
            com.google.android.gms.measurement.internal.b r3 = r3.mo3162d()
            o7.f3 r3 = r3.f5675i
            java.lang.Long r4 = java.lang.Long.valueOf(r1)
            java.lang.String r5 = "Params already contained engagement"
            r3.m11170d(r5, r4)
        L1d:
            long r8 = r8 + r1
            r7.putLong(r0, r8)
            return
    }

    /* renamed from: w */
    public final void m3238w(android.os.Bundle r2, int r3, java.lang.String r4, java.lang.Object r5) {
            r1 = this;
            boolean r3 = m3189c0(r2, r3)
            if (r3 == 0) goto L2f
            com.google.android.gms.measurement.internal.d r3 = r1.f5736a
            java.util.Objects.requireNonNull(r3)
            r3 = 40
            r0 = 1
            java.lang.String r3 = r1.m3232r(r4, r3, r0)
            java.lang.String r4 = "_ev"
            r2.putString(r4, r3)
            if (r5 == 0) goto L2f
            boolean r3 = r5 instanceof java.lang.String
            if (r3 != 0) goto L21
            boolean r3 = r5 instanceof java.lang.CharSequence
            if (r3 == 0) goto L2f
        L21:
            java.lang.String r3 = java.lang.String.valueOf(r5)
            int r3 = r3.length()
            long r3 = (long) r3
            java.lang.String r5 = "_el"
            r2.putLong(r5, r3)
        L2f:
            return
    }

    /* renamed from: y */
    public final void m3239y(android.os.Bundle r5, android.os.Bundle r6) {
            r4 = this;
            if (r6 != 0) goto L3
            return
        L3:
            java.util.Set r0 = r6.keySet()
            java.util.Iterator r0 = r0.iterator()
        Lb:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2b
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            boolean r2 = r5.containsKey(r1)
            if (r2 != 0) goto Lb
            com.google.android.gms.measurement.internal.d r2 = r4.f5736a
            com.google.android.gms.measurement.internal.f r2 = r2.m3158A()
            java.lang.Object r3 = r6.get(r1)
            r2.m3197B(r5, r1, r3)
            goto Lb
        L2b:
            return
    }

    /* renamed from: z */
    public final void m3240z(p249o7.C5009h3 r9, int r10) {
            r8 = this;
            java.util.TreeSet r0 = new java.util.TreeSet
            java.lang.Object r1 = r9.f19723e
            android.os.Bundle r1 = (android.os.Bundle) r1
            java.util.Set r1 = r1.keySet()
            r0.<init>(r1)
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        L12:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L73
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            boolean r3 = m3185W(r2)
            if (r3 == 0) goto L12
            int r1 = r1 + 1
            if (r1 <= r10) goto L12
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r4 = 48
            r3.<init>(r4)
            java.lang.String r4 = "Event can't contain more than "
            r3.append(r4)
            r3.append(r10)
            java.lang.String r4 = " params"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.google.android.gms.measurement.internal.d r4 = r8.f5736a
            com.google.android.gms.measurement.internal.b r4 = r4.mo3162d()
            o7.f3 r4 = r4.f5674h
            com.google.android.gms.measurement.internal.d r5 = r8.f5736a
            o7.c3 r5 = r5.f5722m
            java.lang.Object r6 = r9.f19720b
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r5 = r5.m11116d(r6)
            com.google.android.gms.measurement.internal.d r6 = r8.f5736a
            o7.c3 r6 = r6.f5722m
            java.lang.Object r7 = r9.f19723e
            android.os.Bundle r7 = (android.os.Bundle) r7
            java.lang.String r6 = r6.m11114b(r7)
            r4.m11171e(r3, r5, r6)
            java.lang.Object r3 = r9.f19723e
            android.os.Bundle r3 = (android.os.Bundle) r3
            r4 = 5
            m3189c0(r3, r4)
            java.lang.Object r3 = r9.f19723e
            android.os.Bundle r3 = (android.os.Bundle) r3
            r3.remove(r2)
            goto L12
        L73:
            return
    }
}
