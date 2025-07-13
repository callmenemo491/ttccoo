package p124h7;

/* renamed from: h7.t1 */
/* loaded from: classes.dex */
public final class C2865t1 {

    /* renamed from: a */
    public final p124h7.C2798p6 f11917a;

    public C2865t1(p124h7.C2798p6 r1) {
            r0 = this;
            r0.<init>()
            r0.f11917a = r1
            return
    }

    /* renamed from: d */
    public static p124h7.C2865t1 m7145d(p083f.C1933t r3) {
            h7.t1 r0 = new h7.t1
            java.util.Deque<java.lang.ref.WeakReference<org.xmlpull.v1.XmlPullParser>> r3 = r3.f8425Z
            h7.s6 r3 = (p124h7.C2852s6) r3
            r1 = 5
            r2 = 0
            java.lang.Object r1 = r3.mo6484h(r1, r2, r2)
            h7.vg r1 = (p124h7.C2916vg) r1
            r1.m7219a(r3)
            h7.p6 r1 = (p124h7.C2798p6) r1
            r0.<init>(r1)
            return r0
    }

    /* renamed from: f */
    public static int m7146f() {
            java.security.SecureRandom r0 = new java.security.SecureRandom
            r0.<init>()
            r1 = 4
            byte[] r1 = new byte[r1]
            r2 = 0
            r3 = 0
        La:
            if (r3 != 0) goto L2c
            r0.nextBytes(r1)
            r3 = r1[r2]
            r3 = r3 & 127(0x7f, float:1.78E-43)
            int r3 = r3 << 24
            r4 = 1
            r4 = r1[r4]
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r4 = r4 << 16
            r3 = r3 | r4
            r4 = 2
            r4 = r1[r4]
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r4 = r4 << 8
            r3 = r3 | r4
            r4 = 3
            r4 = r1[r4]
            r4 = r4 & 255(0xff, float:3.57E-43)
            r3 = r3 | r4
            goto La
        L2c:
            return r3
    }

    @java.lang.Deprecated
    /* renamed from: a */
    public final synchronized int m7147a(p124h7.C2744m6 r3) {
            r2 = this;
            monitor-enter(r2)
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L2b
            h7.j6 r0 = p124h7.C2650h2.m6770a(r3)     // Catch: java.lang.Throwable -> L28
            h7.d7 r3 = r3.m6979v()     // Catch: java.lang.Throwable -> L28
            h7.r6 r3 = r2.m7151g(r0, r3)     // Catch: java.lang.Throwable -> L28
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2b
            h7.p6 r0 = r2.f11917a     // Catch: java.lang.Throwable -> L2b
            boolean r1 = r0.f11974a0     // Catch: java.lang.Throwable -> L2b
            if (r1 == 0) goto L1b
            r0.m7222d()     // Catch: java.lang.Throwable -> L2b
            r1 = 0
            r0.f11974a0 = r1     // Catch: java.lang.Throwable -> L2b
        L1b:
            MessageType extends h7.yg<MessageType, BuilderType> r0 = r0.f11973Z     // Catch: java.lang.Throwable -> L2b
            h7.s6 r0 = (p124h7.C2852s6) r0     // Catch: java.lang.Throwable -> L2b
            p124h7.C2852s6.m7128A(r0, r3)     // Catch: java.lang.Throwable -> L2b
            int r3 = r3.m7075r()     // Catch: java.lang.Throwable -> L2b
            monitor-exit(r2)
            return r3
        L28:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2b
            throw r3     // Catch: java.lang.Throwable -> L2b
        L2b:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
    }

    /* renamed from: b */
    public final synchronized p083f.C1933t m7148b() {
            r1 = this;
            monitor-enter(r1)
            h7.p6 r0 = r1.f11917a     // Catch: java.lang.Throwable -> Lf
            h7.yg r0 = r0.m7220b()     // Catch: java.lang.Throwable -> Lf
            h7.s6 r0 = (p124h7.C2852s6) r0     // Catch: java.lang.Throwable -> Lf
            f.t r0 = p083f.C1933t.m4775A(r0)     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r1)
            return r0
        Lf:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    /* renamed from: c */
    public final synchronized p124h7.C2865t1 m7149c(int r5) {
            r4 = this;
            monitor-enter(r4)
            r0 = 0
            r1 = 0
        L3:
            h7.p6 r2 = r4.f11917a     // Catch: java.lang.Throwable -> L74
            MessageType extends h7.yg<MessageType, BuilderType> r2 = r2.f11973Z     // Catch: java.lang.Throwable -> L74
            h7.s6 r2 = (p124h7.C2852s6) r2     // Catch: java.lang.Throwable -> L74
            int r2 = r2.m7133r()     // Catch: java.lang.Throwable -> L74
            if (r1 >= r2) goto L5b
            h7.p6 r2 = r4.f11917a     // Catch: java.lang.Throwable -> L74
            MessageType extends h7.yg<MessageType, BuilderType> r2 = r2.f11973Z     // Catch: java.lang.Throwable -> L74
            h7.s6 r2 = (p124h7.C2852s6) r2     // Catch: java.lang.Throwable -> L74
            h7.r6 r2 = r2.m7135v(r1)     // Catch: java.lang.Throwable -> L74
            int r3 = r2.m7075r()     // Catch: java.lang.Throwable -> L74
            if (r3 != r5) goto L58
            h7.k6 r1 = r2.m7077u()     // Catch: java.lang.Throwable -> L74
            h7.k6 r2 = p124h7.EnumC2708k6.f11699a0     // Catch: java.lang.Throwable -> L74
            boolean r1 = r1.equals(r2)     // Catch: java.lang.Throwable -> L74
            if (r1 == 0) goto L3f
            h7.p6 r1 = r4.f11917a     // Catch: java.lang.Throwable -> L74
            boolean r2 = r1.f11974a0     // Catch: java.lang.Throwable -> L74
            if (r2 == 0) goto L36
            r1.m7222d()     // Catch: java.lang.Throwable -> L74
            r1.f11974a0 = r0     // Catch: java.lang.Throwable -> L74
        L36:
            MessageType extends h7.yg<MessageType, BuilderType> r0 = r1.f11973Z     // Catch: java.lang.Throwable -> L74
            h7.s6 r0 = (p124h7.C2852s6) r0     // Catch: java.lang.Throwable -> L74
            p124h7.C2852s6.m7132z(r0, r5)     // Catch: java.lang.Throwable -> L74
            monitor-exit(r4)
            return r4
        L3f:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException     // Catch: java.lang.Throwable -> L74
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L74
            r2 = 63
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L74
            java.lang.String r2 = "cannot set key as primary because it's not enabled: "
            r1.append(r2)     // Catch: java.lang.Throwable -> L74
            r1.append(r5)     // Catch: java.lang.Throwable -> L74
            java.lang.String r5 = r1.toString()     // Catch: java.lang.Throwable -> L74
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L74
            throw r0     // Catch: java.lang.Throwable -> L74
        L58:
            int r1 = r1 + 1
            goto L3
        L5b:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException     // Catch: java.lang.Throwable -> L74
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L74
            r2 = 26
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L74
            java.lang.String r2 = "key not found: "
            r1.append(r2)     // Catch: java.lang.Throwable -> L74
            r1.append(r5)     // Catch: java.lang.Throwable -> L74
            java.lang.String r5 = r1.toString()     // Catch: java.lang.Throwable -> L74
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L74
            throw r0     // Catch: java.lang.Throwable -> L74
        L74:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
    }

    /* renamed from: e */
    public final synchronized int m7150e() {
            r3 = this;
            monitor-enter(r3)
        L1:
            int r0 = m7146f()     // Catch: java.lang.Throwable -> L36
            monitor-enter(r3)     // Catch: java.lang.Throwable -> L36
            h7.p6 r1 = r3.f11917a     // Catch: java.lang.Throwable -> L33
            MessageType extends h7.yg<MessageType, BuilderType> r1 = r1.f11973Z     // Catch: java.lang.Throwable -> L33
            h7.s6 r1 = (p124h7.C2852s6) r1     // Catch: java.lang.Throwable -> L33
            java.util.List r1 = r1.m7136y()     // Catch: java.lang.Throwable -> L33
            java.util.List r1 = java.util.Collections.unmodifiableList(r1)     // Catch: java.lang.Throwable -> L33
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L33
        L18:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L33
            if (r2 == 0) goto L2c
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L33
            h7.r6 r2 = (p124h7.C2834r6) r2     // Catch: java.lang.Throwable -> L33
            int r2 = r2.m7075r()     // Catch: java.lang.Throwable -> L33
            if (r2 != r0) goto L18
            r1 = 1
            goto L2d
        L2c:
            r1 = 0
        L2d:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L36
            if (r1 == 0) goto L31
            goto L1
        L31:
            monitor-exit(r3)
            return r0
        L33:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L36
            throw r0     // Catch: java.lang.Throwable -> L36
        L36:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
    }

    /* renamed from: g */
    public final synchronized p124h7.C2834r6 m7151g(p124h7.C2690j6 r5, p124h7.EnumC2583d7 r6) {
            r4 = this;
            monitor-enter(r4)
            int r0 = r4.m7150e()     // Catch: java.lang.Throwable -> L60
            h7.d7 r1 = p124h7.EnumC2583d7.f11441Z     // Catch: java.lang.Throwable -> L60
            if (r6 == r1) goto L58
            h7.q6 r1 = p124h7.C2834r6.m7070v()     // Catch: java.lang.Throwable -> L60
            boolean r2 = r1.f11974a0     // Catch: java.lang.Throwable -> L60
            r3 = 0
            if (r2 == 0) goto L17
            r1.m7222d()     // Catch: java.lang.Throwable -> L60
            r1.f11974a0 = r3     // Catch: java.lang.Throwable -> L60
        L17:
            MessageType extends h7.yg<MessageType, BuilderType> r2 = r1.f11973Z     // Catch: java.lang.Throwable -> L60
            h7.r6 r2 = (p124h7.C2834r6) r2     // Catch: java.lang.Throwable -> L60
            p124h7.C2834r6.m7072y(r2, r5)     // Catch: java.lang.Throwable -> L60
            boolean r5 = r1.f11974a0     // Catch: java.lang.Throwable -> L60
            if (r5 == 0) goto L27
            r1.m7222d()     // Catch: java.lang.Throwable -> L60
            r1.f11974a0 = r3     // Catch: java.lang.Throwable -> L60
        L27:
            MessageType extends h7.yg<MessageType, BuilderType> r5 = r1.f11973Z     // Catch: java.lang.Throwable -> L60
            h7.r6 r5 = (p124h7.C2834r6) r5     // Catch: java.lang.Throwable -> L60
            p124h7.C2834r6.m7069B(r5, r0)     // Catch: java.lang.Throwable -> L60
            h7.k6 r5 = p124h7.EnumC2708k6.f11699a0     // Catch: java.lang.Throwable -> L60
            boolean r0 = r1.f11974a0     // Catch: java.lang.Throwable -> L60
            if (r0 == 0) goto L39
            r1.m7222d()     // Catch: java.lang.Throwable -> L60
            r1.f11974a0 = r3     // Catch: java.lang.Throwable -> L60
        L39:
            MessageType extends h7.yg<MessageType, BuilderType> r0 = r1.f11973Z     // Catch: java.lang.Throwable -> L60
            h7.r6 r0 = (p124h7.C2834r6) r0     // Catch: java.lang.Throwable -> L60
            p124h7.C2834r6.m7068A(r0, r5)     // Catch: java.lang.Throwable -> L60
            boolean r5 = r1.f11974a0     // Catch: java.lang.Throwable -> L60
            if (r5 == 0) goto L49
            r1.m7222d()     // Catch: java.lang.Throwable -> L60
            r1.f11974a0 = r3     // Catch: java.lang.Throwable -> L60
        L49:
            MessageType extends h7.yg<MessageType, BuilderType> r5 = r1.f11973Z     // Catch: java.lang.Throwable -> L60
            h7.r6 r5 = (p124h7.C2834r6) r5     // Catch: java.lang.Throwable -> L60
            p124h7.C2834r6.m7073z(r5, r6)     // Catch: java.lang.Throwable -> L60
            h7.yg r5 = r1.m7220b()     // Catch: java.lang.Throwable -> L60
            h7.r6 r5 = (p124h7.C2834r6) r5     // Catch: java.lang.Throwable -> L60
            monitor-exit(r4)
            return r5
        L58:
            java.security.GeneralSecurityException r5 = new java.security.GeneralSecurityException     // Catch: java.lang.Throwable -> L60
            java.lang.String r6 = "unknown output prefix type"
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L60
            throw r5     // Catch: java.lang.Throwable -> L60
        L60:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
    }
}
