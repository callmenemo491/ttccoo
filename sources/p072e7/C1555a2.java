package p072e7;

/* renamed from: e7.a2 */
/* loaded from: classes.dex */
public final class C1555a2 {

    /* renamed from: d */
    public static final p123h6.C2489b f7477d = null;

    /* renamed from: e */
    public static final java.lang.String f7478e = null;

    /* renamed from: a */
    public final java.lang.String f7479a;

    /* renamed from: b */
    public final java.util.Map<java.lang.Integer, java.lang.Integer> f7480b;

    /* renamed from: c */
    public final java.util.Map<java.lang.Integer, java.lang.Integer> f7481c;

    static {
            h6.b r0 = new h6.b
            java.lang.String r1 = "ApplicationAnalyticsUtils"
            r0.<init>(r1)
            p072e7.C1555a2.f7477d = r0
            java.lang.String r0 = "20.1.0"
            p072e7.C1555a2.f7478e = r0
            return
    }

    public C1555a2(android.os.Bundle r1, java.lang.String r2) {
            r0 = this;
            r0.<init>()
            r0.f7479a = r2
            java.lang.String r2 = "com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_ERROR"
            java.util.Map r2 = p072e7.C1607f4.m4192a(r1, r2)
            r0.f7480b = r2
            java.lang.String r2 = "com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_CHANGE_REASON"
            java.util.Map r1 = p072e7.C1607f4.m4192a(r1, r2)
            r0.f7481c = r1
            return
    }

    /* renamed from: c */
    public static void m4114c(p072e7.C1789y2 r2, boolean r3) {
            e7.t2 r0 = r2.m4491f()
            e7.s2 r0 = p072e7.C1744t2.m4440l(r0)
            boolean r1 = r0.f7817a0
            if (r1 == 0) goto L12
            r0.m4461e()
            r1 = 0
            r0.f7817a0 = r1
        L12:
            MessageType extends e7.x5<MessageType, BuilderType> r1 = r0.f7816Z
            e7.t2 r1 = (p072e7.C1744t2) r1
            p072e7.C1744t2.m4444q(r1, r3)
            r2.m4492g(r0)
            return
    }

    @org.checkerframework.dataflow.qual.Pure
    /* renamed from: a */
    public final p072e7.C1798z2 m4115a(p072e7.C1714q1 r5, int r6) {
            r4 = this;
            e7.y2 r5 = r4.m4116b(r5)
            e7.t2 r0 = r5.m4491f()
            e7.s2 r0 = p072e7.C1744t2.m4440l(r0)
            java.util.Map<java.lang.Integer, java.lang.Integer> r1 = r4.f7481c
            java.lang.String r2 = "null reference"
            if (r1 == 0) goto L2d
            java.lang.Integer r3 = java.lang.Integer.valueOf(r6)
            boolean r1 = r1.containsKey(r3)
            if (r1 != 0) goto L1d
            goto L2d
        L1d:
            java.util.Map<java.lang.Integer, java.lang.Integer> r1 = r4.f7481c
            java.lang.Object r1 = r1.get(r3)
            java.lang.Integer r1 = (java.lang.Integer) r1
            java.util.Objects.requireNonNull(r1, r2)
            int r1 = r1.intValue()
            goto L2f
        L2d:
            int r1 = r6 + 10000
        L2f:
            r0.m4435f(r1)
            java.util.Map<java.lang.Integer, java.lang.Integer> r1 = r4.f7480b
            if (r1 == 0) goto L51
            java.lang.Integer r3 = java.lang.Integer.valueOf(r6)
            boolean r1 = r1.containsKey(r3)
            if (r1 != 0) goto L41
            goto L51
        L41:
            java.util.Map<java.lang.Integer, java.lang.Integer> r6 = r4.f7480b
            java.lang.Object r6 = r6.get(r3)
            java.lang.Integer r6 = (java.lang.Integer) r6
            java.util.Objects.requireNonNull(r6, r2)
            int r6 = r6.intValue()
            goto L53
        L51:
            int r6 = r6 + 10000
        L53:
            boolean r1 = r0.f7817a0
            if (r1 == 0) goto L5d
            r0.m4461e()
            r1 = 0
            r0.f7817a0 = r1
        L5d:
            MessageType extends e7.x5<MessageType, BuilderType> r1 = r0.f7816Z
            e7.t2 r1 = (p072e7.C1744t2) r1
            p072e7.C1744t2.m4447t(r1, r6)
            e7.x5 r6 = r0.m4459c()
            e7.t2 r6 = (p072e7.C1744t2) r6
            r5.m4493o(r6)
            e7.x5 r5 = r5.m4459c()
            e7.z2 r5 = (p072e7.C1798z2) r5
            return r5
    }

    /* renamed from: b */
    public final p072e7.C1789y2 m4116b(p072e7.C1714q1 r9) {
            r8 = this;
            e7.y2 r0 = p072e7.C1798z2.m4500l()
            long r1 = r9.f7748c
            boolean r3 = r0.f7817a0
            r4 = 0
            if (r3 == 0) goto L10
            r0.m4461e()
            r0.f7817a0 = r4
        L10:
            MessageType extends e7.x5<MessageType, BuilderType> r3 = r0.f7816Z
            e7.z2 r3 = (p072e7.C1798z2) r3
            p072e7.C1798z2.m4507t(r3, r1)
            int r1 = r9.f7749d
            int r2 = r1 + 1
            r9.f7749d = r2
            boolean r2 = r0.f7817a0
            if (r2 == 0) goto L26
            r0.m4461e()
            r0.f7817a0 = r4
        L26:
            MessageType extends e7.x5<MessageType, BuilderType> r2 = r0.f7816Z
            e7.z2 r2 = (p072e7.C1798z2) r2
            p072e7.C1798z2.m4503p(r2, r1)
            java.lang.String r1 = r9.f7747b
            if (r1 == 0) goto L41
            boolean r2 = r0.f7817a0
            if (r2 == 0) goto L3a
            r0.m4461e()
            r0.f7817a0 = r4
        L3a:
            MessageType extends e7.x5<MessageType, BuilderType> r2 = r0.f7816Z
            e7.z2 r2 = (p072e7.C1798z2) r2
            p072e7.C1798z2.m4510x(r2, r1)
        L41:
            java.lang.String r1 = r9.f7752g
            if (r1 == 0) goto L55
            boolean r2 = r0.f7817a0
            if (r2 == 0) goto L4e
            r0.m4461e()
            r0.f7817a0 = r4
        L4e:
            MessageType extends e7.x5<MessageType, BuilderType> r2 = r0.f7816Z
            e7.z2 r2 = (p072e7.C1798z2) r2
            p072e7.C1798z2.m4508v(r2, r1)
        L55:
            e7.q2 r1 = p072e7.C1725r2.m4426i()
            java.lang.String r2 = p072e7.C1555a2.f7478e
            boolean r3 = r1.f7817a0
            if (r3 == 0) goto L64
            r1.m4461e()
            r1.f7817a0 = r4
        L64:
            MessageType extends e7.x5<MessageType, BuilderType> r3 = r1.f7816Z
            e7.r2 r3 = (p072e7.C1725r2) r3
            p072e7.C1725r2.m4429o(r3, r2)
            java.lang.String r2 = r8.f7479a
            boolean r3 = r1.f7817a0
            if (r3 == 0) goto L76
            r1.m4461e()
            r1.f7817a0 = r4
        L76:
            MessageType extends e7.x5<MessageType, BuilderType> r3 = r1.f7816Z
            e7.r2 r3 = (p072e7.C1725r2) r3
            p072e7.C1725r2.m4428n(r3, r2)
            e7.x5 r1 = r1.m4459c()
            e7.r2 r1 = (p072e7.C1725r2) r1
            boolean r2 = r0.f7817a0
            if (r2 == 0) goto L8c
            r0.m4461e()
            r0.f7817a0 = r4
        L8c:
            MessageType extends e7.x5<MessageType, BuilderType> r2 = r0.f7816Z
            e7.z2 r2 = (p072e7.C1798z2) r2
            p072e7.C1798z2.m4505r(r2, r1)
            e7.s2 r1 = p072e7.C1744t2.m4439i()
            java.lang.String r2 = r9.f7746a
            if (r2 == 0) goto Lc7
            e7.e3 r2 = p072e7.C1606f3.m4189i()
            java.lang.String r3 = r9.f7746a
            boolean r5 = r2.f7817a0
            if (r5 == 0) goto Laa
            r2.m4461e()
            r2.f7817a0 = r4
        Laa:
            MessageType extends e7.x5<MessageType, BuilderType> r5 = r2.f7816Z
            e7.f3 r5 = (p072e7.C1606f3) r5
            p072e7.C1606f3.m4191n(r5, r3)
            e7.x5 r2 = r2.m4459c()
            e7.f3 r2 = (p072e7.C1606f3) r2
            boolean r3 = r1.f7817a0
            if (r3 == 0) goto Lc0
            r1.m4461e()
            r1.f7817a0 = r4
        Lc0:
            MessageType extends e7.x5<MessageType, BuilderType> r3 = r1.f7816Z
            e7.t2 r3 = (p072e7.C1744t2) r3
            p072e7.C1744t2.m4443p(r3, r2)
        Lc7:
            boolean r2 = r1.f7817a0
            if (r2 == 0) goto Ld0
            r1.m4461e()
            r1.f7817a0 = r4
        Ld0:
            MessageType extends e7.x5<MessageType, BuilderType> r2 = r1.f7816Z
            e7.t2 r2 = (p072e7.C1744t2) r2
            p072e7.C1744t2.m4444q(r2, r4)
            java.lang.String r2 = r9.f7750e
            if (r2 == 0) goto L120
            java.lang.String r3 = "-"
            java.lang.String r5 = ""
            java.lang.String r3 = r2.replace(r3, r5)     // Catch: java.lang.NumberFormatException -> Lfb
            int r5 = r3.length()     // Catch: java.lang.NumberFormatException -> Lfb
            r6 = 16
            int r5 = java.lang.Math.min(r6, r5)     // Catch: java.lang.NumberFormatException -> Lfb
            java.lang.String r3 = r3.substring(r4, r5)     // Catch: java.lang.NumberFormatException -> Lfb
            java.math.BigInteger r5 = new java.math.BigInteger     // Catch: java.lang.NumberFormatException -> Lfb
            r5.<init>(r3, r6)     // Catch: java.lang.NumberFormatException -> Lfb
            long r2 = r5.longValue()     // Catch: java.lang.NumberFormatException -> Lfb
            goto L110
        Lfb:
            r3 = move-exception
            h6.b r5 = p072e7.C1555a2.f7477d
            r6 = 1
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r6[r4] = r2
            java.lang.String r2 = r5.f11253a
            java.lang.String r7 = "receiverSessionId %s is not valid for hash"
            java.lang.String r5 = r5.m6380e(r7, r6)
            android.util.Log.w(r2, r5, r3)
            r2 = 0
        L110:
            boolean r5 = r1.f7817a0
            if (r5 == 0) goto L119
            r1.m4461e()
            r1.f7817a0 = r4
        L119:
            MessageType extends e7.x5<MessageType, BuilderType> r5 = r1.f7816Z
            e7.t2 r5 = (p072e7.C1744t2) r5
            p072e7.C1744t2.m4445r(r5, r2)
        L120:
            int r9 = r9.f7751f
            boolean r2 = r1.f7817a0
            if (r2 == 0) goto L12b
            r1.m4461e()
            r1.f7817a0 = r4
        L12b:
            MessageType extends e7.x5<MessageType, BuilderType> r2 = r1.f7816Z
            e7.t2 r2 = (p072e7.C1744t2) r2
            p072e7.C1744t2.m4448v(r2, r9)
            r0.m4492g(r1)
            return r0
    }
}
