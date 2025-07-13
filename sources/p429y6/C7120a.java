package p429y6;

/* renamed from: y6.a */
/* loaded from: classes.dex */
public final class C7120a extends java.lang.ThreadLocal<java.lang.Long> {

    /* renamed from: a */
    public final /* synthetic */ int f27534a;

    public C7120a(int r2) {
            r1 = this;
            r1.f27534a = r2
            r0 = 1
            if (r2 == r0) goto L9
            r1.<init>()
            return
        L9:
            r1.<init>()
            return
    }

    @Override // java.lang.ThreadLocal
    public final java.lang.Long initialValue() {
            r2 = this;
            int r0 = r2.f27534a
            switch(r0) {
                case 0: goto L6;
                default: goto L5;
            }
        L5:
            goto Ld
        L6:
            r0 = 0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            return r0
        Ld:
            h7.w7<h7.z7, javax.crypto.Cipher> r0 = p124h7.C2925w7.f11992e     // Catch: java.security.GeneralSecurityException -> L18
            java.lang.String r1 = "AES/ECB/NOPADDING"
            java.lang.Object r0 = r0.m7238a(r1)     // Catch: java.security.GeneralSecurityException -> L18
            javax.crypto.Cipher r0 = (javax.crypto.Cipher) r0     // Catch: java.security.GeneralSecurityException -> L18
            return r0
        L18:
            r0 = move-exception
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
    }
}
