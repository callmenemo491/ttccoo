package p093f9;

/* renamed from: f9.l */
/* loaded from: classes.dex */
public final class C2094l {

    /* renamed from: a */
    public static final java.util.concurrent.CopyOnWriteArrayList<p093f9.InterfaceC2093k> f9514a = null;

    static {
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            p093f9.C2094l.f9514a = r0
            return
    }

    /* renamed from: a */
    public static p093f9.InterfaceC2093k m5535a(java.lang.String r3) {
            java.util.concurrent.CopyOnWriteArrayList<f9.k> r0 = p093f9.C2094l.f9514a
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L19
            java.lang.Object r1 = r0.next()
            f9.k r1 = (p093f9.InterfaceC2093k) r1
            boolean r2 = r1.mo5534b(r3)
            if (r2 == 0) goto L6
            return r1
        L19:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "No KMS client does support: "
            java.lang.String r3 = p064e.C1493g.m4049a(r1, r3)
            r0.<init>(r3)
            throw r0
    }
}
