package p218m6;

/* renamed from: m6.y */
/* loaded from: classes.dex */
public final class C4412y extends java.lang.ThreadLocal<java.lang.Boolean> {

    /* renamed from: a */
    public final /* synthetic */ int f17987a;

    public C4412y(int r2) {
            r1 = this;
            r1.f17987a = r2
            r0 = 1
            if (r2 == r0) goto L10
            r0 = 2
            if (r2 == r0) goto Lc
            r1.<init>()
            return
        Lc:
            r1.<init>()
            return
        L10:
            r1.<init>()
            return
    }

    @Override // java.lang.ThreadLocal
    public final java.lang.Boolean initialValue() {
            r2 = this;
            int r0 = r2.f17987a
            switch(r0) {
                case 0: goto L18;
                case 1: goto L6;
                default: goto L5;
            }
        L5:
            goto L1b
        L6:
            h7.w7<h7.z7, javax.crypto.Cipher> r0 = p124h7.C2925w7.f11992e     // Catch: java.security.GeneralSecurityException -> L11
            java.lang.String r1 = "AES/GCM-SIV/NoPadding"
            java.lang.Object r0 = r0.m7238a(r1)     // Catch: java.security.GeneralSecurityException -> L11
            javax.crypto.Cipher r0 = (javax.crypto.Cipher) r0     // Catch: java.security.GeneralSecurityException -> L11
            return r0
        L11:
            r0 = move-exception
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L18:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            return r0
        L1b:
            h7.w7<h7.z7, javax.crypto.Cipher> r0 = p124h7.C2925w7.f11992e     // Catch: java.security.GeneralSecurityException -> L26
            java.lang.String r1 = "AES/CTR/NOPADDING"
            java.lang.Object r0 = r0.m7238a(r1)     // Catch: java.security.GeneralSecurityException -> L26
            javax.crypto.Cipher r0 = (javax.crypto.Cipher) r0     // Catch: java.security.GeneralSecurityException -> L26
            return r0
        L26:
            r0 = move-exception
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
    }
}
