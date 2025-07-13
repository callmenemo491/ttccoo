package p124h7;

/* renamed from: h7.x1 */
/* loaded from: classes.dex */
public final class C2937x1 {

    /* renamed from: a */
    public static final java.util.concurrent.CopyOnWriteArrayList<p124h7.InterfaceC2901v1> f12017a = null;

    static {
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            p124h7.C2937x1.f12017a = r0
            return
    }

    /* renamed from: a */
    public static p124h7.InterfaceC2901v1 m7250a(java.lang.String r3) {
            java.util.concurrent.CopyOnWriteArrayList<h7.v1> r0 = p124h7.C2937x1.f12017a
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L19
            java.lang.Object r1 = r0.next()
            h7.v1 r1 = (p124h7.InterfaceC2901v1) r1
            boolean r2 = r1.mo7019f(r3)
            if (r2 == 0) goto L6
            return r1
        L19:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r1 = "No KMS client does support: "
            int r2 = r3.length()
            if (r2 == 0) goto L2c
            java.lang.String r3 = r1.concat(r3)
            goto L31
        L2c:
            java.lang.String r3 = new java.lang.String
            r3.<init>(r1)
        L31:
            r0.<init>(r3)
            throw r0
    }
}
