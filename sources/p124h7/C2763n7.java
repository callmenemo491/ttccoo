package p124h7;

/* renamed from: h7.n7 */
/* loaded from: classes.dex */
public final class C2763n7 extends java.lang.ThreadLocal<javax.crypto.Cipher> {
    public C2763n7() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // java.lang.ThreadLocal
    public final javax.crypto.Cipher initialValue() {
            r2 = this;
            h7.w7<h7.z7, javax.crypto.Cipher> r0 = p124h7.C2925w7.f11992e     // Catch: java.security.GeneralSecurityException -> Lb
            java.lang.String r1 = "AES/GCM/NoPadding"
            java.lang.Object r0 = r0.m7238a(r1)     // Catch: java.security.GeneralSecurityException -> Lb
            javax.crypto.Cipher r0 = (javax.crypto.Cipher) r0     // Catch: java.security.GeneralSecurityException -> Lb
            return r0
        Lb:
            r0 = move-exception
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
    }
}
