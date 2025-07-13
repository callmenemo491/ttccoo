package p124h7;

/* renamed from: h7.e3 */
/* loaded from: classes.dex */
public final class C2597e3 {
    static {
            h7.s2 r0 = new h7.s2
            r1 = 4
            r0.<init>(r1)
            h7.d3 r0 = new h7.d3
            r0.<init>()
            int r0 = p124h7.C2619f7.f11510Y
            m6642a()     // Catch: java.security.GeneralSecurityException -> L11
            return
        L11:
            r0 = move-exception
            java.lang.ExceptionInInitializerError r1 = new java.lang.ExceptionInInitializerError
            r1.<init>(r0)
            throw r1
    }

    /* renamed from: a */
    public static void m6642a() {
            java.lang.Class<h7.d3> r0 = p124h7.C2579d3.class
            java.lang.Class<h7.s2> r1 = p124h7.C2848s2.class
            h7.g3 r2 = new h7.g3
            r2.<init>()
            p124h7.C2650h2.m6775f(r2)
            h7.h3 r2 = new h7.h3
            r2.<init>()
            p124h7.C2650h2.m6775f(r2)
            p124h7.C2686j2.m6844a()
            h7.d3 r2 = new h7.d3
            r2.<init>()
            h7.s2 r3 = new h7.s2
            r4 = 4
            r3.<init>(r4)
            java.lang.Class<h7.h2> r4 = p124h7.C2650h2.class
            monitor-enter(r4)
            java.lang.String r5 = "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey"
            v0.c r6 = r2.mo6563a()     // Catch: java.lang.Throwable -> Lf7
            java.util.Map r6 = r6.mo7015k()     // Catch: java.lang.Throwable -> Lf7
            r7 = 1
            p124h7.C2650h2.m6779j(r5, r0, r6, r7)     // Catch: java.lang.Throwable -> Lf7
            java.lang.String r6 = "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey"
            java.util.Map r8 = java.util.Collections.emptyMap()     // Catch: java.lang.Throwable -> Lf7
            r9 = 0
            p124h7.C2650h2.m6779j(r6, r1, r8, r9)     // Catch: java.lang.Throwable -> Lf7
            java.util.concurrent.ConcurrentMap<java.lang.String, h7.g2> r8 = p124h7.C2650h2.f11569b     // Catch: java.lang.Throwable -> Lf7
            r10 = r8
            java.util.concurrent.ConcurrentHashMap r10 = (java.util.concurrent.ConcurrentHashMap) r10     // Catch: java.lang.Throwable -> Lf7
            boolean r10 = r10.containsKey(r5)     // Catch: java.lang.Throwable -> Lf7
            if (r10 == 0) goto L95
            r10 = r8
            java.util.concurrent.ConcurrentHashMap r10 = (java.util.concurrent.ConcurrentHashMap) r10     // Catch: java.lang.Throwable -> Lf7
            java.lang.Object r10 = r10.get(r5)     // Catch: java.lang.Throwable -> Lf7
            h7.g2 r10 = (p124h7.InterfaceC2632g2) r10     // Catch: java.lang.Throwable -> Lf7
            java.lang.Class r10 = r10.mo6641f()     // Catch: java.lang.Throwable -> Lf7
            if (r10 == 0) goto L95
            java.lang.String r11 = r10.getName()     // Catch: java.lang.Throwable -> Lf7
            java.lang.String r12 = r1.getName()     // Catch: java.lang.Throwable -> Lf7
            boolean r11 = r11.equals(r12)     // Catch: java.lang.Throwable -> Lf7
            if (r11 == 0) goto L66
            goto L95
        L66:
            java.util.logging.Logger r2 = p124h7.C2650h2.f11568a     // Catch: java.lang.Throwable -> Lf7
            java.util.logging.Level r3 = java.util.logging.Level.WARNING     // Catch: java.lang.Throwable -> Lf7
            java.lang.String r5 = "com.google.crypto.tink.Registry"
            java.lang.String r6 = "registerAsymmetricKeyManagers"
            java.lang.String r8 = "Attempted overwrite of a registered key manager for key type type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey with inconsistent public key type type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey"
            r2.logp(r3, r5, r6, r8)     // Catch: java.lang.Throwable -> Lf7
            java.security.GeneralSecurityException r2 = new java.security.GeneralSecurityException     // Catch: java.lang.Throwable -> Lf7
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> Lf7
            java.lang.String r0 = r0.getName()     // Catch: java.lang.Throwable -> Lf7
            r3[r9] = r0     // Catch: java.lang.Throwable -> Lf7
            java.lang.String r0 = r10.getName()     // Catch: java.lang.Throwable -> Lf7
            r3[r7] = r0     // Catch: java.lang.Throwable -> Lf7
            r0 = 2
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> Lf7
            r3[r0] = r1     // Catch: java.lang.Throwable -> Lf7
            java.lang.String r0 = "public key manager corresponding to %s is already registered with %s, cannot be re-registered with %s"
            java.lang.String r0 = java.lang.String.format(r0, r3)     // Catch: java.lang.Throwable -> Lf7
            r2.<init>(r0)     // Catch: java.lang.Throwable -> Lf7
            throw r2     // Catch: java.lang.Throwable -> Lf7
        L95:
            r0 = r8
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0     // Catch: java.lang.Throwable -> Lf7
            boolean r0 = r0.containsKey(r5)     // Catch: java.lang.Throwable -> Lf7
            if (r0 == 0) goto Lad
            r0 = r8
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0     // Catch: java.lang.Throwable -> Lf7
            java.lang.Object r0 = r0.get(r5)     // Catch: java.lang.Throwable -> Lf7
            h7.g2 r0 = (p124h7.InterfaceC2632g2) r0     // Catch: java.lang.Throwable -> Lf7
            java.lang.Class r0 = r0.mo6641f()     // Catch: java.lang.Throwable -> Lf7
            if (r0 != 0) goto Ld1
        Lad:
            h7.f2 r0 = new h7.f2     // Catch: java.lang.Throwable -> Lf7
            r0.<init>(r2, r3)     // Catch: java.lang.Throwable -> Lf7
            r1 = r8
            java.util.concurrent.ConcurrentHashMap r1 = (java.util.concurrent.ConcurrentHashMap) r1     // Catch: java.lang.Throwable -> Lf7
            r1.put(r5, r0)     // Catch: java.lang.Throwable -> Lf7
            java.util.concurrent.ConcurrentMap<java.lang.String, f.t> r0 = p124h7.C2650h2.f11570c     // Catch: java.lang.Throwable -> Lf7
            f.t r1 = new f.t     // Catch: java.lang.Throwable -> Lf7
            r1.<init>(r2)     // Catch: java.lang.Throwable -> Lf7
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0     // Catch: java.lang.Throwable -> Lf7
            r0.put(r5, r1)     // Catch: java.lang.Throwable -> Lf7
            java.lang.String r0 = "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey"
            v0.c r1 = r2.mo6563a()     // Catch: java.lang.Throwable -> Lf7
            java.util.Map r1 = r1.mo7015k()     // Catch: java.lang.Throwable -> Lf7
            p124h7.C2650h2.m6780k(r0, r1)     // Catch: java.lang.Throwable -> Lf7
        Ld1:
            java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Boolean> r0 = p124h7.C2650h2.f11571d     // Catch: java.lang.Throwable -> Lf7
            java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> Lf7
            r2 = r0
            java.util.concurrent.ConcurrentHashMap r2 = (java.util.concurrent.ConcurrentHashMap) r2     // Catch: java.lang.Throwable -> Lf7
            r2.put(r5, r1)     // Catch: java.lang.Throwable -> Lf7
            r1 = r8
            java.util.concurrent.ConcurrentHashMap r1 = (java.util.concurrent.ConcurrentHashMap) r1     // Catch: java.lang.Throwable -> Lf7
            boolean r1 = r1.containsKey(r6)     // Catch: java.lang.Throwable -> Lf7
            if (r1 != 0) goto Lee
            h7.e2 r1 = new h7.e2     // Catch: java.lang.Throwable -> Lf7
            r1.<init>(r3)     // Catch: java.lang.Throwable -> Lf7
            java.util.concurrent.ConcurrentHashMap r8 = (java.util.concurrent.ConcurrentHashMap) r8     // Catch: java.lang.Throwable -> Lf7
            r8.put(r6, r1)     // Catch: java.lang.Throwable -> Lf7
        Lee:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> Lf7
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0     // Catch: java.lang.Throwable -> Lf7
            r0.put(r6, r1)     // Catch: java.lang.Throwable -> Lf7
            monitor-exit(r4)
            return
        Lf7:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
    }
}
