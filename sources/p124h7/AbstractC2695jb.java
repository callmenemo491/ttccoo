package p124h7;

import p124h7.AbstractC2641gb;

/* renamed from: h7.jb */
/* loaded from: classes.dex */
public abstract class AbstractC2695jb<T extends p124h7.AbstractC2641gb> {

    /* renamed from: a */
    public p124h7.C2623fb<T> f11680a;

    public AbstractC2695jb() {
            r0 = this;
            r0.<init>()
            return
    }

    /* renamed from: a */
    public final <ResultT, A> p327s7.AbstractC5985i<ResultT> m6865a(p124h7.InterfaceC2677ib<A, ResultT> r2) {
            r1 = this;
            h7.fb r0 = r1.m6866b()
            l6.c<O extends h7.gb> r0 = r0.f11513a
            m6.k r2 = r2.mo6465a()
            s7.i r2 = r0.m9327c(r2)
            return r2
    }

    /* renamed from: b */
    public final p124h7.C2623fb<T> m6866b() {
            r4 = this;
            monitor-enter(r4)
            h7.fb<T extends h7.gb> r0 = r4.f11680a     // Catch: java.lang.Throwable -> L37
            if (r0 != 0) goto L33
            java.util.concurrent.Future r0 = r4.mo6596c()     // Catch: java.lang.Exception -> L12 java.lang.Throwable -> L37
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Exception -> L12 java.lang.Throwable -> L37
            h7.fb r0 = (p124h7.C2623fb) r0     // Catch: java.lang.Exception -> L12 java.lang.Throwable -> L37
            r4.f11680a = r0     // Catch: java.lang.Exception -> L12 java.lang.Throwable -> L37
            goto L33
        L12:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L37
            java.lang.String r2 = "There was an error while initializing the connection to the GoogleApi: "
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> L37
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch: java.lang.Throwable -> L37
            int r3 = r0.length()     // Catch: java.lang.Throwable -> L37
            if (r3 == 0) goto L2a
            java.lang.String r0 = r2.concat(r0)     // Catch: java.lang.Throwable -> L37
            goto L2f
        L2a:
            java.lang.String r0 = new java.lang.String     // Catch: java.lang.Throwable -> L37
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L37
        L2f:
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L37
            throw r1     // Catch: java.lang.Throwable -> L37
        L33:
            h7.fb<T extends h7.gb> r0 = r4.f11680a     // Catch: java.lang.Throwable -> L37
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L37
            return r0
        L37:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L37
            throw r0
    }

    /* renamed from: c */
    public abstract java.util.concurrent.Future<p124h7.C2623fb<T>> mo6596c();
}
