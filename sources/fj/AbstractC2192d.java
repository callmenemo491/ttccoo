package fj;

/* renamed from: fj.d */
/* loaded from: classes.dex */
public abstract class AbstractC2192d {

    /* renamed from: a */
    public fj.C2191c f10037a;

    public AbstractC2192d() {
            r0 = this;
            r0.<init>()
            return
    }

    /* renamed from: a */
    public abstract fj.C2191c mo175a();

    /* renamed from: b */
    public synchronized fj.C2191c m5782b() {
            r1 = this;
            monitor-enter(r1)
            fj.c r0 = r1.f10037a     // Catch: java.lang.Throwable -> Lf
            if (r0 != 0) goto Lb
            fj.c r0 = r1.mo175a()     // Catch: java.lang.Throwable -> Lf
            r1.f10037a = r0     // Catch: java.lang.Throwable -> Lf
        Lb:
            fj.c r0 = r1.f10037a     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r1)
            return r0
        Lf:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }
}
