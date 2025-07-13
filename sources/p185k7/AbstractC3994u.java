package p185k7;

/* renamed from: k7.u */
/* loaded from: classes.dex */
public abstract class AbstractC3994u {

    /* renamed from: a */
    public final java.util.List<p185k7.EnumC3739b0> f16877a;

    public AbstractC3994u() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f16877a = r0
            return
    }

    /* renamed from: a */
    public abstract p185k7.InterfaceC3916o mo8180a(java.lang.String r1, p365v.C6476c r2, java.util.List<p185k7.InterfaceC3916o> r3);

    /* renamed from: b */
    public final p185k7.InterfaceC3916o m9020b(java.lang.String r4) {
            r3 = this;
            java.util.List<k7.b0> r0 = r3.f16877a
            k7.b0 r1 = p124h7.C2939x3.m7257G(r4)
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L28
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r1 = "Command not implemented: "
            int r2 = r4.length()
            if (r2 == 0) goto L1f
            java.lang.String r4 = r1.concat(r4)
            goto L24
        L1f:
            java.lang.String r4 = new java.lang.String
            r4.<init>(r1)
        L24:
            r0.<init>(r4)
            throw r0
        L28:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Command not supported"
            r4.<init>(r0)
            throw r4
    }
}
