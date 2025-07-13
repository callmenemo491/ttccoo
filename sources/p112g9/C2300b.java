package p112g9;

/* renamed from: g9.b */
/* loaded from: classes.dex */
public class C2300b implements p093f9.InterfaceC2097o<p093f9.InterfaceC2083a> {

    /* renamed from: a */
    public static final java.util.logging.Logger f10517a = null;

    /* renamed from: g9.b$a */
    public static /* synthetic */ class a {
    }

    /* renamed from: g9.b$b */
    public static class b implements p093f9.InterfaceC2083a {

        /* renamed from: a */
        public final p093f9.C2096n<p093f9.InterfaceC2083a> f10518a;

        public b(p093f9.C2096n r1, p112g9.C2300b.a r2) {
                r0 = this;
                r0.<init>()
                r0.f10518a = r1
                return
        }

        @Override // p093f9.InterfaceC2083a
        /* renamed from: a */
        public byte[] mo5506a(byte[] r4, byte[] r5) {
                r3 = this;
                r0 = 2
                byte[][] r0 = new byte[r0][]
                f9.n<f9.a> r1 = r3.f10518a
                f9.n$a<P> r1 = r1.f9517b
                byte[] r1 = r1.m5540a()
                r2 = 0
                r0[r2] = r1
                r1 = 1
                f9.n<f9.a> r2 = r3.f10518a
                f9.n$a<P> r2 = r2.f9517b
                P r2 = r2.f9519a
                f9.a r2 = (p093f9.InterfaceC2083a) r2
                byte[] r4 = r2.mo5506a(r4, r5)
                r0[r1] = r4
                byte[] r4 = p185k7.C3828h5.m8589d(r0)
                return r4
        }

        @Override // p093f9.InterfaceC2083a
        /* renamed from: b */
        public byte[] mo5507b(byte[] r6, byte[] r7) {
                r5 = this;
                int r0 = r6.length
                r1 = 5
                if (r0 <= r1) goto L45
                r0 = 0
                byte[] r0 = java.util.Arrays.copyOfRange(r6, r0, r1)
                int r2 = r6.length
                byte[] r1 = java.util.Arrays.copyOfRange(r6, r1, r2)
                f9.n<f9.a> r2 = r5.f10518a
                java.util.List r0 = r2.m5538a(r0)
                java.util.Iterator r0 = r0.iterator()
            L18:
                boolean r2 = r0.hasNext()
                if (r2 == 0) goto L45
                java.lang.Object r2 = r0.next()
                f9.n$a r2 = (p093f9.C2096n.a) r2
                P r2 = r2.f9519a     // Catch: java.security.GeneralSecurityException -> L2d
                f9.a r2 = (p093f9.InterfaceC2083a) r2     // Catch: java.security.GeneralSecurityException -> L2d
                byte[] r6 = r2.mo5507b(r1, r7)     // Catch: java.security.GeneralSecurityException -> L2d
                return r6
            L2d:
                r2 = move-exception
                java.util.logging.Logger r3 = p112g9.C2300b.f10517a
                java.lang.String r4 = "ciphertext prefix matches a key, but cannot decrypt: "
                java.lang.StringBuilder r4 = android.support.v4.media.C0144c.m256a(r4)
                java.lang.String r2 = r2.toString()
                r4.append(r2)
                java.lang.String r2 = r4.toString()
                r3.info(r2)
                goto L18
            L45:
                f9.n<f9.a> r0 = r5.f10518a
                java.util.List r0 = r0.m5539b()
                java.util.Iterator r0 = r0.iterator()
            L4f:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L66
                java.lang.Object r1 = r0.next()
                f9.n$a r1 = (p093f9.C2096n.a) r1
                P r1 = r1.f9519a     // Catch: java.security.GeneralSecurityException -> L64
                f9.a r1 = (p093f9.InterfaceC2083a) r1     // Catch: java.security.GeneralSecurityException -> L64
                byte[] r6 = r1.mo5507b(r6, r7)     // Catch: java.security.GeneralSecurityException -> L64
                return r6
            L64:
                goto L4f
            L66:
                java.security.GeneralSecurityException r6 = new java.security.GeneralSecurityException
                java.lang.String r7 = "decryption failed"
                r6.<init>(r7)
                throw r6
        }
    }

    static {
            java.lang.Class<g9.b> r0 = p112g9.C2300b.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            p112g9.C2300b.f10517a = r0
            return
    }

    public C2300b() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // p093f9.InterfaceC2097o
    /* renamed from: a */
    public p093f9.InterfaceC2083a mo5541a(p093f9.C2096n<p093f9.InterfaceC2083a> r3) {
            r2 = this;
            g9.b$b r0 = new g9.b$b
            r1 = 0
            r0.<init>(r3, r1)
            return r0
    }

    @Override // p093f9.InterfaceC2097o
    /* renamed from: b */
    public java.lang.Class<p093f9.InterfaceC2083a> mo5542b() {
            r1 = this;
            java.lang.Class<f9.a> r0 = p093f9.InterfaceC2083a.class
            return r0
    }
}
