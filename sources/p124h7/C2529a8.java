package p124h7;

/* renamed from: h7.a8 */
/* loaded from: classes.dex */
public final class C2529a8 extends java.lang.ThreadLocal<javax.crypto.Mac> {

    /* renamed from: a */
    public final /* synthetic */ p164j6.C3434h f11368a;

    public C2529a8(p164j6.C3434h r1) {
            r0 = this;
            r0.f11368a = r1
            r0.<init>()
            return
    }

    @Override // java.lang.ThreadLocal
    public final javax.crypto.Mac initialValue() {
            r2 = this;
            h7.w7<h7.z7, javax.crypto.Mac> r0 = p124h7.C2925w7.f11993f     // Catch: java.security.GeneralSecurityException -> L18
            j6.h r1 = r2.f11368a     // Catch: java.security.GeneralSecurityException -> L18
            java.lang.Object r1 = r1.f14893a0     // Catch: java.security.GeneralSecurityException -> L18
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.security.GeneralSecurityException -> L18
            java.lang.Object r0 = r0.m7238a(r1)     // Catch: java.security.GeneralSecurityException -> L18
            javax.crypto.Mac r0 = (javax.crypto.Mac) r0     // Catch: java.security.GeneralSecurityException -> L18
            j6.h r1 = r2.f11368a     // Catch: java.security.GeneralSecurityException -> L18
            java.lang.Object r1 = r1.f14894b0     // Catch: java.security.GeneralSecurityException -> L18
            java.security.Key r1 = (java.security.Key) r1     // Catch: java.security.GeneralSecurityException -> L18
            r0.init(r1)     // Catch: java.security.GeneralSecurityException -> L18
            return r0
        L18:
            r0 = move-exception
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
    }
}
