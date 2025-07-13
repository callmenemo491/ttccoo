package p126h9;

/* renamed from: h9.c */
/* loaded from: classes.dex */
public class C2993c implements p093f9.InterfaceC2097o<p093f9.InterfaceC2085c> {

    /* renamed from: a */
    public static final java.util.logging.Logger f12082a = null;

    /* renamed from: h9.c$a */
    public static class a implements p093f9.InterfaceC2085c {

        /* renamed from: a */
        public p093f9.C2096n<p093f9.InterfaceC2085c> f12083a;

        public a(p093f9.C2096n<p093f9.InterfaceC2085c> r1) {
                r0 = this;
                r0.<init>()
                r0.f12083a = r1
                return
        }

        @Override // p093f9.InterfaceC2085c
        /* renamed from: a */
        public byte[] mo5508a(byte[] r4, byte[] r5) {
                r3 = this;
                r0 = 2
                byte[][] r0 = new byte[r0][]
                f9.n<f9.c> r1 = r3.f12083a
                f9.n$a<P> r1 = r1.f9517b
                byte[] r1 = r1.m5540a()
                r2 = 0
                r0[r2] = r1
                r1 = 1
                f9.n<f9.c> r2 = r3.f12083a
                f9.n$a<P> r2 = r2.f9517b
                P r2 = r2.f9519a
                f9.c r2 = (p093f9.InterfaceC2085c) r2
                byte[] r4 = r2.mo5508a(r4, r5)
                r0[r1] = r4
                byte[] r4 = p185k7.C3828h5.m8589d(r0)
                return r4
        }

        @Override // p093f9.InterfaceC2085c
        /* renamed from: b */
        public byte[] mo5509b(byte[] r6, byte[] r7) {
                r5 = this;
                int r0 = r6.length
                r1 = 5
                if (r0 <= r1) goto L45
                r0 = 0
                byte[] r0 = java.util.Arrays.copyOfRange(r6, r0, r1)
                int r2 = r6.length
                byte[] r1 = java.util.Arrays.copyOfRange(r6, r1, r2)
                f9.n<f9.c> r2 = r5.f12083a
                java.util.List r0 = r2.m5538a(r0)
                java.util.Iterator r0 = r0.iterator()
            L18:
                boolean r2 = r0.hasNext()
                if (r2 == 0) goto L45
                java.lang.Object r2 = r0.next()
                f9.n$a r2 = (p093f9.C2096n.a) r2
                P r2 = r2.f9519a     // Catch: java.security.GeneralSecurityException -> L2d
                f9.c r2 = (p093f9.InterfaceC2085c) r2     // Catch: java.security.GeneralSecurityException -> L2d
                byte[] r6 = r2.mo5509b(r1, r7)     // Catch: java.security.GeneralSecurityException -> L2d
                return r6
            L2d:
                r2 = move-exception
                java.util.logging.Logger r3 = p126h9.C2993c.f12082a
                java.lang.String r4 = "ciphertext prefix matches a key, but cannot decrypt: "
                java.lang.StringBuilder r4 = android.support.v4.media.C0144c.m256a(r4)
                java.lang.String r2 = r2.toString()
                r4.append(r2)
                java.lang.String r2 = r4.toString()
                r3.info(r2)
                goto L18
            L45:
                f9.n<f9.c> r0 = r5.f12083a
                java.util.List r0 = r0.m5539b()
                java.util.Iterator r0 = r0.iterator()
            L4f:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L66
                java.lang.Object r1 = r0.next()
                f9.n$a r1 = (p093f9.C2096n.a) r1
                P r1 = r1.f9519a     // Catch: java.security.GeneralSecurityException -> L64
                f9.c r1 = (p093f9.InterfaceC2085c) r1     // Catch: java.security.GeneralSecurityException -> L64
                byte[] r6 = r1.mo5509b(r6, r7)     // Catch: java.security.GeneralSecurityException -> L64
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
            java.lang.Class<h9.c> r0 = p126h9.C2993c.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            p126h9.C2993c.f12082a = r0
            return
    }

    public C2993c() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // p093f9.InterfaceC2097o
    /* renamed from: a */
    public p093f9.InterfaceC2085c mo5541a(p093f9.C2096n<p093f9.InterfaceC2085c> r2) {
            r1 = this;
            h9.c$a r0 = new h9.c$a
            r0.<init>(r2)
            return r0
    }

    @Override // p093f9.InterfaceC2097o
    /* renamed from: b */
    public java.lang.Class<p093f9.InterfaceC2085c> mo5542b() {
            r1 = this;
            java.lang.Class<f9.c> r0 = p093f9.InterfaceC2085c.class
            return r0
    }
}
