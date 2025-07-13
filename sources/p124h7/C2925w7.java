package p124h7;

import p124h7.InterfaceC2943x7;

/* renamed from: h7.w7 */
/* loaded from: classes.dex */
public final class C2925w7<T_WRAPPER extends p124h7.InterfaceC2943x7<T_ENGINE>, T_ENGINE> {

    /* renamed from: b */
    public static final java.util.logging.Logger f11989b = null;

    /* renamed from: c */
    public static final java.util.List<java.security.Provider> f11990c = null;

    /* renamed from: d */
    public static final boolean f11991d = false;

    /* renamed from: e */
    public static final p124h7.C2925w7<p124h7.C2979z7, javax.crypto.Cipher> f11992e = null;

    /* renamed from: f */
    public static final p124h7.C2925w7<p124h7.C2979z7, javax.crypto.Mac> f11993f = null;

    /* renamed from: g */
    public static final p124h7.C2925w7<p367v1.C6488b, javax.crypto.KeyAgreement> f11994g = null;

    /* renamed from: h */
    public static final p124h7.C2925w7<p422y.C7095e, java.security.KeyPairGenerator> f11995h = null;

    /* renamed from: i */
    public static final p124h7.C2925w7<p124h7.C2595e1, java.security.KeyFactory> f11996i = null;

    /* renamed from: a */
    public final T_WRAPPER f11997a;

    static {
            java.lang.Class<h7.w7> r0 = p124h7.C2925w7.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            p124h7.C2925w7.f11989b = r0
            boolean r0 = p036c6.C0906q0.m2622j()
            r1 = 1
            if (r0 == 0) goto L4c
            java.lang.String r0 = "GmsCore_OpenSSL"
            java.lang.String r2 = "AndroidOpenSSL"
            java.lang.String[] r0 = new java.lang.String[]{r0, r2}
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r3 = 0
            r4 = 0
        L22:
            r5 = 2
            if (r4 >= r5) goto L49
            r5 = r0[r4]
            java.security.Provider r6 = java.security.Security.getProvider(r5)
            if (r6 == 0) goto L31
            r2.add(r6)
            goto L46
        L31:
            java.util.logging.Logger r6 = p124h7.C2925w7.f11989b
            java.util.logging.Level r7 = java.util.logging.Level.INFO
            java.lang.Object[] r8 = new java.lang.Object[r1]
            r8[r3] = r5
            java.lang.String r5 = "Provider %s not available"
            java.lang.String r5 = java.lang.String.format(r5, r8)
            java.lang.String r8 = "com.google.crypto.tink.subtle.EngineFactory"
            java.lang.String r9 = "toProviderList"
            r6.logp(r7, r8, r9, r5)
        L46:
            int r4 = r4 + 1
            goto L22
        L49:
            p124h7.C2925w7.f11990c = r2
            goto L53
        L4c:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            p124h7.C2925w7.f11990c = r0
        L53:
            p124h7.C2925w7.f11991d = r1
            h7.w7 r0 = new h7.w7
            h7.z7 r1 = new h7.z7
            r2 = 4
            r1.<init>(r2)
            r0.<init>(r1)
            p124h7.C2925w7.f11992e = r0
            h7.w7 r0 = new h7.w7
            h7.z7 r1 = new h7.z7
            r2 = 5
            r1.<init>(r2)
            r0.<init>(r1)
            p124h7.C2925w7.f11993f = r0
            h7.w7 r0 = new h7.w7
            v1.b r1 = new v1.b
            r2 = 21
            r1.<init>(r2)
            r0.<init>(r1)
            p124h7.C2925w7.f11994g = r0
            h7.w7 r0 = new h7.w7
            y.e r1 = new y.e
            r2 = 18
            r1.<init>(r2)
            r0.<init>(r1)
            p124h7.C2925w7.f11995h = r0
            h7.w7 r0 = new h7.w7
            h7.e1 r1 = new h7.e1
            r2 = 3
            r1.<init>(r2)
            r0.<init>(r1)
            p124h7.C2925w7.f11996i = r0
            return
    }

    public C2925w7(T_WRAPPER r1) {
            r0 = this;
            r0.<init>()
            r0.f11997a = r1
            return
    }

    /* renamed from: a */
    public final T_ENGINE m7238a(java.lang.String r6) {
            r5 = this;
            java.util.List<java.security.Provider> r0 = p124h7.C2925w7.f11990c
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
            r2 = r1
        L8:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L20
            java.lang.Object r3 = r0.next()
            java.security.Provider r3 = (java.security.Provider) r3
            T_WRAPPER extends h7.x7<T_ENGINE> r4 = r5.f11997a     // Catch: java.lang.Exception -> L1b
            java.lang.Object r6 = r4.mo6634a(r6, r3)     // Catch: java.lang.Exception -> L1b
            return r6
        L1b:
            r3 = move-exception
            if (r2 != 0) goto L8
            r2 = r3
            goto L8
        L20:
            boolean r0 = p124h7.C2925w7.f11991d
            if (r0 == 0) goto L2b
            T_WRAPPER extends h7.x7<T_ENGINE> r0 = r5.f11997a
            java.lang.Object r6 = r0.mo6634a(r6, r1)
            return r6
        L2b:
            java.security.GeneralSecurityException r6 = new java.security.GeneralSecurityException
            java.lang.String r0 = "No good Provider found."
            r6.<init>(r0, r2)
            throw r6
    }
}
