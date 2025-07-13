package p179k1;

/* renamed from: k1.l */
/* loaded from: classes.dex */
public final class C3654l {
    /* renamed from: a */
    public static final <R> java.lang.Object m8084a(p179k1.AbstractC3664v r2, boolean r3, java.util.concurrent.Callable<R> r4, p101fh.InterfaceC2172d<? super R> r5) {
            boolean r0 = r2.m8114k()
            if (r0 == 0) goto L11
            boolean r0 = r2.m8111h()
            if (r0 == 0) goto L11
            java.lang.Object r2 = r4.call()
            goto L32
        L11:
            fh.g r0 = r5.mo5706c()
            k1.b0$a r1 = p179k1.C3643b0.f16077Y
            fh.g$a r0 = r0.get(r1)
            k1.b0 r0 = (p179k1.C3643b0) r0
            if (r3 == 0) goto L24
            vh.z r2 = p064e.C1488b.m4036c(r2)
            goto L28
        L24:
            vh.z r2 = p064e.C1488b.m4035b(r2)
        L28:
            k1.i r3 = new k1.i
            r0 = 0
            r3.<init>(r4, r0)
            java.lang.Object r2 = p101fh.C2174f.m5710A(r2, r3, r5)
        L32:
            return r2
    }
}
