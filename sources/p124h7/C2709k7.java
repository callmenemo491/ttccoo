package p124h7;

/* renamed from: h7.k7 */
/* loaded from: classes.dex */
public final class C2709k7 extends java.lang.ThreadLocal<javax.crypto.Cipher> {

    /* renamed from: a */
    public final /* synthetic */ int f11705a;

    public C2709k7(int r2) {
            r1 = this;
            r1.f11705a = r2
            r0 = 1
            if (r2 == r0) goto L9
            r1.<init>()
            return
        L9:
            r1.<init>()
            return
    }

    @Override // java.lang.ThreadLocal
    public final javax.crypto.Cipher initialValue() {
            r2 = this;
            int r0 = r2.f11705a
            switch(r0) {
                case 0: goto L6;
                default: goto L5;
            }
        L5:
            goto L18
        L6:
            h7.w7<h7.z7, javax.crypto.Cipher> r0 = p124h7.C2925w7.f11992e     // Catch: java.security.GeneralSecurityException -> L11
            java.lang.String r1 = "AES/CTR/NoPadding"
            java.lang.Object r0 = r0.m7238a(r1)     // Catch: java.security.GeneralSecurityException -> L11
            javax.crypto.Cipher r0 = (javax.crypto.Cipher) r0     // Catch: java.security.GeneralSecurityException -> L11
            return r0
        L11:
            r0 = move-exception
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L18:
            java.security.SecureRandom r0 = new java.security.SecureRandom
            r0.<init>()
            r0.nextLong()
            return r0
    }
}
