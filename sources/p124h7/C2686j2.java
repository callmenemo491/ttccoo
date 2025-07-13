package p124h7;

/* renamed from: h7.j2 */
/* loaded from: classes.dex */
public final class C2686j2 {

    /* renamed from: a */
    public static final java.lang.String f11661a = null;

    /* renamed from: b */
    public static final java.lang.String f11662b = null;

    static {
            h7.p2 r0 = new h7.p2
            r1 = 0
            r0.<init>(r1)
            java.lang.String r0 = "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey"
            p124h7.C2686j2.f11661a = r0
            h7.s2 r0 = new h7.s2
            r1 = 1
            r0.<init>(r1)
            java.lang.String r0 = "type.googleapis.com/google.crypto.tink.AesGcmKey"
            p124h7.C2686j2.f11662b = r0
            h7.p2 r0 = new h7.p2
            r2 = 2
            r0.<init>(r2)
            h7.p2 r0 = new h7.p2
            r0.<init>(r1)
            h7.p2 r0 = new h7.p2
            r1 = 3
            r0.<init>(r1)
            h7.s2 r0 = new h7.s2
            r0.<init>(r1)
            h7.s2 r0 = new h7.s2
            r0.<init>(r2)
            h7.p2 r0 = new h7.p2
            r1 = 4
            r0.<init>(r1)
            int r0 = p124h7.C2619f7.f11510Y
            m6844a()     // Catch: java.security.GeneralSecurityException -> L3b
            return
        L3b:
            r0 = move-exception
            java.lang.ExceptionInInitializerError r1 = new java.lang.ExceptionInInitializerError
            r1.<init>(r0)
            throw r1
    }

    /* renamed from: a */
    public static void m6844a() {
            h7.m2 r0 = new h7.m2
            r0.<init>()
            p124h7.C2650h2.m6775f(r0)
            p124h7.C2831r3.m7053a()
            h7.p2 r0 = new h7.p2
            r1 = 0
            r0.<init>(r1)
            r2 = 1
            p124h7.C2650h2.m6774e(r0, r2)
            h7.s2 r0 = new h7.s2
            r0.<init>(r2)
            p124h7.C2650h2.m6774e(r0, r2)
            h7.p2 r0 = new h7.p2
            r0.<init>(r2)
            p124h7.C2650h2.m6774e(r0, r2)
            java.lang.String r0 = "AES/GCM-SIV/NoPadding"
            javax.crypto.Cipher.getInstance(r0)     // Catch: java.lang.Throwable -> L2c
            r1 = 1
            goto L2d
        L2c:
        L2d:
            r0 = 2
            if (r1 == 0) goto L38
            h7.p2 r1 = new h7.p2
            r1.<init>(r0)
            p124h7.C2650h2.m6774e(r1, r2)
        L38:
            h7.s2 r1 = new h7.s2
            r1.<init>(r0)
            p124h7.C2650h2.m6774e(r1, r2)
            h7.p2 r0 = new h7.p2
            r1 = 3
            r0.<init>(r1)
            p124h7.C2650h2.m6774e(r0, r2)
            h7.s2 r0 = new h7.s2
            r0.<init>(r1)
            p124h7.C2650h2.m6774e(r0, r2)
            h7.p2 r0 = new h7.p2
            r1 = 4
            r0.<init>(r1)
            p124h7.C2650h2.m6774e(r0, r2)
            return
    }
}
