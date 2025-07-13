package p134hh;

/* renamed from: hh.g */
/* loaded from: classes.dex */
public abstract class AbstractC3046g extends p134hh.AbstractC3040a {
    public AbstractC3046g(p101fh.InterfaceC2172d<java.lang.Object> r2) {
            r1 = this;
            r1.<init>(r2)
            if (r2 == 0) goto L1f
            fh.g r2 = r2.mo5706c()
            fh.i r0 = p101fh.C2177i.f9918Y
            if (r2 != r0) goto Lf
            r2 = 1
            goto L10
        Lf:
            r2 = 0
        L10:
            if (r2 == 0) goto L13
            goto L1f
        L13:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Coroutines with restricted suspension must have EmptyCoroutineContext"
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            throw r2
        L1f:
            return
    }

    @Override // p101fh.InterfaceC2172d
    /* renamed from: c */
    public p101fh.InterfaceC2175g mo5706c() {
            r1 = this;
            fh.i r0 = p101fh.C2177i.f9918Y
            return r0
    }
}
