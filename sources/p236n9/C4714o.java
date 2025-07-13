package p236n9;

/* renamed from: n9.o */
/* loaded from: classes.dex */
public final class C4714o implements p187k9.InterfaceC4073a {

    /* renamed from: a */
    public final java.lang.ThreadLocal<javax.crypto.Mac> f18825a;

    /* renamed from: b */
    public final java.lang.String f18826b;

    /* renamed from: c */
    public final java.security.Key f18827c;

    /* renamed from: d */
    public final int f18828d;

    /* renamed from: n9.o$a */
    public class a extends java.lang.ThreadLocal<javax.crypto.Mac> {

        /* renamed from: a */
        public final /* synthetic */ p236n9.C4714o f18829a;

        public a(p236n9.C4714o r1) {
                r0 = this;
                r0.f18829a = r1
                r0.<init>()
                return
        }

        @Override // java.lang.ThreadLocal
        public javax.crypto.Mac initialValue() {
                r2 = this;
                n9.l<n9.m$b, javax.crypto.Mac> r0 = p236n9.C4711l.f18822f     // Catch: java.security.GeneralSecurityException -> L14
                n9.o r1 = r2.f18829a     // Catch: java.security.GeneralSecurityException -> L14
                java.lang.String r1 = r1.f18826b     // Catch: java.security.GeneralSecurityException -> L14
                java.lang.Object r0 = r0.m10770a(r1)     // Catch: java.security.GeneralSecurityException -> L14
                javax.crypto.Mac r0 = (javax.crypto.Mac) r0     // Catch: java.security.GeneralSecurityException -> L14
                n9.o r1 = r2.f18829a     // Catch: java.security.GeneralSecurityException -> L14
                java.security.Key r1 = r1.f18827c     // Catch: java.security.GeneralSecurityException -> L14
                r0.init(r1)     // Catch: java.security.GeneralSecurityException -> L14
                return r0
            L14:
                r0 = move-exception
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                r1.<init>(r0)
                throw r1
        }
    }

    public C4714o(java.lang.String r3, java.security.Key r4) {
            r2 = this;
            r2.<init>()
            n9.o$a r0 = new n9.o$a
            r0.<init>(r2)
            r2.f18825a = r0
            r2.f18826b = r3
            r2.f18827c = r4
            byte[] r4 = r4.getEncoded()
            int r4 = r4.length
            r1 = 16
            if (r4 < r1) goto L5d
            r4 = -1
            int r1 = r3.hashCode()
            switch(r1) {
                case -1823053428: goto L36;
                case 392315118: goto L2b;
                case 392317873: goto L20;
                default: goto L1f;
            }
        L1f:
            goto L40
        L20:
            java.lang.String r1 = "HMACSHA512"
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L29
            goto L40
        L29:
            r4 = 2
            goto L40
        L2b:
            java.lang.String r1 = "HMACSHA256"
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L34
            goto L40
        L34:
            r4 = 1
            goto L40
        L36:
            java.lang.String r1 = "HMACSHA1"
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L3f
            goto L40
        L3f:
            r4 = 0
        L40:
            switch(r4) {
                case 0: goto L55;
                case 1: goto L52;
                case 2: goto L4f;
                default: goto L43;
            }
        L43:
            java.security.NoSuchAlgorithmException r4 = new java.security.NoSuchAlgorithmException
            java.lang.String r0 = "unknown Hmac algorithm: "
            java.lang.String r3 = p064e.C1493g.m4049a(r0, r3)
            r4.<init>(r3)
            throw r4
        L4f:
            r3 = 64
            goto L57
        L52:
            r3 = 32
            goto L57
        L55:
            r3 = 20
        L57:
            r2.f18828d = r3
            r0.get()
            return
        L5d:
            java.security.InvalidAlgorithmParameterException r3 = new java.security.InvalidAlgorithmParameterException
            java.lang.String r4 = "key size too small, need at least 16 bytes"
            r3.<init>(r4)
            throw r3
    }

    /* renamed from: a */
    public byte[] m10772a(byte[] r2, int r3) {
            r1 = this;
            int r0 = r1.f18828d
            if (r3 > r0) goto L20
            java.lang.ThreadLocal<javax.crypto.Mac> r0 = r1.f18825a
            java.lang.Object r0 = r0.get()
            javax.crypto.Mac r0 = (javax.crypto.Mac) r0
            r0.update(r2)
            java.lang.ThreadLocal<javax.crypto.Mac> r2 = r1.f18825a
            java.lang.Object r2 = r2.get()
            javax.crypto.Mac r2 = (javax.crypto.Mac) r2
            byte[] r2 = r2.doFinal()
            byte[] r2 = java.util.Arrays.copyOf(r2, r3)
            return r2
        L20:
            java.security.InvalidAlgorithmParameterException r2 = new java.security.InvalidAlgorithmParameterException
            java.lang.String r3 = "tag size too big"
            r2.<init>(r3)
            throw r2
    }
}
