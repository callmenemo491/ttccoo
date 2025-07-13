package p244o2;

/* renamed from: o2.k */
/* loaded from: classes.dex */
public class C4887k {

    /* renamed from: a */
    public final p106g3.C2235g<p180k2.InterfaceC3671c, java.lang.String> f19382a;

    /* renamed from: b */
    public final p212m0.InterfaceC4313c<p244o2.C4887k.b> f19383b;

    /* renamed from: o2.k$a */
    public class a implements p120h3.C2451a.b<p244o2.C4887k.b> {
        public a(p244o2.C4887k r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // p120h3.C2451a.b
        /* renamed from: a */
        public p244o2.C4887k.b mo6229a() {
                r2 = this;
                o2.k$b r0 = new o2.k$b     // Catch: java.security.NoSuchAlgorithmException -> Lc
                java.lang.String r1 = "SHA-256"
                java.security.MessageDigest r1 = java.security.MessageDigest.getInstance(r1)     // Catch: java.security.NoSuchAlgorithmException -> Lc
                r0.<init>(r1)     // Catch: java.security.NoSuchAlgorithmException -> Lc
                return r0
            Lc:
                r0 = move-exception
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                r1.<init>(r0)
                throw r1
        }
    }

    /* renamed from: o2.k$b */
    public static final class b implements p120h3.C2451a.d {

        /* renamed from: Y */
        public final java.security.MessageDigest f19384Y;

        /* renamed from: Z */
        public final p120h3.AbstractC2454d f19385Z;

        public b(java.security.MessageDigest r2) {
                r1 = this;
                r1.<init>()
                h3.d$b r0 = new h3.d$b
                r0.<init>()
                r1.f19385Z = r0
                r1.f19384Y = r2
                return
        }

        @Override // p120h3.C2451a.d
        /* renamed from: k */
        public p120h3.AbstractC2454d mo6232k() {
                r1 = this;
                h3.d r0 = r1.f19385Z
                return r0
        }
    }

    public C4887k() {
            r3 = this;
            r3.<init>()
            g3.g r0 = new g3.g
            r1 = 1000(0x3e8, double:4.94E-321)
            r0.<init>(r1)
            r3.f19382a = r0
            o2.k$a r0 = new o2.k$a
            r0.<init>(r3)
            r1 = 10
            m0.c r0 = p120h3.C2451a.m6227a(r1, r0)
            r3.f19383b = r0
            return
    }

    /* renamed from: a */
    public java.lang.String m11029a(p180k2.InterfaceC3671c r9) {
            r8 = this;
            g3.g<k2.c, java.lang.String> r0 = r8.f19382a
            monitor-enter(r0)
            g3.g<k2.c, java.lang.String> r1 = r8.f19382a     // Catch: java.lang.Throwable -> L69
            java.lang.Object r1 = r1.m5834a(r9)     // Catch: java.lang.Throwable -> L69
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L69
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L69
            if (r1 != 0) goto L5c
            m0.c<o2.k$b> r0 = r8.f19383b
            java.lang.Object r0 = r0.mo6231b()
            java.lang.String r1 = "Argument must not be null"
            java.util.Objects.requireNonNull(r0, r1)
            o2.k$b r0 = (p244o2.C4887k.b) r0
            java.security.MessageDigest r1 = r0.f19384Y     // Catch: java.lang.Throwable -> L55
            r9.mo5082b(r1)     // Catch: java.lang.Throwable -> L55
            java.security.MessageDigest r1 = r0.f19384Y     // Catch: java.lang.Throwable -> L55
            byte[] r1 = r1.digest()     // Catch: java.lang.Throwable -> L55
            char[] r2 = p106g3.C2238j.f10215b     // Catch: java.lang.Throwable -> L55
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L55
            r3 = 0
        L2a:
            int r4 = r1.length     // Catch: java.lang.Throwable -> L52
            if (r3 >= r4) goto L46
            r4 = r1[r3]     // Catch: java.lang.Throwable -> L52
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r5 = r3 * 2
            char[] r6 = p106g3.C2238j.f10214a     // Catch: java.lang.Throwable -> L52
            int r7 = r4 >>> 4
            char r7 = r6[r7]     // Catch: java.lang.Throwable -> L52
            r2[r5] = r7     // Catch: java.lang.Throwable -> L52
            int r5 = r5 + 1
            r4 = r4 & 15
            char r4 = r6[r4]     // Catch: java.lang.Throwable -> L52
            r2[r5] = r4     // Catch: java.lang.Throwable -> L52
            int r3 = r3 + 1
            goto L2a
        L46:
            java.lang.String r1 = new java.lang.String     // Catch: java.lang.Throwable -> L52
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L52
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L52
            m0.c<o2.k$b> r2 = r8.f19383b
            r2.mo6230a(r0)
            goto L5c
        L52:
            r9 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L52
            throw r9     // Catch: java.lang.Throwable -> L55
        L55:
            r9 = move-exception
            m0.c<o2.k$b> r1 = r8.f19383b
            r1.mo6230a(r0)
            throw r9
        L5c:
            g3.g<k2.c, java.lang.String> r2 = r8.f19382a
            monitor-enter(r2)
            g3.g<k2.c, java.lang.String> r0 = r8.f19382a     // Catch: java.lang.Throwable -> L66
            r0.m5837d(r9, r1)     // Catch: java.lang.Throwable -> L66
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L66
            return r1
        L66:
            r9 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L66
            throw r9
        L69:
            r9 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L69
            throw r9
    }
}
