package androidx.databinding;

/* renamed from: androidx.databinding.a */
/* loaded from: classes.dex */
public class C0354a {

    /* renamed from: a */
    public transient androidx.databinding.C0362i f2018a;

    public C0354a() {
            r0 = this;
            r0.<init>()
            return
    }

    /* renamed from: c */
    public void m1066c(int r3) {
            r2 = this;
            monitor-enter(r2)
            androidx.databinding.i r0 = r2.f2018a     // Catch: java.lang.Throwable -> Ld
            if (r0 != 0) goto L7
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Ld
            return
        L7:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Ld
            r1 = 0
            r0.m1067a(r2, r3, r1)
            return
        Ld:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Ld
            throw r3
    }
}
