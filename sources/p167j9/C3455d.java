package p167j9;

/* renamed from: j9.d */
/* loaded from: classes.dex */
public class C3455d implements p093f9.InterfaceC2097o<p093f9.InterfaceC2095m> {

    /* renamed from: a */
    public static final java.util.logging.Logger f14925a = null;

    /* renamed from: j9.d$a */
    public static /* synthetic */ class a {
    }

    /* renamed from: j9.d$b */
    public static class b implements p093f9.InterfaceC2095m {

        /* renamed from: a */
        public final p093f9.C2096n<p093f9.InterfaceC2095m> f14926a;

        /* renamed from: b */
        public final byte[] f14927b;

        public b(p093f9.C2096n r2, p167j9.C3455d.a r3) {
                r1 = this;
                r1.<init>()
                r3 = 1
                byte[] r3 = new byte[r3]
                r0 = 0
                r3[r0] = r0
                r1.f14927b = r3
                r1.f14926a = r2
                return
        }

        @Override // p093f9.InterfaceC2095m
        /* renamed from: a */
        public void mo5536a(byte[] r7, byte[] r8) {
                r6 = this;
                int r0 = r7.length
                r1 = 5
                if (r0 <= r1) goto L8c
                byte[] r0 = java.util.Arrays.copyOf(r7, r1)
                int r2 = r7.length
                byte[] r1 = java.util.Arrays.copyOfRange(r7, r1, r2)
                f9.n<f9.m> r2 = r6.f14926a
                java.util.List r0 = r2.m5538a(r0)
                java.util.Iterator r0 = r0.iterator()
            L17:
                boolean r2 = r0.hasNext()
                if (r2 == 0) goto L64
                java.lang.Object r2 = r0.next()
                f9.n$a r2 = (p093f9.C2096n.a) r2
                l9.g0 r3 = r2.f9522d     // Catch: java.security.GeneralSecurityException -> L4c
                l9.g0 r4 = p204l9.EnumC4210g0.f17363b0     // Catch: java.security.GeneralSecurityException -> L4c
                boolean r3 = r3.equals(r4)     // Catch: java.security.GeneralSecurityException -> L4c
                if (r3 == 0) goto L44
                P r2 = r2.f9519a     // Catch: java.security.GeneralSecurityException -> L4c
                f9.m r2 = (p093f9.InterfaceC2095m) r2     // Catch: java.security.GeneralSecurityException -> L4c
                r3 = 2
                byte[][] r3 = new byte[r3][]     // Catch: java.security.GeneralSecurityException -> L4c
                r4 = 0
                r3[r4] = r8     // Catch: java.security.GeneralSecurityException -> L4c
                r4 = 1
                byte[] r5 = r6.f14927b     // Catch: java.security.GeneralSecurityException -> L4c
                r3[r4] = r5     // Catch: java.security.GeneralSecurityException -> L4c
                byte[] r3 = p185k7.C3828h5.m8589d(r3)     // Catch: java.security.GeneralSecurityException -> L4c
                r2.mo5536a(r1, r3)     // Catch: java.security.GeneralSecurityException -> L4c
                goto L4b
            L44:
                P r2 = r2.f9519a     // Catch: java.security.GeneralSecurityException -> L4c
                f9.m r2 = (p093f9.InterfaceC2095m) r2     // Catch: java.security.GeneralSecurityException -> L4c
                r2.mo5536a(r1, r8)     // Catch: java.security.GeneralSecurityException -> L4c
            L4b:
                return
            L4c:
                r2 = move-exception
                java.util.logging.Logger r3 = p167j9.C3455d.f14925a
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = "tag prefix matches a key, but cannot verify: "
                r4.append(r5)
                r4.append(r2)
                java.lang.String r2 = r4.toString()
                r3.info(r2)
                goto L17
            L64:
                f9.n<f9.m> r0 = r6.f14926a
                java.util.List r0 = r0.m5539b()
                java.util.Iterator r0 = r0.iterator()
            L6e:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L84
                java.lang.Object r1 = r0.next()
                f9.n$a r1 = (p093f9.C2096n.a) r1
                P r1 = r1.f9519a     // Catch: java.security.GeneralSecurityException -> L82
                f9.m r1 = (p093f9.InterfaceC2095m) r1     // Catch: java.security.GeneralSecurityException -> L82
                r1.mo5536a(r7, r8)     // Catch: java.security.GeneralSecurityException -> L82
                return
            L82:
                goto L6e
            L84:
                java.security.GeneralSecurityException r7 = new java.security.GeneralSecurityException
                java.lang.String r8 = "invalid MAC"
                r7.<init>(r8)
                throw r7
            L8c:
                java.security.GeneralSecurityException r7 = new java.security.GeneralSecurityException
                java.lang.String r8 = "tag too short"
                r7.<init>(r8)
                throw r7
        }

        @Override // p093f9.InterfaceC2095m
        /* renamed from: b */
        public byte[] mo5537b(byte[] r6) {
                r5 = this;
                f9.n<f9.m> r0 = r5.f14926a
                f9.n$a<P> r0 = r0.f9517b
                l9.g0 r0 = r0.f9522d
                l9.g0 r1 = p204l9.EnumC4210g0.f17363b0
                boolean r0 = r0.equals(r1)
                r1 = 1
                r2 = 0
                r3 = 2
                if (r0 == 0) goto L3c
                byte[][] r0 = new byte[r3][]
                f9.n<f9.m> r4 = r5.f14926a
                f9.n$a<P> r4 = r4.f9517b
                byte[] r4 = r4.m5540a()
                r0[r2] = r4
                f9.n<f9.m> r4 = r5.f14926a
                f9.n$a<P> r4 = r4.f9517b
                P r4 = r4.f9519a
                f9.m r4 = (p093f9.InterfaceC2095m) r4
                byte[][] r3 = new byte[r3][]
                r3[r2] = r6
                byte[] r6 = r5.f14927b
                r3[r1] = r6
                byte[] r6 = p185k7.C3828h5.m8589d(r3)
                byte[] r6 = r4.mo5537b(r6)
                r0[r1] = r6
                byte[] r6 = p185k7.C3828h5.m8589d(r0)
                return r6
            L3c:
                byte[][] r0 = new byte[r3][]
                f9.n<f9.m> r3 = r5.f14926a
                f9.n$a<P> r3 = r3.f9517b
                byte[] r3 = r3.m5540a()
                r0[r2] = r3
                f9.n<f9.m> r2 = r5.f14926a
                f9.n$a<P> r2 = r2.f9517b
                P r2 = r2.f9519a
                f9.m r2 = (p093f9.InterfaceC2095m) r2
                byte[] r6 = r2.mo5537b(r6)
                r0[r1] = r6
                byte[] r6 = p185k7.C3828h5.m8589d(r0)
                return r6
        }
    }

    static {
            java.lang.Class<j9.d> r0 = p167j9.C3455d.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            p167j9.C3455d.f14925a = r0
            return
    }

    public C3455d() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // p093f9.InterfaceC2097o
    /* renamed from: a */
    public p093f9.InterfaceC2095m mo5541a(p093f9.C2096n<p093f9.InterfaceC2095m> r3) {
            r2 = this;
            j9.d$b r0 = new j9.d$b
            r1 = 0
            r0.<init>(r3, r1)
            return r0
    }

    @Override // p093f9.InterfaceC2097o
    /* renamed from: b */
    public java.lang.Class<p093f9.InterfaceC2095m> mo5542b() {
            r1 = this;
            java.lang.Class<f9.m> r0 = p093f9.InterfaceC2095m.class
            return r0
    }
}
